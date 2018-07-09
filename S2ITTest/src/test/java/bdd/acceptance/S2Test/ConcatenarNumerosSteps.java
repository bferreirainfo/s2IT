package bdd.acceptance.S2Test;

import com.S2Test.App;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ConcatenarNumerosSteps {
	private Integer numerosMergiados;

	@Given("^Usuario rode a aplicação com os valores \"([^\"]*)\"$")
	public void usuario_rode_a_aplicação_com_os_valores(String commandLine) throws Throwable {
		numerosMergiados = new App(commandLine.split(" ")).merge();
	}
	
	@Then("^C deve ser \\+?(-?\\d+)$")
	public void c_deve_ser(int c) throws Throwable {
		numerosMergiados.equals(c);
	}


}
