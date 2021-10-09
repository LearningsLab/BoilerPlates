package models;
import java.util.Map;

import Config.Constants;

public class Expense {
 
    private Map <User,Float> contributors;
    private Float amt;
    private Map<User,Float> payees;
    private Constants.SplitStrategy splitStrategy;
    private Group grp;

    public Float getExpenseAmt(){
        return this.amt;
    }
    public Map<User,Float> getContributors(){
        return this.contributors;
    }
    public Map<User,Float> getPayees(){
        return this.payees;
    }
    public Constants.SplitStrategy getSplitStrategy(){
        return this.splitStrategy;
    }
    public Group getExpenseGrp(){
        return this.grp;
    }
    public static class Builder{
        private Expense expense;
        public Builder(){
            this.expense = new Expense();
        }

        public Builder setAmt(Float amt){
            this.expense.amt=amt;
            return this;
        }

        public Builder setContributors(Map<User,Float> contribs){
            this.expense.contributors=contribs;
            return this;
        }

        public Builder setpayees(Map<User,Float> borrowers){
            this.expense.payees=borrowers;
            return this;
        }

        public Expense buildExpense(){
            return this.expense;
        } 

        
    }
}
