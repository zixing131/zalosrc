package kotlinx.coroutines.internal;

import fn0.AbstractC19074t;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class ThreadLocalKey implements InterfaceC27315f.c {

    /* renamed from: p */
    private final ThreadLocal f107432p;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreadLocalKey) && AbstractC19074t.m100204b(this.f107432p, ((ThreadLocalKey) obj).f107432p);
    }

    public int hashCode() {
        return this.f107432p.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f107432p + ')';
    }
}
