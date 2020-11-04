abstract class Bank {
    private int sbiROI;
    private int andhraROI;
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



    abstract void withdraw();
    abstract void deposit();


}

