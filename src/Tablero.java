
class Tablero
{
    public static void main(String[] args) 
    {
        Tablero.imprimirFila(1, 8);
    }

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    static void imprimirFila(int celda1, int celda2) // [1,8]
    {
        String colorRESET = "\033[0m";
        String colorPAR = "\033[46m";
        String colorNoPAR = "\033[47m";
        String colorFichaA = "\033[41m";

        // fila A
        int i = 3;
        while(i <= 26)
        {
            if (i / 3 == celda1 | i / 3 == celda2)
            {
                String colorTEMPORAL = "";
                if(i % 2 != 0) // SI es NoPar, hacer
                {
                    colorTEMPORAL = colorNoPAR;
                }
                else
                {
                    colorTEMPORAL = colorPAR;
                }
                System.out.print(colorTEMPORAL + " " + colorFichaA + " " + colorTEMPORAL + " " + colorRESET);
            }
            else
            {
                if(i % 2 != 0) // SI no es par, o sea, impar, entonces es blanco superior izquierda: blanco
                {
                    System.out.print(colorNoPAR + "   " + colorRESET);
                }
                else
                {
                    System.out.print(colorPAR + "   " + colorRESET);
                }
            }
            i = i + 3;
        }
        System.out.println();

        // fila B
        i = 3;
        while(i <= 26)
        {
            if (i / 3 == celda1 | i / 3 == celda2)
            {
                System.out.print(colorFichaA + "   " + colorRESET);
            }
            else
            {
                if(i % 2 != 0)
                {
                    System.out.print(colorNoPAR + "   " + colorRESET);
                }
                else
                {
                    System.out.print(colorPAR + "   " + colorRESET);
                }
            }
            i = i + 3;
        }
        System.out.println();

        // fila C
        i = 3;
        while(i <= 26)
        {
            if (i / 3 == celda1 | i / 3 == celda2)
            {
                String colorTEMPORAL = "";
                if(i % 2 != 0) // SI es NoPar, hacer
                {
                    colorTEMPORAL = colorNoPAR;
                }
                else
                {
                    colorTEMPORAL = colorPAR;
                }
                System.out.print(colorTEMPORAL + " " + colorFichaA + " " + colorTEMPORAL + " " + colorRESET);
            }
            else
            {
                if(i % 2 != 0) // SI no es par, o sea, impar, entonces es blanco superior izquierda: blanco
                {
                    System.out.print(colorNoPAR + "   " + colorRESET);
                }
                else
                {
                    System.out.print(colorPAR + "   " + colorRESET);
                }
            }
            i = i + 3;
        }
        System.out.println();

    }
}