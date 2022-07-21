package ArryayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Studenttest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();  //创建 ArrayList集合 只能存 自定义 Student类的集合
        list.add(new Student("1", "邓1", 22, "一年级"));
        list.add(new Student("2", "邓2", 15, "一年级"));
        list.add(new Student("3", "邓3", 25, "一年级"));
        list.add(new Student("4", "邓4", 14, "一年级"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("学生编号:" + list.get(i).getStudentid() + "\t" +
                    "学生姓名:" + list.get(i).getName() + "\t" +
                    "学生年龄:" + list.get(i).getAge() + "\t" +
                    "学生班级:" + list.get(i).getGrade());
            System.out.println("---------------");
        }
        Scanner sc = new Scanner(System.in); // 创建 键盘扫描器对象

        while (true) {
            System.out.println("请输入要找的学生ID:");
            String id = sc.next();  //输入要查询的学生ID
            Student s = Studentidseek(list, id); // 调用 查询学生ID 方法  传入 集合 和 id
            if (s == null) {
                System.out.println("没找到");
            } else {
                System.out.println("找到了");
                System.out.println("学生编号:" + s.getStudentid() + "学生姓名:" + s.getName() + "学生年龄:" + s.getAge() + "学生班级:" + s.getGrade());
            }
        }

    }

    /**
     * 根据 传入的id 查找 集合中 是否有 该ID
     *
     * @param list 学生类 集合
     * @param id   查询的id
     * @return 查到返回 对象地址  没找到返回null
     */
    public static Student Studentidseek(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getStudentid())) {   //根据传入的id 查找集合是否有 该ID
                return list.get(i);             // 有就返回 对象 地址
            }
        }
        return null;  //没找到就返回 null

    }


}
