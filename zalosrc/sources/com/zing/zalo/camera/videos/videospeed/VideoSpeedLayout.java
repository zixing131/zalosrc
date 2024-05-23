package com.zing.zalo.camera.videos.videospeed;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.camera.videos.customviews.VideoSpeedSeekBar;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p446qf.EnumC25253a;
import p500s1.C26088c;
import p649xl.C29973p1;

/* loaded from: classes3.dex */
public class VideoSpeedLayout extends FrameLayout implements VideoSpeedSeekBar.InterfaceC7764c, View.OnClickListener {

    /* renamed from: p */
    private InterfaceC7781e f41738p;

    /* renamed from: q */
    private Animator f41739q;

    /* renamed from: r */
    private Animator f41740r;

    /* renamed from: s */
    private C29973p1 f41741s;

    /* renamed from: t */
    private float f41742t;

    /* renamed from: u */
    private boolean f41743u;

    /* renamed from: com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout$a */
    /* loaded from: classes3.dex */
    class C7777a extends AnimatorListenerAdapter {
        C7777a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            VideoSpeedLayout.this.f41739q = null;
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout$b */
    /* loaded from: classes3.dex */
    class C7778b extends AnimatorListenerAdapter {
        C7778b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            VideoSpeedLayout.this.f41739q = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (animator == VideoSpeedLayout.this.f41739q) {
                VideoSpeedLayout.this.f41741s.f138931s.setAlpha(1.0f);
                VideoSpeedLayout.this.f41741s.f138931s.setTranslationX(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout$c */
    /* loaded from: classes3.dex */
    public class C7779c extends AnimatorListenerAdapter {
        C7779c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            VideoSpeedLayout.this.f41740r = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (VideoSpeedLayout.this.f41740r == animator) {
                VideoSpeedLayout.this.f41741s.f138932t.setVisibility(8);
                VideoSpeedLayout.this.f41741s.f138929q.setVisibility(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout$d */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C7780d {

        /* renamed from: a */
        static final /* synthetic */ int[] f41747a;

        static {
            int[] iArr = new int[EnumC25253a.values().length];
            f41747a = iArr;
            try {
                iArr[EnumC25253a.f121115p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41747a[EnumC25253a.f121116q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC7781e {
        /* renamed from: a */
        void mo38316a();

        /* renamed from: b */
        void mo38317b(float f11);

        /* renamed from: c */
        void mo38318c(boolean z11);
    }

    public VideoSpeedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41739q = null;
        this.f41740r = null;
        this.f41742t = 1.0f;
        this.f41743u = false;
    }

    /* renamed from: j */
    private void m39627j(String str) {
        Animator animator = this.f41740r;
        if (animator != null) {
            animator.cancel();
        }
        this.f41741s.f138932t.setText(str);
        if (!this.f41741s.f138929q.isShown()) {
            this.f41741s.f138932t.setAlpha(0.0f);
            this.f41741s.f138929q.setAlpha(0.0f);
        }
        this.f41741s.f138932t.setVisibility(0);
        this.f41741s.f138929q.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f41741s.f138932t, "alpha", 0.5f), ObjectAnimator.ofFloat(this.f41741s.f138929q, "alpha", 1.0f));
        animatorSet2.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f41741s.f138932t, "alpha", 0.0f), ObjectAnimator.ofFloat(this.f41741s.f138929q, "alpha", 0.0f));
        animatorSet3.setStartDelay(1500L);
        animatorSet3.setDuration(100L);
        animatorSet.playTogether(animatorSet2, animatorSet3);
        animatorSet.addListener(new C7779c());
        this.f41740r = animatorSet;
        animatorSet.start();
    }

    @Override // com.zing.zalo.camera.videos.customviews.VideoSpeedSeekBar.InterfaceC7764c
    /* renamed from: a */
    public void mo39584a(float f11) {
        String format;
        this.f41742t = f11;
        int i11 = (int) f11;
        if (f11 == i11) {
            format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_camera_mode_speed) + " %dx", Integer.valueOf(i11));
        } else {
            format = String.format(getResources().getString(AbstractC8020f0.str_camera_mode_speed) + " %.1fx", Float.valueOf(f11));
        }
        m39627j(format);
        InterfaceC7781e interfaceC7781e = this.f41738p;
        if (interfaceC7781e != null) {
            interfaceC7781e.mo38317b(f11);
        }
    }

    /* renamed from: g */
    public void m39628g(boolean z11, int i11) {
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f41741s.f138931s.getLayoutParams();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f41741s.f138935w.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f41741s.f138930r.getLayoutParams();
            if (z11) {
                this.f41741s.f138931s.setOrientation(0);
                layoutParams2.topMargin = 0;
                layoutParams2.rightMargin = AbstractC23136l9.m118742r(16.0f);
                layoutParams2.gravity = 80;
                C29973p1 c29973p1 = this.f41741s;
                c29973p1.f138931s.removeView(c29973p1.f138930r);
                C29973p1 c29973p12 = this.f41741s;
                c29973p12.f138931s.addView(c29973p12.f138930r, 0, layoutParams2);
            } else {
                this.f41741s.f138931s.setOrientation(1);
                layoutParams2.topMargin = AbstractC23136l9.m118742r(21.0f);
                layoutParams2.rightMargin = 0;
                layoutParams2.gravity = 0;
                C29973p1 c29973p13 = this.f41741s;
                c29973p13.f138931s.removeView(c29973p13.f138930r);
                C29973p1 c29973p14 = this.f41741s;
                c29973p14.f138931s.addView(c29973p14.f138930r, layoutParams2);
            }
            this.f41741s.f138930r.setLayoutParams(layoutParams2);
            int i12 = ((i11 - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) - (layoutParams.topMargin + layoutParams.bottomMargin);
            if (!z11) {
                i12 -= (layoutParams2.topMargin + layoutParams2.bottomMargin) + this.f41741s.f138930r.getHeight();
            }
            int m118742r = i12 - AbstractC23136l9.m118742r(8.0f);
            if (m118742r > 0) {
                this.f41741s.f138935w.setAvailableHeight(m118742r);
            }
            this.f41741s.f138931s.requestLayout();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public float getCurrentSpeed() {
        return this.f41742t;
    }

    public LinearLayout getRightControlsLayout() {
        return this.f41741s.f138931s;
    }

    /* renamed from: h */
    public Animator m39629h(boolean z11) {
        AnimatorSet animatorSet = new AnimatorSet();
        int m118742r = AbstractC23136l9.m118742r(24.0f);
        try {
            if (z11) {
                this.f41741s.f138931s.setTranslationX(m118742r);
                this.f41741s.f138931s.setAlpha(0.0f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f41741s.f138931s, "translationX", 0.0f), ObjectAnimator.ofFloat(this.f41741s.f138931s, "alpha", 1.0f));
                animatorSet.setInterpolator(new C26088c());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new C7777a());
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.f41741s.f138931s, "translationX", m118742r), ObjectAnimator.ofFloat(this.f41741s.f138931s, "alpha", 0.0f));
                animatorSet.setInterpolator(new C26088c());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new C7778b());
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return animatorSet;
    }

    /* renamed from: i */
    public void m39630i(boolean z11) {
        int i11;
        AppCompatImageButton appCompatImageButton = this.f41741s.f138930r;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        appCompatImageButton.setVisibility(i11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC7781e interfaceC7781e;
        if (view.getId() == AbstractC6918a0.reverse_button) {
            if (this.f41743u) {
                setReversed(false);
            } else {
                setReversed(true);
                m39627j(AbstractC23136l9.m118743r0(AbstractC8020f0.str_camera_mode_reverse));
            }
            InterfaceC7781e interfaceC7781e2 = this.f41738p;
            if (interfaceC7781e2 != null) {
                interfaceC7781e2.mo38318c(this.f41743u);
                return;
            }
            return;
        }
        if (view.getId() == AbstractC6918a0.video_speed_layout && (interfaceC7781e = this.f41738p) != null) {
            interfaceC7781e.mo38316a();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C29973p1 m148348a = C29973p1.m148348a(this);
        this.f41741s = m148348a;
        m148348a.f138935w.setOnSpeedChangeListener(this);
        this.f41741s.f138930r.setOnClickListener(this);
        this.f41741s.f138934v.setOnClickListener(this);
    }

    public void setCurrentSpeed(float f11) {
        this.f41742t = f11;
        this.f41741s.f138935w.setSpeed(f11);
    }

    public void setLayoutType(EnumC25253a enumC25253a) {
        ViewGroup.LayoutParams layoutParams = this.f41741s.f138931s.getLayoutParams();
        int i11 = C7780d.f41747a[enumC25253a.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                this.f41741s.f138933u.setVisibility(0);
                this.f41741s.f138934v.setClickable(true);
                this.f41741s.f138934v.setFocusable(true);
                boolean z11 = layoutParams instanceof FrameLayout.LayoutParams;
                if (z11) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 8388629;
                }
                if (z11) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = 0;
                    return;
                }
                return;
            }
            return;
        }
        this.f41741s.f138933u.setVisibility(8);
        this.f41741s.f138934v.setClickable(false);
        this.f41741s.f138934v.setFocusable(false);
        boolean z12 = layoutParams instanceof FrameLayout.LayoutParams;
        if (z12) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 8388661;
        }
        if (z12) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = AbstractC23222t7.f112547Z;
        }
    }

    public void setReverseButtonEnable(boolean z11) {
        this.f41741s.f138930r.setEnabled(z11);
    }

    public void setReversed(boolean z11) {
        int i11;
        this.f41743u = z11;
        AppCompatImageButton appCompatImageButton = this.f41741s.f138930r;
        if (z11) {
            i11 = AbstractC16803z._icn_story_reverse_o;
        } else {
            i11 = AbstractC16803z._icn_story_reverse;
        }
        appCompatImageButton.setImageResource(i11);
    }

    public void setVideoSpeedChangeListener(InterfaceC7781e interfaceC7781e) {
        this.f41738p = interfaceC7781e;
    }
}
