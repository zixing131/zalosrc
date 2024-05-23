package p429pv;

import am.AbstractC0924m0;
import f40.C18719a;
import fn0.AbstractC19074t;
import gm0.AbstractC19512f;
import java.security.SecureRandom;
import mm0.AbstractC23350e;
import nh0.C23793c;

/* renamed from: pv.a */
/* loaded from: classes4.dex */
public final class C24911a {

    /* renamed from: a */
    public static final C24911a f119528a = new C24911a();

    private C24911a() {
    }

    /* renamed from: c */
    private final String m129575c() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String m101985d = AbstractC19512f.m101985d(bArr);
        AbstractC19074t.m100207e(m101985d, "toHex(...)");
        return m101985d;
    }

    /* renamed from: d */
    private final boolean m129576d() {
        if (C23793c.Companion.m124321a().mo124314i() - AbstractC0924m0.m4334x2() <= 300000) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final void m129577e(String str, long j11) {
        AbstractC0924m0.m2997Di(str);
        AbstractC0924m0.m4293vj(j11);
    }

    /* renamed from: a */
    public final void m129578a(String str) {
        AbstractC19074t.m100208f(str, "key");
        try {
            if (AbstractC19074t.m100204b(AbstractC0924m0.m3038F1(), str)) {
                m129577e("", 0L);
                C18719a.m98714g("LoginPCWebSupportTransferMsgKeyHandler", "Destroy temp key", null, 4, null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b */
    public final String m129579b() {
        try {
            String m129575c = m129575c();
            m129577e(m129575c, C23793c.Companion.m124321a().mo124314i());
            return m129575c;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: f */
    public final boolean m129580f(String str) {
        AbstractC19074t.m100208f(str, "keyValidateTransferMsgServer");
        if (AbstractC19074t.m100204b(str, AbstractC0924m0.m3038F1()) && m129576d()) {
            return true;
        }
        return false;
    }
}
