package p291k7;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* renamed from: k7.c */
/* loaded from: classes3.dex */
final class C21492c extends AbstractRunnableC21539r1 {

    /* renamed from: q */
    final /* synthetic */ IBinder f104523q;

    /* renamed from: r */
    final /* synthetic */ ServiceConnectionC21501f f104524r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21492c(ServiceConnectionC21501f serviceConnectionC21501f, IBinder iBinder) {
        this.f104524r = serviceConnectionC21501f;
        this.f104523q = iBinder;
    }

    @Override // p291k7.AbstractRunnableC21539r1
    /* renamed from: c */
    public final void mo109504c() {
        List list;
        List list2;
        this.f104524r.f104528p.f104542m = AbstractBinderC21520l0.m111174N(this.f104523q);
        C21504g.m111144q(this.f104524r.f104528p);
        this.f104524r.f104528p.f104536g = false;
        list = this.f104524r.f104528p.f104533d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f104524r.f104528p.f104533d;
        list2.clear();
    }
}
