package p291k7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p152f7.InterfaceC18798a;

/* renamed from: k7.o1 */
/* loaded from: classes.dex */
public abstract class AbstractC21530o1 {

    /* renamed from: a */
    protected final C21536q1 f104566a;

    /* renamed from: b */
    private final IntentFilter f104567b;

    /* renamed from: c */
    private final Context f104568c;

    /* renamed from: d */
    protected final Set f104569d = new HashSet();

    /* renamed from: e */
    private C21527n1 f104570e = null;

    /* renamed from: f */
    private volatile boolean f104571f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC21530o1(C21536q1 c21536q1, IntentFilter intentFilter, Context context) {
        this.f104566a = c21536q1;
        this.f104567b = intentFilter;
        this.f104568c = AbstractC21532p0.m111187a(context);
    }

    /* renamed from: e */
    private final void m111182e() {
        C21527n1 c21527n1;
        if ((this.f104571f || !this.f104569d.isEmpty()) && this.f104570e == null) {
            C21527n1 c21527n12 = new C21527n1(this, null);
            this.f104570e = c21527n12;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f104568c.registerReceiver(c21527n12, this.f104567b, 2);
            } else {
                this.f104568c.registerReceiver(c21527n12, this.f104567b);
            }
        }
        if (!this.f104571f && this.f104569d.isEmpty() && (c21527n1 = this.f104570e) != null) {
            this.f104568c.unregisterReceiver(c21527n1);
            this.f104570e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo109540a(Context context, Intent intent);

    /* renamed from: b */
    public final synchronized void m111183b(InterfaceC18798a interfaceC18798a) {
        this.f104566a.m111197d("registerListener", new Object[0]);
        AbstractC21544t0.m111204a(interfaceC18798a, "Registered Play Core listener should not be null.");
        this.f104569d.add(interfaceC18798a);
        m111182e();
    }

    /* renamed from: c */
    public final synchronized void m111184c(boolean z11) {
        this.f104571f = true;
        m111182e();
    }

    /* renamed from: d */
    public final synchronized void m111185d(Object obj) {
        Iterator it = new HashSet(this.f104569d).iterator();
        while (it.hasNext()) {
            ((InterfaceC18798a) it.next()).mo33367a(obj);
        }
    }
}
