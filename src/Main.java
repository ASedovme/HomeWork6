public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 6");

//Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }
//Задача 2
        System.out.println("Задача 2");
        for (int a = 10; a >=1; a--){
            System.out.println(a);
        }
//Задача 3
        System.out.println("Задача 3");
        for (int b = 0; b<=17; b=b+2){
            System.out.println(b);
        }
//Задача 4
        System.out.println("Задача 4");
        for (int c = 10; c >= -10; c--){
            System.out.println(c);
        }
//Задача 5
        System.out.println("Задача 5");
        for (int d = 1904; d <= 2096; d = d +4){
            System.out.println(d + " год является высокосным");
        }
//Задача 6
        System.out.println("Задача 6");
        for (int e = 7; e <= 98; e = e+7){
            System.out.println(e);
        }
//Задача 7
        System.out.println("Задача 7");
        for (int f = 1; f <= 512; f = f * 2){
            System.out.println(f);
        }
//Задача 8
        System.out.println("Задача 8");
        int g = 0;
        int h = 29000;
        for (int m = 1; m <= 12; m++ ){
            g = g + h;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + g + " рублей");
        }
//Задача 9
        System.out.println("Задача 9");
        g = 0;
        for (int m = 1; m <= 12; m++ ){
            g = g + h + (g/100)*12/12;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + g + " рублей");
        }
//Задача 10
        System.out.println("Задача 10");
        int p = 2;
        int x = p;
        for ( int z = 1; z<=10; z++){
            x = p * z;
            System.out.println(p + "*" + z + "=" + x);
        }
    }}
