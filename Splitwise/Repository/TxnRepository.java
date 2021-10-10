package Repository;

import java.util.ArrayList;

import models.Txn;

public class TxnRepository {
    private ArrayList<Txn> txnRepo;
    public TxnRepository(ArrayList<Txn> txns){
        this.txnRepo=txns;
    }

    public Txn addTxn(Txn txn){
        this.txnRepo.add(txn);
        return this.txnRepo.get(this.txnRepo.size()-1);
    }
}
