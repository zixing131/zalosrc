package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* renamed from: androidx.emoji2.text.q */
/* loaded from: classes2.dex */
public final class C1709q extends AbstractC1702j {

    /* renamed from: v */
    private static Paint f6897v;

    /* renamed from: u */
    private TextPaint f6898u;

    public C1709q(C1708p c1708p) {
        super(c1708p);
    }

    /* renamed from: c */
    private TextPaint m8767c(CharSequence charSequence, int i11, int i12, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i11, i12, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint = this.f6898u;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.f6898u = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                    return textPaint;
                }
            }
            if (!(paint instanceof TextPaint)) {
                return null;
            }
            return (TextPaint) paint;
        }
        if (!(paint instanceof TextPaint)) {
            return null;
        }
        return (TextPaint) paint;
    }

    /* renamed from: e */
    private static Paint m8768e() {
        if (f6897v == null) {
            TextPaint textPaint = new TextPaint();
            f6897v = textPaint;
            textPaint.setColor(C1698f.m8679c().m8684d());
            f6897v.setStyle(Paint.Style.FILL);
        }
        return f6897v;
    }

    /* renamed from: d */
    void m8769d(Canvas canvas, TextPaint textPaint, float f11, float f12, float f13, float f14) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f11, f13, f12, f14, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        Paint paint2 = paint;
        TextPaint m8767c = m8767c(charSequence, i11, i12, paint2);
        if (m8767c != null && m8767c.bgColor != 0) {
            m8769d(canvas, m8767c, f11, f11 + m8726b(), i13, i15);
        }
        if (C1698f.m8679c().m8686h()) {
            canvas.drawRect(f11, i13, f11 + m8726b(), i15, m8768e());
        }
        C1708p m8725a = m8725a();
        float f12 = i14;
        if (m8767c != null) {
            paint2 = m8767c;
        }
        m8725a.m8755a(canvas, f11, f12, paint2);
    }
}
