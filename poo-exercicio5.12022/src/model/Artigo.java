package model;

public class Artigo extends Submissao{
	
	private String resumo;
	private static int numeroArtigos;
	
	public Artigo() {
		super();
		this.incrementarNumeroArtigos();
	}
	
	public Artigo(String titulo, int situacao, Autor autor, Area area, String resumo) {
		super(titulo, situacao, autor, area);
		this.resumo = resumo;
		this.incrementarNumeroArtigos();
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	private static void incrementarNumeroArtigos() {
		numeroArtigos++;
	}
}
