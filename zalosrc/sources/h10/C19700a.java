package h10;

import com.zing.zalo.shortvideo.data.remote.ws.response.StreamData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p10.AbstractC24602f;
import p10.EnumC24601e;

/* renamed from: h10.a */
/* loaded from: classes5.dex */
public final class C19700a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f97721a;

    /* renamed from: b */
    private final EnumC24601e f97722b;

    /* renamed from: c */
    private final String f97723c;

    /* renamed from: d */
    private final Long f97724d;

    /* renamed from: e */
    private final Long f97725e;

    /* renamed from: f */
    private final Long f97726f;

    /* renamed from: g */
    private final Long f97727g;

    /* renamed from: h */
    private final Long f97728h;

    /* renamed from: h10.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19700a m103380a(StreamData streamData) {
            String str;
            AbstractC19074t.m100208f(streamData, "data");
            Long m51689e = streamData.m51689e();
            if (m51689e == null || (str = m51689e.toString()) == null) {
                str = "";
            }
            return new C19700a(str, AbstractC24602f.m128091a(streamData.m51696l()), streamData.m51697m(), streamData.m51685a(), streamData.m51692h(), streamData.m51691g(), streamData.m51693i(), streamData.m51688d());
        }
    }

    public C19700a(String str, EnumC24601e enumC24601e, String str2, Long l11, Long l12, Long l13, Long l14, Long l15) {
        AbstractC19074t.m100208f(enumC24601e, "status");
        this.f97721a = str;
        this.f97722b = enumC24601e;
        this.f97723c = str2;
        this.f97724d = l11;
        this.f97725e = l12;
        this.f97726f = l13;
        this.f97727g = l14;
        this.f97728h = l15;
    }

    /* renamed from: a */
    public final Long m103374a() {
        return this.f97724d;
    }

    /* renamed from: b */
    public final Long m103375b() {
        return this.f97728h;
    }

    /* renamed from: c */
    public final String m103376c() {
        return this.f97721a;
    }

    /* renamed from: d */
    public final Long m103377d() {
        return this.f97727g;
    }

    /* renamed from: e */
    public final EnumC24601e m103378e() {
        return this.f97722b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19700a)) {
            return false;
        }
        C19700a c19700a = (C19700a) obj;
        return AbstractC19074t.m100204b(this.f97721a, c19700a.f97721a) && this.f97722b == c19700a.f97722b && AbstractC19074t.m100204b(this.f97723c, c19700a.f97723c) && AbstractC19074t.m100204b(this.f97724d, c19700a.f97724d) && AbstractC19074t.m100204b(this.f97725e, c19700a.f97725e) && AbstractC19074t.m100204b(this.f97726f, c19700a.f97726f) && AbstractC19074t.m100204b(this.f97727g, c19700a.f97727g) && AbstractC19074t.m100204b(this.f97728h, c19700a.f97728h);
    }

    /* renamed from: f */
    public final String m103379f() {
        return this.f97723c;
    }

    public int hashCode() {
        String str = this.f97721a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f97722b.hashCode()) * 31;
        String str2 = this.f97723c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.f97724d;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f97725e;
        int hashCode4 = (hashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f97726f;
        int hashCode5 = (hashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f97727g;
        int hashCode6 = (hashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f97728h;
        return hashCode6 + (l15 != null ? l15.hashCode() : 0);
    }

    public String toString() {
        return "ChangeStream(liveId=" + this.f97721a + ", status=" + this.f97722b + ", streamURL=" + this.f97723c + ", attributes=" + this.f97724d + ", scheduledStartTime=" + this.f97725e + ", scheduledEndTime=" + this.f97726f + ", startTime=" + this.f97727g + ", endTime=" + this.f97728h + ")";
    }
}
