
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador ();
		adm.setSenha(3333);
		
		Diretor dir = new Diretor();
		dir.setSenha(2222);
		
		Cliente cli = new Cliente();
		cli.setSenha(2222);
		
		Supervisor sup = new Supervisor();
		sup.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(dir);
		si.autentica(cli);
		si.autentica(sup);
	}

}
