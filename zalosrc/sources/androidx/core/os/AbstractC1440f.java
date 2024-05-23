package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.f */
/* loaded from: classes2.dex */
public abstract class AbstractC1440f {

    /* renamed from: androidx.core.os.f$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static LocaleList m7347a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C1443i m7346a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1443i.m7353e(a.m7347a(configuration));
        }
        return C1443i.m7351a(configuration.locale);
    }
}
