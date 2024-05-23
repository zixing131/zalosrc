package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.zing.zalo.zdesign.component.TooltipView;
import i40.AbstractAnimationAnimationListenerC20277g;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes6.dex */
public class HightLightSettingView extends View {

    /* renamed from: p */
    protected int f69312p;

    /* renamed from: q */
    protected int f69313q;

    /* renamed from: r */
    private Paint f69314r;

    /* renamed from: s */
    private int f69315s;

    /* renamed from: t */
    private Runnable f69316t;

    /* renamed from: u */
    private View f69317u;

    /* renamed from: v */
    private boolean f69318v;

    /* renamed from: w */
    boolean f69319w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.HightLightSettingView$a */
    /* loaded from: classes6.dex */
    public class C13505a extends AbstractAnimationAnimationListenerC20277g {
        C13505a() {
        }

        @Override // i40.AbstractAnimationAnimationListenerC20277g, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            HightLightSettingView.this.setVisibility(8);
            HightLightSettingView.this.f69319w = false;
        }
    }

    public HightLightSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69315s = 1;
        this.f69316t = null;
        this.f69317u = null;
        this.f69318v = false;
        m75741c();
    }

    /* renamed from: c */
    private void m75741c() {
        Paint paint = new Paint();
        this.f69314r = paint;
        paint.setAntiAlias(true);
        this.f69314r.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.hightlight_setting));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m75742d(TooltipView tooltipView) {
        if (getVisibility() == 0) {
            m75743b();
            if (tooltipView != null) {
                tooltipView.setOnTooltipFinishedListener(null);
                tooltipView.m90727Q();
            }
        }
    }

    /* renamed from: b */
    public void m75743b() {
        try {
            Runnable runnable = this.f69316t;
            if (runnable != null) {
                runnable.run();
            }
            if (!this.f69319w && getVisibility() == 0) {
                this.f69319w = true;
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new C13505a());
                startAnimation(alphaAnimation);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo75614e(View view) {
        if (view != null) {
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                getLocationOnScreen(iArr2);
                this.f69312p = iArr[1] - iArr2[1];
                this.f69313q = view.getHeight();
                setVisibility(0);
                invalidate();
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                startAnimation(alphaAnimation);
            } catch (Resources.NotFoundException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    public void m75744f(View view, long j11) {
        m75745g(view, j11, null);
    }

    /* renamed from: g */
    public void m75745g(View view, long j11, TooltipView tooltipView) {
        m75746h(view, j11, tooltipView, 1, false, null);
    }

    /* renamed from: h */
    public void m75746h(View view, long j11, final TooltipView tooltipView, int i11, boolean z11, Runnable runnable) {
        this.f69315s = i11;
        this.f69316t = runnable;
        this.f69317u = view;
        this.f69318v = z11;
        mo75614e(view);
        postDelayed(new Runnable() { // from class: com.zing.zalo.ui.widget.q0
            @Override // java.lang.Runnable
            public final void run() {
                HightLightSettingView.this.m75742d(tooltipView);
            }
        }, j11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f69318v && canvas != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), this.f69312p, this.f69314r);
            canvas.drawRect(0.0f, this.f69312p + this.f69313q, getWidth(), getHeight(), this.f69314r);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        try {
            if (motionEvent.getAction() == 0) {
                if (this.f69315s == 1) {
                    m75743b();
                }
                View view = this.f69317u;
                if (view != null) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    getLocationOnScreen(iArr2);
                    this.f69312p = iArr[1] - iArr2[1];
                    this.f69313q = this.f69317u.getHeight();
                }
                if (motionEvent.getY() > this.f69312p && motionEvent.getY() < this.f69312p + this.f69313q) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f69315s != 1) {
                    if (z11) {
                        m75743b();
                    }
                    return false;
                }
                return !z11;
            }
        } catch (Exception unused) {
        }
        if (this.f69315s != 1) {
            return false;
        }
        return true;
    }
}
