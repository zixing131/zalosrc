package ro0;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import lo0.C22618p;
import lo0.C22620q;

/* renamed from: ro0.h */
/* loaded from: classes7.dex */
public class C25944h {

    /* renamed from: a */
    public int f123710a = -1;

    /* renamed from: b */
    public int f123711b = -1;

    /* renamed from: d */
    public int f123713d = -1;

    /* renamed from: e */
    public int f123714e = -1;

    /* renamed from: f */
    public int f123715f = -1;

    /* renamed from: g */
    public int f123716g = -1;

    /* renamed from: c */
    public Map f123712c = new LinkedHashMap();

    /* renamed from: h */
    public Set f123717h = new HashSet();

    /* renamed from: a */
    public static C25944h m133677a(C22618p c22618p) {
        C25944h c25944h = new C25944h();
        c25944h.f123710a = c22618p.f110537c;
        c25944h.f123711b = c22618p.f110538d;
        c25944h.f123713d = c22618p.f110540f;
        c25944h.f123714e = c22618p.f110541g;
        c25944h.f123715f = c22618p.f110542h;
        c25944h.f123716g = c22618p.f110543i;
        Map map = c22618p.f110539e;
        if (map != null) {
            c25944h.f123712c.putAll(map);
        }
        Set set = c22618p.f110544j;
        if (set != null) {
            c25944h.f123717h.addAll(set);
        }
        return c25944h;
    }

    /* renamed from: b */
    public static C25944h m133678b(C22620q c22620q) {
        C25944h c25944h = new C25944h();
        c25944h.f123710a = c22620q.f110537c;
        c25944h.f123711b = c22620q.f110538d;
        c25944h.f123713d = c22620q.f110540f;
        c25944h.f123714e = c22620q.f110541g;
        c25944h.f123715f = c22620q.f110542h;
        c25944h.f123716g = c22620q.f110543i;
        Map map = c22620q.f110539e;
        if (map != null) {
            c25944h.f123712c.putAll(map);
        }
        Set set = c22620q.f110544j;
        if (set != null) {
            c25944h.f123717h.addAll(set);
        }
        return c25944h;
    }
}
