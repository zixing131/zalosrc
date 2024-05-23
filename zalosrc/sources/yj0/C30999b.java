package yj0;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1928u;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: yj0.b */
/* loaded from: classes7.dex */
public class C30999b extends C1929v {

    /* renamed from: f */
    private AbstractC1928u f143006f;

    /* renamed from: g */
    private AbstractC1928u f143007g;

    /* renamed from: o */
    private AbstractC1928u m150705o(RecyclerView.AbstractC1888o abstractC1888o) {
        if (this.f143007g == null) {
            this.f143007g = AbstractC1928u.m10643a(abstractC1888o);
        }
        return this.f143007g;
    }

    /* renamed from: q */
    private AbstractC1928u m150706q(RecyclerView.AbstractC1888o abstractC1888o) {
        if (this.f143006f == null) {
            this.f143006f = AbstractC1928u.m10645c(abstractC1888o);
        }
        return this.f143006f;
    }

    /* renamed from: t */
    private int m150707t(View view, AbstractC1928u abstractC1928u) {
        return abstractC1928u.mo10649g(view) - abstractC1928u.mo10656n();
    }

    /* renamed from: u */
    private View m150708u(RecyclerView.AbstractC1888o abstractC1888o, AbstractC1928u abstractC1928u) {
        boolean z11;
        if (abstractC1888o instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC1888o;
            int m9740Y1 = linearLayoutManager.m9740Y1();
            if (linearLayoutManager.m9741Z1() == abstractC1888o.m10127i() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m9740Y1 == -1 || z11) {
                return null;
            }
            View mo9732P = abstractC1888o.mo9732P(m9740Y1);
            if (abstractC1928u.mo10646d(mo9732P) >= abstractC1928u.mo10647e(mo9732P) / 2 && abstractC1928u.mo10646d(mo9732P) > 0) {
                return mo9732P;
            }
            if (((LinearLayoutManager) abstractC1888o).m9741Z1() == abstractC1888o.m10127i() - 1) {
                return null;
            }
            return abstractC1888o.mo9732P(m9740Y1 + 1);
        }
        return super.mo10402h(abstractC1888o);
    }

    @Override // androidx.recyclerview.widget.C1929v, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: c */
    public int[] mo10398c(RecyclerView.AbstractC1888o abstractC1888o, View view) {
        int[] iArr = new int[2];
        if (abstractC1888o.mo9757x()) {
            iArr[0] = m150707t(view, m150705o(abstractC1888o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1888o.mo9758y()) {
            iArr[1] = m150707t(view, m150706q(abstractC1888o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.C1929v, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: h */
    public View mo10402h(RecyclerView.AbstractC1888o abstractC1888o) {
        if (abstractC1888o instanceof LinearLayoutManager) {
            if (abstractC1888o.mo9757x()) {
                return m150708u(abstractC1888o, m150705o(abstractC1888o));
            }
            return m150708u(abstractC1888o, m150706q(abstractC1888o));
        }
        return super.mo10402h(abstractC1888o);
    }
}
