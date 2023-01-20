import java.util.ArrayList;
import java.util.List;

class House {
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

class Villa extends House {
	public Villa(int price, int squareMeter, int rooms, int halls) {
		super(price, squareMeter, rooms, halls);
	}
}

class SummerHouse extends House {
	public SummerHouse(int price, int squareMeter, int rooms, int halls) {
		super(price, squareMeter, rooms, halls);
	}
}

class ServiceClass {
	private List<House> houses;
	private List<Villa> villas;
	private List<SummerHouse> summerHouses;

	public ServiceClass() {
		houses = new ArrayList<House>();
		villas = new ArrayList<Villa>();
		summerHouses = new ArrayList<SummerHouse>();

		houses.add(new House(100000, 100, 2, 1));
		houses.add(new House(200000, 200, 3, 2));
		houses.add(new House(300000, 300, 4, 3));

		villas.add(new Villa(400000, 400, 5, 4));
		villas.add(new Villa(500000, 500, 6, 5));
		villas.add(new Villa(600000, 600, 7, 6));

		summerHouses.add(new SummerHouse(600000, 600, 5, 4));
		summerHouses.add(new SummerHouse(800000, 800, 8, 5));
		summerHouses.add(new SummerHouse(900000, 900, 7, 3));
	}

	public List<House> getHouseList() {
		return houses;
	}

	public List<Villa> getVillaList() {
		return villas;
	}

	public List<SummerHouse> getSummerHouseList() {
		return summerHouses;
	}

	public int getTotalHousePrice() {

		int total = 0;

		for (int i = 0; i < houses.size(); i++) {
			total += houses.get(i).getPrice();
		}

		return total;
	}

	public int getTotalVillaPrice() {

		int total = 0;

		for (int i = 0; i < villas.size(); i++) {
			total += villas.get(i).getPrice();
		}

		return total;
	}

	public int getTotalSummerHousePrice() {

		int total = 0;

		for (int i = 0; i < summerHouses.size(); i++) {
			total += summerHouses.get(i).getPrice();
		}

		return total;
	}

	public int getTotalPrice() {

		return getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice();
	}

	public double getAverageHouseSquareMeter() {

		int totalSquareMeter = 0;

		for (int i = 0; i < houses.size(); i++) {
			totalSquareMeter += houses.get(i).getSquareMeter();
		}

		return (double) totalSquareMeter / houses.size();
	}

	public double getAverageVillaSquareMeter() {

		int totalSquareMeter = 0;

		for (int i = 0; i < villas.size(); i++) {
			totalSquareMeter += villas.get(i).getSquareMeter();
		}

		return (double) totalSquareMeter / villas.size();
	}

	public double getAverageSummerHouseSquareMeter() {

		int totalSquareMeter = 0;

		for (int i = 0; i < summerHouses.size(); i++) {
			totalSquareMeter += summerHouses.get(i).getSquareMeter();
		}

		return (double) totalSquareMeter / summerHouses.size();
	}

	public double getAverageSquareMeter() {

		return (getTotalHousePrice() + getTotalVillaPrice() + getTotalSummerHousePrice())
				/ (houses.size() + villas.size() + summerHouses.size());
	}

}

public class PatikaHomework1 {
	public static void main(String[] args) {

		ServiceClass houseService = new ServiceClass();

		System.out.println("House list: \n" + houseService.getHouseList());
		System.out.println("Villa list: \n" + houseService.getVillaList());
		System.out.println("Summer House list: \n" + houseService.getSummerHouseList());

		System.out.println("Total house price: " + houseService.getTotalHousePrice());
		System.out.println("Total villa price: " + houseService.getTotalVillaPrice());
		System.out.println("Total summer house price: " + houseService.getTotalSummerHousePrice());
		System.out.println("Total price of all types of houses: " + houseService.getTotalPrice());

		System.out.println("Average square meter of houses: " + houseService.getAverageHouseSquareMeter());
		System.out.println("Average square meter of villas: " + houseService.getAverageVillaSquareMeter());
		System.out.println("Average square meter of summer houses: " + houseService.getAverageSummerHouseSquareMeter());
		System.out.println("Average square meter of all types of houses: " + houseService.getAverageSquareMeter());
	}
}
