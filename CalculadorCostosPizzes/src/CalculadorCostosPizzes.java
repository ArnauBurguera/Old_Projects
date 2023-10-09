
public class CalculadorCostosPizzes {



	static Botiga dispensa = new Botiga(3.8f,3.5f);
	static Botiga marketItalia = new Botiga(3.15f,1.95f,5.35f);

	public static void main(String[] args) {

		int paquetsFarina = 1; //Caputo Nuvola
		int llaunesTomaquet = 1;
		float costDispensa = 0f;
		float costMarketItalia = 1f;
		
		System.out.println(nomesFarina(costMarketItalia,costDispensa,llaunesTomaquet,paquetsFarina));
		System.out.println(farinaILlaunes(costMarketItalia,costDispensa,llaunesTomaquet,paquetsFarina));
	}
	

	public static String farinaILlaunes(float costMarketItalia, float costDispensa, int llaunesTomaquet, int paquetsFarina) {
		while(costMarketItalia > costDispensa) {
			
			llaunesTomaquet = (int) Math.ceil((float)paquetsFarina * (7.0f / 3));

			costDispensa = (dispensa.getPreuFarina() * paquetsFarina) + (dispensa.getPreuTomaquet() * llaunesTomaquet);
			costMarketItalia = (marketItalia.getPreuFarina() * paquetsFarina) 
					+ (marketItalia.getPreuTomaquet() * llaunesTomaquet) + marketItalia.getGastosEnvio();

			paquetsFarina++;
		}
		return "El nombre de paquets de farina que hauries de comprar per a que sigui "
		+ "més economic comprar a Market Casa Italia és de " + paquetsFarina + " i " + llaunesTomaquet 
		+ " llaunes de tomàquet " + " i el cost total seria de " + costMarketItalia + "€.";

	}

	public static String nomesFarina(float costMarketItalia, float costDispensa, int llaunesTomaquet, int paquetsFarina) {
		while(costMarketItalia > costDispensa) {

			costDispensa = (dispensa.getPreuFarina() * paquetsFarina) + (dispensa.getPreuTomaquet());
			costMarketItalia = (marketItalia.getPreuFarina() * paquetsFarina) 
					+ (marketItalia.getPreuTomaquet()) + marketItalia.getGastosEnvio();

			paquetsFarina++;
		}
		return "El nombre de paquets de farina que hauries de comprar per a que sigui "
		+ "més economic comprar a Market Casa Italia és de " + paquetsFarina + " i el cost total seria de " + costMarketItalia + "€.";


	}
}
