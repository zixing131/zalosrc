package va0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.toolstorage.bottomsheet.ToolStorageDetailFilterItemModuleView;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.List;
import p227i3.C20218v;

/* renamed from: va0.b */
/* loaded from: classes6.dex */
public final class C27957b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final List f130349r;

    /* renamed from: s */
    private final int f130350s;

    /* renamed from: t */
    private final InterfaceC18505l f130351t;

    /* renamed from: va0.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private ToolStorageDetailFilterItemModuleView f130352I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f130352I = (ToolStorageDetailFilterItemModuleView) view;
        }

        /* renamed from: i0 */
        public final ToolStorageDetailFilterItemModuleView m140903i0() {
            return this.f130352I;
        }
    }

    public C27957b(List list, int i11, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(list, "filters");
        AbstractC19074t.m100208f(interfaceC18505l, "onItemClicked");
        this.f130349r = list;
        this.f130350s = i11;
        this.f130351t = interfaceC18505l;
    }

    /* renamed from: M */
    private final String m140899M(int i11) {
        if (i11 >= 0 && i11 < this.f130349r.size()) {
            return (String) this.f130349r.get(i11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m140900P(C27957b c27957b, a aVar, View view) {
        AbstractC19074t.m100208f(c27957b, "this$0");
        AbstractC19074t.m100208f(aVar, "$viewHolder");
        c27957b.f130351t.mo205i9(Integer.valueOf(aVar.m9929A()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        ToolStorageDetailFilterItemModuleView m140903i0;
        boolean z11;
        AbstractC19074t.m100208f(aVar, "holder");
        String m140899M = m140899M(i11);
        if (m140899M != null && (m140903i0 = aVar.m140903i0()) != null) {
            if (i11 == this.f130350s) {
                z11 = true;
            } else {
                z11 = false;
            }
            m140903i0.m74847V(m140899M, z11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        ToolStorageDetailFilterItemModuleView toolStorageDetailFilterItemModuleView = new ToolStorageDetailFilterItemModuleView(viewGroup.getContext());
        final a aVar = new a(toolStorageDetailFilterItemModuleView);
        toolStorageDetailFilterItemModuleView.setOnClickListener(new View.OnClickListener() { // from class: va0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27957b.m140900P(C27957b.this, aVar, view);
            }
        });
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f130349r.size();
    }
}
