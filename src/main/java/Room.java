import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getGuestListSize() {
        return this.guestList.size();
    }

    public void emptyGuestList() {
        this.guestList.clear();
    }

    public void removeGuest(Guest guest){
        int index = this.guestList.indexOf(guest);
        this.guestList.remove(index);       
    }

    public void addGuest(Guest guest){
        this.guestList.add(guest);
    }

    public void getNames(){
        for (Guest guest : guestList){
            System.out.println(guest.getName());
        }
    }
}
