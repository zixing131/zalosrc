package y50;

import android.graphics.Rect;
import android.text.Layout;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: y50.e */
/* loaded from: classes5.dex */
public final class C30795e {

    /* renamed from: a */
    private final Layout f142148a;

    /* renamed from: b */
    private final int[] f142149b;

    public C30795e(Layout layout) {
        AbstractC19074t.m100208f(layout, "internal");
        this.f142148a = layout;
        this.f142149b = new int[layout.getLineCount()];
        int lineCount = layout.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            this.f142149b[i11] = (int) (this.f142148a.getLineWidth(i11) + 0.5f);
        }
    }

    /* renamed from: a */
    private final int m149800a(int i11, int i12) {
        return Math.min(Math.max(i11, this.f142148a.getLineStart(i12)), this.f142148a.getLineEnd(i12));
    }

    /* renamed from: g */
    public static /* synthetic */ int m149801g(C30795e c30795e, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c30795e.m149808f(i11, z11);
    }

    /* renamed from: p */
    public static /* synthetic */ int m149802p(C30795e c30795e, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c30795e.m149816o(i11, z11);
    }

    /* renamed from: r */
    public static /* synthetic */ int m149803r(C30795e c30795e, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return c30795e.m149817q(i11, z11);
    }

    /* renamed from: b */
    public final void m149804b(int i11, int i12, int i13, Rect rect) {
        boolean z11;
        int m149810i;
        AbstractC19074t.m100208f(rect, "dst");
        int m149800a = m149800a(i11, i13);
        int m149800a2 = m149800a(i12, i13);
        if (m149800a > m149800a2) {
            m149800a2 = m149800a;
            m149800a = m149800a2;
        }
        int m149812k = m149812k(i13);
        int m149806d = m149806d(i13);
        int m149802p = m149802p(this, m149800a, false, 2, null);
        if (m149800a2 != this.f142148a.getLineEnd(i13)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m149810i = m149802p(this, m149800a2, false, 2, null);
        } else if (!z11) {
            m149810i = m149810i(i13);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        rect.set(m149802p, m149812k, m149810i, m149806d);
    }

    /* renamed from: c */
    public final int m149805c(int i11) {
        int lineEnd = this.f142148a.getLineEnd(i11);
        return lineEnd - Character.charCount(Character.codePointBefore(this.f142148a.getText(), lineEnd));
    }

    /* renamed from: d */
    public final int m149806d(int i11) {
        return this.f142148a.getLineBottom(i11);
    }

    /* renamed from: e */
    public final int m149807e(int i11) {
        return this.f142148a.getLineEnd(i11);
    }

    /* renamed from: f */
    public final int m149808f(int i11, boolean z11) {
        int lineForOffset = this.f142148a.getLineForOffset(i11);
        if (z11 && lineForOffset != 0 && this.f142148a.getLineStart(lineForOffset) == i11 && m149818s(lineForOffset - 1)) {
            return lineForOffset - 1;
        }
        return lineForOffset;
    }

    /* renamed from: h */
    public final int m149809h(float f11) {
        return this.f142148a.getLineForVertical((int) f11);
    }

    /* renamed from: i */
    public final int m149810i(int i11) {
        return this.f142149b[i11];
    }

    /* renamed from: j */
    public final int m149811j(int i11) {
        return this.f142148a.getLineStart(i11);
    }

    /* renamed from: k */
    public final int m149812k(int i11) {
        return this.f142148a.getLineTop(i11);
    }

    /* renamed from: l */
    public final int m149813l(float f11, int i11) {
        return this.f142148a.getOffsetForHorizontal(i11, f11);
    }

    /* renamed from: m */
    public final int m149814m(float f11, float f12) {
        return m149813l(f11, m149809h(f12));
    }

    /* renamed from: n */
    public final CharSequence m149815n() {
        CharSequence text = this.f142148a.getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        return text;
    }

    /* renamed from: o */
    public final int m149816o(int i11, boolean z11) {
        int primaryHorizontal = (int) (this.f142148a.getPrimaryHorizontal(i11) + 0.5f);
        if (!z11) {
            return primaryHorizontal;
        }
        int lineForOffset = this.f142148a.getLineForOffset(i11);
        if (lineForOffset == 0) {
            return primaryHorizontal;
        }
        if (this.f142148a.getLineStart(lineForOffset) == i11 && m149818s(lineForOffset - 1)) {
            return m149810i(lineForOffset - 1);
        }
        return primaryHorizontal;
    }

    /* renamed from: q */
    public final int m149817q(int i11, boolean z11) {
        int m149808f = m149808f(i11, z11);
        return (this.f142148a.getLineTop(m149808f) + this.f142148a.getLineBottom(m149808f)) / 2;
    }

    /* renamed from: s */
    public final boolean m149818s(int i11) {
        if (this.f142148a.getText().charAt(m149805c(i11)) != '\n') {
            return true;
        }
        return false;
    }
}
