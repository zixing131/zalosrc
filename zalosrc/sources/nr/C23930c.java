package nr;

import ag0.C0815e1;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1754a;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1780l0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.feed.models.SongData;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionFetchMusicUnknown;
import com.zing.zalo.feed.mvp.music.data.ExceptionInCall;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLocationNotSupported;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposLyricStatus;
import com.zing.zalo.feed.mvp.postfeed.viewmodel.ComposeSongStatus;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lr.C22640a;
import me0.AbstractC23136l9;
import np.C23924c;
import np.InterfaceC23925d;
import nr.C23930c;
import p089d2.InterfaceC17712d;
import p205hc.C19964c;
import p274jr.C21344b;
import p361nb.C23648e;
import p426pp.C24898a;
import p426pp.C24902e;
import p426pp.C24903f;
import p456qp.C25455g;
import p456qp.C25458j;
import p456qp.C25459k;
import p456qp.C25461m;
import p456qp.C25464p;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: nr.c */
/* loaded from: classes4.dex */
public final class C23930c extends AbstractC1796t0 {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C1761c0 f115748A;

    /* renamed from: B */
    private final C1761c0 f115749B;

    /* renamed from: C */
    private final C1761c0 f115750C;

    /* renamed from: D */
    private final InterfaceC24854k f115751D;

    /* renamed from: E */
    private final InterfaceC24854k f115752E;

    /* renamed from: F */
    private final InterfaceC24854k f115753F;

    /* renamed from: G */
    private final InterfaceC24854k f115754G;

    /* renamed from: H */
    private final InterfaceC24854k f115755H;

    /* renamed from: I */
    private boolean f115756I;

    /* renamed from: J */
    private boolean f115757J;

    /* renamed from: K */
    private Job f115758K;

    /* renamed from: L */
    private Job f115759L;

    /* renamed from: M */
    private Job f115760M;

    /* renamed from: N */
    private int f115761N;

    /* renamed from: O */
    private long f115762O;

    /* renamed from: P */
    private boolean f115763P;

    /* renamed from: Q */
    private boolean f115764Q;

    /* renamed from: R */
    private boolean f115765R;

    /* renamed from: S */
    private boolean f115766S;

    /* renamed from: T */
    private long f115767T;

    /* renamed from: U */
    private boolean f115768U;

    /* renamed from: V */
    private boolean f115769V;

    /* renamed from: W */
    private boolean f115770W;

    /* renamed from: X */
    private g f115771X;

    /* renamed from: Y */
    private boolean f115772Y;

    /* renamed from: s */
    private final C1780l0 f115773s;

    /* renamed from: t */
    private final C25458j f115774t;

    /* renamed from: u */
    private SongData f115775u;

    /* renamed from: v */
    private boolean f115776v;

    /* renamed from: w */
    private ComposLyricStatus f115777w;

    /* renamed from: x */
    private final C1761c0 f115778x;

    /* renamed from: y */
    private final C1761c0 f115779y;

    /* renamed from: z */
    private final C1761c0 f115780z;

    /* renamed from: nr.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$a0 */
    /* loaded from: classes4.dex */
    public static final class a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f115781q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(boolean z11) {
            super(0);
            this.f115781q = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "tryAutoReplay - isForceStopAndReplay: " + this.f115781q;
        }
    }

    /* renamed from: nr.c$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$b0 */
    /* loaded from: classes4.dex */
    public static final class b0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115782t;

        /* renamed from: v */
        final /* synthetic */ boolean f115784v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f115784v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b0(this.f115784v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115782t == 0) {
                AbstractC24862s.m129228b(obj);
                C23930c.this.m125185P0(this.f115784v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.c$c */
    /* loaded from: classes4.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final StoryMusicAttachment f115785a;

        public c(StoryMusicAttachment storyMusicAttachment) {
            this.f115785a = storyMusicAttachment;
        }

        /* renamed from: a */
        public final StoryMusicAttachment m125250a() {
            return this.f115785a;
        }
    }

    /* renamed from: nr.c$c0 */
    /* loaded from: classes4.dex */
    static final class c0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c0 f115786q = new c0();

        c0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23924c mo12V4() {
            return C23924c.f115590a;
        }
    }

    /* renamed from: nr.c$d */
    /* loaded from: classes4.dex */
    public static final class d implements b {

        /* renamed from: a */
        private final String f115787a;

        /* renamed from: b */
        private final int f115788b;

        public d(String str, int i11) {
            AbstractC19074t.m100208f(str, "msg");
            this.f115787a = str;
            this.f115788b = i11;
        }

        /* renamed from: a */
        public final int m125252a() {
            return this.f115788b;
        }

        /* renamed from: b */
        public final String m125253b() {
            return this.f115787a;
        }
    }

    /* renamed from: nr.c$e */
    /* loaded from: classes4.dex */
    public static final class e implements b {

        /* renamed from: a */
        private final boolean f115789a;

        public e(boolean z11) {
            this.f115789a = z11;
        }

        /* renamed from: a */
        public final boolean m125254a() {
            return this.f115789a;
        }
    }

    /* renamed from: nr.c$f */
    /* loaded from: classes4.dex */
    public static final class f implements b {

        /* renamed from: a */
        private final String f115790a;

        /* renamed from: b */
        private final int f115791b;

        public f(String str, int i11) {
            AbstractC19074t.m100208f(str, "msg");
            this.f115790a = str;
            this.f115791b = i11;
        }

        /* renamed from: a */
        public final int m125255a() {
            return this.f115791b;
        }

        /* renamed from: b */
        public final String m125256b() {
            return this.f115790a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nr.c$g */
    /* loaded from: classes4.dex */
    public static final class g {

        /* renamed from: p */
        public static final g f115792p = new g("SEEKING", 0);

        /* renamed from: q */
        public static final g f115793q = new g("STOP_AND_REPLAY", 1);

        /* renamed from: r */
        private static final /* synthetic */ g[] f115794r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f115795s;

        static {
            g[] m125257b = m125257b();
            f115794r = m125257b;
            f115795s = AbstractC30166b.m148796a(m125257b);
        }

        private g(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ g[] m125257b() {
            return new g[]{f115792p, f115793q};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f115794r.clone();
        }
    }

    /* renamed from: nr.c$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC1754a {

        /* renamed from: d */
        private final C25458j f115796d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC17712d interfaceC17712d, Bundle bundle, C25458j c25458j) {
            super(interfaceC17712d, bundle);
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
            AbstractC19074t.m100208f(c25458j, "playSongUseCase");
            this.f115796d = c25458j;
        }

        @Override // androidx.lifecycle.AbstractC1754a
        /* renamed from: e */
        protected AbstractC1796t0 mo9255e(String str, Class cls, C1780l0 c1780l0) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(cls, "modelClass");
            AbstractC19074t.m100208f(c1780l0, "handle");
            if (cls.isAssignableFrom(C23930c.class)) {
                return new C23930c(c1780l0, this.f115796d);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC17712d interfaceC17712d, Bundle bundle) {
            this(interfaceC17712d, bundle, new C25458j(null, 1, null));
            AbstractC19074t.m100208f(interfaceC17712d, "owner");
        }
    }

    /* renamed from: nr.c$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f115797q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25455g mo12V4() {
            return new C25455g(null, null, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ int f115799r;

        /* renamed from: s */
        final /* synthetic */ int f115800s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11, int i12) {
            super(0);
            this.f115799r = i11;
            this.f115800s = i12;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "handleFadeOutSound - story duration: " + C23930c.this.f115762O + " - story elapse time: " + C23930c.this.f115767T + " - song duration: " + this.f115799r + " - song elapse time: " + this.f115800s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ long f115801q;

        /* renamed from: r */
        final /* synthetic */ C23930c f115802r;

        /* renamed from: s */
        final /* synthetic */ int f115803s;

        /* renamed from: t */
        final /* synthetic */ int f115804t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(long j11, C23930c c23930c, int i11, int i12) {
            super(0);
            this.f115801q = j11;
            this.f115802r = c23930c;
            this.f115803s = i11;
            this.f115804t = i12;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "handleRepeatSongWhenSongPlaying - story duration: " + this.f115801q + " - story elapse time: " + this.f115802r.f115767T + " - song duration: " + this.f115803s + " - song elapse time: " + this.f115804t;
        }
    }

    /* renamed from: nr.c$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f115805q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26359h mo12V4() {
            return C26359h.f125209a;
        }
    }

    /* renamed from: nr.c$m */
    /* loaded from: classes4.dex */
    public static final class m implements C25455g.a {

        /* renamed from: b */
        final /* synthetic */ StoryMusicAttachment f115807b;

        m(StoryMusicAttachment storyMusicAttachment) {
            this.f115807b = storyMusicAttachment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m125264g(C23930c c23930c, StoryMusicAttachment storyMusicAttachment, C24902e c24902e) {
            AbstractC19074t.m100208f(c23930c, "this$0");
            AbstractC19074t.m100208f(c24902e, "$song");
            c23930c.m125247s0().mo9224q(new C19964c(new c(storyMusicAttachment)));
            c23930c.m125235U0(c24902e.m129485a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m125265h(C23930c c23930c, StoryMusicAttachment storyMusicAttachment) {
            AbstractC19074t.m100208f(c23930c, "this$0");
            c23930c.m125247s0().mo9224q(new C19964c(new c(storyMusicAttachment)));
            c23930c.m125235U0(true);
        }

        @Override // p456qp.C25455g.a
        /* renamed from: a */
        public void mo104705a(C24903f c24903f) {
            AbstractC19074t.m100208f(c24903f, "streaming");
            C23930c.this.m125183O0(c24903f.m129502e());
        }

        @Override // p456qp.C25455g.a
        /* renamed from: b */
        public void mo104706b(C24898a c24898a) {
            AbstractC19074t.m100208f(c24898a, "lyric");
            final C23930c c23930c = C23930c.this;
            final StoryMusicAttachment storyMusicAttachment = this.f115807b;
            AbstractC19444a.m101694b(new Runnable() { // from class: nr.d
                @Override // java.lang.Runnable
                public final void run() {
                    C23930c.m.m125265h(C23930c.this, storyMusicAttachment);
                }
            }, 200L);
        }

        @Override // p456qp.C25455g.a
        /* renamed from: c */
        public void mo104707c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            if (AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p)) {
                C1761c0 m125247s0 = C23930c.this.m125247s0();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_song_not_found);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m125247s0.mo9224q(new C19964c(new f(m118743r0, AbstractC16803z.ic_story_music_error_general)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f46313p)) {
                C1761c0 m125247s02 = C23930c.this.m125247s0();
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_no_network);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m125247s02.mo9224q(new C19964c(new f(m118743r02, AbstractC16803z.ic_story_music_error_network)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionFetchMusicUnknown.f46307p)) {
                C1761c0 m125247s03 = C23930c.this.m125247s0();
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_song_load_failed);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                m125247s03.mo9224q(new C19964c(new f(m118743r03, AbstractC16803z.ic_story_music_error_general)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionMusicLocationNotSupported.f46311p)) {
                C1761c0 m125247s04 = C23930c.this.m125247s0();
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_music_location_not_supported_description);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                m125247s04.mo9224q(new C19964c(new d(m118743r04, AbstractC16803z.ic_story_music_error_general)));
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: d */
        public void mo104708d(final C24902e c24902e) {
            AbstractC19074t.m100208f(c24902e, "song");
            C23930c c23930c = C23930c.this;
            SongData m125244o0 = c23930c.m125244o0();
            m125244o0.m45168m(c24902e.m129490f());
            m125244o0.m45172q(c24902e.m129494j());
            m125244o0.m45173t(c24902e.m129492h() + " - " + c24902e.m129487c());
            m125244o0.m45170o(0);
            c23930c.m125237W0(m125244o0);
            C23930c c23930c2 = C23930c.this;
            ComposeSongStatus m125239g0 = c23930c2.m125239g0();
            m125239g0.m45966f(true);
            SongInfo m45965e = m125239g0.m45965e();
            if (m45965e != null) {
                m45965e.m45184f(c24902e.m129490f());
                m45965e.m45185g(c24902e.m129492h());
            } else {
                m45965e = new SongInfo(c24902e.m129490f(), c24902e.m129492h(), false, 4, null);
            }
            m125239g0.m45968h(m45965e);
            SongData m45964d = m125239g0.m45964d();
            if (m45964d != null) {
                m45964d.m45168m(c24902e.m129490f());
                m45964d.m45172q(c24902e.m129494j());
                m45964d.m45173t(c24902e.m129492h() + " - " + c24902e.m129487c());
                m45964d.m45171p(c24902e.m129492h());
                m45964d.m45167l(c24902e.m129487c());
                m45964d.m45170o(0);
            } else {
                m45964d = new SongData(c24902e.m129490f(), c24902e.m129494j(), c24902e.m129492h() + " - " + c24902e.m129487c(), null, c24902e.m129492h(), c24902e.m129487c(), false, 0, false, 328, null);
            }
            m125239g0.m45967g(m45964d);
            c23930c2.m125234T0(m125239g0);
            final C23930c c23930c3 = C23930c.this;
            final StoryMusicAttachment storyMusicAttachment = this.f115807b;
            AbstractC19444a.m101694b(new Runnable() { // from class: nr.e
                @Override // java.lang.Runnable
                public final void run() {
                    C23930c.m.m125264g(C23930c.this, storyMusicAttachment, c24902e);
                }
            }, 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final n f115808q = new n();

        n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "onEnterBackground";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final o f115809q = new o();

        o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "onEnterForeground";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18494a {
        p() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "onRemoveSong - hasSong: " + C23930c.this.m125239g0().m45963c();
        }
    }

    /* renamed from: nr.c$q */
    /* loaded from: classes4.dex */
    public static final class q implements C25455g.a {
        q() {
        }

        @Override // p456qp.C25455g.a
        /* renamed from: a */
        public void mo104705a(C24903f c24903f) {
            AbstractC19074t.m100208f(c24903f, "streaming");
            C23930c.this.m125183O0(c24903f.m129502e());
        }

        @Override // p456qp.C25455g.a
        /* renamed from: b */
        public void mo104706b(C24898a c24898a) {
            AbstractC19074t.m100208f(c24898a, "lyric");
            C23930c.this.m125235U0(true);
        }

        @Override // p456qp.C25455g.a
        /* renamed from: c */
        public void mo104707c(Exception exc) {
            AbstractC19074t.m100208f(exc, "exception");
            if (AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p)) {
                C1761c0 m125247s0 = C23930c.this.m125247s0();
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_song_not_found);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m125247s0.mo9224q(new C19964c(new f(m118743r0, AbstractC16803z.ic_story_music_error_general)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionNoNetwork.f46313p)) {
                C1761c0 m125247s02 = C23930c.this.m125247s0();
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_no_network);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m125247s02.mo9224q(new C19964c(new f(m118743r02, AbstractC16803z.ic_story_music_error_network)));
                return;
            }
            if (AbstractC19074t.m100204b(exc, ExceptionFetchMusicUnknown.f46307p) || AbstractC19074t.m100204b(exc, ExceptionMusicLocationNotSupported.f46311p)) {
                C1761c0 m125247s03 = C23930c.this.m125247s0();
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_song_load_failed);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                m125247s03.mo9224q(new C19964c(new f(m118743r03, AbstractC16803z.ic_story_music_error_general)));
            }
        }

        @Override // p456qp.C25455g.a
        /* renamed from: d */
        public void mo104708d(C24902e c24902e) {
            AbstractC19074t.m100208f(c24902e, "song");
            C23930c.this.m125247s0().mo9224q(new C19964c(new e(true)));
            C23930c c23930c = C23930c.this;
            SongData m125244o0 = c23930c.m125244o0();
            m125244o0.m45168m(c24902e.m129490f());
            m125244o0.m45172q(c24902e.m129494j());
            m125244o0.m45173t(c24902e.m129492h() + " - " + c24902e.m129487c());
            m125244o0.m45170o(0);
            c23930c.m125237W0(m125244o0);
            C23930c c23930c2 = C23930c.this;
            ComposeSongStatus m125239g0 = c23930c2.m125239g0();
            m125239g0.m45966f(true);
            SongInfo m45965e = m125239g0.m45965e();
            if (m45965e != null) {
                m45965e.m45184f(c24902e.m129490f());
                m45965e.m45185g(c24902e.m129492h());
            } else {
                m45965e = new SongInfo(c24902e.m129490f(), c24902e.m129492h(), false, 4, null);
            }
            m125239g0.m45968h(m45965e);
            SongData m45964d = m125239g0.m45964d();
            if (m45964d != null) {
                m45964d.m45168m(c24902e.m129490f());
                m45964d.m45172q(c24902e.m129494j());
                m45964d.m45173t(c24902e.m129492h() + " - " + c24902e.m129487c());
                m45964d.m45171p(c24902e.m129492h());
                m45964d.m45167l(c24902e.m129487c());
                m45964d.m45170o(0);
            } else {
                m45964d = new SongData(c24902e.m129490f(), c24902e.m129494j(), c24902e.m129492h() + " - " + c24902e.m129487c(), null, c24902e.m129492h(), c24902e.m129487c(), false, 0, false, 328, null);
            }
            m125239g0.m45967g(m45964d);
            c23930c2.m125234T0(m125239g0);
            C23930c.this.m125235U0(c24902e.m129485a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC19075u implements InterfaceC18494a {
        r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "onStoryRepeatPlaying - story duration: " + C23930c.this.f115762O + " - story elapse time: " + C23930c.this.f115767T;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f115813q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(0);
            this.f115813q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "playSong - idSong:" + this.f115813q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115814t;

        /* renamed from: u */
        private /* synthetic */ Object f115815u;

        /* renamed from: w */
        final /* synthetic */ String f115817w;

        /* renamed from: nr.c$t$a */
        /* loaded from: classes4.dex */
        public static final class a implements C25458j.a {

            /* renamed from: a */
            final /* synthetic */ C23930c f115818a;

            /* renamed from: b */
            final /* synthetic */ String f115819b;

            /* renamed from: nr.c$t$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            static final class C32910a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115820t;

                /* renamed from: u */
                final /* synthetic */ C23930c f115821u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32910a(C23930c c23930c, Continuation continuation) {
                    super(2, continuation);
                    this.f115821u = c23930c;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32910a(this.f115821u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f115820t;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        this.f115821u.f115771X = g.f115793q;
                        this.f115820t = 1;
                        if (DelayKt.m112666b(500L, this) == m142578e) {
                            return m142578e;
                        }
                    }
                    this.f115821u.m125203b1(true);
                    return C24848g0.f119245a;
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32910a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: nr.c$t$a$b */
            /* loaded from: classes4.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115822t;

                /* renamed from: u */
                final /* synthetic */ C23930c f115823u;

                /* renamed from: v */
                final /* synthetic */ LyricRender f115824v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C23930c c23930c, LyricRender lyricRender, Continuation continuation) {
                    super(2, continuation);
                    this.f115823u = c23930c;
                    this.f115824v = lyricRender;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f115823u, this.f115824v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115822t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115823u.m125236V0(this.f115824v);
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

            /* renamed from: nr.c$t$a$c */
            /* loaded from: classes4.dex */
            static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115825t;

                /* renamed from: u */
                final /* synthetic */ Exception f115826u;

                /* renamed from: v */
                final /* synthetic */ C23930c f115827v;

                /* renamed from: w */
                final /* synthetic */ String f115828w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(Exception exc, C23930c c23930c, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f115826u = exc;
                    this.f115827v = c23930c;
                    this.f115828w = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f115826u, this.f115827v, this.f115828w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115825t == 0) {
                        AbstractC24862s.m129228b(obj);
                        Exception exc = this.f115826u;
                        if (AbstractC19074t.m100204b(exc, ExceptionMusicStreaming.f46312p)) {
                            this.f115827v.m125204c0();
                            this.f115827v.f115766S = true;
                            C1761c0 m125247s0 = this.f115827v.m125247s0();
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_music_download_song_error);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            m125247s0.mo9224q(new C19964c(new f(m118743r0, AbstractC16803z.ic_story_music_error_general)));
                        } else if (AbstractC19074t.m100204b(exc, ExceptionInCall.f46308p)) {
                            this.f115827v.m125227G0();
                            C1761c0 m125247s02 = this.f115827v.m125247s0();
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_music_error_in_call);
                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                            m125247s02.mo9224q(new C19964c(new f(m118743r02, AbstractC16803z.ic_story_music_error_general)));
                            return C24848g0.f119245a;
                        }
                        C23930c.m125208e1(this.f115827v, this.f115828w, false, 0, false, 4, null);
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

            /* renamed from: nr.c$t$a$d */
            /* loaded from: classes4.dex */
            static final class d extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115829t;

                /* renamed from: u */
                final /* synthetic */ C23930c f115830u;

                /* renamed from: v */
                final /* synthetic */ String f115831v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C23930c c23930c, String str, Continuation continuation) {
                    super(2, continuation);
                    this.f115830u = c23930c;
                    this.f115831v = str;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new d(this.f115830u, this.f115831v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115829t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C23930c c23930c = this.f115830u;
                        c23930c.m125235U0(c23930c.m125240i0());
                        C23930c.m125208e1(this.f115830u, this.f115831v, false, 0, true, 4, null);
                        this.f115830u.f115769V = false;
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

            /* renamed from: nr.c$t$a$e */
            /* loaded from: classes4.dex */
            static final class e extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115832t;

                /* renamed from: u */
                final /* synthetic */ C23930c f115833u;

                /* renamed from: v */
                final /* synthetic */ C24903f f115834v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(C23930c c23930c, C24903f c24903f, Continuation continuation) {
                    super(2, continuation);
                    this.f115833u = c23930c;
                    this.f115834v = c24903f;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new e(this.f115833u, this.f115834v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115832t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115833u.m125206d1(this.f115834v.m129502e(), true, 0, false);
                        this.f115833u.m125201a1(this.f115834v.m129501d());
                        this.f115833u.m125209f0();
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

            /* renamed from: nr.c$t$a$f */
            /* loaded from: classes4.dex */
            static final class f extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115835t;

                /* renamed from: u */
                final /* synthetic */ int f115836u;

                /* renamed from: v */
                final /* synthetic */ C23930c f115837v;

                /* renamed from: w */
                final /* synthetic */ int f115838w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(int i11, C23930c c23930c, int i12, Continuation continuation) {
                    super(2, continuation);
                    this.f115836u = i11;
                    this.f115837v = c23930c;
                    this.f115838w = i12;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new f(this.f115836u, this.f115837v, this.f115838w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115835t == 0) {
                        AbstractC24862s.m129228b(obj);
                        if (this.f115836u == 0) {
                            this.f115837v.f115768U = false;
                        }
                        if (this.f115837v.f115762O > 0) {
                            this.f115837v.m125215u0(this.f115836u, this.f115838w);
                            C23930c c23930c = this.f115837v;
                            c23930c.m125216v0(this.f115836u, this.f115838w, c23930c.f115762O);
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

            /* renamed from: nr.c$t$a$g */
            /* loaded from: classes4.dex */
            static final class g extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115839t;

                /* renamed from: u */
                final /* synthetic */ C23930c f115840u;

                /* renamed from: v */
                final /* synthetic */ C24903f f115841v;

                /* renamed from: w */
                final /* synthetic */ int f115842w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(C23930c c23930c, C24903f c24903f, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f115840u = c23930c;
                    this.f115841v = c24903f;
                    this.f115842w = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new g(this.f115840u, this.f115841v, this.f115842w, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115839t == 0) {
                        AbstractC24862s.m129228b(obj);
                        this.f115840u.m125206d1(this.f115841v.m129502e(), true, this.f115842w, false);
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

            /* renamed from: nr.c$t$a$h */
            /* loaded from: classes4.dex */
            static final class h extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f115843t;

                /* renamed from: u */
                final /* synthetic */ C23930c f115844u;

                /* renamed from: v */
                final /* synthetic */ C24903f f115845v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(C23930c c23930c, C24903f c24903f, Continuation continuation) {
                    super(2, continuation);
                    this.f115844u = c23930c;
                    this.f115845v = c24903f;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new h(this.f115844u, this.f115845v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f115843t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C23930c.m125208e1(this.f115844u, this.f115845v.m129502e(), false, 0, false, 4, null);
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

            a(C23930c c23930c, String str) {
                this.f115818a = c23930c;
                this.f115819b = str;
            }

            @Override // p456qp.C25458j.a
            /* renamed from: a */
            public void mo104656a(Exception exc) {
                AbstractC19074t.m100208f(exc, "exception");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), null, null, new c(exc, this.f115818a, this.f115819b, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: b */
            public void mo104657b(String str) {
                AbstractC19074t.m100208f(str, "idSong");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), null, null, new d(this.f115818a, str, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: c */
            public void mo104658c(C24903f c24903f, int i11, int i12) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), Dispatchers.m112681c(), null, new f(i11, this.f115818a, i12, null), 2, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: d */
            public void mo104659d(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), null, null, new e(this.f115818a, c24903f, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: e */
            public void mo104660e(C24903f c24903f, int i11) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), null, null, new g(this.f115818a, c24903f, i11, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: f */
            public void mo104661f(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), null, null, new C32910a(this.f115818a, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            /* renamed from: g */
            public void mo104662g(C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), null, null, new h(this.f115818a, c24903f, null), 3, null);
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
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f115818a), null, null, new b(this.f115818a, lyricRender, null), 3, null);
            }

            @Override // p456qp.C25458j.a
            public void onAudioFocusChange(int i11) {
                C25458j.a.C32958a.m131873a(this, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, Continuation continuation) {
            super(2, continuation);
            this.f115817w = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            t tVar = new t(this.f115817w, continuation);
            tVar.f115815u = obj;
            return tVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115814t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (CoroutineScopeKt.m112642f((CoroutineScope) this.f115815u)) {
                    C23930c.this.m125204c0();
                    C23930c.this.f115768U = false;
                    C23930c.this.f115766S = false;
                    C25458j c25458j = C23930c.this.f115774t;
                    C25458j.b bVar = new C25458j.b(this.f115817w, false, false, null, true, 0, new a(C23930c.this, this.f115817w), 40, null);
                    this.f115814t = 1;
                    if (c25458j.m101507a(bVar, this) == m142578e) {
                        return m142578e;
                    }
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
    /* renamed from: nr.c$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final u f115846q = new u();

        u() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "repeatSongFromBeginningWithStopAndReplay";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$v */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115847t;

        v(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new v(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115847t;
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
                C25459k c25459k = new C25459k(null, 1, null);
                C25459k.a aVar = new C25459k.a(C23930c.this.m125244o0().m45160e());
                this.f115847t = 1;
                obj = c25459k.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                this.f115847t = 2;
                if (FlowKt.m113291i(flow, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((v) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.c$w */
    /* loaded from: classes4.dex */
    static final class w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final w f115849q = new w();

        w() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C25461m mo12V4() {
            return new C25461m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$x */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final x f115850q = new x();

        x() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "stopSong";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nr.c$y */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115851t;

        /* renamed from: u */
        private /* synthetic */ Object f115852u;

        /* renamed from: w */
        final /* synthetic */ boolean f115854w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f115854w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            y yVar = new y(this.f115854w, continuation);
            yVar.f115852u = obj;
            return yVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115851t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (CoroutineScopeKt.m112642f((CoroutineScope) this.f115852u)) {
                    C25458j c25458j = C23930c.this.f115774t;
                    this.f115851t = 1;
                    if (c25458j.m131868c(this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
            new C25464p().m101508a(new C25464p.b(this.f115854w, null, 2, null));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((y) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nr.c$z */
    /* loaded from: classes4.dex */
    static final class z extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final z f115855q = new z();

        z() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21344b mo12V4() {
            return new C21344b();
        }
    }

    public C23930c(C1780l0 c1780l0, C25458j c25458j) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(c1780l0, "savedStateHandle");
        AbstractC19074t.m100208f(c25458j, "playSongLyricUseCase");
        this.f115773s = c1780l0;
        this.f115774t = c25458j;
        this.f115775u = new SongData("", null, null, null, null, null, false, 0, false, 510, null);
        this.f115776v = C22640a.f111031a.m117212c();
        this.f115777w = new ComposLyricStatus(m125240i0(), this.f115776v);
        this.f115778x = new C1761c0(this.f115775u);
        this.f115779y = new C1761c0(this.f115777w);
        this.f115780z = new C1761c0(m125242l0());
        this.f115748A = new C1761c0(m125239g0());
        this.f115749B = new C1761c0(Boolean.TRUE);
        this.f115750C = new C1761c0();
        m129210a = AbstractC24856m.m129210a(i.f115797q);
        this.f115751D = m129210a;
        m129210a2 = AbstractC24856m.m129210a(w.f115849q);
        this.f115752E = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c0.f115786q);
        this.f115753F = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(z.f115855q);
        this.f115754G = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(l.f115805q);
        this.f115755H = m129210a5;
        this.f115756I = true;
        this.f115762O = -1L;
        this.f115763P = true;
        this.f115764Q = true;
        this.f115771X = g.f115792p;
    }

    /* renamed from: L0 */
    private final void m125179L0() {
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", new r());
        if (m125239g0().m45963c()) {
            m125203b1(!this.f115775u.m45166k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public final void m125183O0(String str) {
        Job m112540d;
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", new s(str));
        Job job = this.f115760M;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new t(str, null), 3, null);
        this.f115759L = m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public final void m125185P0(boolean z11) {
        if (!z11 && !m125219y0()) {
            m125187Q0();
        } else {
            m125189R0();
        }
    }

    /* renamed from: Q0 */
    private final void m125187Q0() {
        this.f115768U = true;
        m125212n0().m101508a(new C25461m.a(0));
        m125207e0();
        m125214t0().mo125050b(1.0f);
    }

    /* renamed from: R0 */
    private final void m125189R0() {
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", u.f115846q);
        this.f115769V = true;
        m125199Z0(this, false, 1, null);
        m125207e0();
        m125183O0(this.f115775u.m45160e());
    }

    /* renamed from: Y0 */
    private final void m125197Y0(boolean z11) {
        Job m112540d;
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", x.f115850q);
        m125204c0();
        Job job = this.f115759L;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new y(z11, null), 3, null);
        this.f115760M = m112540d;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m125199Z0(C23930c c23930c, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c23930c.m125197Y0(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public final void m125201a1(int i11) {
        if (m125220z0() && !this.f115765R) {
            m125213r0().m110555c(0, i11, (int) this.f115767T);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public final void m125203b1(boolean z11) {
        Job m112540d;
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", new a0(z11));
        Job job = this.f115758K;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        if (this.f115756I) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b0(z11, null), 3, null);
            this.f115758K = m112540d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public final void m125204c0() {
        Job job = this.f115758K;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        this.f115756I = false;
    }

    /* renamed from: c1 */
    static /* synthetic */ void m125205c1(C23930c c23930c, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c23930c.m125203b1(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public final void m125206d1(String str, boolean z11, int i11, boolean z12) {
        SongData m45157a;
        m45157a = r1.m45157a((r20 & 1) != 0 ? r1.f45978p : str, (r20 & 2) != 0 ? r1.f45979q : null, (r20 & 4) != 0 ? r1.f45980r : null, (r20 & 8) != 0 ? r1.f45981s : null, (r20 & 16) != 0 ? r1.f45982t : null, (r20 & 32) != 0 ? r1.f45983u : null, (r20 & 64) != 0 ? r1.f45984v : z11, (r20 & 128) != 0 ? r1.f45985w : i11, (r20 & 256) != 0 ? this.f115775u.f45986x : z12);
        m125237W0(m45157a);
    }

    /* renamed from: e0 */
    private final void m125207e0() {
        m125214t0().mo125051c();
        this.f115772Y = false;
    }

    /* renamed from: e1 */
    static /* synthetic */ void m125208e1(C23930c c23930c, String str, boolean z11, int i11, boolean z12, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        c23930c.m125206d1(str, z11, i11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final void m125209f0() {
        this.f115756I = true;
    }

    /* renamed from: h0 */
    private final C25455g m125210h0() {
        return (C25455g) this.f115751D.getValue();
    }

    /* renamed from: j0 */
    private final InterfaceC26357f m125211j0() {
        return (InterfaceC26357f) this.f115755H.getValue();
    }

    /* renamed from: n0 */
    private final C25461m m125212n0() {
        return (C25461m) this.f115752E.getValue();
    }

    /* renamed from: r0 */
    private final C21344b m125213r0() {
        return (C21344b) this.f115754G.getValue();
    }

    /* renamed from: t0 */
    private final InterfaceC23925d m125214t0() {
        return (InterfaceC23925d) this.f115753F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public final void m125215u0(int i11, int i12) {
        if (!this.f115772Y && this.f115763P && !m125217w0() && i12 > 2000) {
            if (i11 >= this.f115762O - ZAbstractBase.ZVU_PROCESS_FLUSH || i11 > i12 - 2000) {
                m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", new j(i12, i11));
                m125214t0().mo125049a();
                this.f115772Y = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public final void m125216v0(int i11, int i12, long j11) {
        if ((this.f115764Q && m125218x0() && i11 >= i12 - 100) || ((m125219y0() && i11 >= i12) || (i11 >= j11 && !m125220z0()))) {
            m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", new k(j11, this, i12, i11));
            m125205c1(this, false, 1, null);
        }
    }

    /* renamed from: w0 */
    private final boolean m125217w0() {
        return this.f115768U || this.f115769V;
    }

    /* renamed from: x0 */
    private final boolean m125218x0() {
        if (this.f115771X == g.f115792p) {
            return true;
        }
        return false;
    }

    /* renamed from: y0 */
    private final boolean m125219y0() {
        if (this.f115771X == g.f115793q) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    private final boolean m125220z0() {
        return this.f115761N == 2;
    }

    /* renamed from: A0 */
    public final void m125221A0() {
        String str;
        if (m125239g0().m45963c()) {
            C23648e m154346U = C32017m4.m154326S().m154346U(C32002l4.Companion.m154287a(7).m154284u(85));
            if (m154346U != null) {
                String[] m123919l = m154346U.m123919l();
                SongInfo m45965e = m125239g0().m45965e();
                if (m45965e != null) {
                    str = m45965e.m45183e();
                } else {
                    str = null;
                }
                m123919l[0] = str;
            }
            C0815e1.m2075D().m2100V(m154346U, false);
        }
    }

    /* renamed from: B0 */
    public final void m125222B0(String str, StoryMusicAttachment storyMusicAttachment) {
        AbstractC19074t.m100208f(str, "idSong");
        m125236V0(LyricRender.Companion.m45718c());
        m125210h0().m101508a(new C25455g.b(str, AbstractC1798u0.m9374a(this), new m(storyMusicAttachment)));
    }

    /* renamed from: C0 */
    public final void m125223C0() {
        if (this.f115757J) {
            this.f115757J = false;
            SongInfo m45965e = m125239g0().m45965e();
            if (m45965e != null) {
                m125183O0(m45965e.m45182d());
            }
        }
    }

    /* renamed from: D0 */
    public final void m125224D0() {
        this.f115757J = true;
        m125199Z0(this, false, 1, null);
    }

    /* renamed from: E0 */
    public final void m125225E0() {
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", n.f115808q);
        m125204c0();
        m125199Z0(this, false, 1, null);
    }

    /* renamed from: F0 */
    public final void m125226F0() {
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", o.f115809q);
        if (m125239g0().m45963c() && !this.f115766S) {
            m125209f0();
            if (!C7853b.Companion.m40150a().m40137k0()) {
                m125203b1(true);
            }
        }
    }

    /* renamed from: G0 */
    public final void m125227G0() {
        m125211j0().mo135685a("FEED_MUSIC", "VIEW_MODEL_STORY_POST", new p());
        if (m125239g0().m45963c()) {
            m125234T0(new ComposeSongStatus(false, null, null));
            this.f115750C.mo9224q(new C19964c(new e(false)));
            m125208e1(this, "", false, 0, false, 14, null);
            m125199Z0(this, false, 1, null);
        }
    }

    /* renamed from: I0 */
    public final void m125228I0(boolean z11) {
        this.f115765R = z11;
        if (z11) {
            this.f115764Q = false;
            this.f115763P = false;
        } else {
            this.f115764Q = true;
            this.f115763P = true;
        }
        m125203b1(true);
    }

    /* renamed from: J0 */
    public final void m125229J0(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "idSong");
        if (m125239g0().m45963c()) {
            C23648e m154346U = C32017m4.m154326S().m154346U(C32002l4.Companion.m154287a(7).m154284u(84));
            if (m154346U != null) {
                String[] m123919l = m154346U.m123919l();
                SongInfo m45965e = m125239g0().m45965e();
                if (m45965e != null) {
                    str2 = m45965e.m45183e();
                } else {
                    str2 = null;
                }
                m123919l[0] = str2;
            }
            C0815e1.m2075D().m2100V(m154346U, false);
        }
        m125236V0(LyricRender.Companion.m45718c());
        m125210h0().m101508a(new C25455g.b(str, AbstractC1798u0.m9374a(this), new q()));
    }

    /* renamed from: K0 */
    public final void m125230K0(long j11) {
        this.f115767T = j11;
        if (j11 == 0 && !this.f115765R) {
            m125179L0();
            return;
        }
        if (this.f115765R) {
            if (this.f115762O - j11 < 500 && this.f115770W) {
                this.f115770W = false;
                m125179L0();
            } else if (j11 < 500) {
                this.f115770W = true;
            }
        }
    }

    /* renamed from: M0 */
    public final void m125231M0(int i11, long j11) {
        this.f115761N = i11;
        this.f115762O = j11;
    }

    /* renamed from: N0 */
    public final void m125232N0(float f11) {
        if (f11 == 1.0f) {
            this.f115764Q = true;
            this.f115763P = true;
        } else {
            this.f115764Q = false;
            this.f115763P = false;
        }
    }

    /* renamed from: S0 */
    public final void m125233S0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new v(null), 3, null);
    }

    /* renamed from: T0 */
    public final void m125234T0(ComposeSongStatus composeSongStatus) {
        AbstractC19074t.m100208f(composeSongStatus, "value");
        this.f115773s.m9321g("COMPOSE_SONG_STATUS_SAVED_KEY", composeSongStatus);
        this.f115748A.mo9224q(composeSongStatus);
    }

    /* renamed from: U0 */
    public final void m125235U0(boolean z11) {
        this.f115773s.m9321g("HAS_LYRIC_SAVED_KEY", Boolean.valueOf(z11));
        m125238X0(new ComposLyricStatus(m125240i0(), this.f115776v));
    }

    /* renamed from: V0 */
    public final void m125236V0(LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "value");
        this.f115773s.m9321g("LYRIC_RENDER_SAVED_KEY", lyricRender);
        this.f115780z.mo9224q(lyricRender);
    }

    /* renamed from: W0 */
    public final void m125237W0(SongData songData) {
        AbstractC19074t.m100208f(songData, "value");
        this.f115775u = songData;
        this.f115778x.mo9224q(songData);
    }

    /* renamed from: X0 */
    public final void m125238X0(ComposLyricStatus composLyricStatus) {
        AbstractC19074t.m100208f(composLyricStatus, "value");
        this.f115777w = composLyricStatus;
        this.f115779y.mo9224q(composLyricStatus);
    }

    /* renamed from: g0 */
    public final ComposeSongStatus m125239g0() {
        ComposeSongStatus composeSongStatus = (ComposeSongStatus) this.f115773s.m9318c("COMPOSE_SONG_STATUS_SAVED_KEY");
        if (composeSongStatus == null) {
            return new ComposeSongStatus(false, null, null, 7, null);
        }
        return composeSongStatus;
    }

    /* renamed from: i0 */
    public final boolean m125240i0() {
        Boolean bool = (Boolean) this.f115773s.m9318c("HAS_LYRIC_SAVED_KEY");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: k0 */
    public final C1761c0 m125241k0() {
        return this.f115780z;
    }

    /* renamed from: l0 */
    public final LyricRender m125242l0() {
        LyricRender lyricRender = (LyricRender) this.f115773s.m9318c("LYRIC_RENDER_SAVED_KEY");
        if (lyricRender == null) {
            return new LyricRender(null, null, null, false, false, 31, null);
        }
        return lyricRender;
    }

    /* renamed from: m0 */
    public final C1761c0 m125243m0() {
        return this.f115779y;
    }

    /* renamed from: o0 */
    public final SongData m125244o0() {
        return this.f115775u;
    }

    /* renamed from: p0 */
    public final C1761c0 m125245p0() {
        return this.f115778x;
    }

    /* renamed from: q0 */
    public final C1761c0 m125246q0() {
        return this.f115748A;
    }

    /* renamed from: s0 */
    public final C1761c0 m125247s0() {
        return this.f115750C;
    }
}
