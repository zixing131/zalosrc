package p537u4;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC4073c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p564v1.AbstractC27420a;
import p704z4.InterfaceC31232i;

/* renamed from: u4.d */
/* loaded from: classes2.dex */
public final class C27011d extends AbstractC27420a implements InterfaceC31232i {

    /* renamed from: o */
    private Semaphore f127659o;

    /* renamed from: p */
    private Set f127660p;

    public C27011d(Context context, Set set) {
        super(context);
        this.f127659o = new Semaphore(0);
        this.f127660p = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p564v1.AbstractC27420a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Void mo139156A() {
        Iterator it = this.f127660p.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((AbstractC4073c) it.next()).mo19263l(this)) {
                i11++;
            }
        }
        try {
            this.f127659o.tryAcquire(i11, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p564v1.AbstractC27421b
    /* renamed from: o */
    protected final void mo139157o() {
        this.f127659o.drainPermits();
        m140442h();
    }

    @Override // p704z4.InterfaceC31232i
    /* renamed from: p2 */
    public final void mo139158p2() {
        this.f127659o.release();
    }
}
