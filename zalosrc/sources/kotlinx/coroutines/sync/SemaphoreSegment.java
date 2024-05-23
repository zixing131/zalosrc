package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class SemaphoreSegment extends Segment<SemaphoreSegment> {

    /* renamed from: t */
    private final AtomicReferenceArray f107616t;

    public SemaphoreSegment(long j11, SemaphoreSegment semaphoreSegment, int i11) {
        super(j11, semaphoreSegment, i11);
        int i12;
        i12 = SemaphoreKt.f107611f;
        this.f107616t = new AtomicReferenceArray(i12);
    }

    @Override // kotlinx.coroutines.internal.Segment
    /* renamed from: n */
    public int mo113097n() {
        int i11;
        i11 = SemaphoreKt.f107611f;
        return i11;
    }

    @Override // kotlinx.coroutines.internal.Segment
    /* renamed from: o */
    public void mo113098o(int i11, Throwable th2, InterfaceC27315f interfaceC27315f) {
        Symbol symbol;
        symbol = SemaphoreKt.f107610e;
        m113941r().set(i11, symbol);
        m113703p();
    }

    /* renamed from: r */
    public final AtomicReferenceArray m113941r() {
        return this.f107616t;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f107415r + ", hashCode=" + hashCode() + ']';
    }
}
