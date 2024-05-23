package kotlinx.coroutines.internal;

import fn0.AbstractC19074t;
import kotlinx.coroutines.ThreadContextElement;
import um0.InterfaceC27315f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ThreadState {

    /* renamed from: a */
    public final InterfaceC27315f f107435a;

    /* renamed from: b */
    private final Object[] f107436b;

    /* renamed from: c */
    private final ThreadContextElement[] f107437c;

    /* renamed from: d */
    private int f107438d;

    public ThreadState(InterfaceC27315f interfaceC27315f, int i11) {
        this.f107435a = interfaceC27315f;
        this.f107436b = new Object[i11];
        this.f107437c = new ThreadContextElement[i11];
    }

    /* renamed from: a */
    public final void m113749a(ThreadContextElement threadContextElement, Object obj) {
        Object[] objArr = this.f107436b;
        int i11 = this.f107438d;
        objArr[i11] = obj;
        ThreadContextElement[] threadContextElementArr = this.f107437c;
        this.f107438d = i11 + 1;
        AbstractC19074t.m100206d(threadContextElement, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        threadContextElementArr[i11] = threadContextElement;
    }

    /* renamed from: b */
    public final void m113750b(InterfaceC27315f interfaceC27315f) {
        int length = this.f107437c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            ThreadContextElement threadContextElement = this.f107437c[length];
            AbstractC19074t.m100205c(threadContextElement);
            threadContextElement.mo112633Q(interfaceC27315f, this.f107436b[length]);
            if (i11 >= 0) {
                length = i11;
            } else {
                return;
            }
        }
    }
}
