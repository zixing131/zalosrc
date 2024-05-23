package com.zing.zalo.location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.zing.zalo.location.c */
/* loaded from: classes4.dex */
public class C8957c {

    /* renamed from: a */
    public String f47904a;

    /* renamed from: b */
    public List f47905b = new ArrayList();

    /* renamed from: c */
    public Map f47906c = new HashMap();

    /* renamed from: d */
    public Map f47907d = new HashMap();

    /* renamed from: a */
    public void m47865a(C8969o c8969o) {
        if (c8969o != null) {
            try {
                if (!this.f47906c.containsKey(Long.valueOf(c8969o.f47980a))) {
                    this.f47905b.add(c8969o);
                    this.f47906c.put(Long.valueOf(c8969o.f47980a), c8969o);
                    List list = (List) this.f47907d.get(c8969o.f47982c);
                    if (list != null) {
                        list.add(c8969o);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c8969o);
                        this.f47907d.put(c8969o.f47982c, arrayList);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public C8969o m47866b(String str) {
        try {
            List list = (List) this.f47907d.get(str);
            if (list != null && !list.isEmpty()) {
                C8969o c8969o = (C8969o) list.get(0);
                for (int i11 = 1; i11 < list.size(); i11++) {
                    C8969o c8969o2 = (C8969o) list.get(i11);
                    if (C8967m.m47872U(c8969o)) {
                        if (C8967m.m47872U(c8969o2) && c8969o2.f47989j <= c8969o.f47989j) {
                        }
                        c8969o = c8969o2;
                    } else if (!C8967m.m47872U(c8969o2)) {
                        if (c8969o2.f47989j <= c8969o.f47989j) {
                        }
                        c8969o = c8969o2;
                    }
                }
                return c8969o;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
