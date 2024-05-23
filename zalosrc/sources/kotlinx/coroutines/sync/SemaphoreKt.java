package kotlinx.coroutines.sync;

import en0.InterfaceC18494a;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class SemaphoreKt {

    /* renamed from: a */
    private static final int f107606a;

    /* renamed from: b */
    private static final Symbol f107607b;

    /* renamed from: c */
    private static final Symbol f107608c;

    /* renamed from: d */
    private static final Symbol f107609d;

    /* renamed from: e */
    private static final Symbol f107610e;

    /* renamed from: f */
    private static final int f107611f;

    static {
        int m113727e;
        int m113727e2;
        m113727e = SystemPropsKt__SystemProps_commonKt.m113727e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f107606a = m113727e;
        f107607b = new Symbol("PERMIT");
        f107608c = new Symbol("TAKEN");
        f107609d = new Symbol("BROKEN");
        f107610e = new Symbol("CANCELLED");
        m113727e2 = SystemPropsKt__SystemProps_commonKt.m113727e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f107611f = m113727e2;
    }

    /* renamed from: a */
    public static final Semaphore m113930a(int i11, int i12) {
        return new SemaphoreImpl(i11, i12);
    }

    /* renamed from: b */
    public static /* synthetic */ Semaphore m113931b(int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return m113930a(i11, i12);
    }

    /* renamed from: j */
    public static final SemaphoreSegment m113939j(long j11, SemaphoreSegment semaphoreSegment) {
        return new SemaphoreSegment(j11, semaphoreSegment, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113940k(Semaphore semaphore, InterfaceC18494a interfaceC18494a, Continuation continuation) {
        SemaphoreKt$withPermit$1 semaphoreKt$withPermit$1;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof SemaphoreKt$withPermit$1) {
                semaphoreKt$withPermit$1 = (SemaphoreKt$withPermit$1) continuation;
                int i12 = semaphoreKt$withPermit$1.f107615v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    semaphoreKt$withPermit$1.f107615v = i12 - Integer.MIN_VALUE;
                    Object obj = semaphoreKt$withPermit$1.f107614u;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = semaphoreKt$withPermit$1.f107615v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            interfaceC18494a = (InterfaceC18494a) semaphoreKt$withPermit$1.f107613t;
                            semaphore = (Semaphore) semaphoreKt$withPermit$1.f107612s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        semaphoreKt$withPermit$1.f107612s = semaphore;
                        semaphoreKt$withPermit$1.f107613t = interfaceC18494a;
                        semaphoreKt$withPermit$1.f107615v = 1;
                        if (semaphore.mo113914a(semaphoreKt$withPermit$1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return interfaceC18494a.mo12V4();
                }
            }
            return interfaceC18494a.mo12V4();
        } finally {
            AbstractC19072r.m100201b(1);
            semaphore.release();
            AbstractC19072r.m100200a(1);
        }
        semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1(continuation);
        Object obj2 = semaphoreKt$withPermit$1.f107614u;
        m142578e = AbstractC28298d.m142578e();
        i11 = semaphoreKt$withPermit$1.f107615v;
        if (i11 == 0) {
        }
    }
}
