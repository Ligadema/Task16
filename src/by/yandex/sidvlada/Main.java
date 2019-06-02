package by.yandex.sidvlada;

class Main {
    public static void main(String[] args) {

        int array[] = new int[5];
        System.out.print("The array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.toIntExact(Math.round(100 * Math.random()));
            System.out.print(array[i] + " ");
        }

        System.out.print("\nThe mirror array: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

