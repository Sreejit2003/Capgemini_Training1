package AggregatiionAndComposition;

public class RoomDriver {
	public static void main(String[] args) {
		
		//Aggregation
//		Room room = new Room(600);
//		
//		House house = new House("Blue", room);
//		
//		System.out.println(house.getColor());
//		System.out.println(house.getRoom().getArea());
//		
//		System.out.println(room.getArea());
		
		//Composition
		HouseComposition house = new HouseComposition("Blue", 600);
		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());
		
//		house = null;
//		
//		System.out.println(house.getRoom().getArea());
	}
}
