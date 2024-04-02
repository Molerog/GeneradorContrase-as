package molero.german.contraseñas;

public class GeneradorContraseñas {

	private String[] contraseñas;
	private String contraseña ="";
	private int longitudContraseña;
	
	public GeneradorContraseñas(int tamañoArray, int longitudContraseña) {
		this.contraseñas = new String[tamañoArray];
		this.longitudContraseña = longitudContraseña;
	}
	
	public void setGenerarContraseña() {
		for(int i = 0; i<=(contraseñas.length-1);i++) {
			
			for(int y=1; y<=longitudContraseña; y++) {
				
				int letraASCII = (int) Math.floor(Math.random()* (122 - 48 + 1)+48);
				
				if((letraASCII >= 58 && letraASCII <=64) || (letraASCII>=91 && letraASCII <=96)) {
					y--;
				}else {
					String conversion = Character.toString(letraASCII); 
					this.contraseña += conversion;
				}
				
				
			}
			contraseñas[i] = this.contraseña;
			this.contraseña="";
		}
		
		
	}
	
	public String getDatosContraseñas() {
		String contraseña ="";
		for(int i = 0; i<=(contraseñas.length-1);i++) {
			String resultado = getEvaluacionContraseña(contraseñas[i]);
			contraseña += "La contraseña: " + contraseñas[i] + " tiene " + String.valueOf(getLongitudContraseña()) +" caracteres " + "y " + resultado + "\n";
			
		}
		return contraseña;
	}
	
	public int getLongitudContraseña() {
		return this.longitudContraseña;
	}
	
	public String getEvaluacionContraseña(String contraseña) {
		int checkNumeros=0;
		int checkMinusculas=0;
		int checkMayusculas=0;
		
		String resultado = "";
		for(int i=0; i<=(contraseña.length()-1);i++) {
			
			int ascii = (int) contraseña.charAt(i);
			
			if(ascii >= 48 && ascii<=57) {
				checkNumeros++;
			}
			if(ascii >=65 && ascii <=90) {
				checkMayusculas++;
			}
			if(ascii >= 97 && ascii <=122) {
				checkMinusculas++;
			}
							
		}
		if(checkNumeros>5 && checkMinusculas >1 && checkMayusculas >2) {
			resultado = "es segura";
		}
		else {
			resultado = "no es segura";
		}
		return resultado;
		
	}
}
