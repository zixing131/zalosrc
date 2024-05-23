package kotlinx.coroutines;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;

/* loaded from: classes7.dex */
public final class CoroutineName extends AbstractC27310a {

    /* renamed from: r */
    public static final Key f105842r = new Key(null);

    /* renamed from: q */
    private final String f105843q;

    /* loaded from: classes7.dex */
    public static final class Key implements InterfaceC27315f.c {
        private Key() {
        }

        public /* synthetic */ Key(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public CoroutineName(String str) {
        super(f105842r);
        this.f105843q = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineName) && AbstractC19074t.m100204b(this.f105843q, ((CoroutineName) obj).f105843q);
    }

    public int hashCode() {
        return this.f105843q.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f105843q + ')';
    }

    /* renamed from: z0 */
    public final String m112636z0() {
        return this.f105843q;
    }
}
