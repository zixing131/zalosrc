package kotlinx.coroutines.channels;

import fn0.AbstractC19074t;
import fn0.C19055h0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;

/* loaded from: classes7.dex */
public final /* synthetic */ class ChannelsKt__DeprecatedKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113137a(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$any$1 channelsKt__DeprecatedKt$any$1;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$any$1) {
                channelsKt__DeprecatedKt$any$1 = (ChannelsKt__DeprecatedKt$any$1) continuation;
                int i12 = channelsKt__DeprecatedKt$any$1.f106101u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$any$1.f106101u = i12 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$any$1.f106100t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = channelsKt__DeprecatedKt$any$1.f106101u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$any$1.f106099s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$any$1.f106099s = receiveChannel;
                        channelsKt__DeprecatedKt$any$1.f106101u = 1;
                        obj = it.mo113028a(channelsKt__DeprecatedKt$any$1);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    ChannelsKt.m113108b(receiveChannel, null);
                    return obj;
                }
            }
            if (i11 == 0) {
            }
            ChannelsKt.m113108b(receiveChannel, null);
            return obj;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ChannelsKt.m113108b(receiveChannel, th2);
                throw th3;
            }
        }
        channelsKt__DeprecatedKt$any$1 = new ChannelsKt__DeprecatedKt$any$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$any$1.f106100t;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$any$1.f106101u;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0060, B:14:0x0068, B:30:0x0072), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005d -> B:12:0x0060). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113138b(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$count$1 channelsKt__DeprecatedKt$count$1;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        C19055h0 c19055h0;
        ReceiveChannel receiveChannel3;
        ChannelIterator it;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$count$1) {
            channelsKt__DeprecatedKt$count$1 = (ChannelsKt__DeprecatedKt$count$1) continuation;
            int i12 = channelsKt__DeprecatedKt$count$1.f106108w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$count$1.f106108w = i12 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$count$1.f106107v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$count$1.f106108w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__DeprecatedKt$count$1.f106106u;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$count$1.f106105t;
                        c19055h0 = (C19055h0) channelsKt__DeprecatedKt$count$1.f106104s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                it.next();
                                c19055h0.f94931p++;
                                receiveChannel3 = receiveChannel2;
                                try {
                                    channelsKt__DeprecatedKt$count$1.f106104s = c19055h0;
                                    channelsKt__DeprecatedKt$count$1.f106105t = receiveChannel3;
                                    channelsKt__DeprecatedKt$count$1.f106106u = it;
                                    channelsKt__DeprecatedKt$count$1.f106108w = 1;
                                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$count$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    receiveChannel2 = receiveChannel3;
                                    obj = mo113028a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        ChannelsKt.m113108b(receiveChannel2, null);
                                        return AbstractC29094b.m145341c(c19055h0.f94931p);
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    receiveChannel2 = receiveChannel3;
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
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        c19055h0 = new C19055h0();
                        receiveChannel3 = receiveChannel;
                        it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$count$1.f106104s = c19055h0;
                        channelsKt__DeprecatedKt$count$1.f106105t = receiveChannel3;
                        channelsKt__DeprecatedKt$count$1.f106106u = it;
                        channelsKt__DeprecatedKt$count$1.f106108w = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$count$1);
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
        channelsKt__DeprecatedKt$count$1 = new ChannelsKt__DeprecatedKt$count$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$count$1.f106107v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$count$1.f106108w;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:13:0x0064, B:15:0x006c, B:26:0x007d, B:27:0x0094), top: B:11:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005f -> B:13:0x0064). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113139c(ReceiveChannel receiveChannel, int i11, Continuation continuation) {
        ChannelsKt__DeprecatedKt$elementAt$1 channelsKt__DeprecatedKt$elementAt$1;
        Object m142578e;
        int i12;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator it;
        int i13;
        Object mo113028a;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$elementAt$1) {
                channelsKt__DeprecatedKt$elementAt$1 = (ChannelsKt__DeprecatedKt$elementAt$1) continuation;
                int i14 = channelsKt__DeprecatedKt$elementAt$1.f106135x;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$elementAt$1.f106135x = i14 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$elementAt$1.f106134w;
                    m142578e = AbstractC28298d.m142578e();
                    i12 = channelsKt__DeprecatedKt$elementAt$1.f106135x;
                    if (i12 == 0) {
                        if (i12 == 1) {
                            int i15 = channelsKt__DeprecatedKt$elementAt$1.f106131t;
                            i11 = channelsKt__DeprecatedKt$elementAt$1.f106130s;
                            ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAt$1.f106133v;
                            receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$elementAt$1.f106132u;
                            try {
                                AbstractC24862s.m129228b(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    Object next = channelIterator.next();
                                    int i16 = i15 + 1;
                                    if (i11 == i15) {
                                        ChannelsKt.m113108b(receiveChannel2, null);
                                        return next;
                                    }
                                    it = channelIterator;
                                    receiveChannel = receiveChannel2;
                                    i13 = i16;
                                    channelsKt__DeprecatedKt$elementAt$1.f106132u = receiveChannel;
                                    channelsKt__DeprecatedKt$elementAt$1.f106133v = it;
                                    channelsKt__DeprecatedKt$elementAt$1.f106130s = i11;
                                    channelsKt__DeprecatedKt$elementAt$1.f106131t = i13;
                                    channelsKt__DeprecatedKt$elementAt$1.f106135x = 1;
                                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$elementAt$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    receiveChannel2 = receiveChannel;
                                    i15 = i13;
                                    channelIterator = it;
                                    obj = mo113028a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i11 + '.');
                                    }
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
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        if (i11 >= 0) {
                            it = receiveChannel.iterator();
                            i13 = 0;
                            channelsKt__DeprecatedKt$elementAt$1.f106132u = receiveChannel;
                            channelsKt__DeprecatedKt$elementAt$1.f106133v = it;
                            channelsKt__DeprecatedKt$elementAt$1.f106130s = i11;
                            channelsKt__DeprecatedKt$elementAt$1.f106131t = i13;
                            channelsKt__DeprecatedKt$elementAt$1.f106135x = 1;
                            mo113028a = it.mo113028a(channelsKt__DeprecatedKt$elementAt$1);
                            if (mo113028a != m142578e) {
                            }
                        } else {
                            throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + i11 + '.');
                        }
                    }
                }
            }
            if (i12 == 0) {
            }
        } catch (Throwable th5) {
            receiveChannel2 = receiveChannel;
            th2 = th5;
        }
        channelsKt__DeprecatedKt$elementAt$1 = new ChannelsKt__DeprecatedKt$elementAt$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$elementAt$1.f106134w;
        m142578e = AbstractC28298d.m142578e();
        i12 = channelsKt__DeprecatedKt$elementAt$1.f106135x;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:13:0x006a, B:15:0x0072, B:22:0x0054, B:46:0x004f), top: B:45:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:13:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113140d(ReceiveChannel receiveChannel, int i11, Continuation continuation) {
        ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$1;
        Object m142578e;
        int i12;
        ChannelIterator it;
        int i13;
        Throwable th2;
        ReceiveChannel receiveChannel2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$elementAtOrNull$1) {
            channelsKt__DeprecatedKt$elementAtOrNull$1 = (ChannelsKt__DeprecatedKt$elementAtOrNull$1) continuation;
            int i14 = channelsKt__DeprecatedKt$elementAtOrNull$1.f106141x;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$elementAtOrNull$1.f106141x = i14 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$elementAtOrNull$1.f106140w;
                m142578e = AbstractC28298d.m142578e();
                i12 = channelsKt__DeprecatedKt$elementAtOrNull$1.f106141x;
                if (i12 == 0) {
                    if (i12 == 1) {
                        int i15 = channelsKt__DeprecatedKt$elementAtOrNull$1.f106137t;
                        i11 = channelsKt__DeprecatedKt$elementAtOrNull$1.f106136s;
                        ChannelIterator channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$elementAtOrNull$1.f106139v;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$elementAtOrNull$1.f106138u;
                        try {
                            AbstractC24862s.m129228b(obj);
                            i13 = i15;
                            receiveChannel = receiveChannel2;
                            Object obj2 = m142578e;
                            ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                            ChannelIterator channelIterator2 = channelIterator;
                            if (!((Boolean) obj).booleanValue()) {
                                Object next = channelIterator2.next();
                                int i16 = i13 + 1;
                                if (i11 == i13) {
                                    ChannelsKt.m113108b(receiveChannel, null);
                                    return next;
                                }
                                it = channelIterator2;
                                channelsKt__DeprecatedKt$elementAtOrNull$1 = channelsKt__DeprecatedKt$elementAtOrNull$12;
                                m142578e = obj2;
                                i13 = i16;
                                channelsKt__DeprecatedKt$elementAtOrNull$1.f106138u = receiveChannel;
                                channelsKt__DeprecatedKt$elementAtOrNull$1.f106139v = it;
                                channelsKt__DeprecatedKt$elementAtOrNull$1.f106136s = i11;
                                channelsKt__DeprecatedKt$elementAtOrNull$1.f106137t = i13;
                                channelsKt__DeprecatedKt$elementAtOrNull$1.f106141x = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$elementAtOrNull$1);
                                if (mo113028a != m142578e) {
                                    return m142578e;
                                }
                                ChannelsKt__DeprecatedKt$elementAtOrNull$1 channelsKt__DeprecatedKt$elementAtOrNull$13 = channelsKt__DeprecatedKt$elementAtOrNull$1;
                                channelIterator2 = it;
                                obj = mo113028a;
                                obj2 = m142578e;
                                channelsKt__DeprecatedKt$elementAtOrNull$12 = channelsKt__DeprecatedKt$elementAtOrNull$13;
                                if (!((Boolean) obj).booleanValue()) {
                                    ChannelsKt.m113108b(receiveChannel, null);
                                    return null;
                                }
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
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (i11 < 0) {
                        ChannelsKt.m113108b(receiveChannel, null);
                        return null;
                    }
                    try {
                        it = receiveChannel.iterator();
                        i13 = 0;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f106138u = receiveChannel;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f106139v = it;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f106136s = i11;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f106137t = i13;
                        channelsKt__DeprecatedKt$elementAtOrNull$1.f106141x = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$elementAtOrNull$1);
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
        channelsKt__DeprecatedKt$elementAtOrNull$1 = new ChannelsKt__DeprecatedKt$elementAtOrNull$1(continuation);
        Object obj3 = channelsKt__DeprecatedKt$elementAtOrNull$1.f106140w;
        m142578e = AbstractC28298d.m142578e();
        i12 = channelsKt__DeprecatedKt$elementAtOrNull$1.f106141x;
        if (i12 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:16:0x006a, B:18:0x004a, B:23:0x006f), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113141e(ReceiveChannel receiveChannel, Collection collection, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNotNullTo$1 channelsKt__DeprecatedKt$filterNotNullTo$1;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator it;
        Collection collection2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$filterNotNullTo$1) {
            channelsKt__DeprecatedKt$filterNotNullTo$1 = (ChannelsKt__DeprecatedKt$filterNotNullTo$1) continuation;
            int i12 = channelsKt__DeprecatedKt$filterNotNullTo$1.f106164w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$filterNotNullTo$1.f106164w = i12 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$filterNotNullTo$1.f106163v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$filterNotNullTo$1.f106164w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$1.f106162u;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$1.f106161t;
                        Collection collection3 = (Collection) channelsKt__DeprecatedKt$filterNotNullTo$1.f106160s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                Object next = it.next();
                                if (next != null) {
                                    collection3.add(next);
                                }
                                collection2 = collection3;
                                channelsKt__DeprecatedKt$filterNotNullTo$1.f106160s = collection2;
                                channelsKt__DeprecatedKt$filterNotNullTo$1.f106161t = receiveChannel2;
                                channelsKt__DeprecatedKt$filterNotNullTo$1.f106162u = it;
                                channelsKt__DeprecatedKt$filterNotNullTo$1.f106164w = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterNotNullTo$1);
                                if (mo113028a != m142578e) {
                                    return m142578e;
                                }
                                collection3 = collection2;
                                obj = mo113028a;
                                if (((Boolean) obj).booleanValue()) {
                                }
                            } else {
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                ChannelsKt.m113108b(receiveChannel2, null);
                                return collection3;
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
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        collection2 = collection;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f106160s = collection2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f106161t = receiveChannel2;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f106162u = it;
                        channelsKt__DeprecatedKt$filterNotNullTo$1.f106164w = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterNotNullTo$1);
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
        channelsKt__DeprecatedKt$filterNotNullTo$1 = new ChannelsKt__DeprecatedKt$filterNotNullTo$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$1.f106163v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$filterNotNullTo$1.f106164w;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:19:0x006e, B:21:0x0076, B:23:0x007c, B:26:0x008f, B:42:0x004f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:12:0x0034, B:19:0x006e, B:21:0x0076, B:23:0x007c, B:26:0x008f, B:42:0x004f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007a -> B:13:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0088 -> B:13:0x008b). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113142f(ReceiveChannel receiveChannel, SendChannel sendChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNotNullTo$3 channelsKt__DeprecatedKt$filterNotNullTo$3;
        Object m142578e;
        int i11;
        ChannelIterator it;
        ChannelIterator channelIterator;
        SendChannel sendChannel2;
        SendChannel sendChannel3;
        Object mo113028a;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$filterNotNullTo$3) {
                channelsKt__DeprecatedKt$filterNotNullTo$3 = (ChannelsKt__DeprecatedKt$filterNotNullTo$3) continuation;
                int i12 = channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w = i12 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$filterNotNullTo$3.f106168v;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.f106167u;
                                ReceiveChannel receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.f106166t;
                                sendChannel2 = (SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.f106165s;
                                AbstractC24862s.m129228b(obj);
                                ReceiveChannel receiveChannel3 = receiveChannel2;
                                it = channelIterator;
                                receiveChannel = receiveChannel3;
                                sendChannel3 = sendChannel2;
                                channelsKt__DeprecatedKt$filterNotNullTo$3.f106165s = sendChannel3;
                                channelsKt__DeprecatedKt$filterNotNullTo$3.f106166t = receiveChannel;
                                channelsKt__DeprecatedKt$filterNotNullTo$3.f106167u = it;
                                channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterNotNullTo$3);
                                if (mo113028a == m142578e) {
                                    return m142578e;
                                }
                                SendChannel sendChannel4 = sendChannel3;
                                sendChannel = receiveChannel;
                                channelIterator = it;
                                obj = mo113028a;
                                sendChannel2 = sendChannel4;
                                if (!((Boolean) obj).booleanValue()) {
                                    Object next = channelIterator.next();
                                    receiveChannel3 = sendChannel;
                                    if (next != null) {
                                        channelsKt__DeprecatedKt$filterNotNullTo$3.f106165s = sendChannel2;
                                        channelsKt__DeprecatedKt$filterNotNullTo$3.f106166t = sendChannel;
                                        channelsKt__DeprecatedKt$filterNotNullTo$3.f106167u = channelIterator;
                                        channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w = 2;
                                        receiveChannel3 = sendChannel;
                                        if (sendChannel2.mo112908S(next, channelsKt__DeprecatedKt$filterNotNullTo$3) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                    it = channelIterator;
                                    receiveChannel = receiveChannel3;
                                    sendChannel3 = sendChannel2;
                                    channelsKt__DeprecatedKt$filterNotNullTo$3.f106165s = sendChannel3;
                                    channelsKt__DeprecatedKt$filterNotNullTo$3.f106166t = receiveChannel;
                                    channelsKt__DeprecatedKt$filterNotNullTo$3.f106167u = it;
                                    channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w = 1;
                                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterNotNullTo$3);
                                    if (mo113028a == m142578e) {
                                    }
                                } else {
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    ChannelsKt.m113108b(sendChannel, null);
                                    return sendChannel2;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$filterNotNullTo$3.f106167u;
                            ReceiveChannel receiveChannel4 = (ReceiveChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.f106166t;
                            sendChannel2 = (SendChannel) channelsKt__DeprecatedKt$filterNotNullTo$3.f106165s;
                            AbstractC24862s.m129228b(obj);
                            sendChannel = receiveChannel4;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        try {
                            it = receiveChannel.iterator();
                            sendChannel3 = sendChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.f106165s = sendChannel3;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.f106166t = receiveChannel;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.f106167u = it;
                            channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w = 1;
                            mo113028a = it.mo113028a(channelsKt__DeprecatedKt$filterNotNullTo$3);
                            if (mo113028a == m142578e) {
                            }
                        } catch (Throwable th2) {
                            sendChannel = receiveChannel;
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                ChannelsKt.m113108b(sendChannel, th);
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (i11 == 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        channelsKt__DeprecatedKt$filterNotNullTo$3 = new ChannelsKt__DeprecatedKt$filterNotNullTo$3(continuation);
        Object obj2 = channelsKt__DeprecatedKt$filterNotNullTo$3.f106168v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$filterNotNullTo$3.f106169w;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x005b, B:18:0x0064, B:19:0x006b), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113143g(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$first$1 channelsKt__DeprecatedKt$first$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        if (continuation instanceof ChannelsKt__DeprecatedKt$first$1) {
            channelsKt__DeprecatedKt$first$1 = (ChannelsKt__DeprecatedKt$first$1) continuation;
            int i12 = channelsKt__DeprecatedKt$first$1.f106173v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$first$1.f106173v = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$first$1.f106172u;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$first$1.f106173v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$first$1.f106171t;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$first$1.f106170s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable th4) {
                                ChannelsKt.m113108b(receiveChannel2, th2);
                                throw th4;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$first$1.f106170s = receiveChannel;
                        channelsKt__DeprecatedKt$first$1.f106171t = it;
                        channelsKt__DeprecatedKt$first$1.f106173v = 1;
                        Object mo113028a = it.mo113028a(channelsKt__DeprecatedKt$first$1);
                        if (mo113028a == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a;
                    } catch (Throwable th5) {
                        receiveChannel2 = receiveChannel;
                        th2 = th5;
                        throw th2;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = channelIterator.next();
                    ChannelsKt.m113108b(receiveChannel2, null);
                    return next;
                }
                throw new NoSuchElementException("ReceiveChannel is empty.");
            }
        }
        channelsKt__DeprecatedKt$first$1 = new ChannelsKt__DeprecatedKt$first$1(continuation);
        obj = channelsKt__DeprecatedKt$first$1.f106172u;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$first$1.f106173v;
        if (i11 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0053, B:18:0x0060), top: B:10:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113144h(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$firstOrNull$1 channelsKt__DeprecatedKt$firstOrNull$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        if (continuation instanceof ChannelsKt__DeprecatedKt$firstOrNull$1) {
            channelsKt__DeprecatedKt$firstOrNull$1 = (ChannelsKt__DeprecatedKt$firstOrNull$1) continuation;
            int i12 = channelsKt__DeprecatedKt$firstOrNull$1.f106177v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$firstOrNull$1.f106177v = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$firstOrNull$1.f106176u;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$firstOrNull$1.f106177v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$firstOrNull$1.f106175t;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$firstOrNull$1.f106174s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            try {
                                throw th2;
                            } catch (Throwable th4) {
                                ChannelsKt.m113108b(receiveChannel2, th2);
                                throw th4;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$firstOrNull$1.f106174s = receiveChannel;
                        channelsKt__DeprecatedKt$firstOrNull$1.f106175t = it;
                        channelsKt__DeprecatedKt$firstOrNull$1.f106177v = 1;
                        Object mo113028a = it.mo113028a(channelsKt__DeprecatedKt$firstOrNull$1);
                        if (mo113028a == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a;
                    } catch (Throwable th5) {
                        receiveChannel2 = receiveChannel;
                        th2 = th5;
                        throw th2;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ChannelsKt.m113108b(receiveChannel2, null);
                    return null;
                }
                Object next = channelIterator.next();
                ChannelsKt.m113108b(receiveChannel2, null);
                return next;
            }
        }
        channelsKt__DeprecatedKt$firstOrNull$1 = new ChannelsKt__DeprecatedKt$firstOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$firstOrNull$1.f106176u;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$firstOrNull$1.f106177v;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x0067, B:14:0x0070, B:16:0x007a, B:20:0x0084, B:21:0x0053, B:25:0x008b), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:12:0x0067). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113145i(ReceiveChannel receiveChannel, Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$indexOf$1 channelsKt__DeprecatedKt$indexOf$1;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator it;
        C19055h0 c19055h0;
        Object obj2;
        Object mo113028a;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$indexOf$1) {
                channelsKt__DeprecatedKt$indexOf$1 = (ChannelsKt__DeprecatedKt$indexOf$1) continuation;
                int i12 = channelsKt__DeprecatedKt$indexOf$1.f106188x;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$indexOf$1.f106188x = i12 - Integer.MIN_VALUE;
                    Object obj3 = channelsKt__DeprecatedKt$indexOf$1.f106187w;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = channelsKt__DeprecatedKt$indexOf$1.f106188x;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            it = (ChannelIterator) channelsKt__DeprecatedKt$indexOf$1.f106186v;
                            receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$indexOf$1.f106185u;
                            c19055h0 = (C19055h0) channelsKt__DeprecatedKt$indexOf$1.f106184t;
                            Object obj4 = channelsKt__DeprecatedKt$indexOf$1.f106183s;
                            try {
                                AbstractC24862s.m129228b(obj3);
                                if (((Boolean) obj3).booleanValue()) {
                                    if (AbstractC19074t.m100204b(obj4, it.next())) {
                                        Integer m145341c = AbstractC29094b.m145341c(c19055h0.f94931p);
                                        ChannelsKt.m113108b(receiveChannel2, null);
                                        return m145341c;
                                    }
                                    c19055h0.f94931p++;
                                    obj2 = obj4;
                                    channelsKt__DeprecatedKt$indexOf$1.f106183s = obj2;
                                    channelsKt__DeprecatedKt$indexOf$1.f106184t = c19055h0;
                                    channelsKt__DeprecatedKt$indexOf$1.f106185u = receiveChannel2;
                                    channelsKt__DeprecatedKt$indexOf$1.f106186v = it;
                                    channelsKt__DeprecatedKt$indexOf$1.f106188x = 1;
                                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$indexOf$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    obj4 = obj2;
                                    obj3 = mo113028a;
                                    if (((Boolean) obj3).booleanValue()) {
                                    }
                                } else {
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    ChannelsKt.m113108b(receiveChannel2, null);
                                    return AbstractC29094b.m145341c(-1);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj3);
                        C19055h0 c19055h02 = new C19055h0();
                        try {
                            receiveChannel2 = receiveChannel;
                            it = receiveChannel.iterator();
                            c19055h0 = c19055h02;
                            obj2 = obj;
                            channelsKt__DeprecatedKt$indexOf$1.f106183s = obj2;
                            channelsKt__DeprecatedKt$indexOf$1.f106184t = c19055h0;
                            channelsKt__DeprecatedKt$indexOf$1.f106185u = receiveChannel2;
                            channelsKt__DeprecatedKt$indexOf$1.f106186v = it;
                            channelsKt__DeprecatedKt$indexOf$1.f106188x = 1;
                            mo113028a = it.mo113028a(channelsKt__DeprecatedKt$indexOf$1);
                            if (mo113028a != m142578e) {
                            }
                        } catch (Throwable th4) {
                            receiveChannel2 = receiveChannel;
                            th2 = th4;
                        }
                    }
                    throw th2;
                }
            }
            throw th2;
        } catch (Throwable th5) {
            ChannelsKt.m113108b(receiveChannel2, th2);
            throw th5;
        }
        channelsKt__DeprecatedKt$indexOf$1 = new ChannelsKt__DeprecatedKt$indexOf$1(continuation);
        Object obj32 = channelsKt__DeprecatedKt$indexOf$1.f106187w;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$indexOf$1.f106188x;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x008b, B:15:0x0093), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0069, B:43:0x0071, B:45:0x00a2, B:46:0x00a9), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2 A[Catch: all -> 0x004e, TRY_ENTER, TryCatch #2 {all -> 0x004e, blocks: (B:40:0x004a, B:41:0x0069, B:43:0x0071, B:45:0x00a2, B:46:0x00a9), top: B:39:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0087 -> B:13:0x008b). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113146j(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$last$1 channelsKt__DeprecatedKt$last$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$last$1) {
            channelsKt__DeprecatedKt$last$1 = (ChannelsKt__DeprecatedKt$last$1) continuation;
            int i12 = channelsKt__DeprecatedKt$last$1.f106193w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$last$1.f106193w = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$last$1.f106192v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$last$1.f106193w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Object obj2 = channelsKt__DeprecatedKt$last$1.f106191u;
                            channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$last$1.f106190t;
                            ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$last$1.f106189s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    next = channelIterator2.next();
                                    receiveChannel = receiveChannel3;
                                    channelsKt__DeprecatedKt$last$1.f106189s = receiveChannel;
                                    channelsKt__DeprecatedKt$last$1.f106190t = channelIterator2;
                                    channelsKt__DeprecatedKt$last$1.f106191u = next;
                                    channelsKt__DeprecatedKt$last$1.f106193w = 2;
                                    mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$last$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    receiveChannel3 = receiveChannel;
                                    obj2 = next;
                                    obj = mo113028a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        ChannelsKt.m113108b(receiveChannel3, null);
                                        return obj2;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ChannelsKt.m113108b(receiveChannel2, th);
                                    throw th3;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$last$1.f106190t;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$last$1.f106189s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$last$1.f106189s = receiveChannel;
                        channelsKt__DeprecatedKt$last$1.f106190t = it;
                        channelsKt__DeprecatedKt$last$1.f106193w = 1;
                        Object mo113028a2 = it.mo113028a(channelsKt__DeprecatedKt$last$1);
                        if (mo113028a2 == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a2;
                    } catch (Throwable th5) {
                        receiveChannel2 = receiveChannel;
                        th = th5;
                        throw th;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    next = channelIterator.next();
                    ReceiveChannel receiveChannel4 = receiveChannel2;
                    channelIterator2 = channelIterator;
                    receiveChannel = receiveChannel4;
                    channelsKt__DeprecatedKt$last$1.f106189s = receiveChannel;
                    channelsKt__DeprecatedKt$last$1.f106190t = channelIterator2;
                    channelsKt__DeprecatedKt$last$1.f106191u = next;
                    channelsKt__DeprecatedKt$last$1.f106193w = 2;
                    mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$last$1);
                    if (mo113028a != m142578e) {
                    }
                } else {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
            }
        }
        channelsKt__DeprecatedKt$last$1 = new ChannelsKt__DeprecatedKt$last$1(continuation);
        obj = channelsKt__DeprecatedKt$last$1.f106192v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$last$1.f106193w;
        if (i11 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0075, B:14:0x007d, B:16:0x0087, B:17:0x008b, B:18:0x005f, B:23:0x0092), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0072 -> B:12:0x0075). Please report as a decompilation issue!!! */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113147k(ReceiveChannel receiveChannel, Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$lastIndexOf$1 channelsKt__DeprecatedKt$lastIndexOf$1;
        Object m142578e;
        int i11;
        C19055h0 c19055h0;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator it;
        C19055h0 c19055h02;
        Object obj2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$lastIndexOf$1) {
            channelsKt__DeprecatedKt$lastIndexOf$1 = (ChannelsKt__DeprecatedKt$lastIndexOf$1) continuation;
            int i12 = channelsKt__DeprecatedKt$lastIndexOf$1.f106200y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastIndexOf$1.f106200y = i12 - Integer.MIN_VALUE;
                Object obj3 = channelsKt__DeprecatedKt$lastIndexOf$1.f106199x;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$lastIndexOf$1.f106200y;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__DeprecatedKt$lastIndexOf$1.f106198w;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$lastIndexOf$1.f106197v;
                        c19055h0 = (C19055h0) channelsKt__DeprecatedKt$lastIndexOf$1.f106196u;
                        c19055h02 = (C19055h0) channelsKt__DeprecatedKt$lastIndexOf$1.f106195t;
                        Object obj4 = channelsKt__DeprecatedKt$lastIndexOf$1.f106194s;
                        try {
                            AbstractC24862s.m129228b(obj3);
                            if (((Boolean) obj3).booleanValue()) {
                                if (AbstractC19074t.m100204b(obj4, it.next())) {
                                    c19055h02.f94931p = c19055h0.f94931p;
                                }
                                c19055h0.f94931p++;
                                obj2 = obj4;
                                channelsKt__DeprecatedKt$lastIndexOf$1.f106194s = obj2;
                                channelsKt__DeprecatedKt$lastIndexOf$1.f106195t = c19055h02;
                                channelsKt__DeprecatedKt$lastIndexOf$1.f106196u = c19055h0;
                                channelsKt__DeprecatedKt$lastIndexOf$1.f106197v = receiveChannel2;
                                channelsKt__DeprecatedKt$lastIndexOf$1.f106198w = it;
                                channelsKt__DeprecatedKt$lastIndexOf$1.f106200y = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$lastIndexOf$1);
                                if (mo113028a != m142578e) {
                                    return m142578e;
                                }
                                obj4 = obj2;
                                obj3 = mo113028a;
                                if (((Boolean) obj3).booleanValue()) {
                                }
                            } else {
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                ChannelsKt.m113108b(receiveChannel2, null);
                                return AbstractC29094b.m145341c(c19055h02.f94931p);
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
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj3);
                    C19055h0 c19055h03 = new C19055h0();
                    c19055h03.f94931p = -1;
                    c19055h0 = new C19055h0();
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        c19055h02 = c19055h03;
                        obj2 = obj;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f106194s = obj2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f106195t = c19055h02;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f106196u = c19055h0;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f106197v = receiveChannel2;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f106198w = it;
                        channelsKt__DeprecatedKt$lastIndexOf$1.f106200y = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$lastIndexOf$1);
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
        channelsKt__DeprecatedKt$lastIndexOf$1 = new ChannelsKt__DeprecatedKt$lastIndexOf$1(continuation);
        Object obj32 = channelsKt__DeprecatedKt$lastIndexOf$1.f106199x;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$lastIndexOf$1.f106200y;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0033, B:13:0x008f, B:15:0x0097), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004f, blocks: (B:40:0x004b, B:41:0x0069, B:45:0x0075), top: B:39:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008b -> B:13:0x008f). Please report as a decompilation issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113148l(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$lastOrNull$1 channelsKt__DeprecatedKt$lastOrNull$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Object next;
        ChannelIterator channelIterator2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$lastOrNull$1) {
            channelsKt__DeprecatedKt$lastOrNull$1 = (ChannelsKt__DeprecatedKt$lastOrNull$1) continuation;
            int i12 = channelsKt__DeprecatedKt$lastOrNull$1.f106205w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$lastOrNull$1.f106205w = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$lastOrNull$1.f106204v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$lastOrNull$1.f106205w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Object obj2 = channelsKt__DeprecatedKt$lastOrNull$1.f106203u;
                            channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.f106202t;
                            ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.f106201s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    next = channelIterator2.next();
                                    receiveChannel = receiveChannel3;
                                    channelsKt__DeprecatedKt$lastOrNull$1.f106201s = receiveChannel;
                                    channelsKt__DeprecatedKt$lastOrNull$1.f106202t = channelIterator2;
                                    channelsKt__DeprecatedKt$lastOrNull$1.f106203u = next;
                                    channelsKt__DeprecatedKt$lastOrNull$1.f106205w = 2;
                                    mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$lastOrNull$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    receiveChannel3 = receiveChannel;
                                    obj2 = next;
                                    obj = mo113028a;
                                    if (!((Boolean) obj).booleanValue()) {
                                        ChannelsKt.m113108b(receiveChannel3, null);
                                        return obj2;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ChannelsKt.m113108b(receiveChannel2, th);
                                    throw th3;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$lastOrNull$1.f106202t;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$lastOrNull$1.f106201s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$lastOrNull$1.f106201s = receiveChannel;
                        channelsKt__DeprecatedKt$lastOrNull$1.f106202t = it;
                        channelsKt__DeprecatedKt$lastOrNull$1.f106205w = 1;
                        Object mo113028a2 = it.mo113028a(channelsKt__DeprecatedKt$lastOrNull$1);
                        if (mo113028a2 == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a2;
                    } catch (Throwable th5) {
                        receiveChannel2 = receiveChannel;
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ChannelsKt.m113108b(receiveChannel2, null);
                    return null;
                }
                next = channelIterator.next();
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$lastOrNull$1.f106201s = receiveChannel;
                channelsKt__DeprecatedKt$lastOrNull$1.f106202t = channelIterator2;
                channelsKt__DeprecatedKt$lastOrNull$1.f106203u = next;
                channelsKt__DeprecatedKt$lastOrNull$1.f106205w = 2;
                mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$lastOrNull$1);
                if (mo113028a != m142578e) {
                }
            }
        }
        channelsKt__DeprecatedKt$lastOrNull$1 = new ChannelsKt__DeprecatedKt$lastOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$lastOrNull$1.f106204v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$lastOrNull$1.f106205w;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:15:0x00a4, B:17:0x00ac, B:20:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a0 -> B:14:0x003d). Please report as a decompilation issue!!! */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113149m(ReceiveChannel receiveChannel, Comparator comparator, Continuation continuation) {
        ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$maxWith$1) {
            channelsKt__DeprecatedKt$maxWith$1 = (ChannelsKt__DeprecatedKt$maxWith$1) continuation;
            int i12 = channelsKt__DeprecatedKt$maxWith$1.f106226x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$maxWith$1.f106226x = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$maxWith$1.f106225w;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$maxWith$1.f106226x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Object obj2 = channelsKt__DeprecatedKt$maxWith$1.f106224v;
                            channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.f106223u;
                            ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.f106222t;
                            comparator3 = (Comparator) channelsKt__DeprecatedKt$maxWith$1.f106221s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                                Object obj3 = obj2;
                                receiveChannel = receiveChannel3;
                                Object obj4 = m142578e;
                                ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$13 = channelsKt__DeprecatedKt$maxWith$12;
                                if (!((Boolean) obj).booleanValue()) {
                                    next = channelIterator2.next();
                                    if (comparator3.compare(obj3, next) >= 0) {
                                        next = obj3;
                                    }
                                    channelsKt__DeprecatedKt$maxWith$1 = channelsKt__DeprecatedKt$maxWith$13;
                                    m142578e = obj4;
                                    channelsKt__DeprecatedKt$maxWith$1.f106221s = comparator3;
                                    channelsKt__DeprecatedKt$maxWith$1.f106222t = receiveChannel;
                                    channelsKt__DeprecatedKt$maxWith$1.f106223u = channelIterator2;
                                    channelsKt__DeprecatedKt$maxWith$1.f106224v = next;
                                    channelsKt__DeprecatedKt$maxWith$1.f106226x = 2;
                                    mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$maxWith$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    channelsKt__DeprecatedKt$maxWith$12 = channelsKt__DeprecatedKt$maxWith$1;
                                    obj3 = next;
                                    obj = mo113028a;
                                    Object obj42 = m142578e;
                                    ChannelsKt__DeprecatedKt$maxWith$1 channelsKt__DeprecatedKt$maxWith$132 = channelsKt__DeprecatedKt$maxWith$12;
                                    if (!((Boolean) obj).booleanValue()) {
                                        ChannelsKt.m113108b(receiveChannel, null);
                                        return obj3;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ChannelsKt.m113108b(receiveChannel2, th);
                                    throw th3;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$maxWith$1.f106223u;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$maxWith$1.f106222t;
                        comparator2 = (Comparator) channelsKt__DeprecatedKt$maxWith$1.f106221s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$maxWith$1.f106221s = comparator;
                        channelsKt__DeprecatedKt$maxWith$1.f106222t = receiveChannel;
                        channelsKt__DeprecatedKt$maxWith$1.f106223u = it;
                        channelsKt__DeprecatedKt$maxWith$1.f106226x = 1;
                        Object mo113028a2 = it.mo113028a(channelsKt__DeprecatedKt$maxWith$1);
                        if (mo113028a2 == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a2;
                        comparator2 = comparator;
                    } catch (Throwable th5) {
                        receiveChannel2 = receiveChannel;
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ChannelsKt.m113108b(receiveChannel2, null);
                    return null;
                }
                next = channelIterator.next();
                comparator3 = comparator2;
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$maxWith$1.f106221s = comparator3;
                channelsKt__DeprecatedKt$maxWith$1.f106222t = receiveChannel;
                channelsKt__DeprecatedKt$maxWith$1.f106223u = channelIterator2;
                channelsKt__DeprecatedKt$maxWith$1.f106224v = next;
                channelsKt__DeprecatedKt$maxWith$1.f106226x = 2;
                mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$maxWith$1);
                if (mo113028a != m142578e) {
                }
            }
        }
        channelsKt__DeprecatedKt$maxWith$1 = new ChannelsKt__DeprecatedKt$maxWith$1(continuation);
        obj = channelsKt__DeprecatedKt$maxWith$1.f106225w;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$maxWith$1.f106226x;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #2 {all -> 0x00bb, blocks: (B:15:0x00a4, B:17:0x00ac, B:20:0x008f, B:55:0x0063), top: B:54:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:44:0x0059, B:45:0x007b, B:49:0x0087), top: B:43:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a0 -> B:14:0x003d). Please report as a decompilation issue!!! */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113150n(ReceiveChannel receiveChannel, Comparator comparator, Continuation continuation) {
        ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        ChannelIterator channelIterator;
        Comparator comparator2;
        Object next;
        Comparator comparator3;
        ChannelIterator channelIterator2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$minWith$1) {
            channelsKt__DeprecatedKt$minWith$1 = (ChannelsKt__DeprecatedKt$minWith$1) continuation;
            int i12 = channelsKt__DeprecatedKt$minWith$1.f106232x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$minWith$1.f106232x = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$minWith$1.f106231w;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$minWith$1.f106232x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Object obj2 = channelsKt__DeprecatedKt$minWith$1.f106230v;
                            channelIterator2 = (ChannelIterator) channelsKt__DeprecatedKt$minWith$1.f106229u;
                            ReceiveChannel receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.f106228t;
                            comparator3 = (Comparator) channelsKt__DeprecatedKt$minWith$1.f106227s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                                Object obj3 = obj2;
                                receiveChannel = receiveChannel3;
                                Object obj4 = m142578e;
                                ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$13 = channelsKt__DeprecatedKt$minWith$12;
                                if (!((Boolean) obj).booleanValue()) {
                                    next = channelIterator2.next();
                                    if (comparator3.compare(obj3, next) <= 0) {
                                        next = obj3;
                                    }
                                    channelsKt__DeprecatedKt$minWith$1 = channelsKt__DeprecatedKt$minWith$13;
                                    m142578e = obj4;
                                    channelsKt__DeprecatedKt$minWith$1.f106227s = comparator3;
                                    channelsKt__DeprecatedKt$minWith$1.f106228t = receiveChannel;
                                    channelsKt__DeprecatedKt$minWith$1.f106229u = channelIterator2;
                                    channelsKt__DeprecatedKt$minWith$1.f106230v = next;
                                    channelsKt__DeprecatedKt$minWith$1.f106232x = 2;
                                    mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$minWith$1);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    channelsKt__DeprecatedKt$minWith$12 = channelsKt__DeprecatedKt$minWith$1;
                                    obj3 = next;
                                    obj = mo113028a;
                                    Object obj42 = m142578e;
                                    ChannelsKt__DeprecatedKt$minWith$1 channelsKt__DeprecatedKt$minWith$132 = channelsKt__DeprecatedKt$minWith$12;
                                    if (!((Boolean) obj).booleanValue()) {
                                        ChannelsKt.m113108b(receiveChannel, null);
                                        return obj3;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ChannelsKt.m113108b(receiveChannel2, th);
                                    throw th3;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$minWith$1.f106229u;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$minWith$1.f106228t;
                        comparator2 = (Comparator) channelsKt__DeprecatedKt$minWith$1.f106227s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th4) {
                            th = th4;
                            throw th;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$minWith$1.f106227s = comparator;
                        channelsKt__DeprecatedKt$minWith$1.f106228t = receiveChannel;
                        channelsKt__DeprecatedKt$minWith$1.f106229u = it;
                        channelsKt__DeprecatedKt$minWith$1.f106232x = 1;
                        Object mo113028a2 = it.mo113028a(channelsKt__DeprecatedKt$minWith$1);
                        if (mo113028a2 == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a2;
                        comparator2 = comparator;
                    } catch (Throwable th5) {
                        receiveChannel2 = receiveChannel;
                        th = th5;
                        throw th;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ChannelsKt.m113108b(receiveChannel2, null);
                    return null;
                }
                next = channelIterator.next();
                comparator3 = comparator2;
                ReceiveChannel receiveChannel4 = receiveChannel2;
                channelIterator2 = channelIterator;
                receiveChannel = receiveChannel4;
                channelsKt__DeprecatedKt$minWith$1.f106227s = comparator3;
                channelsKt__DeprecatedKt$minWith$1.f106228t = receiveChannel;
                channelsKt__DeprecatedKt$minWith$1.f106229u = channelIterator2;
                channelsKt__DeprecatedKt$minWith$1.f106230v = next;
                channelsKt__DeprecatedKt$minWith$1.f106232x = 2;
                mo113028a = channelIterator2.mo113028a(channelsKt__DeprecatedKt$minWith$1);
                if (mo113028a != m142578e) {
                }
            }
        }
        channelsKt__DeprecatedKt$minWith$1 = new ChannelsKt__DeprecatedKt$minWith$1(continuation);
        obj = channelsKt__DeprecatedKt$minWith$1.f106231w;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$minWith$1.f106232x;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113151o(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$none$1 channelsKt__DeprecatedKt$none$1;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$none$1) {
                channelsKt__DeprecatedKt$none$1 = (ChannelsKt__DeprecatedKt$none$1) continuation;
                int i12 = channelsKt__DeprecatedKt$none$1.f106235u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$none$1.f106235u = i12 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$none$1.f106234t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = channelsKt__DeprecatedKt$none$1.f106235u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            receiveChannel = (ReceiveChannel) channelsKt__DeprecatedKt$none$1.f106233s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$none$1.f106233s = receiveChannel;
                        channelsKt__DeprecatedKt$none$1.f106235u = 1;
                        obj = it.mo113028a(channelsKt__DeprecatedKt$none$1);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    Boolean m145339a = AbstractC29094b.m145339a(!((Boolean) obj).booleanValue());
                    ChannelsKt.m113108b(receiveChannel, null);
                    return m145339a;
                }
            }
            if (i11 == 0) {
            }
            Boolean m145339a2 = AbstractC29094b.m145339a(!((Boolean) obj).booleanValue());
            ChannelsKt.m113108b(receiveChannel, null);
            return m145339a2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ChannelsKt.m113108b(receiveChannel, th2);
                throw th3;
            }
        }
        channelsKt__DeprecatedKt$none$1 = new ChannelsKt__DeprecatedKt$none$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$none$1.f106234t;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$none$1.f106235u;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002e, B:13:0x0081, B:18:0x008e, B:19:0x0095), top: B:11:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #2 {all -> 0x004a, blocks: (B:33:0x0046, B:34:0x0064, B:36:0x006c, B:40:0x0096, B:41:0x009d), top: B:32:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113152p(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$single$1 channelsKt__DeprecatedKt$single$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj2;
        if (continuation instanceof ChannelsKt__DeprecatedKt$single$1) {
            channelsKt__DeprecatedKt$single$1 = (ChannelsKt__DeprecatedKt$single$1) continuation;
            int i12 = channelsKt__DeprecatedKt$single$1.f106242v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$single$1.f106242v = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$single$1.f106241u;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$single$1.f106242v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj2 = channelsKt__DeprecatedKt$single$1.f106240t;
                            receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.f106239s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    ChannelsKt.m113108b(receiveChannel3, null);
                                    return obj2;
                                }
                                throw new IllegalArgumentException("ReceiveChannel has more than one element.");
                            } catch (Throwable th3) {
                                th2 = th3;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    ChannelsKt.m113108b(receiveChannel2, th2);
                                    throw th4;
                                }
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$single$1.f106240t;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$single$1.f106239s;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        throw th2;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$single$1.f106239s = receiveChannel;
                        channelsKt__DeprecatedKt$single$1.f106240t = it;
                        channelsKt__DeprecatedKt$single$1.f106242v = 1;
                        Object mo113028a = it.mo113028a(channelsKt__DeprecatedKt$single$1);
                        if (mo113028a == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a;
                    } catch (Throwable th6) {
                        receiveChannel2 = receiveChannel;
                        th2 = th6;
                        throw th2;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    Object next = channelIterator.next();
                    channelsKt__DeprecatedKt$single$1.f106239s = receiveChannel2;
                    channelsKt__DeprecatedKt$single$1.f106240t = next;
                    channelsKt__DeprecatedKt$single$1.f106242v = 2;
                    Object mo113028a2 = channelIterator.mo113028a(channelsKt__DeprecatedKt$single$1);
                    if (mo113028a2 == m142578e) {
                        return m142578e;
                    }
                    receiveChannel3 = receiveChannel2;
                    obj = mo113028a2;
                    obj2 = next;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    throw new NoSuchElementException("ReceiveChannel is empty.");
                }
            }
        }
        channelsKt__DeprecatedKt$single$1 = new ChannelsKt__DeprecatedKt$single$1(continuation);
        obj = channelsKt__DeprecatedKt$single$1.f106241u;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$single$1.f106242v;
        if (i11 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071 A[Catch: all -> 0x004b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:33:0x0047, B:34:0x0065, B:38:0x0071), top: B:32:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ Object m113153q(ReceiveChannel receiveChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$singleOrNull$1 channelsKt__DeprecatedKt$singleOrNull$1;
        Object obj;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator channelIterator;
        ReceiveChannel receiveChannel3;
        Object obj2;
        if (continuation instanceof ChannelsKt__DeprecatedKt$singleOrNull$1) {
            channelsKt__DeprecatedKt$singleOrNull$1 = (ChannelsKt__DeprecatedKt$singleOrNull$1) continuation;
            int i12 = channelsKt__DeprecatedKt$singleOrNull$1.f106246v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$singleOrNull$1.f106246v = i12 - Integer.MIN_VALUE;
                obj = channelsKt__DeprecatedKt$singleOrNull$1.f106245u;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$singleOrNull$1.f106246v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            obj2 = channelsKt__DeprecatedKt$singleOrNull$1.f106244t;
                            receiveChannel3 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.f106243s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    ChannelsKt.m113108b(receiveChannel3, null);
                                    return null;
                                }
                                ChannelsKt.m113108b(receiveChannel3, null);
                                return obj2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                receiveChannel2 = receiveChannel3;
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    ChannelsKt.m113108b(receiveChannel2, th2);
                                    throw th4;
                                }
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$singleOrNull$1.f106244t;
                    receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$singleOrNull$1.f106243s;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Throwable th5) {
                        th2 = th5;
                        throw th2;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        ChannelIterator it = receiveChannel.iterator();
                        channelsKt__DeprecatedKt$singleOrNull$1.f106243s = receiveChannel;
                        channelsKt__DeprecatedKt$singleOrNull$1.f106244t = it;
                        channelsKt__DeprecatedKt$singleOrNull$1.f106246v = 1;
                        Object mo113028a = it.mo113028a(channelsKt__DeprecatedKt$singleOrNull$1);
                        if (mo113028a == m142578e) {
                            return m142578e;
                        }
                        receiveChannel2 = receiveChannel;
                        channelIterator = it;
                        obj = mo113028a;
                    } catch (Throwable th6) {
                        receiveChannel2 = receiveChannel;
                        th2 = th6;
                        throw th2;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    ChannelsKt.m113108b(receiveChannel2, null);
                    return null;
                }
                Object next = channelIterator.next();
                channelsKt__DeprecatedKt$singleOrNull$1.f106243s = receiveChannel2;
                channelsKt__DeprecatedKt$singleOrNull$1.f106244t = next;
                channelsKt__DeprecatedKt$singleOrNull$1.f106246v = 2;
                Object mo113028a2 = channelIterator.mo113028a(channelsKt__DeprecatedKt$singleOrNull$1);
                if (mo113028a2 == m142578e) {
                    return m142578e;
                }
                receiveChannel3 = receiveChannel2;
                obj = mo113028a2;
                obj2 = next;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }
        channelsKt__DeprecatedKt$singleOrNull$1 = new ChannelsKt__DeprecatedKt$singleOrNull$1(continuation);
        obj = channelsKt__DeprecatedKt$singleOrNull$1.f106245u;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$singleOrNull$1.f106246v;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x003b, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0034, B:19:0x0070, B:21:0x0078, B:24:0x008b, B:40:0x0051), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlinx.coroutines.channels.ReceiveChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0088 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113154r(ReceiveChannel receiveChannel, SendChannel sendChannel, Continuation continuation) {
        ChannelsKt__DeprecatedKt$toChannel$1 channelsKt__DeprecatedKt$toChannel$1;
        Object m142578e;
        int i11;
        ChannelIterator it;
        ChannelIterator channelIterator;
        SendChannel sendChannel2;
        SendChannel sendChannel3;
        Object mo113028a;
        try {
            if (continuation instanceof ChannelsKt__DeprecatedKt$toChannel$1) {
                channelsKt__DeprecatedKt$toChannel$1 = (ChannelsKt__DeprecatedKt$toChannel$1) continuation;
                int i12 = channelsKt__DeprecatedKt$toChannel$1.f106263w;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    channelsKt__DeprecatedKt$toChannel$1.f106263w = i12 - Integer.MIN_VALUE;
                    Object obj = channelsKt__DeprecatedKt$toChannel$1.f106262v;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = channelsKt__DeprecatedKt$toChannel$1.f106263w;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.f106261u;
                                ReceiveChannel receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.f106260t;
                                sendChannel2 = (SendChannel) channelsKt__DeprecatedKt$toChannel$1.f106259s;
                                AbstractC24862s.m129228b(obj);
                                ReceiveChannel receiveChannel3 = receiveChannel2;
                                it = channelIterator;
                                receiveChannel = receiveChannel3;
                                sendChannel3 = sendChannel2;
                                channelsKt__DeprecatedKt$toChannel$1.f106259s = sendChannel3;
                                channelsKt__DeprecatedKt$toChannel$1.f106260t = receiveChannel;
                                channelsKt__DeprecatedKt$toChannel$1.f106261u = it;
                                channelsKt__DeprecatedKt$toChannel$1.f106263w = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$toChannel$1);
                                if (mo113028a == m142578e) {
                                    return m142578e;
                                }
                                SendChannel sendChannel4 = sendChannel3;
                                sendChannel = receiveChannel;
                                channelIterator = it;
                                obj = mo113028a;
                                sendChannel2 = sendChannel4;
                                if (!((Boolean) obj).booleanValue()) {
                                    Object next = channelIterator.next();
                                    channelsKt__DeprecatedKt$toChannel$1.f106259s = sendChannel2;
                                    channelsKt__DeprecatedKt$toChannel$1.f106260t = sendChannel;
                                    channelsKt__DeprecatedKt$toChannel$1.f106261u = channelIterator;
                                    channelsKt__DeprecatedKt$toChannel$1.f106263w = 2;
                                    receiveChannel3 = sendChannel;
                                    if (sendChannel2.mo112908S(next, channelsKt__DeprecatedKt$toChannel$1) == m142578e) {
                                        return m142578e;
                                    }
                                    it = channelIterator;
                                    receiveChannel = receiveChannel3;
                                    sendChannel3 = sendChannel2;
                                    channelsKt__DeprecatedKt$toChannel$1.f106259s = sendChannel3;
                                    channelsKt__DeprecatedKt$toChannel$1.f106260t = receiveChannel;
                                    channelsKt__DeprecatedKt$toChannel$1.f106261u = it;
                                    channelsKt__DeprecatedKt$toChannel$1.f106263w = 1;
                                    mo113028a = it.mo113028a(channelsKt__DeprecatedKt$toChannel$1);
                                    if (mo113028a == m142578e) {
                                    }
                                } else {
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    ChannelsKt.m113108b(sendChannel, null);
                                    return sendChannel2;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            channelIterator = (ChannelIterator) channelsKt__DeprecatedKt$toChannel$1.f106261u;
                            ReceiveChannel receiveChannel4 = (ReceiveChannel) channelsKt__DeprecatedKt$toChannel$1.f106260t;
                            sendChannel2 = (SendChannel) channelsKt__DeprecatedKt$toChannel$1.f106259s;
                            AbstractC24862s.m129228b(obj);
                            sendChannel = receiveChannel4;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        try {
                            it = receiveChannel.iterator();
                            sendChannel3 = sendChannel;
                            channelsKt__DeprecatedKt$toChannel$1.f106259s = sendChannel3;
                            channelsKt__DeprecatedKt$toChannel$1.f106260t = receiveChannel;
                            channelsKt__DeprecatedKt$toChannel$1.f106261u = it;
                            channelsKt__DeprecatedKt$toChannel$1.f106263w = 1;
                            mo113028a = it.mo113028a(channelsKt__DeprecatedKt$toChannel$1);
                            if (mo113028a == m142578e) {
                            }
                        } catch (Throwable th2) {
                            sendChannel = receiveChannel;
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                ChannelsKt.m113108b(sendChannel, th);
                                throw th3;
                            }
                        }
                    }
                }
            }
            if (i11 == 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        channelsKt__DeprecatedKt$toChannel$1 = new ChannelsKt__DeprecatedKt$toChannel$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$toChannel$1.f106262v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$toChannel$1.f106263w;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x006d), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113155s(ReceiveChannel receiveChannel, Collection collection, Continuation continuation) {
        ChannelsKt__DeprecatedKt$toCollection$1 channelsKt__DeprecatedKt$toCollection$1;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator it;
        Collection collection2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$toCollection$1) {
            channelsKt__DeprecatedKt$toCollection$1 = (ChannelsKt__DeprecatedKt$toCollection$1) continuation;
            int i12 = channelsKt__DeprecatedKt$toCollection$1.f106268w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toCollection$1.f106268w = i12 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$toCollection$1.f106267v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$toCollection$1.f106268w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__DeprecatedKt$toCollection$1.f106266u;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$toCollection$1.f106265t;
                        Collection collection3 = (Collection) channelsKt__DeprecatedKt$toCollection$1.f106264s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                collection3.add(it.next());
                                collection2 = collection3;
                                channelsKt__DeprecatedKt$toCollection$1.f106264s = collection2;
                                channelsKt__DeprecatedKt$toCollection$1.f106265t = receiveChannel2;
                                channelsKt__DeprecatedKt$toCollection$1.f106266u = it;
                                channelsKt__DeprecatedKt$toCollection$1.f106268w = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$toCollection$1);
                                if (mo113028a != m142578e) {
                                    return m142578e;
                                }
                                collection3 = collection2;
                                obj = mo113028a;
                                if (!((Boolean) obj).booleanValue()) {
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    ChannelsKt.m113108b(receiveChannel2, null);
                                    return collection3;
                                }
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
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        collection2 = collection;
                        channelsKt__DeprecatedKt$toCollection$1.f106264s = collection2;
                        channelsKt__DeprecatedKt$toCollection$1.f106265t = receiveChannel2;
                        channelsKt__DeprecatedKt$toCollection$1.f106266u = it;
                        channelsKt__DeprecatedKt$toCollection$1.f106268w = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$toCollection$1);
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
        channelsKt__DeprecatedKt$toCollection$1 = new ChannelsKt__DeprecatedKt$toCollection$1(continuation);
        Object obj2 = channelsKt__DeprecatedKt$toCollection$1.f106267v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$toCollection$1.f106268w;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x005c, B:14:0x0064, B:15:0x004a, B:20:0x0077), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113156t(ReceiveChannel receiveChannel, Map map, Continuation continuation) {
        ChannelsKt__DeprecatedKt$toMap$2 channelsKt__DeprecatedKt$toMap$2;
        Object m142578e;
        int i11;
        ReceiveChannel receiveChannel2;
        Throwable th2;
        ChannelIterator it;
        Map map2;
        Object mo113028a;
        if (continuation instanceof ChannelsKt__DeprecatedKt$toMap$2) {
            channelsKt__DeprecatedKt$toMap$2 = (ChannelsKt__DeprecatedKt$toMap$2) continuation;
            int i12 = channelsKt__DeprecatedKt$toMap$2.f106273w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                channelsKt__DeprecatedKt$toMap$2.f106273w = i12 - Integer.MIN_VALUE;
                Object obj = channelsKt__DeprecatedKt$toMap$2.f106272v;
                m142578e = AbstractC28298d.m142578e();
                i11 = channelsKt__DeprecatedKt$toMap$2.f106273w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (ChannelIterator) channelsKt__DeprecatedKt$toMap$2.f106271u;
                        receiveChannel2 = (ReceiveChannel) channelsKt__DeprecatedKt$toMap$2.f106270t;
                        Map map3 = (Map) channelsKt__DeprecatedKt$toMap$2.f106269s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                C24860q c24860q = (C24860q) it.next();
                                map3.put(c24860q.m129215c(), c24860q.m129216d());
                                map2 = map3;
                                channelsKt__DeprecatedKt$toMap$2.f106269s = map2;
                                channelsKt__DeprecatedKt$toMap$2.f106270t = receiveChannel2;
                                channelsKt__DeprecatedKt$toMap$2.f106271u = it;
                                channelsKt__DeprecatedKt$toMap$2.f106273w = 1;
                                mo113028a = it.mo113028a(channelsKt__DeprecatedKt$toMap$2);
                                if (mo113028a != m142578e) {
                                    return m142578e;
                                }
                                map3 = map2;
                                obj = mo113028a;
                                if (!((Boolean) obj).booleanValue()) {
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    ChannelsKt.m113108b(receiveChannel2, null);
                                    return map3;
                                }
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
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        map2 = map;
                        channelsKt__DeprecatedKt$toMap$2.f106269s = map2;
                        channelsKt__DeprecatedKt$toMap$2.f106270t = receiveChannel2;
                        channelsKt__DeprecatedKt$toMap$2.f106271u = it;
                        channelsKt__DeprecatedKt$toMap$2.f106273w = 1;
                        mo113028a = it.mo113028a(channelsKt__DeprecatedKt$toMap$2);
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
        channelsKt__DeprecatedKt$toMap$2 = new ChannelsKt__DeprecatedKt$toMap$2(continuation);
        Object obj2 = channelsKt__DeprecatedKt$toMap$2.f106272v;
        m142578e = AbstractC28298d.m142578e();
        i11 = channelsKt__DeprecatedKt$toMap$2.f106273w;
        if (i11 == 0) {
        }
    }
}
