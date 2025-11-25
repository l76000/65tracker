package buslogic.app.database.model;

public interface Station {
    String getBusColor();

    int getCityId();

    double getDistance();

    int getFavourite();

    int getId();

    String getLines();

    int getPinned();

    String getSlugs();

    int getStationId();

    String getStationIdOrg();

    double getStationLatitude();

    double getStationLongitude();

    String getStationName();

    String getStationNameLatin();

    String getTramColor();

    String getTrolleybusColor();

    void setDistance(double d10);

    void setFavourite(int i10);

    void setPinned(int i10);
}
