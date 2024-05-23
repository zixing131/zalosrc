package kotlinx.coroutines.debug.internal;

import java.util.List;
import um0.InterfaceC27315f;
import wm0.InterfaceC29097e;

/* loaded from: classes7.dex */
public final class DebugCoroutineInfo {

    /* renamed from: a */
    private final InterfaceC27315f f106352a;

    /* renamed from: b */
    private final InterfaceC29097e f106353b;

    /* renamed from: c */
    private final long f106354c;

    /* renamed from: d */
    private final List f106355d;

    /* renamed from: e */
    private final String f106356e;

    /* renamed from: f */
    private final Thread f106357f;

    /* renamed from: g */
    private final InterfaceC29097e f106358g;

    /* renamed from: h */
    private final List f106359h;

    public DebugCoroutineInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, InterfaceC27315f interfaceC27315f) {
        this.f106352a = interfaceC27315f;
        this.f106353b = debugCoroutineInfoImpl.m113237d();
        this.f106354c = debugCoroutineInfoImpl.f106361b;
        this.f106355d = debugCoroutineInfoImpl.m113238e();
        this.f106356e = debugCoroutineInfoImpl.m113240g();
        this.f106357f = debugCoroutineInfoImpl.lastObservedThread;
        this.f106358g = debugCoroutineInfoImpl.m113239f();
        this.f106359h = debugCoroutineInfoImpl.m113241h();
    }
}
