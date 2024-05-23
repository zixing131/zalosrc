package androidx.lifecycle;

import fn0.AbstractC19074t;
import java.io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;
import um0.InterfaceC27315f;

/* renamed from: androidx.lifecycle.d */
/* loaded from: classes2.dex */
public final class C1763d implements Closeable, CoroutineScope {

    /* renamed from: p */
    private final InterfaceC27315f f7305p;

    public C1763d(InterfaceC27315f interfaceC27315f) {
        AbstractC19074t.m100208f(interfaceC27315f, "context");
        this.f7305p = interfaceC27315f;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: O */
    public InterfaceC27315f mo9207O() {
        return this.f7305p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JobKt__JobKt.m112765d(mo9207O(), null, 1, null);
    }
}
