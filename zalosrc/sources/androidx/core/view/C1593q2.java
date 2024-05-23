package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C1593q2;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import p665y0.C30245g;

/* renamed from: androidx.core.view.q2 */
/* loaded from: classes2.dex */
public final class C1593q2 {

    /* renamed from: a */
    private final e f6559a;

    /* renamed from: androidx.core.view.q2$a */
    /* loaded from: classes2.dex */
    private static class a extends e {

        /* renamed from: a */
        protected final Window f6560a;

        /* renamed from: b */
        private final View f6561b;

        a(Window window, View view) {
            this.f6560a = window;
            this.f6561b = view;
        }

        /* renamed from: e */
        private void m8148e(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 8) {
                        ((InputMethodManager) this.f6560a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f6560a.getDecorView().getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                m8154g(2);
                return;
            }
            m8154g(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m8149f(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        /* renamed from: h */
        private void m8150h(int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 8) {
                        final View view = this.f6561b;
                        if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                            view = this.f6560a.getCurrentFocus();
                        } else {
                            view.requestFocus();
                        }
                        if (view == null) {
                            view = this.f6560a.findViewById(R.id.content);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new Runnable() { // from class: androidx.core.view.p2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C1593q2.a.m8149f(view);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                m8155i(2);
                return;
            }
            m8155i(4);
            m8156j(1024);
        }

        @Override // androidx.core.view.C1593q2.e
        /* renamed from: a */
        void mo8151a(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    m8148e(i12);
                }
            }
        }

        @Override // androidx.core.view.C1593q2.e
        /* renamed from: b */
        void mo8152b(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        m8155i(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                        m8154g(4096);
                        return;
                    }
                    return;
                }
                m8155i(4096);
                m8154g(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
                return;
            }
            m8155i(6144);
        }

        @Override // androidx.core.view.C1593q2.e
        /* renamed from: c */
        void mo8153c(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    m8150h(i12);
                }
            }
        }

        /* renamed from: g */
        protected void m8154g(int i11) {
            View decorView = this.f6560a.getDecorView();
            decorView.setSystemUiVisibility(i11 | decorView.getSystemUiVisibility());
        }

        /* renamed from: i */
        protected void m8155i(int i11) {
            View decorView = this.f6560a.getDecorView();
            decorView.setSystemUiVisibility((~i11) & decorView.getSystemUiVisibility());
        }

        /* renamed from: j */
        protected void m8156j(int i11) {
            this.f6560a.clearFlags(i11);
        }
    }

    /* renamed from: androidx.core.view.q2$b */
    /* loaded from: classes2.dex */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }
    }

    /* renamed from: androidx.core.view.q2$c */
    /* loaded from: classes2.dex */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }
    }

    /* renamed from: androidx.core.view.q2$d */
    /* loaded from: classes2.dex */
    private static class d extends e {

        /* renamed from: a */
        final C1593q2 f6562a;

        /* renamed from: b */
        final WindowInsetsController f6563b;

        /* renamed from: c */
        private final C30245g f6564c;

        /* renamed from: d */
        protected Window f6565d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        d(Window window, C1593q2 c1593q2) {
            this(r0, c1593q2);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.f6565d = window;
        }

        @Override // androidx.core.view.C1593q2.e
        /* renamed from: a */
        void mo8151a(int i11) {
            this.f6563b.hide(i11);
        }

        @Override // androidx.core.view.C1593q2.e
        /* renamed from: b */
        void mo8152b(int i11) {
            this.f6563b.setSystemBarsBehavior(i11);
        }

        @Override // androidx.core.view.C1593q2.e
        /* renamed from: c */
        void mo8153c(int i11) {
            Window window = this.f6565d;
            if (window != null && (i11 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f6563b.show(i11);
        }

        d(WindowInsetsController windowInsetsController, C1593q2 c1593q2) {
            this.f6564c = new C30245g();
            this.f6563b = windowInsetsController;
            this.f6562a = c1593q2;
        }
    }

    /* renamed from: androidx.core.view.q2$e */
    /* loaded from: classes2.dex */
    private static class e {
        e() {
        }

        /* renamed from: a */
        abstract void mo8151a(int i11);

        /* renamed from: b */
        abstract void mo8152b(int i11);

        /* renamed from: c */
        abstract void mo8153c(int i11);
    }

    private C1593q2(WindowInsetsController windowInsetsController) {
        this.f6559a = new d(windowInsetsController, this);
    }

    /* renamed from: d */
    public static C1593q2 m8143d(WindowInsetsController windowInsetsController) {
        return new C1593q2(windowInsetsController);
    }

    /* renamed from: a */
    public void m8144a(int i11) {
        this.f6559a.mo8151a(i11);
    }

    /* renamed from: b */
    public void m8145b(int i11) {
        this.f6559a.mo8152b(i11);
    }

    /* renamed from: c */
    public void m8146c(int i11) {
        this.f6559a.mo8153c(i11);
    }

    public C1593q2(Window window, View view) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f6559a = new d(window, this);
            return;
        }
        if (i11 >= 26) {
            this.f6559a = new c(window, view);
        } else if (i11 >= 23) {
            this.f6559a = new b(window, view);
        } else {
            this.f6559a = new a(window, view);
        }
    }
}
