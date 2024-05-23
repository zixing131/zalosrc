package zm.voip.service;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.os.Build;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23088h5;
import me0.AbstractC23211s7;
import on0.AbstractC24342w;
import p173fz.C19172a;
import p361nb.C23648e;
import p542ub.InterfaceC27218a;

/* renamed from: zm.voip.service.k */
/* loaded from: classes7.dex */
public final class C32299k {

    /* renamed from: a */
    public static final C32299k f149103a = new C32299k();

    /* renamed from: b */
    private static volatile boolean f149104b;

    private C32299k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m156147d(String str, InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(str, "$partnerId");
        int m4037n1 = AbstractC0924m0.m4037n1();
        C32299k c32299k = f149103a;
        if (c32299k.m156151j(str, m4037n1)) {
            c32299k.m156153l(interfaceC27218a, true, str);
            c32299k.m156150i();
        } else if (c32299k.m156152k(str, m4037n1)) {
            c32299k.m156153l(interfaceC27218a, false, str);
            c32299k.m156150i();
        }
    }

    /* renamed from: e */
    private final long m156148e(long j11) {
        return System.currentTimeMillis() - j11;
    }

    /* renamed from: f */
    private final boolean m156149f(String str, String str2) {
        boolean m127149O;
        m127149O = AbstractC24342w.m127149O(str2, str, false, 2, null);
        return m127149O;
    }

    /* renamed from: i */
    private final void m156150i() {
        AbstractC0924m0.m3606Yi("");
        AbstractC0924m0.m3374Qi("");
    }

    /* renamed from: j */
    private final boolean m156151j(String str, int i11) {
        List m127132B0;
        if (i11 > 1) {
            return false;
        }
        try {
            String m3386R1 = AbstractC0924m0.m3386R1();
            AbstractC19074t.m100205c(m3386R1);
            if (m156149f(str, m3386R1)) {
                m127132B0 = AbstractC24342w.m127132B0(m3386R1, new String[]{"_"}, false, 0, 6, null);
                long parseLong = Long.parseLong((String) m127132B0.get(1));
                if (i11 != 0) {
                    if (i11 == 1 && m156148e(parseLong) < 10800000) {
                        return true;
                    }
                } else if (m156148e(parseLong) < 86400000) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104549b(e11);
            return false;
        }
    }

    /* renamed from: k */
    private final boolean m156152k(String str, int i11) {
        List m127132B0;
        if (i11 > 0) {
            return false;
        }
        try {
            String m3618Z1 = AbstractC0924m0.m3618Z1();
            AbstractC19074t.m100205c(m3618Z1);
            if (!m156149f(str, m3618Z1)) {
                return false;
            }
            m127132B0 = AbstractC24342w.m127132B0(m3618Z1, new String[]{"_"}, false, 0, 6, null);
            if (m156148e(Long.parseLong((String) m127132B0.get(1))) >= 86400000) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104549b(e11);
            return false;
        }
    }

    /* renamed from: l */
    private final void m156153l(final InterfaceC27218a interfaceC27218a, final boolean z11, final String str) {
        AbstractC0924m0.m3605Yh(AbstractC0924m0.m4037n1() + 1);
        AbstractC19444a.m101697e(new Runnable() { // from class: zm.voip.service.j
            @Override // java.lang.Runnable
            public final void run() {
                C32299k.m156154m(InterfaceC27218a.this, z11, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m156154m(InterfaceC27218a interfaceC27218a, boolean z11, String str) {
        AbstractC19074t.m100208f(str, "$partnerId");
        AbstractC23211s7.m119565E(interfaceC27218a, z11, str);
    }

    /* renamed from: c */
    public final void m156155c(final InterfaceC27218a interfaceC27218a, final String str) {
        AbstractC19074t.m100208f(str, "partnerId");
        if (AbstractC23088h5.m118422c()) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zm.voip.service.i
            @Override // java.lang.Runnable
            public final void run() {
                C32299k.m156147d(str, interfaceC27218a);
            }
        });
    }

    /* renamed from: g */
    public final void m156156g(boolean z11, String str) {
        AbstractC19074t.m100208f(str, "callerId");
        if (AbstractC23088h5.m118422c() || f149104b) {
            return;
        }
        if (z11) {
            AbstractC0924m0.m3374Qi(str + "_" + System.currentTimeMillis());
            return;
        }
        AbstractC0924m0.m3606Yi(str + "_" + System.currentTimeMillis());
    }

    /* renamed from: h */
    public final void m156157h() {
        String str;
        f149104b = CoreUtility.f89239o;
        if (Build.VERSION.SDK_INT >= 34 && C19172a.m100600k("full_screen_intent_per@log_status", 1) != 0) {
            C0815e1 m2075D = C0815e1.m2075D();
            String[] strArr = new String[1];
            if (AbstractC23088h5.m118422c()) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[0] = str;
            m2075D.m2100V(new C23648e(63, "in_call", 1, "total_intent_permission", strArr), false);
        }
    }
}
