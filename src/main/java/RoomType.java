public enum RoomType {
    SINGLE(1),
    DOUBLE(2);

    private int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }
}
