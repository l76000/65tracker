package buslogic.app.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.d;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.l0;
import androidx.lifecycle.y0;
import buslogic.app.database.model.Station;
import buslogic.app.models.AnnouncementListItem;
import buslogic.app.models.LineForStation;
import buslogic.app.models.StationLine;
import buslogic.app.models.UserArticle;
import buslogic.beogradplus.R;
import com.google.android.gms.maps.model.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: GeneralUtils */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12510a = "1";

    /* renamed from: b  reason: collision with root package name */
    public static final String f12511b = "11";

    /* renamed from: c  reason: collision with root package name */
    public static final String f12512c = "13";

    /* renamed from: d  reason: collision with root package name */
    public static final String f12513d = "2";

    /* renamed from: e  reason: collision with root package name */
    public static final String f12514e = "3";

    /* renamed from: f  reason: collision with root package name */
    public static final String f12515f = "4";

    /* renamed from: g  reason: collision with root package name */
    public static final String f12516g = "12";

    /* renamed from: h  reason: collision with root package name */
    public static final String f12517h = "14";

    /* renamed from: i  reason: collision with root package name */
    public static final String f12518i = "5";

    /* renamed from: j  reason: collision with root package name */
    public static final String f12519j = "6";

    /* renamed from: k  reason: collision with root package name */
    public static final String f12520k = "7";

    /* renamed from: l  reason: collision with root package name */
    public static final String f12521l = "8";

    /* compiled from: GeneralUtils */
    public class a implements y0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y0 f12522a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LiveData f12523b;

        public a(LiveData liveData, y0 y0Var) {
            this.f12522a = y0Var;
            this.f12523b = liveData;
        }

        public final void a(T t9) {
            this.f12522a.a(t9);
            this.f12523b.k(this);
        }
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        try {
            return !simpleDateFormat.parse(str).before(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        } catch (ParseException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static com.google.android.gms.maps.model.a b(Station station, Context context) {
        int i10;
        ArrayList arrayList = new ArrayList();
        if (station.getBusColor() != null && !station.getBusColor().isEmpty()) {
            arrayList.add(d(R.drawable.bus_linija, context, station.getBusColor(), 40));
        }
        if (station.getTramColor() != null && !station.getTramColor().isEmpty()) {
            arrayList.add(d(R.drawable.tramvaj_linija, context, station.getTramColor(), 40));
        }
        if (station.getTrolleybusColor() != null && !station.getTrolleybusColor().isEmpty()) {
            arrayList.add(d(R.drawable.trola_linija, context, station.getTrolleybusColor(), 40));
        }
        int i11 = 0;
        if (arrayList.size() == 1) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            i12 += bitmap.getWidth() + i10;
            i13 = Math.max(i13, bitmap.getHeight());
        }
        Bitmap createBitmap = Bitmap.createBitmap(i12 - i10, i13, Bitmap.Config.ARGB_8888);
        if (createBitmap.getByteCount() > 30000) {
            Toast.makeText(context, "Size = combinedBitmap.getByteCount()," + station.getStationIdOrg(), 0).show();
        }
        Canvas canvas = new Canvas(createBitmap);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Bitmap bitmap2 = (Bitmap) it2.next();
            canvas.drawBitmap(bitmap2, (float) i11, 0.0f, (Paint) null);
            i11 += bitmap2.getWidth() + i10;
        }
        return b.d(createBitmap);
    }

    public static Date c(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Bitmap d(int i10, Context context, String str, int i11) {
        int i12;
        if (i11 > 40) {
            i12 = R.drawable.marker_background_large;
        } else {
            i12 = R.drawable.marker_background;
        }
        Drawable h10 = d.h(context, i12);
        if (h10 == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(h10.getIntrinsicWidth(), h10.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        h10.setColorFilter(new PorterDuffColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_ATOP));
        h10.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        h10.draw(canvas);
        Drawable h11 = d.h(context, i10);
        if (h11 != null) {
            int width = canvas.getWidth() / 2;
            int height = canvas.getHeight() / 2;
            int i13 = i11 / 2;
            h11.setBounds(width - i13, height - i13, width + i13, height + i13);
            h11.draw(canvas);
        }
        return createBitmap;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d7, code lost:
        if (r11.equals("1") == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.util.List<buslogic.app.models.LineForStation> r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0031:
            boolean r9 = r14.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x0128
            java.lang.Object r9 = r14.next()
            buslogic.app.models.LineForStation r9 = (buslogic.app.models.LineForStation) r9
            java.lang.String r11 = r9.getLine_type()
            r11.getClass()
            int r12 = r11.hashCode()
            r13 = -1
            switch(r12) {
                case 49: goto L_0x00d1;
                case 50: goto L_0x00c5;
                case 51: goto L_0x00ba;
                case 52: goto L_0x00af;
                case 53: goto L_0x00a4;
                case 54: goto L_0x0099;
                case 55: goto L_0x008e;
                case 56: goto L_0x0083;
                case 1568: goto L_0x0077;
                case 1569: goto L_0x006a;
                case 1570: goto L_0x005d;
                case 1571: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            r10 = r13
            goto L_0x00db
        L_0x0050:
            java.lang.String r10 = "14"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0059
            goto L_0x004d
        L_0x0059:
            r10 = 11
            goto L_0x00db
        L_0x005d:
            java.lang.String r10 = "13"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0066
            goto L_0x004d
        L_0x0066:
            r10 = 10
            goto L_0x00db
        L_0x006a:
            java.lang.String r10 = "12"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0073
            goto L_0x004d
        L_0x0073:
            r10 = 9
            goto L_0x00db
        L_0x0077:
            java.lang.String r10 = "11"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0080
            goto L_0x004d
        L_0x0080:
            r10 = 8
            goto L_0x00db
        L_0x0083:
            java.lang.String r10 = "8"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x008c
            goto L_0x004d
        L_0x008c:
            r10 = 7
            goto L_0x00db
        L_0x008e:
            java.lang.String r10 = "7"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0097
            goto L_0x004d
        L_0x0097:
            r10 = 6
            goto L_0x00db
        L_0x0099:
            java.lang.String r10 = "6"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00a2
            goto L_0x004d
        L_0x00a2:
            r10 = 5
            goto L_0x00db
        L_0x00a4:
            java.lang.String r10 = "5"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ad
            goto L_0x004d
        L_0x00ad:
            r10 = 4
            goto L_0x00db
        L_0x00af:
            java.lang.String r10 = "4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00b8
            goto L_0x004d
        L_0x00b8:
            r10 = 3
            goto L_0x00db
        L_0x00ba:
            java.lang.String r10 = "3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c3
            goto L_0x004d
        L_0x00c3:
            r10 = 2
            goto L_0x00db
        L_0x00c5:
            java.lang.String r10 = "2"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00cf
            goto L_0x004d
        L_0x00cf:
            r10 = 1
            goto L_0x00db
        L_0x00d1:
            java.lang.String r12 = "1"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00db
            goto L_0x004d
        L_0x00db:
            switch(r10) {
                case 0: goto L_0x011f;
                case 1: goto L_0x0116;
                case 2: goto L_0x010d;
                case 3: goto L_0x0104;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f2;
                case 6: goto L_0x00e9;
                case 7: goto L_0x00e0;
                case 8: goto L_0x011f;
                case 9: goto L_0x0104;
                case 10: goto L_0x011f;
                case 11: goto L_0x0104;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x0031
        L_0x00e0:
            java.lang.String r9 = r9.getLine_number_for_display()
            r7.add(r9)
            goto L_0x0031
        L_0x00e9:
            java.lang.String r9 = r9.getLine_number_for_display()
            r6.add(r9)
            goto L_0x0031
        L_0x00f2:
            java.lang.String r9 = r9.getLine_number_for_display()
            r5.add(r9)
            goto L_0x0031
        L_0x00fb:
            java.lang.String r9 = r9.getLine_number_for_display()
            r4.add(r9)
            goto L_0x0031
        L_0x0104:
            java.lang.String r9 = r9.getLine_number_for_display()
            r3.add(r9)
            goto L_0x0031
        L_0x010d:
            java.lang.String r9 = r9.getLine_number_for_display()
            r2.add(r9)
            goto L_0x0031
        L_0x0116:
            java.lang.String r9 = r9.getLine_number_for_display()
            r1.add(r9)
            goto L_0x0031
        L_0x011f:
            java.lang.String r9 = r9.getLine_number_for_display()
            r0.add(r9)
            goto L_0x0031
        L_0x0128:
            boolean r14 = r0.isEmpty()
            if (r14 != 0) goto L_0x0133
            java.lang.String r14 = "busLine"
            r0.add(r10, r14)
        L_0x0133:
            boolean r14 = r1.isEmpty()
            if (r14 != 0) goto L_0x013e
            java.lang.String r14 = "tramLine"
            r1.add(r10, r14)
        L_0x013e:
            boolean r14 = r2.isEmpty()
            if (r14 != 0) goto L_0x0149
            java.lang.String r14 = "trolleybusLine"
            r2.add(r10, r14)
        L_0x0149:
            boolean r14 = r3.isEmpty()
            if (r14 != 0) goto L_0x0154
            java.lang.String r14 = "minibusVanLine"
            r3.add(r10, r14)
        L_0x0154:
            boolean r14 = r4.isEmpty()
            if (r14 != 0) goto L_0x015f
            java.lang.String r14 = "minibusExpressLine"
            r4.add(r10, r14)
        L_0x015f:
            boolean r14 = r5.isEmpty()
            if (r14 != 0) goto L_0x016a
            java.lang.String r14 = "electricBusLine"
            r5.add(r10, r14)
        L_0x016a:
            boolean r14 = r6.isEmpty()
            if (r14 != 0) goto L_0x0175
            java.lang.String r14 = "nightBusLine"
            r6.add(r10, r14)
        L_0x0175:
            boolean r14 = r7.isEmpty()
            if (r14 != 0) goto L_0x0180
            java.lang.String r14 = "seasonalBusLine"
            r7.add(r10, r14)
        L_0x0180:
            r8.addAll(r0)
            r8.addAll(r1)
            r8.addAll(r2)
            r8.addAll(r3)
            r8.addAll(r4)
            r8.addAll(r5)
            r8.addAll(r6)
            r8.addAll(r7)
            boolean r14 = r8.isEmpty()
            if (r14 == 0) goto L_0x01a0
            r14 = 0
            return r14
        L_0x01a0:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.util.Iterator r0 = r8.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c4
        L_0x01af:
            java.lang.Object r1 = r0.next()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r14.append(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c4
            java.lang.String r1 = ","
            r14.append(r1)
            goto L_0x01af
        L_0x01c4:
            java.lang.String r14 = r14.toString()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: buslogic.app.utils.c.e(java.util.List):java.lang.String");
    }

    public static String f(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static UserArticle g(List<UserArticle> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        UserArticle userArticle = list.get(0);
        for (UserArticle next : list) {
            Date c10 = c(next.ticket_duration);
            if (!(c10 == null || c(userArticle.created_at) == null || !c10.after(c(userArticle.created_at)))) {
                userArticle = next;
            }
        }
        return userArticle;
    }

    public static <T> void h(LiveData<T> liveData, l0 l0Var, y0<T> y0Var) {
        liveData.f(l0Var, new a(liveData, y0Var));
    }

    public static void i(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=buslogic.beogradplus"));
            intent.addFlags(1207959552);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
            } else {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=buslogic.beogradplus")));
            }
        } catch (ActivityNotFoundException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean j(String str) {
        if (str.isEmpty()) {
            return true;
        }
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.add(2, -1);
            return parse.before(instance.getTime());
        } catch (ParseException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static com.google.android.gms.maps.model.a k(String str, String str2, Context context, String str3) {
        Bitmap bitmap;
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 49:
                if (str2.equals("1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 50:
                if (str2.equals(f12513d)) {
                    c10 = 1;
                    break;
                }
                break;
            case 51:
                if (str2.equals(f12514e)) {
                    c10 = 2;
                    break;
                }
                break;
            case 54:
                if (str2.equals(f12519j)) {
                    c10 = 3;
                    break;
                }
                break;
            case 55:
                if (str2.equals(f12520k)) {
                    c10 = 4;
                    break;
                }
                break;
            case 56:
                if (str2.equals(f12521l)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1568:
                if (str2.equals(f12511b)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1570:
                if (str2.equals(f12512c)) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                bitmap = d(R.drawable.bus_linija, context, str, 40);
                break;
            case 1:
                bitmap = d(R.drawable.tramvaj_linija, context, str, 40);
                break;
            case 2:
                bitmap = d(R.drawable.trola_linija, context, str, 40);
                break;
            default:
                bitmap = d(R.drawable.e_linija, context, str, 40);
                break;
        }
        if (bitmap.getByteCount() > 30000) {
            Toast.makeText(context, "Size = combinedBitmap.getByteCount()," + str3, 0).show();
        }
        return b.d(bitmap);
    }

    public static ArrayList<StationLine> l(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList<StationLine> arrayList = new ArrayList<>();
        for (String stationLine : split) {
            arrayList.add(new StationLine(stationLine, false));
        }
        return arrayList;
    }

    public static List<AnnouncementListItem> m(List<z1.a> list, List<LineForStation> list2) {
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            for (z1.a next : list) {
                Iterator<LineForStation> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LineForStation next2 = it.next();
                    if (next.getLineNumber().equals(next2.getLine_number_for_display())) {
                        arrayList.add(new AnnouncementListItem(next, next2.getLine_type_color_active(), next2.getLine_type()));
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
