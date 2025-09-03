package fase1.teste;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

//versao final git
public class Main {

	public static void main(String[] args) {
		System.out.println("teste");
		Catalogo catalogo = new Catalogo();
		Musica musicateste1 = new Musica("One", "Metallica", 5.13  );
		Musica musicateste2 = new Musica("Bohemian Rhapsody", "Queen", 6.0);
		Podcast podcastteste1 = new Podcast("História do Brasil", "Canal História", 45.0);
		Podcast podcastteste2 = new Podcast("Desinformação", "Arthur Petry & Thiago Carvalho", 30.0);
		Audiolivro audiolivroteste1 = new Audiolivro("A metamorfose", "Franz kafka", 120.0);
		
		catalogo.adicionarMidia(musicateste1);
		catalogo.adicionarMidia(musicateste2);
		catalogo.adicionarMidia(podcastteste1);
		catalogo.adicionarMidia(podcastteste2);
		catalogo.adicionarMidia(audiolivroteste1);
		
		catalogo.exibirMidias();
			
		Scanner scanner = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		Musica musica_teste = new Musica("time","pink floyd", 5.13);
		
		int opcao;
		
		do {
			System.out.println("---MENU DE USUARIO---");
			System.out.println("1-CADASTRAR USUARIO");
			System.out.println("2-CRIAR PLAYLIST");
			System.out.println("3-LISTAR PLAYLISTS");
			System.out.println("4-ADICIONAR MIDIAS A PLAYLIST");
			System.out.println("5-OPCAO 5");
			System.out.println("6-SAIR");
			
			System.out.println("ESCOLHA UMA OPCAO: ");
			
			try {
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1 :
			System.out.println("DIGITE SEU NOME: ");
			String nome = scanner.nextLine();
			
			System.out.println("DIGITE SEU EMAIL: ");
			String email = scanner.nextLine();
			
			Usuario usuario = new Usuario(nome,email);
			
			usuarios.add(usuario);
			System.out.println("usuario cadastrado");
			
				break;
				
			
				
			case 2:
				System.out.println("criar playlist");
				System.out.println("------------------");
				if (usuarios.isEmpty()) {
			        System.out.println("Nenhum usuário cadastrado. Escolha primeiro a opcao 1");
			        break;
			    }
			    
			    System.out.println("Escolha qual usuário irá criar a playlist:");
			    for (int i = 0; i < usuarios.size(); i++) {
			        System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
			    }

			    Usuario usuarioSelecionado = null;
			    Playlist playlist = null;

			    try {
			        int usuarioEscolhidoIndex = scanner.nextInt() - 1;
			        scanner.nextLine(); 

			        usuarioSelecionado = usuarios.get(usuarioEscolhidoIndex);

			        System.out.println("Digite o nome da playlist:");
			        String nomePlaylist = scanner.nextLine();

			        playlist = new Playlist(nomePlaylist, usuarioSelecionado);
			        usuarioSelecionado.adicionarPlaylist(playlist);

			    } catch (InputMismatchException e) {
			        System.out.println("Erro: digite um número válido");
			        scanner.nextLine(); 

			    } catch (IndexOutOfBoundsException e) {
			        System.out.println("Erro: usuário não existe");
			    }

			    
			    if (usuarioSelecionado != null && playlist != null) {
			        System.out.println("Playlist criada");
			        System.out.println("-----------------------------");

			        System.out.println("Playlists do usuário: " + usuarioSelecionado.getNome() + ":");
			        for (Playlist p : usuarioSelecionado.getPlaylists()) {
			            System.out.println("- " + p.getNome());
			        }
			    }
			    break;
				
			case 3:
				System.out.println("LISTAR PLAYLISTS DE UM USUÁRIO");
			    System.out.println("------------------");

			    if (usuarios.isEmpty()) {
			        System.out.println("Nenhum usuário cadastrado ainda");
			        break;
			    }

			    System.out.println("Escolha qual usuário irá listar as playlists:");
			    for (int i = 0; i < usuarios.size(); i++) {
			        System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
			    }

			    try {
			        int usuarioEscolhidoIndex = scanner.nextInt() - 1;
			        scanner.nextLine();

			        Usuario usuarioSelecionadolista = usuarios.get(usuarioEscolhidoIndex);

			        System.out.println("Playlists do usuário " + usuarioSelecionadolista.getNome() + ":");

			        if (usuarioSelecionadolista.getPlaylists().isEmpty()) {
			            System.out.println("(Nenhuma playlist criada ainda)");
			        } else {
			            for (Playlist p : usuarioSelecionadolista.getPlaylists()) {
			                System.out.println("▶ Playlist: " + p.getNome());

			                if (p.getMidias().isEmpty()) {
			                    System.out.println("   (Nenhuma mídia adicionada ainda)");
			                } else {
			                    for (Midia m : p.getMidias()) {
			                        System.out.println("   - " + m.getDescricao());
			                    }
			                }
			                System.out.println("------------------");
			            }
			        }

			    } catch (InputMismatchException e) {
			        System.out.println("Erro: digite um número válido");
			        scanner.nextLine();
			    } catch (IndexOutOfBoundsException e) {
			        System.out.println("Erro: usuário não existe");
			    }
			    break;
				
				
				
				
			case 4:
			    System.out.println("ADICIONAR MÍDIAS À PLAYLIST");
			    System.out.println("------------------");

			    
			    System.out.println("Escolha o usuário:");
			    for (int i = 0; i < usuarios.size(); i++) {
			        System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
			    }

			    try {
			        int usuarioIndex = scanner.nextInt() - 1;
			        scanner.nextLine();
			        Usuario usuario_Selecionado = usuarios.get(usuarioIndex);

			        
			        if (usuario_Selecionado.getPlaylists().isEmpty()) {
			            System.out.println("Este usuário não possui playlists.");
			            break;
			        }

			        System.out.println("Escolha a playlist:");
			        for (int i = 0; i < usuario_Selecionado.getPlaylists().size(); i++) {
			            System.out.println((i + 1) + " - " + usuario_Selecionado.getPlaylists().get(i).getNome());
			        }

			        int playlistIndex = scanner.nextInt() - 1;
			        scanner.nextLine();
			        Playlist playlistSelecionada = usuario_Selecionado.getPlaylists().get(playlistIndex);

			        
			        System.out.println("Catálogo de mídias:");
			        catalogo.exibirMidias();

			       
			        System.out.println("Digite o número da mídia que deseja adicionar:");
			        int midiaIndex = scanner.nextInt() - 1;
			        scanner.nextLine();
			        Midia midiaSelecionada = catalogo.getMidia(midiaIndex);

			        playlistSelecionada.adicionar_midia(midiaSelecionada);

			        System.out.println(" Mídia adicionada à playlist \"" + playlistSelecionada.getNome() + "\" com sucesso!");

			    } catch (InputMismatchException e) {
			        System.out.println("Erro: digite um número válido");
			        scanner.nextLine();
			    } catch (IndexOutOfBoundsException e) {
			        System.out.println("Erro: índice inválido");
			    }
			    break;


				
				
				
			case 5:
				System.out.println("OPCAO 5");
				System.out.println("------------------");
				
				break;
				
			case 6 :
				System.out.println("saindo...");
					
				break;
					
			default:
				System.out.println("opcao invalida, digite um numero entre 1 e 6.");
				
				break;
				
				}
			
			} catch (java.util.InputMismatchException e) {
				 System.out.println("Erro: digite um numero inteiro valido");
			        scanner.nextLine(); 
			        opcao = 0; 
			}
		}while( opcao != 6);
		scanner.close();
		
	}

	
	}

			
		

		
		
		
		
		
		
		
		
		
	



