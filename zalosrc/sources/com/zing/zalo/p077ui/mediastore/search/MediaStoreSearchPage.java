package com.zing.zalo.p077ui.mediastore.search;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.C1914g;
import androidx.recyclerview.widget.RecyclerView;
import au.EnumC2382z;
import ci.C3526u;
import com.zing.zalo.adapters.C7226u3;
import com.zing.zalo.p077ui.mediastore.MediaStoreBasePage;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreLinearLayoutManager;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import vc0.AbstractC27964c;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class MediaStoreSearchPage extends MediaStoreBasePage<InterfaceC12404a> {

    /* renamed from: q1 */
    private boolean f64468q1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPage$a */
    /* loaded from: classes6.dex */
    public static final class EnumC12391a {

        /* renamed from: p */
        public static final EnumC12391a f64469p = new EnumC12391a("MODE_SEARCH_TEXT_ONLY", 0);

        /* renamed from: q */
        public static final EnumC12391a f64470q = new EnumC12391a("MODE_SEARCH_TIME", 1);

        /* renamed from: r */
        private static final /* synthetic */ EnumC12391a[] f64471r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f64472s;

        static {
            EnumC12391a[] m69636b = m69636b();
            f64471r = m69636b;
            f64472s = AbstractC30166b.m148796a(m69636b);
        }

        private EnumC12391a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC12391a[] m69636b() {
            return new EnumC12391a[]{f64469p, f64470q};
        }

        public static EnumC12391a valueOf(String str) {
            return (EnumC12391a) Enum.valueOf(EnumC12391a.class, str);
        }

        public static EnumC12391a[] values() {
            return (EnumC12391a[]) f64471r.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.search.MediaStoreSearchPage$b */
    /* loaded from: classes6.dex */
    public static final class C12392b extends C1914g {
        C12392b() {
        }

        @Override // androidx.recyclerview.widget.C1914g, androidx.recyclerview.widget.AbstractC1933z
        /* renamed from: D */
        public boolean mo10485D(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, int i13, int i14) {
            AbstractC19074t.m100208f(abstractC1876c0, "holder");
            if ((abstractC1876c0 instanceof C7226u3.e) && !((C7226u3.e) abstractC1876c0).m36863x0()) {
                m10682J(abstractC1876c0);
                return false;
            }
            return super.mo10485D(abstractC1876c0, i11, i12, i13, i14);
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: KM */
    public void mo68875KM(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        int m118722k0 = (int) (2 * ((AbstractC23136l9.m118722k0() * 1.0f) / 320));
        int m9817A0 = recyclerView.m9817A0(view);
        int m10253b = c1899z.m10253b();
        if (m10253b > 0 && m9817A0 == m10253b - 1) {
            MediaStoreBasePage.InterfaceC12275b m68929yM = m68929yM();
            if (m68929yM != null) {
                i11 = m68929yM.mo68941p4();
            } else {
                i11 = 0;
            }
            rect.bottom = m118722k0 + i11;
            return;
        }
        rect.bottom = m118722k0;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage, com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: Ms */
    public void mo68879Ms(C3526u c3526u, EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "typeSearch");
        if (enumC2382z == EnumC2382z.f9944q) {
            C7226u3 m68868IM = m68868IM();
            if (m68868IM != null) {
                m68868IM.m36800J0(c3526u);
            }
        } else {
            C7226u3 m68868IM2 = m68868IM();
            if (m68868IM2 != null) {
                m68868IM2.m36795E0(c3526u, enumC2382z);
            }
        }
        mo68923ui();
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: NM */
    public C7226u3 mo68881NM(C7226u3.b bVar) {
        AbstractC19074t.m100208f(bVar, "createMSPageAdapterParams");
        C7226u3 mo68881NM = super.mo68881NM(bVar);
        mo68881NM.m9999J(true);
        mo68881NM.m36801K0(((InterfaceC12404a) m68863EM()).mo69644jD());
        return mo68881NM;
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: YM */
    public void mo68899YM(RecyclerView recyclerView, int i11) {
        if (i11 == 0) {
            this.f64468q1 = true;
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: ZM */
    public void mo68901ZM(int i11, int i12) {
        super.mo68901ZM(i11, i12);
        if (this.f64468q1) {
            MediaStoreBasePage.InterfaceC12275b m68929yM = m68929yM();
            if (m68929yM != null) {
                m68929yM.mo68942q4(false);
            }
            this.f64468q1 = false;
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage, com.zing.zalo.p077ui.mediastore.InterfaceC12371j
    /* renamed from: ge */
    public void mo68912ge(AbstractC27964c.a aVar, C7226u3.b bVar) {
        AbstractC19074t.m100208f(aVar, "dragSelectionListener");
        AbstractC19074t.m100208f(bVar, "createMSPageAdapterParams");
        super.mo68912ge(aVar, bVar);
        m68870JM().f139658r.setItemAnimator(new C12392b());
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "MediaStoreSearchPage";
    }

    /* renamed from: kN */
    public final EnumC12391a m69632kN() {
        return ((InterfaceC12404a) m68863EM()).mo69645uF();
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStoreBasePage
    /* renamed from: lN, reason: merged with bridge method [inline-methods] */
    public InterfaceC12404a mo68889UM() {
        return new MediaStoreSearchPagePresenter(this);
    }

    /* renamed from: mN */
    public final void m69634mN(EnumC12391a enumC12391a) {
        AbstractC19074t.m100208f(enumC12391a, "modeSearch");
        ((InterfaceC12404a) m68863EM()).mo69643Ve(enumC12391a);
    }

    /* renamed from: r4 */
    public final void m69635r4() {
        MediaStoreLinearLayoutManager m68860CM = m68860CM();
        if (m68860CM != null) {
            m68860CM.m9721B2(0, 0);
        }
    }
}
