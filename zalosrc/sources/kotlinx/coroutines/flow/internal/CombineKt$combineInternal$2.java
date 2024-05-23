package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25356m;
import qm0.C25345g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m145345f = "Combine.kt", m145346l = {54, 76, 79}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CombineKt$combineInternal$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: A */
    final /* synthetic */ InterfaceC18494a f107247A;

    /* renamed from: B */
    final /* synthetic */ InterfaceC18510q f107248B;

    /* renamed from: C */
    final /* synthetic */ FlowCollector f107249C;

    /* renamed from: t */
    Object f107250t;

    /* renamed from: u */
    Object f107251u;

    /* renamed from: v */
    int f107252v;

    /* renamed from: w */
    int f107253w;

    /* renamed from: x */
    int f107254x;

    /* renamed from: y */
    private /* synthetic */ Object f107255y;

    /* renamed from: z */
    final /* synthetic */ Flow[] f107256z;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m145345f = "Combine.kt", m145346l = {31}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    /* loaded from: classes7.dex */
    public static final class C218641 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f107257t;

        /* renamed from: u */
        final /* synthetic */ Flow[] f107258u;

        /* renamed from: v */
        final /* synthetic */ int f107259v;

        /* renamed from: w */
        final /* synthetic */ AtomicInteger f107260w;

        /* renamed from: x */
        final /* synthetic */ Channel f107261x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass1<T> implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ Channel f107262p;

            /* renamed from: q */
            final /* synthetic */ int f107263q;

            AnonymousClass1(Channel channel, int i11) {
                this.f107262p = channel;
                this.f107263q = i11;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                Object m142578e;
                int i11;
                if (continuation instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) continuation;
                    int i12 = combineKt$combineInternal$2$1$1$emit$1.f107266u;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.f107266u = i12 - Integer.MIN_VALUE;
                        Object obj2 = combineKt$combineInternal$2$1$1$emit$1.f107264s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = combineKt$combineInternal$2$1$1$emit$1.f107266u;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    AbstractC24862s.m129228b(obj2);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            Channel channel = this.f107262p;
                            C25345g0 c25345g0 = new C25345g0(this.f107263q, obj);
                            combineKt$combineInternal$2$1$1$emit$1.f107266u = 1;
                            if (channel.mo112908S(c25345g0, combineKt$combineInternal$2$1$1$emit$1) == m142578e) {
                                return m142578e;
                            }
                        }
                        combineKt$combineInternal$2$1$1$emit$1.f107266u = 2;
                        if (YieldKt.m112882a(combineKt$combineInternal$2$1$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                }
                combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                Object obj22 = combineKt$combineInternal$2$1$1$emit$1.f107264s;
                m142578e = AbstractC28298d.m142578e();
                i11 = combineKt$combineInternal$2$1$1$emit$1.f107266u;
                if (i11 == 0) {
                }
                combineKt$combineInternal$2$1$1$emit$1.f107266u = 2;
                if (YieldKt.m112882a(combineKt$combineInternal$2$1$1$emit$1) == m142578e) {
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218641(Flow[] flowArr, int i11, AtomicInteger atomicInteger, Channel channel, Continuation continuation) {
            super(2, continuation);
            this.f107258u = flowArr;
            this.f107259v = i11;
            this.f107260w = atomicInteger;
            this.f107261x = channel;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C218641(this.f107258u, this.f107259v, this.f107260w, this.f107261x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AtomicInteger atomicInteger;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107257t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow[] flowArr = this.f107258u;
                    int i12 = this.f107259v;
                    Flow flow = flowArr[i12];
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f107261x, i12);
                    this.f107257t = 1;
                    if (flow.mo97893a(anonymousClass1, this) == m142578e) {
                        return m142578e;
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.m113195a(this.f107261x, null, 1, null);
                }
                return C24848g0.f119245a;
            } finally {
                if (this.f107260w.decrementAndGet() == 0) {
                    SendChannel.DefaultImpls.m113195a(this.f107261x, null, 1, null);
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C218641) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(Flow[] flowArr, InterfaceC18494a interfaceC18494a, InterfaceC18510q interfaceC18510q, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f107256z = flowArr;
        this.f107247A = interfaceC18494a;
        this.f107248B = interfaceC18510q;
        this.f107249C = flowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f107256z, this.f107247A, this.f107248B, this.f107249C, continuation);
        combineKt$combineInternal$2.f107255y = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[EDGE_INSN: B:39:0x010a->B:25:0x010a BREAK  A[LOOP:0: B:17:0x00e5->B:38:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x012d -> B:8:0x00c2). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        Object[] objArr;
        byte b11;
        byte[] bArr;
        CombineKt$combineInternal$2 combineKt$combineInternal$2;
        int i11;
        Channel channel;
        byte b12;
        Object obj2;
        Object[] objArr2;
        C25345g0 c25345g0;
        int m131263a;
        Object obj3;
        m142578e = AbstractC28298d.m142578e();
        int i12 = this.f107254x;
        int i13 = 2;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        ?? r22 = this.f107253w;
                        i11 = this.f107252v;
                        byte[] bArr2 = (byte[]) this.f107251u;
                        Channel channel2 = (Channel) this.f107250t;
                        Object[] objArr3 = (Object[]) this.f107255y;
                        AbstractC24862s.m129228b(obj);
                        b11 = r22;
                        bArr = bArr2;
                        channel = channel2;
                        objArr = objArr3;
                        combineKt$combineInternal$2 = this;
                        i13 = 2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ?? r23 = this.f107253w;
                    i11 = this.f107252v;
                    byte[] bArr3 = (byte[]) this.f107251u;
                    Channel channel3 = (Channel) this.f107250t;
                    Object[] objArr4 = (Object[]) this.f107255y;
                    AbstractC24862s.m129228b(obj);
                    b11 = r23;
                    bArr = bArr3;
                    channel = channel3;
                    objArr = objArr4;
                    combineKt$combineInternal$2 = this;
                }
            } else {
                ?? r24 = this.f107253w;
                i11 = this.f107252v;
                byte[] bArr4 = (byte[]) this.f107251u;
                Channel channel4 = (Channel) this.f107250t;
                objArr2 = (Object[]) this.f107255y;
                AbstractC24862s.m129228b(obj);
                obj2 = ((ChannelResult) obj).m113090k();
                b12 = r24;
                bArr = bArr4;
                channel = channel4;
                combineKt$combineInternal$2 = this;
                c25345g0 = (C25345g0) ChannelResult.m113085f(obj2);
                if (c25345g0 == null) {
                    return C24848g0.f119245a;
                }
                do {
                    m131263a = c25345g0.m131263a();
                    obj3 = objArr2[m131263a];
                    objArr2[m131263a] = c25345g0.m131264b();
                    if (obj3 == NullSurrogateKt.f107314b) {
                        i11--;
                    }
                    if (bArr[m131263a] != b12) {
                        break;
                    }
                    bArr[m131263a] = b12;
                    c25345g0 = (C25345g0) ChannelResult.m113085f(channel.mo113019x());
                } while (c25345g0 != null);
                if (i11 == 0) {
                    Object[] objArr5 = (Object[]) combineKt$combineInternal$2.f107247A.mo12V4();
                    if (objArr5 == null) {
                        InterfaceC18510q interfaceC18510q = combineKt$combineInternal$2.f107248B;
                        FlowCollector flowCollector = combineKt$combineInternal$2.f107249C;
                        combineKt$combineInternal$2.f107255y = objArr2;
                        combineKt$combineInternal$2.f107250t = channel;
                        combineKt$combineInternal$2.f107251u = bArr;
                        combineKt$combineInternal$2.f107252v = i11;
                        combineKt$combineInternal$2.f107253w = b12;
                        combineKt$combineInternal$2.f107254x = i13;
                        if (interfaceC18510q.mo45599Hr(flowCollector, objArr2, combineKt$combineInternal$2) == m142578e) {
                            return m142578e;
                        }
                        objArr = objArr2;
                        b11 = b12;
                    } else {
                        byte b13 = b12;
                        AbstractC25356m.m131326i(objArr2, objArr5, 0, 0, 0, 14, null);
                        InterfaceC18510q interfaceC18510q2 = combineKt$combineInternal$2.f107248B;
                        FlowCollector flowCollector2 = combineKt$combineInternal$2.f107249C;
                        combineKt$combineInternal$2.f107255y = objArr2;
                        combineKt$combineInternal$2.f107250t = channel;
                        combineKt$combineInternal$2.f107251u = bArr;
                        combineKt$combineInternal$2.f107252v = i11;
                        combineKt$combineInternal$2.f107253w = b13;
                        combineKt$combineInternal$2.f107254x = 3;
                        if (interfaceC18510q2.mo45599Hr(flowCollector2, objArr5, combineKt$combineInternal$2) == m142578e) {
                            return m142578e;
                        }
                        b11 = b13;
                        objArr = objArr2;
                    }
                } else {
                    b11 = b12;
                    objArr = objArr2;
                }
                i13 = 2;
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f107255y;
            int length = this.f107256z.length;
            if (length == 0) {
                return C24848g0.f119245a;
            }
            objArr = new Object[length];
            AbstractC25356m.m131331n(objArr, NullSurrogateKt.f107314b, 0, 0, 6, null);
            Channel m113079b = ChannelKt.m113079b(length, null, null, 6, null);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            b11 = 0;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new C218641(this.f107256z, i15, atomicInteger, m113079b, null), 3, null);
                i14 = i15 + 1;
                atomicInteger = atomicInteger;
            }
            bArr = new byte[length];
            combineKt$combineInternal$2 = this;
            i11 = length;
            channel = m113079b;
        }
        byte b14 = (byte) (b11 + 1);
        combineKt$combineInternal$2.f107255y = objArr;
        combineKt$combineInternal$2.f107250t = channel;
        combineKt$combineInternal$2.f107251u = bArr;
        combineKt$combineInternal$2.f107252v = i11;
        combineKt$combineInternal$2.f107253w = b14;
        combineKt$combineInternal$2.f107254x = 1;
        obj2 = channel.mo113021z(combineKt$combineInternal$2);
        if (obj2 != m142578e) {
            return m142578e;
        }
        b12 = b14;
        objArr2 = objArr;
        c25345g0 = (C25345g0) ChannelResult.m113085f(obj2);
        if (c25345g0 == null) {
        }
        do {
            m131263a = c25345g0.m131263a();
            obj3 = objArr2[m131263a];
            objArr2[m131263a] = c25345g0.m131264b();
            if (obj3 == NullSurrogateKt.f107314b) {
            }
            if (bArr[m131263a] != b12) {
            }
        } while (c25345g0 != null);
        if (i11 == 0) {
        }
        i13 = 2;
        byte b142 = (byte) (b11 + 1);
        combineKt$combineInternal$2.f107255y = objArr;
        combineKt$combineInternal$2.f107250t = channel;
        combineKt$combineInternal$2.f107251u = bArr;
        combineKt$combineInternal$2.f107252v = i11;
        combineKt$combineInternal$2.f107253w = b142;
        combineKt$combineInternal$2.f107254x = 1;
        obj2 = channel.mo113021z(combineKt$combineInternal$2);
        if (obj2 != m142578e) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CombineKt$combineInternal$2) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
