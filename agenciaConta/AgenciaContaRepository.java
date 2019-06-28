package br.edu.unievangelica.domain.agenciaConta;

import br.edu.unievangelica.core.enums.SituacaoEnum;
import br.edu.unievangelica.core.enums.TipoContaEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AgenciaContaRepository extends JpaRepository<AgenciaConta, Long> {

    public List<AgenciaConta> findAgenciaContaBySituacaoIn(SituacaoEnum situacaoEnum);

    public List<AgenciaConta> findAgenciaContaByBancoId(long id);

    public List<AgenciaConta> findAgenciaContaByBancoIdAndSituacaoIn(long id, SituacaoEnum situacaoEnum);

    @Modifying
    @Transactional
    @Query("UPDATE #{#entityName} SET situacao =:situacao WHERE id =:id")
    public void alteraSituacao(@Param("id") long id,
                              @Param("situacao") SituacaoEnum situacao);

    @Query(value = "SELECT * FROM agenciaConta" +
            " WHERE id <> :id " +
            "AND TRIM((lower(agencia))) = TRIM((lower(:agencia)))" +
            "AND banco_id = :banco_id", nativeQuery = true)
    public List<AgenciaConta> findAgenciaContaByIdAndAgenciaAndBancoId(@Param("id") long id,
                                                                       @Param("agencia") String agencia,
                                                                       @Param("banco_id") long banco_id);

    @Query(value = "SELECT * FROM agenciaConta" +
            " WHERE id <> :id " +
            "AND Trim(unaccent(lower(conta))) = Trim((lower(:conta)))" +
            "AND banco_id = :banco_id", nativeQuery = true)
    public List<AgenciaConta> findAgenciaContaByIdAndContaAndBancoId(@Param("id") long id,
                                                                     @Param("conta") String conta,
                                                                     @Param("banco_id") long banco_id);

}
