package br.edu.unievangelica.domain.agenciaConta;

import br.edu.unievangelica.core.enums.SituacaoEnum;
import br.edu.unievangelica.core.enums.TipoContaEnum;
import br.edu.unievangelica.domain.banco.Banco;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "agencia_conta")
@Getter
@Setter
public class AgenciaConta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agencia_conta_id_seq")
    @SequenceGenerator(name = "agencia_conta_id_seq" , sequenceName = "agencia_conta_id_seq", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @NotNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "banco_id", referencedColumnName = "id")
    private Banco banco;

    @NotEmpty
    @NotBlank
    @Size(max = 10)
    @Column(name = "agencia")
    private String agencia;

    @NotEmpty
    @NotBlank
    @Size(max = 10)
    @Column(name = "conta")
    private String conta;

    @NotNull
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "tipo_conta")
    private TipoContaEnum tipoContaEnum;

    @NotNull
    @Column(name = "situacao")
    private SituacaoEnum situacao = SituacaoEnum.ATIVO;




}
