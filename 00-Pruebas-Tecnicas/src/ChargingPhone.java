import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChargingPhone {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {

            String[] strNums = br.readLine().trim().split(" ");
            int initCharge = Integer.parseInt(strNums[0]);
            int finalCharge = Integer.parseInt(strNums[1]);

            int out_ = chargingSmartPhone(initCharge, finalCharge);
            System.out.println(out_);
        }
        wr.close();
        br.close();

    }

   static int chargingSmartPhone(int initCharge, int finalCharge){

       int C = initCharge;
       int minutes = 0;

       while(C < finalCharge){
           int R = getChargingRate(C);
           C += R;
           minutes ++;
       }
       return minutes;
   };
   static int getChargingRate(int C){
       if (C <= 10) return 10;
       else if (C <= 230) return 5;
       else if (C <= 559) return 8;
       else if (C <= 1009) return 2;
       else if (C <= 5000) return 7;
       else if (C <= 10000) return 8;
       else return 3;
   }

   // try this input in console,
    /*
    2
    0 5
    10 50
     */

}
