package model;

public class Salgadinho extends Prato {
	
    private String recheio;
    private String massa;
    private String tipo;
    
	public Salgadinho(String nome, double preco, String dataValidade, double peso, String recheio, String massa, String tipo) {
		super(nome, preco, dataValidade, peso, tipo);
		this.recheio = recheio;
		this.massa = massa;
		this.tipo = tipo;
	}
		
	@Override
	public String toString() {
		return "Salgadinho = " + super.toString() + ", recheio = " + this.recheio + ", massa = " + this.massa + ", tipo (assado ou frito)" + this.tipo + "\n";
	}
	@Override
    public void calcularPreco() {
        return nome + ", preco = " + preco + ", dataDeValidade = " + dataValidade + ", peso = " + peso;
    }
    
    public double getPreco() {
    	return this.preco;
    }
	
    public String getNome() {
    	return this.nome;
    }
}
