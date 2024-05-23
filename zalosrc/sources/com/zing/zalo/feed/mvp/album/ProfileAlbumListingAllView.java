package com.zing.zalo.feed.mvp.album;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1803x;
import bo.C2974g;
import bo.C2979h;
import bo.C2994k;
import bo.C3000l0;
import bo.C3009n;
import bo.C3054x;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.AlbumListingView;
import com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView;
import com.zing.zalo.feed.mvp.profile.ProfileAlbumDetailView;
import com.zing.zalo.feed.mvp.profile.model.C8676a;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.animation.AnimationTarget;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fo.C19086f;
import fo.C19087g;
import is.AbstractC20783a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23212s8;
import p137eo.C18524h;
import p649xl.C30068u9;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes4.dex */
public final class ProfileAlbumListingAllView extends SlidableZaloView {
    public static final C8499a Companion = new C8499a(null);

    /* renamed from: P0 */
    private boolean f46051P0;

    /* renamed from: Q0 */
    private C30068u9 f46052Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f46053R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f46054S0;

    /* renamed from: T0 */
    private C8676a f46055T0;

    /* renamed from: U0 */
    private String f46056U0;

    /* renamed from: V0 */
    private C32002l4 f46057V0;

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$a */
    /* loaded from: classes4.dex */
    public static final class C8499a {
        private C8499a() {
        }

        public /* synthetic */ C8499a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$b */
    /* loaded from: classes4.dex */
    public static final class C8500b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46058t;

        C8500b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C8500b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46058t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19086f m45309qM = ProfileAlbumListingAllView.this.m45309qM();
                C19086f.a aVar = new C19086f.a(ProfileAlbumListingAllView.this.m45312tM(), 1, 1, null, 8, null);
                this.f46058t = 1;
                if (m45309qM.m101507a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8500b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$c */
    /* loaded from: classes4.dex */
    public static final class C8501c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46060t;

        C8501c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C8501c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46060t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C19086f m45309qM = ProfileAlbumListingAllView.this.m45309qM();
                C19086f.a aVar = new C19086f.a(ProfileAlbumListingAllView.this.m45312tM(), 1, ProfileAlbumListingAllView.this.f46055T0.m46337h() + 1, ProfileAlbumListingAllView.this.f46055T0);
                this.f46060t = 1;
                if (m45309qM.m101507a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8501c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$d */
    /* loaded from: classes4.dex */
    public static final class C8502d implements FeedBaseAdapter.AlbumProfileCallback {
        C8502d() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: W0 */
        public void mo43226W0() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: X0 */
        public void mo43227X0() {
            ProfileAlbumListingAllView.this.m45305A4();
        }

        @Override // com.zing.zalo.feed.components.FeedItemTitleDivider.InterfaceC8146a
        /* renamed from: a */
        public void mo44157a() {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onClickButtonAction(this);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: a4 */
        public void mo43228a4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            ProfileAlbumListingAllView.this.m45313wM(profilePreviewAlbumItem);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: b4 */
        public void mo43229b4() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: c */
        public void mo43425c(AnimationTarget animationTarget, ItemAlbumMobile itemAlbumMobile, int i11) {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onItemClick(this, animationTarget, itemAlbumMobile, i11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: c4 */
        public void mo43230c4() {
            ProfileAlbumListingAllView.this.m45310rM();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: d4 */
        public void mo43231d4() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e */
        public void mo43232e() {
            ProfileAlbumListingAllView.this.m45308pM();
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e2 */
        public void mo43233e2() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: e4 */
        public void mo43234e4(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
            C0815e1.m2075D().m2100V(C32017m4.m154326S().m154343Q(ProfileAlbumListingAllView.this.m45307oM().m154284u(53)), false);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: f4 */
        public void mo43235f4(View view, View view2) {
            AbstractC19074t.m100208f(view, "headerRootView");
            AbstractC19074t.m100208f(view2, "headerTitleView");
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: i */
        public void mo43428i(int i11) {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onPreviewItemDeleteClick(this, i11);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.AlbumProfileCallback
        /* renamed from: l0 */
        public void mo43236l0() {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: n1 */
        public void mo43430n1() {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onClickOpenGallery(this);
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: r2 */
        public void mo43431r2() {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onItemVideoClick(this);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: s */
        public void mo43237s(C3054x c3054x) {
            AbstractC19074t.m100208f(c3054x, "emptyContentData");
            if (c3054x.m14693y() == 1) {
                if (C23055e5.m118273h(false, 1, null)) {
                    ProfileAlbumListingAllView.this.m45314xM();
                    ProfileAlbumListingAllView.this.m45308pM();
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.network_error));
                }
            }
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: u */
        public void mo43238u() {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: v */
        public void mo43239v(boolean z11) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: w */
        public void mo43240w(View view) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: x */
        public void mo43241x(boolean z11) {
        }

        @Override // com.zing.zalo.feed.components.AlbumRowPreviewGridView.InterfaceC8067a
        /* renamed from: x1 */
        public void mo43433x1() {
            FeedBaseAdapter.AlbumProfileCallback.DefaultImpls.onPreviewItemDeleteVideoClick(this);
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: y */
        public void mo43242y(C3000l0 c3000l0) {
        }

        @Override // com.zing.zalo.feed.adapters.FeedBaseAdapter.InterfaceC8021a
        /* renamed from: z */
        public void mo43243z() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$e */
    /* loaded from: classes4.dex */
    public static final class C8503e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f46063t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$e$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ ProfileAlbumListingAllView f46065p;

            a(ProfileAlbumListingAllView profileAlbumListingAllView) {
                this.f46065p = profileAlbumListingAllView;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public static final void m45321f(ProfileAlbumListingAllView profileAlbumListingAllView) {
                AbstractC19074t.m100208f(profileAlbumListingAllView, "this$0");
                C30068u9 c30068u9 = profileAlbumListingAllView.f46052Q0;
                if (c30068u9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30068u9 = null;
                }
                c30068u9.f139571q.m43417e();
                profileAlbumListingAllView.m45306lM();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public static final void m45322g(ProfileAlbumListingAllView profileAlbumListingAllView) {
                AbstractC19074t.m100208f(profileAlbumListingAllView, "this$0");
                profileAlbumListingAllView.m45314xM();
                profileAlbumListingAllView.m45303yM();
                C30068u9 c30068u9 = profileAlbumListingAllView.f46052Q0;
                if (c30068u9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30068u9 = null;
                }
                c30068u9.f139571q.m43417e();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(C18524h.b bVar, Continuation continuation) {
                boolean m97913d = bVar.m97913d();
                if (!m97913d) {
                    final ProfileAlbumListingAllView profileAlbumListingAllView = this.f46065p;
                    profileAlbumListingAllView.mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.album.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileAlbumListingAllView.C8503e.a.m45321f(ProfileAlbumListingAllView.this);
                        }
                    });
                } else if (m97913d) {
                    this.f46065p.f46055T0 = bVar.m97910a();
                    final ProfileAlbumListingAllView profileAlbumListingAllView2 = this.f46065p;
                    profileAlbumListingAllView2.mo70710wy(new Runnable() { // from class: com.zing.zalo.feed.mvp.album.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProfileAlbumListingAllView.C8503e.a.m45322g(ProfileAlbumListingAllView.this);
                        }
                    });
                }
                return C24848g0.f119245a;
            }
        }

        C8503e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C8503e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f46063t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C19087g m45311sM = ProfileAlbumListingAllView.this.m45311sM();
                C19087g.a aVar = new C19087g.a(ProfileAlbumListingAllView.this.m45312tM(), 1);
                this.f46063t = 1;
                obj = m45311sM.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(ProfileAlbumListingAllView.this);
                this.f46063t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C8503e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$f */
    /* loaded from: classes4.dex */
    static final class C8504f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8504f f46066q = new C8504f();

        C8504f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19086f mo12V4() {
            return new C19086f(null, 1, null);
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.album.ProfileAlbumListingAllView$g */
    /* loaded from: classes4.dex */
    static final class C8505g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C8505g f46067q = new C8505g();

        C8505g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19087g mo12V4() {
            return new C19087g(null, 1, null);
        }
    }

    public ProfileAlbumListingAllView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(C8504f.f46066q);
        this.f46053R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C8505g.f46067q);
        this.f46054S0 = m129210a2;
        this.f46055T0 = new C8676a();
        this.f46056U0 = "";
        this.f46057V0 = C32002l4.Companion.m154287a(10018);
    }

    /* renamed from: mM */
    private final boolean m45299mM() {
        if (AbstractC0924m0.m4195s9() && m45302vM()) {
            return true;
        }
        return false;
    }

    /* renamed from: nM */
    private final boolean m45300nM() {
        return m45302vM();
    }

    /* renamed from: uM */
    private final void m45301uM() {
        C30068u9 c30068u9 = this.f46052Q0;
        if (c30068u9 == null) {
            AbstractC19074t.m100223u("binding");
            c30068u9 = null;
        }
        AlbumListingView albumListingView = c30068u9.f139571q;
        albumListingView.setMode(1);
        Context context = albumListingView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        albumListingView.m43418f(context);
        albumListingView.setFeedProfileCallback(new C8502d());
        m45314xM();
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C8503e(null), 3, null);
    }

    /* renamed from: vM */
    private final boolean m45302vM() {
        return AbstractC19074t.m100204b(this.f46056U0, CoreUtility.f89233i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final void m45303yM() {
        mo70710wy(new Runnable() { // from class: co.q
            @Override // java.lang.Runnable
            public final void run() {
                ProfileAlbumListingAllView.m45304zM(ProfileAlbumListingAllView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m45304zM(ProfileAlbumListingAllView profileAlbumListingAllView) {
        String str;
        AbstractC19074t.m100208f(profileAlbumListingAllView, "this$0");
        if (profileAlbumListingAllView.f46055T0.m46335f()) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.album);
        } else {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.album) + " (" + profileAlbumListingAllView.f46055T0.m46341l() + ")";
        }
        AbstractC19074t.m100205c(str);
        ZdsActionBar m87077NK = profileAlbumListingAllView.m87077NK();
        if (m87077NK != null) {
            m87077NK.setMiddleTitle(str);
        }
    }

    /* renamed from: A4 */
    public final void m45305A4() {
        if (this.f46055T0.m46339j() > 0) {
            Bundle bundle = new Bundle();
            bundle.putString("extra_entry_point_flow", this.f46057V0.m154277l());
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(ProfileAlbumCreateView.class, bundle, 0, 1, true);
                return;
            }
            return;
        }
        AbstractC20783a.a aVar = AbstractC20783a.Companion;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        aVar.m108435d(m92689tK);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 == null) {
            return;
        }
        String string = m92642L3.getString("EXTRA_PARAM_USER_ID", "");
        AbstractC19074t.m100207e(string, "getString(...)");
        this.f46056U0 = string;
        this.f46057V0.m154273c(C32002l4.Companion.m154292f(m92642L3.getString("extra_entry_point_flow")));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        C30068u9 m148578c = C30068u9.m148578c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148578c, "inflate(...)");
        this.f46052Q0 = m148578c;
        m45301uM();
        m45308pM();
        C30068u9 c30068u9 = this.f46052Q0;
        if (c30068u9 == null) {
            AbstractC19074t.m100223u("binding");
            c30068u9 = null;
        }
        RelativeLayout root = c30068u9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("extra_bool_finished_compose_feed", this.f46051P0);
        C24848g0 c24848g0 = C24848g0.f119245a;
        mo50035CK(-1, intent);
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProfileAlbumListingAllView";
    }

    /* renamed from: lM */
    public final void m45306lM() {
        ArrayList arrayList = new ArrayList();
        C2974g.a.C32652a c32652a = C2974g.a.Companion;
        C30068u9 c30068u9 = null;
        C3054x c3054x = new C3054x(false, 1, 0 == true ? 1 : 0);
        c3054x.m14664V(1);
        c3054x.m14663U(true);
        c3054x.m14648F(C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
        c3054x.m14666X(AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error));
        c3054x.m14650H(AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail));
        c3054x.m14657O(AbstractC16803z.im_connect);
        c3054x.m14667Y(AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry));
        c3054x.m14665W(1);
        C24848g0 c24848g0 = C24848g0.f119245a;
        arrayList.add(c32652a.m14102c(c3054x));
        C30068u9 c30068u92 = this.f46052Q0;
        if (c30068u92 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30068u9 = c30068u92;
        }
        c30068u9.f139571q.m43416d(arrayList, 1);
    }

    /* renamed from: oM */
    public final C32002l4 m45307oM() {
        return this.f46057V0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000 && i12 == -1) {
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                boolean z11 = bundle.getBoolean("extra_bool_finished_compose_feed", false);
                this.f46051P0 = z11;
                if (z11) {
                    finish();
                }
            }
        }
    }

    /* renamed from: pM */
    public final void m45308pM() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C8500b(null), 3, null);
    }

    /* renamed from: qM */
    public final C19086f m45309qM() {
        return (C19086f) this.f46053R0.getValue();
    }

    /* renamed from: rM */
    public final void m45310rM() {
        if (this.f46055T0.m46334e()) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C8501c(null), 3, null);
        }
    }

    /* renamed from: sM */
    public final C19087g m45311sM() {
        return (C19087g) this.f46054S0.getValue();
    }

    /* renamed from: tM */
    public final String m45312tM() {
        return this.f46056U0;
    }

    /* renamed from: wM */
    public final void m45313wM(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        if (profilePreviewAlbumItem == null) {
            return;
        }
        m45315yG(this.f46056U0, profilePreviewAlbumItem, this.f46057V0);
    }

    /* renamed from: xM */
    public final void m45314xM() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f46055T0.m46342m());
        if (!this.f46055T0.m46334e()) {
            arrayList.addAll(this.f46055T0.m46338i());
        }
        ArrayList arrayList2 = new ArrayList();
        C30068u9 c30068u9 = null;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(new C2994k((ProfilePreviewAlbumItem) it.next(), m45300nM(), 2));
            }
            if (m45299mM()) {
                arrayList2.add(C2974g.a.Companion.m14101b(new C2979h(2)));
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C2974g.a.Companion.m14106g((C2994k) it2.next()));
            }
            C30068u9 c30068u92 = this.f46052Q0;
            if (c30068u92 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30068u9 = c30068u92;
            }
            c30068u9.f139571q.m43415c(arrayList2);
            return;
        }
        arrayList2.add(C2974g.a.Companion.m14111l(new C3009n(7)));
        C30068u9 c30068u93 = this.f46052Q0;
        if (c30068u93 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30068u9 = c30068u93;
        }
        c30068u9.f139571q.m43416d(arrayList2, 1);
    }

    /* renamed from: yG */
    public final void m45315yG(String str, ProfilePreviewAlbumItem profilePreviewAlbumItem, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_user_id", str);
                bundle.putInt("extra_album_type", profilePreviewAlbumItem.getType());
                bundle.putLong("extra_album_id", profilePreviewAlbumItem.getId());
                bundle.putString("extra_desc_total", profilePreviewAlbumItem.getDesc());
                bundle.putInt("extra_preload_bg_color", profilePreviewAlbumItem.getThemeInfo().getDecorItem().getBgColor());
                bundle.putInt("extra_preload_text_color", profilePreviewAlbumItem.getThemeInfo().getContent().getTitleColor());
                bundle.putInt("extra_preload_text_color_01", profilePreviewAlbumItem.getThemeInfo().getContent().getTextColor01());
                bundle.putInt("extra_preload_text_color_02", profilePreviewAlbumItem.getThemeInfo().getContent().getTextColor02());
                bundle.putInt("extra_preload_arrow_color", profilePreviewAlbumItem.getThemeInfo().getContent().getArrowColor());
                bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
                m92662fJ.m93066i2(ProfileAlbumDetailView.class, bundle, 1000, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
