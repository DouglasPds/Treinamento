package br.edu.unievangelica.ftt.seintegra.domain.mantenedora;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.unievangelica.ftt.seintegra.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.seintegra.domain.endereco.Endereco;
import br.edu.unievangelica.ftt.seintegra.domain.instituicao.Instituicao;

@Entity
@Table(name = "mantenedora")
public class Mantenedora extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome", length = 80, nullable = false, unique = true)
	private String nome;
	
	@Column(name = "razao_social", length = 80, nullable = false)
	private String razaoSocial;
	
	@Column(name = "cnpj", length = 18, nullable = false, unique = true)
	private String cnpj;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco_id", referencedColumnName = "id")
	private Endereco endereco;
	
	@OneToMany(mappedBy = "mantenedora")
	private List<Instituicao> instituicoes;

	public List<Instituicao> getInstituicoes() {
		return instituicoes;
	}

	public void setInstituicoes(List<Instituicao> instituicoes) {
		this.instituicoes = instituicoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
