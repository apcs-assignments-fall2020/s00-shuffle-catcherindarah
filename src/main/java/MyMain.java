import java.util.Random; 
public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int a = 0;
		int shuffled[] =new int[52];
        for (int i = 0; i<25 ;i++)
        {
            a+=2;
		}
		a=a-a;
        for (int i=26; i<arr.length;i++)
        {
		  shuffled[a]=arr[i];
		  a+=2;
		}
        
       
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int shuffled[] = new int[arr.length];
		for(int k = 0; k<arr.length; k++){
		  while(arr[k]!=0){
		  int j =(int) Math.random()*arr.length;
		  shuffled[k]=arr[j];
		  arr[j]=0;
    } 
    


    public static void main(String[] args) {
        int[] values = [1, 2, 3, 4, 5, 21, 22, 23, 24, 25];
		for (int j = 1; j <= 1; j++) {
            perfectShuffle(values);
            selectionShuffle(values);
        }


    }
}
