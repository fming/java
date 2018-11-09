/**
 * Overriding enum methods
 */
public enum SpaceShip {
    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;

    public String toString() {
        String id = name();
        String lowver = id.substring(1).toLowerCase();
        return id.charAt(0) + lowver;
    }

    public static void main(String[] args) {
        for(SpaceShip s : values()) {
            System.out.println(s);
        }
    }
}