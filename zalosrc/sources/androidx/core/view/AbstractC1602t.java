package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.view.t */
/* loaded from: classes2.dex */
public abstract class AbstractC1602t {

    /* renamed from: androidx.core.view.t$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static void m8183a(int i11, int i12, int i13, Rect rect, int i14, int i15, Rect rect2, int i16) {
            Gravity.apply(i11, i12, i13, rect, i14, i15, rect2, i16);
        }

        /* renamed from: b */
        static void m8184b(int i11, int i12, int i13, Rect rect, Rect rect2, int i14) {
            Gravity.apply(i11, i12, i13, rect, rect2, i14);
        }

        /* renamed from: c */
        static void m8185c(int i11, Rect rect, Rect rect2, int i12) {
            Gravity.applyDisplay(i11, rect, rect2, i12);
        }
    }

    /* renamed from: a */
    public static void m8181a(int i11, int i12, int i13, Rect rect, Rect rect2, int i14) {
        a.m8184b(i11, i12, i13, rect, rect2, i14);
    }

    /* renamed from: b */
    public static int m8182b(int i11, int i12) {
        return Gravity.getAbsoluteGravity(i11, i12);
    }
}
