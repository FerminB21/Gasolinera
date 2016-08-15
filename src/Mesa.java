public class Mesa{

	private int provincia; 
	private int votosA;
	private int votosB; 
	private int votosC;	
	
	public Mesa(int provincia, int votosA, int votosB, int votosC) {
		this.provincia = provincia;
		this.votosA = votosA;
		this.votosB = votosB;
		this.votosC = votosC;
	}

	public int getProvincia() {
		return provincia;
	}

	public void setProvincia(int provincia) {
		this.provincia = provincia;
	}

	public int getVotosA() {
		return votosA;
	}

	public void setVotosA(int votosA) {
		this.votosA = votosA;
	}

	public int getVotosB() {
		return votosB;
	}

	public void setVotosB(int votosB) {
		this.votosB = votosB;
	}

	public int getVotosC() {
		return votosC;
	}

	public void setVotosC(int votosC) {
		this.votosC = votosC;
	}
}
