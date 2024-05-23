package p670y5;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.UnsupportedEncodingException;
import p571v8.C27945d;

/* renamed from: y5.qg */
/* loaded from: classes2.dex */
public final class C30618qg implements InterfaceC30352cg {

    /* renamed from: a */
    private final C30424gc f141699a;

    /* renamed from: b */
    private C30768ye f141700b = new C30768ye();

    /* renamed from: c */
    private final int f141701c;

    private C30618qg(C30424gc c30424gc, int i11) {
        this.f141699a = c30424gc;
        C30789zg.m149740a();
        this.f141701c = i11;
    }

    /* renamed from: d */
    public static InterfaceC30352cg m149613d(C30424gc c30424gc) {
        return new C30618qg(c30424gc, 0);
    }

    /* renamed from: e */
    public static InterfaceC30352cg m149614e(C30424gc c30424gc, int i11) {
        return new C30618qg(c30424gc, 1);
    }

    @Override // p670y5.InterfaceC30352cg
    /* renamed from: a */
    public final byte[] mo149472a(int i11, boolean z11) {
        boolean z12;
        int i12 = i11 ^ 1;
        C30768ye c30768ye = this.f141700b;
        if (1 != i12) {
            z12 = false;
        } else {
            z12 = true;
        }
        c30768ye.m149726f(Boolean.valueOf(z12));
        this.f141700b.m149725e(Boolean.FALSE);
        this.f141699a.m149522i(this.f141700b.m149733m());
        try {
            C30789zg.m149740a();
            if (i11 == 0) {
                return new C27945d().m140808j(C30460ia.f141363a).m140809k(true).m140807i().mo136508b(this.f141699a.m149523j()).getBytes("utf-8");
            }
            C30462ic m149523j = this.f141699a.m149523j();
            C30585p2 c30585p2 = new C30585p2();
            C30460ia.f141363a.mo479a(c30585p2);
            return c30585p2.m149606b().m149612a(m149523j);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }

    @Override // p670y5.InterfaceC30352cg
    /* renamed from: b */
    public final InterfaceC30352cg mo149473b(C30768ye c30768ye) {
        this.f141700b = c30768ye;
        return this;
    }

    @Override // p670y5.InterfaceC30352cg
    /* renamed from: c */
    public final InterfaceC30352cg mo149474c(EnumC30405fc enumC30405fc) {
        this.f141699a.m149519f(enumC30405fc);
        return this;
    }

    @Override // p670y5.InterfaceC30352cg
    public final int zza() {
        return this.f141701c;
    }

    @Override // p670y5.InterfaceC30352cg
    public final String zzd() {
        C30312af m149550f = this.f141699a.m149523j().m149550f();
        if (m149550f != null && !AbstractC30601q.m149611b(m149550f.m149457k())) {
            return (String) AbstractC4205o.m19722k(m149550f.m149457k());
        }
        return "NA";
    }
}
