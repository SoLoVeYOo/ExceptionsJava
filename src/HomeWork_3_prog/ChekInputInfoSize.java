package HomeWork_3_prog;

import java.util.ArrayList;

public class ChekInputInfoSize {
    public ChekInputInfoSize(ArrayList<String> inputString) throws Exception {
        try {
            if (inputString.size() > 6) {
                throw new NullPointerException("There should be less parameters, namely, 6!");
            }

            if (inputString.size() < 6) {
                throw new NullPointerException("There should be more parameters, namely, 6!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
