package lab5_part2; 

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(new Realisation().square1(2, 5, 100)); // ссылка на анонимный класс
        System.out.println();
        System.out.println(Functional.square2(3, 4, 100)); // ссылка на статический метод
        System.out.println();
        System.out.println(new Realisation().square3(0.01, 2, 100)); // ссылка на анонимный класс
        System.out.println();
        Realisation realisation = new Realisation();
        System.out.println(realisation.square4(1, 3, 100)); // ссылка на метод экземпляра
        System.out.println();
        Realisation.Inner inner = realisation.new Inner();
        System.out.println(inner.square5(0.1, 1, 100)); // вызов метода вложенного класса

    }
}
