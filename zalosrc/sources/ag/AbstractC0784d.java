package ag;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import se0.AbstractC26237b;

/* renamed from: ag.d */
/* loaded from: classes3.dex */
public abstract class AbstractC0784d extends AbstractC0791k {

    /* renamed from: A */
    protected static final FloatBuffer f2698A;

    /* renamed from: B */
    protected static final FloatBuffer f2699B;

    /* renamed from: C */
    protected static final FloatBuffer f2700C;

    /* renamed from: D */
    protected static final FloatBuffer f2701D;

    /* renamed from: E */
    protected static final int f2702E;

    /* renamed from: t */
    protected int f2704t;

    /* renamed from: u */
    protected int f2705u;

    /* renamed from: z */
    private Handler f2710z;

    /* renamed from: s */
    private final LinkedList f2703s = new LinkedList();

    /* renamed from: v */
    private boolean f2706v = true;

    /* renamed from: w */
    protected float[] f2707w = new float[16];

    /* renamed from: x */
    public boolean f2708x = false;

    /* renamed from: y */
    private float f2709y = 1.0f;

    static {
        float[] fArr = AbstractC26237b.f124626a;
        f2698A = AbstractC26237b.m134918c(fArr);
        f2699B = AbstractC26237b.m134918c(AbstractC26237b.f124627b);
        f2700C = AbstractC26237b.m134918c(AbstractC26237b.f124628c);
        f2701D = AbstractC26237b.m134918c(AbstractC26237b.f124629d);
        f2702E = fArr.length / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m1942O() {
        m1955Y(250);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m1943P(ValueAnimator valueAnimator) {
        mo1953W(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m1944Q(int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ag.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbstractC0784d.this.m1943P(valueAnimator);
            }
        });
        ofFloat.setDuration(i11);
        ofFloat.start();
    }

    /* renamed from: V */
    private void m1945V() {
        LinkedList linkedList;
        synchronized (this.f2703s) {
            try {
                if (!this.f2703s.isEmpty()) {
                    linkedList = new LinkedList(this.f2703s);
                    this.f2703s.clear();
                } else {
                    linkedList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (linkedList != null) {
            while (!linkedList.isEmpty()) {
                ((Runnable) linkedList.removeFirst()).run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        synchronized (this.f2703s) {
            try {
                if (!this.f2703s.isEmpty()) {
                    this.f2703s.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        Matrix.setIdentityM(this.f2707w, 0);
        if (this.f2708x) {
            mo1953W(0.0f);
            m1952U(new Runnable() { // from class: ag.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0784d.this.m1942O();
                }
            });
        } else {
            mo1953W(1.0f);
        }
    }

    /* renamed from: J */
    public void m1946J() {
        if (!mo1997z()) {
            return;
        }
        m1945V();
        mo1909R();
    }

    /* renamed from: K */
    public float m1947K() {
        return this.f2709y;
    }

    /* renamed from: L */
    public int m1948L() {
        return this.f2705u;
    }

    /* renamed from: M */
    public int m1949M() {
        return this.f2704t;
    }

    /* renamed from: N */
    public boolean m1950N() {
        return this.f2708x;
    }

    /* renamed from: R */
    protected abstract void mo1909R();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public void mo1897S(boolean z11) {
    }

    /* renamed from: T */
    public void m1951T() {
        if (!mo1997z()) {
            return;
        }
        m1945V();
    }

    /* renamed from: U */
    public void m1952U(Runnable runnable) {
        synchronized (this.f2703s) {
            this.f2703s.add(runnable);
        }
    }

    /* renamed from: W */
    public void mo1953W(float f11) {
        if (this.f2708x) {
            this.f2709y = f11;
        } else {
            this.f2709y = 1.0f;
        }
    }

    /* renamed from: X */
    public void m1954X(boolean z11) {
        this.f2708x = z11;
    }

    /* renamed from: Y */
    public void m1955Y(final int i11) {
        if (this.f2710z == null) {
            this.f2710z = new Handler(Looper.getMainLooper());
        }
        this.f2710z.post(new Runnable() { // from class: ag.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0784d.this.m1944Q(i11);
            }
        });
    }

    /* renamed from: Z */
    public void mo1956Z(int i11, int i12) {
        this.f2704t = i11;
        this.f2705u = i12;
        mo1897S(this.f2706v);
        this.f2706v = false;
    }
}
