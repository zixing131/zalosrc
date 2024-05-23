package p426pp;

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

/* renamed from: pp.d */
/* loaded from: classes4.dex */
public final class C24901d {

    /* renamed from: a */
    private int f119474a;

    /* renamed from: b */
    private String f119475b;

    /* renamed from: c */
    private String f119476c;

    /* renamed from: d */
    private String f119477d;

    /* renamed from: e */
    private List f119478e;

    /* renamed from: f */
    private boolean f119479f;

    /* renamed from: g */
    private int f119480g;

    public C24901d(int i11, String str, String str2, String str3, List list, boolean z11, int i12) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "artist");
        AbstractC19074t.m100208f(str3, "thumb");
        AbstractC19074t.m100208f(list, "songs");
        this.f119474a = i11;
        this.f119475b = str;
        this.f119476c = str2;
        this.f119477d = str3;
        this.f119478e = list;
        this.f119479f = z11;
        this.f119480g = i12;
    }

    /* renamed from: d */
    public static /* synthetic */ C24901d m129475d(C24901d c24901d, int i11, String str, String str2, String str3, List list, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c24901d.f119474a;
        }
        if ((i13 & 2) != 0) {
            str = c24901d.f119475b;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            str2 = c24901d.f119476c;
        }
        String str5 = str2;
        if ((i13 & 8) != 0) {
            str3 = c24901d.f119477d;
        }
        String str6 = str3;
        if ((i13 & 16) != 0) {
            list = c24901d.f119478e;
        }
        List list2 = list;
        if ((i13 & 32) != 0) {
            z11 = c24901d.f119479f;
        }
        boolean z12 = z11;
        if ((i13 & 64) != 0) {
            i12 = c24901d.f119480g;
        }
        return c24901d.m129478c(i11, str4, str5, str6, list2, z12, i12);
    }

    /* renamed from: a */
    public final void m129476a(C24902e c24902e) {
        AbstractC19074t.m100208f(c24902e, "song");
        this.f119478e.add(c24902e.m129490f());
    }

    /* renamed from: b */
    public final C24901d m129477b(List list, int i11, boolean z11) {
        int m131511r;
        List m131222v0;
        List m131187O0;
        AbstractC19074t.m100208f(list, "appendSongs");
        List list2 = this.f119478e;
        List list3 = list;
        m131511r = AbstractC25370t.m131511r(list3, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((C24902e) it.next()).m129490f());
        }
        m131222v0 = AbstractC25332a0.m131222v0(list2, arrayList);
        m131187O0 = AbstractC25332a0.m131187O0(m131222v0);
        return m129475d(this, 0, null, null, null, m131187O0, z11, i11, 15, null);
    }

    /* renamed from: c */
    public final C24901d m129478c(int i11, String str, String str2, String str3, List list, boolean z11, int i12) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "artist");
        AbstractC19074t.m100208f(str3, "thumb");
        AbstractC19074t.m100208f(list, "songs");
        return new C24901d(i11, str, str2, str3, list, z11, i12);
    }

    /* renamed from: e */
    public final boolean m129479e() {
        return this.f119479f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24901d)) {
            return false;
        }
        C24901d c24901d = (C24901d) obj;
        return this.f119474a == c24901d.f119474a && AbstractC19074t.m100204b(this.f119475b, c24901d.f119475b) && AbstractC19074t.m100204b(this.f119476c, c24901d.f119476c) && AbstractC19074t.m100204b(this.f119477d, c24901d.f119477d) && AbstractC19074t.m100204b(this.f119478e, c24901d.f119478e) && this.f119479f == c24901d.f119479f && this.f119480g == c24901d.f119480g;
    }

    /* renamed from: f */
    public final int m129480f() {
        return this.f119474a;
    }

    /* renamed from: g */
    public final String m129481g() {
        return this.f119475b;
    }

    /* renamed from: h */
    public final int m129482h() {
        return this.f119480g;
    }

    public int hashCode() {
        return (((((((((((this.f119474a * 31) + this.f119475b.hashCode()) * 31) + this.f119476c.hashCode()) * 31) + this.f119477d.hashCode()) * 31) + this.f119478e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f119479f)) * 31) + this.f119480g;
    }

    /* renamed from: i */
    public final List m129483i() {
        return this.f119478e;
    }

    /* renamed from: j */
    public final String m129484j() {
        return this.f119477d;
    }

    public String toString() {
        return "SongCategory(id=" + this.f119474a + ", name=" + this.f119475b + ", artist=" + this.f119476c + ", thumb=" + this.f119477d + ", songs=" + this.f119478e + ", hasMore=" + this.f119479f + ", page=" + this.f119480g + ")";
    }

    public /* synthetic */ C24901d(int i11, String str, String str2, String str3, List list, boolean z11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) == 0 ? str3 : "", (i13 & 16) != 0 ? new ArrayList() : list, (i13 & 32) != 0 ? false : z11, (i13 & 64) != 0 ? 0 : i12);
    }

    public C24901d(JSONObject jSONObject) {
        this(0, null, null, null, null, false, 0, 127, null);
        if (jSONObject == null) {
            return;
        }
        try {
            this.f119474a = jSONObject.optInt("id");
            String optString = jSONObject.optString("name");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f119475b = optString;
            String optString2 = jSONObject.optString("artist");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            this.f119476c = optString2;
            String optString3 = jSONObject.optString("icon");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            this.f119477d = optString3;
            boolean z11 = true;
            if (jSONObject.optInt("hasMore") != 1) {
                z11 = false;
            }
            this.f119479f = z11;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
