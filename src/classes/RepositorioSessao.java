package classes;

public class RepositorioSessao {
	private Sessao[] Sess�es; //serve para mostrar quais os filmes dispon�veis e em quais hor�rios e salas
	private int nSess�es;
	
	
	/*
	 * public RepositorioSessao{
	 *  M�TODO CONSTRUTOR
	 * }
	 */
	
	public boolean inserir(Sessao Sess�o){
		//A desenvolver
		//Insere uma Sess�o no Array de sess�es 
	}
	public boolean remover(Sess�o Sess�o){
		//A desenvolver
		//Remove uma sess�o do array
	}
	public void pesquisarHorario(/* HoraInicio, HoraFim */){
		//recebe horario de inicio e fim e imprime sess�es dispon�veis entre o per�odo,
		//caso horafim seja NULL, imprimir� todas as sess�es dispon�veis ap�s o horario de inicio
		//HoraIn�cio n�o pode ser NULL
	}
	public Sess�o pesquisarFilme(Filme){
		//retorna sess�o que contenha o filme especificado
	}
	
	public Sess�o pesquisarSala(int identidade){
		//retorna a sess�o atual da sala pesquisada;
	}
	
	public boolean alterar(Sessao sessao){
		//altera infor�oes de uma sessao, retornando verdadeiro caso ela exista. Retorna falso, caso a sess�o n�o exista
	}
	
	public void listar(){
		//Imprime todas as sess�es disponiveis;
	}
	
}
