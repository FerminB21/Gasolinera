import javax.swing.JOptionPane;
public class IO {

	Planilla p = new Planilla();
	
	public IO(){
		menu();
	}
	
	public void menu(){

		int opcion = 0;
	     
	     while (opcion != 6){
	            opcion = Integer.parseInt(JOptionPane.showInputDialog
	                ("1. Ingresar información\n"
	                +"2. Mostrar informe\n"
	                + "3\n"
	                + "4\n"
	                + "Ingresar opción: "));
		
	            switch (opcion){
	            case 1: 
	             ingresarInformacion();
	             break;
	            case 2:
	            	mostrarInforme();
	            break;
	            case 3:
	            	mayorB();
	            break;
	            case 4:
	            	menorA();
	            break;
	            case 5:
	            ballotage();
	            break;
	             case 6:
	                   default:
	                       break;
	        }
	       }
	}
	
	public void ingresarInformacion()
	{
		int provincia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar provincia (0 PARA SALIR): ")); 
		while (provincia!=0)
		{
			int votosA = Integer.parseInt(JOptionPane.showInputDialog("Ingresar votos A: ")); 
			int votosB = Integer.parseInt(JOptionPane.showInputDialog("Ingresar votos B: "));
			int votosC = Integer.parseInt(JOptionPane.showInputDialog("Ingresar votos C: "));
			p.agregarMesa(new Mesa(provincia, votosA, votosB, votosC));
			provincia = Integer.parseInt(JOptionPane.showInputDialog("Ingresar provincia: ")); 
		}
	}
	
	public void mostrarInforme()
	{
		int c=0;
		int sumaA=0;
		int sumaB=0;
		int sumaC=0;
		String str = "";
		str = str + "PROVINCIA : A ; B ; C ; BALLOTAGE\n\n";
		
		for (int i = 0 ; i < p.getVotosA().length; i++)
		{
			c=i+1;
			str = str + c + " : " + p.getVotosA()[i] + " ; " + p.getVotosB()[i] + " ; " + p.getVotosC()[i] + " ; " + p.getBallotage()[i] + "\n";
		}
		
		for (int i = 0 ; i < p.getVotosA().length; i++)
		{
			sumaA=sumaA+p.getVotosA()[i];
			sumaB=sumaB+p.getVotosB()[i];
			sumaC=sumaC+p.getVotosC()[i];
		}
		
		str= str + "TOTAL: "+ sumaA + " ; " + sumaB + " ; " + sumaC + "\n";
		JOptionPane.showMessageDialog(null,str);
	}
	
	public void mayorB(){
		int cvotosB = 0;
		int provincia = 0;
		
		for(int i=0 ; i < p.getVotosB().length; i++){
			if(p.getVotosB()[i] > cvotosB){
				cvotosB = p.getVotosB()[i];
				provincia = i;
			}
		}
		
		provincia++;
		String srt = "La provincia campeona" + provincia;
		JOptionPane.showMessageDialog(null,srt);
	}
	
	public void menorA(){
		int maximo = 500000;
		String srt = ""; 
		for (int i = 0 ; i < p.getVotosA().length; i++)
		{
			int c=i+1;
			if(p.getVotosA()[i] < maximo){
				
				srt = srt + c +"Cantidad de votos:" + p.getVotosA()[i] + "\n";
			}
		}
		
		JOptionPane.showMessageDialog(null,srt);
	}
	
	public void ballotage(){
		int cantidad =0;
		for (int i = 0 ; i < p.getBallotage().length; i++){
		
			if (p.getBallotage()[i] == true){
				 cantidad++;} 		}
		String srt = "La cantidad de provincias que hacen ballotage son:  " + cantidad;
		JOptionPane.showMessageDialog(null,srt);
	}
		
	}


