package nj0;

import com.zing.zalo.zinstant.InterfaceC17139d;

/* renamed from: nj0.a */
/* loaded from: classes.dex */
public abstract class AbstractC23802a implements InterfaceC17139d {

    /* renamed from: a */
    protected InterfaceC17139d f115048a;

    @Override // com.zing.zalo.zinstant.InterfaceC17139d
    /* renamed from: a */
    public Object mo91642a(String str, String str2, String str3) {
        InterfaceC17139d interfaceC17139d = this.f115048a;
        if (interfaceC17139d != null) {
            return interfaceC17139d.mo91642a(str, str2, str3);
        }
        return null;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17139d
    /* renamed from: b */
    public int mo91643b(String str, String str2, boolean z11) {
        InterfaceC17139d interfaceC17139d = this.f115048a;
        if (interfaceC17139d != null) {
            return interfaceC17139d.mo91643b(str, str2, z11);
        }
        return -1;
    }

    @Override // com.zing.zalo.zinstant.InterfaceC17139d
    /* renamed from: c */
    public String mo91644c(String str, String str2, String str3) {
        InterfaceC17139d interfaceC17139d = this.f115048a;
        if (interfaceC17139d != null) {
            return interfaceC17139d.mo91644c(str, str2, str3);
        }
        return "";
    }

    /* renamed from: d */
    public void m124373d(InterfaceC17139d interfaceC17139d) {
        this.f115048a = interfaceC17139d;
    }
}
