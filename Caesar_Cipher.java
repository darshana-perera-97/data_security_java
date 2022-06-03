import java.util.*;

class Caesar_Cipher {

    

    public static void main(String[] args) {

        

        // get the plain text
        Scanner obj = new Scanner(System.in);
        System.out.print("Input the cipher text : ");
        String ptxt = obj.nextLine();
        System.out.println();

        // display plaintext
        System.out.print("Your cipher text is " + ptxt);

        //get text size
        int txtSize = ptxt.length();
        System.out.println(txtSize);
    }

}
