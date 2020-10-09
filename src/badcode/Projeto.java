package badcode;

public class Projeto {
	// Prazo para entrega do Projeto em Dias
	public int prazo;
	
	// Situacao Atual do Projeto
	public boolean situacao;
	
	
	/**
	 * Cria um novo Projeto com um Prazo
	 * 
	 * @param prazo Prazo em Dias para a Conclusao do Projeto
	 */
	public Projeto(int prazo) {
		super();
		this.prazo = prazo;
		this.situacao = false;
	}
	
	/* Get's e Set's padroes, "isSituacao" (Gerado Automaticamente)
	 * foi alterado para "isEntregue" para melhor entendimento
	 */
	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public boolean isEntregue() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public String checar() {
		if (this.prazo < 90) {
			if (!this.isEntregue()) {
				return "Projeto esta apertado" ;
			} else {
				return "Projeto entregue";}
		} else { 
			return "Projeto em Andamento";
		}
	}
}