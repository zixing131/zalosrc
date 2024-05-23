package p585vs;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p461qu.AbstractC25495a;

/* renamed from: vs.c */
/* loaded from: classes4.dex */
public final class C28611c {
    public static final a Companion = new a(null);

    /* renamed from: i */
    public static long f132653i = 1;

    /* renamed from: j */
    public static long f132654j = 2;

    /* renamed from: k */
    public static long f132655k = 3;

    /* renamed from: l */
    public static int f132656l = 1;

    /* renamed from: m */
    public static int f132657m;

    /* renamed from: a */
    public String f132658a;

    /* renamed from: b */
    public long f132659b;

    /* renamed from: c */
    private long f132660c;

    /* renamed from: d */
    public long f132661d;

    /* renamed from: e */
    public long f132662e;

    /* renamed from: f */
    private String f132663f;

    /* renamed from: g */
    public MessageId f132664g;

    /* renamed from: h */
    public int f132665h;

    /* renamed from: vs.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28611c(String str, long j11, long j12, long j13) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f132663f = "";
        this.f132658a = str;
        this.f132659b = j11;
        this.f132661d = j12;
        this.f132662e = j13;
        if (AbstractC25495a.m132079d(str)) {
            this.f132663f = AbstractC25495a.m132088m(str);
        }
        this.f132664g = null;
        this.f132665h = f132657m;
    }

    /* renamed from: c */
    private final boolean m143069c() {
        return this.f132661d == f132653i;
    }

    /* renamed from: d */
    private final boolean m143070d() {
        return this.f132661d == f132654j;
    }

    /* renamed from: a */
    public final long m143071a() {
        return this.f132660c;
    }

    /* renamed from: b */
    public final String m143072b() {
        return this.f132663f;
    }

    /* renamed from: e */
    public final boolean m143073e() {
        return this.f132661d == f132655k;
    }

    /* renamed from: f */
    public final boolean m143074f() {
        if (this.f132659b <= this.f132661d && !m143073e() && !m143070d() && !m143069c()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final void m143075g(MessageId messageId) {
        this.f132664g = messageId;
    }

    /* renamed from: h */
    public final String m143076h() {
        return "[threadId=" + this.f132658a + " groupId=" + this.f132663f + " fromId=" + this.f132659b + " fromClientId=" + this.f132660c + " toGlobalId=" + this.f132661d + " toClientId=" + this.f132662e + " lastReadMsgId=" + this.f132664g + " needDelete=" + this.f132665h + "]";
    }

    public C28611c(String str, long j11, long j12, long j13, long j14) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f132663f = "";
        this.f132658a = str;
        this.f132659b = j11;
        this.f132660c = j12;
        this.f132661d = j13;
        this.f132662e = j14;
        if (AbstractC25495a.m132079d(str)) {
            this.f132663f = AbstractC25495a.m132088m(str);
        }
        this.f132664g = null;
        this.f132665h = f132657m;
    }

    public C28611c(String str, long j11, long j12, long j13, long j14, int i11) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f132663f = "";
        this.f132658a = str;
        this.f132659b = j11;
        this.f132660c = j12;
        this.f132661d = j13;
        this.f132662e = j14;
        if (AbstractC25495a.m132079d(str)) {
            this.f132663f = AbstractC25495a.m132088m(str);
        }
        this.f132664g = null;
        this.f132665h = i11;
    }
}
