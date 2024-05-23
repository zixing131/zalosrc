package l00;

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

/* renamed from: l00.b */
/* loaded from: classes4.dex */
public abstract class AbstractC21994b extends RecyclerView.AbstractC1887n implements RecyclerView.InterfaceC1891r {

    /* renamed from: F */
    private static final int[] f108314F = {R.attr.state_pressed};

    /* renamed from: G */
    private static final int[] f108315G = new int[0];

    /* renamed from: B */
    final ValueAnimator f108317B;

    /* renamed from: C */
    int f108318C;

    /* renamed from: D */
    private final Runnable f108319D;

    /* renamed from: E */
    private final RecyclerView.AbstractC1892s f108320E;

    /* renamed from: a */
    private final int f108321a;

    /* renamed from: b */
    private final int f108322b;

    /* renamed from: e */
    final StateListDrawable f108325e;

    /* renamed from: f */
    final Drawable f108326f;

    /* renamed from: g */
    private final int f108327g;

    /* renamed from: h */
    private final int f108328h;

    /* renamed from: i */
    private final StateListDrawable f108329i;

    /* renamed from: j */
    private final Drawable f108330j;

    /* renamed from: k */
    private final int f108331k;

    /* renamed from: l */
    private final int f108332l;

    /* renamed from: m */
    int f108333m;

    /* renamed from: n */
    int f108334n;

    /* renamed from: o */
    float f108335o;

    /* renamed from: p */
    int f108336p;

    /* renamed from: q */
    int f108337q;

    /* renamed from: r */
    float f108338r;

    /* renamed from: u */
    public RecyclerView f108341u;

    /* renamed from: c */
    protected float f108323c = 0.0f;

    /* renamed from: d */
    protected float f108324d = 0.0f;

    /* renamed from: s */
    public int f108339s = 0;

    /* renamed from: t */
    public int f108340t = 0;

    /* renamed from: v */
    private boolean f108342v = false;

    /* renamed from: w */
    private boolean f108343w = false;

    /* renamed from: x */
    private int f108344x = 0;

    /* renamed from: y */
    public int f108345y = 0;

    /* renamed from: z */
    private final int[] f108346z = new int[2];

    /* renamed from: A */
    private final int[] f108316A = new int[2];

    /* renamed from: l00.b$a */
    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC21994b.this.m114866v(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        }
    }

    /* renamed from: l00.b$b */
    /* loaded from: classes4.dex */
    class b extends RecyclerView.AbstractC1892s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC21994b.this.m114849L(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: l00.b$c */
    /* loaded from: classes4.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f108349p = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f108349p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f108349p) {
                this.f108349p = false;
                return;
            }
            if (((Float) AbstractC21994b.this.f108317B.getAnimatedValue()).floatValue() == 0.0f) {
                AbstractC21994b abstractC21994b = AbstractC21994b.this;
                abstractC21994b.f108318C = 0;
                abstractC21994b.m114860I(0);
            } else {
                AbstractC21994b abstractC21994b2 = AbstractC21994b.this;
                abstractC21994b2.f108318C = 2;
                abstractC21994b2.m114858E();
            }
        }
    }

    /* renamed from: l00.b$d */
    /* loaded from: classes4.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            AbstractC21994b.this.f108325e.setAlpha(floatValue);
            AbstractC21994b.this.f108326f.setAlpha(floatValue);
            AbstractC21994b.this.m114858E();
        }
    }

    public AbstractC21994b(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f108317B = ofFloat;
        this.f108318C = 0;
        this.f108319D = new a();
        this.f108320E = new b();
        this.f108325e = stateListDrawable;
        this.f108326f = drawable;
        this.f108329i = stateListDrawable2;
        this.f108330j = drawable2;
        this.f108327g = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f108328h = Math.max(i11, drawable.getIntrinsicWidth());
        this.f108331k = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.f108332l = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f108321a = i12;
        this.f108322b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        m114863n(recyclerView);
    }

    /* renamed from: A */
    private boolean m114845A(float f11, float f12) {
        if (!m114855y() ? f11 >= this.f108339s - this.f108327g : f11 <= this.f108327g / 2) {
            int i11 = this.f108334n;
            int i12 = this.f108333m;
            if (f12 >= i11 - (i12 / 2) && f12 <= i11 + (i12 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    private void m114846F(int i11) {
        m114851o();
        this.f108341u.postDelayed(this.f108319D, i11);
    }

    /* renamed from: G */
    private int m114847G(float f11, float f12, int[] iArr, int i11, int i12, int i13) {
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

    /* renamed from: J */
    private void m114848J() {
        this.f108341u.m9816A(this);
        this.f108341u.m9825D(this);
        this.f108341u.m9826E(this.f108320E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m114849L(int i11, int i12) {
        boolean z11;
        boolean z12;
        boolean z13;
        int computeVerticalScrollRange = this.f108341u.computeVerticalScrollRange();
        int i13 = this.f108340t;
        if (!this.f108342v) {
            if (computeVerticalScrollRange > i13 * 5) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f108342v = z13;
        }
        boolean z14 = this.f108342v;
        if (i13 >= this.f108321a) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f108342v = z14 & z11;
        int computeHorizontalScrollRange = this.f108341u.computeHorizontalScrollRange();
        int i14 = this.f108339s;
        if (computeHorizontalScrollRange - i14 > 0 && i14 >= this.f108321a) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f108343w = z12;
        boolean z15 = this.f108342v;
        if (!z15 && !z12) {
            if (this.f108344x != 0) {
                m114860I(0);
                return;
            }
            return;
        }
        if (z15) {
            int intrinsicHeight = this.f108325e.getIntrinsicHeight();
            this.f108333m = intrinsicHeight;
            int i15 = (int) (((i13 - intrinsicHeight) * (i12 / (computeVerticalScrollRange - i13))) + (intrinsicHeight / 2.0f));
            this.f108334n = i15;
            this.f108334n = (int) m114862m(i15);
        }
        if (this.f108343w) {
            float f11 = i14;
            this.f108337q = (int) ((f11 * (i11 + (f11 / 2.0f))) / computeHorizontalScrollRange);
            this.f108336p = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
        }
        int i16 = this.f108344x;
        if (i16 == 0 || i16 == 1) {
            if (i12 > 0 || i11 > 0) {
                m114860I(1);
            }
        }
    }

    /* renamed from: o */
    private void m114851o() {
        this.f108341u.removeCallbacks(this.f108319D);
    }

    /* renamed from: p */
    private void m114852p() {
        this.f108341u.m9907x1(this);
        this.f108341u.m9818A1(this);
        this.f108341u.m9821B1(this.f108320E);
        m114851o();
    }

    /* renamed from: q */
    private void m114853q(Canvas canvas) {
        int i11 = this.f108340t;
        int i12 = this.f108331k;
        int i13 = this.f108337q;
        int i14 = this.f108336p;
        this.f108329i.setBounds(0, 0, i14, i12);
        this.f108330j.setBounds(0, 0, this.f108339s, this.f108332l);
        canvas.translate(0.0f, i11 - i12);
        this.f108330j.draw(canvas);
        canvas.translate(i13 - (i14 / 2), 0.0f);
        this.f108329i.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    /* renamed from: r */
    private void m114854r(Canvas canvas) {
        int i11 = this.f108339s;
        int i12 = this.f108327g;
        int i13 = i11 - i12;
        int i14 = this.f108334n;
        int i15 = this.f108333m;
        int i16 = i14 - (i15 / 2);
        this.f108325e.setBounds(0, 0, i12, i15);
        this.f108326f.setBounds(0, 0, this.f108328h, this.f108340t);
        if (m114855y()) {
            this.f108326f.draw(canvas);
            canvas.translate(this.f108327g, i16);
            canvas.scale(-1.0f, 1.0f);
            this.f108325e.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate(-this.f108327g, -i16);
            return;
        }
        float f11 = i13;
        canvas.translate(f11, 0.0f);
        this.f108326f.draw(canvas);
        canvas.translate(0.0f, i16);
        this.f108325e.draw(canvas);
        canvas.translate(-i13, -i16);
        canvas.save();
        canvas.translate(f11, (this.f108333m / 2) + i16);
        mo65882B(canvas, i13, i16 + (this.f108333m / 2));
        canvas.restore();
    }

    /* renamed from: y */
    private boolean m114855y() {
        if (AbstractC1579n0.m7812G(this.f108341u) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m114856z(float f11, float f12) {
        if (f12 >= this.f108340t - this.f108331k) {
            int i11 = this.f108337q;
            int i12 = this.f108336p;
            if (f11 >= i11 - (i12 / 2) && f11 <= i11 + (i12 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public void mo65882B(Canvas canvas, int i11, int i12) {
    }

    /* renamed from: C */
    protected abstract void mo114841C(int i11, int i12);

    /* renamed from: D */
    float m114857D(float f11) {
        float max = Math.max(0.0f, f11 - this.f108323c);
        int i11 = this.f108340t;
        return (max / (i11 - (this.f108323c + this.f108324d))) * i11;
    }

    /* renamed from: E */
    void m114858E() {
        this.f108341u.invalidate();
    }

    /* renamed from: H */
    public void m114859H(float f11, float f12) {
        this.f108323c = f11;
        this.f108324d = f12;
    }

    /* renamed from: I */
    void m114860I(int i11) {
        if (i11 == 2 && this.f108344x != 2) {
            this.f108325e.setState(f108314F);
            m114851o();
        }
        if (i11 == 0) {
            m114858E();
        } else {
            m114861K();
        }
        if (this.f108344x == 2 && i11 != 2) {
            this.f108325e.setState(f108315G);
            m114846F(1200);
        } else if (i11 == 1) {
            m114846F(1500);
        }
        this.f108344x = i11;
    }

    /* renamed from: K */
    public void m114861K() {
        int i11 = this.f108318C;
        if (i11 != 0) {
            if (i11 == 3) {
                this.f108317B.cancel();
            } else {
                return;
            }
        }
        this.f108318C = 1;
        ValueAnimator valueAnimator = this.f108317B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f108317B.setDuration(500L);
        this.f108317B.setStartDelay(0L);
        this.f108317B.start();
    }

    /* renamed from: M */
    protected abstract void mo114842M(float f11);

    /* renamed from: a */
    public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f108344x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m114845A = m114845A(motionEvent.getX(), motionEvent.getY());
            boolean m114856z = m114856z(motionEvent.getX(), motionEvent.getY());
            if (m114845A || m114856z) {
                if (m114856z) {
                    this.f108345y = 1;
                    this.f108338r = (int) motionEvent.getX();
                } else if (m114845A) {
                    this.f108345y = 2;
                    this.f108335o = (int) m114857D(motionEvent.getY());
                }
                m114860I(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f108344x == 2) {
            this.f108335o = 0.0f;
            this.f108338r = 0.0f;
            m114860I(1);
            this.f108345y = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f108344x == 2) {
            m114861K();
            if (this.f108345y == 1) {
                m114867w(motionEvent.getX());
            }
            if (this.f108345y == 2) {
                mo114842M(m114857D(motionEvent.getY()));
            }
        }
    }

    /* renamed from: c */
    public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i11 = this.f108344x;
        if (i11 == 1) {
            boolean m114845A = m114845A(motionEvent.getX(), motionEvent.getY());
            boolean m114856z = m114856z(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m114845A && !m114856z) {
                return false;
            }
            if (m114856z) {
                this.f108345y = 1;
                this.f108338r = (int) motionEvent.getX();
            } else if (m114845A) {
                this.f108345y = 2;
                this.f108335o = (int) m114857D(motionEvent.getY());
            }
            m114860I(2);
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
        if (this.f108339s != this.f108341u.getWidth() || this.f108340t != this.f108341u.getHeight()) {
            this.f108339s = this.f108341u.getWidth();
            this.f108340t = this.f108341u.getHeight();
        }
        mo114841C(this.f108341u.computeVerticalScrollOffset(), this.f108341u.computeVerticalScrollRange());
        if (this.f108318C != 0) {
            if (this.f108342v) {
                m114854r(canvas);
            }
            if (this.f108343w) {
                m114853q(canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public float m114862m(float f11) {
        int i11 = this.f108340t;
        float f12 = f11 / i11;
        float f13 = this.f108323c;
        return (f12 * (i11 - (this.f108324d + f13))) + f13;
    }

    /* renamed from: n */
    public void m114863n(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f108341u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m114852p();
        }
        this.f108341u = recyclerView;
        if (recyclerView != null) {
            m114848J();
        }
    }

    /* renamed from: s */
    public int[] m114864s() {
        int[] iArr = this.f108316A;
        int i11 = this.f108322b;
        iArr[0] = i11;
        iArr[1] = this.f108339s - i11;
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public int[] m114865t() {
        int[] iArr = this.f108346z;
        int i11 = this.f108322b;
        iArr[0] = i11;
        iArr[1] = this.f108340t - i11;
        return iArr;
    }

    /* renamed from: u */
    public void mo65930u() {
        m114866v(0);
    }

    /* renamed from: v */
    public void m114866v(int i11) {
        int i12 = this.f108318C;
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
        } else {
            this.f108317B.cancel();
        }
        this.f108318C = 3;
        ValueAnimator valueAnimator = this.f108317B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f108317B.setDuration(i11);
        this.f108317B.start();
    }

    /* renamed from: w */
    protected void m114867w(float f11) {
        int[] m114864s = m114864s();
        float max = Math.max(m114864s[0], Math.min(m114864s[1], f11));
        if (Math.abs(this.f108337q - max) < 2.0f) {
            return;
        }
        int m114847G = m114847G(this.f108338r, max, m114864s, this.f108341u.computeHorizontalScrollRange(), this.f108341u.computeHorizontalScrollOffset(), this.f108339s);
        if (m114847G != 0) {
            this.f108341u.scrollBy(m114847G, 0);
        }
        this.f108338r = max;
    }

    /* renamed from: x */
    public boolean m114868x() {
        return this.f108344x == 2;
    }
}
