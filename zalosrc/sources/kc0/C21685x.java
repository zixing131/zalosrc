package kc0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.p077ui.zalocloud.setup.C14008d;
import fn0.AbstractC19074t;
import ke0.C21699a;
import nl.C23870a;
import p348mi.AbstractC23306f;
import p479rc.C25724a;
import p534u1.AbstractC26941a;
import pg0.C24747a;
import qg0.C25268c;
import wg0.C28989l;

/* renamed from: kc0.x */
/* loaded from: classes6.dex */
public final class C21685x implements C1802w0.b {
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
        C21699a c21699a = new C21699a(m120679j2);
        C25724a m120668h = AbstractC23306f.m120668h();
        AbstractC19074t.m100207e(m120668h, "provideBackupEncryptionManager(...)");
        C25268c m120647b2 = AbstractC23306f.m120647b2();
        AbstractC19074t.m100207e(m120647b2, "provideZaloCloudKeyManager(...)");
        C24747a m120636Y1 = AbstractC23306f.m120636Y1();
        AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
        C28989l m120667g2 = AbstractC23306f.m120667g2();
        AbstractC19074t.m100207e(m120667g2, "provideZaloCloudOnboardingJobManager(...)");
        return new C14008d(c21699a, m120668h, m120647b2, m120636Y1, m120667g2);
    }
}
