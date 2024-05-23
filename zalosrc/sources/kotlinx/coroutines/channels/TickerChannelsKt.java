package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AbstractTimeSource;
import kotlinx.coroutines.AbstractTimeSourceKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.EventLoop_commonKt;
import ln0.AbstractC22543l;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class TickerChannelsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:12:0x0034). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113198c(long j11, long j12, SendChannel sendChannel, Continuation continuation) {
        TickerChannelsKt$fixedDelayTicker$1 tickerChannelsKt$fixedDelayTicker$1;
        Object m142578e;
        int i11;
        SendChannel sendChannel2;
        C24848g0 c24848g0;
        if (continuation instanceof TickerChannelsKt$fixedDelayTicker$1) {
            tickerChannelsKt$fixedDelayTicker$1 = (TickerChannelsKt$fixedDelayTicker$1) continuation;
            int i12 = tickerChannelsKt$fixedDelayTicker$1.f106308v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedDelayTicker$1.f106308v = i12 - Integer.MIN_VALUE;
                Object obj = tickerChannelsKt$fixedDelayTicker$1.f106307u;
                m142578e = AbstractC28298d.m142578e();
                i11 = tickerChannelsKt$fixedDelayTicker$1.f106308v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                j11 = tickerChannelsKt$fixedDelayTicker$1.f106305s;
                                sendChannel2 = (SendChannel) tickerChannelsKt$fixedDelayTicker$1.f106306t;
                                AbstractC24862s.m129228b(obj);
                                sendChannel = sendChannel2;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            j11 = tickerChannelsKt$fixedDelayTicker$1.f106305s;
                            sendChannel2 = (SendChannel) tickerChannelsKt$fixedDelayTicker$1.f106306t;
                            AbstractC24862s.m129228b(obj);
                            tickerChannelsKt$fixedDelayTicker$1.f106306t = sendChannel2;
                            tickerChannelsKt$fixedDelayTicker$1.f106305s = j11;
                            tickerChannelsKt$fixedDelayTicker$1.f106308v = 3;
                            if (DelayKt.m112666b(j11, tickerChannelsKt$fixedDelayTicker$1) == m142578e) {
                                return m142578e;
                            }
                            sendChannel = sendChannel2;
                        }
                    } else {
                        j11 = tickerChannelsKt$fixedDelayTicker$1.f106305s;
                        sendChannel = (SendChannel) tickerChannelsKt$fixedDelayTicker$1.f106306t;
                        AbstractC24862s.m129228b(obj);
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    tickerChannelsKt$fixedDelayTicker$1.f106306t = sendChannel;
                    tickerChannelsKt$fixedDelayTicker$1.f106305s = j11;
                    tickerChannelsKt$fixedDelayTicker$1.f106308v = 1;
                    if (DelayKt.m112666b(j12, tickerChannelsKt$fixedDelayTicker$1) == m142578e) {
                        return m142578e;
                    }
                }
                c24848g0 = C24848g0.f119245a;
                tickerChannelsKt$fixedDelayTicker$1.f106306t = sendChannel;
                tickerChannelsKt$fixedDelayTicker$1.f106305s = j11;
                tickerChannelsKt$fixedDelayTicker$1.f106308v = 2;
                if (sendChannel.mo112908S(c24848g0, tickerChannelsKt$fixedDelayTicker$1) == m142578e) {
                    return m142578e;
                }
                sendChannel2 = sendChannel;
                tickerChannelsKt$fixedDelayTicker$1.f106306t = sendChannel2;
                tickerChannelsKt$fixedDelayTicker$1.f106305s = j11;
                tickerChannelsKt$fixedDelayTicker$1.f106308v = 3;
                if (DelayKt.m112666b(j11, tickerChannelsKt$fixedDelayTicker$1) == m142578e) {
                }
                sendChannel = sendChannel2;
                c24848g0 = C24848g0.f119245a;
                tickerChannelsKt$fixedDelayTicker$1.f106306t = sendChannel;
                tickerChannelsKt$fixedDelayTicker$1.f106305s = j11;
                tickerChannelsKt$fixedDelayTicker$1.f106308v = 2;
                if (sendChannel.mo112908S(c24848g0, tickerChannelsKt$fixedDelayTicker$1) == m142578e) {
                }
            }
        }
        tickerChannelsKt$fixedDelayTicker$1 = new TickerChannelsKt$fixedDelayTicker$1(continuation);
        Object obj2 = tickerChannelsKt$fixedDelayTicker$1.f106307u;
        m142578e = AbstractC28298d.m142578e();
        i11 = tickerChannelsKt$fixedDelayTicker$1.f106308v;
        if (i11 == 0) {
        }
        c24848g0 = C24848g0.f119245a;
        tickerChannelsKt$fixedDelayTicker$1.f106306t = sendChannel;
        tickerChannelsKt$fixedDelayTicker$1.f106305s = j11;
        tickerChannelsKt$fixedDelayTicker$1.f106308v = 2;
        if (sendChannel.mo112908S(c24848g0, tickerChannelsKt$fixedDelayTicker$1) == m142578e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f3 -> B:13:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x010c -> B:13:0x0052). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113199d(long j11, long j12, SendChannel sendChannel, Continuation continuation) {
        TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$1;
        Object m142578e;
        int i11;
        long nanoTime;
        SendChannel sendChannel2;
        long j13;
        long j14;
        long m112721d;
        long j15;
        long j16;
        SendChannel sendChannel3;
        AbstractTimeSource m112510a;
        long nanoTime2;
        long m116581d;
        long m112720c;
        C24848g0 c24848g0;
        if (continuation instanceof TickerChannelsKt$fixedPeriodTicker$1) {
            tickerChannelsKt$fixedPeriodTicker$1 = (TickerChannelsKt$fixedPeriodTicker$1) continuation;
            int i12 = tickerChannelsKt$fixedPeriodTicker$1.f106313w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedPeriodTicker$1.f106313w = i12 - Integer.MIN_VALUE;
                Object obj = tickerChannelsKt$fixedPeriodTicker$1.f106312v;
                m142578e = AbstractC28298d.m142578e();
                i11 = tickerChannelsKt$fixedPeriodTicker$1.f106313w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    j16 = tickerChannelsKt$fixedPeriodTicker$1.f106310t;
                                    j15 = tickerChannelsKt$fixedPeriodTicker$1.f106309s;
                                    sendChannel3 = (SendChannel) tickerChannelsKt$fixedPeriodTicker$1.f106311u;
                                    AbstractC24862s.m129228b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                j16 = tickerChannelsKt$fixedPeriodTicker$1.f106310t;
                                j15 = tickerChannelsKt$fixedPeriodTicker$1.f106309s;
                                sendChannel3 = (SendChannel) tickerChannelsKt$fixedPeriodTicker$1.f106311u;
                                AbstractC24862s.m129228b(obj);
                            }
                            long j17 = j16;
                            j14 = j15;
                            m112721d = j17;
                            sendChannel2 = sendChannel3;
                            long j18 = j14 + m112721d;
                            c24848g0 = C24848g0.f119245a;
                            tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel2;
                            tickerChannelsKt$fixedPeriodTicker$1.f106309s = j18;
                            tickerChannelsKt$fixedPeriodTicker$1.f106310t = m112721d;
                            tickerChannelsKt$fixedPeriodTicker$1.f106313w = 2;
                            if (sendChannel2.mo112908S(c24848g0, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                                return m142578e;
                            }
                            sendChannel3 = sendChannel2;
                            j16 = m112721d;
                            j15 = j18;
                            m112510a = AbstractTimeSourceKt.m112510a();
                            if (m112510a == null) {
                                nanoTime2 = m112510a.m112502a();
                            } else {
                                nanoTime2 = System.nanoTime();
                            }
                            m116581d = AbstractC22543l.m116581d(j15 - nanoTime2, 0L);
                            if (m116581d != 0 && j16 != 0) {
                                long j19 = j16 - ((nanoTime2 - j15) % j16);
                                j15 = nanoTime2 + j19;
                                long m112720c2 = EventLoop_commonKt.m112720c(j19);
                                tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel3;
                                tickerChannelsKt$fixedPeriodTicker$1.f106309s = j15;
                                tickerChannelsKt$fixedPeriodTicker$1.f106310t = j16;
                                tickerChannelsKt$fixedPeriodTicker$1.f106313w = 3;
                                if (DelayKt.m112666b(m112720c2, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                                    return m142578e;
                                }
                            } else {
                                m112720c = EventLoop_commonKt.m112720c(m116581d);
                                tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel3;
                                tickerChannelsKt$fixedPeriodTicker$1.f106309s = j15;
                                tickerChannelsKt$fixedPeriodTicker$1.f106310t = j16;
                                tickerChannelsKt$fixedPeriodTicker$1.f106313w = 4;
                                if (DelayKt.m112666b(m112720c, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                                    return m142578e;
                                }
                            }
                            long j172 = j16;
                            j14 = j15;
                            m112721d = j172;
                            sendChannel2 = sendChannel3;
                            long j182 = j14 + m112721d;
                            c24848g0 = C24848g0.f119245a;
                            tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel2;
                            tickerChannelsKt$fixedPeriodTicker$1.f106309s = j182;
                            tickerChannelsKt$fixedPeriodTicker$1.f106310t = m112721d;
                            tickerChannelsKt$fixedPeriodTicker$1.f106313w = 2;
                            if (sendChannel2.mo112908S(c24848g0, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                            }
                        } else {
                            j16 = tickerChannelsKt$fixedPeriodTicker$1.f106310t;
                            j15 = tickerChannelsKt$fixedPeriodTicker$1.f106309s;
                            sendChannel3 = (SendChannel) tickerChannelsKt$fixedPeriodTicker$1.f106311u;
                            AbstractC24862s.m129228b(obj);
                            m112510a = AbstractTimeSourceKt.m112510a();
                            if (m112510a == null) {
                            }
                            m116581d = AbstractC22543l.m116581d(j15 - nanoTime2, 0L);
                            if (m116581d != 0) {
                            }
                            m112720c = EventLoop_commonKt.m112720c(m116581d);
                            tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel3;
                            tickerChannelsKt$fixedPeriodTicker$1.f106309s = j15;
                            tickerChannelsKt$fixedPeriodTicker$1.f106310t = j16;
                            tickerChannelsKt$fixedPeriodTicker$1.f106313w = 4;
                            if (DelayKt.m112666b(m112720c, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                            }
                            long j1722 = j16;
                            j14 = j15;
                            m112721d = j1722;
                            sendChannel2 = sendChannel3;
                            long j1822 = j14 + m112721d;
                            c24848g0 = C24848g0.f119245a;
                            tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel2;
                            tickerChannelsKt$fixedPeriodTicker$1.f106309s = j1822;
                            tickerChannelsKt$fixedPeriodTicker$1.f106310t = m112721d;
                            tickerChannelsKt$fixedPeriodTicker$1.f106313w = 2;
                            if (sendChannel2.mo112908S(c24848g0, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                            }
                        }
                    } else {
                        j14 = tickerChannelsKt$fixedPeriodTicker$1.f106310t;
                        long j21 = tickerChannelsKt$fixedPeriodTicker$1.f106309s;
                        SendChannel sendChannel4 = (SendChannel) tickerChannelsKt$fixedPeriodTicker$1.f106311u;
                        AbstractC24862s.m129228b(obj);
                        sendChannel2 = sendChannel4;
                        j13 = j21;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    AbstractTimeSource m112510a2 = AbstractTimeSourceKt.m112510a();
                    if (m112510a2 != null) {
                        nanoTime = m112510a2.m112502a();
                    } else {
                        nanoTime = System.nanoTime();
                    }
                    long m112721d2 = nanoTime + EventLoop_commonKt.m112721d(j12);
                    sendChannel2 = sendChannel;
                    tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel2;
                    j13 = j11;
                    tickerChannelsKt$fixedPeriodTicker$1.f106309s = j13;
                    tickerChannelsKt$fixedPeriodTicker$1.f106310t = m112721d2;
                    tickerChannelsKt$fixedPeriodTicker$1.f106313w = 1;
                    if (DelayKt.m112666b(j12, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                        return m142578e;
                    }
                    j14 = m112721d2;
                }
                m112721d = EventLoop_commonKt.m112721d(j13);
                long j18222 = j14 + m112721d;
                c24848g0 = C24848g0.f119245a;
                tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel2;
                tickerChannelsKt$fixedPeriodTicker$1.f106309s = j18222;
                tickerChannelsKt$fixedPeriodTicker$1.f106310t = m112721d;
                tickerChannelsKt$fixedPeriodTicker$1.f106313w = 2;
                if (sendChannel2.mo112908S(c24848g0, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
                }
            }
        }
        tickerChannelsKt$fixedPeriodTicker$1 = new TickerChannelsKt$fixedPeriodTicker$1(continuation);
        Object obj2 = tickerChannelsKt$fixedPeriodTicker$1.f106312v;
        m142578e = AbstractC28298d.m142578e();
        i11 = tickerChannelsKt$fixedPeriodTicker$1.f106313w;
        if (i11 == 0) {
        }
        m112721d = EventLoop_commonKt.m112721d(j13);
        long j182222 = j14 + m112721d;
        c24848g0 = C24848g0.f119245a;
        tickerChannelsKt$fixedPeriodTicker$1.f106311u = sendChannel2;
        tickerChannelsKt$fixedPeriodTicker$1.f106309s = j182222;
        tickerChannelsKt$fixedPeriodTicker$1.f106310t = m112721d;
        tickerChannelsKt$fixedPeriodTicker$1.f106313w = 2;
        if (sendChannel2.mo112908S(c24848g0, tickerChannelsKt$fixedPeriodTicker$1) == m142578e) {
        }
    }
}
