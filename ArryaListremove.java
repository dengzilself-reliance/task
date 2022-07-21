package ArryayList;

import java.util.ArrayList;

public class ArryaListremove {
    public static void main(String[] args) { //遍历ArrayList集合 删除小于80的分数  从前 开始遍历
        ArrayList<Integer> list = new ArrayList();  //创建 ArrayList集合的对象
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);
        for (int i = 0; i < list.size(); i++) {  //用ArrayList集合中的 size方法 得到集合的个数
            if (list.get(i) < 80){  //用ArrayList集合中的 get 方法 得到 下标 i 的值
                list.remove(i);    // 然后 判断 是否 小于 80  小于 就用remove 方法 删除 下标 i 的 值
                i -- ;          // 删除成功后 要往后一步 不然 i + 1 的下标 没有判断 忽略了
                                 // 假设 79 60 30 50   删除 下标 1 的值 然后下标2 的值 变成 下标 1 30
                                 // 下标 0  1  2  3        下一轮遍历 i 是 2
            }
        }
        System.out.println(list); // 打印 ArrayList 集合 中的 全部值
    }
}
