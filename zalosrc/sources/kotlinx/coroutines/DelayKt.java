package kotlinx.coroutines;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import ln0.AbstractC22543l;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pn0.C24873a;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m112665a(Continuation continuation) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        Object m142578e;
        int i11;
        Continuation m142576c;
        Object m142578e2;
        if (continuation instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuation;
            int i12 = delayKt$awaitCancellation$1.f105858t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.f105858t = i12 - Integer.MIN_VALUE;
                Object obj = delayKt$awaitCancellation$1.f105857s;
                m142578e = AbstractC28298d.m142578e();
                i11 = delayKt$awaitCancellation$1.f105858t;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    delayKt$awaitCancellation$1.f105858t = 1;
                    m142576c = AbstractC28297c.m142576c(delayKt$awaitCancellation$1);
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                    cancellableContinuationImpl.m112574F();
                    Object m112571A = cancellableContinuationImpl.m112571A();
                    m142578e2 = AbstractC28298d.m142578e();
                    if (m112571A == m142578e2) {
                        AbstractC29100h.m145355c(delayKt$awaitCancellation$1);
                    }
                    if (m112571A == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
        Object obj2 = delayKt$awaitCancellation$1.f105857s;
        m142578e = AbstractC28298d.m142578e();
        i11 = delayKt$awaitCancellation$1.f105858t;
        if (i11 == 0) {
        }
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final Object m112666b(long j11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        if (j11 > 0) {
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            if (j11 < Long.MAX_VALUE) {
                m112667c(cancellableContinuationImpl.getContext()).mo112663q(j11, cancellableContinuationImpl);
            }
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            m142578e2 = AbstractC28298d.m142578e();
            if (m112571A == m142578e2) {
                return m112571A;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: c */
    public static final Delay m112667c(InterfaceC27315f interfaceC27315f) {
        Delay delay;
        InterfaceC27315f.b mo112624d = interfaceC27315f.mo112624d(InterfaceC27313d.f128556o);
        if (mo112624d instanceof Delay) {
            delay = (Delay) mo112624d;
        } else {
            delay = null;
        }
        if (delay == null) {
            return DefaultExecutorKt.m112659a();
        }
        return delay;
    }

    /* renamed from: d */
    public static final long m112668d(long j11) {
        long m116581d;
        if (C24873a.m129327i(j11, C24873a.f119357q.m129343b()) > 0) {
            m116581d = AbstractC22543l.m116581d(C24873a.m129334u(j11), 1L);
            return m116581d;
        }
        return 0L;
    }
}
