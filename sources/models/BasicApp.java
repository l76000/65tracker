package buslogic.app;

import android.app.Application;
import buslogic.app.database.AppDatabase;
import buslogic.app.ui.account.data.a;
import buslogic.app.ui.account.data.b;
import buslogic.app.ui.account.data.c;

public class BasicApp extends Application {
    public a O;

    public final b a() {
        return b.a(new a(), getApplicationContext());
    }

    public final c b() {
        return c.d(getApplicationContext());
    }

    public final f c() {
        return f.a(getApplicationContext(), AppDatabase.getInstance(this, this.O));
    }

    public final void onCreate() {
        super.onCreate();
        this.O = new a();
    }
}
