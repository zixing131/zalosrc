package nr;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2144f;
import bo.EnumC2963d3;
import bo.EnumC3057x2;
import bo.InterfaceC2997k2;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.models.MusicDataSongInfoImpl;
import com.zing.zalo.feed.models.MusicDataStreamingInfoImpl;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionFetchMusicUnknown;
import com.zing.zalo.feed.mvp.music.data.ExceptionInCall;
import com.zing.zalo.feed.mvp.music.data.ExceptionLyric;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLocationNotSupported;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.domain.entity.Sentence;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataImpl;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataLyricInfoImpl;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ir.C20782a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kr.InterfaceC21910a;
import lr.C22640a;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import p089d2.InterfaceC17712d;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p274jr.C21344b;
import p361nb.C23648e;
import p426pp.C24898a;
import p426pp.C24902e;
import p426pp.C24903f;
import p456qp.C25455g;
import p456qp.C25458j;
import p456qp.C25464p;
import p456qp.C25465q;
import p458qr.C25478k;
import p458qr.C25480m;
import p458qr.InterfaceC25469b;
import p458qr.InterfaceC25486s;
import p509sp.C26359h;
import p509sp.C26361j;
import p509sp.InterfaceC26353b;
import p509sp.InterfaceC26357f;
import p716zh.C32002l4;
import p716zh.C32017m4;
import p716zh.C32123ta;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: nr.b */
/* loaded from: classes4.dex */
public final class C23929b extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final InterfaceC25469b f115615A;

    /* renamed from: B */
    private final C21344b f115616B;

    /* renamed from: C */
    private final InterfaceC26357f f115617C;

    /* renamed from: D */
    private final C20782a f115618D;

    /* renamed from: E */
    private final C1761c0 f115619E;

    /* renamed from: F */
    private String f115620F;

    /* renamed from: G */
    private long f115621G;

    /* renamed from: H */
    private C1761c0 f115622H;

    /* renamed from: I */
    private boolean f115623I;

    /* renamed from: J */
    private long f115624J;

    /* renamed from: K */
    private Job f115625K;

    /* renamed from: L */
    private Job f115626L;

    /* renamed from: M */
    private Job f115627M;

    /* renamed from: N */
    private final C1761c0 f115628N;

    /* renamed from: t */
    private final C25458j f115629t;

    /* renamed from: u */
    private final C25464p f115630u;

    /* renamed from: v */
    private final C25455g f115631v;

    /* renamed from: w */
    private final C25465q f115632w;

    /* renamed from: x */
    private final InterfaceC26353b f115633x;

    /* renamed from: y */
    private final InterfaceC25486s f115634y;

    /* renamed from: z */
    private final C1780l0 f115635z;

    /* renamed from: nr.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$a0 */
    /* loaded from: classes4.dex */
    public static final class a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f115636q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(int i11) {
            super(0);
            this.f115636q = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "onVideoStateChanged: " + this.f115636q;
        }
    }

    /* renamed from: nr.b$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$b0 */
    /* loaded from: classes4.dex */
    public static final class b0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b0 f115637q = new b0();

        b0() {
            super(1);
        }

        /* renamed from: a */
        public final void m125127a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12364u);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125127a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nr.b$c */
    /* loaded from: classes4.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final String f115638a;

        public c(String str) {
            AbstractC19074t.m100208f(str, "msg");
            this.f115638a = str;
        }

        /* renamed from: a */
        public final String m125128a() {
            return this.f115638a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC19074t.m100204b(this.f115638a, ((c) obj).f115638a);
        }

        public int hashCode() {
            return this.f115638a.hashCode();
        }

        public String toString() {
            return "EventShowMessage(msg=" + this.f115638a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$c0 */
    /* loaded from: classes4.dex */
    public static final class c0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115639t;

        /* renamed from: v */
        final /* synthetic */ String f115641v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: nr.b$c0$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f115642q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m125130a(StoryMusicDataImpl storyMusicDataImpl) {
                AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                storyMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12362s);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m125130a((StoryMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, Continuation continuation) {
            super(2, continuation);
            this.f115641v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c0(this.f115641v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115639t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25458j c25458j = C23929b.this.f115629t;
                this.f115639t = 1;
                if (c25458j.m131868c(this) == m142578e) {
                    return m142578e;
                }
            }
            C23929b.this.m125086Y0(this.f115641v, a.f115642q);
            C23929b.this.f115630u.m101508a(C25464p.a.f122032c);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.b$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC1754a {

        /* renamed from: d */
        private final C25458j f115643d;

        /* renamed from: e */
        private final C25464p f115644e;

        /* renamed from: f */
        private final C25455g f115645f;

        /* renamed from: g */
        private final C25465q f115646g;

        /* renamed from: h */
        private final InterfaceC26353b f115647h;

        /* renamed from: i */
        private final InterfaceC25486s f115648i;

        /* renamed from: j */
        private final InterfaceC25469b f115649j;

        /* renamed from: k */
        private final C21344b f115650k;

        /* renamed from: l */
        private final InterfaceC26357f f115651l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC17712d interfaceC17712d, Bundle bundle, C25458j c25458j, C25464p c25464p, C25455g c25455g, C25465q c25465q, InterfaceC26353b interfaceC26353b, InterfaceC25486s interfaceC25486s, InterfaceC25469b interfaceC25469b, C21344b c21344b, InterfaceC26357f interfaceC26357f) {
            super(interfaceC17712d, bundle);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
            AbstractC19074t.m100208f(c25458j, "playSongUseCase");
            AbstractC19074t.m100208f(c25464p, "stopSongUseCase");
            AbstractC19074t.m100208f(c25455g, "getSongInfoUseCase");
            AbstractC19074t.m100208f(c25465q, "toggleSpeakerUseCase");
            AbstractC19074t.m100208f(interfaceC26353b, "playSoundConfig");
            AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
            AbstractC19074t.m100208f(interfaceC25469b, "networkInfoProvider");
            AbstractC19074t.m100208f(c21344b, "syncingController");
            AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
            this.f115643d = c25458j;
            this.f115644e = c25464p;
            this.f115645f = c25455g;
            this.f115646g = c25465q;
            this.f115647h = interfaceC26353b;
            this.f115648i = interfaceC25486s;
            this.f115649j = interfaceC25469b;
            this.f115650k = c21344b;
            this.f115651l = interfaceC26357f;
        }

        @Override // androidx.lifecycle.AbstractC1754a
        /* renamed from: e */
        protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(c1780l0, "handle");
            if (cls.isAssignableFrom(C23929b.class)) {
                return new C23929b(this.f115643d, this.f115644e, this.f115645f, this.f115646g, this.f115647h, this.f115648i, c1780l0, this.f115649j, this.f115650k, this.f115651l);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }

        public /* synthetic */ d(InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
            this(interfaceC17712d, (i11 & 2) != 0 ? null : bundle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC17712d interfaceC17712d, Bundle bundle) {
            this(interfaceC17712d, bundle, new C25458j(null, 1, null), new C25464p(), new C25455g(null, null, 3, null), new C25465q(), C22640a.f111031a, C25480m.f122070a, new C25478k(), new C21344b(), C26359h.f125209a);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$d0 */
    /* loaded from: classes4.dex */
    public static final class d0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d0 f115652q = new d0();

        d0() {
            super(1);
        }

        /* renamed from: a */
        public final void m125131a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12363t);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125131a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nr.b$e */
    /* loaded from: classes4.dex */
    public static final class e implements b {

        /* renamed from: a */
        private final String f115653a;

        /* renamed from: b */
        private final String f115654b;

        public e(String str, String str2) {
            AbstractC19074t.m100208f(str, "idSong");
            AbstractC19074t.m100208f(str2, "urlSong");
            this.f115653a = str;
            this.f115654b = str2;
        }

        /* renamed from: a */
        public final String m125132a() {
            return this.f115653a;
        }

        /* renamed from: b */
        public final String m125133b() {
            return this.f115654b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC19074t.m100204b(this.f115653a, eVar.f115653a) && AbstractC19074t.m100204b(this.f115654b, eVar.f115654b);
        }

        public int hashCode() {
            return (this.f115653a.hashCode() * 31) + this.f115654b.hashCode();
        }

        public String toString() {
            return "NavigateZingMp3WebView(idSong=" + this.f115653a + ", urlSong=" + this.f115654b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$e0 */
    /* loaded from: classes4.dex */
    public static final class e0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115655t;

        /* renamed from: v */
        final /* synthetic */ String f115657v;

        /* renamed from: w */
        final /* synthetic */ int f115658w;

        /* renamed from: x */
        final /* synthetic */ String f115659x;

        /* renamed from: nr.b$e0$a */
        /* loaded from: classes4.dex */
        public static final class a implements C25458j.a {

            /* renamed from: a */
            final /* synthetic */ C23929b f115660a;

            /* renamed from: b */
            final /* synthetic */ String f115661b;

            /* renamed from: c */
            final /* synthetic */ int f115662c;

            /* renamed from: nr.b$e0$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C32903a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115663t;

                /* renamed from: u */
                final /* synthetic */ C23929b f115664u;

                /* renamed from: v */
                final /* synthetic */ String f115665v;

                /* renamed from: w */
                final /* synthetic */ LyricRender f115666w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: nr.b$e0$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32904a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ LyricRender f115667q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32904a(LyricRender lyricRender) {
                        super(1);
                        this.f115667q = lyricRender;
                    }

                    /* renamed from: a */
                    public final void m125136a(StoryMusicDataImpl storyMusicDataImpl) {
                        AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                        storyMusicDataImpl.mo14161e().m46950e(this.f115667q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m125136a((StoryMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32903a(C23929b c23929b, String str, LyricRender lyricRender, Continuation continuation) {
                    super(2, continuation);
                    this.f115664u = c23929b;
                    this.f115665v = str;
                    this.f115666w = lyricRender;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32903a(this.f115664u, this.f115665v, this.f115666w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115663t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115664u.m125086Y0(this.f115665v, new C32904a(this.f115666w));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32903a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: nr.b$e0$a$b */
            /* loaded from: classes4.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115668t;

                /* renamed from: u */
                final /* synthetic */ C23929b f115669u;

                /* renamed from: v */
                final /* synthetic */ String f115670v;

                /* renamed from: w */
                final /* synthetic */ Exception f115671w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C23929b c23929b, String str, Exception exc, Continuation continuation) {
                    super(2, continuation);
                    this.f115669u = c23929b;
                    this.f115670v = str;
                    this.f115671w = exc;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f115669u, this.f115670v, this.f115671w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115668t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115669u.m125097n0(this.f115670v, this.f115671w);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: nr.b$e0$a$c */
            /* loaded from: classes4.dex */
            static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115672t;

                /* renamed from: u */
                final /* synthetic */ C23929b f115673u;

                /* renamed from: v */
                final /* synthetic */ String f115674v;

                /* renamed from: w */
                final /* synthetic */ int f115675w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: nr.b$e0$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32905a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ C23929b f115676q;

                    /* renamed from: r */
                    final /* synthetic */ int f115677r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32905a(C23929b c23929b, int i11) {
                        super(1);
                        this.f115676q = c23929b;
                        this.f115677r = i11;
                    }

                    /* renamed from: a */
                    public final void m125139a(StoryMusicDataImpl storyMusicDataImpl) {
                        AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                        storyMusicDataImpl.mo14160c().m45110m(this.f115676q.f115633x.mo117210a());
                        MusicDataStreamingInfoImpl mo14158a = storyMusicDataImpl.mo14158a();
                        int i11 = this.f115677r;
                        mo14158a.m45118h(true);
                        mo14158a.m45116f(i11);
                        mo14158a.m45117g(EnumC3057x2.f12361r);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m125139a((StoryMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C23929b c23929b, String str, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f115673u = c23929b;
                    this.f115674v = str;
                    this.f115675w = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f115673u, this.f115674v, this.f115675w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115672t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115673u.m125074S0(this.f115674v);
                        C23929b c23929b = this.f115673u;
                        c23929b.m125086Y0(this.f115674v, new C32905a(c23929b, this.f115675w));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: nr.b$e0$a$d */
            /* loaded from: classes4.dex */
            static final class d extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115678t;

                /* renamed from: u */
                final /* synthetic */ C23929b f115679u;

                /* renamed from: v */
                final /* synthetic */ String f115680v;

                /* renamed from: w */
                final /* synthetic */ C24903f f115681w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: nr.b$e0$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32906a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ C24903f f115682q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32906a(C24903f c24903f) {
                        super(1);
                        this.f115682q = c24903f;
                    }

                    /* renamed from: a */
                    public final void m125141a(StoryMusicDataImpl storyMusicDataImpl) {
                        AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                        MusicDataStreamingInfoImpl mo14158a = storyMusicDataImpl.mo14158a();
                        mo14158a.m45115e(this.f115682q.m129501d());
                        mo14158a.m45117g(EnumC3057x2.f12359p);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m125141a((StoryMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C23929b c23929b, String str, C24903f c24903f, Continuation continuation) {
                    super(2, continuation);
                    this.f115679u = c23929b;
                    this.f115680v = str;
                    this.f115681w = c24903f;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new d(this.f115679u, this.f115680v, this.f115681w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115678t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115679u.m125086Y0(this.f115680v, new C32906a(this.f115681w));
                        this.f115679u.m125080V0(this.f115680v);
                        this.f115679u.m125095i0();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: nr.b$e0$a$e */
            /* loaded from: classes4.dex */
            static final class e extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115683t;

                /* renamed from: u */
                final /* synthetic */ C23929b f115684u;

                /* renamed from: v */
                final /* synthetic */ String f115685v;

                /* renamed from: w */
                final /* synthetic */ int f115686w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: nr.b$e0$a$e$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32907a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ int f115687q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32907a(int i11) {
                        super(1);
                        this.f115687q = i11;
                    }

                    /* renamed from: a */
                    public final void m125143a(StoryMusicDataImpl storyMusicDataImpl) {
                        AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                        storyMusicDataImpl.mo14158a().m45116f(this.f115687q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m125143a((StoryMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C23929b c23929b, String str, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f115684u = c23929b;
                    this.f115685v = str;
                    this.f115686w = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new e(this.f115684u, this.f115685v, this.f115686w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115683t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115684u.m125086Y0(this.f115685v, new C32907a(this.f115686w));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: nr.b$e0$a$f */
            /* loaded from: classes4.dex */
            static final class f extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115688t;

                /* renamed from: u */
                final /* synthetic */ int f115689u;

                /* renamed from: v */
                final /* synthetic */ C23929b f115690v;

                /* renamed from: w */
                final /* synthetic */ String f115691w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: nr.b$e0$a$f$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32908a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ int f115692q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32908a(int i11) {
                        super(1);
                        this.f115692q = i11;
                    }

                    /* renamed from: a */
                    public final void m125145a(StoryMusicDataImpl storyMusicDataImpl) {
                        AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                        MusicDataStreamingInfoImpl mo14158a = storyMusicDataImpl.mo14158a();
                        mo14158a.m45116f(C26361j.f125215a.m135696b(mo14158a.getDuration(), this.f115692q));
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m125145a((StoryMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(int i11, C23929b c23929b, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f115689u = i11;
                    this.f115690v = c23929b;
                    this.f115691w = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new f(this.f115689u, this.f115690v, this.f115691w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115688t == 0) {
                        AbstractC24862s.m129228b(obj);
                        int i11 = this.f115689u;
                        if (i11 == 0) {
                            this.f115690v.m125086Y0(this.f115691w, new C32908a(i11));
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: nr.b$e0$a$g */
            /* loaded from: classes4.dex */
            static final class g extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ C24902e f115693q;

                /* renamed from: r */
                final /* synthetic */ C23929b f115694r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(C24902e c24902e, C23929b c23929b) {
                    super(1);
                    this.f115693q = c24902e;
                    this.f115694r = c23929b;
                }

                /* renamed from: a */
                public final void m125146a(StoryMusicDataImpl storyMusicDataImpl) {
                    LyricRender m45716a;
                    AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                    MusicDataSongInfoImpl mo14160c = storyMusicDataImpl.mo14160c();
                    C24902e c24902e = this.f115693q;
                    C23929b c23929b = this.f115694r;
                    mo14160c.m45111n(EnumC2963d3.f11682q);
                    mo14160c.m45107j(c24902e.m129492h());
                    mo14160c.m45106i(c24902e.m129487c());
                    mo14160c.m45108k(c24902e.m129494j());
                    mo14160c.m45109l(c24902e.m129496l());
                    mo14160c.m45110m(c23929b.f115633x.mo117210a());
                    storyMusicDataImpl.mo14158a().m45118h(true);
                    StoryMusicDataLyricInfoImpl mo14161e = storyMusicDataImpl.mo14161e();
                    if (this.f115693q.m129485a()) {
                        m45716a = LyricRender.Companion.m45718c();
                    } else {
                        m45716a = LyricRender.Companion.m45716a();
                    }
                    mo14161e.m46950e(m45716a);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m125146a((StoryMusicDataImpl) obj);
                    return C24848g0.f119245a;
                }
            }

            /* renamed from: nr.b$e0$a$h */
            /* loaded from: classes4.dex */
            static final class h extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115695t;

                /* renamed from: u */
                final /* synthetic */ C23929b f115696u;

                /* renamed from: v */
                final /* synthetic */ String f115697v;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: nr.b$e0$a$h$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32909a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    public static final C32909a f115698q = new C32909a();

                    C32909a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m125148a(StoryMusicDataImpl storyMusicDataImpl) {
                        AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                        storyMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12360q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m125148a((StoryMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(C23929b c23929b, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f115696u = c23929b;
                    this.f115697v = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new h(this.f115696u, this.f115697v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115695t == 0) {
                        AbstractC24862s.m129228b(obj);
                        if (AbstractC19074t.m100204b(this.f115696u.f115620F, this.f115697v)) {
                            this.f115696u.m125074S0("");
                        }
                        this.f115696u.m125086Y0(this.f115697v, C32909a.f115698q);
                        this.f115696u.m125084X0(this.f115697v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C23929b c23929b, String str, int i11) {
                this.f115660a = c23929b;
                this.f115661b = str;
                this.f115662c = i11;
            }

            @Override // p456qp.C25458j.a
            /* renamed from: a */
            public void mo104656a(Exception exc) {
                AbstractC19074t.m100208f(exc, "exception");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115660a), null, null, new b(this.f115660a, this.f115661b, exc, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: b */
            public void mo104657b(String str) {
                AbstractC19074t.m100208f(str, "idSong");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115660a), null, null, new c(this.f115660a, this.f115661b, this.f115662c, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: c */
            public void mo104658c(C24903f c24903f, int i11, int i12) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115660a), null, null, new e(this.f115660a, this.f115661b, i11, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: d */
            public void mo104659d(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115660a), null, null, new d(this.f115660a, this.f115661b, c24903f, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: e */
            public void mo104660e(C24903f c24903f, int i11) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115660a), null, null, new f(i11, this.f115660a, this.f115661b, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: f */
            public void mo104661f(C24903f c24903f) {
                C25458j.a.C32958a.m131874b(this, c24903f);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: g */
            public void mo104662g(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115660a), null, null, new h(this.f115660a, this.f115661b, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: h */
            public void mo104663h(C24902e c24902e) {
                AbstractC19074t.m100208f(c24902e, "songContent");
                StoryMusicDataImpl m125096j0 = this.f115660a.m125096j0(this.f115661b);
                if (m125096j0.mo14160c().mo14231e() || m125096j0.mo14160c().m45105h()) {
                    C23929b c23929b = this.f115660a;
                    c23929b.m125086Y0(this.f115661b, new g(c24902e, c23929b));
                }
            }

            @Override // p456qp.C25458j.a
            /* renamed from: i */
            public void mo104664i(C24903f c24903f, LyricRender lyricRender) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                AbstractC19074t.m100208f(lyricRender, "lyricRender");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115660a), null, null, new C32903a(this.f115660a, this.f115661b, lyricRender, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            public void onAudioFocusChange(int i11) {
                C25458j.a.C32958a.m131873a(this, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(String str, int i11, String str2, Continuation continuation) {
            super(2, continuation);
            this.f115657v = str;
            this.f115658w = i11;
            this.f115659x = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e0(this.f115657v, this.f115658w, this.f115659x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115655t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23929b.this.m125092f0();
                C25458j c25458j = C23929b.this.f115629t;
                String str = this.f115657v;
                InterfaceC26353b interfaceC26353b = C23929b.this.f115633x;
                int i12 = this.f115658w;
                C25458j.b bVar = new C25458j.b(str, false, true, interfaceC26353b, true, i12, new a(C23929b.this, this.f115659x, i12));
                this.f115655t = 1;
                if (c25458j.m101507a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.b$f */
    /* loaded from: classes4.dex */
    public static final class f implements b {

        /* renamed from: a */
        private final String f115699a;

        /* renamed from: b */
        private final SongInfo f115700b;

        /* renamed from: c */
        private final boolean f115701c;

        public f(String str, SongInfo songInfo, boolean z11) {
            AbstractC19074t.m100208f(str, "storyId");
            AbstractC19074t.m100208f(songInfo, "songInfo");
            this.f115699a = str;
            this.f115700b = songInfo;
            this.f115701c = z11;
        }

        /* renamed from: a */
        public final SongInfo m125149a() {
            return this.f115700b;
        }

        /* renamed from: b */
        public final String m125150b() {
            return this.f115699a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC19074t.m100204b(this.f115699a, fVar.f115699a) && AbstractC19074t.m100204b(this.f115700b, fVar.f115700b) && this.f115701c == fVar.f115701c;
        }

        public int hashCode() {
            return (((this.f115699a.hashCode() * 31) + this.f115700b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f115701c);
        }

        public String toString() {
            return "OpenMusicDetailData(storyId=" + this.f115699a + ", songInfo=" + this.f115700b + ", shouldOpenMusicDetail=" + this.f115701c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$f0 */
    /* loaded from: classes4.dex */
    public static final class f0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f0 f115702q = new f0();

        f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m125151a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12364u);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125151a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nr.b$g */
    /* loaded from: classes4.dex */
    public static final class g implements i {

        /* renamed from: a */
        private final h f115703a;

        public g(h hVar) {
            AbstractC19074t.m100208f(hVar, "snackBarData");
            this.f115703a = hVar;
        }

        /* renamed from: a */
        public final h m125152a() {
            return this.f115703a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$g0 */
    /* loaded from: classes4.dex */
    public static final class g0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115704t;

        g0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115704t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25458j c25458j = C23929b.this.f115629t;
                this.f115704t = 1;
                if (c25458j.m131868c(this) == m142578e) {
                    return m142578e;
                }
            }
            C23929b.this.f115630u.m101508a(new C25464p.b(false, C23929b.this.f115633x));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.b$h */
    /* loaded from: classes4.dex */
    public static final class h {

        /* renamed from: a */
        private final String f115706a;

        /* renamed from: b */
        private final String f115707b;

        /* renamed from: c */
        private final String f115708c;

        /* renamed from: d */
        private final int f115709d;

        /* renamed from: e */
        private final int f115710e;

        /* renamed from: f */
        private final String f115711f;

        public h(String str, String str2, String str3, int i11, int i12, String str4) {
            AbstractC19074t.m100208f(str, "storyId");
            AbstractC19074t.m100208f(str2, "songId");
            AbstractC19074t.m100208f(str3, "description");
            AbstractC19074t.m100208f(str4, "actionText");
            this.f115706a = str;
            this.f115707b = str2;
            this.f115708c = str3;
            this.f115709d = i11;
            this.f115710e = i12;
            this.f115711f = str4;
        }

        /* renamed from: a */
        public final String m125154a() {
            return this.f115711f;
        }

        /* renamed from: b */
        public final String m125155b() {
            return this.f115708c;
        }

        /* renamed from: c */
        public final int m125156c() {
            return this.f115709d;
        }

        /* renamed from: d */
        public final String m125157d() {
            return this.f115707b;
        }

        /* renamed from: e */
        public final String m125158e() {
            return this.f115706a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return AbstractC19074t.m100204b(this.f115706a, hVar.f115706a) && AbstractC19074t.m100204b(this.f115707b, hVar.f115707b) && AbstractC19074t.m100204b(this.f115708c, hVar.f115708c) && this.f115709d == hVar.f115709d && this.f115710e == hVar.f115710e && AbstractC19074t.m100204b(this.f115711f, hVar.f115711f);
        }

        public int hashCode() {
            return (((((((((this.f115706a.hashCode() * 31) + this.f115707b.hashCode()) * 31) + this.f115708c.hashCode()) * 31) + this.f115709d) * 31) + this.f115710e) * 31) + this.f115711f.hashCode();
        }

        public String toString() {
            return "SnackBarData(storyId=" + this.f115706a + ", songId=" + this.f115707b + ", description=" + this.f115708c + ", iconRes=" + this.f115709d + ", timeout=" + this.f115710e + ", actionText=" + this.f115711f + ")";
        }

        public /* synthetic */ h(String str, String str2, String str3, int i11, int i12, String str4, int i13, AbstractC19060k abstractC19060k) {
            this(str, str2, str3, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) != 0 ? ZAbstractBase.ZVU_PROCESS_FLUSH : i12, (i13 & 32) != 0 ? "" : str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$h0 */
    /* loaded from: classes4.dex */
    public static final class h0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115712t;

        /* renamed from: v */
        final /* synthetic */ h f115714v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(h hVar, Continuation continuation) {
            super(2, continuation);
            this.f115714v = hVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h0(this.f115714v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115712t == 0) {
                AbstractC24862s.m129228b(obj);
                C23929b.this.f115628N.mo9224q(new C19964c(new g(this.f115714v)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.b$i */
    /* loaded from: classes4.dex */
    public interface i {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$i0 */
    /* loaded from: classes4.dex */
    public static final class i0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115715t;

        /* renamed from: v */
        final /* synthetic */ String f115717v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, Continuation continuation) {
            super(2, continuation);
            this.f115717v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i0(this.f115717v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115715t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                long j11 = C23929b.this.f115624J;
                this.f115715t = 1;
                if (DelayKt.m112666b(j11, this) == m142578e) {
                    return m142578e;
                }
            }
            C23929b c23929b = C23929b.this;
            String str = this.f115717v;
            c23929b.m125068P0(str, c23929b.m125096j0(str).mo14159b());
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.b$j */
    /* loaded from: classes4.dex */
    public /* synthetic */ class j {

        /* renamed from: a */
        public static final /* synthetic */ int[] f115718a;

        static {
            int[] iArr = new int[C21344b.b.values().length];
            try {
                iArr[C21344b.b.f103949p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C21344b.b.f103950q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C21344b.b.f103951r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f115718a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final k f115719q = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m125161a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11683r);
            storyMusicDataImpl.mo14161e().m46950e(LyricRender.Companion.m45716a());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125161a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final l f115720q = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m125162a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11684s);
            storyMusicDataImpl.mo14161e().m46950e(LyricRender.Companion.m45717b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125162a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final m f115721q = new m();

        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m125163a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11685t);
            storyMusicDataImpl.mo14161e().m46950e(LyricRender.Companion.m45717b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125163a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18505l {
        n() {
            super(1);
        }

        /* renamed from: a */
        public final void m125164a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            MusicDataSongInfoImpl mo14160c = storyMusicDataImpl.mo14160c();
            C23929b c23929b = C23929b.this;
            mo14160c.m45111n(EnumC2963d3.f11682q);
            mo14160c.m45110m(c23929b.f115633x.mo117210a());
            storyMusicDataImpl.mo14158a().m45118h(false);
            storyMusicDataImpl.mo14161e().m46950e(LyricRender.Companion.m45717b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125164a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final o f115723q = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final void m125165a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            MusicDataStreamingInfoImpl mo14158a = storyMusicDataImpl.mo14158a();
            mo14158a.m45118h(true);
            mo14158a.m45116f(0);
            mo14158a.m45117g(EnumC3057x2.f12360q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125165a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final p f115724q = new p();

        p() {
            super(1);
        }

        /* renamed from: a */
        public final void m125166a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14161e().m46950e(LyricRender.Companion.m45717b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125166a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C21344b.b f115725q;

        /* renamed from: r */
        final /* synthetic */ C23929b f115726r;

        /* renamed from: s */
        final /* synthetic */ String f115727s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(C21344b.b bVar, C23929b c23929b, String str) {
            super(0);
            this.f115725q = bVar;
            this.f115726r = c23929b;
            this.f115727s = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Syncing state between video and song: " + this.f115725q + " - isPlaying: " + this.f115726r.m125101r0(this.f115727s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final r f115728q = new r();

        r() {
            super(1);
        }

        /* renamed from: a */
        public final void m125168a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11681p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125168a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nr.b$s */
    /* loaded from: classes4.dex */
    public static final class s implements C25455g.a {

        /* renamed from: b */
        final /* synthetic */ String f115730b;

        /* renamed from: c */
        final /* synthetic */ String f115731c;

        /* renamed from: nr.b$s$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C24902e f115732q;

            /* renamed from: r */
            final /* synthetic */ C23929b f115733r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C24902e c24902e, C23929b c23929b) {
                super(1);
                this.f115732q = c24902e;
                this.f115733r = c23929b;
            }

            /* renamed from: a */
            public final void m125169a(StoryMusicDataImpl storyMusicDataImpl) {
                LyricRender m45716a;
                AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                MusicDataSongInfoImpl mo14160c = storyMusicDataImpl.mo14160c();
                C24902e c24902e = this.f115732q;
                C23929b c23929b = this.f115733r;
                mo14160c.m45111n(EnumC2963d3.f11682q);
                mo14160c.m45107j(c24902e.m129492h());
                mo14160c.m45106i(c24902e.m129487c());
                mo14160c.m45108k(c24902e.m129494j());
                mo14160c.m45109l(c24902e.m129496l());
                mo14160c.m45110m(c23929b.f115633x.mo117210a());
                storyMusicDataImpl.mo14158a().m45118h(true);
                StoryMusicDataLyricInfoImpl mo14161e = storyMusicDataImpl.mo14161e();
                if (this.f115732q.m129485a()) {
                    m45716a = LyricRender.Companion.m45718c();
                } else {
                    m45716a = LyricRender.Companion.m45716a();
                }
                mo14161e.m46950e(m45716a);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m125169a((StoryMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: nr.b$s$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f115734q;

            /* renamed from: r */
            final /* synthetic */ C24898a f115735r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, C24898a c24898a) {
                super(1);
                this.f115734q = str;
                this.f115735r = c24898a;
            }

            /* renamed from: a */
            public final void m125170a(StoryMusicDataImpl storyMusicDataImpl) {
                Object m131207g0;
                Object m131207g02;
                AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                StoryMusicDataLyricInfoImpl mo14161e = storyMusicDataImpl.mo14161e();
                String str = this.f115734q;
                C24898a c24898a = this.f115735r;
                m131207g0 = AbstractC25332a0.m131207g0(c24898a.m129468d(), 0);
                m131207g02 = AbstractC25332a0.m131207g0(c24898a.m129468d(), 1);
                mo14161e.m46950e(new LyricRender(str, (Sentence) m131207g0, (Sentence) m131207g02, false, false, 24, null));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m125170a((StoryMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: nr.b$s$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final c f115736q = new c();

            c() {
                super(1);
            }

            /* renamed from: a */
            public final void m125171a(StoryMusicDataImpl storyMusicDataImpl) {
                AbstractC19074t.m100208f(storyMusicDataImpl, "it");
                MusicDataStreamingInfoImpl mo14158a = storyMusicDataImpl.mo14158a();
                mo14158a.m45118h(true);
                mo14158a.m45116f(0);
                mo14158a.m45117g(EnumC3057x2.f12360q);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m125171a((StoryMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        s(String str, String str2) {
            this.f115730b = str;
            this.f115731c = str2;
        }

        @Override // p456qp.C25455g.a
        /* renamed from: a */
        public void mo104705a(C24903f c24903f) {
            AbstractC19074t.m100208f(c24903f, "streaming");
            if (!C23929b.this.m125101r0(this.f115730b)) {
                C23929b.this.m125086Y0(this.f115730b, c.f115736q);
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: b */
        public void mo104706b(C24898a c24898a) {
            AbstractC19074t.m100208f(c24898a, "lyric");
            if (!C23929b.this.m125101r0(this.f115730b)) {
                C23929b.this.m125086Y0(this.f115730b, new b(this.f115731c, c24898a));
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: c */
        public void mo104707c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            C23929b.this.m125097n0(this.f115730b, exc);
        }

        @Override // p456qp.C25455g.a
        /* renamed from: d */
        public void mo104708d(C24902e c24902e) {
            AbstractC19074t.m100208f(c24902e, "song");
            C23929b c23929b = C23929b.this;
            c23929b.m125086Y0(this.f115730b, new a(c24902e, c23929b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC19075u implements InterfaceC18505l {
        t() {
            super(1);
        }

        /* renamed from: a */
        public final void m125172a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14160c().m45110m(C23929b.this.f115633x.mo117210a());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125172a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ boolean f115738q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(boolean z11) {
            super(1);
            this.f115738q = z11;
        }

        /* renamed from: a */
        public final void m125173a(StoryMusicDataImpl storyMusicDataImpl) {
            AbstractC19074t.m100208f(storyMusicDataImpl, "it");
            storyMusicDataImpl.mo14160c().m45110m(this.f115738q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m125173a((StoryMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$v */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f115739q;

        /* renamed from: r */
        final /* synthetic */ C23929b f115740r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, C23929b c23929b) {
            super(0);
            this.f115739q = str;
            this.f115740r = c23929b;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str = this.f115739q;
            return "onPauseMusicStory: " + str + " - isPlaying: " + this.f115740r.m125101r0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$w */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f115741q;

        /* renamed from: r */
        final /* synthetic */ C23929b f115742r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, C23929b c23929b) {
            super(0);
            this.f115741q = str;
            this.f115742r = c23929b;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str = this.f115741q;
            return "onPlayMusicStory: " + str + " - isPlaying: " + this.f115742r.m125101r0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$x */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f115743q;

        /* renamed from: r */
        final /* synthetic */ C23929b f115744r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str, C23929b c23929b) {
            super(0);
            this.f115743q = str;
            this.f115744r = c23929b;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str = this.f115743q;
            return "onResumeMusicStory: " + str + " - isPlaying: " + this.f115744r.m125101r0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$y */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f115745q;

        /* renamed from: r */
        final /* synthetic */ C23929b f115746r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str, C23929b c23929b) {
            super(0);
            this.f115745q = str;
            this.f115746r = c23929b;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String str = this.f115745q;
            return "onStopMusicStory: " + str + " - isPlaying: " + this.f115746r.m125101r0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.b$z */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f115747q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(int i11) {
            super(0);
            this.f115747q = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "onVideoMediaInfoChanged: " + this.f115747q;
        }
    }

    public C23929b(C25458j c25458j, C25464p c25464p, C25455g c25455g, C25465q c25465q, InterfaceC26353b interfaceC26353b, InterfaceC25486s interfaceC25486s, C1780l0 c1780l0, InterfaceC25469b interfaceC25469b, C21344b c21344b, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c25458j, "playSongLyricUseCase");
        AbstractC19074t.m100208f(c25464p, "stopSongUseCase");
        AbstractC19074t.m100208f(c25455g, "getSongInfoUseCase");
        AbstractC19074t.m100208f(c25465q, "toggleSpeakerUseCase");
        AbstractC19074t.m100208f(interfaceC26353b, "playSoundConfig");
        AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
        AbstractC19074t.m100208f(c1780l0, "handle");
        AbstractC19074t.m100208f(interfaceC25469b, "networkInfoProvider");
        AbstractC19074t.m100208f(c21344b, "syncingController");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f115629t = c25458j;
        this.f115630u = c25464p;
        this.f115631v = c25455g;
        this.f115632w = c25465q;
        this.f115633x = interfaceC26353b;
        this.f115634y = interfaceC25486s;
        this.f115635z = c1780l0;
        this.f115615A = interfaceC25469b;
        this.f115616B = c21344b;
        this.f115617C = interfaceC26357f;
        this.f115618D = new C20782a();
        this.f115619E = new C1761c0();
        this.f115620F = "";
        this.f115622H = new C1761c0();
        this.f115624J = 100L;
        this.f115628N = new C1761c0();
        String str = (String) c1780l0.m9318c("CURRENT_PLAYING_STORY_SAVE_KEY");
        m125074S0(str != null ? str : "");
        InterfaceC21910a interfaceC21910a = (InterfaceC21910a) c1780l0.m9318c("STORY_MUSIC_DATA_SAVE_KEY");
        if (interfaceC21910a != null && m125099p0(interfaceC21910a.mo46940d())) {
            m125076T0(m125096j0(interfaceC21910a.mo46940d()));
        }
    }

    /* renamed from: O0 */
    private final void m125066O0(String str) {
        m125086Y0(str, b0.f115637q);
        m125074S0("");
        m125092f0();
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c0(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public final void m125068P0(String str, String str2) {
        m125072R0(str, str2, 0);
    }

    /* renamed from: Q0 */
    private final void m125070Q0(String str, String str2, int i11) {
        m125072R0(str, str2, i11);
    }

    /* renamed from: R0 */
    private final void m125072R0(String str, String str2, int i11) {
        Job m112540d;
        if (str2.length() == 0 || str.length() == 0) {
            return;
        }
        m125074S0(str);
        m125086Y0(str, d0.f115652q);
        Job job = this.f115627M;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new e0(str2, i11, str, null), 3, null);
        this.f115626L = m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public final void m125074S0(String str) {
        this.f115635z.m9321g("CURRENT_PLAYING_STORY_SAVE_KEY", str);
        this.f115620F = str;
    }

    /* renamed from: T0 */
    private final void m125076T0(InterfaceC21910a interfaceC21910a) {
        this.f115635z.m9321g("STORY_MUSIC_DATA_SAVE_KEY", interfaceC21910a);
        this.f115622H.mo9224q(interfaceC21910a);
    }

    /* renamed from: U0 */
    private final void m125078U0() {
        Job m112540d;
        if (this.f115620F.length() > 0) {
            m125086Y0(this.f115620F, f0.f115702q);
        }
        m125074S0("");
        m125092f0();
        Job job = this.f115626L;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new g0(null), 3, null);
        this.f115627M = m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public final void m125080V0(String str) {
        StoryMusicDataImpl m125096j0 = m125096j0(str);
        this.f115616B.m110555c(m125096j0.mo14158a().mo14384a(), m125096j0.mo14158a().getDuration(), (int) this.f115621G);
    }

    /* renamed from: W0 */
    private final void m125082W0(h hVar) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new h0(hVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public final void m125084X0(String str) {
        Job m112540d;
        Job job = this.f115625K;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        if (this.f115623I) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new i0(str, null), 3, null);
            this.f115625K = m112540d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m125086Y0(String str, InterfaceC18505l interfaceC18505l) {
        StoryMusicDataImpl m125096j0 = m125096j0(str);
        interfaceC18505l.mo205i9(m125096j0);
        m125094h0(m125096j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m125092f0() {
        Job job = this.f115625K;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        this.f115623I = false;
    }

    /* renamed from: g0 */
    private final void m125093g0(String str, Exception exc) {
        if (exc instanceof ExceptionInCall) {
            m125078U0();
        } else if (AbstractC19074t.m100204b(this.f115620F, str)) {
            m125078U0();
        }
    }

    /* renamed from: h0 */
    private final void m125094h0(StoryMusicDataImpl storyMusicDataImpl) {
        this.f115618D.m108419d(storyMusicDataImpl);
        m125076T0(storyMusicDataImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final void m125095i0() {
        this.f115623I = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final StoryMusicDataImpl m125096j0(String str) {
        InterfaceC21910a m108416a = this.f115618D.m108416a(str);
        AbstractC19074t.m100206d(m108416a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataImpl");
        return (StoryMusicDataImpl) m108416a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public final void m125097n0(String str, Exception exc) {
        String mo14159b = m125096j0(str).mo14159b();
        if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f46313p) || AbstractC19074t.m100204b(exc, ExceptionFetchMusicUnknown.f46307p)) {
            m125086Y0(str, k.f115719q);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_no_network);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            int i11 = AbstractC23322a.zds_ic_wifi_off_line_24;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            m125082W0(new h(str, mo14159b, m118743r0, i11, 3000, m118743r02));
        } else if (AbstractC19074t.m100204b(exc, ExceptionMusicLocationNotSupported.f46311p)) {
            m125086Y0(str, l.f115720q);
        } else if (AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p)) {
            m125086Y0(str, m.f115721q);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_song_not_found);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            m125082W0(new h(str, mo14159b, m118743r03, AbstractC23322a.zds_ic_info_circle_solid_24, 0, null, 48, null));
        } else if (AbstractC19074t.m100204b(exc, ExceptionMusicStreaming.f46312p)) {
            m125086Y0(str, new n());
        } else if (AbstractC19074t.m100204b(exc, ExceptionInCall.f46308p)) {
            C1761c0 c1761c0 = this.f115619E;
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticky_player_conflict_call);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            c1761c0.mo9224q(new C19964c(new c(m118743r04)));
            m125086Y0(str, o.f115723q);
        } else if (AbstractC19074t.m100204b(exc, ExceptionLyric.f46309p)) {
            m125086Y0(str, p.f115724q);
        }
        m125093g0(str, exc);
    }

    /* renamed from: o0 */
    private final void m125098o0(String str, C21344b.b bVar, int i11) {
        this.f115617C.mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_VIEW", new q(bVar, this, str));
        int i12 = j.f115718a[bVar.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 && m125101r0(str)) {
                m125078U0();
                return;
            }
            return;
        }
        if (!m125101r0(str)) {
            m125070Q0(str, m125096j0(str).mo14159b(), i11);
        }
    }

    /* renamed from: p0 */
    private final boolean m125099p0(String str) {
        return this.f115618D.m108418c().containsKey(str);
    }

    /* renamed from: q0 */
    private final boolean m125100q0(EnumC2963d3 enumC2963d3) {
        if (enumC2963d3 != EnumC2963d3.f11683r && enumC2963d3 != EnumC2963d3.f11684s && enumC2963d3 != EnumC2963d3.f11681p) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public final boolean m125101r0(String str) {
        EnumC3057x2 mo14386c = m125096j0(str).mo14158a().mo14386c();
        if (str.length() == 0) {
            return false;
        }
        if (mo14386c != EnumC3057x2.f12359p && mo14386c != EnumC3057x2.f12361r && mo14386c != EnumC3057x2.f12363t) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    private final void m125102s0(String str, String str2) {
        m125086Y0(str, r.f115728q);
        this.f115631v.m101508a(new C25455g.b(str2, AbstractC1798u0.m9374a(this), new s(str, str2)));
    }

    /* renamed from: t0 */
    private final boolean m125103t0(String str) {
        EnumC2963d3 enumC2963d3;
        InterfaceC2997k2 mo14160c;
        InterfaceC21910a interfaceC21910a = (InterfaceC21910a) this.f115618D.m108418c().get(str);
        if (interfaceC21910a != null && (mo14160c = interfaceC21910a.mo14160c()) != null) {
            enumC2963d3 = mo14160c.getState();
        } else {
            enumC2963d3 = null;
        }
        if (enumC2963d3 == EnumC2963d3.f11682q) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public final void m125104A0(String str, SongInfo songInfo, EnumC2963d3 enumC2963d3, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(songInfo, "songInfo");
        AbstractC19074t.m100208f(enumC2963d3, "state");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (m125100q0(enumC2963d3)) {
            this.f115619E.mo9224q(new C19964c(new f(str, songInfo, true)));
            InterfaceC25486s interfaceC25486s = this.f115634y;
            C23648e m154346U = C32017m4.m154326S().m154346U(c32002l4.m154284u(79));
            if (m154346U != null) {
                m154346U.m123919l()[0] = "1";
            } else {
                m154346U = null;
            }
            InterfaceC25486s.a.m132025a(interfaceC25486s, m154346U, false, 2, null);
        }
    }

    /* renamed from: B0 */
    public final void m125105B0() {
        m125092f0();
    }

    /* renamed from: C0 */
    public final void m125106C0() {
        m125095i0();
    }

    /* renamed from: D0 */
    public final void m125107D0(String str) {
        AbstractC19074t.m100208f(str, "songId");
        this.f115619E.mo9224q(new C19964c(new e(str, m125096j0(str).mo14160c().m45104g())));
    }

    /* renamed from: E0 */
    public final void m125108E0(String str) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f115617C.mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_VIEW", new v(str, this));
        if (m125101r0(str)) {
            m125066O0(str);
        }
    }

    /* renamed from: F0 */
    public final void m125109F0(String str) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f115617C.mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_VIEW", new w(str, this));
        if (!m125101r0(str)) {
            m125068P0(str, m125096j0(str).mo14159b());
        }
    }

    /* renamed from: G0 */
    public final void m125110G0(String str, int i11) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f115617C.mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_VIEW", new x(str, this));
        StoryMusicDataImpl m125096j0 = m125096j0(str);
        if (!m125101r0(str)) {
            m125070Q0(str, m125096j0.mo14159b(), i11);
        }
    }

    /* renamed from: I0 */
    public final void m125111I0(String str) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f115617C.mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_VIEW", new y(str, this));
        if (m125101r0(str)) {
            m125078U0();
            this.f115621G = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        super.mo9130J();
        m125078U0();
    }

    /* renamed from: J0 */
    public final void m125112J0(String str, long j11) {
        AbstractC19074t.m100208f(str, "storyId");
        if (m125101r0(str)) {
            this.f115621G = j11;
        }
    }

    /* renamed from: K0 */
    public final void m125113K0(C32123ta c32123ta) {
        AbstractC19074t.m100208f(c32123ta, "storyItem");
        String str = c32123ta.f148138h;
        AbstractC19074t.m100207e(str, "storyId");
        SongInfo songInfo = c32123ta.f148119V;
        AbstractC19074t.m100207e(songInfo, "songInfo");
        StoryMusicAttachment storyMusicAttachment = c32123ta.f148120W;
        AbstractC19074t.m100207e(storyMusicAttachment, "musicAttachment");
        m125121v0(str, songInfo, storyMusicAttachment);
        String str2 = c32123ta.f148138h;
        AbstractC19074t.m100207e(str2, "storyId");
        m125109F0(str2);
    }

    /* renamed from: L0 */
    public final void m125114L0(boolean z11) {
        this.f115618D.m108420e(z11);
    }

    /* renamed from: M0 */
    public final void m125115M0(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f115617C.mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_VIEW", new z(i11));
        m125098o0(str, this.f115616B.m110553a(i11), i12);
    }

    /* renamed from: N0 */
    public final void m125116N0(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, "storyId");
        this.f115617C.mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_VIEW", new a0(i11));
        m125098o0(str, this.f115616B.m110554b(i11), i12);
    }

    /* renamed from: k0 */
    public final LiveData m125117k0() {
        return this.f115619E;
    }

    /* renamed from: l0 */
    public final LiveData m125118l0() {
        return this.f115622H;
    }

    /* renamed from: m0 */
    public final LiveData m125119m0() {
        return this.f115628N;
    }

    /* renamed from: u0 */
    public final void m125120u0(String str, SongInfo songInfo) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(songInfo, "songInfo");
        if (!m125103t0(str)) {
            this.f115618D.m108417b(str, songInfo, null);
            m125102s0(str, songInfo.m45182d());
        }
    }

    /* renamed from: v0 */
    public final void m125121v0(String str, SongInfo songInfo, StoryMusicAttachment storyMusicAttachment) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(songInfo, "songInfo");
        AbstractC19074t.m100208f(storyMusicAttachment, "visualAttachment");
        if (!m125103t0(str)) {
            this.f115618D.m108417b(str, songInfo, storyMusicAttachment);
            m125102s0(str, songInfo.m45182d());
        } else {
            m125086Y0(str, new t());
        }
    }

    /* renamed from: w0 */
    public final void m125122w0(String str, C32002l4 c32002l4, boolean z11) {
        String str2;
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        Boolean bool = (Boolean) this.f115632w.m101509a(new C25465q.a(this.f115633x));
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            m125086Y0(str, new u(booleanValue));
            this.f115618D.m108420e(booleanValue);
            InterfaceC25486s interfaceC25486s = this.f115634y;
            C23648e m154346U = C32017m4.m154326S().m154346U(c32002l4.m154284u(78));
            if (m154346U != null) {
                String[] m123919l = m154346U.m123919l();
                String str3 = "1";
                if (!booleanValue) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                m123919l[0] = str2;
                String[] m123919l2 = m154346U.m123919l();
                if (!z11) {
                    str3 = "2";
                }
                m123919l2[1] = str3;
            } else {
                m154346U = null;
            }
            InterfaceC25486s.a.m132025a(interfaceC25486s, m154346U, false, 2, null);
        }
    }

    /* renamed from: x0 */
    public final void m125123x0(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(str2, "songId");
        m125102s0(str, str2);
        m125110G0(str, i11);
    }

    /* renamed from: y0 */
    public final void m125124y0(String str, String str2) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(str2, "songId");
        if (this.f115615A.mo131936a(true)) {
            m125102s0(str, str2);
        }
    }

    /* renamed from: z0 */
    public final void m125125z0(String str, SongInfo songInfo, EnumC2963d3 enumC2963d3, C32002l4 c32002l4) {
        AbstractC19074t.m100208f(str, "storyId");
        AbstractC19074t.m100208f(songInfo, "songInfo");
        AbstractC19074t.m100208f(enumC2963d3, "state");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (m125100q0(enumC2963d3)) {
            this.f115619E.mo9224q(new C19964c(new f(str, songInfo, true)));
            InterfaceC25486s interfaceC25486s = this.f115634y;
            C23648e m154346U = C32017m4.m154326S().m154346U(c32002l4.m154284u(79));
            if (m154346U != null) {
                m154346U.m123919l()[0] = "2";
            } else {
                m154346U = null;
            }
            InterfaceC25486s.a.m132025a(interfaceC25486s, m154346U, false, 2, null);
        }
    }
}
