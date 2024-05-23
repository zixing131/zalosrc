package q80;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import bi0.AbstractC2807a;
import fn0.AbstractC19074t;
import kd0.C21693c;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: q80.m */
/* loaded from: classes6.dex */
public final class C25174m extends C21693c {

    /* renamed from: W0 */
    private final int f120757W0;

    /* renamed from: X0 */
    private int f120758X0;

    /* renamed from: Y0 */
    private float f120759Y0;

    /* renamed from: Z0 */
    private float f120760Z0;

    /* renamed from: a1 */
    private final Paint f120761a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25174m(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f120757W0 = C23212s8.m119607o(context, AbstractC2807a.divider_02);
        this.f120760Z0 = 1.0f;
        this.f120761a1 = new Paint(1);
    }

    /* renamed from: B1 */
    private final float m130307B1(Context context, int i11) {
        float f11 = context.getResources().getDisplayMetrics().density;
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        return i11 / f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f120760Z0 != 1.0f) {
            canvas.save();
            float f11 = this.f120760Z0;
            canvas.scale(f11, f11, m89110N() / 2.0f, m89108M() / 2.0f);
        }
        Paint paint = this.f120761a1;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        paint.setStrokeWidth(0.0f);
        float m89110N = m89110N();
        float m89108M = m89108M();
        float f12 = this.f120759Y0;
        canvas.drawRoundRect(0.0f, 0.0f, m89110N, m89108M, f12, f12, paint);
        super.mo44775o0(canvas);
        if (this.f120760Z0 != 1.0f) {
            canvas.restore();
        }
        if (this.f120758X0 > 0) {
            Paint paint2 = this.f120761a1;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(this.f120757W0);
            paint2.setStrokeWidth(this.f120758X0);
            int i11 = this.f120758X0;
            float f13 = this.f120759Y0;
            canvas.drawRoundRect(i11 / 2.0f, i11 / 2.0f, m89110N() - (this.f120758X0 / 2.0f), m89108M() - (this.f120758X0 / 2.0f), f13, f13, paint2);
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        float f11;
        super.mo44180q0(i11, i12, i13, i14);
        int min = Math.min(m89110N(), m89108M());
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        float m130307B1 = m130307B1(context, min);
        float f12 = 1.0f;
        if (m130307B1 < 40.0f) {
            f11 = 0.6f;
        } else if (m130307B1 < 64.0f) {
            f11 = 0.8f;
        } else if (m130307B1 < 96.0f) {
            f11 = 1.0f;
        } else {
            f11 = 1.2f;
        }
        int max = Math.max(1, AbstractC23136l9.m118742r(f11));
        this.f120758X0 = max;
        if (max > 0 && m130307B1 > 0.0f) {
            f12 = Math.max(0.0f, (m130307B1 - (max / 4.0f)) / m130307B1);
        }
        this.f120760Z0 = f12;
        float m118742r = AbstractC23136l9.m118742r(m130307B1) * 0.2f;
        this.f120759Y0 = m118742r;
        mo111927x1(m118742r);
    }
}
