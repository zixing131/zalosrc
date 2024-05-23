package jm0;

import java.io.OutputStream;

/* renamed from: jm0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC21293c implements InterfaceC21292b {

    /* renamed from: a */
    public String f103727a;

    /* renamed from: b */
    public String f103728b;

    /* renamed from: c */
    public String f103729c;

    /* renamed from: d */
    private InterfaceC21292b f103730d;

    /* renamed from: e */
    private final byte[] f103731e;

    public AbstractC21293c(String str, String str2, String str3, boolean z11) {
        this.f103727a = "";
        this.f103728b = "";
        this.f103729c = "";
        if (str != null) {
            this.f103727a = str;
        }
        if (str2 != null) {
            this.f103728b = str2;
        }
        if (str3 != null) {
            this.f103729c = str3;
        }
        StringBuilder sb2 = new StringBuilder("");
        sb2.append("--ZiNgMeMoBiLe\r\n");
        sb2.append("Content-Disposition: form-data; name=\"");
        if (z11) {
            sb2.append(AbstractC21305o.m110332a(str, "UTF-8"));
        } else {
            sb2.append(str);
        }
        sb2.append("\"; filename=\"");
        if (z11) {
            sb2.append(AbstractC21305o.m110332a(str2, "UTF-8"));
        } else {
            sb2.append(str2);
        }
        sb2.append("\"\r\nContent-Type: ");
        if (z11) {
            sb2.append(AbstractC21305o.m110332a(str3, "UTF-8"));
        } else {
            sb2.append(str3);
        }
        sb2.append("\r\n\r\n");
        String sb3 = sb2.toString();
        if (z11) {
            this.f103731e = sb3.getBytes("UTF-8");
        } else {
            this.f103731e = sb3.getBytes();
        }
    }

    @Override // jm0.InterfaceC21292b
    /* renamed from: a */
    public boolean mo110257a() {
        InterfaceC21292b interfaceC21292b = this.f103730d;
        if (interfaceC21292b != null && interfaceC21292b.mo110258b() && this.f103730d.mo110257a()) {
            return true;
        }
        return false;
    }

    @Override // jm0.InterfaceC21292b
    /* renamed from: b */
    public boolean mo110258b() {
        InterfaceC21292b interfaceC21292b = this.f103730d;
        if (interfaceC21292b != null && interfaceC21292b.mo110258b()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public abstract long mo110259c();

    /* renamed from: d */
    public final long m110260d() {
        return this.f103731e.length;
    }

    /* renamed from: e */
    public void m110261e(InterfaceC21292b interfaceC21292b) {
        this.f103730d = interfaceC21292b;
    }

    /* renamed from: f */
    protected abstract void mo110262f(OutputStream outputStream);

    /* renamed from: g */
    public final void m110263g(OutputStream outputStream) {
        outputStream.write(this.f103731e);
        mo110262f(outputStream);
    }

    public AbstractC21293c(String str, String str2, String str3) {
        this.f103727a = "";
        this.f103728b = "";
        this.f103729c = "";
        if (str != null) {
            this.f103727a = str;
        }
        if (str2 != null) {
            this.f103728b = str2;
        }
        if (str3 != null) {
            this.f103729c = str3;
        }
        this.f103731e = ("--ZiNgMeMoBiLe\r\nContent-Disposition: form-data; name=\"" + AbstractC21305o.m110332a(str, "UTF-8") + "\"; filename=\"" + AbstractC21305o.m110332a(str2, "UTF-8") + "\"\r\nContent-Type: " + AbstractC21305o.m110332a(str3, "UTF-8") + "\r\n\r\n").getBytes("UTF-8");
    }
}
