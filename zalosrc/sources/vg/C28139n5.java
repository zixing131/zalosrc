package vg;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.location.EnumC8996x;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p087d0.C17686c;
import p348mi.AbstractC23309i;
import vg.AbstractC28248z6;
import z20.AbstractC31195a;

/* renamed from: vg.n5 */
/* loaded from: classes3.dex */
public final class C28139n5 {

    /* renamed from: n */
    static final String f131165n = Location.class.getSimpleName();

    /* renamed from: o */
    private static int f131166o = -1;

    /* renamed from: p */
    private static int f131167p = -1;

    /* renamed from: q */
    private static int f131168q = -1;

    /* renamed from: r */
    private static volatile C28139n5 f131169r;

    /* renamed from: g */
    float f131176g;

    /* renamed from: a */
    double f131170a = 0.0d;

    /* renamed from: b */
    double f131171b = 0.0d;

    /* renamed from: c */
    int f131172c = 0;

    /* renamed from: d */
    int f131173d = 0;

    /* renamed from: e */
    int f131174e = 0;

    /* renamed from: f */
    int f131175f = 0;

    /* renamed from: h */
    int f131177h = 0;

    /* renamed from: i */
    long f131178i = 0;

    /* renamed from: j */
    public String f131179j = null;

    /* renamed from: k */
    int f131180k = 0;

    /* renamed from: l */
    double f131181l = 0.0d;

    /* renamed from: m */
    double f131182m = 0.0d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.n5$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC28248z6.f {
        a() {
        }

        @Override // vg.AbstractC28248z6.f
        /* renamed from: a */
        public void mo40758a(Location location, int i11) {
            C28139n5.this.m141629G();
            C28139n5.this.m141651z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.n5$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = C28139n5.f131165n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onErrorData:");
            sb2.append(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = C28139n5.f131165n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onDataProcessed:");
            sb2.append(obj);
            AbstractC23309i.m121214Mx(EnumC8996x.TIME_INTERVAL);
        }
    }

    private C28139n5() {
    }

    /* renamed from: j */
    public static synchronized C28139n5 m141620j() {
        C28139n5 c28139n5;
        synchronized (C28139n5.class) {
            try {
                if (f131169r == null) {
                    synchronized (C28139n5.class) {
                        try {
                            if (f131169r == null) {
                                f131169r = new C28139n5();
                            }
                        } finally {
                        }
                    }
                }
                c28139n5 = f131169r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28139n5;
    }

    /* renamed from: w */
    public static boolean m141621w(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            if (!isProviderEnabled && !isProviderEnabled2) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m141622y() {
        int i11;
        JSONObject m152000e;
        try {
            if (!AbstractC23309i.m121368R2() || !AbstractC31195a.m152001f(this.f131171b, this.f131170a)) {
                return;
            }
            float m151996a = AbstractC31195a.m151996a(this.f131171b, this.f131170a, this.f131181l, this.f131182m);
            List m151998c = AbstractC31195a.m151998c(MainApplication.getAppContext(), this.f131170a, this.f131171b, 5);
            if (m151998c != null) {
                i11 = m151998c.size();
            } else {
                i11 = 0;
            }
            if ((m151996a >= 100.0f || i11 != this.f131180k) && (m152000e = AbstractC31195a.m152000e(this.f131171b, this.f131170a, m151998c)) != null) {
                AbstractC23059e9.m118340s(m152000e.toString());
                this.f131180k = i11;
                this.f131181l = this.f131171b;
                this.f131182m = this.f131170a;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: A */
    public void m141623A() {
        f131166o = -1;
        f131167p = -1;
        f131168q = -1;
        this.f131179j = null;
    }

    /* renamed from: B */
    public void m141624B(int i11) {
        f131168q = i11;
    }

    /* renamed from: C */
    public void m141625C(int i11) {
        f131167p = i11;
    }

    /* renamed from: D */
    public void m141626D(int i11) {
        f131166o = i11;
    }

    /* renamed from: E */
    public void m141627E(String str) {
        this.f131179j = str;
    }

    /* renamed from: F */
    public void m141628F(double d11, double d12, int i11, long j11, float f11) {
        this.f131170a = d11;
        this.f131171b = d12;
        this.f131177h = i11;
        this.f131178i = j11;
        this.f131176g = f11;
    }

    /* renamed from: G */
    void m141629G() {
        try {
            if (C23055e5.m118271f()) {
                m141620j().m141636h();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b());
                if (this.f131170a != 0.0d && this.f131171b != 0.0d) {
                    AbstractC20110a.m104535d("submitLocation: " + EnumC8996x.m48092c(AbstractC23309i.m122537wc()), new Object[0]);
                    SensitiveData sensitiveData = new SensitiveData("wifi_get_connection_info_on_submit_location", "auto_submit");
                    c0766k.m1881z0(this.f131170a, this.f131171b, "" + this.f131172c, m141648u(sensitiveData), "" + this.f131173d, "" + this.f131174e, "" + this.f131175f, m141643p(), this.f131178i);
                    String valueOf = String.valueOf(this.f131171b);
                    String valueOf2 = String.valueOf(this.f131170a);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lon", valueOf2);
                    jSONObject.put("lat", valueOf);
                    AbstractC23309i.m121246Ns(jSONObject.toString());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public int m141630b() {
        return f131167p;
    }

    /* renamed from: c */
    public int m141631c() {
        return f131168q;
    }

    /* renamed from: d */
    public int m141632d() {
        return f131166o;
    }

    /* renamed from: e */
    public void m141633e() {
        new C28239y6().m142225f(MainApplication.getAppContext(), new a(), new SensitiveData("auto_submit_location", "auto_submit"));
    }

    /* renamed from: f */
    public float m141634f() {
        return this.f131176g;
    }

    /* renamed from: g */
    public boolean m141635g() {
        TelephonyManager telephonyManager;
        List<CellInfo> allCellInfo;
        int ci2;
        int tac;
        try {
            if (AbstractC23034c6.m118165m(MainApplication.getAppContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 && (telephonyManager = (TelephonyManager) MainApplication.getAppContext().getSystemService("phone")) != null && (allCellInfo = telephonyManager.getAllCellInfo()) != null && allCellInfo.size() != 0) {
                for (int i11 = 0; i11 < allCellInfo.size(); i11++) {
                    CellInfo cellInfo = allCellInfo.get(i11);
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoGsm) {
                            CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                            ci2 = cellIdentity.getCid();
                            tac = cellIdentity.getLac();
                        } else if (cellInfo instanceof CellInfoCdma) {
                            CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                            ci2 = cellIdentity2.getBasestationId();
                            tac = cellIdentity2.getSystemId();
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            CellIdentityWcdma cellIdentity3 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                            ci2 = cellIdentity3.getCid();
                            tac = cellIdentity3.getLac();
                        } else {
                            if (!(cellInfo instanceof CellInfoLte)) {
                                return false;
                            }
                            CellIdentityLte cellIdentity4 = ((CellInfoLte) cellInfo).getCellIdentity();
                            ci2 = cellIdentity4.getCi();
                            tac = cellIdentity4.getTac();
                        }
                        this.f131172c = ci2 & 65535;
                        this.f131173d = tac;
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: h */
    public int m141636h() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) MainApplication.getAppContext().getSystemService("phone");
            GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
            int cid = gsmCellLocation.getCid() & 65535;
            this.f131172c = cid;
            this.f131173d = gsmCellLocation.getLac();
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator != null && networkOperator.length() > 0) {
                try {
                    this.f131174e = Integer.parseInt(networkOperator.substring(0, 3));
                    this.f131175f = Integer.parseInt(networkOperator);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
            return cid;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: i */
    public int m141637i() {
        return this.f131172c;
    }

    /* renamed from: k */
    public JSONObject m141638k() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            ArrayList m141641n = m141641n(MainApplication.getAppContext());
            for (int i11 = 0; i11 < m141641n.size(); i11++) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : ((HashMap) m141641n.get(i11)).keySet()) {
                    jSONObject2.put("package", str);
                    jSONObject2.put("running_service", ((HashMap) m141641n.get(i11)).get(str));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("allow_mock_location", m141650x(MainApplication.getAppContext()));
            jSONObject.put("use_gps", m141630b());
            jSONObject.put("has_gps_status_changed", m141632d());
            jSONObject.put("from_mock_provider", m141631c());
            jSONObject.put("mock_applications", jSONArray);
            return jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: l */
    public int m141639l() {
        return this.f131173d;
    }

    /* renamed from: m */
    public double m141640m() {
        return this.f131171b;
    }

    /* renamed from: n */
    ArrayList m141641n(Context context) {
        int i11;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        Iterator<ApplicationInfo> it = packageManager.getInstalledApplications(128).iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            ApplicationInfo next = it.next();
            try {
                String[] strArr = packageManager.getPackageInfo(next.packageName, 4096).requestedPermissions;
                if (strArr != null) {
                    while (i11 < strArr.length) {
                        if (strArr[i11].equals("android.permission.ACCESS_MOCK_LOCATION") && !next.packageName.equals(context.getPackageName())) {
                            HashMap hashMap = new HashMap();
                            String str = next.packageName;
                            hashMap.put(str, Integer.valueOf(m141649v(str) ? 1 : 0));
                            arrayList.add(hashMap);
                        }
                        i11++;
                    }
                }
            } catch (PackageManager.NameNotFoundException e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            HashMap hashMap2 = (HashMap) arrayList.get(i12);
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                if (((Integer) hashMap2.get((String) it2.next())).intValue() == 1) {
                    arrayList2.add(0, hashMap2);
                } else {
                    arrayList2.add(hashMap2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i11 < arrayList2.size() && i13 < 10; i13++) {
            arrayList3.add(arrayList2.get(i11));
            i11++;
        }
        return arrayList3;
    }

    /* renamed from: o */
    public int m141642o() {
        return this.f131177h;
    }

    /* renamed from: p */
    public String m141643p() {
        String str = this.f131179j;
        return str != null ? str : "";
    }

    /* renamed from: q */
    public long m141644q() {
        return this.f131178i;
    }

    /* renamed from: r */
    public double m141645r() {
        return this.f131170a;
    }

    /* renamed from: s */
    public int m141646s() {
        return this.f131174e;
    }

    /* renamed from: t */
    public int m141647t() {
        return this.f131175f;
    }

    /* renamed from: u */
    public String m141648u(SensitiveData sensitiveData) {
        try {
            WifiManager wifiManager = (WifiManager) MainApplication.getAppContext().getSystemService("wifi");
            if (wifiManager == null || !C8937j0.m47663l(sensitiveData.m35528c())) {
                return "";
            }
            String bssid = new C17686c(wifiManager, sensitiveData).m93678e().getBSSID();
            if (bssid == null) {
                return "";
            }
            return bssid;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: v */
    boolean m141649v(String str) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) MainApplication.getAppContext().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        for (int i11 = 0; i11 < runningServices.size(); i11++) {
            if (runningServices.get(i11).process.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    int m141650x(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return -1;
        }
        if (Settings.Secure.getString(context.getContentResolver(), "mock_location").equals("0")) {
            return 0;
        }
        return 1;
    }

    /* renamed from: z */
    public void m141651z() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.m5
            @Override // java.lang.Runnable
            public final void run() {
                C28139n5.this.m141622y();
            }
        });
    }
}
