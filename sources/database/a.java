package buslogic.app.database;

import android.content.Context;
import buslogic.app.database.AppDatabase;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int O;
    public final /* synthetic */ Context P;
    public final /* synthetic */ buslogic.app.a Q;

    public /* synthetic */ a(Context context, buslogic.app.a aVar, int i10) {
        this.O = i10;
        this.P = context;
        this.Q = aVar;
    }

    public final void run() {
        int i10 = this.O;
        buslogic.app.a aVar = this.Q;
        Context context = this.P;
        switch (i10) {
            case 0:
                AppDatabase.AnonymousClass1.lambda$onOpen$1(context, aVar);
                return;
            case 1:
                AppDatabase.AnonymousClass1.lambda$onCreate$0(context, aVar);
                return;
            default:
                AppDatabase.lambda$populateDatabaseAgain$0(context, aVar);
                return;
        }
    }
}
