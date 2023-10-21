package use_case.clear_users;

// TODO Complete me

import entity.User;
import use_case.signup.SignupOutputBoundary;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;
    final SignupOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, SignupOutputBoundary userPresenter) {
        this.userDataAccessObject = clearUserDataAccessInterface;
        this.userPresenter = userPresenter;

    }

    @Override
    public void execute() {

        List<String> allUsers = userDataAccessObject.getAll();
        userDataAccessObject.clear();

        ClearOutputData clearOutputData = new ClearOutputData(allUsers);
        userPresenter.prepareClear(clearOutputData);

    }
}
