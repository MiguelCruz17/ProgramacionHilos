// CLASE QUE HEREDA LOS ATRIBUTOS DE THREAD.
public class Proceso2 extends Thread {

	// SOBREESCRIBIR METODO DE THREAD.
	@Override
	public void run() {
		// CICLO FOR QUE EJECUTA UN PRINT.
		for (int i = 0; i <= 10; i++) {
			System.out.println("El hilo #2 se está ejecutando");
		}
	}
}
