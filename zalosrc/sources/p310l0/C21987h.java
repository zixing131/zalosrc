package p310l0;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1617x0;
import androidx.core.view.C1611v0;
import androidx.core.view.InterfaceC1614w0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l0.h */
/* loaded from: classes2.dex */
public class C21987h {

    /* renamed from: c */
    private Interpolator f108302c;

    /* renamed from: d */
    InterfaceC1614w0 f108303d;

    /* renamed from: e */
    private boolean f108304e;

    /* renamed from: b */
    private long f108301b = -1;

    /* renamed from: f */
    private final AbstractC1617x0 f108305f = new a();

    /* renamed from: a */
    final ArrayList f108300a = new ArrayList();

    /* renamed from: l0.h$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC1617x0 {

        /* renamed from: a */
        private boolean f108306a = false;

        /* renamed from: b */
        private int f108307b = 0;

        a() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            int i11 = this.f108307b + 1;
            this.f108307b = i11;
            if (i11 == C21987h.this.f108300a.size()) {
                InterfaceC1614w0 interfaceC1614w0 = C21987h.this.f108303d;
                if (interfaceC1614w0 != null) {
                    interfaceC1614w0.mo4848b(null);
                }
                m114825d();
            }
        }

        @Override // androidx.core.view.AbstractC1617x0, androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            if (this.f108306a) {
                return;
            }
            this.f108306a = true;
            InterfaceC1614w0 interfaceC1614w0 = C21987h.this.f108303d;
            if (interfaceC1614w0 != null) {
                interfaceC1614w0.mo4849c(null);
            }
        }

        /* renamed from: d */
        void m114825d() {
            this.f108307b = 0;
            this.f108306a = false;
            C21987h.this.m114818b();
        }
    }

    /* renamed from: a */
    public void m114817a() {
        if (!this.f108304e) {
            return;
        }
        Iterator it = this.f108300a.iterator();
        while (it.hasNext()) {
            ((C1611v0) it.next()).m8216c();
        }
        this.f108304e = false;
    }

    /* renamed from: b */
    void m114818b() {
        this.f108304e = false;
    }

    /* renamed from: c */
    public C21987h m114819c(C1611v0 c1611v0) {
        if (!this.f108304e) {
            this.f108300a.add(c1611v0);
        }
        return this;
    }

    /* renamed from: d */
    public C21987h m114820d(C1611v0 c1611v0, C1611v0 c1611v02) {
        this.f108300a.add(c1611v0);
        c1611v02.m8223l(c1611v0.m8217d());
        this.f108300a.add(c1611v02);
        return this;
    }

    /* renamed from: e */
    public C21987h m114821e(long j11) {
        if (!this.f108304e) {
            this.f108301b = j11;
        }
        return this;
    }

    /* renamed from: f */
    public C21987h m114822f(Interpolator interpolator) {
        if (!this.f108304e) {
            this.f108302c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C21987h m114823g(InterfaceC1614w0 interfaceC1614w0) {
        if (!this.f108304e) {
            this.f108303d = interfaceC1614w0;
        }
        return this;
    }

    /* renamed from: h */
    public void m114824h() {
        if (this.f108304e) {
            return;
        }
        Iterator it = this.f108300a.iterator();
        while (it.hasNext()) {
            C1611v0 c1611v0 = (C1611v0) it.next();
            long j11 = this.f108301b;
            if (j11 >= 0) {
                c1611v0.m8220h(j11);
            }
            Interpolator interpolator = this.f108302c;
            if (interpolator != null) {
                c1611v0.m8221i(interpolator);
            }
            if (this.f108303d != null) {
                c1611v0.m8222j(this.f108305f);
            }
            c1611v0.m8225n();
        }
        this.f108304e = true;
    }
}
