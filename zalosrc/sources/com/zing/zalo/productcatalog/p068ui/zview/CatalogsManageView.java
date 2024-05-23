package com.zing.zalo.productcatalog.p068ui.zview;

import ag0.C0815e1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.productcatalog.model.CatalogAddEditModel;
import com.zing.zalo.productcatalog.p068ui.zview.CatalogContextMenuBottomSheet;
import com.zing.zalo.productcatalog.p068ui.zview.CatalogsManageView;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.productcatalog.utils.AddCatalogSource;
import com.zing.zalo.productcatalog.utils.AddProductSource;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalo.productcatalog.utils.EditCatalogSource;
import com.zing.zalo.productcatalog.utils.SendProductSource;
import com.zing.zalo.uicontrol.MultiSelectBottomView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23222t7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p024ay.AbstractC2421j;
import p115dy.AbstractC18084c1;
import p115dy.AbstractC18088e;
import p115dy.AbstractC18114r;
import p115dy.AbstractC18120u;
import p115dy.C18076a;
import p115dy.C18096i;
import p361nb.C23648e;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p649xl.C29909l9;
import p661xx.AbstractC30215a;
import p661xx.InterfaceC30216b;
import p696yx.C31089a;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class CatalogsManageView extends SlidableZaloView implements InterfaceC30216b {

    /* renamed from: P0 */
    private C29909l9 f48602P0;

    /* renamed from: Q0 */
    private C31089a f48603Q0;

    /* renamed from: R0 */
    private LinearLayoutManager f48604R0;

    /* renamed from: T0 */
    private MultiSelectBottomView f48606T0;

    /* renamed from: U0 */
    private View f48607U0;

    /* renamed from: V0 */
    private View f48608V0;

    /* renamed from: Y0 */
    private List f48611Y0;

    /* renamed from: Z0 */
    private C16972e0 f48612Z0;

    /* renamed from: S0 */
    private AbstractC9082a f48605S0 = AbstractC9082a.b.f48616a;

    /* renamed from: W0 */
    private final InterfaceC24854k f48609W0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18096i.class), new C9090i(new C9089h(this)), C9093l.f48626q);

    /* renamed from: X0 */
    private final InterfaceC24854k f48610X0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18076a.class), new C9092k(new C9091j(this)), C9083b.f48617q);

    /* renamed from: a1 */
    private final InterfaceC1764d0 f48613a1 = new InterfaceC1764d0() { // from class: ay.z
        public /* synthetic */ C2462z() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            CatalogsManageView.m48625AM(CatalogsManageView.this, (List) obj);
        }
    };

    /* renamed from: b1 */
    private final InterfaceC1764d0 f48614b1 = new InterfaceC1764d0() { // from class: ay.a0
        public /* synthetic */ C2395a0() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            CatalogsManageView.m48626BM(CatalogsManageView.this, (AbstractC18120u) obj);
        }
    };

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$a */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC9082a {

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$a$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC9082a {

            /* renamed from: a */
            public static final a f48615a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC9082a {

            /* renamed from: a */
            public static final b f48616a = new b();

            private b() {
                super(null);
            }
        }

        private AbstractC9082a() {
        }

        public /* synthetic */ AbstractC9082a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$b */
    /* loaded from: classes4.dex */
    static final class C9083b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9083b f48617q = new C9083b();

        C9083b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C18076a.c();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$c */
    /* loaded from: classes4.dex */
    public static final class C9084c extends AbstractC19075u implements InterfaceC18505l {
        C9084c() {
            super(1);
        }

        /* renamed from: a */
        public final void m48671a(AbstractC18114r abstractC18114r) {
            AbstractC19074t.m100208f(abstractC18114r, "state");
            if (AbstractC19074t.m100204b(abstractC18114r, AbstractC18114r.b.f91718a)) {
                CatalogsManageView.this.mo46829Y();
                return;
            }
            if (AbstractC19074t.m100204b(abstractC18114r, AbstractC18114r.c.f91719a)) {
                CatalogsManageView.this.mo49315c4();
                CatalogsManageView.this.m48643TM(false);
            } else if (abstractC18114r instanceof AbstractC18114r.a) {
                CatalogsManageView.this.mo49315c4();
                AbstractC18114r.a aVar = (AbstractC18114r.a) abstractC18114r;
                if (aVar.m96406a().length() > 0) {
                    ToastUtils.showMess(false, aVar.m96406a());
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48671a((AbstractC18114r) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$d */
    /* loaded from: classes4.dex */
    public static final class C9085d extends RecyclerView.AbstractC1887n {
        C9085d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                i11 = layoutManager.m10127i();
            } else {
                i11 = 0;
            }
            if (m9817A0 == i11 - 1) {
                rect.bottom = AbstractC23222t7.f112591v0;
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$e */
    /* loaded from: classes4.dex */
    public static final class C9086e extends RecyclerView.AbstractC1892s {
        C9086e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (i11 != 0 || i12 != 0) {
                try {
                    LinearLayoutManager linearLayoutManager = CatalogsManageView.this.f48604R0;
                    LinearLayoutManager linearLayoutManager2 = null;
                    if (linearLayoutManager == null) {
                        AbstractC19074t.m100223u("layoutManager");
                        linearLayoutManager = null;
                    }
                    int m9745c2 = linearLayoutManager.m9745c2();
                    C31089a c31089a = CatalogsManageView.this.f48603Q0;
                    if (c31089a == null) {
                        AbstractC19074t.m100223u("adapter");
                        c31089a = null;
                    }
                    AbstractC18088e m151073L = c31089a.m151073L(m9745c2);
                    LinearLayoutManager linearLayoutManager3 = CatalogsManageView.this.f48604R0;
                    if (linearLayoutManager3 == null) {
                        AbstractC19074t.m100223u("layoutManager");
                    } else {
                        linearLayoutManager2 = linearLayoutManager3;
                    }
                    if (m9745c2 >= linearLayoutManager2.m10127i() - 1 && (m151073L instanceof AbstractC18088e.c)) {
                        CatalogsManageView.this.m48664wM().m96285n0(false);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$f */
    /* loaded from: classes4.dex */
    public static final class C9087f extends ZdsActionBar.AbstractC16987c {
        C9087f() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            if (CatalogsManageView.this.f48605S0 instanceof AbstractC9082a.a) {
                CatalogsManageView.this.m48630FM();
            } else {
                CatalogsManageView.this.finish();
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$g */
    /* loaded from: classes4.dex */
    public static final class C9088g extends AbstractC19075u implements InterfaceC18505l {
        C9088g() {
            super(1);
        }

        /* renamed from: a */
        public final void m48672a(AbstractC18084c1 abstractC18084c1) {
            AbstractC19074t.m100208f(abstractC18084c1, "state");
            if (AbstractC19074t.m100204b(abstractC18084c1, AbstractC18084c1.a.f91540a)) {
                CatalogsManageView.this.mo46829Y();
                return;
            }
            if (abstractC18084c1 instanceof AbstractC18084c1.b) {
                CatalogsManageView.this.mo49315c4();
                AbstractC18084c1.b bVar = (AbstractC18084c1.b) abstractC18084c1;
                if (!bVar.m96165a().isEmpty()) {
                    CatalogsManageView.m48640QM(CatalogsManageView.this, bVar.m96165a(), null, 2, null);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48672a((AbstractC18084c1) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$h */
    /* loaded from: classes4.dex */
    public static final class C9089h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48622q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9089h(ZaloView zaloView) {
            super(0);
            this.f48622q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f48622q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$i */
    /* loaded from: classes4.dex */
    public static final class C9090i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48623q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9090i(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48623q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48623q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$j */
    /* loaded from: classes4.dex */
    public static final class C9091j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48624q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9091j(ZaloView zaloView) {
            super(0);
            this.f48624q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f48624q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$k */
    /* loaded from: classes4.dex */
    public static final class C9092k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48625q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9092k(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48625q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48625q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogsManageView$l */
    /* loaded from: classes4.dex */
    static final class C9093l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9093l f48626q = new C9093l();

        C9093l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C18096i.b();
        }
    }

    /* renamed from: AM */
    public static final void m48625AM(CatalogsManageView catalogsManageView, List list) {
        AbstractC19074t.m100208f(catalogsManageView, "this$0");
        AbstractC19074t.m100208f(list, "items");
        C31089a c31089a = catalogsManageView.f48603Q0;
        C31089a c31089a2 = null;
        if (c31089a == null) {
            AbstractC19074t.m100223u("adapter");
            c31089a = null;
        }
        c31089a.m151076O(list);
        C31089a c31089a3 = catalogsManageView.f48603Q0;
        if (c31089a3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c31089a2 = c31089a3;
        }
        c31089a2.m10008p();
        catalogsManageView.m48647XM();
    }

    /* renamed from: BM */
    public static final void m48626BM(CatalogsManageView catalogsManageView, AbstractC18120u abstractC18120u) {
        boolean z11;
        AbstractC19074t.m100208f(catalogsManageView, "this$0");
        AbstractC19074t.m100208f(abstractC18120u, "state");
        C29909l9 c29909l9 = catalogsManageView.f48602P0;
        if (c29909l9 == null) {
            AbstractC19074t.m100223u("binding");
            c29909l9 = null;
        }
        SwipeRefreshLayout swipeRefreshLayout = c29909l9.f138591r;
        if ((abstractC18120u instanceof AbstractC18120u.d) && ((AbstractC18120u.d) abstractC18120u).m96409a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        swipeRefreshLayout.setRefreshing(z11);
    }

    /* renamed from: CM */
    private final void m48627CM(AddCatalogSource addCatalogSource) {
        List list = this.f48611Y0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
        C24860q m96139Q = m48663vM().m96139Q();
        if (!((Boolean) m96139Q.m129215c()).booleanValue()) {
            if (((CharSequence) m96139Q.m129216d()).length() > 0) {
                ToastUtils.showMess((String) m96139Q.m129216d());
            }
            C0815e1.m2075D().m2100V(new C23648e(49, String.valueOf(addCatalogSource.m48909a()), 0, "catalog_limit_reach", new String[0]), false);
            return;
        }
        this.f48611Y0 = AbstractC2421j.m12468k(this, m48663vM(), null, addCatalogSource);
    }

    /* renamed from: DM */
    private final void m48628DM(AddProductSource addProductSource) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_TRACKING_SOURCE", addProductSource);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ProductAddEditView.class, bundle, 2, true);
        }
    }

    /* renamed from: EM */
    private final void m48629EM(AbstractC9082a abstractC9082a) {
        this.f48605S0 = abstractC9082a;
        mo39896OK();
        if (this.f48605S0 instanceof AbstractC9082a.a) {
            m48644UM(true);
        } else {
            m48644UM(false);
        }
    }

    /* renamed from: FM */
    public final void m48630FM() {
        m48664wM().m96270T();
        m48643TM(false);
    }

    /* renamed from: GM */
    private final void m48631GM(C29259b c29259b, DeleteCatalogSource deleteCatalogSource) {
        if (!m48664wM().m96275a0(c29259b)) {
            ToastUtils.showMess(m92651WI().getString(AbstractC8020f0.product_catalog_toast_keep_at_least_one_catalog));
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        C16972e0 c16972e0 = this.f48612Z0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        C16972e0.a aVar = new C16972e0.a(context);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        aVar.m90931h("CatalogManageView-ConfirmDelete");
        String string = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_this_catalog_title);
        AbstractC19074t.m100207e(string, "getString(...)");
        aVar.m90918B(string);
        String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_this_catalog_desc);
        AbstractC19074t.m100207e(string2, "getString(...)");
        aVar.m90949z(string2);
        aVar.m90921E(true);
        aVar.m90947x("CatalogManageView-ConfirmDelete-Positive");
        String string3 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_confirm);
        AbstractC19074t.m100207e(string3, "getString(...)");
        aVar.m90943t(string3, new InterfaceC17463d.d() { // from class: ay.e0

            /* renamed from: q */
            public final /* synthetic */ C29259b f9991q;

            /* renamed from: r */
            public final /* synthetic */ DeleteCatalogSource f9992r;

            public /* synthetic */ C2407e0(C29259b c29259b2, DeleteCatalogSource deleteCatalogSource2) {
                r2 = c29259b2;
                r3 = deleteCatalogSource2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CatalogsManageView.m48632HM(CatalogsManageView.this, r2, r3, interfaceC17463d, i11);
            }
        });
        aVar.m90937n("CatalogManageView-ConfirmDelete-Negative");
        String string4 = m92651WI().getString(AbstractC8020f0.product_catalog_confirm_delete_btn_cancel);
        AbstractC19074t.m100207e(string4, "getString(...)");
        aVar.m90934k(string4, new InterfaceC17463d.d() { // from class: ay.f0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                CatalogsManageView.m48633IM(interfaceC17463d, i11);
            }
        });
        this.f48612Z0 = aVar.m90923G();
    }

    /* renamed from: HM */
    public static final void m48632HM(CatalogsManageView catalogsManageView, C29259b c29259b, DeleteCatalogSource deleteCatalogSource, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(catalogsManageView, "this$0");
        AbstractC19074t.m100208f(c29259b, "$catalog");
        AbstractC19074t.m100208f(deleteCatalogSource, "$source");
        catalogsManageView.m48662uM(c29259b, deleteCatalogSource);
    }

    /* renamed from: IM */
    public static final void m48633IM(InterfaceC17463d interfaceC17463d, int i11) {
    }

    /* renamed from: JM */
    public static final void m48634JM(CatalogsManageView catalogsManageView) {
        AbstractC19074t.m100208f(catalogsManageView, "this$0");
        C29909l9 c29909l9 = null;
        if (!C23055e5.m118273h(false, 1, null)) {
            C29909l9 c29909l92 = catalogsManageView.f48602P0;
            if (c29909l92 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29909l9 = c29909l92;
            }
            c29909l9.f138591r.setRefreshing(false);
            return;
        }
        catalogsManageView.m48664wM().m96272V();
    }

    /* renamed from: KM */
    private final void m48635KM(C29259b c29259b) {
        CatalogAddEditModel catalogAddEditModel = new CatalogAddEditModel(c29259b.m146161p(), c29259b.m146158m(), c29259b.m146160o());
        List list = this.f48611Y0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
        this.f48611Y0 = AbstractC2421j.m12468k(this, m48663vM(), catalogAddEditModel, EditCatalogSource.CatalogManageContextMenuEdit.f48763q);
    }

    /* renamed from: MM */
    private final void m48636MM(C29259b c29259b) {
        String m48998f = AbstractC9183a.m48998f(c29259b);
        if (m48998f.length() == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_WEB_URL", m48998f);
        bundle.putInt("EXTRA_SOURCE_LINK", 422);
        ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
        InterfaceC27218a m92692wK = m92692wK();
        AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
        c15403a.m87171F(m92692wK, m48998f, bundle);
    }

    /* renamed from: NM */
    private final void m48637NM(C29259b c29259b) {
        m48664wM().m96274Z(c29259b, SendProductSource.ProductManageShareCatalog.f48784q, new C9088g());
    }

    /* renamed from: OM */
    private final void m48638OM(C29259b c29259b) {
        C17487o0 mo35579p;
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_CATALOG_ID", c29259b.m146158m());
            bundle.putString("EXTRA_CATALOG_NAME", c29259b.m146160o());
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(ProductManageView.class, bundle, 2, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: PM */
    private final void m48639PM(List list, String str) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("multipleLinksToShare", new ArrayList<>(list));
        bundle.putBoolean("bol_share_in_app", true);
        bundle.putString("STR_SOURCE_START_VIEW", str);
        bundle.putString("str_extra_toast_sent_message", m92651WI().getString(AbstractC8020f0.product_catalog_toast_catalog_shared));
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.mo89694j2(ShareView.class, bundle, 1, null, 2, true);
        }
    }

    /* renamed from: QM */
    static /* synthetic */ void m48640QM(CatalogsManageView catalogsManageView, List list, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "catalog_manage_share_catalog";
        }
        catalogsManageView.m48639PM(list, str);
    }

    /* renamed from: RM */
    private final void m48641RM() {
        C23744a.Companion.m124119a().m124115b(this, 5300);
    }

    /* renamed from: SM */
    private final void m48642SM() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (this.f48605S0 instanceof AbstractC9082a.a) {
                String string = m87077NK.getResources().getString(AbstractC8020f0.product_catalog_manage_view_multiselect_subtitle, Integer.valueOf(m48664wM().m96280g0()));
                AbstractC19074t.m100207e(string, "getString(...)");
                m87077NK.setMiddleSubtitle(string);
                return;
            }
            m87077NK.setMiddleSubtitle("");
        }
    }

    /* renamed from: TM */
    public final void m48643TM(boolean z11) {
        m48664wM().m96286p0(z11);
        C31089a c31089a = this.f48603Q0;
        C31089a c31089a2 = null;
        if (c31089a == null) {
            AbstractC19074t.m100223u("adapter");
            c31089a = null;
        }
        if (c31089a.mo10003k() > 0) {
            C31089a c31089a3 = this.f48603Q0;
            if (c31089a3 == null) {
                AbstractC19074t.m100223u("adapter");
                c31089a3 = null;
            }
            C31089a c31089a4 = this.f48603Q0;
            if (c31089a4 == null) {
                AbstractC19074t.m100223u("adapter");
            } else {
                c31089a2 = c31089a4;
            }
            c31089a3.m10014v(0, c31089a2.mo10003k(), this);
        }
        m48647XM();
    }

    /* renamed from: UM */
    private final void m48644UM(boolean z11) {
        int i11;
        if (z11) {
            m48665xM();
        } else if (this.f48606T0 == null) {
            return;
        }
        MultiSelectBottomView multiSelectBottomView = this.f48606T0;
        if (multiSelectBottomView == null) {
            return;
        }
        Slide slide = new Slide(80);
        slide.setDuration(250L);
        slide.addTarget(multiSelectBottomView);
        C29909l9 c29909l9 = this.f48602P0;
        if (c29909l9 == null) {
            AbstractC19074t.m100223u("binding");
            c29909l9 = null;
        }
        TransitionManager.beginDelayedTransition(c29909l9.getRoot(), slide);
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        multiSelectBottomView.setVisibility(i11);
    }

    /* renamed from: VM */
    private final void m48645VM() {
        C23744a.Companion.m124119a().m124117e(this, 5300);
    }

    /* renamed from: WM */
    private final void m48646WM() {
        boolean z11;
        boolean z12;
        int m96280g0 = m48664wM().m96280g0();
        if (m96280g0 > 0 && m96280g0 <= m48664wM().m96279f0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m96280g0 > 0 && m96280g0 <= m48664wM().m96278e0()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            View view = this.f48607U0;
            if (view != null) {
                view.setEnabled(true);
            }
            View view2 = this.f48607U0;
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
        } else {
            View view3 = this.f48607U0;
            if (view3 != null) {
                view3.setEnabled(false);
            }
            View view4 = this.f48607U0;
            if (view4 != null) {
                view4.setAlpha(0.3f);
            }
        }
        if (z12) {
            View view5 = this.f48608V0;
            if (view5 != null) {
                view5.setEnabled(true);
            }
            View view6 = this.f48608V0;
            if (view6 != null) {
                view6.setAlpha(1.0f);
            }
        } else {
            View view7 = this.f48608V0;
            if (view7 != null) {
                view7.setEnabled(false);
            }
            View view8 = this.f48608V0;
            if (view8 != null) {
                view8.setAlpha(0.3f);
            }
        }
        m48642SM();
    }

    /* renamed from: XM */
    private final void m48647XM() {
        boolean m96284m0 = m48664wM().m96284m0();
        if (m96284m0 && !(this.f48605S0 instanceof AbstractC9082a.a)) {
            m48629EM(AbstractC9082a.a.f48615a);
        } else if (!m96284m0 && !(this.f48605S0 instanceof AbstractC9082a.b)) {
            m48629EM(AbstractC9082a.b.f48616a);
        }
        m48646WM();
    }

    /* renamed from: tM */
    private final boolean m48661tM() {
        ZaloView zaloView;
        C17487o0 m92662fJ = m92662fJ();
        ProductContextMenuBottomSheet productContextMenuBottomSheet = null;
        if (m92662fJ != null) {
            zaloView = m92662fJ.m92996E0("CatalogContextMenu");
        } else {
            zaloView = null;
        }
        if (zaloView instanceof ProductContextMenuBottomSheet) {
            productContextMenuBottomSheet = (ProductContextMenuBottomSheet) zaloView;
        }
        if (productContextMenuBottomSheet != null && productContextMenuBottomSheet.m48827CM()) {
            productContextMenuBottomSheet.close();
            return true;
        }
        return false;
    }

    /* renamed from: uM */
    private final void m48662uM(C29259b c29259b, DeleteCatalogSource deleteCatalogSource) {
        m48664wM().m96271U(c29259b, deleteCatalogSource, new C9084c());
    }

    /* renamed from: vM */
    private final C18076a m48663vM() {
        return (C18076a) this.f48610X0.getValue();
    }

    /* renamed from: wM */
    public final C18096i m48664wM() {
        return (C18096i) this.f48609W0.getValue();
    }

    /* renamed from: xM */
    private final void m48665xM() {
        if (this.f48606T0 == null) {
            C29909l9 c29909l9 = this.f48602P0;
            C29909l9 c29909l92 = null;
            if (c29909l9 == null) {
                AbstractC19074t.m100223u("binding");
                c29909l9 = null;
            }
            Context context = c29909l9.getRoot().getContext();
            AbstractC19074t.m100205c(context);
            MultiSelectBottomView multiSelectBottomView = new MultiSelectBottomView(context);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12, -1);
            C29909l9 c29909l93 = this.f48602P0;
            if (c29909l93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29909l92 = c29909l93;
            }
            c29909l92.getRoot().addView(multiSelectBottomView, layoutParams);
            this.f48606T0 = multiSelectBottomView;
            Drawable m139659b = C27280g.m139659b(context, AbstractC2810d.zds_ic_share_line_24, AbstractC2808b.f150820b50);
            int i11 = AbstractC6918a0.btn_share;
            String string = m92651WI().getString(AbstractC8020f0.product_catalog_manage_menu_share);
            AbstractC19074t.m100207e(string, "getString(...)");
            TextView m87769a = multiSelectBottomView.m87769a(i11, string, m139659b);
            m87769a.setOnClickListener(new View.OnClickListener() { // from class: ay.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogsManageView.m48666yM(view);
                }
            });
            this.f48607U0 = m87769a;
            Drawable m139660c = C27280g.m139660c(context, AbstractC2810d.zds_ic_delete_line_24, AbstractC2807a.danger);
            int i12 = AbstractC6918a0.btn_delete;
            String string2 = m92651WI().getString(AbstractC8020f0.product_catalog_manage_menu_delete);
            AbstractC19074t.m100207e(string2, "getString(...)");
            TextView m87769a2 = multiSelectBottomView.m87769a(i12, string2, m139660c);
            m87769a2.setOnClickListener(new View.OnClickListener() { // from class: ay.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CatalogsManageView.m48667zM(view);
                }
            });
            this.f48608V0 = m87769a2;
        }
    }

    /* renamed from: yM */
    public static final void m48666yM(View view) {
    }

    /* renamed from: zM */
    public static final void m48667zM(View view) {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29909l9 m148206c = C29909l9.m148206c(LayoutInflater.from(getContext()), viewGroup, false);
        AbstractC19074t.m100207e(m148206c, "inflate(...)");
        this.f48602P0 = m148206c;
        C31089a c31089a = new C31089a(true, this);
        this.f48603Q0 = c31089a;
        c31089a.m9999J(true);
        C29909l9 c29909l9 = this.f48602P0;
        C29909l9 c29909l92 = null;
        if (c29909l9 == null) {
            AbstractC19074t.m100223u("binding");
            c29909l9 = null;
        }
        RecyclerView recyclerView = c29909l9.f138590q;
        C31089a c31089a2 = this.f48603Q0;
        if (c31089a2 == null) {
            AbstractC19074t.m100223u("adapter");
            c31089a2 = null;
        }
        recyclerView.setAdapter(c31089a2);
        this.f48604R0 = new LinearLayoutManager(getContext(), 1, false);
        C29909l9 c29909l93 = this.f48602P0;
        if (c29909l93 == null) {
            AbstractC19074t.m100223u("binding");
            c29909l93 = null;
        }
        RecyclerView recyclerView2 = c29909l93.f138590q;
        LinearLayoutManager linearLayoutManager = this.f48604R0;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C29909l9 c29909l94 = this.f48602P0;
        if (c29909l94 == null) {
            AbstractC19074t.m100223u("binding");
            c29909l94 = null;
        }
        c29909l94.f138590q.m9816A(new C9085d());
        C29909l9 c29909l95 = this.f48602P0;
        if (c29909l95 == null) {
            AbstractC19074t.m100223u("binding");
            c29909l95 = null;
        }
        c29909l95.f138590q.m9826E(new C9086e());
        C29909l9 c29909l96 = this.f48602P0;
        if (c29909l96 == null) {
            AbstractC19074t.m100223u("binding");
            c29909l96 = null;
        }
        c29909l96.f138591r.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: ay.d0
            public /* synthetic */ C2404d0() {
            }

            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                CatalogsManageView.m48634JM(CatalogsManageView.this);
            }
        });
        C29909l9 c29909l97 = this.f48602P0;
        if (c29909l97 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29909l92 = c29909l97;
        }
        RelativeLayout root = c29909l92.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m48664wM().m96276b0().mo9222o(this.f48613a1);
        m48664wM().m96277c0().mo9222o(this.f48614b1);
        AbstractC2421j.m12467j(this, m48663vM());
        List list = this.f48611Y0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
        C16972e0 c16972e0 = this.f48612Z0;
        if (c16972e0 != null) {
            c16972e0.dismiss();
        }
        m48645VM();
    }

    /* renamed from: LM */
    public final void m48668LM(CatalogContextMenuBottomSheet.AbstractC9074b abstractC9074b) {
        AbstractC19074t.m100208f(abstractC9074b, "menuItem");
        C29259b m48606a = abstractC9074b.m48606a();
        if (abstractC9074b instanceof CatalogContextMenuBottomSheet.AbstractC9074b.d) {
            m48638OM(m48606a);
            return;
        }
        if (abstractC9074b instanceof CatalogContextMenuBottomSheet.AbstractC9074b.c) {
            m48635KM(m48606a);
            return;
        }
        if (abstractC9074b instanceof CatalogContextMenuBottomSheet.AbstractC9074b.f) {
            m48637NM(m48606a);
            return;
        }
        if (abstractC9074b instanceof CatalogContextMenuBottomSheet.AbstractC9074b.a) {
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            AbstractC9183a.m48994b(context, m48606a, false, 4, null);
        } else if (abstractC9074b instanceof CatalogContextMenuBottomSheet.AbstractC9074b.e) {
            m48636MM(m48606a);
        } else if (abstractC9074b instanceof CatalogContextMenuBottomSheet.AbstractC9074b.b) {
            m48631GM(m48606a, DeleteCatalogSource.CatalogManageContextMenuDelete.f48754q);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C9087f());
            if (this.f48605S0 instanceof AbstractC9082a.a) {
                Context context = m87077NK.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m87077NK.m91006f(context, AbstractC2814h.WhiteZdsActionBar_AppType);
                String m92652XI = m92652XI(AbstractC8020f0.product_catalog_manage_view_multiselect_title);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                m87077NK.setMiddleTitle(m92652XI);
                m48642SM();
                return;
            }
            Context context2 = m87077NK.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            m87077NK.m91006f(context2, AbstractC2814h.BlueZdsActionBar_AppType);
            String m92652XI2 = m92652XI(AbstractC8020f0.product_catalog_manage_catalog_title);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            m87077NK.setMiddleTitle(m92652XI2);
            m87077NK.setMiddleSubtitle("");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m48664wM().m96276b0().m9219j(this, this.f48613a1);
        m48664wM().m96277c0().m9219j(this, this.f48614b1);
        m48664wM().m96283j0(true);
        m48641RM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CatalogManageView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f48605S0 instanceof AbstractC9082a.a) {
                m48630FM();
                return true;
            }
            if (m92649TI().m92996E0("CatalogContextMenu") != null) {
                if (!m48661tM()) {
                    finish();
                    return true;
                }
                return true;
            }
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // p661xx.InterfaceC30216b
    /* renamed from: vf */
    public void mo48669vf(AbstractC30215a abstractC30215a) {
        AbstractC19074t.m100208f(abstractC30215a, "action");
        if (abstractC30215a instanceof AbstractC30215a.b) {
            m48627CM(AddCatalogSource.CatalogManageEmptyView.f48744q);
            return;
        }
        if (abstractC30215a instanceof AbstractC30215a.a) {
            m48627CM(AddCatalogSource.CatalogManageBtnPlus.f48743q);
            return;
        }
        if (abstractC30215a instanceof AbstractC30215a.c) {
            m48628DM(AddProductSource.CatalogManageBtnAddProduct.f48747q);
            return;
        }
        if (abstractC30215a instanceof AbstractC30215a.d) {
            m48638OM(((AbstractC30215a.d) abstractC30215a).m149000a().m96249d());
        } else if (abstractC30215a instanceof AbstractC30215a.f) {
            m48664wM().m96272V();
        } else {
            boolean z11 = abstractC30215a instanceof AbstractC30215a.e;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC29263f abstractC29263f;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 5300) {
            Object obj = objArr[0];
            if (obj instanceof AbstractC29263f) {
                abstractC29263f = (AbstractC29263f) obj;
            } else {
                abstractC29263f = null;
            }
            if (abstractC29263f == null) {
                return;
            }
            if ((abstractC29263f instanceof AbstractC29263f.g) && !((AbstractC29263f.g) abstractC29263f).m146189c()) {
                finish();
            }
            m48664wM().m96282i0(abstractC29263f);
            m48663vM().m96146Y(abstractC29263f);
            return;
        }
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
    }
}
