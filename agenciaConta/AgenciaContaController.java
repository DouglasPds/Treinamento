package br.edu.unievangelica.domain.agenciaConta;

import br.edu.unievangelica.config.HttpStatusVariables;
import br.edu.unievangelica.core.controller.AbstractController;
import br.edu.unievangelica.core.enums.TipoContaEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@Api(description = "AgenciaConta")
@RestController
@RequestMapping("/agencia-conta")
public class AgenciaContaController extends AbstractController<AgenciaConta> {

    @Autowired
    AgenciaContaService agenciaContaService;

    @Override
    @GetMapping
    @PreAuthorize("hasAuthority('PERM_AGENCIA_CONTA_LISTAR')")
    public ResponseEntity<?> findAll(){
        return jsonResponse(agenciaContaService.findAll());
    }

    @ApiOperation(value = "Retorna a AgenciaConta de acordo com o id do Banco")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 404, message = HttpStatusVariables.NOT_FOUND)
            }
    )

    @GetMapping(value = "/banco/{id}")
    @PreAuthorize("hasAuthority('PERM_AGENCIA_CONTA_LISTAR')")
    public ResponseEntity<?> findAgenciaContaByBancoId(@PathVariable long id){
        return jsonResponse(agenciaContaService.findAgenciaContaByBancoId(id));
    }

    @ApiOperation(value = "Retorna a AgenciaConta de acordo com o id do Banco e a situação")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 404, message = HttpStatusVariables.NOT_FOUND)
            }
    )

    @GetMapping(value = "/banco/{id}/situacao-ativo")
    @PreAuthorize("hasAuthority('PERM_AGENCIA_CONTA_LISTAR')")
    public ResponseEntity<?> findAgenciaContaByBancoIdAndSituacaoIn(@PathVariable long id){
        return jsonResponse(agenciaContaService.findAgenciaContaByBancoIdAndSituacaoIn(id));
    }

    @ApiOperation(value = "Retorna AgenciaConta de acordo com a situação")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 404, message = HttpStatusVariables.NOT_FOUND)
            }
    )

    @GetMapping(value = "/situacao-ativo")
    @PreAuthorize("hasAuthority('PERM_AGENCIA_CONTA_LISTAR')")
    public ResponseEntity<?> findAgenciaContaBySituacaoIn(){
        return jsonResponse(agenciaContaService.findAgenciaContaBySituacaoIn());
    }

    @ApiOperation(value = "Altera o status da AgenciaConta")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 404, message = HttpStatusVariables.NOT_FOUND)
            }
    )

    @PostMapping (value = "/situacao/{agenciaContaId}")
    @PreAuthorize("hasAuthority('PERM_AGENCIA_CONTA_ATIVAR_INATIVAR)')")
    public ResponseEntity<?> alteraSituacao(@PathVariable("agenciaContaId") long agenciaContaId){
        return jsonResponse(agenciaContaService.alteraSituacao(agenciaContaId));
    }

    @ApiOperation(value = "Retorna o enum tipo conta")
    @GetMapping (value = "/tipo-conta")
    public ResponseEntity<?> findTipoConta(){
        return jsonResponse(TipoContaEnum.values());
    }



}
