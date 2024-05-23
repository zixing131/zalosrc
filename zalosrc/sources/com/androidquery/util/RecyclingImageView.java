package com.androidquery.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.ZAppCompatImageView;

/* loaded from: classes2.dex */
public class RecyclingImageView extends ZAppCompatImageView implements InterfaceC3968a {
    private static final String TAG = "RecyclingImageView";
    public boolean mDrawStroke;
    private C3979l mImageInfo;
    private boolean mIsCalledlDirectly;
    private final Paint mPaint;
    public boolean mStrokeCircle;
    private int mStrokeColor;
    private int mStrokeWidth;

    public RecyclingImageView(Context context) {
        this(context, null);
    }

    private int getPadding() {
        return (((getPaddingTop() + getPaddingBottom()) + getPaddingLeft()) + getPaddingRight()) / 4;
    }

    protected void finalize() throws Throwable {
        try {
            C3979l c3979l = this.mImageInfo;
            if (c3979l != null) {
                c3979l.mo18853q(false);
            }
            this.mImageInfo = null;
            this.mIsCalledlDirectly = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.finalize();
    }

    public C3979l getImageInfo() {
        return this.mImageInfo;
    }

    public int getStrokeColor() {
        return this.mStrokeColor;
    }

    public int getStrokeWidth() {
        return this.mStrokeWidth;
    }

    public boolean isDrawStroke() {
        return this.mDrawStroke;
    }

    public boolean isStrokeCircle() {
        return this.mStrokeCircle;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            if (this.mDrawStroke) {
                if (!this.mStrokeCircle) {
                    this.mPaint.setAntiAlias(true);
                    this.mPaint.setStyle(Paint.Style.STROKE);
                    this.mPaint.setColor(this.mStrokeColor);
                    this.mPaint.setStrokeWidth(this.mStrokeWidth);
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.mPaint);
                } else {
                    this.mPaint.setAntiAlias(true);
                    this.mPaint.setStyle(Paint.Style.STROKE);
                    this.mPaint.setColor(this.mStrokeColor);
                    this.mPaint.setStrokeWidth(this.mStrokeWidth);
                    float width = getWidth() / 2.0f;
                    canvas.drawCircle(width, width, width - getPadding(), this.mPaint);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setDrawStroke(boolean z11) {
        this.mDrawStroke = z11;
    }

    @Override // androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (!this.mIsCalledlDirectly) {
            C3979l c3979l = this.mImageInfo;
            if (c3979l != null) {
                c3979l.mo18853q(false);
            }
            this.mImageInfo = null;
        }
        this.mIsCalledlDirectly = false;
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setImageInfo(C3979l c3979l) {
        setImageInfo(c3979l, true);
    }

    @Override // androidx.appcompat.widget.ZAppCompatImageView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
        C3979l c3979l = this.mImageInfo;
        if (c3979l != null) {
            c3979l.mo18853q(false);
        }
        this.mImageInfo = null;
        this.mIsCalledlDirectly = false;
    }

    public void setStrokeCircle(boolean z11) {
        this.mStrokeCircle = z11;
    }

    public void setStrokeColor(int i11) {
        this.mStrokeColor = i11;
    }

    public void setStrokeWidth(int i11) {
        this.mStrokeWidth = i11;
    }

    public RecyclingImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setImageInfo(C3979l c3979l, boolean z11) {
        try {
            C3979l c3979l2 = this.mImageInfo;
            if (c3979l != null) {
                this.mImageInfo = c3979l;
                c3979l.mo18853q(true);
                this.mIsCalledlDirectly = true;
                if (z11) {
                    setImageBitmap(c3979l.m18839c());
                }
            } else {
                this.mImageInfo = null;
                setImageBitmap(null);
            }
            if (c3979l2 != null) {
                c3979l2.mo18853q(false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public RecyclingImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mDrawStroke = false;
        this.mStrokeCircle = false;
        this.mPaint = new Paint();
        this.mStrokeWidth = (int) ((context.getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        this.mStrokeColor = 402653184;
    }
}
