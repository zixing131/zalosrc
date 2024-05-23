package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.AbstractC1487i;

/* renamed from: androidx.emoji2.text.j */
/* loaded from: classes2.dex */
public abstract class AbstractC1702j extends ReplacementSpan {

    /* renamed from: q */
    private final C1708p f6868q;

    /* renamed from: p */
    private final Paint.FontMetricsInt f6867p = new Paint.FontMetricsInt();

    /* renamed from: r */
    private short f6869r = -1;

    /* renamed from: s */
    private short f6870s = -1;

    /* renamed from: t */
    private float f6871t = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1702j(C1708p c1708p) {
        AbstractC1487i.m7493h(c1708p, "rasterizer cannot be null");
        this.f6868q = c1708p;
    }

    /* renamed from: a */
    public final C1708p m8725a() {
        return this.f6868q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m8726b() {
        return this.f6869r;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f6867p);
        Paint.FontMetricsInt fontMetricsInt2 = this.f6867p;
        this.f6871t = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f6868q.m8759e();
        this.f6870s = (short) (this.f6868q.m8759e() * this.f6871t);
        short m8762i = (short) (this.f6868q.m8762i() * this.f6871t);
        this.f6869r = m8762i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f6867p;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return m8762i;
    }
}
