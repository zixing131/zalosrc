package o90;

import androidx.lifecycle.C1780l0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mn0.InterfaceC23370h;

/* renamed from: o90.b */
/* loaded from: classes6.dex */
public final class C24139b extends C24140c {

    /* renamed from: d */
    private final InterfaceC18505l f116670d;

    public /* synthetic */ C24139b(C1780l0 c1780l0, String str, Object obj, InterfaceC18505l interfaceC18505l, int i11, AbstractC19060k abstractC19060k) {
        this(c1780l0, str, obj, (i11 & 8) != 0 ? null : interfaceC18505l);
    }

    @Override // o90.C24140c, in0.InterfaceC20636c
    /* renamed from: a */
    public void mo107535a(Object obj, InterfaceC23370h interfaceC23370h, Object obj2) {
        AbstractC19074t.m100208f(interfaceC23370h, "property");
        super.mo107535a(obj, interfaceC23370h, obj2);
        InterfaceC18505l interfaceC18505l = this.f116670d;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24139b(C1780l0 c1780l0, String str, Object obj, InterfaceC18505l interfaceC18505l) {
        super(c1780l0, str, obj);
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(obj, "defaultVal");
        this.f116670d = interfaceC18505l;
    }
}
