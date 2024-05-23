package p320ld;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import nh0.C23793c;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import sc.C26220b;
import si.C26263i;

/* renamed from: ld.f */
/* loaded from: classes3.dex */
public final class C22434f {

    /* renamed from: a */
    public static final C22434f f109754a;

    /* renamed from: b */
    private static boolean f109755b;

    /* renamed from: c */
    private static long f109756c;

    /* renamed from: d */
    private static int f109757d;

    /* renamed from: e */
    private static long f109758e;

    /* renamed from: f */
    private static int f109759f;

    static {
        C22434f c22434f = new C22434f();
        f109754a = c22434f;
        f109756c = 604800L;
        f109757d = 1;
        if (AbstractC19444a.m101693a()) {
            C22432d.f109743a.m115877a(new Runnable() { // from class: ld.e
                @Override // java.lang.Runnable
                public final void run() {
                    C22434f.m115886b();
                }
            });
        } else {
            c22434f.m115889e(AbstractC23306f.m120676j().m128417l());
        }
    }

    private C22434f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m115886b() {
        f109754a.m115889e(AbstractC23306f.m120676j().m128417l());
    }

    /* renamed from: c */
    public final void m115887c() {
        int m3594Y6 = AbstractC0924m0.m3594Y6();
        int m3072G6 = AbstractC0924m0.m3072G6();
        long j11 = f109756c;
        int i11 = 1;
        int i12 = m3072G6 + 1;
        if (m3594Y6 != 0) {
            if (m3594Y6 == 1) {
                if (i12 > f109759f) {
                    if (f109757d <= 0) {
                        j11 = f109758e;
                    } else {
                        m3594Y6 = 0;
                    }
                } else {
                    j11 = f109758e;
                }
            }
            i11 = i12;
        } else {
            if (i12 > f109757d) {
                if (f109759f > 0) {
                    j11 = f109758e;
                    m3594Y6 = 1;
                }
            }
            i11 = i12;
        }
        if (j11 <= 0) {
            j11 = 604800;
        }
        AbstractC0924m0.m3352Pp(m3594Y6);
        AbstractC0924m0.m4241tp(i11);
        AbstractC0924m0.m2946Bp(C23793c.Companion.m124321a().mo124314i() + (j11 * 1000));
    }

    /* renamed from: d */
    public final boolean m115888d() {
        long m3304O6 = AbstractC0924m0.m3304O6();
        C26220b.m134827j("Promote bk media: " + f109755b + ", " + m3304O6, null, 2, null);
        if (f109755b && C23793c.Companion.m124321a().mo124314i() >= m3304O6 && AbstractC23306f.m120676j().m128392I() && !C26263i.m135055u().m135073O()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m115889e(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    m115890f(new JSONObject(str));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: f */
    public final void m115890f(JSONObject jSONObject) {
        boolean z11;
        AbstractC19074t.m100208f(jSONObject, "jsonObj");
        try {
            if (jSONObject.optInt("enable", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            f109755b = z11;
            f109756c = jSONObject.optLong("short_time", 604800L);
            f109757d = jSONObject.optInt("short_time_count", 1);
            f109758e = jSONObject.optLong("long_time", 0L);
            f109759f = jSONObject.optInt("long_time_count", 0);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
