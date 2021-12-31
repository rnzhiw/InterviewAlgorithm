package 剑指offer.队列和栈;

public class 翻转单词序列 {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        // 删除首尾空格，分割字符串
        String[] strs = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        // 倒序遍历单词列表
        for(int i = strs.length - 1; i >= 0; i--) {
            if(strs[i].equals("")) {
                // 遇到空单词则跳过
                continue;
            }
            // 将单词拼接至 StringBuilder
            res.append(strs[i] + " ");
        }
        // 转化为字符串，删除尾部空格，并返回
        return res.toString().trim();
    }
}
