package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p230i6.AbstractC20332x;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
/* loaded from: classes.dex */
public final class C5976e7 extends AbstractC6148u3 {

    /* renamed from: c */
    private volatile C6184x6 f33969c;

    /* renamed from: d */
    private volatile C6184x6 f33970d;

    /* renamed from: e */
    protected C6184x6 f33971e;

    /* renamed from: f */
    private final Map f33972f;

    /* renamed from: g */
    private Activity f33973g;

    /* renamed from: h */
    private volatile boolean f33974h;

    /* renamed from: i */
    private volatile C6184x6 f33975i;

    /* renamed from: j */
    private C6184x6 f33976j;

    /* renamed from: k */
    private boolean f33977k;

    /* renamed from: l */
    private final Object f33978l;

    public C5976e7(C6127s4 c6127s4) {
        super(c6127s4);
        this.f33978l = new Object();
        this.f33972f = new ConcurrentHashMap();
    }

    /* renamed from: F */
    private final C6184x6 m30838F(Activity activity) {
        AbstractC4205o.m19722k(activity);
        C6184x6 c6184x6 = (C6184x6) this.f33972f.get(activity);
        if (c6184x6 == null) {
            C6184x6 c6184x62 = new C6184x6(null, m30855s(activity.getClass(), "Activity"), this.f34158a.m31381N().m31354t0());
            this.f33972f.put(activity, c6184x62);
            c6184x6 = c6184x62;
        }
        if (this.f33975i != null) {
            return this.f33975i;
        }
        return c6184x6;
    }

    /* renamed from: G */
    private final void m30839G(Activity activity, C6184x6 c6184x6, boolean z11) {
        C6184x6 c6184x62;
        C6184x6 c6184x63;
        String str;
        if (this.f33969c == null) {
            c6184x62 = this.f33970d;
        } else {
            c6184x62 = this.f33969c;
        }
        C6184x6 c6184x64 = c6184x62;
        if (c6184x6.f34590b == null) {
            if (activity != null) {
                str = m30855s(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            c6184x63 = new C6184x6(c6184x6.f34589a, str, c6184x6.f34591c, c6184x6.f34593e, c6184x6.f34594f);
        } else {
            c6184x63 = c6184x6;
        }
        this.f33970d = this.f33969c;
        this.f33969c = c6184x63;
        this.f34158a.mo31037v().m31296z(new RunnableC6206z6(this, c6184x63, c6184x64, this.f34158a.mo31031a().mo105914b(), z11));
    }

    /* renamed from: n */
    public final void m30840n(C6184x6 c6184x6, C6184x6 c6184x62, long j11, boolean z11, Bundle bundle) {
        boolean z12;
        Bundle bundle2;
        String str;
        long j12;
        long j13;
        mo31036g();
        boolean z13 = false;
        if (c6184x62 == null || c6184x62.f34591c != c6184x6.f34591c || !AbstractC20332x.m106029a(c6184x62.f34590b, c6184x6.f34590b) || !AbstractC20332x.m106029a(c6184x62.f34589a, c6184x6.f34589a)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && this.f33971e != null) {
            z13 = true;
        }
        if (z12) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            C6121r9.m31314y(c6184x6, bundle3, true);
            if (c6184x62 != null) {
                String str2 = c6184x62.f34589a;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = c6184x62.f34590b;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", c6184x62.f34591c);
            }
            if (z13) {
                C6131s8 c6131s8 = this.f34158a.m31380M().f34521e;
                long j14 = j11 - c6131s8.f34473b;
                c6131s8.f34473b = j11;
                if (j14 > 0) {
                    this.f34158a.m31381N().m31357w(bundle3, j14);
                }
            }
            if (!this.f34158a.m31401z().m30915D()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != c6184x6.f34593e) {
                str = "auto";
            } else {
                str = "app";
            }
            String str4 = str;
            long mo105913a = this.f34158a.mo31031a().mo105913a();
            if (c6184x6.f34593e) {
                j12 = mo105913a;
                long j15 = c6184x6.f34594f;
                if (j15 != 0) {
                    j13 = j15;
                    this.f34158a.m31376I().m31441u(str4, "_vs", j13, bundle3);
                }
            } else {
                j12 = mo105913a;
            }
            j13 = j12;
            this.f34158a.m31376I().m31441u(str4, "_vs", j13, bundle3);
        }
        if (z13) {
            m30841o(this.f33971e, true, j11);
        }
        this.f33971e = c6184x6;
        if (c6184x6.f34593e) {
            this.f33976j = c6184x6;
        }
        this.f34158a.m31379L().m30887t(c6184x6);
    }

    /* renamed from: o */
    public final void m30841o(C6184x6 c6184x6, boolean z11, long j11) {
        boolean z12;
        this.f34158a.m31400y().m31483m(this.f34158a.mo31031a().mo105914b());
        if (c6184x6 != null && c6184x6.f34592d) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f34158a.m31380M().f34521e.m31449d(z12, z11, j11) && c6184x6 != null) {
            c6184x6.f34592d = false;
        }
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m30845w(C5976e7 c5976e7, Bundle bundle, C6184x6 c6184x6, C6184x6 c6184x62, long j11) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c5976e7.m30840n(c6184x6, c6184x62, j11, true, c5976e7.f34158a.m31381N().m31360x0(null, "screen_view", bundle, null, false));
    }

    /* renamed from: A */
    public final void m30847A(Activity activity) {
        synchronized (this.f33978l) {
            this.f33977k = false;
            this.f33974h = true;
        }
        long mo105914b = this.f34158a.mo31031a().mo105914b();
        if (!this.f34158a.m31401z().m30915D()) {
            this.f33969c = null;
            this.f34158a.mo31037v().m31296z(new RunnableC5941b7(this, mo105914b));
        } else {
            C6184x6 m30838F = m30838F(activity);
            this.f33970d = this.f33969c;
            this.f33969c = null;
            this.f34158a.mo31037v().m31296z(new RunnableC5953c7(this, m30838F, mo105914b));
        }
    }

    /* renamed from: B */
    public final void m30848B(Activity activity) {
        synchronized (this.f33978l) {
            this.f33977k = true;
            if (activity != this.f33973g) {
                synchronized (this.f33978l) {
                    this.f33973g = activity;
                    this.f33974h = false;
                }
                if (this.f34158a.m31401z().m30915D()) {
                    this.f33975i = null;
                    this.f34158a.mo31037v().m31296z(new RunnableC5965d7(this));
                }
            }
        }
        if (!this.f34158a.m31401z().m30915D()) {
            this.f33969c = this.f33975i;
            this.f34158a.mo31037v().m31296z(new RunnableC5929a7(this));
        } else {
            m30839G(activity, m30838F(activity), false);
            C6179x1 m31400y = this.f34158a.m31400y();
            m31400y.f34158a.mo31037v().m31296z(new RunnableC6167w0(m31400y, m31400y.f34158a.mo31031a().mo105914b()));
        }
    }

    /* renamed from: C */
    public final void m30849C(Activity activity, Bundle bundle) {
        C6184x6 c6184x6;
        if (!this.f34158a.m31401z().m30915D() || bundle == null || (c6184x6 = (C6184x6) this.f33972f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c6184x6.f34591c);
        bundle2.putString("name", c6184x6.f34589a);
        bundle2.putString("referrer_name", c6184x6.f34590b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:            if (r1 <= 100) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:            if (r1 <= 100) goto L84;     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m30850D(Activity activity, String str, String str2) {
        String str3;
        if (!this.f34158a.m31401z().m30915D()) {
            this.f34158a.mo31033c().m31203x().m31108a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C6184x6 c6184x6 = this.f33969c;
        if (c6184x6 == null) {
            this.f34158a.mo31033c().m31203x().m31108a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f33972f.get(activity) == null) {
            this.f34158a.mo31033c().m31203x().m31108a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m30855s(activity.getClass(), "Activity");
        }
        boolean m106029a = AbstractC20332x.m106029a(c6184x6.f34590b, str2);
        boolean m106029a2 = AbstractC20332x.m106029a(c6184x6.f34589a, str);
        if (m106029a && m106029a2) {
            this.f34158a.mo31033c().m31203x().m31108a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                this.f34158a.m31401z();
            }
            this.f34158a.mo31033c().m31203x().m31109b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                this.f34158a.m31401z();
            }
            this.f34158a.mo31033c().m31203x().m31109b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        C6060m3 m31201u = this.f34158a.mo31033c().m31201u();
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        m31201u.m31110c("Setting current screen to name, class", str3, str2);
        C6184x6 c6184x62 = new C6184x6(str, str2, this.f34158a.m31381N().m31354t0());
        this.f33972f.put(activity, c6184x62);
        m30839G(activity, c6184x62, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:            if (r2 > 100) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:            if (r4 > 100) goto L88;     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m30851E(Bundle bundle, long j11) {
        String str;
        String str2;
        String str3;
        C6184x6 c6184x6;
        String str4;
        synchronized (this.f33978l) {
            try {
                if (!this.f33977k) {
                    this.f34158a.mo31033c().m31203x().m31108a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        this.f34158a.m31401z();
                    }
                    this.f34158a.mo31033c().m31203x().m31109b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        this.f34158a.m31401z();
                    }
                    this.f34158a.mo31033c().m31203x().m31109b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    Activity activity = this.f33973g;
                    if (activity != null) {
                        str4 = m30855s(activity.getClass(), "Activity");
                    } else {
                        str4 = "Activity";
                    }
                    str = str4;
                } else {
                    str = string2;
                }
                C6184x6 c6184x62 = this.f33969c;
                if (this.f33974h && c6184x62 != null) {
                    this.f33974h = false;
                    boolean m106029a = AbstractC20332x.m106029a(c6184x62.f34590b, str);
                    boolean m106029a2 = AbstractC20332x.m106029a(c6184x62.f34589a, string);
                    if (m106029a && m106029a2) {
                        this.f34158a.mo31033c().m31203x().m31108a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C6060m3 m31201u = this.f34158a.mo31033c().m31201u();
                if (string == null) {
                    str2 = "null";
                } else {
                    str2 = string;
                }
                if (str == null) {
                    str3 = "null";
                } else {
                    str3 = str;
                }
                m31201u.m31110c("Logging screen view with name, class", str2, str3);
                if (this.f33969c == null) {
                    c6184x6 = this.f33970d;
                } else {
                    c6184x6 = this.f33969c;
                }
                C6184x6 c6184x63 = new C6184x6(string, str, this.f34158a.m31381N().m31354t0(), true, j11);
                this.f33969c = c6184x63;
                this.f33970d = c6184x6;
                this.f33975i = c6184x63;
                this.f34158a.mo31037v().m31296z(new RunnableC6195y6(this, bundle, c6184x63, c6184x6, this.f34158a.mo31031a().mo105914b()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6148u3
    /* renamed from: m */
    protected final boolean mo30852m() {
        return false;
    }

    /* renamed from: q */
    public final C6184x6 m30853q() {
        return this.f33969c;
    }

    /* renamed from: r */
    public final C6184x6 m30854r(boolean z11) {
        m31455h();
        mo31036g();
        if (!z11) {
            return this.f33971e;
        }
        C6184x6 c6184x6 = this.f33971e;
        if (c6184x6 != null) {
            return c6184x6;
        }
        return this.f33976j;
    }

    /* renamed from: s */
    final String m30855s(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f34158a.m31401z();
        if (length2 > 100) {
            this.f34158a.m31401z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* renamed from: y */
    public final void m30856y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f34158a.m31401z().m30915D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f33972f.put(activity, new C6184x6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* renamed from: z */
    public final void m30857z(Activity activity) {
        synchronized (this.f33978l) {
            try {
                if (activity == this.f33973g) {
                    this.f33973g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f34158a.m31401z().m30915D()) {
            return;
        }
        this.f33972f.remove(activity);
    }
}
