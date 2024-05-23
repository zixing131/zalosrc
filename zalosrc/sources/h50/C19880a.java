package h50;

import android.text.TextUtils;
import fn0.AbstractC19074t;

/* renamed from: h50.a */
/* loaded from: classes5.dex */
public class C19880a {

    /* renamed from: a */
    private String f98050a;

    /* renamed from: b */
    private String f98051b;

    public C19880a(String str, String str2) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "path");
        this.f98050a = str;
        this.f98051b = str2;
    }

    /* renamed from: a */
    public final String m103566a() {
        return this.f98050a;
    }

    /* renamed from: b */
    public final String m103567b() {
        return this.f98051b;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC19074t.m100204b(cls, getClass()) || !(obj instanceof C19880a)) {
            return false;
        }
        C19880a c19880a = (C19880a) obj;
        if (TextUtils.equals(this.f98050a, c19880a.f98050a) && TextUtils.equals(this.f98051b, c19880a.f98051b)) {
            return true;
        }
        return false;
    }
}
