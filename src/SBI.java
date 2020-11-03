class SBI extends Bank {

    @Override
    int getRateOfInterest() {
        int ROI1=6;
        System.out.println(ROI1+"%");
        return 0;
    }

    @Override
    void withdraw() {
        System.out.println("the amount is withdrawn from your SBI bank");
    }

    @Override
    void deposit() {
        System.out.println("the amount is deposit from your SBI bank");
    }
}
