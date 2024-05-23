package bn;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bn.C2874g1;
import com.zing.zalo.feed.components.DefaultProfileActionItemView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bn.h1 */
/* loaded from: classes3.dex */
public class C2877h1 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f11467r = new ArrayList();

    /* renamed from: s */
    C2874g1.b f11468s;

    /* renamed from: bn.h1$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        DefaultProfileActionItemView f11469I;

        public a(View view, int i11) {
            super(view);
            m13832i0(view, i11);
        }

        /* renamed from: i0 */
        void m13832i0(View view, int i11) {
            if (i11 == 0 && (view instanceof DefaultProfileActionItemView)) {
                this.f11469I = (DefaultProfileActionItemView) view;
            }
        }
    }

    /* renamed from: L */
    public C2880i1 m13827L(int i11) {
        List list = this.f11467r;
        if (list != null) {
            return (C2880i1) list.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public void mo9990A(a aVar, int i11) {
        try {
            C2880i1 m13827L = m13827L(i11);
            if (aVar != null && m13827L != null && aVar.m9931C() == 0) {
                aVar.f11469I.m43599Y(m13827L, this.f11468s);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        DefaultProfileActionItemView defaultProfileActionItemView;
        if (i11 != 0) {
            defaultProfileActionItemView = null;
        } else {
            defaultProfileActionItemView = new DefaultProfileActionItemView(viewGroup.getContext());
        }
        if (defaultProfileActionItemView == null) {
            return null;
        }
        return new a(defaultProfileActionItemView, i11);
    }

    /* renamed from: O */
    public void m13830O(List list) {
        if (list != null) {
            this.f11467r = new ArrayList(list);
            m10008p();
        }
    }

    /* renamed from: P */
    public void m13831P(C2874g1.b bVar) {
        this.f11468s = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f11467r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C2880i1 m13827L = m13827L(i11);
        if (m13827L != null) {
            switch (m13827L.f11474c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    return 0;
            }
        }
        return -1;
    }
}
