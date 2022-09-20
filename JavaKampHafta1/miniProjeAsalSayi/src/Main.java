public class Main {
    public static void main(String[] args) {

        //int number = 3;
        //int remainder = number % 2;
        //
        //if (remainder == 1 && number == 2) {
        //    System.out.println("Bu sayı asaldır");
        //}
        //
        //else if (remainder != 1  number == 2) {
        //    System.out.println("Bu sayı asal değildir");
        //}
        //else {
        //    System.out.println("Geçersiz Bir sayı");
        //}

           int number = 2;
           int remainder = number %2;
           boolean isPrime = true;
           if (number==1){
               System.out.println("Sayı asal değildir");
           }

           if (number<1){
               System.out.println("Geçersiz Sayı");
           }

           for (int i=2; i<number; i++){
               if (number % i == 0) {
                   isPrime = false;
               }
           }
           if (isPrime) {
               System.out.println("Sayı asaldır");
           }
           else {System.out.println("Sayı Asal değildir");}
    }
}