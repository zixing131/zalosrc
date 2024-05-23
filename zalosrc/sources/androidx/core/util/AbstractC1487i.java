package androidx.core.util;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.util.i */
/* loaded from: classes.dex */
public abstract class AbstractC1487i {
    /* renamed from: a */
    public static void m7486a(boolean z11) {
        if (z11) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m7487b(boolean z11, Object obj) {
        if (z11) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m7488c(int i11, int i12, int i13, String str) {
        if (i11 >= i12) {
            if (i11 <= i13) {
                return i11;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    /* renamed from: d */
    public static int m7489d(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public static int m7490e(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: f */
    public static int m7491f(int i11, int i12) {
        if ((i11 & i12) == i11) {
            return i11;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(i12) + " are allowed");
    }

    /* renamed from: g */
    public static Object m7492g(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: h */
    public static Object m7493h(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: i */
    public static void m7494i(boolean z11, String str) {
        if (z11) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: j */
    public static CharSequence m7495j(CharSequence charSequence, Object obj) {
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
}
