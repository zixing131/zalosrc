package pw;

import android.graphics.Color;

/* renamed from: pw.e */
/* loaded from: classes4.dex */
public abstract class AbstractC24916e {
    /* renamed from: a */
    public static boolean m129586a(int i11) {
        if (1.0d - ((((Color.red(i11) * 0.299d) + (Color.green(i11) * 0.587d)) + (Color.blue(i11) * 0.114d)) / 255.0d) > 0.5d) {
            return true;
        }
        return false;
    }
}
