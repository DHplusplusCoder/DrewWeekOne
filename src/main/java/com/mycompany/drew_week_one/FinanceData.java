/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.drew_week_one;

/**
 *
 * @author drew
 */
public class FinanceData {
    private final List<Reimbursement> reimbursements = new ArrayList<>();
    public MockFinanceData(){
        MockDataDrewTwo Mddt = new MockDataDrewTwo();
        
        Reimbursement Reimbursement_One = new Reimbursement(1,1,0, "Oracle Java", Other, Pending, 250.00);
        
        reimbursements.add(Reimbursement_One);
        
    }
    
}
