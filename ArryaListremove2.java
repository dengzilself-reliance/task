package ArryayList;

import java.util.ArrayList;

public class ArryaListremove2 {
    public static void main(String[] args) {  //从后到前 遍历  删除
        ArrayList<Integer> list = new ArrayList(); //创建 ArrayList 集合 对象
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(50);
        list.add(77);
        list.add(55);
        list.add(80);
        /**
         * 为什么 list.size() -1  因为 list.size()方法得到的是长度 7
         * 取集合值 是用 下标 取的   下标从 0 开始  长度从 1 开始  所以要 长度-1
         * 为什么  i >= 0   i --
         *  当 i 小于等于 0 时 就代表已经把从后到前的值 都 判断 了一遍
         *  每执行一次for循环 就从 后往前 走一步
         *  i >= 0大于等于0为真   i <= 0 小于等于0为真
         */
        for (int i = list.size() -1 ; i >= 0 ; i --) {
               if (list.get(i) < 80 ){ //当集合下标i的值 小于 80
                   list.remove(i);  // 就删除下标i的值
               }
        }
        System.out.println(list); //打印ArrayList集合 全部的元素
    }
}
