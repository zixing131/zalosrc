package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import ea0.C18325e;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.m */
/* loaded from: classes6.dex */
public class C13056m extends RecyclerView.AbstractC1876c0 {
    public static final b Companion = new b(null);

    /* renamed from: I */
    private final InterfaceC18319c f67383I;

    /* renamed from: J */
    private final RecyclerView f67384J;

    /* renamed from: K */
    private final C18325e f67385K;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.m$a */
    /* loaded from: classes6.dex */
    public static final class a extends RecyclerView.AbstractC1892s {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            boolean z11;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            C18325e m73337k0 = C13056m.this.m73337k0();
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m73337k0.m97252T(z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.m$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final View m73339b(ViewGroup viewGroup) {
            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
            recyclerView.setId(AbstractC6918a0.recycler_view);
            recyclerView.setClipToPadding(false);
            recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return recyclerView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13056m(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73339b(viewGroup));
        int i11;
        C1914g c1914g;
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67383I = interfaceC18319c;
        View findViewById = this.f7784p.findViewById(AbstractC6918a0.recycler_view);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f67384J = recyclerView;
        C18325e c18325e = new C18325e();
        this.f67385K = c18325e;
        recyclerView.setAdapter(c18325e);
        c18325e.m97251S(interfaceC18319c);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        if (Build.VERSION.SDK_INT > 30) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        recyclerView.setOverScrollMode(i11);
        RecyclerView.AbstractC1885l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof C1914g) {
            c1914g = (C1914g) itemAnimator;
        } else {
            c1914g = null;
        }
        if (c1914g != null) {
            c1914g.m10694V(false);
        }
        recyclerView.m9826E(new a());
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m73335j0(C13056m c13056m, AbstractC28275a.i iVar, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 2) != 0) {
                obj = null;
            }
            c13056m.m73336i0(iVar, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0041 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:22:0x0008, B:25:0x0011, B:4:0x003b, B:6:0x0041, B:8:0x004e, B:10:0x0054, B:3:0x001d), top: B:21:0x0008 }] */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73336i0(AbstractC28275a.i iVar, Object obj) {
        LinearLayoutManager linearLayoutManager;
        AbstractC19074t.m100208f(iVar, "data");
        if (obj != null) {
            try {
                if (!AbstractC19074t.m100204b(obj, "HorizontalListChanged")) {
                    C18325e c18325e = this.f67385K;
                    c18325e.m10014v(0, c18325e.mo10003k(), obj);
                    if (!iVar.m142493g()) {
                        iVar.m142494h(false);
                        RecyclerView.AbstractC1888o layoutManager = this.f67384J.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            linearLayoutManager = (LinearLayoutManager) layoutManager;
                        } else {
                            linearLayoutManager = null;
                        }
                        if (linearLayoutManager != null) {
                            linearLayoutManager.m9721B2(0, 0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f67384J.setPadding(iVar.m142489c(), iVar.m142491e(), iVar.m142490d(), iVar.m142488b());
        this.f67385K.m10635O(iVar.m142487a());
        if (!iVar.m142493g()) {
        }
    }

    /* renamed from: k0 */
    public final C18325e m73337k0() {
        return this.f67385K;
    }
}
