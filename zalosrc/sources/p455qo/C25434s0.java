package p455qo;

import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;
import p398oo.C24373n0;

/* renamed from: qo.s0 */
/* loaded from: classes4.dex */
public final class C25434s0 extends AbstractC19383g {

    /* renamed from: qo.s0$a */
    /* loaded from: classes4.dex */
    public interface a {
    }

    /* renamed from: qo.s0$b */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a */
        private final int f121746a;

        public b(int i11) {
            this.f121746a = i11;
        }

        /* renamed from: a */
        public final int m131728a() {
            return this.f121746a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f121746a == ((b) obj).f121746a;
        }

        public int hashCode() {
            return this.f121746a;
        }

        public String toString() {
            return "UserConfigParams(enableZVideoSectionSettingValue=" + this.f121746a + ")";
        }
    }

    /* renamed from: d */
    private final void m131726d(int i11, boolean z11) {
        boolean z12 = true;
        if (i11 != 1) {
            z12 = false;
        }
        if (z11 != z12) {
            C24373n0.f117718a.m127486b(z12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        boolean m127485a = C24373n0.f117718a.m127485a();
        if (aVar instanceof b) {
            m131726d(((b) aVar).m131728a(), m127485a);
        }
    }
}
