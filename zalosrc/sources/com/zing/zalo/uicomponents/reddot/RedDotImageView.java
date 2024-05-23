package com.zing.zalo.uicomponents.reddot;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;
import rc0.C25729b;
import rc0.InterfaceC25728a;

/* loaded from: classes6.dex */
public class RedDotImageView extends RecyclingImageView implements InterfaceC25728a {

    /* renamed from: p */
    C25729b f82951p;

    public RedDotImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m87612i();
    }

    /* renamed from: i */
    private void m87612i() {
        this.f82951p = new C25729b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C25729b c25729b = this.f82951p;
        if (c25729b != null) {
            c25729b.m132815a(canvas, canvas.getWidth());
        }
    }

    @Override // rc0.InterfaceC25728a
    public void setEnableNoti(boolean z11) {
        this.f82951p.setEnableNoti(z11);
    }

    public void setLeftRedDot(boolean z11) {
        this.f82951p.m132817c(z11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRadiusNoti(int i11) {
        this.f82951p.setRadiusNoti(i11);
    }

    public void setRedDotColor(int i11) {
        this.f82951p.m132818d(i11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRedDotMargin(int i11) {
        this.f82951p.setRedDotMargin(i11);
    }

    public void setRedDotMarginLeft(int i11) {
        this.f82951p.m132819e(i11);
    }

    public void setRedDotMarginTop(int i11) {
        this.f82951p.m132820f(i11);
    }

    public void setRightRedDot(boolean z11) {
        this.f82951p.m132821g(z11);
    }

    public RedDotImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m87612i();
    }
}
