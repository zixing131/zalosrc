package kotlinx.coroutines.sync;

import en0.InterfaceC18494a;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class MutexKt {

    /* renamed from: a */
    private static final Symbol f107589a = new Symbol("NO_OWNER");

    /* renamed from: b */
    private static final Symbol f107590b = new Symbol("ALREADY_LOCKED_BY_OWNER");

    /* renamed from: a */
    public static final Mutex m113909a(boolean z11) {
        return new MutexImpl(z11);
    }

    /* renamed from: b */
    public static /* synthetic */ Mutex m113910b(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m113909a(z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113913e(Mutex mutex, Object obj, InterfaceC18494a interfaceC18494a, Continuation continuation) {
        MutexKt$withLock$1 mutexKt$withLock$1;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof MutexKt$withLock$1) {
                mutexKt$withLock$1 = (MutexKt$withLock$1) continuation;
                int i12 = mutexKt$withLock$1.f107595w;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    mutexKt$withLock$1.f107595w = i12 - Integer.MIN_VALUE;
                    Object obj2 = mutexKt$withLock$1.f107594v;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = mutexKt$withLock$1.f107595w;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            interfaceC18494a = (InterfaceC18494a) mutexKt$withLock$1.f107593u;
                            obj = mutexKt$withLock$1.f107592t;
                            mutex = (Mutex) mutexKt$withLock$1.f107591s;
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        mutexKt$withLock$1.f107591s = mutex;
                        mutexKt$withLock$1.f107592t = obj;
                        mutexKt$withLock$1.f107593u = interfaceC18494a;
                        mutexKt$withLock$1.f107595w = 1;
                        if (mutex.mo113889b(obj, mutexKt$withLock$1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return interfaceC18494a.mo12V4();
                }
            }
            return interfaceC18494a.mo12V4();
        } finally {
            AbstractC19072r.m100201b(1);
            mutex.mo113890c(obj);
            AbstractC19072r.m100200a(1);
        }
        mutexKt$withLock$1 = new MutexKt$withLock$1(continuation);
        Object obj22 = mutexKt$withLock$1.f107594v;
        m142578e = AbstractC28298d.m142578e();
        i11 = mutexKt$withLock$1.f107595w;
        if (i11 == 0) {
        }
    }
}
