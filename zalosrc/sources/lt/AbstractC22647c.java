package lt;

import et.C18610q;
import org.json.JSONObject;
import p276jt.AbstractC21351f;

/* renamed from: lt.c */
/* loaded from: classes4.dex */
public abstract class AbstractC22647c extends AbstractC22646b {

    /* renamed from: Y */
    protected boolean f111055Y = false;

    /* renamed from: Z */
    protected int f111056Z;

    /* renamed from: a0 */
    protected int f111057a0;

    /* renamed from: C0 */
    public void mo1906C0(double d11, double d12, double d13, double d14, double d15) {
    }

    /* renamed from: D0 */
    public final void m117224D0(float[] fArr, C18610q c18610q, int i11, int i12, int i13, int i14, boolean z11) {
        m1946J();
        mo1894H0(fArr, c18610q, i11, i12, i13, i14, z11);
    }

    /* renamed from: E0 */
    public abstract AbstractC21351f mo1891E0(float f11, float f12);

    /* renamed from: F0 */
    public JSONObject mo1892F0() {
        return null;
    }

    /* renamed from: G0 */
    public abstract boolean mo1893G0();

    /* renamed from: H0 */
    public abstract void mo1894H0(float[] fArr, C18610q c18610q, int i11, int i12, int i13, int i14, boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo1895I0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J0 */
    public void mo1896J0() {
    }

    /* renamed from: K0 */
    public boolean mo1907K0(AbstractC21351f abstractC21351f) {
        return false;
    }

    /* renamed from: L0 */
    public void mo1908L0(double d11, double d12, double d13, double d14, double d15, double d16) {
    }

    /* renamed from: M0 */
    public final void m117225M0(boolean z11) {
        boolean z12;
        if (this.f111055Y != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f111055Y = z11;
        if (z12) {
            mo1895I0();
        }
    }

    /* renamed from: N0 */
    public final void m117226N0(int i11, int i12) {
        boolean z11;
        if (this.f111056Z == i11 && this.f111057a0 == i12) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f111056Z = i11;
        this.f111057a0 = i12;
        if (z11) {
            mo1896J0();
        }
    }
}
