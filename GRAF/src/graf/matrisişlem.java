package graf;

public class matrisişlem {

    int kenar[][];
    int n;
int tersm[][];
    public matrisişlem(int n) {

        this.n = n;
        this.kenar = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                kenar[i][j] = 0;
            }
        }

    }

    void kenarekle(int baş, int son) {
        kenar[baş][son] = 1;
    }

    void matrisgöster(int kenar[][]) {
        for (int i = 0; i <n; i++) {
            System.out.print(i + " =>");
            for (int j = 0; j <n; j++) {
                System.out.print(kenar[i][j] + " ");
            }
            System.out.println("");
        }

    }

    void kenargöster() {
        for (int i = 0; i < n; i++) {
            System.out.println(i + "");
            for (int j = 0; j < n; j++) {
                if (kenar[i][j] == 1) {
                    System.out.println("=>" + j);
                }
            }

        }

    }

    void tersmatris() {
        tersm= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tersm[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (kenar[i][j] == 1) {
                    tersm[j][i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        matrisişlem m = new matrisişlem(4);
        m.matrisgöster(m.kenar);
        System.out.println("");
        m.kenarekle(3, 1);
        m.kenarekle(2, 2);
        m.matrisgöster(m.kenar);
        System.out.println("");
        m.tersmatris();
    m.matrisgöster(m.tersm);
      

    }
}
