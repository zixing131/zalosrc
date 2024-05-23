package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import pm0.C24848g0;
import s20.AbstractC26104f;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class SwitchView extends View {

    /* renamed from: A */
    private boolean f54187A;

    /* renamed from: B */
    private boolean f54188B;

    /* renamed from: C */
    private int f54189C;

    /* renamed from: D */
    private MotionEvent f54190D;

    /* renamed from: p */
    private final int f54191p;

    /* renamed from: q */
    private final int f54192q;

    /* renamed from: r */
    private final int f54193r;

    /* renamed from: s */
    private final int f54194s;

    /* renamed from: t */
    private final int f54195t;

    /* renamed from: u */
    private final float f54196u;

    /* renamed from: v */
    private final float f54197v;

    /* renamed from: w */
    private final Paint f54198w;

    /* renamed from: x */
    private final ChoreographerFrameCallbackC10713a f54199x;

    /* renamed from: y */
    private float f54200y;

    /* renamed from: z */
    private float f54201z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SwitchView$a */
    /* loaded from: classes5.dex */
    public static final class ChoreographerFrameCallbackC10713a implements Choreographer.FrameCallback {

        /* renamed from: p */
        private final SwitchView f54202p;

        /* renamed from: q */
        private final LinearInterpolator f54203q;

        /* renamed from: r */
        private int f54204r;

        /* renamed from: s */
        private int f54205s;

        public ChoreographerFrameCallbackC10713a(SwitchView switchView) {
            AbstractC19074t.m100208f(switchView, "view");
            this.f54202p = switchView;
            this.f54203q = new LinearInterpolator();
            this.f54204r = 10;
            this.f54205s = -1;
        }

        /* renamed from: a */
        public final void m55815a() {
            m55816b();
            Choreographer.getInstance().postFrameCallback(this);
        }

        /* renamed from: b */
        public final void m55816b() {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f54205s = -1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            double ceil;
            if (this.f54205s == -1) {
                if (this.f54202p.f54187A) {
                    ceil = Math.ceil(this.f54204r * this.f54202p.m55811e());
                } else {
                    ceil = Math.ceil(this.f54204r * (1.0f - this.f54202p.m55811e()));
                }
                this.f54205s = (int) ceil;
            }
            int i11 = this.f54205s;
            int i12 = this.f54204r;
            if (i11 <= i12) {
                float interpolation = this.f54203q.getInterpolation(i11 / i12);
                SwitchView switchView = this.f54202p;
                if (!switchView.f54187A) {
                    interpolation = 1.0f - interpolation;
                }
                switchView.m55813h(interpolation);
                this.f54202p.invalidate();
                int i13 = this.f54205s;
                if (i13 < this.f54204r) {
                    this.f54205s = i13 + 1;
                    Choreographer.getInstance().postFrameCallback(this);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.SwitchView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10714b {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final float m55811e() {
        return (this.f54200y - this.f54196u) / (getWidth() - (2 * this.f54196u));
    }

    /* renamed from: g */
    public static /* synthetic */ void m55812g(SwitchView switchView, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        switchView.m55814f(z11, z12, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m55813h(float f11) {
        this.f54200y = this.f54196u + ((getWidth() - (2 * this.f54196u)) * f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setChecked$lambda$1(SwitchView switchView) {
        float f11;
        AbstractC19074t.m100208f(switchView, "this$0");
        if (switchView.f54187A) {
            f11 = switchView.getWidth() - switchView.f54196u;
        } else {
            f11 = switchView.f54196u;
        }
        switchView.f54200y = f11;
        switchView.invalidate();
    }

    /* renamed from: f */
    public final void m55814f(boolean z11, boolean z12, boolean z13) {
        if (this.f54187A != z11) {
            this.f54187A = z11;
            if (z12) {
                this.f54199x.m55815a();
            } else {
                post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        SwitchView.setChecked$lambda$1(SwitchView.this);
                    }
                });
            }
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f54199x.m55816b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        AbstractC19074t.m100208f(canvas, "canvas");
        float f11 = this.f54196u;
        float f12 = this.f54201z;
        float width = getWidth() - this.f54196u;
        float f13 = this.f54201z;
        Paint paint = this.f54198w;
        if (this.f54187A) {
            i11 = this.f54192q;
        } else {
            i11 = this.f54193r;
        }
        paint.setColor(i11);
        float f14 = 2;
        paint.setStrokeWidth(this.f54196u * f14);
        C24848g0 c24848g0 = C24848g0.f119245a;
        canvas.drawLine(f11, f12, width, f13, paint);
        float f15 = this.f54200y;
        float f16 = this.f54201z;
        Paint paint2 = this.f54198w;
        paint2.setColor(this.f54191p);
        paint2.setStrokeWidth(f14 * this.f54197v);
        canvas.drawLine(f15, f16, f15, f16 + 0.1f, paint2);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if ((i12 & 1073741824) == 0) {
            super.onMeasure(this.f54194s | 1073741824, 1073741824 | this.f54195t);
        } else {
            super.onMeasure(1073741824 | this.f54194s, i12);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        this.f54201z = i12 / 2.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:            if (r7 != r1) goto L15;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        boolean z11 = false;
        if (!this.f54188B) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (this.f54190D == null) {
                    boolean z12 = this.f54187A;
                    if (this.f54200y >= getWidth() / 2.0f) {
                        z11 = true;
                    }
                }
                this.f54190D = null;
                this.f54187A = !this.f54187A;
                this.f54199x.m55815a();
            } else {
                MotionEvent motionEvent2 = this.f54190D;
                if (motionEvent2 != null && AbstractC26104f.m134332c(motionEvent2, motionEvent, this.f54189C / 2)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f54190D = null;
                }
                if (this.f54190D == null) {
                    this.f54200y = Math.min(Math.max(this.f54196u, motionEvent.getX()), getWidth() - this.f54196u);
                    invalidate();
                }
            }
        } else {
            this.f54190D = AbstractC26104f.m134330a(motionEvent);
        }
        return true;
    }

    public final void setOnSwitchedListener(InterfaceC10714b interfaceC10714b) {
    }

    public final void setSwitchable(boolean z11) {
        this.f54188B = z11;
    }

    public /* synthetic */ SwitchView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f54191p = AbstractC26112n.m134426u(this, AbstractC27406a.zch_switch_thumb);
        this.f54192q = AbstractC26112n.m134426u(this, AbstractC27406a.zch_switch_active);
        this.f54193r = AbstractC26112n.m134426u(this, AbstractC27406a.zch_switch_inactive);
        this.f54194s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_switch_width);
        this.f54195t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_switch_height);
        float m134433y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_switch_height) / 2.0f;
        this.f54196u = m134433y;
        this.f54197v = AbstractC26112n.m134433y(this, AbstractC27407b.zch_switch_thumb_radius);
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f54198w = paint;
        this.f54199x = new ChoreographerFrameCallbackC10713a(this);
        this.f54200y = m134433y;
        this.f54188B = true;
        this.f54189C = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
