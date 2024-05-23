package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.core.util.AbstractC1480b;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import androidx.loader.app.AbstractC1809a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p534u1.AbstractC26941a;
import p564v1.AbstractC27421b;
import p665y0.C30246h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.loader.app.b */
/* loaded from: classes2.dex */
public class C1810b extends AbstractC1809a {

    /* renamed from: c */
    static boolean f7435c = false;

    /* renamed from: a */
    private final InterfaceC1801w f7436a;

    /* renamed from: b */
    private final c f7437b;

    /* renamed from: androidx.loader.app.b$a */
    /* loaded from: classes2.dex */
    public static class a extends C1761c0 implements AbstractC27421b.a {

        /* renamed from: l */
        private final int f7438l;

        /* renamed from: m */
        private final Bundle f7439m;

        /* renamed from: n */
        private final AbstractC27421b f7440n;

        /* renamed from: o */
        private InterfaceC1801w f7441o;

        /* renamed from: p */
        private b f7442p;

        /* renamed from: q */
        private AbstractC27421b f7443q;

        a(int i11, Bundle bundle, AbstractC27421b abstractC27421b, AbstractC27421b abstractC27421b2) {
            this.f7438l = i11;
            this.f7439m = bundle;
            this.f7440n = abstractC27421b;
            this.f7443q = abstractC27421b2;
            abstractC27421b.m140448q(i11, this);
        }

        @Override // p564v1.AbstractC27421b.a
        /* renamed from: a */
        public void mo9426a(AbstractC27421b abstractC27421b, Object obj) {
            if (C1810b.f7435c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLoadComplete: ");
                sb2.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo9224q(obj);
            } else {
                boolean z11 = C1810b.f7435c;
                mo9221n(obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: l */
        public void mo181l() {
            if (C1810b.f7435c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Starting: ");
                sb2.append(this);
            }
            this.f7440n.m140451t();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: m */
        public void mo182m() {
            if (C1810b.f7435c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Stopping: ");
                sb2.append(this);
            }
            this.f7440n.m140452u();
        }

        @Override // androidx.lifecycle.LiveData
        /* renamed from: o */
        public void mo9222o(InterfaceC1764d0 interfaceC1764d0) {
            super.mo9222o(interfaceC1764d0);
            this.f7441o = null;
            this.f7442p = null;
        }

        @Override // androidx.lifecycle.C1761c0, androidx.lifecycle.LiveData
        /* renamed from: q */
        public void mo9224q(Object obj) {
            super.mo9224q(obj);
            AbstractC27421b abstractC27421b = this.f7443q;
            if (abstractC27421b != null) {
                abstractC27421b.m140449r();
                this.f7443q = null;
            }
        }

        /* renamed from: r */
        AbstractC27421b m9427r(boolean z11) {
            if (C1810b.f7435c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Destroying: ");
                sb2.append(this);
            }
            this.f7440n.m140437b();
            this.f7440n.m140436a();
            b bVar = this.f7442p;
            if (bVar != null) {
                mo9222o(bVar);
                if (z11) {
                    bVar.m9434c();
                }
            }
            this.f7440n.m140453v(this);
            if ((bVar != null && !bVar.m9433b()) || z11) {
                this.f7440n.m140449r();
                return this.f7443q;
            }
            return this.f7440n;
        }

        /* renamed from: s */
        public void m9428s(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f7438l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f7439m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f7440n);
            this.f7440n.mo140425g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f7442p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f7442p);
                this.f7442p.m9432a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m9429t().m140439d(mo9215f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m9217h());
        }

        /* renamed from: t */
        AbstractC27421b m9429t() {
            return this.f7440n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f7438l);
            sb2.append(" : ");
            AbstractC1480b.m7473a(this.f7440n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }

        /* renamed from: u */
        void m9430u() {
            InterfaceC1801w interfaceC1801w = this.f7441o;
            b bVar = this.f7442p;
            if (interfaceC1801w != null && bVar != null) {
                super.mo9222o(bVar);
                m9219j(interfaceC1801w, bVar);
            }
        }

        /* renamed from: v */
        AbstractC27421b m9431v(InterfaceC1801w interfaceC1801w, AbstractC1809a.a aVar) {
            b bVar = new b(this.f7440n, aVar);
            m9219j(interfaceC1801w, bVar);
            InterfaceC1764d0 interfaceC1764d0 = this.f7442p;
            if (interfaceC1764d0 != null) {
                mo9222o(interfaceC1764d0);
            }
            this.f7441o = interfaceC1801w;
            this.f7442p = bVar;
            return this.f7440n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC1764d0 {

        /* renamed from: p */
        private final AbstractC27421b f7444p;

        /* renamed from: q */
        private final AbstractC1809a.a f7445q;

        /* renamed from: r */
        private boolean f7446r = false;

        b(AbstractC27421b abstractC27421b, AbstractC1809a.a aVar) {
            this.f7444p = abstractC27421b;
            this.f7445q = aVar;
        }

        /* renamed from: a */
        public void m9432a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f7446r);
        }

        /* renamed from: b */
        boolean m9433b() {
            return this.f7446r;
        }

        /* renamed from: c */
        void m9434c() {
            if (this.f7446r) {
                if (C1810b.f7435c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Resetting: ");
                    sb2.append(this.f7444p);
                }
                this.f7445q.mo9424c(this.f7444p);
            }
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public void mo8524qp(Object obj) {
            if (C1810b.f7435c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  onLoadFinished in ");
                sb2.append(this.f7444p);
                sb2.append(": ");
                sb2.append(this.f7444p.m140439d(obj));
            }
            this.f7445q.mo9422a(this.f7444p, obj);
            this.f7446r = true;
        }

        public String toString() {
            return this.f7445q.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.loader.app.b$c */
    /* loaded from: classes2.dex */
    public static class c extends AbstractC1796t0 {

        /* renamed from: u */
        private static final C1802w0.b f7447u = new a();

        /* renamed from: s */
        private C30246h f7448s = new C30246h();

        /* renamed from: t */
        private boolean f7449t = false;

        /* renamed from: androidx.loader.app.b$c$a */
        /* loaded from: classes2.dex */
        static class a implements C1802w0.b {
            a() {
            }

            @Override // androidx.lifecycle.C1802w0.b
            /* renamed from: a */
            public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
                return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
            }

            @Override // androidx.lifecycle.C1802w0.b
            /* renamed from: b */
            public AbstractC1796t0 mo1196b(Class cls) {
                return new c();
            }
        }

        c() {
        }

        /* renamed from: O */
        static c m9435O(C1808z0 c1808z0) {
            return (c) new C1802w0(c1808z0, f7447u).m9378a(c.class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC1796t0
        /* renamed from: J */
        public void mo9130J() {
            super.mo9130J();
            int m149179m = this.f7448s.m149179m();
            for (int i11 = 0; i11 < m149179m; i11++) {
                ((a) this.f7448s.m149180n(i11)).m9427r(true);
            }
            this.f7448s.m149170b();
        }

        /* renamed from: M */
        public void m9436M(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f7448s.m149179m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i11 = 0; i11 < this.f7448s.m149179m(); i11++) {
                    a aVar = (a) this.f7448s.m149180n(i11);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f7448s.m149176j(i11));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.m9428s(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* renamed from: N */
        void m9437N() {
            this.f7449t = false;
        }

        /* renamed from: P */
        a m9438P(int i11) {
            return (a) this.f7448s.m149172f(i11);
        }

        /* renamed from: Q */
        boolean m9439Q() {
            return this.f7449t;
        }

        /* renamed from: R */
        void m9440R() {
            int m149179m = this.f7448s.m149179m();
            for (int i11 = 0; i11 < m149179m; i11++) {
                ((a) this.f7448s.m149180n(i11)).m9430u();
            }
        }

        /* renamed from: S */
        void m9441S(int i11, a aVar) {
            this.f7448s.m149177k(i11, aVar);
        }

        /* renamed from: T */
        void m9442T() {
            this.f7449t = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1810b(InterfaceC1801w interfaceC1801w, C1808z0 c1808z0) {
        this.f7436a = interfaceC1801w;
        this.f7437b = c.m9435O(c1808z0);
    }

    /* renamed from: e */
    private AbstractC27421b m9425e(int i11, Bundle bundle, AbstractC1809a.a aVar, AbstractC27421b abstractC27421b) {
        try {
            this.f7437b.m9442T();
            AbstractC27421b mo9423b = aVar.mo9423b(i11, bundle);
            if (mo9423b != null) {
                if (mo9423b.getClass().isMemberClass() && !Modifier.isStatic(mo9423b.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + mo9423b);
                }
                a aVar2 = new a(i11, bundle, mo9423b, abstractC27421b);
                if (f7435c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(aVar2);
                }
                this.f7437b.m9441S(i11, aVar2);
                this.f7437b.m9437N();
                return aVar2.m9431v(this.f7436a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f7437b.m9437N();
            throw th2;
        }
    }

    @Override // androidx.loader.app.AbstractC1809a
    /* renamed from: a */
    public void mo9419a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7437b.m9436M(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC1809a
    /* renamed from: c */
    public AbstractC27421b mo9420c(int i11, Bundle bundle, AbstractC1809a.a aVar) {
        if (!this.f7437b.m9439Q()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a m9438P = this.f7437b.m9438P(i11);
                if (f7435c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("initLoader in ");
                    sb2.append(this);
                    sb2.append(": args=");
                    sb2.append(bundle);
                }
                if (m9438P == null) {
                    return m9425e(i11, bundle, aVar, null);
                }
                if (f7435c) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("  Re-using existing loader ");
                    sb3.append(m9438P);
                }
                return m9438P.m9431v(this.f7436a, aVar);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // androidx.loader.app.AbstractC1809a
    /* renamed from: d */
    public void mo9421d() {
        this.f7437b.m9440R();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        AbstractC1480b.m7473a(this.f7436a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
