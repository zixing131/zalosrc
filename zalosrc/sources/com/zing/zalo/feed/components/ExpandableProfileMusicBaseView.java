package com.zing.zalo.feed.components;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.CountDownTimer;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import me0.AbstractC23136l9;
import p500s1.C26088c;

/* loaded from: classes4.dex */
public class ExpandableProfileMusicBaseView extends RelativeLayout {

    /* renamed from: p */
    public final Animation f44214p;

    /* renamed from: q */
    public final Animation f44215q;

    /* renamed from: r */
    private boolean f44216r;

    /* renamed from: s */
    private boolean f44217s;

    /* renamed from: t */
    CountDownTimer f44218t;

    /* renamed from: u */
    boolean f44219u;

    /* renamed from: v */
    public static int f44209v = AbstractC23136l9.m118655I(AbstractC16802y.profile_music_layout_mini_w);

    /* renamed from: w */
    public static int f44210w = AbstractC23136l9.m118655I(AbstractC16802y.profile_music_layout_mini_h);

    /* renamed from: x */
    public static int f44211x = -1;

    /* renamed from: y */
    public static int f44212y = AbstractC23136l9.m118655I(AbstractC16802y.profile_music_layout_full_h);

    /* renamed from: z */
    private static final int f44213z = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: A */
    private static final int f44208A = AbstractC23136l9.m118742r(3.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.ExpandableProfileMusicBaseView$a */
    /* loaded from: classes4.dex */
    public class CountDownTimerC8080a extends CountDownTimer {
        CountDownTimerC8080a(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ExpandableProfileMusicBaseView expandableProfileMusicBaseView = ExpandableProfileMusicBaseView.this;
            if (expandableProfileMusicBaseView.f44219u && expandableProfileMusicBaseView.getVisibility() == 0) {
                ExpandableProfileMusicBaseView.this.m43618b(true);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.ExpandableProfileMusicBaseView$b */
    /* loaded from: classes4.dex */
    public class C8081b implements Transition.TransitionListener {
        C8081b() {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            ExpandableProfileMusicBaseView.this.f44217s = false;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            ExpandableProfileMusicBaseView.this.f44217s = true;
        }
    }

    public ExpandableProfileMusicBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44214p = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_in_short);
        this.f44215q = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_out_short);
        m43615h();
    }

    /* renamed from: g */
    private void m43614g() {
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new ChangeBounds()).setDuration(300L).setInterpolator((TimeInterpolator) new C26088c()).addListener((Transition.TransitionListener) new C8081b());
            TransitionManager.beginDelayedTransition(this, transitionSet);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m43615h() {
        this.f44214p.setDuration(500L);
        setBackgroundColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.profile_music_background));
        AbstractC23136l9.m118729m1(this, f44208A);
    }

    /* renamed from: i */
    private void m43616i() {
        CountDownTimer countDownTimer = this.f44218t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f44218t = new CountDownTimerC8080a(3000L, 1000L).start();
    }

    /* renamed from: j */
    private void m43617j() {
        CountDownTimer countDownTimer = this.f44218t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: b */
    public void m43618b(boolean z11) {
        if (!this.f44217s) {
            mo43621e();
            if (z11) {
                m43614g();
            }
            this.f44216r = false;
            m43617j();
        }
    }

    /* renamed from: c */
    public void m43619c(boolean z11) {
        if (!this.f44217s) {
            mo43622f();
            if (z11) {
                m43614g();
            }
            this.f44216r = true;
            m43616i();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public boolean m43620d() {
        return this.f44216r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo43621e() {
        RelativeLayout.LayoutParams layoutParams;
        try {
            if (getLayoutParams() != null) {
                layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            } else {
                layoutParams = new RelativeLayout.LayoutParams(f44211x, f44212y);
            }
            layoutParams.width = f44209v;
            layoutParams.height = f44210w;
            setLayoutParams(layoutParams);
            setGravity(16);
            AbstractC23136l9.m118729m1(this, f44208A);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void mo43622f() {
        RelativeLayout.LayoutParams layoutParams;
        try {
            if (getLayoutParams() != null) {
                layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
            } else {
                layoutParams = new RelativeLayout.LayoutParams(f44211x, f44212y);
            }
            layoutParams.width = f44211x;
            layoutParams.height = f44212y;
            setLayoutParams(layoutParams);
            setGravity(16);
            AbstractC23136l9.m118729m1(this, f44213z);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44219u = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f44219u = false;
        this.f44214p.cancel();
        this.f44215q.cancel();
        super.onDetachedFromWindow();
    }
}
