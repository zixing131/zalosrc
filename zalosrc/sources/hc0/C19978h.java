package hc0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.p077ui.zalocloud.setup.C14006b;
import com.zing.zalo.zalocloud.info.C16806a;
import fn0.AbstractC19074t;
import nl.C23870a;
import p348mi.AbstractC23306f;
import p534u1.AbstractC26941a;

/* renamed from: hc0.h */
/* loaded from: classes6.dex */
public final class C19978h implements C1802w0.b {
    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        C16806a m120643a2 = AbstractC23306f.m120643a2();
        AbstractC19074t.m100207e(m120643a2, "provideZaloCloudInfoManager(...)");
        C23870a m120679j2 = AbstractC23306f.m120679j2();
        AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
        return new C14006b(m120643a2, m120679j2);
    }
}
