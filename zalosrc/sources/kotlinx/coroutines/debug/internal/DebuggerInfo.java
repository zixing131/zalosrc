package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import um0.InterfaceC27313d;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class DebuggerInfo implements Serializable {

    /* renamed from: p */
    private final Long f106390p;

    /* renamed from: q */
    private final String f106391q;

    /* renamed from: r */
    private final String f106392r;

    /* renamed from: s */
    private final String f106393s;

    /* renamed from: t */
    private final String f106394t;

    /* renamed from: u */
    private final String f106395u;

    /* renamed from: v */
    private final List f106396v;

    /* renamed from: w */
    private final long f106397w;

    public DebuggerInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, InterfaceC27315f interfaceC27315f) {
        Long l11;
        String str;
        String str2;
        String str3;
        Thread.State state;
        CoroutineId coroutineId = (CoroutineId) interfaceC27315f.mo112624d(CoroutineId.f105840r);
        if (coroutineId != null) {
            l11 = Long.valueOf(coroutineId.m112635z0());
        } else {
            l11 = null;
        }
        this.f106390p = l11;
        InterfaceC27313d interfaceC27313d = (InterfaceC27313d) interfaceC27315f.mo112624d(InterfaceC27313d.f128556o);
        if (interfaceC27313d != null) {
            str = interfaceC27313d.toString();
        } else {
            str = null;
        }
        this.f106391q = str;
        CoroutineName coroutineName = (CoroutineName) interfaceC27315f.mo112624d(CoroutineName.f105842r);
        if (coroutineName != null) {
            str2 = coroutineName.m112636z0();
        } else {
            str2 = null;
        }
        this.f106392r = str2;
        this.f106393s = debugCoroutineInfoImpl.m113240g();
        Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        if (thread != null && (state = thread.getState()) != null) {
            str3 = state.toString();
        } else {
            str3 = null;
        }
        this.f106394t = str3;
        Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.f106395u = thread2 != null ? thread2.getName() : null;
        this.f106396v = debugCoroutineInfoImpl.m113241h();
        this.f106397w = debugCoroutineInfoImpl.f106361b;
    }
}
