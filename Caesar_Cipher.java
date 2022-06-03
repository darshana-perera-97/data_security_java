import java.util.*;

class Caesar_Cipher {
    public static void main(String[] args) {
        Caesar_Cipher c = new Caesar_Cipher();
        c.getPlainText();

        
    }

    void getPlainText() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Input the cipher text : ");
        String ptxt = obj.nextLine();
        System.out.println();
        System.out.print("Your cipher text is " + ptxt);
    }
}