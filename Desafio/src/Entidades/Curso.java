package Entidades;

public class Curso extends Conteudo{
	private double cargaHorario;
	
	public Curso() {
	}
	
	public Curso(double cargaHorario) {
		this.cargaHorario = cargaHorario;
	}
	
	public double getCargaHorario() {
		return cargaHorario;
	}
	
	public void setCargaHorario(double cargaHorario) {
		this.cargaHorario = cargaHorario;
	}

	@Override
	public String toString() {
		return "----\nCurso [titulo=" + getTitulo() + 
				"\ndescricao=" + getDescricao() + 
				"\ncargaHorario=" + cargaHorario + "]\n----";
	}

	@Override
	public double carcularXP() {
		return XP_PADRA * this.cargaHorario;
	}
	
}
