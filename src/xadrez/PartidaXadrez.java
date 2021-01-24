package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configuracaoInicial();
	}
	
	public PecaXadrez[][] getPecaXadrezs() {
		PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int l = 0; l < tabuleiro.getLinhas(); l++) {
			for (int c = 0; c < tabuleiro.getColunas(); c++) {
				matriz[l][c] = (PecaXadrez) tabuleiro.peca(l, c);
			}
		}
		return matriz;
	}
	
	private void configuracaoInicial() {
		tabuleiro.posicionaPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(3, 3));
		tabuleiro.posicionaPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(5, 5));
	}
	
}
