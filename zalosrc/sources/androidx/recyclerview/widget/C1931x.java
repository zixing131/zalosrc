package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.C1509h0;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.x */
/* loaded from: classes.dex */
public class C1931x extends C1490a {

    /* renamed from: d */
    final RecyclerView f8219d;

    /* renamed from: e */
    private final a f8220e;

    /* renamed from: androidx.recyclerview.widget.x$a */
    /* loaded from: classes.dex */
    public static class a extends C1490a {

        /* renamed from: d */
        final C1931x f8221d;

        /* renamed from: e */
        private Map f8222e = new WeakHashMap();

        public a(C1931x c1931x) {
            this.f8221d = c1931x;
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: a */
        public boolean mo7506a(View view, AccessibilityEvent accessibilityEvent) {
            C1490a c1490a = (C1490a) this.f8222e.get(view);
            if (c1490a != null) {
                return c1490a.mo7506a(view, accessibilityEvent);
            }
            return super.mo7506a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: b */
        public C1509h0 mo7507b(View view) {
            C1490a c1490a = (C1490a) this.f8222e.get(view);
            if (c1490a != null) {
                return c1490a.mo7507b(view);
            }
            return super.mo7507b(view);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            C1490a c1490a = (C1490a) this.f8222e.get(view);
            if (c1490a != null) {
                c1490a.mo7509f(view, accessibilityEvent);
            } else {
                super.mo7509f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            if (!this.f8221d.m10672o() && this.f8221d.f8219d.getLayoutManager() != null) {
                this.f8221d.f8219d.getLayoutManager().m10098M0(view, c1507g0);
                C1490a c1490a = (C1490a) this.f8222e.get(view);
                if (c1490a != null) {
                    c1490a.mo7510g(view, c1507g0);
                    return;
                } else {
                    super.mo7510g(view, c1507g0);
                    return;
                }
            }
            super.mo7510g(view, c1507g0);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: h */
        public void mo7511h(View view, AccessibilityEvent accessibilityEvent) {
            C1490a c1490a = (C1490a) this.f8222e.get(view);
            if (c1490a != null) {
                c1490a.mo7511h(view, accessibilityEvent);
            } else {
                super.mo7511h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: i */
        public boolean mo7512i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1490a c1490a = (C1490a) this.f8222e.get(viewGroup);
            if (c1490a != null) {
                return c1490a.mo7512i(viewGroup, view, accessibilityEvent);
            }
            return super.mo7512i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: j */
        public boolean mo7513j(View view, int i11, Bundle bundle) {
            if (!this.f8221d.m10672o() && this.f8221d.f8219d.getLayoutManager() != null) {
                C1490a c1490a = (C1490a) this.f8222e.get(view);
                if (c1490a != null) {
                    if (c1490a.mo7513j(view, i11, bundle)) {
                        return true;
                    }
                } else if (super.mo7513j(view, i11, bundle)) {
                    return true;
                }
                return this.f8221d.f8219d.getLayoutManager().m10125g1(view, i11, bundle);
            }
            return super.mo7513j(view, i11, bundle);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: l */
        public void mo7514l(View view, int i11) {
            C1490a c1490a = (C1490a) this.f8222e.get(view);
            if (c1490a != null) {
                c1490a.mo7514l(view, i11);
            } else {
                super.mo7514l(view, i11);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: m */
        public void mo7515m(View view, AccessibilityEvent accessibilityEvent) {
            C1490a c1490a = (C1490a) this.f8222e.get(view);
            if (c1490a != null) {
                c1490a.mo7515m(view, accessibilityEvent);
            } else {
                super.mo7515m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C1490a m10673n(View view) {
            return (C1490a) this.f8222e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void m10674o(View view) {
            C1490a m7891o = AbstractC1579n0.m7891o(view);
            if (m7891o != null && m7891o != this) {
                this.f8222e.put(view, m7891o);
            }
        }
    }

    public C1931x(RecyclerView recyclerView) {
        this.f8219d = recyclerView;
        C1490a m10671n = m10671n();
        if (m10671n != null && (m10671n instanceof a)) {
            this.f8220e = (a) m10671n;
        } else {
            this.f8220e = new a(this);
        }
    }

    @Override // androidx.core.view.C1490a
    /* renamed from: f */
    public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo7509f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !m10672o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo9730I0(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.view.C1490a
    /* renamed from: g */
    public void mo7510g(View view, C1507g0 c1507g0) {
        super.mo7510g(view, c1507g0);
        if (!m10672o() && this.f8219d.getLayoutManager() != null) {
            this.f8219d.getLayoutManager().m10095K0(c1507g0);
        }
    }

    @Override // androidx.core.view.C1490a
    /* renamed from: j */
    public boolean mo7513j(View view, int i11, Bundle bundle) {
        if (super.mo7513j(view, i11, bundle)) {
            return true;
        }
        if (!m10672o() && this.f8219d.getLayoutManager() != null) {
            return this.f8219d.getLayoutManager().m10120e1(i11, bundle);
        }
        return false;
    }

    /* renamed from: n */
    public C1490a m10671n() {
        return this.f8220e;
    }

    /* renamed from: o */
    boolean m10672o() {
        return this.f8219d.m9838L0();
    }
}
