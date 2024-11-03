package lecture02;

public class Keisan {

    int goukei(int[] num) {
        int x = 0;
        for (int i = 0; i < num.length; i++) {
             x += num[i];
        }
        return x;
    }

    void hyouji(int[] num) {
        int x = goukei(num);
        System.out.println("合計値："+ x);
        if(x >= 100) {
            System.out.println("great!!");
        }
        else if(x >= 50) {
            System.out.println("big");
        }
        else {
            System.out.println("small");
        }
    }
}
