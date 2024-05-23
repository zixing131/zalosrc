package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;

/* loaded from: classes6.dex */
public class CircleCountDownView extends ModulesView {

    /* renamed from: K */
    private long f69050K;

    /* renamed from: L */
    private long f69051L;

    /* renamed from: M */
    float f69052M;

    /* renamed from: N */
    float f69053N;

    /* renamed from: O */
    RectF f69054O;

    /* renamed from: P */
    float f69055P;

    /* renamed from: Q */
    Paint f69056Q;

    /* renamed from: R */
    Paint f69057R;

    /* renamed from: S */
    float f69058S;

    /* renamed from: T */
    float f69059T;

    /* renamed from: U */
    float f69060U;

    /* renamed from: V */
    int f69061V;

    /* renamed from: W */
    int f69062W;

    /* renamed from: a0 */
    float f69063a0;

    /* renamed from: b0 */
    float f69064b0;

    /* renamed from: c0 */
    float f69065c0;

    /* renamed from: d0 */
    float f69066d0;

    /* renamed from: e0 */
    C22126c0 f69067e0;

    /* renamed from: f0 */
    C22126c0 f69068f0;

    /* renamed from: g0 */
    private CountDownTimer f69069g0;

    /* renamed from: h0 */
    private boolean f69070h0;

    /* renamed from: i0 */
    private boolean f69071i0;

    /* renamed from: j0 */
    private InterfaceC13483b f69072j0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.CircleCountDownView$a */
    /* loaded from: classes6.dex */
    public class CountDownTimerC13482a extends CountDownTimer {
        CountDownTimerC13482a(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CircleCountDownView.this.m75631g0(0L);
            CircleCountDownView.this.f69070h0 = false;
            if (CircleCountDownView.this.f69072j0 != null) {
                CircleCountDownView.this.f69072j0.mo75637Ml();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            CircleCountDownView.this.m75631g0(j11);
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.CircleCountDownView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13483b {
        /* renamed from: Ml */
        void mo75637Ml();
    }

    public CircleCountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: Y */
    private void m75628Y() {
        try {
            double d11 = this.f69053N + 90.0f;
            this.f69065c0 = (float) (this.f69055P * Math.cos(Math.toRadians(d11)));
            this.f69066d0 = (float) (this.f69055P * Math.sin(Math.toRadians(d11)));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b0 */
    private void m75629b0() {
        m75636f0();
        m75635d0();
    }

    /* renamed from: e0 */
    private void m75630e0() {
        if (this.f69070h0) {
            return;
        }
        CountDownTimer countDownTimer = this.f69069g0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f69069g0 = new CountDownTimerC13482a(this.f69051L, 1000L).start();
        this.f69070h0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m75631g0(long j11) {
        float f11 = (float) j11;
        try {
            setContentBody(AbstractC23160o0.m119258i0(Math.floor(f11 / 1000.0f)));
            this.f69053N = Math.min(Math.max(f11 / ((float) this.f69050K), 0.0f), 1.0f) * 360.0f;
            m75628Y();
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h0 */
    private boolean m75632h0() {
        long j11 = this.f69050K;
        if (j11 > 0) {
            long j12 = this.f69051L;
            if (j12 >= 0 && j12 <= j11) {
                return true;
            }
        }
        return false;
    }

    private void setContentBody(String str) {
        this.f69068f0.m111959G1(str);
    }

    /* renamed from: a0 */
    public boolean m75633a0() {
        return this.f69070h0;
    }

    /* renamed from: c0 */
    public void m75634c0(long j11, long j12) {
        this.f69050K = j11;
        this.f69051L = j12;
        if (this.f69070h0) {
            m75629b0();
        }
    }

    /* renamed from: d0 */
    public void m75635d0() {
        if (!m75632h0()) {
            AbstractC23136l9.m118744r1(this, 8);
            return;
        }
        AbstractC23136l9.m118744r1(this, 0);
        m75631g0(this.f69051L);
        m75630e0();
    }

    /* renamed from: f0 */
    public void m75636f0() {
        if (this.f69069g0 != null) {
            this.f69069g0.cancel();
            this.f69069g0 = null;
            this.f69070h0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f69056Q.setStrokeWidth(this.f69058S);
        this.f69056Q.setColor(this.f69061V);
        canvas.drawArc(this.f69054O, this.f69052M, this.f69053N, false, this.f69056Q);
        this.f69056Q.setStrokeWidth(this.f69059T);
        this.f69056Q.setColor(this.f69062W);
        float f11 = this.f69052M;
        float f12 = this.f69053N;
        canvas.drawArc(this.f69054O, f11 + f12, 360.0f - f12, false, this.f69056Q);
        float width = this.f69054O.width() / 2.0f;
        RectF rectF = this.f69054O;
        canvas.drawCircle(width + rectF.left, rectF.top, this.f69059T / 2.0f, this.f69057R);
        float f13 = this.f69065c0;
        if (f13 != 0.0f || this.f69066d0 != 0.0f) {
            canvas.drawCircle(this.f69063a0 - f13, this.f69064b0 - this.f69066d0, this.f69060U, this.f69057R);
        }
        if (!this.f69071i0) {
            this.f69071i0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = this.f69054O;
        float f11 = this.f69060U;
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        rectF.set(f11, f11, f12 - f11, f13 - f11);
        this.f69055P = this.f69054O.width() / 2.0f;
        this.f69063a0 = f12 / 2.0f;
        this.f69064b0 = f13 / 2.0f;
        if (!this.f69071i0) {
            m75628Y();
        }
    }

    public void setCircleCountDownListener(InterfaceC13483b interfaceC13483b) {
        this.f69072j0 = interfaceC13483b;
    }

    public void setContentTitle(String str) {
        this.f69067e0.m111959G1(str);
    }

    public CircleCountDownView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69050K = 0L;
        this.f69051L = 0L;
        this.f69052M = -90.0f;
        this.f69053N = 0.0f;
        this.f69054O = new RectF();
        this.f69056Q = new Paint(1);
        this.f69057R = new Paint(1);
        this.f69070h0 = false;
        this.f69071i0 = false;
        this.f69059T = AbstractC23136l9.m118742r(6.0f);
        this.f69062W = getResources().getColor(AbstractC16801x.co_progress_countdown);
        this.f69058S = AbstractC23136l9.m118742r(2.0f);
        this.f69061V = getResources().getColor(AbstractC16801x.mat_button_stroke_style_2_disable);
        this.f69060U = AbstractC23136l9.m118742r(8.0f);
        float m118742r = AbstractC23136l9.m118742r(14.0f);
        int color = getResources().getColor(AbstractC16801x.co_mtxt6);
        float m118742r2 = AbstractC23136l9.m118742r(28.0f);
        int color2 = getResources().getColor(AbstractC16801x.co_mtxt4);
        String str = "";
        if (attributeSet != null) {
            try {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.CircleCountDownView);
                this.f69059T = obtainStyledAttributes.getDimension(AbstractC8923h0.CircleCountDownView_progressWidth, this.f69059T);
                this.f69062W = obtainStyledAttributes.getColor(AbstractC8923h0.CircleCountDownView_progressColor, this.f69062W);
                this.f69058S = obtainStyledAttributes.getDimension(AbstractC8923h0.CircleCountDownView_arcWidth, this.f69058S);
                this.f69061V = obtainStyledAttributes.getColor(AbstractC8923h0.CircleCountDownView_arcColor, this.f69061V);
                this.f69060U = obtainStyledAttributes.getDimension(AbstractC8923h0.CircleCountDownView_iconCircleRadius, this.f69060U);
                m118742r = obtainStyledAttributes.getDimension(AbstractC8923h0.CircleCountDownView_textSizeTitle, m118742r);
                color = obtainStyledAttributes.getColor(AbstractC8923h0.CircleCountDownView_textColorTitle, color);
                m118742r2 = obtainStyledAttributes.getDimension(AbstractC8923h0.CircleCountDownView_textSizeBody, m118742r2);
                color2 = obtainStyledAttributes.getColor(AbstractC8923h0.CircleCountDownView_textColorBody, color2);
                str = obtainStyledAttributes.getString(AbstractC8923h0.CircleCountDownView_textTitle);
                obtainStyledAttributes.recycle();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.f69056Q.setStyle(Paint.Style.STROKE);
        this.f69056Q.setColor(this.f69062W);
        this.f69056Q.setStrokeWidth(this.f69059T);
        this.f69057R.setStyle(Paint.Style.FILL);
        this.f69057R.setColor(this.f69062W);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f69068f0 = c22126c0;
        c22126c0.mo111964L1(m118742r2);
        this.f69068f0.m111962J1(color2);
        this.f69068f0.m89106L().m89028L(-2, -2).m89025I(true);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f69067e0 = c22126c02;
        c22126c02.m111962J1(color);
        this.f69067e0.mo111964L1(m118742r);
        this.f69067e0.m111959G1(str);
        this.f69067e0.m89106L().m89028L(-2, -2).m89066s(this.f69068f0).m89026J(true).m89033Q(AbstractC23136l9.m118742r(3.0f));
        mo69681L(this.f69068f0);
        mo69681L(this.f69067e0);
    }
}
