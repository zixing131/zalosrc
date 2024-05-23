package fn0;

import mn0.InterfaceC23363a;
import mn0.InterfaceC23370h;

/* renamed from: fn0.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC19049e0 extends AbstractC19050f implements InterfaceC23370h {

    /* renamed from: w */
    private final boolean f94919w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC19049e0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, r8);
        boolean z11;
        if ((i11 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f94919w = (i11 & 2) == 2;
    }

    @Override // fn0.AbstractC19050f
    /* renamed from: b */
    public InterfaceC23363a mo100151b() {
        if (this.f94919w) {
            return this;
        }
        return super.mo100151b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC19049e0) {
            AbstractC19049e0 abstractC19049e0 = (AbstractC19049e0) obj;
            if (m100155e().equals(abstractC19049e0.m100155e()) && mo100153a().equals(abstractC19049e0.mo100153a()) && m100157g().equals(abstractC19049e0.m100157g()) && AbstractC19074t.m100204b(m100154d(), abstractC19049e0.m100154d())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof InterfaceC23370h)) {
            return false;
        }
        return obj.equals(mo100151b());
    }

    /* renamed from: h */
    public InterfaceC23370h m100152h() {
        if (!this.f94919w) {
            return (InterfaceC23370h) super.m100156f();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public int hashCode() {
        return (((m100155e().hashCode() * 31) + mo100153a().hashCode()) * 31) + m100157g().hashCode();
    }

    public String toString() {
        InterfaceC23363a mo100151b = mo100151b();
        if (mo100151b != this) {
            return mo100151b.toString();
        }
        return "property " + mo100153a() + " (Kotlin reflection is not available)";
    }
}
