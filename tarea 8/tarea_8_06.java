import java.io.*;

public class tarea_8_06{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x1,y1,x2,y2,px,py;
		System.out.println("Ingrese las coordenadas ");
		x1=Integer.parseInt(br.readLine());
		y1=Integer.parseInt(br.readLine());
		x2=Integer.parseInt(br.readLine());
		y2=Integer.parseInt(br.readLine());
		px=Integer.parseInt(br.readLine());
		py=Integer.parseInt(br.readLine());
		
		if(px>=x1&&px<=x2&&py>=y1&&py<=y2){
			if(px==x1||px==x2||py==y1||py==y2)
				System.out.println("Borde");
			else
				System.out.println("Dentro");
		}
		else
			System.out.println("Fuera");
	}
}
