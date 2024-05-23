package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import com.zing.zalo.zinstant.zom.node.ZOM;
import p357n6.AbstractC23587l;

/* renamed from: com.google.android.material.internal.z */
/* loaded from: classes3.dex */
public abstract class AbstractC6359z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.z$a */
    /* loaded from: classes3.dex */
    public static class a implements d {

        /* renamed from: a */
        final /* synthetic */ boolean f35603a;

        /* renamed from: b */
        final /* synthetic */ boolean f35604b;

        /* renamed from: c */
        final /* synthetic */ boolean f35605c;

        /* renamed from: d */
        final /* synthetic */ d f35606d;

        a(boolean z11, boolean z12, boolean z13, d dVar) {
            this.f35603a = z11;
            this.f35604b = z12;
            this.f35605c = z13;
            this.f35606d = dVar;
        }

        @Override // com.google.android.material.internal.AbstractC6359z.d
        /* renamed from: a */
        public C1580n1 mo31803a(View view, C1580n1 c1580n1, e eVar) {
            if (this.f35603a) {
                eVar.f35612d += c1580n1.m8058j();
            }
            boolean m32653h = AbstractC6359z.m32653h(view);
            if (this.f35604b) {
                if (m32653h) {
                    eVar.f35611c += c1580n1.m8059k();
                } else {
                    eVar.f35609a += c1580n1.m8059k();
                }
            }
            if (this.f35605c) {
                if (m32653h) {
                    eVar.f35609a += c1580n1.m8060l();
                } else {
                    eVar.f35611c += c1580n1.m8060l();
                }
            }
            eVar.m32656a(view);
            d dVar = this.f35606d;
            if (dVar != null) {
                return dVar.mo31803a(view, c1580n1, eVar);
            }
            return c1580n1;
        }
    }

    /* renamed from: com.google.android.material.internal.z$b */
    /* loaded from: classes3.dex */
    public static class b implements InterfaceC1551g0 {

        /* renamed from: a */
        final /* synthetic */ d f35607a;

        /* renamed from: b */
        final /* synthetic */ e f35608b;

        b(d dVar, e eVar) {
            this.f35607a = dVar;
            this.f35608b = eVar;
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            return this.f35607a.mo31803a(view, c1580n1, new e(this.f35608b));
        }
    }

    /* renamed from: com.google.android.material.internal.z$c */
    /* loaded from: classes3.dex */
    public static class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            AbstractC1579n0.m7910x0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.z$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        C1580n1 mo31803a(View view, C1580n1 c1580n1, e eVar);
    }

    /* renamed from: com.google.android.material.internal.z$e */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a */
        public int f35609a;

        /* renamed from: b */
        public int f35610b;

        /* renamed from: c */
        public int f35611c;

        /* renamed from: d */
        public int f35612d;

        public e(int i11, int i12, int i13, int i14) {
            this.f35609a = i11;
            this.f35610b = i12;
            this.f35611c = i13;
            this.f35612d = i14;
        }

        /* renamed from: a */
        public void m32656a(View view) {
            AbstractC1579n0.m7837S0(view, this.f35609a, this.f35610b, this.f35611c, this.f35612d);
        }

        public e(e eVar) {
            this.f35609a = eVar.f35609a;
            this.f35610b = eVar.f35610b;
            this.f35611c = eVar.f35611c;
            this.f35612d = eVar.f35612d;
        }
    }

    /* renamed from: a */
    public static void m32646a(View view, AttributeSet attributeSet, int i11, int i12, d dVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, AbstractC23587l.Insets, i11, i12);
        boolean z11 = obtainStyledAttributes.getBoolean(AbstractC23587l.Insets_paddingBottomSystemWindowInsets, false);
        boolean z12 = obtainStyledAttributes.getBoolean(AbstractC23587l.Insets_paddingLeftSystemWindowInsets, false);
        boolean z13 = obtainStyledAttributes.getBoolean(AbstractC23587l.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m32647b(view, new a(z11, z12, z13, dVar));
    }

    /* renamed from: b */
    public static void m32647b(View view, d dVar) {
        AbstractC1579n0.m7833Q0(view, new b(dVar, new e(AbstractC1579n0.m7820K(view), view.getPaddingTop(), AbstractC1579n0.m7818J(view), view.getPaddingBottom())));
        m32655j(view);
    }

    /* renamed from: c */
    public static float m32648c(Context context, int i11) {
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    /* renamed from: d */
    public static ViewGroup m32649d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: e */
    public static InterfaceC6358y m32650e(View view) {
        return m32651f(m32649d(view));
    }

    /* renamed from: f */
    public static InterfaceC6358y m32651f(View view) {
        if (view == null) {
            return null;
        }
        return new C6357x(view);
    }

    /* renamed from: g */
    public static float m32652g(View view) {
        float f11 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f11 += AbstractC1579n0.m7800A((View) parent);
        }
        return f11;
    }

    /* renamed from: h */
    public static boolean m32653h(View view) {
        if (AbstractC1579n0.m7812G(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static PorterDuff.Mode m32654i(int i11, PorterDuff.Mode mode) {
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 9) {
                    switch (i11) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: j */
    public static void m32655j(View view) {
        if (AbstractC1579n0.m7862d0(view)) {
            AbstractC1579n0.m7910x0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }
}
