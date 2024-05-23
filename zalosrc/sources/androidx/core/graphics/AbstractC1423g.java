package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.C1483e;

/* renamed from: androidx.core.graphics.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1423g {

    /* renamed from: a */
    private static final ThreadLocal f6234a = new ThreadLocal();

    /* renamed from: androidx.core.graphics.g$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static boolean m7239a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m7237a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m7239a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f11 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i11 = 0;
            while (i11 < length) {
                int charCount = Character.charCount(str.codePointAt(i11)) + i11;
                f11 += paint.measureText(str, i11, charCount);
                i11 = charCount;
            }
            if (measureText3 >= f11) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C1483e m7238b = m7238b();
        paint.getTextBounds("\udfffd", 0, 2, (Rect) m7238b.f6374a);
        paint.getTextBounds(str, 0, length, (Rect) m7238b.f6375b);
        return !((Rect) m7238b.f6374a).equals(m7238b.f6375b);
    }

    /* renamed from: b */
    private static C1483e m7238b() {
        ThreadLocal threadLocal = f6234a;
        C1483e c1483e = (C1483e) threadLocal.get();
        if (c1483e == null) {
            C1483e c1483e2 = new C1483e(new Rect(), new Rect());
            threadLocal.set(c1483e2);
            return c1483e2;
        }
        ((Rect) c1483e.f6374a).setEmpty();
        ((Rect) c1483e.f6375b).setEmpty();
        return c1483e;
    }
}
