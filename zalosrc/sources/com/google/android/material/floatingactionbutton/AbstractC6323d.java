package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.util.AbstractC1487i;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.internal.C6341h;
import java.util.ArrayList;
import java.util.Iterator;
import p357n6.AbstractC23576a;
import p382o6.AbstractC24041a;
import p382o6.AbstractC24042b;
import p382o6.AbstractC24047g;
import p382o6.C24046f;
import p382o6.C24048h;
import p634x6.AbstractC29387b;
import p671y6.InterfaceC30798b;
import p706z6.AbstractC31690i;
import p706z6.C31689h;
import p706z6.C31694m;
import p706z6.InterfaceC31697p;

/* renamed from: com.google.android.material.floatingactionbutton.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6323d {

    /* renamed from: F */
    static final TimeInterpolator f35354F = AbstractC24041a.f116360c;

    /* renamed from: G */
    static final int[] f35355G = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: H */
    static final int[] f35356H = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: I */
    static final int[] f35357I = {R.attr.state_focused, R.attr.state_enabled};

    /* renamed from: J */
    static final int[] f35358J = {R.attr.state_hovered, R.attr.state_enabled};

    /* renamed from: K */
    static final int[] f35359K = {R.attr.state_enabled};

    /* renamed from: L */
    static final int[] f35360L = new int[0];

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f35365E;

    /* renamed from: a */
    C31694m f35366a;

    /* renamed from: b */
    C31689h f35367b;

    /* renamed from: c */
    Drawable f35368c;

    /* renamed from: d */
    C6322c f35369d;

    /* renamed from: e */
    Drawable f35370e;

    /* renamed from: f */
    boolean f35371f;

    /* renamed from: h */
    float f35373h;

    /* renamed from: i */
    float f35374i;

    /* renamed from: j */
    float f35375j;

    /* renamed from: k */
    int f35376k;

    /* renamed from: l */
    private final C6341h f35377l;

    /* renamed from: m */
    private C24048h f35378m;

    /* renamed from: n */
    private C24048h f35379n;

    /* renamed from: o */
    private Animator f35380o;

    /* renamed from: p */
    private C24048h f35381p;

    /* renamed from: q */
    private C24048h f35382q;

    /* renamed from: r */
    private float f35383r;

    /* renamed from: t */
    private int f35385t;

    /* renamed from: v */
    private ArrayList f35387v;

    /* renamed from: w */
    private ArrayList f35388w;

    /* renamed from: x */
    private ArrayList f35389x;

    /* renamed from: y */
    final FloatingActionButton f35390y;

    /* renamed from: z */
    final InterfaceC30798b f35391z;

    /* renamed from: g */
    boolean f35372g = true;

    /* renamed from: s */
    private float f35384s = 1.0f;

    /* renamed from: u */
    private int f35386u = 0;

    /* renamed from: A */
    private final Rect f35361A = new Rect();

    /* renamed from: B */
    private final RectF f35362B = new RectF();

    /* renamed from: C */
    private final RectF f35363C = new RectF();

    /* renamed from: D */
    private final Matrix f35364D = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f35392p;

        /* renamed from: q */
        final /* synthetic */ boolean f35393q;

        /* renamed from: r */
        final /* synthetic */ j f35394r;

        a(boolean z11, j jVar) {
            this.f35393q = z11;
            this.f35394r = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35392p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i11;
            AbstractC6323d.this.f35386u = 0;
            AbstractC6323d.this.f35380o = null;
            if (!this.f35392p) {
                FloatingActionButton floatingActionButton = AbstractC6323d.this.f35390y;
                boolean z11 = this.f35393q;
                if (z11) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                floatingActionButton.m32470b(i11, z11);
                j jVar = this.f35394r;
                if (jVar != null) {
                    jVar.mo32354b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC6323d.this.f35390y.m32470b(0, this.f35393q);
            AbstractC6323d.this.f35386u = 1;
            AbstractC6323d.this.f35380o = animator;
            this.f35392p = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f35396p;

        /* renamed from: q */
        final /* synthetic */ j f35397q;

        b(boolean z11, j jVar) {
            this.f35396p = z11;
            this.f35397q = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC6323d.this.f35386u = 0;
            AbstractC6323d.this.f35380o = null;
            j jVar = this.f35397q;
            if (jVar != null) {
                jVar.mo32353a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC6323d.this.f35390y.m32470b(0, this.f35396p);
            AbstractC6323d.this.f35386u = 2;
            AbstractC6323d.this.f35380o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC24047g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f11, Matrix matrix, Matrix matrix2) {
            AbstractC6323d.this.f35384s = f11;
            return super.evaluate(f11, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* loaded from: classes3.dex */
    public class d implements TypeEvaluator {

        /* renamed from: a */
        FloatEvaluator f35400a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f11, Float f12, Float f13) {
            float floatValue = this.f35400a.evaluate(f11, (Number) f12, (Number) f13).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    /* loaded from: classes3.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            AbstractC6323d.this.m32394G();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    /* loaded from: classes3.dex */
    public class f extends l {
        f() {
            super(AbstractC6323d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.l
        /* renamed from: a */
        protected float mo32438a() {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    /* loaded from: classes3.dex */
    public class g extends l {
        g() {
            super(AbstractC6323d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.l
        /* renamed from: a */
        protected float mo32438a() {
            AbstractC6323d abstractC6323d = AbstractC6323d.this;
            return abstractC6323d.f35373h + abstractC6323d.f35374i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    /* loaded from: classes3.dex */
    public class h extends l {
        h() {
            super(AbstractC6323d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.l
        /* renamed from: a */
        protected float mo32438a() {
            AbstractC6323d abstractC6323d = AbstractC6323d.this;
            return abstractC6323d.f35373h + abstractC6323d.f35375j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    /* loaded from: classes3.dex */
    public interface i {
        /* renamed from: a */
        void mo32358a();

        /* renamed from: b */
        void mo32359b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$j */
    /* loaded from: classes3.dex */
    public interface j {
        /* renamed from: a */
        void mo32353a();

        /* renamed from: b */
        void mo32354b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$k */
    /* loaded from: classes3.dex */
    public class k extends l {
        k() {
            super(AbstractC6323d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6323d.l
        /* renamed from: a */
        protected float mo32438a() {
            return AbstractC6323d.this.f35373h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.d$l */
    /* loaded from: classes3.dex */
    public abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: p */
        private boolean f35407p;

        /* renamed from: q */
        private float f35408q;

        /* renamed from: r */
        private float f35409r;

        private l() {
        }

        /* renamed from: a */
        protected abstract float mo32438a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC6323d.this.m32421f0((int) this.f35409r);
            this.f35407p = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float m152460y;
            if (!this.f35407p) {
                C31689h c31689h = AbstractC6323d.this.f35367b;
                if (c31689h == null) {
                    m152460y = 0.0f;
                } else {
                    m152460y = c31689h.m152460y();
                }
                this.f35408q = m152460y;
                this.f35409r = mo32438a();
                this.f35407p = true;
            }
            AbstractC6323d abstractC6323d = AbstractC6323d.this;
            float f11 = this.f35408q;
            abstractC6323d.m32421f0((int) (f11 + ((this.f35409r - f11) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ l(AbstractC6323d abstractC6323d, a aVar) {
            this();
        }
    }

    public AbstractC6323d(FloatingActionButton floatingActionButton, InterfaceC30798b interfaceC30798b) {
        this.f35390y = floatingActionButton;
        this.f35391z = interfaceC30798b;
        C6341h c6341h = new C6341h();
        this.f35377l = c6341h;
        c6341h.m32601a(f35355G, m32384i(new h()));
        c6341h.m32601a(f35356H, m32384i(new g()));
        c6341h.m32601a(f35357I, m32384i(new g()));
        c6341h.m32601a(f35358J, m32384i(new g()));
        c6341h.m32601a(f35359K, m32384i(new k()));
        c6341h.m32601a(f35360L, m32384i(new f()));
        this.f35383r = floatingActionButton.getRotation();
    }

    /* renamed from: Z */
    private boolean m32377Z() {
        if (AbstractC1579n0.m7865e0(this.f35390y) && !this.f35390y.isInEditMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m32381g(float f11, Matrix matrix) {
        matrix.reset();
        if (this.f35390y.getDrawable() != null && this.f35385t != 0) {
            RectF rectF = this.f35362B;
            RectF rectF2 = this.f35363C;
            rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            int i11 = this.f35385t;
            rectF2.set(0.0f, 0.0f, i11, i11);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i12 = this.f35385t;
            matrix.postScale(f11, f11, i12 / 2.0f, i12 / 2.0f);
        }
    }

    /* renamed from: g0 */
    private void m32382g0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    /* renamed from: h */
    private AnimatorSet m32383h(C24048h c24048h, float f11, float f12, float f13) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f35390y, (Property<FloatingActionButton, Float>) View.ALPHA, f11);
        c24048h.m125929h("opacity").m125937a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f35390y, (Property<FloatingActionButton, Float>) View.SCALE_X, f12);
        c24048h.m125929h("scale").m125937a(ofFloat2);
        m32382g0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f35390y, (Property<FloatingActionButton, Float>) View.SCALE_Y, f12);
        c24048h.m125929h("scale").m125937a(ofFloat3);
        m32382g0(ofFloat3);
        arrayList.add(ofFloat3);
        m32381g(f13, this.f35364D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f35390y, new C24046f(), new c(), new Matrix(this.f35364D));
        c24048h.m125929h("iconScale").m125937a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC24042b.m125913a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    private ValueAnimator m32384i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f35354F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: k */
    private C24048h m32385k() {
        if (this.f35379n == null) {
            this.f35379n = C24048h.m125925d(this.f35390y.getContext(), AbstractC23576a.design_fab_hide_motion_spec);
        }
        return (C24048h) AbstractC1487i.m7492g(this.f35379n);
    }

    /* renamed from: l */
    private C24048h m32386l() {
        if (this.f35378m == null) {
            this.f35378m = C24048h.m125925d(this.f35390y.getContext(), AbstractC23576a.design_fab_show_motion_spec);
        }
        return (C24048h) AbstractC1487i.m7492g(this.f35378m);
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m32387q() {
        if (this.f35365E == null) {
            this.f35365E = new e();
        }
        return this.f35365E;
    }

    /* renamed from: A */
    public void m32388A() {
        C31689h c31689h = this.f35367b;
        if (c31689h != null) {
            AbstractC31690i.m152470f(this.f35390y, c31689h);
        }
        if (mo32397J()) {
            this.f35390y.getViewTreeObserver().addOnPreDrawListener(m32387q());
        }
    }

    /* renamed from: B */
    public abstract void mo32389B();

    /* renamed from: C */
    public void m32390C() {
        ViewTreeObserver viewTreeObserver = this.f35390y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f35365E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f35365E = null;
        }
    }

    /* renamed from: D */
    public abstract void mo32391D(int[] iArr);

    /* renamed from: E */
    abstract void mo32392E(float f11, float f12, float f13);

    /* renamed from: F */
    void m32393F(Rect rect) {
        AbstractC1487i.m7493h(this.f35370e, "Didn't initialize content background");
        if (mo32412Y()) {
            this.f35391z.mo32357c(new InsetDrawable(this.f35370e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f35391z.mo32357c(this.f35370e);
        }
    }

    /* renamed from: G */
    void m32394G() {
        float rotation = this.f35390y.getRotation();
        if (this.f35383r != rotation) {
            this.f35383r = rotation;
            mo32415c0();
        }
    }

    /* renamed from: H */
    public void m32395H() {
        ArrayList arrayList = this.f35389x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).mo32359b();
            }
        }
    }

    /* renamed from: I */
    public void m32396I() {
        ArrayList arrayList = this.f35389x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((i) it.next()).mo32358a();
            }
        }
    }

    /* renamed from: J */
    abstract boolean mo32397J();

    /* renamed from: K */
    public void m32398K(ColorStateList colorStateList) {
        C31689h c31689h = this.f35367b;
        if (c31689h != null) {
            c31689h.setTintList(colorStateList);
        }
        C6322c c6322c = this.f35369d;
        if (c6322c != null) {
            c6322c.m32373c(colorStateList);
        }
    }

    /* renamed from: L */
    public void m32399L(PorterDuff.Mode mode) {
        C31689h c31689h = this.f35367b;
        if (c31689h != null) {
            c31689h.setTintMode(mode);
        }
    }

    /* renamed from: M */
    public final void m32400M(float f11) {
        if (this.f35373h != f11) {
            this.f35373h = f11;
            mo32392E(f11, this.f35374i, this.f35375j);
        }
    }

    /* renamed from: N */
    public void m32401N(boolean z11) {
        this.f35371f = z11;
    }

    /* renamed from: O */
    public final void m32402O(C24048h c24048h) {
        this.f35382q = c24048h;
    }

    /* renamed from: P */
    public final void m32403P(float f11) {
        if (this.f35374i != f11) {
            this.f35374i = f11;
            mo32392E(this.f35373h, f11, this.f35375j);
        }
    }

    /* renamed from: Q */
    final void m32404Q(float f11) {
        this.f35384s = f11;
        Matrix matrix = this.f35364D;
        m32381g(f11, matrix);
        this.f35390y.setImageMatrix(matrix);
    }

    /* renamed from: R */
    public final void m32405R(int i11) {
        if (this.f35385t != i11) {
            this.f35385t = i11;
            m32417d0();
        }
    }

    /* renamed from: S */
    public void m32406S(int i11) {
        this.f35376k = i11;
    }

    /* renamed from: T */
    public final void m32407T(float f11) {
        if (this.f35375j != f11) {
            this.f35375j = f11;
            mo32392E(this.f35373h, this.f35374i, f11);
        }
    }

    /* renamed from: U */
    public void mo32408U(ColorStateList colorStateList) {
        Drawable drawable = this.f35368c;
        if (drawable != null) {
            AbstractC1414a.m7197o(drawable, AbstractC29387b.m146554d(colorStateList));
        }
    }

    /* renamed from: V */
    public void m32409V(boolean z11) {
        this.f35372g = z11;
        m32419e0();
    }

    /* renamed from: W */
    public final void m32410W(C31694m c31694m) {
        this.f35366a = c31694m;
        C31689h c31689h = this.f35367b;
        if (c31689h != null) {
            c31689h.setShapeAppearanceModel(c31694m);
        }
        Object obj = this.f35368c;
        if (obj instanceof InterfaceC31697p) {
            ((InterfaceC31697p) obj).setShapeAppearanceModel(c31694m);
        }
        C6322c c6322c = this.f35369d;
        if (c6322c != null) {
            c6322c.m32376f(c31694m);
        }
    }

    /* renamed from: X */
    public final void m32411X(C24048h c24048h) {
        this.f35381p = c24048h;
    }

    /* renamed from: Y */
    abstract boolean mo32412Y();

    /* renamed from: a0 */
    public final boolean m32413a0() {
        if (this.f35371f && this.f35390y.getSizeDimension() < this.f35376k) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    public void m32414b0(j jVar, boolean z11) {
        if (m32434y()) {
            return;
        }
        Animator animator = this.f35380o;
        if (animator != null) {
            animator.cancel();
        }
        if (m32377Z()) {
            if (this.f35390y.getVisibility() != 0) {
                this.f35390y.setAlpha(0.0f);
                this.f35390y.setScaleY(0.0f);
                this.f35390y.setScaleX(0.0f);
                m32404Q(0.0f);
            }
            C24048h c24048h = this.f35381p;
            if (c24048h == null) {
                c24048h = m32386l();
            }
            AnimatorSet m32383h = m32383h(c24048h, 1.0f, 1.0f, 1.0f);
            m32383h.addListener(new b(z11, jVar));
            ArrayList arrayList = this.f35387v;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m32383h.addListener((Animator.AnimatorListener) it.next());
                }
            }
            m32383h.start();
            return;
        }
        this.f35390y.m32470b(0, z11);
        this.f35390y.setAlpha(1.0f);
        this.f35390y.setScaleY(1.0f);
        this.f35390y.setScaleX(1.0f);
        m32404Q(1.0f);
        if (jVar != null) {
            jVar.mo32353a();
        }
    }

    /* renamed from: c0 */
    abstract void mo32415c0();

    /* renamed from: d */
    public void m32416d(Animator.AnimatorListener animatorListener) {
        if (this.f35388w == null) {
            this.f35388w = new ArrayList();
        }
        this.f35388w.add(animatorListener);
    }

    /* renamed from: d0 */
    public final void m32417d0() {
        m32404Q(this.f35384s);
    }

    /* renamed from: e */
    public void m32418e(Animator.AnimatorListener animatorListener) {
        if (this.f35387v == null) {
            this.f35387v = new ArrayList();
        }
        this.f35387v.add(animatorListener);
    }

    /* renamed from: e0 */
    public final void m32419e0() {
        Rect rect = this.f35361A;
        mo32427r(rect);
        m32393F(rect);
        this.f35391z.mo32355a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: f */
    public void m32420f(i iVar) {
        if (this.f35389x == null) {
            this.f35389x = new ArrayList();
        }
        this.f35389x.add(iVar);
    }

    /* renamed from: f0 */
    public void m32421f0(float f11) {
        C31689h c31689h = this.f35367b;
        if (c31689h != null) {
            c31689h.m152441b0(f11);
        }
    }

    /* renamed from: j */
    public final Drawable m32422j() {
        return this.f35370e;
    }

    /* renamed from: m */
    public abstract float mo32423m();

    /* renamed from: n */
    public boolean m32424n() {
        return this.f35371f;
    }

    /* renamed from: o */
    public final C24048h m32425o() {
        return this.f35382q;
    }

    /* renamed from: p */
    public float m32426p() {
        return this.f35374i;
    }

    /* renamed from: r */
    public void mo32427r(Rect rect) {
        int i11;
        float f11;
        if (this.f35371f) {
            i11 = (this.f35376k - this.f35390y.getSizeDimension()) / 2;
        } else {
            i11 = 0;
        }
        if (this.f35372g) {
            f11 = mo32423m() + this.f35375j;
        } else {
            f11 = 0.0f;
        }
        int max = Math.max(i11, (int) Math.ceil(f11));
        int max2 = Math.max(i11, (int) Math.ceil(f11 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: s */
    public float m32428s() {
        return this.f35375j;
    }

    /* renamed from: t */
    public final C31694m m32429t() {
        return this.f35366a;
    }

    /* renamed from: u */
    public final C24048h m32430u() {
        return this.f35381p;
    }

    /* renamed from: v */
    public void m32431v(j jVar, boolean z11) {
        int i11;
        if (m32433x()) {
            return;
        }
        Animator animator = this.f35380o;
        if (animator != null) {
            animator.cancel();
        }
        if (m32377Z()) {
            C24048h c24048h = this.f35382q;
            if (c24048h == null) {
                c24048h = m32385k();
            }
            AnimatorSet m32383h = m32383h(c24048h, 0.0f, 0.0f, 0.0f);
            m32383h.addListener(new a(z11, jVar));
            ArrayList arrayList = this.f35388w;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m32383h.addListener((Animator.AnimatorListener) it.next());
                }
            }
            m32383h.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.f35390y;
        if (z11) {
            i11 = 8;
        } else {
            i11 = 4;
        }
        floatingActionButton.m32470b(i11, z11);
        if (jVar != null) {
            jVar.mo32354b();
        }
    }

    /* renamed from: w */
    public abstract void mo32432w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i11);

    /* renamed from: x */
    public boolean m32433x() {
        if (this.f35390y.getVisibility() == 0) {
            if (this.f35386u != 1) {
                return false;
            }
            return true;
        }
        if (this.f35386u == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public boolean m32434y() {
        if (this.f35390y.getVisibility() != 0) {
            if (this.f35386u != 2) {
                return false;
            }
            return true;
        }
        if (this.f35386u == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public abstract void mo32435z();
}
