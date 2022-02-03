public class Guest {

    private String name;
    private boolean checkedIn;

    public Guest(String name) {
        this.name = name;
        this.checkedIn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }
}
