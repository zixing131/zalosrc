package nc;

import am.C0943w;
import com.zing.zalo.p062db.C7962g;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import lc.EnumC22425a;
import ni.C23795b;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p268ji.C21270p;
import p348mi.AbstractC23306f;
import p423pi.C24761c;
import p423pi.C24764f;
import p716zh.C31973j5;
import pm0.C24848g0;

/* renamed from: nc.f */
/* loaded from: classes3.dex */
public final class C23681f extends AbstractC19383g {

    /* renamed from: a */
    private final C23795b f114727a;

    /* renamed from: b */
    private final C21216s f114728b;

    /* renamed from: nc.f$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114729a;

        /* renamed from: b */
        private final C21270p.a f114730b;

        /* renamed from: c */
        private final C17945a0 f114731c;

        public a(String str, C21270p.a aVar, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(aVar, "logState");
            AbstractC19074t.m100208f(c17945a0, "msg");
            this.f114729a = str;
            this.f114730b = aVar;
            this.f114731c = c17945a0;
        }

        /* renamed from: a */
        public final String m124046a() {
            return this.f114729a;
        }

        /* renamed from: b */
        public final C21270p.a m124047b() {
            return this.f114730b;
        }

        /* renamed from: c */
        public final C17945a0 m124048c() {
            return this.f114731c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114729a, aVar.f114729a) && this.f114730b == aVar.f114730b && AbstractC19074t.m100204b(this.f114731c, aVar.f114731c);
        }

        public int hashCode() {
            return (((this.f114729a.hashCode() * 31) + this.f114730b.hashCode()) * 31) + this.f114731c.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.f114729a + ", logState=" + this.f114730b + ", msg=" + this.f114731c + ")";
        }
    }

    public C23681f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        C31973j5 m4473g;
        AbstractC19074t.m100208f(aVar, "params");
        if (this.f114728b.m109888n0(aVar.m124048c()) == 0) {
            return;
        }
        C17945a0 m124048c = aVar.m124048c();
        String mo95039W2 = m124048c.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        C23682g c23682g = C23682g.f114732a;
        C24761c m124052c = c23682g.m124052c(this.f114728b, aVar.m124047b(), mo95039W2, m124048c);
        String m124056g = c23682g.m124056g(this.f114728b.m109889o0(mo95039W2));
        int i11 = 0;
        if (AbstractC19074t.m100204b(m124056g, C7962g.f43287r) && (m4473g = C0943w.f3447a.m4473g(mo95039W2)) != null) {
            i11 = m4473g.m153732O();
        }
        C23795b c23795b = this.f114727a;
        String m124046a = aVar.m124046a();
        String m124054e = c23682g.m124054e(this.f114728b, mo95039W2, EnumC22425a.f109728s);
        ArrayList arrayList = new ArrayList();
        if (m124052c.m128709h()) {
            arrayList.add(m124052c);
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        c23795b.m124338e(1, m124046a, mo95039W2, new C24764f(m124056g, i11, m124054e, arrayList));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23681f(C23795b c23795b, C21216s c21216s, int i11, AbstractC19060k abstractC19060k) {
        this(c23795b, c21216s);
        if ((i11 & 1) != 0) {
            c23795b = AbstractC23306f.m120625V();
            AbstractC19074t.m100207e(c23795b, "provideDownloadMediaLogRepository(...)");
        }
        if ((i11 & 2) != 0) {
            c21216s = AbstractC23306f.m120652d();
            AbstractC19074t.m100207e(c21216s, "provideAutoDownloadMsgResourcesController(...)");
        }
    }

    public C23681f(C23795b c23795b, C21216s c21216s) {
        AbstractC19074t.m100208f(c23795b, "repo");
        AbstractC19074t.m100208f(c21216s, "controller");
        this.f114727a = c23795b;
        this.f114728b = c21216s;
    }
}
