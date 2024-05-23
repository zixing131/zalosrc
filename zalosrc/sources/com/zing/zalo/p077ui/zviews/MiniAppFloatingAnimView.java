package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;
import p189gv.C19609h;
import p307kv.AbstractC21954k;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import p716zh.C31903ea;
import pm0.C24848g0;
import yf0.C30946k;
import yt.C31071a;

/* loaded from: classes6.dex */
public final class MiniAppFloatingAnimView extends BaseZaloView implements ZaloView.InterfaceC17421f {
    public static final C14596a Companion = new C14596a(null);

    /* renamed from: M0 */
    private RecyclingImageView f75093M0;

    /* renamed from: N0 */
    private C19609h f75094N0;

    /* renamed from: O0 */
    private int f75095O0;

    /* renamed from: P0 */
    private int f75096P0;

    /* renamed from: Q0 */
    private ViewGroup f75097Q0;

    /* renamed from: R0 */
    private boolean f75098R0 = true;

    /* renamed from: S0 */
    private float f75099S0;

    /* renamed from: T0 */
    private float f75100T0;

    /* renamed from: U0 */
    private float f75101U0;

    /* renamed from: V0 */
    private float f75102V0;

    /* renamed from: W0 */
    private float f75103W0;

    /* renamed from: X0 */
    private float f75104X0;

    /* renamed from: Y0 */
    private float f75105Y0;

    /* renamed from: Z0 */
    private float f75106Z0;

    /* renamed from: a1 */
    private boolean f75107a1;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppFloatingAnimView$a */
    /* loaded from: classes6.dex */
    public static final class C14596a {
        private C14596a() {
        }

        public /* synthetic */ C14596a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MiniAppFloatingAnimView$b */
    /* loaded from: classes6.dex */
    public static final class C14597b extends AbstractC19075u implements InterfaceC18494a {
        C14597b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81717a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81717a() {
            MiniAppFloatingAnimView.this.m81709jM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.MiniAppFloatingAnimView$c */
    /* loaded from: classes6.dex */
    public static final class C14598c extends AbstractC19075u implements InterfaceC18494a {
        C14598c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81718a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81718a() {
            MiniAppFloatingAnimView.this.m81710kM();
        }
    }

    /* renamed from: iM */
    private final InterfaceC18494a m81708iM() {
        int i11 = this.f75095O0;
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return new C14598c();
        }
        return new C14597b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public final void m81709jM() {
        C16786d.a aVar = C16786d.Companion;
        InterfaceC27218a m92676n2 = m92676n2();
        AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.ZaloLauncherActivity");
        aVar.m89646b((ZaloLauncherActivity) m92676n2).m89641h0();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public final void m81710kM() {
        C30946k m150528a = C30946k.Companion.m150528a();
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        m150528a.m150525w(context, this.f75096P0);
        AbstractC19444a.m101694b(new Runnable() { // from class: com.zing.zalo.ui.zviews.rx
            @Override // java.lang.Runnable
            public final void run() {
                MiniAppFloatingAnimView.m81711lM(MiniAppFloatingAnimView.this);
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m81711lM(MiniAppFloatingAnimView miniAppFloatingAnimView) {
        AbstractC19074t.m100208f(miniAppFloatingAnimView, "this$0");
        miniAppFloatingAnimView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m81712nM(MiniAppFloatingAnimView miniAppFloatingAnimView) {
        boolean z11;
        AbstractC19074t.m100208f(miniAppFloatingAnimView, "this$0");
        AbstractC21954k.a aVar = AbstractC21954k.Companion;
        RecyclingImageView recyclingImageView = miniAppFloatingAnimView.f75093M0;
        if (recyclingImageView == null) {
            AbstractC19074t.m100223u("imageView");
            recyclingImageView = null;
        }
        RecyclingImageView recyclingImageView2 = recyclingImageView;
        float f11 = miniAppFloatingAnimView.f75103W0;
        float f12 = miniAppFloatingAnimView.f75104X0;
        float f13 = miniAppFloatingAnimView.f75105Y0;
        float f14 = miniAppFloatingAnimView.f75106Z0;
        float f15 = miniAppFloatingAnimView.f75099S0;
        float f16 = miniAppFloatingAnimView.f75100T0;
        float f17 = miniAppFloatingAnimView.f75101U0;
        float f18 = miniAppFloatingAnimView.f75102V0;
        if (miniAppFloatingAnimView.f75095O0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.m114606E(recyclingImageView2, f11, f12, f13, f14, f15, f16, f17, f18, z11, miniAppFloatingAnimView.m81708iM());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static final void m81713oM(MiniAppFloatingAnimView miniAppFloatingAnimView) {
        AbstractC19074t.m100208f(miniAppFloatingAnimView, "this$0");
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).m89643k0(new Intent(miniAppFloatingAnimView.getContext(), (Class<?>) ZaloLauncherActivity.class));
    }

    /* renamed from: pM */
    private final void m81714pM() {
        RecyclingImageView recyclingImageView = this.f75093M0;
        RecyclingImageView recyclingImageView2 = null;
        if (recyclingImageView == null) {
            AbstractC19074t.m100223u("imageView");
            recyclingImageView = null;
        }
        ViewGroup.LayoutParams layoutParams = recyclingImageView.getLayoutParams();
        layoutParams.width = (int) this.f75103W0;
        layoutParams.height = (int) this.f75104X0;
        RecyclingImageView recyclingImageView3 = this.f75093M0;
        if (recyclingImageView3 == null) {
            AbstractC19074t.m100223u("imageView");
            recyclingImageView3 = null;
        }
        recyclingImageView3.setLayoutParams(layoutParams);
        RecyclingImageView recyclingImageView4 = this.f75093M0;
        if (recyclingImageView4 == null) {
            AbstractC19074t.m100223u("imageView");
            recyclingImageView4 = null;
        }
        recyclingImageView4.setX(this.f75099S0);
        RecyclingImageView recyclingImageView5 = this.f75093M0;
        if (recyclingImageView5 == null) {
            AbstractC19074t.m100223u("imageView");
        } else {
            recyclingImageView2 = recyclingImageView5;
        }
        recyclingImageView2.setY(this.f75100T0);
    }

    /* renamed from: qM */
    private final void m81715qM() {
        C19609h c19609h;
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47795P();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (c19609h = this.f75094N0) != null) {
            WebBaseView.C15353b.m86828t(WebBaseView.Companion, m92676n2, c19609h, null, null, 12, null);
        }
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int i11;
        Bundle m92642L3;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        Context context = getContext();
        AbstractC19074t.m100205c(context);
        this.f75097Q0 = new FrameLayout(context);
        Context context2 = getContext();
        AbstractC19074t.m100205c(context2);
        this.f75093M0 = new RecyclingImageView(context2);
        ViewGroup viewGroup2 = this.f75097Q0;
        if (viewGroup2 == null) {
            AbstractC19074t.m100223u("rootView");
            viewGroup2 = null;
        }
        int i12 = -1;
        viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclingImageView recyclingImageView = this.f75093M0;
        if (recyclingImageView == null) {
            AbstractC19074t.m100223u("imageView");
            recyclingImageView = null;
        }
        recyclingImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclingImageView recyclingImageView2 = this.f75093M0;
        if (recyclingImageView2 == null) {
            AbstractC19074t.m100223u("imageView");
            recyclingImageView2 = null;
        }
        recyclingImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            window = m92676n2.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setStatusBarColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            i11 = m92642L32.getInt("ANIM_FOR_VIEW", 0);
        } else {
            i11 = 0;
        }
        this.f75095O0 = i11;
        if (i11 == 2) {
            if (m92642L3() != null && (m92642L3 = m92642L3()) != null && m92642L3.containsKey("MINI_APP_INFO")) {
                AbstractC21954k.a aVar = AbstractC21954k.Companion;
                Bundle m92642L33 = m92642L3();
                AbstractC19074t.m100205c(m92642L33);
                this.f75094N0 = (C19609h) aVar.m114622q(m92642L33, "MINI_APP_INFO", C19609h.class);
            }
            C19609h c19609h = this.f75094N0;
            if (c19609h != null) {
                C30946k m150528a = C30946k.Companion.m150528a();
                Context context3 = getContext();
                AbstractC19074t.m100205c(context3);
                i12 = C30946k.m150511q(m150528a, context3, c19609h.m102616j(), false, false, 8, null);
            }
            this.f75096P0 = i12;
        }
        ViewGroup viewGroup3 = this.f75097Q0;
        if (viewGroup3 == null) {
            AbstractC19074t.m100223u("rootView");
            viewGroup3 = null;
        }
        RecyclingImageView recyclingImageView3 = this.f75093M0;
        if (recyclingImageView3 == null) {
            AbstractC19074t.m100223u("imageView");
            recyclingImageView3 = null;
        }
        viewGroup3.addView(recyclingImageView3);
        ViewGroup viewGroup4 = this.f75097Q0;
        if (viewGroup4 == null) {
            AbstractC19074t.m100223u("rootView");
            viewGroup4 = null;
        }
        viewGroup4.setBackgroundColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
        Bitmap m47810n = C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47810n();
        if (m47810n == null) {
            this.f75098R0 = false;
            RecyclingImageView recyclingImageView4 = this.f75093M0;
            if (recyclingImageView4 == null) {
                AbstractC19074t.m100223u("imageView");
                recyclingImageView4 = null;
            }
            recyclingImageView4.setBackgroundColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
        } else {
            C23528a m153338c = C31903ea.f146582a.m153338c();
            RecyclingImageView recyclingImageView5 = this.f75093M0;
            if (recyclingImageView5 == null) {
                AbstractC19074t.m100223u("imageView");
                recyclingImageView5 = null;
            }
            ((C23528a) m153338c.m123612r(recyclingImageView5)).m123614t(m47810n);
        }
        m81716mM();
        ViewGroup viewGroup5 = this.f75097Q0;
        if (viewGroup5 == null) {
            AbstractC19074t.m100223u("rootView");
            return null;
        }
        return viewGroup5;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        ZaloView zaloView;
        Window window;
        super.mo39024IJ();
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            zaloView = m92662fJ.m93012K0();
        } else {
            zaloView = null;
        }
        if (!(zaloView instanceof MPWebView)) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                window = m92676n2.getWindow();
            } else {
                window = null;
            }
            if (window != null) {
                window.setStatusBarColor(AbstractC23136l9.m118639A(AbstractC17452c.statusBarColor));
            }
        }
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47801V(false);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (this.f75096P0 == -1) {
            this.f75107a1 = true;
            m81715qM();
            return;
        }
        int i11 = this.f75095O0;
        if (i11 == 2 && !this.f75098R0) {
            this.f75107a1 = true;
            m81715qM();
            return;
        }
        RecyclingImageView recyclingImageView = null;
        if (i11 == 1) {
            RecyclingImageView recyclingImageView2 = this.f75093M0;
            if (recyclingImageView2 == null) {
                AbstractC19074t.m100223u("imageView");
            } else {
                recyclingImageView = recyclingImageView2;
            }
            recyclingImageView.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.qx
                @Override // java.lang.Runnable
                public final void run() {
                    MiniAppFloatingAnimView.m81713oM(MiniAppFloatingAnimView.this);
                }
            }, 300L);
            return;
        }
        C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47795P();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93018M0() > 1) {
            super.finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null) {
            m92662fJ2.m93069k2(MainTabView.class, bundle, 0, true);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    /* renamed from: mM */
    public final void m81716mM() {
        int i11;
        C16786d m89644c = C16786d.a.m89644c(C16786d.Companion, null, 1, null);
        C31071a m47791L = m89644c.m47791L();
        int i12 = 0;
        if (m47791L != null) {
            i11 = AbstractC23136l9.m118742r(m47791L.m150987n());
        } else {
            i11 = 0;
        }
        C31071a m47791L2 = m89644c.m47791L();
        if (m47791L2 != null) {
            i12 = AbstractC23136l9.m118742r(m47791L2.m150985l());
        }
        float m47815v = m89644c.m47815v() + (i11 / 2);
        float m47816w = m89644c.m47816w() + (i12 / 2);
        int i13 = this.f75095O0;
        if (i13 != 1) {
            if (i13 != 2) {
                finish();
                return;
            }
            this.f75103W0 = 0.0f;
            this.f75104X0 = 0.0f;
            this.f75105Y0 = m89644c.m47788I();
            this.f75106Z0 = m89644c.m47787G();
            this.f75099S0 = m47815v;
            this.f75100T0 = m47816w;
            this.f75101U0 = 0.0f;
            this.f75102V0 = 0.0f;
            m81714pM();
            return;
        }
        this.f75103W0 = m89644c.m47788I();
        this.f75104X0 = m89644c.m47787G();
        this.f75105Y0 = 0.0f;
        this.f75106Z0 = 0.0f;
        this.f75099S0 = 0.0f;
        this.f75100T0 = 0.0f;
        this.f75101U0 = m47815v;
        this.f75102V0 = m47816w;
        m81714pM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public synchronized void onResume() {
        long j11;
        super.onResume();
        if (this.f75107a1) {
            return;
        }
        this.f75107a1 = true;
        int i11 = this.f75095O0;
        if (i11 == 1 && !this.f75098R0) {
            m81709jM();
            return;
        }
        RecyclingImageView recyclingImageView = null;
        if (i11 == 2 && !C16786d.a.m89644c(C16786d.Companion, null, 1, null).m47792M()) {
            m81710kM();
            return;
        }
        RecyclingImageView recyclingImageView2 = this.f75093M0;
        if (recyclingImageView2 == null) {
            AbstractC19074t.m100223u("imageView");
        } else {
            recyclingImageView = recyclingImageView2;
        }
        Runnable runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.px
            @Override // java.lang.Runnable
            public final void run() {
                MiniAppFloatingAnimView.m81712nM(MiniAppFloatingAnimView.this);
            }
        };
        if (this.f75095O0 == 2) {
            j11 = 300;
        } else {
            j11 = 200;
        }
        recyclingImageView.postDelayed(runnable, j11);
    }
}
