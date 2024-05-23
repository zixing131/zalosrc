package kotlinx.coroutines;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import on0.AbstractC24342w;
import p535u2.AbstractC26974u;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class CoroutineId extends AbstractC27310a implements ThreadContextElement<String> {

    /* renamed from: r */
    public static final Key f105840r = new Key(null);

    /* renamed from: q */
    private final long f105841q;

    /* loaded from: classes7.dex */
    public static final class Key implements InterfaceC27315f.c {
        private Key() {
        }

        public /* synthetic */ Key(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public void mo112633Q(InterfaceC27315f interfaceC27315f, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public String mo112634Z(InterfaceC27315f interfaceC27315f) {
        String str;
        int m127178g0;
        CoroutineName coroutineName = (CoroutineName) interfaceC27315f.mo112624d(CoroutineName.f105842r);
        if (coroutineName == null || (str = coroutineName.m112636z0()) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        m127178g0 = AbstractC24342w.m127178g0(name, " @", 0, false, 6, null);
        if (m127178g0 < 0) {
            m127178g0 = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + m127178g0 + 10);
        String substring = name.substring(0, m127178g0);
        AbstractC19074t.m100207e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(" @");
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.f105841q);
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.f105841q == ((CoroutineId) obj).f105841q;
    }

    public int hashCode() {
        return AbstractC26974u.m138969a(this.f105841q);
    }

    public String toString() {
        return "CoroutineId(" + this.f105841q + ')';
    }

    /* renamed from: z0 */
    public final long m112635z0() {
        return this.f105841q;
    }
}
