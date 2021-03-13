package exercicio_2_conta_corrente;
/*
No sistema banc�rio brasileiro todas as contas possuem um 
  n�mero, 
  uma ag�ncia (nome e n�mero), 
  o banco(nome e n�mero), 
  o tipo (n�mero indicando 1=corrente, 2=poupan�a, 3=conjunta, 4=conta encerrada, etc.) e saldo. 
  Com estas contas podem ser feitas as seguintes a��es:

	�	abrir: recebe os dados da conta e insere 0 como estado do saldo;
	�	encerrar: caso a conta n�o tenha saldo negativo, coloca o tipo da conta como 4 e retorna o valor atual do saldo zerando-o em seguida;
	�	consultar_saldo: retorna o valor atual do saldo;
	�	creditar: caso a conta n�o esteja encerrada, adiciona o valor recebido no par�metro no estado saldo;
	�	debitar: caso a conta n�o esteja encerrada, retira o valor recebido como par�metro do estado saldo.

	Implemente em java uma classe que represente estas contas.
*/
public class ContaCorrente {
	// Atributos
	private String nrConta;
	private String agencia;
	private int nrAgencia;
	private String banco;
	private int nrBanco;
	private int tipo;
	private float saldo;

	// abrir: recebe os dados da conta e insere 0 como estado do saldo;
	public ContaCorrente(
			String nrConta, 
			String agencia, int nrAgencia, 
			String banco, int nrBanco, int tipo) {
		this.nrConta = nrConta;
		this.agencia = agencia;
		this.nrAgencia = nrAgencia;
		this.banco = banco;
		this.nrBanco = nrBanco;
		this.tipo = tipo;
		this.saldo = 0;
	}

	// encerrar: caso a conta n�o tenha saldo negativo, coloca o tipo da conta 
	// como 4 e retorna o valor atual do saldo zerando-o em seguida;
	public void encerrar() {
		if (getSaldo() >=0 ) {
			this.tipo = 4; // Conta Encerrada
			System.out.println("Saldo Atual: "+getSaldo());
			this.saldo = 0;
		}
	}
	
	//creditar: caso a conta n�o esteja encerrada, adiciona o valor recebido no par�metro no estado saldo;
	public void creditar(float valor) {
		if (this.tipo == 4) {
			System.out.println("Erro! Conta Encerrada!");
		} else {
			this.saldo += valor;
			System.out.println("Saldo Atual: "+getSaldo());
		}
	}
	
	// debitar: caso a conta n�o esteja encerrada, retira o valor recebido como par�metro do estado saldo.
	public void debitar(float valor) {
		if (this.tipo == 4) {
			System.out.println("Erro! Conta Encerrada!");
		} else {
			this.saldo -= valor;
			System.out.println("Saldo Atual: "+getSaldo());
		}		
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [nrConta=" + nrConta + ", agencia=" + agencia + ", nrAgencia=" + nrAgencia + ", banco="
				+ banco + ", nrBanco=" + nrBanco + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(int nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getNrBanco() {
		return nrBanco;
	}

	public void setNrBanco(int nrBanco) {
		this.nrBanco = nrBanco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	// consultar_saldo
	public float getSaldo() {
		return saldo;
	}

	
	
	
}
