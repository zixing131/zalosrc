package u20;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zing.zalo.p077ui.widget.C13718q1;
import fn0.AbstractC19074t;
import pm0.C24848g0;

/* renamed from: u20.n */
/* loaded from: classes5.dex */
public final class C26993n extends Drawable {

    /* renamed from: a */
    private final Paint f127634a;

    /* renamed from: b */
    private final Paint f127635b;

    /* renamed from: c */
    private float f127636c;

    /* renamed from: d */
    private String f127637d;

    public C26993n(Context context) {
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        this.f127634a = paint;
        Paint paint2 = new Paint();
        paint2.setFlags(1);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(C13718q1.m76693b(context));
        paint2.setColor(-526344);
        this.f127635b = paint2;
        this.f127637d = "";
    }

    /* renamed from: a */
    public final void m139105a(int i11) {
        this.f127636c = i11 * 3.6f;
        this.f127637d = i11 + "%";
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        float strokeWidth = this.f127634a.getStrokeWidth() / 2.0f;
        Rect bounds = getBounds();
        AbstractC19074t.m100207e(bounds, "getBounds(...)");
        RectF rectF = new RectF(bounds);
        rectF.inset(strokeWidth, strokeWidth);
        Paint paint = this.f127634a;
        paint.setColor(872415231);
        C24848g0 c24848g0 = C24848g0.f119245a;
        canvas.drawOval(rectF, paint);
        float f11 = this.f127636c;
        Paint paint2 = this.f127634a;
        paint2.setColor(this.f127635b.getColor());
        canvas.drawArc(rectF, 270.0f, f11, false, paint2);
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        Paint.FontMetrics fontMetrics = this.f127635b.getFontMetrics();
        canvas.drawText(this.f127637d, centerX, centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.f127635b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        AbstractC19074t.m100208f(rect, "bounds");
        this.f127634a.setStrokeWidth(rect.width() * 0.07f);
        this.f127635b.setTextSize(rect.width() * 0.3f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
