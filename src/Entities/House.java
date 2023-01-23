package Entities;

public class House {
	private int price;
	private int squareMeter;
	private int rooms;
	private int halls;

	public House(int price, int squareMeter, int rooms, int halls) {
		this.price = price;
		this.squareMeter = squareMeter;
		this.rooms = rooms;
		this.halls = halls;
	}

	public int getPrice() {
		return price;
	}

	public int getSquareMeter() {
		return squareMeter;
	}

	public int getRooms() {
		return rooms;
	}

	public int getHalls() {
		return halls;
	}

	@Override
	public String toString() {
		return "House [price=" + price + "$, squareMeter=" + squareMeter + ", rooms=" + rooms + ", halls=" + halls
				+ "]\n";
	}
}
