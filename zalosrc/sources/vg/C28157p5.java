package vg;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import android.text.TextUtils;
import bf0.C2793a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import im.C20612c;
import java.util.List;
import me0.AbstractC23034c6;
import p006a0.C0015d;

/* renamed from: vg.p5 */
/* loaded from: classes.dex */
public class C28157p5 {

    /* renamed from: d */
    public static final /* synthetic */ int f131230d = 0;

    /* renamed from: b */
    Location f131232b;

    /* renamed from: c */
    LocationListener f131233c = new a();

    /* renamed from: a */
    LocationManager f131231a = (LocationManager) MainApplication.getAppContext().getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.p5$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC28044d7 {
        a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null) {
                try {
                    if (location.getAccuracy() <= 10000.0f) {
                        int i11 = C28157p5.f131230d;
                        new StringBuilder("Passive provider location: ").append(location);
                        C28157p5.m141667d().m141676k("PASSIVE---PROVIDER---UPDATE---NEW---LOCATION:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime());
                        C28157p5.this.m141677l(location);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: vg.p5$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private static final C28157p5 f131235a = new C28157p5();
    }

    C28157p5() {
    }

    /* renamed from: d */
    public static C28157p5 m141667d() {
        return b.f131235a;
    }

    /* renamed from: f */
    public static boolean m141668f(Location location, Location location2) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if (location2 != null) {
            try {
                long time = location.getTime() - location2.getTime();
                if (time > 120000) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (time < -120000) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (time > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z11) {
                    return true;
                }
                if (z12) {
                    return false;
                }
                int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
                if (accuracy > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (accuracy < 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (accuracy > 200) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean m141669h = m141669h(location.getProvider(), location2.getProvider());
                if (z15) {
                    return true;
                }
                if (z13 && !z14) {
                    return true;
                }
                if (z13 && m141669h && !z16) {
                    return true;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return true;
    }

    /* renamed from: h */
    static boolean m141669h(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: i */
    public static boolean m141670i(Location location) {
        if (location != null && location.getTime() != 0 && ((location.getLatitude() != 0.0d || location.getLongitude() != 0.0d) && location.hasAccuracy())) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public /* synthetic */ void m141671j() {
        try {
            if (AbstractC23034c6.m118165m(MainApplication.getAppContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                C0015d c0015d = new C0015d(this.f131231a, new SensitiveData("auto_submit_location", "auto_submit"));
                c0015d.m27f(this.f131233c);
                c0015d.m28g("passive", 0L, 0.0f, this.f131233c);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    Location m141672b(long j11) {
        Location location;
        try {
            List<String> providers = this.f131231a.getProviders(true);
            if (providers != null && providers.size() > 0) {
                location = null;
                for (String str : providers) {
                    try {
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (!TextUtils.equals(str, "gps") && !TextUtils.equals(str, "network")) {
                    }
                    Location lastKnownLocation = this.f131231a.getLastKnownLocation(str);
                    if (lastKnownLocation != null && m141670i(lastKnownLocation) && m141668f(lastKnownLocation, location)) {
                        location = lastKnownLocation;
                    }
                }
            } else {
                location = null;
            }
            if (location != null && System.currentTimeMillis() - location.getTime() < j11) {
                if (location.getAccuracy() <= 10000.0f) {
                    return location;
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return null;
    }

    /* renamed from: c */
    public Location m141673c() {
        try {
            Location location = this.f131232b;
            if (location != null) {
                m141667d().m141676k("GET---LOCATION---FROM---CACHED");
                return location;
            }
            Location m141672b = m141672b(60000L);
            if (m141672b != null) {
                m141667d().m141676k("GET---LOCATION---CACHED---RETURN---FROM----BESTLASTKOWN:---LONGITUDE---" + m141672b.getLongitude() + "---LATITUDE---" + m141672b.getLatitude() + "---TIME---" + m141672b.getTime());
                return m141672b;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public void m141674e() {
        new Handler(C2793a.f11144a.m13457b()).post(new Runnable() { // from class: vg.o5
            public /* synthetic */ RunnableC28148o5() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28157p5.this.m141671j();
            }
        });
    }

    /* renamed from: g */
    public boolean m141675g() {
        LocationManager locationManager = this.f131231a;
        if (locationManager != null && locationManager.isProviderEnabled("gps")) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m141676k(String str) {
    }

    /* renamed from: l */
    public void m141677l(Location location) {
        Object obj;
        String str;
        try {
            synchronized (this) {
                try {
                    Location location2 = this.f131232b;
                    if (location2 != null) {
                        if (location != null) {
                            if (m141668f(location, location2)) {
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("set network location: ");
                    if (location != null) {
                        obj = location;
                    } else {
                        obj = "";
                    }
                    sb2.append(obj);
                    if (location == null) {
                        str = "setCachedLocation---NULL";
                    } else {
                        str = "SET---NEW---LOCATION--FOR---CACHED:---LONGITUDE---" + location.getLongitude() + "---LATITUDE---" + location.getLatitude() + "---TIME---" + location.getTime();
                    }
                    m141676k(str);
                    this.f131232b = location;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m141678m(C20612c c20612c) {
        Location m141673c;
        if (c20612c != null && (m141673c = m141673c()) != null) {
            c20612c.m107261C(m141673c.getLatitude());
            c20612c.m107263E(m141673c.getLongitude());
        }
    }
}
