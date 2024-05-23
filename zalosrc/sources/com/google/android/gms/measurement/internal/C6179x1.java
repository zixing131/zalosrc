package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Iterator;
import java.util.Map;
import p665y0.C30239a;

/* renamed from: com.google.android.gms.measurement.internal.x1 */
/* loaded from: classes.dex */
public final class C6179x1 extends AbstractC6191y2 {

    /* renamed from: b */
    private final Map f34567b;

    /* renamed from: c */
    private final Map f34568c;

    /* renamed from: d */
    private long f34569d;

    public C6179x1(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34568c = new C30239a();
        this.f34567b = new C30239a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* synthetic */ void m31475h(C6179x1 c6179x1, String str, long j11) {
        c6179x1.mo31036g();
        AbstractC4205o.m19718g(str);
        if (c6179x1.f34568c.isEmpty()) {
            c6179x1.f34569d = j11;
        }
        Integer num = (Integer) c6179x1.f34568c.get(str);
        if (num != null) {
            c6179x1.f34568c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c6179x1.f34568c.size() >= 100) {
            c6179x1.f34158a.mo31033c().m31202w().m31108a("Too many ads visible");
        } else {
            c6179x1.f34568c.put(str, 1);
            c6179x1.f34567b.put(str, Long.valueOf(j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m31476i(C6179x1 c6179x1, String str, long j11) {
        c6179x1.mo31036g();
        AbstractC4205o.m19718g(str);
        Integer num = (Integer) c6179x1.f34568c.get(str);
        if (num != null) {
            C6184x6 m30854r = c6179x1.f34158a.m31378K().m30854r(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c6179x1.f34568c.remove(str);
                Long l11 = (Long) c6179x1.f34567b.get(str);
                if (l11 == null) {
                    c6179x1.f34158a.mo31033c().m31197q().m31108a("First ad unit exposure time was never set");
                } else {
                    long longValue = j11 - l11.longValue();
                    c6179x1.f34567b.remove(str);
                    c6179x1.m31479o(str, longValue, m30854r);
                }
                if (c6179x1.f34568c.isEmpty()) {
                    long j12 = c6179x1.f34569d;
                    if (j12 == 0) {
                        c6179x1.f34158a.mo31033c().m31197q().m31108a("First ad exposure time was never set");
                        return;
                    } else {
                        c6179x1.m31478n(j11 - j12, m30854r);
                        c6179x1.f34569d = 0L;
                        return;
                    }
                }
                return;
            }
            c6179x1.f34568c.put(str, Integer.valueOf(intValue));
            return;
        }
        c6179x1.f34158a.mo31033c().m31197q().m31109b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: n */
    private final void m31478n(long j11, C6184x6 c6184x6) {
        if (c6184x6 == null) {
            this.f34158a.mo31033c().m31201u().m31108a("Not logging ad exposure. No active activity");
            return;
        }
        if (j11 < 1000) {
            this.f34158a.mo31033c().m31201u().m31109b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j11));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j11);
        C6121r9.m31314y(c6184x6, bundle, true);
        this.f34158a.m31376I().m31440t("am", "_xa", bundle);
    }

    /* renamed from: o */
    private final void m31479o(String str, long j11, C6184x6 c6184x6) {
        if (c6184x6 == null) {
            this.f34158a.mo31033c().m31201u().m31108a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j11 < 1000) {
            this.f34158a.mo31033c().m31201u().m31109b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j11));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j11);
        C6121r9.m31314y(c6184x6, bundle, true);
        this.f34158a.m31376I().m31440t("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m31480p(long j11) {
        Iterator it = this.f34567b.keySet().iterator();
        while (it.hasNext()) {
            this.f34567b.put((String) it.next(), Long.valueOf(j11));
        }
        if (!this.f34567b.isEmpty()) {
            this.f34569d = j11;
        }
    }

    /* renamed from: k */
    public final void m31481k(String str, long j11) {
        if (str != null && str.length() != 0) {
            this.f34158a.mo31037v().m31296z(new RunnableC5921a(this, str, j11));
        } else {
            this.f34158a.mo31033c().m31197q().m31108a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: l */
    public final void m31482l(String str, long j11) {
        if (str != null && str.length() != 0) {
            this.f34158a.mo31037v().m31296z(new RunnableC6155v(this, str, j11));
        } else {
            this.f34158a.mo31033c().m31197q().m31108a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: m */
    public final void m31483m(long j11) {
        C6184x6 m30854r = this.f34158a.m31378K().m30854r(false);
        for (String str : this.f34567b.keySet()) {
            m31479o(str, j11 - ((Long) this.f34567b.get(str)).longValue(), m30854r);
        }
        if (!this.f34567b.isEmpty()) {
            m31478n(j11 - this.f34569d, m30854r);
        }
        m31480p(j11);
    }
}
