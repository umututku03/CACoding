package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInteractor;

import java.io.IOException;

// TODO Complete me
public class ClearController {

    final ClearInputBoundary clearInteractor;

    public ClearController(ClearInputBoundary clearInteractor) {
        this.clearInteractor = clearInteractor;
    }

    public void execute() throws IOException {
        clearInteractor.execute();
    }
}
