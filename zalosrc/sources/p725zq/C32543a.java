package p725zq;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import on0.AbstractC24341v;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zq.a */
/* loaded from: classes4.dex */
public final class C32543a {

    /* renamed from: a */
    public static final C32543a f150389a;

    /* renamed from: b */
    private static AtomicLong f150390b;

    /* renamed from: c */
    private static AtomicInteger f150391c;

    /* renamed from: d */
    private static AtomicInteger f150392d;

    /* renamed from: e */
    private static AtomicLong f150393e;

    /* renamed from: f */
    private static boolean f150394f;

    static {
        C32543a c32543a = new C32543a();
        f150389a = c32543a;
        f150390b = new AtomicLong(259200000L);
        f150391c = new AtomicInteger(10);
        f150392d = new AtomicInteger(12);
        f150393e = new AtomicLong(300000L);
        c32543a.m157595g();
        c32543a.m157596h();
    }

    private C32543a() {
    }

    /* renamed from: a */
    private final void m157588a() {
        f150390b.set(259200000L);
        f150392d.set(12);
        f150391c.set(10);
        f150393e.set(300000L);
    }

    /* renamed from: i */
    private final void m157589i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sup_duration", m157590b());
        jSONObject.put("queue_size_req", m157594f());
        jSONObject.put("num_feeds_preload", m157593e());
        jSONObject.put("retry_ttl", m157591c());
        AbstractC0924m0.m4028mm(jSONObject.toString());
    }

    /* renamed from: b */
    public final long m157590b() {
        return f150390b.get();
    }

    /* renamed from: c */
    public final long m157591c() {
        return f150393e.get();
    }

    /* renamed from: d */
    public final boolean m157592d() {
        return f150394f;
    }

    /* renamed from: e */
    public final int m157593e() {
        return f150392d.get();
    }

    /* renamed from: f */
    public final int m157594f() {
        return f150391c.get();
    }

    /* renamed from: g */
    public final void m157595g() {
        boolean m127128x;
        String m2925B4 = AbstractC0924m0.m2925B4();
        AbstractC19074t.m100205c(m2925B4);
        m127128x = AbstractC24341v.m127128x(m2925B4);
        if (!m127128x) {
            try {
                JSONObject jSONObject = new JSONObject(m2925B4);
                if (jSONObject.has("sup_duration")) {
                    f150390b.set(jSONObject.getLong("sup_duration"));
                }
                if (jSONObject.has("queue_size_req")) {
                    f150391c.set(jSONObject.getInt("queue_size_req"));
                }
                if (jSONObject.has("num_feeds_preload")) {
                    f150392d.set(jSONObject.getInt("num_feeds_preload"));
                }
                if (jSONObject.has("retry_ttl")) {
                    f150393e.set(jSONObject.getLong("retry_ttl"));
                }
            } catch (JSONException unused) {
                m157588a();
            }
        }
    }

    /* renamed from: h */
    public final void m157596h() {
        f150394f = AbstractC0924m0.m3806fa();
    }

    /* renamed from: j */
    public final void m157597j(long j11) {
        if (j11 != f150390b.get()) {
            f150390b.set(j11);
            m157589i();
        }
    }

    /* renamed from: k */
    public final void m157598k(long j11) {
        if (j11 != f150393e.get()) {
            f150393e.set(j11);
            m157589i();
        }
    }

    /* renamed from: l */
    public final void m157599l(int i11) {
        if (i11 != f150392d.get()) {
            f150392d.set(i11);
            m157589i();
        }
    }

    /* renamed from: m */
    public final void m157600m(int i11) {
        if (i11 != f150391c.get()) {
            f150391c.set(i11);
            m157589i();
        }
    }
}
