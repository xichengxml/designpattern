package com.xicheng.designpattern.p07_observer;
/**
* @description
* @author xichengxml
* @date 2021-04-11 16:39:49
*/
public class ListTest {

    public static void main(String[] args) {
        // 头结点
        Node<String> root = new Node<>();
        // 头插法
        Node<String> newNode = new Node<>("newNode", root);
        // 尾插法
        root.next = new Node<>("newNode", null);
    }

    static class Node<T> {

        private T value;

        private Node<T> next;

        public Node() {
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
