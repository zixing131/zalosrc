package kd0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zing.zalo.uidrawing.C16719g;
import hd0.AbstractC20006d;

/* renamed from: kd0.b */
/* loaded from: classes4.dex */
public class C21692b extends C16719g {

    /* renamed from: J0 */
    private static final int f105290J0 = ((int) Resources.getSystem().getDisplayMetrics().density) * 24;

    /* renamed from: D0 */
    private Drawable f105291D0;

    /* renamed from: E0 */
    private RectF f105292E0;

    /* renamed from: F0 */
    private int f105293F0;

    /* renamed from: G0 */
    private int f105294G0;

    /* renamed from: H0 */
    private int f105295H0;

    /* renamed from: I0 */
    private long f105296I0;

    public C21692b(Context context) {
        super(context);
        this.f105295H0 = 1000;
        m111907g1();
    }

    /* renamed from: g1 */
    private void m111907g1() {
        this.f105294G0 = 0;
    }

    /* renamed from: h1 */
    public void m111908h1(Drawable drawable) {
        this.f105291D0 = drawable;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
        if (this.f105291D0 == null) {
            return;
        }
        canvas.save();
        canvas.translate(m89106L().f84716l, m89106L().f84717m);
        float f11 = this.f105294G0;
        int i11 = this.f105293F0;
        canvas.rotate(f11, i11 / 2, i11 / 2);
        Drawable drawable = this.f105291D0;
        RectF rectF = this.f105292E0;
        drawable.setBounds(0, 0, (int) rectF.right, (int) rectF.bottom);
        this.f105291D0.draw(canvas);
        long currentTimeMillis = System.currentTimeMillis();
        this.f105294G0 = (this.f105294G0 + ((int) (((currentTimeMillis - this.f105296I0) * 360) / this.f105295H0))) % 360;
        this.f105296I0 = currentTimeMillis;
        invalidate();
        canvas.restore();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        if (i12 != 1073741824) {
            int i15 = f105290J0;
            if (i12 == Integer.MIN_VALUE) {
                i11 = Math.min(i15, i11);
            } else {
                i11 = i15;
            }
        }
        if (i14 != 1073741824) {
            int i16 = f105290J0;
            if (i14 == Integer.MIN_VALUE) {
                i13 = Math.min(i16, i13);
            } else {
                i13 = i16;
            }
        }
        this.f105293F0 = Math.min(i11, i13);
        int i17 = this.f105293F0;
        this.f105292E0 = new RectF(0.0f, 0.0f, i17, i17);
        int i18 = this.f105293F0;
        m89097G0(i18, i18);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f105291D0 == null) {
            this.f105291D0 = getContext().getResources().getDrawable(AbstractC20006d.module_circle_progressbar);
        }
    }
}
