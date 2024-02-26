package walterHWhite;


import java.util.ArrayList;
import java.util.List;

public class ElectionDataModel {
    private List<Election> elections;

    public ElectionDataModel() {
        this.elections = new ArrayList<>();
    }

    public List<Election> getElections() {
        return elections;
    }

    public void addElection(Election election) {
        elections.add(election);
    }
}
