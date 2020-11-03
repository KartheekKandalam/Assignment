class Andhra extends Bank {

    @Override
    int getRateOfInterest() {
        int ROI2=7;
        System.out.println(ROI2+"%");
        return 0;
    }

    @Override
    void withdraw() {
        System.out.println("the amount is withdrawn from your andhra bank");
    }

    @Override
    void deposit() {
        System.out.println("the amount is deposit from your andhra bank");
    }
}
