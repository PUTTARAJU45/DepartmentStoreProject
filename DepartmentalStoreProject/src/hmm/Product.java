package hmm;

public class Product {
private	String name;
private double quantity;
private double cost;
public Product(String name, double quantity, double cost) {
	super();
	this.name = name;
	this.quantity = quantity;
	this.cost = cost;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getQuantity() {
	return quantity;
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Product -->  name : " + name + " quantity : " + quantity + " cost : " + cost;
}


}
