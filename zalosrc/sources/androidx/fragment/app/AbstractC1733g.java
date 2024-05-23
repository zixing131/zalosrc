package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes2.dex */
public abstract class AbstractC1733g {

    /* renamed from: q */
    static final C1731e f7046q = new C1731e();

    /* renamed from: p */
    private C1731e f7047p = null;

    /* renamed from: androidx.fragment.app.g$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        /* renamed from: a */
        public void m9001a(AbstractC1733g abstractC1733g, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: b */
        public void m9002b(AbstractC1733g abstractC1733g, Fragment fragment, Context context) {
        }

        /* renamed from: c */
        public void m9003c(AbstractC1733g abstractC1733g, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void m9004d(AbstractC1733g abstractC1733g, Fragment fragment) {
        }

        /* renamed from: e */
        public void m9005e(AbstractC1733g abstractC1733g, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo9006f(AbstractC1733g abstractC1733g, Fragment fragment) {
        }

        /* renamed from: g */
        public void m9007g(AbstractC1733g abstractC1733g, Fragment fragment, Context context) {
        }

        /* renamed from: h */
        public void m9008h(AbstractC1733g abstractC1733g, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: i */
        public void mo9009i(AbstractC1733g abstractC1733g, Fragment fragment) {
        }

        /* renamed from: j */
        public void m9010j(AbstractC1733g abstractC1733g, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: k */
        public void m9011k(AbstractC1733g abstractC1733g, Fragment fragment) {
        }

        /* renamed from: l */
        public void m9012l(AbstractC1733g abstractC1733g, Fragment fragment) {
        }

        /* renamed from: m */
        public void m9013m(AbstractC1733g abstractC1733g, Fragment fragment, View view, Bundle bundle) {
        }

        /* renamed from: n */
        public void m9014n(AbstractC1733g abstractC1733g, Fragment fragment) {
        }
    }

    /* renamed from: a */
    public abstract AbstractC1736j mo8990a();

    /* renamed from: b */
    public abstract void mo8991b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract boolean mo8992c();

    /* renamed from: d */
    public abstract Fragment mo8993d(String str);

    /* renamed from: e */
    public C1731e mo8994e() {
        if (this.f7047p == null) {
            this.f7047p = f7046q;
        }
        return this.f7047p;
    }

    /* renamed from: f */
    public abstract List mo8995f();

    /* renamed from: g */
    public abstract void mo8996g(int i11, int i12);

    /* renamed from: h */
    public abstract boolean mo8997h();

    /* renamed from: i */
    public abstract void mo8998i(a aVar, boolean z11);

    /* renamed from: j */
    public void m8999j(C1731e c1731e) {
        this.f7047p = c1731e;
    }

    /* renamed from: k */
    public abstract void mo9000k(a aVar);
}
