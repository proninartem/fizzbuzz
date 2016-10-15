package pronin;

import java.util.Scanner; // импортируем класс

public class App {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
          if(sc.nextInt()%3==0 && sc.nextInt()%5==0){
        	  System.out.println("fizzbuzz");
           return;
           } 
         
          else if(sc.nextInt()%5==0){
        	  System.out.println("buzz");
          return;}
          
          else if(sc.nextInt()%3==0){
        	  System.out.println("fizz");
           return;}
         
          else {
          System.out.println("Вы ввели не целое число");
        }
    }
}
}