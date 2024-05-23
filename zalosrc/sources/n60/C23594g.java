package n60;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dg0.AbstractC17930e;
import dj.C17945a0;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p173fz.C19172a;
import p263jc.C21216s;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p698yz.AbstractC31111g;
import p698yz.EnumC31105a;
import vg.C28212v6;

/* renamed from: n60.g */
/* loaded from: classes5.dex */
public final class C23594g {

    /* renamed from: a */
    public static final C23594g f114421a = new C23594g();

    /* renamed from: b */
    private static final Set f114422b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private static final Set f114423c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    private static final Set f114424d;

    /* renamed from: e */
    private static final Set f114425e;

    /* renamed from: f */
    private static final Set f114426f;

    /* renamed from: g */
    private static boolean f114427g;

    /* renamed from: h */
    private static long f114428h;

    /* renamed from: i */
    private static boolean f114429i;

    /* renamed from: j */
    private static long f114430j;

    /* renamed from: k */
    private static boolean f114431k;

    static {
        Set synchronizedSet = Collections.synchronizedSet(new HashSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        f114424d = synchronizedSet;
        f114425e = Collections.synchronizedSet(new HashSet());
        Set synchronizedSet2 = Collections.synchronizedSet(new HashSet());
        AbstractC19074t.m100207e(synchronizedSet2, "synchronizedSet(...)");
        f114426f = synchronizedSet2;
        f114427g = true;
        f114429i = true;
    }

    private C23594g() {
    }

    /* renamed from: C */
    private final void m123678C() {
        JSONObject jSONObject = new JSONObject();
        C23594g c23594g = f114421a;
        jSONObject.put("tipDownloadFileAllowedToShow", c23594g.m123695h());
        jSONObject.put("tipDownloadFileLastShownTime", c23594g.m123696i());
        jSONObject.put("tipPersistFileAllowedToShow", c23594g.m123697j());
        jSONObject.put("tipPersistFileLastShownTime", c23594g.m123698k());
        AbstractC0924m0.m4140qe(jSONObject.toString());
    }

    /* renamed from: o */
    public static final void m123685o() {
        f114421a.m123706z(false);
    }

    /* renamed from: q */
    public static final void m123686q(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        C23594g c23594g = f114421a;
        if (c23594g.m123695h() && Math.abs(System.currentTimeMillis() - c23594g.m123696i()) >= 604800000) {
            f114422b.add(c17945a0.m95029V3());
        }
    }

    /* renamed from: s */
    public static final void m123687s(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        C23594g c23594g = f114421a;
        if (!c23594g.m123695h() || AbstractC0924m0.m3860h4() >= C19172a.m100600k("chat@max_download_file_reminder", 3) || ((C21216s) C21216s.Companion.m122672a()).m109851C(c17945a0, false) || Math.abs(System.currentTimeMillis() - c23594g.m123696i()) < 604800000) {
            return;
        }
        EnumC31105a m151139t = AbstractC31111g.m151139t(c17945a0);
        if ((m151139t != EnumC31105a.f143330q && m151139t != EnumC31105a.f143336w) || AbstractC31111g.m151135p(c17945a0)) {
            return;
        }
        Set set = f114424d;
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        set.add(m95029V3);
        f114423c.add(c17945a0.mo95039W2());
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: n60.c
            public /* synthetic */ RunnableC23590c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C23594g.m123688t(C17945a0.this);
            }
        }, 1000L);
    }

    /* renamed from: t */
    public static final void m123688t(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        C23744a.Companion.m124119a().m124116d(70, "tip.file_persist.download_file", c17945a0.mo95039W2());
    }

    /* renamed from: v */
    public static final void m123689v() {
        f114421a.m123692A(System.currentTimeMillis());
        AbstractC0924m0.m3029El(AbstractC0924m0.m3860h4() + 1);
        f114422b.clear();
    }

    /* renamed from: x */
    public static final void m123690x() {
        f114421a.m123693B(System.currentTimeMillis());
    }

    /* renamed from: y */
    private final void m123691y() {
        try {
            try {
                String m3123I = AbstractC0924m0.m3123I();
                AbstractC19074t.m100205c(m3123I);
                if (m3123I.length() > 0) {
                    JSONObject jSONObject = new JSONObject(m3123I);
                    f114427g = jSONObject.optBoolean("tipDownloadFileAllowedToShow", true);
                    f114428h = jSONObject.optLong("tipDownloadFileLastShownTime", 0L);
                    f114429i = jSONObject.optBoolean("tipPersistFileAllowedToShow", true);
                    f114430j = jSONObject.optLong("tipPersistFileLastShownTime", 0L);
                } else {
                    f114427g = true;
                    f114429i = true;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            f114431k = true;
        } catch (Throwable th2) {
            f114431k = true;
            throw th2;
        }
    }

    /* renamed from: A */
    public final void m123692A(long j11) {
        if (m123696i() != j11) {
            f114428h = j11;
            m123678C();
        }
    }

    /* renamed from: B */
    public final void m123693B(long j11) {
        if (m123698k() != j11) {
            f114430j = j11;
            m123678C();
        }
    }

    /* renamed from: g */
    public final C28212v6 m123694g(String str) {
        AbstractC19074t.m100208f(str, "tipCat");
        if (AbstractC19074t.m100204b(str, "tip.file_persist.download_file")) {
            C28212v6 c28212v6 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_onboard_file_persist_step_1_title));
            c28212v6.f131577c = str;
            c28212v6.f131582h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_onboard_file_persist_step_1_message);
            return c28212v6;
        }
        if (AbstractC19074t.m100204b(str, "tip.file_persist.save_file")) {
            C28212v6 c28212v62 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_onboard_file_persist_step_2_title));
            c28212v62.f131577c = str;
            c28212v62.f131582h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_onboard_file_persist_step_2_message);
            return c28212v62;
        }
        return null;
    }

    /* renamed from: h */
    public final boolean m123695h() {
        if (!f114431k) {
            m123691y();
        }
        return f114427g;
    }

    /* renamed from: i */
    public final long m123696i() {
        if (!f114431k) {
            m123691y();
        }
        return f114428h;
    }

    /* renamed from: j */
    public final boolean m123697j() {
        if (!f114431k) {
            m123691y();
        }
        return f114429i;
    }

    /* renamed from: k */
    public final long m123698k() {
        if (!f114431k) {
            m123691y();
        }
        return f114430j;
    }

    /* renamed from: l */
    public final boolean m123699l(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!f114424d.contains(c17945a0.m95029V3())) {
            return false;
        }
        EnumC31105a m151139t = AbstractC31111g.m151139t(c17945a0);
        if (m151139t != EnumC31105a.f143330q && m151139t != EnumC31105a.f143336w) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean m123700m(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        return f114426f.contains(c17945a0.m95029V3());
    }

    /* renamed from: n */
    public final void m123701n(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (AbstractC25495a.m132078c(c17945a0.mo95039W2())) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: n60.e
            @Override // java.lang.Runnable
            public final void run() {
                C23594g.m123685o();
            }
        });
    }

    /* renamed from: p */
    public final void m123702p(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (AbstractC25495a.m132078c(c17945a0.mo95039W2())) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: n60.f
            public /* synthetic */ RunnableC23593f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C23594g.m123686q(C17945a0.this);
            }
        });
    }

    /* renamed from: r */
    public final void m123703r(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (f114423c.contains(c17945a0.mo95039W2()) || AbstractC25495a.m132078c(c17945a0.mo95039W2()) || AbstractC3489d.m17501i()) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: n60.a
            public /* synthetic */ RunnableC23588a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C23594g.m123687s(C17945a0.this);
            }
        });
    }

    /* renamed from: u */
    public final void m123704u() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: n60.d
            @Override // java.lang.Runnable
            public final void run() {
                C23594g.m123689v();
            }
        });
    }

    /* renamed from: w */
    public final void m123705w() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: n60.b
            @Override // java.lang.Runnable
            public final void run() {
                C23594g.m123690x();
            }
        });
    }

    /* renamed from: z */
    public final void m123706z(boolean z11) {
        if (m123695h() != z11) {
            f114427g = z11;
            m123678C();
        }
    }
}
