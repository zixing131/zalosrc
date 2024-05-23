package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;

/* renamed from: androidx.core.widget.a */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC1629a implements View.OnTouchListener {

    /* renamed from: G */
    private static final int f6635G = ViewConfiguration.getTapTimeout();

    /* renamed from: A */
    private boolean f6636A;

    /* renamed from: B */
    boolean f6637B;

    /* renamed from: C */
    boolean f6638C;

    /* renamed from: D */
    boolean f6639D;

    /* renamed from: E */
    private boolean f6640E;

    /* renamed from: F */
    private boolean f6641F;

    /* renamed from: r */
    final View f6644r;

    /* renamed from: s */
    private Runnable f6645s;

    /* renamed from: v */
    private int f6648v;

    /* renamed from: w */
    private int f6649w;

    /* renamed from: p */
    final a f6642p = new a();

    /* renamed from: q */
    private final Interpolator f6643q = new AccelerateInterpolator();

    /* renamed from: t */
    private float[] f6646t = {0.0f, 0.0f};

    /* renamed from: u */
    private float[] f6647u = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: x */
    private float[] f6650x = {0.0f, 0.0f};

    /* renamed from: y */
    private float[] f6651y = {0.0f, 0.0f};

    /* renamed from: z */
    private float[] f6652z = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private int f6653a;

        /* renamed from: b */
        private int f6654b;

        /* renamed from: c */
        private float f6655c;

        /* renamed from: d */
        private float f6656d;

        /* renamed from: j */
        private float f6662j;

        /* renamed from: k */
        private int f6663k;

        /* renamed from: e */
        private long f6657e = Long.MIN_VALUE;

        /* renamed from: i */
        private long f6661i = -1;

        /* renamed from: f */
        private long f6658f = 0;

        /* renamed from: g */
        private int f6659g = 0;

        /* renamed from: h */
        private int f6660h = 0;

        a() {
        }

        /* renamed from: e */
        private float m8359e(long j11) {
            long j12 = this.f6657e;
            if (j11 < j12) {
                return 0.0f;
            }
            long j13 = this.f6661i;
            if (j13 >= 0 && j11 >= j13) {
                float f11 = this.f6662j;
                return (1.0f - f11) + (f11 * AbstractViewOnTouchListenerC1629a.m8338e(((float) (j11 - j13)) / this.f6663k, 0.0f, 1.0f));
            }
            return AbstractViewOnTouchListenerC1629a.m8338e(((float) (j11 - j12)) / this.f6653a, 0.0f, 1.0f) * 0.5f;
        }

        /* renamed from: g */
        private float m8360g(float f11) {
            return ((-4.0f) * f11 * f11) + (f11 * 4.0f);
        }

        /* renamed from: a */
        public void m8361a() {
            if (this.f6658f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m8360g = m8360g(m8359e(currentAnimationTimeMillis));
                long j11 = currentAnimationTimeMillis - this.f6658f;
                this.f6658f = currentAnimationTimeMillis;
                float f11 = ((float) j11) * m8360g;
                this.f6659g = (int) (this.f6655c * f11);
                this.f6660h = (int) (f11 * this.f6656d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int m8362b() {
            return this.f6659g;
        }

        /* renamed from: c */
        public int m8363c() {
            return this.f6660h;
        }

        /* renamed from: d */
        public int m8364d() {
            float f11 = this.f6655c;
            return (int) (f11 / Math.abs(f11));
        }

        /* renamed from: f */
        public int m8365f() {
            float f11 = this.f6656d;
            return (int) (f11 / Math.abs(f11));
        }

        /* renamed from: h */
        public boolean m8366h() {
            if (this.f6661i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f6661i + this.f6663k) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public void m8367i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f6663k = AbstractViewOnTouchListenerC1629a.m8339f((int) (currentAnimationTimeMillis - this.f6657e), 0, this.f6654b);
            this.f6662j = m8359e(currentAnimationTimeMillis);
            this.f6661i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m8368j(int i11) {
            this.f6654b = i11;
        }

        /* renamed from: k */
        public void m8369k(int i11) {
            this.f6653a = i11;
        }

        /* renamed from: l */
        public void m8370l(float f11, float f12) {
            this.f6655c = f11;
            this.f6656d = f12;
        }

        /* renamed from: m */
        public void m8371m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f6657e = currentAnimationTimeMillis;
            this.f6661i = -1L;
            this.f6658f = currentAnimationTimeMillis;
            this.f6662j = 0.5f;
            this.f6659g = 0;
            this.f6660h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC1629a abstractViewOnTouchListenerC1629a = AbstractViewOnTouchListenerC1629a.this;
            if (!abstractViewOnTouchListenerC1629a.f6639D) {
                return;
            }
            if (abstractViewOnTouchListenerC1629a.f6637B) {
                abstractViewOnTouchListenerC1629a.f6637B = false;
                abstractViewOnTouchListenerC1629a.f6642p.m8371m();
            }
            a aVar = AbstractViewOnTouchListenerC1629a.this.f6642p;
            if (!aVar.m8366h() && AbstractViewOnTouchListenerC1629a.this.m8358u()) {
                AbstractViewOnTouchListenerC1629a abstractViewOnTouchListenerC1629a2 = AbstractViewOnTouchListenerC1629a.this;
                if (abstractViewOnTouchListenerC1629a2.f6638C) {
                    abstractViewOnTouchListenerC1629a2.f6638C = false;
                    abstractViewOnTouchListenerC1629a2.m8346c();
                }
                aVar.m8361a();
                AbstractViewOnTouchListenerC1629a.this.mo8347j(aVar.m8362b(), aVar.m8363c());
                AbstractC1579n0.m7900s0(AbstractViewOnTouchListenerC1629a.this.f6644r, this);
                return;
            }
            AbstractViewOnTouchListenerC1629a.this.f6639D = false;
        }
    }

    public AbstractViewOnTouchListenerC1629a(View view) {
        this.f6644r = view;
        float f11 = Resources.getSystem().getDisplayMetrics().density;
        float f12 = (int) ((1575.0f * f11) + 0.5f);
        m8352o(f12, f12);
        float f13 = (int) ((f11 * 315.0f) + 0.5f);
        m8353p(f13, f13);
        m8349l(1);
        m8351n(Float.MAX_VALUE, Float.MAX_VALUE);
        m8356s(0.2f, 0.2f);
        m8357t(1.0f, 1.0f);
        m8348k(f6635G);
        m8355r(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        m8354q(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
    }

    /* renamed from: d */
    private float m8337d(int i11, float f11, float f12, float f13) {
        float m8341h = m8341h(this.f6646t[i11], f12, this.f6647u[i11], f11);
        if (m8341h == 0.0f) {
            return 0.0f;
        }
        float f14 = this.f6650x[i11];
        float f15 = this.f6651y[i11];
        float f16 = this.f6652z[i11];
        float f17 = f14 * f13;
        if (m8341h > 0.0f) {
            return m8338e(m8341h * f17, f15, f16);
        }
        return -m8338e((-m8341h) * f17, f15, f16);
    }

    /* renamed from: e */
    static float m8338e(float f11, float f12, float f13) {
        return f11 > f13 ? f13 : f11 < f12 ? f12 : f11;
    }

    /* renamed from: f */
    static int m8339f(int i11, int i12, int i13) {
        return i11 > i13 ? i13 : i11 < i12 ? i12 : i11;
    }

    /* renamed from: g */
    private float m8340g(float f11, float f12) {
        if (f12 == 0.0f) {
            return 0.0f;
        }
        int i11 = this.f6648v;
        if (i11 == 0 || i11 == 1) {
            if (f11 < f12) {
                if (f11 >= 0.0f) {
                    return 1.0f - (f11 / f12);
                }
                if (this.f6639D && i11 == 1) {
                    return 1.0f;
                }
            }
        } else if (i11 == 2 && f11 < 0.0f) {
            return f11 / (-f12);
        }
        return 0.0f;
    }

    /* renamed from: h */
    private float m8341h(float f11, float f12, float f13, float f14) {
        float interpolation;
        float m8338e = m8338e(f11 * f12, 0.0f, f13);
        float m8340g = m8340g(f12 - f14, m8338e) - m8340g(f14, m8338e);
        if (m8340g < 0.0f) {
            interpolation = -this.f6643q.getInterpolation(-m8340g);
        } else {
            if (m8340g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f6643q.getInterpolation(m8340g);
        }
        return m8338e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m8342i() {
        if (this.f6637B) {
            this.f6639D = false;
        } else {
            this.f6642p.m8367i();
        }
    }

    /* renamed from: v */
    private void m8343v() {
        int i11;
        if (this.f6645s == null) {
            this.f6645s = new b();
        }
        this.f6639D = true;
        this.f6637B = true;
        if (!this.f6636A && (i11 = this.f6649w) > 0) {
            AbstractC1579n0.m7902t0(this.f6644r, this.f6645s, i11);
        } else {
            this.f6645s.run();
        }
        this.f6636A = true;
    }

    /* renamed from: a */
    public abstract boolean mo8344a(int i11);

    /* renamed from: b */
    public abstract boolean mo8345b(int i11);

    /* renamed from: c */
    void m8346c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f6644r.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo8347j(int i11, int i12);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC1629a m8348k(int i11) {
        this.f6649w = i11;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC1629a m8349l(int i11) {
        this.f6648v = i11;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC1629a m8350m(boolean z11) {
        if (this.f6640E && !z11) {
            m8342i();
        }
        this.f6640E = z11;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC1629a m8351n(float f11, float f12) {
        float[] fArr = this.f6647u;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC1629a m8352o(float f11, float f12) {
        float[] fArr = this.f6652z;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:            if (r0 != 3) goto L20;     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f6640E) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            m8342i();
            if (!this.f6641F && this.f6639D) {
                return true;
            }
        }
        this.f6638C = true;
        this.f6636A = false;
        this.f6642p.m8370l(m8337d(0, motionEvent.getX(), view.getWidth(), this.f6644r.getWidth()), m8337d(1, motionEvent.getY(), view.getHeight(), this.f6644r.getHeight()));
        if (!this.f6639D && m8358u()) {
            m8343v();
        }
        return !this.f6641F ? false : false;
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC1629a m8353p(float f11, float f12) {
        float[] fArr = this.f6651y;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC1629a m8354q(int i11) {
        this.f6642p.m8368j(i11);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC1629a m8355r(int i11) {
        this.f6642p.m8369k(i11);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC1629a m8356s(float f11, float f12) {
        float[] fArr = this.f6646t;
        fArr[0] = f11;
        fArr[1] = f12;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC1629a m8357t(float f11, float f12) {
        float[] fArr = this.f6650x;
        fArr[0] = f11 / 1000.0f;
        fArr[1] = f12 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    boolean m8358u() {
        a aVar = this.f6642p;
        int m8365f = aVar.m8365f();
        int m8364d = aVar.m8364d();
        if ((m8365f != 0 && mo8345b(m8365f)) || (m8364d != 0 && mo8344a(m8364d))) {
            return true;
        }
        return false;
    }
}
