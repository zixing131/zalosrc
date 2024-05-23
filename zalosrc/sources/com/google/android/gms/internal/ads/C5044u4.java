package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u4 */
/* loaded from: classes2.dex */
final class C5044u4 extends AbstractC5193y4 {

    /* renamed from: o */
    private static final byte[] f28747o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    private static final byte[] f28748p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    private boolean f28749n;

    /* renamed from: j */
    public static boolean m26858j(x02 x02Var) {
        return m26859k(x02Var, f28747o);
    }

    /* renamed from: k */
    private static boolean m26859k(x02 x02Var, byte[] bArr) {
        if (x02Var.m27778i() < 8) {
            return false;
        }
        int m27780k = x02Var.m27780k();
        byte[] bArr2 = new byte[8];
        x02Var.m27771b(bArr2, 0, 8);
        x02Var.m27775f(m27780k);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: a */
    protected final long mo19983a(x02 x02Var) {
        int i11;
        int i12;
        byte[] m27777h = x02Var.m27777h();
        byte b11 = m27777h[0];
        int i13 = b11 & 255;
        int i14 = b11 & 3;
        if (i14 != 0) {
            i11 = 2;
            if (i14 != 1 && i14 != 2) {
                i11 = m27777h[1] & 63;
            }
        } else {
            i11 = 1;
        }
        int i15 = i13 >> 3;
        int i16 = i15 & 3;
        if (i15 >= 16) {
            i12 = 2500 << i16;
        } else if (i15 >= 12) {
            i12 = 10000 << (i15 & 1);
        } else if (i16 == 3) {
            i12 = 60000;
        } else {
            i12 = 10000 << i16;
        }
        return m28120f(i11 * i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: b */
    public final void mo19984b(boolean z11) {
        super.mo19984b(z11);
        if (z11) {
            this.f28749n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5193y4
    /* renamed from: c */
    protected final boolean mo19985c(x02 x02Var, long j11, C5081v4 c5081v4) {
        if (m26859k(x02Var, f28747o)) {
            byte[] copyOf = Arrays.copyOf(x02Var.m27777h(), x02Var.m27781l());
            int i11 = copyOf[9] & 255;
            List m23082a = AbstractC4594i.m23082a(copyOf);
            if (c5081v4.f29182a != null) {
                return true;
            }
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26523s("audio/opus");
            c5004t1.m26506e0(i11);
            c5004t1.m26524t(48000);
            c5004t1.m26513i(m23082a);
            c5081v4.f29182a = c5004t1.m26529y();
            return true;
        }
        if (m26859k(x02Var, f28748p)) {
            v71.m27171b(c5081v4.f29182a);
            if (this.f28749n) {
                return true;
            }
            this.f28749n = true;
            x02Var.m27776g(8);
            zzbq m27758b = AbstractC5151x.m27758b(c83.m20831v(AbstractC5151x.m27759c(x02Var, false, false).f28676b));
            if (m27758b == null) {
                return true;
            }
            C5004t1 m23809b = c5081v4.f29182a.m23809b();
            m23809b.m26517m(m27758b.m28710d(c5081v4.f29182a.f23097j));
            c5081v4.f29182a = m23809b.m26529y();
            return true;
        }
        v71.m27171b(c5081v4.f29182a);
        return false;
    }
}
