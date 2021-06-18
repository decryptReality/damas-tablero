import jdk.nashorn.api.tree.WhileLoopTree;

class Tablero
{
    public static void main(String[] args) 
    {
        Tablero.imprimirFila(5, 3);
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
        int i = 3;
        while(i <= 26)
        {
            if (i / 3 == celda1 | i / 3 == celda2)
            {
                System.out.print(BLACK_BACKGROUND + " " + RED_BACKGROUND + " " + BLUE_BACKGROUND + " " + RESET);
            }
            else
            {
                if(i % 2 != 0) // impar, inicio
                {
                    System.out.print(WHITE_BACKGROUND + "   " + RESET);
                }
                else
                {
                    System.out.print(BLACK_BACKGROUND + "   " + RESET);
                }
            }
            i = i + 3;
        }
        System.out.println();
        i = 3;
        while(i <= 26)
        {
            if (i / 3 == celda1 | i / 3 == celda2)
            System.out.print(RED_BACKGROUND + "   " + RESET);
            i = i + 1;
        }
        System.out.println();
        i = 3;
        while(i <= 26)
        {
            if (i / 3 == celda1 | i / 3 == celda2)
            {
                System.out.print(BLUE_BACKGROUND + " " + RED_BACKGROUND + " " + BLUE_BACKGROUND + " " + RESET);
            }
            else
            {
                if(i % 2 == 0)
                {
                    System.out.print(WHITE_BACKGROUND + "   " + RESET);
                }
                else
                {
                    System.out.print(BLUE_BACKGROUND + "   " + RESET);
                }
            }
            i = i + 3;
        }
        System.out.println();
    }
}