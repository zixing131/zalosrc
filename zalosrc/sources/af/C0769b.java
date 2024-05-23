package af;

import android.content.Context;
import bf.AbstractC2790b;
import lt.AbstractC22649e;
import p354n3.C23528a;
import p379o3.C24003n;

/* renamed from: af.b */
/* loaded from: classes3.dex */
public class C0769b extends AbstractC22649e {

    /* renamed from: c0 */
    private final AbstractC2790b.c f2666c0;

    /* renamed from: d0 */
    protected boolean f2667d0;

    /* renamed from: e0 */
    private boolean f2668e0;

    /* renamed from: f0 */
    private int f2669f0;

    /* renamed from: g0 */
    private int f2670g0;

    /* renamed from: h0 */
    boolean f2671h0;

    /* renamed from: i0 */
    boolean f2672i0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0769b(AbstractC2790b.c cVar, Context context, C23528a c23528a, C24003n c24003n) {
        super(cVar.f11129a, context, c23528a, c24003n);
        this.f2667d0 = false;
        this.f2668e0 = false;
        this.f2671h0 = false;
        this.f2672i0 = true;
        this.f2666c0 = cVar;
    }

    /* renamed from: G0 */
    private boolean m1898G0() {
        return this.f2668e0 ? ((float) this.f2669f0) / ((float) this.f2670g0) <= 1.3333334f : ((float) this.f2670g0) / ((float) this.f2669f0) <= 1.3333334f;
    }

    /* renamed from: H0 */
    private void m1899H0() {
        int i11;
        int i12;
        int m1949M;
        int m1948L;
        AbstractC2790b.b bVar;
        try {
            if (!this.f2671h0 && m117222y0() != 0 && m117221x0() != 0) {
                if (this.f2668e0) {
                    i11 = this.f2670g0;
                    i12 = this.f2669f0;
                    m1949M = m1948L();
                    m1948L = m1949M();
                } else {
                    i11 = this.f2669f0;
                    i12 = this.f2670g0;
                    m1949M = m1949M();
                    m1948L = m1948L();
                }
                if (this.f2667d0) {
                    bVar = this.f2666c0.f11132d;
                } else {
                    bVar = this.f2666c0.f11131c;
                }
                float m117222y0 = (i11 * bVar.f11127c) / (m117222y0() * 100.0f);
                float[] fArr = new float[2];
                AbstractC2790b.m13444h(bVar, m117222y0, m117222y0(), m117221x0(), i11, i12, fArr);
                float f11 = fArr[0];
                float f12 = fArr[1];
                int i13 = (m1949M - i11) / 2;
                int i14 = (m1948L - i12) / 2;
                if (this.f2668e0) {
                    mo110614r0((int) ((i12 - f12) + i14));
                    m110615s0((int) (f11 + i13));
                    m110611n0(90.0f);
                } else {
                    mo110614r0((int) (f11 + i13));
                    m110615s0((int) (f12 + i14));
                    m110611n0(0.0f);
                }
                mo97628p0(m117222y0);
                m117219B0(0.0f, i11);
                m110616t0();
                mo1953W(1.0f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K0 */
    private void m1900K0() {
        boolean z11;
        String str;
        boolean z12 = this.f2671h0;
        boolean z13 = false;
        if ((z12 && this.f2672i0) || (!z12 && m1898G0())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f2667d0 != z11) {
            z13 = true;
        }
        this.f2667d0 = z11;
        if (z13) {
            if (z11) {
                str = this.f2666c0.f11130b;
            } else {
                str = this.f2666c0.f11129a;
            }
            m117229F0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22646b, ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        m1899H0();
    }

    @Override // lt.AbstractC22649e
    /* renamed from: E0 */
    public void mo1901E0() {
        m1900K0();
        super.mo1901E0();
    }

    /* renamed from: I0 */
    public void m1902I0(boolean z11) {
        boolean z12;
        if (this.f2668e0 != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f2668e0 = z11;
        if (z12) {
            m1900K0();
            m1899H0();
        }
    }

    /* renamed from: J0 */
    public void m1903J0(int i11, int i12) {
        boolean z11;
        if (this.f2669f0 == i11 && this.f2670g0 == i12) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f2669f0 = i11;
        this.f2670g0 = i12;
        if (z11) {
            m1900K0();
            m1899H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        m1900K0();
        m1899H0();
    }
}
