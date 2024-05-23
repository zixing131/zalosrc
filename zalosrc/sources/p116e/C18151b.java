package p116e;

import java.util.HashMap;

/* renamed from: e.b */
/* loaded from: classes2.dex */
public class C18151b {

    /* renamed from: a */
    private static C18151b f91809a;

    /* renamed from: b */
    private static HashMap f91810b;

    private C18151b() {
        f91810b = new HashMap();
    }

    /* renamed from: a */
    public static C18151b m96441a() {
        if (f91809a == null) {
            f91809a = new C18151b();
        }
        return f91809a;
    }

    /* renamed from: b */
    public C18153d m96442b(String str, int i11) {
        try {
            if (f91810b == null) {
                f91810b = new HashMap();
            }
            C18153d c18153d = (C18153d) f91810b.get(str);
            if (c18153d != null) {
                return c18153d;
            }
            try {
                c18153d = C18153d.m96446a(i11);
                f91810b.put(str, c18153d);
                return c18153d;
            } catch (Exception unused) {
                return c18153d;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
