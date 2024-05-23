package fp0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.p077ui.widget.C13704p1;
import kd0.C21693c;
import me0.AbstractC23136l9;
import s30.AbstractC26125a;

/* renamed from: fp0.a */
/* loaded from: classes7.dex */
public class C19100a extends C21693c {

    /* renamed from: W0 */
    public int f95075W0;

    /* renamed from: X0 */
    public float f95076X0;

    /* renamed from: Y0 */
    private float f95077Y0;

    /* renamed from: Z0 */
    private final Paint f95078Z0;

    /* renamed from: a1 */
    private final TextPaint f95079a1;

    /* renamed from: b1 */
    private final Paint f95080b1;

    /* renamed from: c1 */
    private String f95081c1;

    /* renamed from: d1 */
    boolean f95082d1;

    /* renamed from: e1 */
    private StaticLayout f95083e1;

    public C19100a(Context context) {
        super(context);
        this.f95076X0 = 0.0f;
        this.f95077Y0 = 1.0f;
        Paint paint = new Paint();
        this.f95078Z0 = paint;
        Paint paint2 = new Paint();
        this.f95080b1 = paint2;
        this.f95081c1 = "";
        this.f95082d1 = false;
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        C13704p1 c13704p1 = new C13704p1(1);
        this.f95079a1 = c13704p1;
        c13704p1.setAntiAlias(true);
        c13704p1.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        c13704p1.setColor(AbstractC23136l9.m118641B(context, AbstractC26125a.LG500_old));
        c13704p1.setTextSize(AbstractC23136l9.m118742r(23.0f));
        this.f95075W0 = AbstractC23136l9.m118641B(context, AbstractC16801x.white);
    }

    /* renamed from: B1 */
    private void m100326B1(String str, int i11) {
        float f11;
        float f12;
        if (!TextUtils.equals(str, this.f95081c1)) {
            this.f95081c1 = str;
            if (str.length() <= 2) {
                f11 = i11;
                f12 = 3.2f;
            } else if (this.f95081c1.length() <= 3) {
                f11 = i11;
                f12 = 3.8f;
            } else {
                f11 = i11;
                f12 = 4.2f;
            }
            this.f95079a1.setTextSize((int) (f11 / f12));
            if (TextUtils.isEmpty(this.f95081c1)) {
                this.f95083e1 = null;
            } else {
                this.f95083e1 = new StaticLayout(this.f95081c1, this.f95079a1, (int) this.f95079a1.measureText(this.f95081c1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            invalidate();
        }
    }

    /* renamed from: C1 */
    private void m100327C1(Canvas canvas) {
        if (this.f95083e1 != null) {
            canvas.save();
            canvas.translate((m89110N() - this.f95083e1.getWidth()) / 2.0f, (m89108M() - this.f95083e1.getHeight()) / 2.0f);
            this.f95083e1.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: D1 */
    private float m100328D1() {
        return this.f95077Y0 * m89084A();
    }

    /* renamed from: E1 */
    private int m100329E1() {
        float m100328D1 = m100328D1();
        if (m100328D1 >= 1.0f) {
            return 255;
        }
        if (m100328D1 <= 0.0f) {
            return 0;
        }
        return (int) (m100328D1 * 255.0f);
    }

    /* renamed from: F1 */
    public void m100330F1() {
        this.f95081c1 = "";
        this.f95082d1 = false;
        invalidate();
    }

    /* renamed from: G1 */
    public void m100331G1(float f11) {
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (this.f95077Y0 != f11) {
            this.f95077Y0 = f11;
        }
    }

    /* renamed from: H1 */
    public void m100332H1(String str, boolean z11, int i11) {
        this.f95082d1 = z11;
        m100326B1(str, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        boolean z11;
        boolean z12 = false;
        if (this.f95076X0 > 0.0f) {
            int i11 = m89106L().f84716l;
            int i12 = m89106L().f84717m;
            if (i11 == 0 && i12 == 0) {
                z11 = false;
            } else {
                canvas.save();
                canvas.translate(i11, i12);
                z11 = true;
            }
            this.f95078Z0.setStyle(Paint.Style.STROKE);
            this.f95078Z0.setColor(this.f95075W0);
            this.f95078Z0.setStrokeWidth(this.f95076X0);
            Paint paint = this.f95078Z0;
            paint.setFlags(paint.getFlags() | 1);
            this.f95078Z0.setAlpha(m100329E1());
            canvas.drawCircle((m89110N() / 2.0f) + this.f95076X0, (m89110N() / 2.0f) + this.f95076X0, (m89110N() + this.f95076X0) / 2.0f, this.f95078Z0);
            if (z11) {
                canvas.restore();
            } else {
                z12 = z11;
            }
        }
        int i13 = m89106L().f84716l + ((int) this.f95076X0);
        int i14 = m89106L().f84717m + ((int) this.f95076X0);
        if (i13 != 0 || i14 != 0) {
            canvas.save();
            canvas.translate(i13, i14);
            z12 = true;
        }
        super.mo44775o0(canvas);
        if (!TextUtils.isEmpty(this.f95081c1) && this.f95082d1) {
            this.f95080b1.setStyle(Paint.Style.STROKE);
            this.f95080b1.setColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black));
            Paint paint2 = this.f95080b1;
            paint2.setFlags(paint2.getFlags() | 1);
            this.f95080b1.setAlpha(75);
            float m89110N = m89110N() / 2.0f;
            this.f95080b1.setStrokeWidth(m89110N);
            canvas.drawCircle(m89110N, m89110N() / 2.0f, m89110N / 2.0f, this.f95080b1);
            m100327C1(canvas);
        }
        if (z12) {
            canvas.restore();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        m89097G0(m89110N() - (((int) this.f95076X0) * 2), m89108M() - (((int) this.f95076X0) * 2));
    }
}
