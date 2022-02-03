public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;


    public Bedroom(RoomType roomType, int roomNumber) {
        super(roomType.getCapacity());
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getTypeCapacity(){
        return this.roomType.getCapacity();
    }
}
