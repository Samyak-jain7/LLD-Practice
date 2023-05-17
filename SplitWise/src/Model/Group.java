package Model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    String groupId;
    String groupName;
    List<User> groupMembers;
    List<Expense> expenseList;
//    String description;

    public Group(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupMembers = new ArrayList<>();
        this.expenseList = new ArrayList<>();
    }

    public void addUser(User user) {
        groupMembers.add(user);
    }

    public String getGroupId() {
        return groupId;
    }

    public void addExpense(Expense expense) {
        expenseList.add(expense);
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getGroupMembers() {
        return groupMembers;
    }
}
