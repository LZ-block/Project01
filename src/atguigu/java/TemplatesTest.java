package atguigu.java;

import java.util.ArrayList;

/**
 * @author PeterLi
 * @date 2022/7/17 - 1:42
 */
public class TemplatesTest {
    //自定义模板

    /** pric
     * 客户id
     */
     private int id;

     /** prsc
      * 客户的姓名
      */
      private String name;




    public static void main(String[] args) {
        String[] arr = new String[]{"Tom","Jerry","Hanmeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("************************");


        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("************************");

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        System.out.println("************************");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }

    }

    public void method(int name,String age){
        System.out.println("TemplatesTest.method");
        System.out.println("name = [" + name + "], age = [" + age + "]");

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);


    }

    public void testUpdate(){


    }
}
