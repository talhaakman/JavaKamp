public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Sesli İnce Harf");
            break;
            default:
            System.out.println("Geçersiz eleman Girdiniz");
        }
    }
}