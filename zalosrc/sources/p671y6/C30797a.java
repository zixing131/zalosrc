package p671y6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.AbstractC1409d;

/* renamed from: y6.a */
/* loaded from: classes3.dex */
public class C30797a {

    /* renamed from: i */
    private static final int[] f142156i = new int[3];

    /* renamed from: j */
    private static final float[] f142157j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f142158k = new int[4];

    /* renamed from: l */
    private static final float[] f142159l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f142160a;

    /* renamed from: b */
    private final Paint f142161b;

    /* renamed from: c */
    private final Paint f142162c;

    /* renamed from: d */
    private int f142163d;

    /* renamed from: e */
    private int f142164e;

    /* renamed from: f */
    private int f142165f;

    /* renamed from: g */
    private final Path f142166g;

    /* renamed from: h */
    private Paint f142167h;

    public C30797a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m149840a(Canvas canvas, Matrix matrix, RectF rectF, int i11, float f11, float f12) {
        boolean z11;
        if (f12 < 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        Path path = this.f142166g;
        if (z11) {
            int[] iArr = f142158k;
            iArr[0] = 0;
            iArr[1] = this.f142165f;
            iArr[2] = this.f142164e;
            iArr[3] = this.f142163d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f11, f12);
            path.close();
            float f13 = -i11;
            rectF.inset(f13, f13);
            int[] iArr2 = f142158k;
            iArr2[0] = 0;
            iArr2[1] = this.f142163d;
            iArr2[2] = this.f142164e;
            iArr2[3] = this.f142165f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i11 / width);
        float[] fArr = f142159l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f142161b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f142158k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z11) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f142167h);
        }
        canvas.drawArc(rectF, f11, f12, true, this.f142161b);
        canvas.restore();
    }

    /* renamed from: b */
    public void m149841b(Canvas canvas, Matrix matrix, RectF rectF, int i11) {
        rectF.bottom += i11;
        rectF.offset(0.0f, -i11);
        int[] iArr = f142156i;
        iArr[0] = this.f142165f;
        iArr[1] = this.f142164e;
        iArr[2] = this.f142163d;
        Paint paint = this.f142162c;
        float f11 = rectF.left;
        paint.setShader(new LinearGradient(f11, rectF.top, f11, rectF.bottom, iArr, f142157j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f142162c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m149842c() {
        return this.f142160a;
    }

    /* renamed from: d */
    public void m149843d(int i11) {
        this.f142163d = AbstractC1409d.m7147p(i11, 68);
        this.f142164e = AbstractC1409d.m7147p(i11, 20);
        this.f142165f = AbstractC1409d.m7147p(i11, 0);
        this.f142160a.setColor(this.f142163d);
    }

    public C30797a(int i11) {
        this.f142166g = new Path();
        this.f142167h = new Paint();
        this.f142160a = new Paint();
        m149843d(i11);
        this.f142167h.setColor(0);
        Paint paint = new Paint(4);
        this.f142161b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f142162c = new Paint(paint);
    }
}
