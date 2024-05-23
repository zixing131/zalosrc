package p258j7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j7.i0 */
/* loaded from: classes3.dex */
public final class C20955i0 {

    /* renamed from: a */
    private final Map f102859a = new HashMap();

    /* renamed from: a */
    public final C20955i0 m109498a(String str, String str2, String str3) {
        if (!this.f102859a.containsKey(str2)) {
            this.f102859a.put(str2, new HashMap());
        }
        ((Map) this.f102859a.get(str2)).put(str, str3);
        return this;
    }

    /* renamed from: b */
    public final C20959k0 m109499b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f102859a.entrySet()) {
            hashMap.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new C20959k0(Collections.unmodifiableMap(hashMap), null);
    }
}
