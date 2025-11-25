package android.support.v4.media;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import androidx.navigation.v;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.j;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.measurement.g6;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.material.navigation.i;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.encoders.c;
import io.reactivex.internal.util.c;
import io.reactivex.internal.util.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.l0;
import v6.a;
import v6.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements j, a.C0615a, com.google.firebase.components.h, i.a {
    public /* synthetic */ h() {
    }

    public static void A(int i10, Canvas canvas, int i11, int i12) {
        i0.d(i10);
        canvas.restoreToCount(i11);
        i0.c(i12);
    }

    public static void B(c cVar, c cVar2, l9.c cVar3) {
        cVar.getClass();
        cVar3.onError(k.c(cVar2));
    }

    public static String C(String str, String str2) {
        return str + str2;
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int e(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static d f(Parcel parcel) {
        d d02 = d.a.d0(parcel.readStrongBinder());
        parcel.recycle();
        return d02;
    }

    public static com.google.firebase.encoders.c h(com.google.firebase.encoders.proto.a aVar, c.b bVar) {
        bVar.b(aVar.a());
        return bVar.a();
    }

    public static Object i(n0 n0Var, int i10, ArrayList arrayList, int i11) {
        g6.h(n0Var.name(), i10, arrayList);
        return arrayList.get(i11);
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.D());
        return sb.toString();
    }

    public static String k(String str, int i10) {
        return str + i10;
    }

    public static String l(String str, int i10, SharedPreferences sharedPreferences, String str2) {
        return sharedPreferences.getString(str + i10, str2);
    }

    public static String m(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String n(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String o(String str, String str2) {
        return str + str2;
    }

    public static String p(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String q(StringBuilder sb, int i10, char c10) {
        sb.append(i10);
        sb.append(c10);
        return sb.toString();
    }

    public static String r(StringBuilder sb, int i10, String str) {
        sb.append(i10);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String t(Object[] objArr, int i10, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i10));
        l0.o(format, str2);
        return format;
    }

    public static StringBuilder u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder v(String str, int i10, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder w(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder x(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder y(StringBuilder sb, int i10, SharedPreferences.Editor editor, String str, String str2) {
        sb.append(i10);
        editor.putString(sb.toString(), str).commit();
        return new StringBuilder(str2);
    }

    public static kotlin.ranges.j z(int i10, int i11) {
        return new kotlin.ranges.k(i10, i11).iterator();
    }

    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public /* synthetic */ h(i iVar, v vVar, boolean z9) {
    }

    public void b(Exception exc) {
    }

    public void g(b bVar) {
    }
}
