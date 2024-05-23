package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0809c1;
import am.AbstractC0939u;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import as.InterfaceC2333h;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult;
import com.zing.zalo.feed.mvp.feed.domain.usecase.C8550b;
import com.zing.zalo.feed.reactions.bottomsheet.FeedReactionBottomSheet;
import com.zing.zalo.feed.reactions.dialog.C8848a;
import com.zing.zalo.feed.uicontrols.ViewOnClickListenerC8887r;
import com.zing.zalo.p077ui.zviews.FeedMinimizableVideoPlayerView;
import com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView;
import com.zing.zalo.social.controls.FeedLikeStatus;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalo.zplayer.C17395R;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalo.zview.widget.InsetsLayout;
import hm0.C20096c;
import ho0.AbstractC20110a;
import is.AbstractC20805l;
import is.C20815q;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p039bp.C3068b;
import p167fs.C19136a;
import p167fs.C19140e;
import p175g0.AbstractC19182e;
import p205hc.C19964c;
import p361nb.AbstractC23647d;
import p361nb.C23669z;
import p363nh.C23744a;
import p398oo.C24371m0;
import p420pb.C24709a;
import p542ub.InterfaceC27218a;
import p583vq.C28570b;
import p690yq.C31050b;
import p716zh.C31987k4;
import p716zh.C32002l4;
import tr.C26878b;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class FeedMinimizableVideoPlayerView extends MinimizableVideoPlayerView implements InterfaceC0733x, View.OnLongClickListener {

    /* renamed from: Z1 */
    ItemAlbumMobile f73353Z1;

    /* renamed from: b2 */
    private C32002l4 f73355b2;

    /* renamed from: e2 */
    int f73358e2;

    /* renamed from: h2 */
    public ViewOnClickListenerC8887r f73361h2;

    /* renamed from: i2 */
    private C3068b f73362i2;

    /* renamed from: X1 */
    String f73351X1 = "";

    /* renamed from: Y1 */
    boolean f73352Y1 = false;

    /* renamed from: a2 */
    ArrayList f73354a2 = new ArrayList();

    /* renamed from: c2 */
    boolean f73356c2 = false;

    /* renamed from: d2 */
    boolean f73357d2 = false;

    /* renamed from: f2 */
    int f73359f2 = -1;

    /* renamed from: g2 */
    public C20815q f73360g2 = new C20815q();

    /* renamed from: j2 */
    Handler f73363j2 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.zing.zalo.ui.zviews.me
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m79672CN;
            m79672CN = FeedMinimizableVideoPlayerView.this.m79672CN(message);
            return m79672CN;
        }
    });

    /* renamed from: k2 */
    ViewOnClickListenerC8887r.a f73364k2 = new C14276a();

    /* renamed from: l2 */
    View.OnLayoutChangeListener f73365l2 = new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.zviews.oe
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            FeedMinimizableVideoPlayerView.this.m79673DN(view, i11, i12, i13, i14, i15, i16, i17, i18);
        }
    };

    /* renamed from: m2 */
    boolean f73366m2 = false;

    /* renamed from: n2 */
    C20815q.e f73367n2 = new C14278c();

    /* renamed from: o2 */
    C20815q.f f73368o2 = new C14279d();

    /* renamed from: com.zing.zalo.ui.zviews.FeedMinimizableVideoPlayerView$a */
    /* loaded from: classes6.dex */
    class C14276a implements ViewOnClickListenerC8887r.a {
        C14276a() {
        }

        @Override // com.zing.zalo.feed.uicontrols.ViewOnClickListenerC8887r.a
        /* renamed from: a */
        public boolean mo47428a(ItemAlbumMobile itemAlbumMobile) {
            if (itemAlbumMobile != null && FeedMinimizableVideoPlayerView.this.f73360g2.m108708r(itemAlbumMobile.f42595r)) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.feed.uicontrols.ViewOnClickListenerC8887r.a
        /* renamed from: b */
        public InterfaceC27218a mo47429b() {
            return FeedMinimizableVideoPlayerView.this.f72421L0.m92676n2();
        }

        @Override // com.zing.zalo.feed.uicontrols.ViewOnClickListenerC8887r.a
        /* renamed from: c */
        public void mo47430c(View view, int i11) {
            if (i11 == AbstractC6918a0.btn_comment) {
                if (FeedMinimizableVideoPlayerView.this.f73353Z1 != null) {
                    if (C28570b.m142996a().m142998b(1)) {
                        FeedMinimizableVideoPlayerView.this.m79682ON();
                    } else {
                        FeedMinimizableVideoPlayerView.this.m79680MN();
                    }
                }
                AbstractC23647d.m123897g("136104");
                return;
            }
            if (i11 == AbstractC6918a0.btn_like) {
                C19136a.f95164a.m100437b(view);
                FeedMinimizableVideoPlayerView.this.m79696pN();
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.ViewOnClickListenerC8887r.a
        /* renamed from: d */
        public void mo47431d() {
            FeedMinimizableVideoPlayerView.this.m79710QN();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedMinimizableVideoPlayerView$b */
    /* loaded from: classes6.dex */
    class C14277b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f73370a;

        C14277b(C23669z c23669z) {
            this.f73370a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(FeedMinimizableVideoPlayerView.this.m78956lL()).m128305K(this.f73370a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.FeedMinimizableVideoPlayerView$c */
    /* loaded from: classes6.dex */
    class C14278c implements C20815q.e {
        C14278c() {
        }

        @Override // is.C20815q.e
        /* renamed from: a */
        public ArrayList mo79722a() {
            return FeedMinimizableVideoPlayerView.this.f73354a2;
        }

        @Override // is.C20815q.e
        /* renamed from: b */
        public void mo79723b() {
            FeedMinimizableVideoPlayerView.this.f73363j2.removeMessages(1000);
            FeedMinimizableVideoPlayerView.this.f73363j2.sendEmptyMessage(1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.FeedMinimizableVideoPlayerView$d */
    /* loaded from: classes6.dex */
    public class C14279d implements C20815q.f {
        C14279d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m79726e() {
            FeedMinimizableVideoPlayerView.this.f72421L0.invalidateOptionsMenu();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m79727f(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    if (c20096c.m104491c() == 50001 && FeedMinimizableVideoPlayerView.this.m92672lJ()) {
                        ToastUtils.showMess(FeedMinimizableVideoPlayerView.this.m92652XI(AbstractC8020f0.image_view_get_info_error_network));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            FeedMinimizableVideoPlayerView feedMinimizableVideoPlayerView = FeedMinimizableVideoPlayerView.this;
            feedMinimizableVideoPlayerView.f73361h2.m47423m(feedMinimizableVideoPlayerView.m92689tK());
            FeedMinimizableVideoPlayerView.this.f73361h2.f47537w.setVisibility(8);
            FeedMinimizableVideoPlayerView.this.m79711SN();
            FeedMinimizableVideoPlayerView.this.f72421L0.invalidateOptionsMenu();
        }

        @Override // is.C20815q.f
        /* renamed from: a */
        public void mo46249a(ItemAlbumMobile itemAlbumMobile) {
            if (!FeedMinimizableVideoPlayerView.this.m92677nJ() && !FeedMinimizableVideoPlayerView.this.m92681pJ()) {
                FeedMinimizableVideoPlayerView.this.f73363j2.sendEmptyMessage(1000);
                FeedMinimizableVideoPlayerView.this.f73363j2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.xe
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedMinimizableVideoPlayerView.C14279d.this.m79726e();
                    }
                });
            }
        }

        @Override // is.C20815q.f
        /* renamed from: b */
        public void mo46250b(final C20096c c20096c) {
            FeedMinimizableVideoPlayerView.this.f73363j2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ye
                @Override // java.lang.Runnable
                public final void run() {
                    FeedMinimizableVideoPlayerView.C14279d.this.m79727f(c20096c);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public /* synthetic */ void m79670AN(C19964c c19964c) {
        C3068b.a aVar = (C3068b.a) c19964c.m103749a();
        if (aVar instanceof C3068b.b) {
            m79698sN((C3068b.b) aVar);
            return;
        }
        if (aVar instanceof C3068b.d) {
            C3068b.d dVar = (C3068b.d) aVar;
            m79683RN(dVar.m14787c(), dVar.m14788d(), dVar.m14786b(), dVar.m14785a(), new InterfaceC2333h() { // from class: com.zing.zalo.ui.zviews.we
                @Override // as.InterfaceC2333h
                /* renamed from: b */
                public final void mo12288b(int i11) {
                    FeedMinimizableVideoPlayerView.this.m79707KN(i11);
                }
            });
        } else {
            if (aVar instanceof C3068b.e) {
                C3068b.e eVar = (C3068b.e) aVar;
                if (m92672lJ()) {
                    ToastUtils.showMess(eVar.m14789a());
                    return;
                }
                return;
            }
            if (aVar instanceof C3068b.f) {
                mo78936E(C19140e.m100450e(m92689tK()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public /* synthetic */ void m79671BN(final C19964c c19964c) {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ue
            @Override // java.lang.Runnable
            public final void run() {
                FeedMinimizableVideoPlayerView.this.m79670AN(c19964c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public /* synthetic */ boolean m79672CN(Message message) {
        int i11 = message.what;
        if (i11 != 1000) {
            if (i11 == 1001) {
                m79711SN();
                return false;
            }
            return false;
        }
        m79713TN();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public /* synthetic */ void m79673DN(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            if (i11 != i15 || i12 != i16 || i13 != i17 || i14 != i18) {
                this.f73363j2.sendEmptyMessage(1001);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EN */
    public /* synthetic */ void m79674EN(InterfaceC17463d interfaceC17463d) {
        m79678IN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FN */
    public /* synthetic */ void m79675FN(InterfaceC17463d interfaceC17463d) {
        m79677HN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GN */
    public /* synthetic */ void m79676GN(InterfaceC17463d interfaceC17463d) {
        m79677HN();
    }

    /* renamed from: HN */
    private void m79677HN() {
        ZVideoView zVideoView = this.f75274O0;
        if (zVideoView != null) {
            zVideoView.setAllowAdaptiveShowControls(true);
            this.f75274O0.m92418l0(true);
        }
    }

    /* renamed from: IN */
    private void m79678IN() {
        ZVideoView zVideoView = this.f75274O0;
        if (zVideoView != null) {
            zVideoView.m92418l0(true);
            this.f75274O0.setAllowAdaptiveShowControls(false);
        }
    }

    /* renamed from: LN */
    private void m79679LN(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && itemAlbumMobile.f42594q0 != null) {
            new C31050b().m101508a(new C31050b.a(itemAlbumMobile.f42594q0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public void m79680MN() {
        try {
            this.f72421L0.m92676n2().setRequestedOrientation(1);
            Bundle bundle = new Bundle();
            bundle.putString("picid", this.f73353Z1.f42595r);
            bundle.putString("userId", this.f73353Z1.f42593q);
            C32002l4 c32002l4 = this.f73355b2;
            if (c32002l4 != null) {
                bundle.putString("extra_entry_point_flow", c32002l4.m154277l());
            }
            if (!TextUtils.isEmpty(this.f73351X1)) {
                bundle.putString("extra_feed_id", this.f73351X1);
            }
            this.f73360g2.m108710v(this.f73353Z1);
            this.f72421L0.m92676n2().mo35579p().m93066i2(ImageCommentView.class, bundle, 11, 1, true);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: NN */
    private void m79681NN() {
        if (this.f73353Z1 != null && this.f75276P0 != null) {
            Bundle bundle = new Bundle();
            BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull = new BottomSheetMenuBundleDataPhotoViewfull();
            bottomSheetMenuBundleDataPhotoViewfull.m45519H(this.f73353Z1);
            bottomSheetMenuBundleDataPhotoViewfull.m45528S(this.f75276P0.m92537b());
            bottomSheetMenuBundleDataPhotoViewfull.m45524N(this.f73358e2);
            BottomSheetMenuBundleData bottomSheetMenuBundleData = new BottomSheetMenuBundleData();
            bottomSheetMenuBundleData.m45511l(7);
            bottomSheetMenuBundleData.m45508i(bottomSheetMenuBundleDataPhotoViewfull);
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 6);
            bundle.putParcelable("EXTRA_BUNDLE_DATA", bottomSheetMenuBundleData);
            this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 14, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public void m79682ON() {
        int i11;
        try {
            this.f73357d2 = true;
            this.f72421L0.m92676n2().setRequestedOrientation(1);
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 2);
            bundle.putString("EXTRA_PHOTO_ID", this.f73353Z1.f42595r);
            bundle.putString("EXTRA_OWNER_ID", this.f73353Z1.f42593q);
            bundle.putParcelable("EXTRA_PHOTO_ITEM", new ItemAlbumMobile(this.f73353Z1));
            bundle.putInt("extra_action_request", 24);
            C32002l4 c32002l4 = this.f73355b2;
            if (c32002l4 != null) {
                bundle.putString("EXTRA_ENTRY_POINT_FLOW", c32002l4.m154277l());
            }
            if (!TextUtils.isEmpty(this.f73351X1)) {
                bundle.putString("EXTRA_FEED_ID", this.f73351X1);
                C3000l0 mo127471c = C24371m0.m127468p().mo127471c(this.f73351X1);
                if (mo127471c != null) {
                    C26878b.m138449b().m138453e(mo127471c, mo127471c.m14322a0());
                    i11 = mo127471c.f11896q0;
                    bundle.putInt("fromTimelineTab", i11);
                    this.f73360g2.m108710v(this.f73353Z1);
                    this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 13, 1, true);
                }
            }
            i11 = -1;
            bundle.putInt("fromTimelineTab", i11);
            this.f73360g2.m108710v(this.f73353Z1);
            this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 13, 1, true);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: RN */
    private void m79683RN(int i11, int i12, int i13, List list, InterfaceC2333h interfaceC2333h) {
        C8848a.b.a aVar;
        if (m79701xN()) {
            aVar = C8848a.b.a.f47280q;
        } else {
            aVar = C8848a.b.a.f47279p;
        }
        m92639EK(1, new C8848a.a(new C8848a.b(i11, i12, i13, aVar), new C8848a.c(list, AbstractC23136l9.m118663M(AbstractC16803z.feed_reaction_bar_background_on_color)), interfaceC2333h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public void m79696pN() {
        ItemAlbumMobile itemAlbumMobile = this.f73353Z1;
        if (itemAlbumMobile != null) {
            this.f73362i2.m14779X(itemAlbumMobile, m79697qN());
            AbstractC23647d.m123897g("136103");
        }
    }

    /* renamed from: qN */
    private C32002l4 m79697qN() {
        int i11;
        C32002l4 m154275e = this.f73355b2.m154275e();
        if (this.f73359f2 == 1) {
            C31987k4 m154279o = m154275e.m154279o(10002);
            if (m154279o != null) {
                i11 = m154279o.m154205e();
            } else {
                i11 = 0;
            }
            m154275e.m154283t(10002, new C31987k4(10031, i11));
        }
        return m154275e;
    }

    /* renamed from: sN */
    private void m79698sN(C3068b.b bVar) {
        ItemAlbumMobile itemAlbumMobile;
        if (this.f73360g2 != null && (itemAlbumMobile = this.f73353Z1) != null && itemAlbumMobile.f42595r.equals(bVar.m14782a())) {
            this.f73360g2.m108709u(this.f73353Z1.f42595r, bVar.m14783b(), bVar.m14784c());
            C19140e.f95172a.m100457i(this.f73353Z1, bVar.m14783b());
            ViewOnClickListenerC8887r viewOnClickListenerC8887r = this.f73361h2;
            if (viewOnClickListenerC8887r != null) {
                viewOnClickListenerC8887r.m47420e(this.f73353Z1, m92689tK());
                this.f73361h2.m47427v(m92689tK(), this.f73353Z1);
            }
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ne
                @Override // java.lang.Runnable
                public final void run() {
                    FeedMinimizableVideoPlayerView.this.m79711SN();
                }
            });
            if (this.f73353Z1.f42594q0 != null) {
                C23744a.m124114c().m124116d(6101, this.f73353Z1.f42594q0.f12057p);
            }
        }
    }

    /* renamed from: tN */
    private void m79699tN() {
        this.f73362i2 = (C3068b) new C1802w0(this, new C3068b.c(this, null)).m9378a(C3068b.class);
    }

    /* renamed from: uN */
    private void m79700uN() {
        this.f73362i2.m14778T().m9219j(this, new InterfaceC1764d0() { // from class: com.zing.zalo.ui.zviews.pe
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                FeedMinimizableVideoPlayerView.this.m79671BN((C19964c) obj);
            }
        });
    }

    /* renamed from: xN */
    private boolean m79701xN() {
        if (AbstractC23136l9.m118687Y(m92689tK()) == 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public /* synthetic */ void m79702yN() {
        this.f73366m2 = true;
        m79708PN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public /* synthetic */ void m79703zN(boolean z11) {
        if (z11) {
            new C8550b().m101508a(new C8550b.a(this.f73351X1, false));
            this.f75297c1.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.ve
                @Override // java.lang.Runnable
                public final void run() {
                    FeedMinimizableVideoPlayerView.this.m79702yN();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: AM */
    protected int mo79704AM() {
        return 13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: DM */
    public void mo79705DM() {
        super.mo79705DM();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f73351X1 = m92642L3.getString("EXTRA_STRING_FEED_ID");
            this.f73352Y1 = m92642L3.getBoolean("EXTRA_BOOL_IS_LOCAL_FEED");
            this.f73356c2 = m92642L3.getBoolean("EXTRA_BOOL_HIDE_FEED_CONTROL_LAYOUT", false);
            this.f73354a2.clear();
            if (m92642L3.containsKey("EXTRA_STRING_ITEM_ALBUM_MOBILE")) {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) m92642L3.getParcelable("EXTRA_STRING_ITEM_ALBUM_MOBILE");
                this.f73353Z1 = itemAlbumMobile;
                if (itemAlbumMobile != null) {
                    this.f73360g2.m108710v(itemAlbumMobile);
                    this.f73354a2.add(this.f73353Z1);
                }
            }
            if (m92642L3.containsKey("extra_entry_point_flow")) {
                this.f73355b2 = C32002l4.m154269m(m92642L3.getString("extra_entry_point_flow")).m154271a(4);
            } else {
                this.f73355b2 = C32002l4.m154264g(4);
            }
            this.f73360g2.m108707q(this, this.f73367n2);
            this.f73360g2.f102305g = true;
            this.f75300f1 = false;
            this.f73358e2 = m92642L3.getInt("EXTRA_SOURCE_OPEN_FROM", 0);
            this.f73359f2 = m92642L3.getInt("fromTimelineTab", -1);
        }
        m79699tN();
        m79700uN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        if (i11 == 1 && objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof C8848a.a) {
                C8848a c8848a = new C8848a(m92692wK(), (C8848a.a) obj);
                c8848a.mo88280H(new InterfaceC17463d.g() { // from class: com.zing.zalo.ui.zviews.re
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
                    /* renamed from: a */
                    public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                        FeedMinimizableVideoPlayerView.this.m79674EN(interfaceC17463d);
                    }
                });
                c8848a.m92855F(new InterfaceC17463d.e() { // from class: com.zing.zalo.ui.zviews.se
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                    /* renamed from: Tv */
                    public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                        FeedMinimizableVideoPlayerView.this.m79675FN(interfaceC17463d);
                    }
                });
                c8848a.m92854E(new InterfaceC17463d.c() { // from class: com.zing.zalo.ui.zviews.te
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        FeedMinimizableVideoPlayerView.this.m79676GN(interfaceC17463d);
                    }
                });
                return c8848a;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        try {
            if (m92687sJ() && !m92677nJ() && !this.f75261D1 && this.f75317w1 != 1 && this.f75276P0 != null) {
                actionBarMenu.m92750r();
                this.f75277P1 = actionBarMenu.m92738e(AbstractC6918a0.video_player_action_bar_menu_more, AbstractC19182e.abc_ic_menu_overflow_material);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75260C1 = layoutInflater.inflate(AbstractC7409c0.feed_minimizable_video_player_view, viewGroup, false);
        m81900FM();
        m92637BK(true);
        this.f75258A1 = false;
        m81898EM();
        return this.f75260C1;
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f73361h2.m47421h();
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        ZVideoView zVideoView = this.f75274O0;
        if (zVideoView != null) {
            zVideoView.m92429s0();
            this.f75274O0.removeOnLayoutChangeListener(this.f73365l2);
        }
    }

    /* renamed from: JN */
    public void m79706JN(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        ItemAlbumMobile itemAlbumMobile = this.f73353Z1;
        if (itemAlbumMobile != null) {
            this.f73362i2.m14780Y(itemAlbumMobile, iArr[0], iArr[1], view.getHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: KN */
    public void m79707KN(int i11) {
        ItemAlbumMobile itemAlbumMobile = this.f73353Z1;
        if (itemAlbumMobile != null) {
            this.f73362i2.m14781Z(itemAlbumMobile, i11, m79697qN());
        }
    }

    /* renamed from: PN */
    void m79708PN() {
        mo81907bN();
        this.f72421L0.m92676n2().setRequestedOrientation(1);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_STRING_FEED_ID", this.f73351X1);
        if (this.f73366m2) {
            bundle.putBoolean("EXTRA_BOOL_FEED_DELETED", true);
        }
        if (this.f73357d2) {
            bundle.putBoolean("EXTRA_SHOULD_REFRESH_TIMELINE", true);
        }
        if (this.f73353Z1 != null) {
            bundle.putParcelable("EXTRA_RESULT_ITEM_ALBUM_MOBILE", new ItemAlbumMobile(this.f73353Z1));
        }
        intent.putExtras(bundle);
        FeedLikeStatus feedLikeStatus = (FeedLikeStatus) this.f73360g2.f102304f.get(this.f73351X1);
        if (feedLikeStatus != null) {
            intent.putExtra("extra_feed_like_status", feedLikeStatus);
        }
        this.f72421L0.mo50035CK(-1, intent);
        m81910wM(this.f75283S1);
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            m79708PN();
            AbstractC23647d.m123897g("136110");
            return true;
        }
        if (i11 == AbstractC6918a0.video_player_menu_video_download) {
            m81909vM(1);
            AbstractC23647d.m123897g("136107");
            return true;
        }
        if (i11 == AbstractC6918a0.video_player_menu_video_send_to_friend) {
            m81909vM(4);
            return true;
        }
        if (i11 == AbstractC6918a0.video_player_menu_video_post_feed) {
            m81909vM(2);
            return true;
        }
        if (i11 == AbstractC6918a0.video_player_menu_video_post_story) {
            m81909vM(3);
            return true;
        }
        if (i11 == AbstractC6918a0.video_player_menu_video_report) {
            this.f73360g2.m108713y(this.f73353Z1, null);
            AbstractC23647d.m123897g("136108");
            return true;
        }
        if (i11 == AbstractC6918a0.video_player_menu_video_delete) {
            m79718oN();
            AbstractC23647d.m123897g("136109");
        } else if (i11 == AbstractC6918a0.video_player_action_bar_menu_more && !this.f75261D1) {
            m79681NN();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: QM */
    void mo79709QM() {
        this.f75283S1 = true;
        m79708PN();
    }

    /* renamed from: QN */
    void m79710QN() {
        String str;
        C17487o0 mo35579p;
        if (this.f73353Z1 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_PHOTO_ID", this.f73353Z1.f42595r);
            bundle.putInt("EXTRA_MODE", 1);
            bundle.putInt("EXTRA_STORY_TRACKING_SRC_VIEW", 355);
            C32002l4 c32002l4 = this.f73355b2;
            String str2 = "";
            if (c32002l4 == null) {
                str = "";
            } else {
                str = c32002l4.m154277l();
            }
            bundle.putString("EXTRA_ENTRY_POINT_CHAIN", str);
            C3020p0 c3020p0 = this.f73353Z1.f42594q0;
            if (c3020p0 != null) {
                str2 = c3020p0.m14465A();
            }
            bundle.putString("EXTRA_FEED_OWNER_ID", str2);
            if (m92676n2() != null && (mo35579p = m92676n2().mo35579p()) != null) {
                mo35579p.m93066i2(FeedReactionBottomSheet.class, bundle, 12, 0, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: SN */
    public void m79711SN() {
        int i11;
        int i12;
        try {
            if (this.f75274O0.getWidth() > 0 && this.f75274O0.getHeight() > 0) {
                int[] iArr = new int[2];
                this.f75274O0.getLocationOnScreen(iArr);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f75274O0.getLayoutParams();
                int[] iArr2 = new int[2];
                View m92656bJ = m92656bJ();
                m92656bJ.getLocationOnScreen(iArr2);
                if (this.f73361h2.f47537w.getVisibility() != 8) {
                    i11 = this.f73361h2.f47537w.getHeight();
                } else {
                    i11 = 0;
                }
                int height = (iArr[1] + this.f75274O0.getHeight()) - marginLayoutParams.bottomMargin;
                int height2 = (iArr2[1] + m92656bJ.getHeight()) - i11;
                if (height > height2) {
                    i12 = height - height2;
                } else {
                    i12 = 0;
                }
                if (this.f75274O0.getVideoController().getBottomControlLayout() != null) {
                    this.f75274O0.getVideoController().getBottomControlLayout().setPadding(0, 0, 0, i12);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: TM */
    void mo79712TM() {
        ActionBar m92646QI;
        if (m92648SI() != null && m92674mJ() && !this.f75261D1 && (m92646QI = this.f72421L0.m92646QI()) != null) {
            m92646QI.setBackgroundDrawable(new ColorDrawable(m92651WI().getColor(AbstractC16801x.transparent)));
            m92646QI.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            m92646QI.setTitle("");
            AbstractC32226c.m155413l(this, m92646QI);
        }
    }

    /* renamed from: TN */
    void m79713TN() {
        try {
            this.f73361h2.m47419d(m78956lL(), this.f73353Z1);
            this.f73361h2.m47420e(this.f73353Z1, m92689tK());
            this.f73361h2.m47427v(m92689tK(), this.f73353Z1);
            if (m79721wN()) {
                this.f73361h2.f47537w.setVisibility(0);
            } else {
                this.f73361h2.f47537w.setVisibility(8);
            }
            m79711SN();
            m79679LN(this.f73353Z1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        if (this.f73353Z1 != null) {
            m79713TN();
            this.f73360g2.m108704d(this.f73353Z1, this.f73368o2, this.f73355b2);
        }
        if (this.f72421L0.m92676n2() != null && (this.f72421L0.m92676n2().mo35585v() instanceof InsetsLayout)) {
            ((InsetsLayout) this.f72421L0.m92676n2().mo35585v()).setAllowApplyInsets(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: XC */
    public void mo79714XC(long j11) {
        AbstractC23647d.m123897g("136105");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            if (!z12 || m92683qJ()) {
                m79711SN();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: YM */
    protected void mo79715YM(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        ViewOnClickListenerC8887r viewOnClickListenerC8887r = new ViewOnClickListenerC8887r((LinearLayout) view.findViewById(AbstractC6918a0.layoutImageFunction), this.f73364k2);
        this.f73361h2 = viewOnClickListenerC8887r;
        View view2 = viewOnClickListenerC8887r.f47530p;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
        this.f73361h2.m47424n(false);
        this.f73361h2.m47425o();
        this.f73361h2.f47537w.setBackgroundColor(0);
        this.f73361h2.f47532r.setOnLongClickListener(this);
        ZVideoView zVideoView = this.f75274O0;
        if (zVideoView != null) {
            zVideoView.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(4));
            this.f75274O0.getVideoController().setEnableFullScreen(false);
            this.f75274O0.addOnLayoutChangeListener(this.f73365l2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView
    /* renamed from: aN */
    public void mo79716aN(boolean z11, boolean z12, boolean z13) {
        MinimizableVideoPlayerView.C14646l c14646l;
        MinimizableVideoPlayerView.C14646l c14646l2;
        super.mo79716aN(z11, z12, z13);
        if (m92687sJ() && m79721wN()) {
            if (z11) {
                if (this.f73361h2.f47537w.getVisibility() != 0) {
                    this.f73361h2.f47537w.setVisibility(0);
                    if (z13 && (c14646l2 = this.f75289V1) != null && c14646l2.f75347g) {
                        this.f73361h2.f47537w.startAnimation(c14646l2.f75345e);
                    }
                }
            } else if (this.f73361h2.f47537w.getVisibility() == 0) {
                this.f73361h2.f47537w.setVisibility(4);
                if (z13 && (c14646l = this.f75289V1) != null && c14646l.f75347g) {
                    this.f73361h2.f47537w.startAnimation(c14646l.f75346f);
                }
            }
            m79711SN();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "FeedMinimizableVideoPlayerView";
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.zmedia.view.InterfaceC17372n
    /* renamed from: k3 */
    public boolean mo79717k3(View view) {
        if (view.getId() == C17395R.id.video_btn_play) {
            if (this.f75274O0.isPlaying()) {
                AbstractC23647d.m123897g("136102");
            } else {
                AbstractC23647d.m123897g("136101");
            }
        }
        return super.mo79717k3(view);
    }

    /* renamed from: oN */
    void m79718oN() {
        ItemAlbumMobile itemAlbumMobile = this.f73353Z1;
        if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42595r)) {
            this.f73360g2.m108712x(this.f73353Z1, new C20815q.d() { // from class: com.zing.zalo.ui.zviews.qe
                @Override // is.C20815q.d
                /* renamed from: a */
                public final void mo87389a(boolean z11) {
                    FeedMinimizableVideoPlayerView.this.m79703zN(z11);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 != 11 && i11 != 13) {
                if (i11 == 10) {
                    this.f73360g2.m108706p(i12, intent);
                } else if (i11 == 14 && i12 == -1) {
                    m79719rN(intent);
                }
            } else if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    AbstractC20805l.m108549g(this.f73353Z1, (ItemAlbumMobile) extras.getParcelable("EXTRA_RESULT_ITEM_ALBUM_MOBILE"));
                    this.f73360g2.m108714z(this.f73353Z1);
                    m79713TN();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f73361h2.m47426t(configuration);
        removeDialog(1);
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            C23669z m92432u0 = this.f75274O0.m92432u0(1);
            if (m92432u0 != null) {
                C0809c1.m2050b(new C14277b(m92432u0));
            }
            m79708PN();
            AbstractC23647d.m123897g("136110");
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_like) {
            m79706JN(view);
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m81904WM(13);
    }

    /* renamed from: rN */
    void m79719rN(Intent intent) {
        BottomSheetMenuResult bottomSheetMenuResult;
        if (intent != null) {
            try {
                if (intent.hasExtra("EXTRA_BUNDLE_DATA_RESULT") && (bottomSheetMenuResult = (BottomSheetMenuResult) intent.getParcelableExtra("EXTRA_BUNDLE_DATA_RESULT")) != null && bottomSheetMenuResult.m45566b() != null && bottomSheetMenuResult.m45569e() == 7 && bottomSheetMenuResult.m45571g() != 0) {
                    if (this.f73353Z1 == null) {
                        return;
                    }
                    switch (bottomSheetMenuResult.m45571g()) {
                        case 28:
                            m81909vM(1);
                            AbstractC23647d.m123897g("136107");
                            break;
                        case 29:
                            this.f73360g2.m108713y(this.f73353Z1, null);
                            AbstractC23647d.m123897g("136108");
                            break;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                            m79718oN();
                            AbstractC23647d.m123897g("136109");
                            break;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vN */
    boolean m79720vN() {
        ItemAlbumMobile itemAlbumMobile;
        if (!this.f73352Y1 && !TextUtils.isEmpty(this.f73351X1) && (itemAlbumMobile = this.f73353Z1) != null && !TextUtils.isEmpty(itemAlbumMobile.f42595r) && !this.f73356c2) {
            return true;
        }
        return false;
    }

    /* renamed from: wN */
    boolean m79721wN() {
        boolean z11;
        boolean z12;
        if (!m79720vN()) {
            return false;
        }
        if (this.f73361h2.f47535u.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f73361h2.f47532r.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 && !z12) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.MinimizableVideoPlayerView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f75299e1 = null;
    }
}
