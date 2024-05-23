package p732zy;

import am.AbstractC0924m0;
import android.content.res.Resources;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import nh0.C23793c;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: zy.p */
/* loaded from: classes4.dex */
public final class C32600p {

    /* renamed from: a */
    public static final C32600p f150676a = new C32600p();

    /* renamed from: b */
    private static final a f150677b = new a();

    /* renamed from: c */
    private static C32606v f150678c;

    /* renamed from: zy.p$a */
    /* loaded from: classes4.dex */
    public static final class a {
        a() {
        }
    }

    private C32600p() {
    }

    /* renamed from: a */
    public final void m157894a() {
        long mo124310e = C23793c.Companion.m124321a().mo124310e() - AbstractC0924m0.m4336x4();
        if (mo124310e < 0 || mo124310e >= AbstractC0924m0.m4278v4()) {
            m157898e().m157921E(false);
        }
    }

    /* renamed from: b */
    public final boolean m157895b(boolean z11) {
        if (!m157898e().m157932v()) {
            return false;
        }
        if (z11) {
            Resources m118698c0 = AbstractC23136l9.m118698c0();
            int i11 = AbstractC7921d0.str_qm_reach_max_item;
            C32592h c32592h = C32592h.f150598a;
            ToastUtils.showMess(m118698c0.getQuantityString(i11, c32592h.m157754a(), Integer.valueOf(c32592h.m157754a())));
        }
        return true;
    }

    /* renamed from: c */
    public final void m157896c() {
        synchronized (f150677b) {
            f150678c = null;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: d */
    public final void m157897d(ArrayList arrayList, long j11, long j12, String str) {
        AbstractC19074t.m100208f(arrayList, "ids");
        AbstractC19074t.m100208f(str, "uid");
        m157898e().m157923k(arrayList, j11, j12, str);
    }

    /* renamed from: e */
    public final C32606v m157898e() {
        C32606v c32606v;
        synchronized (f150677b) {
            try {
                if (f150678c == null) {
                    f150678c = new C32606v(C7960e.m41971c6().m42453l7(), true);
                }
                c32606v = f150678c;
                AbstractC19074t.m100205c(c32606v);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c32606v;
    }

    /* renamed from: f */
    public final C32606v m157899f() {
        return f150678c;
    }

    /* renamed from: g */
    public final void m157900g(JSONObject jSONObject, long j11, long j12, String str) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        AbstractC19074t.m100208f(str, "uid");
        m157898e().m157930s(jSONObject, j11, j12, str);
    }

    /* renamed from: h */
    public final void m157901h(boolean z11) {
        m157898e().m157921E(z11);
    }

    /* renamed from: i */
    public final void m157902i(long j11, JSONObject jSONObject, long j12, long j13, String str) {
        AbstractC19074t.m100208f(jSONObject, "jsItem");
        AbstractC19074t.m100208f(str, "uid");
        m157898e().m157922F(j11, jSONObject, j12, j13, str);
    }
}
