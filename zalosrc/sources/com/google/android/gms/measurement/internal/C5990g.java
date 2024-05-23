package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p229i5.AbstractC20297r;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.measurement.internal.g */
/* loaded from: classes.dex */
public final class C5990g extends AbstractC6051l5 {

    /* renamed from: b */
    private Boolean f34007b;

    /* renamed from: c */
    private InterfaceC5979f f34008c;

    /* renamed from: d */
    private Boolean f34009d;

    public C5990g(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34008c = C5968e.f33868a;
    }

    /* renamed from: I */
    public static final long m30909I() {
        return ((Long) AbstractC5972e3.f33917f.m30827a(null)).longValue();
    }

    /* renamed from: h */
    public static final long m30910h() {
        return ((Long) AbstractC5972e3.f33882F.m30827a(null)).longValue();
    }

    /* renamed from: i */
    private final String m30911i(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC4205o.m19722k(str3);
            return str3;
        } catch (ClassNotFoundException e11) {
            this.f34158a.mo31033c().m31197q().m31109b("Could not find SystemProperties class", e11);
            return "";
        } catch (IllegalAccessException e12) {
            this.f34158a.mo31033c().m31197q().m31109b("Could not access SystemProperties.get()", e12);
            return "";
        } catch (NoSuchMethodException e13) {
            this.f34158a.mo31033c().m31197q().m31109b("Could not find SystemProperties.get() method", e13);
            return "";
        } catch (InvocationTargetException e14) {
            this.f34158a.mo31033c().m31197q().m31109b("SystemProperties.get() threw an exception", e14);
            return "";
        }
    }

    /* renamed from: A */
    public final boolean m30912A() {
        Boolean m30929s = m30929s("google_analytics_adid_collection_enabled");
        if (m30929s != null && !m30929s.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m30913B(String str, C5961d3 c5961d3) {
        if (str == null) {
            return ((Boolean) c5961d3.m30827a(null)).booleanValue();
        }
        String mo30834d = this.f34008c.mo30834d(str, c5961d3.m30828b());
        if (TextUtils.isEmpty(mo30834d)) {
            return ((Boolean) c5961d3.m30827a(null)).booleanValue();
        }
        return ((Boolean) c5961d3.m30827a(Boolean.valueOf("1".equals(mo30834d)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean m30914C(String str) {
        return "1".equals(this.f34008c.mo30834d(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean m30915D() {
        Boolean m30929s = m30929s("google_analytics_automatic_screen_reporting_enabled");
        if (m30929s != null && !m30929s.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m30916E() {
        this.f34158a.mo31035f();
        Boolean m30929s = m30929s("firebase_analytics_collection_deactivated");
        if (m30929s != null && m30929s.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m30917F(String str) {
        return "1".equals(this.f34008c.mo30834d(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: G */
    public final boolean m30918G() {
        if (this.f34007b == null) {
            Boolean m30929s = m30929s("app_measurement_lite");
            this.f34007b = m30929s;
            if (m30929s == null) {
                this.f34007b = Boolean.FALSE;
            }
        }
        if (!this.f34007b.booleanValue() && this.f34158a.m31398r()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m30919H() {
        if (this.f34009d == null) {
            synchronized (this) {
                try {
                    if (this.f34009d == null) {
                        ApplicationInfo applicationInfo = this.f34158a.mo31032b().getApplicationInfo();
                        String m105960a = AbstractC20297r.m105960a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z11 = false;
                            if (str != null && str.equals(m105960a)) {
                                z11 = true;
                            }
                            this.f34009d = Boolean.valueOf(z11);
                        }
                        if (this.f34009d == null) {
                            this.f34009d = Boolean.TRUE;
                            this.f34158a.mo31033c().m31197q().m31108a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f34009d.booleanValue();
    }

    /* renamed from: j */
    public final double m30920j(String str, C5961d3 c5961d3) {
        if (str == null) {
            return ((Double) c5961d3.m30827a(null)).doubleValue();
        }
        String mo30834d = this.f34008c.mo30834d(str, c5961d3.m30828b());
        if (TextUtils.isEmpty(mo30834d)) {
            return ((Double) c5961d3.m30827a(null)).doubleValue();
        }
        try {
            return ((Double) c5961d3.m30827a(Double.valueOf(Double.parseDouble(mo30834d)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c5961d3.m30827a(null)).doubleValue();
        }
    }

    /* renamed from: k */
    public final int m30921k(String str) {
        return m30925o(str, AbstractC5972e3.f33890J, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE, ZAbstractBase.ZVU_PROCESS_FLUSH);
    }

    /* renamed from: l */
    public final int m30922l() {
        if (this.f34158a.m31381N().m31338X(201500000, true)) {
            return 100;
        }
        return 25;
    }

    /* renamed from: m */
    public final int m30923m(String str) {
        return m30925o(str, AbstractC5972e3.f33891K, 25, 100);
    }

    /* renamed from: n */
    public final int m30924n(String str, C5961d3 c5961d3) {
        if (str == null) {
            return ((Integer) c5961d3.m30827a(null)).intValue();
        }
        String mo30834d = this.f34008c.mo30834d(str, c5961d3.m30828b());
        if (TextUtils.isEmpty(mo30834d)) {
            return ((Integer) c5961d3.m30827a(null)).intValue();
        }
        try {
            return ((Integer) c5961d3.m30827a(Integer.valueOf(Integer.parseInt(mo30834d)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c5961d3.m30827a(null)).intValue();
        }
    }

    /* renamed from: o */
    public final int m30925o(String str, C5961d3 c5961d3, int i11, int i12) {
        return Math.max(Math.min(m30924n(str, c5961d3), i12), i11);
    }

    /* renamed from: p */
    public final long m30926p() {
        this.f34158a.mo31035f();
        return 76003L;
    }

    /* renamed from: q */
    public final long m30927q(String str, C5961d3 c5961d3) {
        if (str == null) {
            return ((Long) c5961d3.m30827a(null)).longValue();
        }
        String mo30834d = this.f34008c.mo30834d(str, c5961d3.m30828b());
        if (TextUtils.isEmpty(mo30834d)) {
            return ((Long) c5961d3.m30827a(null)).longValue();
        }
        try {
            return ((Long) c5961d3.m30827a(Long.valueOf(Long.parseLong(mo30834d)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c5961d3.m30827a(null)).longValue();
        }
    }

    /* renamed from: r */
    final Bundle m30928r() {
        try {
            if (this.f34158a.mo31032b().getPackageManager() == null) {
                this.f34158a.mo31033c().m31197q().m31108a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m111061c = C21472e.m111067a(this.f34158a.mo31032b()).m111061c(this.f34158a.mo31032b().getPackageName(), 128);
            if (m111061c == null) {
                this.f34158a.mo31033c().m31197q().m31108a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return m111061c.metaData;
        } catch (PackageManager.NameNotFoundException e11) {
            this.f34158a.mo31033c().m31197q().m31109b("Failed to load metadata: Package name not found", e11);
            return null;
        }
    }

    /* renamed from: s */
    public final Boolean m30929s(String str) {
        AbstractC4205o.m19718g(str);
        Bundle m30928r = m30928r();
        if (m30928r == null) {
            this.f34158a.mo31033c().m31197q().m31108a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!m30928r.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(m30928r.getBoolean(str));
    }

    /* renamed from: t */
    public final String m30930t() {
        return m30911i("debug.firebase.analytics.app", "");
    }

    /* renamed from: u */
    public final String m30931u() {
        return m30911i("debug.deferred.deeplink", "");
    }

    /* renamed from: w */
    public final String m30932w() {
        this.f34158a.mo31035f();
        return "FA";
    }

    /* renamed from: x */
    public final String m30933x(String str, C5961d3 c5961d3) {
        if (str == null) {
            return (String) c5961d3.m30827a(null);
        }
        return (String) c5961d3.m30827a(this.f34008c.mo30834d(str, c5961d3.m30828b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m30934y(String str) {
        Integer valueOf;
        AbstractC4205o.m19718g("analytics.safelisted_events");
        Bundle m30928r = m30928r();
        if (m30928r == null) {
            this.f34158a.mo31033c().m31197q().m31108a("Failed to load metadata: Metadata bundle is null");
        } else if (m30928r.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(m30928r.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = this.f34158a.mo31032b().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e11) {
                    this.f34158a.mo31033c().m31197q().m31109b("Failed to load string array from metadata: resource not found", e11);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    /* renamed from: z */
    public final void m30935z(InterfaceC5979f interfaceC5979f) {
        this.f34008c = interfaceC5979f;
    }
}
