package edu.yuwen.java.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 * LinkedHashMap 也是通过散列表和链表组合在一起实现的。 
   *   实际上，它不仅支持按照插入顺序遍历数据，还支持按照访问顺序来遍历数据。
   *   按照访问时间排序的 LinkedHashMap 本身就是一个支持 LRU 缓存淘汰策略的缓存系统
  *   实际上，LinkedHashMap 是通过双向链表和散列表这两种数据结构组合实现的。
 * LinkedHashMap 中的“Linked”实际上是指的是双向链表，并非指用链表法解决散列冲突。
 *
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        asInsertOrder();
        asOperateOrder();
    }

    // 按照插入顺序遍历数据
    private static void asOperateOrder() {
        // 10是初始大小，0.75是装载因子，true是表示按照访问时间排序
        HashMap<Integer, Integer> m = new LinkedHashMap<>(10, 0.75f, true);
        m.put(3, 11);
        m.put(1, 12);
        m.put(5, 23);
        m.put(2, 22);

        m.put(3, 26);
        m.get(5);

        for (Entry<Integer, Integer> e : m.entrySet()) {
            System.out.println(e.getKey());
        }
    }

    // 按照访问顺序来遍历数据
    private static void asInsertOrder() {
        HashMap<Integer, Integer> m = new LinkedHashMap<>();
        m.put(3, 11);
        m.put(1, 12);
        m.put(5, 23);
        m.put(2, 22);

        for (Entry<Integer, Integer> e : m.entrySet()) {
            System.out.println(e.getKey());
        }
    }

}
