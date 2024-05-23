package m70;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.zing.zalo.cameradecor.view.ImageDecorView;
import fn0.AbstractC19074t;
import p276jt.AbstractC21351f;
import p276jt.C21357l;

/* renamed from: m70.b */
/* loaded from: classes5.dex */
public final class C22949b {

    /* renamed from: a */
    private final ImageDecorView f111641a;

    /* renamed from: b */
    private AbstractC21351f f111642b;

    /* renamed from: c */
    private float f111643c;

    /* renamed from: d */
    private float f111644d;

    /* renamed from: e */
    private float f111645e;

    /* renamed from: f */
    private float f111646f;

    /* renamed from: g */
    private float f111647g;

    /* renamed from: h */
    private float f111648h;

    /* renamed from: i */
    private float f111649i;

    /* renamed from: j */
    private float f111650j;

    /* renamed from: k */
    private float f111651k;

    /* renamed from: l */
    private float f111652l;

    /* renamed from: m */
    private float f111653m;

    /* renamed from: n */
    private float f111654n;

    /* renamed from: o */
    private float f111655o;

    /* renamed from: p */
    private float f111656p;

    /* renamed from: q */
    private float f111657q;

    /* renamed from: r */
    private float f111658r;

    /* renamed from: s */
    private float f111659s;

    /* renamed from: t */
    private float f111660t;

    /* renamed from: u */
    private float f111661u;

    /* renamed from: v */
    private float f111662v;

    /* renamed from: w */
    private boolean f111663w;

    /* renamed from: x */
    private boolean f111664x;

    /* renamed from: y */
    private final ValueAnimator f111665y;

    /* renamed from: z */
    private b f111666z;

    /* renamed from: m70.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b bVar;
            AbstractC19074t.m100208f(animator, "animation");
            if (!C22949b.this.f111664x && (bVar = C22949b.this.f111666z) != null) {
                bVar.mo38324a(C22949b.this.m117666f());
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            b bVar = C22949b.this.f111666z;
            if (bVar != null) {
                bVar.mo38325b();
            }
        }
    }

    /* renamed from: m70.b$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo38324a(AbstractC21351f abstractC21351f);

        /* renamed from: b */
        void mo38325b();
    }

    public C22949b(ImageDecorView imageDecorView, AbstractC21351f abstractC21351f, int i11, int i12, float f11, int i13) {
        AbstractC19074t.m100208f(imageDecorView, "imageDecorView");
        this.f111641a = imageDecorView;
        this.f111642b = abstractC21351f;
        this.f111643c = f11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AbstractC19074t.m100207e(ofFloat, "ofFloat(...)");
        this.f111665y = ofFloat;
        m117674n(i11, i12);
        m117676p(i13);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m70.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22949b.m117662b(C22949b.this, valueAnimator);
            }
        });
        ofFloat.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m117662b(C22949b c22949b, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c22949b, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        AbstractC21351f abstractC21351f = c22949b.f111642b;
        if (abstractC21351f != null) {
            float f11 = (c22949b.f111650j * floatValue) + c22949b.f111646f;
            c22949b.f111644d = f11;
            c22949b.f111645e = (c22949b.f111651k * floatValue) + c22949b.f111647g;
            c22949b.f111652l = (c22949b.f111654n * floatValue) + c22949b.f111653m;
            c22949b.f111655o = (c22949b.f111658r * floatValue) + c22949b.f111656p;
            c22949b.f111659s = (c22949b.f111662v * floatValue) + c22949b.f111660t;
            abstractC21351f.mo110614r0(f11);
            abstractC21351f.m110615s0(c22949b.f111645e);
            abstractC21351f.m110611n0(c22949b.f111652l);
            abstractC21351f.mo97628p0(c22949b.f111655o);
            abstractC21351f.mo1953W(c22949b.f111659s);
            if (c22949b.f111663w) {
                c22949b.f111641a.m39754L(abstractC21351f);
            }
            c22949b.f111641a.mo39680s();
        }
    }

    /* renamed from: e */
    public final void m117665e() {
        this.f111664x = true;
    }

    /* renamed from: f */
    public final AbstractC21351f m117666f() {
        return this.f111642b;
    }

    /* renamed from: g */
    public final boolean m117667g() {
        return this.f111663w;
    }

    /* renamed from: h */
    public final void m117668h(float f11) {
        this.f111661u = f11;
    }

    /* renamed from: i */
    public final void m117669i(float f11) {
        float f12 = 360;
        float f13 = f11 % f12;
        if (f13 < -180.0f) {
            f13 += f12;
        } else if (f13 > 180.0f) {
            f13 -= f12;
        }
        this.f111643c = f13;
    }

    /* renamed from: j */
    public final void m117670j(AbstractC21351f abstractC21351f) {
        this.f111642b = abstractC21351f;
    }

    /* renamed from: k */
    public final void m117671k(int i11) {
        this.f111665y.setDuration(i11);
    }

    /* renamed from: l */
    public final void m117672l(TimeInterpolator timeInterpolator) {
        this.f111665y.setInterpolator(timeInterpolator);
    }

    /* renamed from: m */
    public final void m117673m(b bVar) {
        this.f111666z = bVar;
    }

    /* renamed from: n */
    public final void m117674n(float f11, float f12) {
        this.f111648h = f11;
        this.f111649i = f12;
    }

    /* renamed from: o */
    public final void m117675o(float f11) {
        this.f111657q = f11;
    }

    /* renamed from: p */
    public final void m117676p(int i11) {
        AbstractC21351f abstractC21351f = this.f111642b;
        if (abstractC21351f instanceof C21357l) {
            AbstractC19074t.m100206d(abstractC21351f, "null cannot be cast to non-null type com.zing.zalo.imgdecor.model.DecorText");
            this.f111657q = i11 / ((C21357l) abstractC21351f).m110653D0().f104106m;
        }
    }

    /* renamed from: q */
    public final void m117677q(boolean z11) {
        AbstractC21351f abstractC21351f = this.f111642b;
        if (abstractC21351f != null) {
            this.f111663w = z11;
            this.f111664x = false;
            this.f111646f = abstractC21351f.m110606f0();
            this.f111647g = abstractC21351f.m110607g0();
            this.f111653m = abstractC21351f.m110604c0();
            this.f111656p = abstractC21351f.m110605e0();
            float m1947K = abstractC21351f.m1947K();
            this.f111660t = m1947K;
            float f11 = 360;
            float f12 = this.f111653m % f11;
            this.f111653m = f12;
            if (f12 < -180.0f) {
                this.f111653m = f12 + f11;
            } else if (f12 > 180.0f) {
                this.f111653m = f12 - f11;
            }
            this.f111650j = this.f111648h - this.f111646f;
            this.f111651k = this.f111649i - this.f111647g;
            this.f111654n = this.f111643c - this.f111653m;
            this.f111658r = this.f111657q - this.f111656p;
            this.f111662v = this.f111661u - m1947K;
            this.f111665y.start();
        }
    }
}
