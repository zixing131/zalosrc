package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uidrawing.C16719g;
import me0.C23212s8;

/* renamed from: com.zing.zalo.uicontrol.v0 */
/* loaded from: classes4.dex */
public class C16666v0 extends C16719g {

    /* renamed from: D0 */
    float[] f84496D0;

    /* renamed from: E0 */
    Path f84497E0;

    /* renamed from: F0 */
    Paint f84498F0;

    /* renamed from: G0 */
    int f84499G0;

    /* renamed from: H0 */
    public int f84500H0;

    /* renamed from: I0 */
    boolean f84501I0;

    /* renamed from: J0 */
    Matrix f84502J0;

    /* renamed from: K0 */
    RectF f84503K0;

    /* renamed from: L0 */
    Matrix f84504L0;

    /* renamed from: M0 */
    Paint f84505M0;

    public C16666v0(Context context) {
        super(context);
        this.f84498F0 = new Paint(1);
        this.f84500H0 = 0;
        this.f84501I0 = true;
        this.f84502J0 = new Matrix();
        this.f84503K0 = new RectF();
        this.f84504L0 = new Matrix();
        this.f84499G0 = C23212s8.m119607o(context, AbstractC16781w.ImagePlaceHolderColor);
        this.f84498F0.setStyle(Paint.Style.FILL);
        this.f84498F0.setColor(this.f84499G0);
    }

    /* renamed from: g1 */
    public int m88806g1() {
        return this.f84498F0.getColor();
    }

    /* renamed from: h1 */
    public void m88807h1(float f11) {
        m88809j1(new float[]{f11, f11, f11, f11, f11, f11, f11, f11});
    }

    /* renamed from: i1 */
    public void m88808i1(float f11, float f12, float f13, float f14) {
        m88809j1(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
    }

    /* renamed from: j1 */
    public void m88809j1(float[] fArr) {
        if (fArr != null && fArr.length == 8) {
            this.f84496D0 = fArr;
        } else {
            this.f84496D0 = null;
        }
        this.f84501I0 = true;
        requestLayout();
    }

    /* renamed from: k1 */
    public void m88810k1(RectF rectF, Paint paint) {
        this.f84503K0.setEmpty();
        this.f84504L0.reset();
        this.f84504L0.setTranslate(-m89096G(), -m89098H());
        this.f84504L0.mapRect(this.f84503K0, rectF);
        this.f84505M0 = paint;
        invalidate();
    }

    /* renamed from: l1 */
    public void m88811l1(int i11) {
        this.f84498F0.setColor(i11);
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        Path path;
        super.mo44775o0(canvas);
        if (this.f84496D0 != null && (path = this.f84497E0) != null && !path.isEmpty()) {
            canvas.drawPath(this.f84497E0, this.f84498F0);
        } else {
            canvas.drawRect(0.0f, 0.0f, m89110N(), m89108M(), this.f84498F0);
        }
        canvas.save();
        Path path2 = this.f84497E0;
        if (path2 != null && !path2.isEmpty()) {
            canvas.clipPath(this.f84497E0);
        }
        if (!canvas.quickReject(this.f84503K0, Canvas.EdgeType.BW) && this.f84503K0 != null && this.f84505M0 != null) {
            this.f84502J0.reset();
            this.f84502J0.setTranslate(-m89096G(), -m89098H());
            this.f84505M0.getShader().setLocalMatrix(this.f84502J0);
            canvas.drawRect(this.f84503K0, this.f84505M0);
        }
        canvas.restore();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        this.f84501I0 = true;
        super.mo44180q0(i11, i12, i13, i14);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f84501I0) {
            if (this.f84496D0 == null) {
                this.f84497E0 = null;
            } else {
                Path path = this.f84497E0;
                if (path == null) {
                    this.f84497E0 = new Path();
                } else {
                    path.reset();
                }
                this.f84497E0.addRoundRect(0.0f, 0.0f, m89110N(), m89108M(), this.f84496D0, Path.Direction.CCW);
            }
            this.f84501I0 = false;
        }
    }

    public C16666v0(Context context, int i11) {
        super(context);
        this.f84498F0 = new Paint(1);
        this.f84500H0 = 0;
        this.f84501I0 = true;
        this.f84502J0 = new Matrix();
        this.f84503K0 = new RectF();
        this.f84504L0 = new Matrix();
        this.f84499G0 = C23212s8.m119607o(context, AbstractC16781w.ImagePlaceHolderColor);
        this.f84498F0.setStyle(Paint.Style.FILL);
        this.f84498F0.setColor(this.f84499G0);
        this.f84500H0 = i11;
    }
}
