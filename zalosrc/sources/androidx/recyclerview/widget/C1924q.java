package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes2.dex */
public class C1924q extends AbstractC1906a0 {

    /* renamed from: d */
    private AbstractC1928u f8207d;

    /* renamed from: e */
    private AbstractC1928u f8208e;

    /* renamed from: m */
    private float m10626m(RecyclerView.AbstractC1888o abstractC1888o, AbstractC1928u abstractC1928u) {
        int m10110a = abstractC1888o.m10110a();
        if (m10110a == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < m10110a; i13++) {
            View m10105V = abstractC1888o.m10105V(i13);
            int m10112b = abstractC1888o.m10112b(m10105V);
            if (m10112b != -1) {
                if (m10112b < i11) {
                    view = m10105V;
                    i11 = m10112b;
                }
                if (m10112b > i12) {
                    view2 = m10105V;
                    i12 = m10112b;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(abstractC1928u.mo10646d(view), abstractC1928u.mo10646d(view2)) - Math.min(abstractC1928u.mo10649g(view), abstractC1928u.mo10649g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i12 - i11) + 1);
    }

    /* renamed from: n */
    private int m10627n(RecyclerView.AbstractC1888o abstractC1888o, View view, AbstractC1928u abstractC1928u) {
        return (abstractC1928u.mo10649g(view) + (abstractC1928u.mo10647e(view) / 2)) - (abstractC1928u.mo10656n() + (abstractC1928u.mo10657o() / 2));
    }

    /* renamed from: o */
    private int m10628o(RecyclerView.AbstractC1888o abstractC1888o, AbstractC1928u abstractC1928u, int i11, int i12) {
        int i13;
        int[] m10399d = m10399d(i11, i12);
        float m10626m = m10626m(abstractC1888o, abstractC1928u);
        if (m10626m <= 0.0f) {
            return 0;
        }
        if (Math.abs(m10399d[0]) > Math.abs(m10399d[1])) {
            i13 = m10399d[0];
        } else {
            i13 = m10399d[1];
        }
        return Math.round(i13 / m10626m);
    }

    /* renamed from: p */
    private View m10629p(RecyclerView.AbstractC1888o abstractC1888o, AbstractC1928u abstractC1928u) {
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

    /* renamed from: q */
    private AbstractC1928u m10630q(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC1928u abstractC1928u = this.f8208e;
        if (abstractC1928u == null || abstractC1928u.f8213a != abstractC1888o) {
            this.f8208e = AbstractC1928u.m10643a(abstractC1888o);
        }
        return this.f8208e;
    }

    /* renamed from: r */
    private AbstractC1928u m10631r(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC1928u abstractC1928u = this.f8207d;
        if (abstractC1928u == null || abstractC1928u.f8213a != abstractC1888o) {
            this.f8207d = AbstractC1928u.m10645c(abstractC1888o);
        }
        return this.f8207d;
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: c */
    public int[] mo10398c(RecyclerView.AbstractC1888o abstractC1888o, View view) {
        int[] iArr = new int[2];
        if (abstractC1888o.mo9757x()) {
            iArr[0] = m10627n(abstractC1888o, view, m10630q(abstractC1888o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1888o.mo9758y()) {
            iArr[1] = m10627n(abstractC1888o, view, m10631r(abstractC1888o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: h */
    public View mo10402h(RecyclerView.AbstractC1888o abstractC1888o) {
        if (abstractC1888o.mo9758y()) {
            return m10629p(abstractC1888o, m10631r(abstractC1888o));
        }
        if (abstractC1888o.mo9757x()) {
            return m10629p(abstractC1888o, m10630q(abstractC1888o));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: i */
    public int mo10403i(RecyclerView.AbstractC1888o abstractC1888o, int i11, int i12) {
        int m10127i;
        View mo10402h;
        int m10112b;
        int i13;
        PointF mo9746d;
        int i14;
        int i15;
        if (!(abstractC1888o instanceof RecyclerView.AbstractC1898y.b) || (m10127i = abstractC1888o.m10127i()) == 0 || (mo10402h = mo10402h(abstractC1888o)) == null || (m10112b = abstractC1888o.m10112b(mo10402h)) == -1 || (mo9746d = ((RecyclerView.AbstractC1898y.b) abstractC1888o).mo9746d(m10127i - 1)) == null) {
            return -1;
        }
        int i16 = 0;
        if (abstractC1888o.mo9757x()) {
            i14 = m10628o(abstractC1888o, m10630q(abstractC1888o), i11, 0);
            if (mo9746d.x < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (abstractC1888o.mo9758y()) {
            i15 = m10628o(abstractC1888o, m10631r(abstractC1888o), 0, i12);
            if (mo9746d.y < 0.0f) {
                i15 = -i15;
            }
        } else {
            i15 = 0;
        }
        if (abstractC1888o.mo9758y()) {
            i14 = i15;
        }
        if (i14 == 0) {
            return -1;
        }
        int i17 = m10112b + i14;
        if (i17 >= 0) {
            i16 = i17;
        }
        if (i16 < m10127i) {
            return i16;
        }
        return i13;
    }
}
