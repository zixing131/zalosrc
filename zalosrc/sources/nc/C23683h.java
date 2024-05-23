package nc;

import am.C0943w;
import com.zing.zalo.p062db.C7962g;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.EnumC22425a;
import ni.C23795b;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p348mi.AbstractC23306f;
import p423pi.C24761c;
import p423pi.C24764f;
import p716zh.C31973j5;

/* renamed from: nc.h */
/* loaded from: classes3.dex */
public final class C23683h extends AbstractC19383g {

    /* renamed from: a */
    private final C23795b f114735a;

    /* renamed from: b */
    private final C21216s f114736b;

    /* renamed from: nc.h$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f114737a;

        /* renamed from: b */
        private final List f114738b;

        public a(String str, List list) {
            AbstractC19074t.m100208f(str, "date");
            AbstractC19074t.m100208f(list, "msgList");
            this.f114737a = str;
            this.f114738b = list;
        }

        /* renamed from: a */
        public final String m124059a() {
            return this.f114737a;
        }

        /* renamed from: b */
        public final List m124060b() {
            return this.f114738b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f114737a, aVar.f114737a) && AbstractC19074t.m100204b(this.f114738b, aVar.f114738b);
        }

        public int hashCode() {
            return (this.f114737a.hashCode() * 31) + this.f114738b.hashCode();
        }

        public String toString() {
            return "Params(date=" + this.f114737a + ", msgList=" + this.f114738b + ")";
        }
    }

    public C23683h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        int i11;
        C31973j5 m4473g;
        AbstractC19074t.m100208f(aVar, "params");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (C17945a0 c17945a0 : aVar.m124060b()) {
            if (this.f114736b.m109888n0(c17945a0) != 0) {
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                List list = (List) hashMap2.get(mo95039W2);
                if (list == null) {
                    list = new ArrayList();
                }
                List list2 = list;
                list2.add(new C24761c(mo95039W2, C23682g.f114732a.m124055f(c17945a0, this.f114736b), c17945a0.m95029V3().hashCode(), c17945a0.m95180k8() ? 1 : 0, 0, null, 0, null, 160, null));
                hashMap2.put(mo95039W2, list2);
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            String str = (String) entry.getKey();
            C23682g c23682g = C23682g.f114732a;
            String m124056g = c23682g.m124056g(this.f114736b.m109889o0(str));
            if (AbstractC19074t.m100204b(m124056g, C7962g.f43287r) && (m4473g = C0943w.f3447a.m4473g(str)) != null) {
                i11 = m4473g.m153732O();
            } else {
                i11 = 0;
            }
            hashMap.put(str, new C24764f(m124056g, i11, c23682g.m124054e(this.f114736b, str, EnumC22425a.f109726q), (List) entry.getValue()));
        }
        this.f114735a.m124340g(0, aVar.m124059a(), hashMap);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C23683h(C23795b c23795b, C21216s c21216s, int i11, AbstractC19060k abstractC19060k) {
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

    public C23683h(C23795b c23795b, C21216s c21216s) {
        AbstractC19074t.m100208f(c23795b, "repo");
        AbstractC19074t.m100208f(c21216s, "controller");
        this.f114735a = c23795b;
        this.f114736b = c21216s;
    }
}
