package fase1.teste;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String nome;
	private Usuario dono;
	private List<Midia> midias;
	
	public Playlist(String nome, Usuario dono) {
		this.nome = nome;
		this.dono = dono;
		this.midias = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	
	public void adicionar_midia(Midia m) {
		midias.add(m);
		
	}
	
	public void remover_midia(Midia m) {
		midias.remove(m);
	}	
	
	public void listar_midias() {
		for (Midia m : midias) {
			System.out.println(m.getDescricao());
			
		}
	}
	
	public double calcular_duracao_total() {
		double total = 0;
		for(Midia m : midias) {
			total += m.getDuracao();
		}
		return total;
		}
	
	public String getNome() {
		return nome;
	}
		
	
	public String toString() {
		return "Playlist [nome=" + nome + ", dono=" + dono + ", midias=" + midias + ". Duracao" + calcular_duracao_total() +  "]";
	}


	public List<Midia> getMidias() {
	    return midias;
	}

}
