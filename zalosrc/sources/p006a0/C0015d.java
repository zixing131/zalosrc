package p006a0;

import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Handler;
import com.zing.zalo.C8914g;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.SensitiveDataException;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import pm0.C24848g0;

/* renamed from: a0.d */
/* loaded from: classes2.dex */
public final class C0015d {

    /* renamed from: a */
    private LocationManager f30a;

    /* renamed from: b */
    private SensitiveData f31b;

    public C0015d(LocationManager locationManager, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(locationManager, "manager");
        this.f30a = locationManager;
        this.f31b = sensitiveData;
        m21k();
    }

    /* renamed from: h */
    private final boolean m19h(LocationListener locationListener) {
        m21k();
        SensitiveData sensitiveData = this.f31b;
        if (sensitiveData != null) {
            C8937j0.m47659h().m47587d(sensitiveData, locationListener);
            return true;
        }
        return true;
    }

    /* renamed from: i */
    private final boolean m20i(LocationListener locationListener) {
        C8914g.Companion.m47589a().m47586b(locationListener);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:            if (r0.m35528c().length() == 0) goto L6;     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m21k() {
        String str;
        SensitiveData sensitiveData = this.f31b;
        if (sensitiveData != null) {
            AbstractC19074t.m100205c(sensitiveData);
        }
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        new Exception("Access sensitive location data without define sourceId").printStackTrace();
        aVar.mo104551d(String.valueOf(C24848g0.f119245a), new Object[0]);
        this.f31b = new SensitiveData("unknown", "unknown", null, 4, null);
        SensitiveData sensitiveData2 = this.f31b;
        String str2 = null;
        if (sensitiveData2 != null) {
            str = sensitiveData2.m35528c();
        } else {
            str = null;
        }
        if (!C8937j0.m47663l(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SourceId ");
            SensitiveData sensitiveData3 = this.f31b;
            if (sensitiveData3 != null) {
                str2 = sensitiveData3.m35528c();
            }
            sb2.append(str2);
            sb2.append(" does not have permission to access sensitive location data");
            throw new SensitiveDataException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final boolean m22a(GpsStatus.Listener listener) {
        return this.f30a.addGpsStatusListener(listener);
    }

    /* renamed from: b */
    public final Location m23b(String str) {
        AbstractC19074t.m100208f(str, "provider");
        return this.f30a.getLastKnownLocation(str);
    }

    /* renamed from: c */
    public final boolean m24c(String str) {
        AbstractC19074t.m100208f(str, "provider");
        return this.f30a.isProviderEnabled(str);
    }

    /* renamed from: d */
    public final boolean m25d(GnssStatus.Callback callback, Handler handler) {
        boolean registerGnssStatusCallback;
        AbstractC19074t.m100208f(callback, "callback");
        registerGnssStatusCallback = this.f30a.registerGnssStatusCallback(callback, handler);
        return registerGnssStatusCallback;
    }

    /* renamed from: e */
    public final void m26e(GpsStatus.Listener listener) {
        this.f30a.removeGpsStatusListener(listener);
    }

    /* renamed from: f */
    public final void m27f(LocationListener locationListener) {
        AbstractC19074t.m100208f(locationListener, "listener");
        if (!m20i(locationListener)) {
            return;
        }
        this.f30a.removeUpdates(locationListener);
    }

    /* renamed from: g */
    public final void m28g(String str, long j11, float f11, LocationListener locationListener) {
        AbstractC19074t.m100208f(str, "provider");
        AbstractC19074t.m100208f(locationListener, "listener");
        if (!m19h(locationListener)) {
            return;
        }
        this.f30a.requestLocationUpdates(str, j11, f11, locationListener);
    }

    /* renamed from: j */
    public final void m29j(GnssStatus.Callback callback) {
        AbstractC19074t.m100208f(callback, "callback");
        this.f30a.unregisterGnssStatusCallback(callback);
    }
}
