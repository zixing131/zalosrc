package p182g7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: g7.n */
/* loaded from: classes3.dex */
public final class C19272n extends AbstractRunnableC19268j {

    /* renamed from: q */
    final /* synthetic */ C19278t f95768q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19272n(C19278t c19278t) {
        this.f95768q = c19278t;
    }

    @Override // p182g7.AbstractRunnableC19268j
    /* renamed from: a */
    public final void mo33379a() {
        IInterface iInterface;
        C19267i c19267i;
        Context context;
        ServiceConnection serviceConnection;
        C19278t c19278t = this.f95768q;
        iInterface = c19278t.f95786m;
        if (iInterface != null) {
            c19267i = c19278t.f95775b;
            c19267i.m100981d("Unbind from service.", new Object[0]);
            C19278t c19278t2 = this.f95768q;
            context = c19278t2.f95774a;
            serviceConnection = c19278t2.f95785l;
            context.unbindService(serviceConnection);
            this.f95768q.f95780g = false;
            this.f95768q.f95786m = null;
            this.f95768q.f95785l = null;
        }
        this.f95768q.m100999t();
    }
}
