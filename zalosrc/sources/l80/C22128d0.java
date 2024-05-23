package l80;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.zing.zalo.AbstractC16801x;
import kd0.C21693c;
import me0.AbstractC23136l9;

/* renamed from: l80.d0 */
/* loaded from: classes6.dex */
public class C22128d0 extends C21693c {

    /* renamed from: W0 */
    public int f108917W0;

    /* renamed from: X0 */
    public float f108918X0;

    /* renamed from: Y0 */
    Paint f108919Y0;

    /* renamed from: Z0 */
    private float f108920Z0;

    public C22128d0(Context context) {
        super(context);
        this.f108918X0 = 0.0f;
        this.f108919Y0 = new Paint();
        this.f108920Z0 = 1.0f;
        this.f108917W0 = AbstractC23136l9.m118641B(context, AbstractC16801x.white);
    }

    /* renamed from: B1 */
    private float m115424B1() {
        return this.f108920Z0 * m89084A();
    }

    /* renamed from: C1 */
    private int m115425C1() {
        float m115424B1 = m115424B1();
        if (m115424B1 >= 1.0f) {
            return 255;
        }
        if (m115424B1 <= 0.0f) {
            return 0;
        }
        return (int) (m115424B1 * 255.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = false;
        if (this.f108918X0 > 0.0f) {
            int i11 = m89106L().f84716l;
            int i12 = m89106L().f84717m;
            if (i11 == 0 && i12 == 0) {
                z11 = false;
            } else {
                canvas.save();
                canvas.translate(i11, i12);
                z11 = true;
            }
            this.f108919Y0.setAntiAlias(true);
            this.f108919Y0.setStyle(Paint.Style.STROKE);
            this.f108919Y0.setColor(this.f108917W0);
            this.f108919Y0.setStrokeWidth(this.f108918X0);
            Paint paint = this.f108919Y0;
            paint.setFlags(paint.getFlags() | 1);
            this.f108919Y0.setAlpha(m115425C1());
            canvas.drawCircle((m89110N() / 2.0f) + this.f108918X0, (m89110N() / 2.0f) + this.f108918X0, (m89110N() + this.f108918X0) / 2.0f, this.f108919Y0);
            if (z11) {
                canvas.restore();
            } else {
                z13 = z11;
            }
        }
        int i13 = m89106L().f84716l + ((int) this.f108918X0);
        int i14 = m89106L().f84717m + ((int) this.f108918X0);
        if (i13 == 0 && i14 == 0) {
            z12 = z13;
        } else {
            canvas.save();
            canvas.translate(i13, i14);
        }
        super.mo44775o0(canvas);
        if (z12) {
            canvas.restore();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        m89097G0(m89110N() - (((int) this.f108918X0) * 2), m89108M() - (((int) this.f108918X0) * 2));
    }
}
