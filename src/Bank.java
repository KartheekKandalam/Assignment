abstract class Bank {
    private int sbiROI;
    private int andhraROI;
    int amount;
    abstract void withdraw(int amount) throws CustomException;
    abstract void deposit(int amount) throws CustomException;

    public void setSbiROI(int relatedROI) {
        this.sbiROI = relatedROI;
    }

    public void setAndhraROI(int relatedROI) {
        this.andhraROI = relatedROI;
    }


    public int getSbiROI()
    {
        return sbiROI;
    }

    public int getAndhraROI()
    {
        return andhraROI;
    }
}


