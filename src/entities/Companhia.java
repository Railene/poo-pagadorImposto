package entities;

public class Companhia  extends Contribuinte {

			private Integer numeroDeFuncionarios;

			public Companhia(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
				super(nome, rendaAnual);
				this.numeroDeFuncionarios = numeroDeFuncionarios;
			}

			public Integer getNumeroDeFuncionarios() {
				return numeroDeFuncionarios;
			}

			public void setNumberOfEmployees(Integer numeroDeFuncionarios) {
				this.numeroDeFuncionarios = numeroDeFuncionarios;
			}

			@Override
			public Double imposto() {
				if (numeroDeFuncionarios > 10) {
					return getRendaAnual() * 0.14;
				}
				else {
					return getRendaAnual() * 0.16;
				}
			}

}
