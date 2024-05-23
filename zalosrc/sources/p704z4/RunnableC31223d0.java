package p704z4;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z4.d0 */
/* loaded from: classes2.dex */
public final class RunnableC31223d0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ BinderC31229g0 f144246p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC31223d0(BinderC31229g0 binderC31229g0) {
        this.f144246p = binderC31229g0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC31227f0 interfaceC31227f0;
        interfaceC31227f0 = this.f144246p.f144256v;
        interfaceC31227f0.mo19555c(new ConnectionResult(4));
    }
}
