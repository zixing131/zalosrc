package p259j8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p153f8.C18821f;
import p232i8.AbstractC20395h;

/* renamed from: j8.b */
/* loaded from: classes.dex */
class C21088b {

    /* renamed from: a */
    private final Map f103084a = new HashMap();

    /* renamed from: b */
    private final int f103085b;

    /* renamed from: c */
    private final int f103086c;

    public C21088b(int i11, int i12) {
        this.f103085b = i11;
        this.f103086c = i12;
    }

    /* renamed from: b */
    private String m109551b(String str) {
        if (str != null) {
            return m109552c(str, this.f103086c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m109552c(String str, int i11) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i11) {
                return trim.substring(0, i11);
            }
            return trim;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized Map m109553a() {
        return Collections.unmodifiableMap(new HashMap(this.f103084a));
    }

    /* renamed from: d */
    public synchronized boolean m109554d(String str, String str2) {
        String m109551b = m109551b(str);
        if (this.f103084a.size() >= this.f103085b && !this.f103084a.containsKey(m109551b)) {
            C18821f.m98795f().m98804k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f103085b);
            return false;
        }
        String m109552c = m109552c(str2, this.f103086c);
        if (AbstractC20395h.m106202B((String) this.f103084a.get(m109551b), m109552c)) {
            return false;
        }
        Map map = this.f103084a;
        if (str2 == null) {
            m109552c = "";
        }
        map.put(m109551b, m109552c);
        return true;
    }

    /* renamed from: e */
    public synchronized void m109555e(Map map) {
        String m109552c;
        try {
            int i11 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String m109551b = m109551b((String) entry.getKey());
                if (this.f103084a.size() >= this.f103085b && !this.f103084a.containsKey(m109551b)) {
                    i11++;
                }
                String str = (String) entry.getValue();
                Map map2 = this.f103084a;
                if (str == null) {
                    m109552c = "";
                } else {
                    m109552c = m109552c(str, this.f103086c);
                }
                map2.put(m109551b, m109552c);
            }
            if (i11 > 0) {
                C18821f.m98795f().m98804k("Ignored " + i11 + " entries when adding custom keys. Maximum allowable: " + this.f103085b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
