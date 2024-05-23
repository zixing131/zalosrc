package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5378fd;
import com.google.android.gms.internal.measurement.C5598sc;
import com.google.android.gms.internal.measurement.C5617te;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p229i5.AbstractC20286g;
import p229i5.AbstractC20299t;
import p230i6.AbstractC20308b0;
import p230i6.AbstractC20324p;
import p230i6.AbstractC20325q;
import p230i6.AbstractC20327s;
import p230i6.C20307b;
import p230i6.EnumC20305a;
import p230i6.InterfaceC20328t;
import p230i6.InterfaceC20329u;
import p665y0.C30239a;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
/* loaded from: classes.dex */
public final class C6129s6 extends AbstractC6148u3 {

    /* renamed from: c */
    protected C6118r6 f34456c;

    /* renamed from: d */
    private InterfaceC20328t f34457d;

    /* renamed from: e */
    private final Set f34458e;

    /* renamed from: f */
    private boolean f34459f;

    /* renamed from: g */
    private final AtomicReference f34460g;

    /* renamed from: h */
    private final Object f34461h;

    /* renamed from: i */
    private C20307b f34462i;

    /* renamed from: j */
    private int f34463j;

    /* renamed from: k */
    private final AtomicLong f34464k;

    /* renamed from: l */
    private long f34465l;

    /* renamed from: m */
    private int f34466m;

    /* renamed from: n */
    final C6187x9 f34467n;

    /* renamed from: o */
    protected boolean f34468o;

    /* renamed from: p */
    private final InterfaceC6110q9 f34469p;

    public C6129s6(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34458e = new CopyOnWriteArraySet();
        this.f34461h = new Object();
        this.f34468o = true;
        this.f34469p = new C5997g6(this);
        this.f34460g = new AtomicReference();
        this.f34462i = new C20307b(null, null);
        this.f34463j = 100;
        this.f34465l = -1L;
        this.f34466m = 100;
        this.f34464k = new AtomicLong(0L);
        this.f34467n = new C6187x9(c6127s4);
    }

    /* renamed from: O */
    public final void m31402O(Boolean bool, boolean z11) {
        mo31036g();
        m31455h();
        this.f34158a.mo31033c().m31196p().m31109b("Setting app measurement enabled (FE)", bool);
        this.f34158a.m31374F().m30821r(bool);
        if (z11) {
            C5950c4 m31374F = this.f34158a.m31374F();
            C6127s4 c6127s4 = m31374F.f34158a;
            m31374F.mo31036g();
            SharedPreferences.Editor edit = m31374F.m30817n().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.f34158a.m31395o() && (bool == null || bool.booleanValue())) {
            return;
        }
        m31403P();
    }

    /* renamed from: P */
    public final void m31403P() {
        long j11;
        mo31036g();
        String m30803a = this.f34158a.m31374F().f33817m.m30803a();
        if (m30803a != null) {
            if ("unset".equals(m30803a)) {
                m31420M("app", "_npa", null, this.f34158a.mo31031a().mo105913a());
            } else {
                if (true != "true".equals(m30803a)) {
                    j11 = 0;
                } else {
                    j11 = 1;
                }
                m31420M("app", "_npa", Long.valueOf(j11), this.f34158a.mo31031a().mo105913a());
            }
        }
        if (this.f34158a.m31394n() && this.f34468o) {
            this.f34158a.mo31033c().m31196p().m31108a("Recording app launch after enabling measurement for the first time (FE)");
            m31433f0();
            C5378fd.m29144b();
            if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33922h0)) {
                this.f34158a.m31380M().f34520d.m31452a();
            }
            this.f34158a.mo31037v().m31296z(new RunnableC6161v5(this));
            return;
        }
        this.f34158a.mo31033c().m31196p().m31108a("Updating Scion state (FE)");
        this.f34158a.m31379L().m30889w();
    }

    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m31404b0(C6129s6 c6129s6, C20307b c20307b, C20307b c20307b2) {
        boolean z11;
        EnumC20305a[] enumC20305aArr = {EnumC20305a.ANALYTICS_STORAGE, EnumC20305a.AD_STORAGE};
        int i11 = 0;
        while (true) {
            if (i11 < 2) {
                EnumC20305a enumC20305a = enumC20305aArr[i11];
                if (!c20307b2.m106014i(enumC20305a) && c20307b.m106014i(enumC20305a)) {
                    z11 = true;
                    break;
                }
                i11++;
            } else {
                z11 = false;
                break;
            }
        }
        boolean m106016l = c20307b.m106016l(c20307b2, EnumC20305a.ANALYTICS_STORAGE, EnumC20305a.AD_STORAGE);
        if (!z11 && !m106016l) {
            return;
        }
        c6129s6.f34158a.m31370B().m30944u();
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m31405c0(C6129s6 c6129s6, C20307b c20307b, int i11, long j11, boolean z11, boolean z12) {
        c6129s6.mo31036g();
        c6129s6.m31455h();
        if (j11 <= c6129s6.f34465l && C20307b.m106006j(c6129s6.f34466m, i11)) {
            c6129s6.f34158a.mo31033c().m31200t().m31109b("Dropped out-of-date consent setting, proposed settings", c20307b);
            return;
        }
        C5950c4 m31374F = c6129s6.f34158a.m31374F();
        C6127s4 c6127s4 = m31374F.f34158a;
        m31374F.mo31036g();
        if (m31374F.m30825w(i11)) {
            SharedPreferences.Editor edit = m31374F.m30817n().edit();
            edit.putString("consent_settings", c20307b.m106013h());
            edit.putInt("consent_source", i11);
            edit.apply();
            c6129s6.f34465l = j11;
            c6129s6.f34466m = i11;
            c6129s6.f34158a.m31379L().m30886s(z11);
            if (z12) {
                c6129s6.f34158a.m31379L().m30876S(new AtomicReference());
                return;
            }
            return;
        }
        c6129s6.f34158a.mo31033c().m31200t().m31109b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i11));
    }

    /* renamed from: A */
    protected final void m31408A(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i11 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i11 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i11];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i11] = new Bundle((Bundle) parcelable);
                        }
                        i11++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i11 < list.size()) {
                        Object obj2 = list.get(i11);
                        if (obj2 instanceof Bundle) {
                            list.set(i11, new Bundle((Bundle) obj2));
                        }
                        i11++;
                    }
                }
            }
        }
        this.f34158a.mo31037v().m31296z(new RunnableC6183x5(this, str, str2, j11, bundle2, z11, z12, z13, str3));
    }

    /* renamed from: B */
    final void m31409B(String str, String str2, long j11, Object obj) {
        this.f34158a.mo31037v().m31296z(new RunnableC6194y5(this, str, str2, obj, j11));
    }

    /* renamed from: C */
    public final void m31410C(String str) {
        this.f34460g.set(str);
    }

    /* renamed from: D */
    public final void m31411D(Bundle bundle) {
        m31412E(bundle, this.f34158a.mo31031a().mo105913a());
    }

    /* renamed from: E */
    public final void m31412E(Bundle bundle, long j11) {
        AbstractC4205o.m19722k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f34158a.mo31033c().m31202w().m31108a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC4205o.m19722k(bundle2);
        AbstractC20324p.m106022a(bundle2, "app_id", String.class, null);
        AbstractC20324p.m106022a(bundle2, "origin", String.class, null);
        AbstractC20324p.m106022a(bundle2, "name", String.class, null);
        AbstractC20324p.m106022a(bundle2, "value", Object.class, null);
        AbstractC20324p.m106022a(bundle2, "trigger_event_name", String.class, null);
        AbstractC20324p.m106022a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC20324p.m106022a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC20324p.m106022a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC20324p.m106022a(bundle2, "triggered_event_name", String.class, null);
        AbstractC20324p.m106022a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC20324p.m106022a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC20324p.m106022a(bundle2, "expired_event_name", String.class, null);
        AbstractC20324p.m106022a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC4205o.m19718g(bundle2.getString("name"));
        AbstractC4205o.m19718g(bundle2.getString("origin"));
        AbstractC4205o.m19722k(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j11);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f34158a.m31381N().m31348p0(string) == 0) {
            if (this.f34158a.m31381N().m31341l0(string, obj) == 0) {
                Object m31345o = this.f34158a.m31381N().m31345o(string, obj);
                if (m31345o == null) {
                    this.f34158a.mo31033c().m31197q().m31110c("Unable to normalize conditional user property value", this.f34158a.m31372D().m30966f(string), obj);
                    return;
                }
                AbstractC20324p.m106023b(bundle2, m31345o);
                long j12 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f34158a.m31401z();
                    if (j12 > 15552000000L || j12 < 1) {
                        this.f34158a.mo31033c().m31197q().m31110c("Invalid conditional user property timeout", this.f34158a.m31372D().m30966f(string), Long.valueOf(j12));
                        return;
                    }
                }
                long j13 = bundle2.getLong("time_to_live");
                this.f34158a.m31401z();
                if (j13 <= 15552000000L && j13 >= 1) {
                    this.f34158a.mo31037v().m31296z(new RunnableC5928a6(this, bundle2));
                    return;
                } else {
                    this.f34158a.mo31033c().m31197q().m31110c("Invalid conditional user property time to live", this.f34158a.m31372D().m30966f(string), Long.valueOf(j13));
                    return;
                }
            }
            this.f34158a.mo31033c().m31197q().m31110c("Invalid conditional user property value", this.f34158a.m31372D().m30966f(string), obj);
            return;
        }
        this.f34158a.mo31033c().m31197q().m31109b("Invalid conditional user property name", this.f34158a.m31372D().m30966f(string));
    }

    /* renamed from: F */
    public final void m31413F(Bundle bundle, int i11, long j11) {
        m31455h();
        String m106005g = C20307b.m106005g(bundle);
        if (m106005g != null) {
            this.f34158a.mo31033c().m31203x().m31109b("Ignoring invalid consent setting", m106005g);
            this.f34158a.mo31033c().m31203x().m31108a("Valid consent values are 'granted', 'denied'");
        }
        m31414G(C20307b.m106003a(bundle), i11, j11);
    }

    /* renamed from: G */
    public final void m31414G(C20307b c20307b, int i11, long j11) {
        C20307b c20307b2;
        boolean z11;
        boolean z12;
        boolean z13;
        C20307b c20307b3 = c20307b;
        m31455h();
        if (i11 != -10 && c20307b.m106011e() == null && c20307b.m106012f() == null) {
            this.f34158a.mo31033c().m31203x().m31108a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f34461h) {
            try {
                c20307b2 = this.f34462i;
                z11 = false;
                if (C20307b.m106006j(i11, this.f34463j)) {
                    z12 = c20307b3.m106015k(this.f34462i);
                    EnumC20305a enumC20305a = EnumC20305a.ANALYTICS_STORAGE;
                    if (c20307b3.m106014i(enumC20305a) && !this.f34462i.m106014i(enumC20305a)) {
                        z11 = true;
                    }
                    c20307b3 = c20307b3.m106010d(this.f34462i);
                    this.f34462i = c20307b3;
                    this.f34463j = i11;
                    z13 = z11;
                    z11 = true;
                } else {
                    z12 = false;
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            this.f34158a.mo31033c().m31200t().m31109b("Ignoring lower-priority consent settings, proposed settings", c20307b3);
            return;
        }
        long andIncrement = this.f34464k.getAndIncrement();
        if (z12) {
            this.f34460g.set(null);
            this.f34158a.mo31037v().m31290A(new RunnableC6074n6(this, c20307b3, j11, i11, andIncrement, z13, c20307b2));
            return;
        }
        RunnableC6085o6 runnableC6085o6 = new RunnableC6085o6(this, c20307b3, i11, andIncrement, z13, c20307b2);
        if (i11 != 30 && i11 != -10) {
            this.f34158a.mo31037v().m31296z(runnableC6085o6);
        } else {
            this.f34158a.mo31037v().m31290A(runnableC6085o6);
        }
    }

    /* renamed from: H */
    public final void m31415H(InterfaceC20328t interfaceC20328t) {
        InterfaceC20328t interfaceC20328t2;
        boolean z11;
        mo31036g();
        m31455h();
        if (interfaceC20328t != null && interfaceC20328t != (interfaceC20328t2 = this.f34457d)) {
            if (interfaceC20328t2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19727p(z11, "EventInterceptor already set.");
        }
        this.f34457d = interfaceC20328t;
    }

    /* renamed from: I */
    public final void m31416I(Boolean bool) {
        m31455h();
        this.f34158a.mo31037v().m31296z(new RunnableC6063m6(this, bool));
    }

    /* renamed from: J */
    public final void m31417J(C20307b c20307b) {
        boolean z11;
        Boolean bool;
        mo31036g();
        if ((c20307b.m106014i(EnumC20305a.ANALYTICS_STORAGE) && c20307b.m106014i(EnumC20305a.AD_STORAGE)) || this.f34158a.m31379L().m30869A()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != this.f34158a.m31395o()) {
            this.f34158a.m31391k(z11);
            C5950c4 m31374F = this.f34158a.m31374F();
            C6127s4 c6127s4 = m31374F.f34158a;
            m31374F.mo31036g();
            if (m31374F.m30817n().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(m31374F.m30817n().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z11 || bool == null || bool.booleanValue()) {
                m31402O(Boolean.valueOf(z11), false);
            }
        }
    }

    /* renamed from: K */
    public final void m31418K(String str, String str2, Object obj, boolean z11) {
        m31419L("auto", "_ldl", obj, true, this.f34158a.mo31031a().mo105913a());
    }

    /* renamed from: L */
    public final void m31419L(String str, String str2, Object obj, boolean z11, long j11) {
        int i11;
        String str3;
        int length;
        int i12;
        if (z11) {
            i11 = this.f34158a.m31381N().m31348p0(str2);
        } else {
            C6121r9 m31381N = this.f34158a.m31381N();
            if (m31381N.m31333S("user property", str2)) {
                if (!m31381N.m31330P("user property", AbstractC20327s.f100303a, null, str2)) {
                    i11 = 15;
                } else {
                    m31381N.f34158a.m31401z();
                    if (m31381N.m31328N("user property", 24, str2)) {
                        i11 = 0;
                    }
                }
            }
            i11 = 6;
        }
        if (i11 != 0) {
            C6121r9 m31381N2 = this.f34158a.m31381N();
            this.f34158a.m31401z();
            String m31349q = m31381N2.m31349q(str2, 24, true);
            if (str2 != null) {
                i12 = str2.length();
            } else {
                i12 = 0;
            }
            this.f34158a.m31381N().m31317C(this.f34469p, null, i11, "_ev", m31349q, i12);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            int m31341l0 = this.f34158a.m31381N().m31341l0(str2, obj);
            if (m31341l0 != 0) {
                C6121r9 m31381N3 = this.f34158a.m31381N();
                this.f34158a.m31401z();
                String m31349q2 = m31381N3.m31349q(str2, 24, true);
                if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                    length = 0;
                } else {
                    length = obj.toString().length();
                }
                this.f34158a.m31381N().m31317C(this.f34469p, null, m31341l0, "_ev", m31349q2, length);
                return;
            }
            Object m31345o = this.f34158a.m31381N().m31345o(str2, obj);
            if (m31345o != null) {
                m31409B(str3, str2, j11, m31345o);
                return;
            }
            return;
        }
        m31409B(str3, str2, j11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31420M(String str, String str2, Object obj, long j11) {
        String str3;
        Object obj2;
        Object obj3;
        long j12;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g(str2);
        mo31036g();
        m31455h();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    String lowerCase = str4.toLowerCase(Locale.ENGLISH);
                    String str5 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j12 = 0;
                    } else {
                        j12 = 1;
                    }
                    Long valueOf = Long.valueOf(j12);
                    C5938b4 c5938b4 = this.f34158a.m31374F().f33817m;
                    if (valueOf.longValue() == 1) {
                        str5 = "true";
                    }
                    c5938b4.m30804b(str5);
                    obj3 = valueOf;
                    obj2 = obj3;
                    str3 = "_npa";
                    if (!this.f34158a.m31394n()) {
                        this.f34158a.mo31033c().m31201u().m31108a("User property not set since app measurement is disabled");
                        return;
                    } else {
                        if (!this.f34158a.m31397q()) {
                            return;
                        }
                        this.f34158a.m31379L().m30891y(new zzli(str3, j11, obj2, str));
                        return;
                    }
                }
            }
            if (obj == null) {
                this.f34158a.m31374F().f33817m.m30804b("unset");
                obj3 = obj;
                obj2 = obj3;
                str3 = "_npa";
                if (!this.f34158a.m31394n()) {
                }
            }
        }
        str3 = str2;
        obj2 = obj;
        if (!this.f34158a.m31394n()) {
        }
    }

    /* renamed from: N */
    public final void m31421N(InterfaceC20329u interfaceC20329u) {
        m31455h();
        AbstractC4205o.m19722k(interfaceC20329u);
        if (!this.f34458e.remove(interfaceC20329u)) {
            this.f34158a.mo31033c().m31202w().m31108a("OnEventListener had not been registered");
        }
    }

    /* renamed from: Q */
    public final int m31422Q(String str) {
        AbstractC4205o.m19718g(str);
        this.f34158a.m31401z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean m31423R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f34158a.mo31037v().m31292q(atomicReference, 15000L, "boolean test flag value", new RunnableC5964d6(this, atomicReference));
    }

    /* renamed from: S */
    public final Double m31424S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f34158a.mo31037v().m31292q(atomicReference, 15000L, "double test flag value", new RunnableC6052l6(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer m31425T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f34158a.mo31037v().m31292q(atomicReference, 15000L, "int test flag value", new RunnableC6041k6(this, atomicReference));
    }

    /* renamed from: U */
    public final Long m31426U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f34158a.mo31037v().m31292q(atomicReference, 15000L, "long test flag value", new RunnableC6019i6(this, atomicReference));
    }

    /* renamed from: V */
    public final String m31427V() {
        return (String) this.f34460g.get();
    }

    /* renamed from: W */
    public final String m31428W() {
        C6184x6 m30853q = this.f34158a.m31378K().m30853q();
        if (m30853q != null) {
            return m30853q.f34590b;
        }
        return null;
    }

    /* renamed from: X */
    public final String m31429X() {
        C6184x6 m30853q = this.f34158a.m31378K().m30853q();
        if (m30853q != null) {
            return m30853q.f34589a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String m31430Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f34158a.mo31037v().m31292q(atomicReference, 15000L, "String test flag value", new RunnableC6008h6(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList m31431Z(String str, String str2) {
        if (this.f34158a.mo31037v().m31291C()) {
            this.f34158a.mo31033c().m31197q().m31108a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f34158a.mo31035f();
        if (C5945c.m30814a()) {
            this.f34158a.mo31033c().m31197q().m31108a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f34158a.mo31037v().m31292q(atomicReference, 5000L, "get conditional user properties", new RunnableC5952c6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f34158a.mo31033c().m31197q().m31109b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return C6121r9.m31313u(list);
    }

    /* renamed from: a0 */
    public final Map m31432a0(String str, String str2, boolean z11) {
        if (this.f34158a.mo31037v().m31291C()) {
            this.f34158a.mo31033c().m31197q().m31108a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f34158a.mo31035f();
        if (C5945c.m30814a()) {
            this.f34158a.mo31033c().m31197q().m31108a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f34158a.mo31037v().m31292q(atomicReference, 5000L, "get user properties", new RunnableC5975e6(this, atomicReference, null, str, str2, z11));
        List<zzli> list = (List) atomicReference.get();
        if (list == null) {
            this.f34158a.mo31033c().m31197q().m31109b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z11));
            return Collections.emptyMap();
        }
        C30239a c30239a = new C30239a(list.size());
        for (zzli zzliVar : list) {
            Object m31514t = zzliVar.m31514t();
            if (m31514t != null) {
                c30239a.put(zzliVar.f34681q, m31514t);
            }
        }
        return c30239a;
    }

    /* renamed from: f0 */
    public final void m31433f0() {
        mo31036g();
        m31455h();
        if (this.f34158a.m31397q()) {
            if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33910b0)) {
                C5990g m31401z = this.f34158a.m31401z();
                m31401z.f34158a.mo31035f();
                Boolean m30929s = m31401z.m30929s("google_analytics_deferred_deep_link_enabled");
                if (m30929s != null && m30929s.booleanValue()) {
                    this.f34158a.mo31033c().m31196p().m31108a("Deferred Deep Link feature enabled.");
                    this.f34158a.mo31037v().m31296z(new Runnable() { // from class: com.google.android.gms.measurement.internal.u5
                        public /* synthetic */ RunnableC6150u5() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C6129s6 c6129s6 = C6129s6.this;
                            c6129s6.mo31036g();
                            if (!c6129s6.f34158a.m31374F().f33823s.m31485b()) {
                                long m31502a = c6129s6.f34158a.m31374F().f33824t.m31502a();
                                c6129s6.f34158a.m31374F().f33824t.m31503b(1 + m31502a);
                                c6129s6.f34158a.m31401z();
                                if (m31502a >= 5) {
                                    c6129s6.f34158a.mo31033c().m31202w().m31108a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    c6129s6.f34158a.m31374F().f33823s.m31484a(true);
                                    return;
                                } else {
                                    c6129s6.f34158a.m31389i();
                                    return;
                                }
                            }
                            c6129s6.f34158a.mo31033c().m31196p().m31108a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f34158a.m31379L().m30872O();
            this.f34468o = false;
            C5950c4 m31374F = this.f34158a.m31374F();
            m31374F.mo31036g();
            String string = m31374F.m30817n().getString("previous_os_version", null);
            m31374F.f34158a.m31369A().m31140j();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m31374F.m30817n().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f34158a.m31369A().m31140j();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    m31440t("auto", "_ou", bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6148u3
    /* renamed from: m */
    protected final boolean mo30852m() {
        return false;
    }

    /* renamed from: n */
    public final void m31434n(String str, String str2, Bundle bundle) {
        long mo105913a = this.f34158a.mo31031a().mo105913a();
        AbstractC4205o.m19718g(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo105913a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f34158a.mo31037v().m31296z(new RunnableC5940b6(this, bundle2));
    }

    /* renamed from: o */
    public final void m31435o() {
        if ((this.f34158a.mo31032b().getApplicationContext() instanceof Application) && this.f34456c != null) {
            ((Application) this.f34158a.mo31032b().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f34456c);
        }
    }

    /* renamed from: p */
    public final /* synthetic */ void m31436p(Bundle bundle) {
        if (bundle == null) {
            this.f34158a.m31374F().f33828x.m31498b(new Bundle());
            return;
        }
        Bundle m31497a = this.f34158a.m31374F().f33828x.m31497a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f34158a.m31381N().m31336V(obj)) {
                    this.f34158a.m31381N().m31317C(this.f34469p, null, 27, null, null, 0);
                }
                this.f34158a.mo31033c().m31203x().m31110c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C6121r9.m31300Y(str)) {
                this.f34158a.mo31033c().m31203x().m31109b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m31497a.remove(str);
            } else {
                C6121r9 m31381N = this.f34158a.m31381N();
                this.f34158a.m31401z();
                if (m31381N.m31331Q("param", str, 100, obj)) {
                    this.f34158a.m31381N().m31318D(m31497a, str, obj);
                }
            }
        }
        this.f34158a.m31381N();
        int m30922l = this.f34158a.m31401z().m30922l();
        if (m31497a.size() > m30922l) {
            int i11 = 0;
            for (String str2 : new TreeSet(m31497a.keySet())) {
                i11++;
                if (i11 > m30922l) {
                    m31497a.remove(str2);
                }
            }
            this.f34158a.m31381N().m31317C(this.f34469p, null, 26, null, null, 0);
            this.f34158a.mo31033c().m31203x().m31108a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f34158a.m31374F().f33828x.m31498b(m31497a);
        this.f34158a.m31379L().m30888u(m31497a);
    }

    /* renamed from: q */
    public final void m31437q(String str, String str2, Bundle bundle) {
        m31438r(str, str2, bundle, true, true, this.f34158a.mo31031a().mo105913a());
    }

    /* renamed from: r */
    public final void m31438r(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) {
        Bundle bundle2;
        boolean z13;
        String str3;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            if (!z12 || this.f34457d == null || C6121r9.m31300Y(str2)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            m31408A(str3, str2, j11, bundle2, z12, z13, z11, null);
            return;
        }
        this.f34158a.m31378K().m30851E(bundle2, j11);
    }

    /* renamed from: s */
    public final void m31439s(String str, String str2, Bundle bundle, String str3) {
        C6127s4.m31365s();
        m31408A("auto", str2, this.f34158a.mo31031a().mo105913a(), bundle, false, true, true, str3);
    }

    /* renamed from: t */
    public final void m31440t(String str, String str2, Bundle bundle) {
        mo31036g();
        m31441u(str, str2, this.f34158a.mo31031a().mo105913a(), bundle);
    }

    /* renamed from: u */
    public final void m31441u(String str, String str2, long j11, Bundle bundle) {
        boolean z11;
        mo31036g();
        if (this.f34457d == null || C6121r9.m31300Y(str2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        m31442w(str, str2, j11, bundle, true, z11, true, null);
    }

    /* renamed from: w */
    public final void m31442w(String str, String str2, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13, String str3) {
        boolean z14;
        boolean z15;
        String str4;
        ArrayList arrayList;
        long j12;
        String str5;
        Bundle[] bundleArr;
        Class<?> cls;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19722k(bundle);
        mo31036g();
        m31455h();
        if (this.f34158a.m31394n()) {
            List m30943t = this.f34158a.m31370B().m30943t();
            if (m30943t != null && !m30943t.contains(str2)) {
                this.f34158a.mo31033c().m31196p().m31110c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            int i11 = 0;
            if (!this.f34459f) {
                this.f34459f = true;
                try {
                    if (!this.f34158a.m31398r()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f34158a.mo31032b().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f34158a.mo31032b());
                    } catch (Exception e11) {
                        this.f34158a.mo31033c().m31202w().m31109b("Failed to invoke Tag Manager's initialize() method", e11);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f34158a.mo31033c().m31200t().m31108a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f34158a.mo31035f();
                m31420M("auto", "_lgclid", bundle.getString("gclid"), this.f34158a.mo31031a().mo105913a());
            }
            this.f34158a.mo31035f();
            if (z11 && C6121r9.m31304c0(str2)) {
                this.f34158a.m31381N().m31362z(bundle, this.f34158a.m31374F().f33828x.m31497a());
            }
            if (!z13) {
                this.f34158a.mo31035f();
                if (!"_iap".equals(str2)) {
                    C6121r9 m31381N = this.f34158a.m31381N();
                    int i12 = 2;
                    if (m31381N.m31333S("event", str2)) {
                        if (!m31381N.m31330P("event", AbstractC20325q.f100295a, AbstractC20325q.f100296b, str2)) {
                            i12 = 13;
                        } else {
                            m31381N.f34158a.m31401z();
                            if (m31381N.m31328N("event", 40, str2)) {
                                i12 = 0;
                            }
                        }
                    }
                    if (i12 != 0) {
                        this.f34158a.mo31033c().m31198r().m31109b("Invalid public event name. Event will not be logged (FE)", this.f34158a.m31372D().m30964d(str2));
                        C6121r9 m31381N2 = this.f34158a.m31381N();
                        this.f34158a.m31401z();
                        String m31349q = m31381N2.m31349q(str2, 40, true);
                        if (str2 != null) {
                            i11 = str2.length();
                        }
                        this.f34158a.m31381N().m31317C(this.f34469p, null, i12, "_ev", m31349q, i11);
                        return;
                    }
                }
            }
            this.f34158a.mo31035f();
            C6184x6 m30854r = this.f34158a.m31378K().m30854r(false);
            if (m30854r != null && !bundle.containsKey("_sc")) {
                m30854r.f34592d = true;
            }
            if (z11 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            C6121r9.m31314y(m30854r, bundle, z14);
            boolean equals = "am".equals(str);
            boolean m31300Y = C6121r9.m31300Y(str2);
            if (z11 && this.f34457d != null && !m31300Y) {
                if (equals) {
                    z15 = true;
                } else {
                    this.f34158a.mo31033c().m31196p().m31110c("Passing event to registered event handler (FE)", this.f34158a.m31372D().m30964d(str2), this.f34158a.m31372D().m30962b(bundle));
                    AbstractC4205o.m19722k(this.f34457d);
                    this.f34457d.mo31466a(str, str2, bundle, j11);
                    return;
                }
            } else {
                z15 = equals;
            }
            if (this.f34158a.m31397q()) {
                int m31342m0 = this.f34158a.m31381N().m31342m0(str2);
                if (m31342m0 != 0) {
                    this.f34158a.mo31033c().m31198r().m31109b("Invalid event name. Event will not be logged (FE)", this.f34158a.m31372D().m30964d(str2));
                    C6121r9 m31381N3 = this.f34158a.m31381N();
                    this.f34158a.m31401z();
                    String m31349q2 = m31381N3.m31349q(str2, 40, true);
                    if (str2 != null) {
                        i11 = str2.length();
                    }
                    this.f34158a.m31381N().m31317C(this.f34469p, str3, m31342m0, "_ev", m31349q2, i11);
                    return;
                }
                String str6 = "_o";
                Bundle m31360x0 = this.f34158a.m31381N().m31360x0(str3, str2, bundle, AbstractC20286g.m105918c("_o", "_sn", "_sc", "_si"), z13);
                AbstractC4205o.m19722k(m31360x0);
                this.f34158a.mo31035f();
                if (this.f34158a.m31378K().m30854r(false) != null && "_ae".equals(str2)) {
                    C6131s8 c6131s8 = this.f34158a.m31380M().f34521e;
                    long mo105914b = c6131s8.f34475d.f34158a.mo31031a().mo105914b();
                    long j13 = mo105914b - c6131s8.f34473b;
                    c6131s8.f34473b = mo105914b;
                    if (j13 > 0) {
                        this.f34158a.m31381N().m31357w(m31360x0, j13);
                    }
                }
                C5598sc.m29603b();
                if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33920g0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        C6121r9 m31381N4 = this.f34158a.m31381N();
                        String string = m31360x0.getString("_ffr");
                        if (AbstractC20299t.m105962a(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!AbstractC20308b0.m106017a(string, m31381N4.f34158a.m31374F().f33825u.m30803a())) {
                            m31381N4.f34158a.m31374F().f33825u.m30804b(string);
                        } else {
                            m31381N4.f34158a.mo31033c().m31196p().m31108a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String m30803a = this.f34158a.m31381N().f34158a.m31374F().f33825u.m30803a();
                        if (!TextUtils.isEmpty(m30803a)) {
                            m31360x0.putString("_ffr", m30803a);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(m31360x0);
                if (this.f34158a.m31374F().f33819o.m31502a() <= 0 || !this.f34158a.m31374F().m30824u(j11) || !this.f34158a.m31374F().f33822r.m31485b()) {
                    str4 = "_ae";
                    arrayList = arrayList2;
                    j12 = 0;
                } else {
                    this.f34158a.mo31033c().m31201u().m31108a("Current session is expired, remove the session number, ID, and engagement time");
                    arrayList = arrayList2;
                    j12 = 0;
                    str4 = "_ae";
                    m31420M("auto", "_sid", null, this.f34158a.mo31031a().mo105913a());
                    m31420M("auto", "_sno", null, this.f34158a.mo31031a().mo105913a());
                    m31420M("auto", "_se", null, this.f34158a.mo31031a().mo105913a());
                    this.f34158a.m31374F().f33820p.m31503b(0L);
                }
                if (m31360x0.getLong("extend_session", j12) == 1) {
                    this.f34158a.mo31033c().m31201u().m31108a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f34158a.m31380M().f34520d.m31453b(j11, true);
                }
                ArrayList arrayList3 = new ArrayList(m31360x0.keySet());
                Collections.sort(arrayList3);
                int size = arrayList3.size();
                for (int i13 = 0; i13 < size; i13++) {
                    String str7 = (String) arrayList3.get(i13);
                    if (str7 != null) {
                        this.f34158a.m31381N();
                        Object obj = m31360x0.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            m31360x0.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                int i14 = 0;
                while (i14 < arrayList.size()) {
                    ArrayList arrayList5 = arrayList;
                    Bundle bundle2 = (Bundle) arrayList5.get(i14);
                    if (i14 != 0) {
                        str5 = "_ep";
                    } else {
                        str5 = str2;
                    }
                    bundle2.putString(str6, str);
                    if (z12) {
                        bundle2 = this.f34158a.m31381N().m31358w0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    String str8 = str6;
                    this.f34158a.m31379L().m30881n(new zzaw(str5, new zzau(bundle3), str, j11), str3);
                    if (!z15) {
                        Iterator it = this.f34458e.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC20329u) it.next()).mo31470a(str, str2, new Bundle(bundle3), j11);
                        }
                    }
                    i14++;
                    arrayList = arrayList5;
                    str6 = str8;
                }
                this.f34158a.mo31035f();
                if (this.f34158a.m31378K().m30854r(false) != null && str4.equals(str2)) {
                    this.f34158a.m31380M().f34521e.m31449d(true, true, this.f34158a.mo31031a().mo105914b());
                    return;
                }
                return;
            }
            return;
        }
        this.f34158a.mo31033c().m31196p().m31108a("Event not sent since app measurement is disabled");
    }

    /* renamed from: x */
    public final void m31443x(InterfaceC20329u interfaceC20329u) {
        m31455h();
        AbstractC4205o.m19722k(interfaceC20329u);
        if (!this.f34458e.add(interfaceC20329u)) {
            this.f34158a.mo31033c().m31202w().m31108a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void m31444y(long j11) {
        this.f34460g.set(null);
        this.f34158a.mo31037v().m31296z(new RunnableC6205z5(this, j11));
    }

    /* renamed from: z */
    public final void m31445z(long j11, boolean z11) {
        mo31036g();
        m31455h();
        this.f34158a.mo31033c().m31196p().m31108a("Resetting analytics data (FE)");
        C6153u8 m31380M = this.f34158a.m31380M();
        m31380M.mo31036g();
        m31380M.f34521e.m31446a();
        C5617te.m29656b();
        if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33938p0)) {
            this.f34158a.m31370B().m30944u();
        }
        boolean m31394n = this.f34158a.m31394n();
        C5950c4 m31374F = this.f34158a.m31374F();
        m31374F.f33809e.m31503b(j11);
        if (!TextUtils.isEmpty(m31374F.f34158a.m31374F().f33825u.m30803a())) {
            m31374F.f33825u.m30804b(null);
        }
        C5378fd.m29144b();
        C5990g m31401z = m31374F.f34158a.m31401z();
        C5961d3 c5961d3 = AbstractC5972e3.f33922h0;
        if (m31401z.m30913B(null, c5961d3)) {
            m31374F.f33819o.m31503b(0L);
        }
        m31374F.f33820p.m31503b(0L);
        if (!m31374F.f34158a.m31401z().m30916E()) {
            m31374F.m30822s(!m31394n);
        }
        m31374F.f33826v.m30804b(null);
        m31374F.f33827w.m31503b(0L);
        m31374F.f33828x.m31498b(null);
        if (z11) {
            this.f34158a.m31379L().m30883p();
        }
        C5378fd.m29144b();
        if (this.f34158a.m31401z().m30913B(null, c5961d3)) {
            this.f34158a.m31380M().f34520d.m31452a();
        }
        this.f34468o = !m31394n;
    }
}
