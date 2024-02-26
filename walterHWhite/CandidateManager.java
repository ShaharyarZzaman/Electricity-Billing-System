package walterHWhite;

import java.util.ArrayList;
import java.util.List;

public class CandidateManager {
    private static List<String> candidateNames = new ArrayList<>();

    public static void addCandidate(String candidateName) {
        candidateNames.add(candidateName);
    }

    public static List<String> getCandidateNames() {
        return candidateNames;
    }
}
