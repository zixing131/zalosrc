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

/* renamed from: nc.e */
/* loaded from: classes3.dex */
public final class C23680e extends AbstractC19383g {

    /* renamed from: a */
    private final C23795b f114721a;

    /* renamed from: b */
    private final C21216s f114722b;

    /* renamed from: nc.e$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114723a;

        /* renamed from: b */
        private final C21270p.a f114724b;

        /* renamed from: c */
        private final C17945a0 f114725c;

        /* renamed from: d */
        private final EnumC22425a f114726d;

        public a(String str, C21270p.a aVar, C17945a0 c17945a0, EnumC22425a enumC22425a) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(aVar, "logState");
            AbstractC19074t.m100208f(c17945a0, "msg");
            this.f114723a = str;
            this.f114724b = aVar;
            this.f114725c = c17945a0;
            this.f114726d = enumC22425a;
        }

        /* renamed from: a */
        public final String m124041a() {
            return this.f114723a;
        }

        /* renamed from: b */
        public final C21270p.a m124042b() {
            return this.f114724b;
        }

        /* renamed from: c */
        public final C17945a0 m124043c() {
            return this.f114725c;
        }

        /* renamed from: d */
        public final EnumC22425a m124044d() {
            return this.f114726d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114723a, aVar.f114723a) && this.f114724b == aVar.f114724b && AbstractC19074t.m100204b(this.f114725c, aVar.f114725c) && this.f114726d == aVar.f114726d;
        }

        public int hashCode() {
            int hashCode = ((((this.f114723a.hashCode() * 31) + this.f114724b.hashCode()) * 31) + this.f114725c.hashCode()) * 31;
            EnumC22425a enumC22425a = this.f114726d;
            return hashCode + (enumC22425a == null ? 0 : enumC22425a.hashCode());
        }

        public String toString() {
            return "Params(date=" + this.f114723a + ", logState=" + this.f114724b + ", msg=" + this.f114725c + ", trackingDownloadType=" + this.f114726d + ")";
        }
    }

    public C23680e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        int i11;
        C31973j5 m4473g;
        AbstractC19074t.m100208f(aVar, "params");
        if (this.f114722b.m109888n0(aVar.m124043c()) == 0) {
            return;
        }
        String mo95039W2 = aVar.m124043c().mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        String m124041a = aVar.m124041a();
        C23682g c23682g = C23682g.f114732a;
        C24761c m124051b = c23682g.m124051b(this.f114722b, aVar.m124042b(), mo95039W2, aVar.m124043c(), aVar.m124044d());
        String m124056g = c23682g.m124056g(this.f114722b.m109889o0(mo95039W2));
        if (AbstractC19074t.m100204b(m124056g, C7962g.f43287r) && (m4473g = C0943w.f3447a.m4473g(mo95039W2)) != null) {
            i11 = m4473g.m153732O();
        } else {
            i11 = 0;
        }
        C23795b c23795b = this.f114721a;
        String m124054e = c23682g.m124054e(this.f114722b, mo95039W2, EnumC22425a.f109726q);
        ArrayList arrayList = new ArrayList();
        if (m124051b.m128709h()) {
            arrayList.add(m124051b);
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        c23795b.m124338e(0, m124041a, mo95039W2, new C24764f(m124056g, i11, m124054e, arrayList));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23680e(C23795b c23795b, C21216s c21216s, int i11, AbstractC19060k abstractC19060k) {
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

    public C23680e(C23795b c23795b, C21216s c21216s) {
        AbstractC19074t.m100208f(c23795b, "repo");
        AbstractC19074t.m100208f(c21216s, "controller");
        this.f114721a = c23795b;
        this.f114722b = c21216s;
    }
}
