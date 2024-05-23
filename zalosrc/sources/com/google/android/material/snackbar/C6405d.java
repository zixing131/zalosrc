package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.material.snackbar.d */
/* loaded from: classes3.dex */
class C6405d {

    /* renamed from: c */
    private static C6405d f35873c;

    /* renamed from: a */
    private final Object f35874a = new Object();

    /* renamed from: b */
    private final Handler f35875b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C6405d c6405d = C6405d.this;
            AbstractC30228a.m149044a(message.obj);
            c6405d.m32937c(null);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.d$b */
    /* loaded from: classes3.dex */
    interface b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.snackbar.d$c */
    /* loaded from: classes3.dex */
    public static class c {
    }

    private C6405d() {
    }

    /* renamed from: a */
    private boolean m32934a(c cVar, int i11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6405d m32935b() {
        if (f35873c == null) {
            f35873c = new C6405d();
        }
        return f35873c;
    }

    /* renamed from: d */
    private boolean m32936d(b bVar) {
        return false;
    }

    /* renamed from: c */
    void m32937c(c cVar) {
        synchronized (this.f35874a) {
            m32934a(cVar, 2);
        }
    }

    /* renamed from: e */
    public void m32938e(b bVar) {
        synchronized (this.f35874a) {
            try {
                if (m32936d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public void m32939f(b bVar) {
        synchronized (this.f35874a) {
            try {
                if (m32936d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
