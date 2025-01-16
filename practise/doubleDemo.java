package com.test.practise;
class Ele {
    void arrry(double d[][]) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print((int) d[i][j] + " ");
            }
            System.out.println();
        }
    }

    public class doubleDemo {
        public static void main(String[] args) {
            Ele e1 = new Ele();
            double d[][] = {{1, 2, 3}, {4, 5, 6}};
            e1.arrry(d);
        }
    }
}
