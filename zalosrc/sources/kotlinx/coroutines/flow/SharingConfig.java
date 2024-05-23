package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
final class SharingConfig<T> {

    /* renamed from: a */
    public final Flow f107136a;

    /* renamed from: b */
    public final int f107137b;

    /* renamed from: c */
    public final BufferOverflow f107138c;

    /* renamed from: d */
    public final InterfaceC27315f f107139d;

    public SharingConfig(Flow flow, int i11, BufferOverflow bufferOverflow, InterfaceC27315f interfaceC27315f) {
        this.f107136a = flow;
        this.f107137b = i11;
        this.f107138c = bufferOverflow;
        this.f107139d = interfaceC27315f;
    }
}
