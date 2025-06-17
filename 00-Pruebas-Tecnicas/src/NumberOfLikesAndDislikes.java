import java.io.*;

public class NumberOfLikesAndDislikes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String A = br.readLine();
        String P = br.readLine();

        int out_ = count_like_dislike(A, P);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int count_like_dislike(String A, String P) {
        // Write your code here
        int contador = 0;
        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char p = P.charAt(i);

            if (a == p) {
                if (a == '0' || p == '0' || a == '1' || p == '1') {
                    contador += 1;
                }
            }
        }
        return contador;
    }
        /* Try this on the console:
            010101
            101101
         */
}

