package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.List;
import java.util.Map;

public class ClearOutputData {

    private final List<String> allUsers;

    public ClearOutputData(List<String> allUsers) {

        this.allUsers = allUsers;
    }

    public List<String> getAllUsers(){
        return this.allUsers;
    }
}
