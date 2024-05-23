package u80;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: u80.b0 */
/* loaded from: classes6.dex */
public final class C27104b0 extends DynamicDrawableSpan {

    /* renamed from: p */
    private Drawable f127784p;

    /* renamed from: q */
    private int f127785q;

    /* renamed from: r */
    private int f127786r;

    /* renamed from: s */
    private int f127787s;

    public C27104b0() {
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        AbstractC19074t.m100208f(canvas, "canvas");
        AbstractC19074t.m100208f(charSequence, "text");
        AbstractC19074t.m100208f(paint, "paint");
        canvas.save();
        int i16 = i15 - (getDrawable().getBounds().bottom / 2);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(f11 + this.f127785q, (i16 - (fontMetricsInt.descent - (fontMetricsInt.ascent / 2))) + this.f127787s);
        getDrawable().draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        Drawable drawable = this.f127784p;
        if (drawable == null) {
            AbstractC19074t.m100223u("mDrawable");
            return null;
        }
        return drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC19074t.m100208f(paint, "paint");
        AbstractC19074t.m100208f(charSequence, "text");
        Rect bounds = getDrawable().getBounds();
        AbstractC19074t.m100207e(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            int i13 = -bounds.bottom;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i13;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right + this.f127785q + this.f127786r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27104b0(Drawable drawable, int i11, int i12, int i13) {
        this();
        AbstractC19074t.m100208f(drawable, "drawable");
        this.f127784p = drawable;
        this.f127785q = i11;
        this.f127786r = i13;
        this.f127787s = i12;
    }

    public /* synthetic */ C27104b0(Drawable drawable, int i11, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this(drawable, i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
