package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public interface ChannelIterator<E> {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ Object m113077a(ChannelIterator channelIterator, Continuation continuation) {
            ChannelIterator$next0$1 channelIterator$next0$1;
            Object obj;
            Object m142578e;
            int i11;
            if (continuation instanceof ChannelIterator$next0$1) {
                channelIterator$next0$1 = (ChannelIterator$next0$1) continuation;
                int i12 = channelIterator$next0$1.f106069u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    channelIterator$next0$1.f106069u = i12 - Integer.MIN_VALUE;
                    obj = channelIterator$next0$1.f106068t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = channelIterator$next0$1.f106069u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            channelIterator = (ChannelIterator) channelIterator$next0$1.f106067s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        channelIterator$next0$1.f106067s = channelIterator;
                        channelIterator$next0$1.f106069u = 1;
                        obj = channelIterator.mo113028a(channelIterator$next0$1);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return channelIterator.next();
                    }
                    throw new ClosedReceiveChannelException("Channel was closed");
                }
            }
            channelIterator$next0$1 = new ChannelIterator$next0$1(continuation);
            obj = channelIterator$next0$1.f106068t;
            m142578e = AbstractC28298d.m142578e();
            i11 = channelIterator$next0$1.f106069u;
            if (i11 == 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    /* renamed from: a */
    Object mo113028a(Continuation continuation);

    Object next();
}
