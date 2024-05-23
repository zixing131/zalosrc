package p012a6;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.UnsupportedEncodingException;
import p571v8.C27945d;

/* renamed from: a6.rg */
/* loaded from: classes2.dex */
public final class C0484rg implements InterfaceC0218dg {

    /* renamed from: a */
    private final C0271gc f1867a;

    /* renamed from: b */
    private C0198cf f1868b = new C0198cf();

    /* renamed from: c */
    private final int f1869c;

    private C0484rg(C0271gc c0271gc, int i11) {
        this.f1867a = c0271gc;
        C0162ah.m616a();
        this.f1869c = i11;
    }

    /* renamed from: d */
    public static InterfaceC0218dg m868d(C0271gc c0271gc) {
        return new C0484rg(c0271gc, 0);
    }

    /* renamed from: e */
    public static InterfaceC0218dg m869e(C0271gc c0271gc, int i11) {
        return new C0484rg(c0271gc, 1);
    }

    @Override // p012a6.InterfaceC0218dg
    /* renamed from: a */
    public final byte[] mo656a(int i11, boolean z11) {
        boolean z12;
        int i12 = i11 ^ 1;
        C0198cf c0198cf = this.f1868b;
        if (1 != i12) {
            z12 = false;
        } else {
            z12 = true;
        }
        c0198cf.m642f(Boolean.valueOf(z12));
        this.f1868b.m641e(Boolean.FALSE);
        this.f1867a.m739i(this.f1868b.m649m());
        try {
            C0162ah.m616a();
            if (i11 == 0) {
                return new C27945d().m140808j(C0288ha.f1466a).m140809k(true).m140807i().mo136508b(this.f1867a.m740j()).getBytes("utf-8");
            }
            C0309ic m740j = this.f1867a.m740j();
            C0261g2 c0261g2 = new C0261g2();
            C0288ha.f1466a.mo479a(c0261g2);
            return c0261g2.m726b().m744a(m740j);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }

    @Override // p012a6.InterfaceC0218dg
    /* renamed from: b */
    public final InterfaceC0218dg mo657b(EnumC0252fc enumC0252fc) {
        this.f1867a.m736f(enumC0252fc);
        return this;
    }

    @Override // p012a6.InterfaceC0218dg
    /* renamed from: c */
    public final InterfaceC0218dg mo658c(C0198cf c0198cf) {
        this.f1868b = c0198cf;
        return this;
    }

    @Override // p012a6.InterfaceC0218dg
    public final int zza() {
        return this.f1869c;
    }

    @Override // p012a6.InterfaceC0218dg
    public final String zzd() {
        C0236ef m767f = this.f1867a.m740j().m767f();
        if (m767f != null && !AbstractC0182c.m625b(m767f.m692k())) {
            return (String) AbstractC4205o.m19722k(m767f.m692k());
        }
        return "NA";
    }
}
