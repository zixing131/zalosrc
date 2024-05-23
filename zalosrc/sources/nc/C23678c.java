package nc;

import am.C0943w;
import com.zing.zalo.p062db.C7962g;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lc.EnumC22425a;
import nc.C23680e;
import ni.C23795b;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p268ji.C21270p;
import p348mi.AbstractC23306f;
import p423pi.C24761c;
import p423pi.C24764f;
import p716zh.C31973j5;
import qm0.AbstractC25332a0;

/* renamed from: nc.c */
/* loaded from: classes3.dex */
public final class C23678c extends AbstractC19383g {

    /* renamed from: a */
    private final C23795b f114709a;

    /* renamed from: b */
    private final C21216s f114710b;

    /* renamed from: c */
    private final C23680e f114711c;

    /* renamed from: nc.c$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114712a;

        /* renamed from: b */
        private final C21270p.a f114713b;

        /* renamed from: c */
        private final List f114714c;

        public a(String str, C21270p.a aVar, List list) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(aVar, "logState");
            AbstractC19074t.m100208f(list, "msgList");
            this.f114712a = str;
            this.f114713b = aVar;
            this.f114714c = list;
        }

        /* renamed from: a */
        public final String m124032a() {
            return this.f114712a;
        }

        /* renamed from: b */
        public final C21270p.a m124033b() {
            return this.f114713b;
        }

        /* renamed from: c */
        public final List m124034c() {
            return this.f114714c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114712a, aVar.f114712a) && this.f114713b == aVar.f114713b && AbstractC19074t.m100204b(this.f114714c, aVar.f114714c);
        }

        public int hashCode() {
            return (((this.f114712a.hashCode() * 31) + this.f114713b.hashCode()) * 31) + this.f114714c.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.f114712a + ", logState=" + this.f114713b + ", msgList=" + this.f114714c + ")";
        }
    }

    public C23678c() {
        this(null, null, null, 7, null);
    }

    /* renamed from: c */
    private final void m124030c(String str, C21270p.a aVar, List list) {
        C31973j5 m4473g;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (this.f114710b.m109888n0(c17945a0) != 0) {
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                List list2 = (List) hashMap2.get(mo95039W2);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                List list3 = list2;
                C24761c m124051b = C23682g.f114732a.m124051b(this.f114710b, aVar, mo95039W2, c17945a0, c17945a0.m95020U4());
                if (m124051b.m128709h()) {
                    list3.add(m124051b);
                }
                hashMap2.put(mo95039W2, list3);
            }
        }
        Iterator it2 = hashMap2.entrySet().iterator();
        while (true) {
            int i11 = 0;
            if (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str2 = (String) entry.getKey();
                C23682g c23682g = C23682g.f114732a;
                String m124056g = c23682g.m124056g(this.f114710b.m109889o0(str2));
                if (AbstractC19074t.m100204b(m124056g, C7962g.f43287r) && (m4473g = C0943w.f3447a.m4473g(str2)) != null) {
                    i11 = m4473g.m153732O();
                }
                hashMap.put(str2, new C24764f(m124056g, i11, c23682g.m124054e(this.f114710b, str2, EnumC22425a.f109726q), (List) entry.getValue()));
            } else {
                this.f114709a.m124337d(0, str, hashMap);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        Object m131205e0;
        AbstractC19074t.m100208f(aVar, "params");
        List m124034c = aVar.m124034c();
        String m124032a = aVar.m124032a();
        C21270p.a m124033b = aVar.m124033b();
        if (m124034c.size() == 1) {
            m131205e0 = AbstractC25332a0.m131205e0(m124034c);
            C17945a0 c17945a0 = (C17945a0) m131205e0;
            this.f114711c.m101508a(new C23680e.a(m124032a, m124033b, c17945a0, c17945a0.m95020U4()));
            return;
        }
        m124030c(m124032a, m124033b, m124034c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23678c(C23795b c23795b, C21216s c21216s, C23680e c23680e, int i11, AbstractC19060k abstractC19060k) {
        this(c23795b, c21216s, c23680e);
        if ((i11 & 1) != 0) {
            c23795b = AbstractC23306f.m120625V();
            AbstractC19074t.m100207e(c23795b, "provideDownloadMediaLogRepository(...)");
        }
        if ((i11 & 2) != 0) {
            c21216s = AbstractC23306f.m120652d();
            AbstractC19074t.m100207e(c21216s, "provideAutoDownloadMsgResourcesController(...)");
        }
        if ((i11 & 4) != 0) {
            c23680e = AbstractC23306f.m120697o0();
            AbstractC19074t.m100207e(c23680e, "provideInsertSingeDownloadMediaLogUseCase(...)");
        }
    }

    public C23678c(C23795b c23795b, C21216s c21216s, C23680e c23680e) {
        AbstractC19074t.m100208f(c23795b, "repo");
        AbstractC19074t.m100208f(c21216s, "controller");
        AbstractC19074t.m100208f(c23680e, "insertSingleUseCase");
        this.f114709a = c23795b;
        this.f114710b = c21216s;
        this.f114711c = c23680e;
    }
}
