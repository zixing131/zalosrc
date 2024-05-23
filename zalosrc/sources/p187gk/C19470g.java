package p187gk;

import android.text.TextUtils;
import fn0.AbstractC19074t;
import java.util.HashMap;

/* renamed from: gk.g */
/* loaded from: classes3.dex */
public final class C19470g implements InterfaceC19466c {

    /* renamed from: a */
    private final String f96612a;

    /* renamed from: b */
    private final HashMap f96613b;

    public C19470g(String str, HashMap hashMap) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(hashMap, "data");
        this.f96612a = str;
        this.f96613b = hashMap;
    }

    @Override // p187gk.InterfaceC19466c
    /* renamed from: a */
    public String mo101794a() {
        return this.f96612a;
    }

    @Override // p187gk.InterfaceC19466c
    /* renamed from: b */
    public String mo101795b() {
        String join = TextUtils.join(";", this.f96613b.keySet());
        AbstractC19074t.m100207e(join, "join(...)");
        return join;
    }

    /* renamed from: c */
    public final HashMap m101805c() {
        return this.f96613b;
    }
}
