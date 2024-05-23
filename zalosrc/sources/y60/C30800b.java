package y60;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: y60.b */
/* loaded from: classes5.dex */
public class C30800b extends Drawable {

    /* renamed from: a */
    private final Paint f142229a = new Paint(1);

    /* renamed from: b */
    private final int f142230b;

    /* renamed from: c */
    private final int f142231c;

    /* renamed from: d */
    private final int f142232d;

    /* renamed from: e */
    private final int f142233e;

    /* renamed from: f */
    private LinearGradient f142234f;

    /* renamed from: g */
    float f142235g;

    /* renamed from: h */
    float f142236h;

    /* renamed from: i */
    float f142237i;

    /* renamed from: j */
    float f142238j;

    /* renamed from: k */
    float f142239k;

    public C30800b(int i11, int i12, int i13, int i14) {
        this.f142230b = i11;
        this.f142231c = i12;
        this.f142232d = i13;
        this.f142233e = i14;
    }

    /* renamed from: a */
    private void m149866a() {
        Rect bounds = getBounds();
        this.f142234f = new LinearGradient(bounds.left, bounds.centerY(), bounds.right, bounds.centerY(), this.f142230b, this.f142231c, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f142234f == null) {
            m149866a();
        }
        Rect bounds = getBounds();
        this.f142235g = bounds.left;
        this.f142236h = bounds.top;
        this.f142237i = bounds.right;
        this.f142238j = bounds.bottom;
        this.f142239k = bounds.height() / 2.0f;
        this.f142229a.setShader(null);
        this.f142229a.setColor(this.f142233e);
        this.f142229a.setStyle(Paint.Style.FILL);
        RectF rectF = new RectF(this.f142235g, this.f142236h, this.f142237i, this.f142238j);
        float f11 = this.f142239k;
        canvas.drawRoundRect(rectF, f11, f11, this.f142229a);
        this.f142229a.setShader(this.f142234f);
        this.f142229a.setStyle(Paint.Style.STROKE);
        this.f142229a.setStrokeWidth(this.f142232d);
        float f12 = this.f142232d / 2.0f;
        RectF rectF2 = new RectF(this.f142235g + f12, this.f142236h + f12, this.f142237i - f12, this.f142238j - f12);
        float f13 = this.f142239k;
        canvas.drawRoundRect(rectF2, f13, f13, this.f142229a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m149866a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f142229a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
