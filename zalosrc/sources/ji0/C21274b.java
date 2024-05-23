package ji0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import fn0.AbstractC19074t;
import ki0.C21740h;

/* renamed from: ji0.b */
/* loaded from: classes7.dex */
public final class C21274b extends C21740h {

    /* renamed from: q1 */
    private int f103649q1;

    /* renamed from: r1 */
    private float f103650r1;

    /* renamed from: s1 */
    private Paint f103651s1;

    /* renamed from: t1 */
    private float f103652t1;

    public C21274b(Context context) {
        super(context);
        this.f103649q1 = -1;
        this.f103651s1 = new Paint();
        this.f103652t1 = 1.0f;
    }

    /* renamed from: R1 */
    public final void m110193R1(int i11) {
        this.f103649q1 = i11;
    }

    /* renamed from: S1 */
    public final void m110194S1(float f11) {
        this.f103650r1 = f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f103650r1 > 0.0f) {
            this.f103651s1.setAntiAlias(true);
            this.f103651s1.setStyle(Paint.Style.STROKE);
            this.f103651s1.setColor(this.f103649q1);
            this.f103651s1.setStrokeWidth(this.f103650r1);
            Paint paint = this.f103651s1;
            paint.setFlags(1 | paint.getFlags());
            canvas.drawCircle(m89110N() / 2.0f, m89108M() / 2.0f, (m89114P() + this.f103650r1) / 2.0f, this.f103651s1);
        }
        super.mo44775o0(canvas);
    }
}
