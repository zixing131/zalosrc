package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;

/* loaded from: classes6.dex */
public final class SlideShowSound extends View implements InterfaceC13612d2 {

    /* renamed from: p */
    private C13573c2 f69617p;

    public SlideShowSound(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69617p = new C13573c2(this);
    }

    /* renamed from: a */
    public void m75887a(int i11, int i12) {
        this.f69617p.m76034k(i11, i12);
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13612d2
    /* renamed from: d */
    public boolean mo75888d() {
        return AbstractC20826v0.m108836t0(this);
    }

    public final C13573c2 getSlideShowSoundController() {
        return this.f69617p;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        this.f69617p.m76029f(canvas);
    }

    public void setAnimWidth(int i11) {
        this.f69617p.m76030g(i11);
    }

    public void setAnimX(int i11) {
        this.f69617p.m76031h(i11);
    }

    public void setShadowPaintColor(int i11) {
        this.f69617p.m76032i(i11);
    }

    public final void setSlideShowSoundController(C13573c2 c13573c2) {
        AbstractC19074t.m100208f(c13573c2, "<set-?>");
        this.f69617p = c13573c2;
    }

    public void setState(int i11) {
        this.f69617p.m76035l(i11);
    }
}
