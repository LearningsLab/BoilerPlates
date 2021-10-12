package Services;

import models.Group;

public class GroupService {
    private static GroupService grpService=null;
    
    public static GroupService getInstance(){
        if (grpService==null){
            grpService=new GroupService();
        }
        return grpService;
        
    }

    public Boolean settleup(Group grp){
        //Code To be added here
        // get grp expenses list
        // accumulate as per the users
        // make transaction summary and print it.
        // Map<User,Float> usersNetBalance = cummulateExpenses();

        // minTxns=getMinTxns();
        grp.setSettled();
        return true;
    }
    // public ArrayList<Expense> getExpenseList(){

    // }

    // public Map<User,Float> cummulateExpenses(){

    // }
    // public addExpense(){
        
    // }
    

}
