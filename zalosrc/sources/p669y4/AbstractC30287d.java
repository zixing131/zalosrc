package p669y4;

import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4205o;
import p704z4.C31236k;

/* renamed from: y4.d */
/* loaded from: classes2.dex */
public abstract class AbstractC30287d {
    /* renamed from: a */
    public static AbstractC30286c m149434a(InterfaceC30289f interfaceC30289f, AbstractC4073c abstractC4073c) {
        AbstractC4205o.m19723l(interfaceC30289f, "Result must not be null");
        AbstractC4205o.m19713b(!interfaceC30289f.getStatus().m19223M(), "Status code must not be SUCCESS");
        C30292i c30292i = new C30292i(abstractC4073c, interfaceC30289f);
        c30292i.m19283h(interfaceC30289f);
        return c30292i;
    }

    /* renamed from: b */
    public static AbstractC30286c m149435b(Status status, AbstractC4073c abstractC4073c) {
        AbstractC4205o.m19723l(status, "Result must not be null");
        C31236k c31236k = new C31236k(abstractC4073c);
        c31236k.m19283h(status);
        return c31236k;
    }
}
