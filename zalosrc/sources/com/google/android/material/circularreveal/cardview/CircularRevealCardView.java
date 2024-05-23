package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.C6286b;
import com.google.android.material.circularreveal.InterfaceC6287c;

/* loaded from: classes3.dex */
public class CircularRevealCardView extends MaterialCardView implements InterfaceC6287c {

    /* renamed from: G */
    private final C6286b f35238G;

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35238G = new C6286b(this);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    /* renamed from: a */
    public void mo32220a() {
        this.f35238G.m32232a();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    /* renamed from: b */
    public void mo32221b() {
        this.f35238G.m32233b();
    }

    @Override // com.google.android.material.circularreveal.C6286b.a
    /* renamed from: c */
    public void mo32222c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.C6286b.a
    /* renamed from: d */
    public boolean mo32223d() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        C6286b c6286b = this.f35238G;
        if (c6286b != null) {
            c6286b.m32234c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f35238G.m32235e();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public int getCircularRevealScrimColor() {
        return this.f35238G.m32236f();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public InterfaceC6287c.e getRevealInfo() {
        return this.f35238G.m32237h();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C6286b c6286b = this.f35238G;
        if (c6286b != null) {
            return c6286b.m32238j();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f35238G.m32239k(drawable);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public void setCircularRevealScrimColor(int i11) {
        this.f35238G.m32240l(i11);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public void setRevealInfo(InterfaceC6287c.e eVar) {
        this.f35238G.m32241m(eVar);
    }
}
