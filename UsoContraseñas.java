package molero.german.contraseñas;
import javax.swing.JOptionPane;
public class UsoContraseñas {

	public static void main(String[] args) {
		int tamañoArray = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas contraseñas quieres generar?"));
		int longitudContraseña = Integer.parseInt(JOptionPane.showInputDialog("¿De qué longitud será la contraseña"));
		GeneradorContraseñas test = new GeneradorContraseñas(tamañoArray,longitudContraseña);
		test.setGenerarContraseña();
		System.out.println(test.getDatosContraseñas());

	}

}
