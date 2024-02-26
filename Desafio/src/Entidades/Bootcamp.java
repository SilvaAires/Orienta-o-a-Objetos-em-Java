package Entidades;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataIni = LocalDate.now();
	private LocalDate dataFin = dataIni.plusDays(45);
	private Set<Dev> devins = new HashSet<Dev>();
	private Set<Conteudo> cont = new LinkedHashSet<Conteudo>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getDataIni() {
		return dataIni;
	}
	
	public void setDataIni(LocalDate dataIni) {
		this.dataIni = dataIni;
	}
	
	public LocalDate getDataFin() {
		return dataFin;
	}
	
	public void setDataFin(LocalDate dataFin) {
		this.dataFin = dataFin;
	}
	
	public Set<Dev> getDevins() {
		return devins;
	}
	
	public void setDevins(Set<Dev> devins) {
		this.devins = devins;
	}
	
	public Set<Conteudo> getCont() {
		return cont;
	}
	
	public void setCont(Set<Conteudo> cont) {
		this.cont = cont;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cont, dataFin, dataIni, descricao, devins, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(cont, other.cont) && Objects.equals(dataFin, other.dataFin)
				&& Objects.equals(dataIni, other.dataIni) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devins, other.devins) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Bootcamp [nome=" + nome + ", descricao=" + descricao + ", dataIni=" + dataIni + ", dataFin=" + dataFin
				+ ", devins=" + devins + ", cont=" + cont + "]";
	}
	
}
