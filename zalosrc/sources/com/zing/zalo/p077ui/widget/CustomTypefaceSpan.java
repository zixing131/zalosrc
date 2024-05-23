package com.zing.zalo.p077ui.widget;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class CustomTypefaceSpan extends TypefaceSpan {
    public static final C13494a Companion = new C13494a(null);

    /* renamed from: p */
    private final Typeface f69171p;

    /* renamed from: com.zing.zalo.ui.widget.CustomTypefaceSpan$a */
    /* loaded from: classes6.dex */
    public static final class C13494a {
        private C13494a() {
        }

        public /* synthetic */ C13494a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m75675b(Paint paint, Typeface typeface) {
            int i11;
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 != null) {
                i11 = typeface2.getStyle();
            } else {
                i11 = 0;
            }
            int i12 = i11 & (~typeface.getStyle());
            if ((i12 & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((i12 & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        AbstractC19074t.m100208f(typeface, "newType");
        this.f69171p = typeface;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AbstractC19074t.m100208f(textPaint, "ds");
        Companion.m75675b(textPaint, this.f69171p);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        AbstractC19074t.m100208f(textPaint, "paint");
        Companion.m75675b(textPaint, this.f69171p);
    }
}
