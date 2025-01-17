package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("funcionario que receber $1000 ou acima , n�o tem direito a bonus");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);//ARRENDODA PARA CIMA SE FOR UM NUMERO QUEBRADO
	}

}
