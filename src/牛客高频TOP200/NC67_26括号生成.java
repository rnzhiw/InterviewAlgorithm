package 牛客高频TOP200;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class NC67_26括号生成 {
    public static void main(String[] args) {

    }

    public ArrayList<String> generateParenthesis (int n) {
        ArrayList<String> res = new ArrayList<>();
        back("",0,0,n,res);
        return res;
    }

    public void back(String s,int l,int r,int n,ArrayList<String> res) {
        if(l > n ||  r > n || r > l) {
            return;
        }
        if(s.length() == 2 * n) {
            res.add(s);
            return;
        }
        back(s + "(",l + 1,r,n,res);
        back(s + ")",l,r + 1,n,res);
    }
}
