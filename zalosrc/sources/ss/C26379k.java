package ss;

import am.AbstractC0924m0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23136l9;
import nh0.C23793c;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: ss.k */
/* loaded from: classes4.dex */
public final class C26379k {

    /* renamed from: a */
    public static final C26379k f125351a = new C26379k();

    /* renamed from: b */
    private static final a f125352b = new a();

    /* renamed from: c */
    private static C26385q f125353c;

    /* renamed from: ss.k$a */
    /* loaded from: classes4.dex */
    public static final class a {
        a() {
        }
    }

    private C26379k() {
    }

    /* renamed from: a */
    public final void m135930a() {
        long m3945k = AbstractC0924m0.m3945k();
        C23793c.b bVar = C23793c.Companion;
        long mo124310e = bVar.m124321a().mo124310e() - m3945k;
        if (mo124310e < 0 || mo124310e >= AbstractC0924m0.m3915j()) {
            m135935f().m135964y(false);
            AbstractC0924m0.m3398Rd(bVar.m124321a().mo124310e());
        }
    }

    /* renamed from: b */
    public final boolean m135931b(boolean z11) {
        if (!m135935f().m135961q()) {
            return false;
        }
        if (z11) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_reach_max_active);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(C26373e.f125282a.m135792a())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            ToastUtils.showMess(format);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m135932c(boolean z11) {
        if (!m135935f().m135962r()) {
            return false;
        }
        if (z11) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_reach_max_items);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(C26373e.f125282a.m135793b())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            ToastUtils.showMess(format);
        }
        return true;
    }

    /* renamed from: d */
    public final void m135933d() {
        synchronized (f125352b) {
            f125353c = null;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: e */
    public final void m135934e(long j11, long j12, long j13) {
        m135935f().m135956i(j11, j12, j13);
    }

    /* renamed from: f */
    public final C26385q m135935f() {
        C26385q c26385q;
        synchronized (f125352b) {
            try {
                if (f125353c == null) {
                    f125353c = new C26385q(C7960e.m41971c6().m42443k7(), true);
                }
                c26385q = f125353c;
                AbstractC19074t.m100205c(c26385q);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c26385q;
    }

    /* renamed from: g */
    public final void m135936g(JSONObject jSONObject, long j11, long j12) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        m135935f().m135960o(jSONObject, j11, j12);
    }

    /* renamed from: h */
    public final void m135937h(boolean z11) {
        m135935f().m135964y(z11);
    }

    /* renamed from: i */
    public final void m135938i(long j11, JSONObject jSONObject, long j12, long j13) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        m135935f().m135965z(j11, jSONObject, j12, j13);
    }
}
