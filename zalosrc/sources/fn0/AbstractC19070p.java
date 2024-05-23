package fn0;

import mn0.InterfaceC23363a;
import mn0.InterfaceC23366d;

/* renamed from: fn0.p */
/* loaded from: classes.dex */
public abstract class AbstractC19070p extends AbstractC19050f implements InterfaceC19068o, InterfaceC23366d {

    /* renamed from: w */
    private final int f94948w;

    /* renamed from: x */
    private final int f94949x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC19070p(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, r7);
        boolean z11;
        if ((i12 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f94948w = i11;
        this.f94949x = i12 >> 1;
    }

    @Override // fn0.InterfaceC19068o
    /* renamed from: Lp */
    public int mo100147Lp() {
        return this.f94948w;
    }

    @Override // fn0.AbstractC19050f
    /* renamed from: c */
    protected InterfaceC23363a mo100148c() {
        return AbstractC19061k0.m100168a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC19070p) {
            AbstractC19070p abstractC19070p = (AbstractC19070p) obj;
            if (mo100153a().equals(abstractC19070p.mo100153a()) && m100157g().equals(abstractC19070p.m100157g()) && this.f94949x == abstractC19070p.f94949x && this.f94948w == abstractC19070p.f94948w && AbstractC19074t.m100204b(m100154d(), abstractC19070p.m100154d()) && AbstractC19074t.m100204b(m100155e(), abstractC19070p.m100155e())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC23366d)) {
            return false;
        }
        return obj.equals(mo100151b());
    }

    public int hashCode() {
        int hashCode;
        if (m100155e() == null) {
            hashCode = 0;
        } else {
            hashCode = m100155e().hashCode() * 31;
        }
        return ((hashCode + mo100153a().hashCode()) * 31) + m100157g().hashCode();
    }

    public String toString() {
        InterfaceC23363a mo100151b = mo100151b();
        if (mo100151b != this) {
            return mo100151b.toString();
        }
        if ("<init>".equals(mo100153a())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + mo100153a() + " (Kotlin reflection is not available)";
    }
}
