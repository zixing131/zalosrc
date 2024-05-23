package p258j7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p291k7.AbstractC21530o1;
import p291k7.C21536q1;

/* renamed from: j7.x0 */
/* loaded from: classes.dex */
public final class C20985x0 extends AbstractC21530o1 {

    /* renamed from: j */
    private static C20985x0 f102906j;

    /* renamed from: g */
    private final Handler f102907g;

    /* renamed from: h */
    private final InterfaceC20951g0 f102908h;

    /* renamed from: i */
    private final Set f102909i;

    public C20985x0(Context context, InterfaceC20951g0 interfaceC20951g0) {
        super(new C21536q1("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f102907g = new Handler(Looper.getMainLooper());
        this.f102909i = new LinkedHashSet();
        this.f102908h = interfaceC20951g0;
    }

    /* renamed from: g */
    public static synchronized C20985x0 m109538g(Context context) {
        C20985x0 c20985x0;
        synchronized (C20985x0.class) {
            try {
                if (f102906j == null) {
                    f102906j = new C20985x0(context, EnumC20967o0.INSTANCE);
                }
                c20985x0 = f102906j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20985x0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p291k7.AbstractC21530o1
    /* renamed from: a */
    public final void mo109540a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        AbstractC20944d m109478n = AbstractC20944d.m109478n(bundleExtra);
        this.f104566a.m111194a("ListenerRegistryBroadcastReceiver.onReceive: %s", m109478n);
        InterfaceC20953h0 zza = this.f102908h.zza();
        if (m109478n.mo109486i() == 3 && zza != null) {
            zza.mo109495a(m109478n.mo109490m(), new C20981v0(this, m109478n, intent, context));
        } else {
            m109541i(m109478n);
        }
    }

    /* renamed from: i */
    public final synchronized void m109541i(AbstractC20944d abstractC20944d) {
        try {
            Iterator it = new LinkedHashSet(this.f102909i).iterator();
            while (it.hasNext()) {
                ((InterfaceC20946e) it.next()).mo33367a(abstractC20944d);
            }
            super.m111185d(abstractC20944d);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
