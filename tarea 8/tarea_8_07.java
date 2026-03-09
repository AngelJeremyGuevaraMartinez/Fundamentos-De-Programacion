import java.io.*;

public class tarea_8_07{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x1,y1,x2,y2,r1,r2;
		double d;
		System.out.println("Ingrese las coordenadas ");
		x1=Integer.parseInt(br.readLine());
		y1=Integer.parseInt(br.readLine());
		x2=Integer.parseInt(br.readLine());
		y2=Integer.parseInt(br.readLine());
		r1=Integer.parseInt(br.readLine());
		r2=Integer.parseInt(br.readLine());
		
		d=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		
		if(d<(r1+r2))
			System.out.println("Intersectan");
		else
			if(d==(r1+r2))
				System.out.println("Tangentes");
			else
				System.out.println("No se tocan");
	}
}
