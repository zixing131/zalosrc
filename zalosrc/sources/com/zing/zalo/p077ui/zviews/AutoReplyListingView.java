package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.C0708i;
import ac.InterfaceC0733x;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.showcase.C13309e;
import com.zing.zalo.p077ui.showcase.WalkThroughOnboardView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p649xl.C29863j;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import sa0.C26209i;
import ss.C26372d;
import ss.C26376h;
import ss.C26377i;
import ss.C26378j;
import ss.C26379k;

/* loaded from: classes6.dex */
public final class AutoReplyListingView extends SlidableZaloView implements InterfaceC0733x {
    public static final C14067a Companion = new C14067a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f72238P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C26377i.class), new C14081o(new C14080n(this)), C14069c.f72245q);

    /* renamed from: Q0 */
    private C29863j f72239Q0;

    /* renamed from: R0 */
    private C26372d f72240R0;

    /* renamed from: S0 */
    private LinearLayoutManager f72241S0;

    /* renamed from: T0 */
    private View f72242T0;

    /* renamed from: U0 */
    private boolean f72243U0;

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$a */
    /* loaded from: classes6.dex */
    public static final class C14067a {
        private C14067a() {
        }

        public /* synthetic */ C14067a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$b */
    /* loaded from: classes6.dex */
    public static final class C14068b implements C26372d.e {
        C14068b() {
        }

        @Override // ss.C26372d.e
        /* renamed from: a */
        public void mo78250a() {
            AutoReplyListingView.this.m78248yM().m135915V();
        }

        @Override // ss.C26372d.e
        /* renamed from: b */
        public void mo78251b(long j11) {
            AutoReplyListingView.this.m78248yM().m135914U(j11);
        }

        @Override // ss.C26372d.e
        /* renamed from: c */
        public void mo78252c(C26376h c26376h, boolean z11) {
            AbstractC19074t.m100208f(c26376h, "item");
            AutoReplyListingView.this.m78248yM().m135919Z(c26376h, z11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$c */
    /* loaded from: classes6.dex */
    static final class C14069c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14069c f72245q = new C14069c();

        C14069c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C26378j();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14070d extends C19071q implements InterfaceC18505l {
        C14070d(Object obj) {
            super(1, obj, AutoReplyListingView.class, "onDataAutoReplyChanged", "onDataAutoReplyChanged(Ljava/util/ArrayList;)V", 0);
        }

        /* renamed from: h */
        public final void m78254h(ArrayList arrayList) {
            AbstractC19074t.m100208f(arrayList, "p0");
            ((AutoReplyListingView) this.f94922q).m78220GM(arrayList);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78254h((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14071e extends C19071q implements InterfaceC18505l {
        C14071e(Object obj) {
            super(1, obj, AutoReplyListingView.class, "openAutoReplyCreatingView", "openAutoReplyCreatingView(Lcom/zing/zalo/group/autoreply/AutoReplyListingViewModel$OpenCreatingAutoReplyData;)V", 0);
        }

        /* renamed from: h */
        public final void m78255h(C26377i.a aVar) {
            AbstractC19074t.m100208f(aVar, "p0");
            ((AutoReplyListingView) this.f94922q).m78222IM(aVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78255h((C26377i.a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14072f extends C19071q implements InterfaceC18505l {
        C14072f(Object obj) {
            super(1, obj, AutoReplyListingView.class, "showDialogConfirmDisable", "showDialogConfirmDisable(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78256h(boolean z11) {
            ((AutoReplyListingView) this.f94922q).m78223JM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78256h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14073g extends C19071q implements InterfaceC18505l {
        C14073g(Object obj) {
            super(1, obj, AutoReplyListingView.class, "showToast", "showToast(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m78257h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((AutoReplyListingView) this.f94922q).m78229PM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78257h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14074h extends C19071q implements InterfaceC18505l {
        C14074h(Object obj) {
            super(1, obj, AutoReplyListingView.class, "notifyDataSetChanged", "notifyDataSetChanged(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78258h(boolean z11) {
            ((AutoReplyListingView) this.f94922q).m78216CM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78258h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14075i extends C19071q implements InterfaceC18505l {
        C14075i(Object obj) {
            super(1, obj, AutoReplyListingView.class, "showOnboardingCard", "showOnboardingCard(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78259h(boolean z11) {
            ((AutoReplyListingView) this.f94922q).m78224KM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78259h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$j */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14076j extends C19071q implements InterfaceC18505l {
        C14076j(Object obj) {
            super(1, obj, AutoReplyListingView.class, "showOnboardingFlowSpecific", "showOnboardingFlowSpecific(I)V", 0);
        }

        /* renamed from: h */
        public final void m78260h(int i11) {
            ((AutoReplyListingView) this.f94922q).m78227NM(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78260h(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$k */
    /* loaded from: classes6.dex */
    static final class C14077k implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f72246p;

        C14077k(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f72246p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f72246p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f72246p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$l */
    /* loaded from: classes6.dex */
    public static final class C14078l implements WalkThroughOnboardView.InterfaceC13300b {
        C14078l() {
        }

        @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
        /* renamed from: a */
        public void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
            AbstractC19074t.m100208f(walkThroughOnboardView, "walkThroughOnboardView");
            AutoReplyListingView.this.f72243U0 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$m */
    /* loaded from: classes6.dex */
    public static final class C14079m implements WalkThroughOnboardView.InterfaceC13300b {
        C14079m() {
        }

        @Override // com.zing.zalo.p077ui.showcase.WalkThroughOnboardView.InterfaceC13300b
        /* renamed from: a */
        public void mo74659a(WalkThroughOnboardView walkThroughOnboardView) {
            AbstractC19074t.m100208f(walkThroughOnboardView, "walkThroughOnboardView");
            AutoReplyListingView.this.f72243U0 = false;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$n */
    /* loaded from: classes6.dex */
    public static final class C14080n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f72249q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14080n(ZaloView zaloView) {
            super(0);
            this.f72249q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f72249q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyListingView$o */
    /* loaded from: classes6.dex */
    public static final class C14081o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f72250q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14081o(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f72250q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f72250q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: AM */
    public static final void m78214AM(AutoReplyListingView autoReplyListingView) {
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        if (C23055e5.m118272g(true)) {
            AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.i1
                public /* synthetic */ RunnableC15720i1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AutoReplyListingView.m78215BM(AutoReplyListingView.this);
                }
            }, 200L);
            return;
        }
        C29863j c29863j = autoReplyListingView.f72239Q0;
        if (c29863j == null) {
            AbstractC19074t.m100223u("binding");
            c29863j = null;
        }
        c29863j.f138217q.setRefreshing(false);
    }

    /* renamed from: BM */
    public static final void m78215BM(AutoReplyListingView autoReplyListingView) {
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        autoReplyListingView.m78248yM().m135921b0();
    }

    /* renamed from: CM */
    public final void m78216CM(boolean z11) {
        if (z11) {
            C26372d c26372d = this.f72240R0;
            if (c26372d == null) {
                AbstractC19074t.m100223u("mAdapter");
                c26372d = null;
            }
            c26372d.m10008p();
        }
    }

    /* renamed from: DM */
    public static final void m78217DM(AutoReplyListingView autoReplyListingView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        autoReplyListingView.m78248yM().m135916W();
    }

    /* renamed from: EM */
    public static final void m78218EM(AutoReplyListingView autoReplyListingView, InterfaceC17463d interfaceC17463d) {
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        autoReplyListingView.m78248yM().m135918Y();
    }

    /* renamed from: FM */
    public static final void m78219FM(AutoReplyListingView autoReplyListingView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        interfaceC17463d.dismiss();
        autoReplyListingView.m78225LM();
    }

    /* renamed from: GM */
    public final void m78220GM(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0) {
            arrayList2.add(new C26372d.d(1, 0L, 2, null));
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                arrayList2.add(new C26372d.b((C26376h) obj, ((C26376h) arrayList.get(i11)).m135880g()));
            }
        } else {
            arrayList2.add(new C26372d.d(2, 0L, 2, null));
        }
        C26372d c26372d = this.f72240R0;
        C29863j c29863j = null;
        if (c26372d == null) {
            AbstractC19074t.m100223u("mAdapter");
            c26372d = null;
        }
        c26372d.m135783S(arrayList2);
        C26372d c26372d2 = this.f72240R0;
        if (c26372d2 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c26372d2 = null;
        }
        c26372d2.m10008p();
        C29863j c29863j2 = this.f72239Q0;
        if (c29863j2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29863j = c29863j2;
        }
        c29863j.f138217q.setRefreshing(false);
    }

    /* renamed from: HM */
    public static final void m78221HM(AutoReplyListingView autoReplyListingView, View view) {
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        autoReplyListingView.m78248yM().m135917X();
    }

    /* renamed from: IM */
    public final void m78222IM(C26377i.a aVar) {
        C24848g0 c24848g0;
        C17487o0 m92662fJ;
        Bundle bundle = new Bundle();
        Long m135928a = aVar.m135928a();
        if (m135928a != null) {
            bundle.putLong("EXTRA_AUTO_REPLY_ID", m135928a.longValue());
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if ((c24848g0 != null || !C26379k.f125351a.m135932c(true)) && (m92662fJ = m92662fJ()) != null) {
            m92662fJ.m93066i2(AutoReplyCreatingView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: JM */
    public final void m78223JM(boolean z11) {
        if (z11) {
            showDialog(0);
        }
    }

    /* renamed from: KM */
    public final void m78224KM(boolean z11) {
        if (z11) {
            showDialog(1);
            AbstractC0924m0.m3543Wd(true);
        }
    }

    /* renamed from: LM */
    private final void m78225LM() {
        if (this.f72243U0) {
            return;
        }
        this.f72243U0 = true;
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.j1
            public /* synthetic */ RunnableC15756j1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AutoReplyListingView.m78226MM(AutoReplyListingView.this);
            }
        });
    }

    /* renamed from: MM */
    public static final void m78226MM(AutoReplyListingView autoReplyListingView) {
        int m116580c;
        int m116584g;
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        try {
            C29863j c29863j = autoReplyListingView.f72239Q0;
            C29863j c29863j2 = null;
            if (c29863j == null) {
                AbstractC19074t.m100223u("binding");
                c29863j = null;
            }
            RelativeLayout root = c29863j.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            C13309e c13309e = new C13309e(root);
            View view = autoReplyListingView.f72242T0;
            if (view != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step1_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step1_desc);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                WalkThroughOnboardView.C13302d c13302d = new WalkThroughOnboardView.C13302d(m118743r0, m118743r02, new C26209i(view), null, 8, null);
                c13302d.m74672l(true);
                c13302d.m74673m(true);
                c13309e.m74724b(c13302d);
            }
            LinearLayoutManager linearLayoutManager = autoReplyListingView.f72241S0;
            if (linearLayoutManager == null) {
                AbstractC19074t.m100223u("mLayoutManager");
                linearLayoutManager = null;
            }
            int m9737T1 = linearLayoutManager.m9737T1();
            LinearLayoutManager linearLayoutManager2 = autoReplyListingView.f72241S0;
            if (linearLayoutManager2 == null) {
                AbstractC19074t.m100223u("mLayoutManager");
                linearLayoutManager2 = null;
            }
            int m9741Z1 = linearLayoutManager2.m9741Z1();
            if (m9737T1 >= 0 && m9741Z1 >= 0) {
                View view2 = null;
                View view3 = null;
                int i11 = 0;
                if (m9737T1 <= m9741Z1) {
                    while (true) {
                        C26372d c26372d = autoReplyListingView.f72240R0;
                        if (c26372d == null) {
                            AbstractC19074t.m100223u("mAdapter");
                            c26372d = null;
                        }
                        if (c26372d.mo10005m(m9737T1) == 0) {
                            C29863j c29863j3 = autoReplyListingView.f72239Q0;
                            if (c29863j3 == null) {
                                AbstractC19074t.m100223u("binding");
                                c29863j3 = null;
                            }
                            RecyclerView recyclerView = c29863j3.f138217q.f83582p0;
                            if (recyclerView != null) {
                                view3 = recyclerView.getChildAt(m9737T1);
                            } else {
                                view3 = null;
                            }
                            if (view2 == null) {
                                view2 = view3;
                            }
                            i11++;
                            if (i11 >= 2) {
                                break;
                            }
                        }
                        if (m9737T1 == m9741Z1) {
                            break;
                        } else {
                            m9737T1++;
                        }
                    }
                }
                if (i11 > 0 && view2 != null && view3 != null) {
                    int[] iArr = new int[2];
                    C29863j c29863j4 = autoReplyListingView.f72239Q0;
                    if (c29863j4 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29863j2 = c29863j4;
                    }
                    c29863j2.getRoot().getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    view2.getLocationInWindow(iArr2);
                    int[] iArr3 = new int[2];
                    view3.getLocationInWindow(iArr3);
                    Rect rect = new Rect();
                    m116580c = AbstractC22543l.m116580c(iArr2[0], iArr3[0]);
                    int i12 = m116580c - iArr[0];
                    rect.left = i12;
                    rect.top = iArr2[1] - iArr[1];
                    m116584g = AbstractC22543l.m116584g(view2.getWidth(), view3.getWidth());
                    rect.right = i12 + m116584g;
                    rect.bottom = (iArr3[1] - iArr[1]) + view3.getHeight();
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step2_title);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step2_desc);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    C26209i c26209i = new C26209i(view2);
                    c26209i.f124547b = rect;
                    c26209i.f124548c = AbstractC23136l9.m118742r(8.0f);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    WalkThroughOnboardView.C13302d c13302d2 = new WalkThroughOnboardView.C13302d(m118743r03, m118743r04, c26209i, null, 8, null);
                    c13302d2.m74672l(true);
                    c13302d2.m74673m(true);
                    c13302d2.m74674n(5);
                    c13309e.m74724b(c13302d2);
                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step3_title);
                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                    String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step3_desc);
                    AbstractC19074t.m100207e(m118743r06, "getString(...)");
                    C26209i c26209i2 = new C26209i(view2);
                    c26209i2.f124548c = AbstractC23136l9.m118742r(8.0f);
                    WalkThroughOnboardView.C13302d c13302d3 = new WalkThroughOnboardView.C13302d(m118743r05, m118743r06, c26209i2, null, 8, null);
                    c13302d3.m74672l(true);
                    c13302d3.m74673m(true);
                    c13302d3.m74674n(5);
                    c13309e.m74724b(c13302d3);
                    View findViewById = view2.findViewById(AbstractC6918a0.enable_switch);
                    if (findViewById != null) {
                        String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step4_title);
                        AbstractC19074t.m100207e(m118743r07, "getString(...)");
                        String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_newbie_step4_desc);
                        AbstractC19074t.m100207e(m118743r08, "getString(...)");
                        C26209i c26209i3 = new C26209i(findViewById);
                        c26209i3.f124548c = AbstractC23136l9.m118742r(8.0f);
                        WalkThroughOnboardView.C13302d c13302d4 = new WalkThroughOnboardView.C13302d(m118743r07, m118743r08, c26209i3, null, 8, null);
                        c13302d4.m74673m(true);
                        c13309e.m74724b(c13302d4);
                    }
                }
            }
            c13309e.m74728g(new C14078l());
            c13309e.m74729h();
            AbstractC0924m0.m3543Wd(true);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: NM */
    public final void m78227NM(int i11) {
        if (this.f72243U0) {
            return;
        }
        this.f72243U0 = true;
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.h1

            /* renamed from: q */
            public final /* synthetic */ int f80528q;

            public /* synthetic */ RunnableC15683h1(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AutoReplyListingView.m78228OM(AutoReplyListingView.this, r2);
            }
        });
    }

    /* renamed from: OM */
    public static final void m78228OM(AutoReplyListingView autoReplyListingView, int i11) {
        AbstractC19074t.m100208f(autoReplyListingView, "this$0");
        try {
            C29863j c29863j = autoReplyListingView.f72239Q0;
            View view = null;
            if (c29863j == null) {
                AbstractC19074t.m100223u("binding");
                c29863j = null;
            }
            RelativeLayout root = c29863j.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            C13309e c13309e = new C13309e(root);
            LinearLayoutManager linearLayoutManager = autoReplyListingView.f72241S0;
            if (linearLayoutManager == null) {
                AbstractC19074t.m100223u("mLayoutManager");
                linearLayoutManager = null;
            }
            int m9737T1 = linearLayoutManager.m9737T1();
            LinearLayoutManager linearLayoutManager2 = autoReplyListingView.f72241S0;
            if (linearLayoutManager2 == null) {
                AbstractC19074t.m100223u("mLayoutManager");
                linearLayoutManager2 = null;
            }
            int m9741Z1 = linearLayoutManager2.m9741Z1();
            if (m9737T1 >= 0 && m9741Z1 >= 0) {
                if (m9737T1 <= m9741Z1) {
                    while (true) {
                        C26372d c26372d = autoReplyListingView.f72240R0;
                        if (c26372d == null) {
                            AbstractC19074t.m100223u("mAdapter");
                            c26372d = null;
                        }
                        if (c26372d.mo10005m(m9737T1) == 0) {
                            C26372d c26372d2 = autoReplyListingView.f72240R0;
                            if (c26372d2 == null) {
                                AbstractC19074t.m100223u("mAdapter");
                                c26372d2 = null;
                            }
                            C26372d.d m135782O = c26372d2.m135782O(m9737T1);
                            if ((m135782O instanceof C26372d.b) && ((C26372d.b) m135782O).m135785c().m135881h() == i11) {
                                C29863j c29863j2 = autoReplyListingView.f72239Q0;
                                if (c29863j2 == null) {
                                    AbstractC19074t.m100223u("binding");
                                    c29863j2 = null;
                                }
                                RecyclerView recyclerView = c29863j2.f138217q.f83582p0;
                                if (recyclerView != null) {
                                    view = recyclerView.getChildAt(m9737T1);
                                }
                            }
                        }
                        if (m9737T1 == m9741Z1) {
                            break;
                        } else {
                            m9737T1++;
                        }
                    }
                }
                if (view != null) {
                    View findViewById = view.findViewById(AbstractC6918a0.enable_switch);
                    if (findViewById != null) {
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_specific_step1_title);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_specific_step1_desc);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        C26209i c26209i = new C26209i(findViewById);
                        c26209i.f124548c = AbstractC23136l9.m118742r(8.0f);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        WalkThroughOnboardView.C13302d c13302d = new WalkThroughOnboardView.C13302d(m118743r0, m118743r02, c26209i, null, 8, null);
                        c13302d.m74672l(true);
                        c13302d.m74673m(true);
                        c13309e.m74724b(c13302d);
                    }
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_specific_step2_title);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_specific_step2_desc);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    C26209i c26209i2 = new C26209i(view);
                    c26209i2.f124548c = AbstractC23136l9.m118742r(8.0f);
                    C24848g0 c24848g02 = C24848g0.f119245a;
                    WalkThroughOnboardView.C13302d c13302d2 = new WalkThroughOnboardView.C13302d(m118743r03, m118743r04, c26209i2, null, 8, null);
                    c13302d2.m74672l(true);
                    c13302d2.m74673m(true);
                    c13302d2.m74674n(5);
                    c13309e.m74724b(c13302d2);
                }
            }
            View view2 = autoReplyListingView.f72242T0;
            if (view2 != null) {
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_specific_step3_title);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_listing_onboarding_specific_step3_desc);
                AbstractC19074t.m100207e(m118743r06, "getString(...)");
                WalkThroughOnboardView.C13302d c13302d3 = new WalkThroughOnboardView.C13302d(m118743r05, m118743r06, new C26209i(view2), null, 8, null);
                c13302d3.m74673m(true);
                c13309e.m74724b(c13302d3);
            }
            c13309e.m74728g(new C14079m());
            c13309e.m74729h();
            AbstractC0924m0.m3543Wd(true);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: PM */
    public final void m78229PM(String str) {
        ToastUtils.showMess(str);
    }

    /* renamed from: xM */
    private final void m78247xM() {
        C29863j c29863j = this.f72239Q0;
        C29863j c29863j2 = null;
        if (c29863j == null) {
            AbstractC19074t.m100223u("binding");
            c29863j = null;
        }
        View findViewWithTag = c29863j.getRoot().findViewWithTag("WalkThroughOnboardView");
        if (findViewWithTag != null) {
            C29863j c29863j3 = this.f72239Q0;
            if (c29863j3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29863j2 = c29863j3;
            }
            c29863j2.getRoot().removeView(findViewWithTag);
        }
        this.f72243U0 = false;
    }

    /* renamed from: yM */
    public final C26377i m78248yM() {
        return (C26377i) this.f72238P0.getValue();
    }

    /* renamed from: zM */
    private final void m78249zM() {
        this.f72241S0 = new LinearLayoutManager(getContext());
        C29863j c29863j = this.f72239Q0;
        C29863j c29863j2 = null;
        if (c29863j == null) {
            AbstractC19074t.m100223u("binding");
            c29863j = null;
        }
        RecyclerView recyclerView = c29863j.f138217q.f83582p0;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = this.f72241S0;
            if (linearLayoutManager == null) {
                AbstractC19074t.m100223u("mLayoutManager");
                linearLayoutManager = null;
            }
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C26372d c26372d = new C26372d(m92689tK);
        this.f72240R0 = c26372d;
        c26372d.m9999J(true);
        C29863j c29863j3 = this.f72239Q0;
        if (c29863j3 == null) {
            AbstractC19074t.m100223u("binding");
            c29863j3 = null;
        }
        RecyclerView recyclerView2 = c29863j3.f138217q.f83582p0;
        if (recyclerView2 != null) {
            C26372d c26372d2 = this.f72240R0;
            if (c26372d2 == null) {
                AbstractC19074t.m100223u("mAdapter");
                c26372d2 = null;
            }
            recyclerView2.setAdapter(c26372d2);
        }
        C26372d c26372d3 = this.f72240R0;
        if (c26372d3 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c26372d3 = null;
        }
        c26372d3.m135784T(new C14068b());
        C29863j c29863j4 = this.f72239Q0;
        if (c29863j4 == null) {
            AbstractC19074t.m100223u("binding");
            c29863j4 = null;
        }
        RecyclerView recyclerView3 = c29863j4.f138217q.f83582p0;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(0);
        }
        C29863j c29863j5 = this.f72239Q0;
        if (c29863j5 == null) {
            AbstractC19074t.m100223u("binding");
            c29863j5 = null;
        }
        RecyclerView recyclerView4 = c29863j5.f138217q.f83582p0;
        if (recyclerView4 != null) {
            recyclerView4.setBackgroundResource(AbstractC17466e.transparent);
        }
        C29863j c29863j6 = this.f72239Q0;
        if (c29863j6 == null) {
            AbstractC19074t.m100223u("binding");
            c29863j6 = null;
        }
        RecyclerView recyclerView5 = c29863j6.f138217q.f83582p0;
        if (recyclerView5 != null) {
            recyclerView5.setItemAnimator(null);
        }
        C29863j c29863j7 = this.f72239Q0;
        if (c29863j7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29863j2 = c29863j7;
        }
        c29863j2.f138217q.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.g1
            public /* synthetic */ C15646g1() {
            }

            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                AutoReplyListingView.m78214AM(AutoReplyListingView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m78248yM().m135910P().m9219j(this, new C14077k(new C14070d(this)));
        m78248yM().m135920a0().m9219j(this, new C14077k(new C14071e(this)));
        m78248yM().m135924f0().m9219j(this, new C14077k(new C14072f(this)));
        m78248yM().m135927i0().m9219j(this, new C14077k(new C14073g(this)));
        m78248yM().m135922c0().m9219j(this, new C14077k(new C14074h(this)));
        m78248yM().m135925g0().m9219j(this, new C14077k(new C14075i(this)));
        m78248yM().m135926h0().m9219j(this, new C14077k(new C14076j(this)));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        boolean z11;
        Object obj;
        AbstractC19074t.m100208f(objArr, "objects");
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a aVar = new C16972e0.a(m92689tK);
            aVar.m90932i(C16972e0.b.DIALOG_PROMOTION);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_onboarding_card_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            aVar.m90918B(m118743r0);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_onboarding_card_desc);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            aVar.m90949z(m118743r02);
            aVar.m90919C(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.auto_reply_onboarding_illus));
            aVar.m90931h("MODAL_AR_ONBOARDING_FIRST_TIME");
            C0708i c0708i = new C0708i();
            c0708i.m1075f("src", m78248yM().m135912S());
            aVar.m90930g(c0708i);
            aVar.m90947x("BUTTON_AR_ONBOARDING_POSITIVE");
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_onboarding_card_positive_btn_text);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            aVar.m90943t(m118743r03, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.f1
                public /* synthetic */ C15609f1() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AutoReplyListingView.m78219FM(AutoReplyListingView.this, interfaceC17463d, i12);
                }
            });
            aVar.m90937n("BUTTON_AR_ONBOARDING_NEGATIVE");
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_onboarding_card_negative_btn_text);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            aVar.m90934k(m118743r04, new InterfaceC17463d.a());
            aVar.m90922F(false);
            return aVar.m90927d();
        }
        if (objArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            obj = objArr[0];
        } else {
            obj = "";
        }
        C8009j.a aVar2 = new C8009j.a(getContext());
        C8009j.a m43159h = aVar2.m43159h(7);
        C19067n0 c19067n0 = C19067n0.f94947a;
        Locale locale = Locale.ENGLISH;
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_confirm_change_enable);
        AbstractC19074t.m100207e(m118743r05, "getString(...)");
        String format = String.format(locale, m118743r05, Arrays.copyOf(new Object[]{obj}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        m43159h.m43162k(format).m43173v(3).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.a()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.switch_text_off), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.d1
            public /* synthetic */ C15535d1() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                AutoReplyListingView.m78217DM(AutoReplyListingView.this, interfaceC17463d, i12);
            }
        });
        C8009j m43152a = aVar2.m43152a();
        m43152a.m92854E(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.e1
            public /* synthetic */ C15572e1() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                AutoReplyListingView.m78218EM(AutoReplyListingView.this, interfaceC17463d);
            }
        });
        return m43152a;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29863j m148093c = C29863j.m148093c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148093c, "inflate(...)");
        this.f72239Q0 = m148093c;
        m78249zM();
        C29863j c29863j = this.f72239Q0;
        if (c29863j == null) {
            AbstractC19074t.m100223u("binding");
            c29863j = null;
        }
        RelativeLayout root = c29863j.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            this.f72242T0 = m87077NK.getTrailingButton();
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.c1
                public /* synthetic */ ViewOnClickListenerC15494c1() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoReplyListingView.m78221HM(AutoReplyListingView.this, view);
                }
            });
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AutoReplyListingView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && this.f72243U0) {
            m78247xM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle == null) {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("STR_SOURCE_START_VIEW")) {
                String string = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                C0697c0.b bVar = C0697c0.Companion;
                String trackingKey = getTrackingKey();
                AbstractC19074t.m100205c(string);
                bVar.m1054h(trackingKey, "src", string);
                m78248yM().m135923e0(string);
            }
            C0697c0.Companion.m1054h(getTrackingKey(), "sessionId", m78248yM().m135911R());
            m78248yM().m135913T(m92642L3());
        }
    }
}
