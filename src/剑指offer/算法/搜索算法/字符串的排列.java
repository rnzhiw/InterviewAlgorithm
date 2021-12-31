package 剑指offer.算法.搜索算法;

import java.util.*;

public class 字符串的排列 {
    public static void main(String[] args) {

    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<String>();
        if(str!=null && str.length()>0){
            helper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }

    public void helper(char[] chars,int i,ArrayList<String> list) {


        if(i == chars.length - 1) {
            list.add(String.valueOf(chars));
        } else {
            Set<Character> set = new HashSet<>();
            for(int j=i;j<chars.length;++j){
                if(j==i || !set.contains(chars[j])){
                    set.add(chars[j]);
                    swap(chars,i,j);
                    helper(chars,i+1,list);
                    swap(chars,j,i);
                }
            }
        }

    }

    public void swap(char[] cs,int i,int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }



    List<String> res = new ArrayList<>();
    char[] c;
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        String[] result = new String[res.size()];
        for(int i = 0;i < res.size();i++) {
            result[i] = (String)res.get(i);
        }
        return result;
    }

    private void dfs(int x) {
        if(x == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }
        Set<Character> set = new HashSet<>();
        for(int i = x;i < c.length;i++) {
            if(set.contains(c[i])) {
                continue;
            }
            set.add(c[i]);
            swap(i,x);
            dfs(x + 1);
            swap(i,x);
        }
    }

    private void swap(int i,int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
