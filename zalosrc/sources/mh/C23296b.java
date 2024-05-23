package mh;

import com.zing.zalo.p062db.C7960e;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import p348mi.C23305e;

/* renamed from: mh.b */
/* loaded from: classes3.dex */
public final class C23296b {

    /* renamed from: a */
    private final C7960e f113084a;

    public C23296b(C7960e c7960e) {
        AbstractC19074t.m100208f(c7960e, "dbHelper");
        this.f113084a = c7960e;
    }

    /* renamed from: a */
    public final HashMap m120438a(String str) {
        AbstractC19074t.m100208f(str, "groupId");
        HashMap hashMap = new HashMap();
        ArrayList<C23305e> m42410h5 = C7960e.m41971c6().m42410h5(str);
        AbstractC19074t.m100207e(m42410h5, "getAllGroupMemberDeliveredSeenInfo(...)");
        for (C23305e c23305e : m42410h5) {
            if (c23305e != null) {
                hashMap.put(c23305e.m120559d(), c23305e);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void m120439b(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listDeliveredSeenInfoUpdate");
        this.f113084a.m42120F8(arrayList);
    }
}
