package p716zh;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;
import java.util.List;
import p647xj.C29678d;
import p647xj.C29679e;

/* renamed from: zh.h9 */
/* loaded from: classes3.dex */
public final class C31947h9 {

    /* renamed from: a */
    private final String f146812a;

    /* renamed from: b */
    private final String f146813b;

    /* renamed from: c */
    private final String f146814c;

    /* renamed from: d */
    private final long f146815d;

    /* renamed from: e */
    private final long f146816e;

    /* renamed from: f */
    private final String f146817f;

    /* renamed from: g */
    private final String f146818g;

    /* renamed from: h */
    private final String f146819h;

    /* renamed from: i */
    private final List f146820i;

    /* renamed from: j */
    private final C29678d f146821j;

    /* renamed from: k */
    private final C29679e f146822k;

    public C31947h9(String str, String str2, String str3, long j11, long j12, String str4, String str5, String str6, List list, C29678d c29678d, C29679e c29679e) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "description");
        AbstractC19074t.m100208f(str3, "bannerUrl");
        AbstractC19074t.m100208f(str4, "showCaseText");
        AbstractC19074t.m100208f(str5, "seasonalId");
        AbstractC19074t.m100208f(str6, "iconUrl");
        AbstractC19074t.m100208f(list, "stickers");
        this.f146812a = str;
        this.f146813b = str2;
        this.f146814c = str3;
        this.f146815d = j11;
        this.f146816e = j12;
        this.f146817f = str4;
        this.f146818g = str5;
        this.f146819h = str6;
        this.f146820i = list;
        this.f146821j = c29678d;
        this.f146822k = c29679e;
    }

    /* renamed from: a */
    public final String m153579a() {
        return this.f146814c;
    }

    /* renamed from: b */
    public final long m153580b() {
        return this.f146816e;
    }

    /* renamed from: c */
    public final C29678d m153581c() {
        return this.f146821j;
    }

    /* renamed from: d */
    public final String m153582d() {
        return this.f146819h;
    }

    /* renamed from: e */
    public final String m153583e() {
        return this.f146818g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31947h9)) {
            return false;
        }
        C31947h9 c31947h9 = (C31947h9) obj;
        return AbstractC19074t.m100204b(this.f146812a, c31947h9.f146812a) && AbstractC19074t.m100204b(this.f146813b, c31947h9.f146813b) && AbstractC19074t.m100204b(this.f146814c, c31947h9.f146814c) && this.f146815d == c31947h9.f146815d && this.f146816e == c31947h9.f146816e && AbstractC19074t.m100204b(this.f146817f, c31947h9.f146817f) && AbstractC19074t.m100204b(this.f146818g, c31947h9.f146818g) && AbstractC19074t.m100204b(this.f146819h, c31947h9.f146819h) && AbstractC19074t.m100204b(this.f146820i, c31947h9.f146820i) && AbstractC19074t.m100204b(this.f146821j, c31947h9.f146821j) && AbstractC19074t.m100204b(this.f146822k, c31947h9.f146822k);
    }

    /* renamed from: f */
    public final C29679e m153584f() {
        return this.f146822k;
    }

    /* renamed from: g */
    public final long m153585g() {
        return this.f146815d;
    }

    /* renamed from: h */
    public final List m153586h() {
        return this.f146820i;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f146812a.hashCode() * 31) + this.f146813b.hashCode()) * 31) + this.f146814c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f146815d)) * 31) + AbstractC2147g0.m11521a(this.f146816e)) * 31) + this.f146817f.hashCode()) * 31) + this.f146818g.hashCode()) * 31) + this.f146819h.hashCode()) * 31) + this.f146820i.hashCode()) * 31;
        C29678d c29678d = this.f146821j;
        int hashCode2 = (hashCode + (c29678d == null ? 0 : c29678d.hashCode())) * 31;
        C29679e c29679e = this.f146822k;
        return hashCode2 + (c29679e != null ? c29679e.hashCode() : 0);
    }

    public String toString() {
        return "SeasonalStickerInfo(title=" + this.f146812a + ", description=" + this.f146813b + ", bannerUrl=" + this.f146814c + ", startTime=" + this.f146815d + ", endTime=" + this.f146816e + ", showCaseText=" + this.f146817f + ", seasonalId=" + this.f146818g + ", iconUrl=" + this.f146819h + ", stickers=" + this.f146820i + ", groupConditions=" + this.f146821j + ", singleChatConditions=" + this.f146822k + ")";
    }
}
