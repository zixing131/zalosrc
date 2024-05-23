package af;

import bf.AbstractC2790b;
import bf.C2789a;
import et.C18610q;
import lt.AbstractC22647c;
import org.json.JSONException;
import org.json.JSONObject;
import p276jt.AbstractC21351f;

/* renamed from: af.a */
/* loaded from: classes3.dex */
public class C0768a extends AbstractC22647c {

    /* renamed from: b0 */
    private final C2789a f2664b0;

    /* renamed from: c0 */
    private boolean f2665c0 = false;

    public C0768a(C2789a c2789a) {
        this.f2664b0 = c2789a;
    }

    /* renamed from: O0 */
    private void m1887O0() {
        int i11;
        int i12;
        int m1949M;
        int m1948L;
        if (m117222y0() != 0 && m117221x0() != 0) {
            if (this.f111055Y) {
                i11 = this.f111057a0;
                i12 = this.f111056Z;
                m1949M = m1948L();
                m1948L = m1949M();
            } else {
                i11 = this.f111056Z;
                i12 = this.f111057a0;
                m1949M = m1949M();
                m1948L = m1948L();
            }
            AbstractC2790b.b m13439r = this.f2664b0.m13439r(this.f2665c0);
            float m117222y0 = (i11 * m13439r.f11127c) / (m117222y0() * 100);
            float[] fArr = new float[2];
            AbstractC2790b.m13444h(m13439r, m117222y0, m117222y0(), m117221x0(), i11, i12, fArr);
            float f11 = fArr[0];
            float f12 = fArr[1];
            int i13 = (m1949M - i11) / 2;
            int i14 = (m1948L - i12) / 2;
            if (this.f111055Y) {
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
            mo1953W(1.0f);
        }
    }

    /* renamed from: P0 */
    private void m1888P0() {
        boolean z11 = false;
        if (!this.f111055Y ? this.f111057a0 / this.f111056Z <= 1.3333334f : this.f111056Z / this.f111057a0 <= 1.3333334f) {
            z11 = true;
        }
        this.f2665c0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22646b, p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        C2789a c2789a = this.f2664b0;
        if (c2789a != null) {
            m117218A0(c2789a.m13438q());
        }
        super.mo1889D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22646b, ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        m1888P0();
        m1887O0();
    }

    @Override // lt.AbstractC22647c
    /* renamed from: E0 */
    public AbstractC21351f mo1891E0(float f11, float f12) {
        if (m117220w0(f11, f12)) {
            return this;
        }
        return null;
    }

    @Override // lt.AbstractC22647c
    /* renamed from: F0 */
    public JSONObject mo1892F0() {
        try {
            return mo110584d0();
        } catch (JSONException unused) {
            return super.mo1892F0();
        }
    }

    @Override // lt.AbstractC22647c
    /* renamed from: G0 */
    public boolean mo1893G0() {
        return this.f2664b0 == null;
    }

    @Override // lt.AbstractC22647c
    /* renamed from: H0 */
    public void mo1894H0(float[] fArr, C18610q c18610q, int i11, int i12, int i13, int i14, boolean z11) {
        m110603b0(fArr, c18610q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22647c
    /* renamed from: I0 */
    public void mo1895I0() {
        super.mo1895I0();
        m1888P0();
        m1887O0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // lt.AbstractC22647c
    /* renamed from: J0 */
    public void mo1896J0() {
        super.mo1896J0();
        m1888P0();
        m1887O0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        mo1896J0();
    }
}
