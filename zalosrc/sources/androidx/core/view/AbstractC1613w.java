package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.w */
/* loaded from: classes2.dex */
public abstract class AbstractC1613w {

    /* renamed from: androidx.core.view.w$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static int m8238a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m8239b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m8240c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m8241d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m8242e(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.resolveLayoutDirection(i11);
        }

        /* renamed from: f */
        static void m8243f(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.setLayoutDirection(i11);
        }

        /* renamed from: g */
        static void m8244g(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.setMarginEnd(i11);
        }

        /* renamed from: h */
        static void m8245h(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
            marginLayoutParams.setMarginStart(i11);
        }
    }

    /* renamed from: a */
    public static int m8234a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m8239b(marginLayoutParams);
    }

    /* renamed from: b */
    public static int m8235b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.m8240c(marginLayoutParams);
    }

    /* renamed from: c */
    public static void m8236c(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        a.m8244g(marginLayoutParams, i11);
    }

    /* renamed from: d */
    public static void m8237d(ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        a.m8245h(marginLayoutParams, i11);
    }
}
