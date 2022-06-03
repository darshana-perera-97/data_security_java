import java.util.*;

class Caesar_Cipher {

    public static void main(String[] args) {

        //introduction
        System.out.println("Caesar_Cipher Algorithm - Encryption");
        System.out.println("------------------------");
        System.out.println();


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

        // plain text stored to a array
        for (int i = 0; i < txtSize; i++) {
            ptxtarr[i] = ptxt.charAt(i);
        }

        char[] ltrs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };

        // array for plain text in indexes
        int ptxtarrindex[] = new int[txtSize];

        // convert plain text in indexes
        for (int i = 0; i < txtSize; i++) {
            for (int j = 0; j < 25; j++) {
                if (ltrs[j] == ptxtarr[i]) {
                    ptxtarrindex[i] = j;
                }
            }
        }

        // key shifting
        for (int i = 0; i < txtSize; i++) {
            // System.out.println(ptxtarrindex[i]);
            ptxtarrindex[i] = ptxtarrindex[i] + 3;
        }

        //writing the cipherText
        System.out.print("Cipher Text is : ");
        for (int i = 0; i < txtSize; i++) {
            int k= ptxtarrindex[i]%26;
            System.out.print(ltrs[k]);
        }
    }

}
