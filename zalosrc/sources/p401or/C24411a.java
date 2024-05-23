package p401or;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.models.PrivacyInfo;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: or.a */
/* loaded from: classes4.dex */
public final class C24411a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f117884a;

    /* renamed from: b */
    private PrivacyInfo f117885b;

    /* renamed from: c */
    private final String f117886c;

    /* renamed from: d */
    private boolean f117887d;

    /* renamed from: e */
    private final boolean f117888e;

    /* renamed from: f */
    private final boolean f117889f;

    /* renamed from: or.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24411a(int i11, PrivacyInfo privacyInfo, String str, boolean z11, boolean z12, boolean z13) {
        AbstractC19074t.m100208f(str, "headerInfoStr");
        this.f117884a = i11;
        this.f117885b = privacyInfo;
        this.f117886c = str;
        this.f117887d = z11;
        this.f117888e = z12;
        this.f117889f = z13;
    }

    /* renamed from: a */
    public final PrivacyInfo m127668a() {
        return this.f117885b;
    }

    /* renamed from: b */
    public final int m127669b() {
        return this.f117884a;
    }

    /* renamed from: c */
    public final boolean m127670c() {
        return this.f117887d;
    }

    /* renamed from: d */
    public final boolean m127671d() {
        return this.f117888e;
    }

    /* renamed from: e */
    public final boolean m127672e() {
        return this.f117889f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24411a)) {
            return false;
        }
        C24411a c24411a = (C24411a) obj;
        return this.f117884a == c24411a.f117884a && AbstractC19074t.m100204b(this.f117885b, c24411a.f117885b) && AbstractC19074t.m100204b(this.f117886c, c24411a.f117886c) && this.f117887d == c24411a.f117887d && this.f117888e == c24411a.f117888e && this.f117889f == c24411a.f117889f;
    }

    /* renamed from: f */
    public final void m127673f(boolean z11) {
        this.f117887d = z11;
    }

    /* renamed from: g */
    public final void m127674g(PrivacyInfo privacyInfo) {
        this.f117885b = privacyInfo;
    }

    public int hashCode() {
        int i11 = this.f117884a * 31;
        PrivacyInfo privacyInfo = this.f117885b;
        return ((((((((i11 + (privacyInfo == null ? 0 : privacyInfo.hashCode())) * 31) + this.f117886c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f117887d)) * 31) + AbstractC2144f.m11520a(this.f117888e)) * 31) + AbstractC2144f.m11520a(this.f117889f);
    }

    public String toString() {
        return "StoryPrivacyBottomSheetAdapterData(rowType=" + this.f117884a + ", privacyInfo=" + this.f117885b + ", headerInfoStr=" + this.f117886c + ", isCheckBoxSelect=" + this.f117887d + ", isShowCaret=" + this.f117888e + ", isShowSeparator=" + this.f117889f + ")";
    }

    public /* synthetic */ C24411a(int i11, PrivacyInfo privacyInfo, String str, boolean z11, boolean z12, boolean z13, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? new PrivacyInfo() : privacyInfo, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
    }
}
