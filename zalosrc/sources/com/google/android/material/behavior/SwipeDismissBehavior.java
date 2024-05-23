package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.InterfaceC1513j0;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import p337m1.C22712c;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    C22712c f34878a;

    /* renamed from: b */
    private boolean f34879b;

    /* renamed from: d */
    private boolean f34881d;

    /* renamed from: c */
    private float f34880c = 0.0f;

    /* renamed from: e */
    int f34882e = 2;

    /* renamed from: f */
    float f34883f = 0.5f;

    /* renamed from: g */
    float f34884g = 0.0f;

    /* renamed from: h */
    float f34885h = 0.5f;

    /* renamed from: i */
    private final C22712c.c f34886i = new C6238a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes3.dex */
    public class C6238a extends C22712c.c {

        /* renamed from: a */
        private int f34887a;

        /* renamed from: b */
        private int f34888b = -1;

        C6238a() {
        }

        /* renamed from: n */
        private boolean m31736n(View view, float f11) {
            boolean z11;
            if (f11 != 0.0f) {
                if (AbstractC1579n0.m7812G(view) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = SwipeDismissBehavior.this.f34882e;
                if (i11 == 2) {
                    return true;
                }
                if (i11 == 0) {
                    if (z11) {
                        if (f11 >= 0.0f) {
                            return false;
                        }
                    } else if (f11 <= 0.0f) {
                        return false;
                    }
                    return true;
                }
                if (i11 != 1) {
                    return false;
                }
                if (z11) {
                    if (f11 <= 0.0f) {
                        return false;
                    }
                } else if (f11 >= 0.0f) {
                    return false;
                }
                return true;
            }
            if (Math.abs(view.getLeft() - this.f34887a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f34883f)) {
                return false;
            }
            return true;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: a */
        public int mo8626a(View view, int i11, int i12) {
            boolean z11;
            int width;
            int width2;
            int width3;
            if (AbstractC1579n0.m7812G(view) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i13 = SwipeDismissBehavior.this.f34882e;
            if (i13 == 0) {
                if (z11) {
                    width = this.f34887a - view.getWidth();
                    width2 = this.f34887a;
                } else {
                    width = this.f34887a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i13 == 1) {
                if (z11) {
                    width = this.f34887a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f34887a - view.getWidth();
                    width2 = this.f34887a;
                }
            } else {
                width = this.f34887a - view.getWidth();
                width2 = view.getWidth() + this.f34887a;
            }
            return SwipeDismissBehavior.m31728G(width, i11, width2);
        }

        @Override // p337m1.C22712c.c
        /* renamed from: b */
        public int mo8627b(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: d */
        public int mo8628d(View view) {
            return view.getWidth();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: i */
        public void mo8632i(View view, int i11) {
            this.f34888b = i11;
            this.f34887a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: j */
        public void mo8633j(int i11) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: k */
        public void mo8634k(View view, int i11, int i12, int i13, int i14) {
            float width = this.f34887a + (view.getWidth() * SwipeDismissBehavior.this.f34884g);
            float width2 = this.f34887a + (view.getWidth() * SwipeDismissBehavior.this.f34885h);
            float f11 = i11;
            if (f11 <= width) {
                view.setAlpha(1.0f);
            } else if (f11 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m31727F(0.0f, 1.0f - SwipeDismissBehavior.m31730I(width, width2, f11), 1.0f));
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: l */
        public void mo8635l(View view, float f11, float f12) {
            int i11;
            boolean z11;
            this.f34888b = -1;
            int width = view.getWidth();
            if (m31736n(view, f11)) {
                int left = view.getLeft();
                int i12 = this.f34887a;
                if (left < i12) {
                    i11 = i12 - width;
                } else {
                    i11 = i12 + width;
                }
                z11 = true;
            } else {
                i11 = this.f34887a;
                z11 = false;
            }
            if (SwipeDismissBehavior.this.f34878a.m117509N(i11, view.getTop())) {
                AbstractC1579n0.m7900s0(view, new RunnableC6240c(view, z11));
            } else if (z11) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: m */
        public boolean mo8636m(View view, int i11) {
            int i12 = this.f34888b;
            if ((i12 == -1 || i12 == i11) && SwipeDismissBehavior.this.mo31732E(view)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes3.dex */
    public class C6239b implements InterfaceC1513j0 {
        C6239b() {
        }

        @Override // androidx.core.view.accessibility.InterfaceC1513j0
        /* renamed from: a */
        public boolean mo7681a(View view, InterfaceC1513j0.a aVar) {
            int width;
            boolean z11 = false;
            if (!SwipeDismissBehavior.this.mo31732E(view)) {
                return false;
            }
            if (AbstractC1579n0.m7812G(view) == 1) {
                z11 = true;
            }
            int i11 = SwipeDismissBehavior.this.f34882e;
            if ((i11 == 0 && z11) || (i11 == 1 && !z11)) {
                width = -view.getWidth();
            } else {
                width = view.getWidth();
            }
            AbstractC1579n0.m7883k0(view, width);
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes3.dex */
    private class RunnableC6240c implements Runnable {

        /* renamed from: p */
        private final View f34891p;

        /* renamed from: q */
        private final boolean f34892q;

        RunnableC6240c(View view, boolean z11) {
            this.f34891p = view;
            this.f34892q = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C22712c c22712c = SwipeDismissBehavior.this.f34878a;
            if (c22712c != null && c22712c.m117518n(true)) {
                AbstractC1579n0.m7900s0(this.f34891p, this);
            } else if (this.f34892q) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    /* renamed from: F */
    static float m31727F(float f11, float f12, float f13) {
        return Math.min(Math.max(f11, f12), f13);
    }

    /* renamed from: G */
    static int m31728G(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i12), i13);
    }

    /* renamed from: H */
    private void m31729H(ViewGroup viewGroup) {
        C22712c m117494p;
        if (this.f34878a == null) {
            if (this.f34881d) {
                m117494p = C22712c.m117493o(viewGroup, this.f34880c, this.f34886i);
            } else {
                m117494p = C22712c.m117494p(viewGroup, this.f34886i);
            }
            this.f34878a = m117494p;
        }
    }

    /* renamed from: I */
    static float m31730I(float f11, float f12, float f13) {
        return (f13 - f11) / (f12 - f11);
    }

    /* renamed from: M */
    private void m31731M(View view) {
        AbstractC1579n0.m7904u0(view, ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
        if (mo31732E(view)) {
            AbstractC1579n0.m7908w0(view, C1507g0.a.f6463y, null, new C6239b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: D */
    public boolean mo6542D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C22712c c22712c = this.f34878a;
        if (c22712c != null) {
            c22712c.m117505F(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo31732E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m31733J(float f11) {
        this.f34885h = m31727F(0.0f, f11, 1.0f);
    }

    /* renamed from: K */
    public void m31734K(float f11) {
        this.f34884g = m31727F(0.0f, f11, 1.0f);
    }

    /* renamed from: L */
    public void m31735L(int i11) {
        this.f34882e = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public boolean mo6553k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z11 = this.f34879b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f34879b = false;
            }
        } else {
            z11 = coordinatorLayout.m6521H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f34879b = z11;
        }
        if (!z11) {
            return false;
        }
        m31729H(coordinatorLayout);
        return this.f34878a.m117510O(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public boolean mo6554l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        boolean mo6554l = super.mo6554l(coordinatorLayout, view, i11);
        if (AbstractC1579n0.m7808E(view) == 0) {
            AbstractC1579n0.m7823L0(view, 1);
            m31731M(view);
        }
        return mo6554l;
    }
}
