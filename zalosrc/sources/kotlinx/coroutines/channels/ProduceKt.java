package kotlinx.coroutines.channels;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* loaded from: classes7.dex */
public final class ProduceKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113184a(ProducerScope producerScope, InterfaceC18494a interfaceC18494a, Continuation continuation) {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        Object m142578e;
        int i11;
        Continuation m142576c;
        Object m142578e2;
        try {
            if (continuation instanceof ProduceKt$awaitClose$1) {
                produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuation;
                int i12 = produceKt$awaitClose$1.f106299v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    produceKt$awaitClose$1.f106299v = i12 - Integer.MIN_VALUE;
                    Object obj = produceKt$awaitClose$1.f106298u;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = produceKt$awaitClose$1.f106299v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            interfaceC18494a = (InterfaceC18494a) produceKt$awaitClose$1.f106297t;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        if (produceKt$awaitClose$1.getContext().mo112624d(Job.f105897m) == producerScope) {
                            produceKt$awaitClose$1.f106296s = producerScope;
                            produceKt$awaitClose$1.f106297t = interfaceC18494a;
                            produceKt$awaitClose$1.f106299v = 1;
                            m142576c = AbstractC28297c.m142576c(produceKt$awaitClose$1);
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                            cancellableContinuationImpl.m112574F();
                            producerScope.mo112917B(new ProduceKt$awaitClose$4$1(cancellableContinuationImpl));
                            Object m112571A = cancellableContinuationImpl.m112571A();
                            m142578e2 = AbstractC28298d.m142578e();
                            if (m112571A == m142578e2) {
                                AbstractC29100h.m145355c(produceKt$awaitClose$1);
                            }
                            if (m112571A == m142578e) {
                                return m142578e;
                            }
                        } else {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                        }
                    }
                    interfaceC18494a.mo12V4();
                    return C24848g0.f119245a;
                }
            }
            if (i11 == 0) {
            }
            interfaceC18494a.mo12V4();
            return C24848g0.f119245a;
        } catch (Throwable th2) {
            interfaceC18494a.mo12V4();
            throw th2;
        }
        produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuation);
        Object obj2 = produceKt$awaitClose$1.f106298u;
        m142578e = AbstractC28298d.m142578e();
        i11 = produceKt$awaitClose$1.f106299v;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m113185b(ProducerScope producerScope, InterfaceC18494a interfaceC18494a, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC18494a = ProduceKt$awaitClose$2.f106300q;
        }
        return m113184a(producerScope, interfaceC18494a, continuation);
    }

    /* renamed from: c */
    public static final ReceiveChannel m113186c(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, int i11, InterfaceC18509p interfaceC18509p) {
        return m113187d(coroutineScope, interfaceC27315f, i11, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, interfaceC18509p);
    }

    /* renamed from: d */
    public static final ReceiveChannel m113187d(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(CoroutineContextKt.m112615d(coroutineScope, interfaceC27315f), ChannelKt.m113079b(i11, bufferOverflow, null, 4, null));
        if (interfaceC18505l != null) {
            producerCoroutine.mo112733M(interfaceC18505l);
        }
        producerCoroutine.m112501s1(coroutineStart, producerCoroutine, interfaceC18509p);
        return producerCoroutine;
    }

    /* renamed from: e */
    public static /* synthetic */ ReceiveChannel m113188e(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, int i11, InterfaceC18509p interfaceC18509p, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            interfaceC27315f = C27316g.f128559p;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m113186c(coroutineScope, interfaceC27315f, i11, interfaceC18509p);
    }

    /* renamed from: f */
    public static /* synthetic */ ReceiveChannel m113189f(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, int i12, Object obj) {
        int i13;
        if ((i12 & 1) != 0) {
            interfaceC27315f = C27316g.f128559p;
        }
        InterfaceC27315f interfaceC27315f2 = interfaceC27315f;
        if ((i12 & 2) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i12 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i12 & 16) != 0) {
            interfaceC18505l = null;
        }
        return m113187d(coroutineScope, interfaceC27315f2, i13, bufferOverflow2, coroutineStart2, interfaceC18505l, interfaceC18509p);
    }
}
