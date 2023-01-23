import Service.ServiceClass;


public class Main {
	public static void main(String[] args) {

		ServiceClass houseService = new ServiceClass();

		System.out.println("House list: \n" + houseService.getHouseList());
		System.out.println("Villa list: \n" + houseService.getVillaList());
		System.out.println("Summer House list: \n" + houseService.getSummerHouseList());

		System.out.println("Total house price: " + houseService.getTotalHousePrice() + "$");
		System.out.println("Total villa price: " + houseService.getTotalVillaPrice() + "$");
		System.out.println("Total summer house price: " + houseService.getTotalSummerHousePrice() + "$");
		System.out.println("Total price of all types of houses: " + houseService.getTotalPrice() + "$");

		System.out.println("Average square meter of houses: " + houseService.getAverageHouseSquareMeter());
		System.out.println("Average square meter of villas: " + houseService.getAverageVillaSquareMeter());
		System.out.println("Average square meter of summer houses: "
				+ String.format("%.2f", houseService.getAverageSummerHouseSquareMeter()));
		System.out.println("Average square meter of all types of houses: "
				+ String.format("%.2f", houseService.getAverageSquareMeter()));
	}
}
