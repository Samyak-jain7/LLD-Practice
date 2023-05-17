import Controller.GroupController;
import Controller.UserController;
import Model.Expense;
import Model.Group;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class SplitWise {

    UserController userController;
    GroupController groupController;

    SplitWise() {
        userController = new UserController();
        groupController = new GroupController();
    }

    public  void start() {

        //1. Register User
        addUsersToApp();
        
        //2. Add users to groups
        addUsersToGroup();
        
        //3.Add Expenses to groups
        addExpense();

        //4. Group wise user balance
        showGroupBalance();

        //5. Total balance of a User
        showTotalBalance();
    }

    private void showTotalBalance() {

        /*TODO:
            Iterate over all groups to find balance
            for a user across all groups.*/
    }

    private void showGroupBalance() {

        User user = userController.getUser("103");
        Group group = groupController.getGroup("G101");

        List<Expense> allExpense = group.getExpenseList();

        double balance = 0;
        for(Expense expense:allExpense) {

            List<User> splits = expense.getSplitBetween();

            if(splits.contains(user)) {
                // Equal split so share is equally distributed
                double share = expense.getExpenseAmount()/splits.size();

                if(expense.getPaidByUser().equals(user))
                    balance += expense.getExpenseAmount() - share;
                else
                    balance += -share;
            }
        }

        String userName = user.getUserName();
        String groupName = group.getGroupName();

        System.out.println("Balance for "+userName+" in group "+groupName+" is "+balance);

    }

    private void addExpense() {

        List<User> splitBetween = new ArrayList<>();

        // Splitting between these users.
        splitBetween.add(userController.getUser("101"));
        splitBetween.add(userController.getUser("102"));
        splitBetween.add(userController.getUser("103"));


        // Not taking split type assuming equal split type
        User paidByUser = userController.getUser("103");
        Expense expense1 = new Expense("1", "lunch", 300, splitBetween, paidByUser);

        paidByUser = userController.getUser("101");
        Expense expense2 = new Expense("2", "dinner", 900, splitBetween, paidByUser);

        //Adding expense to group1
        Group group1 = groupController.getGroup("G101");

        group1.addExpense(expense1);
        group1.addExpense(expense2);
    }

    private void addUsersToGroup() {

        Group group1 = new Group("G101", "Buddies");
        Group group2 = new Group("G102", "Colleagues");

        User user1 = userController.getUser("101");
        User user2 = userController.getUser("102");
        User user3 = userController.getUser("103");

        group1.addUser(user1);
        group1.addUser(user2);
        group1.addUser(user3);

        group2.addUser(user2);
        group2.addUser(user3);

        groupController.addGroup(group1);
        groupController.addGroup(group2);
    }


    private void addUsersToApp() {

        User user1 = new User("101", "Mudit");
        User user2 = new User("102", "Shouvik");
        User user3 = new User("103", "Sourav");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);

        List<User> userList = userController.getAllUsers();
    }
}
