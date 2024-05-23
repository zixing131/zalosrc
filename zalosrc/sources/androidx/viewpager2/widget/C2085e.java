package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: classes2.dex */
public final class C2085e extends RecyclerView.AbstractC1892s {

    /* renamed from: a */
    private ViewPager2.AbstractC2075i f8920a;

    /* renamed from: b */
    private final ViewPager2 f8921b;

    /* renamed from: c */
    private final RecyclerView f8922c;

    /* renamed from: d */
    private final LinearLayoutManager f8923d;

    /* renamed from: e */
    private int f8924e;

    /* renamed from: f */
    private int f8925f;

    /* renamed from: g */
    private a f8926g;

    /* renamed from: h */
    private int f8927h;

    /* renamed from: i */
    private int f8928i;

    /* renamed from: j */
    private boolean f8929j;

    /* renamed from: k */
    private boolean f8930k;

    /* renamed from: l */
    private boolean f8931l;

    /* renamed from: m */
    private boolean f8932m;

    /* renamed from: androidx.viewpager2.widget.e$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        int f8933a;

        /* renamed from: b */
        float f8934b;

        /* renamed from: c */
        int f8935c;

        a() {
        }

        /* renamed from: a */
        void m11305a() {
            this.f8933a = -1;
            this.f8934b = 0.0f;
            this.f8935c = 0;
        }
    }

    public C2085e(ViewPager2 viewPager2) {
        this.f8921b = viewPager2;
        RecyclerView recyclerView = viewPager2.f8889y;
        this.f8922c = recyclerView;
        this.f8923d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f8926g = new a();
        m11295q();
    }

    /* renamed from: f */
    private void m11290f(int i11, float f11, int i12) {
        ViewPager2.AbstractC2075i abstractC2075i = this.f8920a;
        if (abstractC2075i != null) {
            abstractC2075i.mo11275b(i11, f11, i12);
        }
    }

    /* renamed from: g */
    private void m11291g(int i11) {
        ViewPager2.AbstractC2075i abstractC2075i = this.f8920a;
        if (abstractC2075i != null) {
            abstractC2075i.mo11255c(i11);
        }
    }

    /* renamed from: h */
    private void m11292h(int i11) {
        if ((this.f8924e == 3 && this.f8925f == 0) || this.f8925f == i11) {
            return;
        }
        this.f8925f = i11;
        ViewPager2.AbstractC2075i abstractC2075i = this.f8920a;
        if (abstractC2075i != null) {
            abstractC2075i.mo11254a(i11);
        }
    }

    /* renamed from: i */
    private int m11293i() {
        return this.f8923d.m9740Y1();
    }

    /* renamed from: n */
    private boolean m11294n() {
        int i11 = this.f8924e;
        return i11 == 1 || i11 == 4;
    }

    /* renamed from: q */
    private void m11295q() {
        this.f8924e = 0;
        this.f8925f = 0;
        this.f8926g.m11305a();
        this.f8927h = -1;
        this.f8928i = -1;
        this.f8929j = false;
        this.f8930k = false;
        this.f8932m = false;
        this.f8931l = false;
    }

    /* renamed from: s */
    private void m11296s(boolean z11) {
        int i11;
        this.f8932m = z11;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 1;
        }
        this.f8924e = i11;
        int i12 = this.f8928i;
        if (i12 != -1) {
            this.f8927h = i12;
            this.f8928i = -1;
        } else if (this.f8927h == -1) {
            this.f8927h = m11293i();
        }
        m11292h(1);
    }

    /* renamed from: t */
    private void m11297t() {
        int top;
        float f11;
        a aVar = this.f8926g;
        int m9740Y1 = this.f8923d.m9740Y1();
        aVar.f8933a = m9740Y1;
        if (m9740Y1 == -1) {
            aVar.m11305a();
            return;
        }
        View mo9732P = this.f8923d.mo9732P(m9740Y1);
        if (mo9732P == null) {
            aVar.m11305a();
            return;
        }
        int m10119e0 = this.f8923d.m10119e0(mo9732P);
        int m10128i0 = this.f8923d.m10128i0(mo9732P);
        int m10136l0 = this.f8923d.m10136l0(mo9732P);
        int m10104U = this.f8923d.m10104U(mo9732P);
        ViewGroup.LayoutParams layoutParams = mo9732P.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            m10119e0 += marginLayoutParams.leftMargin;
            m10128i0 += marginLayoutParams.rightMargin;
            m10136l0 += marginLayoutParams.topMargin;
            m10104U += marginLayoutParams.bottomMargin;
        }
        int height = mo9732P.getHeight() + m10136l0 + m10104U;
        int width = mo9732P.getWidth() + m10119e0 + m10128i0;
        if (this.f8923d.m9750h() == 0) {
            top = (mo9732P.getLeft() - m10119e0) - this.f8922c.getPaddingLeft();
            if (this.f8921b.m11243d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (mo9732P.getTop() - m10136l0) - this.f8922c.getPaddingTop();
        }
        int i11 = -top;
        aVar.f8935c = i11;
        if (i11 < 0) {
            if (new C2081a(this.f8923d).m11283d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f8935c)));
        }
        if (height == 0) {
            f11 = 0.0f;
        } else {
            f11 = i11 / height;
        }
        aVar.f8934b = f11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: b */
    public void mo952b(RecyclerView recyclerView, int i11) {
        if ((this.f8924e != 1 || this.f8925f != 1) && i11 == 1) {
            m11296s(false);
            return;
        }
        if (m11294n() && i11 == 2) {
            if (this.f8930k) {
                m11292h(2);
                this.f8929j = true;
                return;
            }
            return;
        }
        if (m11294n() && i11 == 0) {
            m11297t();
            if (!this.f8930k) {
                int i12 = this.f8926g.f8933a;
                if (i12 != -1) {
                    m11290f(i12, 0.0f, 0);
                }
            } else {
                a aVar = this.f8926g;
                if (aVar.f8935c == 0) {
                    int i13 = this.f8927h;
                    int i14 = aVar.f8933a;
                    if (i13 != i14) {
                        m11291g(i14);
                    }
                }
            }
            m11292h(0);
            m11295q();
        }
        if (this.f8924e == 2 && i11 == 0 && this.f8931l) {
            m11297t();
            a aVar2 = this.f8926g;
            if (aVar2.f8935c == 0) {
                int i15 = this.f8928i;
                int i16 = aVar2.f8933a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    m11291g(i16);
                }
                m11292h(0);
                m11295q();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:            if (r5 == r3.f8921b.m11243d()) goto L52;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
        int i13;
        boolean z11;
        this.f8930k = true;
        m11297t();
        if (this.f8929j) {
            this.f8929j = false;
            if (i12 <= 0) {
                if (i12 == 0) {
                    if (i11 < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                i13 = this.f8926g.f8933a;
                this.f8928i = i13;
                if (this.f8927h != i13) {
                    m11291g(i13);
                }
            }
            a aVar = this.f8926g;
            if (aVar.f8935c != 0) {
                i13 = aVar.f8933a + 1;
                this.f8928i = i13;
                if (this.f8927h != i13) {
                }
            }
            i13 = this.f8926g.f8933a;
            this.f8928i = i13;
            if (this.f8927h != i13) {
            }
        } else if (this.f8924e == 0) {
            int i14 = this.f8926g.f8933a;
            if (i14 == -1) {
                i14 = 0;
            }
            m11291g(i14);
        }
        a aVar2 = this.f8926g;
        int i15 = aVar2.f8933a;
        if (i15 == -1) {
            i15 = 0;
        }
        m11290f(i15, aVar2.f8934b, aVar2.f8935c);
        a aVar3 = this.f8926g;
        int i16 = aVar3.f8933a;
        int i17 = this.f8928i;
        if ((i16 == i17 || i17 == -1) && aVar3.f8935c == 0 && this.f8925f != 1) {
            m11292h(0);
            m11295q();
        }
    }

    /* renamed from: j */
    public double m11298j() {
        m11297t();
        a aVar = this.f8926g;
        return aVar.f8933a + aVar.f8934b;
    }

    /* renamed from: k */
    public int m11299k() {
        return this.f8925f;
    }

    /* renamed from: l */
    public boolean m11300l() {
        return this.f8932m;
    }

    /* renamed from: m */
    public boolean m11301m() {
        return this.f8925f == 0;
    }

    /* renamed from: o */
    public void m11302o() {
        this.f8931l = true;
    }

    /* renamed from: p */
    public void m11303p(int i11, boolean z11) {
        int i12;
        if (z11) {
            i12 = 2;
        } else {
            i12 = 3;
        }
        this.f8924e = i12;
        boolean z12 = false;
        this.f8932m = false;
        if (this.f8928i != i11) {
            z12 = true;
        }
        this.f8928i = i11;
        m11292h(2);
        if (z12) {
            m11291g(i11);
        }
    }

    /* renamed from: r */
    public void m11304r(ViewPager2.AbstractC2075i abstractC2075i) {
        this.f8920a = abstractC2075i;
    }
}
