import java.util.*;

class Caesar_Cipher {

    public static void main(String[] args) {

        // get the plain text
        Scanner obj = new Scanner(System.in);
        System.out.print("Input the cipher text : ");
        String ptxt = obj.nextLine();
        System.out.println();

        // display plaintext
        System.out.println("Your cipher text is " + ptxt);

        // get text size
        int txtSize = ptxt.length();
        System.out.println("Text size : " + txtSize);

        // array for plain text
        char ptxtarr[] = new char[txtSize];

        for (int i = 0; i < txtSize; i++) {
            ptxtarr[i] = ptxt.charAt(i);
        }
        for (int i = 0; i < txtSize; i++) {
            System.out.println(ptxtarr[i]);
        }

    }

}
