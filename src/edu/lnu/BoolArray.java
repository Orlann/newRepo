package edu.lnu;

public class BoolArray {
    public BoolArray() {
    }

    public static void aMethod() throws Exception {
        try {
            throw new Exception();
        } finally {
            System.out.print("finally ");
        }
    }

    public static void main(String[] args) {
        try {
            aMethod();
        } catch (Exception var2) {
            System.out.print("exception ");
        }

        System.out.print("finished");
    }
}