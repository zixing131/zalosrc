package r40;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.pin.C11067b;
import fn0.AbstractC19074t;
import p348mi.AbstractC23306f;
import p479rc.C25724a;
import p534u1.AbstractC26941a;
import qg0.C25268c;

/* renamed from: r40.a */
/* loaded from: classes5.dex */
public final class C25647a implements C1802w0.b {
    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        C25724a m120668h = AbstractC23306f.m120668h();
        AbstractC19074t.m100207e(m120668h, "provideBackupEncryptionManager(...)");
        C25268c m120647b2 = AbstractC23306f.m120647b2();
        AbstractC19074t.m100207e(m120647b2, "provideZaloCloudKeyManager(...)");
        return new C11067b(m120668h, m120647b2);
    }
}