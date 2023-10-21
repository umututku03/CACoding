package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ClearUserDataAccessInterface {

    void clear();

    List<String> getAll();
}
