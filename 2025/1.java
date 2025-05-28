//import java.util.*;
//public class CustomSequence1{
//    public static void main(String[] args) {
//        Scanner give = new Scanner(System.in); // creat the scanner object
//        System.out.println("Which term would you like to know?");
//
//        //using our scanner take input
//        int n = give.nextInt();
//
//        // instead of this close the scanner:
//        give.close();
//
//        System.out.println("The term is: " + cusSequence(n));
//
//
//        //System.out.println("The first n terms are: ");
//
//    }
//
//    public static int cusSequence(int n){
//        if (n == 1 || n == 2){
//            return 1;
//        } else if (n == 3){
//            return 2;
//           // return (cusSequence(n-2) * cusSequence(n-1) );
//
//        } else if (n >= 4){
//            return cusSequence(n-2) * cusSequence(n-1) ;
//        } else{
//            return 1;
//        }
//
//    }
//
//}