package br.com.fourlinux;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UsuarioMB {

	public String executaAcao() {
		System.out.println("CHAMOU AÇÃO NO MANAGED BEAN");
		return null;
	}
}