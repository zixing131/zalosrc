package p376o0;

import java.util.HashMap;
import java.util.Map;
import p376o0.C23974b;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public class C23973a extends C23974b {

    /* renamed from: t */
    private final HashMap f116028t = new HashMap();

    public boolean contains(Object obj) {
        return this.f116028t.containsKey(obj);
    }

    @Override // p376o0.C23974b
    /* renamed from: e */
    protected C23974b.c mo125457e(Object obj) {
        return (C23974b.c) this.f116028t.get(obj);
    }

    @Override // p376o0.C23974b
    /* renamed from: l */
    public Object mo125458l(Object obj, Object obj2) {
        C23974b.c mo125457e = mo125457e(obj);
        if (mo125457e != null) {
            return mo125457e.f116034q;
        }
        this.f116028t.put(obj, m125464k(obj, obj2));
        return null;
    }

    @Override // p376o0.C23974b
    /* renamed from: m */
    public Object mo125459m(Object obj) {
        Object mo125459m = super.mo125459m(obj);
        this.f116028t.remove(obj);
        return mo125459m;
    }

    /* renamed from: n */
    public Map.Entry m125460n(Object obj) {
        if (contains(obj)) {
            return ((C23974b.c) this.f116028t.get(obj)).f116036s;
        }
        return null;
    }
}
