// CLASE QUE HEREDA LOS ATRIBUTOS DE THREAD.
public class Proceso1 extends Thread {

	// SOBREESCRIBIR METODO DE THREAD.
	@Override
	public void run() {
		// CICLO FOR QUE EJECUTA UN PRINT.
		for (int i = 0; i <= 10; i++) {
			System.out.println("El hilo #1 se está ejecutando");
		}
	}
}
