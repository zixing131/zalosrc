package om;

import java.util.Locale;

/* renamed from: om.a */
/* loaded from: classes.dex */
public class C24308a {

    /* renamed from: a */
    private String f117386a = "";

    /* renamed from: b */
    private long f117387b;

    /* renamed from: a */
    public String m126943a() {
        return this.f117386a;
    }

    /* renamed from: b */
    public long m126944b() {
        return this.f117387b;
    }

    /* renamed from: c */
    public void m126945c(String str) {
        this.f117386a = str;
    }

    /* renamed from: d */
    public void m126946d(long j11) {
        this.f117387b = j11;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "did: %s, expire: %d", this.f117386a, Long.valueOf(this.f117387b));
    }
}
