package p051c7;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* renamed from: c7.a0 */
/* loaded from: classes3.dex */
final class C3301a0 extends AbstractRunnableC3326u {

    /* renamed from: q */
    final /* synthetic */ IBinder f14107q;

    /* renamed from: r */
    final /* synthetic */ ServiceConnectionC3307d0 f14108r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3301a0(ServiceConnectionC3307d0 serviceConnectionC3307d0, IBinder iBinder) {
        this.f14108r = serviceConnectionC3307d0;
        this.f14107q = iBinder;
    }

    @Override // p051c7.AbstractRunnableC3326u
    /* renamed from: a */
    public final void mo16750a() {
        List list;
        List list2;
        this.f14108r.f14111p.f14128m = AbstractBinderC3316k.m16786N(this.f14107q);
        C3309e0.m16769q(this.f14108r.f14111p);
        this.f14108r.f14111p.f14122g = false;
        list = this.f14108r.f14111p.f14119d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f14108r.f14111p.f14119d;
        list2.clear();
    }
}
