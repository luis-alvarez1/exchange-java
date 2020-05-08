import java.util.Scanner;

public class Class {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Señor usurio por favor elija la moneda a compartir");
        System.out.println("1.peso colombiano");
        System.out.println("1.peso venezolano");
        System.out.println("1.peso uruguayo");
        System.out.println("1.peso mexicano");
        System.out.println("1.peso sudafricano");
        System.out.println("1.peso zuiso");

    }
}

class Exchange {

    private static DolarRate dolarRate;

    public static double venezuelanBolivarToDollar(double bolivaresAmount) {

        return dolarRate.venezuelanBolivar * bolivaresAmount;

    }

    public static double colombianPesoToDollar(double pesosAmount) {

        return dolarRate.colombianPeso * pesosAmount;

    }

    public static double uruguayPesoToDollar(double uruguayPeso) {

        return dolarRate.uruguayPeso * uruguayPeso;

    }

    public static double mexicanPesoToDollar(double mexicanPeso) {

        return dolarRate.mexicanPeso * mexicanPeso;

    }

    public static double sudafricanRandToDollar(double sudafricanRand) {

        return dolarRate.sudafricanRand * sudafricanRand;

    }

    public static double suizaFrancoToDollar(double suizaFranco) {

        return dolarRate.suizaFranco * suizaFranco;

    }

}

class DolarRate {
    public static final double venezuelanBolivar = 33081.0357;
    public static final double colombianPeso = 3958.414;
    public static final double uruguayPeso = 42.55;
    public static final double mexicanPeso = 24.4;
    public static final double sudafricanRand = 18.76;
    public static final double suizaFranco = 0.97;
    public static final double hongKongDollar = 7.7527;
    public static final double chinesseYuan = 7.1046519654;
    public static final double polishZloty = 4.2157366;
    public static final double israelShekel = 3.6864960;
    public static final double euro = 0.92626;
    public static final double sterlinPound = 0.809958;

}