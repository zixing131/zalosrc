package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.accessibility.b */
/* loaded from: classes2.dex */
public abstract class AbstractC1496b {

    /* renamed from: androidx.core.view.accessibility.b$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static int m7557a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        static void m7558b(AccessibilityEvent accessibilityEvent, int i11) {
            accessibilityEvent.setContentChangeTypes(i11);
        }
    }

    /* renamed from: a */
    public static int m7555a(AccessibilityEvent accessibilityEvent) {
        return a.m7557a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m7556b(AccessibilityEvent accessibilityEvent, int i11) {
        a.m7558b(accessibilityEvent, i11);
    }
}
