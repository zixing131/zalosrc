package ac0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.zalocloud.recover.C16888a;
import fn0.AbstractC19074t;
import nl.C23870a;
import p019aj.C0876j;
import p348mi.AbstractC23306f;
import p534u1.AbstractC26941a;
import zb0.C31774c;

/* renamed from: ac0.a */
/* loaded from: classes6.dex */
public final class C0736a implements C1802w0.b {
    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        C0876j m120584H0 = AbstractC23306f.m120584H0();
        AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
        C16888a m120627V1 = AbstractC23306f.m120627V1();
        AbstractC19074t.m100207e(m120627V1, "provideZCloudGracePeriodManager(...)");
        return new C31774c(m120679j2, m120584H0, m120627V1);
    }
}
