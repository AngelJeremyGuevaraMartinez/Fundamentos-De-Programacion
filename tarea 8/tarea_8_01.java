import java.io.*;

public class tarea_8_01{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w;
		
		w = Integer.parseInt(br.readLine());
		
		if(w>2 && w%2==0)
			System.out.println("SI");
		else
			System.out.println("NO");
	}
}
