package com.zing.zalo.p077ui.searchglobal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import ea0.C18316b;
import ea0.C18325e;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* loaded from: classes6.dex */
public final class SearchGlobalPreStateLayout extends FrameLayout implements InterfaceC18319c {

    /* renamed from: p */
    private final RecyclerView f67437p;

    /* renamed from: q */
    private final C18325e f67438q;

    /* renamed from: r */
    private InterfaceC18319c f67439r;

    /* renamed from: s */
    private boolean f67440s;

    /* renamed from: com.zing.zalo.ui.searchglobal.widget.SearchGlobalPreStateLayout$a */
    /* loaded from: classes6.dex */
    public static final class C13080a extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        private boolean f67442a;

        C13080a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 != 0) {
                if (i11 == 1 && !this.f67442a) {
                    InterfaceC18319c actionResponder = SearchGlobalPreStateLayout.this.getActionResponder();
                    if (actionResponder != null) {
                    }
                    this.f67442a = true ^ this.f67442a;
                    return;
                }
                return;
            }
            this.f67442a = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchGlobalPreStateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        InterfaceC18319c interfaceC18319c = this.f67439r;
        if (interfaceC18319c != null) {
            return (C18316b) interfaceC18319c.mo205i9(c18316b);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m73393b() {
        return this.f67440s;
    }

    /* renamed from: c */
    public final void m73394c(List list) {
        AbstractC19074t.m100208f(list, "list");
        this.f67438q.m10635O(list);
    }

    public final InterfaceC18319c getActionResponder() {
        return this.f67439r;
    }

    public final C18325e getAdapter() {
        return this.f67438q;
    }

    public final RecyclerView getRecyclerView() {
        return this.f67437p;
    }

    public final void setActionResponder(InterfaceC18319c interfaceC18319c) {
        this.f67439r = interfaceC18319c;
    }

    public final void setRecyclerViewScrollable(boolean z11) {
        this.f67440s = z11;
    }

    public /* synthetic */ SearchGlobalPreStateLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGlobalPreStateLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        C18325e c18325e = new C18325e();
        this.f67438q = c18325e;
        this.f67440s = true;
        View.inflate(context, AbstractC7409c0.search_global_prestate, this);
        View findViewById = findViewById(AbstractC6918a0.recycler_view);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f67437p = recyclerView;
        recyclerView.setHasFixedSize(true);
        RecyclerView.AbstractC1885l itemAnimator = recyclerView.getItemAnimator();
        C1914g c1914g = itemAnimator instanceof C1914g ? (C1914g) itemAnimator : null;
        if (c1914g != null) {
            c1914g.m10694V(false);
        }
        c18325e.m97251S(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.zing.zalo.ui.searchglobal.widget.SearchGlobalPreStateLayout.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
            /* renamed from: x */
            public boolean mo9757x() {
                if (this.m73393b() && super.mo9757x()) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1888o
            /* renamed from: y */
            public boolean mo9758y() {
                if (this.m73393b() && super.mo9758y()) {
                    return true;
                }
                return false;
            }
        });
        recyclerView.setAdapter(c18325e);
        recyclerView.m9826E(new C13080a());
    }
}
