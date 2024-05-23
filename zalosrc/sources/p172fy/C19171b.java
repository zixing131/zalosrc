package p172fy;

import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;
import p510sq.AbstractC26366b;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;

/* renamed from: fy.b */
/* loaded from: classes4.dex */
public final class C19171b extends AbstractC19383g {

    /* renamed from: fy.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC27218a f95265a;

        /* renamed from: b */
        private final C26365a f95266b;

        /* renamed from: c */
        private final int f95267c;

        /* renamed from: d */
        private final int f95268d;

        public a(InterfaceC27218a interfaceC27218a, C26365a c26365a, int i11, int i12) {
            this.f95265a = interfaceC27218a;
            this.f95266b = c26365a;
            this.f95267c = i11;
            this.f95268d = i12;
        }

        /* renamed from: a */
        public final InterfaceC27218a m100586a() {
            return this.f95265a;
        }

        /* renamed from: b */
        public final int m100587b() {
            return this.f95268d;
        }

        /* renamed from: c */
        public final C26365a m100588c() {
            return this.f95266b;
        }

        /* renamed from: d */
        public final int m100589d() {
            return this.f95267c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95265a, aVar.f95265a) && AbstractC19074t.m100204b(this.f95266b, aVar.f95266b) && this.f95267c == aVar.f95267c && this.f95268d == aVar.f95268d;
        }

        public int hashCode() {
            InterfaceC27218a interfaceC27218a = this.f95265a;
            int hashCode = (interfaceC27218a == null ? 0 : interfaceC27218a.hashCode()) * 31;
            C26365a c26365a = this.f95266b;
            return ((((hashCode + (c26365a != null ? c26365a.hashCode() : 0)) * 31) + this.f95267c) * 31) + this.f95268d;
        }

        public String toString() {
            return "Param(activity=" + this.f95265a + ", profileParam=" + this.f95266b + ", requestCode=" + this.f95267c + ", animation=" + this.f95268d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        AbstractC26366b.Companion.m135768a(aVar.m100586a(), aVar.m100588c(), aVar.m100589d(), aVar.m100587b());
    }
}
