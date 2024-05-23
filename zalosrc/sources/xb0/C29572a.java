package xb0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import fn0.AbstractC19074t;

/* renamed from: xb0.a */
/* loaded from: classes6.dex */
public final class C29572a extends MetricAffectingSpan {

    /* renamed from: p */
    private final Typeface f136485p;

    public C29572a(Typeface typeface) {
        this.f136485p = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AbstractC19074t.m100208f(textPaint, "paint");
        textPaint.setTypeface(this.f136485p);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        AbstractC19074t.m100208f(textPaint, "paint");
        textPaint.setTypeface(this.f136485p);
    }
}
