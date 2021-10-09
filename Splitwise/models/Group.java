package models;

import java.util.ArrayList;

public class Group {
    private ArrayList<User> users;
    private ArrayList<Expense> expenses;
    private ArrayList<Txn> txns;
    private Boolean isSetteled;
    
    public Group (ArrayList<User> grpMembers){
        this.users=grpMembers;
    }

    public ArrayList<Expense> getexpExpenses(){
        return this.expenses;
    }
    public ArrayList<User> getGrpMembers(){
        return this.users;
    }
    public ArrayList<Txn> getTxns(){
        return this.txns;
    }
    public Boolean isSettled(){
        return this.isSetteled;
    }
    public Expense addExpense(Expense expense){
        this.expenses.add(expense);
        return this.expenses.get(this.expenses.size()-1);
    }
    public ArrayList<User> adduser(User u){
        this.users.add(u);
        return this.users;
    }
    public Boolean settleup(){
        //Code To be added here
        
        return this.isSetteled;
    }




}
