package Entidades;

public class Mentoria extends Conteudo{
	private String data;
	
	public Mentoria() {
	}

	public Mentoria(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "----\nMentoria [titulo=" + getTitulo() + 
				"\ndescricao=" + getDescricao() + 
				"data=" + data + "]\n----";
	}

	@Override
	public double carcularXP() {
		return XP_PADRA + 20d;
	}
	
	
}
