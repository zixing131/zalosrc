package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import fn0.AbstractC19072r;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChannelsKt__Channels_commonKt {
    /* renamed from: a */
    public static final void m113133a(ReceiveChannel receiveChannel, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = ExceptionsKt.m112722a("Channel was consumed, consumer had failed", th2);
            }
        }
        receiveChannel.mo113009a(cancellationException);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x007c), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:15:0x0066, B:17:0x006e, B:29:0x007c), top: B:14:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0062 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113134b(BroadcastChannel broadcastChannel, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$3;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel;
        Throwable th2;
        ReceiveChannel receiveChannel2;
        ChannelIterator it;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__Channels_commonKt$consumeEach$3) {
            channelsKt__Channels_commonKt$consumeEach$3 = (ChannelsKt__Channels_commonKt$consumeEach$3) continuation;
            int i12 = channelsKt__Channels_commonKt$consumeEach$3.f106092w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$3.f106092w = i12 - Integer.MIN_VALUE;
                Object obj = channelsKt__Channels_commonKt$consumeEach$3.f106091v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__Channels_commonKt$consumeEach$3.f106092w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__Channels_commonKt$consumeEach$3.f106090u;
                        receiveChannel = (ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$3.f106089t;
                        InterfaceC18505l interfaceC18505l2 = (InterfaceC18505l) channelsKt__Channels_commonKt$consumeEach$3.f106088s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$32 = channelsKt__Channels_commonKt$consumeEach$3;
                            ReceiveChannel receiveChannel3 = receiveChannel;
                            interfaceC18505l = interfaceC18505l2;
                            Object obj2 = m142578e;
                            ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$33 = channelsKt__Channels_commonKt$consumeEach$32;
                            try {
                                if (!((Boolean) obj).booleanValue()) {
                                    interfaceC18505l.mo205i9(it.next());
                                    receiveChannel2 = receiveChannel3;
                                    channelsKt__Channels_commonKt$consumeEach$3 = channelsKt__Channels_commonKt$consumeEach$33;
                                    m142578e = obj2;
                                    try {
                                        channelsKt__Channels_commonKt$consumeEach$3.f106088s = interfaceC18505l;
                                        channelsKt__Channels_commonKt$consumeEach$3.f106089t = receiveChannel2;
                                        channelsKt__Channels_commonKt$consumeEach$3.f106090u = it;
                                        channelsKt__Channels_commonKt$consumeEach$3.f106092w = 1;
                                        mo113028a = it.mo113028a(channelsKt__Channels_commonKt$consumeEach$3);
                                        if (mo113028a != m142578e) {
                                            return m142578e;
                                        }
                                        channelsKt__Channels_commonKt$consumeEach$32 = channelsKt__Channels_commonKt$consumeEach$3;
                                        receiveChannel3 = receiveChannel2;
                                        obj = mo113028a;
                                        Object obj22 = m142578e;
                                        ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$332 = channelsKt__Channels_commonKt$consumeEach$32;
                                        if (!((Boolean) obj).booleanValue()) {
                                            C24848g0 c24848g0 = C24848g0.f119245a;
                                            AbstractC19072r.m100201b(1);
                                            ReceiveChannel.DefaultImpls.m113193a(receiveChannel3, null, 1, null);
                                            AbstractC19072r.m100200a(1);
                                            return C24848g0.f119245a;
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        receiveChannel = receiveChannel2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                receiveChannel = receiveChannel3;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ReceiveChannel mo112900m = broadcastChannel.mo112900m();
                    try {
                        receiveChannel2 = mo112900m;
                        it = mo112900m.iterator();
                        channelsKt__Channels_commonKt$consumeEach$3.f106088s = interfaceC18505l;
                        channelsKt__Channels_commonKt$consumeEach$3.f106089t = receiveChannel2;
                        channelsKt__Channels_commonKt$consumeEach$3.f106090u = it;
                        channelsKt__Channels_commonKt$consumeEach$3.f106092w = 1;
                        mo113028a = it.mo113028a(channelsKt__Channels_commonKt$consumeEach$3);
                        if (mo113028a != m142578e) {
                        }
                    } catch (Throwable th6) {
                        receiveChannel = mo112900m;
                        th2 = th6;
                    }
                }
                AbstractC19072r.m100201b(1);
                ReceiveChannel.DefaultImpls.m113193a(receiveChannel, null, 1, null);
                AbstractC19072r.m100200a(1);
                throw th2;
            }
        }
        channelsKt__Channels_commonKt$consumeEach$3 = new ChannelsKt__Channels_commonKt$consumeEach$3(continuation);
        Object obj3 = channelsKt__Channels_commonKt$consumeEach$3.f106091v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__Channels_commonKt$consumeEach$3.f106092w;
        if (i11 == 0) {
        }
        AbstractC19072r.m100201b(1);
        ReceiveChannel.DefaultImpls.m113193a(receiveChannel, null, 1, null);
        AbstractC19072r.m100200a(1);
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113135c(ReceiveChannel receiveChannel, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$1;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator it;
        InterfaceC18505l interfaceC18505l2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__Channels_commonKt$consumeEach$1) {
            channelsKt__Channels_commonKt$consumeEach$1 = (ChannelsKt__Channels_commonKt$consumeEach$1) continuation;
            int i12 = channelsKt__Channels_commonKt$consumeEach$1.f106087w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$1.f106087w = i12 - Integer.MIN_VALUE;
                Object obj = channelsKt__Channels_commonKt$consumeEach$1.f106086v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__Channels_commonKt$consumeEach$1.f106087w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__Channels_commonKt$consumeEach$1.f106085u;
                        receiveChannel2 = (ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$1.f106084t;
                        InterfaceC18505l interfaceC18505l3 = (InterfaceC18505l) channelsKt__Channels_commonKt$consumeEach$1.f106083s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                interfaceC18505l3.mo205i9(it.next());
                                interfaceC18505l2 = interfaceC18505l3;
                                channelsKt__Channels_commonKt$consumeEach$1.f106083s = interfaceC18505l2;
                                channelsKt__Channels_commonKt$consumeEach$1.f106084t = receiveChannel2;
                                channelsKt__Channels_commonKt$consumeEach$1.f106085u = it;
                                channelsKt__Channels_commonKt$consumeEach$1.f106087w = 1;
                                mo113028a = it.mo113028a(channelsKt__Channels_commonKt$consumeEach$1);
                                if (mo113028a != m142578e) {
                                    return m142578e;
                                }
                                interfaceC18505l3 = interfaceC18505l2;
                                obj = mo113028a;
                                if (!((Boolean) obj).booleanValue()) {
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    AbstractC19072r.m100201b(1);
                                    ChannelsKt.m113108b(receiveChannel2, null);
                                    AbstractC19072r.m100200a(1);
                                    return C24848g0.f119245a;
                                }
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable th4) {
                                AbstractC19072r.m100201b(1);
                                ChannelsKt.m113108b(receiveChannel2, th2);
                                AbstractC19072r.m100200a(1);
                                throw th4;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        interfaceC18505l2 = interfaceC18505l;
                        channelsKt__Channels_commonKt$consumeEach$1.f106083s = interfaceC18505l2;
                        channelsKt__Channels_commonKt$consumeEach$1.f106084t = receiveChannel2;
                        channelsKt__Channels_commonKt$consumeEach$1.f106085u = it;
                        channelsKt__Channels_commonKt$consumeEach$1.f106087w = 1;
                        mo113028a = it.mo113028a(channelsKt__Channels_commonKt$consumeEach$1);
                        if (mo113028a != m142578e) {
                        }
                    } catch (Throwable th5) {
                        receiveChannel2 = receiveChannel;
                        th2 = th5;
                        throw th2;
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$consumeEach$1 = new ChannelsKt__Channels_commonKt$consumeEach$1(continuation);
        Object obj2 = channelsKt__Channels_commonKt$consumeEach$1.f106086v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__Channels_commonKt$consumeEach$1.f106087w;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0067, B:14:0x006f, B:29:0x0078), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113136d(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__Channels_commonKt$toList$1 channelsKt__Channels_commonKt$toList$1;
        Object m142578e;
        int i11;
        List m131494c;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        List list;
        List list2;
        ChannelIterator it;
        Object mo113028a;
        List m131492a;
        if (continuation instanceof ChannelsKt__Channels_commonKt$toList$1) {
            channelsKt__Channels_commonKt$toList$1 = (ChannelsKt__Channels_commonKt$toList$1) continuation;
            int i12 = channelsKt__Channels_commonKt$toList$1.f106098x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$toList$1.f106098x = i12 - Integer.MIN_VALUE;
                Object obj = channelsKt__Channels_commonKt$toList$1.f106097w;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__Channels_commonKt$toList$1.f106098x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__Channels_commonKt$toList$1.f106096v;
                        ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__Channels_commonKt$toList$1.f106095u;
                        list = (List) channelsKt__Channels_commonKt$toList$1.f106094t;
                        list2 = (List) channelsKt__Channels_commonKt$toList$1.f106093s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                list.add(it.next());
                                receiveChannel2 = receiveChannel3;
                                try {
                                    channelsKt__Channels_commonKt$toList$1.f106093s = list2;
                                    channelsKt__Channels_commonKt$toList$1.f106094t = list;
                                    channelsKt__Channels_commonKt$toList$1.f106095u = receiveChannel2;
                                    channelsKt__Channels_commonKt$toList$1.f106096v = it;
                                    channelsKt__Channels_commonKt$toList$1.f106098x = 1;
                                    mo113028a = it.mo113028a(channelsKt__Channels_commonKt$toList$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    receiveChannel3 = receiveChannel2;
                                    obj = mo113028a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        ChannelsKt.m113108b(receiveChannel3, null);
                                        m131492a = AbstractC25366r.m131492a(list2);
                                        return m131492a;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        ChannelsKt.m113108b(receiveChannel2, th2);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            receiveChannel2 = receiveChannel3;
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    m131494c = AbstractC25366r.m131494c();
                    try {
                        list = m131494c;
                        list2 = list;
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        channelsKt__Channels_commonKt$toList$1.f106093s = list2;
                        channelsKt__Channels_commonKt$toList$1.f106094t = list;
                        channelsKt__Channels_commonKt$toList$1.f106095u = receiveChannel2;
                        channelsKt__Channels_commonKt$toList$1.f106096v = it;
                        channelsKt__Channels_commonKt$toList$1.f106098x = 1;
                        mo113028a = it.mo113028a(channelsKt__Channels_commonKt$toList$1);
                        if (mo113028a != m142578e) {
                        }
                    } catch (Throwable th6) {
                        receiveChannel2 = receiveChannel;
                        th2 = th6;
                        throw th2;
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$toList$1 = new ChannelsKt__Channels_commonKt$toList$1(continuation);
        Object obj2 = channelsKt__Channels_commonKt$toList$1.f106097w;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__Channels_commonKt$toList$1.f106098x;
        if (i11 == 0) {
        }
    }
}
