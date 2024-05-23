package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.p */
/* loaded from: classes2.dex */
public class C1923p extends RecyclerView.AbstractC1898y {

    /* renamed from: k */
    protected PointF f8201k;

    /* renamed from: l */
    private final DisplayMetrics f8202l;

    /* renamed from: n */
    private float f8204n;

    /* renamed from: i */
    protected final LinearInterpolator f8199i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f8200j = new DecelerateInterpolator();

    /* renamed from: m */
    private boolean f8203m = false;

    /* renamed from: o */
    protected int f8205o = 0;

    /* renamed from: p */
    protected int f8206p = 0;

    public C1923p(Context context) {
        this.f8202l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m10616A() {
        if (!this.f8203m) {
            this.f8204n = mo10405v(this.f8202l);
            this.f8203m = true;
        }
        return this.f8204n;
    }

    /* renamed from: y */
    private int m10617y(int i11, int i12) {
        int i13 = i11 - i12;
        if (i11 * i13 <= 0) {
            return 0;
        }
        return i13;
    }

    /* renamed from: B */
    protected int mo10618B() {
        PointF pointF = this.f8201k;
        if (pointF != null) {
            float f11 = pointF.y;
            if (f11 != 0.0f) {
                if (f11 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: C */
    protected void m10619C(RecyclerView.AbstractC1898y.a aVar) {
        PointF mo10229a = mo10229a(m10234f());
        if (mo10229a != null && (mo10229a.x != 0.0f || mo10229a.y != 0.0f)) {
            m10237i(mo10229a);
            this.f8201k = mo10229a;
            this.f8205o = (int) (mo10229a.x * 10000.0f);
            this.f8206p = (int) (mo10229a.y * 10000.0f);
            aVar.m10251d((int) (this.f8205o * 1.2f), (int) (this.f8206p * 1.2f), (int) (mo10624x(10000) * 1.2f), this.f8199i);
            return;
        }
        aVar.m10249b(m10234f());
        m10246r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1898y
    /* renamed from: l */
    protected void mo10240l(int i11, int i12, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1898y.a aVar) {
        if (m10231c() == 0) {
            m10246r();
            return;
        }
        this.f8205o = m10617y(this.f8205o, i11);
        int m10617y = m10617y(this.f8206p, i12);
        this.f8206p = m10617y;
        if (this.f8205o == 0 && m10617y == 0) {
            m10619C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1898y
    /* renamed from: m */
    public void mo10241m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1898y
    /* renamed from: n */
    public void mo10242n() {
        this.f8206p = 0;
        this.f8205o = 0;
        this.f8201k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1898y
    /* renamed from: o */
    public void mo10243o(View view, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1898y.a aVar) {
        int m10621t = m10621t(view, mo10625z());
        int mo10622u = mo10622u(view, mo10618B());
        int m10623w = m10623w((int) Math.sqrt((m10621t * m10621t) + (mo10622u * mo10622u)));
        if (m10623w > 0) {
            aVar.m10251d(-m10621t, -mo10622u, m10623w, this.f8200j);
        }
    }

    /* renamed from: s */
    public int mo10620s(int i11, int i12, int i13, int i14, int i15) {
        if (i15 != -1) {
            if (i15 != 0) {
                if (i15 == 1) {
                    return i14 - i12;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i16 = i13 - i11;
            if (i16 > 0) {
                return i16;
            }
            int i17 = i14 - i12;
            if (i17 < 0) {
                return i17;
            }
            return 0;
        }
        return i13 - i11;
    }

    /* renamed from: t */
    public int m10621t(View view, int i11) {
        RecyclerView.AbstractC1888o m10233e = m10233e();
        if (m10233e != null && m10233e.mo9757x()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return mo10620s(m10233e.m10121f(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, m10233e.m10132k(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, m10233e.getPaddingLeft(), m10233e.getWidth() - m10233e.getPaddingRight(), i11);
        }
        return 0;
    }

    /* renamed from: u */
    public int mo10622u(View view, int i11) {
        RecyclerView.AbstractC1888o m10233e = m10233e();
        if (m10233e != null && m10233e.mo9758y()) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return mo10620s(m10233e.m10135l(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, m10233e.m10130j(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, m10233e.getPaddingTop(), m10233e.getHeight() - m10233e.getPaddingBottom(), i11);
        }
        return 0;
    }

    /* renamed from: v */
    public float mo10405v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: w */
    public int m10623w(int i11) {
        return (int) Math.ceil(mo10624x(i11) / 0.3356d);
    }

    /* renamed from: x */
    public int mo10624x(int i11) {
        return (int) Math.ceil(Math.abs(i11) * m10616A());
    }

    /* renamed from: z */
    protected int mo10625z() {
        PointF pointF = this.f8201k;
        if (pointF != null) {
            float f11 = pointF.x;
            if (f11 != 0.0f) {
                if (f11 > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }
}
