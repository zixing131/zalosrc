package t80;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p354n3.C23528a;
import p500s1.C26087b;

/* renamed from: t80.f */
/* loaded from: classes6.dex */
public abstract class AbstractC26593f extends C16716d {

    /* renamed from: n1 */
    public static final float f125895n1 = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: M0 */
    ValueAnimator f125896M0;

    /* renamed from: N0 */
    ValueAnimator f125897N0;

    /* renamed from: O0 */
    C16719g.c f125898O0;

    /* renamed from: P0 */
    boolean f125899P0;

    /* renamed from: Q0 */
    boolean f125900Q0;

    /* renamed from: R0 */
    Handler f125901R0;

    /* renamed from: S0 */
    int f125902S0;

    /* renamed from: T0 */
    int f125903T0;

    /* renamed from: U0 */
    int f125904U0;

    /* renamed from: V0 */
    int f125905V0;

    /* renamed from: W0 */
    C23528a f125906W0;

    /* renamed from: X0 */
    C22122a0 f125907X0;

    /* renamed from: Y0 */
    C16719g f125908Y0;

    /* renamed from: Z0 */
    C16719g f125909Z0;

    /* renamed from: a1 */
    C26590c f125910a1;

    /* renamed from: b1 */
    C22122a0 f125911b1;

    /* renamed from: c1 */
    C21693c f125912c1;

    /* renamed from: d1 */
    C22126c0 f125913d1;

    /* renamed from: e1 */
    C21693c f125914e1;

    /* renamed from: f1 */
    float f125915f1;

    /* renamed from: g1 */
    Paint f125916g1;

    /* renamed from: h1 */
    RoundRectShape f125917h1;

    /* renamed from: i1 */
    Paint f125918i1;

    /* renamed from: j1 */
    int f125919j1;

    /* renamed from: k1 */
    public int f125920k1;

    /* renamed from: l1 */
    public int f125921l1;

    /* renamed from: m1 */
    float f125922m1;

    /* renamed from: t80.f$a */
    /* loaded from: classes6.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC26593f abstractC26593f;
            C16719g.c cVar;
            int i11 = message.what;
            if (i11 != 10) {
                if (i11 == 11 && (cVar = (abstractC26593f = AbstractC26593f.this).f125898O0) != null) {
                    cVar.mo929y(abstractC26593f);
                }
            } else {
                ValueAnimator valueAnimator = AbstractC26593f.this.f125896M0;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    AbstractC26593f.this.f125896M0.setFloatValues(1.0f, 0.85f);
                    AbstractC26593f.this.f125896M0.start();
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t80.f$b */
    /* loaded from: classes6.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC26593f abstractC26593f = AbstractC26593f.this;
            ValueAnimator valueAnimator = abstractC26593f.f125897N0;
            if (valueAnimator != null && abstractC26593f.f125900Q0) {
                valueAnimator.setFloatValues(abstractC26593f.m89128Y(), 1.0f);
                AbstractC26593f.this.f125897N0.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t80.f$c */
    /* loaded from: classes6.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC26593f abstractC26593f = AbstractC26593f.this;
            if (abstractC26593f.f125899P0) {
                abstractC26593f.f125901R0.removeMessages(11);
                AbstractC26593f.this.f125901R0.sendEmptyMessage(11);
            }
        }
    }

    public AbstractC26593f(Context context) {
        super(context);
        this.f125901R0 = new a(Looper.getMainLooper());
        m136536r1(context);
    }

    /* renamed from: q1 */
    private void m136533q1(Canvas canvas) {
        try {
            int m89114P = m89114P();
            int m89112O = m89112O();
            this.f125918i1.setColor(this.f125919j1);
            RoundRectShape roundRectShape = this.f125917h1;
            if (roundRectShape != null) {
                roundRectShape.resize(m89114P, m89112O);
            }
            int i11 = this.f125920k1;
            float f11 = this.f125915f1;
            float f12 = f11 / 2.0f;
            float f13 = f11 / 2.0f;
            float m89114P2 = m89114P() - (this.f125915f1 / 2.0f);
            float m89112O2 = m89112O();
            float f14 = this.f125915f1;
            float f15 = m89112O2 - (f14 / 2.0f);
            float f16 = i11;
            canvas.drawRoundRect(f12, f13, m89114P2, f15, f16 - (f14 / 2.0f), f16 - (f14 / 2.0f), this.f125916g1);
            canvas.save();
            float f17 = 0;
            canvas.translate(f17, f17);
            canvas.clipRect(0, 0, i11, i11);
            RoundRectShape roundRectShape2 = this.f125917h1;
            if (roundRectShape2 != null) {
                roundRectShape2.draw(canvas, this.f125918i1);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f17, f17);
            int i12 = m89114P - i11;
            canvas.clipRect(i12, 0, m89114P, i11);
            RoundRectShape roundRectShape3 = this.f125917h1;
            if (roundRectShape3 != null) {
                roundRectShape3.draw(canvas, this.f125918i1);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f17, f17);
            int i13 = m89112O - i11;
            canvas.clipRect(0, i13, i11, m89112O);
            RoundRectShape roundRectShape4 = this.f125917h1;
            if (roundRectShape4 != null) {
                roundRectShape4.draw(canvas, this.f125918i1);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f17, f17);
            canvas.clipRect(i12, i13, m89114P, m89112O);
            RoundRectShape roundRectShape5 = this.f125917h1;
            if (roundRectShape5 != null) {
                roundRectShape5.draw(canvas, this.f125918i1);
            }
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m136534u1(ValueAnimator valueAnimator) {
        mo89124V0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        mo89126W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ void m136535v1(ValueAnimator valueAnimator) {
        mo89124V0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        mo89126W0(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        if (mo136538t1()) {
            this.f125898O0 = cVar;
        } else {
            super.mo89109M0(cVar);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: V0 */
    public void mo89124V0(float f11) {
        super.mo89124V0(f11);
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: W0 */
    public void mo89126W0(float f11) {
        super.mo89126W0(f11);
        invalidate();
    }

    /* renamed from: r1 */
    public void m136536r1(Context context) {
        this.f125902S0 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_large_roundrect_width);
        this.f125903T0 = AbstractC23136l9.m118655I(AbstractC16802y.story_bar_thumb_large_roundrect_height);
        int m118742r = AbstractC23136l9.m118742r(36.0f);
        this.f125905V0 = m118742r;
        this.f125904U0 = m118742r;
        this.f125915f1 = f125895n1;
        m89106L().m89036T(AbstractC23136l9.m118742r(2.0f)).m89033Q(AbstractC23136l9.m118742r(2.0f));
        mo89161z0(C23212s8.m119607o(context, AbstractC16781w.bg_story_item_name));
        m136539w1(AbstractC23136l9.m118655I(AbstractC16802y.story_bar_item_large_roundrect_corner_radius), 0, 0.1f);
        this.f125919j1 = C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor);
        Paint paint = new Paint(1);
        this.f125918i1 = paint;
        paint.setColor(this.f125919j1);
        Paint paint2 = new Paint(1);
        this.f125916g1 = paint2;
        paint2.setColor(C23212s8.m119607o(context, AbstractC16781w.StoryItemStrokeColor));
        this.f125916g1.setStyle(Paint.Style.STROKE);
        this.f125916g1.setStrokeWidth(this.f125915f1);
        this.f125906W0 = new C23528a(context);
        this.f125913d1 = new C22126c0(context);
        this.f125910a1 = new C26590c(context);
        C22122a0 c22122a0 = new C22122a0(context);
        this.f125907X0 = c22122a0;
        c22122a0.m89106L().m89028L(this.f125902S0, this.f125903T0).m89046b0(1).m89048d0(1).m89047c0(1).m89018B(Boolean.TRUE).m89026J(true);
        this.f125907X0.m111929z1(5);
        m89001g1(this.f125907X0);
        C16719g c16719g = new C16719g(context);
        this.f125908Y0 = c16719g;
        c16719g.m89106L().m89071x(this.f125907X0).m89019C(this.f125907X0).m89020D(this.f125907X0).m89067t(this.f125907X0);
        this.f125908Y0.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.white_70));
        this.f125908Y0.mo44614b1(8);
        m89001g1(this.f125908Y0);
        C16719g c16719g2 = new C16719g(context);
        this.f125909Z0 = c16719g2;
        c16719g2.m89106L().m89071x(this.f125907X0).m89019C(this.f125907X0).m89020D(this.f125910a1).m89067t(this.f125907X0);
        this.f125909Z0.m89087B0(AbstractC16803z.bg_gradient_overlay_thumb);
        m89001g1(this.f125909Z0);
        C22122a0 c22122a02 = new C22122a0(context);
        this.f125911b1 = c22122a02;
        c22122a02.m89106L().m89028L(-1, -1);
        C22122a0 c22122a03 = new C22122a0(context);
        this.f125912c1 = c22122a03;
        c22122a03.m89106L().m89028L(-1, -1);
        this.f125912c1.mo44614b1(8);
        this.f125913d1.m89106L().m89028L(-2, -2).m89046b0(AbstractC23136l9.m118742r(6.0f)).m89047c0(AbstractC23136l9.m118742r(6.0f)).m89026J(true).m89067t(this.f125907X0).m89036T(AbstractC23136l9.m118742r(2.0f)).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89029M(17);
        this.f125913d1.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f1s));
        this.f125913d1.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        this.f125913d1.m111953A1(1);
        this.f125913d1.m111980v1(TextUtils.TruncateAt.END);
        m89001g1(this.f125913d1);
        this.f125910a1.m89106L().m89028L(this.f125904U0, this.f125905V0).m89066s(this.f125913d1).m89026J(true).m89029M(17);
        this.f125910a1.m89001g1(this.f125911b1);
        this.f125910a1.m89001g1(this.f125912c1);
        m89001g1(this.f125910a1);
        C21693c c21693c = new C21693c(context);
        this.f125914e1 = c21693c;
        c21693c.m89106L().m89028L(-2, -2).m89069v(this.f125907X0).m89070w(this.f125907X0);
        this.f125914e1.mo111926w1(AbstractC16803z.icon_story_feed_warning2);
        this.f125914e1.mo44614b1(8);
        m89001g1(this.f125914e1);
        if (mo136538t1()) {
            m136537s1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: s */
    public void mo44179s(Canvas canvas) {
        super.mo44179s(canvas);
        m136533q1(canvas);
    }

    /* renamed from: s1 */
    void m136537s1() {
        if (this.f125896M0 == null || this.f125897N0 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.85f);
            this.f125896M0 = ofFloat;
            ofFloat.setDuration(70L);
            this.f125896M0.setInterpolator(new C26087b());
            this.f125896M0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t80.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC26593f.this.m136534u1(valueAnimator);
                }
            });
            this.f125896M0.addListener(new b());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.85f, 1.0f);
            this.f125897N0 = ofFloat2;
            ofFloat2.setDuration(70L);
            this.f125897N0.setInterpolator(new C26087b());
            this.f125897N0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t80.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC26593f.this.m136535v1(valueAnimator);
                }
            });
            this.f125897N0.addListener(new c());
        }
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    public boolean mo65871t0(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (mo136538t1()) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 3) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f125900Q0 = z11;
            if (action == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f125899P0 = z12;
            if (action == 0) {
                this.f125901R0.sendEmptyMessageDelayed(10, 300L);
                return true;
            }
            if (action == 3) {
                mo136540x1(false);
                if (this.f125901R0.hasMessages(10)) {
                    this.f125901R0.removeMessages(10);
                }
                if (this.f125896M0 != null && (valueAnimator2 = this.f125897N0) != null && !valueAnimator2.isRunning()) {
                    this.f125896M0.cancel();
                    this.f125897N0.setFloatValues(m89128Y(), 1.0f);
                    this.f125897N0.start();
                }
                return false;
            }
            if (action != 4 && action != 1) {
                return super.mo65871t0(motionEvent);
            }
            if (this.f125901R0.hasMessages(10)) {
                mo136540x1(true);
                this.f125901R0.removeMessages(10);
                this.f125901R0.sendEmptyMessage(10);
            } else {
                ValueAnimator valueAnimator3 = this.f125896M0;
                if (valueAnimator3 != null && !valueAnimator3.isRunning() && (valueAnimator = this.f125897N0) != null && !valueAnimator.isRunning()) {
                    this.f125897N0.setFloatValues(m89128Y(), 1.0f);
                    this.f125897N0.start();
                }
            }
            return false;
        }
        return super.mo65871t0(motionEvent);
    }

    /* renamed from: t1 */
    abstract boolean mo136538t1();

    /* renamed from: w1 */
    void m136539w1(int i11, int i12, float f11) {
        this.f125920k1 = i11;
        this.f125921l1 = i12;
        this.f125922m1 = f11;
        int i13 = this.f125921l1;
        float[] fArr = {i13, i13, i13, i13, i13, i13, i13, i13};
        float f12 = this.f125922m1;
        RectF rectF = new RectF(f12, f12, f12, f12);
        int i14 = this.f125920k1;
        this.f125917h1 = new RoundRectShape(fArr, rectF, new float[]{i14, i14, i14, i14, i14, i14, i14, i14});
    }

    /* renamed from: x1 */
    abstract void mo136540x1(boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y1 */
    public void m136541y1() {
        C16719g c16719g = this.f125909Z0;
        if (c16719g != null) {
            c16719g.m89106L().m89020D(null).m89018B(Boolean.TRUE);
        }
    }
}
