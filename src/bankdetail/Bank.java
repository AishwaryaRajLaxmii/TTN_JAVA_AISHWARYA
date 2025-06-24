package bankdetail;

    class Bank {
        private String name;
        private String headOfficeAddress;
        private String chairmanName;
        private int branchCount;
        private double fdInterestRate;
        private double personalLoanInterestRate;
        private double homeLoanInterestRate;

        // Getters and Setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getHeadOfficeAddress() {
            return headOfficeAddress;
        }
        public void setHeadOfficeAddress(String headOfficeAddress) {
            this.headOfficeAddress = headOfficeAddress;
        }
        public String getChairmanName() {
            return chairmanName;
        }
        public void setChairmanName(String chairmanName) {
            this.chairmanName = chairmanName;
        }
        public int getBranchCount() {

            return branchCount;
        }
        public void setBranchCount(int branchCount) {
            this.branchCount = branchCount;
        }
        public double getFdInterestRate() {
            return fdInterestRate;
        }
        public void setFdInterestRate(double fdInterestRate) {
            this.fdInterestRate = fdInterestRate;
        }

        public double getPersonalLoanInterestRate() {
            return personalLoanInterestRate;
        }
        public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
            this.personalLoanInterestRate = personalLoanInterestRate;
        }

        public double getHomeLoanInterestRate() {
            return homeLoanInterestRate;
        }
        public void setHomeLoanInterestRate(double homeLoanInterestRate) {
            this.homeLoanInterestRate = homeLoanInterestRate;
        }
        @Override
        public String toString() {
            return "Bank Name: " + name +
                    "\nHead Office Address: " + headOfficeAddress +
                    "\nChairman Name: " + chairmanName +
                    "\nBranch Count: " + branchCount +
                    "\nFD Interest Rate: " + fdInterestRate +
                    "\nPersonal Loan Interest Rate: " + personalLoanInterestRate +
                    "\nHome Loan Interest Rate: " + homeLoanInterestRate;
        }
    }
    class SBI extends Bank {
        @Override
        public String toString() {
            return "SBI Bank Details:\n" + super.toString();
        }
    }
    class BOI extends Bank {
        @Override
        public String toString() {
            return "BOI Bank Details:\n" + super.toString();
        }
    }

    class ICICI extends Bank {
        @Override
        public String toString() {
            return "ICICI Bank Details:\n" + super.toString();
        }
    }



