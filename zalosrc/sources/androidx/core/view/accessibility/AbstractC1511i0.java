package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: androidx.core.view.accessibility.i0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1511i0 {

    /* renamed from: androidx.core.view.accessibility.i0$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static int m7675a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        static int m7676b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        static void m7677c(AccessibilityRecord accessibilityRecord, int i11) {
            accessibilityRecord.setMaxScrollX(i11);
        }

        /* renamed from: d */
        static void m7678d(AccessibilityRecord accessibilityRecord, int i11) {
            accessibilityRecord.setMaxScrollY(i11);
        }
    }

    /* renamed from: androidx.core.view.accessibility.i0$b */
    /* loaded from: classes2.dex */
    static class b {
        /* renamed from: a */
        static void m7679a(AccessibilityRecord accessibilityRecord, View view, int i11) {
            accessibilityRecord.setSource(view, i11);
        }
    }

    /* renamed from: a */
    public static void m7672a(AccessibilityRecord accessibilityRecord, int i11) {
        a.m7677c(accessibilityRecord, i11);
    }

    /* renamed from: b */
    public static void m7673b(AccessibilityRecord accessibilityRecord, int i11) {
        a.m7678d(accessibilityRecord, i11);
    }

    /* renamed from: c */
    public static void m7674c(AccessibilityRecord accessibilityRecord, View view, int i11) {
        b.m7679a(accessibilityRecord, view, i11);
    }
}
