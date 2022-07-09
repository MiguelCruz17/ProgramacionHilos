
public class ClasePrincipal {

	public static void main(String[] args) {

		// CREACION DE LOS OBJETOS DE LA CLASE DONDE SE ENCUENTRA LOS HILOS
		Proceso1 Hilo1 = new Proceso1();
		Proceso2 Hilo2 = new Proceso2();

		// EJECUCION DE HILOS

		Hilo1.start();
		Hilo2.start();

	}

}
