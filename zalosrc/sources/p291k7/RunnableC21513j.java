package p291k7;

import java.util.List;
import p258j7.InterfaceC20949f0;

/* renamed from: k7.j */
/* loaded from: classes3.dex */
final class RunnableC21513j implements Runnable {

    /* renamed from: p */
    final /* synthetic */ List f104547p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC20949f0 f104548q;

    /* renamed from: r */
    final /* synthetic */ C21516k f104549r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC21513j(C21516k c21516k, List list, InterfaceC20949f0 interfaceC20949f0) {
        this.f104549r = c21516k;
        this.f104547p = list;
        this.f104548q = interfaceC20949f0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C21525n c21525n;
        try {
            c21525n = this.f104549r.f104553c;
            if (c21525n.m111180b(this.f104547p)) {
                C21516k.m111166d(this.f104549r, this.f104548q);
            } else {
                C21516k.m111165c(this.f104549r, this.f104547p, this.f104548q);
            }
        } catch (Exception unused) {
            this.f104548q.zzb(-11);
        }
    }
}
