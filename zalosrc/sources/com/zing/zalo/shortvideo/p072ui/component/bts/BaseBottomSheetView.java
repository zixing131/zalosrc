package com.zing.zalo.shortvideo.p072ui.component.bts;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.component.bts.BottomSheetLayout;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import gg0.AbstractC19444a;
import pm0.C24848g0;
import q10.C24983a;
import s20.AbstractC26102d;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public abstract class BaseBottomSheetView extends ZchBaseView implements ZaloView.InterfaceC17421f {
    public static final C9467a Companion = new C9467a(null);

    /* renamed from: B0 */
    private boolean f50363B0;

    /* renamed from: D0 */
    private boolean f50365D0;

    /* renamed from: E0 */
    private boolean f50366E0;

    /* renamed from: F0 */
    private boolean f50367F0;

    /* renamed from: G0 */
    private boolean f50368G0;

    /* renamed from: H0 */
    private float f50369H0;

    /* renamed from: I0 */
    private float f50370I0;

    /* renamed from: J0 */
    private boolean f50371J0;

    /* renamed from: K0 */
    private boolean f50372K0;

    /* renamed from: L0 */
    private C24983a f50373L0;

    /* renamed from: z0 */
    private boolean f50374z0;

    /* renamed from: A0 */
    private InterfaceC18494a f50362A0 = C9468b.f50375q;

    /* renamed from: C0 */
    private InterfaceC18494a f50364C0 = C9469c.f50376q;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BaseBottomSheetView$a */
    /* loaded from: classes5.dex */
    public static final class C9467a {
        private C9467a() {
        }

        public /* synthetic */ C9467a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BaseBottomSheetView$b */
    /* loaded from: classes5.dex */
    public static final class C9468b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9468b f50375q = new C9468b();

        C9468b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51763a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51763a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BaseBottomSheetView$c */
    /* loaded from: classes5.dex */
    public static final class C9469c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9469c f50376q = new C9469c();

        C9469c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51764a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51764a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BaseBottomSheetView$d */
    /* loaded from: classes5.dex */
    public static final class C9470d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9470d f50377q = new C9470d();

        C9470d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51765a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51765a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BaseBottomSheetView$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC9471e implements Runnable {
        RunnableC9471e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ZaloView zaloView;
            C17487o0 m92662fJ = BaseBottomSheetView.this.m92662fJ();
            if (m92662fJ != null) {
                zaloView = m92662fJ.m93012K0();
            } else {
                zaloView = null;
            }
            BaseBottomSheetView baseBottomSheetView = BaseBottomSheetView.this;
            if (zaloView == baseBottomSheetView) {
                baseBottomSheetView.m51748SK();
            } else {
                AbstractC19444a.m101695c(this);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BaseBottomSheetView$f */
    /* loaded from: classes5.dex */
    /* synthetic */ class C9472f extends C19071q implements InterfaceC18494a {
        C9472f(Object obj) {
            super(0, obj, BaseBottomSheetView.class, "onBottomSheetReady", "onBottomSheetReady()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51766h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m51766h() {
            ((BaseBottomSheetView) this.f94922q).m51751VK();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.bts.BaseBottomSheetView$g */
    /* loaded from: classes5.dex */
    /* synthetic */ class C9473g extends C19071q implements InterfaceC18494a {
        C9473g(Object obj) {
            super(0, obj, BaseBottomSheetView.class, "dismissNow", "dismissNow()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51767h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m51767h() {
            ((BaseBottomSheetView) this.f94922q).m51748SK();
        }
    }

    /* renamed from: hL */
    public static /* synthetic */ void m51747hL(BaseBottomSheetView baseBottomSheetView, C17487o0 c17487o0, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            baseBottomSheetView.m51762gL(c17487o0, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            this.f50365D0 = bundle.getBoolean("DISMISS_BY_BUTTON");
            this.f50366E0 = bundle.getBoolean("DISMISS_ON_STOP");
            this.f50367F0 = bundle.getBoolean("DISMISS_ON_RECREATE");
            this.f50374z0 = bundle.getBoolean("CONTENT_SWIPEABLE");
            this.f50368G0 = bundle.getBoolean("CONTENT_STATIC");
            this.f50369H0 = bundle.getFloat("DEFAULT_HEIGHT_SPEC");
            this.f50370I0 = bundle.getFloat("MAXIMUM_HEIGHT_SPEC");
            this.f50371J0 = bundle.getBoolean("IS_LANDSCAPE", false);
            this.f50372K0 = bundle.getBoolean("HIDE_CLOSE_BTN_AND_NAV_BAR", false);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public final View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C24983a m129748c = C24983a.m129748c(layoutInflater, viewGroup, false);
        if (bundle != null && this.f50367F0) {
            AbstractC19444a.m101697e(new RunnableC9471e());
            BottomSheetLayout root = m129748c.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            AbstractC26112n.m134367H(root);
        }
        this.f50373L0 = m129748c;
        BottomSheetLayout bottomSheetLayout = m129748c.f119706r;
        bottomSheetLayout.setDismissByButton$zshort_release(this.f50365D0);
        bottomSheetLayout.setContentSwipeable$zshort_release(this.f50374z0);
        bottomSheetLayout.setDefaultHeightSpec$zshort_release(this.f50369H0);
        bottomSheetLayout.setMaximumHeightSpec$zshort_release(this.f50370I0);
        bottomSheetLayout.setStaticContentView$zshort_release(this.f50368G0);
        bottomSheetLayout.setIsLandscape$zshort_release(this.f50371J0);
        if (this.f50372K0) {
            bottomSheetLayout.m51792s();
        }
        bottomSheetLayout.setReadyAction$zshort_release(new C9472f(this));
        bottomSheetLayout.setHiddenAction$zshort_release(new C9473g(this));
        FrameLayout frameLayout = m129748c.f119707s;
        AbstractC19074t.m100207e(frameLayout, "lytContainer");
        frameLayout.addView(mo51752WK(layoutInflater, frameLayout, bundle));
        BottomSheetLayout root2 = m129748c.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f50364C0.mo12V4();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        AbstractC26102d.m134326a(bundle, "DISMISS_BY_BUTTON", Boolean.valueOf(this.f50365D0));
        AbstractC26102d.m134326a(bundle, "DISMISS_ON_STOP", Boolean.valueOf(this.f50366E0));
        AbstractC26102d.m134326a(bundle, "DISMISS_ON_RECREATE", Boolean.valueOf(this.f50367F0));
        AbstractC26102d.m134326a(bundle, "CONTENT_SWIPEABLE", Boolean.valueOf(this.f50374z0));
        AbstractC26102d.m134326a(bundle, "CONTENT_STATIC", Boolean.valueOf(this.f50368G0));
        AbstractC26102d.m134326a(bundle, "DEFAULT_HEIGHT_SPEC", Float.valueOf(this.f50369H0));
        AbstractC26102d.m134326a(bundle, "MAXIMUM_HEIGHT_SPEC", Float.valueOf(this.f50370I0));
        AbstractC26102d.m134326a(bundle, "IS_LANDSCAPE", Boolean.valueOf(this.f50371J0));
        AbstractC26102d.m134326a(bundle, "HIDE_CLOSE_BTN_AND_NAV_BAR", Boolean.valueOf(this.f50372K0));
    }

    /* renamed from: SK */
    public final void m51748SK() {
        finish();
    }

    /* renamed from: TK */
    public boolean m51749TK(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        boolean z11 = this.f50363B0;
        if (!z11) {
            this.f50362A0 = interfaceC18494a;
        }
        return z11;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        final BottomSheetLayout bottomSheetLayout;
        super.mo37584UJ();
        C24983a c24983a = this.f50373L0;
        if (c24983a != null && (bottomSheetLayout = c24983a.f119706r) != null) {
            bottomSheetLayout.post(new Runnable() { // from class: v10.a
                @Override // java.lang.Runnable
                public final void run() {
                    BottomSheetLayout.this.m51793u();
                }
            });
        }
    }

    /* renamed from: UK */
    protected boolean m51750UK() {
        return false;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        if (this.f50366E0) {
            m51748SK();
        }
    }

    /* renamed from: VK */
    protected void m51751VK() {
        this.f50363B0 = true;
        this.f50362A0.mo12V4();
        this.f50362A0 = C9470d.f50377q;
    }

    /* renamed from: WK */
    public abstract View mo51752WK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    /* renamed from: XK */
    public final void m51753XK(boolean z11) {
        this.f50374z0 = z11;
    }

    /* renamed from: YK */
    public final void m51754YK(float f11) {
        this.f50369H0 = f11;
    }

    /* renamed from: ZK */
    public final void m51755ZK(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "action");
        this.f50364C0 = interfaceC18494a;
    }

    /* renamed from: aL */
    public final void m51756aL(boolean z11) {
        this.f50365D0 = z11;
    }

    /* renamed from: bL */
    public final void m51757bL(boolean z11) {
        this.f50367F0 = z11;
    }

    /* renamed from: cL */
    public final void m51758cL(boolean z11) {
        this.f50372K0 = z11;
    }

    /* renamed from: dL */
    public final void m51759dL(boolean z11) {
        this.f50371J0 = z11;
    }

    public final void dismiss() {
        BottomSheetLayout bottomSheetLayout;
        C24983a c24983a = this.f50373L0;
        if (c24983a != null && (bottomSheetLayout = c24983a.f119706r) != null) {
            bottomSheetLayout.m51791q();
        }
    }

    /* renamed from: eL */
    public final void m51760eL(float f11) {
        this.f50370I0 = f11;
    }

    /* renamed from: fL */
    public final void m51761fL(boolean z11) {
        this.f50368G0 = z11;
    }

    /* renamed from: gL */
    public final void m51762gL(C17487o0 c17487o0, String str) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        c17487o0.mo89693h2(this, str, 0, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        BottomSheetLayout bottomSheetLayout;
        if (i11 == 4 && !m51750UK() && this.f50363B0) {
            C24983a c24983a = this.f50373L0;
            if (c24983a != null && (bottomSheetLayout = c24983a.f119706r) != null) {
                bottomSheetLayout.m51791q();
                return true;
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
