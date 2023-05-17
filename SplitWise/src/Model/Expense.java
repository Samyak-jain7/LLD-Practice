package Model;

import java.util.ArrayList;
import java.util.List;

public class Expense {

    String expenseId;
    String expenseName;
    double expenseAmount;
    List<User> splitBetween;
    User paidByUser;

    public Expense(String expenseId, String expenseName, double expenseAmount, List<User> splitBetween, User paidByUser) {

        this.expenseId = expenseId;
        this.expenseName = expenseName;
        this.expenseAmount = expenseAmount;
        this.splitBetween = splitBetween;
        this.paidByUser = paidByUser;
    }

    public List<User> getSplitBetween() {
        return splitBetween;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public User getPaidByUser() {
        return paidByUser;
    }

//    String description;
}
