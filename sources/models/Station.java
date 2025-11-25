package buslogic.app.models;

import java.util.List;

public class Station {
    public String address;
    public Integer city_id;
    public Coordinates coordinates;
    public Integer id;
    public List<String> lines_for_station;
    public List<LineForStation> lines_for_station_additional_data;
    public String name;
    public String slugs;
    public String station_id;
}
