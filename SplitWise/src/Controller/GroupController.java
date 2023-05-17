package Controller;

import Model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupController {

    List<Group> groupList;

    public GroupController() {
        groupList = new ArrayList<>();
    }
    public void addGroup(Group group) {
        groupList.add(group);
    }

    public Group getGroup(String groupId) {

        for(Group group : groupList) {
            if(group.getGroupId().equals(groupId)) {
                return group;
            }
        }
        return null;
    }
}
