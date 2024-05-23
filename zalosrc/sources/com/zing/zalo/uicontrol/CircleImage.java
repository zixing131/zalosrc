package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes4.dex */
public class CircleImage extends RecyclingImageView {

    /* renamed from: p */
    private boolean f83154p;

    /* renamed from: q */
    private LayerDrawable f83155q;

    /* renamed from: r */
    private ShapeDrawable f83156r;

    /* renamed from: s */
    private int f83157s;

    /* renamed from: t */
    private int f83158t;

    /* renamed from: u */
    public int f83159u;

    public CircleImage(Context context) {
        super(context);
        this.f83154p = true;
        this.f83157s = -1;
        this.f83158t = 48;
        m87722i();
    }

    /* renamed from: i */
    private void m87722i() {
        this.f83159u = (int) (getResources().getDisplayMetrics().density * 2.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.f83156r = shapeDrawable;
        shapeDrawable.setShape(new OvalShape());
        ShapeDrawable shapeDrawable2 = this.f83156r;
        int i11 = this.f83159u;
        shapeDrawable2.setPadding(i11, i11, i11, i11);
        this.f83156r.getPaint().setColor(this.f83157s);
        this.f83156r.getPaint().setAlpha(this.f83158t);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f83156r});
        this.f83155q = layerDrawable;
        setBackground(layerDrawable);
    }

    /* renamed from: j */
    public void m87723j(int i11, int i12) {
        this.f83157s = i11;
        this.f83158t = i12;
        this.f83156r.getPaint().setColor(i11);
        this.f83156r.getPaint().setAlpha(i12);
        setBackground(this.f83155q);
        invalidate();
    }

    /* renamed from: k */
    public void m87724k(int i11, int i12, int i13) {
        this.f83159u = i13;
        this.f83157s = i11;
        this.f83158t = i12;
        this.f83156r.getPaint().setColor(i11);
        this.f83156r.getPaint().setAlpha(i12);
        ShapeDrawable shapeDrawable = this.f83156r;
        int i14 = this.f83159u;
        shapeDrawable.setPadding(i14, i14, i14, i14);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f83156r});
        this.f83155q = layerDrawable;
        setBackground(layerDrawable);
        requestLayout();
        invalidate();
    }

    public void setEnableRoundPadding(boolean z11) {
        this.f83154p = z11;
        if (!z11) {
            this.f83156r.getPaint().setColor(Color.parseColor("#fffafafa"));
            this.f83156r.getPaint().setAlpha(128);
        } else {
            this.f83156r.getPaint().setColor(this.f83157s);
            this.f83156r.getPaint().setAlpha(this.f83158t);
        }
        setBackground(this.f83155q);
        invalidate();
    }

    public void setStrokePadding(int i11) {
        this.f83159u = i11;
        this.f83156r.setPadding(i11, i11, i11, i11);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f83156r});
        this.f83155q = layerDrawable;
        setBackground(layerDrawable);
        requestLayout();
        invalidate();
    }

    public CircleImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83154p = true;
        this.f83157s = -1;
        this.f83158t = 48;
        m87722i();
    }
}
