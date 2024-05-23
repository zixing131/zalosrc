package p487rl;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23041d2;
import me0.AbstractC23244v8;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: rl.b */
/* loaded from: classes3.dex */
public final class C25821b {

    /* renamed from: a */
    private final String f123155a;

    /* renamed from: b */
    private final int f123156b;

    /* renamed from: c */
    private final MessageId f123157c;

    /* renamed from: d */
    private final long f123158d;

    /* renamed from: e */
    private final long f123159e;

    /* renamed from: f */
    private final boolean f123160f;

    /* renamed from: g */
    private final b f123161g;

    /* renamed from: h */
    private final a f123162h;

    /* renamed from: i */
    private final String f123163i;

    /* renamed from: j */
    private MediaExtInfo f123164j;

    /* renamed from: k */
    private boolean f123165k;

    /* renamed from: l */
    private final AtomicBoolean f123166l;

    /* renamed from: m */
    private boolean f123167m;

    /* renamed from: n */
    private final InterfaceC24854k f123168n;

    /* renamed from: o */
    private final InterfaceC24854k f123169o;

    /* renamed from: rl.b$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f123170a;

        /* renamed from: b */
        private final int f123171b;

        /* renamed from: c */
        private final int f123172c;

        public a(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "encryptKey");
            this.f123170a = str;
            this.f123171b = i11;
            this.f123172c = i12;
        }

        /* renamed from: a */
        public final int m133161a() {
            return this.f123172c;
        }

        /* renamed from: b */
        public final String m133162b() {
            return this.f123170a;
        }

        /* renamed from: c */
        public final int m133163c() {
            return this.f123171b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f123170a, aVar.f123170a) && this.f123171b == aVar.f123171b && this.f123172c == aVar.f123172c;
        }

        public int hashCode() {
            return (((this.f123170a.hashCode() * 31) + this.f123171b) * 31) + this.f123172c;
        }

        public String toString() {
            return "EncryptInfo(encryptKey=" + this.f123170a + ", keyVersion=" + this.f123171b + ", algoVersion=" + this.f123172c + ")";
        }
    }

    /* renamed from: rl.b$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final long f123173a;

        /* renamed from: b */
        private final String f123174b;

        /* renamed from: c */
        private final String f123175c;

        public b(long j11, String str, String str2) {
            AbstractC19074t.m100208f(str, "checksum");
            this.f123173a = j11;
            this.f123174b = str;
            this.f123175c = str2;
        }

        /* renamed from: a */
        public final String m133164a() {
            return this.f123174b;
        }

        /* renamed from: b */
        public final String m133165b() {
            return this.f123175c;
        }

        /* renamed from: c */
        public final long m133166c() {
            return this.f123173a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f123173a == bVar.f123173a && AbstractC19074t.m100204b(this.f123174b, bVar.f123174b) && AbstractC19074t.m100204b(this.f123175c, bVar.f123175c);
        }

        public int hashCode() {
            int m11521a = ((AbstractC2147g0.m11521a(this.f123173a) * 31) + this.f123174b.hashCode()) * 31;
            String str = this.f123175c;
            return m11521a + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "(mediaSize=" + this.f123173a + ", checksum='" + this.f123174b + "', extInfo=" + this.f123175c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rl.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return C24302e.Companion.m126918g(C25821b.this).getPath();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rl.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return C24302e.Companion.m126921l(C25821b.this).getPath();
        }
    }

    /* renamed from: rl.b$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24301d f123178a;

        e(InterfaceC24301d interfaceC24301d) {
            this.f123178a = interfaceC24301d;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f123178a.mo66919a(str, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return true;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return EnumC24298a.f117301t;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
            this.f123178a.mo66922d(str, i11, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            this.f123178a.mo66923e(str, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return this.f123178a.mo66924h();
        }
    }

    public C25821b(String str, int i11, MessageId messageId, long j11, long j12, boolean z11, b bVar, a aVar, String str2) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(str, "cloudId");
        AbstractC19074t.m100208f(messageId, "msgId");
        AbstractC19074t.m100208f(bVar, "mediaInfo");
        this.f123155a = str;
        this.f123156b = i11;
        this.f123157c = messageId;
        this.f123158d = j11;
        this.f123159e = j12;
        this.f123160f = z11;
        this.f123161g = bVar;
        this.f123162h = aVar;
        this.f123163i = str2;
        this.f123165k = true;
        this.f123166l = new AtomicBoolean(false);
        this.f123167m = true;
        m129210a = AbstractC24856m.m129210a(new c());
        this.f123168n = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new d());
        this.f123169o = m129210a2;
    }

    /* renamed from: a */
    private final String m133138a() {
        return (String) this.f123168n.getValue();
    }

    /* renamed from: b */
    private final String m133139b() {
        return (String) this.f123169o.getValue();
    }

    /* renamed from: c */
    public final MediaExtInfo m133140c() {
        return this.f123164j;
    }

    /* renamed from: d */
    public final String m133141d() {
        return this.f123155a;
    }

    /* renamed from: e */
    public final long m133142e() {
        return this.f123159e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25821b)) {
            return false;
        }
        C25821b c25821b = (C25821b) obj;
        if (!AbstractC19074t.m100204b(this.f123155a, c25821b.f123155a) || this.f123156b != c25821b.f123156b || !AbstractC19074t.m100204b(this.f123157c, c25821b.f123157c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String m133143f() {
        String m133138a = m133138a();
        AbstractC19074t.m100207e(m133138a, "<get-cacheFilePath>(...)");
        return m133138a;
    }

    /* renamed from: g */
    public final a m133144g() {
        return this.f123162h;
    }

    /* renamed from: h */
    public final b m133145h() {
        return this.f123161g;
    }

    public int hashCode() {
        int i11;
        int i12;
        int hashCode = ((((((((((((this.f123155a.hashCode() * 31) + this.f123156b) * 31) + this.f123157c.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f123158d)) * 31) + AbstractC2147g0.m11521a(this.f123159e)) * 31) + AbstractC2144f.m11520a(this.f123160f)) * 31) + this.f123161g.hashCode()) * 31;
        a aVar = this.f123162h;
        int i13 = 0;
        if (aVar != null) {
            i11 = aVar.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (hashCode + i11) * 31;
        String str = this.f123163i;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int i15 = (i14 + i12) * 31;
        MediaExtInfo mediaExtInfo = this.f123164j;
        if (mediaExtInfo != null) {
            i13 = mediaExtInfo.hashCode();
        }
        return ((((((i15 + i13) * 31) + AbstractC2144f.m11520a(this.f123165k)) * 31) + this.f123166l.hashCode()) * 31) + AbstractC2144f.m11520a(this.f123167m);
    }

    /* renamed from: i */
    public final MessageId m133146i() {
        return this.f123157c;
    }

    /* renamed from: j */
    public final int m133147j() {
        return this.f123156b;
    }

    /* renamed from: k */
    public final String m133148k() {
        return this.f123163i;
    }

    /* renamed from: l */
    public final String m133149l() {
        String m133139b = m133139b();
        AbstractC19074t.m100207e(m133139b, "<get-cacheThumbPath>(...)");
        return m133139b;
    }

    /* renamed from: m */
    public final long m133150m() {
        return this.f123158d;
    }

    /* renamed from: n */
    public final boolean m133151n() {
        return AbstractC23041d2.m118194A(m133139b());
    }

    /* renamed from: o */
    public final boolean m133152o() {
        return this.f123167m;
    }

    /* renamed from: p */
    public final boolean m133153p() {
        return AbstractC23041d2.m118194A(m133138a());
    }

    /* renamed from: q */
    public final boolean m133154q() {
        return this.f123166l.get();
    }

    /* renamed from: r */
    public final boolean m133155r() {
        return this.f123160f;
    }

    /* renamed from: s */
    public final boolean m133156s() {
        return this.f123165k;
    }

    /* renamed from: t */
    public final void m133157t(boolean z11) {
        this.f123167m = z11;
    }

    public String toString() {
        String str;
        String str2 = this.f123155a;
        int i11 = this.f123156b;
        MessageId messageId = this.f123157c;
        long j11 = this.f123158d;
        long j12 = this.f123159e;
        boolean z11 = this.f123160f;
        b bVar = this.f123161g;
        if (this.f123162h == null) {
            str = "encryptInfo=null, ";
        } else {
            str = "";
        }
        return "CloudItem(cloudId='" + str2 + "', msgType=" + i11 + ", msgId=" + messageId + ", ts=" + j11 + ", cloudTS=" + j12 + ", isE2EE=" + z11 + ", mediaInfo=" + bVar + ", " + str + "rawEncryptInfo=" + AbstractC23244v8.m119735E(this.f123163i, 80) + ")";
    }

    /* renamed from: u */
    public final void m133158u(MediaExtInfo mediaExtInfo) {
        this.f123164j = mediaExtInfo;
    }

    /* renamed from: v */
    public final void m133159v(boolean z11) {
        this.f123165k = z11;
    }

    /* renamed from: w */
    public final void m133160w(InterfaceC24301d interfaceC24301d) {
        AbstractC19074t.m100208f(interfaceC24301d, "listener");
        C24302e.Companion.m126919j().m126908q(this, new e(interfaceC24301d));
    }
}
