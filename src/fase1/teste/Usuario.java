package fase1.teste;

import java.util.ArrayList;


import java.util.List;

public class Usuario {
	
	private String nome;
	private String email;
	private List<Playlist> playlists = new ArrayList<>();
	
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "nome: " + nome + "email: " + email;
	}

	void adicionarPlaylist1(Playlist playlist) {
		// TODO Auto-generated method stub
		
	}
	public List<Playlist> getPlaylists() {
	    return playlists;
	}
	public void adicionarPlaylist(Playlist playlist) {
	    playlists.add(playlist);
	}
	
	}
	

