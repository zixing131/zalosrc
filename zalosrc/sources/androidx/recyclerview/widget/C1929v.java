package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.v */
/* loaded from: classes2.dex */
public class C1929v extends AbstractC1906a0 {

    /* renamed from: d */
    private AbstractC1928u f8216d;

    /* renamed from: e */
    private AbstractC1928u f8217e;

    /* renamed from: androidx.recyclerview.widget.v$a */
    /* loaded from: classes2.dex */
    class a extends C1923p {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1923p, androidx.recyclerview.widget.RecyclerView.AbstractC1898y
        /* renamed from: o */
        public void mo10243o(View view, RecyclerView.C1899z c1899z, RecyclerView.AbstractC1898y.a aVar) {
            C1929v c1929v = C1929v.this;
            int[] mo10398c = c1929v.mo10398c(c1929v.f7950a.getLayoutManager(), view);
            int i11 = mo10398c[0];
            int i12 = mo10398c[1];
            int m10623w = m10623w(Math.max(Math.abs(i11), Math.abs(i12)));
            if (m10623w > 0) {
                aVar.m10251d(i11, i12, m10623w, this.f8200j);
            }
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: v */
        public float mo10405v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C1923p
        /* renamed from: x */
        public int mo10624x(int i11) {
            return Math.min(100, super.mo10624x(i11));
        }
    }

    /* renamed from: m */
    private int m10663m(RecyclerView.AbstractC1888o abstractC1888o, View view, AbstractC1928u abstractC1928u) {
        return (abstractC1928u.mo10649g(view) + (abstractC1928u.mo10647e(view) / 2)) - (abstractC1928u.mo10656n() + (abstractC1928u.mo10657o() / 2));
    }

    /* renamed from: n */
    private View m10664n(RecyclerView.AbstractC1888o abstractC1888o, AbstractC1928u abstractC1928u) {
        int m10110a = abstractC1888o.m10110a();
        View view = null;
        if (m10110a == 0) {
            return null;
        }
        int mo10656n = abstractC1928u.mo10656n() + (abstractC1928u.mo10657o() / 2);
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < m10110a; i12++) {
            View m10105V = abstractC1888o.m10105V(i12);
            int abs = Math.abs((abstractC1928u.mo10649g(m10105V) + (abstractC1928u.mo10647e(m10105V) / 2)) - mo10656n);
            if (abs < i11) {
                view = m10105V;
                i11 = abs;
            }
        }
        return view;
    }

    /* renamed from: o */
    private AbstractC1928u m10665o(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC1928u abstractC1928u = this.f8217e;
        if (abstractC1928u == null || abstractC1928u.f8213a != abstractC1888o) {
            this.f8217e = AbstractC1928u.m10643a(abstractC1888o);
        }
        return this.f8217e;
    }

    /* renamed from: p */
    private AbstractC1928u m10666p(RecyclerView.AbstractC1888o abstractC1888o) {
        if (abstractC1888o.mo9758y()) {
            return m10667q(abstractC1888o);
        }
        if (abstractC1888o.mo9757x()) {
            return m10665o(abstractC1888o);
        }
        return null;
    }

    /* renamed from: q */
    private AbstractC1928u m10667q(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC1928u abstractC1928u = this.f8216d;
        if (abstractC1928u == null || abstractC1928u.f8213a != abstractC1888o) {
            this.f8216d = AbstractC1928u.m10645c(abstractC1888o);
        }
        return this.f8216d;
    }

    /* renamed from: r */
    private boolean m10668r(RecyclerView.AbstractC1888o abstractC1888o, int i11, int i12) {
        if (abstractC1888o.mo9757x()) {
            if (i11 <= 0) {
                return false;
            }
            return true;
        }
        if (i12 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private boolean m10669s(RecyclerView.AbstractC1888o abstractC1888o) {
        PointF mo9746d;
        int m10127i = abstractC1888o.m10127i();
        if (!(abstractC1888o instanceof RecyclerView.AbstractC1898y.b) || (mo9746d = ((RecyclerView.AbstractC1898y.b) abstractC1888o).mo9746d(m10127i - 1)) == null) {
            return false;
        }
        if (mo9746d.x >= 0.0f && mo9746d.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: c */
    public int[] mo10398c(RecyclerView.AbstractC1888o abstractC1888o, View view) {
        int[] iArr = new int[2];
        if (abstractC1888o.mo9757x()) {
            iArr[0] = m10663m(abstractC1888o, view, m10665o(abstractC1888o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1888o.mo9758y()) {
            iArr[1] = m10663m(abstractC1888o, view, m10667q(abstractC1888o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: f */
    protected C1923p mo10401f(RecyclerView.AbstractC1888o abstractC1888o) {
        if (!(abstractC1888o instanceof RecyclerView.AbstractC1898y.b)) {
            return null;
        }
        return new a(this.f7950a.getContext());
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: h */
    public View mo10402h(RecyclerView.AbstractC1888o abstractC1888o) {
        if (abstractC1888o.mo9758y()) {
            return m10664n(abstractC1888o, m10667q(abstractC1888o));
        }
        if (abstractC1888o.mo9757x()) {
            return m10664n(abstractC1888o, m10665o(abstractC1888o));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: i */
    public int mo10403i(RecyclerView.AbstractC1888o abstractC1888o, int i11, int i12) {
        AbstractC1928u m10666p;
        int i13;
        int m10127i = abstractC1888o.m10127i();
        if (m10127i == 0 || (m10666p = m10666p(abstractC1888o)) == null) {
            return -1;
        }
        int m10110a = abstractC1888o.m10110a();
        View view = null;
        View view2 = null;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < m10110a; i16++) {
            View m10105V = abstractC1888o.m10105V(i16);
            if (m10105V != null) {
                int m10663m = m10663m(abstractC1888o, m10105V, m10666p);
                if (m10663m <= 0 && m10663m > i14) {
                    view2 = m10105V;
                    i14 = m10663m;
                }
                if (m10663m >= 0 && m10663m < i15) {
                    view = m10105V;
                    i15 = m10663m;
                }
            }
        }
        boolean m10668r = m10668r(abstractC1888o, i11, i12);
        if (m10668r && view != null) {
            return abstractC1888o.m10112b(view);
        }
        if (!m10668r && view2 != null) {
            return abstractC1888o.m10112b(view2);
        }
        if (m10668r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m10112b = abstractC1888o.m10112b(view);
        if (m10669s(abstractC1888o) == m10668r) {
            i13 = -1;
        } else {
            i13 = 1;
        }
        int i17 = m10112b + i13;
        if (i17 < 0 || i17 >= m10127i) {
            return -1;
        }
        return i17;
    }
}
