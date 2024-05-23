package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.h0 */
/* loaded from: classes2.dex */
public class C1509h0 {

    /* renamed from: a */
    private final Object f6472a;

    /* renamed from: androidx.core.view.accessibility.h0$a */
    /* loaded from: classes2.dex */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C1509h0 f6473a;

        a(C1509h0 c1509h0) {
            this.f6473a = c1509h0;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            C1507g0 mo7666b = this.f6473a.mo7666b(i11);
            if (mo7666b == null) {
                return null;
            }
            return mo7666b.m7598H0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i11) {
            List m7667c = this.f6473a.m7667c(str, i11);
            if (m7667c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m7667c.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(((C1507g0) m7667c.get(i12)).m7598H0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i11, int i12, Bundle bundle) {
            return this.f6473a.mo7670f(i11, i12, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.h0$b */
    /* loaded from: classes2.dex */
    static class b extends a {
        b(C1509h0 c1509h0) {
            super(c1509h0);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i11) {
            C1507g0 mo7668d = this.f6473a.mo7668d(i11);
            if (mo7668d == null) {
                return null;
            }
            return mo7668d.m7598H0();
        }
    }

    /* renamed from: androidx.core.view.accessibility.h0$c */
    /* loaded from: classes2.dex */
    static class c extends b {
        c(C1509h0 c1509h0) {
            super(c1509h0);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f6473a.m7665a(i11, C1507g0.m7571I0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C1509h0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6472a = new c(this);
        } else {
            this.f6472a = new b(this);
        }
    }

    /* renamed from: a */
    public void m7665a(int i11, C1507g0 c1507g0, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C1507g0 mo7666b(int i11) {
        return null;
    }

    /* renamed from: c */
    public List m7667c(String str, int i11) {
        return null;
    }

    /* renamed from: d */
    public C1507g0 mo7668d(int i11) {
        return null;
    }

    /* renamed from: e */
    public Object m7669e() {
        return this.f6472a;
    }

    /* renamed from: f */
    public boolean mo7670f(int i11, int i12, Bundle bundle) {
        return false;
    }

    public C1509h0(Object obj) {
        this.f6472a = obj;
    }
}
