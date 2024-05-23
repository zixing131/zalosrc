package com.zing.zalo.adapters;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.AbstractC12964n;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12952b;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12955e;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12957g;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12958h;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12959i;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12960j;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12961k;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12962l;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12963m;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.C12970t;
import com.zing.zalo.p077ui.picker.stickerpanel.custom.InterfaceC12965o;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p227i3.C20218v;
import p268ji.C21270p;
import p268ji.C21272r;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;

/* renamed from: com.zing.zalo.adapters.w7 */
/* loaded from: classes3.dex */
public final class C7252w7 extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final StickerIndicatorView.C13538e f39788r;

    /* renamed from: t */
    private c f39790t;

    /* renamed from: s */
    private List f39789s = new ArrayList();

    /* renamed from: u */
    private int f39791u = -1;

    /* renamed from: com.zing.zalo.adapters.w7$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.adapters.w7$b */
    /* loaded from: classes3.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }
    }

    /* renamed from: com.zing.zalo.adapters.w7$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        void mo36987a();

        /* renamed from: b */
        void mo36988b(View view, int i11);

        /* renamed from: c */
        void mo36989c();

        /* renamed from: d */
        void mo36990d(StickerIndicatorView stickerIndicatorView, int i11);

        /* renamed from: e */
        void mo36991e(View view, int i11);
    }

    public C7252w7(StickerIndicatorView.C13538e c13538e) {
        this.f39788r = c13538e;
    }

    /* renamed from: P */
    private final void m36967P(int i11, int i12) {
        C21270p.Companion.m110161b().m110152Z(((C21272r) C21272r.Companion.m122672a()).m110174c(), i11, i11 + "_1", i12);
    }

    /* renamed from: R */
    public static final void m36968R(C7252w7 c7252w7, int i11, View view) {
        AbstractC19074t.m100208f(c7252w7, "this$0");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        c7252w7.m36969T(view, i11);
    }

    /* renamed from: T */
    private final void m36969T(View view, int i11) {
        try {
            InterfaceC12965o m36979N = m36979N(i11);
            if (m36979N != null && this.f39790t != null) {
                if (m36979N instanceof C12963m) {
                    m36974Z();
                } else if (m36979N instanceof AbstractC12964n) {
                    m36975a0(view, i11, (AbstractC12964n) m36979N);
                } else if (m36979N instanceof C12958h) {
                    m36970V(view, i11);
                } else if (m36979N instanceof C12962l) {
                    m36973Y(view, i11);
                } else if (m36979N instanceof C12970t) {
                    m36977c0(view, i11);
                } else if (m36979N instanceof C12957g) {
                    m36976b0(view, i11);
                } else if (m36979N instanceof C12961k) {
                    m36972X();
                } else if (m36979N instanceof C12955e) {
                    m36971W(view, i11);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: V */
    private final void m36970V(View view, int i11) {
        if (this.f39791u != i11) {
            m36967P(1, 0);
        }
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36991e(view, i11);
        }
    }

    /* renamed from: W */
    private final void m36971W(View view, int i11) {
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36991e(view, i11);
        }
    }

    /* renamed from: X */
    private final void m36972X() {
        m36967P(10, 0);
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36987a();
        }
    }

    /* renamed from: Y */
    private final void m36973Y(View view, int i11) {
        if (this.f39791u != i11) {
            m36967P(2, 0);
        }
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36991e(view, i11);
        }
    }

    /* renamed from: Z */
    private final void m36974Z() {
        m36967P(8, 0);
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36989c();
        }
    }

    /* renamed from: a0 */
    private final void m36975a0(View view, int i11, AbstractC12964n abstractC12964n) {
        int i12;
        int i13;
        if (abstractC12964n instanceof C12952b) {
            int m16463e = abstractC12964n.m72862c().m16463e();
            if (m16463e == -2) {
                AbstractC23647d.m123897g("9198");
                i13 = 5;
                i12 = 0;
            } else {
                i12 = m16463e;
                i13 = 7;
            }
            m36967P(i13, i12);
        } else if ((abstractC12964n instanceof C12959i) || (abstractC12964n instanceof C12960j)) {
            m36967P(6, abstractC12964n.m72862c().f13854b);
        }
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36991e(view, i11);
        }
    }

    /* renamed from: b0 */
    private final void m36976b0(View view, int i11) {
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36991e(view, i11);
        }
    }

    /* renamed from: c0 */
    private final void m36977c0(View view, int i11) {
        if (this.f39791u != i11) {
            m36967P(4, 0);
        }
        c cVar = this.f39790t;
        if (cVar != null) {
            cVar.mo36991e(view, i11);
        }
        if ((view instanceof StickerIndicatorView) && !AbstractC23309i.m122077k0()) {
            ((StickerIndicatorView) view).m75911f();
            AbstractC23309i.m122395si(true);
        }
    }

    /* renamed from: M */
    public final List m36978M() {
        return this.f39789s;
    }

    /* renamed from: N */
    public final InterfaceC12965o m36979N(int i11) {
        if (i11 >= 0 && i11 < this.f39789s.size()) {
            return (InterfaceC12965o) this.f39789s.get(i11);
        }
        return null;
    }

    /* renamed from: O */
    public final int m36980O() {
        return this.f39791u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        try {
            InterfaceC12965o interfaceC12965o = (InterfaceC12965o) this.f39789s.get(i11);
            View view = bVar.f7784p;
            AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.ui.widget.StickerIndicatorView");
            StickerIndicatorView stickerIndicatorView = (StickerIndicatorView) view;
            Object obj = null;
            boolean z11 = false;
            if (this.f39788r == null) {
                stickerIndicatorView.setCustomStyle(null);
                if (!(interfaceC12965o instanceof C12959i)) {
                    if (interfaceC12965o instanceof C12960j) {
                    }
                }
                StickerIndicatorView.C13538e c13538e = new StickerIndicatorView.C13538e();
                c13538e.f69734p = 1.0f;
                c13538e.f69735q = 0;
                c13538e.f69736r = AbstractC23136l9.m118742r(30.0f);
                c13538e.f69737s = 0;
                stickerIndicatorView.setCustomStyle(c13538e);
            }
            stickerIndicatorView.setRedDotColor(AbstractC1388a.m6961c(stickerIndicatorView.getContext(), AbstractC16801x.cNotify1));
            if (interfaceC12965o instanceof C12961k) {
                stickerIndicatorView.setRedDotColor(Color.parseColor("#006AF5"));
            }
            stickerIndicatorView.setSticker(interfaceC12965o);
            if (i11 == this.f39791u) {
                z11 = true;
            }
            stickerIndicatorView.setSelected(z11);
            stickerIndicatorView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v7

                /* renamed from: q */
                public final /* synthetic */ int f39768q;

                public /* synthetic */ ViewOnClickListenerC7241v7(int i112) {
                    r2 = i112;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7252w7.m36968R(C7252w7.this, r2, view2);
                }
            });
            c cVar = this.f39790t;
            if (cVar != null) {
                cVar.mo36990d(stickerIndicatorView, i112);
            }
            Object m122672a = C21272r.Companion.m122672a();
            if (((C21272r) m122672a).m110178g()) {
                obj = m122672a;
            }
            C21272r c21272r = (C21272r) obj;
            if (c21272r != null) {
                c21272r.m110175d().m122681i(i112);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        return new b(new StickerIndicatorView(viewGroup.getContext(), this.f39788r));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U */
    public void mo9996G(b bVar) {
        AbstractC19074t.m100208f(bVar, "holder");
        c cVar = this.f39790t;
        if (cVar != null) {
            View view = bVar.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            cVar.mo36988b(view, bVar.m9929A());
        }
        super.mo9996G(bVar);
    }

    /* renamed from: d0 */
    public final void m36984d0(List list) {
        AbstractC19074t.m100208f(list, "data");
        this.f39789s.clear();
        this.f39789s.addAll(list);
    }

    /* renamed from: e0 */
    public final void m36985e0(c cVar) {
        AbstractC19074t.m100208f(cVar, "listener");
        this.f39790t = cVar;
    }

    /* renamed from: f0 */
    public final void m36986f0(int i11) {
        this.f39791u = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39789s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }
}
