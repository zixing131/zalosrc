package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;

/* loaded from: classes7.dex */
public final class ChannelKt {
    /* renamed from: a */
    public static final Channel m113078a(int i11, BufferOverflow bufferOverflow, InterfaceC18505l interfaceC18505l) {
        Channel conflatedBufferedChannel;
        if (i11 != -2) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != Integer.MAX_VALUE) {
                        if (bufferOverflow == BufferOverflow.SUSPEND) {
                            return new BufferedChannel(i11, interfaceC18505l);
                        }
                        return new ConflatedBufferedChannel(i11, bufferOverflow, interfaceC18505l);
                    }
                    return new BufferedChannel(Integer.MAX_VALUE, interfaceC18505l);
                }
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    conflatedBufferedChannel = new BufferedChannel(0, interfaceC18505l);
                } else {
                    conflatedBufferedChannel = new ConflatedBufferedChannel(1, bufferOverflow, interfaceC18505l);
                }
            } else {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, interfaceC18505l);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            conflatedBufferedChannel = new BufferedChannel(Channel.f106063n.m113074a(), interfaceC18505l);
        } else {
            conflatedBufferedChannel = new ConflatedBufferedChannel(1, bufferOverflow, interfaceC18505l);
        }
        return conflatedBufferedChannel;
    }

    /* renamed from: b */
    public static /* synthetic */ Channel m113079b(int i11, BufferOverflow bufferOverflow, InterfaceC18505l interfaceC18505l, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i12 & 4) != 0) {
            interfaceC18505l = null;
        }
        return m113078a(i11, bufferOverflow, interfaceC18505l);
    }
}
