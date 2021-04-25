package by.epam.jonline.basics_of_oop.task5.main;

import by.epam.jonline.basics_of_oop.task5.logic.Logic;
import by.epam.jonline.basics_of_oop.task5.view.View;
import by.epam.jonline.basics_of_oop.task5.entity.FlowerComposition;
import by.epam.jonline.basics_of_oop.task5.entity.FlowerFactory;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции (объект, представляющий 
собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.*/

public class Main {

	public static void main(String[] args) {
		FlowerFactory flowerFactory = new FlowerFactory();
		Logic logic = new Logic();
		View view = new View();
		FlowerComposition flComp = logic.makeFlowerComposition("Clove", "Rose", "Rose", "Tulip");
		view.printFlowerComposition(flComp);

	}

}
