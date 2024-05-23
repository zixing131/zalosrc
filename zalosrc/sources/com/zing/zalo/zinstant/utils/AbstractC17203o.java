package com.zing.zalo.zinstant.utils;

import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMContainer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import qm0.AbstractC25378x;

/* renamed from: com.zing.zalo.zinstant.utils.o */
/* loaded from: classes7.dex */
public abstract class AbstractC17203o {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.zinstant.utils.o$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ZOM m91833a(ZOM zom, InterfaceC17194f interfaceC17194f, boolean z11) {
            ZOM[] zomArr;
            AbstractC19074t.m100208f(zom, "zom");
            AbstractC19074t.m100208f(interfaceC17194f, "predicate");
            ArrayList arrayList = new ArrayList();
            arrayList.add(zom);
            while (!arrayList.isEmpty()) {
                ZOM zom2 = (ZOM) arrayList.remove(0);
                if (interfaceC17194f.mo91804a(zom2)) {
                    if (!z11 && zom2.mVisibility != 0) {
                        return null;
                    }
                    return zom2;
                }
                if ((zom2 instanceof ZOMContainer) && (zomArr = ((ZOMContainer) zom2).mChildren) != null) {
                    AbstractC25378x.m131549y(arrayList, zomArr);
                }
            }
            return null;
        }
    }
}
