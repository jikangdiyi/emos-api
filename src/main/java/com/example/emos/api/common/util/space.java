package com.example.emos.api.common.util;

/**
 * @author: jikang
 * @description:将字符串里面的所有空格替换成%20
 * @date: 2022/3/26 20:48
 * @Modified By:
 */
public class space {
    public String replaceSpace(String s) {
        int n = s.length();
        char[] arr = new char[3*n];

        for(int i = 0;i <n;i++){
            if(s.charAt(i)==' '){
                arr[i++] = '%';
                arr[i++] = '2';
                arr[i++] = '0';
            }else{
                arr[i++] = s.charAt(i+1);
            }
        }
        String res = new String(arr,0,n);
        return res;
    }
}
