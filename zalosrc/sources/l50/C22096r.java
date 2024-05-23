package l50;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.music.domain.entity.Sentence;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import java.util.List;
import k50.C21475c;
import k50.C21477e;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import l50.C22090l;
import me0.C23055e5;
import p185gc.AbstractC19382f;
import p426pp.C24898a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.r */
/* loaded from: classes5.dex */
public final class C22096r extends AbstractC19382f {

    /* renamed from: a */
    private Job f108774a;

    /* renamed from: b */
    private C24898a f108775b;

    /* renamed from: l50.r$a */
    /* loaded from: classes5.dex */
    public interface a {

        /* renamed from: l50.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32880a {
            /* renamed from: a */
            public static void m115297a(a aVar, C21477e c21477e, LyricRender lyricRender) {
                AbstractC19074t.m100208f(c21477e, "ringtoneStreaming");
                AbstractC19074t.m100208f(lyricRender, "lyricRender");
            }

            /* renamed from: b */
            public static void m115298b(a aVar, String str) {
                AbstractC19074t.m100208f(str, "idSong");
            }

            /* renamed from: c */
            public static void m115299c(a aVar, C21477e c21477e, int i11, int i12) {
                AbstractC19074t.m100208f(c21477e, "ringtoneStreaming");
            }
        }

        /* renamed from: a */
        void mo58857a(Exception exc);

        /* renamed from: b */
        void mo58858b(String str);

        /* renamed from: c */
        void mo58859c(C21477e c21477e, LyricRender lyricRender);

        /* renamed from: d */
        void mo58860d(C21477e c21477e, int i11);

        /* renamed from: e */
        void mo58861e(C21477e c21477e, int i11, int i12);

        /* renamed from: f */
        void mo58862f(C21477e c21477e);

        /* renamed from: g */
        void mo58863g(C21477e c21477e);
    }

    /* renamed from: l50.r$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final String f108776a;

        /* renamed from: b */
        private final boolean f108777b;

        /* renamed from: c */
        private final boolean f108778c;

        /* renamed from: d */
        private final boolean f108779d;

        /* renamed from: e */
        private final int f108780e;

        /* renamed from: f */
        private final a f108781f;

        public b(String str, boolean z11, boolean z12, boolean z13, int i11, a aVar) {
            AbstractC19074t.m100208f(str, "idSong");
            this.f108776a = str;
            this.f108777b = z11;
            this.f108778c = z12;
            this.f108779d = z13;
            this.f108780e = i11;
            this.f108781f = aVar;
        }

        /* renamed from: a */
        public final a m115300a() {
            return this.f108781f;
        }

        /* renamed from: b */
        public final String m115301b() {
            return this.f108776a;
        }

        /* renamed from: c */
        public final int m115302c() {
            return this.f108780e;
        }

        /* renamed from: d */
        public final boolean m115303d() {
            return this.f108778c;
        }

        /* renamed from: e */
        public final boolean m115304e() {
            return this.f108777b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f108776a, bVar.f108776a) && this.f108777b == bVar.f108777b && this.f108778c == bVar.f108778c && this.f108779d == bVar.f108779d && this.f108780e == bVar.f108780e && AbstractC19074t.m100204b(this.f108781f, bVar.f108781f);
        }

        public int hashCode() {
            int hashCode = ((((((((this.f108776a.hashCode() * 31) + AbstractC2144f.m11520a(this.f108777b)) * 31) + AbstractC2144f.m11520a(this.f108778c)) * 31) + AbstractC2144f.m11520a(this.f108779d)) * 31) + this.f108780e) * 31;
            a aVar = this.f108781f;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Param(idSong=" + this.f108776a + ", isIncreaseSound=" + this.f108777b + ", useShareSpeakerConfig=" + this.f108778c + ", enableLyric=" + this.f108779d + ", timeToPlay=" + this.f108780e + ", callback=" + this.f108781f + ")";
        }

        public /* synthetic */ b(String str, boolean z11, boolean z12, boolean z13, int i11, a aVar, int i12, AbstractC19060k abstractC19060k) {
            this(str, (i12 & 2) != 0 ? true : z11, (i12 & 4) == 0 ? z12 : true, (i12 & 8) != 0 ? false : z13, (i12 & 16) == 0 ? i11 : 0, (i12 & 32) != 0 ? null : aVar);
        }
    }

    /* renamed from: l50.r$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ a f108782q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, a aVar) {
            super(key);
            this.f108782q = aVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            a aVar = this.f108782q;
            if (aVar != null) {
                AbstractC19074t.m100206d(th2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
                aVar.mo58857a((Exception) th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l50.r$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ boolean f108783A;

        /* renamed from: B */
        final /* synthetic */ int f108784B;

        /* renamed from: t */
        int f108785t;

        /* renamed from: u */
        private /* synthetic */ Object f108786u;

        /* renamed from: v */
        final /* synthetic */ a f108787v;

        /* renamed from: w */
        final /* synthetic */ b f108788w;

        /* renamed from: x */
        final /* synthetic */ CoroutineExceptionHandler f108789x;

        /* renamed from: y */
        final /* synthetic */ C22096r f108790y;

        /* renamed from: z */
        final /* synthetic */ boolean f108791z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: l50.r$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: A */
            final /* synthetic */ boolean f108792A;

            /* renamed from: B */
            final /* synthetic */ boolean f108793B;

            /* renamed from: C */
            final /* synthetic */ int f108794C;

            /* renamed from: t */
            Object f108795t;

            /* renamed from: u */
            int f108796u;

            /* renamed from: v */
            private /* synthetic */ Object f108797v;

            /* renamed from: w */
            final /* synthetic */ a f108798w;

            /* renamed from: x */
            final /* synthetic */ b f108799x;

            /* renamed from: y */
            final /* synthetic */ C21477e f108800y;

            /* renamed from: z */
            final /* synthetic */ C22096r f108801z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: l50.r$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32881a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f108802t;

                C32881a(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32881a(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f108802t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C22090l.f108732a.m115271o();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32881a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: l50.r$d$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f108803t;

                /* renamed from: u */
                final /* synthetic */ C21477e f108804u;

                /* renamed from: v */
                final /* synthetic */ boolean f108805v;

                /* renamed from: w */
                final /* synthetic */ boolean f108806w;

                /* renamed from: x */
                final /* synthetic */ int f108807x;

                /* renamed from: y */
                final /* synthetic */ c f108808y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C21477e c21477e, boolean z11, boolean z12, int i11, c cVar, Continuation continuation) {
                    super(2, continuation);
                    this.f108804u = c21477e;
                    this.f108805v = z11;
                    this.f108806w = z12;
                    this.f108807x = i11;
                    this.f108808y = cVar;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f108804u, this.f108805v, this.f108806w, this.f108807x, this.f108808y, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f108803t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C22090l.f108732a.m115276v(this.f108804u, this.f108805v, this.f108806w, this.f108807x, this.f108808y);
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

            /* renamed from: l50.r$d$a$c */
            /* loaded from: classes5.dex */
            public static final class c implements C22090l.a {

                /* renamed from: a */
                private int f108809a;

                /* renamed from: b */
                final /* synthetic */ a f108810b;

                /* renamed from: c */
                final /* synthetic */ C21477e f108811c;

                /* renamed from: d */
                final /* synthetic */ C22096r f108812d;

                c(a aVar, C21477e c21477e, C22096r c22096r) {
                    this.f108810b = aVar;
                    this.f108811c = c21477e;
                    this.f108812d = c22096r;
                }

                @Override // l50.C22090l.a
                /* renamed from: a */
                public void mo115251a(int i11, int i12) {
                    Object m131207g0;
                    Object m131207g02;
                    a aVar = this.f108810b;
                    if (aVar != null) {
                        aVar.mo58861e(this.f108811c, i11, i12);
                    }
                    C24898a m115295c = this.f108812d.m115295c();
                    if (m115295c != null) {
                        a aVar2 = this.f108810b;
                        C21477e c21477e = this.f108811c;
                        List m129465a = m115295c.m129465a(m115295c.m129466b() + i11);
                        m131207g0 = AbstractC25332a0.m131207g0(m129465a, 0);
                        Sentence sentence = (Sentence) m131207g0;
                        m131207g02 = AbstractC25332a0.m131207g0(m129465a, 1);
                        Sentence sentence2 = (Sentence) m131207g02;
                        if (aVar2 != null) {
                            aVar2.mo58859c(c21477e, new LyricRender(c21477e.m111094b(), sentence, sentence2, false, false, 24, null));
                        }
                    }
                    this.f108809a = i12;
                }

                @Override // l50.C22090l.a
                /* renamed from: c */
                public void mo115252c(Exception exc) {
                    AbstractC19074t.m100208f(exc, "exception");
                    a aVar = this.f108810b;
                    if (aVar != null) {
                        aVar.mo58857a(exc);
                    }
                }

                @Override // l50.C22090l.a
                /* renamed from: d */
                public void mo115253d() {
                    a aVar = this.f108810b;
                    if (aVar != null) {
                        aVar.mo58863g(this.f108811c);
                    }
                }

                @Override // l50.C22090l.a
                public void onPause() {
                    a aVar = this.f108810b;
                    if (aVar != null) {
                        aVar.mo58862f(this.f108811c);
                    }
                }

                @Override // l50.C22090l.a
                public void onProgressChanged(int i11) {
                    a aVar = this.f108810b;
                    if (aVar != null) {
                        aVar.mo58860d(this.f108811c, i11);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar, b bVar, C21477e c21477e, C22096r c22096r, boolean z11, boolean z12, int i11, Continuation continuation) {
                super(2, continuation);
                this.f108798w = aVar;
                this.f108799x = bVar;
                this.f108800y = c21477e;
                this.f108801z = c22096r;
                this.f108792A = z11;
                this.f108793B = z12;
                this.f108794C = i11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f108798w, this.f108799x, this.f108800y, this.f108801z, this.f108792A, this.f108793B, this.f108794C, continuation);
                aVar.f108797v = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                c cVar;
                CoroutineScope coroutineScope;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f108796u;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c) this.f108795t;
                    coroutineScope = (CoroutineScope) this.f108797v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f108797v;
                    cVar = new c(this.f108798w, this.f108800y, this.f108801z);
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    C32881a c32881a = new C32881a(null);
                    this.f108797v = coroutineScope2;
                    this.f108795t = cVar;
                    this.f108796u = 1;
                    if (BuildersKt.m112534g(m112680b, c32881a, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                c cVar2 = cVar;
                if (CoroutineScopeKt.m112642f(coroutineScope)) {
                    a aVar = this.f108798w;
                    if (aVar != null) {
                        aVar.mo58858b(this.f108799x.m115301b());
                    }
                    CoroutineDispatcher m112680b2 = Dispatchers.m112680b();
                    b bVar = new b(this.f108800y, this.f108792A, this.f108793B, this.f108794C, cVar2, null);
                    this.f108797v = null;
                    this.f108795t = null;
                    this.f108796u = 2;
                    if (BuildersKt.m112534g(m112680b2, bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a aVar, b bVar, CoroutineExceptionHandler coroutineExceptionHandler, C22096r c22096r, boolean z11, boolean z12, int i11, Continuation continuation) {
            super(2, continuation);
            this.f108787v = aVar;
            this.f108788w = bVar;
            this.f108789x = coroutineExceptionHandler;
            this.f108790y = c22096r;
            this.f108791z = z11;
            this.f108783A = z12;
            this.f108784B = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f108787v, this.f108788w, this.f108789x, this.f108790y, this.f108791z, this.f108783A, this.f108784B, continuation);
            dVar.f108786u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f108785t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        coroutineScope2 = (CoroutineScope) this.f108786u;
                        AbstractC24862s.m129228b(obj);
                        BuildersKt__Builders_commonKt.m112540d(coroutineScope2, this.f108789x, null, new a(this.f108787v, this.f108788w, (C21477e) obj, this.f108790y, this.f108791z, this.f108783A, this.f108784B, null), 2, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f108786u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f108786u;
                if (!C23055e5.m118273h(false, 1, null)) {
                    a aVar = this.f108787v;
                    if (aVar != null) {
                        aVar.mo58857a(ExceptionNoNetwork.f56345p);
                    }
                    return C24848g0.f119245a;
                }
                C20304a m106001a = C20304a.Companion.m106001a();
                String m115301b = this.f108788w.m115301b();
                this.f108786u = coroutineScope3;
                this.f108785t = 1;
                Object mo105986f = m106001a.mo105986f(m115301b, this);
                if (mo105986f == m142578e) {
                    return m142578e;
                }
                coroutineScope = coroutineScope3;
                obj = mo105986f;
            }
            C21475c c21475c = (C21475c) obj;
            C20304a m106001a2 = C20304a.Companion.m106001a();
            String m111085b = c21475c.m111085b();
            String m111087d = c21475c.m111087d();
            this.f108786u = coroutineScope;
            this.f108785t = 2;
            obj = m106001a2.mo105989i(m111085b, m111087d, this);
            if (obj == m142578e) {
                return m142578e;
            }
            coroutineScope2 = coroutineScope;
            BuildersKt__Builders_commonKt.m112540d(coroutineScope2, this.f108789x, null, new a(this.f108787v, this.f108788w, (C21477e) obj, this.f108790y, this.f108791z, this.f108783A, this.f108784B, null), 2, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: c */
    public final C24898a m115295c() {
        return this.f108775b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19382f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo13397b(b bVar, Continuation continuation) {
        Job m112540d;
        a m115300a = bVar.m115300a();
        boolean m115304e = bVar.m115304e();
        int m115302c = bVar.m115302c();
        boolean m115303d = bVar.m115303d();
        CompletableJob m112864b = SupervisorKt.m112864b(null, 1, null);
        c cVar = new c(CoroutineExceptionHandler.f105837l, m115300a);
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(m112864b)), cVar, null, new d(m115300a, bVar, cVar, this, m115304e, m115303d, m115302c, null), 2, null);
        this.f108774a = m112540d;
        return C24848g0.f119245a;
    }
}
