package ArryayList;

import java.util.ArrayList;

public class Movietnest {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList(); //创建 电影类 ArrayList集合  自定义类集合
        list.add(new Movie("背影",19.9,"朱自清")); //创建三个电影类
        list.add(new Movie("背影2",15.5,"朱自清2"));//把对象地址给ArrayList集合
        list.add(new Movie("背影3",19,"朱自清3"));
        for (int i = 0; i < list.size(); i++) {  //用size方法 获取 集合的长度
            System.out.println("电影名:" +list.get(i).getName()); // 通过 集合中存的地址 调用电影类的get方法
            System.out.println("电影评分:" +list.get(i).getScore()); // 得到 电影属性
            System.out.println("电影演员:" +list.get(i).getActor());
            System.out.println("--------------------");
        }
    }
}
