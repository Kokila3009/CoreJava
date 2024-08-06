package com.gentech.constructoroverload;

class Contract {
    Contract(String contractId, String contractName, String contractType, String partyInvolved) {
        System.out.println("Contract ID: " + contractId + " , " + "Contract Name: " + contractName + " , " + "Contract Type: " + contractType + " , " + "Party Involved: " + partyInvolved);
    }

    Contract(String startDate, String endDate) {
        System.out.println("Start Date: " + startDate + " , " + "End Date: " + endDate);
    }

    Contract(int contractValue, int tax, int totalValue) {
        System.out.println("Contract Value: " + contractValue + " , " + "Tax: " + tax + " , " + "Total Value: " + totalValue);
    }
}

public class constructoroverload5 {
    public static void main(String[] args) {
        Contract c1 = new Contract("CTR123", "Service Agreement", "IT Services", "TechCorp");

        Contract c2 = new Contract("01/01/2024", "31/12/2024");

        Contract c3 = new Contract(100000, 10000, 110000);
    }
}

