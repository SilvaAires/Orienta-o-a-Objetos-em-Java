package Entidades;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Conteudo> conInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conConcluidos = new LinkedHashSet<Conteudo>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conInscritos.addAll(bootcamp.getCont());
		bootcamp.getDevins().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> con = this.conInscritos.stream().findFirst();
		if(con.isPresent()) {
			this.conConcluidos.add(con.get());
			this.conInscritos.remove(con.get());
		}else {
			System.err.println("erro");
		}
	}
	
	public double calcularXp() {
		return this.conConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.carcularXP()).sum();
	}

	public Dev() {
	}

	public Dev(String nome, Set<Conteudo> conInscritos, Set<Conteudo> conConcluidos) {
		this.nome = nome;
		this.conInscritos = conInscritos;
		this.conConcluidos = conConcluidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConInscritos() {
		return conInscritos;
	}

	public void setConInscritos(Set<Conteudo> conInscritos) {
		this.conInscritos = conInscritos;
	}

	public Set<Conteudo> getConConcluidos() {
		return conConcluidos;
	}

	public void setConConcluidos(Set<Conteudo> conConcluidos) {
		this.conConcluidos = conConcluidos;
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + 
				"\nconInscritos=" + conInscritos + 
				"\nconConcluidos=" + conConcluidos + 
				"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(conConcluidos, conInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conConcluidos, other.conConcluidos) && Objects.equals(conInscritos, other.conInscritos)
				&& Objects.equals(nome, other.nome);
	}
	
}
