package bankdetail;

public class Main {
    public static void main(String[] args) {
        // SBI
        SBI sbi = new SBI();
        sbi.setName("State Bank of India");
        sbi.setHeadOfficeAddress("Mumbai, Maharashtra");
        sbi.setChairmanName("Dinesh Kumar Khara");
        sbi.setBranchCount(22000);
        sbi.setFdInterestRate(6.5);
        sbi.setPersonalLoanInterestRate(10.5);
        sbi.setHomeLoanInterestRate(8.9);

        // BOI
        BOI boi = new BOI();
        boi.setName("Bank of India");
        boi.setHeadOfficeAddress("Mumbai, Maharashtra");
        boi.setChairmanName("Rajneesh Karnatak");
        boi.setBranchCount(5100);
        boi.setFdInterestRate(6.3);
        boi.setPersonalLoanInterestRate(11.0);
        boi.setHomeLoanInterestRate(9.1);

        // ICICI
        ICICI icici = new ICICI();
        icici.setName("ICICI Bank");
        icici.setHeadOfficeAddress("Vadodara, Gujarat");
        icici.setChairmanName("Sandeep Bakhshi");
        icici.setBranchCount(5400);
        icici.setFdInterestRate(7.0);
        icici.setPersonalLoanInterestRate(12.0);
        icici.setHomeLoanInterestRate(9.5);

        // Print bank details
        System.out.println(sbi);
        System.out.println();
        System.out.println(boi);
        System.out.println();
        System.out.println(icici);
    }
}
