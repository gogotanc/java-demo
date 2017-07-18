package org.tanc.generic;

public class SubNode extends Node<String> {

    public SubNode() {
        super();
    }

    public SubNode(String string) {
        super(string);
    }

    public static void main(String[] args) {

        SubNode subNode = new SubNode("tanc");

        Node<String> node = subNode;

        System.out.println(node.getData());
    }
}
