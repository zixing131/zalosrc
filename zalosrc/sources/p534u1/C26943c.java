package p534u1;

import androidx.lifecycle.C1802w0;
import dn0.AbstractC18031a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mn0.InterfaceC23364b;

/* renamed from: u1.c */
/* loaded from: classes.dex */
public final class C26943c {

    /* renamed from: a */
    private final List f127385a = new ArrayList();

    /* renamed from: a */
    public final void m138788a(InterfaceC23364b interfaceC23364b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23364b, "clazz");
        AbstractC19074t.m100208f(interfaceC18505l, "initializer");
        this.f127385a.add(new C26946f(AbstractC18031a.m95868a(interfaceC23364b), interfaceC18505l));
    }

    /* renamed from: b */
    public final C1802w0.b m138789b() {
        C26946f[] c26946fArr = (C26946f[]) this.f127385a.toArray(new C26946f[0]);
        return new C26942b((C26946f[]) Arrays.copyOf(c26946fArr, c26946fArr.length));
    }
}
