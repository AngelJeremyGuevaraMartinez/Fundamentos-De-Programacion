import java.io.*;

public class problema_5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double distancia;
		double tiempo;
		double velocidad;
		System.out.println("escribe el tiempo recorrido em horas");
		tiempo = Double.parseDouble(bufEntrada.readLine());
		System.out.println("la velocidad promedio ");
		velocidad = Double.parseDouble(bufEntrada.readLine());
		distancia = velocidad*tiempo;
		System.out.println("la distancia recorrida fue de "+distancia);
	}


}

