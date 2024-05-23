package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class CustomSwitch extends FrameLayout {

    /* renamed from: L */
    public static int f69082L;

    /* renamed from: M */
    public static int f69083M;

    /* renamed from: N */
    public static int f69084N;

    /* renamed from: O */
    public static int f69085O;

    /* renamed from: P */
    public static int f69086P;

    /* renamed from: Q */
    public static int f69087Q;

    /* renamed from: R */
    public static int f69088R;

    /* renamed from: A */
    int f69089A;

    /* renamed from: B */
    float f69090B;

    /* renamed from: C */
    boolean f69091C;

    /* renamed from: D */
    ValueAnimator f69092D;

    /* renamed from: E */
    ValueAnimator f69093E;

    /* renamed from: F */
    boolean f69094F;

    /* renamed from: G */
    InterfaceC13487c f69095G;

    /* renamed from: H */
    InterfaceC13488d f69096H;

    /* renamed from: I */
    boolean f69097I;

    /* renamed from: J */
    int f69098J;

    /* renamed from: K */
    int f69099K;

    /* renamed from: p */
    RecyclingImageView f69100p;

    /* renamed from: q */
    RecyclingImageView f69101q;

    /* renamed from: r */
    RecyclingImageView f69102r;

    /* renamed from: s */
    RecyclingImageView f69103s;

    /* renamed from: t */
    int f69104t;

    /* renamed from: u */
    int f69105u;

    /* renamed from: v */
    int f69106v;

    /* renamed from: w */
    int f69107w;

    /* renamed from: x */
    boolean f69108x;

    /* renamed from: y */
    int f69109y;

    /* renamed from: z */
    float f69110z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.CustomSwitch$a */
    /* loaded from: classes6.dex */
    public class C13485a extends AnimatorListenerAdapter {
        C13485a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CustomSwitch customSwitch = CustomSwitch.this;
            customSwitch.f69100p.setImageResource(customSwitch.f69104t);
            CustomSwitch customSwitch2 = CustomSwitch.this;
            customSwitch2.f69101q.setImageResource(customSwitch2.f69107w);
            CustomSwitch.this.f69102r.setImageResource(AbstractC16803z.red_dot_inactive);
            CustomSwitch customSwitch3 = CustomSwitch.this;
            InterfaceC13487c interfaceC13487c = customSwitch3.f69095G;
            if (interfaceC13487c != null && customSwitch3.f69097I) {
                interfaceC13487c.mo75661a(false);
            }
            CustomSwitch.this.f69094F = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.CustomSwitch$b */
    /* loaded from: classes6.dex */
    public class C13486b extends AnimatorListenerAdapter {
        C13486b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CustomSwitch customSwitch = CustomSwitch.this;
            customSwitch.f69100p.setImageResource(customSwitch.f69106v);
            CustomSwitch customSwitch2 = CustomSwitch.this;
            customSwitch2.f69101q.setImageResource(customSwitch2.f69105u);
            CustomSwitch.this.f69102r.setImageResource(AbstractC16803z.red_dot);
            CustomSwitch customSwitch3 = CustomSwitch.this;
            InterfaceC13487c interfaceC13487c = customSwitch3.f69095G;
            if (interfaceC13487c != null && customSwitch3.f69097I) {
                interfaceC13487c.mo75661a(true);
            }
            CustomSwitch.this.f69094F = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.CustomSwitch$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC13487c {
        /* renamed from: a */
        void mo75661a(boolean z11);
    }

    /* renamed from: com.zing.zalo.ui.widget.CustomSwitch$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13488d {
        /* renamed from: a */
        void mo75662a(View view, boolean z11);
    }

    public CustomSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69108x = false;
        this.f69109y = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f69097I = false;
        this.f69098J = 0;
        this.f69099K = 0;
        m75651d();
    }

    /* renamed from: c */
    private void m75648c() {
        try {
            removeAllViews();
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(f69082L, f69087Q, 16);
            RecyclingImageView recyclingImageView = this.f69103s;
            int i11 = this.f69099K;
            recyclingImageView.setPadding(i11, i11, i11, i11);
            addView(this.f69103s, layoutParams);
            int i12 = f69084N;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, i12, 19);
            layoutParams2.leftMargin = (f69082L - f69084N) / 2;
            addView(this.f69100p, layoutParams2);
            int i13 = f69085O;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i13, i13, 21);
            layoutParams3.rightMargin = (f69083M - f69085O) / 2;
            addView(this.f69101q, layoutParams3);
            int i14 = f69088R;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i14, i14, 5);
            int i15 = f69083M;
            int i16 = f69085O;
            int i17 = f69088R;
            layoutParams4.rightMargin = ((i15 - i16) - i17) / 2;
            layoutParams4.topMargin = (((f69087Q - i16) - i17) + AbstractC23136l9.m118742r(5.0f)) / 2;
            addView(this.f69102r, layoutParams4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m75649h(ValueAnimator valueAnimator) {
        setThumbPos(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m75650i(ValueAnimator valueAnimator) {
        setThumbPos(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: d */
    void m75651d() {
        m75653f(AbstractC16803z.bg_track_gradient, AbstractC16803z.bg_thumb_switch, AbstractC16803z.icn_aa_inactive, AbstractC16803z.icn_aa_active, AbstractC16803z.icn_magic_inactive, AbstractC16803z.icn_magic_active);
        m75654g(AbstractC23136l9.m118742r(75.0f), AbstractC23136l9.m118742r(75.0f), AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(15.0f), AbstractC23136l9.m118742r(15.0f), AbstractC23136l9.m118742r(8.0f));
        m75652e();
        this.f69094F = false;
        m75648c();
    }

    /* renamed from: e */
    public void m75652e() {
        try {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f69093E = valueAnimator;
            valueAnimator.setDuration(100L);
            this.f69093E.setInterpolator(new AccelerateInterpolator());
            this.f69093E.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CustomSwitch.this.m75649h(valueAnimator2);
                }
            });
            this.f69093E.addListener(new C13485a());
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f69092D = valueAnimator2;
            valueAnimator2.setDuration(100L);
            this.f69092D.setInterpolator(new AccelerateInterpolator());
            this.f69092D.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.u
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    CustomSwitch.this.m75650i(valueAnimator3);
                }
            });
            this.f69092D.addListener(new C13486b());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m75653f(int i11, int i12, int i13, int i14, int i15, int i16) {
        try {
            setBackgroundResource(i11);
            if (this.f69103s == null) {
                this.f69103s = new RecyclingImageView(getContext());
            }
            this.f69103s.setImageResource(i12);
            if (this.f69100p == null) {
                this.f69100p = new RecyclingImageView(getContext());
            }
            this.f69104t = i14;
            this.f69106v = i13;
            this.f69100p.setImageResource(i14);
            if (this.f69101q == null) {
                this.f69101q = new RecyclingImageView(getContext());
            }
            this.f69105u = i16;
            this.f69107w = i15;
            this.f69101q.setImageResource(i15);
            if (this.f69102r == null) {
                this.f69102r = new RecyclingImageView(getContext());
            }
            this.f69102r.setImageResource(AbstractC16803z.red_dot_inactive);
            AbstractC23136l9.m118744r1(this.f69102r, 8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m75654g(int i11, int i12, int i13, int i14, int i15, int i16) {
        f69082L = i11;
        f69083M = i12;
        f69086P = i11 + i12;
        f69087Q = i13;
        f69084N = i14;
        f69085O = i15;
        f69088R = i16;
        m75648c();
        requestLayout();
    }

    public View getIcnRight() {
        return this.f69101q;
    }

    /* renamed from: j */
    public void m75655j(boolean z11, boolean z12) {
        this.f69094F = z11;
        this.f69097I = z12;
        if (z11) {
            m75658m();
        } else {
            m75657l();
        }
    }

    /* renamed from: k */
    public void m75656k(boolean z11, boolean z12) {
        this.f69094F = z11;
        this.f69097I = z12;
        if (z11) {
            m75660p();
        } else {
            m75659n();
        }
    }

    /* renamed from: l */
    void m75657l() {
        this.f69093E.setFloatValues(this.f69103s.getX(), 0.0f);
        this.f69093E.start();
    }

    /* renamed from: m */
    void m75658m() {
        this.f69092D.setFloatValues(this.f69103s.getX(), f69082L);
        this.f69092D.start();
    }

    /* renamed from: n */
    void m75659n() {
        try {
            setThumbPos(0.0f);
            this.f69100p.setImageResource(this.f69104t);
            this.f69101q.setImageResource(this.f69107w);
            this.f69102r.setImageResource(AbstractC16803z.red_dot_inactive);
            InterfaceC13487c interfaceC13487c = this.f69095G;
            if (interfaceC13487c != null && this.f69097I) {
                interfaceC13487c.mo75661a(false);
            }
            this.f69094F = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        setMeasuredDimension(f69086P, f69087Q);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC13488d interfaceC13488d;
        boolean z11 = false;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f69091C = false;
            this.f69110z = motionEvent.getX();
            this.f69090B = this.f69103s.getX();
            this.f69089A = motionEvent.getPointerId(0);
        } else if (this.f69089A == motionEvent.getPointerId(0) && (action == 1 || action == 3 || action == 6)) {
            this.f69097I = true;
            if (this.f69091C) {
                if (this.f69103s.getX() > f69082L / 2) {
                    m75658m();
                    z11 = true;
                    interfaceC13488d = this.f69096H;
                    if (interfaceC13488d != null) {
                        interfaceC13488d.mo75662a(this, z11);
                    }
                } else {
                    m75657l();
                    interfaceC13488d = this.f69096H;
                    if (interfaceC13488d != null) {
                    }
                }
            } else if (this.f69098J == 1) {
                if (!this.f69094F && motionEvent.getX() > f69082L && motionEvent.getX() < f69086P) {
                    m75658m();
                    z11 = true;
                    interfaceC13488d = this.f69096H;
                    if (interfaceC13488d != null) {
                    }
                } else {
                    if (this.f69094F && motionEvent.getX() > 0.0f && motionEvent.getX() < f69082L) {
                        m75657l();
                    }
                    interfaceC13488d = this.f69096H;
                    if (interfaceC13488d != null) {
                    }
                }
            } else {
                if (motionEvent.getX() > 0.0f && motionEvent.getX() < f69086P) {
                    if (this.f69094F) {
                        m75657l();
                    } else {
                        m75658m();
                        z11 = true;
                    }
                }
                interfaceC13488d = this.f69096H;
                if (interfaceC13488d != null) {
                }
            }
        } else if (this.f69089A == motionEvent.getPointerId(0) && action == 2) {
            float x11 = motionEvent.getX() - this.f69110z;
            if (this.f69091C) {
                setThumbPos(this.f69090B + x11);
            } else if (Math.abs(x11) > this.f69109y) {
                this.f69091C = true;
                setThumbPos(this.f69090B + x11);
            }
        }
        return true;
    }

    /* renamed from: p */
    void m75660p() {
        try {
            setThumbPos(f69082L);
            this.f69100p.setImageResource(this.f69106v);
            this.f69101q.setImageResource(this.f69105u);
            this.f69102r.setImageResource(AbstractC16803z.red_dot);
            InterfaceC13487c interfaceC13487c = this.f69095G;
            if (interfaceC13487c != null && this.f69097I) {
                interfaceC13487c.mo75661a(true);
            }
            this.f69094F = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setEnableRedDot(boolean z11) {
        this.f69108x = z11;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        float f11;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        setAlpha(f11);
        super.setEnabled(z11);
    }

    public void setModeView(int i11) {
        this.f69098J = i11;
    }

    public void setOnCheckedChangeListener(InterfaceC13487c interfaceC13487c) {
        this.f69095G = interfaceC13487c;
    }

    public void setOnCustomClickDragListener(InterfaceC13488d interfaceC13488d) {
        this.f69096H = interfaceC13488d;
    }

    public void setPaddingRect(int i11) {
        this.f69099K = i11;
    }

    void setThumbPos(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        int i11 = f69082L;
        if (f11 > i11) {
            f11 = i11;
        }
        this.f69103s.setX(f11);
    }

    public void setVisibilityReddot(int i11) {
        if (this.f69108x) {
            this.f69102r.setVisibility(i11);
        }
    }

    public CustomSwitch(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69108x = false;
        this.f69109y = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f69097I = false;
        this.f69098J = 0;
        this.f69099K = 0;
        m75651d();
    }
}
