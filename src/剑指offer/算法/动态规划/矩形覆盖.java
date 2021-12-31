package 剑指offer.算法.动态规划;

public class 矩形覆盖 {
    public static void main(String[] args) {

    }

    public int rectCover1(int target) {
        if(target < 1){
            return 0;
        }else if(target <= 2){
            return target;
        }else{
            return rectCover1(target-1) + rectCover1(target-2);//
        }
    }
}
