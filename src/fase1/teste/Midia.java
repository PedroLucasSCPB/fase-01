package fase1.teste;

public abstract class Midia {
	
	private String titulo;
	private String artista;
	private double duracao;
	private Genero genero;
	
	
	public Midia(String titulo,String artista,double duracao ) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
		 
		
		
		
		}

	public String getTitulo() {
		return titulo;
	}


	public String getArtista() {
		return artista;
	}

	public double getDuracao() {
		return duracao;
	}

	public String getDescricao() {
        return titulo + " - " + artista + " (" + duracao + " min)";
    }

	public abstract void reproduzir();
	
	
	

}
