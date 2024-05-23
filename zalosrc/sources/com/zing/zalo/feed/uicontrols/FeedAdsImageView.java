package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8923h0;

/* loaded from: classes4.dex */
public class FeedAdsImageView extends RecyclingImageView {

    /* renamed from: p */
    private float f47307p;

    /* renamed from: q */
    private int f47308q;

    /* renamed from: r */
    private int f47309r;

    /* renamed from: s */
    private Drawable f47310s;

    /* renamed from: t */
    private boolean f47311t;

    public FeedAdsImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47307p = 1.92f;
        this.f47311t = false;
        m47294i(context, attributeSet);
    }

    /* renamed from: i */
    private void m47294i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.FeedAdsImageView, 0, 0);
        try {
            Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC8923h0.FeedAdsImageView_play_icon);
            this.f47310s = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f47310s.getIntrinsicHeight());
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f47310s != null && this.f47311t) {
            int width = (getWidth() - this.f47310s.getIntrinsicWidth()) / 2;
            int height = (getHeight() - this.f47310s.getIntrinsicHeight()) / 2;
            canvas.save();
            canvas.translate(width, height);
            this.f47310s.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        try {
            if (getDrawable() != null && this.f47307p > 0.0f) {
                int size = View.MeasureSpec.getSize(i11);
                this.f47308q = size;
                int i13 = (int) (size / this.f47307p);
                this.f47309r = i13;
                setMeasuredDimension(size, i13);
            } else {
                super.onMeasure(i11, i12);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            super.onMeasure(i11, i12);
        }
    }

    public void setDrawPlayIcon(boolean z11) {
        this.f47311t = z11;
    }

    public void setRatio(float f11) {
        this.f47307p = f11;
    }
}
