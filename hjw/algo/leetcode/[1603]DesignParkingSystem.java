class ParkingSystem {

    private int[] place = new int[4];
    
    public ParkingSystem(int big, int medium, int small) {
        place[1] = big;
        place[2] = medium;
        place[3] = small;
    }
    
    public boolean addCar(int carType) {
        if(place[carType] > 0) {
            place[carType]--;
            return true;
        } 
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
