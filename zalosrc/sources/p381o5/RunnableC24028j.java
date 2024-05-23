package p381o5;

import p229i5.C20288i;

/* renamed from: o5.j */
/* loaded from: classes2.dex */
final class RunnableC24028j implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C24030l f116336p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC24028j(C24030l c24030l, AbstractC24027i abstractC24027i) {
        this.f116336p = c24030l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long m125907a = this.f116336p.m125907a();
        if (m125907a != -1 && C20288i.m105926d().mo105913a() > m125907a) {
            C24030l.m125904f(C24030l.m125902b(this.f116336p));
        }
    }
}
