package sj0;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.zing.zalo.zinstant.utils.C17206r;
import com.zing.zalo.zinstant.zom.properties.ZOMGradient;

/* renamed from: sj0.n */
/* loaded from: classes7.dex */
public class C26289n extends C26280e {

    /* renamed from: Q */
    private int f124833Q;

    /* renamed from: R */
    private int f124834R;

    /* renamed from: S */
    private int[] f124835S;

    /* renamed from: T */
    private float[] f124836T;

    /* renamed from: U */
    private float f124837U;

    /* renamed from: V */
    private float f124838V;

    /* renamed from: W */
    private float f124839W;

    /* renamed from: X */
    private float f124840X;

    /* renamed from: Y */
    private float f124841Y;

    /* renamed from: Z */
    private boolean f124842Z;

    public C26289n(int i11, int i12, ZOMGradient zOMGradient) {
        super(i11, i12);
        this.f124842Z = true;
        m135280x(zOMGradient);
        m135281y();
    }

    /* renamed from: A */
    private void m135269A(float f11) {
        if (this.f124838V == f11) {
            return;
        }
        this.f124838V = f11;
        this.f124842Z = true;
    }

    /* renamed from: B */
    private void m135270B(float f11) {
        if (this.f124839W == f11) {
            return;
        }
        this.f124839W = f11;
        this.f124842Z = true;
    }

    /* renamed from: C */
    private void m135271C(int[] iArr) {
        int[] iArr2 = this.f124835S;
        if (iArr2 == iArr) {
            return;
        }
        if (iArr != null && iArr2 != null && iArr2.length == iArr.length) {
            int length = iArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (this.f124835S[i11] != iArr[i11]) {
                    this.f124835S = iArr;
                    this.f124842Z = true;
                    return;
                }
            }
        }
        this.f124835S = iArr;
        this.f124842Z = true;
    }

    /* renamed from: D */
    private void m135272D(float[] fArr) {
        float[] fArr2 = this.f124836T;
        if (fArr2 == fArr) {
            return;
        }
        if (fArr2 != null && fArr != null && fArr2.length == fArr.length) {
            int length = fArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!C17206r.m91843a(this.f124836T[i11], fArr[i11], 1.0E-6d)) {
                    this.f124836T = fArr;
                    this.f124842Z = true;
                    return;
                }
            }
            return;
        }
        this.f124836T = fArr;
        this.f124842Z = true;
    }

    /* renamed from: E */
    private void m135273E(float f11) {
        if (this.f124837U == f11) {
            return;
        }
        this.f124837U = f11;
        this.f124842Z = true;
    }

    /* renamed from: F */
    private void m135274F(float f11) {
        if (this.f124840X == f11) {
            return;
        }
        this.f124840X = f11;
        this.f124842Z = true;
    }

    /* renamed from: G */
    private void m135275G(float f11) {
        if (this.f124841Y == f11) {
            return;
        }
        this.f124841Y = f11;
        this.f124842Z = true;
    }

    /* renamed from: I */
    private void m135276I(int i11) {
        if (this.f124833Q == i11) {
            return;
        }
        this.f124833Q = i11;
        this.f124842Z = true;
    }

    /* renamed from: u */
    private LinearGradient m135277u() {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        double abs = Math.abs(Math.sin(Math.toRadians(this.f124834R)) * this.f124785p.width()) + Math.abs(Math.cos(Math.toRadians(this.f124834R)) * this.f124785p.height());
        double sin = Math.sin(Math.toRadians(this.f124834R)) * abs;
        double cos = Math.cos(Math.toRadians(this.f124834R)) * abs;
        float abs2 = ((float) (Math.abs(cos) - this.f124785p.height())) / 2.0f;
        float abs3 = ((float) (Math.abs(sin) - this.f124785p.width())) / 2.0f;
        float f16 = 0.0f;
        if (cos > 0.0d) {
            f11 = ((float) cos) - abs2;
            f12 = -abs2;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        if (cos < 0.0d) {
            f11 = -abs2;
            f12 = ((float) Math.abs(cos)) - abs2;
        }
        float f17 = f11;
        float f18 = f12;
        if (sin > 0.0d) {
            f16 = ((float) sin) - abs3;
            f13 = -abs3;
        } else {
            f13 = 0.0f;
        }
        if (sin < 0.0d) {
            f15 = -abs3;
            f14 = ((float) Math.abs(sin)) - abs3;
        } else {
            f14 = f13;
            f15 = f16;
        }
        return new LinearGradient(f14, f17, f15, f18, this.f124835S, this.f124836T, Shader.TileMode.CLAMP);
    }

    /* renamed from: v */
    private RadialGradient m135278v() {
        RadialGradient radialGradient = new RadialGradient(this.f124838V, this.f124839W, this.f124837U, this.f124835S, this.f124836T, Shader.TileMode.CLAMP);
        if (this.f124840X != 1.0f || this.f124841Y != 1.0f) {
            Matrix matrix = new Matrix();
            matrix.setScale(this.f124840X, this.f124841Y);
            radialGradient.setLocalMatrix(matrix);
        }
        return radialGradient;
    }

    /* renamed from: w */
    private Shader m135279w() {
        if (this.f124835S == null || this.f124836T == null) {
            return null;
        }
        int i11 = this.f124833Q;
        if (i11 != 0) {
            if (i11 != 1) {
                return null;
            }
            return m135278v();
        }
        return m135277u();
    }

    /* renamed from: x */
    private void m135280x(ZOMGradient zOMGradient) {
        m135276I(zOMGradient.mType);
        m135282z(zOMGradient.mAngle);
        m135271C(zOMGradient.mColors);
        m135272D(zOMGradient.mPositions);
        float f11 = zOMGradient.mRadius;
        if (f11 <= 0.0f) {
            f11 = 0.1f;
        }
        m135273E(f11);
        m135269A(zOMGradient.mCenterX);
        m135270B(zOMGradient.mCenterY);
        m135274F(zOMGradient.mScaleX);
        m135275G(zOMGradient.mScaleY);
    }

    /* renamed from: y */
    private void m135281y() {
        if (this.f124842Z) {
            this.f124788s.setShader(m135279w());
            this.f124842Z = false;
        }
    }

    /* renamed from: z */
    private void m135282z(int i11) {
        if (this.f124834R == i11) {
            return;
        }
        this.f124834R = i11;
        this.f124842Z = true;
    }

    /* renamed from: H */
    public void m135283H(int i11) {
        if (i11 != 0) {
            this.f124788s.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP));
        }
    }

    /* renamed from: J */
    public void m135284J(ZOMGradient zOMGradient) {
        m135280x(zOMGradient);
        m135281y();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sj0.C26280e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f124842Z = true;
        m135281y();
        invalidateSelf();
    }
}
