package com.zing.zalo.p077ui.widget.imageview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import rc0.C25729b;
import rc0.InterfaceC25728a;

/* loaded from: classes6.dex */
public class RedDotRoundedImageView extends RoundedImageView implements InterfaceC25728a {

    /* renamed from: F */
    C25729b f70442F;

    public RedDotRoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76284l();
    }

    /* renamed from: l */
    private void m76284l() {
        this.f70442F = new C25729b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.imageview.RoundedImageView, com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C25729b c25729b = this.f70442F;
        if (c25729b != null) {
            c25729b.m132815a(canvas, canvas.getWidth());
        }
    }

    @Override // rc0.InterfaceC25728a
    public void setEnableNoti(boolean z11) {
        this.f70442F.setEnableNoti(z11);
    }

    public void setLeftRedDot(boolean z11) {
        this.f70442F.m132817c(z11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRadiusNoti(int i11) {
        this.f70442F.setRadiusNoti(i11);
    }

    public void setRedDotColor(int i11) {
        this.f70442F.m132818d(i11);
    }

    @Override // rc0.InterfaceC25728a
    public void setRedDotMargin(int i11) {
        this.f70442F.setRedDotMargin(i11);
    }

    public void setRedDotMarginLeft(int i11) {
        this.f70442F.m132819e(i11);
    }

    public void setRedDotMarginTop(int i11) {
        this.f70442F.m132820f(i11);
    }

    public void setRightRedDot(boolean z11) {
        this.f70442F.m132821g(z11);
    }
}
