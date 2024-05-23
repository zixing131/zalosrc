package com.zing.zalo.p077ui.zalocloud.setup;

import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudConnectFeaturesView;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import hc0.EnumC19985o;
import ic0.C20510e;
import java.util.HashMap;
import kc0.AbstractC21668g;
import kc0.AbstractC21669h;
import kc0.C21670i;
import kc0.C21671j;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import p205hc.C19965d;
import p348mi.AbstractC23306f;
import p649xl.AbstractC29986pe;
import p664y.AbstractC30228a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZCloudConnectFeaturesView extends BaseSetupZaloCloudView<AbstractC29986pe> {

    /* renamed from: U0 */
    private final InterfaceC24854k f71976U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f71977V0;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$a */
    /* loaded from: classes6.dex */
    static final class C13983a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13983a f71978q = new C13983a();

        C13983a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo12V4() {
            return Long.valueOf(AbstractC0924m0.m3566X7());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$b */
    /* loaded from: classes6.dex */
    static final class C13984b extends AbstractC19075u implements InterfaceC18494a {
        C13984b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77825a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77825a() {
            AbstractC0924m0.m3913ir(ZCloudConnectFeaturesView.this.m77757mM().mo124314i());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$c */
    /* loaded from: classes6.dex */
    public static final class C13985c extends RecyclerView.AbstractC1887n {
        C13985c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "tate");
            int i11 = AbstractC23222t7.f112566j;
            rect.set(0, i11, 0, i11);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$d */
    /* loaded from: classes6.dex */
    static final class C13986d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13986d f71980q = new C13986d();

        C13986d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20510e mo12V4() {
            return new C20510e();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$e */
    /* loaded from: classes6.dex */
    static final class C13987e extends AbstractC19075u implements InterfaceC18494a {
        C13987e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21670i mo12V4() {
            return (C21670i) new C1802w0(ZCloudConnectFeaturesView.this, new C21671j()).m9378a(C21670i.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$f */
    /* loaded from: classes6.dex */
    static final class C13988f extends AbstractC19075u implements InterfaceC18505l {
        C13988f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77828a(AbstractC21669h abstractC21669h) {
            throw null;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            AbstractC30228a.m149044a(obj);
            m77828a(null);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$g */
    /* loaded from: classes6.dex */
    static final class C13989g extends AbstractC19075u implements InterfaceC18505l {
        C13989g() {
            super(1);
        }

        /* renamed from: a */
        public final void m77829a(AbstractC21668g abstractC21668g) {
            AbstractC19074t.m100208f(abstractC21668g, "event");
            if (!AbstractC19074t.m100204b(abstractC21668g, AbstractC21668g.b.f105133a)) {
                if (AbstractC19074t.m100204b(abstractC21668g, AbstractC21668g.c.f105134a)) {
                    BaseSetupZaloCloudView.m77746xM(ZCloudConnectFeaturesView.this, EnumC19985o.f98289r, null, 2, null);
                } else if (AbstractC19074t.m100204b(abstractC21668g, AbstractC21668g.a.f105132a)) {
                    ZCloudConnectFeaturesView.this.m77748tM().m77921R(false, true);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77829a((AbstractC21668g) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudConnectFeaturesView$h */
    /* loaded from: classes6.dex */
    static final class C13990h implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71984p;

        C13990h(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71984p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71984p;
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
            this.f71984p.mo205i9(obj);
        }
    }

    public ZCloudConnectFeaturesView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(C13986d.f71980q);
        this.f71976U0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13987e());
        this.f71977V0 = m129210a2;
    }

    /* renamed from: AM */
    private final C21670i m77819AM() {
        return (C21670i) this.f71977V0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m77820BM(ZCloudConnectFeaturesView zCloudConnectFeaturesView, View view) {
        AbstractC19074t.m100208f(zCloudConnectFeaturesView, "this$0");
        HashMap m111683M = zCloudConnectFeaturesView.m77819AM().m111683M();
        AbstractC0924m0.m4213sr(AbstractC23306f.m120579F1().mo124314i());
        zCloudConnectFeaturesView.m77748tM().m77938l0(m111683M, zCloudConnectFeaturesView.m77823zM().m106554Q());
        zCloudConnectFeaturesView.m77821CM();
    }

    /* renamed from: CM */
    private final void m77821CM() {
        EnumC19985o enumC19985o = EnumC19985o.f98288q;
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_CURRENT_STEP", 2);
        bundle.putBoolean("ARG_BACK_BUTTON", true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        m77750wM(enumC19985o, bundle);
    }

    /* renamed from: zM */
    private final C20510e m77823zM() {
        return (C20510e) this.f71976U0.getValue();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m77819AM().m111687Q(bundle);
        m77823zM().m106555V(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        Context context;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null || (context = getContext()) == null) {
            return;
        }
        actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudConfigFeature";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_connect_feature_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
        super.mo57576lM(bundle);
        if (bundle == null) {
            return;
        }
        m77819AM().m111684N(bundle);
        m77823zM().m106553P(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        m77754gM(C13983a.f71978q, new C13984b());
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        RecyclerView recyclerView = ((AbstractC29986pe) m77756kM()).f139037R;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(m77823zM());
        m77823zM().m106556W(m77819AM().m111683M());
        recyclerView.m9816A(new C13985c());
        ((AbstractC29986pe) m77756kM()).f139036Q.setOnClickListener(new View.OnClickListener() { // from class: hc0.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudConnectFeaturesView.m77820BM(ZCloudConnectFeaturesView.this, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77819AM().m111686P().m9219j(m92657cJ(), new C13990h(new C13988f()));
        m77819AM().m111685O().m9219j(m92657cJ(), new C19965d(new C13989g()));
    }
}
