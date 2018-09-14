package br.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProxySeguranca {

	@Test
	public void testeAutorizaAcesso() {
		Usuario halyson = new Usuario("Halyson");
		halyson.autorizaAcesso("InterfaceNegocio","executeTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new SegurancaNegocio(mock, halyson);
	    n.executeTransacao();
	    assertTrue(mock.foiAcessado());
		
	}

	@Test
	public void testeNaoAutorizaAcesso() {
		Usuario halyson = new Usuario("Halyson");
		halyson.autorizaAcesso("InterfaceNegocio","executeTransacao");
		NegocioMock mock = new NegocioMock();
		InterfaceNegocio n = new SegurancaNegocio(mock, halyson);
	    
		try{
			n.cancelarTransacao();
			fail();
		}catch (Exception e) {
			assertFalse(mock.foiAcessado());
			e.printStackTrace();
		}
	    
	    
		
	}
	
}
