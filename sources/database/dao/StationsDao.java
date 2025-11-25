package buslogic.app.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.b0;
import androidx.room.g;
import androidx.room.l0;
import androidx.room.t1;
import buslogic.app.database.entity.StationsEntity;
import java.util.List;

@g
public interface StationsDao {
    @l0
    LiveData<List<StationsEntity>> getFS();

    @l0
    LiveData<Integer> getPinnedCount();

    @l0
    LiveData<List<StationsEntity>> getPinnedStations();

    @l0
    int getRowCount();

    @l0
    String getStationIdOrg(int i10);

    @b0
    void insertAll(List<StationsEntity> list);

    @l0
    LiveData<List<StationsEntity>> loadAllStations();

    @l0
    int loadFavoriteStatus(int i10);

    @l0
    LiveData<List<StationsEntity>> loadFavorites();

    @l0
    LiveData<StationsEntity> loadStation(int i10);

    @l0
    StationsEntity loadStationSync(int i10);

    @l0
    void removeFavouriteStations();

    @l0
    LiveData<List<StationsEntity>> searchAllStations(String str, String str2, String str3);

    @l0
    LiveData<List<StationsEntity>> searchFavoriteStations(String str);

    @t1
    void updateFavourite(StationsEntity stationsEntity);

    @l0
    void updateStations(int i10, int i11, int i12);
}
