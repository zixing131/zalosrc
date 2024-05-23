package vi;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p128ed.C18388c;
import p128ed.C18390e;

/* renamed from: vi.h */
/* loaded from: classes3.dex */
public final class C28262h extends C28255a implements InterfaceC28256b {
    public static final a Companion = new a(null);

    /* renamed from: l */
    private MessageId f131776l;

    /* renamed from: i */
    private String f131773i = "";

    /* renamed from: j */
    private String f131774j = "";

    /* renamed from: k */
    private String f131775k = "";

    /* renamed from: m */
    private String f131777m = "";

    /* renamed from: n */
    private String f131778n = "";

    /* renamed from: vi.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28262h m142329a(String str, String str2, long j11, long j12, String str3, String str4, String str5, MessageId messageId) {
            AbstractC19074t.m100208f(str, "md5Url");
            AbstractC19074t.m100208f(str2, "driveId");
            AbstractC19074t.m100208f(str3, "zipParentName");
            AbstractC19074t.m100208f(str4, "ownerId");
            AbstractC19074t.m100208f(str5, "senderId");
            AbstractC19074t.m100208f(messageId, "messageId");
            C28262h c28262h = new C28262h();
            c28262h.m142328F(str3);
            c28262h.f131774j = str4;
            c28262h.f131775k = str5;
            c28262h.f131776l = messageId;
            c28262h.mo142280t(str);
            c28262h.m142275o(str2);
            c28262h.m142283w(j11);
            c28262h.m142276p(j12);
            return c28262h;
        }

        /* renamed from: b */
        public final C28262h m142330b(String str, String str2, String str3, MessageId messageId) {
            AbstractC19074t.m100208f(str, "zipParentName");
            AbstractC19074t.m100208f(str2, "ownerId");
            AbstractC19074t.m100208f(str3, "senderId");
            AbstractC19074t.m100208f(messageId, "messageId");
            C28262h c28262h = new C28262h();
            c28262h.m142328F(str);
            c28262h.f131774j = str2;
            c28262h.f131775k = str3;
            c28262h.f131776l = messageId;
            return c28262h;
        }

        /* renamed from: c */
        public final C28262h m142331c(String str, long j11, String str2, String str3, String str4, MessageId messageId) {
            AbstractC19074t.m100208f(str, "localPath");
            AbstractC19074t.m100208f(str2, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str3, "ownerId");
            AbstractC19074t.m100208f(str4, "senderId");
            AbstractC19074t.m100208f(messageId, "messageId");
            C28262h c28262h = new C28262h();
            c28262h.f131774j = str3;
            c28262h.f131775k = str4;
            c28262h.f131776l = messageId;
            c28262h.f131777m = str2;
            c28262h.m142278r(str);
            c28262h.m142283w(j11);
            c28262h.m142276p(C18388c.f92779a.m97393d(str));
            return c28262h;
        }
    }

    /* renamed from: B */
    public final MessageId m142324B() {
        return this.f131776l;
    }

    /* renamed from: C */
    public final String m142325C() {
        return this.f131774j;
    }

    /* renamed from: D */
    public final String m142326D() {
        return this.f131775k;
    }

    /* renamed from: E */
    public final String m142327E() {
        return this.f131773i;
    }

    /* renamed from: F */
    public final void m142328F(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131773i = str;
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: a */
    public String mo142288a() {
        return m142269i();
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: b */
    public long mo142289b() {
        return m142267g();
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: c */
    public void mo142290c(long j11) {
        m142276p(j11);
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: d */
    public String mo142291d() {
        return C18390e.m97404f(this.f131775k, this.f131776l);
    }

    @Override // vi.C28255a
    public boolean equals(Object obj) {
        if (obj == null || !C28262h.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return AbstractC19074t.m100204b(((C28262h) obj).mo142292f(), mo142292f());
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: f */
    public String mo142292f() {
        String str;
        String str2 = CoreUtility.f89233i;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f131774j;
        String str4 = this.f131775k;
        MessageId messageId = this.f131776l;
        if (messageId == null || (str = messageId.m41044h()) == null) {
            str = "0";
        }
        return C18390e.m97405i(str2, str3, str4, str);
    }

    @Override // vi.C28255a
    public int hashCode() {
        return C18390e.f92781a.m97418e(mo142292f());
    }

    @Override // vi.C28255a
    /* renamed from: k */
    public String mo142271k() {
        if (this.f131778n.length() == 0 && this.f131777m.length() > 0) {
            this.f131778n = C18390e.f92781a.m97425v(this.f131777m);
            this.f131777m = "";
        }
        return this.f131778n;
    }

    @Override // vi.C28255a
    /* renamed from: t */
    public void mo142280t(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131778n = str;
    }

    @Override // vi.C28255a
    public String toString() {
        String str;
        String str2 = this.f131773i;
        String str3 = this.f131774j;
        String str4 = this.f131775k;
        MessageId messageId = this.f131776l;
        if (messageId == null || (str = messageId.m41044h()) == null) {
            str = "0";
        }
        return "ZipEntryDriveFileMetadata { , zipParentName=" + str2 + ", ownerId=" + str3 + ", senderId=" + str4 + ", clientMsgId=" + str + super.toString() + "}";
    }
}
