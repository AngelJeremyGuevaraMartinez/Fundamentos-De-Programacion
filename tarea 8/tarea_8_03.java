import java.io.*;

public class tarea_8_03{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x1,y1,x2,y2,dx,dy;
		
		x1=Integer.parseInt(br.readLine());
		y1=Integer.parseInt(br.readLine());
		x2=Integer.parseInt(br.readLine());
		y2=Integer.parseInt(br.readLine());
		
		dx=Math.abs(x1-x2);
		dy=Math.abs(y1-y2);
		
		if((dx==2&&dy==1)||(dx==1&&dy==2))
			System.out.println("Movimiento valido");
		else
			System.out.println("Invalido");
	}
}
