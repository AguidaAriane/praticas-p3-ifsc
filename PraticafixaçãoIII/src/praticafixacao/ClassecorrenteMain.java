package praticafixacao;

public class ClassecorrenteMain {

public static void main(String[] args) {
		
		Contacorrente numero = new Contacorrente ();
		
		numero.nomeTitular = "Aguida";
		numero.cpf = 28374849574l;
		numero.numero_conta = 374833846378l;
		numero.saldo = 22.000;
		
		numero.mostrarDados();
		
		numero.depositar(108.0);
		numero.sacar (3.0);
		
		numero.mostrarDados();

	}

}
