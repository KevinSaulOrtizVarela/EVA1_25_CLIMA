
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Principal {

    public static void main(String[] args) {
        double[][] ArreInf = new double[12][10];
        ArreInf[0][0] = 30.0;
        ArreInf[0][1] = 18.1;
        ArreInf[0][2] = 10.1;
        ArreInf[0][3] = 2.0;
        ArreInf[0][4] = -12.8;
        ArreInf[0][5] = 9.9;
        ArreInf[0][6] = 2.5;
        ArreInf[0][7] = 0.30;
        ArreInf[0][8] = 55;
        ArreInf[0][9] = 185;

        ArreInf[1][0] = 32.0;
        ArreInf[1][1] = 21.2;
        ArreInf[1][2] = 12.9;
        ArreInf[1][3] = 4.5;
        ArreInf[1][4] = -18.0;
        ArreInf[1][5] = 3.7;
        ArreInf[1][6] = 1.6;
        ArreInf[1][7] = 0.18;
        ArreInf[1][8] = 49;
        ArreInf[1][9] = 204;

        ArreInf[2][0] = 34.0;
        ArreInf[2][1] = 24.2;
        ArreInf[2][2] = 15.7;
        ArreInf[2][3] = 7.1;
        ArreInf[2][4] = -5.8;
        ArreInf[2][5] = 7.7;
        ArreInf[2][6] = 1.5;
        ArreInf[2][7] = 0.09;
        ArreInf[2][8] = 39;
        ArreInf[2][9] = 254;

        ArreInf[3][0] = 38.8;
        ArreInf[3][1] = 27.9;
        ArreInf[3][2] = 19.2;
        ArreInf[3][3] = 10.4;
        ArreInf[3][4] = -3.4;
        ArreInf[3][5] = 12.9;
        ArreInf[3][6] = 2.5;
        ArreInf[3][7] = 0.09;
        ArreInf[3][8] = 37;
        ArreInf[3][9] = 278;

        ArreInf[4][0] = 39.6;
        ArreInf[4][1] = 32.2;
        ArreInf[4][2] = 23.6;
        ArreInf[4][3] = 14.9;
        ArreInf[4][4] = 3.8;
        ArreInf[4][5] = 26.1;
        ArreInf[4][6] = 4.0;
        ArreInf[4][7] = 0.00;
        ArreInf[4][8] = 37;
        ArreInf[4][9] = 299;

        ArreInf[5][0] = 41.4;
        ArreInf[5][1] = 34.0;
        ArreInf[5][2] = 26.3;
        ArreInf[5][3] = 18.6;
        ArreInf[5][4] = 6.1;
        ArreInf[5][5] = 34.7;
        ArreInf[5][6] = 6.7;
        ArreInf[5][7] = 0.00;
        ArreInf[5][8] = 42;
        ArreInf[5][9] = 273;

        ArreInf[6][0] = 41.6;
        ArreInf[6][1] = 32.1;
        ArreInf[6][2] = 25.6;
        ArreInf[6][3] = 19.1;
        ArreInf[6][4] = 10.6;
        ArreInf[6][5] = 49.7;
        ArreInf[6][6] = 11.4;
        ArreInf[6][7] = 0.00;
        ArreInf[6][8] = 53;
        ArreInf[6][9] = 240;

        ArreInf[7][0] = 39.2;
        ArreInf[7][1] = 30.3;
        ArreInf[7][2] = 24.3;
        ArreInf[7][3] = 18.2;
        ArreInf[7][4] = 10.0;
        ArreInf[7][5] = 89.3;
        ArreInf[7][6] = 12.0;
        ArreInf[7][7] = 0.00;
        ArreInf[7][8] = 61;
        ArreInf[7][9] = 242;

        ArreInf[8][0] = 39.0;
        ArreInf[8][1] = 29.2;
        ArreInf[8][2] = 22.6;
        ArreInf[8][3] = 16.0;
        ArreInf[8][4] = 3.7;
        ArreInf[8][5] = 66.4;
        ArreInf[8][6] = 8.0;
        ArreInf[8][7] = 0.00;
        ArreInf[8][8] = 61;
        ArreInf[8][9] = 229;

        ArreInf[9][0] = 35.0;
        ArreInf[9][1] = 26.8;
        ArreInf[9][2] = 18.7;
        ArreInf[9][3] = 10.7;
        ArreInf[9][4] = -2.4;
        ArreInf[9][5] = 21.6;
        ArreInf[9][6] = 4.0;
        ArreInf[9][7] = 0.00;
        ArreInf[9][8] = 56;
        ArreInf[9][9] = 238;

        ArreInf[10][0] = 34.6;
        ArreInf[10][1] = 21.9;
        ArreInf[10][2] = 13.7;
        ArreInf[10][3] = 5.5;
        ArreInf[10][4] = -6.1;
        ArreInf[10][5] = 8.7;
        ArreInf[10][6] = 2.0;
        ArreInf[10][7] = 0.50;
        ArreInf[10][8] = 55;
        ArreInf[10][9] = 191;

        ArreInf[11][0] = 29.0;
        ArreInf[11][1] = 18.2;
        ArreInf[11][2] = 10.3;
        ArreInf[11][3] = 2.4;
        ArreInf[11][4] = -11.5;
        ArreInf[11][5] = 9.9;
        ArreInf[11][6] = 2.3;
        ArreInf[11][7] = 0.88;
        ArreInf[11][8] = 57;
        ArreInf[11][9] = 174;

        for (int i = 0; i < ArreInf.length; i++) {
            for (int j = 0; j < ArreInf[i].length; j++) {
                System.out.print("[ " + ArreInf[i][j] + "] ");
            }
            System.out.println("");
        }
        Scanner sC = new Scanner(System.in);
        System.out.println("¿Que quieres saber? :\n"
                + "1. Alto registro ºC (ºF) 2. Promedio alto ºC (ºF) 3. Media diaria ºC (ºF)\n"
                + "4. Promedio bajo ºC (ºF) 5. Registro bajo ºC (ºF) 6. Promedio de precipitación mm (Pulgadas)\n"
                + "7. Dias promedio de precipitación (>= 0.1 mm) 8. Promedio de dias cubiertos de nieve \n"
                + "9. Media de humedad relativa (%) 10.Promedio de horas mensuales de sol");
        int j = sC.nextInt() - 1;

        System.out.println("¿De que mes quieres la información? :\n"
                + "1. Enero 2. Febrero 3. Marzo 4. Abril  \n"
                + "5. Mayo 6. Junio 7. Julio 8. Agosto\n"
                + "9. Septiembre 10. Octubre 11. Noviembre 12. Diciembre");
        int i = sC.nextInt() - 1;

        switch (j) {
            case 0:
                System.out.println("El alto registro en ºC del mes es: " + ArreInf[i][j] + " ºC");
                break;
            case 1:
                System.out.println("El promedio alto en ºC del mes es: " + ArreInf[i][j] + " ºC");
                break;
            case 2:
                System.out.println("La media diara en ºC del mes es: " + ArreInf[i][j] + " ºC");
                break;
            case 3:
                System.out.println("El promedio bajo en ºC del mes es: " + ArreInf[i][j] + " ºC");
                break;
            case 4:
                System.out.println("El registro bajo en ºC del mes es: " + ArreInf[i][j] + " ºC");
                break;
            case 5:
                System.out.println("El promedio de precipitación en  mm del mes es: " + ArreInf[i][j] + " mm");
                break;
            case 6:
                System.out.println("Los dias promedio de precipitación (>= 0.1 mm) del mes es " + ArreInf[i][j] + " Dias");
                break;
            case 7:
                System.out.println("El promedio de dias cubiertos de nieve del mes es: " + ArreInf[i][j] + " %");
                break;
            case 8:
                System.out.println("La  media de humedad relativa (%) del mes es " + ArreInf[i][j] + " %");
                break;
            case 9:
                System.out.println("El promedio de horas mensuales de sol  es: " + ArreInf[i][j] + " Horas");
                break;
            default:
                System.out.println("No ingresaste ninguna opción");
        }

    }

}
