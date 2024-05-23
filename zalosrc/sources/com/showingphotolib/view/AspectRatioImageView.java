package com.showingphotolib.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes3.dex */
public class AspectRatioImageView extends RecyclingImageView {
    public static final int ASPECT_OPT = 2;
    public static final int FIX_OPT = 3;
    public static final int FIX_OPT_NO_LIMIT = 6;
    public static final int FULL_OPT = 0;
    public static final int FULL_OPT_BY_HEIGHT = 5;
    public static final int KEEP_OPT = 4;
    public static final float MAX_RATIO = 1.2f;
    public static final float MIN_RATIO = 0.25f;
    public static final int SQUARE_OPT = 1;
    private boolean animating;
    private ImageView.ScaleType customScaleType;
    private boolean isDimImageOnTouch;
    private int mHeight;
    private int mMaxHeight;
    private int mMinHeight;
    private int mMinWidth;
    private float mRatio;
    private int mWidth;
    private int scaleOption;

    public AspectRatioImageView(Context context) {
        super(context);
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRatio = -1.0f;
        this.mMaxHeight = 0;
        this.mMinHeight = 1;
        this.isDimImageOnTouch = false;
        this.customScaleType = ImageView.ScaleType.CENTER_CROP;
        this.scaleOption = 0;
        this.animating = false;
    }

    public float getRatio() {
        return this.mRatio;
    }

    public int getScaleOption() {
        return this.scaleOption;
    }

    public boolean isAnimating() {
        return this.animating;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (getDrawable() != null) {
            this.mWidth = View.MeasureSpec.getSize(i11);
            this.mHeight = View.MeasureSpec.getSize(i12);
            if (this.mMaxHeight <= 0) {
                this.mMaxHeight = this.mWidth;
            }
            try {
                int intrinsicWidth = getDrawable().getIntrinsicWidth();
                int intrinsicHeight = getDrawable().getIntrinsicHeight();
                float f11 = -1.0f;
                switch (this.scaleOption) {
                    case 0:
                        if (intrinsicWidth > 0) {
                            this.mHeight = (this.mWidth * intrinsicHeight) / intrinsicWidth;
                        } else {
                            this.mHeight = this.mWidth;
                        }
                        setScaleType(ImageView.ScaleType.FIT_CENTER);
                        break;
                    case 1:
                        this.mHeight = this.mWidth;
                        setScaleType(ImageView.ScaleType.CENTER_CROP);
                        break;
                    case 2:
                        if (intrinsicWidth > 0) {
                            this.mHeight = (this.mWidth * intrinsicHeight) / intrinsicWidth;
                        } else {
                            this.mHeight = this.mWidth;
                        }
                        setScaleType(ImageView.ScaleType.FIT_CENTER);
                        int i13 = this.mHeight;
                        int i14 = this.mWidth;
                        if (i13 > i14) {
                            this.mHeight = i14;
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        }
                        break;
                    case 3:
                        float f12 = this.mRatio;
                        if (f12 > 0.0f) {
                            if (f12 < 0.25f) {
                                f12 = 0.25f;
                            } else if (f12 > 1.2f) {
                                f12 = 1.2f;
                            }
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            this.mHeight = (int) (this.mWidth * f12);
                            break;
                        } else {
                            this.mHeight = this.mWidth;
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        }
                    case 4:
                        float f13 = this.mRatio;
                        if (f13 > 0.0f) {
                            f11 = f13;
                        } else if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                            f11 = (intrinsicHeight * 1.0f) / intrinsicWidth;
                        }
                        if (f11 > 0.0f) {
                            int i15 = (int) (this.mWidth * f11);
                            this.mHeight = i15;
                            int i16 = this.mMaxHeight;
                            if (i15 > i16) {
                                this.mHeight = i16;
                                this.mWidth = (int) (i16 / f11);
                            }
                            this.mWidth = Math.max(this.mWidth, this.mMinWidth);
                            this.mHeight = Math.max(this.mHeight, this.mMinHeight);
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else {
                            this.mHeight = this.mWidth;
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        }
                    case 5:
                        float f14 = this.mRatio;
                        if (f14 > 0.0f) {
                            f11 = f14;
                        } else if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                            f11 = (intrinsicHeight * 1.0f) / intrinsicWidth;
                        }
                        if (f11 > 0.0f) {
                            this.mWidth = (int) (this.mHeight / f11);
                        } else {
                            this.mWidth = this.mHeight;
                        }
                        setScaleType(ImageView.ScaleType.FIT_CENTER);
                        break;
                    case 6:
                        float f15 = this.mRatio;
                        if (f15 > 0.0f) {
                            setScaleType(this.customScaleType);
                            this.mHeight = (int) (this.mWidth * f15);
                            break;
                        } else {
                            this.mHeight = this.mWidth;
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        }
                }
                if (this.animating) {
                    super.onMeasure(i11, i12);
                    return;
                } else {
                    setMeasuredDimension(this.mWidth, this.mHeight);
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                setMeasuredDimension(this.mWidth, this.mHeight);
                return;
            }
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.isDimImageOnTouch) {
                if (motionEvent.getAction() == 0) {
                    getDrawable().setColorFilter(1140850688, PorterDuff.Mode.SRC_OVER);
                } else if (motionEvent.getAction() == 1) {
                    getDrawable().setColorFilter(0, PorterDuff.Mode.SRC_OVER);
                } else if (motionEvent.getAction() == 4) {
                    getDrawable().setColorFilter(0, PorterDuff.Mode.SRC_OVER);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void refreshState() {
        setColorFilter(0);
    }

    public void resetDimStatus() {
        getDrawable().setColorFilter(0, PorterDuff.Mode.SRC_OVER);
    }

    public void setAnimating(boolean z11) {
        this.animating = z11;
    }

    public void setCustomScaleType(ImageView.ScaleType scaleType) {
        this.customScaleType = scaleType;
    }

    public void setDimImageOnTouch(boolean z11) {
        this.isDimImageOnTouch = z11;
    }

    public void setMaximumHeight(int i11) {
        this.mMaxHeight = i11;
    }

    public void setMinHeight(int i11) {
        this.mMinHeight = i11;
    }

    public void setMinWidth(int i11) {
        this.mMinWidth = i11;
    }

    public void setRatio(float f11) {
        this.mRatio = f11;
    }

    public void setScaleOption(int i11) {
        this.scaleOption = i11;
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRatio = -1.0f;
        this.mMaxHeight = 0;
        this.mMinHeight = 1;
        this.isDimImageOnTouch = false;
        this.customScaleType = ImageView.ScaleType.CENTER_CROP;
    }
}
