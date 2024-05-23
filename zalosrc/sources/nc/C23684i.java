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
import ni.C23795b;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p268ji.C21270p;
import p348mi.AbstractC23306f;
import p423pi.C24761c;
import p423pi.C24764f;
import p716zh.C31973j5;

/* renamed from: nc.i */
/* loaded from: classes3.dex */
public final class C23684i extends AbstractC19383g {

    /* renamed from: a */
    private final C23795b f114739a;

    /* renamed from: b */
    private final C21216s f114740b;

    /* renamed from: nc.i$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114741a;

        /* renamed from: b */
        private final List f114742b;

        public a(String str, List list) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(list, "msgList");
            this.f114741a = str;
            this.f114742b = list;
        }

        /* renamed from: a */
        public final String m124062a() {
            return this.f114741a;
        }

        /* renamed from: b */
        public final List m124063b() {
            return this.f114742b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114741a, aVar.f114741a) && AbstractC19074t.m100204b(this.f114742b, aVar.f114742b);
        }

        public int hashCode() {
            return (this.f114741a.hashCode() * 31) + this.f114742b.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.f114741a + ", msgList=" + this.f114742b + ")";
        }
    }

    public C23684i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        C31973j5 m4473g;
        AbstractC19074t.m100208f(aVar, "params");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C17945a0 c17945a0 : aVar.m124063b()) {
            if (this.f114740b.m109888n0(c17945a0) != 0) {
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                List list = (List) hashMap2.get(mo95039W2);
                if (list == null) {
                    list = new ArrayList();
                }
                List list2 = list;
                C24761c m124051b = C23682g.f114732a.m124051b(this.f114740b, C21270p.a.f103624q, mo95039W2, c17945a0, EnumC22425a.f109726q);
                if (m124051b.m128709h()) {
                    list2.add(m124051b);
                }
                hashMap2.put(mo95039W2, list2);
            }
        }
        Iterator it = hashMap2.entrySet().iterator();
        while (true) {
            int i11 = 0;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                C23682g c23682g = C23682g.f114732a;
                String m124056g = c23682g.m124056g(this.f114740b.m109889o0(str));
                if (AbstractC19074t.m100204b(m124056g, C7962g.f43287r) && (m4473g = C0943w.f3447a.m4473g(str)) != null) {
                    i11 = m4473g.m153732O();
                }
                hashMap.put(str, new C24764f(m124056g, i11, c23682g.m124054e(this.f114740b, str, EnumC22425a.f109726q), (List) entry.getValue()));
            } else {
                this.f114739a.m124341h(0, aVar.m124062a(), hashMap);
                return;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23684i(C23795b c23795b, C21216s c21216s, int i11, AbstractC19060k abstractC19060k) {
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

    public C23684i(C23795b c23795b, C21216s c21216s) {
        AbstractC19074t.m100208f(c23795b, "repo");
        AbstractC19074t.m100208f(c21216s, "controller");
        this.f114739a = c23795b;
        this.f114740b = c21216s;
    }
}
