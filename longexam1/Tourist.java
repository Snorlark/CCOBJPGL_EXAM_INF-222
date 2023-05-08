interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Cebu cebu);

    void visit(Manila manila);
    
    void visit(Iloilo iloilo);
    
    void visit(Palawan palawan);

    void visit(Siargao siargao);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}