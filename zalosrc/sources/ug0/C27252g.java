package ug0;

import ad.C0737a;
import ch0.C3487b;
import com.zing.zalo.backuprestore.media.exception.DriveDownloadException;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import lg0.AbstractC22481e;
import lg0.C22480d;
import me0.AbstractC23041d2;
import p128ed.C18388c;
import p128ed.C18390e;
import p206hd.C20002f;
import p206hd.InterfaceC20001e;
import p487rl.C25823d;
import p620wt.AbstractC29237l;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25372u;
import su.AbstractC26389c;
import tg0.C26676b;
import vi.C28255a;
import vi.C28260f;
import vi.C28262h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: ug0.g */
/* loaded from: classes7.dex */
public final class C27252g {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final ConcurrentHashMap f128053b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final CoroutineDispatcher f128054c = Dispatchers.m112680b().mo112623F0(1);

    /* renamed from: a */
    private final C22480d f128055a;

    /* renamed from: ug0.g$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final String m139425d(String str) {
            return C3487b.f14598a.m17470i(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final String m139426e(String str) {
            return C3487b.f14598a.m17472k(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final String m139427f(String str) {
            return C3487b.f14598a.m17473l(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.g$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f128056s;

        /* renamed from: u */
        int f128058u;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128056s = obj;
            this.f128058u |= Integer.MIN_VALUE;
            return C27252g.this.m139421h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.g$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f128059s;

        /* renamed from: t */
        Object f128060t;

        /* renamed from: u */
        Object f128061u;

        /* renamed from: v */
        Object f128062v;

        /* renamed from: w */
        /* synthetic */ Object f128063w;

        /* renamed from: y */
        int f128065y;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128063w = obj;
            this.f128065y |= Integer.MIN_VALUE;
            return C27252g.this.m139409i(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.g$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128066t;

        /* renamed from: u */
        private /* synthetic */ Object f128067u;

        /* renamed from: v */
        final /* synthetic */ String f128068v;

        /* renamed from: w */
        final /* synthetic */ C27252g f128069w;

        /* renamed from: x */
        final /* synthetic */ C28260f f128070x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ug0.g$d$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f128071q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f128071q = str;
            }

            /* renamed from: a */
            public final void m139429a(Throwable th2) {
                if ((th2 instanceof CancellationException) && C27252g.f128053b.remove(this.f128071q) != null) {
                    C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "downloadAndWaitUtilZipEntryReady() - Zip process cancelled");
                    return;
                }
                C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "downloadAndWaitUtilZipEntryReady() - Zip process done: " + this.f128071q + ", exception=" + th2);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m139429a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ug0.g$d$b */
        /* loaded from: classes7.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f128072t;

            /* renamed from: u */
            final /* synthetic */ C27252g f128073u;

            /* renamed from: v */
            final /* synthetic */ C28260f f128074v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C27252g c27252g, C28260f c28260f, Continuation continuation) {
                super(2, continuation);
                this.f128073u = c27252g;
                this.f128074v = c28260f;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f128073u, this.f128074v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f128072t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C27252g c27252g = this.f128073u;
                    C28260f c28260f = this.f128074v;
                    this.f128072t = 1;
                    if (c27252g.m139420t(c28260f, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, C27252g c27252g, C28260f c28260f, Continuation continuation) {
            super(2, continuation);
            this.f128068v = str;
            this.f128069w = c27252g;
            this.f128070x = c28260f;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f128068v, this.f128069w, this.f128070x, continuation);
            dVar.f128067u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Deferred m112538b;
            AbstractC28298d.m142578e();
            if (this.f128066t == 0) {
                AbstractC24862s.m129228b(obj);
                m112538b = BuildersKt__Builders_commonKt.m112538b((CoroutineScope) this.f128067u, null, CoroutineStart.LAZY, new b(this.f128069w, this.f128070x, null), 1, null);
                if (C27252g.f128053b.putIfAbsent(this.f128068v, m112538b) == null) {
                    m112538b.mo112733M(new a(this.f128068v));
                    return AbstractC29094b.m145339a(m112538b.start());
                }
                Job.DefaultImpls.m112740a(m112538b, null, 1, null);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.g$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f128075t;

        /* renamed from: u */
        int f128076u;

        /* renamed from: v */
        final /* synthetic */ String f128077v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ug0.g$e$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C0737a f128078q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C0737a c0737a) {
                super(1);
                this.f128078q = c0737a;
            }

            /* renamed from: a */
            public final void m139432a(Throwable th2) {
                this.f128078q.m1202M(null);
                this.f128078q.mo107421i(true);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m139432a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: ug0.g$e$b */
        /* loaded from: classes7.dex */
        public static final class b implements InterfaceC20001e {

            /* renamed from: a */
            final /* synthetic */ CancellableContinuation f128079a;

            b(CancellableContinuation cancellableContinuation) {
                this.f128079a = cancellableContinuation;
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: a */
            public void mo98994a(String str, long j11) {
                InterfaceC20001e.a.m103800b(this, str, j11);
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: b */
            public boolean mo98995b() {
                return InterfaceC20001e.a.m103799a(this);
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: c */
            public void mo98996c(int i11, String str) {
                AbstractC19074t.m100208f(str, "errorMsg");
                CancellableContinuation cancellableContinuation = this.f128079a;
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new DriveDownloadException(i11, str))));
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: d */
            public void mo98997d(String str) {
                AbstractC19074t.m100208f(str, "path");
                this.f128079a.mo112492g(C24861r.m129218b(str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Continuation continuation) {
            super(2, continuation);
            this.f128077v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f128077v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128076u;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = this.f128077v;
                this.f128075t = str;
                this.f128076u = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C0737a c0737a = new C0737a();
                c0737a.m1202M(new b(cancellableContinuationImpl));
                c0737a.m1203N(true);
                c0737a.m107488m(str, C27252g.Companion.m139425d(str), null);
                cancellableContinuationImpl.mo112543I(new a(c0737a));
                obj = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (obj == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.g$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f128080s;

        /* renamed from: t */
        /* synthetic */ Object f128081t;

        /* renamed from: v */
        int f128083v;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128081t = obj;
            this.f128083v |= Integer.MIN_VALUE;
            return C27252g.this.m139412l(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.g$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f128084t;

        /* renamed from: u */
        Object f128085u;

        /* renamed from: v */
        int f128086v;

        /* renamed from: w */
        final /* synthetic */ C28260f f128087w;

        /* renamed from: x */
        final /* synthetic */ C27252g f128088x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ug0.g$g$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C20002f f128089q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C20002f c20002f) {
                super(1);
                this.f128089q = c20002f;
            }

            /* renamed from: a */
            public final void m139434a(Throwable th2) {
                this.f128089q.m103806O(null);
                this.f128089q.mo107421i(true);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m139434a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: ug0.g$g$b */
        /* loaded from: classes7.dex */
        public static final class b implements InterfaceC20001e {

            /* renamed from: a */
            final /* synthetic */ CancellableContinuation f128090a;

            /* renamed from: b */
            final /* synthetic */ C28260f f128091b;

            b(CancellableContinuation cancellableContinuation, C28260f c28260f) {
                this.f128090a = cancellableContinuation;
                this.f128091b = c28260f;
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: a */
            public void mo98994a(String str, long j11) {
                InterfaceC20001e.a.m103800b(this, str, j11);
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: b */
            public boolean mo98995b() {
                return InterfaceC20001e.a.m103799a(this);
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: c */
            public void mo98996c(int i11, String str) {
                AbstractC19074t.m100208f(str, "errorMsg");
                CancellableContinuation cancellableContinuation = this.f128090a;
                C24861r.a aVar = C24861r.f119264q;
                cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new DriveDownloadException(i11, str))));
            }

            @Override // p206hd.InterfaceC20001e
            /* renamed from: d */
            public void mo98997d(String str) {
                AbstractC19074t.m100208f(str, "path");
                if (!AbstractC23041d2.m118194A(str)) {
                    CancellableContinuation cancellableContinuation = this.f128090a;
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new DriveDownloadException(107, "Zip not found in path: " + str))));
                    return;
                }
                if (!AbstractC26389c.m135985a(str, this.f128091b.m142304e())) {
                    AbstractC23041d2.m118208g(str);
                    CancellableContinuation cancellableContinuation2 = this.f128090a;
                    C24861r.a aVar2 = C24861r.f119264q;
                    cancellableContinuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new DriveDownloadException(108, "Zip checksum not match: checksum=" + this.f128091b.m142304e() + ", pathOut=" + str + ")"))));
                    return;
                }
                this.f128090a.mo112492g(C24861r.m129218b(str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C28260f c28260f, C27252g c27252g, Continuation continuation) {
            super(2, continuation);
            this.f128087w = c28260f;
            this.f128088x = c27252g;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f128087w, this.f128088x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128086v;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C28260f c28260f = this.f128087w;
                C27252g c27252g = this.f128088x;
                this.f128084t = c28260f;
                this.f128085u = c27252g;
                this.f128086v = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                C20002f c20002f = new C20002f();
                c20002f.m103806O(new b(cancellableContinuationImpl, c28260f));
                c20002f.m103807P(true);
                c20002f.m107488m(c28260f.m142306h(), c28260f.mo142291d(), String.valueOf(c28260f.mo142289b()), c27252g.m139414n(c28260f));
                cancellableContinuationImpl.mo112543I(new a(c20002f));
                obj = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (obj == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.g$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f128092t;

        /* renamed from: u */
        int f128093u;

        /* renamed from: v */
        final /* synthetic */ C28260f f128094v;

        /* renamed from: w */
        final /* synthetic */ C27252g f128095w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C28260f c28260f, C27252g c27252g, Continuation continuation) {
            super(2, continuation);
            this.f128094v = c28260f;
            this.f128095w = c27252g;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f128094v, this.f128095w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            ZipFile zipFile;
            Iterator m131515u;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128093u;
            String str2 = "";
            ZipFile zipFile2 = null;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        str = (String) this.f128092t;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (DriveDownloadException e11) {
                            e = e11;
                            C26676b.m136954d("SMLZCloudMigrationBackupDownloader", e);
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str;
                            AbstractC29237l.m145996a(zipFile2);
                            AbstractC23041d2.m118208g(str2);
                            C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "downloadAndWaitUtilZipEntryReady() - Process finished on zip: " + this.f128094v.mo142292f());
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "downloadAndWaitUtilZipEntryReady() - Start async process on zip: " + this.f128094v.mo142292f() + ", thread=" + Thread.currentThread().getName());
                    try {
                        C27252g c27252g = this.f128095w;
                        C28260f c28260f = this.f128094v;
                        this.f128092t = "";
                        this.f128093u = 1;
                        obj = c27252g.m139410j(c28260f, this);
                        if (obj != m142578e) {
                            str = "";
                        } else {
                            return m142578e;
                        }
                    } catch (DriveDownloadException e12) {
                        e = e12;
                        C26676b.m136954d("SMLZCloudMigrationBackupDownloader", e);
                        throw e;
                    }
                }
                String str3 = (String) obj;
                try {
                    zipFile = new ZipFile(str3);
                } catch (DriveDownloadException e13) {
                    e = e13;
                } catch (Throwable th3) {
                    str2 = str3;
                    th = th3;
                }
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    AbstractC19074t.m100207e(entries, "entries(...)");
                    m131515u = AbstractC25372u.m131515u(entries);
                    while (m131515u.hasNext()) {
                        ZipEntry zipEntry = (ZipEntry) m131515u.next();
                        String name = zipEntry.getName();
                        C27252g c27252g2 = this.f128095w;
                        C28260f c28260f2 = this.f128094v;
                        AbstractC19074t.m100205c(name);
                        String m139416p = c27252g2.m139416p(c28260f2, name);
                        try {
                            C18388c c18388c = C18388c.f92779a;
                            InputStream inputStream = zipFile.getInputStream(zipEntry);
                            AbstractC19074t.m100207e(inputStream, "getInputStream(...)");
                            c18388c.m97399j(inputStream, m139416p);
                            C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "downloadAndWaitUtilZipEntryReady() - Finished unzip: " + this.f128094v.mo142292f() + " -> " + name + ", outputPath=" + m139416p);
                        } catch (FileNotFoundException e14) {
                            C26676b.m136954d("SMLZCloudMigrationBackupDownloader", e14);
                            String message = e14.getMessage();
                            if (message != null) {
                                str2 = message;
                            }
                            throw new DriveDownloadException(107, str2);
                        } catch (IOException e15) {
                            C26676b.m136954d("SMLZCloudMigrationBackupDownloader", e15);
                            String message2 = e15.getMessage();
                            if (message2 != null) {
                                str2 = message2;
                            }
                            throw new DriveDownloadException(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10, str2);
                        }
                    }
                    AbstractC29237l.m145996a(zipFile);
                    AbstractC23041d2.m118208g(str3);
                    C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "downloadAndWaitUtilZipEntryReady() - Process finished on zip: " + this.f128094v.mo142292f());
                    return C24848g0.f119245a;
                } catch (DriveDownloadException e16) {
                    e = e16;
                    C26676b.m136954d("SMLZCloudMigrationBackupDownloader", e);
                    throw e;
                } catch (Throwable th4) {
                    str2 = str3;
                    zipFile2 = zipFile;
                    th = th4;
                    AbstractC29237l.m145996a(zipFile2);
                    AbstractC23041d2.m118208g(str2);
                    C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "downloadAndWaitUtilZipEntryReady() - Process finished on zip: " + this.f128094v.mo142292f());
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C27252g(C22480d c22480d) {
        AbstractC19074t.m100208f(c22480d, "getBackupZipMetadataUseCase");
        this.f128055a = c22480d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139409i(String str, C28260f c28260f, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        C24848g0 c24848g0;
        C27252g c27252g;
        String str2;
        String str3;
        C24848g0 c24848g02;
        C27252g c27252g2;
        Deferred deferred;
        String str4;
        C27252g c27252g3;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f128065y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f128065y = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f128063w;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f128065y;
                c24848g0 = null;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                str3 = (String) cVar.f128062v;
                                c28260f = (C28260f) cVar.f128061u;
                                str4 = (String) cVar.f128060t;
                                c27252g3 = (C27252g) cVar.f128059s;
                                AbstractC24862s.m129228b(obj);
                                c24848g0 = C24848g0.f119245a;
                                c27252g2 = c27252g3;
                                str2 = str4;
                                if (c24848g0 == null && !AbstractC23041d2.m118194A(c27252g2.m139416p(c28260f, str2))) {
                                    throw new DriveDownloadException(111, "Entry not exist in zip: " + str3 + " -> " + str2);
                                }
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) cVar.f128062v;
                        c28260f = (C28260f) cVar.f128061u;
                        str2 = (String) cVar.f128060t;
                        c27252g2 = (C27252g) cVar.f128059s;
                        AbstractC24862s.m129228b(obj);
                        deferred = (Deferred) f128053b.remove(str3);
                        if (deferred != null) {
                            cVar.f128059s = c27252g2;
                            cVar.f128060t = str2;
                            cVar.f128061u = c28260f;
                            cVar.f128062v = str3;
                            cVar.f128065y = 3;
                            if (deferred.mo112598E(cVar) == m142578e) {
                                return m142578e;
                            }
                            str4 = str2;
                            c27252g3 = c27252g2;
                            c24848g0 = C24848g0.f119245a;
                            c27252g2 = c27252g3;
                            str2 = str4;
                        }
                        if (c24848g0 == null) {
                        }
                        return C24848g0.f119245a;
                    }
                    str3 = (String) cVar.f128062v;
                    c28260f = (C28260f) cVar.f128061u;
                    str2 = (String) cVar.f128060t;
                    c27252g = (C27252g) cVar.f128059s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    String mo142292f = c28260f.mo142292f();
                    Deferred deferred2 = (Deferred) f128053b.get(mo142292f);
                    if (deferred2 != null) {
                        cVar.f128059s = this;
                        cVar.f128060t = str;
                        cVar.f128061u = c28260f;
                        cVar.f128062v = mo142292f;
                        cVar.f128065y = 1;
                        if (deferred2.mo112598E(cVar) == m142578e) {
                            return m142578e;
                        }
                        c27252g = this;
                        str2 = str;
                        str3 = mo142292f;
                    } else {
                        c27252g = this;
                        str2 = str;
                        str3 = mo142292f;
                        c24848g02 = null;
                        if (c24848g02 == null) {
                            d dVar = new d(str3, c27252g, c28260f, null);
                            cVar.f128059s = c27252g;
                            cVar.f128060t = str2;
                            cVar.f128061u = c28260f;
                            cVar.f128062v = str3;
                            cVar.f128065y = 2;
                            if (SupervisorKt.m112865c(dVar, cVar) == m142578e) {
                                return m142578e;
                            }
                        }
                        c27252g2 = c27252g;
                        deferred = (Deferred) f128053b.remove(str3);
                        if (deferred != null) {
                        }
                        if (c24848g0 == null) {
                        }
                        return C24848g0.f119245a;
                    }
                }
                c24848g02 = C24848g0.f119245a;
                if (c24848g02 == null) {
                }
                c27252g2 = c27252g;
                deferred = (Deferred) f128053b.remove(str3);
                if (deferred != null) {
                }
                if (c24848g0 == null) {
                }
                return C24848g0.f119245a;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f128063w;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f128065y;
        c24848g0 = null;
        if (i11 == 0) {
        }
        c24848g02 = C24848g0.f119245a;
        if (c24848g02 == null) {
        }
        c27252g2 = c27252g;
        deferred = (Deferred) f128053b.remove(str3);
        if (deferred != null) {
        }
        if (c24848g0 == null) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final Object m139410j(C28260f c28260f, Continuation continuation) {
        if (m139419s(c28260f)) {
            C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "Backup file existed in cache, skip downloading");
            return m139414n(c28260f);
        }
        return m139413m(c28260f, continuation);
    }

    /* renamed from: k */
    private final Object m139411k(String str, Continuation continuation) {
        return BuildersKt.m112534g(f128054c, new e(str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139412l(C25823d c25823d, C28262h c28262h, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f128083v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f128083v = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f128081t;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f128083v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        String str = (String) fVar.f128080s;
                        AbstractC24862s.m129228b(obj);
                        return str;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                C28260f m139415o = m139415o(c28262h);
                if (m139415o != null && m139415o.m142306h().length() != 0) {
                    String m139418r = m139418r(c25823d);
                    String m139416p = m139416p(m139415o, m139418r);
                    if (AbstractC23041d2.m118194A(m139416p)) {
                        C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "Backup file already existed: " + m139416p);
                        return m139416p;
                    }
                    fVar.f128080s = m139416p;
                    fVar.f128083v = 1;
                    if (m139409i(m139418r, m139415o, fVar) == m142578e) {
                        return m142578e;
                    }
                    return m139416p;
                }
                throw new DriveDownloadException(104, "Drive file ID not found");
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f128081t;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f128083v;
        if (i11 == 0) {
        }
    }

    /* renamed from: m */
    private final Object m139413m(C28260f c28260f, Continuation continuation) {
        return BuildersKt.m112534g(f128054c, new g(c28260f, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final String m139414n(C28260f c28260f) {
        return Companion.m139427f(c28260f.mo142292f());
    }

    /* renamed from: o */
    private final C28260f m139415o(C28262h c28262h) {
        return AbstractC22481e.m116234a(this.f128055a, c28262h.m142327E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final String m139416p(C28260f c28260f, String str) {
        return m139417q(c28260f) + File.separator + str;
    }

    /* renamed from: q */
    private final String m139417q(C28260f c28260f) {
        return Companion.m139426e(c28260f.mo142292f());
    }

    /* renamed from: r */
    private final String m139418r(C25823d c25823d) {
        return C18390e.m97404f(c25823d.m133185k().m41050n(), c25823d.m133185k());
    }

    /* renamed from: s */
    private final boolean m139419s(C28260f c28260f) {
        return AbstractC23041d2.m118194A(m139414n(c28260f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final Object m139420t(C28260f c28260f, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new h(c28260f, this, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139421h(C25823d c25823d, C28255a c28255a, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i12 = bVar.f128058u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    bVar.f128058u = i12 - Integer.MIN_VALUE;
                    Object obj = bVar.f128056s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = bVar.f128058u;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj);
                                return new C27246a((String) obj, 0, false, 6, null);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        return new C27246a((String) obj, 0, false, 6, null);
                    }
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "Start get migration backup on thread: " + Thread.currentThread().getName());
                    if (c25823d.m133183i().m106830b()) {
                        C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "Backup file local existed, skip downloading");
                        return new C27246a(c25823d.m133182h(), 0, false, 2, null);
                    }
                    if (c28255a instanceof C28262h) {
                        C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "Migration backup is zip backup");
                        bVar.f128058u = 1;
                        obj = m139412l(c25823d, (C28262h) c28255a, bVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        return new C27246a((String) obj, 0, false, 6, null);
                    }
                    C26676b.m136960j("SMLZCloudMigrationBackupDownloader", "Migration backup is single backup");
                    String m133180f = c25823d.m133180f();
                    bVar.f128058u = 2;
                    obj = m139411k(m133180f, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    return new C27246a((String) obj, 0, false, 6, null);
                }
            }
            if (i11 == 0) {
            }
        } catch (DriveDownloadException e11) {
            C26676b.m136954d("SMLZCloudMigrationBackupDownloader", e11);
            return new C27246a(null, e11.f40043p, false, 5, null);
        } catch (CancellationException e12) {
            throw e12;
        } catch (Exception e13) {
            C26676b.m136954d("SMLZCloudMigrationBackupDownloader", e13);
            return new C27246a(null, 105, false, 5, null);
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f128056s;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f128058u;
    }
}
