package br.edu.unievangelica.domain.agenciaConta;

import br.edu.unievangelica.core.enums.SituacaoEnum;
import br.edu.unievangelica.core.enums.TipoContaEnum;
import br.edu.unievangelica.core.exception.customExceptions.CustomBadRequestException;
import br.edu.unievangelica.core.exception.customExceptions.CustomNotFoundException;
import br.edu.unievangelica.core.exception.validation.DuplicatedErrorResource;
import br.edu.unievangelica.core.service.AbstractService;
import br.edu.unievangelica.domain.banco.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

@Service
public class AgenciaContaService extends AbstractService<AgenciaConta> {

    @Autowired
    private AgenciaContaRepository agenciaContaRepository;

    @Autowired
    private BancoService bancoService;

    public List<AgenciaConta> findAgenciaContaBySituacaoIn() {
        return agenciaContaRepository.findAgenciaContaBySituacaoIn(SituacaoEnum.ATIVO);}

    public List<AgenciaConta> findAgenciaContaByBancoId(long bancoId) {
        if (bancoService.exists(bancoId)) {
            return agenciaContaRepository.findAgenciaContaByBancoId(bancoId);
        }
        throw new CustomNotFoundException("");
    }

    public List<AgenciaConta> findAgenciaContaByBancoIdAndSituacaoIn(long bancoId) {
        if (bancoService.exists(bancoId)) {
            return agenciaContaRepository.findAgenciaContaByBancoIdAndSituacaoIn(bancoId, SituacaoEnum.ATIVO);
        }
        throw new CustomNotFoundException("");
    }

    public AgenciaConta alteraSituacao(long agenciaContaId){
        AgenciaConta agenciaConta = findOne(agenciaContaId);
        if (agenciaConta.getSituacao() == SituacaoEnum.INATIVO) {
            agenciaContaRepository.alteraSituacao(agenciaConta.getId(), SituacaoEnum.ATIVO);
            agenciaConta.setSituacao(SituacaoEnum.ATIVO);
        } else {
            agenciaContaRepository.alteraSituacao(agenciaConta.getId(), SituacaoEnum.INATIVO);
            agenciaConta.setSituacao(SituacaoEnum.INATIVO);
        }
        return agenciaConta;
    }

    @Override
    public AgenciaConta save(AgenciaConta agenciaConta, BindingResult bindingResult) {
        if (bancoService.exists(agenciaConta.getBanco().getId())) {
            agenciaConta.setAgencia(agenciaConta.getAgencia().trim().replaceAll(" +", ""));
            if (!agenciaContaRepository.findAgenciaContaByIdAndAgenciaAndBancoId(agenciaConta.getId(), agenciaConta.getAgencia(), agenciaConta.getBanco().getId()).isEmpty()) {
                bindingResult.addError(new DuplicatedErrorResource("agencia"));
            }
            if (!agenciaContaRepository.findAgenciaContaByIdAndContaAndBancoId(agenciaConta.getId(), agenciaConta.getConta(), agenciaConta.getBanco().getId()).isEmpty()) {
                bindingResult.addError(new DuplicatedErrorResource("conta"));
                agenciaConta.setConta(agenciaConta.getConta().trim().replaceAll(" +", ""));
            }
            if (bindingResult.hasErrors()){
                throw new CustomBadRequestException(bindingResult);
            }
            return agenciaContaRepository.save(agenciaConta);
        } else {
            throw new CustomNotFoundException("");
        }
    }

}
