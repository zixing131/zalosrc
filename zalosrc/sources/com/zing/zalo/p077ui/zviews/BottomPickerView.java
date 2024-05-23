package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import me0.AbstractC23136l9;
import p354n3.C23528a;

/* loaded from: classes6.dex */
public abstract class BottomPickerView extends ContentPickerPopupView implements TouchInterceptionFrameLayout.InterfaceC13549b, View.OnClickListener {

    /* renamed from: O0 */
    C23528a f72447O0;

    /* renamed from: P0 */
    int f72448P0;

    /* renamed from: Q0 */
    volatile boolean f72449Q0 = false;

    /* renamed from: R0 */
    boolean f72450R0 = false;

    /* renamed from: S0 */
    boolean f72451S0 = false;

    /* renamed from: T0 */
    protected InterfaceC14112a f72452T0;

    /* renamed from: com.zing.zalo.ui.zviews.BottomPickerView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14112a {
    }

    /* renamed from: kL */
    public static Bundle m78535kL() {
        Bundle bundle = new Bundle();
        bundle.putInt("gravity", 80);
        bundle.putInt("window_animation_type", 1);
        return bundle;
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72447O0 = new C23528a(this.f88762c0.getContext());
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Jz */
    public void mo71217Jz(View view, MotionEvent motionEvent, float f11, float f12, boolean z11) {
        try {
            if (!this.f72451S0) {
                return;
            }
            this.f72450R0 = true;
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            this.f83660J0.setTranslationY(f12);
            if (this.f83658H0 && this.f83660J0.getHeight() > 0) {
                m88274gL((1.0f - (f12 / this.f83660J0.getHeight())) * 0.6f);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: Kj */
    public void mo71219Kj(View view, MotionEvent motionEvent) {
        try {
            this.f72449Q0 = false;
            this.f72451S0 = !AbstractC23136l9.m118664M0(mo78264lL(), motionEvent, view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: TH */
    public void mo71235TH(View view, MotionEvent motionEvent, boolean z11) {
        try {
            this.f72449Q0 = true;
            if (this.f72451S0 && this.f72450R0 && this.f83660J0.getTranslationY() > 0.0f) {
                dismiss();
            }
            this.f72451S0 = false;
            this.f72450R0 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo42832mL(), viewGroup, false);
        if (inflate instanceof TouchInterceptionFrameLayout) {
            ((TouchInterceptionFrameLayout) inflate).setScrollInterceptionListener(this);
        }
        return inflate;
    }

    /* renamed from: lL */
    protected View mo78264lL() {
        return null;
    }

    @Override // com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout.InterfaceC13549b
    /* renamed from: m6 */
    public boolean mo71274m6(View view, MotionEvent motionEvent, boolean z11, float f11, float f12, boolean z12) {
        try {
            if (!this.f72450R0 && z11 && Math.abs(f12) < this.f72448P0) {
                return false;
            }
            boolean m118664M0 = AbstractC23136l9.m118664M0(mo78264lL(), motionEvent, view);
            if (!z11 && m118664M0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: mL */
    protected abstract int mo42832mL();

    public void onClick(View view) {
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            this.f72448P0 = ViewConfiguration.get(this.f88762c0.m92648SI()).getScaledTouchSlop();
        } catch (Exception unused) {
            dismiss();
        }
    }
}
