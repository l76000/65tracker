package buslogic.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f9666a = new SparseIntArray(0);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f9667a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f9667a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f9668a = new HashMap<>(0);
    }

    public final List<k> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public final String b(int i10) {
        return a.f9667a.get(i10);
    }

    public final ViewDataBinding c(l lVar, View view, int i10) {
        if (f9666a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final ViewDataBinding d(l lVar, View[] viewArr, int i10) {
        if (viewArr.length == 0 || f9666a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final int e(String str) {
        Integer num;
        if (str == null || (num = b.f9668a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
