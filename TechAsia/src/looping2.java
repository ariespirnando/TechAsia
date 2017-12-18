import java.util.Arrays;


public class looping2 extends Thread{
	int id, to, from;
	static int tampung[] = new int[2000];
	public looping2(int a, int b, int c){
		this.id = a;
		this.from = b;
		this.to = c;
	}
	public void run(){
        for(int i=from; i<to; i++){ 
        	tampung[i] = i+1;
        }
    }
	public static void main(String[] args){
		long waktuawalSerial, waktuakhirSerial; 
		looping2 t1 = new looping2(1,0,1000);
		looping2 t2 = new looping2(2,1000,2000);     
		waktuawalSerial = System.nanoTime();
        t1.start();
        t2.start();   
        try {
            t1.join();
            t2.join();   
        } catch (Exception e) {
            System.out.println(e);
        }  
		System.out.println(Arrays.toString(tampung)); 
        waktuakhirSerial = System.nanoTime() - waktuawalSerial;
		System.out.println(waktuakhirSerial/1000000d);
	}
	
}
