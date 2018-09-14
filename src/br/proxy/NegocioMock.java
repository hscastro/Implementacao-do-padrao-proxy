package br.proxy;

public class NegocioMock implements InterfaceNegocio {
	
	private boolean foiAcessado =  false;

	@Override
	public void executeTransacao() {
		foiAcessado =  true;
	}

	@Override
	public void cancelarTransacao() {
		foiAcessado =  true;
	}

	public boolean foiAcessado() {
		return foiAcessado;
	}
	

}
