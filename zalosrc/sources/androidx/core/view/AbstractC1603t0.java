package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: androidx.core.view.t0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1603t0 {

    /* renamed from: androidx.core.view.t0$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static boolean m8194a(ViewParent viewParent, View view, float f11, float f12, boolean z11) {
            return viewParent.onNestedFling(view, f11, f12, z11);
        }

        /* renamed from: b */
        static boolean m8195b(ViewParent viewParent, View view, float f11, float f12) {
            return viewParent.onNestedPreFling(view, f11, f12);
        }

        /* renamed from: c */
        static void m8196c(ViewParent viewParent, View view, int i11, int i12, int[] iArr) {
            viewParent.onNestedPreScroll(view, i11, i12, iArr);
        }

        /* renamed from: d */
        static void m8197d(ViewParent viewParent, View view, int i11, int i12, int i13, int i14) {
            viewParent.onNestedScroll(view, i11, i12, i13, i14);
        }

        /* renamed from: e */
        static void m8198e(ViewParent viewParent, View view, View view2, int i11) {
            viewParent.onNestedScrollAccepted(view, view2, i11);
        }

        /* renamed from: f */
        static boolean m8199f(ViewParent viewParent, View view, View view2, int i11) {
            return viewParent.onStartNestedScroll(view, view2, i11);
        }

        /* renamed from: g */
        static void m8200g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m8186a(ViewParent viewParent, View view, float f11, float f12, boolean z11) {
        try {
            return a.m8194a(viewParent, view, f11, f12, z11);
        } catch (AbstractMethodError unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ViewParent ");
            sb2.append(viewParent);
            sb2.append(" does not implement interface method onNestedFling");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m8187b(ViewParent viewParent, View view, float f11, float f12) {
        try {
            return a.m8195b(viewParent, view, f11, f12);
        } catch (AbstractMethodError unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ViewParent ");
            sb2.append(viewParent);
            sb2.append(" does not implement interface method onNestedPreFling");
            return false;
        }
    }

    /* renamed from: c */
    public static void m8188c(ViewParent viewParent, View view, int i11, int i12, int[] iArr, int i13) {
        if (viewParent instanceof InterfaceC1539d0) {
            ((InterfaceC1539d0) viewParent).mo5178k(view, i11, i12, iArr, i13);
            return;
        }
        if (i13 == 0) {
            try {
                a.m8196c(viewParent, view, i11, i12, iArr);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onNestedPreScroll");
            }
        }
    }

    /* renamed from: d */
    public static void m8189d(ViewParent viewParent, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (viewParent instanceof InterfaceC1543e0) {
            ((InterfaceC1543e0) viewParent).mo5182r(view, i11, i12, i13, i14, i15, iArr);
            return;
        }
        iArr[0] = iArr[0] + i13;
        iArr[1] = iArr[1] + i14;
        if (viewParent instanceof InterfaceC1539d0) {
            ((InterfaceC1539d0) viewParent).mo5183s(view, i11, i12, i13, i14, i15);
            return;
        }
        if (i15 == 0) {
            try {
                a.m8197d(viewParent, view, i11, i12, i13, i14);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onNestedScroll");
            }
        }
    }

    /* renamed from: e */
    public static void m8190e(ViewParent viewParent, View view, View view2, int i11, int i12) {
        if (viewParent instanceof InterfaceC1539d0) {
            ((InterfaceC1539d0) viewParent).mo5176i(view, view2, i11, i12);
            return;
        }
        if (i12 == 0) {
            try {
                a.m8198e(viewParent, view, view2, i11);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onNestedScrollAccepted");
            }
        }
    }

    /* renamed from: f */
    public static boolean m8191f(ViewParent viewParent, View view, View view2, int i11, int i12) {
        if (viewParent instanceof InterfaceC1539d0) {
            return ((InterfaceC1539d0) viewParent).mo5184v(view, view2, i11, i12);
        }
        if (i12 == 0) {
            try {
                return a.m8199f(viewParent, view, view2, i11);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onStartNestedScroll");
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m8192g(ViewParent viewParent, View view, int i11) {
        if (viewParent instanceof InterfaceC1539d0) {
            ((InterfaceC1539d0) viewParent).mo5177j(view, i11);
            return;
        }
        if (i11 == 0) {
            try {
                a.m8200g(viewParent, view);
            } catch (AbstractMethodError unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ViewParent ");
                sb2.append(viewParent);
                sb2.append(" does not implement interface method onStopNestedScroll");
            }
        }
    }

    /* renamed from: h */
    public static boolean m8193h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
