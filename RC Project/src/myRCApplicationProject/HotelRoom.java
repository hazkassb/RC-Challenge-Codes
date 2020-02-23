package myRCApplicationProject;

public class HotelRoom {
	
	/**
	 * 
	 * @param An array A consisting of N strings, representing the list of bookings, 
	 * @return a two-character string consisting of the floor number 
	 * and letter of the room that was booked the most times
	 */
	

//	Constructor
	public HotelRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static String solution(String[] A) {
		
		String[] bookedRooms = new String[A.length];
		int[] numBookedRooms = new int[A.length];
		int size = 0;
		
		for (int i = 0; i < A.length; i++) {
			
			if (A[i].charAt(0) == '+') {//book
				
				String room = A[i].substring(1);
			
				//find room in array
				int index = -1;
				for (int j = 0; j < size; j++) {
					if (room.equals(bookedRooms[j])) {
						index = j;
						break;
					}
				}
				
				if (index == -1) {
					bookedRooms[size] = room;
					numBookedRooms[size] = 1;
					size++;
				}else {
					//increase number of bookings
					numBookedRooms[index]++;
				}				
			}
		}
		
		//find max
		//find room with identifier is the smallest alpha-numerically
		int max = 0;
		String result = ""; //room
		
		for (int i = 0; i < size; i++) {
			if (numBookedRooms[i] > max) {
				max = numBookedRooms[i];
				result = bookedRooms[i];
			}else if (numBookedRooms[i] == max) {
				//alpha-numerically?
				if (result.compareTo(bookedRooms[i]) > 0) {
					result = bookedRooms[i];
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
//		Test Cases
		String[] myArr1 = {"+1A", "+3F", "+8X", "−1A", "−3F", "−8X"};
		System.out.println(HotelRoom.solution(myArr1) + "\n");
		
		String[] myArr2 = {"+1A", "−1A", "+3F", "−3F", "+3F", "+8X"};
		System.out.println(HotelRoom.solution(myArr2) + "\n");
		
		String[] myArr3 = {"+0A"};
		System.out.println(HotelRoom.solution(myArr3) + "\n");
		
		String[] myArr4 = {"+9Z", "−9Z", "+9Z", "−9Z", "+9Z", "+3B"};
		System.out.println(HotelRoom.solution(myArr4) + "\n");
	}

}
