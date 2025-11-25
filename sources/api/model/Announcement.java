package buslogic.app.api.model;

import java.util.ArrayList;
import java.util.Map;

public interface Announcement {
    String getActualLineNumber();

    String getGarageNumber();

    String getLineNumber();

    Map<Integer, Double> getLineRouteLat();

    Map<Integer, Double> getLineRouteLng();

    String getLineTitle();

    String getMainLineTitle();

    int getSecondsLeft();

    int getStationId();

    ArrayList<Integer> getStationIds();

    String getStationName();

    Double getVehicleLat();

    Double getVehicleLng();

    String getVehicleStationsLeft();
}
