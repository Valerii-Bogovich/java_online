package by.epam.jonline.basics_of_oop.task2;

/*Создать класс Payment с внутренним классом, с 
помощью объектов которого можно сформировать 
покупку из нескольких товаров.*/

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment(1, 100.0);
		Payment.Product product1 = payment.new Product("Молоко", 5.0, 1);
		Payment.Product product2 = payment.new Product("Хлеб", 8.0, 1);
		Payment.Product product3 = payment.new Product("Яйца", 1.0, 10);
		
		View.printInformationAboutBalance(payment.buySeveralGoods(product1, product2, product3));


	}

}
