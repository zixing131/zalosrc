package com.zing.zalo.p077ui.picker.stickerpanel.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.adapters.C7157o0;
import fn0.AbstractC19074t;
import p649xl.C29813g3;
import pm0.C24860q;

/* loaded from: classes6.dex */
public final class EmojiSystemPanelPage extends RelativeLayout implements InterfaceC12966p {

    /* renamed from: p */
    private final C29813g3 f67026p;

    /* renamed from: q */
    private C7157o0 f67027q;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.custom.EmojiSystemPanelPage$a */
    /* loaded from: classes6.dex */
    public static final class C12933a extends RecyclerView.AbstractC1890q {

        /* renamed from: a */
        final /* synthetic */ C1761c0 f67028a;

        C12933a(C1761c0 c1761c0) {
            this.f67028a = c1761c0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1890q
        /* renamed from: a */
        public boolean mo10175a(int i11, int i12) {
            this.f67028a.mo9224q(new C24860q(Integer.valueOf(i11), Integer.valueOf(i12)));
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EmojiSystemPanelPage(LayoutInflater layoutInflater, Context context) {
        super(context);
        AbstractC19074t.m100205c(context);
        C29813g3 m147978b = C29813g3.m147978b(layoutInflater, this);
        AbstractC19074t.m100207e(m147978b, "inflate(...)");
        this.f67026p = m147978b;
        m147978b.f137843r.setOverScrollMode(2);
        m147978b.f137843r.setLayoutManager(new LinearLayoutManager(context));
        m147978b.f137843r.setPadding(0, 0, 0, 0);
        m147978b.f137843r.setScrollBarStyle(0);
        m147978b.f137842q.setVisibility(8);
    }

    /* renamed from: a */
    public final void m72832a(int i11) {
        C7157o0 c7157o0 = this.f67027q;
        if (c7157o0 == null) {
            AbstractC19074t.m100223u("_adapter");
            c7157o0 = null;
        }
        c7157o0.m36417i0(i11);
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: g */
    public void mo72819g() {
        C7157o0 c7157o0 = this.f67027q;
        if (c7157o0 == null) {
            AbstractC19074t.m100223u("_adapter");
            c7157o0 = null;
        }
        c7157o0.m10008p();
    }

    public Integer getPageId() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12966p
    /* renamed from: i */
    public boolean mo72820i() {
        RecyclerView.AbstractC1888o layoutManager = this.f67026p.f137843r.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).m9740Y1() == 0) {
            return true;
        }
        return false;
    }

    public final void setListOnTouchListener(View.OnTouchListener onTouchListener) {
        AbstractC19074t.m100208f(onTouchListener, "listener");
        this.f67026p.f137843r.setOnTouchListener(onTouchListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiSystemPanelPage(LayoutInflater layoutInflater, Context context, int i11, C1755a0 c1755a0, C1761c0 c1761c0) {
        this(layoutInflater, context);
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(c1755a0, "liveData");
        AbstractC19074t.m100208f(c1761c0, "pagerFlingLiveData");
        C7157o0 c7157o0 = new C7157o0(true, c1755a0);
        this.f67027q = c7157o0;
        c7157o0.m36416h0(i11);
        RecyclerView recyclerView = this.f67026p.f137843r;
        C7157o0 c7157o02 = this.f67027q;
        if (c7157o02 == null) {
            AbstractC19074t.m100223u("_adapter");
            c7157o02 = null;
        }
        recyclerView.setAdapter(c7157o02);
        this.f67026p.f137843r.setOnFlingListener(new C12933a(c1761c0));
    }
}
