package p056cj;

import java.nio.charset.StandardCharsets;

/* renamed from: cj.i */
/* loaded from: classes3.dex */
public class C3541i {

    /* renamed from: a */
    private String f14946a;

    public C3541i(String str) {
        this.f14946a = str;
    }

    /* renamed from: a */
    public byte[] m18000a() {
        String str = this.f14946a;
        if (str == null) {
            return new byte[0];
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: b */
    public String m18001b() {
        return this.f14946a;
    }

    /* renamed from: c */
    public boolean m18002c() {
        String str = this.f14946a;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3541i) {
            return ((C3541i) obj).f14946a.equals(this.f14946a);
        }
        return false;
    }
}
