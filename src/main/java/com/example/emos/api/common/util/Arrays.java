package com.example.emos.api.common.util;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: jikang
 * @description: 查找数组里重复的元素，数组的元素值在数组下标之间。
 * @date: 2022/3/24 19:07
 * @Modified By:
 */
public class Arrays {
    public static int test(int[] array){
        for(int i = 0;i < array.length;i++){
            while (array[i] != i){
                if(array[i] != i && array[array[i]] != array[i]){
                    int temp = array[i];
                    array[i] = array[temp];
                    array[temp] = temp;
                }else if(array[array[i]] == array[i]){
                    return array[i];
                }
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = {2,1,3,2,0};
        System.out.println(test(array));
    }

    public static int test1(int[] array){
        Set<Integer> set = new HashSet<>();
        for(int num : array){
            if(!set.add(num)){
                return num;
            }
        }
        return -1;
    }
}
