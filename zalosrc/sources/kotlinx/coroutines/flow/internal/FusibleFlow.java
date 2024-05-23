package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import um0.C27316g;
import um0.InterfaceC27315f;

@InternalCoroutinesApi
/* loaded from: classes.dex */
public interface FusibleFlow<T> extends Flow<T> {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ Flow m113554a(FusibleFlow fusibleFlow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 1) != 0) {
                    interfaceC27315f = C27316g.f128559p;
                }
                if ((i12 & 2) != 0) {
                    i11 = -3;
                }
                if ((i12 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return fusibleFlow.mo113437c(interfaceC27315f, i11, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: c */
    Flow mo113437c(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow);
}
