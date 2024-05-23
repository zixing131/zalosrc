package com.zing.zalo.shortvideo.p072ui.component.popup;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hn0.AbstractC20104d;
import pm0.C24848g0;
import q10.C25030l2;
import s20.AbstractC26102d;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public abstract class BasePopupView extends ZchBaseView implements ZaloView.InterfaceC17421f {
    public static final C9533a Companion = new C9533a(null);

    /* renamed from: A0 */
    private boolean f50493A0;

    /* renamed from: B0 */
    private boolean f50494B0;

    /* renamed from: E0 */
    private boolean f50497E0;

    /* renamed from: z0 */
    private InterfaceC18494a f50498z0 = C9534b.f50499q;

    /* renamed from: C0 */
    private boolean f50495C0 = true;

    /* renamed from: D0 */
    private boolean f50496D0 = true;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.BasePopupView$a */
    /* loaded from: classes5.dex */
    public static final class C9533a {
        private C9533a() {
        }

        public /* synthetic */ C9533a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.BasePopupView$b */
    /* loaded from: classes5.dex */
    public static final class C9534b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9534b f50499q = new C9534b();

        C9534b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51982a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51982a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.BasePopupView$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC9535c implements Runnable {
        RunnableC9535c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ZaloView zaloView;
            C17487o0 m92662fJ = BasePopupView.this.m92662fJ();
            if (m92662fJ != null) {
                zaloView = m92662fJ.m93012K0();
            } else {
                zaloView = null;
            }
            BasePopupView basePopupView = BasePopupView.this;
            if (zaloView == basePopupView) {
                basePopupView.dismiss();
            } else {
                AbstractC19444a.m101695c(this);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.BasePopupView$d */
    /* loaded from: classes5.dex */
    static final class C9536d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ ViewGroup f50501q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9536d(ViewGroup viewGroup) {
            super(1);
            this.f50501q = viewGroup;
        }

        /* renamed from: a */
        public final void m51983a(ViewGroup.LayoutParams layoutParams) {
            FrameLayout.LayoutParams layoutParams2;
            ViewGroup viewGroup;
            int width;
            int m104529e;
            AbstractC19074t.m100208f(layoutParams, "it");
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 != null && (viewGroup = this.f50501q) != null && (width = viewGroup.getWidth()) > 0) {
                m104529e = AbstractC20104d.m104529e(width * 0.5f);
                layoutParams2.width = m104529e;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m51983a((ViewGroup.LayoutParams) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: VK */
    public static final void m51972VK(BasePopupView basePopupView, View view) {
        AbstractC19074t.m100208f(basePopupView, "this$0");
        if (basePopupView.f50496D0) {
            basePopupView.dismiss();
        }
    }

    /* renamed from: WK */
    public static final void m51973WK(View view) {
    }

    /* renamed from: dL */
    public static /* synthetic */ void m51974dL(BasePopupView basePopupView, C17487o0 c17487o0, String str, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            basePopupView.m51981cL(c17487o0, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            this.f50493A0 = bundle.getBoolean("DISMISS_ON_STOP");
            this.f50494B0 = bundle.getBoolean("DISMISS_ON_RECREATE");
            this.f50495C0 = bundle.getBoolean("DISMISS_ON_BACK_PRESSED");
            this.f50496D0 = bundle.getBoolean("DISMISS_ON_TOUCH_OUTSIDE");
            this.f50497E0 = bundle.getBoolean("IS_LANDSCAPE");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public final View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25030l2 m129879c = C25030l2.m129879c(layoutInflater, viewGroup, false);
        if (bundle != null && this.f50494B0) {
            AbstractC19444a.m101697e(new RunnableC9535c());
            FrameLayout root = m129879c.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            AbstractC26112n.m134367H(root);
        }
        m129879c.f120085r.setOnClickListener(new View.OnClickListener() { // from class: x10.a
            public /* synthetic */ ViewOnClickListenerC29286a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePopupView.m51972VK(BasePopupView.this, view);
            }
        });
        m129879c.f120084q.setOnClickListener(new View.OnClickListener() { // from class: x10.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BasePopupView.m51973WK(view);
            }
        });
        if (this.f50497E0) {
            FrameLayout frameLayout = m129879c.f120084q;
            AbstractC19074t.m100207e(frameLayout, "lytContainer");
            AbstractC26112n.m134394e(frameLayout, new C9536d(viewGroup));
        }
        FrameLayout frameLayout2 = m129879c.f120084q;
        AbstractC19074t.m100207e(frameLayout2, "lytContainer");
        frameLayout2.addView(mo51975UK(layoutInflater, frameLayout2, bundle));
        FrameLayout root2 = m129879c.getRoot();
        AbstractC19074t.m100207e(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f50498z0.mo12V4();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        AbstractC26102d.m134326a(bundle, "DISMISS_ON_STOP", Boolean.valueOf(this.f50493A0));
        AbstractC26102d.m134326a(bundle, "DISMISS_ON_RECREATE", Boolean.valueOf(this.f50494B0));
        AbstractC26102d.m134326a(bundle, "DISMISS_ON_BACK_PRESSED", Boolean.valueOf(this.f50495C0));
        AbstractC26102d.m134326a(bundle, "DISMISS_ON_TOUCH_OUTSIDE", Boolean.valueOf(this.f50496D0));
        AbstractC26102d.m134326a(bundle, "IS_LANDSCAPE", Boolean.valueOf(this.f50497E0));
    }

    /* renamed from: UK */
    public abstract View mo51975UK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        if (this.f50493A0) {
            dismiss();
        }
    }

    /* renamed from: XK */
    public final void m51976XK(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "<set-?>");
        this.f50498z0 = interfaceC18494a;
    }

    /* renamed from: YK */
    public final void m51977YK(boolean z11) {
        this.f50495C0 = z11;
    }

    /* renamed from: ZK */
    public final void m51978ZK(boolean z11) {
        this.f50494B0 = z11;
    }

    /* renamed from: aL */
    public final void m51979aL(boolean z11) {
        this.f50496D0 = z11;
    }

    /* renamed from: bL */
    public final void m51980bL(boolean z11) {
        this.f50497E0 = z11;
    }

    /* renamed from: cL */
    public final void m51981cL(C17487o0 c17487o0, String str) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        c17487o0.mo89693h2(this, str, 2, true);
    }

    public final void dismiss() {
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f50495C0) {
                dismiss();
                return true;
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
