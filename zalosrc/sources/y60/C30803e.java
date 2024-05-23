package y60;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;

/* renamed from: y60.e */
/* loaded from: classes5.dex */
public final class C30803e extends Drawable {

    /* renamed from: a */
    private final Drawable f142254a;

    public C30803e(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "drawable");
        this.f142254a = drawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        int intrinsicHeight = this.f142254a.getIntrinsicHeight();
        canvas.save();
        canvas.translate(0.0f, -intrinsicHeight);
        this.f142254a.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f142254a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f142254a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
