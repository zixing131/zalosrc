package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.BottomSheetLayoutNestedParent;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public abstract class BottomSheetZaloView extends BaseZaloView implements View.OnClickListener, BottomSheetLayout.InterfaceC13470b {

    /* renamed from: M0 */
    protected BottomSheetLayout f72454M0;

    /* renamed from: N0 */
    protected LinearLayout f72455N0;

    /* renamed from: O0 */
    protected ImageView f72456O0;

    /* renamed from: com.zing.zalo.ui.zviews.BottomSheetZaloView$a */
    /* loaded from: classes6.dex */
    class ViewTreeObserverOnPreDrawListenerC14114a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC14114a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            BottomSheetZaloView.this.mo37132gM();
            BottomSheetZaloView.this.f72454M0.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public final View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BottomSheetLayoutNestedParent bottomSheetLayoutNestedParent = new BottomSheetLayoutNestedParent(getContext());
        this.f72454M0 = bottomSheetLayoutNestedParent;
        layoutInflater.inflate(AbstractC7409c0.bottom_sheet_layout, (ViewGroup) bottomSheetLayoutNestedParent, true);
        this.f72454M0.setOnClickListener(this);
        this.f72454M0.setBottomSheetLayoutListener(this);
        this.f72454M0.setPadding(0, AbstractC23136l9.m118737p0(), 0, 0);
        this.f72455N0 = (LinearLayout) this.f72454M0.findViewById(AbstractC6918a0.bottom_sheet_container);
        this.f72456O0 = (ImageView) this.f72454M0.findViewById(AbstractC6918a0.icn_slide_hint);
        mo37129fM(this.f72455N0);
        return this.f72454M0;
    }

    /* renamed from: Lh */
    public void mo46528Lh(boolean z11) {
    }

    /* renamed from: P2 */
    public View mo37117P2() {
        return null;
    }

    /* renamed from: T2 */
    public void mo42955T2(float f11) {
    }

    /* renamed from: X0 */
    public boolean mo37120X0(float f11, boolean z11, float f12) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        BottomSheetLayout bottomSheetLayout;
        super.mo37122XJ(z11, z12);
        if (z11 && !z12 && (bottomSheetLayout = this.f72454M0) != null) {
            bottomSheetLayout.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC14114a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getHeight();
    }

    /* renamed from: e2 */
    public void mo72068e2(boolean z11, float f11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: eM */
    public int mo37128eM() {
        return this.f72455N0.getHeight();
    }

    /* renamed from: fM */
    protected abstract void mo37129fM(LinearLayout linearLayout);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: gM */
    public void mo37132gM() {
        this.f72454M0.setMaxTranslationY(mo37128eM());
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        bottomSheetLayout.setMinimized(bottomSheetLayout.m75553g());
    }

    /* renamed from: hM */
    public void mo37567hM() {
    }

    public void onClick(View view) {
    }

    /* renamed from: x3 */
    public void mo72543x3() {
    }

    /* renamed from: y3 */
    public void mo46557y3() {
    }
}
