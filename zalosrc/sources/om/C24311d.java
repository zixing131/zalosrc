package om;

import java.util.Locale;

/* renamed from: om.d */
/* loaded from: classes.dex */
public class C24311d {

    /* renamed from: a */
    private String f117395a;

    /* renamed from: b */
    private String f117396b;

    /* renamed from: a */
    public String m126956a() {
        return this.f117396b;
    }

    /* renamed from: b */
    public String m126957b() {
        return this.f117395a;
    }

    /* renamed from: c */
    public void m126958c(String str) {
        this.f117396b = str;
    }

    /* renamed from: d */
    public void m126959d(String str) {
        this.f117395a = str;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "sdkid: %s, privateKey: %s", this.f117395a, this.f117396b);
    }
}
