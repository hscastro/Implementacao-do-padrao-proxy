package br.proxy;

public class SegurancaNegocio implements InterfaceNegocio {

	private InterfaceNegocio encapsulado;
	private Usuario u;

	public SegurancaNegocio(InterfaceNegocio encapsulado, Usuario u) {		
		this.encapsulado = encapsulado;
		this.u = u;
	}

	public void executeTransacao() {
		encapsulado.executeTransacao();
	}

	public void cancelarTransacao() {
		encapsulado.cancelarTransacao();
	}
	
	
	
	
	
	

}
