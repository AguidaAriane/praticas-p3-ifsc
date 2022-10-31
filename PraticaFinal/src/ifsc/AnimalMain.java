package ifsc;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
ArrayList<Gato> cat = new ArrayList<>();
		
		Gato gato1 = new Gato();
		gato1.setNome("Milaide");
		gato1.setNumerodePatas(3);
		gato1.setRaca("Siames");
		gato1.setEcossistema("Casa");
		gato1.setCor("Cinza e braco");
		gato1.setComprimento(19.0f);
		cat.add(gato1);

		Gato gato2 = new Gato();
		gato2.setNome("creopata");
		gato2.setNumerodePatas(4);
		gato2.setRaca("Ragdoll.");
		gato2.setEcossistema("casa");
		gato2.setCor("branco");
		gato2.setComprimento(20.0f);
		cat.add(gato2);
		
		Gato gato3 = new Gato();
		gato3.setNome("Mimi");
		gato3.setNumerodePatas(4);
		gato3.setRaca("Persa");
		gato3.setEcossistema("Casa");
		gato3.setCor("Branco");
		gato3.setComprimento(23.0f);
		cat.add(gato3);
		
		ArrayList<Cachorro> dog = new ArrayList<>();
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Snoop");
		cachorro1.setNumerodePatas(4);
		cachorro1.setRaca("Husky");
		cachorro1.setEcossistema("Casa");
		cachorro1.setCor("Branco");
		cachorro1.setComprimento(51.0f);
		dog.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Amora");
		cachorro2.setNumerodePatas(4);
		cachorro2.setRaca("Labrador");
		cachorro2.setEcossistema("Minha casa");
		cachorro2.setCor("Marron");
		cachorro2.setComprimento(50.0f);
		dog.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Youtube");
		cachorro3.setNumerodePatas(4);
		cachorro3.setRaca("Viralata");
		cachorro3.setEcossistema("Casa");
		cachorro3.setCor("Branco");
		cachorro3.setComprimento(60.0f);
		dog.add(cachorro3);
		
		for (Gato gato : cat) {
			System.out.println(gato.getNome());
			System.out.println(gato.getNumerodePatas());
			System.out.println(gato.getRaca());
			System.out.println(gato.getEcossistema());
			System.out.println(gato.getCor());
			System.out.println(gato.getComprimento());
		}
		
		for (Cachorro cachorro : dog) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getNumerodePatas());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getComprimento());
		}
	}

}
		
	


