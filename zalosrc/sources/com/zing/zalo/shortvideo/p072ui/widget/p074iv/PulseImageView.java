package com.zing.zalo.shortvideo.p072ui.widget.p074iv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class PulseImageView extends AppCompatImageView {

    /* renamed from: p */
    private boolean f54342p;

    /* renamed from: q */
    private boolean f54343q;

    /* renamed from: r */
    private ChoreographerFrameCallbackC10752b f54344r;

    /* renamed from: s */
    private ChoreographerFrameCallbackC10753c f54345s;

    /* renamed from: t */
    private ChoreographerFrameCallbackC10751a f54346t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.PulseImageView$a */
    /* loaded from: classes5.dex */
    public static final class ChoreographerFrameCallbackC10751a implements Choreographer.FrameCallback {

        /* renamed from: p */
        private final PulseImageView f54347p;

        /* renamed from: q */
        private long f54348q;

        /* renamed from: r */
        private final long f54349r;

        /* renamed from: s */
        private final long f54350s;

        /* renamed from: t */
        private final long f54351t;

        /* renamed from: u */
        private int f54352u;

        /* renamed from: v */
        private final LinearInterpolator f54353v;

        /* renamed from: w */
        private final Interpolator f54354w;

        public ChoreographerFrameCallbackC10751a(PulseImageView pulseImageView) {
            AbstractC19074t.m100208f(pulseImageView, "view");
            this.f54347p = pulseImageView;
            this.f54349r = 300L;
            this.f54350s = 1000L;
            this.f54351t = 300L;
            this.f54352u = 2;
            this.f54353v = new LinearInterpolator();
            this.f54354w = new Interpolator() { // from class: com.zing.zalo.shortvideo.ui.widget.iv.a
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f11) {
                    float m55940b;
                    m55940b = PulseImageView.ChoreographerFrameCallbackC10751a.m55940b(f11);
                    return m55940b;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final float m55940b(float f11) {
            return 1.0f - (((float) Math.sin((2 * f11) * 3.1415927f)) * 0.1f);
        }

        /* renamed from: c */
        public final void m55941c() {
            m55942d();
            Choreographer.getInstance().postFrameCallback(this);
        }

        /* renamed from: d */
        public final void m55942d() {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f54348q = 0L;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            boolean z11;
            boolean z12;
            if (this.f54348q == 0) {
                this.f54348q = j11 / 1000000;
            }
            long j12 = (j11 / 1000000) - this.f54348q;
            long j13 = this.f54349r;
            boolean z13 = false;
            if (j12 <= j13) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                j12 -= j13;
            }
            if (z11) {
                this.f54347p.m55934i(this.f54353v.getInterpolation(((float) j12) / ((float) j13)));
            } else {
                int i11 = this.f54352u;
                long j14 = i11;
                long j15 = this.f54350s;
                if (j14 > j12 / j15) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    j12 -= i11 * j15;
                }
                if (z12) {
                    this.f54347p.m55935j(this.f54354w.getInterpolation(((float) j12) / ((float) j15)));
                } else {
                    long j16 = this.f54351t;
                    if (j12 <= j16) {
                        z13 = true;
                    }
                    if (!z13) {
                        j12 -= j16;
                    }
                    if (z13) {
                        this.f54347p.m55934i(this.f54353v.getInterpolation(1.0f - (((float) j12) / ((float) j16))));
                    }
                }
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.PulseImageView$b */
    /* loaded from: classes5.dex */
    public static final class ChoreographerFrameCallbackC10752b implements Choreographer.FrameCallback {

        /* renamed from: p */
        private final PulseImageView f54355p;

        /* renamed from: q */
        private boolean f54356q;

        /* renamed from: r */
        private boolean f54357r;

        /* renamed from: s */
        private Interpolator f54358s;

        /* renamed from: t */
        private long f54359t;

        /* renamed from: u */
        private long f54360u;

        public ChoreographerFrameCallbackC10752b(PulseImageView pulseImageView) {
            AbstractC19074t.m100208f(pulseImageView, "view");
            this.f54355p = pulseImageView;
            this.f54358s = new Interpolator() { // from class: com.zing.zalo.shortvideo.ui.widget.iv.b
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f11) {
                    float m55944b;
                    m55944b = PulseImageView.ChoreographerFrameCallbackC10752b.m55944b(f11);
                    return m55944b;
                }
            };
            this.f54359t = 50L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final float m55944b(float f11) {
            return f11;
        }

        /* renamed from: c */
        public final boolean m55945c() {
            return !this.f54356q;
        }

        /* renamed from: d */
        public final void m55946d() {
            m55947e();
            Choreographer.getInstance().postFrameCallback(this);
            this.f54356q = true;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            if (this.f54360u == 0) {
                if (this.f54355p.f54342p) {
                    this.f54357r = true;
                    this.f54358s = new DecelerateInterpolator();
                    this.f54360u = j11 / 1000000;
                } else {
                    this.f54357r = false;
                    this.f54358s = new AccelerateInterpolator();
                    this.f54360u = j11 / 1000000;
                }
            }
            long min = Math.min((j11 / 1000000) - this.f54360u, this.f54359t);
            long j12 = this.f54359t;
            if (min <= j12) {
                float interpolation = this.f54358s.getInterpolation(((float) min) / ((float) j12));
                if (this.f54357r) {
                    this.f54355p.m55935j(1.0f - (interpolation * 0.2f));
                } else {
                    this.f54355p.m55935j((interpolation * 0.2f) + 0.8f);
                }
                if (min < this.f54359t) {
                    Choreographer.getInstance().postFrameCallback(this);
                } else if (this.f54357r != this.f54355p.f54342p) {
                    m55946d();
                } else {
                    m55947e();
                }
            }
        }

        /* renamed from: e */
        public final void m55947e() {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f54356q = false;
            this.f54360u = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.PulseImageView$c */
    /* loaded from: classes5.dex */
    public static final class ChoreographerFrameCallbackC10753c implements Choreographer.FrameCallback {

        /* renamed from: p */
        private final PulseImageView f54361p;

        /* renamed from: q */
        private long f54362q;

        /* renamed from: r */
        private final long f54363r;

        /* renamed from: s */
        private final long f54364s;

        /* renamed from: t */
        private final long f54365t;

        /* renamed from: u */
        private int f54366u;

        /* renamed from: v */
        private InterfaceC18505l f54367v;

        /* renamed from: w */
        private final LinearInterpolator f54368w;

        /* renamed from: x */
        private final OvershootInterpolator f54369x;

        /* renamed from: y */
        private final Interpolator f54370y;

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.PulseImageView$c$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f54371q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m55952a(PulseImageView pulseImageView) {
                AbstractC19074t.m100208f(pulseImageView, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m55952a((PulseImageView) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.ui.widget.iv.PulseImageView$c$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f54372q = new b();

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m55953a(PulseImageView pulseImageView) {
                AbstractC19074t.m100208f(pulseImageView, "<anonymous parameter 0>");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m55953a((PulseImageView) obj);
                return C24848g0.f119245a;
            }
        }

        public ChoreographerFrameCallbackC10753c(PulseImageView pulseImageView) {
            AbstractC19074t.m100208f(pulseImageView, "view");
            this.f54361p = pulseImageView;
            this.f54363r = 200L;
            this.f54364s = 300L;
            this.f54365t = 1000L;
            this.f54367v = b.f54372q;
            this.f54368w = new LinearInterpolator();
            this.f54369x = new OvershootInterpolator();
            this.f54370y = new Interpolator() { // from class: com.zing.zalo.shortvideo.ui.widget.iv.c
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f11) {
                    float m55949b;
                    m55949b = PulseImageView.ChoreographerFrameCallbackC10753c.m55949b(f11);
                    return m55949b;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final float m55949b(float f11) {
            return 1.0f - (((float) Math.sin((2 * f11) * 3.1415927f)) * 0.1f);
        }

        /* renamed from: c */
        public final void m55950c(InterfaceC18505l interfaceC18505l, int i11) {
            AbstractC19074t.m100208f(interfaceC18505l, "update");
            m55951d();
            this.f54367v = interfaceC18505l;
            this.f54366u = i11;
            Choreographer.getInstance().postFrameCallback(this);
        }

        /* renamed from: d */
        public final void m55951d() {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f54362q = 0L;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            boolean z11;
            if (this.f54362q == 0) {
                this.f54362q = j11 / 1000000;
            }
            long j12 = (j11 / 1000000) - this.f54362q;
            long j13 = this.f54363r;
            boolean z12 = false;
            if (j12 <= j13) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                j12 -= j13;
            }
            if (z11) {
                this.f54361p.m55935j(this.f54368w.getInterpolation(1.0f - (((float) j12) / ((float) j13))));
            } else {
                long j14 = this.f54364s;
                if (j12 <= j14) {
                    z12 = true;
                }
                if (!z12) {
                    j12 -= j14;
                }
                if (z12) {
                    this.f54367v.mo205i9(this.f54361p);
                    this.f54367v = a.f54371q;
                    this.f54361p.m55935j(this.f54369x.getInterpolation(((float) j12) / ((float) this.f54364s)));
                } else {
                    int i11 = this.f54366u;
                    if (i11 < 0 || i11 > j12 / this.f54365t) {
                        this.f54361p.m55935j(this.f54370y.getInterpolation(((float) j12) / ((float) this.f54365t)));
                    } else {
                        return;
                    }
                }
            }
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54343q = true;
        this.f54344r = new ChoreographerFrameCallbackC10752b(this);
        this.f54345s = new ChoreographerFrameCallbackC10753c(this);
        this.f54346t = new ChoreographerFrameCallbackC10751a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m55934i(float f11) {
        setRotationY(180 * f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m55935j(float f11) {
        setScaleX(f11);
        setScaleY(f11);
        float f12 = 1.0f - f11;
        setTranslationX(((getPaddingLeft() - getPaddingRight()) / 2.0f) * f12);
        setTranslationY(((getPaddingTop() - getPaddingBottom()) / 2.0f) * f12);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f54343q) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f54342p = false;
                    if (this.f54344r.m55945c()) {
                        this.f54344r.m55946d();
                    }
                }
            } else {
                this.f54342p = true;
                this.f54344r.m55946d();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: k */
    public final void m55936k() {
        this.f54344r.m55947e();
        this.f54345s.m55951d();
        this.f54346t.m55942d();
        setAlpha(1.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
        setRotation(0.0f);
        setRotationX(0.0f);
        setRotationY(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    /* renamed from: l */
    public final void m55937l() {
        m55936k();
        this.f54346t.m55941c();
    }

    /* renamed from: m */
    public final void m55938m(InterfaceC18505l interfaceC18505l, int i11) {
        AbstractC19074t.m100208f(interfaceC18505l, "updateAction");
        m55936k();
        this.f54345s.m55950c(interfaceC18505l, i11);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        this.f54344r.m55947e();
        this.f54345s.m55951d();
        this.f54346t.m55942d();
        super.onDetachedFromWindow();
    }

    public final void setPulseEnable(boolean z11) {
        this.f54343q = z11;
    }
}
