package kotlinx.coroutines.android;

import android.os.Handler;
import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class HandlerContext$scheduleResumeAfterDelay$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ HandlerContext f105967q;

    /* renamed from: r */
    final /* synthetic */ Runnable f105968r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerContext$scheduleResumeAfterDelay$1(HandlerContext handlerContext, Runnable runnable) {
        super(1);
        this.f105967q = handlerContext;
        this.f105968r = runnable;
    }

    /* renamed from: a */
    public final void m112892a(Throwable th2) {
        Handler handler;
        handler = this.f105967q.f105961r;
        handler.removeCallbacks(this.f105968r);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m112892a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
