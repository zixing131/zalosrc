package p182g7;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* renamed from: g7.p */
/* loaded from: classes3.dex */
final class C19274p extends AbstractRunnableC19268j {

    /* renamed from: q */
    final /* synthetic */ IBinder f95769q;

    /* renamed from: r */
    final /* synthetic */ ServiceConnectionC19277s f95770r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19274p(ServiceConnectionC19277s serviceConnectionC19277s, IBinder iBinder) {
        this.f95770r = serviceConnectionC19277s;
        this.f95769q = iBinder;
    }

    @Override // p182g7.AbstractRunnableC19268j
    /* renamed from: a */
    public final void mo33379a() {
        List list;
        List list2;
        this.f95770r.f95772p.f95786m = AbstractBinderC19263e.m100976N(this.f95769q);
        C19278t.m100996n(this.f95770r.f95772p);
        this.f95770r.f95772p.f95780g = false;
        list = this.f95770r.f95772p.f95777d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f95770r.f95772p.f95777d;
        list2.clear();
    }
}
