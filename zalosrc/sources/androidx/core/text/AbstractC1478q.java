package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.q */
/* loaded from: classes2.dex */
public abstract class AbstractC1478q {

    /* renamed from: a */
    private static final Locale f6371a = new Locale("", "");

    /* renamed from: androidx.core.text.q$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static int m7472a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m7471a(Locale locale) {
        return a.m7472a(locale);
    }
}
