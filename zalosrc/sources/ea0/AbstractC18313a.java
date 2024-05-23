package ea0;

import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p612wk.AbstractC29069a;

/* renamed from: ea0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC18313a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final List f92612r = new ArrayList();

    /* renamed from: L */
    public final List m97242L() {
        return this.f92612r;
    }

    /* renamed from: M */
    public final Object m97243M(int i11) {
        return this.f92612r.get(i11);
    }

    /* renamed from: N */
    public final void m97244N(List list) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        AbstractC19074t.m100208f(list, "list");
        synchronized (this.f92612r) {
            if (this.f92612r.size() == 1 && list.size() == 1 && (this.f92612r.get(0) instanceof AbstractC29069a.d) && this.f92612r.get(0) == list.get(0)) {
                return;
            }
            if (this.f92612r.isEmpty() && list.isEmpty()) {
                return;
            }
            if ((!this.f92612r.isEmpty()) && (!list.isEmpty())) {
                Object obj = this.f92612r.get(0);
                AbstractC29069a.r rVar = AbstractC29069a.r.f134732b;
                if (AbstractC19074t.m100204b(obj, rVar) && AbstractC19074t.m100204b(list.get(0), rVar)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f92612r.size() > 1 && list.size() > 1 && AbstractC19074t.m100204b(this.f92612r.get(1), rVar) && AbstractC19074t.m100204b(list.get(1), rVar)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f92612r.size() > 2 && list.size() > 2 && AbstractC19074t.m100204b(this.f92612r.get(2), rVar) && AbstractC19074t.m100204b(list.get(2), rVar)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.f92612r.size() > 3 && list.size() > 3 && AbstractC19074t.m100204b(this.f92612r.get(3), rVar) && AbstractC19074t.m100204b(list.get(3), rVar)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f92612r.clear();
                this.f92612r.addAll(list);
                if (z13 && z12 && z11) {
                    m10013u(3, list.size() - 3);
                    return;
                }
                if (z12 && z11) {
                    m10013u(2, list.size() - 2);
                    return;
                }
                if (z11) {
                    m10013u(1, list.size() - 1);
                    return;
                }
                if (z12) {
                    m10009q(0);
                    m10013u(2, list.size() - 2);
                    return;
                } else if (z13) {
                    m10009q(0);
                    m10009q(1);
                    m10013u(3, list.size() - 3);
                    return;
                } else if (z14) {
                    m10013u(0, 3);
                    m10013u(4, list.size() - 4);
                    return;
                }
            }
            this.f92612r.clear();
            this.f92612r.addAll(list);
            m10008p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f92612r.size();
    }
}
