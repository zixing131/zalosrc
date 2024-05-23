package o80;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* renamed from: o80.c */
/* loaded from: classes6.dex */
public final class C24119c extends C16719g {

    /* renamed from: D0 */
    private Paint f116533D0;

    /* renamed from: E0 */
    private boolean f116534E0;

    /* renamed from: F0 */
    private final Rect f116535F0;

    /* renamed from: G0 */
    private ValueAnimator f116536G0;

    /* renamed from: H0 */
    private boolean f116537H0;

    /* renamed from: I0 */
    private int f116538I0;

    /* renamed from: J0 */
    private int f116539J0;

    /* renamed from: K0 */
    private int f116540K0;

    /* renamed from: L0 */
    private boolean f116541L0;

    /* renamed from: M0 */
    private boolean f116542M0;

    /* renamed from: o80.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            C24119c.this.mo44614b1(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24119c(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f116533D0 = new Paint();
        this.f116535F0 = new Rect();
        this.f116539J0 = 25;
        this.f116540K0 = 35;
        this.f116533D0.setColor(-1);
        this.f116533D0.setStyle(Paint.Style.STROKE);
        this.f116533D0.setStrokeWidth(AbstractC23136l9.m118742r(1.0f));
        this.f116533D0.setFlags(1);
        this.f116534E0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m126026i1(C24119c c24119c, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c24119c, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        try {
            int i11 = c24119c.f116538I0;
            int i12 = c24119c.f116540K0;
            if (i11 < i12 && !c24119c.f116537H0) {
                for (int i13 = 0; i13 < 3; i13++) {
                    c24119c.f116538I0++;
                    c24119c.invalidate();
                }
                if (c24119c.f116538I0 >= c24119c.f116540K0) {
                    c24119c.f116537H0 = true;
                }
            } else if (c24119c.f116537H0) {
                if (i11 >= i12 && !c24119c.f116542M0) {
                    c24119c.f116542M0 = true;
                    c24119c.f116541L0 = false;
                }
                if (i11 <= c24119c.f116539J0 && !c24119c.f116541L0) {
                    c24119c.f116542M0 = false;
                    c24119c.f116541L0 = true;
                }
                if (c24119c.f116542M0) {
                    c24119c.f116538I0 = i11 - 1;
                }
                if (c24119c.f116541L0) {
                    c24119c.f116538I0++;
                }
            }
            c24119c.invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h1 */
    public final void m126027h1(boolean z11) {
        m126029k1();
        mo44614b1(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10);
        this.f116536G0 = ofInt;
        ofInt.setDuration(3000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o80.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C24119c.m126026i1(C24119c.this, valueAnimator);
            }
        });
        ofInt.addListener(new a());
        ofInt.start();
    }

    /* renamed from: j1 */
    public final void m126028j1(boolean z11, Rect rect) {
        AbstractC19074t.m100208f(rect, "tArea");
        if (this.f116534E0 != z11 || !AbstractC19074t.m100204b(rect, this.f116535F0)) {
            invalidate();
        }
        this.f116534E0 = z11;
        this.f116535F0.set(rect);
        if (!z11) {
            m126029k1();
            this.f116537H0 = false;
        } else {
            m126027h1(z11);
        }
    }

    /* renamed from: k1 */
    public final void m126029k1() {
        ValueAnimator valueAnimator;
        this.f116538I0 = 0;
        ValueAnimator valueAnimator2 = this.f116536G0;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f116536G0) != null) {
            valueAnimator.cancel();
        }
        this.f116536G0 = null;
        mo44614b1(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f116534E0) {
            this.f116533D0.setColor(-1);
            Rect rect = this.f116535F0;
            canvas.drawCircle(rect.left + 50, rect.top + 50, AbstractC23136l9.m118742r(this.f116538I0), this.f116533D0);
            return;
        }
        canvas.drawColor(0);
    }
}
