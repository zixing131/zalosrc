package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hb0.AbstractC19959c;
import me0.AbstractC23136l9;
import p307kv.AbstractC21954k;
import p542ub.InterfaceC27218a;
import pm0.C24848g0;

/* loaded from: classes6.dex */
public abstract class MiniAppPopupView extends MiniAppBaseView implements ZaloView.InterfaceC17421f {

    /* renamed from: P0 */
    private final float f75115P0 = AbstractC23136l9.m118713h0();

    /* renamed from: Q0 */
    private boolean f75116Q0;

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppPopupView$a */
    /* loaded from: classes6.dex */
    public static final class C14601a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f75117q;

        /* renamed from: r */
        final /* synthetic */ MiniAppPopupView f75118r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14601a(InterfaceC18494a interfaceC18494a, MiniAppPopupView miniAppPopupView) {
            super(0);
            this.f75117q = interfaceC18494a;
            this.f75118r = miniAppPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m81735a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m81735a() {
            InterfaceC18494a interfaceC18494a = this.f75117q;
            if (interfaceC18494a != null) {
            }
            View mo81268nM = this.f75118r.mo81268nM();
            if (mo81268nM != null) {
                mo81268nM.setVisibility(8);
            }
            this.f75118r.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppPopupView$b */
    /* loaded from: classes6.dex */
    public static final class C14602b extends AbstractC19075u implements InterfaceC18505l {
        C14602b() {
            super(1);
        }

        /* renamed from: a */
        public final void m81736a(float f11) {
            View mo81268nM = MiniAppPopupView.this.mo81268nM();
            if (mo81268nM != null) {
                mo81268nM.setAlpha(1.0f - f11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m81736a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppPopupView$c */
    /* loaded from: classes6.dex */
    public static final class C14603c extends AbstractC19959c {

        /* renamed from: r */
        final /* synthetic */ MiniAppPopupView f75120r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14603c(View view, MiniAppPopupView miniAppPopupView) {
            super((DragToCloseLayout) view);
            this.f75120r = miniAppPopupView;
        }

        @Override // hb0.AbstractC19959c
        /* renamed from: c */
        public View mo81701c() {
            return this.f75120r.mo81268nM();
        }

        @Override // hb0.AbstractC19959c
        /* renamed from: f */
        public void mo81702f(boolean z11) {
            if (!z11) {
                this.f75120r.mo81733iM(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.MiniAppPopupView$d */
    /* loaded from: classes6.dex */
    public static final class C14604d extends AbstractC19075u implements InterfaceC18505l {
        C14604d() {
            super(1);
        }

        /* renamed from: a */
        public final void m81737a(float f11) {
            View mo81268nM = MiniAppPopupView.this.mo81268nM();
            if (mo81268nM != null) {
                mo81268nM.setAlpha(f11);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m81737a(((Number) obj).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: jM */
    public static /* synthetic */ void m81729jM(MiniAppPopupView miniAppPopupView, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            miniAppPopupView.mo81733iM(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelPopupView");
    }

    /* renamed from: mM */
    public static /* synthetic */ void m81730mM(MiniAppPopupView miniAppPopupView, boolean z11, boolean z12, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            if ((i11 & 2) != 0) {
                z12 = false;
            }
            if ((i11 & 4) != 0) {
                interfaceC18494a = null;
            }
            miniAppPopupView.m81734lM(z11, z12, interfaceC18494a);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismiss");
    }

    /* renamed from: pM */
    public static final void m81731pM(MiniAppPopupView miniAppPopupView, View view) {
        AbstractC19074t.m100208f(miniAppPopupView, "this$0");
        m81729jM(miniAppPopupView, false, 1, null);
    }

    /* renamed from: rM */
    private final void m81732rM() {
        View mo81269oM = mo81269oM();
        if (mo81269oM == null) {
            return;
        }
        AbstractC21954k.a.m114592C(AbstractC21954k.Companion, mo81269oM, -AbstractC23136l9.m118713h0(), 300L, null, new C14604d(), 8, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo81267kM = mo81267kM(layoutInflater, viewGroup, bundle);
        View mo81269oM = mo81269oM();
        if (mo81269oM != null) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                window = m92676n2.getWindow();
            } else {
                window = null;
            }
            if (window != null) {
                window.setStatusBarColor(AbstractC23136l9.m118639A(AbstractC16801x.transparent));
            }
            mo81269oM.setTranslationY(this.f75115P0);
        }
        View mo81268nM = mo81268nM();
        if (mo81268nM != null) {
            mo81268nM.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ux
                public /* synthetic */ ViewOnClickListenerC16244ux() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MiniAppPopupView.m81731pM(MiniAppPopupView.this, view);
                }
            });
        }
        return mo81267kM;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        mo81270qM(this.f75116Q0);
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (bundle != null) {
            m81729jM(this, false, 1, null);
            return;
        }
        View mo81269oM = mo81269oM();
        if (mo81269oM != null) {
            if (mo81269oM instanceof DragToCloseLayout) {
                ((DragToCloseLayout) mo81269oM).setOnDragToCloseListener(new C14603c(mo81269oM, this));
            }
            m81732rM();
        }
    }

    /* renamed from: iM */
    public void mo81733iM(boolean z11) {
        m81730mM(this, z11, false, null, 6, null);
    }

    /* renamed from: kM */
    public View mo81267kM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        return null;
    }

    /* renamed from: lM */
    public final void m81734lM(boolean z11, boolean z12, InterfaceC18494a interfaceC18494a) {
        this.f75116Q0 = z12;
        if (z11) {
            View mo81269oM = mo81269oM();
            if (mo81269oM != null) {
                AbstractC21954k.a.m114592C(AbstractC21954k.Companion, mo81269oM, AbstractC23136l9.m118713h0(), 0L, new C14601a(interfaceC18494a, this), new C14602b(), 4, null);
                return;
            }
            return;
        }
        if (interfaceC18494a != null) {
        }
        View mo81268nM = mo81268nM();
        if (mo81268nM != null) {
            mo81268nM.setVisibility(8);
        }
        finish();
    }

    /* renamed from: nM */
    public View mo81268nM() {
        return null;
    }

    /* renamed from: oM */
    public View mo81269oM() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (mo81269oM() != null && i11 == 4) {
            m81729jM(this, false, 1, null);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: qM */
    public void mo81270qM(boolean z11) {
    }
}
