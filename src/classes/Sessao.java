package classes;

public class Sessao {
	private int[] Horario;
	public Filme Exibi��o;
	private int[] Data; //SER� SUBSTITUIDO POR UM OBJETO DO TIPO LocalDate da biblioteca Java.time
	private Sala Hall;
	private int ocupa��o;
	private float valor; // valor do ingresso inteiro
	private int nvInteiro; // n�mero de vendas de ingressos inteiros
	private int nvMeia; // n�mero de vendas de meio ingressos
	private boolean[] posi��o; // as cadeiras da sala

	/*
	 * public Sessao{
	 *  M�TODO CONSTRUTOR
	 * }
	 */
	public void ocuparcadeira(int Poltrona) {
		this.posi��o[Poltrona] = false;
	}
}
