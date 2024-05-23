package ph;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ph.i */
/* loaded from: classes3.dex */
public final class C24756i {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f118867a;

    /* renamed from: b */
    private final int f118868b;

    /* renamed from: c */
    private final boolean f118869c;

    /* renamed from: d */
    private final long f118870d;

    /* renamed from: e */
    private final int f118871e;

    /* renamed from: f */
    private final int f118872f;

    /* renamed from: g */
    private final int f118873g;

    /* renamed from: h */
    private final String f118874h;

    /* renamed from: i */
    private final String f118875i;

    /* renamed from: ph.i$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24756i(int i11, int i12, boolean z11, long j11, int i13, int i14, int i15, String str) {
        String valueOf;
        AbstractC19074t.m100208f(str, "icon");
        this.f118867a = i11;
        this.f118868b = i12;
        this.f118869c = z11;
        this.f118870d = j11;
        this.f118871e = i13;
        this.f118872f = i14;
        this.f118873g = i15;
        this.f118874h = str;
        if (z11) {
            valueOf = "group_" + i12;
        } else {
            valueOf = String.valueOf(i12);
        }
        this.f118875i = valueOf;
    }

    /* renamed from: a */
    public final MessageId m128630a() {
        return MessageId.Companion.m41065d(this.f118870d, 0L, this.f118875i, String.valueOf(this.f118871e));
    }

    /* renamed from: b */
    public final int m128631b() {
        return this.f118872f;
    }

    /* renamed from: c */
    public final String m128632c() {
        return C24753f.Companion.m128615b(this.f118873g, this.f118874h).m128597j();
    }

    /* renamed from: d */
    public final boolean m128633d() {
        return this.f118867a == Integer.MIN_VALUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24756i)) {
            return false;
        }
        C24756i c24756i = (C24756i) obj;
        return this.f118867a == c24756i.f118867a && this.f118868b == c24756i.f118868b && this.f118869c == c24756i.f118869c && this.f118870d == c24756i.f118870d && this.f118871e == c24756i.f118871e && this.f118872f == c24756i.f118872f && this.f118873g == c24756i.f118873g && AbstractC19074t.m100204b(this.f118874h, c24756i.f118874h);
    }

    public int hashCode() {
        return (((((((((((((this.f118867a * 31) + this.f118868b) * 31) + AbstractC2144f.m11520a(this.f118869c)) * 31) + AbstractC2147g0.m11521a(this.f118870d)) * 31) + this.f118871e) * 31) + this.f118872f) * 31) + this.f118873g) * 31) + this.f118874h.hashCode();
    }

    public String toString() {
        return "ZDBReactionApiResponse(rowId=" + this.f118867a + ", ownerId=" + this.f118868b + ", isGroup=" + this.f118869c + ", clientMsgId=" + this.f118870d + ", msgSenderId=" + this.f118871e + ", reactSenderId=" + this.f118872f + ", type=" + this.f118873g + ", icon=" + this.f118874h + ")";
    }
}
