package p296kc;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C17945a0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import p620wt.AbstractC29231f;
import p716zh.C31944h6;
import pm.C24830a;
import pm0.C24848g0;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: kc.a */
/* loaded from: classes3.dex */
public final class C21654a {

    /* renamed from: a */
    public static final C21654a f105046a = new C21654a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: kc.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f105047p = new a("CORE_FLOW", 0);

        /* renamed from: q */
        public static final a f105048q = new a("DEV", 1);

        /* renamed from: r */
        public static final a f105049r = new a("ERROR", 2);

        /* renamed from: s */
        public static final a f105050s = new a("TRACKING_LOG", 3);

        /* renamed from: t */
        public static final a f105051t = new a("SYNC_PC", 4);

        /* renamed from: u */
        public static final a f105052u = new a("ROLLED_MEDIA", 5);

        /* renamed from: v */
        private static final /* synthetic */ a[] f105053v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f105054w;

        static {
            a[] m111591b = m111591b();
            f105053v = m111591b;
            f105054w = AbstractC30166b.m148796a(m111591b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m111591b() {
            return new a[]{f105047p, f105048q, f105049r, f105050s, f105051t, f105052u};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f105053v.clone();
        }
    }

    private C21654a() {
    }

    /* renamed from: a */
    private final long m111574a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m111575b(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        m111576c("AutoDownload", exc);
    }

    /* renamed from: c */
    public static final void m111576c(String str, Exception exc) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC23350e.m122776f(str, exc);
    }

    /* renamed from: d */
    public static final void m111577d(String str) {
        AbstractC19074t.m100208f(str, "message");
        m111582i(str, null, false, 6, null);
    }

    /* renamed from: e */
    public static final void m111578e(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        m111581h(str, str2, null, false, 12, null);
    }

    /* renamed from: f */
    public static final void m111579f(String str, String str2, a aVar, boolean z11) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (z11) {
            AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119279p0(f105046a.m111574a()) + "] " + str2, new Object[0]);
        }
        C24830a.m129111a(str2, aVar);
    }

    /* renamed from: g */
    public static final void m111580g(String str, a aVar, boolean z11) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        m111579f("AutoDownload", str, aVar, z11);
    }

    /* renamed from: h */
    public static /* synthetic */ void m111581h(String str, String str2, a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = a.f105048q;
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        m111579f(str, str2, aVar, z11);
    }

    /* renamed from: i */
    public static /* synthetic */ void m111582i(String str, a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = a.f105048q;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        m111580g(str, aVar, z11);
    }

    /* renamed from: l */
    public static /* synthetic */ void m111583l(C21654a c21654a, long j11, long j12, Exception exc, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            exc = null;
        }
        c21654a.m111588k(j11, j12, exc);
    }

    /* renamed from: m */
    public static final void m111584m(String str, String str2) {
        AbstractC19074t.m100208f(str, "domain");
        AbstractC19074t.m100208f(str2, "checksum");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("domain", str);
            jSONObject.put("checksum", str2);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            m111582i("Domain not cover in whitelist: " + str, a.f105049r, false, 4, null);
            AbstractC20887g.m109248z(26023, jSONObject2);
        } catch (Exception e11) {
            m111575b(e11);
        }
    }

    /* renamed from: p */
    private final void m111585p(C17945a0 c17945a0, JSONObject jSONObject) {
        int i11;
        if (c17945a0.m94889F6()) {
            if (c17945a0.m94871D7() | c17945a0.m95120e6()) {
                i11 = 26041;
            } else if (c17945a0.m95306y8()) {
                i11 = 26042;
            } else if (c17945a0.m95276v6()) {
                i11 = 26043;
            } else if (c17945a0.m95316z8()) {
                i11 = 26044;
            } else {
                i11 = 26040;
            }
        } else if (c17945a0.m94871D7() | c17945a0.m95120e6()) {
            i11 = 26031;
        } else if (c17945a0.m95306y8()) {
            i11 = 26032;
        } else if (c17945a0.m95276v6()) {
            i11 = 26033;
        } else if (c17945a0.m95316z8()) {
            i11 = 26034;
        } else {
            i11 = 26030;
        }
        AbstractC20887g.m109240r(i11, jSONObject.toString());
    }

    /* renamed from: q */
    public static final void m111586q(int i11, int i12) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("err_code", i11);
            jSONObject.put("msg_type", i12);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            AbstractC20887g.m109248z(26021, jSONObject2);
        } catch (Exception e11) {
            m111575b(e11);
        }
    }

    /* renamed from: j */
    public final void m111587j(C17945a0 c17945a0, boolean z11) {
        long j11;
        AbstractC19074t.m100208f(c17945a0, "msg");
        try {
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            String m95293x2 = c17945a0.m95293x2();
            AbstractC19074t.m100207e(m95293x2, "genDownloadTaskUrl(...)");
            String m153552r = C31944h6.m153552r(m95293x2);
            if (m153552r == null) {
                m153552r = "";
            }
            if (c17945a0.m95276v6()) {
                j11 = c17945a0.m95238r3();
            } else if (c17945a0.m95306y8()) {
                j11 = c17945a0.m95159i5();
            } else {
                j11 = 0;
            }
            float mo124314i = ((float) (AbstractC23306f.m120579F1().mo124314i() - c17945a0.m94974P4())) / 8.64E7f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("conversationId", mo95039W2);
            jSONObject.put("msgType", c17945a0.m95041W4());
            jSONObject.put("dayDiff", Float.valueOf(mo124314i));
            jSONObject.put("domain", m153552r);
            AbstractC29231f.m145989g(jSONObject, "size", j11);
            jSONObject.put("platformType", c17945a0.m95196m4());
            jSONObject.put("ts", c17945a0.m94974P4());
            jSONObject.put("msgId", c17945a0.m95029V3().m41044h());
            m111582i("Rolled media: " + jSONObject, a.f105052u, false, 4, null);
            if (z11) {
                if (AbstractC25495a.m132078c(mo95039W2)) {
                    m111585p(c17945a0, jSONObject);
                } else if (mo124314i > 0.0f && mo124314i < 10.0f) {
                    m111585p(c17945a0, jSONObject);
                }
            }
        } catch (Exception e11) {
            m111575b(e11);
        }
    }

    /* renamed from: k */
    public final void m111588k(long j11, long j12, Exception exc) {
        long j13 = j12 - j11;
        if (exc != null) {
            AbstractC20887g.m109243u(20409, exc.toString(), j11, j12, j13);
        } else {
            AbstractC20887g.m109247y(20409, j11, j12, j13);
        }
    }

    /* renamed from: n */
    public final void m111589n(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "cleanedItems");
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String m95293x2 = ((C17945a0) it.next()).m95293x2();
                AbstractC19074t.m100207e(m95293x2, "genDownloadTaskUrl(...)");
                String m153552r = C31944h6.m153552r(m95293x2);
                if (m153552r == null) {
                    m153552r = "";
                }
                jSONArray.put(m153552r);
                m111582i("Clean rolled items: hash=" + AbstractC23352g.m122788d(m95293x2) + ", domain=" + m153552r, a.f105049r, false, 4, null);
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("domain", jSONArray);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            AbstractC20887g.m109248z(26022, jSONObject2);
        } catch (Exception e11) {
            m111575b(e11);
        }
    }

    /* renamed from: o */
    public final void m111590o(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC20887g.m109240r(26022, exc.toString());
    }
}
