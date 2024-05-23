package p234ia;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import p052c8.C3339c;
import p052c8.C3344g;
import p052c8.C3352o;
import p342m6.AbstractC22892l;

/* renamed from: ia.i */
/* loaded from: classes.dex */
public class C20464i {

    /* renamed from: b */
    private static final Object f100667b = new Object();

    /* renamed from: c */
    private static C20464i f100668c;

    /* renamed from: a */
    private C3352o f100669a;

    private C20464i() {
    }

    /* renamed from: c */
    public static C20464i m106493c() {
        boolean z11;
        C20464i c20464i;
        synchronized (f100667b) {
            if (f100668c != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19727p(z11, "MlKitContext has not been initialized");
            c20464i = (C20464i) AbstractC4205o.m19722k(f100668c);
        }
        return c20464i;
    }

    /* renamed from: d */
    public static C20464i m106494d(Context context) {
        boolean z11;
        C20464i c20464i;
        synchronized (f100667b) {
            if (f100668c == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19727p(z11, "MlKitContext is already initialized");
            C20464i c20464i2 = new C20464i();
            f100668c = c20464i2;
            Context m106495e = m106495e(context);
            C3352o m16891e = C3352o.m16874m(AbstractC22892l.f111514a).m16890d(C3344g.m16863c(m106495e, MlKitComponentDiscoveryService.class).m16866b()).m16888b(C3339c.m16827s(m106495e, Context.class, new Class[0])).m16888b(C3339c.m16827s(c20464i2, C20464i.class, new Class[0])).m16891e();
            c20464i2.f100669a = m16891e;
            m16891e.m16885p(true);
            c20464i = f100668c;
        }
        return c20464i;
    }

    /* renamed from: e */
    private static Context m106495e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    /* renamed from: a */
    public Object m106496a(Class cls) {
        boolean z11;
        if (f100668c == this) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19727p(z11, "MlKitContext has been deleted");
        AbstractC4205o.m19722k(this.f100669a);
        return this.f100669a.mo16847a(cls);
    }

    /* renamed from: b */
    public Context m106497b() {
        return (Context) m106496a(Context.class);
    }
}
