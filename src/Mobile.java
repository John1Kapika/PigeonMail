import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.text.MaskFormatter;
public class Mobile {
    public static String mobile;
    //public static int newmobile;

    public static void standartMob() {
        //DecimalFormat mb = new DecimalFormat("+7(###)###-##-##");
        mobile = mobile.replaceAll("[^\\p{N}]+", "");
       // Scanner sc = new Scanner(mobile);
       // newmobile = sc.nextInt();
       // mobile = mb.format(newmobile);
        //while (true){
        //    if (mobile.length() == 11) {
        //        switch (mobile.charAt(0)){
        //            case (8):
        //                break;
        //            case (7):
        //                StringBuilder sb = new StringBuilder(mobile);

                        // заменить символ в указанной позиции
        //               sb.setCharAt(0, Character.highSurrogate(8));
        //                mobile = sb.toString();
        //        }
        //     } else{
        //        System.out.println("Неверный формат");
        //   }
       // }
    }
}