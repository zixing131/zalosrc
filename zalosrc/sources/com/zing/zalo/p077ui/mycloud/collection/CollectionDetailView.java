package com.zing.zalo.p077ui.mycloud.collection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import au.AbstractC2379w;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.mycloud.EmbeddedMyCloudPagesLayout;
import com.zing.zalo.p077ui.mycloud.collection.BottomMenuCollectionDetailView;
import com.zing.zalo.p077ui.mycloud.collection.CollectionDetailView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ed0.AbstractC18391a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import kw.C21955a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import mw.C23459d;
import p246iw.C20843c0;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p365nk.C23805a;
import p542ub.InterfaceC27218a;
import p649xl.C29776e2;
import p716zh.C32090r5;
import pk.C24799c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import x80.C29481d;
import x80.InterfaceC29479c;

/* loaded from: classes6.dex */
public final class CollectionDetailView extends SlidableZaloView implements InterfaceC29479c, C23744a.c {
    public static final C12526a Companion = new C12526a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f65501P0;

    /* renamed from: Q0 */
    private C29776e2 f65502Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f65503R0;

    /* renamed from: S0 */
    private EmbeddedMyCloudPagesLayout f65504S0;

    /* renamed from: T0 */
    private C24799c f65505T0;

    /* renamed from: U0 */
    private ActionBarMenuItem f65506U0;

    /* renamed from: V0 */
    private ActionBarMenuItem f65507V0;

    /* renamed from: W0 */
    private ActionBarMenuItem f65508W0;

    /* renamed from: X0 */
    private boolean f65509X0;

    /* renamed from: Y0 */
    private final AbstractC18391a f65510Y0;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionDetailView$a */
    /* loaded from: classes6.dex */
    public static final class C12526a {
        private C12526a() {
        }

        public /* synthetic */ C12526a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionDetailView$b */
    /* loaded from: classes6.dex */
    static final class C12527b extends AbstractC19075u implements InterfaceC18494a {
        C12527b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C12555b mo12V4() {
            return C12555b.Companion.m70721a(CollectionDetailView.this.m92642L3());
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionDetailView$c */
    /* loaded from: classes6.dex */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC12528c implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC12528c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (CollectionDetailView.this.m92672lJ()) {
                EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = CollectionDetailView.this.f65504S0;
                if (embeddedMyCloudPagesLayout != null) {
                    embeddedMyCloudPagesLayout.setContentUITopOffset(CollectionDetailView.this.m70612Ne());
                    embeddedMyCloudPagesLayout.bringToFront();
                    embeddedMyCloudPagesLayout.invalidate();
                }
                C29776e2 c29776e2 = CollectionDetailView.this.f65502Q0;
                C29776e2 c29776e22 = null;
                if (c29776e2 == null) {
                    AbstractC19074t.m100223u("viewBinding");
                    c29776e2 = null;
                }
                LinearLayout linearLayout = c29776e2.f137639s;
                AbstractC19074t.m100207e(linearLayout, "searchContainer");
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = AbstractC23136l9.m118737p0();
                    linearLayout.setLayoutParams(marginLayoutParams);
                    C29776e2 c29776e23 = CollectionDetailView.this.f65502Q0;
                    if (c29776e23 == null) {
                        AbstractC19074t.m100223u("viewBinding");
                    } else {
                        c29776e22 = c29776e23;
                    }
                    c29776e22.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionDetailView$d */
    /* loaded from: classes6.dex */
    public static final class C12529d implements BottomMenuCollectionDetailView.InterfaceC12524b {
        C12529d() {
        }

        /* renamed from: e */
        public static final void m70641e(CollectionDetailView collectionDetailView, InterfaceC17463d interfaceC17463d, int i11) {
            AbstractC19074t.m100208f(collectionDetailView, "this$0");
            if (interfaceC17463d != null) {
                interfaceC17463d.dismiss();
            }
            C24799c c24799c = collectionDetailView.f65505T0;
            if (c24799c != null) {
                collectionDetailView.m70631yM().m146726Np(c24799c.m128824d());
            }
        }

        /* renamed from: f */
        public static final void m70642f(InterfaceC17463d interfaceC17463d, int i11) {
            interfaceC17463d.dismiss();
        }

        @Override // com.zing.zalo.p077ui.mycloud.collection.BottomMenuCollectionDetailView.InterfaceC12524b
        /* renamed from: a */
        public void mo70604a(long j11) {
            Bundle bundle = new Bundle();
            bundle.putInt("viewMode", 1);
            bundle.putLong("collectionId", j11);
            bundle.putString("entryPoint", "collection_detail_rename");
            C17487o0 m92662fJ = CollectionDetailView.this.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(CreateNewCollectionView.class, bundle, 1, true);
            }
        }

        @Override // com.zing.zalo.p077ui.mycloud.collection.BottomMenuCollectionDetailView.InterfaceC12524b
        /* renamed from: b */
        public void mo70605b(long j11) {
            Context context = CollectionDetailView.this.getContext();
            AbstractC19074t.m100205c(context);
            C16972e0.a m90932i = new C16972e0.a(context).m90932i(C16972e0.b.DIALOG_INFORMATION);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_dialog_confirm_delete_collection);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m90932i.m90949z(m118743r0).m90921E(true).m90942s(AbstractC8020f0.str_delete, new InterfaceC17463d.d() { // from class: x80.m
                public /* synthetic */ C29496m() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    CollectionDetailView.C12529d.m70641e(CollectionDetailView.this, interfaceC17463d, i11);
                }
            }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: x80.n
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    CollectionDetailView.C12529d.m70642f(interfaceC17463d, i11);
                }
            }).m90927d().mo13822K();
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionDetailView$e */
    /* loaded from: classes6.dex */
    static final class C12530e extends AbstractC19075u implements InterfaceC18494a {
        C12530e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29481d mo12V4() {
            return new C29481d(CollectionDetailView.this);
        }
    }

    /* renamed from: com.zing.zalo.ui.mycloud.collection.CollectionDetailView$f */
    /* loaded from: classes6.dex */
    public static final class C12531f extends AbstractC18391a {
        C12531f() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            String str;
            C29481d m70631yM = CollectionDetailView.this.m70631yM();
            long m70717a = CollectionDetailView.this.m70630xM().m70717a();
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            m70631yM.m146722Ip(m70717a, str);
        }
    }

    public CollectionDetailView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C12530e());
        this.f65501P0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C12527b());
        this.f65503R0 = m129210a2;
        this.f65510Y0 = new C12531f();
    }

    /* renamed from: AM */
    public static final void m70607AM(CollectionDetailView collectionDetailView) {
        AbstractC19074t.m100208f(collectionDetailView, "this$0");
        C29776e2 c29776e2 = collectionDetailView.f65502Q0;
        if (c29776e2 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29776e2 = null;
        }
        AbstractC2379w.m12430d(c29776e2.f137638r);
    }

    /* renamed from: BM */
    private final void m70608BM() {
        mo70710wy(new Runnable() { // from class: x80.k
            public /* synthetic */ RunnableC29494k() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CollectionDetailView.m70609CM(CollectionDetailView.this);
            }
        });
    }

    /* renamed from: CM */
    public static final void m70609CM(CollectionDetailView collectionDetailView) {
        AbstractC19074t.m100208f(collectionDetailView, "this$0");
        try {
            if (!collectionDetailView.mo78947bg() && collectionDetailView.mo45894h0() && C32090r5.m154810i().m154824o() && C32090r5.m154810i().m154822m()) {
                C32090r5.m154810i().m154814d();
                ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_all_photo_video_saved));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPresenter", e11);
        }
    }

    /* renamed from: DM */
    public static final void m70610DM(CustomEditText customEditText) {
        AbstractC19074t.m100208f(customEditText, "$it");
        AbstractC2379w.m12432f(customEditText);
    }

    /* renamed from: EM */
    public static final void m70611EM(CollectionDetailView collectionDetailView) {
        String str;
        AbstractC19074t.m100208f(collectionDetailView, "this$0");
        ActionBar actionBar = collectionDetailView.f88760a0;
        if (actionBar != null) {
            C24799c c24799c = collectionDetailView.f65505T0;
            if (c24799c != null) {
                str = c24799c.m128821a();
            } else {
                str = null;
            }
            actionBar.setTitle(str);
        }
    }

    /* renamed from: Ne */
    public final int m70612Ne() {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null && actionBar.getVisibility() != 8) {
            return this.f88760a0.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: uM */
    public static final void m70627uM(C24799c c24799c) {
        AbstractC19074t.m100208f(c24799c, "$it");
        C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(c24799c.m128824d()));
    }

    /* renamed from: vM */
    public static final void m70628vM(long j11, CollectionDetailView collectionDetailView) {
        C17487o0 mo35579p;
        AbstractC19074t.m100208f(collectionDetailView, "this$0");
        C23744a.Companion.m124119a().m124116d(5202, Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("extra_collection_id", j11);
        InterfaceC27218a m92676n2 = collectionDetailView.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(CollectionDetailView.class, bundle, 1, true);
        }
        collectionDetailView.finish();
    }

    /* renamed from: wM */
    public static final void m70629wM(CollectionDetailView collectionDetailView, int i11, String str, String str2) {
        AbstractC19074t.m100208f(collectionDetailView, "this$0");
        AbstractC19074t.m100208f(str, "$successMsg");
        AbstractC19074t.m100208f(str2, "$errorMessage");
        C23459d.f113954a.m123170n(collectionDetailView.f72421L0, i11, str, str2);
    }

    /* renamed from: xM */
    public final C12555b m70630xM() {
        return (C12555b) this.f65503R0.getValue();
    }

    /* renamed from: yM */
    public final C29481d m70631yM() {
        return (C29481d) this.f65501P0.getValue();
    }

    /* renamed from: zM */
    public static final void m70632zM(CollectionDetailView collectionDetailView, View view) {
        AbstractC19074t.m100208f(collectionDetailView, "this$0");
        collectionDetailView.m70633Kb();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            C24799c m109091x0 = C20843c0.Companion.m109092a().m109091x0(m70630xM().m70717a());
            if (m109091x0 != null) {
                this.f65505T0 = m109091x0;
            }
            C24799c c24799c = this.f65505T0;
            if (c24799c != null) {
                C21955a.f108070a.m114646m(m70630xM().m70718b(), c24799c.m128832l());
            }
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null && m92676n2.getWindow() != null) {
                m92676n2.mo35554O(32);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        int i11;
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        actionBarMenu.m92750r();
        super.mo37482FJ(actionBarMenu);
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.light_icon_01;
        } else {
            i11 = AbstractC2808b.dark_icon_01;
        }
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        this.f65508W0 = actionBarMenu.m92742i(3, C27280g.m139659b(context, AbstractC23322a.zds_ic_search_line_24, i11));
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        this.f65506U0 = actionBarMenu.m92742i(1, C27280g.m139659b(context2, AbstractC23322a.zds_ic_plus_line_24, i11));
        C24799c c24799c = this.f65505T0;
        if (c24799c != null && !c24799c.m128832l()) {
            Context context3 = getContext();
            AbstractC19074t.m100205c(context3);
            this.f65507V0 = actionBarMenu.m92742i(2, C27280g.m139659b(context3, AbstractC23322a.zds_ic_more_vertical_line_24, i11));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29776e2 m147883c = C29776e2.m147883c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147883c, "inflate(...)");
        this.f65502Q0 = m147883c;
        C29776e2 c29776e2 = null;
        if (this.f65504S0 == null) {
            Context context = getContext();
            if (context != null) {
                embeddedMyCloudPagesLayout = new EmbeddedMyCloudPagesLayout(context, C23805a.e.f115064q, m70630xM().m70717a());
                embeddedMyCloudPagesLayout.setId(AbstractC6918a0.csc_embedded_media_store_layout);
                embeddedMyCloudPagesLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            } else {
                embeddedMyCloudPagesLayout = null;
            }
            this.f65504S0 = embeddedMyCloudPagesLayout;
        }
        m92637BK(true);
        C29776e2 c29776e22 = this.f65502Q0;
        if (c29776e22 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29776e22 = null;
        }
        c29776e22.getRoot().addView(this.f65504S0);
        C29776e2 c29776e23 = this.f65502Q0;
        if (c29776e23 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29776e23 = null;
        }
        c29776e23.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC12528c());
        C29776e2 c29776e24 = this.f65502Q0;
        if (c29776e24 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29776e24 = null;
        }
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.light_icon_01;
        } else {
            i11 = AbstractC2808b.dark_icon_01;
        }
        ImageView imageView = c29776e24.f137637q;
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        imageView.setImageDrawable(C27280g.m139659b(context2, AbstractC23322a.zds_ic_arrow_left_line_24, i11));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: x80.e
            public /* synthetic */ ViewOnClickListenerC29483e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionDetailView.m70632zM(CollectionDetailView.this, view);
            }
        });
        CustomEditText customEditText = c29776e24.f137638r;
        customEditText.f83177K = true;
        Context context3 = getContext();
        AbstractC19074t.m100205c(context3);
        customEditText.setCompoundDrawables(C27280g.m139659b(context3, AbstractC23322a.zds_ic_search_line_24, i11), null, null, null);
        Context context4 = getContext();
        AbstractC19074t.m100205c(context4);
        customEditText.setClearDrawable(C27280g.m139659b(context4, AbstractC23322a.zds_ic_close_circle_solid_16, i11));
        customEditText.addTextChangedListener(this.f65510Y0);
        C29776e2 c29776e25 = this.f65502Q0;
        if (c29776e25 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29776e2 = c29776e25;
        }
        FrameLayout root = c29776e2.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5203);
        bVar.m124119a().m124117e(this, 5205);
        bVar.m124119a().m124117e(this, 5207);
        bVar.m124119a().m124117e(this, 5211);
        bVar.m124119a().m124117e(this, 5212);
        bVar.m124119a().m124117e(this, 5213);
        bVar.m124119a().m124117e(this, 46);
        bVar.m124119a().m124117e(this, 5215);
        C24799c c24799c = this.f65505T0;
        if (c24799c != null) {
            int m109061M0 = AbstractC23306f.m120602N0().m109061M0();
            AbstractC23306f.m120602N0().m109055H1(c24799c.m128824d());
            if (m109061M0 != 7) {
                AbstractC23306f.m120602N0().m109085p0(c24799c.m128824d());
                AbstractC23306f.m120602N0().m109072T1(-1);
            }
        }
    }

    /* renamed from: Kb */
    public void m70633Kb() {
        this.f65509X0 = false;
        C29776e2 c29776e2 = this.f65502Q0;
        C29776e2 c29776e22 = null;
        if (c29776e2 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c29776e2 = null;
        }
        c29776e2.f137638r.setText("");
        C29776e2 c29776e23 = this.f65502Q0;
        if (c29776e23 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c29776e22 = c29776e23;
        }
        c29776e22.f137639s.setVisibility(8);
        this.f72827B0.postDelayed(new Runnable() { // from class: x80.f
            public /* synthetic */ RunnableC29485f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CollectionDetailView.m70607AM(CollectionDetailView.this);
            }
        }, 500L);
    }

    @Override // x80.InterfaceC29479c
    /* renamed from: P7 */
    public void mo70634P7(long j11) {
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_PARAM_COLLECTION_ID", m70630xM().m70717a());
        bundle.putString("EXTRA_PARAM_ENTRY_POINT", "collection_detail");
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(MyCloudMessagePickerView.class, bundle, 0, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return super.mo37491QJ(i11);
                }
                m70631yM().m146725Mp();
                return true;
            }
            m70631yM().m146724Kp();
            return true;
        }
        C24799c c24799c = this.f65505T0;
        if (c24799c != null) {
            m70631yM().m146723Jp(c24799c.m128824d());
        }
        return true;
    }

    @Override // x80.InterfaceC29479c
    /* renamed from: S1 */
    public void mo70635S1() {
        AbstractC19444a.m101697e(new Runnable() { // from class: x80.j
            public /* synthetic */ RunnableC29493j() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                CollectionDetailView.m70611EM(CollectionDetailView.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        int i11;
        String str;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (C23212s8.m119603k()) {
                i11 = AbstractC16803z.stencils_ic_head_back_black;
            } else {
                i11 = AbstractC16803z.stencils_ic_head_back_white;
            }
            actionBar.setBackButtonImage(i11);
            actionBar.setTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC21196a.TextColor1));
            actionBar.setBackgroundColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.HeaderFormColor));
            C24799c c24799c = this.f65505T0;
            if (c24799c != null) {
                str = c24799c.m128821a();
            } else {
                str = null;
            }
            actionBar.setTitle(str);
            TextView titleTextView = actionBar.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.setAlpha(0.0f);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z12 && !z11) {
            C29776e2 c29776e2 = this.f65502Q0;
            if (c29776e2 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c29776e2 = null;
            }
            c29776e2.f137638r.removeTextChangedListener(this.f65510Y0);
            m70633Kb();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: x80.l.<init>(com.zing.zalo.uicontrol.CustomEditText):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @Override // x80.InterfaceC29479c
    /* renamed from: Xr */
    public void mo70636Xr() {
        /*
            r5 = this;
            r0 = 1
            r5.f65509X0 = r0
            xl.e2 r0 = r5.f65502Q0
            r1 = 0
            java.lang.String r2 = "viewBinding"
            if (r0 != 0) goto Le
            fn0.AbstractC19074t.m100223u(r2)
            r0 = r1
        Le:
            android.widget.LinearLayout r0 = r0.f137639s
            r3 = 0
            r0.setVisibility(r3)
            xl.e2 r3 = r5.f65502Q0
            if (r3 != 0) goto L1c
            fn0.AbstractC19074t.m100223u(r2)
            goto L1d
        L1c:
            r1 = r3
        L1d:
            com.zing.zalo.uicontrol.CustomEditText r1 = r1.f137638r
            r0.requestFocus()
            android.os.Handler r0 = r5.f72827B0
            x80.l r2 = new x80.l
            r2.<init>()
            r3 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.mycloud.collection.CollectionDetailView.mo70636Xr():void");
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = this.f65504S0;
        if (embeddedMyCloudPagesLayout != null) {
            embeddedMyCloudPagesLayout.m70147I0(this);
        }
        m70633Kb();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "CollectionDetail";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        EmbeddedMyCloudPagesLayout embeddedMyCloudPagesLayout = this.f65504S0;
        if (embeddedMyCloudPagesLayout != null) {
            embeddedMyCloudPagesLayout.m70167X0(i11, i12);
        }
    }

    @Override // x80.InterfaceC29479c
    /* renamed from: sq */
    public void mo70637sq() {
        BottomMenuCollectionDetailView m70603a = BottomMenuCollectionDetailView.Companion.m70603a(m70630xM().m70717a(), new C12529d());
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93058d2(0, m70603a, 0, null, 0, true);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: x80.i.<init>(com.zing.zalo.ui.mycloud.collection.CollectionDetailView, int, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0022. Please report as an issue. */
    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int r8, java.lang.Object... r9) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.mycloud.collection.CollectionDetailView.mo17795x(int, java.lang.Object[]):void");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5203);
        bVar.m124119a().m124115b(this, 5205);
        bVar.m124119a().m124115b(this, 5207);
        bVar.m124119a().m124115b(this, 5211);
        bVar.m124119a().m124115b(this, 5212);
        bVar.m124119a().m124115b(this, 5213);
        bVar.m124119a().m124115b(this, 46);
        bVar.m124119a().m124115b(this, 5215);
    }
}
