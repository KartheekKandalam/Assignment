class SBI extends Bank{


    @Override
    void withdraw(int x) throws CustomException{
            if(x<100 || x>5000){

                throw new CustomException("Amount is out of range");
        }
            else
        {
        System.out.println("the amount is withdrawn from your SBI bank");
        }
    }

    @Override
    void deposit(int x) throws CustomException {
        if(x<100||x>5000){

            throw new CustomException("Amount is out of range");
        }
        else
        {
            System.out.println("the amount is deposited into your SBI bank");
        }
    }
    }

