package lesson1;

public class MainClass {
    private int class_number = 20;
    private String class_string = "Hello, world";

    //Задание 1
    public int getLocalNumber () {
        return 14;
    }

    //Задание 2
    public int getClassNumber () {
        return this.class_number;
    }

    //Задание 3
    public String getClassString () {
        return this.class_string;
    }
}
