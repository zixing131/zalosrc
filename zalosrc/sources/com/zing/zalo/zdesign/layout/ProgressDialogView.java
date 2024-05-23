package com.zing.zalo.zdesign.layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2814h;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ProgressDialogView extends DialogView {
    public static final C17080a Companion = new C17080a(null);

    /* renamed from: H0 */
    private RobotoTextView f87420H0;

    /* renamed from: I0 */
    private CharSequence f87421I0;

    /* renamed from: J0 */
    private View f87422J0;

    /* renamed from: com.zing.zalo.zdesign.layout.ProgressDialogView$a */
    /* loaded from: classes7.dex */
    public static final class C17080a {
        private C17080a() {
        }

        public /* synthetic */ C17080a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public ProgressDialogView() {
        m92601SK(0, AbstractC2814h.alertdialog);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC2812f.progress_dialog, viewGroup, false);
        this.f87422J0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: TK */
    public void mo83093TK(C17487o0 c17487o0) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        super.m92602UK(c17487o0, "ProgressDialogView");
    }

    /* renamed from: WK */
    public final void m91380WK(CharSequence charSequence) {
        this.f87421I0 = charSequence;
        if (this.f87420H0 != null) {
            if (charSequence == null || charSequence.length() == 0) {
                RobotoTextView robotoTextView = this.f87420H0;
                AbstractC19074t.m100205c(robotoTextView);
                robotoTextView.setVisibility(8);
            }
            RobotoTextView robotoTextView2 = this.f87420H0;
            AbstractC19074t.m100205c(robotoTextView2);
            robotoTextView2.setText(this.f87421I0);
            RobotoTextView robotoTextView3 = this.f87420H0;
            AbstractC19074t.m100205c(robotoTextView3);
            robotoTextView3.setVisibility(0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        RobotoTextView robotoTextView;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        View view2 = this.f87422J0;
        if (view2 != null) {
            robotoTextView = (RobotoTextView) view2.findViewById(AbstractC2811e.title_loading_zview);
        } else {
            robotoTextView = null;
        }
        this.f87420H0 = robotoTextView;
        CharSequence charSequence = this.f87421I0;
        if (charSequence != null && charSequence.length() != 0) {
            RobotoTextView robotoTextView2 = this.f87420H0;
            if (robotoTextView2 != null) {
                robotoTextView2.setText(this.f87421I0);
            }
            RobotoTextView robotoTextView3 = this.f87420H0;
            if (robotoTextView3 != null) {
                robotoTextView3.setVisibility(0);
            }
        } else {
            RobotoTextView robotoTextView4 = this.f87420H0;
            if (robotoTextView4 != null) {
                robotoTextView4.setVisibility(8);
            }
        }
        KeyEventCallbackC17462c m92594JK = m92594JK();
        if (m92594JK != null) {
            m92594JK.m92874z(false);
        }
    }
}
