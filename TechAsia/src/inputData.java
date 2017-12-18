import java.util.Arrays;
import java.util.Scanner;
public class inputData { 
	public static int[] SelectionSort(int[] arr){ 
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
	
	public static int[] InsertionSort(int[] arr){
        
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
	
	public static int[] bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                  if(arr[j-1] > arr[j]){   
                         temp = arr[j-1];  
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
                 }    
             }  
         }  
        return arr;
  
    }  
	
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);
		int tampung[] = new int[20];
		int a;
		for(int i=0; i<20; i++){
			System.out.print("input nilai :");
			a = masukan.nextInt();
			if(a%2==0){
				System.out.println("Oops, only accept odd numbers");
				i--;
			}else{
				tampung[i] = a;
			}
		} 
		System.out.println();
		System.out.println("Data befor Sorting");
		System.out.println(Arrays.toString(tampung));
		long waktuawalSerial, waktuakhirSerial;
		
		waktuawalSerial = System.nanoTime();
		System.out.println("Selection Sort");
		int[] selSort = SelectionSort(tampung); 
		System.out.println(Arrays.toString(selSort));
		waktuakhirSerial = System.nanoTime() - waktuawalSerial;
		System.out.println("Time :"+waktuakhirSerial/1000000d);
		
		waktuawalSerial = System.nanoTime();
		System.out.println("Insertion Sort");
		int[] insSort = InsertionSort(tampung); 
		System.out.println(Arrays.toString(insSort));
		waktuakhirSerial = System.nanoTime() - waktuawalSerial;
		System.out.println("Time :"+waktuakhirSerial/1000000d);
		
		waktuawalSerial = System.nanoTime();
		System.out.println("Buble Sort");
		int[] bublSort = bubbleSort(tampung); 
		System.out.println(Arrays.toString(bublSort));
		waktuakhirSerial = System.nanoTime() - waktuawalSerial;
		System.out.println("Time :"+waktuakhirSerial/1000000d);
		
		
	}
}
