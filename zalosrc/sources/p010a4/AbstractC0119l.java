package p010a4;

import p121e4.AbstractC18197a;
import p668y3.EnumC30278d;
import p668y3.InterfaceC30280f;

/* renamed from: a4.l */
/* loaded from: classes.dex */
public abstract class AbstractC0119l {
    /* renamed from: a */
    public static void m545a(InterfaceC30280f interfaceC30280f, EnumC30278d enumC30278d) {
        if (interfaceC30280f instanceof C0126s) {
            C0128u.m561c().m564e().m103512u(((C0126s) interfaceC30280f).m558d().m551f(enumC30278d), 1);
        } else {
            AbstractC18197a.m96969g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC30280f);
        }
    }
}
