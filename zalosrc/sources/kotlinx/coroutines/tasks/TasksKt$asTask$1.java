package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.RuntimeExecutionException;
import en0.InterfaceC18505l;
import fn0.AbstractC19075u;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Deferred;
import p342m6.C22872b;
import p342m6.C22890k;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final class TasksKt$asTask$1 extends AbstractC19075u implements InterfaceC18505l {

    /* renamed from: q */
    final /* synthetic */ C22872b f107620q;

    /* renamed from: r */
    final /* synthetic */ Deferred f107621r;

    /* renamed from: s */
    final /* synthetic */ C22890k f107622s;

    /* renamed from: a */
    public final void m113943a(Throwable th2) {
        Exception exc;
        if (th2 instanceof CancellationException) {
            this.f107620q.m117561a();
            return;
        }
        Throwable mo112661t = this.f107621r.mo112661t();
        if (mo112661t == null) {
            this.f107622s.m117596c(this.f107621r.mo112599r());
            return;
        }
        C22890k c22890k = this.f107622s;
        if (mo112661t instanceof Exception) {
            exc = (Exception) mo112661t;
        } else {
            exc = null;
        }
        if (exc == null) {
            exc = new RuntimeExecutionException(mo112661t);
        }
        c22890k.m117595b(exc);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: i9 */
    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
        m113943a((Throwable) obj);
        return C24848g0.f119245a;
    }
}
