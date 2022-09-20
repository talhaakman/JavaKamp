public class Main {
    public static void main(String[] args) {

        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 5;
        boolean isThere = false;

        for (int sayi : sayilar){
            if (sayi==aranacak){
                isThere =true;
                break;
            }
        }

        if (isThere){
            System.out.println("Sayı mevcuttur");
        }
        else {
            System.out.println("Sayı mevcut değil");
        }
    }
}