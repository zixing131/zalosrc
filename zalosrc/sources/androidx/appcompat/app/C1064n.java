package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.AbstractC1391d;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.n */
/* loaded from: classes2.dex */
class C1064n {

    /* renamed from: d */
    private static C1064n f3866d;

    /* renamed from: a */
    private final Context f3867a;

    /* renamed from: b */
    private final LocationManager f3868b;

    /* renamed from: c */
    private final a f3869c = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.n$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        boolean f3870a;

        /* renamed from: b */
        long f3871b;

        /* renamed from: c */
        long f3872c;

        /* renamed from: d */
        long f3873d;

        /* renamed from: e */
        long f3874e;

        /* renamed from: f */
        long f3875f;

        a() {
        }
    }

    C1064n(Context context, LocationManager locationManager) {
        this.f3867a = context;
        this.f3868b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1064n m4924a(Context context) {
        if (f3866d == null) {
            Context applicationContext = context.getApplicationContext();
            f3866d = new C1064n(applicationContext, (LocationManager) applicationContext.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION));
        }
        return f3866d;
    }

    /* renamed from: b */
    private Location m4925b() {
        Location location;
        Location location2 = null;
        if (AbstractC1391d.m6999b(this.f3867a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            location = m4926c("network");
        } else {
            location = null;
        }
        if (AbstractC1391d.m6999b(this.f3867a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location2 = m4926c("gps");
        }
        if (location2 != null && location != null) {
            if (location2.getTime() > location.getTime()) {
                return location2;
            }
            return location;
        }
        if (location2 != null) {
            return location2;
        }
        return location;
    }

    /* renamed from: c */
    private Location m4926c(String str) {
        try {
            if (this.f3868b.isProviderEnabled(str)) {
                return this.f3868b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private boolean m4927e() {
        if (this.f3869c.f3875f > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m4928f(Location location) {
        boolean z11;
        long j11;
        long j12;
        a aVar = this.f3869c;
        long currentTimeMillis = System.currentTimeMillis();
        C1063m m4922b = C1063m.m4922b();
        m4922b.m4923a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j13 = m4922b.f3863a;
        m4922b.m4923a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        if (m4922b.f3865c == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j14 = m4922b.f3864b;
        long j15 = m4922b.f3863a;
        boolean z12 = z11;
        m4922b.m4923a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j16 = m4922b.f3864b;
        if (j14 != -1 && j15 != -1) {
            if (currentTimeMillis > j15) {
                j12 = j16;
            } else if (currentTimeMillis > j14) {
                j12 = j15;
            } else {
                j12 = j14;
            }
            j11 = j12 + 60000;
        } else {
            j11 = 43200000 + currentTimeMillis;
        }
        aVar.f3870a = z12;
        aVar.f3871b = j13;
        aVar.f3872c = j14;
        aVar.f3873d = j15;
        aVar.f3874e = j16;
        aVar.f3875f = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m4929d() {
        a aVar = this.f3869c;
        if (m4927e()) {
            return aVar.f3870a;
        }
        Location m4925b = m4925b();
        if (m4925b != null) {
            m4928f(m4925b);
            return aVar.f3870a;
        }
        int i11 = Calendar.getInstance().get(11);
        if (i11 >= 6 && i11 < 22) {
            return false;
        }
        return true;
    }
}
