package y10;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.data.model.SimilarChannel;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;
import z10.C31175l0;

/* renamed from: y10.e */
/* loaded from: classes5.dex */
public final class C30262e extends RecyclerView.AbstractC1892s {

    /* renamed from: a */
    private final InterfaceC18509p f140601a;

    /* renamed from: b */
    private RecyclerView f140602b;

    public C30262e(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "onVisibleComplete");
        this.f140601a = interfaceC18509p;
    }

    /* renamed from: f */
    private final void m149318f(C31175l0.a aVar, int i11) {
        SimilarChannel m151783j0 = aVar.m151783j0();
        if (m151783j0 != null && !m151783j0.m51206g()) {
            this.f140601a.mo240pC(m151783j0, Integer.valueOf(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
    /* renamed from: d */
    public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        super.mo10176d(recyclerView, i11, i12);
        this.f140602b = recyclerView;
        if (recyclerView.getHeight() > 0 && AbstractC26112n.m134380U(recyclerView)) {
            m149319g();
        }
    }

    /* renamed from: g */
    public final void m149319g() {
        LinearLayoutManager linearLayoutManager;
        C31175l0.a aVar;
        RecyclerView recyclerView = this.f140602b;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return;
        }
        int m9737T1 = linearLayoutManager.m9737T1();
        int m9741Z1 = linearLayoutManager.m9741Z1();
        if (m9737T1 == -1 || m9741Z1 == -1 || m9737T1 > m9741Z1) {
            return;
        }
        while (true) {
            RecyclerView.AbstractC1876c0 m9900t0 = recyclerView.m9900t0(m9737T1);
            if (m9900t0 instanceof C31175l0.a) {
                aVar = (C31175l0.a) m9900t0;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                m149318f(aVar, m9737T1);
            }
            if (m9737T1 != m9741Z1) {
                m9737T1++;
            } else {
                return;
            }
        }
    }
}
