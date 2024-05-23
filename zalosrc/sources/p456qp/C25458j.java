package p456qp;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.domain.entity.Sentence;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import me0.C23055e5;
import p185gc.AbstractC19382f;
import p399op.C24405q;
import p426pp.C24898a;
import p426pp.C24902e;
import p426pp.C24903f;
import p456qp.C25451c;
import p458qr.C25480m;
import p458qr.InterfaceC25486s;
import p509sp.C26359h;
import p509sp.C26361j;
import p509sp.C26364m;
import p509sp.InterfaceC26353b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.j */
/* loaded from: classes4.dex */
public final class C25458j extends AbstractC19382f {

    /* renamed from: a */
    private final InterfaceC25486s f121934a;

    /* renamed from: b */
    private Job f121935b;

    /* renamed from: c */
    private C24898a f121936c;

    /* renamed from: qp.j$a */
    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: qp.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C32958a {
            /* renamed from: a */
            public static void m131873a(a aVar, int i11) {
            }

            /* renamed from: b */
            public static void m131874b(a aVar, C24903f c24903f) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
            }

            /* renamed from: c */
            public static void m131875c(a aVar, C24903f c24903f, LyricRender lyricRender) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
                AbstractC19074t.m100208f(lyricRender, "lyricRender");
            }

            /* renamed from: d */
            public static void m131876d(a aVar, String str) {
                AbstractC19074t.m100208f(str, "idSong");
            }

            /* renamed from: e */
            public static void m131877e(a aVar, C24903f c24903f, int i11, int i12) {
                AbstractC19074t.m100208f(c24903f, "songStreaming");
            }

            /* renamed from: f */
            public static void m131878f(a aVar, C24902e c24902e) {
                AbstractC19074t.m100208f(c24902e, "songContent");
            }
        }

        /* renamed from: a */
        void mo104656a(Exception exc);

        /* renamed from: b */
        void mo104657b(String str);

        /* renamed from: c */
        void mo104658c(C24903f c24903f, int i11, int i12);

        /* renamed from: d */
        void mo104659d(C24903f c24903f);

        /* renamed from: e */
        void mo104660e(C24903f c24903f, int i11);

        /* renamed from: f */
        void mo104661f(C24903f c24903f);

        /* renamed from: g */
        void mo104662g(C24903f c24903f);

        /* renamed from: h */
        void mo104663h(C24902e c24902e);

        /* renamed from: i */
        void mo104664i(C24903f c24903f, LyricRender lyricRender);

        void onAudioFocusChange(int i11);
    }

    /* renamed from: qp.j$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f121937a;

        /* renamed from: b */
        private final boolean f121938b;

        /* renamed from: c */
        private final boolean f121939c;

        /* renamed from: d */
        private final InterfaceC26353b f121940d;

        /* renamed from: e */
        private final boolean f121941e;

        /* renamed from: f */
        private final int f121942f;

        /* renamed from: g */
        private final a f121943g;

        public b(String str, boolean z11, boolean z12, InterfaceC26353b interfaceC26353b, boolean z13, int i11, a aVar) {
            AbstractC19074t.m100208f(str, "idSong");
            this.f121937a = str;
            this.f121938b = z11;
            this.f121939c = z12;
            this.f121940d = interfaceC26353b;
            this.f121941e = z13;
            this.f121942f = i11;
            this.f121943g = aVar;
        }

        /* renamed from: a */
        public final a m131879a() {
            return this.f121943g;
        }

        /* renamed from: b */
        public final boolean m131880b() {
            return this.f121941e;
        }

        /* renamed from: c */
        public final String m131881c() {
            return this.f121937a;
        }

        /* renamed from: d */
        public final InterfaceC26353b m131882d() {
            return this.f121940d;
        }

        /* renamed from: e */
        public final int m131883e() {
            return this.f121942f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f121937a, bVar.f121937a) && this.f121938b == bVar.f121938b && this.f121939c == bVar.f121939c && AbstractC19074t.m100204b(this.f121940d, bVar.f121940d) && this.f121941e == bVar.f121941e && this.f121942f == bVar.f121942f && AbstractC19074t.m100204b(this.f121943g, bVar.f121943g);
        }

        /* renamed from: f */
        public final boolean m131884f() {
            return this.f121939c;
        }

        /* renamed from: g */
        public final boolean m131885g() {
            return this.f121938b;
        }

        public int hashCode() {
            int hashCode = ((((this.f121937a.hashCode() * 31) + AbstractC2144f.m11520a(this.f121938b)) * 31) + AbstractC2144f.m11520a(this.f121939c)) * 31;
            InterfaceC26353b interfaceC26353b = this.f121940d;
            int hashCode2 = (((((hashCode + (interfaceC26353b == null ? 0 : interfaceC26353b.hashCode())) * 31) + AbstractC2144f.m11520a(this.f121941e)) * 31) + this.f121942f) * 31;
            a aVar = this.f121943g;
            return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        public String toString() {
            return "Param(idSong=" + this.f121937a + ", isIncreaseSound=" + this.f121938b + ", useShareSpeakerConfig=" + this.f121939c + ", playSoundConfig=" + this.f121940d + ", enableLyric=" + this.f121941e + ", timeToPlay=" + this.f121942f + ", callback=" + this.f121943g + ")";
        }

        public /* synthetic */ b(String str, boolean z11, boolean z12, InterfaceC26353b interfaceC26353b, boolean z13, int i11, a aVar, int i12, AbstractC19060k abstractC19060k) {
            this(str, (i12 & 2) != 0 ? true : z11, (i12 & 4) == 0 ? z12 : true, (i12 & 8) != 0 ? null : interfaceC26353b, (i12 & 16) != 0 ? false : z13, (i12 & 32) == 0 ? i11 : 0, (i12 & 64) == 0 ? aVar : null);
        }
    }

    /* renamed from: qp.j$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ a f121944q;

        /* renamed from: r */
        final /* synthetic */ b f121945r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, a aVar, b bVar) {
            super(key);
            this.f121944q = aVar;
            this.f121945r = bVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            Exception exc;
            C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new f(this.f121945r, th2));
            a aVar = this.f121944q;
            if (aVar != null) {
                if (th2 instanceof Exception) {
                    exc = (Exception) th2;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    exc = new Exception();
                }
                aVar.mo104656a(exc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.j$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ b f121946q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.f121946q = bVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "params " + this.f121946q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.j$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ long f121947A;

        /* renamed from: B */
        final /* synthetic */ boolean f121948B;

        /* renamed from: C */
        final /* synthetic */ boolean f121949C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC26353b f121950D;

        /* renamed from: E */
        final /* synthetic */ int f121951E;

        /* renamed from: t */
        Object f121952t;

        /* renamed from: u */
        int f121953u;

        /* renamed from: v */
        private /* synthetic */ Object f121954v;

        /* renamed from: w */
        final /* synthetic */ b f121955w;

        /* renamed from: x */
        final /* synthetic */ a f121956x;

        /* renamed from: y */
        final /* synthetic */ CoroutineExceptionHandler f121957y;

        /* renamed from: z */
        final /* synthetic */ C25458j f121958z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.j$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ b f121959q;

            /* renamed from: r */
            final /* synthetic */ C24902e f121960r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, C24902e c24902e) {
                super(0);
                this.f121959q = bVar;
                this.f121960r = c24902e;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "song " + this.f121959q.m131881c() + " songContent " + this.f121960r;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.j$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ b f121961q;

            /* renamed from: r */
            final /* synthetic */ C24903f f121962r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b bVar, C24903f c24903f) {
                super(0);
                this.f121961q = bVar;
                this.f121962r = c24903f;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "song " + this.f121961q.m131881c() + " songStreaming " + this.f121962r;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.j$e$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f121963t;

            /* renamed from: u */
            int f121964u;

            /* renamed from: v */
            final /* synthetic */ C25458j f121965v;

            /* renamed from: w */
            final /* synthetic */ C24902e f121966w;

            /* renamed from: x */
            final /* synthetic */ b f121967x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qp.j$e$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ b f121968q;

                /* renamed from: r */
                final /* synthetic */ C25458j f121969r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(b bVar, C25458j c25458j) {
                    super(0);
                    this.f121968q = bVar;
                    this.f121969r = c25458j;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "song " + this.f121968q.m131881c() + " lyric " + this.f121969r.m131870e();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C25458j c25458j, C24902e c24902e, b bVar, Continuation continuation) {
                super(2, continuation);
                this.f121965v = c25458j;
                this.f121966w = c24902e;
                this.f121967x = bVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f121965v, this.f121966w, this.f121967x, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C25458j c25458j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f121964u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        c25458j = (C25458j) this.f121963t;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25458j c25458j2 = this.f121965v;
                    C24405q m127651a = C24405q.Companion.m127651a();
                    C24902e c24902e = this.f121966w;
                    this.f121963t = c25458j2;
                    this.f121964u = 1;
                    Object m127647v = m127651a.m127647v(c24902e, this);
                    if (m127647v == m142578e) {
                        return m142578e;
                    }
                    c25458j = c25458j2;
                    obj = m127647v;
                }
                c25458j.m131872g((C24898a) obj);
                C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new a(this.f121967x, this.f121965v));
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.j$e$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ long f121970A;

            /* renamed from: B */
            final /* synthetic */ boolean f121971B;

            /* renamed from: C */
            final /* synthetic */ boolean f121972C;

            /* renamed from: D */
            final /* synthetic */ InterfaceC26353b f121973D;

            /* renamed from: E */
            final /* synthetic */ int f121974E;

            /* renamed from: t */
            Object f121975t;

            /* renamed from: u */
            int f121976u;

            /* renamed from: v */
            private /* synthetic */ Object f121977v;

            /* renamed from: w */
            final /* synthetic */ a f121978w;

            /* renamed from: x */
            final /* synthetic */ C24903f f121979x;

            /* renamed from: y */
            final /* synthetic */ b f121980y;

            /* renamed from: z */
            final /* synthetic */ C25458j f121981z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qp.j$e$d$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f121982t;

                a(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new a(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f121982t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C25451c.f121865a.m131824n();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qp.j$e$d$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ b f121983q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(b bVar) {
                    super(0);
                    this.f121983q = bVar;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "song " + this.f121983q.m131881c() + " start";
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qp.j$e$d$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f121984t;

                /* renamed from: u */
                final /* synthetic */ C24903f f121985u;

                /* renamed from: v */
                final /* synthetic */ boolean f121986v;

                /* renamed from: w */
                final /* synthetic */ boolean f121987w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC26353b f121988x;

                /* renamed from: y */
                final /* synthetic */ int f121989y;

                /* renamed from: z */
                final /* synthetic */ C32959d f121990z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C24903f c24903f, boolean z11, boolean z12, InterfaceC26353b interfaceC26353b, int i11, C32959d c32959d, Continuation continuation) {
                    super(2, continuation);
                    this.f121985u = c24903f;
                    this.f121986v = z11;
                    this.f121987w = z12;
                    this.f121988x = interfaceC26353b;
                    this.f121989y = i11;
                    this.f121990z = c32959d;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f121985u, this.f121986v, this.f121987w, this.f121988x, this.f121989y, this.f121990z, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f121984t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C25451c.f121865a.m131823k(this.f121985u, this.f121986v, this.f121987w, this.f121988x, this.f121989y, this.f121990z);
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

            /* renamed from: qp.j$e$d$d, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C32959d implements C25451c.a {

                /* renamed from: a */
                private int f121991a;

                /* renamed from: b */
                final /* synthetic */ a f121992b;

                /* renamed from: c */
                final /* synthetic */ C24903f f121993c;

                /* renamed from: d */
                final /* synthetic */ b f121994d;

                /* renamed from: e */
                final /* synthetic */ C25458j f121995e;

                /* renamed from: f */
                final /* synthetic */ long f121996f;

                /* renamed from: qp.j$e$d$d$a */
                /* loaded from: classes4.dex */
                static final class a extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ b f121997q;

                    /* renamed from: r */
                    final /* synthetic */ Exception f121998r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    a(b bVar, Exception exc) {
                        super(0);
                        this.f121997q = bVar;
                        this.f121998r = exc;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String mo12V4() {
                        return "song " + this.f121997q.m131881c() + " onError " + this.f121998r;
                    }
                }

                /* renamed from: qp.j$e$d$d$b */
                /* loaded from: classes4.dex */
                static final class b extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ b f121999q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(b bVar) {
                        super(0);
                        this.f121999q = bVar;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String mo12V4() {
                        return "song " + this.f121999q.m131881c() + " onPause";
                    }
                }

                /* renamed from: qp.j$e$d$d$c */
                /* loaded from: classes4.dex */
                static final class c extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ b f122000q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    c(b bVar) {
                        super(0);
                        this.f122000q = bVar;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String mo12V4() {
                        return "song " + this.f122000q.m131881c() + " onPlay";
                    }
                }

                /* renamed from: qp.j$e$d$d$d, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                static final class C32960d extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ b f122001q;

                    /* renamed from: r */
                    final /* synthetic */ int f122002r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32960d(b bVar, int i11) {
                        super(0);
                        this.f122001q = bVar;
                        this.f122002r = i11;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String mo12V4() {
                        return "song " + this.f122001q.m131881c() + " onProgressChanged progress " + this.f122002r;
                    }
                }

                /* renamed from: qp.j$e$d$d$e, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                static final class C32961e extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ b f122003q;

                    /* renamed from: r */
                    final /* synthetic */ int f122004r;

                    /* renamed from: s */
                    final /* synthetic */ int f122005s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32961e(b bVar, int i11, int i12) {
                        super(0);
                        this.f122003q = bVar;
                        this.f122004r = i11;
                        this.f122005s = i12;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String mo12V4() {
                        return "song " + this.f122003q.m131881c() + " onTimeChanged elapsedTime " + this.f122004r + " duration " + this.f122005s;
                    }
                }

                /* renamed from: qp.j$e$d$d$f */
                /* loaded from: classes4.dex */
                static final class f extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ b f122006q;

                    /* renamed from: r */
                    final /* synthetic */ Sentence f122007r;

                    /* renamed from: s */
                    final /* synthetic */ Sentence f122008s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    f(b bVar, Sentence sentence, Sentence sentence2) {
                        super(0);
                        this.f122006q = bVar;
                        this.f122007r = sentence;
                        this.f122008s = sentence2;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String mo12V4() {
                        return "song " + this.f122006q.m131881c() + " Pick lyric currentSentence " + this.f122007r + " nextSentence " + this.f122008s;
                    }
                }

                C32959d(a aVar, C24903f c24903f, b bVar, C25458j c25458j, long j11) {
                    this.f121992b = aVar;
                    this.f121993c = c24903f;
                    this.f121994d = bVar;
                    this.f121995e = c25458j;
                    this.f121996f = j11;
                }

                @Override // p456qp.C25451c.a
                /* renamed from: a */
                public void mo131831a(int i11, int i12) {
                    Object m131207g0;
                    Object m131207g02;
                    C26359h c26359h = C26359h.f125209a;
                    c26359h.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new C32961e(this.f121994d, i11, i12));
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.mo104658c(this.f121993c, i11, i12);
                    }
                    C24898a m131870e = this.f121995e.m131870e();
                    if (m131870e != null) {
                        a aVar2 = this.f121992b;
                        C24903f c24903f = this.f121993c;
                        b bVar = this.f121994d;
                        List m129465a = m131870e.m129465a(m131870e.m129466b() + i11);
                        m131207g0 = AbstractC25332a0.m131207g0(m129465a, 0);
                        Sentence sentence = (Sentence) m131207g0;
                        m131207g02 = AbstractC25332a0.m131207g0(m129465a, 1);
                        Sentence sentence2 = (Sentence) m131207g02;
                        c26359h.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new f(bVar, sentence, sentence2));
                        if (aVar2 != null) {
                            aVar2.mo104664i(c24903f, new LyricRender(c24903f.m129502e(), sentence, sentence2, false, false, 24, null));
                        }
                    }
                    this.f121991a = i12;
                }

                @Override // p456qp.C25451c.a
                /* renamed from: b */
                public void mo131832b() {
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.mo104661f(this.f121993c);
                    }
                }

                @Override // p456qp.C25451c.a
                /* renamed from: c */
                public void mo131833c(Exception exc) {
                    AbstractC19074t.m100208f(exc, "exception");
                    C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new a(this.f121994d, exc));
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.mo104656a(exc);
                    }
                    C26361j.f125215a.m135704j(this.f121994d.m131881c(), exc, this.f121995e.m131869d(), this.f121996f);
                }

                @Override // p456qp.C25451c.a
                /* renamed from: d */
                public void mo131834d() {
                    C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new c(this.f121994d));
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.mo104659d(this.f121993c);
                    }
                }

                @Override // p456qp.C25451c.a
                /* renamed from: e */
                public void mo131835e() {
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.mo104657b(this.f121993c.m129502e());
                    }
                }

                @Override // p456qp.C25451c.a
                public void onAudioFocusChange(int i11) {
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.onAudioFocusChange(i11);
                    }
                }

                @Override // p456qp.C25451c.a
                public void onPause() {
                    C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new b(this.f121994d));
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.mo104662g(this.f121993c);
                    }
                }

                @Override // p456qp.C25451c.a
                public void onProgressChanged(int i11) {
                    C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new C32960d(this.f121994d, i11));
                    a aVar = this.f121992b;
                    if (aVar != null) {
                        aVar.mo104660e(this.f121993c, i11);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(a aVar, C24903f c24903f, b bVar, C25458j c25458j, long j11, boolean z11, boolean z12, InterfaceC26353b interfaceC26353b, int i11, Continuation continuation) {
                super(2, continuation);
                this.f121978w = aVar;
                this.f121979x = c24903f;
                this.f121980y = bVar;
                this.f121981z = c25458j;
                this.f121970A = j11;
                this.f121971B = z11;
                this.f121972C = z12;
                this.f121973D = interfaceC26353b;
                this.f121974E = i11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                d dVar = new d(this.f121978w, this.f121979x, this.f121980y, this.f121981z, this.f121970A, this.f121971B, this.f121972C, this.f121973D, this.f121974E, continuation);
                dVar.f121977v = obj;
                return dVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C32959d c32959d;
                CoroutineScope coroutineScope;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f121976u;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c32959d = (C32959d) this.f121975t;
                    coroutineScope = (CoroutineScope) this.f121977v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f121977v;
                    c32959d = new C32959d(this.f121978w, this.f121979x, this.f121980y, this.f121981z, this.f121970A);
                    CoroutineDispatcher m135712b = C26364m.f125218a.m135712b();
                    a aVar = new a(null);
                    this.f121977v = coroutineScope2;
                    this.f121975t = c32959d;
                    this.f121976u = 1;
                    if (BuildersKt.m112534g(m135712b, aVar, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                C32959d c32959d2 = c32959d;
                if (CoroutineScopeKt.m112642f(coroutineScope)) {
                    C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new b(this.f121980y));
                    CoroutineDispatcher m135712b2 = C26364m.f125218a.m135712b();
                    c cVar = new c(this.f121979x, this.f121971B, this.f121972C, this.f121973D, this.f121974E, c32959d2, null);
                    this.f121977v = null;
                    this.f121975t = null;
                    this.f121976u = 2;
                    if (BuildersKt.m112534g(m135712b2, cVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar, a aVar, CoroutineExceptionHandler coroutineExceptionHandler, C25458j c25458j, long j11, boolean z11, boolean z12, InterfaceC26353b interfaceC26353b, int i11, Continuation continuation) {
            super(2, continuation);
            this.f121955w = bVar;
            this.f121956x = aVar;
            this.f121957y = coroutineExceptionHandler;
            this.f121958z = c25458j;
            this.f121947A = j11;
            this.f121948B = z11;
            this.f121949C = z12;
            this.f121950D = interfaceC26353b;
            this.f121951E = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(this.f121955w, this.f121956x, this.f121957y, this.f121958z, this.f121947A, this.f121948B, this.f121949C, this.f121950D, this.f121951E, continuation);
            eVar.f121954v = obj;
            return eVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            Object mo127588f;
            Object mo127590i;
            C24902e c24902e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121953u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        c24902e = (C24902e) this.f121952t;
                        coroutineScope = (CoroutineScope) this.f121954v;
                        AbstractC24862s.m129228b(obj);
                        mo127590i = obj;
                        C24903f c24903f = (C24903f) mo127590i;
                        C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new b(this.f121955w, c24903f));
                        if (c24902e.m129485a() && this.f121955w.m131880b()) {
                            BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f121957y, null, new c(this.f121958z, c24902e, this.f121955w, null), 2, null);
                        }
                        BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f121957y, null, new d(this.f121956x, c24903f, this.f121955w, this.f121958z, this.f121947A, this.f121948B, this.f121949C, this.f121950D, this.f121951E, null), 2, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f121954v;
                AbstractC24862s.m129228b(obj);
                mo127588f = obj;
            } else {
                AbstractC24862s.m129228b(obj);
                coroutineScope = (CoroutineScope) this.f121954v;
                if (C23055e5.m118273h(false, 1, null)) {
                    C24405q m127651a = C24405q.Companion.m127651a();
                    String m131881c = this.f121955w.m131881c();
                    this.f121954v = coroutineScope;
                    this.f121953u = 1;
                    mo127588f = m127651a.mo127588f(m131881c, this);
                    if (mo127588f == m142578e) {
                        return m142578e;
                    }
                } else {
                    throw ExceptionNoNetwork.f46313p;
                }
            }
            C24902e c24902e2 = (C24902e) mo127588f;
            C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new a(this.f121955w, c24902e2));
            a aVar = this.f121956x;
            if (aVar != null) {
                aVar.mo104663h(c24902e2);
            }
            C24405q m127651a2 = C24405q.Companion.m127651a();
            String m129490f = c24902e2.m129490f();
            String m129493i = c24902e2.m129493i();
            this.f121954v = coroutineScope;
            this.f121952t = c24902e2;
            this.f121953u = 2;
            mo127590i = m127651a2.mo127590i(m129490f, m129493i, this);
            if (mo127590i == m142578e) {
                return m142578e;
            }
            c24902e = c24902e2;
            C24903f c24903f2 = (C24903f) mo127590i;
            C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new b(this.f121955w, c24903f2));
            if (c24902e.m129485a()) {
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f121957y, null, new c(this.f121958z, c24902e, this.f121955w, null), 2, null);
            }
            BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f121957y, null, new d(this.f121956x, c24903f2, this.f121955w, this.f121958z, this.f121947A, this.f121948B, this.f121949C, this.f121950D, this.f121951E, null), 2, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qp.j$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ b f122009q;

        /* renamed from: r */
        final /* synthetic */ Throwable f122010r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b bVar, Throwable th2) {
            super(0);
            this.f122009q = bVar;
            this.f122010r = th2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f122009q.m131881c() + " exception " + this.f122010r;
        }
    }

    public C25458j(InterfaceC25486s interfaceC25486s) {
        AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
        this.f121934a = interfaceC25486s;
    }

    /* renamed from: c */
    public final Object m131868c(Continuation continuation) {
        Object m142578e;
        Job job = this.f121935b;
        if (job != null) {
            Object m112752e = JobKt.m112752e(job, continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112752e == m142578e) {
                return m112752e;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: d */
    public final InterfaceC25486s m131869d() {
        return this.f121934a;
    }

    /* renamed from: e */
    public final C24898a m131870e() {
        return this.f121936c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19382f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object mo13397b(b bVar, Continuation continuation) {
        Job m112540d;
        long currentTimeMillis = System.currentTimeMillis();
        a m131879a = bVar.m131879a();
        boolean m131885g = bVar.m131885g();
        int m131883e = bVar.m131883e();
        boolean m131884f = bVar.m131884f();
        InterfaceC26353b m131882d = bVar.m131882d();
        C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_PLAY_MUSIC", new d(bVar));
        CompletableJob m112864b = SupervisorKt.m112864b(null, 1, null);
        c cVar = new c(CoroutineExceptionHandler.f105837l, m131879a, bVar);
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(continuation.getContext().mo112823d0(m112864b)), cVar, null, new e(bVar, m131879a, cVar, this, currentTimeMillis, m131885g, m131884f, m131882d, m131883e, null), 2, null);
        this.f121935b = m112540d;
        return C24848g0.f119245a;
    }

    /* renamed from: g */
    public final void m131872g(C24898a c24898a) {
        this.f121936c = c24898a;
    }

    public /* synthetic */ C25458j(InterfaceC25486s interfaceC25486s, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C25480m.f122070a : interfaceC25486s);
    }
}
