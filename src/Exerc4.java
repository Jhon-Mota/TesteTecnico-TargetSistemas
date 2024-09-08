public class Exerc4 {
    public static void main(String[] args) {
        
        //OBS.: a lógica do exercício também está na parte de condição e no incremento do for.

        //A)
        System.out.println("A)");
        for (int i = 1; i <= 7+2 ; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        //B)
        System.out.println("B)");
        for(int i = 2; i <= 64*2; i += i) {
            System.out.println(i);
        }

        System.out.println( );

        //C)
        System.out.println("C)");

        int[] cValues = new int[8];
        cValues[0] = 0;
        cValues[1] = 1;
        cValues[2] = 4;
        cValues[3] = 9;
        cValues[4] = 16;
        cValues[5] = 25;
        cValues[6] = 36;

        //Diferença entre os valores.
        int difference = 1;
        for (int i = 0; i < 6; i++) {
            difference += 2;
        }

        cValues[7] = cValues[6] + difference;
        
        for (int elements : cValues) {
            System.out.println(elements);
        }
        System.out.println("Valor do último número: " + cValues[7]);

        System.out.println();

        System.out.println("D)");
        //D)
        for(int i = 2; i <= 10; i += 2) {
            System.out.println(Math.pow(i, 2));
        }
        
        System.out.println();

        System.out.println("E)");
        //E)
        int[] sequence = new int[7];
        sequence[0] = 1;
        sequence[1] = 1;

        for(int i = 2; i < 7; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
            System.out.println(sequence[i]);
        }

        System.out.println();

        System.out.println("F");
        //F)

        //Os números informados sempre começam com D.
        int[] sequenceD = {2, 10, 12, 16, 17, 18, 19, 200};

        for (int i : sequenceD) {
            System.out.println(i);
        }
        
        
        
    }
}
