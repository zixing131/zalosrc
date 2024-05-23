package com.zing.zalo.zinstant.utils;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import nk0.C23858u;
import qk0.AbstractC25310f;

/* renamed from: com.zing.zalo.zinstant.utils.t */
/* loaded from: classes7.dex */
public abstract class AbstractC17208t {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.zinstant.utils.t$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC25310f m91849a(AbstractC25310f abstractC25310f, List list, InterfaceC17194f interfaceC17194f) {
            AbstractC19074t.m100208f(abstractC25310f, "zinstantNode");
            AbstractC19074t.m100208f(list, "nodeTypeFilter");
            AbstractC19074t.m100208f(interfaceC17194f, "predicate");
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractC25310f);
            while (!arrayList.isEmpty()) {
                AbstractC25310f abstractC25310f2 = (AbstractC25310f) arrayList.remove(0);
                if (interfaceC17194f.mo91804a(abstractC25310f2)) {
                    return abstractC25310f2;
                }
                if (abstractC25310f2 instanceof C23858u) {
                    List m124668n2 = ((C23858u) abstractC25310f2).m124668n2();
                    AbstractC19074t.m100207e(m124668n2, "current.children");
                    synchronized (m124668n2) {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : m124668n2) {
                                AbstractC25310f abstractC25310f3 = (AbstractC25310f) obj;
                                if (abstractC25310f3 != null && list.contains(abstractC25310f3.m131003G())) {
                                    arrayList2.add(obj);
                                }
                            }
                            arrayList.addAll(arrayList2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            return null;
        }
    }
}
