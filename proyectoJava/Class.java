
import java.util.Scanner;

public class Class {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Señor usuario por favor digite el número de la moneda a convertir");
        System.out.println("1 = Peso colombiano");
        System.out.println("2 = Bolivar venezguayo");
        System.out.println("4 = Peso mex Kong");
        System.out.println("8 = Yuan ");
        System.out.println("5 = Euro");
        System.out.println("6 = Libra esterlina");

        final Integer opc_money = sc.nextInt();

        System.out.println("Ingrese la cantidad de divisa");
        double quantity = sc.nextDouble();

        switch (opc_money) {
            case 1:
                System.out.println(Exchange.colombianPesoToDollar(quantity));
                break;
            case 2:
                System.out.println(Exchange.venezuelanBolivarToDollar(quantity));
                break;
            case 3:
                System.out.println(Exchange.mexicanPesoToDollar(quantity));
                break;
            case 4:
                System.out.println(Exchange.mexicanPesoToDollar(quantity));
                break;
            case 5:
                System.out.println(Exchange.chinesseYuanToDollar(quantity));
                break;
        }
        sc.close();
    }
}

class Exchange {

    public static double venezuelanBolivarToDollar(double bolivaresAmount) {

        return DolarRate.venezuelanBolivar * bolivaresAmount;

    }

    public static double colombianPesoToDollar(double pesosAmount) {

        return DolarRate.colombianPeso * pesosAmount;

    }

    public static double mexicanPesoToDollar(double mexicanPeso) {

        return DolarRate.mexicanPeso * mexicanPeso;

    }

    public static double chinesseYuanToDollar(double chinesseYuan) {

        return DolarRate.chinesseYuan * chinesseYuan;

    }

    public static double euroToDollar(double euro) {

        return DolarRate.euro * euro;

    }

    public static double sterlinPoundToDollar(double sterlinPound) {

        return DolarRate.sterlinPound * sterlinPound;

    }
}

class DolarRate {
    public static final double venezuelanBolivar = 33081.0357;
    public static final double colombianPeso = 3958.414;
    public static final double mexicanPeso = 24.4;
    public static final double chinesseYuan = 7.1046519654;
    public static final double euro = 0.92626;
    public static final double sterlinPound = 0.809958;

}