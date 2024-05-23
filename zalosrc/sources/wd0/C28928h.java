package wd0;

import eg.C18425b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19636i1;
import gw.C19666x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mm0.AbstractC23350e;
import p019aj.C0876j;
import p185gc.AbstractC19383g;
import p348mi.AbstractC23309i;
import p405ov.C24559a;
import p424pj.C24774a;
import p461qu.AbstractC25495a;
import vg.C28023b6;
import wd0.C28930j;

/* renamed from: wd0.h */
/* loaded from: classes4.dex */
public final class C28928h extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C19636i1 f133942a;

    /* renamed from: b */
    private final C0876j f133943b;

    /* renamed from: c */
    private final C28930j f133944c;

    /* renamed from: wd0.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.h$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final List f133945a;

        public b(List list) {
            AbstractC19074t.m100208f(list, "conversations");
            this.f133945a = list;
        }

        /* renamed from: a */
        public final List m144541a() {
            return this.f133945a;
        }
    }

    public C28928h(C19636i1 c19636i1, C0876j c0876j, C28930j c28930j) {
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c28930j, "resetUnreadUseCase");
        this.f133942a = c19636i1;
        this.f133943b = c0876j;
        this.f133944c = c28930j;
    }

    /* renamed from: c */
    private final Set m144539c(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (AbstractC25495a.m132084i(str)) {
                    linkedHashSet.addAll(this.f133942a.m102753K());
                } else if (AbstractC25495a.m132081f(str)) {
                    linkedHashSet.addAll(this.f133942a.m102750I());
                    AbstractC23309i.m121924fz(0);
                } else if (this.f133942a.m102764U(str)) {
                    linkedHashSet.add(str);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("MarkAsReadConversation", e11);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        List m144541a = bVar.m144541a();
        try {
            C24559a.m127933c("MarkAsReadConversation", "Mark as READ for conversations: " + m144541a);
            Set<String> m144539c = m144539c(m144541a);
            if (m144539c.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m144539c) {
                try {
                    C28023b6.m141250h0().m141293J(str);
                    C19666x0.Companion.m103117a().m103110g(str);
                    arrayList.add(new C24774a(str, 0, 0L, 0, 12, null));
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("MarkAsReadConversation", e11);
                }
            }
            C18425b.m97638f(C18425b.Companion.m97655a(), arrayList, false, 2, null);
            try {
                this.f133944c.m101509a(new C28930j.b(m144539c, true));
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        } catch (Exception e13) {
            AbstractC23350e.m122778h(e13);
        }
    }
}
