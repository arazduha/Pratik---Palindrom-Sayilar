public class PatikaDev {
    static  boolean isPalindrom(int number){
        int temp = number, reverseN = 0, lastN;
        while (temp != 0){
            lastN = temp % 10;
            reverseN = (reverseN * 10) + lastN;
            temp /= 10;
        }
        if (number == reverseN){
            System.out.print("Sayi Palindromdur. ");
            return true;
        }else {
            System.out.print("Sayi Palindrom degildir. ");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4));
    }
}

