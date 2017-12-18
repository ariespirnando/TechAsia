import java.util.Arrays;
public class looping {
	public static void main(String[] arg){
		long waktuawalSerial, waktuakhirSerial;
		int tampung[] = new int[2000];
		waktuawalSerial = System.nanoTime();
		for(int i=0; i<2000;i++){
			tampung[i] = i+1;
		}
		System.out.println(Arrays.toString(tampung)); 
		waktuakhirSerial = System.nanoTime() - waktuawalSerial;
		System.out.println(waktuakhirSerial/1000000d);
	}
}
