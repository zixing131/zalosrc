package tj0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.zing.zalo.zinstant.zom.properties.ZOMLinearLoading;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import nk0.AbstractC23825g0;

/* renamed from: tj0.c */
/* loaded from: classes7.dex */
public final class C26718c extends AbstractC26719d {
    public static final a Companion = new a(null);

    /* renamed from: d0 */
    private int f126709d0;

    /* renamed from: e0 */
    private float f126710e0;

    /* renamed from: f0 */
    private int f126711f0;

    /* renamed from: g0 */
    private final RectF f126712g0 = new RectF();

    /* renamed from: h0 */
    private final Paint f126713h0;

    /* renamed from: tj0.c$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26718c() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.f126713h0 = paint;
        m137423T(0);
    }

    /* renamed from: X */
    private final RectF m137401X(float f11, float f12, Rect rect) {
        float f13 = (rect.left + rect.right) / 2.0f;
        float f14 = (rect.top + rect.bottom) / 2.0f;
        float f15 = 2;
        float f16 = f11 / f15;
        float f17 = f12 / f15;
        return new RectF(f13 - f16, f14 - f17, f13 + f16, f14 + f17);
    }

    /* renamed from: Y */
    private final void m137402Y(float f11) {
        if (this.f126710e0 == f11) {
            return;
        }
        this.f126710e0 = f11;
        m137422S(m137426w() | ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
    }

    /* renamed from: Z */
    private final void m137403Z(int i11) {
        if (this.f126709d0 == i11) {
            return;
        }
        this.f126709d0 = i11;
        m137422S(m137426w() | 512);
    }

    /* renamed from: a0 */
    private final void m137404a0(int i11) {
        if (this.f126711f0 == i11) {
            return;
        }
        this.f126711f0 = i11;
        this.f126713h0.setColor(i11);
        m137422S(m137426w() | 4096);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: H */
    protected void mo137386H() {
        int alpha;
        if (m137418F(1) || m137418F(4) || m137418F(8)) {
            RectF rectF = this.f126712g0;
            float m137417E = m137417E();
            float m137413A = m137413A();
            Rect bounds = getBounds();
            AbstractC19074t.m100207e(bounds, "bounds");
            rectF.set(m137401X(m137417E, m137413A, bounds));
        }
        if (m137418F(4) || m137418F(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) || m137418F(512)) {
            int i11 = this.f126709d0;
            if (i11 != 0) {
                if (i11 == 1) {
                    m137425v().setFloatValues(0.0f, m137417E());
                }
            } else {
                m137425v().setFloatValues(0.0f, this.f126710e0 + m137417E());
            }
        }
        if (m137418F(2) && (alpha = (int) ((Color.alpha(this.f126711f0) * getAlpha()) / 255.0f)) != this.f126713h0.getAlpha()) {
            this.f126713h0.setAlpha(alpha);
        }
        m137422S(0);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: I */
    public void mo137387I(Canvas canvas) {
        float m116579b;
        float m116583f;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (AbstractC23825g0.f115102E) {
            canvas.drawRect(this.f126712g0, m137428y());
        }
        Object animatedValue = m137425v().getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        canvas.drawRect(this.f126712g0, m137415C());
        int i11 = this.f126709d0;
        if (i11 != 0) {
            if (i11 == 1) {
                RectF rectF = this.f126712g0;
                float f11 = rectF.left;
                float f12 = rectF.top;
                Object animatedValue2 = m137425v().getAnimatedValue();
                AbstractC19074t.m100206d(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                canvas.drawRect(f11, f12, f11 + ((Float) animatedValue2).floatValue(), this.f126712g0.bottom, this.f126713h0);
                return;
            }
            return;
        }
        float f13 = this.f126712g0.left;
        m116579b = AbstractC22543l.m116579b(f13, (f13 + floatValue) - this.f126710e0);
        RectF rectF2 = this.f126712g0;
        float f14 = rectF2.top;
        m116583f = AbstractC22543l.m116583f(rectF2.left + floatValue, rectF2.right);
        canvas.drawRect(m116579b, f14, m116583f, this.f126712g0.bottom, this.f126713h0);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: L */
    protected void mo137388L(ZOMLoading zOMLoading) {
        AbstractC19074t.m100208f(zOMLoading, "loading");
        ZOMLinearLoading zOMLinearLoading = zOMLoading.mLinearLoading;
        if (zOMLinearLoading != null) {
            m137403Z(zOMLinearLoading.mAnimType);
            m137404a0(zOMLinearLoading.mHighlightColor);
            m137402Y(zOMLinearLoading.mAnimBarWidth);
        }
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public int getOpacity() {
        return m137415C().getAlpha();
    }

    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj0.AbstractC26719d
    /* renamed from: u */
    public boolean mo137389u() {
        if (super.mo137389u() && this.f126710e0 > 0.0f && m137427x() != 0 && this.f126711f0 != 0) {
            return true;
        }
        return false;
    }
}
