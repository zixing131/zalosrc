package y60;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import me0.AbstractC23136l9;

/* renamed from: y60.d */
/* loaded from: classes5.dex */
public class C30802d extends Drawable {

    /* renamed from: a */
    Paint f142241a;

    /* renamed from: b */
    Rect f142242b;

    /* renamed from: c */
    RectF f142243c;

    /* renamed from: d */
    int f142244d;

    /* renamed from: e */
    int f142245e;

    /* renamed from: f */
    double f142246f;

    /* renamed from: g */
    int f142247g;

    /* renamed from: h */
    int f142248h;

    /* renamed from: i */
    int f142249i;

    /* renamed from: j */
    int f142250j;

    /* renamed from: k */
    Path f142251k;

    /* renamed from: l */
    boolean f142252l;

    /* renamed from: m */
    int f142253m;

    public C30802d(int i11, int i12, int i13) {
        this(i11, AbstractC23136l9.m118742r(10.0f), i12, i13);
    }

    /* renamed from: a */
    public void m149868a(boolean z11) {
        if (this.f142252l != z11) {
            this.f142252l = z11;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void m149869b(int i11) {
        this.f142253m = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11 = this.f142249i;
        canvas.translate(i11, i11);
        if (this.f142252l) {
            this.f142241a.setStyle(Paint.Style.FILL);
            this.f142241a.setColor(this.f142253m);
            canvas.drawPath(this.f142251k, this.f142241a);
        }
        if (this.f142249i > 0) {
            this.f142241a.setStyle(Paint.Style.STROKE);
            this.f142241a.setColor(this.f142250j);
            canvas.drawPath(this.f142251k, this.f142241a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f142242b = rect;
        int i11 = this.f142244d;
        int i12 = this.f142248h;
        int width = rect.width() - (this.f142249i * 2);
        int height = this.f142242b.height() - (this.f142249i * 2);
        int i13 = this.f142247g;
        int i14 = this.f142245e;
        this.f142251k.reset();
        this.f142251k.moveTo(width, i14 + i12);
        float f11 = -i12;
        this.f142251k.rQuadTo(0.0f, f11, f11, f11);
        this.f142251k.rLineTo((-width) + i11 + i13 + i12, 0.0f);
        float f12 = -i13;
        this.f142251k.rLineTo(f12, -i14);
        this.f142251k.rLineTo(f12, i14);
        this.f142251k.rLineTo((-i11) + i13 + i12, 0.0f);
        float f13 = i12;
        this.f142251k.rQuadTo(f11, 0.0f, f11, f13);
        this.f142251k.rLineTo(0.0f, (height - i14) - (i12 * 2));
        this.f142251k.rQuadTo(0.0f, f13, f13, f13);
        this.f142251k.rLineTo(width - r1, 0.0f);
        this.f142251k.rQuadTo(f13, 0.0f, f13, f11);
        this.f142251k.rLineTo(0.0f, -r2);
        this.f142251k.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C30802d(int i11, int i12, int i13, int i14) {
        this.f142249i = i13;
        this.f142250j = i14;
        this.f142252l = false;
        this.f142253m = -1;
        this.f142244d = i11;
        Paint paint = new Paint(1);
        this.f142241a = paint;
        paint.setColor(this.f142250j);
        this.f142241a.setStyle(Paint.Style.STROKE);
        this.f142241a.setStrokeWidth(this.f142249i);
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        this.f142245e = m118742r;
        this.f142246f = 1.7453292519943295d;
        this.f142247g = (int) (m118742r * Math.tan(1.7453292519943295d / 2.0d));
        this.f142243c = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f142248h = i12;
        this.f142251k = new Path();
    }
}
