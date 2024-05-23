package p051c7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p152f7.InterfaceC18798a;

/* renamed from: c7.s */
/* loaded from: classes.dex */
public abstract class AbstractC3324s {

    /* renamed from: a */
    protected final C3325t f14136a;

    /* renamed from: b */
    private final IntentFilter f14137b;

    /* renamed from: c */
    private final Context f14138c;

    /* renamed from: d */
    protected final Set f14139d = new HashSet();

    /* renamed from: e */
    private C3322q f14140e = null;

    /* renamed from: f */
    private volatile boolean f14141f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3324s(C3325t c3325t, IntentFilter intentFilter, Context context) {
        this.f14136a = c3325t;
        this.f14137b = intentFilter;
        this.f14138c = AbstractC3311f0.m16779a(context);
    }

    /* renamed from: e */
    private final void m16791e() {
        C3322q c3322q;
        if (!this.f14139d.isEmpty() && this.f14140e == null) {
            C3322q c3322q2 = new C3322q(this, null);
            this.f14140e = c3322q2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f14138c.registerReceiver(c3322q2, this.f14137b, 2);
            } else {
                this.f14138c.registerReceiver(c3322q2, this.f14137b);
            }
        }
        if (this.f14139d.isEmpty() && (c3322q = this.f14140e) != null) {
            this.f14138c.unregisterReceiver(c3322q);
            this.f14140e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16792a(Context context, Intent intent);

    /* renamed from: b */
    public final synchronized void m16793b(InterfaceC18798a interfaceC18798a) {
        this.f14136a.m16800d("registerListener", new Object[0]);
        AbstractC3306d.m16753a(interfaceC18798a, "Registered Play Core listener should not be null.");
        this.f14139d.add(interfaceC18798a);
        m16791e();
    }

    /* renamed from: c */
    public final synchronized void m16794c(InterfaceC18798a interfaceC18798a) {
        this.f14136a.m16800d("unregisterListener", new Object[0]);
        AbstractC3306d.m16753a(interfaceC18798a, "Unregistered Play Core listener should not be null.");
        this.f14139d.remove(interfaceC18798a);
        m16791e();
    }

    /* renamed from: d */
    public final synchronized void m16795d(Object obj) {
        Iterator it = new HashSet(this.f14139d).iterator();
        while (it.hasNext()) {
            ((InterfaceC18798a) it.next()).mo33367a(obj);
        }
    }
}
