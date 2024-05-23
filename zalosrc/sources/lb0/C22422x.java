package lb0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import me0.AbstractC23214t;

/* renamed from: lb0.x */
/* loaded from: classes6.dex */
public class C22422x extends Drawable {

    /* renamed from: a */
    TextPaint f109719a;

    /* renamed from: b */
    StaticLayout f109720b;

    /* renamed from: c */
    int f109721c;

    /* renamed from: d */
    int f109722d;

    /* renamed from: e */
    float f109723e = 1.0f;

    public C22422x(String str, int i11) {
        try {
            TextPaint textPaint = new TextPaint(1);
            this.f109719a = textPaint;
            textPaint.setTextSize(i11);
            StaticLayout m119631r = AbstractC23214t.m119631r(str, this.f109719a);
            this.f109720b = m119631r;
            this.f109721c = (int) m119631r.getLineWidth(0);
            this.f109722d = this.f109720b.getHeight();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m115849a(float f11) {
        this.f109723e = f11;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f109720b != null) {
            Rect bounds = getBounds();
            canvas.save();
            float f11 = this.f109723e;
            if (f11 != 1.0f) {
                canvas.scale(f11, f11, bounds.left + (bounds.width() / 2), bounds.top + (bounds.height() / 2));
            }
            canvas.translate(bounds.left + ((bounds.width() - this.f109721c) / 2), bounds.top + ((bounds.height() - this.f109722d) / 2));
            this.f109720b.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f109719a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
