package 剑指offer.其他算法;

public class 丑数 {
    public static void main(String[] args) {

    }

    public int GetUglyNumber_Solution(int index) {

        if(index <= 6) {
            return index;
        }

        int i2 = 0,i3 = 0,i5 = 0;

        int[] res = new int[index];
        res[0] = 1;

        for(int i = 1;i < index;i++) {
            res[i] = Math.min(res[i2] * 2,Math.min(res[i3] * 3,res[i5] * 5));
            if(res[i] == res[i2] * 2) {
                i2++;
            }
            if(res[i] == res[i3] * 3) {
                i3++;
            }
            if(res[i] == res[i5] * 5) {
                i5++;
            }
        }

        return res[index - 1];
    }
}
