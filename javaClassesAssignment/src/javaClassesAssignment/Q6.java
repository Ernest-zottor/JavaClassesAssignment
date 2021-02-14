package javaClassesAssignment;

class Room{
	int roomNo;
	String roomType;
	float roomArea;
	boolean acMachine;
	
	public void setData(int roomN, String roomTyp, float roomAre, boolean ac) {
		roomNo = roomN;
		roomType = roomTyp;
		roomArea = roomAre;
		acMachine = ac;
		
	}
	public void displayData() {
		System.out.println("The room number is: " + roomNo);
		System.out.println("The room type is: " + roomType);
		System.out.println("The area of the room is: " + roomArea);
		System.out.println("Has AC machine? : " + acMachine);
	}
}




public class Q6 {

	public static void main(String[] args) {
		
		Room room = new Room();
		room.setData(10, "flat", 32, true);
		room.displayData();
	}

}
