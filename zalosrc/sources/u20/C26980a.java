package u20;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ui0.C27280g;

/* renamed from: u20.a */
/* loaded from: classes5.dex */
public final class C26980a extends ImageSpan {

    /* renamed from: p */
    private WeakReference f127578p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26980a(Drawable drawable) {
        super(drawable);
        AbstractC19074t.m100208f(drawable, "drawable");
    }

    /* renamed from: a */
    private final Drawable m139036a() {
        Drawable drawable;
        WeakReference weakReference = this.f127578p;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            Drawable drawable2 = getDrawable();
            this.f127578p = new WeakReference(drawable2);
            return drawable2;
        }
        return drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        AbstractC19074t.m100208f(canvas, "canvas");
        AbstractC19074t.m100208f(paint, "paint");
        Drawable m139036a = m139036a();
        int i16 = paint.getFontMetricsInt().ascent;
        int i17 = paint.getFontMetricsInt().descent;
        AbstractC19074t.m100205c(m139036a);
        int intrinsicHeight = (i15 - m139036a.getBounds().bottom) + (((m139036a.getIntrinsicHeight() - i17) + i16) / 2);
        canvas.save();
        canvas.translate(f11, intrinsicHeight);
        m139036a.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        Drawable drawable = super.getDrawable();
        if (drawable != null) {
            if (drawable.getBounds().isEmpty()) {
                drawable.getBounds().set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                return drawable;
            }
            return drawable;
        }
        return null;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC19074t.m100208f(paint, "paint");
        Drawable m139036a = m139036a();
        AbstractC19074t.m100205c(m139036a);
        Rect bounds = m139036a.getBounds();
        AbstractC19074t.m100207e(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }

    public /* synthetic */ C26980a(Context context, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(context, i11, (i13 & 4) != 0 ? 0 : i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C26980a(Context context, int i11, int i12) {
        this(r2);
        Drawable m139658a;
        AbstractC19074t.m100208f(context, "context");
        if (i12 != 0) {
            m139658a = C27280g.m139659b(context, i11, i12);
            AbstractC19074t.m100205c(m139658a);
        } else {
            m139658a = C27280g.m139658a(context, i11);
            AbstractC19074t.m100205c(m139658a);
        }
    }
}
