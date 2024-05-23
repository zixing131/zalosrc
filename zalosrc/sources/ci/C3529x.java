package ci;

import au.EnumC2382z;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ci.x */
/* loaded from: classes3.dex */
public final class C3529x {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f14834a;

    /* renamed from: c */
    private MessageId f14836c;

    /* renamed from: d */
    private long f14837d;

    /* renamed from: b */
    private EnumC2382z f14835b = EnumC2382z.f9944q;

    /* renamed from: e */
    private long f14838e = Long.MIN_VALUE;

    /* renamed from: f */
    private boolean f14839f = true;

    /* renamed from: ci.x$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean m17879a() {
        return this.f14839f;
    }

    /* renamed from: b */
    public final String m17880b() {
        return "mediaType= " + this.f14835b + "    \nmessageId= " + this.f14836c + "\ntimeThreshold= " + this.f14837d + "\tallowLoadMoreToFind= " + this.f14839f;
    }

    /* renamed from: c */
    public final MessageId m17881c() {
        return this.f14836c;
    }

    /* renamed from: d */
    public final long m17882d() {
        return this.f14838e;
    }

    /* renamed from: e */
    public final int m17883e() {
        return this.f14834a;
    }

    /* renamed from: f */
    public final void m17884f(EnumC2382z enumC2382z) {
        AbstractC19074t.m100208f(enumC2382z, "<set-?>");
        this.f14835b = enumC2382z;
    }

    /* renamed from: g */
    public final void m17885g(MessageId messageId) {
        this.f14836c = messageId;
    }

    /* renamed from: h */
    public final void m17886h(long j11) {
        this.f14838e = j11;
    }

    /* renamed from: i */
    public final void m17887i(int i11) {
        this.f14834a = i11;
    }
}
