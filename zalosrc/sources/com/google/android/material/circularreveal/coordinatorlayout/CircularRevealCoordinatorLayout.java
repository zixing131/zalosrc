package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C6286b;
import com.google.android.material.circularreveal.InterfaceC6287c;

/* loaded from: classes3.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements InterfaceC6287c {

    /* renamed from: O */
    private final C6286b f35239O;

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35239O = new C6286b(this);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    /* renamed from: a */
    public void mo32220a() {
        this.f35239O.m32232a();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    /* renamed from: b */
    public void mo32221b() {
        this.f35239O.m32233b();
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
        C6286b c6286b = this.f35239O;
        if (c6286b != null) {
            c6286b.m32234c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f35239O.m32235e();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public int getCircularRevealScrimColor() {
        return this.f35239O.m32236f();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public InterfaceC6287c.e getRevealInfo() {
        return this.f35239O.m32237h();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        C6286b c6286b = this.f35239O;
        if (c6286b != null) {
            return c6286b.m32238j();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f35239O.m32239k(drawable);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public void setCircularRevealScrimColor(int i11) {
        this.f35239O.m32240l(i11);
    }

    @Override // com.google.android.material.circularreveal.InterfaceC6287c
    public void setRevealInfo(InterfaceC6287c.e eVar) {
        this.f35239O.m32241m(eVar);
    }
}
