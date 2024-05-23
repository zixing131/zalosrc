package p210hh;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import on0.AbstractC24344y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: hh.c */
/* loaded from: classes3.dex */
public final class C20060c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f98639a;

    /* renamed from: b */
    private final String f98640b;

    /* renamed from: c */
    private final String f98641c;

    /* renamed from: d */
    private final String f98642d;

    /* renamed from: e */
    private final int f98643e;

    /* renamed from: f */
    private final long f98644f;

    /* renamed from: g */
    private C20062e f98645g;

    /* renamed from: hh.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20060c m104220a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            int optInt = jSONObject.optInt("id", -1);
            String optString = jSONObject.optString("text", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            String optString2 = jSONObject.optString("color", "#B9BDC1");
            AbstractC19074t.m100207e(optString2, "optString(...)");
            String optString3 = jSONObject.optString("emoji", "");
            AbstractC19074t.m100207e(optString3, "optString(...)");
            return new C20060c(optInt, optString, optString2, optString3, jSONObject.optInt("offset", 0), jSONObject.optLong("createTime", 0L), null, 64, null);
        }

        /* renamed from: b */
        public final List m104221b(JSONArray jSONArray) {
            Integer num;
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = jSONArray.get(i11);
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        arrayList.add(Integer.valueOf(num.intValue()));
                    }
                }
            }
            return arrayList;
        }
    }

    public C20060c(int i11, String str, String str2, String str3, int i12, long j11, C20062e c20062e) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "color");
        AbstractC19074t.m100208f(str3, "emoji");
        this.f98639a = i11;
        this.f98640b = str;
        this.f98641c = str2;
        this.f98642d = str3;
        this.f98643e = i12;
        this.f98644f = j11;
        this.f98645g = c20062e;
    }

    /* renamed from: i */
    private final boolean m104211i(String str) {
        Matcher matcher = Pattern.compile("#([\\d,a-fA-F]{2}){3,4}\\b").matcher(str);
        if (!matcher.find(0) || !AbstractC19074t.m100204b(str, matcher.group())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String m104212a() {
        if (m104211i(this.f98641c)) {
            return this.f98641c;
        }
        return "#B9BDC1";
    }

    /* renamed from: b */
    public final long m104213b() {
        return this.f98644f;
    }

    /* renamed from: c */
    public final String m104214c() {
        return this.f98642d;
    }

    /* renamed from: d */
    public final int m104215d() {
        return this.f98639a;
    }

    /* renamed from: e */
    public final String m104216e() {
        return this.f98640b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20060c)) {
            return false;
        }
        C20060c c20060c = (C20060c) obj;
        return this.f98639a == c20060c.f98639a && AbstractC19074t.m100204b(this.f98640b, c20060c.f98640b) && AbstractC19074t.m100204b(this.f98641c, c20060c.f98641c) && AbstractC19074t.m100204b(this.f98642d, c20060c.f98642d) && this.f98643e == c20060c.f98643e && this.f98644f == c20060c.f98644f && AbstractC19074t.m100204b(this.f98645g, c20060c.f98645g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:            if (r0.m104230a() != r6) goto L6;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m104217f(int i11) {
        CharSequence m127209h1;
        int i12;
        String str;
        MatchResult matchResult;
        int groupCount;
        String m104231b;
        C20062e c20062e = this.f98645g;
        if (c20062e != null) {
            AbstractC19074t.m100205c(c20062e);
        }
        if (this.f98640b.length() <= i11) {
            str = this.f98640b;
        } else {
            Pattern compile = Pattern.compile("(\\W+)", 64);
            int i13 = i11 + 1;
            String substring = this.f98640b.substring(0, i13);
            AbstractC19074t.m100207e(substring, "substring(...)");
            m127209h1 = AbstractC24344y.m127209h1(substring);
            Matcher matcher = compile.matcher(m127209h1.toString());
            if (!matcher.find() || (groupCount = (matchResult = matcher.toMatchResult()).groupCount()) <= 0 || (i12 = i13 - matchResult.end(groupCount - 1)) <= 0) {
                i12 = i11;
            }
            str = ((Object) this.f98640b.subSequence(0, i12)) + "…";
        }
        this.f98645g = new C20062e(str, i11);
        C20062e c20062e2 = this.f98645g;
        if (c20062e2 == null || (m104231b = c20062e2.m104231b()) == null) {
            return this.f98640b;
        }
        return m104231b;
    }

    /* renamed from: g */
    public final int m104218g() {
        return this.f98643e;
    }

    /* renamed from: h */
    public final boolean m104219h() {
        if (m104211i(this.f98641c) && this.f98640b.length() > 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f98639a * 31) + this.f98640b.hashCode()) * 31) + this.f98641c.hashCode()) * 31) + this.f98642d.hashCode()) * 31) + this.f98643e) * 31) + AbstractC2147g0.m11521a(this.f98644f)) * 31;
        C20062e c20062e = this.f98645g;
        return hashCode + (c20062e == null ? 0 : c20062e.hashCode());
    }

    public String toString() {
        return "ChatTagInfo(id=" + this.f98639a + ", name=" + this.f98640b + ", color=" + this.f98641c + ", emoji=" + this.f98642d + ", offset=" + this.f98643e + ", createdTime=" + this.f98644f + ", nameTruncatedInfo=" + this.f98645g + ")";
    }

    public /* synthetic */ C20060c(int i11, String str, String str2, String str3, int i12, long j11, C20062e c20062e, int i13, AbstractC19060k abstractC19060k) {
        this(i11, str, str2, str3, i12, j11, (i13 & 64) != 0 ? null : c20062e);
    }
}
