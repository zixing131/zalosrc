package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.AbstractC1423g;
import androidx.emoji2.text.C1698f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes2.dex */
public class C1697e implements C1698f.e {

    /* renamed from: b */
    private static final ThreadLocal f6812b = new ThreadLocal();

    /* renamed from: a */
    private final TextPaint f6813a;

    public C1697e() {
        TextPaint textPaint = new TextPaint();
        this.f6813a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: b */
    private static StringBuilder m8675b() {
        ThreadLocal threadLocal = f6812b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.C1698f.e
    /* renamed from: a */
    public boolean mo8676a(CharSequence charSequence, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 23 && i13 > i14) {
            return false;
        }
        StringBuilder m8675b = m8675b();
        m8675b.setLength(0);
        while (i11 < i12) {
            m8675b.append(charSequence.charAt(i11));
            i11++;
        }
        return AbstractC1423g.m7237a(this.f6813a, m8675b.toString());
    }
}
