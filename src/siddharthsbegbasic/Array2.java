
package siddharthsbegbasic;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, max;
        int[] myArray = new int[1000];
        System.out.println("Enter the number of elements in array : ");
        num = scn.nextInt();
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<num;i++){
            myArray[i] = scn.nextInt();
        }
        max = myArray[0];
        for(int i=0;i<num;i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("The max value is : "+max);
    }
}
