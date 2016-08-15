public class Planilla{

	private int votosA [];
	private int votosB [];
	private int votosC []; 
	private boolean ballotage[]; 
	
	public Planilla()
	{
		votosA= new int [25];
		votosB= new int [25];
		votosC= new int [25];
		ballotage= new boolean [25];
	}

	public int[] getVotosA() {
		return votosA;
	}

	public void setVotosA(int[] votosA) {
		this.votosA = votosA;
	}

	public int[] getVotosB() {
		return votosB;
	}

	public void setVotosB(int[] votosB) {
		this.votosB = votosB;
	}

	public int[] getVotosC() {
		return votosC;
	}

	public void setVotosC(int[] votosC) {
		this.votosC = votosC;
	}

	public boolean[] getBallotage() {
		return ballotage;
	}

	public void setBallotage(boolean[] ballotage) {
		this.ballotage = ballotage;
	}
	
	public void agregarMesa(Mesa m){
		
		votosA[m.getProvincia()-1]+=m.getVotosA();
		votosB[m.getProvincia()-1]+=m.getVotosB();
		votosC[m.getProvincia()-1]+=m.getVotosC();
		
		int totalVotos = votosA[m.getProvincia()-1]+votosB[m.getProvincia()-1]+votosC[m.getProvincia()-1];
		
		if(votosA[m.getProvincia()-1] > totalVotos/2 || votosB[m.getProvincia()-1] > totalVotos/2 || votosC[m.getProvincia()-1] > totalVotos/2)
			ballotage[m.getProvincia()-1]=false;
		else
			ballotage[m.getProvincia()-1]=true;
	}
}