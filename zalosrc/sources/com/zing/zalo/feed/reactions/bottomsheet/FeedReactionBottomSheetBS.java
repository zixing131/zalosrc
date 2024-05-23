package com.zing.zalo.feed.reactions.bottomsheet;

import ac.C0697c0;
import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.feed.reactions.bottomsheet.C8840a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p243ip.C20649e;
import p330lp.C22633a;
import p330lp.C22634b;
import p330lp.C22635c;
import p330lp.C22636d;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p556ur.C27360c;
import p556ur.C27361d;
import p556ur.C27362e;
import p584vr.InterfaceC28604a;
import p619wr.C29197d;
import p649xl.C30079v3;
import p716zh.C31980jc;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class FeedReactionBottomSheetBS extends BottomSheet implements C23744a.c, InterfaceC0733x {

    /* renamed from: b1 */
    private C30079v3 f47193b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f47194c1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C27361d.class), new C8834f(new C8833e(this)), new C8839k());

    /* renamed from: d1 */
    private final InterfaceC24854k f47195d1;

    /* renamed from: e1 */
    private final InterfaceC24854k f47196e1;

    /* renamed from: f1 */
    private final AbstractC22055v0.l f47197f1;

    /* renamed from: g1 */
    private final C22636d f47198g1;

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$a */
    /* loaded from: classes4.dex */
    static final class C8829a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$a$a */
        /* loaded from: classes4.dex */
        public static final class a implements C8840a.c {

            /* renamed from: a */
            final /* synthetic */ FeedReactionBottomSheetBS f47200a;

            a(FeedReactionBottomSheetBS feedReactionBottomSheetBS) {
                this.f47200a = feedReactionBottomSheetBS;
            }

            @Override // com.zing.zalo.feed.reactions.bottomsheet.C8840a.c
            /* renamed from: a */
            public void mo47168a(InterfaceC28604a interfaceC28604a) {
                AbstractC19074t.m100208f(interfaceC28604a, "event");
                this.f47200a.m47158SL().m140190r0(interfaceC28604a, this.f47200a.m92676n2(), this.f47200a.f47197f1);
            }
        }

        C8829a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C8840a mo12V4() {
            C8840a c8840a = new C8840a();
            c8840a.m47182O(new a(FeedReactionBottomSheetBS.this));
            return c8840a;
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$b */
    /* loaded from: classes4.dex */
    public static final class C8830b extends RecyclerView.AbstractC1892s {
        C8830b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0 && FeedReactionBottomSheetBS.this.m47157RL().m9745c2() == FeedReactionBottomSheetBS.this.m47156QL().mo10003k() - 1 && FeedReactionBottomSheetBS.this.m47158SL().m140183b0()) {
                FeedReactionBottomSheetBS.this.m47158SL().m140194y0();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$c */
    /* loaded from: classes4.dex */
    static final class C8831c extends AbstractC19075u implements InterfaceC18494a {
        C8831c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayoutManager mo12V4() {
            return new LinearLayoutManager(FeedReactionBottomSheetBS.this.getContext(), 1, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$d */
    /* loaded from: classes4.dex */
    public static final class C8832d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f47203p;

        C8832d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f47203p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f47203p;
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
            this.f47203p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$e */
    /* loaded from: classes4.dex */
    public static final class C8833e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f47204q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8833e(ZaloView zaloView) {
            super(0);
            this.f47204q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f47204q;
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$f */
    /* loaded from: classes4.dex */
    public static final class C8834f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f47205q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8834f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f47205q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f47205q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$g */
    /* loaded from: classes4.dex */
    public static final class C8835g extends AbstractC22055v0.l {

        /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$g$a */
        /* loaded from: classes4.dex */
        public static final class a implements C22033k0.i {

            /* renamed from: a */
            final /* synthetic */ C31980jc f47207a;

            /* renamed from: b */
            final /* synthetic */ FeedReactionBottomSheetBS f47208b;

            /* renamed from: c */
            final /* synthetic */ int f47209c;

            /* renamed from: d */
            final /* synthetic */ AbstractC22055v0.n f47210d;

            a(C31980jc c31980jc, FeedReactionBottomSheetBS feedReactionBottomSheetBS, int i11, AbstractC22055v0.n nVar) {
                this.f47207a = c31980jc;
                this.f47208b = feedReactionBottomSheetBS;
                this.f47209c = i11;
                this.f47210d = nVar;
            }

            @Override // l30.C22033k0.i
            /* renamed from: O */
            public void mo45897O() {
                try {
                    if (this.f47207a != null) {
                        C27361d m47158SL = this.f47208b.m47158SL();
                        List m47180M = this.f47208b.m47156QL().m47180M();
                        String str = this.f47207a.f147023p;
                        AbstractC19074t.m100207e(str, "uid");
                        m47158SL.m140193x0(m47180M, str);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }

            @Override // l30.C22033k0.i
            /* renamed from: a */
            public void mo45898a(String str, C22033k0.g gVar) {
                AbstractC19074t.m100208f(str, "msg");
                if (this.f47208b.m92672lJ() && this.f47208b.m92687sJ()) {
                    ToastUtils.showMess(str);
                }
                mo45897O();
            }

            @Override // l30.C22033k0.i
            /* renamed from: b */
            public void mo45899b(Bundle bundle, C22033k0.h hVar) {
                AbstractC19074t.m100208f(bundle, "bundle");
                if (this.f47208b.m92672lJ() && this.f47208b.m92687sJ() && hVar != null) {
                    AbstractC23647d.m123897g("49150053");
                    bundle.putInt("srcType", this.f47209c);
                    AbstractC22055v0.m115127Q(hVar, this.f47210d, this.f47208b.m92676n2(), bundle, 1000);
                }
            }
        }

        C8835g() {
        }

        @Override // l30.AbstractC22055v0.l
        /* renamed from: c */
        public void mo47172c(C31980jc c31980jc, AbstractC22055v0.n nVar, int i11) {
            try {
                C22033k0.m115006h().m115018r(c31980jc, -1, new a(c31980jc, FeedReactionBottomSheetBS.this, i11, nVar));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$h */
    /* loaded from: classes4.dex */
    public static final class C8836h extends AbstractC19075u implements InterfaceC18505l {
        C8836h() {
            super(1);
        }

        /* renamed from: a */
        public final void m47173a(C20649e c20649e) {
            FeedReactionBottomSheetBS feedReactionBottomSheetBS = FeedReactionBottomSheetBS.this;
            AbstractC19074t.m100205c(c20649e);
            feedReactionBottomSheetBS.m47165ZL(c20649e);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47173a((C20649e) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$i */
    /* loaded from: classes4.dex */
    public static final class C8837i extends AbstractC19075u implements InterfaceC18505l {
        C8837i() {
            super(1);
        }

        /* renamed from: a */
        public final void m47174a(Integer num) {
            C30079v3 c30079v3 = FeedReactionBottomSheetBS.this.f47193b1;
            if (c30079v3 == null) {
                AbstractC19074t.m100223u("binding");
                c30079v3 = null;
            }
            RobotoTextView robotoTextView = c30079v3.f139630s;
            C22636d c22636d = FeedReactionBottomSheetBS.this.f47198g1;
            AbstractC19074t.m100205c(num);
            robotoTextView.setText(c22636d.m117196a(num.intValue(), FeedReactionBottomSheetBS.this.m47158SL().m140187i0()));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47174a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$j */
    /* loaded from: classes4.dex */
    public static final class C8838j extends AbstractC19075u implements InterfaceC18505l {
        C8838j() {
            super(1);
        }

        /* renamed from: a */
        public final void m47175a(Integer num) {
            C8840a m47156QL = FeedReactionBottomSheetBS.this.m47156QL();
            AbstractC19074t.m100205c(num);
            m47156QL.m10009q(num.intValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m47175a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheetBS$k */
    /* loaded from: classes4.dex */
    static final class C8839k extends AbstractC19075u implements InterfaceC18494a {
        C8839k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return FeedReactionBottomSheetBS.this.m47159TL();
        }
    }

    public FeedReactionBottomSheetBS() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C8831c());
        this.f47195d1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8829a());
        this.f47196e1 = m129210a2;
        this.f47197f1 = new C8835g();
        this.f47198g1 = new C22636d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QL */
    public final C8840a m47156QL() {
        return (C8840a) this.f47196e1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public final LinearLayoutManager m47157RL() {
        return (LinearLayoutManager) this.f47195d1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SL */
    public final C27361d m47158SL() {
        return (C27361d) this.f47194c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TL */
    public final C27362e m47159TL() {
        return new C27362e(new C22634b(null, 1, null), new C22635c(null, 1, null), new C22633a(null, 1, null));
    }

    /* renamed from: UL */
    private final void m47160UL() {
        m47158SL().m140192w0(C8841b.Companion.m47209a(m92642L3()));
        m47164YL();
    }

    /* renamed from: VL */
    private final void m47161VL() {
        C30079v3 c30079v3 = this.f47193b1;
        if (c30079v3 == null) {
            AbstractC19074t.m100223u("binding");
            c30079v3 = null;
        }
        c30079v3.f139631t.setLayoutManager(m47157RL());
        c30079v3.f139631t.setAdapter(m47156QL());
        c30079v3.f139631t.m9826E(new C8830b());
    }

    /* renamed from: WL */
    private final void m47162WL(List list, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (z11) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.only_see_reactions_on_friends);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList.add(new C27360c(0, new C29197d(m118743r0)));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C27360c(1, m47158SL().m140182a0((LikeContactItem) it.next())));
        }
        m47156QL().m47181N(arrayList);
        m47156QL().m10008p();
    }

    /* renamed from: XL */
    private final void m47163XL() {
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1050d(this, ZinstantMetaConstant.IMPRESSION_META_TYPE, m47158SL().m140185e0());
        bVar.m1050d(this, "source", m47158SL().m140184c0());
    }

    /* renamed from: YL */
    private final void m47164YL() {
        m47158SL().m140186f0().m9219j(this, new C8832d(new C8836h()));
        m47158SL().m140188j0().m9219j(this, new C8832d(new C8837i()));
        m47158SL().m140189k0().m9219j(this, new C8832d(new C8838j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public final void m47165ZL(C20649e c20649e) {
        int m107631c = c20649e.m107631c();
        if (m107631c != 0) {
            if (m107631c != 1) {
                if (m107631c == 2) {
                    m47156QL().m47187V(false);
                    C8840a.m47178U(m47156QL(), false, null, 2, null);
                    m47156QL().m47184Q(true, c20649e.m107630b());
                }
            } else {
                m47156QL().m47187V(true);
                C8840a.m47178U(m47156QL(), false, null, 2, null);
                C8840a.m47177R(m47156QL(), false, null, 2, null);
            }
        } else {
            m47156QL().m47187V(false);
            C8840a.m47178U(m47156QL(), false, null, 2, null);
            C8840a.m47177R(m47156QL(), false, null, 2, null);
            m47162WL(c20649e.m107632d(), c20649e.m107634f());
        }
        int m107629a = c20649e.m107629a();
        if (m107629a != 11) {
            if (m107629a == 12) {
                m47156QL().m47187V(false);
                m47156QL().m47186T(true, c20649e.m107630b());
                C8840a.m47177R(m47156QL(), false, null, 2, null);
                return;
            }
            return;
        }
        m47156QL().m47187V(true);
        C8840a.m47178U(m47156QL(), false, null, 2, null);
        C8840a.m47177R(m47156QL(), false, null, 2, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 3002);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        BottomSheetLayout m90518hL = m90518hL();
        if (m90511aL() && m90518hL != null && m90518hL.getTranslationY() == m90518hL.getMinTranslationY()) {
            C30079v3 c30079v3 = this.f47193b1;
            if (c30079v3 == null) {
                AbstractC19074t.m100223u("binding");
                c30079v3 = null;
            }
            if (!c30079v3.f139631t.canScrollVertically(1)) {
                C30079v3 c30079v32 = this.f47193b1;
                if (c30079v32 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30079v32 = null;
                }
                if (c30079v32.f139631t.canScrollVertically(-1)) {
                    return m90518hL;
                }
            } else {
                return m90518hL;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: X0 */
    public boolean mo47166X0(float f11, boolean z11, float f12) {
        if (z11) {
            close();
            return true;
        }
        return super.mo47166X0(f11, false, f12);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FeedReactionDetailBottomSheet";
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        if (linearLayout == null) {
            return;
        }
        m90533zL(EnumC17017m.DETENTS);
        m90522qL(true);
        m90524sL(0.6f);
        C30079v3 m148602c = C30079v3.m148602c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148602c, "inflate(...)");
        this.f47193b1 = m148602c;
        m47161VL();
        m47160UL();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m47163XL();
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        boolean z11;
        String str;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 3002) {
            if (objArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((!z11) && (str = (String) objArr[0]) != null && str.length() != 0) {
                m47158SL().m140191v0(m47156QL().m47180M(), str);
                m47156QL().m10008p();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 3002);
    }
}
