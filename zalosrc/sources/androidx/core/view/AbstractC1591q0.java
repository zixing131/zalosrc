package androidx.core.view;

import android.view.ViewGroup;

/* renamed from: androidx.core.view.q0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1591q0 {

    /* renamed from: androidx.core.view.q0$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static int m8139a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m8140b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m8141c(ViewGroup viewGroup, boolean z11) {
            viewGroup.setTransitionGroup(z11);
        }
    }

    /* renamed from: a */
    public static boolean m8137a(ViewGroup viewGroup) {
        return a.m8140b(viewGroup);
    }

    /* renamed from: b */
    public static void m8138b(ViewGroup viewGroup, boolean z11) {
        viewGroup.setMotionEventSplittingEnabled(z11);
    }
}
