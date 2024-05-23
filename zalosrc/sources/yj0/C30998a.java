package yj0;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1928u;
import androidx.recyclerview.widget.C1929v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* renamed from: yj0.a */
/* loaded from: classes7.dex */
public final class C30998a extends C1929v {

    /* renamed from: f */
    private AbstractC1928u f143004f;

    /* renamed from: g */
    private AbstractC1928u f143005g;

    /* renamed from: o */
    private final AbstractC1928u m150701o(RecyclerView.AbstractC1888o abstractC1888o) {
        if (this.f143005g == null) {
            this.f143005g = AbstractC1928u.m10643a(abstractC1888o);
        }
        AbstractC1928u abstractC1928u = this.f143005g;
        AbstractC19074t.m100205c(abstractC1928u);
        return abstractC1928u;
    }

    /* renamed from: q */
    private final AbstractC1928u m150702q(RecyclerView.AbstractC1888o abstractC1888o) {
        if (this.f143004f == null) {
            this.f143004f = AbstractC1928u.m10645c(abstractC1888o);
        }
        AbstractC1928u abstractC1928u = this.f143004f;
        AbstractC19074t.m100205c(abstractC1928u);
        return abstractC1928u;
    }

    /* renamed from: t */
    private final int m150703t(View view, AbstractC1928u abstractC1928u) {
        return abstractC1928u.mo10646d(view) - abstractC1928u.mo10651i();
    }

    /* renamed from: u */
    private final View m150704u(RecyclerView.AbstractC1888o abstractC1888o, AbstractC1928u abstractC1928u) {
        boolean z11;
        if (abstractC1888o instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC1888o;
            int m9745c2 = linearLayoutManager.m9745c2();
            if (linearLayoutManager.m9737T1() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m9745c2 != -1 && !z11) {
                return abstractC1888o.mo9732P(m9745c2);
            }
            return null;
        }
        return super.mo10402h(abstractC1888o);
    }

    @Override // androidx.recyclerview.widget.C1929v, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: c */
    public int[] mo10398c(RecyclerView.AbstractC1888o abstractC1888o, View view) {
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        AbstractC19074t.m100208f(view, "targetView");
        int[] iArr = new int[2];
        if (abstractC1888o.mo9757x()) {
            iArr[0] = m150703t(view, m150701o(abstractC1888o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1888o.mo9758y()) {
            iArr[1] = m150703t(view, m150702q(abstractC1888o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.C1929v, androidx.recyclerview.widget.AbstractC1906a0
    /* renamed from: h */
    public View mo10402h(RecyclerView.AbstractC1888o abstractC1888o) {
        AbstractC19074t.m100208f(abstractC1888o, "layoutManager");
        if (abstractC1888o instanceof LinearLayoutManager) {
            if (abstractC1888o.mo9757x()) {
                return m150704u(abstractC1888o, m150701o(abstractC1888o));
            }
            return m150704u(abstractC1888o, m150702q(abstractC1888o));
        }
        return super.mo10402h(abstractC1888o);
    }
}
