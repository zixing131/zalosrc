package com.zing.zalo.feed.mvp.visibletimelimit;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p492rr.C25968k;
import p649xl.AbstractC30130y3;

/* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.a */
/* loaded from: classes4.dex */
public final class C8827a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final a f47190r;

    /* renamed from: s */
    private List f47191s;

    /* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo47141a(C25968k c25968k);
    }

    /* renamed from: com.zing.zalo.feed.mvp.visibletimelimit.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final AbstractC30130y3 f47192I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC30130y3 abstractC30130y3) {
            super(abstractC30130y3.getRoot());
            AbstractC19074t.m100208f(abstractC30130y3, "binding");
            this.f47192I = abstractC30130y3;
        }

        /* renamed from: i0 */
        public final void m47147i0(C25968k c25968k, a aVar) {
            AbstractC19074t.m100208f(c25968k, "itemData");
            AbstractC19074t.m100208f(aVar, "eventListener");
            this.f47192I.mo148723Q(c25968k);
            this.f47192I.mo148724R(aVar);
            this.f47192I.m8509o();
        }
    }

    public C8827a(a aVar) {
        AbstractC19074t.m100208f(aVar, "eventListener");
        this.f47190r = aVar;
        this.f47191s = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        bVar.m47147i0((C25968k) this.f47191s.get(i11), this.f47190r);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        ViewDataBinding m8554e = AbstractC1673g.m8554e(LayoutInflater.from(viewGroup.getContext()), AbstractC7409c0.feed_visible_time_limit_options_item_view, viewGroup, false);
        AbstractC19074t.m100207e(m8554e, "inflate(...)");
        return new b((AbstractC30130y3) m8554e);
    }

    /* renamed from: N */
    public final void m47145N(List list) {
        AbstractC19074t.m100208f(list, "data");
        this.f47191s = list;
    }

    /* renamed from: O */
    public final void m47146O(C25968k c25968k) {
        boolean z11;
        AbstractC19074t.m100208f(c25968k, "currentSelectedOption");
        for (C25968k c25968k2 : this.f47191s) {
            if (c25968k2.m133746f() == c25968k.m133746f()) {
                z11 = true;
            } else {
                z11 = false;
            }
            c25968k2.m133748h(z11);
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f47191s.size();
    }
}
