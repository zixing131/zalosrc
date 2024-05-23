package o90;

import androidx.lifecycle.C1780l0;
import fn0.AbstractC19074t;
import in0.InterfaceC20636c;
import mn0.InterfaceC23370h;

/* renamed from: o90.c */
/* loaded from: classes6.dex */
public class C24140c implements InterfaceC20636c {

    /* renamed from: a */
    private final C1780l0 f116671a;

    /* renamed from: b */
    private final String f116672b;

    /* renamed from: c */
    private final Object f116673c;

    public C24140c(C1780l0 c1780l0, String str, Object obj) {
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(obj, "defaultVal");
        this.f116671a = c1780l0;
        this.f116672b = str;
        this.f116673c = obj;
    }

    @Override // in0.InterfaceC20636c
    /* renamed from: a */
    public void mo107535a(Object obj, InterfaceC23370h interfaceC23370h, Object obj2) {
        AbstractC19074t.m100208f(interfaceC23370h, "property");
        this.f116671a.m9321g(this.f116672b, obj2);
    }

    @Override // in0.InterfaceC20636c
    /* renamed from: b */
    public Object mo107536b(Object obj, InterfaceC23370h interfaceC23370h) {
        AbstractC19074t.m100208f(interfaceC23370h, "property");
        Object m9318c = this.f116671a.m9318c(this.f116672b);
        if (m9318c == null) {
            return this.f116673c;
        }
        return m9318c;
    }
}
