package com.zing.zalo.p077ui.custom;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.p077ui.widget.clock.ClockListView;
import gg0.AbstractC19444a;

/* loaded from: classes5.dex */
public class FastScrollerView extends RelativeLayout implements View.OnTouchListener {

    /* renamed from: Q */
    private static final int[] f61636Q = {R.attr.state_pressed};

    /* renamed from: R */
    private static final int[] f61637R = new int[0];

    /* renamed from: A */
    int f61638A;

    /* renamed from: B */
    float f61639B;

    /* renamed from: C */
    int f61640C;

    /* renamed from: D */
    int f61641D;

    /* renamed from: E */
    float f61642E;

    /* renamed from: F */
    int f61643F;

    /* renamed from: G */
    int f61644G;

    /* renamed from: H */
    protected ClockListView f61645H;

    /* renamed from: I */
    private boolean f61646I;

    /* renamed from: J */
    private int f61647J;

    /* renamed from: K */
    private int f61648K;

    /* renamed from: L */
    private final int[] f61649L;

    /* renamed from: M */
    private final int[] f61650M;

    /* renamed from: N */
    final ValueAnimator f61651N;

    /* renamed from: O */
    int f61652O;

    /* renamed from: P */
    private final Runnable f61653P;

    /* renamed from: p */
    private final int f61654p;

    /* renamed from: q */
    private float f61655q;

    /* renamed from: r */
    private float f61656r;

    /* renamed from: s */
    final StateListDrawable f61657s;

    /* renamed from: t */
    final Drawable f61658t;

    /* renamed from: u */
    private final int f61659u;

    /* renamed from: v */
    private final int f61660v;

    /* renamed from: w */
    private final StateListDrawable f61661w;

    /* renamed from: x */
    private final Drawable f61662x;

    /* renamed from: y */
    private final int f61663y;

    /* renamed from: z */
    int f61664z;

    /* renamed from: b */
    private void m65818b() {
        this.f61645H.removeCallbacks(this.f61653P);
    }

    /* renamed from: c */
    private void m65819c(Canvas canvas) {
        int i11 = this.f61643F;
        int i12 = this.f61659u;
        int i13 = i11 - i12;
        int i14 = this.f61638A;
        int i15 = this.f61664z;
        int i16 = i15 / 2;
        this.f61657s.setBounds(0, 0, i12, i15);
        this.f61658t.setBounds(0, 0, this.f61660v, this.f61644G);
        if (m65821f()) {
            this.f61658t.draw(canvas);
            canvas.translate(this.f61659u, i14);
            canvas.scale(-1.0f, 1.0f);
            this.f61657s.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate(-this.f61659u, -i14);
            return;
        }
        float f11 = i13;
        canvas.translate(f11, 0.0f);
        this.f61658t.draw(canvas);
        canvas.translate(0.0f, i14);
        this.f61657s.draw(canvas);
        canvas.translate(-i13, -i14);
        canvas.save();
        canvas.translate(f11, (this.f61664z / 2) + i14);
        mo65827j(canvas, i13, i14 + (this.f61664z / 2));
        canvas.restore();
    }

    /* renamed from: d */
    private void m65820d(float f11) {
    }

    /* renamed from: f */
    private boolean m65821f() {
        if (AbstractC1579n0.m7812G(this.f61645H) == 1) {
            return true;
        }
        return false;
    }

    private int[] getHorizontalRange() {
        int[] iArr = this.f61650M;
        int i11 = this.f61654p;
        iArr[0] = i11;
        iArr[1] = this.f61643F - i11;
        return iArr;
    }

    private int[] getVerticalRange() {
        int[] iArr = this.f61649L;
        int i11 = this.f61654p;
        iArr[0] = i11;
        iArr[1] = this.f61644G - i11;
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m65822i() {
        invalidate();
        this.f61645H.invalidate();
    }

    /* renamed from: m */
    private void m65823m(int i11) {
        m65818b();
        this.f61645H.postDelayed(this.f61653P, i11);
    }

    /* renamed from: e */
    public boolean m65824e() {
        return this.f61647J == 2;
    }

    /* renamed from: g */
    boolean m65825g(float f11, float f12) {
        if (f12 >= this.f61644G - this.f61663y) {
            int i11 = this.f61641D;
            int i12 = this.f61640C;
            if (f11 >= i11 - (i12 / 2) && f11 <= i11 + (i12 / 2)) {
                return true;
            }
        }
        return false;
    }

    Drawable getHorizontalThumbDrawable() {
        return this.f61661w;
    }

    Drawable getHorizontalTrackDrawable() {
        return this.f61662x;
    }

    Drawable getVerticalThumbDrawable() {
        return this.f61657s;
    }

    Drawable getVerticalTrackDrawable() {
        return this.f61658t;
    }

    /* renamed from: h */
    boolean m65826h(float f11, float f12) {
        if (!m65821f() ? f11 >= this.f61643F - this.f61659u : f11 <= this.f61659u / 2) {
            if (f12 >= this.f61638A && f12 <= r3 + this.f61664z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void mo65827j(Canvas canvas, int i11, int i12) {
    }

    /* renamed from: k */
    float m65828k(float f11) {
        float max = Math.max(0.0f, f11 - this.f61655q);
        int i11 = this.f61644G;
        return (max / (i11 - (this.f61655q + this.f61656r))) * i11;
    }

    /* renamed from: l */
    void m65829l() {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.custom.h
            @Override // java.lang.Runnable
            public final void run() {
                FastScrollerView.this.m65822i();
            }
        });
    }

    /* renamed from: n */
    public void m65830n() {
        int i11 = this.f61652O;
        if (i11 != 0) {
            if (i11 == 3) {
                this.f61651N.cancel();
            } else {
                return;
            }
        }
        this.f61652O = 1;
        ValueAnimator valueAnimator = this.f61651N;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f61651N.setDuration(500L);
        this.f61651N.setStartDelay(0L);
        this.f61651N.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f61643F != getWidth() || this.f61644G != getHeight()) {
            this.f61643F = getWidth();
            this.f61644G = getHeight();
        }
        if (this.f61652O != 0 && this.f61646I) {
            m65819c(canvas);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f61647J == 0) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("y ");
        sb2.append(motionEvent.getY());
        sb2.append(" me.getAction() ");
        sb2.append(motionEvent.getAction());
        if (motionEvent.getAction() == 0) {
            boolean m65826h = m65826h(motionEvent.getX(), motionEvent.getY());
            boolean m65825g = m65825g(motionEvent.getX(), motionEvent.getY());
            if (m65826h || m65825g) {
                if (m65825g) {
                    this.f61648K = 1;
                    this.f61642E = (int) motionEvent.getX();
                } else if (m65826h) {
                    this.f61648K = 2;
                    this.f61639B = (int) m65828k(motionEvent.getY());
                }
                setState(2);
                return true;
            }
        } else if (motionEvent.getAction() == 1 && this.f61647J == 2) {
            this.f61639B = 0.0f;
            this.f61642E = 0.0f;
            setState(1);
            this.f61648K = 0;
            try {
                if (this.f61645H.getHeaderViewsCount() <= 0) {
                    if (this.f61645H.getFooterViewsCount() > 0) {
                    }
                }
                ((BaseAdapter) ((HeaderViewListAdapter) this.f61645H.getAdapter()).getWrappedAdapter()).notifyDataSetChanged();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } else if (motionEvent.getAction() == 2 && this.f61647J == 2) {
            m65830n();
            if (this.f61648K == 1) {
                m65820d(motionEvent.getX());
            }
            if (this.f61648K == 2) {
                m65831p(m65828k(motionEvent.getY()));
            }
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public void m65831p(float f11) {
        throw null;
    }

    void setState(int i11) {
        if (i11 == 2 && this.f61647J != 2) {
            this.f61657s.setState(f61636Q);
            m65818b();
        }
        if (i11 == 0) {
            m65829l();
        } else {
            m65830n();
        }
        if (this.f61647J == 2 && i11 != 2) {
            this.f61657s.setState(f61637R);
            m65823m(1200);
        } else if (i11 == 1) {
            m65823m(1500);
        }
        this.f61647J = i11;
    }
}
