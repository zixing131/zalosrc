package p548ui;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.io.File;
import org.json.JSONObject;

/* renamed from: ui.a */
/* loaded from: classes3.dex */
public final class C27271a {

    /* renamed from: a */
    private final File f128293a;

    /* renamed from: b */
    private final long f128294b;

    /* renamed from: c */
    private final int f128295c;

    /* renamed from: d */
    private final JSONObject f128296d;

    /* renamed from: e */
    private final String f128297e;

    /* renamed from: f */
    private final int f128298f;

    /* renamed from: g */
    private final int f128299g;

    /* renamed from: h */
    private final int f128300h;

    /* renamed from: i */
    private final int f128301i;

    /* renamed from: j */
    private final int f128302j;

    public C27271a(File file, long j11, int i11, JSONObject jSONObject, String str, int i12, int i13, int i14, int i15, int i16) {
        AbstractC19074t.m100208f(file, "backupFile");
        AbstractC19074t.m100208f(str, "syncSession");
        this.f128293a = file;
        this.f128294b = j11;
        this.f128295c = i11;
        this.f128296d = jSONObject;
        this.f128297e = str;
        this.f128298f = i12;
        this.f128299g = i13;
        this.f128300h = i14;
        this.f128301i = i15;
        this.f128302j = i16;
    }

    /* renamed from: a */
    public final File m139614a() {
        return this.f128293a;
    }

    /* renamed from: b */
    public final JSONObject m139615b() {
        return this.f128296d;
    }

    /* renamed from: c */
    public final int m139616c() {
        return this.f128302j;
    }

    /* renamed from: d */
    public final long m139617d() {
        return this.f128294b;
    }

    /* renamed from: e */
    public final int m139618e() {
        return this.f128295c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27271a)) {
            return false;
        }
        C27271a c27271a = (C27271a) obj;
        return AbstractC19074t.m100204b(this.f128293a, c27271a.f128293a) && this.f128294b == c27271a.f128294b && this.f128295c == c27271a.f128295c && AbstractC19074t.m100204b(this.f128296d, c27271a.f128296d) && AbstractC19074t.m100204b(this.f128297e, c27271a.f128297e) && this.f128298f == c27271a.f128298f && this.f128299g == c27271a.f128299g && this.f128300h == c27271a.f128300h && this.f128301i == c27271a.f128301i && this.f128302j == c27271a.f128302j;
    }

    /* renamed from: f */
    public final int m139619f() {
        return this.f128300h;
    }

    /* renamed from: g */
    public final int m139620g() {
        return this.f128301i;
    }

    /* renamed from: h */
    public final int m139621h() {
        return this.f128299g;
    }

    public int hashCode() {
        int hashCode = ((((this.f128293a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f128294b)) * 31) + this.f128295c) * 31;
        JSONObject jSONObject = this.f128296d;
        return ((((((((((((hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + this.f128297e.hashCode()) * 31) + this.f128298f) * 31) + this.f128299g) * 31) + this.f128300h) * 31) + this.f128301i) * 31) + this.f128302j;
    }

    /* renamed from: i */
    public final String m139622i() {
        return this.f128297e;
    }

    /* renamed from: j */
    public final int m139623j() {
        return this.f128298f;
    }

    public String toString() {
        return "BackupDBParams(backupFile=" + this.f128293a + ", clientTime=" + this.f128294b + ", entryPoint=" + this.f128295c + ", backupInfoJson=" + this.f128296d + ", syncSession=" + this.f128297e + ", triggerStatus=" + this.f128298f + ", networkType=" + this.f128299g + ", freshInstall=" + this.f128300h + ", imeiStatus=" + this.f128301i + ", backupStorage=" + this.f128302j + ")";
    }
}
