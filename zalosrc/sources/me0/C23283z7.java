package me0;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import p542ub.InterfaceC27218a;

/* renamed from: me0.z7 */
/* loaded from: classes4.dex */
public final class C23283z7 {

    /* renamed from: a */
    public static final C23283z7 f113025a = new C23283z7();

    private C23283z7() {
    }

    /* renamed from: f */
    public static final View m120373f(ZaloView zaloView, InterfaceC27218a interfaceC27218a) {
        View view;
        AbstractC19074t.m100208f(zaloView, "zaloView");
        if (!zaloView.mo60294yp()) {
            view = zaloView.m92656bJ();
        } else {
            view = null;
        }
        if (view == null) {
            return m120374g(interfaceC27218a);
        }
        return view;
    }

    /* renamed from: g */
    public static final View m120374g(InterfaceC27218a interfaceC27218a) {
        View decorView;
        View findViewById;
        if (interfaceC27218a != null && interfaceC27218a.mo35572i0() && !interfaceC27218a.isDestroyed() && !interfaceC27218a.isFinishing()) {
            Window window = interfaceC27218a.getWindow();
            if (window == null || (decorView = window.getDecorView()) == null || (findViewById = decorView.findViewById(R.id.content)) == null) {
                return interfaceC27218a.mo35570g0();
            }
            return findViewById;
        }
        return null;
    }

    /* renamed from: h */
    public static final void m120375h(final ZaloView zaloView, final int i11, final int i12, final Integer num) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        final InterfaceC27218a m92676n2 = zaloView.m92676n2();
        AbstractC19444a.m101697e(new Runnable() { // from class: me0.x7
            @Override // java.lang.Runnable
            public final void run() {
                C23283z7.m120382o(ZaloView.this, m92676n2, i11, i12, num);
            }
        });
    }

    /* renamed from: i */
    public static final void m120376i(final ZaloView zaloView, final String str, final Drawable drawable, final Integer num) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
        AbstractC19074t.m100208f(str, "text");
        final InterfaceC27218a m92676n2 = zaloView.m92676n2();
        AbstractC19444a.m101697e(new Runnable() { // from class: me0.v7
            @Override // java.lang.Runnable
            public final void run() {
                C23283z7.m120383p(ZaloView.this, m92676n2, str, drawable, num);
            }
        });
    }

    /* renamed from: j */
    public static final void m120377j(final InterfaceC27218a interfaceC27218a, final int i11, final int i12, final Integer num) {
        AbstractC19444a.m101697e(new Runnable() { // from class: me0.y7
            @Override // java.lang.Runnable
            public final void run() {
                C23283z7.m120384q(InterfaceC27218a.this, i11, i12, num);
            }
        });
    }

    /* renamed from: k */
    public static final void m120378k(final InterfaceC27218a interfaceC27218a, final String str, final int i11, final Integer num) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19444a.m101697e(new Runnable() { // from class: me0.u7
            @Override // java.lang.Runnable
            public final void run() {
                C23283z7.m120380m(InterfaceC27218a.this, str, i11, num);
            }
        });
    }

    /* renamed from: l */
    public static final void m120379l(final InterfaceC27218a interfaceC27218a, final String str, final Drawable drawable, final Integer num) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19444a.m101697e(new Runnable() { // from class: me0.w7
            @Override // java.lang.Runnable
            public final void run() {
                C23283z7.m120381n(InterfaceC27218a.this, str, drawable, num);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m120380m(InterfaceC27218a interfaceC27218a, String str, int i11, Integer num) {
        Snackbar m90669d;
        AbstractC19074t.m100208f(str, "$text");
        try {
            View m120374g = m120374g(interfaceC27218a);
            if (m120374g != null && (m90669d = Snackbar.Companion.m90669d(m120374g, str, -1)) != null) {
                if (i11 != 0) {
                    m90669d.m90643I(i11);
                }
                if (num != null) {
                    m90669d.m90645K(num.intValue());
                }
                m90669d.m90648N();
                return;
            }
            ToastUtils.showMess(str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m120381n(InterfaceC27218a interfaceC27218a, String str, Drawable drawable, Integer num) {
        Snackbar m90669d;
        AbstractC19074t.m100208f(str, "$text");
        try {
            View m120374g = m120374g(interfaceC27218a);
            if (m120374g != null && (m90669d = Snackbar.Companion.m90669d(m120374g, str, -1)) != null) {
                if (drawable != null) {
                    m90669d.m90644J(drawable);
                }
                if (num != null) {
                    m90669d.m90645K(num.intValue());
                }
                m90669d.m90648N();
                return;
            }
            ToastUtils.showMess(str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m120382o(ZaloView zaloView, InterfaceC27218a interfaceC27218a, int i11, int i12, Integer num) {
        Snackbar m90668c;
        AbstractC19074t.m100208f(zaloView, "$zaloView");
        try {
            View m120373f = m120373f(zaloView, interfaceC27218a);
            if (m120373f != null && (m90668c = Snackbar.Companion.m90668c(m120373f, i11, -1)) != null) {
                if (i12 != 0) {
                    m90668c.m90643I(i12);
                }
                if (num != null) {
                    m90668c.m90645K(num.intValue());
                }
                m90668c.m90648N();
                return;
            }
            ToastUtils.m89266n(i11, new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m120383p(ZaloView zaloView, InterfaceC27218a interfaceC27218a, String str, Drawable drawable, Integer num) {
        Snackbar m90669d;
        AbstractC19074t.m100208f(zaloView, "$zaloView");
        AbstractC19074t.m100208f(str, "$text");
        try {
            View m120373f = m120373f(zaloView, interfaceC27218a);
            if (m120373f != null && (m90669d = Snackbar.Companion.m90669d(m120373f, str, -1)) != null) {
                if (drawable != null) {
                    m90669d.m90644J(drawable);
                }
                if (num != null) {
                    m90669d.m90645K(num.intValue());
                }
                m90669d.m90648N();
                return;
            }
            ToastUtils.showMess(str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m120384q(InterfaceC27218a interfaceC27218a, int i11, int i12, Integer num) {
        Snackbar m90668c;
        try {
            View m120374g = m120374g(interfaceC27218a);
            if (m120374g != null && (m90668c = Snackbar.Companion.m90668c(m120374g, i11, -1)) != null) {
                if (i12 != 0) {
                    m90668c.m90643I(i12);
                }
                if (num != null) {
                    m90668c.m90645K(num.intValue());
                }
                m90668c.m90648N();
                return;
            }
            ToastUtils.m89266n(i11, new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
