package p161fg;

import android.os.Bundle;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* renamed from: fg.r */
/* loaded from: classes3.dex */
public class C18927r implements Serializable {

    /* renamed from: p */
    public String f94425p;

    /* renamed from: q */
    public int f94426q;

    /* renamed from: r */
    public CharSequence f94427r;

    /* renamed from: s */
    public Bundle f94428s;

    /* renamed from: t */
    public List f94429t;

    /* renamed from: u */
    public int f94430u;

    /* renamed from: v */
    public Class f94431v;

    /* renamed from: w */
    public boolean f94432w;

    /* renamed from: x */
    public boolean f94433x;

    /* renamed from: y */
    public boolean f94434y;

    public C18927r(String str, CharSequence charSequence, int i11, List list, Bundle bundle, Class cls, boolean z11) {
        this(str, charSequence, i11, list, bundle, cls, z11, false, false);
    }

    /* renamed from: a */
    public boolean m99172a() {
        if (this.f94432w && !m99173b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean m99173b() {
        return "MAIN_CHAT_HEAD".equals(this.f94425p);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            try {
                if (!(obj instanceof C18927r) || !this.f94425p.equals(((C18927r) obj).f94425p)) {
                    return false;
                }
                if (this.f94431v != ((C18927r) obj).f94431v) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.f94425p, this.f94431v);
    }

    public C18927r(String str, CharSequence charSequence, int i11, List list, Bundle bundle, Class cls, boolean z11, boolean z12, boolean z13) {
        this.f94425p = str;
        this.f94427r = charSequence;
        this.f94426q = i11;
        this.f94428s = bundle;
        this.f94429t = list;
        this.f94431v = cls;
        this.f94432w = z11;
        this.f94433x = z12;
        this.f94434y = z13;
    }
}
