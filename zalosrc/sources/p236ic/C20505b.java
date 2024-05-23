package p236ic;

import fn0.AbstractC19074t;
import java.io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;
import um0.InterfaceC27315f;

/* renamed from: ic.b */
/* loaded from: classes3.dex */
public final class C20505b implements Closeable, CoroutineScope {

    /* renamed from: p */
    private final InterfaceC27315f f100766p;

    public C20505b(InterfaceC27315f interfaceC27315f) {
        AbstractC19074t.m100208f(interfaceC27315f, "context");
        this.f100766p = interfaceC27315f;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: O */
    public InterfaceC27315f mo9207O() {
        return this.f100766p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m112765d(mo9207O(), null, 1, null);
    }
}
