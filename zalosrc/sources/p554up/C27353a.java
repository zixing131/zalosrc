package p554up;

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
import bo.InterfaceC2946a1;
import bo.InterfaceC2997k2;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.feed.models.FeedMusicDataImpl;
import com.zing.zalo.feed.models.MusicDataLyricInfoImpl;
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
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import me0.AbstractC23136l9;
import p089d2.InterfaceC17712d;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p361nb.C23648e;
import p363nh.C23744a;
import p399op.C24390b;
import p426pp.AbstractC24900c;
import p426pp.C24898a;
import p426pp.C24902e;
import p426pp.C24903f;
import p456qp.C25449a;
import p456qp.C25455g;
import p456qp.C25457i;
import p456qp.C25458j;
import p456qp.C25459k;
import p456qp.C25461m;
import p456qp.C25464p;
import p456qp.C25465q;
import p458qr.C25478k;
import p458qr.C25480m;
import p458qr.InterfaceC25469b;
import p458qr.InterfaceC25486s;
import p509sp.C26354c;
import p509sp.C26356e;
import p509sp.C26359h;
import p509sp.C26361j;
import p509sp.InterfaceC26352a;
import p509sp.InterfaceC26353b;
import p616wo.C29116a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: up.a */
/* loaded from: classes4.dex */
public final class C27353a extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final InterfaceC26353b f128646A;

    /* renamed from: B */
    private final InterfaceC26352a f128647B;

    /* renamed from: C */
    private final InterfaceC25469b f128648C;

    /* renamed from: D */
    private final InterfaceC25486s f128649D;

    /* renamed from: E */
    private final C25449a f128650E;

    /* renamed from: F */
    private final C1780l0 f128651F;

    /* renamed from: G */
    private final C1761c0 f128652G;

    /* renamed from: H */
    private final C1761c0 f128653H;

    /* renamed from: I */
    private String f128654I;

    /* renamed from: J */
    private C1761c0 f128655J;

    /* renamed from: t */
    private final C25458j f128656t;

    /* renamed from: u */
    private final C25464p f128657u;

    /* renamed from: v */
    private final C25457i f128658v;

    /* renamed from: w */
    private final C25459k f128659w;

    /* renamed from: x */
    private final C25461m f128660x;

    /* renamed from: y */
    private final C25455g f128661y;

    /* renamed from: z */
    private final C25465q f128662z;

    /* renamed from: up.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: up.a$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    /* renamed from: up.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements b {

        /* renamed from: a */
        public static final c f128663a = new c();

        private c() {
        }
    }

    /* renamed from: up.a$d */
    /* loaded from: classes4.dex */
    public static final class d implements b {

        /* renamed from: a */
        private final String f128664a;

        public d(String str) {
            AbstractC19074t.m100208f(str, "msg");
            this.f128664a = str;
        }

        /* renamed from: a */
        public final String m140007a() {
            return this.f128664a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && AbstractC19074t.m100204b(this.f128664a, ((d) obj).f128664a);
        }

        public int hashCode() {
            return this.f128664a.hashCode();
        }

        public String toString() {
            return "EventShowMessage(msg=" + this.f128664a + ")";
        }
    }

    /* renamed from: up.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC1754a {

        /* renamed from: d */
        private final C25458j f128665d;

        /* renamed from: e */
        private final C25464p f128666e;

        /* renamed from: f */
        private final C25457i f128667f;

        /* renamed from: g */
        private final C25459k f128668g;

        /* renamed from: h */
        private final C25461m f128669h;

        /* renamed from: i */
        private final C25455g f128670i;

        /* renamed from: j */
        private final C25465q f128671j;

        /* renamed from: k */
        private final InterfaceC26353b f128672k;

        /* renamed from: l */
        private final InterfaceC26352a f128673l;

        /* renamed from: m */
        private final InterfaceC25469b f128674m;

        /* renamed from: n */
        private final InterfaceC25486s f128675n;

        /* renamed from: o */
        private final C25449a f128676o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC17712d interfaceC17712d, Bundle bundle, C25458j c25458j, C25464p c25464p, C25457i c25457i, C25459k c25459k, C25461m c25461m, C25455g c25455g, C25465q c25465q, InterfaceC26353b interfaceC26353b, InterfaceC26352a interfaceC26352a, InterfaceC25469b interfaceC25469b, InterfaceC25486s interfaceC25486s, C25449a c25449a) {
            super(interfaceC17712d, bundle);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
            AbstractC19074t.m100208f(c25458j, "playSongUseCase");
            AbstractC19074t.m100208f(c25464p, "stopSongUseCase");
            AbstractC19074t.m100208f(c25457i, "pauseSongUseCase");
            AbstractC19074t.m100208f(c25459k, "resumeSongUseCase");
            AbstractC19074t.m100208f(c25461m, "seekSongUseCase");
            AbstractC19074t.m100208f(c25455g, "getSongInfoUseCase");
            AbstractC19074t.m100208f(c25465q, "toggleSpeaker");
            AbstractC19074t.m100208f(interfaceC26353b, "playSoundConfig");
            AbstractC19074t.m100208f(interfaceC26352a, "autoDownloadConfig");
            AbstractC19074t.m100208f(interfaceC25469b, "networkInfoProvider");
            AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
            AbstractC19074t.m100208f(c25449a, "checkIsInCallUseCase");
            this.f128665d = c25458j;
            this.f128666e = c25464p;
            this.f128667f = c25457i;
            this.f128668g = c25459k;
            this.f128669h = c25461m;
            this.f128670i = c25455g;
            this.f128671j = c25465q;
            this.f128672k = interfaceC26353b;
            this.f128673l = interfaceC26352a;
            this.f128674m = interfaceC25469b;
            this.f128675n = interfaceC25486s;
            this.f128676o = c25449a;
        }

        @Override // androidx.lifecycle.AbstractC1754a
        /* renamed from: e */
        protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(c1780l0, "handle");
            if (cls.isAssignableFrom(C27353a.class)) {
                return new C27353a(this.f128665d, this.f128666e, this.f128667f, this.f128668g, this.f128669h, this.f128670i, this.f128671j, this.f128672k, this.f128673l, this.f128674m, this.f128675n, this.f128676o, c1780l0);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }

        public /* synthetic */ e(InterfaceC17712d interfaceC17712d, Bundle bundle, int i11, AbstractC19060k abstractC19060k) {
            this(interfaceC17712d, (i11 & 2) != 0 ? null : bundle);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC17712d interfaceC17712d, Bundle bundle) {
            this(interfaceC17712d, bundle, new C25458j(null, 1, null), new C25464p(), new C25457i(), new C25459k(null, 1, null), new C25461m(), new C25455g(null, null, 3, null), new C25465q(), C26356e.f125201a, C26354c.f125196a, new C25478k(), C25480m.f122070a, new C25449a());
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
        }
    }

    /* renamed from: up.a$f */
    /* loaded from: classes4.dex */
    public static final class f implements b {

        /* renamed from: a */
        private final String f128677a;

        /* renamed from: b */
        private final String f128678b;

        public f(String str, String str2) {
            AbstractC19074t.m100208f(str, "idSong");
            AbstractC19074t.m100208f(str2, "urlSong");
            this.f128677a = str;
            this.f128678b = str2;
        }

        /* renamed from: a */
        public final String m140008a() {
            return this.f128677a;
        }

        /* renamed from: b */
        public final String m140009b() {
            return this.f128678b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC19074t.m100204b(this.f128677a, fVar.f128677a) && AbstractC19074t.m100204b(this.f128678b, fVar.f128678b);
        }

        public int hashCode() {
            return (this.f128677a.hashCode() * 31) + this.f128678b.hashCode();
        }

        public String toString() {
            return "NavigateZingMp3WebView(idSong=" + this.f128677a + ", urlSong=" + this.f128678b + ")";
        }
    }

    /* renamed from: up.a$g */
    /* loaded from: classes4.dex */
    public static final class g implements b {

        /* renamed from: a */
        private final String f128679a;

        /* renamed from: b */
        private final String f128680b;

        /* renamed from: c */
        private final boolean f128681c;

        public g(String str, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "feedId");
            AbstractC19074t.m100208f(str2, "songId");
            this.f128679a = str;
            this.f128680b = str2;
            this.f128681c = z11;
        }

        /* renamed from: a */
        public final String m140010a() {
            return this.f128679a;
        }

        /* renamed from: b */
        public final String m140011b() {
            return this.f128680b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC19074t.m100204b(this.f128679a, gVar.f128679a) && AbstractC19074t.m100204b(this.f128680b, gVar.f128680b) && this.f128681c == gVar.f128681c;
        }

        public int hashCode() {
            return (((this.f128679a.hashCode() * 31) + this.f128680b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f128681c);
        }

        public String toString() {
            return "OpenMusicDetailData(feedId=" + this.f128679a + ", songId=" + this.f128680b + ", shouldOpenMusicDetail=" + this.f128681c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Exception f128682q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Exception exc) {
            super(1);
            this.f128682q = exc;
        }

        /* renamed from: a */
        public final void m140012a(FeedMusicDataImpl feedMusicDataImpl) {
            EnumC2963d3 enumC2963d3;
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            MusicDataSongInfoImpl mo14160c = feedMusicDataImpl.mo14160c();
            if (this.f128682q instanceof ExceptionMusicLocationNotSupported) {
                enumC2963d3 = EnumC2963d3.f11684s;
            } else {
                enumC2963d3 = EnumC2963d3.f11683r;
            }
            mo14160c.m45111n(enumC2963d3);
            feedMusicDataImpl.mo14158a().m45118h(false);
            feedMusicDataImpl.mo14161e().m45101e(LyricRender.Companion.m45716a());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140012a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {
        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m140013a(FeedMusicDataImpl feedMusicDataImpl) {
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            MusicDataSongInfoImpl mo14160c = feedMusicDataImpl.mo14160c();
            C27353a c27353a = C27353a.this;
            mo14160c.m45111n(EnumC2963d3.f11682q);
            mo14160c.m45110m(c27353a.m139986Z().mo117210a());
            feedMusicDataImpl.mo14158a().m45118h(false);
            feedMusicDataImpl.mo14161e().m45101e(LyricRender.Companion.m45717b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140013a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final j f128684q = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m140014a(FeedMusicDataImpl feedMusicDataImpl) {
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            MusicDataStreamingInfoImpl mo14158a = feedMusicDataImpl.mo14158a();
            mo14158a.m45118h(true);
            mo14158a.m45116f(0);
            mo14158a.m45117g(EnumC3057x2.f12360q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140014a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final k f128685q = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m140015a(FeedMusicDataImpl feedMusicDataImpl) {
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            feedMusicDataImpl.mo14161e().m45101e(LyricRender.Companion.m45717b());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140015a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final l f128686q = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m140016a(FeedMusicDataImpl feedMusicDataImpl) {
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            feedMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11681p);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140016a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: up.a$m */
    /* loaded from: classes4.dex */
    public static final class m implements C25455g.a {

        /* renamed from: b */
        final /* synthetic */ String f128688b;

        /* renamed from: c */
        final /* synthetic */ String f128689c;

        /* renamed from: up.a$m$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C24902e f128690q;

            /* renamed from: r */
            final /* synthetic */ C27353a f128691r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C24902e c24902e, C27353a c27353a) {
                super(1);
                this.f128690q = c24902e;
                this.f128691r = c27353a;
            }

            /* renamed from: a */
            public final void m140017a(FeedMusicDataImpl feedMusicDataImpl) {
                AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                MusicDataSongInfoImpl mo14160c = feedMusicDataImpl.mo14160c();
                C24902e c24902e = this.f128690q;
                C27353a c27353a = this.f128691r;
                mo14160c.m45111n(EnumC2963d3.f11682q);
                mo14160c.m45107j(c24902e.m129492h());
                mo14160c.m45106i(c24902e.m129487c());
                mo14160c.m45108k(c24902e.m129494j());
                mo14160c.m45109l(c24902e.m129496l());
                mo14160c.m45110m(c27353a.m139986Z().mo117210a());
                mo14160c.m45112o(c24902e.m129495k());
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m140017a((FeedMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: up.a$m$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f128692q;

            /* renamed from: r */
            final /* synthetic */ C24898a f128693r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, C24898a c24898a) {
                super(1);
                this.f128692q = str;
                this.f128693r = c24898a;
            }

            /* renamed from: a */
            public final void m140018a(FeedMusicDataImpl feedMusicDataImpl) {
                Object m131207g0;
                Object m131207g02;
                AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                MusicDataLyricInfoImpl mo14161e = feedMusicDataImpl.mo14161e();
                String str = this.f128692q;
                C24898a c24898a = this.f128693r;
                m131207g0 = AbstractC25332a0.m131207g0(c24898a.m129468d(), 0);
                m131207g02 = AbstractC25332a0.m131207g0(c24898a.m129468d(), 1);
                mo14161e.m45101e(new LyricRender(str, (Sentence) m131207g0, (Sentence) m131207g02, false, false, 24, null));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m140018a((FeedMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: up.a$m$c */
        /* loaded from: classes4.dex */
        static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final c f128694q = new c();

            c() {
                super(1);
            }

            /* renamed from: a */
            public final void m140019a(FeedMusicDataImpl feedMusicDataImpl) {
                AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                MusicDataStreamingInfoImpl mo14158a = feedMusicDataImpl.mo14158a();
                mo14158a.m45118h(true);
                mo14158a.m45116f(0);
                mo14158a.m45117g(EnumC3057x2.f12360q);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m140019a((FeedMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        m(String str, String str2) {
            this.f128688b = str;
            this.f128689c = str2;
        }

        @Override // p456qp.C25455g.a
        /* renamed from: a */
        public void mo104705a(C24903f c24903f) {
            AbstractC19074t.m100208f(c24903f, "streaming");
            if (!C27353a.this.m139977j0(this.f128688b)) {
                C27353a.this.m139969I0(this.f128688b, c.f128694q);
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: b */
        public void mo104706b(C24898a c24898a) {
            AbstractC19074t.m100208f(c24898a, "lyric");
            if (!C27353a.this.m139977j0(this.f128688b)) {
                C27353a.this.m139969I0(this.f128688b, new b(this.f128689c, c24898a));
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: c */
        public void mo104707c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            C27353a.this.m139991f0(this.f128688b, exc);
        }

        @Override // p456qp.C25455g.a
        /* renamed from: d */
        public void mo104708d(C24902e c24902e) {
            AbstractC19074t.m100208f(c24902e, "song");
            C27353a c27353a = C27353a.this;
            c27353a.m139969I0(this.f128688b, new a(c24902e, c27353a));
        }
    }

    /* renamed from: up.a$n */
    /* loaded from: classes4.dex */
    static final class n extends AbstractC19075u implements InterfaceC18505l {
        n() {
            super(1);
        }

        /* renamed from: a */
        public final void m140020a(FeedMusicDataImpl feedMusicDataImpl) {
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            feedMusicDataImpl.mo14160c().m45110m(C27353a.this.m139986Z().mo117210a());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140020a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: up.a$o */
    /* loaded from: classes4.dex */
    static final class o extends AbstractC19075u implements InterfaceC18505l {
        o() {
            super(1);
        }

        /* renamed from: a */
        public final void m140021a(FeedMusicDataImpl feedMusicDataImpl) {
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            feedMusicDataImpl.mo14160c().m45110m(C27353a.this.m139986Z().mo117210a());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140021a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ boolean f128697q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(boolean z11) {
            super(1);
            this.f128697q = z11;
        }

        /* renamed from: a */
        public final void m140022a(FeedMusicDataImpl feedMusicDataImpl) {
            AbstractC19074t.m100208f(feedMusicDataImpl, "it");
            feedMusicDataImpl.mo14160c().m45110m(this.f128697q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m140022a((FeedMusicDataImpl) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f128698q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(0);
            this.f128698q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "pauseSong - " + this.f128698q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128699t;

        /* renamed from: v */
        final /* synthetic */ String f128701v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: up.a$r$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f128702q = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m140025a(FeedMusicDataImpl feedMusicDataImpl) {
                AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                feedMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12360q);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m140025a((FeedMusicDataImpl) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, Continuation continuation) {
            super(2, continuation);
            this.f128701v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new r(this.f128701v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128699t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25458j m139985Y = C27353a.this.m139985Y();
                this.f128699t = 1;
                if (m139985Y.m131868c(this) == m142578e) {
                    return m142578e;
                }
            }
            C27353a.this.m139969I0(this.f128701v, a.f128702q);
            C27353a.this.m139984X().m101508a(new Object());
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f128703q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(0);
            this.f128703q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "playSong - " + this.f128703q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128704t;

        /* renamed from: v */
        final /* synthetic */ String f128706v;

        /* renamed from: w */
        final /* synthetic */ boolean f128707w;

        /* renamed from: x */
        final /* synthetic */ boolean f128708x;

        /* renamed from: y */
        final /* synthetic */ int f128709y;

        /* renamed from: z */
        final /* synthetic */ String f128710z;

        /* renamed from: up.a$t$a */
        /* loaded from: classes4.dex */
        public static final class a implements C25458j.a {

            /* renamed from: a */
            final /* synthetic */ C27353a f128711a;

            /* renamed from: b */
            final /* synthetic */ String f128712b;

            /* renamed from: c */
            final /* synthetic */ int f128713c;

            /* renamed from: up.a$t$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C32995a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128714t;

                /* renamed from: u */
                final /* synthetic */ C27353a f128715u;

                /* renamed from: v */
                final /* synthetic */ String f128716v;

                /* renamed from: w */
                final /* synthetic */ LyricRender f128717w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$t$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32996a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ LyricRender f128718q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32996a(LyricRender lyricRender) {
                        super(1);
                        this.f128718q = lyricRender;
                    }

                    /* renamed from: a */
                    public final void m140029a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                        feedMusicDataImpl.mo14161e().m45101e(this.f128718q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140029a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32995a(C27353a c27353a, String str, LyricRender lyricRender, Continuation continuation) {
                    super(2, continuation);
                    this.f128715u = c27353a;
                    this.f128716v = str;
                    this.f128717w = lyricRender;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32995a(this.f128715u, this.f128716v, this.f128717w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128714t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f128715u.m139969I0(this.f128716v, new C32996a(this.f128717w));
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32995a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: up.a$t$a$b */
            /* loaded from: classes4.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128719t;

                /* renamed from: u */
                final /* synthetic */ C27353a f128720u;

                /* renamed from: v */
                final /* synthetic */ String f128721v;

                /* renamed from: w */
                final /* synthetic */ Exception f128722w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C27353a c27353a, String str, Exception exc, Continuation continuation) {
                    super(2, continuation);
                    this.f128720u = c27353a;
                    this.f128721v = str;
                    this.f128722w = exc;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f128720u, this.f128721v, this.f128722w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128719t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f128720u.m139991f0(this.f128721v, this.f128722w);
                        this.f128720u.m139992g0(this.f128722w);
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

            /* renamed from: up.a$t$a$c */
            /* loaded from: classes4.dex */
            static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128723t;

                /* renamed from: u */
                final /* synthetic */ C27353a f128724u;

                /* renamed from: v */
                final /* synthetic */ String f128725v;

                /* renamed from: w */
                final /* synthetic */ int f128726w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$t$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32997a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ int f128727q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32997a(int i11) {
                        super(1);
                        this.f128727q = i11;
                    }

                    /* renamed from: a */
                    public final void m140032a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                        MusicDataStreamingInfoImpl mo14158a = feedMusicDataImpl.mo14158a();
                        int i11 = this.f128727q;
                        mo14158a.m45118h(true);
                        mo14158a.m45116f(i11);
                        mo14158a.m45117g(EnumC3057x2.f12361r);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140032a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C27353a c27353a, String str, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f128724u = c27353a;
                    this.f128725v = str;
                    this.f128726w = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f128724u, this.f128725v, this.f128726w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128723t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f128724u.m139965D0(this.f128725v);
                        this.f128724u.m139969I0(this.f128725v, new C32997a(this.f128726w));
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

            /* renamed from: up.a$t$a$d */
            /* loaded from: classes4.dex */
            static final class d extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128728t;

                /* renamed from: u */
                final /* synthetic */ C27353a f128729u;

                /* renamed from: v */
                final /* synthetic */ String f128730v;

                /* renamed from: w */
                final /* synthetic */ C24903f f128731w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$t$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32998a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ C24903f f128732q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32998a(C24903f c24903f) {
                        super(1);
                        this.f128732q = c24903f;
                    }

                    /* renamed from: a */
                    public final void m140034a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                        feedMusicDataImpl.mo14160c().m45111n(EnumC2963d3.f11682q);
                        MusicDataStreamingInfoImpl mo14158a = feedMusicDataImpl.mo14158a();
                        mo14158a.m45115e(this.f128732q.m129501d());
                        mo14158a.m45117g(EnumC3057x2.f12359p);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140034a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C27353a c27353a, String str, C24903f c24903f, Continuation continuation) {
                    super(2, continuation);
                    this.f128729u = c27353a;
                    this.f128730v = str;
                    this.f128731w = c24903f;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new d(this.f128729u, this.f128730v, this.f128731w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128728t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f128729u.m139969I0(this.f128730v, new C32998a(this.f128731w));
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

            /* renamed from: up.a$t$a$e */
            /* loaded from: classes4.dex */
            static final class e extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128733t;

                /* renamed from: u */
                final /* synthetic */ C27353a f128734u;

                /* renamed from: v */
                final /* synthetic */ String f128735v;

                /* renamed from: w */
                final /* synthetic */ int f128736w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$t$a$e$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C32999a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ int f128737q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32999a(int i11) {
                        super(1);
                        this.f128737q = i11;
                    }

                    /* renamed from: a */
                    public final void m140036a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                        feedMusicDataImpl.mo14158a().m45116f(this.f128737q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140036a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C27353a c27353a, String str, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f128734u = c27353a;
                    this.f128735v = str;
                    this.f128736w = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new e(this.f128734u, this.f128735v, this.f128736w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128733t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f128734u.m139969I0(this.f128735v, new C32999a(this.f128736w));
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

            /* renamed from: up.a$t$a$f */
            /* loaded from: classes4.dex */
            static final class f extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128738t;

                /* renamed from: u */
                final /* synthetic */ int f128739u;

                /* renamed from: v */
                final /* synthetic */ C27353a f128740v;

                /* renamed from: w */
                final /* synthetic */ String f128741w;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$t$a$f$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C33000a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ int f128742q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C33000a(int i11) {
                        super(1);
                        this.f128742q = i11;
                    }

                    /* renamed from: a */
                    public final void m140038a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                        MusicDataStreamingInfoImpl mo14158a = feedMusicDataImpl.mo14158a();
                        mo14158a.m45116f(C26361j.f125215a.m135696b(mo14158a.getDuration(), this.f128742q));
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140038a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(int i11, C27353a c27353a, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f128739u = i11;
                    this.f128740v = c27353a;
                    this.f128741w = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new f(this.f128739u, this.f128740v, this.f128741w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128738t == 0) {
                        AbstractC24862s.m129228b(obj);
                        int i11 = this.f128739u;
                        if (i11 == 0) {
                            this.f128740v.m139969I0(this.f128741w, new C33000a(i11));
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

            /* renamed from: up.a$t$a$g */
            /* loaded from: classes4.dex */
            static final class g extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128743t;

                /* renamed from: u */
                final /* synthetic */ C27353a f128744u;

                /* renamed from: v */
                final /* synthetic */ String f128745v;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$t$a$g$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C33001a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    public static final C33001a f128746q = new C33001a();

                    C33001a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m140040a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "it");
                        feedMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12360q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140040a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(C27353a c27353a, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f128744u = c27353a;
                    this.f128745v = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new g(this.f128744u, this.f128745v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128743t == 0) {
                        AbstractC24862s.m129228b(obj);
                        if (AbstractC19074t.m100204b(this.f128744u.m139982U(), this.f128745v)) {
                            this.f128744u.m139965D0("");
                        }
                        this.f128744u.m139969I0(this.f128745v, C33001a.f128746q);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C27353a c27353a, String str, int i11) {
                this.f128711a = c27353a;
                this.f128712b = str;
                this.f128713c = i11;
            }

            @Override // p456qp.C25458j.a
            /* renamed from: a */
            public void mo104656a(Exception exc) {
                AbstractC19074t.m100208f(exc, "exception");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128711a), null, null, new b(this.f128711a, this.f128712b, exc, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: b */
            public void mo104657b(String str) {
                AbstractC19074t.m100208f(str, "idSong");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128711a), null, null, new c(this.f128711a, this.f128712b, this.f128713c, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: c */
            public void mo104658c(C24903f c24903f, int i11, int i12) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128711a), null, null, new e(this.f128711a, this.f128712b, i11, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: d */
            public void mo104659d(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128711a), null, null, new d(this.f128711a, this.f128712b, c24903f, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: e */
            public void mo104660e(C24903f c24903f, int i11) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128711a), null, null, new f(i11, this.f128711a, this.f128712b, null), 3, null);
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
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128711a), null, null, new g(this.f128711a, this.f128712b, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: h */
            public void mo104663h(C24902e c24902e) {
                C25458j.a.C32958a.m131878f(this, c24902e);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: i */
            public void mo104664i(C24903f c24903f, LyricRender lyricRender) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                AbstractC19074t.m100208f(lyricRender, "lyricRender");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f128711a), null, null, new C32995a(this.f128711a, this.f128712b, lyricRender, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            public void onAudioFocusChange(int i11) {
                C25458j.a.C32958a.m131873a(this, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, boolean z11, boolean z12, int i11, String str2, Continuation continuation) {
            super(2, continuation);
            this.f128706v = str;
            this.f128707w = z11;
            this.f128708x = z12;
            this.f128709y = i11;
            this.f128710z = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new t(this.f128706v, this.f128707w, this.f128708x, this.f128709y, this.f128710z, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128704t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25458j m139985Y = C27353a.this.m139985Y();
                String str = this.f128706v;
                boolean z11 = this.f128707w;
                boolean z12 = this.f128708x;
                InterfaceC26353b m139986Z = C27353a.this.m139986Z();
                int i12 = this.f128709y;
                C25458j.b bVar = new C25458j.b(str, z11, z12, m139986Z, true, i12, new a(C27353a.this, this.f128710z, i12));
                this.f128704t = 1;
                if (m139985Y.m101507a(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((t) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128747t;

        /* renamed from: v */
        final /* synthetic */ String f128749v;

        /* renamed from: w */
        final /* synthetic */ String f128750w;

        /* renamed from: x */
        final /* synthetic */ int f128751x;

        /* renamed from: y */
        final /* synthetic */ boolean f128752y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: up.a$u$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C27353a f128753p;

            /* renamed from: q */
            final /* synthetic */ String f128754q;

            /* renamed from: r */
            final /* synthetic */ int f128755r;

            /* renamed from: s */
            final /* synthetic */ String f128756s;

            /* renamed from: t */
            final /* synthetic */ boolean f128757t;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: up.a$u$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33002a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f128758t;

                /* renamed from: u */
                final /* synthetic */ AbstractC24900c f128759u;

                /* renamed from: v */
                final /* synthetic */ C27353a f128760v;

                /* renamed from: w */
                final /* synthetic */ String f128761w;

                /* renamed from: x */
                final /* synthetic */ int f128762x;

                /* renamed from: y */
                final /* synthetic */ String f128763y;

                /* renamed from: z */
                final /* synthetic */ boolean f128764z;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$u$a$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C33003a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    public static final C33003a f128765q = new C33003a();

                    C33003a() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m140044a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "feedMusicData");
                        feedMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12361r);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140044a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$u$a$a$b */
                /* loaded from: classes4.dex */
                public static final class b extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ long f128766q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(long j11) {
                        super(1);
                        this.f128766q = j11;
                    }

                    /* renamed from: a */
                    public final void m140045a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "feedMusicData");
                        feedMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12359p);
                        feedMusicDataImpl.mo14158a().m45116f((int) this.f128766q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140045a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* renamed from: up.a$u$a$a$c */
                /* loaded from: classes4.dex */
                public static final class c extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    public static final c f128767q = new c();

                    c() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m140046a(FeedMusicDataImpl feedMusicDataImpl) {
                        AbstractC19074t.m100208f(feedMusicDataImpl, "feedMusicData");
                        feedMusicDataImpl.mo14158a().m45117g(EnumC3057x2.f12360q);
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m140046a((FeedMusicDataImpl) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C33002a(AbstractC24900c abstractC24900c, C27353a c27353a, String str, int i11, String str2, boolean z11, Continuation continuation) {
                    super(2, continuation);
                    this.f128759u = abstractC24900c;
                    this.f128760v = c27353a;
                    this.f128761w = str;
                    this.f128762x = i11;
                    this.f128763y = str2;
                    this.f128764z = z11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C33002a(this.f128759u, this.f128760v, this.f128761w, this.f128762x, this.f128763y, this.f128764z, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f128758t == 0) {
                        AbstractC24862s.m129228b(obj);
                        AbstractC24900c abstractC24900c = this.f128759u;
                        if (abstractC24900c instanceof AbstractC24900c.b) {
                            this.f128760v.m139969I0(this.f128761w, C33003a.f128765q);
                        } else if (abstractC24900c instanceof AbstractC24900c.c) {
                            C7853b.f.a m40162b = ((C25459k.b) ((AbstractC24900c.c) abstractC24900c).m129474a()).m131906a().m40162b();
                            long m40161a = ((C25459k.b) ((AbstractC24900c.c) this.f128759u).m129474a()).m131906a().m40161a();
                            if (m40162b == C7853b.f.a.f42237r || m40161a != this.f128762x) {
                                this.f128760v.m139963B0(this.f128761w, this.f128763y, false, this.f128762x, this.f128764z);
                            } else {
                                this.f128760v.m139965D0(this.f128761w);
                                this.f128760v.m139969I0(this.f128761w, new b(m40161a));
                            }
                        } else if (abstractC24900c instanceof AbstractC24900c.a) {
                            this.f128760v.m139969I0(this.f128761w, c.f128767q);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C33002a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C27353a c27353a, String str, int i11, String str2, boolean z11) {
                this.f128753p = c27353a;
                this.f128754q = str;
                this.f128755r = i11;
                this.f128756s = str2;
                this.f128757t = z11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                Object m142578e;
                Object m112534g = BuildersKt.m112534g(Dispatchers.m112681c(), new C33002a(abstractC24900c, this.f128753p, this.f128754q, this.f128755r, this.f128756s, this.f128757t, null), continuation);
                m142578e = AbstractC28298d.m142578e();
                if (m112534g == m142578e) {
                    return m112534g;
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, String str2, int i11, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f128749v = str;
            this.f128750w = str2;
            this.f128751x = i11;
            this.f128752y = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new u(this.f128749v, this.f128750w, this.f128751x, this.f128752y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128747t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C25459k m139987a0 = C27353a.this.m139987a0();
                C25459k.a aVar = new C25459k.a(this.f128749v);
                this.f128747t = 1;
                obj = m139987a0.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C27353a.this, this.f128750w, this.f128751x, this.f128749v, this.f128752y);
                this.f128747t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((u) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$v */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final v f128768q = new v();

        v() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "stopSong";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: up.a$w */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128769t;

        w(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new w(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128769t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25458j m139985Y = C27353a.this.m139985Y();
                this.f128769t = 1;
                if (m139985Y.m131868c(this) == m142578e) {
                    return m142578e;
                }
            }
            C27353a.this.m139990e0().m101508a(new C25464p.b(true, C27353a.this.m139986Z()));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((w) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C27353a(C25458j c25458j, C25464p c25464p, C25457i c25457i, C25459k c25459k, C25461m c25461m, C25455g c25455g, C25465q c25465q, InterfaceC26353b interfaceC26353b, InterfaceC26352a interfaceC26352a, InterfaceC25469b interfaceC25469b, InterfaceC25486s interfaceC25486s, C25449a c25449a, C1780l0 c1780l0) {
        AbstractC19074t.m100208f(c25458j, "playSongLyricUseCase");
        AbstractC19074t.m100208f(c25464p, "stopSongUseCase");
        AbstractC19074t.m100208f(c25457i, "pauseSongUseCase");
        AbstractC19074t.m100208f(c25459k, "resumeSongUseCase");
        AbstractC19074t.m100208f(c25461m, "seekSongUseCase");
        AbstractC19074t.m100208f(c25455g, "getSongInfoUseCase");
        AbstractC19074t.m100208f(c25465q, "toggleSpeakerUseCase");
        AbstractC19074t.m100208f(interfaceC26353b, "playSoundConfig");
        AbstractC19074t.m100208f(interfaceC26352a, "autoDownloadConfig");
        AbstractC19074t.m100208f(interfaceC25469b, "networkInfoProvider");
        AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
        AbstractC19074t.m100208f(c25449a, "checkIsInCallUseCase");
        AbstractC19074t.m100208f(c1780l0, "handle");
        this.f128656t = c25458j;
        this.f128657u = c25464p;
        this.f128658v = c25457i;
        this.f128659w = c25459k;
        this.f128660x = c25461m;
        this.f128661y = c25455g;
        this.f128662z = c25465q;
        this.f128646A = interfaceC26353b;
        this.f128647B = interfaceC26352a;
        this.f128648C = interfaceC25469b;
        this.f128649D = interfaceC25486s;
        this.f128650E = c25449a;
        this.f128651F = c1780l0;
        this.f128652G = new C1761c0(Boolean.valueOf(interfaceC26353b.mo117210a()));
        this.f128653H = new C1761c0();
        this.f128654I = "";
        this.f128655J = new C1761c0();
        String str = (String) c1780l0.m9318c("CURRENT_PLAYING_FEED_SAVE_KEY");
        m139965D0(str != null ? str : "");
        InterfaceC2946a1 interfaceC2946a1 = (InterfaceC2946a1) c1780l0.m9318c("FEED_MUSIC_DATA_SAVE_KEY");
        if (interfaceC2946a1 == null || !m139976h0(interfaceC2946a1.mo13947I())) {
            return;
        }
        m139966E0(m139975V(interfaceC2946a1.mo13947I()));
    }

    /* renamed from: A0 */
    private final void m139962A0(String str, String str2, boolean z11) {
        m139963B0(str, str2, true, 0, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m139963B0(String str, String str2, boolean z11, int i11, boolean z12) {
        if (str2.length() == 0 || str.length() == 0) {
            return;
        }
        C26359h.f125209a.mo135685a("FEED_MUSIC", "FeedMusicPlaybackViewModel", new s(str2));
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new t(str2, z11, z12, i11, str, null), 3, null);
    }

    /* renamed from: C0 */
    private final void m139964C0(String str, String str2, int i11, boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new u(str2, str, i11, z11, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public final void m139965D0(String str) {
        this.f128651F.m9321g("CURRENT_PLAYING_FEED_SAVE_KEY", str);
        this.f128654I = str;
    }

    /* renamed from: E0 */
    private final void m139966E0(InterfaceC2946a1 interfaceC2946a1) {
        this.f128651F.m9321g("FEED_MUSIC_DATA_SAVE_KEY", interfaceC2946a1);
        this.f128655J.mo9224q(interfaceC2946a1);
    }

    /* renamed from: F0 */
    private final boolean m139967F0() {
        boolean z11;
        boolean z12;
        if (!this.f128647B.mo104102a() && (!this.f128647B.mo104103b() || !this.f128648C.mo131937b())) {
            z11 = false;
        } else {
            z11 = true;
        }
        Boolean bool = (Boolean) this.f128650E.m101506a();
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = false;
        }
        if (z11 && !z12) {
            return true;
        }
        return false;
    }

    /* renamed from: G0 */
    private final void m139968G0() {
        C26359h.f125209a.mo135685a("FEED_MUSIC", "FeedMusicPlaybackViewModel", v.f128768q);
        m139965D0("");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new w(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public final void m139969I0(String str, InterfaceC18505l interfaceC18505l) {
        FeedMusicDataImpl m139975V = m139975V(str);
        interfaceC18505l.mo205i9(m139975V);
        m139974T(m139975V);
    }

    /* renamed from: T */
    private final void m139974T(FeedMusicDataImpl feedMusicDataImpl) {
        C24390b.f117764a.m127573d(feedMusicDataImpl);
        m139966E0(feedMusicDataImpl);
    }

    /* renamed from: V */
    private final FeedMusicDataImpl m139975V(String str) {
        InterfaceC2946a1 m127570a = C24390b.f117764a.m127570a(str);
        AbstractC19074t.m100206d(m127570a, "null cannot be cast to non-null type com.zing.zalo.feed.models.FeedMusicDataImpl");
        return (FeedMusicDataImpl) m127570a;
    }

    /* renamed from: h0 */
    private final boolean m139976h0(String str) {
        return C24390b.f117764a.m127572c().containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final boolean m139977j0(String str) {
        if (str.length() == 0) {
            return false;
        }
        if (m139975V(str).mo14158a().mo14386c() != EnumC3057x2.f12359p && m139975V(str).mo14158a().mo14386c() != EnumC3057x2.f12361r) {
            return false;
        }
        return true;
    }

    /* renamed from: k0 */
    private final void m139978k0(String str, String str2) {
        m139969I0(str, l.f128686q);
        this.f128661y.m101508a(new C25455g.b(str2, AbstractC1798u0.m9374a(this), new m(str, str2)));
    }

    /* renamed from: l0 */
    private final boolean m139979l0(String str) {
        EnumC2963d3 enumC2963d3;
        EnumC2963d3 enumC2963d32;
        InterfaceC2997k2 mo14160c;
        InterfaceC2997k2 mo14160c2;
        InterfaceC2997k2 mo14160c3;
        C24390b c24390b = C24390b.f117764a;
        InterfaceC2946a1 interfaceC2946a1 = (InterfaceC2946a1) c24390b.m127572c().get(str);
        EnumC2963d3 enumC2963d33 = null;
        if (interfaceC2946a1 != null && (mo14160c3 = interfaceC2946a1.mo14160c()) != null) {
            enumC2963d3 = mo14160c3.getState();
        } else {
            enumC2963d3 = null;
        }
        if (enumC2963d3 != EnumC2963d3.f11682q) {
            InterfaceC2946a1 interfaceC2946a12 = (InterfaceC2946a1) c24390b.m127572c().get(str);
            if (interfaceC2946a12 != null && (mo14160c2 = interfaceC2946a12.mo14160c()) != null) {
                enumC2963d32 = mo14160c2.getState();
            } else {
                enumC2963d32 = null;
            }
            if (enumC2963d32 != EnumC2963d3.f11684s) {
                InterfaceC2946a1 interfaceC2946a13 = (InterfaceC2946a1) c24390b.m127572c().get(str);
                if (interfaceC2946a13 != null && (mo14160c = interfaceC2946a13.mo14160c()) != null) {
                    enumC2963d33 = mo14160c.getState();
                }
                if (enumC2963d33 != EnumC2963d3.f11685t) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: z0 */
    private final void m139980z0(String str) {
        C26359h.f125209a.mo135685a("FEED_MUSIC", "FeedMusicPlaybackViewModel", new q(str));
        m139965D0("");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new r(str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1796t0
    /* renamed from: J */
    public void mo9130J() {
        super.mo9130J();
        C24390b.f117764a.m127574e(EnumC3057x2.f12360q);
    }

    /* renamed from: S */
    public final void m139981S() {
        if (m139977j0(this.f128654I)) {
            m139968G0();
            this.f128653H.mo9224q(new C19964c(c.f128663a));
        }
    }

    /* renamed from: U */
    public final String m139982U() {
        return this.f128654I;
    }

    /* renamed from: W */
    public final LiveData m139983W() {
        return this.f128655J;
    }

    /* renamed from: X */
    public final C25457i m139984X() {
        return this.f128658v;
    }

    /* renamed from: Y */
    public final C25458j m139985Y() {
        return this.f128656t;
    }

    /* renamed from: Z */
    public final InterfaceC26353b m139986Z() {
        return this.f128646A;
    }

    /* renamed from: a0 */
    public final C25459k m139987a0() {
        return this.f128659w;
    }

    /* renamed from: b0 */
    public final LiveData m139988b0() {
        return this.f128653H;
    }

    /* renamed from: c0 */
    public final LiveData m139989c0() {
        C1761c0 c1761c0 = this.f128652G;
        c1761c0.mo9224q(Boolean.valueOf(this.f128646A.mo117210a()));
        return c1761c0;
    }

    /* renamed from: e0 */
    public final C25464p m139990e0() {
        return this.f128657u;
    }

    /* renamed from: f0 */
    public final void m139991f0(String str, Exception exc) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(exc, "exception");
        if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f46313p) || AbstractC19074t.m100204b(exc, ExceptionFetchMusicUnknown.f46307p) || AbstractC19074t.m100204b(exc, ExceptionMusicLocationNotSupported.f46311p)) {
            m139969I0(str, new h(exc));
            return;
        }
        if (AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p) || AbstractC19074t.m100204b(exc, ExceptionMusicStreaming.f46312p)) {
            m139969I0(str, new i());
            return;
        }
        if (AbstractC19074t.m100204b(exc, ExceptionInCall.f46308p)) {
            C1761c0 c1761c0 = this.f128653H;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticky_player_conflict_call);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c1761c0.mo9224q(new C19964c(new d(m118743r0)));
            m139969I0(str, j.f128684q);
            return;
        }
        if (AbstractC19074t.m100204b(exc, ExceptionLyric.f46309p)) {
            m139969I0(str, k.f128685q);
        }
    }

    /* renamed from: g0 */
    public final void m139992g0(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f46313p) || AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p) || AbstractC19074t.m100204b(exc, ExceptionMusicStreaming.f46312p) || AbstractC19074t.m100204b(exc, ExceptionInCall.f46308p) || AbstractC19074t.m100204b(exc, ExceptionFetchMusicUnknown.f46307p)) {
            m139968G0();
        }
    }

    /* renamed from: i0 */
    public final void m139993i0(C32002l4 c32002l4) {
        String str;
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (AbstractC19074t.m100204b(m139989c0().mo9215f(), Boolean.FALSE)) {
            Boolean bool = (Boolean) this.f128662z.m101509a(new C25465q.a(this.f128646A));
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                C24390b.f117764a.m127575f(booleanValue);
                this.f128652G.mo9224q(Boolean.valueOf(booleanValue));
                InterfaceC25486s interfaceC25486s = this.f128649D;
                C23648e m154345T = C32017m4.m154326S().m154345T(c32002l4.m154284u(68));
                if (m154345T != null) {
                    String[] m123919l = m154345T.m123919l();
                    if (!booleanValue) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    m123919l[0] = str;
                    m154345T.m123919l()[1] = "1";
                } else {
                    m154345T = null;
                }
                interfaceC25486s.mo131967a(m154345T, false);
            }
            this.f128662z.m101509a(new C25465q.a(C29116a.f134962a));
            C23744a.Companion.m124119a().m124116d(5118, new Object[0]);
        }
    }

    /* renamed from: m0 */
    public final void m139994m0(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        if (m139977j0(str)) {
            m139968G0();
        }
    }

    /* renamed from: n0 */
    public final void m139995n0(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        if (!m139977j0(str) && m139967F0()) {
            m139962A0(str, m139975V(str).mo14159b(), true);
        }
    }

    /* renamed from: o0 */
    public final void m139996o0(String str) {
        AbstractC19074t.m100208f(str, "feedId");
        m139969I0(str, new n());
    }

    /* renamed from: p0 */
    public final void m139997p0(String str, SongInfo songInfo, boolean z11) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(songInfo, "songInfo");
        if (!m139979l0(str)) {
            C24390b.f117764a.m127571b(str, songInfo, z11);
            m139978k0(str, songInfo.m45182d());
        } else {
            m139969I0(str, new o());
        }
    }

    /* renamed from: q0 */
    public final void m139998q0(String str, int i11) {
        AbstractC19074t.m100208f(str, "feedId");
        FeedMusicDataImpl m139975V = m139975V(str);
        if (m139975V.mo14158a().mo14386c() == EnumC3057x2.f12359p) {
            m139980z0(str);
        } else {
            m139964C0(str, m139975V.mo14159b(), i11, false);
        }
    }

    /* renamed from: r0 */
    public final void m139999r0(int i11) {
        this.f128660x.m101508a(new C25461m.a(i11));
    }

    /* renamed from: s0 */
    public final void m140000s0(String str, C32002l4 c32002l4) {
        String str2;
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        Boolean bool = (Boolean) this.f128662z.m101509a(new C25465q.a(this.f128646A));
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            m139969I0(str, new p(booleanValue));
            C24390b.f117764a.m127575f(booleanValue);
            this.f128652G.mo9224q(Boolean.valueOf(booleanValue));
            InterfaceC25486s interfaceC25486s = this.f128649D;
            C23648e m154345T = C32017m4.m154326S().m154345T(c32002l4.m154284u(68));
            if (m154345T != null) {
                String[] m123919l = m154345T.m123919l();
                if (booleanValue) {
                    str2 = "0";
                } else {
                    str2 = "1";
                }
                m123919l[0] = str2;
                m154345T.m123919l()[1] = "0";
            } else {
                m154345T = null;
            }
            interfaceC25486s.mo131967a(m154345T, false);
        }
        this.f128662z.m101509a(new C25465q.a(C29116a.f134962a));
        C23744a.Companion.m124119a().m124116d(5118, new Object[0]);
    }

    /* renamed from: t0 */
    public final void m140001t0(String str, String str2) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "songId");
        if (this.f128648C.mo131936a(true)) {
            m139978k0(str, str2);
            m139995n0(str);
        }
    }

    /* renamed from: u0 */
    public final void m140002u0(String str, String str2, EnumC2963d3 enumC2963d3) {
        AbstractC19074t.m100208f(str, "feedId");
        AbstractC19074t.m100208f(str2, "songId");
        AbstractC19074t.m100208f(enumC2963d3, "state");
        if (enumC2963d3 != EnumC2963d3.f11683r && enumC2963d3 != EnumC2963d3.f11681p) {
            this.f128653H.mo9224q(new C19964c(new g(str, str2, true)));
        }
    }

    /* renamed from: v0 */
    public final void m140003v0() {
        if (!m139967F0()) {
            m139968G0();
        }
    }

    /* renamed from: w0 */
    public final void m140004w0() {
        m139968G0();
    }

    /* renamed from: x0 */
    public final void m140005x0(String str) {
        AbstractC19074t.m100208f(str, "idSong");
        this.f128653H.mo9224q(new C19964c(new f(str, m139975V(str).mo14160c().m45104g())));
    }

    /* renamed from: y0 */
    public final void m140006y0() {
        m139968G0();
    }
}
