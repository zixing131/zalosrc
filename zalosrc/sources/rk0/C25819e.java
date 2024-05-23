package rk0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import fn0.AbstractC19074t;

/* renamed from: rk0.e */
/* loaded from: classes7.dex */
public final class C25819e extends ValueAnimator {

    /* renamed from: p */
    private final InterfaceC25815a f123145p;

    /* renamed from: q */
    private boolean f123146q;

    /* renamed from: r */
    private boolean f123147r;

    /* renamed from: s */
    private boolean f123148s;

    /* renamed from: t */
    private boolean f123149t;

    /* renamed from: rk0.e$a */
    /* loaded from: classes7.dex */
    public static final class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C25819e.this.m133130e();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C25819e.this.m133131f();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C25819e.this.m133133h();
        }
    }

    public C25819e(InterfaceC25815a interfaceC25815a) {
        AbstractC19074t.m100208f(interfaceC25815a, "mListener");
        this.f123145p = interfaceC25815a;
        addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m133130e() {
        m133132g();
        if (this.f123146q && !this.f123149t) {
            this.f123149t = true;
            this.f123145p.mo133110c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m133131f() {
        if (this.f123147r && !this.f123148s) {
            this.f123148s = true;
            this.f123145p.mo133109b(this);
        }
    }

    /* renamed from: g */
    private final void m133132g() {
        if (!this.f123146q) {
            this.f123146q = true;
            this.f123145p.mo133108a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m133133h() {
        if (this.f123146q && !this.f123147r) {
            this.f123147r = true;
            this.f123145p.mo133111d(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        m133130e();
        super.cancel();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void start() {
        m133132g();
        super.start();
    }
}
