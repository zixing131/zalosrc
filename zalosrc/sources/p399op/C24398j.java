package p399op;

import ae.C0766k;
import am.C0927o;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.music.data.ExceptionFetchMusicUnknown;
import com.zing.zalo.feed.mvp.music.data.ExceptionLyric;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusic;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLocationNotSupported;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import com.zing.zalo.feed.mvp.music.data.ExceptionSearchMusic;
import com.zing.zalo.feed.mvp.music.data.ExceptionUpdateSettingAutoPlayMusicFeed;
import com.zing.zalo.feed.mvp.music.domain.entity.C8584a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import me0.AbstractC23136l9;
import me0.C23055e5;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p426pp.C24899b;
import p426pp.C24901d;
import p426pp.C24902e;
import p426pp.C24903f;
import p458qr.C25480m;
import p458qr.InterfaceC25486s;
import p509sp.C26359h;
import p509sp.C26361j;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: op.j */
/* loaded from: classes4.dex */
public final class C24398j implements InterfaceC24391c {

    /* renamed from: p */
    private final InterfaceC24394f f117766p;

    /* renamed from: q */
    private final InterfaceC25486s f117767q;

    /* renamed from: r */
    private long f117768r;

    /* renamed from: op.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f117769a;

        /* renamed from: b */
        final /* synthetic */ C24398j f117770b;

        /* renamed from: c */
        final /* synthetic */ String f117771c;

        /* renamed from: op.j$a$a */
        /* loaded from: classes4.dex */
        static final class C32918a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117772q;

            /* renamed from: r */
            final /* synthetic */ Object f117773r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32918a(String str, Object obj) {
                super(0);
                this.f117772q = str;
                this.f117773r = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "song " + this.f117772q + " success " + this.f117773r;
            }
        }

        /* renamed from: op.j$a$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117774q;

            /* renamed from: r */
            final /* synthetic */ Exception f117775r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Exception exc) {
                super(0);
                this.f117774q = str;
                this.f117775r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "song " + this.f117774q + " success exception " + this.f117775r;
            }
        }

        /* renamed from: op.j$a$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117776q;

            /* renamed from: r */
            final /* synthetic */ C20096c f117777r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, C20096c c20096c) {
                super(0);
                this.f117776q = str;
                this.f117777r = c20096c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "song " + this.f117776q + " error " + this.f117777r;
            }
        }

        a(Continuation continuation, C24398j c24398j, String str) {
            this.f117769a = continuation;
            this.f117770b = c24398j;
            this.f117771c = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SONG_INFO", new c(this.f117771c, c20096c));
            C24398j c24398j = this.f117770b;
            c24398j.m127615m(this.f117771c, this.f117769a, c24398j.m127613g(c20096c));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SONG_INFO", new C32918a(this.f117771c, obj));
                JSONObject jSONObject = (JSONObject) obj;
                if (!jSONObject.has("data")) {
                    this.f117770b.m127615m(this.f117771c, this.f117769a, ExceptionMusicLoadInfo.f46310p);
                } else {
                    this.f117769a.mo112492g(C24861r.m129218b(new C24902e(jSONObject.optJSONObject("data"))));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SONG_INFO", new b(this.f117771c, e11));
                this.f117770b.m127615m(this.f117771c, this.f117769a, ExceptionMusicLoadInfo.f46310p);
            }
        }
    }

    /* renamed from: op.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117778q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f117778q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "song " + this.f117778q + " start";
        }
    }

    /* renamed from: op.j$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f117779a;

        /* renamed from: b */
        final /* synthetic */ String f117780b;

        /* renamed from: c */
        final /* synthetic */ C24398j f117781c;

        /* renamed from: op.j$c$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117782q;

            /* renamed from: r */
            final /* synthetic */ Object f117783r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object obj) {
                super(0);
                this.f117782q = str;
                this.f117783r = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "song " + this.f117782q + " success " + this.f117783r;
            }
        }

        /* renamed from: op.j$c$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117784q;

            /* renamed from: r */
            final /* synthetic */ Exception f117785r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Exception exc) {
                super(0);
                this.f117784q = str;
                this.f117785r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "song " + this.f117784q + " success exception " + this.f117785r;
            }
        }

        /* renamed from: op.j$c$c */
        /* loaded from: classes4.dex */
        static final class C32919c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117786q;

            /* renamed from: r */
            final /* synthetic */ C20096c f117787r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32919c(String str, C20096c c20096c) {
                super(0);
                this.f117786q = str;
                this.f117787r = c20096c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "song " + this.f117786q + " error " + this.f117787r;
            }
        }

        c(Continuation continuation, String str, C24398j c24398j) {
            this.f117779a = continuation;
            this.f117780b = str;
            this.f117781c = c24398j;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LINK_STREAMING", new C32919c(this.f117780b, c20096c));
            C24398j c24398j = this.f117781c;
            c24398j.m127615m(this.f117780b, this.f117779a, c24398j.m127614k(c20096c));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LINK_STREAMING", new a(this.f117780b, obj));
                String optString = ((JSONObject) obj).optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                if (TextUtils.isEmpty(optString)) {
                    this.f117781c.m127615m(this.f117780b, this.f117779a, ExceptionMusicStreaming.f46312p);
                } else {
                    Continuation continuation = this.f117779a;
                    C24861r.a aVar = C24861r.f119264q;
                    String str = this.f117780b;
                    AbstractC19074t.m100205c(optString);
                    continuation.mo112492g(C24861r.m129218b(new C24903f(str, optString, 0L, 0, 12, null)));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LINK_STREAMING", new b(this.f117780b, e11));
                this.f117781c.m127615m(this.f117780b, this.f117779a, ExceptionMusicStreaming.f46312p);
            }
        }
    }

    /* renamed from: op.j$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117788q;

        /* renamed from: r */
        final /* synthetic */ String f117789r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.f117788q = str;
            this.f117789r = str2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "song " + this.f117788q + " link " + this.f117789r + " start";
        }
    }

    /* renamed from: op.j$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ Continuation f117790a;

        /* renamed from: b */
        final /* synthetic */ C24398j f117791b;

        /* renamed from: c */
        final /* synthetic */ String f117792c;

        /* renamed from: op.j$e$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117793q;

            /* renamed from: r */
            final /* synthetic */ String f117794r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, String str2) {
                super(0);
                this.f117793q = str;
                this.f117794r = str2;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "link " + this.f117793q + " success " + this.f117794r;
            }
        }

        /* renamed from: op.j$e$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117795q;

            /* renamed from: r */
            final /* synthetic */ Exception f117796r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Exception exc) {
                super(0);
                this.f117795q = str;
                this.f117796r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "link " + this.f117795q + " success exception " + this.f117796r;
            }
        }

        /* renamed from: op.j$e$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117797q;

            /* renamed from: r */
            final /* synthetic */ int f117798r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, int i11) {
                super(0);
                this.f117797q = str;
                this.f117798r = i11;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "link " + this.f117797q + " error " + this.f117798r;
            }
        }

        e(Continuation continuation, C24398j c24398j, String str) {
            this.f117790a = continuation;
            this.f117791b = c24398j;
            this.f117792c = str;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            boolean m127128x;
            try {
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LYRIC", new a(this.f117792c, str));
                if (str != null) {
                    m127128x = AbstractC24341v.m127128x(str);
                    if (!m127128x) {
                        Continuation continuation = this.f117790a;
                        C24861r.a aVar = C24861r.f119264q;
                        continuation.mo112492g(C24861r.m129218b(C8584a.Companion.m45739b(new BufferedReader(new FileReader(str))).m45736d()));
                    }
                }
                Continuation continuation2 = this.f117790a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionLyric.f46309p)));
            } catch (Exception e11) {
                e11.printStackTrace();
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LYRIC", new b(this.f117792c, e11));
                this.f117791b.m127615m(this.f117792c, this.f117790a, ExceptionLyric.f46309p);
            }
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LYRIC", new c(this.f117792c, i11));
            this.f117791b.m127615m(this.f117792c, this.f117790a, ExceptionLyric.f46309p);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
        }
    }

    /* renamed from: op.j$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117799q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.f117799q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "link " + this.f117799q + " start";
        }
    }

    /* renamed from: op.j$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f117800a;

        g(Continuation continuation) {
            this.f117800a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            Continuation continuation = this.f117800a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchMusic.f46314p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    JSONArray optJSONArray = optJSONObject.optJSONArray("songs");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("categories");
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (optJSONArray2 != null) {
                        int length = optJSONArray2.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                AbstractC19074t.m100205c(optJSONObject2);
                                C24901d c24901d = new C24901d(optJSONObject2);
                                arrayList.add(c24901d);
                                linkedHashMap.put(Integer.valueOf(c24901d.m129480f()), c24901d);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray != null) {
                        int length2 = optJSONArray.length();
                        for (int i12 = 0; i12 < length2; i12++) {
                            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i12);
                            if (optJSONObject3 != null) {
                                AbstractC19074t.m100205c(optJSONObject3);
                                Object opt = optJSONObject3.opt("cate");
                                C24902e c24902e = new C24902e(optJSONObject3);
                                arrayList2.add(c24902e);
                                C24901d c24901d2 = (C24901d) linkedHashMap.get(opt);
                                if (c24901d2 != null) {
                                    c24901d2.m129476a(c24902e);
                                }
                            }
                        }
                    }
                    Continuation continuation = this.f117800a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new C24408t(arrayList, arrayList2)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Continuation continuation2 = this.f117800a;
            C24861r.a aVar2 = C24861r.f119264q;
            continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchMusic.f46314p)));
        }
    }

    /* renamed from: op.j$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f117801a;

        /* renamed from: b */
        final /* synthetic */ int f117802b;

        h(Continuation continuation, int i11) {
            this.f117801a = continuation;
            this.f117802b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            Continuation continuation = this.f117801a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchMusic.f46314p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    boolean z11 = true;
                    if (optJSONObject.optInt("hasMore") != 1) {
                        z11 = false;
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("songs");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                AbstractC19074t.m100205c(optJSONObject2);
                                arrayList.add(new C24902e(optJSONObject2));
                            }
                        }
                    }
                    Continuation continuation = this.f117801a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new C24409u(arrayList, this.f117802b, z11)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Continuation continuation2 = this.f117801a;
            C24861r.a aVar2 = C24861r.f119264q;
            continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSearchMusic.f46314p)));
        }
    }

    /* renamed from: op.j$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f117803a;

        /* renamed from: b */
        final /* synthetic */ String f117804b;

        /* renamed from: c */
        final /* synthetic */ C24398j f117805c;

        /* renamed from: op.j$i$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117806q;

            /* renamed from: r */
            final /* synthetic */ Object f117807r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object obj) {
                super(0);
                this.f117806q = str;
                this.f117807r = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "keyword " + this.f117806q + " success " + this.f117807r;
            }
        }

        /* renamed from: op.j$i$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117808q;

            /* renamed from: r */
            final /* synthetic */ Exception f117809r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Exception exc) {
                super(0);
                this.f117808q = str;
                this.f117809r = exc;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "keyword " + this.f117808q + " success exception " + this.f117809r;
            }
        }

        /* renamed from: op.j$i$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ String f117810q;

            /* renamed from: r */
            final /* synthetic */ C20096c f117811r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, C20096c c20096c) {
                super(0);
                this.f117810q = str;
                this.f117811r = c20096c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final String mo12V4() {
                return "keyword " + this.f117810q + " error " + this.f117811r;
            }
        }

        i(Continuation continuation, String str, C24398j c24398j) {
            this.f117803a = continuation;
            this.f117804b = str;
            this.f117805c = c24398j;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SEARCH", new c(this.f117804b, c20096c));
            this.f117805c.m127615m(this.f117804b, this.f117803a, ExceptionSearchMusic.f46314p);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray optJSONArray;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SEARCH", new a(this.f117804b, obj));
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                        if (optJSONObject != null) {
                            arrayList.add(new C24902e(optJSONObject));
                        }
                    }
                    Continuation continuation = this.f117803a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new C24899b(this.f117804b, arrayList)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SEARCH", new b(this.f117804b, e11));
            }
            this.f117805c.m127615m(this.f117804b, this.f117803a, ExceptionSearchMusic.f46314p);
        }
    }

    /* renamed from: op.j$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117812q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(0);
            this.f117812q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "keyword " + this.f117812q + " start";
        }
    }

    /* renamed from: op.j$k */
    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f117813a;

        /* renamed from: b */
        final /* synthetic */ int f117814b;

        k(Continuation continuation, int i11) {
            this.f117813a = continuation;
            this.f117814b = i11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m118743r0;
            AbstractC19074t.m100208f(c20096c, "error_message");
            Continuation continuation = this.f117813a;
            C24861r.a aVar = C24861r.f119264q;
            if (c20096c.m104491c() == 515) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG);
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed);
            }
            AbstractC19074t.m100205c(m118743r0);
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionUpdateSettingAutoPlayMusicFeed(m118743r0))));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                Continuation continuation = this.f117813a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(Integer.valueOf(this.f117814b)));
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation2 = this.f117813a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionUpdateSettingAutoPlayMusicFeed(null, 1, null))));
            }
        }
    }

    public C24398j(InterfaceC24394f interfaceC24394f, InterfaceC25486s interfaceC25486s) {
        AbstractC19074t.m100208f(interfaceC24394f, "musicHelper");
        AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
        this.f117766p = interfaceC24394f;
        this.f117767q = interfaceC25486s;
    }

    /* renamed from: g */
    public final ExceptionMusic m127613g(C20096c c20096c) {
        int m104491c = c20096c.m104491c();
        if (m104491c != 406) {
            if (m104491c != 1001) {
                return ExceptionFetchMusicUnknown.f46307p;
            }
            return ExceptionMusicLoadInfo.f46310p;
        }
        return ExceptionMusicLocationNotSupported.f46311p;
    }

    /* renamed from: k */
    public final ExceptionMusic m127614k(C20096c c20096c) {
        if (c20096c.m104489a() == 404) {
            return ExceptionMusicStreaming.f46312p;
        }
        return ExceptionFetchMusicUnknown.f46307p;
    }

    /* renamed from: m */
    public final void m127615m(String str, Continuation continuation, Exception exc) {
        C26361j.f125215a.m135704j(str, exc, this.f117767q, this.f117768r);
        C24861r.a aVar = C24861r.f119264q;
        continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(exc)));
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: a */
    public Object mo127586a(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f117768r = System.currentTimeMillis();
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f46313p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new g(c27317h));
            c0766k.mo1770wa(0, 20, 0);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: b */
    public Object mo127587b(int i11, int i12, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f46313p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new h(c27317h, i12));
            c0766k.mo1770wa(i11, 20, i12);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: f */
    public Object mo127588f(String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f117768r = System.currentTimeMillis();
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f46313p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(c27317h, this, str));
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SONG_INFO", new b(str));
            c0766k.mo1398B9(str, 0);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: h */
    public Object mo127589h(String str, int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f117768r = System.currentTimeMillis();
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f46313p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new i(c27317h, str, this));
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_SEARCH", new j(str));
            c0766k.mo1708p4(str, 0, i11, this.f117766p.mo127599c());
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: i */
    public Object mo127590i(String str, String str2, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f117768r = System.currentTimeMillis();
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f46313p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(c27317h, str, this));
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LINK_STREAMING", new d(str, str2));
            c0766k.mo1723r3(str2);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: j */
    public Object mo127591j(int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f46313p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new k(c27317h, i11));
            c0766k.mo1699o3(41, i11);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: l */
    public Object mo127592l(String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f117768r = System.currentTimeMillis();
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionNoNetwork.f46313p)));
        } else {
            C20627a c20627a = new C20627a(false);
            c20627a.m107419g0(new e(c27317h, this, str));
            c20627a.m107420h0(this.f117766p.mo127601e(str));
            C26359h.f125209a.mo135685a("FEED_MUSIC", "API_LOAD_LYRIC", new f(str));
            c20627a.m107488m(str);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    public /* synthetic */ C24398j(InterfaceC24394f interfaceC24394f, InterfaceC25486s interfaceC25486s, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24401m.f117816a : interfaceC24394f, (i11 & 2) != 0 ? C25480m.f122070a : interfaceC25486s);
    }
}
