package Repository;

import java.util.ArrayList;

import models.Group;



public class GroupRepository {
    private ArrayList<Group> grpsRepo;

    public GroupRepository(ArrayList<Group> grp){
        this.grpsRepo=grp;
    }

    public Group addGroup(Group grp){
        this.grpsRepo.add(grp);
        return this.grpsRepo.get(this.grpsRepo.size()-1);
    }    

}
