package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.internal.Symbol;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class SharedFlowKt {

    /* renamed from: a */
    public static final Symbol f107129a = new Symbol("NO_VALUE");

    /* renamed from: a */
    public static final MutableSharedFlow m113477a(int i11, int i12, BufferOverflow bufferOverflow) {
        if (i11 >= 0) {
            if (i12 >= 0) {
                if (i11 <= 0 && i12 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
                }
                int i13 = i12 + i11;
                if (i13 < 0) {
                    i13 = Integer.MAX_VALUE;
                }
                return new SharedFlowImpl(i11, i13, bufferOverflow);
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i12).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i11).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ MutableSharedFlow m113478b(int i11, int i12, BufferOverflow bufferOverflow, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return m113477a(i11, i12, bufferOverflow);
    }

    /* renamed from: e */
    public static final Flow m113481e(SharedFlow sharedFlow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        if ((i11 == 0 || i11 == -3) && bufferOverflow == BufferOverflow.SUSPEND) {
            return sharedFlow;
        }
        return new ChannelFlowOperatorImpl(sharedFlow, interfaceC27315f, i11, bufferOverflow);
    }

    /* renamed from: f */
    public static final Object m113482f(Object[] objArr, long j11) {
        return objArr[(objArr.length - 1) & ((int) j11)];
    }

    /* renamed from: g */
    public static final void m113483g(Object[] objArr, long j11, Object obj) {
        objArr[(objArr.length - 1) & ((int) j11)] = obj;
    }
}
