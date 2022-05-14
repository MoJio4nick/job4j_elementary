package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] func = new int[5];
        for (int index = 0; index < func.length; index++) {
            func[index] =   index * 2 + 3;
        }
            for (int funcs : func) {
                System.out.println(funcs);
        }
    }
}
