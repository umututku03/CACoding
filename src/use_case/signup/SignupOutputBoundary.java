package use_case.signup;

import use_case.clear_users.ClearOutputData;

import java.util.Map;

public interface SignupOutputBoundary {
    void prepareSuccessView(SignupOutputData user);

    void prepareFailView(String error);

    void prepareClear(ClearOutputData allUsers);
}