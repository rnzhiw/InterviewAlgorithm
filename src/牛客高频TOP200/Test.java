package 牛客高频TOP200;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: rnzhiw
 * @Description:
 */
public class Test extends Person {

    public static void main(String[] args) throws CloneNotSupportedException {


        Person person1 = new Person();
        person1.setId(1);
        person1.setName("111");

        Person person2 = (Person) person1.clone();
        person2.setId(2);
        person2.setName("222");

//        swap(person1,person2);

        System.out.println(person1);
        System.out.println(person2);

        String s1 = "123";
        String s2 = s1;
        s2 = "123123";
        System.out.println(s1);
        System.out.println(s2);


//        int a = 1;
//        int b = a;
//        b = 2;
//        System.out.println(a);
//        System.out.println(b);
    }

    public static void swap(Person person1,Person person2) {
        Person temp = person1;
        person1 = person2;
        person2 = temp;
        System.out.println("交换1" + person1);
        System.out.println("交换2" + person2);

    }
}
