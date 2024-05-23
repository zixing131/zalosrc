package rh0;

import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rh0.f */
/* loaded from: classes.dex */
public class C25798f {

    /* renamed from: e */
    private static volatile C25798f f123016e;

    /* renamed from: b */
    private C25796d f123018b;

    /* renamed from: c */
    private AbstractC25797e f123019c;

    /* renamed from: a */
    private final List f123017a = Collections.synchronizedList(new ArrayList());

    /* renamed from: d */
    private int f123020d = 0;

    /* renamed from: c */
    public static synchronized C25798f m132949c() {
        C25798f c25798f;
        synchronized (C25798f.class) {
            try {
                if (f123016e == null) {
                    synchronized (C25798f.class) {
                        try {
                            if (f123016e == null) {
                                f123016e = new C25798f();
                            }
                        } finally {
                        }
                    }
                }
                c25798f = f123016e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c25798f;
    }

    /* renamed from: f */
    private String m132950f() {
        StringBuilder sb2 = new StringBuilder();
        try {
            C25796d c25796d = this.f123018b;
            if (c25796d != null) {
                sb2.append(c25796d.m132943f());
                AbstractC25797e abstractC25797e = this.f123018b;
                while (abstractC25797e != null) {
                    if (!abstractC25797e.m132946c()) {
                        break;
                    }
                    abstractC25797e = abstractC25797e.m132944a();
                    sb2.append(abstractC25797e.m132945b());
                    sb2.append(" -> ");
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public void m132951a(boolean z11) {
        try {
            C25796d c25796d = this.f123018b;
            if (c25796d != null) {
                c25796d.m132948e(System.currentTimeMillis());
            }
            if (z11) {
                this.f123019c = null;
            }
            this.f123018b = null;
            this.f123020d = 0;
        } catch (Exception e11) {
            AbstractC20110a.m104538g(e11.toString(), new Object[0]);
        }
    }

    /* renamed from: b */
    public C25796d m132952b() {
        return this.f123018b;
    }

    /* renamed from: d */
    public boolean m132953d() {
        return this.f123018b != null;
    }

    /* renamed from: e */
    public void m132954e(int i11) {
        try {
            C25796d c25796d = this.f123018b;
            if (c25796d != null) {
                c25796d.m132948e(System.currentTimeMillis());
            }
            C25796d c25796d2 = new C25796d(i11);
            this.f123018b = c25796d2;
            c25796d2.m132947d(new C25793a());
            this.f123017a.add(this.f123018b);
            this.f123020d++;
            AbstractC20110a.m104535d("Session chain: " + m132950f() + "\n", new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
