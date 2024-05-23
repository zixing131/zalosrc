package p705z5;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.UnsupportedEncodingException;
import p571v8.C27945d;

/* renamed from: z5.xb */
/* loaded from: classes2.dex */
public final class C31629xb implements InterfaceC31503ob {

    /* renamed from: a */
    private final C31374f8 f145411a;

    /* renamed from: b */
    private C31432ja f145412b = new C31432ja();

    private C31629xb(C31374f8 c31374f8, int i11) {
        this.f145411a = c31374f8;
        C31434jc.m152279a();
    }

    /* renamed from: d */
    public static InterfaceC31503ob m152364d(C31374f8 c31374f8) {
        return new C31629xb(c31374f8, 0);
    }

    @Override // p705z5.InterfaceC31503ob
    /* renamed from: a */
    public final byte[] mo152327a(int i11, boolean z11) {
        boolean z12;
        int i12 = i11 ^ 1;
        C31432ja c31432ja = this.f145412b;
        if (1 != i12) {
            z12 = false;
        } else {
            z12 = true;
        }
        c31432ja.m152269f(Boolean.valueOf(z12));
        this.f145412b.m152268e(Boolean.FALSE);
        this.f145411a.m152233e(this.f145412b.m152276m());
        try {
            C31434jc.m152279a();
            if (i11 == 0) {
                return new C27945d().m140808j(C31470m6.f144951a).m140809k(true).m140807i().mo136508b(this.f145411a.m152234f()).getBytes("utf-8");
            }
            C31402h8 m152234f = this.f145411a.m152234f();
            C31477n c31477n = new C31477n();
            C31470m6.f144951a.mo479a(c31477n);
            return c31477n.m152322b().m152326a(m152234f);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }

    @Override // p705z5.InterfaceC31503ob
    /* renamed from: b */
    public final InterfaceC31503ob mo152328b(EnumC31360e8 enumC31360e8) {
        this.f145411a.m152231c(enumC31360e8);
        return this;
    }

    @Override // p705z5.InterfaceC31503ob
    /* renamed from: c */
    public final InterfaceC31503ob mo152329c(C31432ja c31432ja) {
        this.f145412b = c31432ja;
        return this;
    }

    @Override // p705z5.InterfaceC31503ob
    public final String zzc() {
        C31474ma m152243c = this.f145411a.m152234f().m152243c();
        if (m152243c != null && !AbstractC31385g5.m152239b(m152243c.m152315k())) {
            return (String) AbstractC4205o.m19722k(m152243c.m152315k());
        }
        return "NA";
    }
}
