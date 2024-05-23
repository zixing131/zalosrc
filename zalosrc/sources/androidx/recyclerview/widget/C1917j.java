package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.AbstractC1579n0;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes2.dex */
public class C1917j extends RecyclerView.AbstractC1887n implements RecyclerView.InterfaceC1891r {

    /* renamed from: D */
    private static final int[] f8080D = {R.attr.state_pressed};

    /* renamed from: E */
    private static final int[] f8081E = new int[0];

    /* renamed from: A */
    int f8082A;

    /* renamed from: B */
    private final Runnable f8083B;

    /* renamed from: C */
    private final RecyclerView.AbstractC1892s f8084C;

    /* renamed from: a */
    private final int f8085a;

    /* renamed from: b */
    private final int f8086b;

    /* renamed from: c */
    final StateListDrawable f8087c;

    /* renamed from: d */
    final Drawable f8088d;

    /* renamed from: e */
    private final int f8089e;

    /* renamed from: f */
    private final int f8090f;

    /* renamed from: g */
    private final StateListDrawable f8091g;

    /* renamed from: h */
    private final Drawable f8092h;

    /* renamed from: i */
    private final int f8093i;

    /* renamed from: j */
    private final int f8094j;

    /* renamed from: k */
    int f8095k;

    /* renamed from: l */
    int f8096l;

    /* renamed from: m */
    float f8097m;

    /* renamed from: n */
    int f8098n;

    /* renamed from: o */
    int f8099o;

    /* renamed from: p */
    float f8100p;

    /* renamed from: s */
    private RecyclerView f8103s;

    /* renamed from: z */
    final ValueAnimator f8110z;

    /* renamed from: q */
    private int f8101q = 0;

    /* renamed from: r */
    private int f8102r = 0;

    /* renamed from: t */
    private boolean f8104t = false;

    /* renamed from: u */
    private boolean f8105u = false;

    /* renamed from: v */
    private int f8106v = 0;

    /* renamed from: w */
    private int f8107w = 0;

    /* renamed from: x */
    private final int[] f8108x = new int[2];

    /* renamed from: y */
    private final int[] f8109y = new int[2];

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1917j.this.m10528s(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes2.dex */
    class b extends RecyclerView.AbstractC1892s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            C1917j.this.m10526D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    /* loaded from: classes2.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f8113p = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8113p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8113p) {
                this.f8113p = false;
                return;
            }
            if (((Float) C1917j.this.f8110z.getAnimatedValue()).floatValue() == 0.0f) {
                C1917j c1917j = C1917j.this;
                c1917j.f8082A = 0;
                c1917j.m10524A(0);
            } else {
                C1917j c1917j2 = C1917j.this;
                c1917j2.f8082A = 2;
                c1917j2.m10531x();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    /* loaded from: classes2.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1917j.this.f8087c.setAlpha(floatValue);
            C1917j.this.f8088d.setAlpha(floatValue);
            C1917j.this.m10531x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1917j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8110z = ofFloat;
        this.f8082A = 0;
        this.f8083B = new a();
        this.f8084C = new b();
        this.f8087c = stateListDrawable;
        this.f8088d = drawable;
        this.f8091g = stateListDrawable2;
        this.f8092h = drawable2;
        this.f8089e = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f8090f = Math.max(i11, drawable.getIntrinsicWidth());
        this.f8093i = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.f8094j = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f8085a = i12;
        this.f8086b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        m10527l(recyclerView);
    }

    /* renamed from: B */
    private void m10512B() {
        this.f8103s.m9816A(this);
        this.f8103s.m9825D(this);
        this.f8103s.m9826E(this.f8084C);
    }

    /* renamed from: E */
    private void m10513E(float f11) {
        int[] m10519r = m10519r();
        float max = Math.max(m10519r[0], Math.min(m10519r[1], f11));
        if (Math.abs(this.f8096l - max) < 2.0f) {
            return;
        }
        int m10523z = m10523z(this.f8097m, max, m10519r, this.f8103s.computeVerticalScrollRange(), this.f8103s.computeVerticalScrollOffset(), this.f8102r);
        if (m10523z != 0) {
            this.f8103s.scrollBy(0, m10523z);
        }
        this.f8097m = max;
    }

    /* renamed from: m */
    private void m10514m() {
        this.f8103s.removeCallbacks(this.f8083B);
    }

    /* renamed from: n */
    private void m10515n() {
        this.f8103s.m9907x1(this);
        this.f8103s.m9818A1(this);
        this.f8103s.m9821B1(this.f8084C);
        m10514m();
    }

    /* renamed from: o */
    private void m10516o(Canvas canvas) {
        int i11 = this.f8102r;
        int i12 = this.f8093i;
        int i13 = this.f8099o;
        int i14 = this.f8098n;
        this.f8091g.setBounds(0, 0, i14, i12);
        this.f8092h.setBounds(0, 0, this.f8101q, this.f8094j);
        canvas.translate(0.0f, i11 - i12);
        this.f8092h.draw(canvas);
        canvas.translate(i13 - (i14 / 2), 0.0f);
        this.f8091g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: p */
    private void m10517p(Canvas canvas) {
        int i11 = this.f8101q;
        int i12 = this.f8089e;
        int i13 = i11 - i12;
        int i14 = this.f8096l;
        int i15 = this.f8095k;
        int i16 = i14 - (i15 / 2);
        this.f8087c.setBounds(0, 0, i12, i15);
        this.f8088d.setBounds(0, 0, this.f8090f, this.f8102r);
        if (m10521u()) {
            this.f8088d.draw(canvas);
            canvas.translate(this.f8089e, i16);
            canvas.scale(-1.0f, 1.0f);
            this.f8087c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate(-this.f8089e, -i16);
            return;
        }
        canvas.translate(i13, 0.0f);
        this.f8088d.draw(canvas);
        canvas.translate(0.0f, i16);
        this.f8087c.draw(canvas);
        canvas.translate(-i13, -i16);
    }

    /* renamed from: q */
    private int[] m10518q() {
        int[] iArr = this.f8109y;
        int i11 = this.f8086b;
        iArr[0] = i11;
        iArr[1] = this.f8101q - i11;
        return iArr;
    }

    /* renamed from: r */
    private int[] m10519r() {
        int[] iArr = this.f8108x;
        int i11 = this.f8086b;
        iArr[0] = i11;
        iArr[1] = this.f8102r - i11;
        return iArr;
    }

    /* renamed from: t */
    private void m10520t(float f11) {
        int[] m10518q = m10518q();
        float max = Math.max(m10518q[0], Math.min(m10518q[1], f11));
        if (Math.abs(this.f8099o - max) < 2.0f) {
            return;
        }
        int m10523z = m10523z(this.f8100p, max, m10518q, this.f8103s.computeHorizontalScrollRange(), this.f8103s.computeHorizontalScrollOffset(), this.f8101q);
        if (m10523z != 0) {
            this.f8103s.scrollBy(m10523z, 0);
        }
        this.f8100p = max;
    }

    /* renamed from: u */
    private boolean m10521u() {
        if (AbstractC1579n0.m7812G(this.f8103s) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private void m10522y(int i11) {
        m10514m();
        this.f8103s.postDelayed(this.f8083B, i11);
    }

    /* renamed from: z */
    private int m10523z(float f11, float f12, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 == 0) {
            return 0;
        }
        int i15 = i11 - i13;
        int i16 = (int) (((f12 - f11) / i14) * i15);
        int i17 = i12 + i16;
        if (i17 >= i15 || i17 < 0) {
            return 0;
        }
        return i16;
    }

    /* renamed from: A */
    void m10524A(int i11) {
        if (i11 == 2 && this.f8106v != 2) {
            this.f8087c.setState(f8080D);
            m10514m();
        }
        if (i11 == 0) {
            m10531x();
        } else {
            m10525C();
        }
        if (this.f8106v == 2 && i11 != 2) {
            this.f8087c.setState(f8081E);
            m10522y(1200);
        } else if (i11 == 1) {
            m10522y(1500);
        }
        this.f8106v = i11;
    }

    /* renamed from: C */
    public void m10525C() {
        int i11 = this.f8082A;
        if (i11 != 0) {
            if (i11 == 3) {
                this.f8110z.cancel();
            } else {
                return;
            }
        }
        this.f8082A = 1;
        ValueAnimator valueAnimator = this.f8110z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f8110z.setDuration(500L);
        this.f8110z.setStartDelay(0L);
        this.f8110z.start();
    }

    /* renamed from: D */
    void m10526D(int i11, int i12) {
        boolean z11;
        boolean z12;
        int computeVerticalScrollRange = this.f8103s.computeVerticalScrollRange();
        int i13 = this.f8102r;
        if (computeVerticalScrollRange - i13 > 0 && i13 >= this.f8085a) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f8104t = z11;
        int computeHorizontalScrollRange = this.f8103s.computeHorizontalScrollRange();
        int i14 = this.f8101q;
        if (computeHorizontalScrollRange - i14 > 0 && i14 >= this.f8085a) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f8105u = z12;
        boolean z13 = this.f8104t;
        if (!z13 && !z12) {
            if (this.f8106v != 0) {
                m10524A(0);
                return;
            }
            return;
        }
        if (z13) {
            float f11 = i13;
            this.f8096l = (int) ((f11 * (i12 + (f11 / 2.0f))) / computeVerticalScrollRange);
            this.f8095k = Math.min(i13, (i13 * i13) / computeVerticalScrollRange);
        }
        if (this.f8105u) {
            float f12 = i14;
            this.f8099o = (int) ((f12 * (i11 + (f12 / 2.0f))) / computeHorizontalScrollRange);
            this.f8098n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
        }
        int i15 = this.f8106v;
        if (i15 == 0 || i15 == 1) {
            m10524A(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f8106v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m10530w = m10530w(motionEvent.getX(), motionEvent.getY());
            boolean m10529v = m10529v(motionEvent.getX(), motionEvent.getY());
            if (m10530w || m10529v) {
                if (m10529v) {
                    this.f8107w = 1;
                    this.f8100p = (int) motionEvent.getX();
                } else if (m10530w) {
                    this.f8107w = 2;
                    this.f8097m = (int) motionEvent.getY();
                }
                m10524A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f8106v == 2) {
            this.f8097m = 0.0f;
            this.f8100p = 0.0f;
            m10524A(1);
            this.f8107w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f8106v == 2) {
            m10525C();
            if (this.f8107w == 1) {
                m10520t(motionEvent.getX());
            }
            if (this.f8107w == 2) {
                m10513E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: c */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i11 = this.f8106v;
        if (i11 == 1) {
            boolean m10530w = m10530w(motionEvent.getX(), motionEvent.getY());
            boolean m10529v = m10529v(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m10530w && !m10529v) {
                return false;
            }
            if (m10529v) {
                this.f8107w = 1;
                this.f8100p = (int) motionEvent.getX();
            } else if (m10530w) {
                this.f8107w = 2;
                this.f8097m = (int) motionEvent.getY();
            }
            m10524A(2);
        } else if (i11 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
    /* renamed from: e */
    public void mo954e(boolean z11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: k */
    public void mo10070k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        if (this.f8101q == this.f8103s.getWidth() && this.f8102r == this.f8103s.getHeight()) {
            if (this.f8082A != 0) {
                if (this.f8104t) {
                    m10517p(canvas);
                }
                if (this.f8105u) {
                    m10516o(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f8101q = this.f8103s.getWidth();
        this.f8102r = this.f8103s.getHeight();
        m10524A(0);
    }

    /* renamed from: l */
    public void m10527l(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f8103s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m10515n();
        }
        this.f8103s = recyclerView;
        if (recyclerView != null) {
            m10512B();
        }
    }

    /* renamed from: s */
    void m10528s(int i11) {
        int i12 = this.f8082A;
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
        } else {
            this.f8110z.cancel();
        }
        this.f8082A = 3;
        ValueAnimator valueAnimator = this.f8110z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f8110z.setDuration(i11);
        this.f8110z.start();
    }

    /* renamed from: v */
    boolean m10529v(float f11, float f12) {
        if (f12 >= this.f8102r - this.f8093i) {
            int i11 = this.f8099o;
            int i12 = this.f8098n;
            if (f11 >= i11 - (i12 / 2) && f11 <= i11 + (i12 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    boolean m10530w(float f11, float f12) {
        if (!m10521u() ? f11 >= this.f8101q - this.f8089e : f11 <= this.f8089e / 2) {
            int i11 = this.f8096l;
            int i12 = this.f8095k;
            if (f12 >= i11 - (i12 / 2) && f12 <= i11 + (i12 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    void m10531x() {
        this.f8103s.invalidate();
    }
}
