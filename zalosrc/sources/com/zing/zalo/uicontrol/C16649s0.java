package com.zing.zalo.uicontrol;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import vg.AbstractC28236y3;

/* renamed from: com.zing.zalo.uicontrol.s0 */
/* loaded from: classes4.dex */
public class C16649s0 extends Drawable {

    /* renamed from: a */
    private final Drawable f83935a;

    /* renamed from: b */
    private final ImageView.ScaleType f83936b;

    /* renamed from: c */
    private final Rect f83937c = new Rect();

    /* renamed from: d */
    private final Rect f83938d = new Rect(0, 0, 0, 0);

    public C16649s0(Drawable drawable, ImageView.ScaleType scaleType) {
        this.f83935a = drawable;
        this.f83936b = scaleType;
        if (drawable != null) {
            setBounds(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
        }
    }

    /* renamed from: a */
    private void m88426a(Canvas canvas) {
        AbstractC28236y3.m142190a(canvas.getWidth(), canvas.getHeight(), this.f83935a.getIntrinsicWidth(), this.f83935a.getIntrinsicHeight(), this.f83938d, this.f83937c, this.f83936b);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f83935a;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            m88426a(canvas);
            this.f83935a.setBounds(this.f83937c);
            this.f83935a.draw(canvas);
            this.f83935a.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f83935a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f83935a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f83935a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }
}
