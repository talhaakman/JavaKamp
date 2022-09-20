public class Main {
    public static void main(String[] args) {
        //220-284
        int number =220;
        int number2 = 294;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i=1; i<number; i++) {
            if (number % i == 0){
                toplam1 = toplam1 + i;
            }
        }

        for (int i = 1; i<number2; i++) {
            if (number2 % i == 0){
                toplam2 = toplam2 + i;
            }
        }

        if (number == toplam2 && number2 == toplam1) {
            System.out.println("Bu iki sayı arkadaştır");
        }else {
            System.out.println("Bu iki sayı arkadaş değildir");
        }
    }
}