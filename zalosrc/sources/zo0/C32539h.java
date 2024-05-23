package zo0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1780l0;
import fn0.AbstractC19074t;
import p089d2.InterfaceC17712d;
import p363nh.C23744a;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.VoipAudioHelper;

/* renamed from: zo0.h */
/* loaded from: classes7.dex */
public final class C32539h extends AbstractC1754a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32539h(InterfaceC17712d interfaceC17712d, Bundle bundle) {
        super(interfaceC17712d, bundle);
        AbstractC19074t.m100208f(interfaceC17712d, "owner");
    }

    @Override // androidx.lifecycle.AbstractC1754a
    /* renamed from: e */
    protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(c1780l0, "handle");
        if (cls.isAssignableFrom(C32538g.class)) {
            C23744a m124119a = C23744a.Companion.m124119a();
            VoipAudioHelper voipAudioHelper = VoipAudioHelper.f148751a;
            AbstractC32273e3 m155748Q = AbstractC32273e3.m155748Q();
            AbstractC19074t.m100207e(m155748Q, "getInstance(...)");
            return new C32538g(m124119a, voipAudioHelper, c1780l0, m155748Q);
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}
