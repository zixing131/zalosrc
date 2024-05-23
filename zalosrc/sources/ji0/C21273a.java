package ji0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import fn0.AbstractC19074t;
import kd0.C21693c;

/* renamed from: ji0.a */
/* loaded from: classes7.dex */
public final class C21273a extends C21693c {

    /* renamed from: W0 */
    private int f103643W0;

    /* renamed from: X0 */
    private float f103644X0;

    /* renamed from: Y0 */
    private Paint f103645Y0;

    /* renamed from: Z0 */
    private boolean f103646Z0;

    /* renamed from: a1 */
    private int f103647a1;

    /* renamed from: b1 */
    private float f103648b1;

    public C21273a(Context context) {
        super(context);
        this.f103643W0 = -1;
        this.f103645Y0 = new Paint();
        this.f103648b1 = 1.0f;
    }

    /* renamed from: B1 */
    private final float m110187B1() {
        return this.f103648b1 * m89084A();
    }

    /* renamed from: C1 */
    private final int m110188C1() {
        float m110187B1 = m110187B1();
        if (m110187B1 >= 1.0f) {
            return 255;
        }
        if (m110187B1 <= 0.0f) {
            return 0;
        }
        return (int) (m110187B1 * 255);
    }

    /* renamed from: D1 */
    public final void m110189D1(int i11) {
        this.f103643W0 = i11;
    }

    /* renamed from: E1 */
    public final void m110190E1(float f11) {
        this.f103644X0 = f11;
    }

    /* renamed from: F1 */
    public final void m110191F1(int i11) {
        this.f103647a1 = i11;
    }

    /* renamed from: G1 */
    public final void m110192G1(boolean z11) {
        this.f103646Z0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f103644X0 > 0.0f) {
            this.f103645Y0.setAntiAlias(true);
            this.f103645Y0.setStyle(Paint.Style.STROKE);
            this.f103645Y0.setColor(this.f103643W0);
            this.f103645Y0.setStrokeWidth(this.f103644X0);
            Paint paint = this.f103645Y0;
            paint.setFlags(1 | paint.getFlags());
            this.f103645Y0.setAlpha(m110188C1());
            canvas.drawCircle(m89110N() / 2.0f, m89110N() / 2.0f, (m89110N() + this.f103644X0) / 2.0f, this.f103645Y0);
        } else if (this.f103646Z0) {
            canvas.save();
            int i11 = this.f103647a1;
            canvas.translate(i11, i11);
            super.mo44775o0(canvas);
            canvas.restore();
            return;
        }
        super.mo44775o0(canvas);
    }
}
