public class Siargao implements Locations {

    int airFare = 250;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}