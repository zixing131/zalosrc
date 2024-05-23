package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.o4 */
/* loaded from: classes2.dex */
final class C4821o4 extends AbstractC5193y4 {

    /* renamed from: n */
    private wm4 f25422n;

    /* renamed from: o */
    private C4784n4 f25423o;

    /* renamed from: j */
    private static boolean m25076j(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: a */
    protected final long mo19983a(x02 x02Var) {
        if (m25076j(x02Var.m27777h())) {
            int i11 = (x02Var.m27777h()[2] & 255) >> 4;
            if (i11 != 6) {
                if (i11 == 7) {
                    i11 = 7;
                }
                int m26365a = sm4.m26365a(x02Var, i11);
                x02Var.m27775f(0);
                return m26365a;
            }
            x02Var.m27776g(4);
            x02Var.m27764C();
            int m26365a2 = sm4.m26365a(x02Var, i11);
            x02Var.m27775f(0);
            return m26365a2;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: b */
    public final void mo19984b(boolean z11) {
        super.mo19984b(z11);
        if (z11) {
            this.f25422n = null;
            this.f25423o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: c */
    protected final boolean mo19985c(x02 x02Var, long j11, C5081v4 c5081v4) {
        byte[] m27777h = x02Var.m27777h();
        wm4 wm4Var = this.f25422n;
        if (wm4Var == null) {
            wm4 wm4Var2 = new wm4(m27777h, 17);
            this.f25422n = wm4Var2;
            c5081v4.f29182a = wm4Var2.m27663c(Arrays.copyOfRange(m27777h, 9, x02Var.m27781l()), null);
            return true;
        }
        if ((m27777h[0] & Byte.MAX_VALUE) == 3) {
            vm4 m26631b = tm4.m26631b(x02Var);
            wm4 m27666f = wm4Var.m27666f(m26631b);
            this.f25422n = m27666f;
            this.f25423o = new C4784n4(m27666f, m26631b);
            return true;
        }
        if (!m25076j(m27777h)) {
            return true;
        }
        C4784n4 c4784n4 = this.f25423o;
        if (c4784n4 != null) {
            c4784n4.m24840c(j11);
            c5081v4.f29183b = this.f25423o;
        }
        c5081v4.f29182a.getClass();
        return false;
    }
}
