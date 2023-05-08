public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {

        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        if (budget >= boracay.airFare) {         
            budget-=boracay.airFare;
            System.out.println( "Yahoo! The places and clubs here in Boracay are so fun!");
        }
        else {
            System.out.println("Not enough budget to visit Boracay!");
        }
        
        checkBudget();
    }

    public void visit(Cebu cebu) {
        
        if (budget >= cebu.airFare) {
            budget-=cebu.airFare;
            System.out.println("Wow! Cebu has a lot of tourist attractions and historical landmarks");
        }
        else {
            System.out.println("Not enough budget to visit Cebu!");
        }

        checkBudget();
        
    }

    public void visit(Manila manila) {

        if (budget >= manila.airFare) {
            budget-=manila.airFare;
            System.out.println("The cuisines here in Manila is exquisite, and its modern amenities");
        }
        else {
            System.out.println("Not enough budget to visit Manila!");
        }

        checkBudget();
        
    }

    public void visit(Iloilo iloilo) {

        if (budget >= iloilo.airFare){
            budget-=iloilo.airFare;
            System.out.println("Iloilo is a nice place with a rich culture and heritage, the food here is good too!");
        }
        else {
            System.out.println("Not enough budget to visit Iloilo!");
        }

        checkBudget();
        
    }

    public void visit(Palawan palawan) {

        if (budget >= palawan.airFare) {        
            budget-=palawan.airFare;
            System.out.println("Woah! The islands here in Palawan has natural beatury and ecological diversity");
        }
        else {
            System.out.println("Not enough budget to visit Palawan!");
        }
        
        checkBudget();
    }

    public void visit(Siargao siargao) {

        if (budget >= siargao.airFare) {
            budget-=siargao.airFare;
            System.out.println("Siargao is such a laid-back island vibe, surfing here is fun too!");
        }
        else {
            System.out.println("Not enough budget to visit Siargao!");
        }
        
        checkBudget();
    }


    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }

}