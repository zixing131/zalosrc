package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c30.C3245i;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.uicontrol.ScrollControlGridLayoutManager;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import p134el.C18470i;
import p268ji.C21272r;
import p354n3.C23528a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import x90.C29517b;

/* loaded from: classes6.dex */
public final class CameraPanelPage extends RecyclerView implements InterfaceC12966p {
    public static final C12926c Companion = new C12926c(null);

    /* renamed from: V0 */
    private final InterfaceC24854k f67008V0;

    /* renamed from: W0 */
    private final int f67009W0;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.CameraPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12924a extends RecyclerView.AbstractC1887n {

        /* renamed from: b */
        final /* synthetic */ int f67011b;

        C12924a(int i11) {
            this.f67011b = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int width = ((CameraPanelPage.this.getWidth() / this.f67011b) - CameraPanelPage.this.f67009W0) / 2;
            int m118742r = AbstractC23136l9.m118742r(7.0f);
            rect.set(width, m118742r, width, m118742r);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.CameraPanelPage$b */
    /* loaded from: classes6.dex */
    public static final class C12925b extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        private int f67012a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC12972v f67013b;

        /* renamed from: c */
        final /* synthetic */ CameraPanelPage f67014c;

        /* renamed from: d */
        final /* synthetic */ C1761c0 f67015d;

        C12925b(InterfaceC12972v interfaceC12972v, CameraPanelPage cameraPanelPage, C1761c0 c1761c0) {
            this.f67013b = interfaceC12972v;
            this.f67014c = cameraPanelPage;
            this.f67015d = c1761c0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            if (i11 == 0) {
                this.f67013b.set(Boolean.FALSE);
                this.f67014c.get_adapter().m10008p();
                this.f67015d.mo9224q(new C18470i(true, this.f67012a));
            } else {
                if (i11 == 1) {
                    C21272r.a aVar = C21272r.Companion;
                    if (((C21272r) aVar.m122672a()).m110178g()) {
                        ((C21272r) aVar.m122672a()).m110175d().m122673a().put(3);
                    }
                }
                this.f67013b.set(Boolean.TRUE);
                this.f67015d.mo9224q(new C18470i(false, this.f67012a));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            RecyclerView.AbstractC1888o layoutManager = this.f67014c.getLayoutManager();
            AbstractC19074t.m100206d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.f67012a = ((LinearLayoutManager) layoutManager).m9737T1();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.CameraPanelPage$c */
    /* loaded from: classes6.dex */
    public static final class C12926c {
        private C12926c() {
        }

        public /* synthetic */ C12926c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.CameraPanelPage$d */
    /* loaded from: classes6.dex */
    static final class C12927d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ LayoutInflater f67016q;

        /* renamed from: r */
        final /* synthetic */ C23528a f67017r;

        /* renamed from: s */
        final /* synthetic */ C1755a0 f67018s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC12972v f67019t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12927d(LayoutInflater layoutInflater, C23528a c23528a, C1755a0 c1755a0, InterfaceC12972v interfaceC12972v) {
            super(0);
            this.f67016q = layoutInflater;
            this.f67017r = c23528a;
            this.f67018s = c1755a0;
            this.f67019t = interfaceC12972v;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29517b mo12V4() {
            return new C29517b(this.f67016q, this.f67017r, this.f67018s, this.f67019t);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPanelPage(LayoutInflater layoutInflater, Context context, C23528a c23528a, C7110j8.d dVar, C1755a0 c1755a0, C1761c0 c1761c0, InterfaceC12972v interfaceC12972v) {
        super(context);
        InterfaceC24854k m129210a;
        int i11;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(c1755a0, "viewActionLiveData");
        AbstractC19074t.m100208f(c1761c0, "pageScrollLiveData");
        AbstractC19074t.m100208f(interfaceC12972v, "isScrolling");
        AbstractC19074t.m100205c(context);
        m129210a = AbstractC24856m.m129210a(new C12927d(layoutInflater, c23528a, c1755a0, interfaceC12972v));
        this.f67008V0 = m129210a;
        this.f67009W0 = AbstractC23136l9.m118739q(context, AbstractC16802y.item_sticker_height);
        setOverScrollMode(2);
        if (dVar != null) {
            i11 = dVar.f38885p;
        } else {
            i11 = 4;
        }
        setLayoutManager(new ScrollControlGridLayoutManager(context, i11));
        setAdapter(get_adapter());
        m9816A(new C12924a(i11));
        m9826E(new C12925b(interfaceC12972v, this, c1761c0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C29517b get_adapter() {
        return (C29517b) this.f67008V0.getValue();
    }

    /* renamed from: c2 */
    public final void m72818c2(C3245i c3245i, int i11) {
        AbstractC19074t.m100208f(c3245i, "curCate");
        get_adapter().m146742S(i11);
        get_adapter().m146741R(c3245i);
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        get_adapter().m10008p();
    }

    public Integer getPageId() {
        return get_adapter().m146737M();
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        RecyclerView.AbstractC1888o layoutManager = getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).m9740Y1() == 0) {
            return true;
        }
        return false;
    }
}
