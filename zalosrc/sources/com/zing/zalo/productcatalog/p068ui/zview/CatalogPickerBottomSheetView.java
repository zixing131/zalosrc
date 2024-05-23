package com.zing.zalo.productcatalog.p068ui.zview;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.productcatalog.p068ui.zview.CatalogPickerBottomSheetView;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p115dy.AbstractC18104m;
import p115dy.C18112q;
import p363nh.C23744a;
import p624wx.AbstractC29263f;
import p649xl.C29927m9;
import p661xx.AbstractC30217c;
import p661xx.InterfaceC30218d;
import p661xx.InterfaceC30219e;
import p696yx.C31095g;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class CatalogPickerBottomSheetView extends BottomSheetZaloViewWithAnim implements ZaloView.InterfaceC17421f, InterfaceC30218d {
    public static final C9076a Companion = new C9076a(null);

    /* renamed from: W0 */
    private C29927m9 f48590W0;

    /* renamed from: X0 */
    private C31095g f48591X0;

    /* renamed from: Y0 */
    private LinearLayoutManager f48592Y0;

    /* renamed from: a1 */
    private boolean f48594a1;

    /* renamed from: d1 */
    private InterfaceC30219e f48597d1;

    /* renamed from: Z0 */
    private final ArrayList f48593Z0 = new ArrayList();

    /* renamed from: b1 */
    private final InterfaceC24854k f48595b1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18112q.class), new C9081f(new C9080e(this)), C9077b.f48598q);

    /* renamed from: c1 */
    private final InterfaceC1764d0 f48596c1 = new InterfaceC1764d0() { // from class: ay.v
        public /* synthetic */ C2454v() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            CatalogPickerBottomSheetView.m48613rM(CatalogPickerBottomSheetView.this, (List) obj);
        }
    };

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogPickerBottomSheetView$a */
    /* loaded from: classes4.dex */
    public static final class C9076a {
        private C9076a() {
        }

        public /* synthetic */ C9076a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogPickerBottomSheetView$b */
    /* loaded from: classes4.dex */
    public static final class C9077b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9077b f48598q = new C9077b();

        C9077b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C18112q.b();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogPickerBottomSheetView$c */
    /* loaded from: classes4.dex */
    public static final class C9078c extends RecyclerView.AbstractC1887n {
        C9078c() {
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

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogPickerBottomSheetView$d */
    /* loaded from: classes4.dex */
    public static final class C9079d extends RecyclerView.AbstractC1892s {
        C9079d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (i11 != 0 || i12 != 0) {
                try {
                    LinearLayoutManager linearLayoutManager = CatalogPickerBottomSheetView.this.f48592Y0;
                    if (linearLayoutManager == null) {
                        AbstractC19074t.m100223u("catalogListLayoutManager");
                        linearLayoutManager = null;
                    }
                    int m9745c2 = linearLayoutManager.m9745c2();
                    C31095g c31095g = CatalogPickerBottomSheetView.this.f48591X0;
                    if (c31095g == null) {
                        AbstractC19074t.m100223u("catalogListAdapter");
                        c31095g = null;
                    }
                    AbstractC18104m m151089L = c31095g.m151089L(m9745c2);
                    LinearLayoutManager linearLayoutManager2 = CatalogPickerBottomSheetView.this.f48592Y0;
                    if (linearLayoutManager2 == null) {
                        AbstractC19074t.m100223u("catalogListLayoutManager");
                        linearLayoutManager2 = null;
                    }
                    if (m9745c2 >= linearLayoutManager2.m10127i() - 1 && (m151089L instanceof AbstractC18104m.a)) {
                        C18112q.m96318c0(CatalogPickerBottomSheetView.this.m48614sM(), false, 1, null);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogPickerBottomSheetView$e */
    /* loaded from: classes4.dex */
    public static final class C9080e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48600q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9080e(ZaloView zaloView) {
            super(0);
            this.f48600q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f48600q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.CatalogPickerBottomSheetView$f */
    /* loaded from: classes4.dex */
    public static final class C9081f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48601q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9081f(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48601q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48601q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: rM */
    public static final void m48613rM(CatalogPickerBottomSheetView catalogPickerBottomSheetView, List list) {
        AbstractC19074t.m100208f(catalogPickerBottomSheetView, "this$0");
        AbstractC19074t.m100208f(list, "items");
        catalogPickerBottomSheetView.f48593Z0.clear();
        catalogPickerBottomSheetView.f48593Z0.addAll(list);
        if (catalogPickerBottomSheetView.f48594a1) {
            catalogPickerBottomSheetView.m48618xM();
        }
    }

    /* renamed from: sM */
    public final C18112q m48614sM() {
        return (C18112q) this.f48595b1.getValue();
    }

    /* renamed from: tM */
    private final void m48615tM() {
        C31095g c31095g = new C31095g(this);
        this.f48591X0 = c31095g;
        c31095g.m9999J(true);
        C29927m9 c29927m9 = this.f48590W0;
        C29927m9 c29927m92 = null;
        if (c29927m9 == null) {
            AbstractC19074t.m100223u("binding");
            c29927m9 = null;
        }
        RecyclerView recyclerView = c29927m9.f138676t;
        C31095g c31095g2 = this.f48591X0;
        if (c31095g2 == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31095g2 = null;
        }
        recyclerView.setAdapter(c31095g2);
        this.f48592Y0 = new LinearLayoutManager(getContext(), 1, false);
        C29927m9 c29927m93 = this.f48590W0;
        if (c29927m93 == null) {
            AbstractC19074t.m100223u("binding");
            c29927m93 = null;
        }
        RecyclerView recyclerView2 = c29927m93.f138676t;
        LinearLayoutManager linearLayoutManager = this.f48592Y0;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("catalogListLayoutManager");
            linearLayoutManager = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C29927m9 c29927m94 = this.f48590W0;
        if (c29927m94 == null) {
            AbstractC19074t.m100223u("binding");
            c29927m94 = null;
        }
        c29927m94.f138676t.m9816A(new C9078c());
        C29927m9 c29927m95 = this.f48590W0;
        if (c29927m95 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29927m92 = c29927m95;
        }
        c29927m92.f138676t.m9826E(new C9079d());
    }

    /* renamed from: vM */
    public static final void m48616vM(CatalogPickerBottomSheetView catalogPickerBottomSheetView, View view) {
        AbstractC19074t.m100208f(catalogPickerBottomSheetView, "this$0");
        catalogPickerBottomSheetView.close();
    }

    /* renamed from: wM */
    private final void m48617wM() {
        C23744a.Companion.m124119a().m124115b(this, 5300);
    }

    /* renamed from: xM */
    private final void m48618xM() {
        C31095g c31095g = this.f48591X0;
        C31095g c31095g2 = null;
        if (c31095g == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31095g = null;
        }
        int mo10003k = c31095g.mo10003k();
        C31095g c31095g3 = this.f48591X0;
        if (c31095g3 == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31095g3 = null;
        }
        c31095g3.m151092O(this.f48593Z0);
        if (mo10003k == 0) {
            C31095g c31095g4 = this.f48591X0;
            if (c31095g4 == null) {
                AbstractC19074t.m100223u("catalogListAdapter");
                c31095g4 = null;
            }
            C31095g c31095g5 = this.f48591X0;
            if (c31095g5 == null) {
                AbstractC19074t.m100223u("catalogListAdapter");
            } else {
                c31095g2 = c31095g5;
            }
            c31095g4.m10015w(0, c31095g2.mo10003k());
            return;
        }
        C31095g c31095g6 = this.f48591X0;
        if (c31095g6 == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
        } else {
            c31095g2 = c31095g6;
        }
        c31095g2.m10008p();
    }

    /* renamed from: yM */
    private final void m48619yM() {
        C23744a.Companion.m124119a().m124117e(this, 5300);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C17487o0 mo78545c;
        InterfaceC1801w m93004H0;
        super.mo37111CJ(bundle);
        BottomSheetZaloViewWithAnim.InterfaceC14117c interfaceC14117c = this.f72458P0;
        if (interfaceC14117c != null && (mo78545c = interfaceC14117c.mo78545c()) != null && (m93004H0 = mo78545c.m93004H0()) != null && (m93004H0 instanceof InterfaceC30219e)) {
            this.f48597d1 = (InterfaceC30219e) m93004H0;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m48614sM().m96323W().mo9222o(this.f48596c1);
        m48619yM();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29927m9 c29927m9 = this.f48590W0;
        if (c29927m9 == null) {
            AbstractC19074t.m100223u("binding");
            c29927m9 = null;
        }
        RelativeLayout root = c29927m9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: T2 */
    public void mo42955T2(float f11) {
        boolean z11;
        super.mo42955T2(f11);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        if (bottomSheetLayout.getTranslationY() == this.f72454M0.f68983q) {
            z11 = true;
        } else {
            z11 = false;
        }
        bottomSheetLayout.setEnableScrollY(z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        long j11 = -1000;
        if (m92642L3 != null) {
            j11 = m92642L3.getLong("EXTRA_SELECTED_CATALOG_ID", -1000L);
        }
        m48614sM().m96323W().m9219j(this, this.f48596c1);
        m48614sM().m96326Z(j11);
        m48617wM();
    }

    @Override // p661xx.InterfaceC30218d
    /* renamed from: Zz */
    public void mo48620Zz(AbstractC30217c abstractC30217c) {
        AbstractC19074t.m100208f(abstractC30217c, "action");
        if (abstractC30217c instanceof AbstractC30217c.a) {
            InterfaceC30219e interfaceC30219e = this.f48597d1;
            if (interfaceC30219e != null) {
                AbstractC30217c.a aVar = (AbstractC30217c.a) abstractC30217c;
                interfaceC30219e.mo48737et(aVar.m149001a().m96302f().m146158m(), aVar.m149001a().m96302f());
            }
            close();
            return;
        }
        if (abstractC30217c instanceof AbstractC30217c.b) {
            m48614sM().m96321S();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return AbstractC23136l9.m118742r(300.0f);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        String str;
        AbstractC19074t.m100208f(linearLayout, "llContainer");
        C29927m9 m148248c = C29927m9.m148248c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m148248c, "inflate(...)");
        this.f48590W0 = m148248c;
        C29927m9 c29927m9 = null;
        if (m148248c == null) {
            AbstractC19074t.m100223u("binding");
            m148248c = null;
        }
        m148248c.f138673q.setOnClickListener(new View.OnClickListener() { // from class: ay.w
            public /* synthetic */ ViewOnClickListenerC2456w() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogPickerBottomSheetView.m48616vM(CatalogPickerBottomSheetView.this, view);
            }
        });
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("EXTRA_TITLE");
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            C29927m9 c29927m92 = this.f48590W0;
            if (c29927m92 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29927m9 = c29927m92;
            }
            c29927m9.f138677u.setText(str);
        }
        m48615tM();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        m78539iM(true);
        this.f72454M0.setEnableScrollY(false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CatalogPickerBottomSheetView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        this.f48594a1 = true;
        C31095g c31095g = this.f48591X0;
        if (c31095g == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31095g = null;
        }
        if (c31095g.mo10003k() == 0 && (true ^ this.f48593Z0.isEmpty())) {
            m48618xM();
        }
    }

    /* renamed from: uM */
    public final boolean m48621uM() {
        return this.f48594a1;
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
                close();
            }
            m48614sM().m96325Y(abstractC29263f);
            return;
        }
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
    }
}
