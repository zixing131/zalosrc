package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.c0 */
/* loaded from: classes.dex */
public class C1535c0 {

    /* renamed from: a */
    private ViewParent f6477a;

    /* renamed from: b */
    private ViewParent f6478b;

    /* renamed from: c */
    private final View f6479c;

    /* renamed from: d */
    private boolean f6480d;

    /* renamed from: e */
    private int[] f6481e;

    public C1535c0(View view) {
        this.f6479c = view;
    }

    /* renamed from: g */
    private boolean m7711g(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        ViewParent m7712h;
        int i16;
        int i17;
        int[] iArr3;
        if (!m7723l() || (m7712h = m7712h(i15)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f6479c.getLocationInWindow(iArr);
            i16 = iArr[0];
            i17 = iArr[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr2 == null) {
            int[] m7713i = m7713i();
            m7713i[0] = 0;
            m7713i[1] = 0;
            iArr3 = m7713i;
        } else {
            iArr3 = iArr2;
        }
        AbstractC1603t0.m8189d(m7712h, this.f6479c, i11, i12, i13, i14, i15, iArr3);
        if (iArr != null) {
            this.f6479c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i17;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m7712h(int i11) {
        if (i11 == 0) {
            return this.f6477a;
        }
        if (i11 != 1) {
            return null;
        }
        return this.f6478b;
    }

    /* renamed from: i */
    private int[] m7713i() {
        if (this.f6481e == null) {
            this.f6481e = new int[2];
        }
        return this.f6481e;
    }

    /* renamed from: n */
    private void m7714n(int i11, ViewParent viewParent) {
        if (i11 == 0) {
            this.f6477a = viewParent;
        } else {
            if (i11 != 1) {
                return;
            }
            this.f6478b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean m7715a(float f11, float f12, boolean z11) {
        ViewParent m7712h;
        if (!m7723l() || (m7712h = m7712h(0)) == null) {
            return false;
        }
        return AbstractC1603t0.m8186a(m7712h, this.f6479c, f11, f12, z11);
    }

    /* renamed from: b */
    public boolean m7716b(float f11, float f12) {
        ViewParent m7712h;
        if (!m7723l() || (m7712h = m7712h(0)) == null) {
            return false;
        }
        return AbstractC1603t0.m8187b(m7712h, this.f6479c, f11, f12);
    }

    /* renamed from: c */
    public boolean m7717c(int i11, int i12, int[] iArr, int[] iArr2) {
        return m7718d(i11, i12, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m7718d(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        ViewParent m7712h;
        int i14;
        int i15;
        if (!m7723l() || (m7712h = m7712h(i13)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f6479c.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr == null) {
            iArr = m7713i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        AbstractC1603t0.m8188c(m7712h, this.f6479c, i11, i12, iArr, i13);
        if (iArr2 != null) {
            this.f6479c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i15;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m7719e(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        m7711g(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    /* renamed from: f */
    public boolean m7720f(int i11, int i12, int i13, int i14, int[] iArr) {
        return m7711g(i11, i12, i13, i14, iArr, 0, null);
    }

    /* renamed from: j */
    public boolean m7721j() {
        return m7722k(0);
    }

    /* renamed from: k */
    public boolean m7722k(int i11) {
        if (m7712h(i11) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m7723l() {
        return this.f6480d;
    }

    /* renamed from: m */
    public void m7724m(boolean z11) {
        if (this.f6480d) {
            AbstractC1579n0.m7881j1(this.f6479c);
        }
        this.f6480d = z11;
    }

    /* renamed from: o */
    public boolean m7725o(int i11) {
        return m7726p(i11, 0);
    }

    /* renamed from: p */
    public boolean m7726p(int i11, int i12) {
        if (m7722k(i12)) {
            return true;
        }
        if (m7723l()) {
            View view = this.f6479c;
            for (ViewParent parent = this.f6479c.getParent(); parent != null; parent = parent.getParent()) {
                if (AbstractC1603t0.m8191f(parent, view, this.f6479c, i11, i12)) {
                    m7714n(i12, parent);
                    AbstractC1603t0.m8190e(parent, view, this.f6479c, i11, i12);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: q */
    public void m7727q() {
        m7728r(0);
    }

    /* renamed from: r */
    public void m7728r(int i11) {
        ViewParent m7712h = m7712h(i11);
        if (m7712h != null) {
            AbstractC1603t0.m8192g(m7712h, this.f6479c, i11);
            m7714n(i11, null);
        }
    }
}
