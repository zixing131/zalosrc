package com.showingphotolib.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Camera;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.Scroller;
import androidx.core.view.AbstractC1587p0;
import androidx.core.view.AbstractC1622z;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.photoview.PhotoView;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class HackyViewPager extends ViewPager {
    private static final String DEBUG_TAG = ViewPager.class.getSimpleName();
    private static final boolean DEFAULT_ANIMATE_ALPHA = false;
    private static final int DEFAULT_OVERSCROLL_ANIMATION_DURATION = 300;
    static final int DEFAULT_OVERSCROLL_TRANSLATION = 200;
    private static final int INVALID_POINTER_ID = -1;
    public static final String VIEW_PAGER_OBJECT_TAG = "image#";
    int mActivePointerId;
    boolean mAnimateAlpha;
    final Camera mCamera;
    float mLastMotionX;
    int mOverscrollAnimationDuration;
    final OverscrollEffect mOverscrollEffect;
    int mOverscrollTranslation;
    int mPreviousPosition;
    ViewPager.InterfaceC6875j mScrollListener;
    final int mTouchSlop;

    /* loaded from: classes3.dex */
    private static class HackyScroller extends Scroller {
        public HackyScroller(Context context) {
            super(context);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i11, int i12, int i13, int i14, int i15) {
            super.startScroll(i11, i12, i13, i14, i15 / 2);
        }
    }

    /* loaded from: classes3.dex */
    private class MyOnPageChangeListener implements ViewPager.InterfaceC6875j {
        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
            ViewPager.InterfaceC6875j interfaceC6875j = HackyViewPager.this.mScrollListener;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageScrollStateChanged(i11);
            }
            if (i11 == 0) {
                HackyViewPager hackyViewPager = HackyViewPager.this;
                if (hackyViewPager.mPreviousPosition != hackyViewPager.getCurrentItem()) {
                    try {
                        PhotoView photoView = (PhotoView) HackyViewPager.this.findViewWithTag(HackyViewPager.VIEW_PAGER_OBJECT_TAG + HackyViewPager.this.mPreviousPosition);
                        if (photoView != null) {
                            photoView.setScale(photoView.getMinimumScale());
                        }
                        HackyViewPager hackyViewPager2 = HackyViewPager.this;
                        hackyViewPager2.mPreviousPosition = hackyViewPager2.getCurrentItem();
                    } catch (ClassCastException e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
            ViewPager.InterfaceC6875j interfaceC6875j = HackyViewPager.this.mScrollListener;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageScrolled(i11, f11, i12);
            }
            HackyViewPager.this.invalidateVisibleChilds(i11);
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
            ViewPager.InterfaceC6875j interfaceC6875j = HackyViewPager.this.mScrollListener;
            if (interfaceC6875j != null) {
                interfaceC6875j.onPageSelected(i11);
            }
        }

        private MyOnPageChangeListener() {
        }
    }

    /* loaded from: classes3.dex */
    private class OverscrollEffect {
        Animator mAnimator;
        float mOverscroll;

        boolean isOverscrolling() {
            if (HackyViewPager.this.getCurrentItem() == 0 && this.mOverscroll < 0.0f) {
                return true;
            }
            if (HackyViewPager.this.getAdapter() != null && HackyViewPager.this.getAdapter().mo35335g() - 1 == HackyViewPager.this.getCurrentItem() && this.mOverscroll > 0.0f) {
                return true;
            }
            return false;
        }

        void onRelease() {
            Animator animator = this.mAnimator;
            if (animator != null && animator.isRunning()) {
                this.mAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.showingphotolib.view.HackyViewPager.OverscrollEffect.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator2) {
                        OverscrollEffect.this.startAnimation(0.0f);
                    }
                });
                this.mAnimator.cancel();
            } else {
                startAnimation(0.0f);
            }
        }

        public void setPull(float f11) {
            this.mOverscroll = f11;
            HackyViewPager hackyViewPager = HackyViewPager.this;
            hackyViewPager.invalidateVisibleChilds(hackyViewPager.mPreviousPosition);
        }

        void startAnimation(float f11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "pull", this.mOverscroll, f11);
            this.mAnimator = ofFloat;
            ofFloat.setInterpolator(new DecelerateInterpolator());
            this.mAnimator.setDuration(HackyViewPager.this.mOverscrollAnimationDuration * Math.abs(f11 - this.mOverscroll));
            this.mAnimator.start();
        }

        private OverscrollEffect() {
        }
    }

    public HackyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOverscrollEffect = new OverscrollEffect();
        this.mCamera = new Camera();
        this.mPreviousPosition = 0;
        setStaticTransformationsEnabled(true);
        this.mTouchSlop = AbstractC1587p0.m8128d(ViewConfiguration.get(context));
        super.setOnPageChangeListener(new MyOnPageChangeListener());
        this.mOverscrollTranslation = 200;
        this.mOverscrollAnimationDuration = DEFAULT_OVERSCROLL_ANIMATION_DURATION;
        this.mAnimateAlpha = false;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new HackyScroller(getContext()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"FloatMath"})
    protected boolean getChildStaticTransformation(View view, Transformation transformation) {
        boolean z11;
        if (view.getWidth() == 0) {
            return false;
        }
        if (getAdapter() != null && getAdapter().mo35335g() == 1) {
            return false;
        }
        int currentItem = getCurrentItem();
        if (currentItem != 0 && currentItem != getAdapter().mo35335g() - 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!this.mOverscrollEffect.isOverscrolling() || !z11) {
            return false;
        }
        float width = getWidth() / 2;
        int height = getHeight() / 2;
        transformation.getMatrix().reset();
        float sin = (float) (this.mOverscrollTranslation * Math.sin(Math.abs(this.mOverscrollEffect.mOverscroll) * 3.141592653589793d));
        this.mCamera.save();
        if (currentItem == getAdapter().mo35335g() - 1) {
            this.mCamera.translate(-sin, 0.0f, 0.0f);
        } else {
            this.mCamera.translate(sin, 0.0f, 0.0f);
        }
        this.mCamera.getMatrix(transformation.getMatrix());
        this.mCamera.restore();
        transformation.getMatrix().preTranslate(-width, -height);
        transformation.getMatrix().postTranslate(width, height);
        if (this.mAnimateAlpha) {
            transformation.setTransformationType(3);
            transformation.setAlpha((float) Math.sin((float) (((1.0f - Math.abs(this.mOverscrollEffect.mOverscroll)) * 3.141592653589793d) / 2.0d)));
        }
        view.invalidate();
        return true;
    }

    void invalidateVisibleChilds(int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            getChildAt(i12).invalidate();
        }
        invalidate();
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent == null) {
            return false;
        }
        try {
            if (motionEvent.getActionMasked() == 0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (getCurrentItem() != 0 && getCurrentItem() != getAdapter().mo35335g() - 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action != 1 && action != 3) {
                    if (action == 5) {
                        int m8274b = AbstractC1622z.m8274b(motionEvent);
                        this.mLastMotionX = AbstractC1622z.m8277e(motionEvent, m8274b);
                        this.mActivePointerId = AbstractC1622z.m8276d(motionEvent, m8274b);
                    }
                } else {
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                }
            } else {
                this.mLastMotionX = motionEvent.getX();
                this.mActivePointerId = AbstractC1622z.m8276d(motionEvent, 0);
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | IndexOutOfBoundsException unused) {
            return false;
        }
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        if (this.mPreviousPosition != getCurrentItem()) {
            setCurrentItem(this.mPreviousPosition);
        }
    }

    @Override // com.zing.p058v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        int i11;
        try {
            if (getAdapter() == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (getCurrentItem() != 0 && getCurrentItem() != getAdapter().mo35335g() - 1) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                            if (action != 5) {
                                if (action == 6) {
                                    int action2 = (motionEvent.getAction() & 65280) >> 8;
                                    if (AbstractC1622z.m8276d(motionEvent, action2) == this.mActivePointerId) {
                                        if (action2 == 0) {
                                            i11 = 1;
                                        } else {
                                            i11 = 0;
                                        }
                                        this.mLastMotionX = motionEvent.getX(i11);
                                        this.mActivePointerId = AbstractC1622z.m8276d(motionEvent, i11);
                                    }
                                }
                            } else {
                                int m8274b = AbstractC1622z.m8274b(motionEvent);
                                this.mLastMotionX = AbstractC1622z.m8277e(motionEvent, m8274b);
                                this.mActivePointerId = AbstractC1622z.m8276d(motionEvent, m8274b);
                            }
                        }
                    } else {
                        int i12 = this.mActivePointerId;
                        if (i12 != -1) {
                            float m8277e = AbstractC1622z.m8277e(motionEvent, AbstractC1622z.m8273a(motionEvent, i12));
                            int mo35335g = getAdapter().mo35335g() - 1;
                            int currentItem = getCurrentItem();
                            if (currentItem != 0 && currentItem != mo35335g) {
                                this.mLastMotionX = m8277e;
                            }
                            float f11 = this.mLastMotionX - m8277e;
                            if ((currentItem == 0 && f11 < 0.0f) || (currentItem == mo35335g && f11 > 0.0f)) {
                                float scrollX = getScrollX();
                                int width = getWidth();
                                int pageMargin = getPageMargin() + width;
                                float max = Math.max(0, (currentItem - 1) * pageMargin);
                                float min = Math.min(currentItem + 1, mo35335g) * pageMargin;
                                if (currentItem == mo35335g && scrollX + f11 < min) {
                                    scrollX = min;
                                }
                                float f12 = scrollX + f11;
                                if (f12 < max) {
                                    if (max == 0.0f) {
                                        this.mOverscrollEffect.setPull((f11 + this.mTouchSlop) / width);
                                    }
                                } else if (f12 > min && min == mo35335g * pageMargin) {
                                    this.mOverscrollEffect.setPull(((f12 - min) - this.mTouchSlop) / width);
                                }
                            }
                        } else {
                            this.mOverscrollEffect.onRelease();
                        }
                    }
                    z11 = false;
                    if (!this.mOverscrollEffect.isOverscrolling() && !z11) {
                        return true;
                    }
                    return super.onTouchEvent(motionEvent);
                }
                this.mActivePointerId = -1;
                this.mOverscrollEffect.onRelease();
            } else {
                this.mLastMotionX = motionEvent.getX();
                this.mActivePointerId = AbstractC1622z.m8276d(motionEvent, 0);
            }
            z11 = true;
            if (!this.mOverscrollEffect.isOverscrolling()) {
            }
            return super.onTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.zing.p058v4.view.ViewPager
    public void setCurrentItem(int i11) {
        super.setCurrentItem(i11);
        this.mPreviousPosition = i11;
    }

    @Override // com.zing.p058v4.view.ViewPager
    public void setOnPageChangeListener(ViewPager.InterfaceC6875j interfaceC6875j) {
        this.mScrollListener = interfaceC6875j;
    }

    @Override // com.zing.p058v4.view.ViewPager
    public void setCurrentItem(int i11, boolean z11) {
        super.setCurrentItem(i11, z11);
        this.mPreviousPosition = i11;
    }
}
