package buslogic.app.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetAllTripsWithPlannedTimeResponse {
    private final Map<String, ArrayList<AnnouncementWithPlannedTime>> stations = new HashMap();

    public void addStationsValues(String str, ArrayList<AnnouncementWithPlannedTime> arrayList) {
        this.stations.put(str, arrayList);
    }
}
