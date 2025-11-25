package buslogic.app.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.b0;
import androidx.room.g;
import androidx.room.l0;
import buslogic.app.models.LineForStation;
import java.util.List;

@g
public interface LineForStationDao {
    @l0
    LiveData<List<LineForStation>> getAllLines();

    @b0
    void insertAll(List<LineForStation> list);
}
