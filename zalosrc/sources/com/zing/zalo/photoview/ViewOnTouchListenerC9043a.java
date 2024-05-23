package com.zing.zalo.photoview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import com.zing.zalo.photoview.ViewOnTouchListenerC9043a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import p407ox.AbstractC24576a;
import p407ox.AbstractC24579d;
import p430px.AbstractC24922f;
import p430px.InterfaceC24920d;
import p430px.InterfaceC24921e;
import p464qx.AbstractC25501c;

/* renamed from: com.zing.zalo.photoview.a */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC9043a implements View.OnTouchListener, InterfaceC24921e, GestureDetector.OnDoubleTapListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnLayoutChangeListener {

    /* renamed from: f0 */
    static final boolean f48409f0 = AbstractC23350e.m122781k("PhotoViewAttacher", 3);

    /* renamed from: g0 */
    static final Interpolator f48410g0 = new AccelerateDecelerateInterpolator();

    /* renamed from: h0 */
    public static int f48411h0 = 100;

    /* renamed from: B */
    h f48413B;

    /* renamed from: E */
    WeakReference f48416E;

    /* renamed from: F */
    GestureDetector f48417F;

    /* renamed from: G */
    InterfaceC24920d f48418G;

    /* renamed from: M */
    g f48424M;

    /* renamed from: N */
    j f48425N;

    /* renamed from: O */
    View.OnLongClickListener f48426O;

    /* renamed from: P */
    int f48427P;

    /* renamed from: Q */
    int f48428Q;

    /* renamed from: R */
    int f48429R;

    /* renamed from: S */
    int f48430S;

    /* renamed from: T */
    e f48431T;

    /* renamed from: V */
    boolean f48433V;

    /* renamed from: Y */
    float f48436Y;

    /* renamed from: v */
    i f48449v;

    /* renamed from: w */
    int f48450w;

    /* renamed from: p */
    float f48443p = 1.0f;

    /* renamed from: q */
    float f48444q = 2.5f;

    /* renamed from: r */
    float f48445r = 4.0f;

    /* renamed from: s */
    float f48446s = 1.0f;

    /* renamed from: t */
    boolean f48447t = true;

    /* renamed from: u */
    boolean f48448u = false;

    /* renamed from: x */
    boolean f48451x = false;

    /* renamed from: y */
    boolean f48452y = true;

    /* renamed from: z */
    boolean f48453z = true;

    /* renamed from: A */
    boolean f48412A = false;

    /* renamed from: C */
    boolean f48414C = false;

    /* renamed from: D */
    boolean f48415D = false;

    /* renamed from: H */
    final Matrix f48419H = new Matrix();

    /* renamed from: I */
    final Matrix f48420I = new Matrix();

    /* renamed from: J */
    final Matrix f48421J = new Matrix();

    /* renamed from: K */
    final RectF f48422K = new RectF();

    /* renamed from: L */
    final float[] f48423L = new float[9];

    /* renamed from: U */
    int f48432U = 2;

    /* renamed from: W */
    ImageView.ScaleType f48434W = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: X */
    View f48435X = null;

    /* renamed from: Z */
    boolean f48437Z = true;

    /* renamed from: a0 */
    float f48438a0 = 0.0f;

    /* renamed from: b0 */
    int f48439b0 = 0;

    /* renamed from: c0 */
    int f48440c0 = 0;

    /* renamed from: d0 */
    private float f48441d0 = 1.0f;

    /* renamed from: e0 */
    boolean f48442e0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.photoview.a$a */
    /* loaded from: classes4.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = ViewOnTouchListenerC9043a.this;
            View.OnLongClickListener onLongClickListener = viewOnTouchListenerC9043a.f48426O;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(viewOnTouchListenerC9043a.m48397s());
            }
        }
    }

    /* renamed from: com.zing.zalo.photoview.a$b */
    /* loaded from: classes4.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ float f48455p;

        b(float f11) {
            this.f48455p = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = ViewOnTouchListenerC9043a.this;
            viewOnTouchListenerC9043a.f48442e0 = false;
            viewOnTouchListenerC9043a.f48451x = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = ViewOnTouchListenerC9043a.this;
            if (viewOnTouchListenerC9043a.f48451x) {
                if (this.f48455p == 1.0f) {
                    i iVar = viewOnTouchListenerC9043a.f48449v;
                    if (iVar != null) {
                        iVar.mo48414e();
                    }
                } else {
                    i iVar2 = viewOnTouchListenerC9043a.f48449v;
                    if (iVar2 != null) {
                        iVar2.mo48413d();
                    }
                }
            }
            ViewOnTouchListenerC9043a viewOnTouchListenerC9043a2 = ViewOnTouchListenerC9043a.this;
            viewOnTouchListenerC9043a2.f48442e0 = false;
            viewOnTouchListenerC9043a2.f48451x = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ViewOnTouchListenerC9043a.this.f48442e0 = true;
        }
    }

    /* renamed from: com.zing.zalo.photoview.a$c */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f48457a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f48457a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48457a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48457a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48457a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48457a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.zing.zalo.photoview.a$d */
    /* loaded from: classes4.dex */
    public class d implements Runnable {

        /* renamed from: p */
        final float f48458p;

        /* renamed from: q */
        final float f48459q;

        /* renamed from: r */
        final long f48460r = System.currentTimeMillis();

        /* renamed from: s */
        final float f48461s;

        /* renamed from: t */
        final float f48462t;

        /* renamed from: u */
        final long f48463u;

        public d(float f11, float f12, float f13, float f14) {
            this.f48461s = f11;
            this.f48462t = f12;
            this.f48463u = Math.min(Math.max(Math.abs(f12 - f11) * 150.0f, 200L), 500L);
            ImageView m48397s = ViewOnTouchListenerC9043a.this.m48397s();
            ViewOnTouchListenerC9043a.this.m48403y();
            if (m48397s != null && ViewOnTouchListenerC9043a.this.f48422K != null) {
                int width = m48397s.getWidth();
                int height = m48397s.getHeight();
                int i11 = width / 4;
                int i12 = height / 4;
                RectF rectF = ViewOnTouchListenerC9043a.this.f48422K;
                float f15 = rectF.right;
                float f16 = rectF.left;
                int i13 = (int) (f15 - f16);
                float f17 = rectF.bottom;
                float f18 = rectF.top;
                int i14 = (int) (f17 - f18);
                int i15 = i13 / 4;
                int i16 = i14 / 4;
                if (f13 > f15) {
                    this.f48458p = width;
                } else if (f13 < f16) {
                    this.f48458p = 0.0f;
                } else if (i13 < width) {
                    float f19 = f13 - ((width - i13) / 2);
                    if (f19 < i15) {
                        f13 = 0.0f;
                    } else if (f19 > i15 * 3) {
                        f13 = width;
                    }
                    this.f48458p = f13;
                } else {
                    if (f13 < i11) {
                        f13 = 0.0f;
                    } else if (f13 > i11 * 3) {
                        f13 = width;
                    }
                    this.f48458p = f13;
                }
                if (f14 > f17) {
                    this.f48459q = height;
                    return;
                }
                if (f14 < f18) {
                    this.f48459q = 0.0f;
                    return;
                }
                if (i14 < height) {
                    float f21 = f14 - ((height - i14) / 2);
                    if (f21 < i16) {
                        f14 = 0.0f;
                    } else if (f21 > i16 * 3) {
                        f14 = height;
                    }
                    this.f48459q = f14;
                    return;
                }
                if (f14 < i12) {
                    f14 = 0.0f;
                } else if (f14 > i12 * 3) {
                    f14 = height;
                }
                this.f48459q = f14;
                return;
            }
            this.f48458p = f13;
            this.f48459q = f14;
        }

        /* renamed from: a */
        float m48405a() {
            return ViewOnTouchListenerC9043a.f48410g0.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f48460r)) * 1.0f) / ((float) this.f48463u)));
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView m48397s = ViewOnTouchListenerC9043a.this.m48397s();
            if (m48397s == null) {
                return;
            }
            float m48405a = m48405a();
            float f11 = this.f48461s;
            float m48403y = (f11 + ((this.f48462t - f11) * m48405a)) / ViewOnTouchListenerC9043a.this.m48403y();
            ViewOnTouchListenerC9043a.this.f48421J.postScale(m48403y, m48403y, this.f48458p, this.f48459q);
            ViewOnTouchListenerC9043a.this.m48380h();
            if (m48405a < 1.0f) {
                AbstractC24576a.m128007c(m48397s, this);
            }
        }
    }

    /* renamed from: com.zing.zalo.photoview.a$e */
    /* loaded from: classes4.dex */
    public class e implements Runnable {

        /* renamed from: p */
        final AbstractC25501c f48465p;

        /* renamed from: q */
        int f48466q;

        /* renamed from: r */
        int f48467r;

        public e(Context context) {
            this.f48465p = AbstractC25501c.m132106f(context);
        }

        /* renamed from: a */
        public void m48406a() {
            int i11 = ViewOnTouchListenerC9043a.f48411h0;
            this.f48465p.mo132101c(true);
        }

        /* renamed from: b */
        public void m48407b(int i11, int i12, int i13, int i14) {
            int i15;
            int i16;
            int i17;
            int i18;
            RectF m48394p = ViewOnTouchListenerC9043a.this.m48394p();
            if (m48394p == null) {
                return;
            }
            int round = Math.round(-m48394p.left);
            float f11 = i11;
            if (f11 < m48394p.width()) {
                i16 = Math.round(m48394p.width() - f11);
                i15 = 0;
            } else {
                i15 = round;
                i16 = i15;
            }
            int round2 = Math.round(-m48394p.top);
            float f12 = i12;
            if (f12 < m48394p.height()) {
                i18 = Math.round(m48394p.height() - f12);
                i17 = 0;
            } else {
                i17 = round2;
                i18 = i17;
            }
            this.f48466q = round;
            this.f48467r = round2;
            if (ViewOnTouchListenerC9043a.f48409f0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fling. StartX:");
                sb2.append(round);
                sb2.append(" StartY:");
                sb2.append(round2);
                sb2.append(" MaxX:");
                sb2.append(i16);
                sb2.append(" MaxY:");
                sb2.append(i18);
            }
            if (round != i16 || round2 != i18) {
                this.f48465p.mo132100b(round, round2, i13, i14, i15, i16, i17, i18, 0, 0);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView m48397s;
            if (this.f48465p.mo132104g()) {
                return;
            }
            ViewOnTouchListenerC9043a viewOnTouchListenerC9043a = ViewOnTouchListenerC9043a.this;
            if (viewOnTouchListenerC9043a.f48437Z && (m48397s = viewOnTouchListenerC9043a.m48397s()) != null && this.f48465p.mo132105a()) {
                int mo132102d = this.f48465p.mo132102d();
                int mo132103e = this.f48465p.mo132103e();
                if (ViewOnTouchListenerC9043a.f48409f0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fling run(). CurrentX:");
                    sb2.append(this.f48466q);
                    sb2.append(" CurrentY:");
                    sb2.append(this.f48467r);
                    sb2.append(" NewX:");
                    sb2.append(mo132102d);
                    sb2.append(" NewY:");
                    sb2.append(mo132103e);
                }
                ViewOnTouchListenerC9043a.this.f48421J.postTranslate(this.f48466q - mo132102d, this.f48467r - mo132103e);
                ViewOnTouchListenerC9043a viewOnTouchListenerC9043a2 = ViewOnTouchListenerC9043a.this;
                viewOnTouchListenerC9043a2.m48359Q(viewOnTouchListenerC9043a2.m48396r());
                this.f48466q = mo132102d;
                this.f48467r = mo132103e;
                AbstractC24576a.m128007c(m48397s, this);
            }
        }
    }

    /* renamed from: com.zing.zalo.photoview.a$f */
    /* loaded from: classes4.dex */
    public interface f {
    }

    /* renamed from: com.zing.zalo.photoview.a$g */
    /* loaded from: classes4.dex */
    public interface g {
        /* renamed from: a */
        void mo48408a(View view, float f11, float f12);
    }

    /* renamed from: com.zing.zalo.photoview.a$h */
    /* loaded from: classes4.dex */
    public interface h {
        /* renamed from: B3 */
        void mo48409B3(float f11);
    }

    /* renamed from: com.zing.zalo.photoview.a$i */
    /* loaded from: classes4.dex */
    public interface i {
        /* renamed from: a */
        void mo48410a(float f11);

        /* renamed from: b */
        void mo48411b();

        /* renamed from: c */
        void mo48412c();

        /* renamed from: d */
        void mo48413d();

        /* renamed from: e */
        void mo48414e();
    }

    /* renamed from: com.zing.zalo.photoview.a$j */
    /* loaded from: classes4.dex */
    public interface j {
        /* renamed from: a */
        void mo48415a(float f11, float f12, float f13);

        /* renamed from: b */
        void mo48416b(View view, float f11, float f12);
    }

    public ViewOnTouchListenerC9043a(ImageView imageView) {
        this.f48436Y = 0.0f;
        WeakReference weakReference = new WeakReference(imageView);
        this.f48416E = weakReference;
        if (weakReference.get() != null) {
            this.f48436Y = ((ImageView) this.f48416E.get()).getY();
        }
        imageView.addOnLayoutChangeListener(this);
        ImageView m48397s = m48397s();
        if (m48397s != null) {
            int m48346A = m48397s.getResources().getDisplayMetrics().heightPixels - m48346A();
            this.f48450w = m48346A;
            f48411h0 = (int) (m48346A / 8.0f);
        }
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m48343R(imageView);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f48418G = AbstractC24922f.m129592a(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
        this.f48417F = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        m48388l0(true);
    }

    /* renamed from: C */
    static boolean m48340C(ImageView imageView) {
        if (imageView != null && imageView.getDrawable() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    static boolean m48341F(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (c.f48457a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* renamed from: G */
    public /* synthetic */ void m48342G(float f11, float f12) {
        if (f11 != f12) {
            try {
                i iVar = this.f48449v;
                if (iVar != null && !this.f48451x) {
                    iVar.mo48411b();
                }
                this.f48451x = true;
                i iVar2 = this.f48449v;
                if (iVar2 != null) {
                    iVar2.mo48412c();
                }
                if (m48397s() != null) {
                    float y11 = m48397s().getY();
                    float abs = 1.0f - (Math.abs(y11) / (this.f48450w / 2.0f));
                    m48397s().setY(y11 + (f12 - f11));
                    View m48391n = m48391n();
                    this.f48435X = m48391n;
                    if (m48391n != null && abs >= 0.0f && abs <= 1.0f) {
                        AbstractC1579n0.m7805C0(m48391n, abs);
                    }
                    i iVar3 = this.f48449v;
                    if (iVar3 != null) {
                        iVar3.mo48410a(abs);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: R */
    static void m48343R(ImageView imageView) {
        if (imageView != null && !(imageView instanceof PhotoView)) {
            ImageView.ScaleType scaleType = ImageView.ScaleType.MATRIX;
            if (!scaleType.equals(imageView.getScaleType())) {
                imageView.setScaleType(scaleType);
            }
        }
    }

    /* renamed from: k */
    static void m48345k(float f11, float f12, float f13) {
        if (f11 < f12) {
            if (f12 < f13) {
                return;
            } else {
                throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
            }
        }
        throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
    }

    /* renamed from: A */
    int m48346A() {
        int i11;
        int identifier;
        ImageView m48397s = m48397s();
        if (m48397s != null && (identifier = m48397s.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            i11 = m48397s.getResources().getDimensionPixelSize(identifier);
        } else {
            i11 = 0;
        }
        int i12 = C1580n1.f6524b.m8054f(C1580n1.m.m8117e()).f6231b;
        if (i12 > 0 && i12 != i11) {
            return i12;
        }
        return i11;
    }

    /* renamed from: B */
    float m48347B(Matrix matrix, int i11) {
        matrix.getValues(this.f48423L);
        return this.f48423L[i11];
    }

    /* renamed from: D */
    boolean m48348D(float f11, float f12, float f13) {
        return f12 > f11 && this.f48451x && (f12 - f11 >= ((float) f48411h0) || f13 > 1000.0f);
    }

    /* renamed from: E */
    boolean m48349E(float f11, float f12, float f13) {
        return f11 > f12 && this.f48451x && (f11 - f12 >= ((float) f48411h0) || f13 > 1000.0f);
    }

    /* renamed from: H */
    void m48350H(float f11, float f12, long j11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ImageView m48397s = m48397s();
        if (m48397s != null) {
            arrayList.add(ObjectAnimator.ofFloat(m48397s, "translationY", m48397s.getTranslationY(), f11));
        }
        View m48391n = m48391n();
        if (m48391n != null) {
            arrayList.add(ObjectAnimator.ofFloat(m48391n, "alpha", m48391n.getAlpha(), f12));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(j11);
        animatorSet.addListener(new b(f12));
        animatorSet.start();
    }

    /* renamed from: I */
    void m48351I() {
        if (!this.f48412A) {
            this.f48421J.reset();
        }
        m48359Q(m48396r());
        m48384j();
    }

    /* renamed from: J */
    public void m48352J(boolean z11) {
        this.f48437Z = z11;
    }

    /* renamed from: K */
    public void m48353K(boolean z11) {
        this.f48447t = z11;
    }

    /* renamed from: L */
    public void m48354L(boolean z11) {
        this.f48453z = z11;
    }

    /* renamed from: M */
    public void m48355M(boolean z11) {
        this.f48452y = z11;
    }

    /* renamed from: N */
    public boolean m48356N(Matrix matrix) {
        if (matrix != null) {
            ImageView m48397s = m48397s();
            if (m48397s == null || m48397s.getDrawable() == null) {
                return false;
            }
            this.f48421J.set(matrix);
            m48359Q(m48396r());
            return true;
        }
        throw new IllegalArgumentException("Matrix cannot be null");
    }

    /* renamed from: O */
    public void m48357O(boolean z11) {
        this.f48414C = z11;
    }

    /* renamed from: P */
    public void m48358P() {
        try {
            this.f48421J.reset();
            this.f48420I.reset();
            this.f48419H.reset();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    void m48359Q(Matrix matrix) {
        ImageView m48397s = m48397s();
        if (m48397s != null) {
            m48382i();
            m48397s.setImageMatrix(matrix);
        }
    }

    /* renamed from: S */
    public void m48360S(boolean z11) {
        this.f48412A = z11;
    }

    /* renamed from: T */
    public void m48361T(float f11) {
        m48345k(this.f48443p, this.f48444q, f11);
        this.f48445r = f11;
    }

    /* renamed from: U */
    public void m48362U(float f11) {
        m48345k(this.f48443p, f11, this.f48445r);
        this.f48444q = f11;
    }

    /* renamed from: V */
    public void m48363V(float f11) {
        m48345k(f11, this.f48444q, this.f48445r);
        this.f48443p = f11;
    }

    /* renamed from: W */
    public final void m48364W(View.OnLongClickListener onLongClickListener) {
        this.f48426O = onLongClickListener;
    }

    /* renamed from: X */
    public final void m48365X(f fVar) {
    }

    /* renamed from: Y */
    public final void m48366Y(g gVar) {
        this.f48424M = gVar;
    }

    @Override // p430px.InterfaceC24921e
    /* renamed from: a */
    public final void mo48367a(float f11, float f12, float f13, float f14) {
        int i11;
        ViewParent parent;
        int i12;
        this.f48440c0 = this.f48439b0;
        if (f11 > f12) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f48439b0 = i11;
        ImageView m48397s = m48397s();
        if (m48397s == null) {
            return;
        }
        if (this.f48437Z) {
            this.f48421J.postTranslate(f13, f14);
            m48380h();
        }
        if ((Math.abs(f14) > Math.abs(f13) || this.f48451x) && m48403y() == m48402x() && this.f48452y) {
            m48389m(f11, f12);
            return;
        }
        if (this.f48447t && !this.f48418G.mo129591c() && !this.f48451x) {
            if ((!this.f48437Z || (i12 = this.f48432U) == 2 || ((i12 == 0 && f13 >= 1.0f) || (i12 == 1 && f13 <= -1.0f))) && (parent = m48397s.getParent()) != null) {
                if (this.f48448u || !this.f48437Z) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    /* renamed from: a0 */
    public void m48368a0(h hVar) {
        this.f48413B = hVar;
    }

    @Override // p430px.InterfaceC24921e
    /* renamed from: b */
    public final void mo48369b(float f11, float f12, float f13) {
        if (f48409f0) {
            String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13));
        }
        if (!this.f48451x && this.f48453z) {
            j jVar = this.f48425N;
            if (jVar != null) {
                jVar.mo48415a(m48403y(), f12, f13);
            }
            if (m48403y() < this.f48445r || f11 < 1.0f) {
                if (f11 > 1.0f) {
                    float m48403y = m48403y() * f11;
                    float f14 = this.f48445r;
                    if (m48403y > f14) {
                        f11 = f14 / m48403y();
                    }
                }
                this.f48421J.postScale(f11, f11, f12, f13);
                m48380h();
            }
        }
    }

    /* renamed from: b0 */
    public void m48370b0(i iVar) {
        this.f48449v = iVar;
    }

    @Override // p430px.InterfaceC24921e
    /* renamed from: c */
    public void mo48371c(float f11, float f12, float f13) {
        this.f48439b0 = 0;
        this.f48440c0 = 0;
        if (!this.f48452y || this.f48442e0) {
            return;
        }
        int i11 = this.f48450w;
        ImageView m48397s = m48397s();
        if (m48397s != null && m48398t(m48397s) > 0) {
            i11 = m48398t(m48397s);
        }
        if (m48349E(f11, f12, f13) && m48403y() == m48402x()) {
            m48350H(-i11, 0.0f, 200L);
        } else if (m48348D(f11, f12, f13) && m48403y() == m48402x()) {
            m48350H(i11, 0.0f, 200L);
        } else {
            m48350H(0.0f, 1.0f, 100L);
        }
    }

    /* renamed from: c0 */
    public final void m48372c0(j jVar) {
        this.f48425N = jVar;
    }

    @Override // p430px.InterfaceC24921e
    /* renamed from: d */
    public final void mo48373d(float f11, float f12, float f13, float f14) {
        if (f48409f0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onFling. sX: ");
            sb2.append(f11);
            sb2.append(" sY: ");
            sb2.append(f12);
            sb2.append(" Vx: ");
            sb2.append(f13);
            sb2.append(" Vy: ");
            sb2.append(f14);
        }
        ImageView m48397s = m48397s();
        if (m48397s != null) {
            e eVar = new e(m48397s.getContext());
            this.f48431T = eVar;
            eVar.m48407b(m48399u(m48397s), m48398t(m48397s), (int) f13, (int) f14);
            m48397s.post(this.f48431T);
        }
    }

    /* renamed from: d0 */
    public void m48374d0(float f11) {
        float f12 = f11 % 360.0f;
        this.f48421J.postRotate(this.f48438a0 - f12);
        this.f48438a0 = f12;
        m48380h();
    }

    /* renamed from: e0 */
    public void m48375e0(float f11) {
        this.f48421J.postRotate(f11 % 360.0f);
        m48380h();
    }

    /* renamed from: f */
    public void m48376f() {
        Drawable drawable;
        int i11;
        int i12;
        boolean z11;
        try {
            ImageView m48397s = m48397s();
            if (m48397s != null && (drawable = m48397s.getDrawable()) != null && this.f48434W == ImageView.ScaleType.FIT_CENTER) {
                float m48399u = m48399u(m48397s);
                float m48398t = m48398t(m48397s);
                if (drawable.getIntrinsicWidth() > 0) {
                    i11 = drawable.getIntrinsicWidth();
                } else {
                    i11 = 0;
                }
                if (drawable.getIntrinsicHeight() > 0) {
                    i12 = drawable.getIntrinsicHeight();
                } else {
                    i12 = 0;
                }
                if (m48398t * m48399u != 0.0f && i12 * i11 != 0) {
                    float f11 = i12;
                    float f12 = i11;
                    if ((f11 * 1.0f) / f12 > 1.0f && this.f48414C) {
                        if (m48398t / m48399u > 1.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            this.f48441d0 = m48399u;
                        } else {
                            this.f48441d0 = m48398t;
                        }
                        if ((f11 / m48398t) * (this.f48441d0 / f12) >= 1.5f) {
                            this.f48415D = true;
                            float f13 = (f12 * m48398t) / f11;
                            if (!z11) {
                                m48399u = m48398t;
                            }
                            float f14 = m48399u / f13;
                            if (f14 > this.f48445r * 0.8f) {
                                this.f48445r = f14;
                                this.f48444q = (this.f48443p + f14) / 2.0f;
                            } else {
                                this.f48444q = f14;
                            }
                            this.f48446s = f14;
                            return;
                        }
                        this.f48415D = false;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("PhotoViewAttacher", e11.getMessage());
        }
    }

    /* renamed from: f0 */
    public void m48377f0(float f11) {
        this.f48421J.setRotate(f11 % 360.0f);
        m48380h();
    }

    /* renamed from: g */
    void m48378g() {
        e eVar = this.f48431T;
        if (eVar != null) {
            eVar.m48406a();
            this.f48431T = null;
        }
    }

    /* renamed from: g0 */
    public void m48379g0(float f11) {
        m48383i0(f11, false);
    }

    /* renamed from: h */
    void m48380h() {
        if (m48384j()) {
            m48359Q(m48396r());
        }
    }

    /* renamed from: h0 */
    public void m48381h0(float f11, float f12, float f13, boolean z11) {
        ImageView m48397s;
        if (this.f48453z && (m48397s = m48397s()) != null && f11 >= this.f48443p && f11 <= this.f48445r) {
            if (z11) {
                m48397s.post(new d(m48403y(), f11, f12, f13));
            } else {
                this.f48421J.setScale(f11, f11, f12, f13);
                m48380h();
            }
        }
    }

    /* renamed from: i */
    void m48382i() {
        ImageView m48397s = m48397s();
        if (m48397s != null && !(m48397s instanceof PhotoView) && !ImageView.ScaleType.MATRIX.equals(m48397s.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    /* renamed from: i0 */
    public void m48383i0(float f11, boolean z11) {
        if (m48397s() != null) {
            m48381h0(f11, r0.getRight() / 2, r0.getBottom() / 2, z11);
        }
    }

    /* renamed from: j */
    boolean m48384j() {
        RectF m48395q;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        ImageView m48397s = m48397s();
        if (m48397s == null || (m48395q = m48395q(m48396r())) == null) {
            return false;
        }
        float height = m48395q.height();
        float width = m48395q.width();
        float m48398t = m48398t(m48397s);
        float f17 = 0.0f;
        if (height <= m48398t) {
            int i11 = c.f48457a[this.f48434W.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    m48398t = (m48398t - height) / 2.0f;
                    f12 = m48395q.top;
                } else {
                    m48398t -= height;
                    f12 = m48395q.top;
                }
                f13 = m48398t - f12;
            } else {
                f11 = m48395q.top;
                f13 = -f11;
            }
        } else {
            f11 = m48395q.top;
            if (f11 <= 0.0f) {
                f12 = m48395q.bottom;
                if (f12 >= m48398t) {
                    f13 = 0.0f;
                }
                f13 = m48398t - f12;
            }
            f13 = -f11;
        }
        float m48399u = m48399u(m48397s);
        if (width <= m48399u) {
            int i12 = c.f48457a[this.f48434W.ordinal()];
            if (i12 != 2) {
                if (i12 != 3) {
                    f15 = (m48399u - width) / 2.0f;
                    f16 = m48395q.left;
                } else {
                    f15 = m48399u - width;
                    f16 = m48395q.left;
                }
                f14 = f15 - f16;
            } else {
                f14 = -m48395q.left;
            }
            f17 = f14;
            this.f48432U = 2;
        } else {
            float f18 = m48395q.left;
            if (f18 >= 0.0f) {
                this.f48432U = 0;
                f17 = -f18;
            } else {
                float f19 = m48395q.right;
                if (f19 <= m48399u) {
                    f17 = m48399u - f19;
                    this.f48432U = 1;
                } else {
                    this.f48432U = -1;
                }
            }
        }
        this.f48421J.postTranslate(f17, f13);
        return true;
    }

    /* renamed from: j0 */
    public void m48385j0(float f11, float f12, float f13) {
        m48345k(f11, f12, f13);
        this.f48443p = f11;
        this.f48444q = f12;
        this.f48445r = f13;
    }

    /* renamed from: k0 */
    public final void m48386k0(ImageView.ScaleType scaleType) {
        if (m48341F(scaleType) && scaleType != this.f48434W) {
            this.f48434W = scaleType;
            m48390m0();
        }
    }

    /* renamed from: l */
    public final void m48387l() {
        WeakReference weakReference = this.f48416E;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = (ImageView) weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            m48378g();
        }
        GestureDetector gestureDetector = this.f48417F;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.f48424M = null;
        this.f48425N = null;
        this.f48416E = null;
    }

    /* renamed from: l0 */
    public final void m48388l0(boolean z11) {
        this.f48433V = z11;
        m48390m0();
    }

    /* renamed from: m */
    void m48389m(float f11, float f12) {
        ImageView m48397s;
        if (m48403y() != m48402x() || f11 < 0.0f || f12 < 0.0f || (m48397s = m48397s()) == null) {
            return;
        }
        m48397s.post(new Runnable() { // from class: ox.c

            /* renamed from: q */
            public final /* synthetic */ float f118307q;

            /* renamed from: r */
            public final /* synthetic */ float f118308r;

            public /* synthetic */ RunnableC24578c(float f112, float f122) {
                r2 = f112;
                r3 = f122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC9043a.this.m48342G(r2, r3);
            }
        });
    }

    /* renamed from: m0 */
    public final void m48390m0() {
        ImageView m48397s = m48397s();
        if (m48397s != null) {
            if (this.f48433V) {
                m48343R(m48397s);
                m48392n0(m48397s.getDrawable());
            } else {
                m48351I();
            }
        }
    }

    /* renamed from: n */
    View m48391n() {
        Object parent;
        Object parent2;
        Object parent3;
        View view = this.f48435X;
        if (view != null) {
            return view;
        }
        ImageView m48397s = m48397s();
        if (m48397s != null && (parent = m48397s.getParent()) != null && (parent instanceof View) && (parent2 = ((View) parent).getParent()) != null && (parent2 instanceof View) && (parent3 = ((View) parent2).getParent()) != null && (parent3 instanceof View)) {
            this.f48435X = ((View) parent3).findViewWithTag(m48397s.getResources().getString(AbstractC24579d.photo_gallery_background_tag));
        }
        return this.f48435X;
    }

    /* renamed from: n0 */
    void m48392n0(Drawable drawable) {
        ImageView m48397s = m48397s();
        if (m48397s != null && drawable != null) {
            float m48399u = m48399u(m48397s);
            float m48398t = m48398t(m48397s);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f48419H.reset();
            float f11 = intrinsicWidth;
            float f12 = m48399u / f11;
            float f13 = intrinsicHeight;
            float f14 = m48398t / f13;
            ImageView.ScaleType scaleType = this.f48434W;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.f48419H.postTranslate((m48399u - f11) / 2.0f, (m48398t - f13) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f12, f14);
                this.f48419H.postScale(max, max);
                this.f48419H.postTranslate((m48399u - (f11 * max)) / 2.0f, (m48398t - (f13 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f12, f14));
                this.f48419H.postScale(min, min);
                this.f48419H.postTranslate((m48399u - (f11 * min)) / 2.0f, (m48398t - (f13 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f11, f13);
                RectF rectF2 = new RectF(0.0f, 0.0f, m48399u, m48398t);
                int i11 = c.f48457a[this.f48434W.ordinal()];
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                this.f48419H.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                            }
                        } else {
                            this.f48419H.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                        }
                    } else {
                        this.f48419H.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                    }
                } else {
                    this.f48419H.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                }
            }
            m48351I();
        }
    }

    /* renamed from: o */
    public Matrix m48393o() {
        return new Matrix(this.f48421J);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float m48403y = m48403y();
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f11 = this.f48444q;
            if (m48403y < f11) {
                m48381h0(f11, x11, y11, true);
            } else {
                if (m48403y >= f11) {
                    f11 = this.f48445r;
                    if (m48403y < f11) {
                        m48381h0(f11, x11, y11, true);
                    }
                }
                f11 = this.f48443p;
                m48381h0(f11, x11, y11, true);
            }
            j jVar = this.f48425N;
            if (jVar != null) {
                jVar.mo48415a(f11, x11, y11);
            }
            h hVar = this.f48413B;
            if (hVar != null && this.f48415D && f11 == this.f48446s) {
                hVar.mo48409B3(f11);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView m48397s = m48397s();
        if (m48397s != null && this.f48433V) {
            int top = m48397s.getTop();
            int right = m48397s.getRight();
            int bottom = m48397s.getBottom();
            int left = m48397s.getLeft();
            if (top != this.f48427P || bottom != this.f48429R || left != this.f48430S || right != this.f48428Q) {
                m48392n0(m48397s.getDrawable());
                this.f48427P = top;
                this.f48428Q = right;
                this.f48429R = bottom;
                this.f48430S = left;
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        WeakReference weakReference;
        if ((i11 != i15 || i12 != i16 || i13 != i17 || i14 != i18) && (weakReference = this.f48416E) != null && weakReference.get() != null) {
            m48392n0(((ImageView) this.f48416E.get()).getDrawable());
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        RectF m48394p;
        ImageView m48397s = m48397s();
        if (this.f48424M != null && (m48394p = m48394p()) != null) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (m48394p.contains(x11, y11)) {
                this.f48424M.mo48408a(m48397s, (x11 - m48394p.left) / m48394p.width(), (y11 - m48394p.top) / m48394p.height());
                return true;
            }
        }
        j jVar = this.f48425N;
        if (jVar != null) {
            jVar.mo48416b(m48397s, motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        RectF m48394p;
        boolean z12 = false;
        if (!this.f48433V || !m48340C((ImageView) view)) {
            return false;
        }
        ViewParent parent = view.getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && m48403y() < this.f48443p && (m48394p = m48394p()) != null) {
                view.post(new d(m48403y(), this.f48443p, m48394p.centerX(), m48394p.centerY()));
                z12 = true;
            }
        } else {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            m48378g();
            m48384j();
            if (this.f48432U != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f48448u = z11;
        }
        GestureDetector gestureDetector = this.f48417F;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            z12 = true;
        }
        InterfaceC24920d interfaceC24920d = this.f48418G;
        if (interfaceC24920d != null && interfaceC24920d.mo129587a(motionEvent)) {
            return true;
        }
        return z12;
    }

    /* renamed from: p */
    public final RectF m48394p() {
        m48384j();
        return m48395q(m48396r());
    }

    /* renamed from: q */
    RectF m48395q(Matrix matrix) {
        Drawable drawable;
        ImageView m48397s = m48397s();
        if (m48397s != null && (drawable = m48397s.getDrawable()) != null) {
            this.f48422K.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(this.f48422K);
            return this.f48422K;
        }
        return null;
    }

    /* renamed from: r */
    public Matrix m48396r() {
        this.f48420I.set(this.f48419H);
        this.f48420I.postConcat(this.f48421J);
        return this.f48420I;
    }

    /* renamed from: s */
    public final ImageView m48397s() {
        ImageView imageView;
        WeakReference weakReference = this.f48416E;
        if (weakReference != null) {
            imageView = (ImageView) weakReference.get();
        } else {
            imageView = null;
        }
        if (imageView == null) {
            m48387l();
        }
        return imageView;
    }

    /* renamed from: t */
    int m48398t(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: u */
    int m48399u(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: v */
    public float m48400v() {
        return this.f48445r;
    }

    /* renamed from: w */
    public float m48401w() {
        return this.f48444q;
    }

    /* renamed from: x */
    public float m48402x() {
        return this.f48443p;
    }

    /* renamed from: y */
    public final float m48403y() {
        return (float) Math.hypot(m48347B(this.f48421J, 0), m48347B(this.f48421J, 3));
    }

    /* renamed from: z */
    public final ImageView.ScaleType m48404z() {
        return this.f48434W;
    }
}
