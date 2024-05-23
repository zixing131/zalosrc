package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.C1509h0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p176g1.AbstractC19201c;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C1490a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f6381c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f6382a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f6383b;

    /* renamed from: androidx.core.view.a$a */
    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C1490a f6384a;

        a(C1490a c1490a) {
            this.f6384a = c1490a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f6384a.mo7506a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1509h0 mo7507b = this.f6384a.mo7507b(view);
            if (mo7507b != null) {
                return (AccessibilityNodeProvider) mo7507b.m7669e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f6384a.mo7509f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1507g0 m7571I0 = C1507g0.m7571I0(accessibilityNodeInfo);
            m7571I0.m7651x0(AbstractC1579n0.m7874h0(view));
            m7571I0.m7632m0(AbstractC1579n0.m7859c0(view));
            m7571I0.m7643s0(AbstractC1579n0.m7899s(view));
            m7571I0.m7590D0(AbstractC1579n0.m7830P(view));
            this.f6384a.mo7510g(view, m7571I0);
            m7571I0.m7621f(accessibilityNodeInfo.getText(), view);
            List m7503c = C1490a.m7503c(view);
            for (int i11 = 0; i11 < m7503c.size(); i11++) {
                m7571I0.m7614b((C1507g0.a) m7503c.get(i11));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f6384a.mo7511h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f6384a.mo7512i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            return this.f6384a.mo7513j(view, i11, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i11) {
            this.f6384a.mo7514l(view, i11);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f6384a.mo7515m(view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.core.view.a$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static AccessibilityNodeProvider m7516a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m7517b(View.AccessibilityDelegate accessibilityDelegate, View view, int i11, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i11, bundle);
        }
    }

    public C1490a() {
        this(f6381c);
    }

    /* renamed from: c */
    static List m7503c(View view) {
        List list = (List) view.getTag(AbstractC19201c.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    /* renamed from: e */
    private boolean m7504e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m7582q = C1507g0.m7582q(view.createAccessibilityNodeInfo().getText());
            for (int i11 = 0; m7582q != null && i11 < m7582q.length; i11++) {
                if (clickableSpan.equals(m7582q[i11])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m7505k(int i11, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC19201c.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (m7504e(clickableSpan, view)) {
                clickableSpan.onClick(view);
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo7506a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6382a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1509h0 mo7507b(View view) {
        AccessibilityNodeProvider m7516a = b.m7516a(this.f6382a, view);
        if (m7516a != null) {
            return new C1509h0(m7516a);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate m7508d() {
        return this.f6383b;
    }

    /* renamed from: f */
    public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
        this.f6382a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo7510g(View view, C1507g0 c1507g0) {
        this.f6382a.onInitializeAccessibilityNodeInfo(view, c1507g0.m7598H0());
    }

    /* renamed from: h */
    public void mo7511h(View view, AccessibilityEvent accessibilityEvent) {
        this.f6382a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo7512i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6382a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo7513j(View view, int i11, Bundle bundle) {
        List m7503c = m7503c(view);
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= m7503c.size()) {
                break;
            }
            C1507g0.a aVar = (C1507g0.a) m7503c.get(i12);
            if (aVar.m7657b() == i11) {
                z11 = aVar.m7659d(view, bundle);
                break;
            }
            i12++;
        }
        if (!z11) {
            z11 = b.m7517b(this.f6382a, view, i11, bundle);
        }
        if (!z11 && i11 == AbstractC19201c.accessibility_action_clickable_span && bundle != null) {
            return m7505k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return z11;
    }

    /* renamed from: l */
    public void mo7514l(View view, int i11) {
        this.f6382a.sendAccessibilityEvent(view, i11);
    }

    /* renamed from: m */
    public void mo7515m(View view, AccessibilityEvent accessibilityEvent) {
        this.f6382a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1490a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f6382a = accessibilityDelegate;
        this.f6383b = new a(this);
    }
}
