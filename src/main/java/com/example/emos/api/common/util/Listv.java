package com.example.emos.api.common.util;

/**
 * @author: jikang
 * @description:
 * @date: 2022/3/27 20:35
 * @Modified By:
 */
public class Listv {
    public  int[] reversePrint(ListNode head) {
        //递归
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size ++;
            temp = temp.next;
        }
        int[] arr = new int[size];
        int num = 0;
        res(head,arr,num);
        return arr;


    }

    public  void res(ListNode head,int[] arr,int num){
        if(head == null){
            return;
        }
        num++;
        res(head.next,arr,num);


        arr[(arr.length-num)] = head.val;

    }

    public  static void  main(String[]  args){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        Listv listv = new Listv();
        System.out.println(listv.reversePrint(listNode));
    }

}


class ListNode {
    int val;
    ListNode next;
      ListNode(int x) { val = x; }
  }


