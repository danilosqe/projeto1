package br.com.twistcodes.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CapturaAcao {
	
	@Id
	private String id;
	private String rgm;
	private String url;
	private String codInst;
	private Date dataTransacao;
	private List<String> palavrasChaves;
	
	private Set<Role> roles;

	public CapturaAcao() {
	}

	public CapturaAcao(String id, String rgm, String url, String codInst, Date dataTransacao, List<String> palavrasChave, Set<Role> roles) {
		super();
		this.id = id;
		this.rgm = rgm;
		this.url = url;
		this.codInst = codInst;
		this.dataTransacao = dataTransacao;
		this.palavrasChaves = palavrasChave;
		this.roles = roles;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRgm() {
		return rgm;
	}

	public void setRgm(String rgm) {
		this.rgm = rgm;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCodInst() {
		return codInst;
	}

	public void setCodInst(String codInst) {
		this.codInst = codInst;
	}

	public Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	
	public List<String> getPalavrasChaves() {
		return palavrasChaves;
	}

	public void setPalavrasChaves(List<String> palavrasChaves) {
		this.palavrasChaves = palavrasChaves;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
	
}
