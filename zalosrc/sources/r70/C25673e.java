package r70;

import bi0.AbstractC2808b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.EnumC20799i;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: r70.e */
/* loaded from: classes5.dex */
public final class C25673e extends AbstractC25672d {

    /* renamed from: c */
    private final EnumC20799i f122641c;

    /* renamed from: d */
    private final int f122642d;

    /* renamed from: e */
    private String f122643e;

    /* renamed from: f */
    private String f122644f;

    /* renamed from: g */
    private int f122645g;

    /* renamed from: h */
    private String f122646h;

    /* renamed from: i */
    private int f122647i;

    /* renamed from: j */
    private int f122648j;

    /* renamed from: k */
    private int f122649k;

    /* renamed from: l */
    private int f122650l;

    /* renamed from: m */
    private boolean f122651m;

    /* renamed from: n */
    private boolean f122652n;

    /* renamed from: o */
    private boolean f122653o;

    /* renamed from: p */
    private boolean f122654p;

    /* renamed from: q */
    private boolean f122655q;

    /* renamed from: r */
    private String f122656r;

    /* renamed from: s */
    private boolean f122657s;

    /* renamed from: t */
    private int f122658t;

    /* renamed from: u */
    private String f122659u;

    public /* synthetic */ C25673e(EnumC20799i enumC20799i, int i11, String str, String str2, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(enumC20799i, i11, str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? 2 : i12);
    }

    /* renamed from: A */
    public final void m132559A(boolean z11) {
        this.f122654p = z11;
    }

    /* renamed from: B */
    public final void m132560B(boolean z11) {
        this.f122653o = z11;
    }

    /* renamed from: C */
    public final void m132561C(boolean z11) {
        this.f122655q = z11;
    }

    /* renamed from: D */
    public final void m132562D(boolean z11) {
        this.f122657s = z11;
    }

    /* renamed from: E */
    public final void m132563E(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f122656r = str;
    }

    /* renamed from: d */
    public final String m132564d() {
        return this.f122644f;
    }

    /* renamed from: e */
    public final int m132565e() {
        return this.f122649k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25673e)) {
            return false;
        }
        C25673e c25673e = (C25673e) obj;
        return this.f122641c == c25673e.f122641c && this.f122642d == c25673e.f122642d && AbstractC19074t.m100204b(this.f122643e, c25673e.f122643e) && AbstractC19074t.m100204b(this.f122644f, c25673e.f122644f) && this.f122645g == c25673e.f122645g;
    }

    /* renamed from: f */
    public final int m132566f() {
        return this.f122642d;
    }

    /* renamed from: g */
    public final int m132567g() {
        return this.f122650l;
    }

    /* renamed from: h */
    public final EnumC20799i m132568h() {
        return this.f122641c;
    }

    public int hashCode() {
        return (((((((this.f122641c.hashCode() * 31) + this.f122642d) * 31) + this.f122643e.hashCode()) * 31) + this.f122644f.hashCode()) * 31) + this.f122645g;
    }

    /* renamed from: i */
    public final int m132569i() {
        return this.f122658t;
    }

    /* renamed from: j */
    public final String m132570j() {
        return this.f122659u;
    }

    /* renamed from: k */
    public final boolean m132571k() {
        return this.f122651m;
    }

    /* renamed from: l */
    public final boolean m132572l() {
        return this.f122652n;
    }

    /* renamed from: m */
    public final boolean m132573m() {
        return this.f122654p;
    }

    /* renamed from: n */
    public final boolean m132574n() {
        return this.f122653o;
    }

    /* renamed from: o */
    public final boolean m132575o() {
        return this.f122655q;
    }

    /* renamed from: p */
    public final boolean m132576p() {
        return this.f122657s;
    }

    /* renamed from: q */
    public final String m132577q() {
        return this.f122646h;
    }

    /* renamed from: r */
    public final String m132578r() {
        return this.f122643e;
    }

    /* renamed from: s */
    public final String m132579s() {
        return this.f122656r;
    }

    /* renamed from: t */
    public final int m132580t() {
        return this.f122645g;
    }

    public String toString() {
        return "SettingData(id=" + this.f122641c + ", icon=" + this.f122642d + ", title=" + this.f122643e + ", desc=" + this.f122644f + ", type=" + this.f122645g + ")";
    }

    /* renamed from: u */
    public final void m132581u(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f122644f = str;
    }

    /* renamed from: v */
    public final void m132582v(int i11) {
        this.f122649k = i11;
    }

    /* renamed from: w */
    public final void m132583w(int i11) {
        this.f122658t = i11;
    }

    /* renamed from: x */
    public final void m132584x(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f122659u = str;
    }

    /* renamed from: y */
    public final void m132585y(boolean z11) {
        this.f122651m = z11;
    }

    /* renamed from: z */
    public final void m132586z(boolean z11) {
        this.f122652n = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25673e(EnumC20799i enumC20799i, int i11, String str, String str2, int i12) {
        super(i12);
        AbstractC19074t.m100208f(enumC20799i, "id");
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        this.f122641c = enumC20799i;
        this.f122642d = i11;
        this.f122643e = str;
        this.f122644f = str2;
        this.f122645g = i12;
        this.f122646h = "";
        this.f122647i = C23212s8.m119606n(AbstractC21196a.TextColor1);
        this.f122648j = C23212s8.m119606n(AbstractC21196a.TextColor2);
        this.f122649k = C23212s8.m119606n(AbstractC21196a.TextColor2);
        this.f122650l = AbstractC2808b.f150821b60;
        this.f122651m = true;
        this.f122656r = "";
        this.f122658t = -1;
        this.f122659u = "";
    }
}
