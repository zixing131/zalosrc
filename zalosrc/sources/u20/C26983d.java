package u20;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import fn0.AbstractC19074t;

/* renamed from: u20.d */
/* loaded from: classes5.dex */
public final class C26983d extends MetricAffectingSpan {

    /* renamed from: p */
    private final Typeface f127613p;

    public C26983d(Typeface typeface) {
        this.f127613p = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AbstractC19074t.m100208f(textPaint, "paint");
        textPaint.setTypeface(this.f127613p);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        AbstractC19074t.m100208f(textPaint, "paint");
        textPaint.setTypeface(this.f127613p);
    }
}
