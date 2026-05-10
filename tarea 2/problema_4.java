import java.io.*;

public class problema_4 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ndolares;
		double pconvertir;
		double vdolar;
		System.out.println("dame el valor del dolar");
		vdolar = Double.parseDouble(bufEntrada.readLine());
		System.out.println("cuantos pesos vas aconvertir");
		pconvertir = Double.parseDouble(bufEntrada.readLine());
		ndolares = pconvertir/vdolar;
		System.out.println(pconvertir+" son "+ndolares+" dolares");
	}


}

