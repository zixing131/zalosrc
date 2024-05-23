package com.zing.zalo.p077ui.zviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21692b;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes6.dex */
public class PieChartView extends ModulesView {

    /* renamed from: K */
    private final Paint f75947K;

    /* renamed from: L */
    private final int[] f75948L;

    /* renamed from: M */
    private final int f75949M;

    /* renamed from: N */
    private final int f75950N;

    /* renamed from: O */
    private final int f75951O;

    /* renamed from: P */
    private RectF f75952P;

    /* renamed from: Q */
    private C16716d f75953Q;

    /* renamed from: R */
    private C21697g f75954R;

    /* renamed from: S */
    private C21692b f75955S;

    /* renamed from: T */
    private StaticLayout f75956T;

    /* renamed from: U */
    private DynamicLayout f75957U;

    /* renamed from: V */
    private DynamicLayout f75958V;

    /* renamed from: W */
    private SpannableStringBuilder f75959W;

    /* renamed from: a0 */
    private SpannableStringBuilder f75960a0;

    /* renamed from: b0 */
    private Paint f75961b0;

    /* renamed from: c0 */
    private boolean f75962c0;

    /* renamed from: d0 */
    private float[] f75963d0;

    /* renamed from: e0 */
    private float f75964e0;

    /* renamed from: f0 */
    private ValueAnimator f75965f0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PieChartView$a */
    /* loaded from: classes6.dex */
    public class C14737a extends AnimatorListenerAdapter {
        C14737a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            PieChartView.this.f75964e0 = 1.0f;
        }
    }

    public PieChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75947K = new Paint(1);
        this.f75950N = AbstractC23222t7.f112562h;
        this.f75962c0 = true;
        this.f75964e0 = 1.0f;
        this.f75948L = new int[]{C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor), C23212s8.m119607o(context, AbstractC16781w.ItemBackgroundSelectedColor4)};
        this.f75949M = AbstractC23136l9.m118641B(context, AbstractC16801x.storage_piechart_free);
        this.f75951O = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        m82657a0();
    }

    /* renamed from: X */
    private float[] m82655X(long[] jArr) {
        float f11;
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        float[] fArr = new float[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            if (j11 != 0) {
                f11 = (((float) jArr[i11]) / ((float) j11)) * 360.0f;
            } else {
                f11 = 0.0f;
            }
            if (f11 > 0.0f && f11 < 1.8f) {
                fArr[i11] = 1.8f;
            } else {
                fArr[i11] = f11;
            }
        }
        return fArr;
    }

    /* renamed from: Y */
    private void m82656Y() {
        ValueAnimator valueAnimator = this.f75965f0;
        if (valueAnimator == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f75965f0.cancel();
        }
        this.f75965f0.start();
    }

    /* renamed from: a0 */
    private void m82657a0() {
        Paint paint = new Paint(1);
        this.f75961b0 = paint;
        paint.setColor(getResources().getColor(AbstractC16801x.storage_piechart_grey_btn));
        this.f75961b0.setStyle(Paint.Style.FILL);
        this.f75947K.setStyle(Paint.Style.STROKE);
        this.f75947K.setStrokeCap(Paint.Cap.ROUND);
        C13704p1 c13704p1 = new C13704p1(1);
        Typeface typeface = Typeface.DEFAULT;
        c13704p1.setTypeface(typeface);
        c13704p1.setTextSize(AbstractC23222t7.f112580q);
        c13704p1.setColor(this.f75951O);
        int measureText = (int) c13704p1.measureText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_zalo_usage_piechart));
        this.f75959W = new SpannableStringBuilder(" 100,0 GB ");
        this.f75960a0 = new SpannableStringBuilder(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_zalo_percentage_piechart));
        C13704p1 c13704p12 = new C13704p1(1);
        c13704p12.setTypeface(typeface);
        c13704p12.setTextSize(AbstractC23222t7.f112594x);
        c13704p12.setColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        int measureText2 = (int) c13704p12.measureText(this.f75959W.toString());
        SpannableStringBuilder spannableStringBuilder = this.f75959W;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.f75957U = new DynamicLayout(spannableStringBuilder, spannableStringBuilder, c13704p12, measureText2, alignment, 1.0f, 0.0f, true);
        this.f75956T = new StaticLayout(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_usage_zalo_usage_piechart), c13704p1, measureText, alignment, 1.0f, 0.0f, true);
        this.f75952P = new RectF();
        Context context = getContext();
        C16716d c16716d = new C16716d(context);
        this.f75953Q = c16716d;
        c16716d.m89106L().m89028L(-1, -2).m89046b0(AbstractC23222t7.f112572m).m89047c0(AbstractC23222t7.f112572m).m89029M(3).m89025I(true);
        C21692b c21692b = new C21692b(context);
        this.f75955S = c21692b;
        C16718f m89106L = c21692b.m89106L();
        int i11 = AbstractC23222t7.f112582r;
        m89106L.m89028L(i11, i11).m89027K(true);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f75954R = c22126c0;
        c22126c0.m89106L().m89028L(-2, -2).m89054h0(this.f75955S).m89027K(true).m89034R(AbstractC23222t7.f112566j);
        this.f75954R.mo111964L1(AbstractC23222t7.f112582r);
        this.f75954R.m111962J1(this.f75951O);
        this.f75954R.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_storage_calculating_usage));
        this.f75953Q.m89001g1(this.f75955S);
        this.f75953Q.m89001g1(this.f75954R);
        mo69681L(this.f75953Q);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f75965f0 = ofFloat;
        ofFloat.setDuration(800L);
        this.f75965f0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.zviews.c50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PieChartView.this.m82658b0(valueAnimator);
            }
        });
        this.f75965f0.addListener(new C14737a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m82658b0(ValueAnimator valueAnimator) {
        try {
            this.f75964e0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d0 */
    private void m82659d0() {
        if (this.f75963d0 != null) {
            this.f75962c0 = false;
            this.f75953Q.mo44614b1(8);
            m82656Y();
        } else {
            this.f75962c0 = true;
            this.f75953Q.mo44614b1(0);
        }
    }

    /* renamed from: c0 */
    public void m82660c0() {
        this.f75963d0 = null;
        m82659d0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f75947K.setStrokeWidth(AbstractC23222t7.f112550b);
        this.f75947K.setColor(this.f75949M);
        canvas.drawOval(this.f75952P, this.f75947K);
        if (!this.f75962c0) {
            this.f75947K.setStrokeWidth(this.f75950N);
            float f11 = -90.0f;
            for (int length = this.f75963d0.length - 1; length >= 0; length--) {
                if (length == 0) {
                    this.f75947K.setColor(this.f75948L[length]);
                    canvas.drawArc(this.f75952P, -90.0f, this.f75963d0[length] * this.f75964e0, false, this.f75947K);
                } else {
                    float[] fArr = this.f75963d0;
                    if (length != fArr.length - 1) {
                        f11 += (int) fArr[length - 1];
                        this.f75947K.setColor(this.f75948L[length]);
                        canvas.drawArc(this.f75952P, f11, this.f75963d0[length] * this.f75964e0, false, this.f75947K);
                    }
                }
            }
            canvas.save();
            float f12 = AbstractC23222t7.f112556e;
            RectF rectF = this.f75952P;
            float width = rectF.left + ((rectF.right - this.f75956T.getWidth()) / 2.0f);
            RectF rectF2 = this.f75952P;
            canvas.translate(width, ((((rectF2.bottom - rectF2.top) / 2.0f) - (this.f75956T.getHeight() / 2.0f)) - this.f75957U.getHeight()) - f12);
            this.f75956T.draw(canvas);
            canvas.restore();
            canvas.save();
            float f13 = AbstractC23222t7.f112556e;
            RectF rectF3 = this.f75952P;
            float width2 = rectF3.left + ((rectF3.width() - this.f75957U.getWidth()) / 2.0f);
            RectF rectF4 = this.f75952P;
            canvas.translate(width2, (((rectF4.bottom - rectF4.top) / 2.0f) - this.f75957U.getHeight()) + f13);
            this.f75957U.draw(canvas);
            canvas.restore();
            canvas.save();
            float f14 = AbstractC23222t7.f112582r;
            RectF rectF5 = this.f75952P;
            float width3 = rectF5.left + ((rectF5.width() - this.f75958V.getWidth()) / 2.0f);
            RectF rectF6 = this.f75952P;
            canvas.translate(width3, ((((rectF6.bottom - rectF6.top) / 2.0f) + (this.f75957U.getHeight() / 2.0f)) - (this.f75957U.getHeight() / 2.0f)) + f14);
            float f15 = AbstractC23222t7.f112554d;
            float f16 = 0.0f - f15;
            canvas.drawRoundRect(f16, f16, this.f75958V.getWidth() + f15, (this.f75958V.getHeight() + f15) - 1.0f, 10.0f, 10.0f, this.f75961b0);
            this.f75958V.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = this.f75950N / 2.0f;
        RectF rectF = this.f75952P;
        rectF.left = f11;
        rectF.top = f11;
        rectF.right = measuredWidth - f11;
        rectF.bottom = measuredHeight - f11;
        if (this.f75958V == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            c13704p1.m76613c();
            c13704p1.setTextSize(AbstractC23222t7.f112576o);
            c13704p1.setColor(this.f75951O);
            int width = (int) (this.f75952P.width() - AbstractC23222t7.f112543V);
            SpannableStringBuilder spannableStringBuilder = this.f75960a0;
            this.f75958V = new DynamicLayout(spannableStringBuilder, spannableStringBuilder, c13704p1, width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, true);
        }
    }

    public void setPercent(String str) {
        this.f75960a0.clear();
        this.f75960a0.append((CharSequence) str);
    }

    public void setUsage(String str) {
        this.f75959W.clear();
        this.f75959W.append((CharSequence) str);
    }

    public void setValues(long[] jArr) {
        this.f75963d0 = m82655X(jArr);
        m82659d0();
    }
}
