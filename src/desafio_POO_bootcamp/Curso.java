package desafio_POO_bootcamp;

public class Curso extends Conteudo {
	
	private int cargaHoraria;

	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}
	
	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria ;
	}
	
	

}
