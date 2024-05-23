package com.showingphotolib.view;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.zview.animation.AnimationTarget;
import ho0.AbstractC20110a;
import java.lang.reflect.Field;
import mm0.AbstractC23350e;
import p500s1.C26087b;

/* loaded from: classes3.dex */
public class AnimationLayout extends View {
    private static final long ANIMATION_DURATION_MS = 250;
    public static final float MAX_RATIO = 1.7777778f;
    public static final int TYPE_GIF = 2;
    public static final int TYPE_LS = 3;
    public static final int TYPE_PHOTO = 0;
    public static final int TYPE_VIDEO = 1;
    public static final boolean useOccupyStatusBar = true;
    boolean animating;
    boolean attached;
    TransformData fTransformData;
    boolean hasRoundCorners;
    boolean isExpanded;
    long mAnimDuration;
    float mAnimatedFraction;
    AnimationTarget mAnimationTarget;
    ValueAnimator mAnimator;
    float mBackgroundAlpha;
    Rect mBackgroundRect;
    int mClipBottomHeight;
    Rect mClipRect;
    int mClipTopHeight;
    int mColorBackground;
    int mCurrentClipBottomHeight;
    int mCurrentClipTopHeight;
    float[] mCurrentPhotoRadii;
    RecyclingImageView mDumpImageView;
    private boolean mEnableClipping;
    float mFrameClipRatio;
    float[] mFullPhotoRadii;
    C3979l mImageInfo;
    Matrix mImageLocalMatrix;
    Paint mImagePaint;
    BitmapShader mImageShader;
    OnEventListener mListener;
    OnPhotoAnimationEndListener mOnPhotoAnimationEndListener;
    OnPhotoAnimationStartListener mOnPhotoAnimationStartListener;
    RectF mPhotoClipRect;
    float mPhotoClipRectHeight;
    float mPhotoClipRectWidth;
    float mPhotoHeight;
    RectF mPhotoRect;
    float mPhotoScaleX;
    float mPhotoScaleY;
    float mPhotoTranslationX;
    float mPhotoTranslationY;
    float mPhotoWidth;
    RectF mRoundedRect;
    Path mRoundedRectPath;
    float mSurroundSquareCenterX;
    float mSurroundSquareCenterY;
    float mSurroundSquareLeft;
    float mSurroundSquareSize;
    float mSurroundSquareTop;
    float[] mThumbPhotoRadii;
    Rect mThumbnailRect;
    Rect mWindowVisibleRect;
    public int type;

    /* loaded from: classes.dex */
    public interface OnEventListener {
        void onBeforeExpanding(int i11);

        void onExpanded(int i11);

        void onShrunk();
    }

    /* loaded from: classes3.dex */
    public interface OnPhotoAnimationEndListener {
        void onPhotoAnimationEnd(boolean z11);
    }

    /* loaded from: classes3.dex */
    public interface OnPhotoAnimationStartListener {
        void onPhotoAnimationStart(Animator animator, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class TransformData {
        int fullPhotoClipRectHeight;
        int fullPhotoClipRectWidth;
        public int fullPhotoHeight;
        public float fullPhotoScaleX;
        public float fullPhotoScaleY;
        Rect fullPhotoSurroundSquare;
        int fullPhotoSurroundSquareSize;
        public float fullPhotoTranslationX;
        public float fullPhotoTranslationY;
        public int fullPhotoWidth;
        int thumbPhotoClipRectHeight;
        int thumbPhotoClipRectWidth;
        public int thumbPhotoHeight;
        public float thumbPhotoScaleX;
        public float thumbPhotoScaleY;
        Rect thumbPhotoSurroundSquare;
        int thumbPhotoSurroundSquareSize;
        public float thumbPhotoTranslationX;
        public float thumbPhotoTranslationY;
        public int thumbPhotoWidth;

        private TransformData() {
        }
    }

    public AnimationLayout(Context context) {
        super(context);
        this.mColorBackground = -16777216;
        this.mClipTopHeight = 0;
        this.mClipBottomHeight = 0;
        this.mAnimator = null;
        this.mAnimDuration = ANIMATION_DURATION_MS;
        this.attached = false;
        this.animating = false;
        this.type = 0;
        this.mClipRect = new Rect();
        this.mCurrentClipTopHeight = 0;
        this.mCurrentClipBottomHeight = 0;
        this.mImagePaint = new Paint(1);
        this.mImageShader = null;
        this.mImageLocalMatrix = new Matrix();
        this.mAnimatedFraction = 0.0f;
        this.mEnableClipping = true;
        this.mWindowVisibleRect = new Rect();
        this.mPhotoRect = new RectF();
        this.mPhotoClipRect = new RectF();
        this.hasRoundCorners = false;
        init();
    }

    public static boolean isTypeShowFullscreen(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$expand$1(ValueAnimator valueAnimator) {
        updateAnimatedFraction(true, valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        onUpdateAnimationValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shrink$2(ValueAnimator valueAnimator) {
        updateAnimatedFraction(false, valueAnimator.getAnimatedFraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAnimState() {
        setClickable(false);
        AnimationTarget animationTarget = this.mAnimationTarget;
        if (animationTarget != null) {
            animationTarget.setAnimTargetVisibility(0);
            this.mAnimationTarget = null;
        }
        setVisibility(4);
        RecyclingImageView recyclingImageView = this.mDumpImageView;
        if (recyclingImageView != null) {
            recyclingImageView.setImageBitmap(null);
        }
        Paint paint = this.mImagePaint;
        if (paint != null) {
            paint.setShader(null);
        }
        this.mImageShader = null;
        this.mImageInfo = null;
        detachFromActivity();
        this.animating = false;
    }

    public void attachToActivity() {
        if (this.attached) {
            return;
        }
        ((ViewGroup) ((Activity) getContext()).findViewById(R.id.content)).addView(this, new RelativeLayout.LayoutParams(-1, -1));
        this.attached = true;
    }

    void calculateCurrentClip() {
        float f11 = this.mClipTopHeight;
        float f12 = this.mFrameClipRatio;
        this.mCurrentClipTopHeight = (int) (f11 * f12);
        this.mCurrentClipBottomHeight = (int) (this.mClipBottomHeight * f12);
    }

    void calculateRects() {
        RectF rectF = this.mPhotoRect;
        float f11 = this.mSurroundSquareCenterX;
        float f12 = this.mPhotoWidth;
        float f13 = this.mSurroundSquareCenterY;
        float f14 = this.mPhotoHeight;
        rectF.set(f11 - (f12 / 2.0f), f13 - (f14 / 2.0f), f11 + (f12 / 2.0f), f13 + (f14 / 2.0f));
        RectF rectF2 = this.mPhotoClipRect;
        float f15 = this.mSurroundSquareCenterX;
        float f16 = this.mPhotoClipRectWidth;
        float f17 = this.mSurroundSquareCenterY;
        float f18 = this.mPhotoClipRectHeight;
        rectF2.set(f15 - (f16 / 2.0f), f17 - (f18 / 2.0f), f15 + (f16 / 2.0f), f17 + (f18 / 2.0f));
        float[] fArr = this.mCurrentPhotoRadii;
        if (fArr != null && fArr.length >= 8) {
            this.mRoundedRectPath.reset();
            this.mRoundedRectPath.addRoundRect(this.mPhotoClipRect, this.mCurrentPhotoRadii, Path.Direction.CW);
        }
    }

    void calculateRoundedRadii(float[] fArr, float[] fArr2, float f11) {
        float f12;
        if (this.hasRoundCorners && this.mCurrentPhotoRadii != null) {
            int i11 = 0;
            while (true) {
                float[] fArr3 = this.mCurrentPhotoRadii;
                if (i11 < fArr3.length) {
                    float f13 = 0.0f;
                    if (fArr != null && i11 < fArr.length) {
                        f12 = fArr[i11];
                    } else {
                        f12 = 0.0f;
                    }
                    if (fArr2 != null && i11 < fArr2.length) {
                        f13 = fArr2[i11];
                    }
                    fArr3[i11] = f12 + ((f13 - f12) * f11);
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public void cancelAnim() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mAnimator.cancel();
            resetAnimState();
        }
    }

    public void detachFromActivity() {
        if (!this.attached) {
            return;
        }
        ((ViewGroup) ((Activity) getContext()).findViewById(R.id.content)).removeView(this);
        this.attached = false;
    }

    public void expand(AnimationTarget animationTarget, C3979l c3979l) {
        try {
            AnimationTarget animationTarget2 = this.mAnimationTarget;
            if (animationTarget2 == animationTarget) {
                AbstractC20110a.m104542k(8, "[AnimationLayout] Skip A", new Object[0]);
                return;
            }
            if (this.animating) {
                AbstractC20110a.m104542k(8, "[AnimationLayout] Skip B", new Object[0]);
                return;
            }
            if (animationTarget2 != null) {
                animationTarget2.setAnimTargetVisibility(0);
            }
            if (animationTarget == null) {
                AbstractC20110a.m104542k(8, "[AnimationLayout] Skip C", new Object[0]);
                return;
            }
            this.mAnimationTarget = animationTarget;
            this.isExpanded = true;
            this.animating = true;
            bringToFront();
            OnEventListener onEventListener = this.mListener;
            if (onEventListener != null) {
                onEventListener.onBeforeExpanding(this.type);
            }
            this.mImageInfo = c3979l;
            this.mBackgroundRect = prepareAnimation(c3979l);
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    setSystemUiVisibility(getSystemUiVisibility() | 512);
                    ((Activity) getContext()).getWindow().setNavigationBarColor(0);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            Rect animTargetLocationOnScreen = this.mAnimationTarget.getAnimTargetLocationOnScreen();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Rect rect = new Rect(animTargetLocationOnScreen);
            this.mThumbnailRect = rect;
            rect.offset(-iArr[0], -iArr[1]);
            Bitmap m18839c = this.mImageInfo.m18839c();
            this.fTransformData = getTransformData(m18839c.getWidth(), m18839c.getHeight(), this.mThumbnailRect, this.mBackgroundRect);
            updateAnimatedFraction(true, 0.0f);
            ValueAnimator valueAnimator = getValueAnimator();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.showingphotolib.view.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AnimationLayout.this.lambda$expand$1(valueAnimator2);
                }
            });
            invokeOnPhotoAnimationStartEvent(valueAnimator, this.isExpanded);
            valueAnimator.setDuration(this.mAnimDuration);
            valueAnimator.setInterpolator(new C26087b());
            valueAnimator.start();
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            this.animating = false;
        }
    }

    void finishAnimation() {
        postDelayed(new Runnable() { // from class: com.showingphotolib.view.e
            @Override // java.lang.Runnable
            public final void run() {
                AnimationLayout.this.resetAnimState();
            }
        }, 300L);
        invokeOnPhotoAnimationEndEvent(this.isExpanded);
    }

    protected float getAnimatedValue(float f11, float f12, float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    public int getStatusBarHeight() {
        return 0;
    }

    TransformData getTransformData(int i11, int i12, Rect rect, Rect rect2) {
        TransformData transformData = new TransformData();
        float f11 = i11;
        float f12 = i12;
        float f13 = f11 / f12;
        if (f13 >= rect2.width() / rect2.height()) {
            transformData.fullPhotoWidth = rect2.width();
            transformData.fullPhotoHeight = Math.round(rect2.width() / f13);
            transformData.fullPhotoTranslationX = 0.0f;
            transformData.fullPhotoTranslationY = (rect2.height() - transformData.fullPhotoHeight) / 2.0f;
        } else {
            transformData.fullPhotoWidth = Math.round(rect2.height() * f13);
            transformData.fullPhotoHeight = rect2.height();
            transformData.fullPhotoTranslationX = (rect2.width() - transformData.fullPhotoWidth) / 2.0f;
            transformData.fullPhotoTranslationY = 0.0f;
        }
        transformData.fullPhotoScaleX = (transformData.fullPhotoWidth * 1.0f) / f11;
        transformData.fullPhotoScaleY = (transformData.fullPhotoHeight * 1.0f) / f12;
        int max = Math.max(rect2.width(), rect2.height());
        Rect rect3 = new Rect();
        int i13 = max / 2;
        rect3.left = rect2.centerX() - i13;
        int centerY = rect2.centerY() - i13;
        rect3.top = centerY;
        rect3.right = rect3.left + max;
        rect3.bottom = centerY + max;
        transformData.fullPhotoSurroundSquare = rect3;
        transformData.fullPhotoSurroundSquareSize = max;
        if (f13 >= rect.width() / rect.height()) {
            transformData.thumbPhotoHeight = rect.height();
            transformData.thumbPhotoWidth = Math.round(rect.height() * f13);
            transformData.thumbPhotoTranslationY = 0.0f;
            transformData.thumbPhotoTranslationX = (rect.width() - transformData.thumbPhotoWidth) / 2.0f;
        } else {
            transformData.thumbPhotoWidth = rect.width();
            transformData.thumbPhotoHeight = Math.round(rect.width() / f13);
            transformData.thumbPhotoTranslationX = 0.0f;
            transformData.thumbPhotoTranslationY = (rect.height() - transformData.thumbPhotoHeight) / 2.0f;
        }
        transformData.thumbPhotoScaleX = (transformData.thumbPhotoWidth * 1.0f) / f11;
        transformData.thumbPhotoScaleY = (transformData.thumbPhotoHeight * 1.0f) / f12;
        int max2 = Math.max(rect.width(), rect.height());
        Rect rect4 = new Rect();
        int i14 = max2 / 2;
        rect4.left = rect.centerX() - i14;
        int centerY2 = rect.centerY() - i14;
        rect4.top = centerY2;
        rect4.right = rect4.left + max2;
        rect4.bottom = centerY2 + max2;
        transformData.thumbPhotoSurroundSquare = rect4;
        transformData.thumbPhotoSurroundSquareSize = max2;
        transformData.thumbPhotoClipRectWidth = rect.width();
        transformData.thumbPhotoClipRectHeight = rect.height();
        transformData.fullPhotoClipRectWidth = rect2.width();
        transformData.fullPhotoClipRectHeight = rect2.height();
        return transformData;
    }

    ValueAnimator getValueAnimator() {
        if (this.mAnimator != null) {
            this.mAnimator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mAnimator = ofFloat;
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.showingphotolib.view.AnimationLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AnimationLayout.this.setClickable(false);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (AnimationLayout.this.isExpanded) {
                    AbstractC20110a.m104542k(8, "[AnimationLayout] End expand", new Object[0]);
                }
                AnimationLayout.this.finishAnimation();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (AnimationLayout.this.isExpanded) {
                    AbstractC20110a.m104542k(8, "[AnimationLayout] Start expand", new Object[0]);
                }
                AnimationLayout.this.setClickable(true);
                AnimationTarget animationTarget = AnimationLayout.this.mAnimationTarget;
                if (animationTarget != null) {
                    animationTarget.setAnimTargetVisibility(4);
                }
            }
        });
        return this.mAnimator;
    }

    void init() {
        this.mBackgroundRect = new Rect();
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        this.mDumpImageView = recyclingImageView;
        recyclingImageView.setWillNotDraw(true);
        attachToActivity();
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.showingphotolib.view.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                AnimationLayout.this.lambda$init$0(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
    }

    void invokeOnPhotoAnimationEndEvent(boolean z11) {
        OnPhotoAnimationEndListener onPhotoAnimationEndListener = this.mOnPhotoAnimationEndListener;
        if (onPhotoAnimationEndListener != null) {
            onPhotoAnimationEndListener.onPhotoAnimationEnd(z11);
        }
        if (this.mListener != null) {
            AbstractC20110a.m104542k(8, "[AnimationLayout] invokeOnPhotoAnimationEndEvent " + z11, new Object[0]);
            if (z11) {
                this.mListener.onExpanded(this.type);
            } else {
                this.mListener.onShrunk();
            }
        }
    }

    void invokeOnPhotoAnimationStartEvent(Animator animator, boolean z11) {
        OnPhotoAnimationStartListener onPhotoAnimationStartListener = this.mOnPhotoAnimationStartListener;
        if (onPhotoAnimationStartListener != null) {
            onPhotoAnimationStartListener.onPhotoAnimationStart(animator, z11);
        }
    }

    public boolean isAnimating() {
        return this.animating;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Path path;
        Path path2;
        super.onDraw(canvas);
        canvas.save();
        float f11 = this.mBackgroundAlpha;
        if (f11 > 0.0f) {
            int i11 = (int) (f11 * 255.0f);
            if (i11 > 255) {
                i11 = 255;
            }
            canvas.drawColor((i11 << 24) | (this.mColorBackground & 16777215));
        }
        if (this.mEnableClipping) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                this.mClipRect.set(0, this.mCurrentClipTopHeight, width, height - this.mCurrentClipBottomHeight);
                if (Build.VERSION.SDK_INT >= 28) {
                    canvas.clipRect(this.mClipRect);
                } else {
                    canvas.clipRect(this.mClipRect, Region.Op.REPLACE);
                }
            } else {
                return;
            }
        }
        if (this.hasRoundCorners && (path2 = this.mRoundedRectPath) != null) {
            canvas.clipPath(path2);
        } else {
            RectF rectF = this.mPhotoClipRect;
            if (rectF != null) {
                canvas.clipRect(rectF);
            }
        }
        if (this.hasRoundCorners && (path = this.mRoundedRectPath) != null) {
            canvas.clipPath(path);
        }
        if (this.mImageShader != null) {
            this.mImageLocalMatrix.reset();
            this.mImageLocalMatrix.setScale(this.mPhotoScaleX, this.mPhotoScaleY);
            this.mImageShader.setLocalMatrix(this.mImageLocalMatrix);
            RectF rectF2 = this.mPhotoRect;
            canvas.translate(rectF2.left, rectF2.top);
            canvas.drawRect(0.0f, 0.0f, this.mPhotoWidth, this.mPhotoHeight, this.mImagePaint);
        }
        canvas.restore();
    }

    void onUpdateAnimationValue() {
        try {
            if (this.animating) {
                this.mThumbnailRect = this.mAnimationTarget.getAnimTargetLocationOnScreen();
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                this.mThumbnailRect.offset(-iArr[0], -iArr[1]);
                this.mBackgroundRect = prepareAnimation(this.mImageInfo);
                Bitmap m18839c = this.mImageInfo.m18839c();
                this.fTransformData = getTransformData(m18839c.getWidth(), m18839c.getHeight(), this.mThumbnailRect, this.mBackgroundRect);
                updateAnimatedFraction(this.isExpanded, this.mAnimatedFraction);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:            if (r3 != 1) goto L36;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Rect prepareAnimation(C3979l c3979l) {
        int i11;
        WindowInsets rootWindowInsets;
        int i12;
        DisplayCutout displayCutout;
        Window window;
        int i13;
        attachToActivity();
        RecyclingImageView recyclingImageView = this.mDumpImageView;
        if (recyclingImageView != null) {
            recyclingImageView.setImageInfo(c3979l);
        }
        if (c3979l != null && c3979l.m18849m()) {
            Bitmap m18839c = c3979l.m18839c();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(m18839c, tileMode, tileMode);
            this.mImageShader = bitmapShader;
            Paint paint = this.mImagePaint;
            if (paint != null) {
                paint.setShader(bitmapShader);
            }
        }
        this.mImageLocalMatrix.reset();
        int i14 = 0;
        setVisibility(0);
        this.mWindowVisibleRect.setEmpty();
        View rootView = getRootView();
        if (rootView != null && rootView != this && rootView.getWidth() > 0 && rootView.getHeight() > 0) {
            Rect rect = this.mBackgroundRect;
            rect.left = 0;
            rect.top = 0;
            int width = rootView.getWidth();
            int height = rootView.getHeight();
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 23) {
                rootWindowInsets = getRootWindowInsets();
                if (rootWindowInsets != null) {
                    width -= rootWindowInsets.getSystemWindowInsetLeft() + rootWindowInsets.getSystemWindowInsetRight();
                    i12 = Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom());
                    if (isTypeShowFullscreen(this.type) && i15 >= 28) {
                        displayCutout = rootWindowInsets.getDisplayCutout();
                        if (displayCutout != null) {
                            if ((getContext() instanceof Activity) && (window = ((Activity) getContext()).getWindow()) != null && window.getAttributes() != null) {
                                i13 = window.getAttributes().layoutInDisplayCutoutMode;
                            }
                            i14 = rootWindowInsets.getSystemWindowInsetTop();
                        }
                    }
                } else {
                    i12 = 0;
                }
                i11 = i12;
            } else {
                try {
                    Field declaredField = View.class.getDeclaredField("mAttachInfo");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(rootView);
                    if (obj != null) {
                        Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
                        declaredField2.setAccessible(true);
                        Rect rect2 = (Rect) declaredField2.get(obj);
                        if (rect2 != null) {
                            i11 = rect2.bottom;
                        }
                    }
                } catch (IllegalAccessException e11) {
                    AbstractC23350e.m122778h(e11);
                } catch (NoSuchFieldException e12) {
                    AbstractC23350e.m122778h(e12);
                }
                i11 = 0;
            }
            int i16 = (height - i14) - i11;
            Rect rect3 = this.mBackgroundRect;
            rect3.right = width;
            rect3.bottom = i16;
        } else {
            int statusBarHeight = getStatusBarHeight();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) - statusBarHeight;
            Rect rect4 = this.mBackgroundRect;
            rect4.left = 0;
            rect4.top = 0;
            rect4.right = min;
            rect4.bottom = max;
        }
        return this.mBackgroundRect;
    }

    public void setClipBottomHeight(int i11) {
        this.mClipBottomHeight = i11;
        calculateCurrentClip();
        invalidate();
    }

    public void setClipTopHeight(int i11) {
        this.mClipTopHeight = i11;
        calculateCurrentClip();
        invalidate();
    }

    public void setEnableClipping(boolean z11) {
        this.mEnableClipping = z11;
        invalidate();
    }

    public void setOnEventListener(OnEventListener onEventListener) {
        this.mListener = onEventListener;
    }

    public void setRounded(float f11) {
        if (f11 > 0.0f) {
            setRounded(new float[]{f11, f11, f11, f11, f11, f11, f11, f11});
        }
    }

    public void shrink(AnimationTarget animationTarget, C3979l c3979l) {
        try {
            AnimationTarget animationTarget2 = this.mAnimationTarget;
            if (animationTarget2 == animationTarget || this.animating) {
                return;
            }
            if (animationTarget2 != null) {
                animationTarget2.setAnimTargetVisibility(0);
            }
            if (animationTarget == null) {
                return;
            }
            this.mAnimationTarget = animationTarget;
            this.isExpanded = false;
            this.animating = true;
            bringToFront();
            this.mImageInfo = c3979l;
            this.mBackgroundRect = prepareAnimation(c3979l);
            Rect animTargetLocationOnScreen = this.mAnimationTarget.getAnimTargetLocationOnScreen();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Rect rect = new Rect(animTargetLocationOnScreen);
            this.mThumbnailRect = rect;
            rect.offset(-iArr[0], -iArr[1]);
            Bitmap m18839c = this.mImageInfo.m18839c();
            this.fTransformData = getTransformData(m18839c.getWidth(), m18839c.getHeight(), this.mThumbnailRect, this.mBackgroundRect);
            updateAnimatedFraction(false, 0.0f);
            ValueAnimator valueAnimator = getValueAnimator();
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.showingphotolib.view.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AnimationLayout.this.lambda$shrink$2(valueAnimator2);
                }
            });
            invokeOnPhotoAnimationStartEvent(valueAnimator, this.isExpanded);
            valueAnimator.setDuration(this.mAnimDuration);
            valueAnimator.setInterpolator(new C26087b());
            valueAnimator.start();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.animating = false;
        }
    }

    void updateAnimatedFraction(boolean z11, float f11) {
        try {
            this.mAnimatedFraction = f11;
            if (z11) {
                TransformData transformData = this.fTransformData;
                this.mSurroundSquareLeft = getAnimatedValue(transformData.thumbPhotoSurroundSquare.left, transformData.fullPhotoSurroundSquare.left, f11);
                TransformData transformData2 = this.fTransformData;
                this.mSurroundSquareTop = getAnimatedValue(transformData2.thumbPhotoSurroundSquare.top, transformData2.fullPhotoSurroundSquare.top, this.mAnimatedFraction);
                this.mSurroundSquareCenterX = getAnimatedValue(this.fTransformData.thumbPhotoSurroundSquare.exactCenterX(), this.fTransformData.fullPhotoSurroundSquare.exactCenterX(), this.mAnimatedFraction);
                this.mSurroundSquareCenterY = getAnimatedValue(this.fTransformData.thumbPhotoSurroundSquare.exactCenterY(), this.fTransformData.fullPhotoSurroundSquare.exactCenterY(), this.mAnimatedFraction);
                TransformData transformData3 = this.fTransformData;
                this.mSurroundSquareSize = getAnimatedValue(transformData3.thumbPhotoSurroundSquareSize, transformData3.fullPhotoSurroundSquareSize, this.mAnimatedFraction);
                TransformData transformData4 = this.fTransformData;
                this.mPhotoClipRectWidth = getAnimatedValue(transformData4.thumbPhotoClipRectWidth, transformData4.fullPhotoClipRectWidth, this.mAnimatedFraction);
                TransformData transformData5 = this.fTransformData;
                this.mPhotoClipRectHeight = getAnimatedValue(transformData5.thumbPhotoClipRectHeight, transformData5.fullPhotoClipRectHeight, this.mAnimatedFraction);
                TransformData transformData6 = this.fTransformData;
                this.mPhotoScaleX = getAnimatedValue(transformData6.thumbPhotoScaleX, transformData6.fullPhotoScaleX, this.mAnimatedFraction);
                TransformData transformData7 = this.fTransformData;
                this.mPhotoScaleY = getAnimatedValue(transformData7.thumbPhotoScaleY, transformData7.fullPhotoScaleY, this.mAnimatedFraction);
                TransformData transformData8 = this.fTransformData;
                this.mPhotoTranslationX = getAnimatedValue(transformData8.thumbPhotoTranslationX, transformData8.fullPhotoTranslationX, this.mAnimatedFraction);
                TransformData transformData9 = this.fTransformData;
                this.mPhotoTranslationY = getAnimatedValue(transformData9.thumbPhotoTranslationY, transformData9.fullPhotoTranslationY, this.mAnimatedFraction);
                TransformData transformData10 = this.fTransformData;
                this.mPhotoWidth = getAnimatedValue(transformData10.thumbPhotoWidth, transformData10.fullPhotoWidth, this.mAnimatedFraction);
                TransformData transformData11 = this.fTransformData;
                this.mPhotoHeight = getAnimatedValue(transformData11.thumbPhotoHeight, transformData11.fullPhotoHeight, this.mAnimatedFraction);
                this.mBackgroundAlpha = getAnimatedValue(0.0f, 1.0f, this.mAnimatedFraction);
                this.mFrameClipRatio = getAnimatedValue(1.0f, 0.0f, this.mAnimatedFraction);
                if (this.hasRoundCorners) {
                    calculateRoundedRadii(this.mThumbPhotoRadii, this.mFullPhotoRadii, this.mAnimatedFraction);
                }
            } else {
                TransformData transformData12 = this.fTransformData;
                this.mSurroundSquareLeft = getAnimatedValue(transformData12.fullPhotoSurroundSquare.left, transformData12.thumbPhotoSurroundSquare.left, f11);
                TransformData transformData13 = this.fTransformData;
                this.mSurroundSquareTop = getAnimatedValue(transformData13.fullPhotoSurroundSquare.top, transformData13.thumbPhotoSurroundSquare.top, this.mAnimatedFraction);
                this.mSurroundSquareCenterX = getAnimatedValue(this.fTransformData.fullPhotoSurroundSquare.exactCenterX(), this.fTransformData.thumbPhotoSurroundSquare.exactCenterX(), this.mAnimatedFraction);
                this.mSurroundSquareCenterY = getAnimatedValue(this.fTransformData.fullPhotoSurroundSquare.exactCenterY(), this.fTransformData.thumbPhotoSurroundSquare.exactCenterY(), this.mAnimatedFraction);
                TransformData transformData14 = this.fTransformData;
                this.mSurroundSquareSize = getAnimatedValue(transformData14.fullPhotoSurroundSquareSize, transformData14.thumbPhotoSurroundSquareSize, this.mAnimatedFraction);
                TransformData transformData15 = this.fTransformData;
                this.mPhotoClipRectWidth = getAnimatedValue(transformData15.fullPhotoClipRectWidth, transformData15.thumbPhotoClipRectWidth, this.mAnimatedFraction);
                TransformData transformData16 = this.fTransformData;
                this.mPhotoClipRectHeight = getAnimatedValue(transformData16.fullPhotoClipRectHeight, transformData16.thumbPhotoClipRectHeight, this.mAnimatedFraction);
                TransformData transformData17 = this.fTransformData;
                this.mPhotoScaleX = getAnimatedValue(transformData17.fullPhotoScaleX, transformData17.thumbPhotoScaleX, this.mAnimatedFraction);
                TransformData transformData18 = this.fTransformData;
                this.mPhotoScaleY = getAnimatedValue(transformData18.fullPhotoScaleY, transformData18.thumbPhotoScaleY, this.mAnimatedFraction);
                TransformData transformData19 = this.fTransformData;
                this.mPhotoTranslationX = getAnimatedValue(transformData19.fullPhotoTranslationX, transformData19.thumbPhotoTranslationX, this.mAnimatedFraction);
                TransformData transformData20 = this.fTransformData;
                this.mPhotoTranslationY = getAnimatedValue(transformData20.fullPhotoTranslationY, transformData20.thumbPhotoTranslationY, this.mAnimatedFraction);
                TransformData transformData21 = this.fTransformData;
                this.mPhotoWidth = getAnimatedValue(transformData21.fullPhotoWidth, transformData21.thumbPhotoWidth, this.mAnimatedFraction);
                TransformData transformData22 = this.fTransformData;
                this.mPhotoHeight = getAnimatedValue(transformData22.fullPhotoHeight, transformData22.thumbPhotoHeight, this.mAnimatedFraction);
                this.mBackgroundAlpha = getAnimatedValue(1.0f, 0.0f, this.mAnimatedFraction);
                this.mFrameClipRatio = getAnimatedValue(0.0f, 1.0f, this.mAnimatedFraction);
                if (this.hasRoundCorners) {
                    calculateRoundedRadii(this.mFullPhotoRadii, this.mThumbPhotoRadii, this.mAnimatedFraction);
                }
            }
            calculateRects();
            calculateCurrentClip();
            invalidate();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public void setRounded(float[] fArr) {
        if (fArr == null || fArr.length < 8) {
            this.hasRoundCorners = false;
            this.mCurrentPhotoRadii = null;
            this.mRoundedRect = null;
            this.mRoundedRectPath = null;
            return;
        }
        this.hasRoundCorners = true;
        this.mRoundedRectPath = new Path();
        this.mRoundedRect = new RectF();
        this.mThumbPhotoRadii = fArr;
        this.mFullPhotoRadii = null;
        this.mCurrentPhotoRadii = new float[8];
    }

    public void setRounded(float[] fArr, float[] fArr2) {
        if ((fArr == null && fArr2 == null) || ((fArr != null && fArr.length < 8) || (fArr2 != null && fArr2.length < 8))) {
            this.hasRoundCorners = false;
            this.mCurrentPhotoRadii = null;
            this.mRoundedRect = null;
            this.mRoundedRectPath = null;
            return;
        }
        this.hasRoundCorners = true;
        this.mRoundedRectPath = new Path();
        this.mRoundedRect = new RectF();
        this.mThumbPhotoRadii = fArr;
        this.mFullPhotoRadii = fArr2;
        this.mCurrentPhotoRadii = new float[8];
    }

    public AnimationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mColorBackground = -16777216;
        this.mClipTopHeight = 0;
        this.mClipBottomHeight = 0;
        this.mAnimator = null;
        this.mAnimDuration = ANIMATION_DURATION_MS;
        this.attached = false;
        this.animating = false;
        this.type = 0;
        this.mClipRect = new Rect();
        this.mCurrentClipTopHeight = 0;
        this.mCurrentClipBottomHeight = 0;
        this.mImagePaint = new Paint(1);
        this.mImageShader = null;
        this.mImageLocalMatrix = new Matrix();
        this.mAnimatedFraction = 0.0f;
        this.mEnableClipping = true;
        this.mWindowVisibleRect = new Rect();
        this.mPhotoRect = new RectF();
        this.mPhotoClipRect = new RectF();
        this.hasRoundCorners = false;
        init();
    }
}
