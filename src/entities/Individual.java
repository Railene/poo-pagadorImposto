package entities;

public class Individual extends Contribuinte  {
	private Double despesasSaude;

	public Individual(String nome, Double rendaAnual, Double despesasSaude) {
		super(nome, rendaAnual);
		this.despesasSaude = despesasSaude;
	}

	public Double getDespesasSaude() {
		return despesasSaude;
	}

	public void setDespesasSaude(Double despesasSaude) {
		this.despesasSaude = despesasSaude;
	}

	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - despesasSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - despesasSaude * 0.5;
		}
	}

}
