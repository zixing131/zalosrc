package wd0;

import eg.C18425b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19636i1;
import hm0.C20096c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185gc.AbstractC19383g;
import p405ov.C24559a;
import p424pj.C24774a;

/* renamed from: wd0.i */
/* loaded from: classes4.dex */
public final class C28929i extends AbstractC19383g {
    public static final b Companion = new b(null);

    /* renamed from: wd0.i$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo68405a();

        /* renamed from: b */
        void mo68406b(C20096c c20096c);
    }

    /* renamed from: wd0.i$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.i$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final List f133946a;

        /* renamed from: b */
        private final a f133947b;

        public c(List list, a aVar) {
            AbstractC19074t.m100208f(list, "conversations");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f133946a = list;
            this.f133947b = aVar;
        }

        /* renamed from: a */
        public final a m144544a() {
            return this.f133947b;
        }

        /* renamed from: b */
        public final List m144545b() {
            return this.f133946a;
        }
    }

    /* renamed from: c */
    private final List m144542c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!C19636i1.Companion.m102800a().m102764U(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: d */
    public void mo12006b(c cVar) {
        AbstractC19074t.m100208f(cVar, "params");
        List m144545b = cVar.m144545b();
        a m144544a = cVar.m144544a();
        C24559a.m127933c("MarkConversationsAsUnread", "Mark as UN READ for conversations: " + m144545b);
        List m144542c = m144542c(m144545b);
        if (m144542c.isEmpty()) {
            m144544a.mo68405a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m144542c.iterator();
        while (it.hasNext()) {
            arrayList.add(new C24774a((String) it.next(), 0, 0L, 0, 14, null));
        }
        C18425b.Companion.m97655a().m97652l(arrayList, m144544a);
    }
}
