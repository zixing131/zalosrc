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
import nc.C23681f;
import ni.C23795b;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p268ji.C21270p;
import p348mi.AbstractC23306f;
import p423pi.C24761c;
import p423pi.C24764f;
import p716zh.C31973j5;
import qm0.AbstractC25332a0;

/* renamed from: nc.d */
/* loaded from: classes3.dex */
public final class C23679d extends AbstractC19383g {

    /* renamed from: a */
    private final C23795b f114715a;

    /* renamed from: b */
    private final C21216s f114716b;

    /* renamed from: c */
    private final C23681f f114717c;

    /* renamed from: nc.d$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114718a;

        /* renamed from: b */
        private final C21270p.a f114719b;

        /* renamed from: c */
        private final List f114720c;

        public a(String str, C21270p.a aVar, List list) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(aVar, "logState");
            AbstractC19074t.m100208f(list, "msgList");
            this.f114718a = str;
            this.f114719b = aVar;
            this.f114720c = list;
        }

        /* renamed from: a */
        public final String m124037a() {
            return this.f114718a;
        }

        /* renamed from: b */
        public final C21270p.a m124038b() {
            return this.f114719b;
        }

        /* renamed from: c */
        public final List m124039c() {
            return this.f114720c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114718a, aVar.f114718a) && this.f114719b == aVar.f114719b && AbstractC19074t.m100204b(this.f114720c, aVar.f114720c);
        }

        public int hashCode() {
            return (((this.f114718a.hashCode() * 31) + this.f114719b.hashCode()) * 31) + this.f114720c.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.f114718a + ", logState=" + this.f114719b + ", msgList=" + this.f114720c + ")";
        }
    }

    public C23679d() {
        this(null, null, null, 7, null);
    }

    /* renamed from: c */
    private final void m124035c(String str, C21270p.a aVar, List list) {
        C31973j5 m4473g;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (this.f114716b.m109888n0(c17945a0) != 0) {
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                List list2 = (List) hashMap2.get(mo95039W2);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                C24761c m124052c = C23682g.f114732a.m124052c(this.f114716b, aVar, mo95039W2, c17945a0);
                if (m124052c.m128709h()) {
                    list2.add(m124052c);
                }
                hashMap2.put(mo95039W2, list2);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            String str2 = (String) entry.getKey();
            C23682g c23682g = C23682g.f114732a;
            String m124056g = c23682g.m124056g(this.f114716b.m109889o0(str2));
            int i11 = 0;
            if (AbstractC19074t.m100204b(m124056g, C7962g.f43287r) && (m4473g = C0943w.f3447a.m4473g(str2)) != null) {
                i11 = m4473g.m153732O();
            }
            hashMap.put(str2, new C24764f(m124056g, i11, c23682g.m124054e(this.f114716b, str2, EnumC22425a.f109728s), (List) entry.getValue()));
        }
        this.f114715a.m124337d(1, str, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        Object m131205e0;
        AbstractC19074t.m100208f(aVar, "params");
        C21270p.a m124038b = aVar.m124038b();
        String m124037a = aVar.m124037a();
        List m124039c = aVar.m124039c();
        if (m124039c.size() == 1) {
            C23681f c23681f = this.f114717c;
            m131205e0 = AbstractC25332a0.m131205e0(m124039c);
            c23681f.m101508a(new C23681f.a(m124037a, m124038b, (C17945a0) m131205e0));
            return;
        }
        m124035c(m124037a, m124038b, m124039c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23679d(C23795b c23795b, C21216s c21216s, C23681f c23681f, int i11, AbstractC19060k abstractC19060k) {
        this(c23795b, c21216s, c23681f);
        if ((i11 & 1) != 0) {
            c23795b = AbstractC23306f.m120625V();
            AbstractC19074t.m100207e(c23795b, "provideDownloadMediaLogRepository(...)");
        }
        if ((i11 & 2) != 0) {
            c21216s = AbstractC23306f.m120652d();
            AbstractC19074t.m100207e(c21216s, "provideAutoDownloadMsgResourcesController(...)");
        }
        if ((i11 & 4) != 0) {
            c23681f = AbstractC23306f.m120701p0();
            AbstractC19074t.m100207e(c23681f, "provideInsertSingleSyncMediaLogUseCase(...)");
        }
    }

    public C23679d(C23795b c23795b, C21216s c21216s, C23681f c23681f) {
        AbstractC19074t.m100208f(c23795b, "repo");
        AbstractC19074t.m100208f(c21216s, "controller");
        AbstractC19074t.m100208f(c23681f, "insertSingleUseCase");
        this.f114715a = c23795b;
        this.f114716b = c21216s;
        this.f114717c = c23681f;
    }
}
