package kotlinx.coroutines;

import en0.InterfaceC18509p;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import pm0.AbstractC24862s;
import pn0.AbstractC24875c;
import pn0.C24873a;
import pn0.EnumC24876d;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class TimeoutKt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:            if (r4 == null) goto L9;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TimeoutCancellationException m112876a(long j11, Delay delay, Job job) {
        DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics;
        String str;
        if (delay instanceof DelayWithTimeoutDiagnostics) {
            delayWithTimeoutDiagnostics = (DelayWithTimeoutDiagnostics) delay;
        } else {
            delayWithTimeoutDiagnostics = null;
        }
        if (delayWithTimeoutDiagnostics != null) {
            C24873a.a aVar = C24873a.f119357q;
            str = delayWithTimeoutDiagnostics.m112669O(AbstractC24875c.m129364s(j11, EnumC24876d.f119366s));
        }
        str = "Timed out waiting for " + j11 + " ms";
        return new TimeoutCancellationException(str, job);
    }

    /* renamed from: b */
    private static final Object m112877b(TimeoutCoroutine timeoutCoroutine, InterfaceC18509p interfaceC18509p) {
        JobKt.m112756i(timeoutCoroutine, DelayKt.m112667c(timeoutCoroutine.f107413s.getContext()).mo112658y(timeoutCoroutine.f105950t, timeoutCoroutine, timeoutCoroutine.getContext()));
        return UndispatchedKt.m113757c(timeoutCoroutine, timeoutCoroutine, interfaceC18509p);
    }

    /* renamed from: c */
    public static final Object m112878c(long j11, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        if (j11 > 0) {
            Object m112877b = m112877b(new TimeoutCoroutine(j11, continuation), interfaceC18509p);
            m142578e = AbstractC28298d.m142578e();
            if (m112877b == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            return m112877b;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m112879d(long j11, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        Object m142578e2;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            int i12 = timeoutKt$withTimeoutOrNull$1.f105955w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.f105955w = i12 - Integer.MIN_VALUE;
                Object obj = timeoutKt$withTimeoutOrNull$1.f105954v;
                m142578e = AbstractC28298d.m142578e();
                i11 = timeoutKt$withTimeoutOrNull$1.f105955w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) timeoutKt$withTimeoutOrNull$1.f105953u;
                        try {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        } catch (TimeoutCancellationException e11) {
                            e = e11;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (j11 <= 0) {
                        return null;
                    }
                    C19059j0 c19059j02 = new C19059j0();
                    try {
                        timeoutKt$withTimeoutOrNull$1.f105952t = interfaceC18509p;
                        timeoutKt$withTimeoutOrNull$1.f105953u = c19059j02;
                        timeoutKt$withTimeoutOrNull$1.f105951s = j11;
                        timeoutKt$withTimeoutOrNull$1.f105955w = 1;
                        TimeoutCoroutine timeoutCoroutine = new TimeoutCoroutine(j11, timeoutKt$withTimeoutOrNull$1);
                        c19059j02.f94941p = timeoutCoroutine;
                        Object m112877b = m112877b(timeoutCoroutine, interfaceC18509p);
                        m142578e2 = AbstractC28298d.m142578e();
                        if (m112877b == m142578e2) {
                            AbstractC29100h.m145355c(timeoutKt$withTimeoutOrNull$1);
                        }
                        if (m112877b == m142578e) {
                            return m142578e;
                        }
                        return m112877b;
                    } catch (TimeoutCancellationException e12) {
                        e = e12;
                        c19059j0 = c19059j02;
                    }
                }
                if (e.f105949p != c19059j0.f94941p) {
                    return null;
                }
                throw e;
            }
        }
        timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        Object obj2 = timeoutKt$withTimeoutOrNull$1.f105954v;
        m142578e = AbstractC28298d.m142578e();
        i11 = timeoutKt$withTimeoutOrNull$1.f105955w;
        if (i11 == 0) {
        }
        if (e.f105949p != c19059j0.f94941p) {
        }
    }
}
