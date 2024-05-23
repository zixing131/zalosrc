package ug0;

import com.zing.zalo.zalocloud.migration.C16862b;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import gw.C19669z;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ln0.AbstractC22543l;
import p348mi.AbstractC23306f;
import p452ql.C25319c;
import p452ql.C25322f;
import p452ql.C25323g;
import pm0.C24848g0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import vg0.C28250a;

/* renamed from: ug0.l */
/* loaded from: classes7.dex */
public final class C27257l {

    /* renamed from: a */
    public static final C27257l f128129a = new C27257l();

    /* renamed from: b */
    private static final ConcurrentHashMap f128130b = new ConcurrentHashMap();

    private C27257l() {
    }

    /* renamed from: a */
    private final C16862b m139470a(String str, String str2) {
        if (AbstractC19074t.m100204b(str2, "cloud_media_migration")) {
            C25319c c25319c = new C25319c(str, null, 2, null);
            C19669z m120572D0 = AbstractC23306f.m120572D0();
            AbstractC19074t.m100207e(m120572D0, "provideMessageManager(...)");
            return new C16862b(str2, new C25322f(c25319c, m120572D0), C28250a.f131719a);
        }
        if (AbstractC19074t.m100204b(str2, "my_cloud_migration")) {
            C25319c c25319c2 = new C25319c(str, null, 2, null);
            C19669z m120572D02 = AbstractC23306f.m120572D0();
            AbstractC19074t.m100207e(m120572D02, "provideMessageManager(...)");
            return new C16862b(str2, new C25323g(c25319c2, m120572D02), null, 4, null);
        }
        throw new IllegalArgumentException("Couldn't create runner with id=" + str2);
    }

    /* renamed from: d */
    public static /* synthetic */ Map m139471d(C27257l c27257l, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
        }
        return c27257l.m139473c(str);
    }

    /* renamed from: b */
    public final C16862b m139472b(String str) {
        AbstractC19074t.m100208f(str, "userUid");
        return m139475f(str, "cloud_media_migration");
    }

    /* renamed from: c */
    public final Map m139473c(String str) {
        int m131511r;
        int m131400e;
        int m116580c;
        AbstractC19074t.m100208f(str, "userUid");
        List m139469a = AbstractC27256k.m139469a();
        m131511r = AbstractC25370t.m131511r(m139469a, 10);
        m131400e = AbstractC25361o0.m131400e(m131511r);
        m116580c = AbstractC22543l.m116580c(m131400e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
        for (Object obj : m139469a) {
            linkedHashMap.put(obj, f128129a.m139475f(str, (String) obj));
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public final C16862b m139474e(String str) {
        AbstractC19074t.m100208f(str, "userUid");
        return m139475f(str, "my_cloud_migration");
    }

    /* renamed from: f */
    public final C16862b m139475f(String str, String str2) {
        Object putIfAbsent;
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC19074t.m100208f(str2, "id");
        ConcurrentHashMap concurrentHashMap = f128130b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = Collections.synchronizedMap(new HashMap())))) != null) {
            obj = putIfAbsent;
        }
        Map map = (Map) obj;
        Object obj2 = map.get(str2);
        if (obj2 == null) {
            synchronized (this) {
                try {
                    obj2 = map.get(str2);
                    if (obj2 == null) {
                        C16862b m139470a = f128129a.m139470a(str, str2);
                        AbstractC19074t.m100205c(map);
                        AbstractC19074t.m100205c(m139470a);
                        map.put(str2, m139470a);
                        obj2 = m139470a;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (C16862b) obj2;
    }
}
