package f70;

import am.C0943w;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.p077ui.group.leavegroup.C11922b;
import fn0.AbstractC19074t;
import p304ks.C21927m;
import p534u1.AbstractC26941a;

/* renamed from: f70.l */
/* loaded from: classes5.dex */
public final class C18810l implements C1802w0.b {

    /* renamed from: a */
    private final String f94085a;

    /* renamed from: b */
    private final String f94086b;

    public C18810l(String str, String str2) {
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(str2, "source");
        this.f94085a = str;
        this.f94086b = str2;
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: a */
    public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
        return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
    }

    @Override // androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        String str = this.f94085a;
        String str2 = this.f94086b;
        C0943w m4462l = C0943w.m4462l();
        C21927m m114302u = C21927m.m114302u();
        AbstractC19074t.m100207e(m114302u, "getInstance(...)");
        return new C11922b(str, str2, m4462l, m114302u, null, 16, null);
    }
}
