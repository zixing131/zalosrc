package p716zh;

import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: zh.e1 */
/* loaded from: classes3.dex */
public final class C31894e1 {

    /* renamed from: a */
    public static final C31894e1 f146524a = new C31894e1();

    /* renamed from: b */
    private static final Map f146525b;

    /* renamed from: c */
    private static boolean f146526c;

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f146525b = synchronizedMap;
    }

    private C31894e1() {
    }

    /* renamed from: a */
    public final C31879d1 m153254a(String str) {
        AbstractC19074t.m100208f(str, "conversationID");
        Map map = f146525b;
        C31879d1 c31879d1 = (C31879d1) map.get(str);
        if (c31879d1 == null) {
            if (!f146526c) {
                c31879d1 = C7960e.m41971c6().m42241Q5(str);
            }
            if (c31879d1 == null) {
                c31879d1 = new C31879d1(str);
            }
            map.put(str, c31879d1);
        }
        return c31879d1;
    }

    /* renamed from: b */
    public final void m153255b() {
        List<C31879d1> m42232P9 = C7960e.m41971c6().m42232P9();
        AbstractC19074t.m100207e(m42232P9, "loadAllConversationInfo(...)");
        for (C31879d1 c31879d1 : m42232P9) {
            Map map = f146525b;
            String m153190b = c31879d1.m153190b();
            AbstractC19074t.m100205c(c31879d1);
            map.put(m153190b, c31879d1);
        }
        f146526c = true;
    }

    /* renamed from: c */
    public final void m153256c(C31879d1 c31879d1) {
        AbstractC19074t.m100208f(c31879d1, "info");
        if (c31879d1.m153198j()) {
            if (c31879d1.m153192d()) {
                C7960e.m41971c6().m42246Qb(c31879d1.m153190b());
                c31879d1.m153201n(false);
                return;
            }
            return;
        }
        if (c31879d1.m153192d()) {
            C7960e.m41971c6().m42503pd(c31879d1);
        } else {
            C7960e.m41971c6().m42243Q7(c31879d1);
            c31879d1.m153201n(true);
        }
    }
}
