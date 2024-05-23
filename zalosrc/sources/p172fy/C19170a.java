package p172fy;

import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.ChatView;
import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;
import p542ub.InterfaceC27218a;
import v50.C27870vb;
import vg.C28203u6;

/* renamed from: fy.a */
/* loaded from: classes4.dex */
public final class C19170a extends AbstractC19383g {

    /* renamed from: fy.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC27218a f95262a;

        /* renamed from: b */
        private final String f95263b;

        /* renamed from: c */
        private final int f95264c;

        public a(InterfaceC27218a interfaceC27218a, String str, int i11) {
            this.f95262a = interfaceC27218a;
            this.f95263b = str;
            this.f95264c = i11;
        }

        /* renamed from: a */
        public final InterfaceC27218a m100582a() {
            return this.f95262a;
        }

        /* renamed from: b */
        public final int m100583b() {
            return this.f95264c;
        }

        /* renamed from: c */
        public final String m100584c() {
            return this.f95263b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95262a, aVar.f95262a) && AbstractC19074t.m100204b(this.f95263b, aVar.f95263b) && this.f95264c == aVar.f95264c;
        }

        public int hashCode() {
            InterfaceC27218a interfaceC27218a = this.f95262a;
            int hashCode = (interfaceC27218a == null ? 0 : interfaceC27218a.hashCode()) * 31;
            String str = this.f95263b;
            return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f95264c;
        }

        public String toString() {
            return "Param(activity=" + this.f95262a + ", uid=" + this.f95263b + ", requestCode=" + this.f95264c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        String m100584c = aVar.m100584c();
        if (m100584c != null && m100584c.length() != 0 && aVar.m100582a() != null) {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, aVar.m100584c(), null, 2, null);
            if (m141798e == null) {
                m141798e = new ContactProfile(aVar.m100584c());
            }
            String mo2478b = m141798e.mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            aVar.m100582a().mo35581q(ChatView.class, new C27870vb(mo2478b).m140780g(m141798e).m140776b(), aVar.m100583b(), 1, true);
        }
    }
}
