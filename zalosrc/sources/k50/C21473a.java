package k50;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* renamed from: k50.a */
/* loaded from: classes5.dex */
public final class C21473a {

    /* renamed from: a */
    private int f104487a;

    /* renamed from: b */
    private String f104488b;

    /* renamed from: c */
    private String f104489c;

    /* renamed from: d */
    private String f104490d;

    /* renamed from: e */
    private List f104491e;

    /* renamed from: f */
    private boolean f104492f;

    /* renamed from: g */
    private int f104493g;

    public C21473a(int i11, String str, String str2, String str3, List list, boolean z11, int i12) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "artist");
        AbstractC19074t.m100208f(str3, "thumb");
        AbstractC19074t.m100208f(list, "ringtones");
        this.f104487a = i11;
        this.f104488b = str;
        this.f104489c = str2;
        this.f104490d = str3;
        this.f104491e = list;
        this.f104492f = z11;
        this.f104493g = i12;
    }

    /* renamed from: d */
    public static /* synthetic */ C21473a m111069d(C21473a c21473a, int i11, String str, String str2, String str3, List list, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c21473a.f104487a;
        }
        if ((i13 & 2) != 0) {
            str = c21473a.f104488b;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            str2 = c21473a.f104489c;
        }
        String str5 = str2;
        if ((i13 & 8) != 0) {
            str3 = c21473a.f104490d;
        }
        String str6 = str3;
        if ((i13 & 16) != 0) {
            list = c21473a.f104491e;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            z11 = c21473a.f104492f;
        }
        boolean z12 = z11;
        if ((i13 & 64) != 0) {
            i12 = c21473a.f104493g;
        }
        return c21473a.m111072c(i11, str4, str5, str6, list2, z12, i12);
    }

    /* renamed from: a */
    public final void m111070a(C21475c c21475c) {
        AbstractC19074t.m100208f(c21475c, "song");
        this.f104491e.add(c21475c.m111085b());
    }

    /* renamed from: b */
    public final C21473a m111071b(List list, int i11, boolean z11) {
        int m131511r;
        List m131222v0;
        List m131187O0;
        AbstractC19074t.m100208f(list, "appendRingtones");
        List list2 = this.f104491e;
        List list3 = list;
        m131511r = AbstractC25370t.m131511r(list3, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((C21475c) it.next()).m111085b());
        }
        m131222v0 = AbstractC25332a0.m131222v0(list2, arrayList);
        m131187O0 = AbstractC25332a0.m131187O0(m131222v0);
        return m111069d(this, 0, null, null, null, m131187O0, z11, i11, 15, null);
    }

    /* renamed from: c */
    public final C21473a m111072c(int i11, String str, String str2, String str3, List list, boolean z11, int i12) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "artist");
        AbstractC19074t.m100208f(str3, "thumb");
        AbstractC19074t.m100208f(list, "ringtones");
        return new C21473a(i11, str, str2, str3, list, z11, i12);
    }

    /* renamed from: e */
    public final boolean m111073e() {
        return this.f104492f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21473a)) {
            return false;
        }
        C21473a c21473a = (C21473a) obj;
        return this.f104487a == c21473a.f104487a && AbstractC19074t.m100204b(this.f104488b, c21473a.f104488b) && AbstractC19074t.m100204b(this.f104489c, c21473a.f104489c) && AbstractC19074t.m100204b(this.f104490d, c21473a.f104490d) && AbstractC19074t.m100204b(this.f104491e, c21473a.f104491e) && this.f104492f == c21473a.f104492f && this.f104493g == c21473a.f104493g;
    }

    /* renamed from: f */
    public final int m111074f() {
        return this.f104487a;
    }

    /* renamed from: g */
    public final String m111075g() {
        return this.f104488b;
    }

    /* renamed from: h */
    public final int m111076h() {
        return this.f104493g;
    }

    public int hashCode() {
        return (((((((((((this.f104487a * 31) + this.f104488b.hashCode()) * 31) + this.f104489c.hashCode()) * 31) + this.f104490d.hashCode()) * 31) + this.f104491e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f104492f)) * 31) + this.f104493g;
    }

    /* renamed from: i */
    public final List m111077i() {
        return this.f104491e;
    }

    /* renamed from: j */
    public final String m111078j() {
        return this.f104490d;
    }

    public String toString() {
        return "RingtoneCategory(id=" + this.f104487a + ", name=" + this.f104488b + ", artist=" + this.f104489c + ", thumb=" + this.f104490d + ", ringtones=" + this.f104491e + ", hasMore=" + this.f104492f + ", page=" + this.f104493g + ")";
    }

    public /* synthetic */ C21473a(int i11, String str, String str2, String str3, List list, boolean z11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) == 0 ? str3 : "", (i13 & 16) != 0 ? new ArrayList() : list, (i13 & 32) != 0 ? false : z11, (i13 & 64) != 0 ? 0 : i12);
    }

    public C21473a(JSONObject jSONObject) {
        this(0, null, null, null, null, false, 0, 127, null);
        if (jSONObject == null) {
            return;
        }
        try {
            this.f104487a = jSONObject.optInt("id");
            String optString = jSONObject.optString("name");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f104488b = optString;
            String optString2 = jSONObject.optString("artist");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f104489c = optString2;
            String optString3 = jSONObject.optString("icon");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f104490d = optString3;
            boolean z11 = true;
            if (jSONObject.optInt("hasMore") != 1) {
                z11 = false;
            }
            this.f104492f = z11;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
