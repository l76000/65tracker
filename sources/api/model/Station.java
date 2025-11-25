package buslogic.app.api.model;

import buslogic.app.models.StationLine;
import java.util.ArrayList;

public interface Station {
    int getCityId();

    double getDistance();

    int getFavorite();

    int getId();

    String getSlugs();

    int getStationId();

    String getStationIdOrg();

    double getStationLatitude();

    ArrayList<StationLine> getStationLines();

    double getStationLongitude();

    String getStationName();

    void setFavourite(int i10);
}
