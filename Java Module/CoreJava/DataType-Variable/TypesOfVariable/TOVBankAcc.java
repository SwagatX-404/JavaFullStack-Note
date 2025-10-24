class Bank{
    Long accNum;
    String accName;
    double bal;
}


public class TOVBankAcc {
                public static void main(String[] args) {

                    Bank acc1 = new Bank();  //Obj 1
                    Bank acc2 = new Bank();  //Obj 2

                    //For Obj 1 his account detailes
                    acc1.accNum = 1234L;
                    acc1.accName = "Swagat";
                    acc1.bal = 50000.00;

                    //For Obj 2 his account detailes
                    acc2.accNum = 5678L;
                    acc2.accName = "Anugat";
                    acc2.bal = 60000.00;
                }
}
