package kotlinx.coroutines.sync;

import en0.InterfaceC18509p;
import fn0.C19071q;

/* loaded from: classes7.dex */
/* synthetic */ class SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 extends C19071q implements InterfaceC18509p {

    /* renamed from: y */
    public static final SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 f107605y = new SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1();

    SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    /* renamed from: h */
    public final SemaphoreSegment m113929h(long j11, SemaphoreSegment semaphoreSegment) {
        SemaphoreSegment m113939j;
        m113939j = SemaphoreKt.m113939j(j11, semaphoreSegment);
        return m113939j;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m113929h(((Number) obj).longValue(), (SemaphoreSegment) obj2);
    }
}
