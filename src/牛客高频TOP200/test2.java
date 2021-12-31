package 牛客高频TOP200;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class test2 implements test1{
    @Override
    public void test3() {
        test1.test123();
    }

    public static void main(String[] args) {
        short s = 1;
        s = (short) (s + 1);
        Integer s1 = 1;
        Integer s2 = new Integer(2);
        System.out.println(s1.equals(s2));
        boolean a = true;
        test3(a);
        System.out.println(a);
    }

    public static<T extends Serializable> T clone(T obj) throws Exception {
        //序列化:将obj对象的内容进行流化，转化为字节序列写到内存的字节数组中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        //反序列化:读取内存中字节数组的内容，重新转换为java对象返回
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (T) ois.readObject();
    }

    public static void test3(boolean a) {
        a = false;
    }
}
