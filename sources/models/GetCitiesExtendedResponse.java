package buslogic.app.models;

import java.util.ArrayList;

public class GetCitiesExtendedResponse {
    public ArrayList<City> cities;
    public ArrayList<Station> stations;

    public GetCitiesExtendedResponse(ArrayList<City> arrayList, ArrayList<Station> arrayList2) {
        this.cities = arrayList;
        this.stations = arrayList2;
    }
}
