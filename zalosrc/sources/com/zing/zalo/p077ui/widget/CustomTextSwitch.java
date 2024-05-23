package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import au.InterpolatorC2355k;
import com.zing.zalo.AbstractC8923h0;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class CustomTextSwitch extends View {

    /* renamed from: b0 */
    static RectF f69115b0 = new RectF();

    /* renamed from: A */
    int f69116A;

    /* renamed from: B */
    float f69117B;

    /* renamed from: C */
    int f69118C;

    /* renamed from: D */
    float f69119D;

    /* renamed from: E */
    int f69120E;

    /* renamed from: F */
    float f69121F;

    /* renamed from: G */
    boolean f69122G;

    /* renamed from: H */
    String f69123H;

    /* renamed from: I */
    String f69124I;

    /* renamed from: J */
    int f69125J;

    /* renamed from: K */
    int f69126K;

    /* renamed from: L */
    int f69127L;

    /* renamed from: M */
    int f69128M;

    /* renamed from: N */
    int f69129N;

    /* renamed from: O */
    int f69130O;

    /* renamed from: P */
    int f69131P;

    /* renamed from: Q */
    int f69132Q;

    /* renamed from: R */
    int f69133R;

    /* renamed from: S */
    int f69134S;

    /* renamed from: T */
    C13491c[] f69135T;

    /* renamed from: U */
    final Region f69136U;

    /* renamed from: V */
    final Region f69137V;

    /* renamed from: W */
    final Region f69138W;

    /* renamed from: a0 */
    final Path f69139a0;

    /* renamed from: p */
    ValueAnimator f69140p;

    /* renamed from: q */
    ValueAnimator f69141q;

    /* renamed from: r */
    Paint f69142r;

    /* renamed from: s */
    Paint f69143s;

    /* renamed from: t */
    C13493e f69144t;

    /* renamed from: u */
    C13493e f69145u;

    /* renamed from: v */
    Context f69146v;

    /* renamed from: w */
    public boolean f69147w;

    /* renamed from: x */
    InterfaceC13492d f69148x;

    /* renamed from: y */
    int f69149y;

    /* renamed from: z */
    int f69150z;

    /* renamed from: com.zing.zalo.ui.widget.CustomTextSwitch$a */
    /* loaded from: classes6.dex */
    class C13489a extends AnimatorListenerAdapter {
        C13489a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CustomTextSwitch.this.setCheckedAndCheckOnChangeInternal(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            InterfaceC13492d interfaceC13492d = CustomTextSwitch.this.f69148x;
            if (interfaceC13492d != null) {
                interfaceC13492d.mo42880b(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.CustomTextSwitch$b */
    /* loaded from: classes6.dex */
    class C13490b extends AnimatorListenerAdapter {
        C13490b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            CustomTextSwitch.this.setCheckedAndCheckOnChangeInternal(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            InterfaceC13492d interfaceC13492d = CustomTextSwitch.this.f69148x;
            if (interfaceC13492d != null) {
                interfaceC13492d.mo42880b(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.CustomTextSwitch$c */
    /* loaded from: classes6.dex */
    public class C13491c {

        /* renamed from: a */
        final Path f69153a = new Path();

        /* renamed from: b */
        final Path f69154b = new Path();

        /* renamed from: c */
        final Path f69155c = new Path();

        /* renamed from: d */
        int f69156d;

        /* renamed from: e */
        int f69157e;

        C13491c(int i11, int i12, float f11) {
            m75672a(i11, i12, f11);
        }

        /* renamed from: a */
        void m75672a(int i11, int i12, float f11) {
            this.f69156d = i11;
            this.f69157e = i12;
            CustomTextSwitch customTextSwitch = CustomTextSwitch.this;
            if (customTextSwitch.f69117B == 0.0f) {
                Path path = customTextSwitch.f69139a0;
                int i13 = customTextSwitch.f69132Q;
                AbstractC23136l9.m118723k1(path, f11 + i13, i13 * 1.0f, f11 + i11, (i12 * 1.0f) - i13, customTextSwitch.f69129N);
            } else {
                Path path2 = customTextSwitch.f69139a0;
                int i14 = customTextSwitch.f69132Q;
                AbstractC23136l9.m118723k1(path2, f11, i14 * 1.0f, (f11 + i11) - i14, (i12 * 1.0f) - i14, customTextSwitch.f69129N);
            }
            Path path3 = this.f69153a;
            CustomTextSwitch customTextSwitch2 = CustomTextSwitch.this;
            Path path4 = customTextSwitch2.f69139a0;
            Path path5 = customTextSwitch2.f69144t.f69161c;
            Path.Op op2 = Path.Op.DIFFERENCE;
            path3.op(path4, path5, op2);
            Path path6 = this.f69153a;
            path6.op(path6, CustomTextSwitch.this.f69145u.f69161c, op2);
            Path path7 = this.f69154b;
            CustomTextSwitch customTextSwitch3 = CustomTextSwitch.this;
            path7.op(customTextSwitch3.f69144t.f69161c, customTextSwitch3.f69139a0, op2);
            Path path8 = this.f69155c;
            CustomTextSwitch customTextSwitch4 = CustomTextSwitch.this;
            path8.op(customTextSwitch4.f69145u.f69161c, customTextSwitch4.f69139a0, op2);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.CustomTextSwitch$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13492d {
        /* renamed from: a */
        void mo42879a(boolean z11);

        /* renamed from: b */
        void mo42880b(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.CustomTextSwitch$e */
    /* loaded from: classes6.dex */
    public class C13493e {

        /* renamed from: a */
        String f69159a;

        /* renamed from: d */
        int f69162d;

        /* renamed from: e */
        int f69163e;

        /* renamed from: f */
        int f69164f;

        /* renamed from: g */
        int f69165g;

        /* renamed from: h */
        int f69166h;

        /* renamed from: i */
        int f69167i;

        /* renamed from: j */
        int f69168j;

        /* renamed from: b */
        Paint f69160b = new Paint(1);

        /* renamed from: c */
        Path f69161c = new Path();

        /* renamed from: k */
        boolean f69169k = true;

        C13493e(String str, int i11, int i12, int i13, int i14) {
            this.f69159a = str;
            this.f69160b.setTextSize(i12);
            this.f69160b.setColor(i11);
            if (this.f69169k) {
                if (C13778s1.m76960a()) {
                    this.f69160b.setTypeface(C13718q1.m76694c(CustomTextSwitch.this.f69146v, 7));
                } else {
                    this.f69160b.setTypeface(Typeface.DEFAULT_BOLD);
                }
            } else {
                this.f69160b.setTypeface(Typeface.DEFAULT);
            }
            this.f69162d = i13;
            this.f69163e = i14;
            Paint.FontMetrics fontMetrics = this.f69160b.getFontMetrics();
            this.f69164f = (int) (fontMetrics.descent - fontMetrics.top);
            this.f69165g = (int) this.f69160b.measureText(this.f69159a);
            this.f69166h = this.f69164f + this.f69162d + this.f69163e;
        }

        /* renamed from: a */
        void m75673a(int i11, int i12) {
            Paint.FontMetrics fontMetrics = this.f69160b.getFontMetrics();
            this.f69168j = this.f69162d + ((int) (fontMetrics.leading - fontMetrics.top));
            this.f69167i = i11 + (((i12 - i11) - this.f69165g) / 2);
            Paint paint = this.f69160b;
            String str = this.f69159a;
            paint.getTextPath(str, 0, str.length(), this.f69167i, this.f69168j, this.f69161c);
        }
    }

    public CustomTextSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69142r = new Paint(1);
        this.f69143s = new Paint(1);
        this.f69117B = 0.0f;
        this.f69126K = 0;
        this.f69133R = 150;
        this.f69134S = 64;
        this.f69136U = new Region();
        this.f69137V = new Region();
        this.f69138W = new Region();
        this.f69139a0 = new Path();
        this.f69146v = context;
        this.f69118C = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.CustomTextSwitch);
        try {
            try {
                this.f69123H = obtainStyledAttributes.getString(AbstractC8923h0.CustomTextSwitch_ctw_text1);
                this.f69124I = obtainStyledAttributes.getString(AbstractC8923h0.CustomTextSwitch_ctw_text2);
                this.f69125J = obtainStyledAttributes.getColor(AbstractC8923h0.CustomTextSwitch_ctw_text_color, -16777216);
                this.f69127L = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.CustomTextSwitch_ctw_text_size, AbstractC23136l9.m118712h(context, 14.0f));
                this.f69128M = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.CustomTextSwitch_ctw_padding_top_bottom, AbstractC23136l9.m118712h(context, 10.0f));
                this.f69129N = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.CustomTextSwitch_ctw_radius, AbstractC23136l9.m118712h(context, 20.0f));
                this.f69130O = obtainStyledAttributes.getColor(AbstractC8923h0.CustomTextSwitch_ctw_slider_color, -16777216);
                this.f69131P = obtainStyledAttributes.getColor(AbstractC8923h0.CustomTextSwitch_ctw_stroke_color, 0);
                this.f69132Q = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.CustomTextSwitch_ctw_stroke_width, 0);
                this.f69126K = obtainStyledAttributes.getColor(AbstractC8923h0.CustomTextSwitch_ctw_slider_text_color, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            String str = this.f69123H;
            int i11 = this.f69125J;
            int i12 = this.f69127L;
            int i13 = this.f69128M;
            this.f69144t = new C13493e(str, i11, i12, i13, i13);
            String str2 = this.f69124I;
            int i14 = this.f69125J;
            int i15 = this.f69127L;
            int i16 = this.f69128M;
            this.f69145u = new C13493e(str2, i14, i15, i16, i16);
            this.f69142r.setColor(this.f69131P);
            this.f69142r.setStyle(Paint.Style.STROKE);
            this.f69142r.setStrokeWidth(this.f69132Q);
            this.f69143s.setColor(this.f69130O);
            this.f69143s.setStyle(Paint.Style.FILL);
            InterpolatorC2355k interpolatorC2355k = new InterpolatorC2355k(new PointF(0.25f, 0.1f), new PointF(0.25f, 1.0f));
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f69141q = valueAnimator;
            valueAnimator.setDuration(this.f69133R);
            this.f69141q.setInterpolator(interpolatorC2355k);
            this.f69141q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.v
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CustomTextSwitch.this.m75665d(valueAnimator2);
                }
            });
            this.f69141q.addListener(new C13489a());
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f69140p = valueAnimator2;
            valueAnimator2.setDuration(this.f69133R);
            this.f69140p.setInterpolator(interpolatorC2355k);
            this.f69140p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.w
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    CustomTextSwitch.this.m75666e(valueAnimator3);
                }
            });
            this.f69140p.addListener(new C13490b());
            this.f69135T = new C13491c[this.f69134S];
            this.f69147w = false;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m75665d(ValueAnimator valueAnimator) {
        m75668f(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m75666e(ValueAnimator valueAnimator) {
        m75668f(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: c */
    C13491c m75667c(float f11) {
        int round = Math.round((f11 / this.f69149y) * (this.f69134S - 1));
        C13491c[] c13491cArr = this.f69135T;
        C13491c c13491c = c13491cArr[round];
        if (c13491c == null) {
            c13491cArr[round] = new C13491c(this.f69149y, this.f69116A, f11);
        } else {
            int i11 = c13491c.f69156d;
            int i12 = this.f69149y;
            if (i11 != i12 || c13491c.f69157e != this.f69116A) {
                c13491c.m75672a(i12, this.f69116A, f11);
            }
        }
        return this.f69135T[round];
    }

    /* renamed from: f */
    void m75668f(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else {
            int i11 = this.f69149y;
            if (f11 > i11) {
                f11 = i11;
            }
        }
        this.f69117B = f11;
        invalidate();
    }

    /* renamed from: g */
    public void m75669g(boolean z11, boolean z12) {
        if (z12 || z11 != this.f69147w) {
            this.f69147w = z11;
            InterfaceC13492d interfaceC13492d = this.f69148x;
            if (interfaceC13492d != null) {
                interfaceC13492d.mo42879a(z11);
            }
            if (z11) {
                m75671i();
            } else {
                m75670h();
            }
        }
    }

    public int getAnimDuration() {
        return this.f69133R;
    }

    /* renamed from: h */
    void m75670h() {
        this.f69141q.setDuration((this.f69117B / this.f69149y) * this.f69133R);
        this.f69141q.setFloatValues(this.f69117B, 0.0f);
        this.f69141q.start();
    }

    /* renamed from: i */
    void m75671i() {
        ValueAnimator valueAnimator = this.f69140p;
        int i11 = this.f69149y;
        valueAnimator.setDuration(((i11 - this.f69117B) / i11) * this.f69133R);
        this.f69140p.setFloatValues(this.f69117B, this.f69150z - this.f69149y);
        this.f69140p.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = f69115b0;
        int i11 = this.f69132Q;
        rectF.set((i11 * 1.0f) / 2.0f, (i11 * 1.0f) / 2.0f, this.f69150z - ((i11 * 1.0f) / 2.0f), this.f69116A - ((i11 * 1.0f) / 2.0f));
        RectF rectF2 = f69115b0;
        int i12 = this.f69129N;
        canvas.drawRoundRect(rectF2, i12, i12, this.f69142r);
        canvas.drawPath(m75667c(this.f69117B).f69153a, this.f69143s);
        int i13 = this.f69126K;
        if (i13 != 0) {
            if (this.f69117B == 0.0f) {
                this.f69144t.f69160b.setColor(i13);
                this.f69145u.f69160b.setColor(this.f69125J);
            } else {
                this.f69144t.f69160b.setColor(this.f69125J);
                this.f69145u.f69160b.setColor(this.f69126K);
            }
            C13493e c13493e = this.f69144t;
            canvas.drawText(c13493e.f69159a, c13493e.f69167i, c13493e.f69168j, c13493e.f69160b);
            C13493e c13493e2 = this.f69145u;
            canvas.drawText(c13493e2.f69159a, c13493e2.f69167i, c13493e2.f69168j, c13493e2.f69160b);
            return;
        }
        canvas.drawPath(m75667c(this.f69117B).f69154b, this.f69144t.f69160b);
        canvas.drawPath(m75667c(this.f69117B).f69155c, this.f69145u.f69160b);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        this.f69150z = size;
        C13493e c13493e = this.f69144t;
        this.f69116A = c13493e.f69166h;
        this.f69149y = size / 2;
        c13493e.m75673a(this.f69132Q, size / 2);
        C13493e c13493e2 = this.f69145u;
        int i13 = this.f69150z;
        c13493e2.m75673a(i13 / 2, i13 - this.f69132Q);
        setMeasuredDimension(this.f69150z, this.f69116A);
        if (this.f69147w) {
            m75668f(this.f69150z - this.f69149y);
        } else {
            m75668f(0.0f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f69122G = false;
            this.f69119D = motionEvent.getX();
            this.f69121F = this.f69117B;
            this.f69120E = motionEvent.getPointerId(0);
        } else if (this.f69120E == motionEvent.getPointerId(0) && (action == 1 || action == 3 || action == 6)) {
            if (this.f69122G) {
                if (this.f69117B > this.f69149y / 2) {
                    m75671i();
                } else {
                    m75670h();
                }
            } else if (!this.f69147w && motionEvent.getX() > this.f69149y && motionEvent.getX() < this.f69150z) {
                m75671i();
            } else if (this.f69147w && motionEvent.getX() > 0.0f && motionEvent.getX() < this.f69149y) {
                m75670h();
            }
        } else if (this.f69120E == motionEvent.getPointerId(0) && action == 2) {
            float x11 = motionEvent.getX() - this.f69119D;
            if (this.f69122G) {
                m75668f(this.f69121F + x11);
            } else if (Math.abs(x11) > this.f69118C) {
                this.f69122G = true;
                m75668f(this.f69121F + x11);
            }
        }
        return true;
    }

    public void setChecked(boolean z11) {
        m75669g(z11, false);
    }

    void setCheckedAndCheckOnChangeInternal(boolean z11) {
        if (z11 != this.f69147w) {
            this.f69147w = z11;
            InterfaceC13492d interfaceC13492d = this.f69148x;
            if (interfaceC13492d != null) {
                interfaceC13492d.mo42879a(z11);
            }
        }
    }

    public void setOnCheckedChangeListener(InterfaceC13492d interfaceC13492d) {
        this.f69148x = interfaceC13492d;
    }
}
