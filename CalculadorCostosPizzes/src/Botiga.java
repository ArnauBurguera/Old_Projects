
public class Botiga {
	
	private float preuTomaquet;
	private float preuFarina;
	private float gastosEnvio;
	
	
	public Botiga(float preuTomaquet, float preuFarina) {
		super();
		this.preuTomaquet = preuTomaquet;
		this.preuFarina = preuFarina;
		this.gastosEnvio = 0f;
	}
	public Botiga(float preuTomaquet, float preuFarina, float gastosEnvio) {
		this.preuTomaquet = preuTomaquet;
		this.preuFarina = preuFarina;
		this.gastosEnvio = gastosEnvio;
	}
	
	public float getPreuTomaquet() {
		return this.preuTomaquet;
	}
	public float getPreuFarina() {
		return this.preuFarina;
	}
	public float getGastosEnvio() {
		return this.gastosEnvio;
	}
	
	public void setPreuTomaquet(float preuTomaquet) {
		this.preuTomaquet = preuTomaquet;
	}
	public void setPreuFarina(float preuFarina) {
		this.preuFarina = preuFarina;
	}
	public void setGastosEnvio(float gastosEnvio) {
		this.gastosEnvio = gastosEnvio;
	}
	
	
	
	
	
	
	
	

}
