package p455qo;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p185gc.AbstractC19383g;
import p398oo.C24380u;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: qo.r0 */
/* loaded from: classes4.dex */
public final class C25432r0 extends AbstractC19383g {

    /* renamed from: a */
    private final InterfaceC24854k f121741a;

    /* renamed from: qo.r0$a */
    /* loaded from: classes4.dex */
    public static final class a implements b {

        /* renamed from: a */
        private final String f121742a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "configString");
            this.f121742a = str;
        }

        /* renamed from: a */
        public final String m131721a() {
            return this.f121742a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121742a, ((a) obj).f121742a);
        }

        public int hashCode() {
            return this.f121742a.hashCode();
        }

        public String toString() {
            return "LoginConfigParams(configString=" + this.f121742a + ")";
        }
    }

    /* renamed from: qo.r0$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    /* renamed from: qo.r0$c */
    /* loaded from: classes4.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final int f121743a;

        public c(int i11) {
            this.f121743a = i11;
        }

        /* renamed from: a */
        public final int m131722a() {
            return this.f121743a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f121743a == ((c) obj).f121743a;
        }

        public int hashCode() {
            return this.f121743a;
        }

        public String toString() {
            return "UserConfigParams(enableMultiTabSettingValue=" + this.f121743a + ")";
        }
    }

    /* renamed from: qo.r0$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f121744q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25415j mo12V4() {
            return new C25415j();
        }
    }

    public C25432r0() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(d.f121744q);
        this.f121741a = m129210a;
    }

    /* renamed from: c */
    private final C25415j m131718c() {
        return (C25415j) this.f121741a.getValue();
    }

    /* renamed from: d */
    private final void m131719d(boolean z11, boolean z12) {
        if (z11 != z12) {
            m131718c().m101509a(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        C24380u c24380u = C24380u.f117739a;
        boolean mo127507a = c24380u.mo127507a();
        if (bVar instanceof a) {
            c24380u.m127516i(((a) bVar).m131721a());
            m131719d(mo127507a, c24380u.mo127507a());
        } else if (bVar instanceof c) {
            c24380u.m127517j(((c) bVar).m131722a());
            m131719d(mo127507a, c24380u.mo127507a());
        }
    }
}
