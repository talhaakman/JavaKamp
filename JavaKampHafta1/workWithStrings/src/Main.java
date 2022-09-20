public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";

        System.out.println(mesaj);
        System.out.println("mesajın karakter sayısı:  " + mesaj.length());
        System.out.println(mesaj.concat("Yaşasın"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("n"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5, karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); // karakterin hangi indexte olduğunu buluyoruz
        System.out.println(mesaj.replace("güzel","kötü")); //kelime ya da karakter değiştiriyoruz
        System.out.println(mesaj.substring(2)); // İstediğimiz indexten başlatıyoruz
        System.out.println();
    }
}