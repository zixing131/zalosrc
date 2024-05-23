package com.zing.zalo.uicontrol;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;

/* loaded from: classes4.dex */
public class SlideshowLayout extends FrameLayout {

    /* renamed from: p */
    float f83445p;

    /* renamed from: q */
    AspectRatioImageView f83446q;

    /* renamed from: r */
    AspectRatioImageView f83447r;

    /* renamed from: s */
    AspectRatioImageView f83448s;

    /* renamed from: t */
    boolean f83449t;

    /* renamed from: u */
    int[] f83450u;

    /* renamed from: v */
    int f83451v;

    /* renamed from: w */
    AnimatorSet f83452w;

    /* renamed from: com.zing.zalo.uicontrol.SlideshowLayout$a */
    /* loaded from: classes4.dex */
    class C16503a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC16505c f83453p;

        C16503a(InterfaceC16505c interfaceC16505c) {
            this.f83453p = interfaceC16505c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f83453p.mo76018a();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.SlideshowLayout$b */
    /* loaded from: classes4.dex */
    class C16504b extends AnimatorListenerAdapter {
        C16504b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            AnimatorSet animatorSet = SlideshowLayout.this.f83452w;
            if (animatorSet != null && animatorSet.equals(animator)) {
                SlideshowLayout slideshowLayout = SlideshowLayout.this;
                slideshowLayout.f83452w = null;
                AspectRatioImageView aspectRatioImageView = slideshowLayout.f83448s;
                AspectRatioImageView aspectRatioImageView2 = slideshowLayout.f83446q;
                slideshowLayout.f83448s = aspectRatioImageView2;
                slideshowLayout.f83446q = slideshowLayout.f83447r;
                slideshowLayout.f83447r = aspectRatioImageView;
                aspectRatioImageView2.setTranslationX(0.0f);
                SlideshowLayout.this.f83448s.setTranslationY(0.0f);
                SlideshowLayout.this.f83448s.setScaleX(1.0f);
                SlideshowLayout.this.f83448s.setScaleY(1.0f);
                SlideshowLayout.this.f83448s.setAlpha(1.0f);
                SlideshowLayout.this.f83448s.setRotationY(0.0f);
                SlideshowLayout.this.f83448s.setPivotX(r0.getMeasuredWidth() * 0.5f);
                SlideshowLayout.this.f83448s.setPivotY(r0.getMeasuredHeight() * 0.5f);
                SlideshowLayout.this.f83448s.setVisibility(8);
                SlideshowLayout.this.f83447r.setTranslationX(0.0f);
                SlideshowLayout.this.f83447r.setTranslationY(0.0f);
                SlideshowLayout.this.f83447r.setScaleX(1.0f);
                SlideshowLayout.this.f83447r.setScaleY(1.0f);
                SlideshowLayout.this.f83447r.setAlpha(1.0f);
                SlideshowLayout.this.f83447r.setRotationY(0.0f);
                SlideshowLayout.this.f83447r.setPivotX(r0.getMeasuredWidth() * 0.5f);
                SlideshowLayout.this.f83447r.setPivotY(r0.getMeasuredHeight() * 0.5f);
                SlideshowLayout.this.f83447r.setVisibility(8);
                SlideshowLayout.this.f83446q.setTranslationX(0.0f);
                SlideshowLayout.this.f83446q.setTranslationY(0.0f);
                SlideshowLayout.this.f83446q.setScaleX(1.0f);
                SlideshowLayout.this.f83446q.setScaleY(1.0f);
                SlideshowLayout.this.f83446q.setAlpha(1.0f);
                SlideshowLayout.this.f83446q.setRotationY(0.0f);
                SlideshowLayout.this.f83446q.setPivotX(r6.getMeasuredWidth() * 0.5f);
                SlideshowLayout.this.f83446q.setPivotY(r6.getMeasuredHeight() * 0.5f);
                SlideshowLayout.this.f83446q.setVisibility(0);
                SlideshowLayout.this.f83449t = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AnimatorSet animatorSet = SlideshowLayout.this.f83452w;
            if (animatorSet != null && animatorSet.equals(animator)) {
                SlideshowLayout slideshowLayout = SlideshowLayout.this;
                slideshowLayout.f83452w = null;
                AspectRatioImageView aspectRatioImageView = slideshowLayout.f83448s;
                AspectRatioImageView aspectRatioImageView2 = slideshowLayout.f83446q;
                slideshowLayout.f83448s = aspectRatioImageView2;
                slideshowLayout.f83446q = slideshowLayout.f83447r;
                slideshowLayout.f83447r = aspectRatioImageView;
                aspectRatioImageView2.setTranslationX(0.0f);
                SlideshowLayout.this.f83448s.setTranslationY(0.0f);
                SlideshowLayout.this.f83448s.setScaleX(1.0f);
                SlideshowLayout.this.f83448s.setScaleY(1.0f);
                SlideshowLayout.this.f83448s.setAlpha(1.0f);
                SlideshowLayout.this.f83448s.setRotationY(0.0f);
                SlideshowLayout.this.f83448s.setPivotX(r0.getMeasuredWidth() * 0.5f);
                SlideshowLayout.this.f83448s.setPivotY(r0.getMeasuredHeight() * 0.5f);
                SlideshowLayout.this.f83448s.setVisibility(8);
                SlideshowLayout.this.f83447r.setTranslationX(0.0f);
                SlideshowLayout.this.f83447r.setTranslationY(0.0f);
                SlideshowLayout.this.f83447r.setScaleX(1.0f);
                SlideshowLayout.this.f83447r.setScaleY(1.0f);
                SlideshowLayout.this.f83447r.setAlpha(1.0f);
                SlideshowLayout.this.f83447r.setRotationY(0.0f);
                SlideshowLayout.this.f83447r.setPivotX(r0.getMeasuredWidth() * 0.5f);
                SlideshowLayout.this.f83447r.setPivotY(r0.getMeasuredHeight() * 0.5f);
                SlideshowLayout.this.f83447r.setVisibility(8);
                SlideshowLayout.this.f83446q.setTranslationX(0.0f);
                SlideshowLayout.this.f83446q.setTranslationY(0.0f);
                SlideshowLayout.this.f83446q.setScaleX(1.0f);
                SlideshowLayout.this.f83446q.setScaleY(1.0f);
                SlideshowLayout.this.f83446q.setAlpha(1.0f);
                SlideshowLayout.this.f83446q.setRotationY(0.0f);
                SlideshowLayout.this.f83446q.setPivotX(r6.getMeasuredWidth() * 0.5f);
                SlideshowLayout.this.f83446q.setPivotY(r6.getMeasuredHeight() * 0.5f);
                SlideshowLayout.this.f83446q.setVisibility(0);
                SlideshowLayout.this.f83449t = false;
            }
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.SlideshowLayout$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC16505c {
        /* renamed from: a */
        void mo76018a();
    }

    /* renamed from: com.zing.zalo.uicontrol.SlideshowLayout$d */
    /* loaded from: classes4.dex */
    public enum EnumC16506d {
        CROSS_FADE,
        ZOOM,
        CUBE,
        FLIP,
        ZOOM_IN_OUT
    }

    public SlideshowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83445p = MainApplication.getAppContext().getResources().getDisplayMetrics().density;
        this.f83451v = EnumC16506d.ZOOM.ordinal();
        AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(context);
        this.f83446q = aspectRatioImageView;
        aspectRatioImageView.setScaleOption(1);
        addView(this.f83446q);
        AspectRatioImageView aspectRatioImageView2 = new AspectRatioImageView(context);
        this.f83447r = aspectRatioImageView2;
        aspectRatioImageView2.setScaleOption(1);
        this.f83447r.setVisibility(8);
        addView(this.f83447r);
        AspectRatioImageView aspectRatioImageView3 = new AspectRatioImageView(context);
        this.f83448s = aspectRatioImageView3;
        aspectRatioImageView3.setVisibility(8);
        this.f83448s.setScaleOption(1);
        addView(this.f83448s);
    }

    /* renamed from: a */
    public void m87999a(int i11, EnumC16506d enumC16506d) {
        this.f83450u = new int[i11];
        int i12 = 0;
        while (true) {
            int[] iArr = this.f83450u;
            if (i12 < iArr.length) {
                iArr[i12] = enumC16506d.ordinal();
                i12++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public boolean m88000b() {
        return this.f83449t;
    }

    /* renamed from: c */
    public void m88001c(int i11, boolean z11, InterfaceC16505c interfaceC16505c) {
        AnimatorSet animatorSet = this.f83452w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f83452w = null;
        }
        if (!z11) {
            AspectRatioImageView aspectRatioImageView = this.f83448s;
            AspectRatioImageView aspectRatioImageView2 = this.f83446q;
            this.f83448s = aspectRatioImageView2;
            this.f83446q = this.f83447r;
            this.f83447r = aspectRatioImageView;
            aspectRatioImageView2.setTranslationX(0.0f);
            this.f83448s.setTranslationY(0.0f);
            this.f83448s.setScaleX(1.0f);
            this.f83448s.setScaleY(1.0f);
            this.f83448s.setAlpha(1.0f);
            this.f83448s.setRotationY(0.0f);
            this.f83448s.setPivotX(getMeasuredWidth() * 0.5f);
            this.f83448s.setPivotY(getMeasuredHeight() * 0.5f);
            this.f83448s.setVisibility(8);
            this.f83447r.setTranslationX(0.0f);
            this.f83447r.setTranslationY(0.0f);
            this.f83447r.setScaleX(1.0f);
            this.f83447r.setScaleY(1.0f);
            this.f83447r.setAlpha(1.0f);
            this.f83447r.setRotationY(0.0f);
            this.f83447r.setPivotX(getMeasuredWidth() * 0.5f);
            this.f83447r.setPivotY(getMeasuredHeight() * 0.5f);
            this.f83447r.setVisibility(8);
            this.f83446q.setTranslationX(0.0f);
            this.f83446q.setTranslationY(0.0f);
            this.f83446q.setScaleX(1.0f);
            this.f83446q.setScaleY(1.0f);
            this.f83446q.setAlpha(1.0f);
            this.f83446q.setRotationY(0.0f);
            this.f83446q.setPivotX(getMeasuredWidth() * 0.5f);
            this.f83446q.setPivotY(getMeasuredHeight() * 0.5f);
            this.f83446q.setVisibility(0);
            this.f83449t = false;
            return;
        }
        try {
            int[] iArr = this.f83450u;
            if (iArr != null && iArr.length > 0) {
                if (i11 == 0) {
                    this.f83451v = iArr[iArr.length - 1];
                } else {
                    this.f83451v = iArr[i11 - 1];
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f83452w = new AnimatorSet();
        int i12 = 1500;
        if (this.f83451v == EnumC16506d.CROSS_FADE.ordinal()) {
            this.f83447r.setAlpha(0.0f);
            this.f83447r.setVisibility(0);
            this.f83452w.playTogether(ObjectAnimator.ofFloat(this.f83446q, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f83447r, "alpha", 0.0f, 1.0f));
        } else if (this.f83451v == EnumC16506d.ZOOM.ordinal()) {
            this.f83446q.bringToFront();
            this.f83447r.setScaleX(0.0f);
            this.f83447r.setScaleY(0.0f);
            this.f83447r.setAlpha(0.0f);
            this.f83447r.setVisibility(0);
            this.f83452w.playTogether(ObjectAnimator.ofFloat(this.f83446q, "scaleX", 1.0f, 1.5f), ObjectAnimator.ofFloat(this.f83446q, "scaleY", 1.0f, 1.5f), ObjectAnimator.ofFloat(this.f83446q, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f83447r, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f83447r, "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f83447r, "alpha", 0.0f, 1.0f));
            this.f83452w.setInterpolator(new DecelerateInterpolator());
        } else if (this.f83451v == EnumC16506d.ZOOM_IN_OUT.ordinal()) {
            this.f83446q.bringToFront();
            this.f83447r.setScaleX(0.0f);
            this.f83447r.setScaleY(0.0f);
            this.f83447r.setAlpha(0.0f);
            this.f83447r.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f83446q, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f83446q, "scaleY", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f83446q, "alpha", 1.0f, 0.0f));
            animatorSet2.setDuration(150L);
            animatorSet2.setInterpolator(new AccelerateInterpolator());
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f83447r, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f83447r, "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f83447r, "alpha", 0.0f, 1.0f));
            animatorSet3.setDuration(150L);
            animatorSet3.setInterpolator(new DecelerateInterpolator());
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.f83447r, "scaleX", 1.0f, 1.0f));
            animatorSet4.setDuration(1000L);
            this.f83452w.playSequentially(animatorSet2, animatorSet3, animatorSet4);
            i12 = 300;
        } else if (this.f83451v == EnumC16506d.CUBE.ordinal()) {
            this.f83447r.setPivotX(0.0f);
            this.f83447r.setPivotY(getMeasuredHeight() * 0.5f);
            this.f83447r.setRotationY(20.0f);
            this.f83447r.setVisibility(0);
            this.f83447r.setTranslationX(getMeasuredWidth());
            this.f83446q.setPivotX(getMeasuredWidth());
            this.f83446q.setPivotY(getMeasuredHeight() * 0.5f);
            this.f83452w.playTogether(ObjectAnimator.ofFloat(this.f83446q, "rotationY", 0.0f, -20.0f), ObjectAnimator.ofFloat(this.f83446q, "translationX", 0.0f, -getMeasuredWidth()), ObjectAnimator.ofFloat(this.f83447r, "rotationY", 20.0f, 0.0f), ObjectAnimator.ofFloat(this.f83447r, "translationX", getMeasuredWidth(), 0.0f));
            this.f83452w.setInterpolator(new DecelerateInterpolator());
        } else if (this.f83451v == EnumC16506d.FLIP.ordinal()) {
            this.f83447r.setPivotX(getMeasuredWidth() * 0.5f);
            this.f83447r.setPivotY(getMeasuredHeight() * 0.5f);
            this.f83446q.setPivotX(getMeasuredWidth() * 0.5f);
            this.f83446q.setPivotY(getMeasuredHeight() * 0.5f);
            float measuredWidth = getMeasuredWidth() * 10;
            this.f83446q.setCameraDistance(this.f83445p * measuredWidth);
            this.f83447r.setCameraDistance(measuredWidth * this.f83445p);
            this.f83447r.setRotationY(90.0f);
            this.f83447r.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f83446q, "rotationY", 0.0f, -90.0f);
            if (interfaceC16505c != null) {
                ofFloat.addListener(new C16503a(interfaceC16505c));
            }
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f83447r, "rotationY", 90.0f, 0.0f);
            ofFloat2.setInterpolator(new DecelerateInterpolator());
            this.f83452w.playSequentially(ofFloat, ofFloat2);
            i12 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        }
        this.f83452w.setDuration(i12);
        this.f83452w.addListener(new C16504b());
        this.f83449t = true;
        this.f83452w.start();
    }

    /* renamed from: d */
    public void m88002d() {
        AnimatorSet animatorSet = this.f83452w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f83452w = null;
        }
        AspectRatioImageView aspectRatioImageView = this.f83448s;
        AspectRatioImageView aspectRatioImageView2 = this.f83446q;
        this.f83448s = aspectRatioImageView2;
        this.f83446q = this.f83447r;
        this.f83447r = aspectRatioImageView;
        aspectRatioImageView2.setTranslationX(0.0f);
        this.f83448s.setTranslationY(0.0f);
        this.f83448s.setScaleX(1.0f);
        this.f83448s.setScaleY(1.0f);
        this.f83448s.setAlpha(1.0f);
        this.f83448s.setRotationY(0.0f);
        this.f83448s.setPivotX(getMeasuredWidth() * 0.5f);
        this.f83448s.setPivotY(getMeasuredHeight() * 0.5f);
        this.f83448s.setVisibility(8);
        this.f83447r.setTranslationX(0.0f);
        this.f83447r.setTranslationY(0.0f);
        this.f83447r.setScaleX(1.0f);
        this.f83447r.setScaleY(1.0f);
        this.f83447r.setAlpha(1.0f);
        this.f83447r.setRotationY(0.0f);
        this.f83447r.setPivotX(getMeasuredWidth() * 0.5f);
        this.f83447r.setPivotY(getMeasuredHeight() * 0.5f);
        this.f83447r.setVisibility(8);
        this.f83446q.setTranslationX(0.0f);
        this.f83446q.setTranslationY(0.0f);
        this.f83446q.setScaleX(1.0f);
        this.f83446q.setScaleY(1.0f);
        this.f83446q.setAlpha(1.0f);
        this.f83446q.setRotationY(0.0f);
        this.f83446q.setPivotX(getMeasuredWidth() * 0.5f);
        this.f83446q.setPivotY(getMeasuredHeight() * 0.5f);
        this.f83446q.setVisibility(0);
        this.f83449t = false;
    }

    /* renamed from: e */
    public void m88003e(C3979l c3979l, C3979l c3979l2) {
        this.f83448s.setImageInfo(c3979l);
        this.f83447r.setImageInfo(c3979l2);
    }

    public RecyclingImageView getCurrentView() {
        return this.f83446q;
    }
}
