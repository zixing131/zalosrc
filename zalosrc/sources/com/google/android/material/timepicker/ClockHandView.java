package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC1579n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {

    /* renamed from: A */
    private final int f36185A;

    /* renamed from: B */
    private float f36186B;

    /* renamed from: C */
    private boolean f36187C;

    /* renamed from: D */
    private double f36188D;

    /* renamed from: E */
    private int f36189E;

    /* renamed from: p */
    private ValueAnimator f36190p;

    /* renamed from: q */
    private boolean f36191q;

    /* renamed from: r */
    private float f36192r;

    /* renamed from: s */
    private float f36193s;

    /* renamed from: t */
    private boolean f36194t;

    /* renamed from: u */
    private int f36195u;

    /* renamed from: v */
    private final List f36196v;

    /* renamed from: w */
    private final int f36197w;

    /* renamed from: x */
    private final float f36198x;

    /* renamed from: y */
    private final Paint f36199y;

    /* renamed from: z */
    private final RectF f36200z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    /* loaded from: classes3.dex */
    public class C6448a implements ValueAnimator.AnimatorUpdateListener {
        C6448a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m33268m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    /* loaded from: classes3.dex */
    public class C6449b extends AnimatorListenerAdapter {
        C6449b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6450c {
        /* renamed from: a */
        void mo33262a(float f11, boolean z11);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.materialClockStyle);
    }

    /* renamed from: c */
    private void m33264c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f36189E * ((float) Math.cos(this.f36188D))) + width;
        float f11 = height;
        float sin = (this.f36189E * ((float) Math.sin(this.f36188D))) + f11;
        this.f36199y.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f36197w, this.f36199y);
        double sin2 = Math.sin(this.f36188D);
        double cos2 = Math.cos(this.f36188D);
        this.f36199y.setStrokeWidth(this.f36185A);
        canvas.drawLine(width, f11, r1 + ((int) (cos2 * r6)), height + ((int) (r6 * sin2)), this.f36199y);
        canvas.drawCircle(width, f11, this.f36198x, this.f36199y);
    }

    /* renamed from: e */
    private int m33265e(float f11, float f12) {
        int degrees = (int) Math.toDegrees(Math.atan2(f12 - (getHeight() / 2), f11 - (getWidth() / 2)));
        int i11 = degrees + 90;
        if (i11 < 0) {
            return degrees + 450;
        }
        return i11;
    }

    /* renamed from: h */
    private Pair m33266h(float f11) {
        float m33271f = m33271f();
        if (Math.abs(m33271f - f11) > 180.0f) {
            if (m33271f > 180.0f && f11 < 180.0f) {
                f11 += 360.0f;
            }
            if (m33271f < 180.0f && f11 > 180.0f) {
                m33271f += 360.0f;
            }
        }
        return new Pair(Float.valueOf(m33271f), Float.valueOf(f11));
    }

    /* renamed from: i */
    private boolean m33267i(float f11, float f12, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float m33265e = m33265e(f11, f12);
        boolean z15 = false;
        if (m33271f() != m33265e) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z12 && z14) {
            return true;
        }
        if (!z14 && !z11) {
            return false;
        }
        if (z13 && this.f36191q) {
            z15 = true;
        }
        m33275l(m33265e, z15);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m33268m(float f11, boolean z11) {
        float f12 = f11 % 360.0f;
        this.f36186B = f12;
        this.f36188D = Math.toRadians(f12 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f36189E * ((float) Math.cos(this.f36188D)));
        float sin = height + (this.f36189E * ((float) Math.sin(this.f36188D)));
        RectF rectF = this.f36200z;
        int i11 = this.f36197w;
        rectF.set(width - i11, sin - i11, width + i11, sin + i11);
        Iterator it = this.f36196v.iterator();
        while (it.hasNext()) {
            ((InterfaceC6450c) it.next()).mo33262a(f12, z11);
        }
        invalidate();
    }

    /* renamed from: b */
    public void m33269b(InterfaceC6450c interfaceC6450c) {
        this.f36196v.add(interfaceC6450c);
    }

    /* renamed from: d */
    public RectF m33270d() {
        return this.f36200z;
    }

    /* renamed from: f */
    public float m33271f() {
        return this.f36186B;
    }

    /* renamed from: g */
    public int m33272g() {
        return this.f36197w;
    }

    /* renamed from: j */
    public void m33273j(int i11) {
        this.f36189E = i11;
        invalidate();
    }

    /* renamed from: k */
    public void m33274k(float f11) {
        m33275l(f11, false);
    }

    /* renamed from: l */
    public void m33275l(float f11, boolean z11) {
        ValueAnimator valueAnimator = this.f36190p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            m33268m(f11, false);
            return;
        }
        Pair m33266h = m33266h(f11);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) m33266h.first).floatValue(), ((Float) m33266h.second).floatValue());
        this.f36190p = ofFloat;
        ofFloat.setDuration(200L);
        this.f36190p.addUpdateListener(new C6448a());
        this.f36190p.addListener(new C6449b());
        this.f36190p.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m33264c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m33274k(m33271f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z11 = false;
                z12 = false;
            } else {
                int i11 = (int) (x11 - this.f36192r);
                int i12 = (int) (y11 - this.f36193s);
                if ((i11 * i11) + (i12 * i12) > this.f36195u) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f36194t = z14;
                z11 = this.f36187C;
                if (actionMasked == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z13 = z15;
                z12 = false;
                this.f36187C |= m33267i(x11, y11, z11, z12, z13);
                return true;
            }
        } else {
            this.f36192r = x11;
            this.f36193s = y11;
            this.f36194t = true;
            this.f36187C = false;
            z11 = false;
            z12 = true;
        }
        z13 = false;
        this.f36187C |= m33267i(x11, y11, z11, z12, z13);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36196v = new ArrayList();
        Paint paint = new Paint();
        this.f36199y = paint;
        this.f36200z = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.ClockHandView, i11, AbstractC23586k.Widget_MaterialComponents_TimePicker_Clock);
        this.f36189E = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ClockHandView_materialCircleRadius, 0);
        this.f36197w = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ClockHandView_selectorSize, 0);
        this.f36185A = getResources().getDimensionPixelSize(AbstractC23579d.material_clock_hand_stroke_width);
        this.f36198x = r6.getDimensionPixelSize(AbstractC23579d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(AbstractC23587l.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m33274k(0.0f);
        this.f36195u = ViewConfiguration.get(context).getScaledTouchSlop();
        AbstractC1579n0.m7823L0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
