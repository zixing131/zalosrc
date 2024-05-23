package uh0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: uh0.c */
/* loaded from: classes7.dex */
public class C27264c {

    /* renamed from: a */
    private final Map f128199a = new ConcurrentHashMap();

    public C27264c() {
    }

    /* renamed from: a */
    public static String m139554a(C27264c c27264c) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : c27264c.m139556c()) {
            String m139555b = c27264c.m139555b(str);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(m139555b);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public String m139555b(String str) {
        return (String) this.f128199a.get(str.toLowerCase());
    }

    /* renamed from: c */
    public List m139556c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f128199a.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    /* renamed from: d */
    public boolean m139557d(String str) {
        return this.f128199a.containsKey(str.toLowerCase());
    }

    /* renamed from: e */
    public C27264c m139558e(String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            this.f128199a.put(str.trim().toLowerCase(), str2.trim());
        }
        return this;
    }

    /* renamed from: f */
    public final C27264c m139559f(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                m139558e((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return this;
    }

    public String toString() {
        return m139554a(this);
    }

    public C27264c(Map map) {
        m139559f(map);
    }
}
