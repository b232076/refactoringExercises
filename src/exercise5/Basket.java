package exercise5;

public class Basket {

	// ..
	float getTotalPrice(Item i) { //O parâmetro é apenas um item, sendo característica apenas da classe item 
		float price = i.getPrice() + i.getTax();
		if (i.isOnSale())
			price = price - i.getSaleDiscount() * price;
		return price;
	}
}
