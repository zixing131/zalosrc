package p183g8;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p153f8.C18821f;

/* renamed from: g8.c */
/* loaded from: classes.dex */
public class C19293c implements InterfaceC19292b, InterfaceC19291a {

    /* renamed from: a */
    private final C19295e f95802a;

    /* renamed from: b */
    private final int f95803b;

    /* renamed from: c */
    private final TimeUnit f95804c;

    /* renamed from: e */
    private CountDownLatch f95806e;

    /* renamed from: d */
    private final Object f95805d = new Object();

    /* renamed from: f */
    private boolean f95807f = false;

    public C19293c(C19295e c19295e, int i11, TimeUnit timeUnit) {
        this.f95802a = c19295e;
        this.f95803b = i11;
        this.f95804c = timeUnit;
    }

    @Override // p183g8.InterfaceC19292b
    /* renamed from: R */
    public void mo101007R(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f95806e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // p183g8.InterfaceC19291a
    /* renamed from: a */
    public void mo97167a(String str, Bundle bundle) {
        synchronized (this.f95805d) {
            try {
                C18821f.m98795f().m98802i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f95806e = new CountDownLatch(1);
                this.f95807f = false;
                this.f95802a.mo97167a(str, bundle);
                C18821f.m98795f().m98802i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f95806e.await(this.f95803b, this.f95804c)) {
                        this.f95807f = true;
                        C18821f.m98795f().m98802i("App exception callback received from Analytics listener.");
                    } else {
                        C18821f.m98795f().m98804k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    C18821f.m98795f().m98798d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f95806e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
