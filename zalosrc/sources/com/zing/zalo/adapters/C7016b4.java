package com.zing.zalo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ci.C3518o;
import com.zing.zalo.p077ui.mediastore.search.MediaStoreQuickSearchItemModuleView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.adapters.b4 */
/* loaded from: classes3.dex */
public final class C7016b4 extends RecyclerView.AbstractC1880g {

    /* renamed from: t */
    private b f38356t;

    /* renamed from: r */
    private final ArrayList f38354r = new ArrayList();

    /* renamed from: s */
    private final int f38355s = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: u */
    private boolean f38357u = true;

    /* renamed from: com.zing.zalo.adapters.b4$a */
    /* loaded from: classes3.dex */
    public static final class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public final void m35870i0(C3518o c3518o, boolean z11) {
            AbstractC19074t.m100208f(c3518o, "item");
            View view = this.f7784p;
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.ui.mediastore.search.MediaStoreQuickSearchItemModuleView");
            MediaStoreQuickSearchItemModuleView mediaStoreQuickSearchItemModuleView = (MediaStoreQuickSearchItemModuleView) view;
            mediaStoreQuickSearchItemModuleView.setEnable(z11);
            mediaStoreQuickSearchItemModuleView.m69627V(c3518o);
            mediaStoreQuickSearchItemModuleView.requestLayout();
        }
    }

    /* renamed from: com.zing.zalo.adapters.b4$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo35871a(C3518o c3518o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m35864N(C7016b4 c7016b4, C3518o c3518o, View view) {
        AbstractC19074t.m100208f(c7016b4, "this$0");
        AbstractC19074t.m100208f(c3518o, "$item");
        b bVar = c7016b4.f38356t;
        if (bVar != null) {
            bVar.mo35871a(c3518o);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        Object obj = this.f38354r.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        final C3518o c3518o = (C3518o) obj;
        aVar.m35870i0(c3518o, this.f38357u);
        aVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7016b4.m35864N(C7016b4.this, c3518o, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        MediaStoreQuickSearchItemModuleView mediaStoreQuickSearchItemModuleView = new MediaStoreQuickSearchItemModuleView(context);
        mediaStoreQuickSearchItemModuleView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        if (mediaStoreQuickSearchItemModuleView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = mediaStoreQuickSearchItemModuleView.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(this.f38355s);
        }
        return new a(mediaStoreQuickSearchItemModuleView);
    }

    /* renamed from: P */
    public final void m35867P(List list) {
        AbstractC19074t.m100208f(list, "list");
        this.f38354r.clear();
        this.f38354r.addAll(list);
        m10008p();
    }

    /* renamed from: Q */
    public final void m35868Q(boolean z11) {
        this.f38357u = z11;
        m10008p();
    }

    /* renamed from: R */
    public final void m35869R(b bVar) {
        AbstractC19074t.m100208f(bVar, "listener");
        this.f38356t = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38354r.size();
    }
}
