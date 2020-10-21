package com.example.edu;

import java.util.HashMap;

/**
 * @ProjectName: edu
 * @PackageName: com.example.edu
 * @ClassName: Test
 * @Date: 2020年05月26日 20:42
 * @Author: zhanggeyang
 * @Description:
 **/

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(i,String.valueOf(i));
            map.remove(i-1);
        }
        System.out.println(map.size());
    }
}
