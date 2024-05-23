package com.zing.zalo.zalocloud.migration;

import ch0.AbstractC3486a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.zalocloud.backup.GetBackupMetadataException;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.migration.AbstractC16861a;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import lg0.C22479c;
import ln0.AbstractC22543l;
import on0.AbstractC24341v;
import p019aj.C0876j;
import p320ld.C22447s;
import p452ql.InterfaceC25320d;
import p487rl.C25823d;
import p487rl.EnumC25824e;
import p487rl.EnumC25825f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import si.C26263i;
import tg0.C26676b;
import ug0.AbstractC27247b;
import ug0.AbstractC27253h;
import ug0.AbstractC27254i;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import zg0.C31831a;

/* loaded from: classes7.dex */
public final class ZaloCloudMigrationAnalyzer {
    public static final C16807a Companion = new C16807a(null);

    /* renamed from: a */
    private final InterfaceC25320d f85388a;

    /* renamed from: b */
    private final C22479c f85389b;

    /* renamed from: c */
    private final C0876j f85390c;

    /* renamed from: d */
    private final C16805b f85391d;

    /* renamed from: e */
    private final AtomicInteger f85392e;

    /* renamed from: f */
    private final AtomicInteger f85393f;

    /* renamed from: g */
    private int f85394g;

    /* renamed from: h */
    private final AtomicInteger f85395h;

    /* renamed from: i */
    private final AtomicInteger f85396i;

    /* renamed from: j */
    private final AtomicInteger f85397j;

    /* renamed from: k */
    private final AtomicInteger f85398k;

    /* renamed from: l */
    private final AtomicInteger f85399l;

    /* renamed from: m */
    private final AtomicInteger f85400m;

    /* renamed from: n */
    private boolean f85401n;

    /* renamed from: o */
    private boolean f85402o;

    /* renamed from: p */
    private boolean f85403p;

    /* renamed from: q */
    private boolean f85404q;

    /* loaded from: classes7.dex */
    public static abstract class Failure extends Exception {

        /* loaded from: classes7.dex */
        public static final class DriveProblem extends Failure {
            public DriveProblem(String str) {
                super(str, null, null);
            }
        }

        /* loaded from: classes7.dex */
        public static final class NetworkError extends Failure {
            public NetworkError(String str) {
                super(str, null, null);
            }
        }

        public /* synthetic */ Failure(String str, Throwable th2, AbstractC19060k abstractC19060k) {
            this(str, th2);
        }

        private Failure(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$a */
    /* loaded from: classes7.dex */
    public static final class C16807a {
        private C16807a() {
        }

        public /* synthetic */ C16807a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16808b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85405a;

        static {
            int[] iArr = new int[EnumC25825f.values().length];
            try {
                iArr[EnumC25825f.f123208q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25825f.f123209r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25825f.f123210s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25825f.f123211t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f85405a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$c */
    /* loaded from: classes7.dex */
    public static final class C16809c extends AbstractC29096d {

        /* renamed from: s */
        Object f85406s;

        /* renamed from: t */
        Object f85407t;

        /* renamed from: u */
        boolean f85408u;

        /* renamed from: v */
        /* synthetic */ Object f85409v;

        /* renamed from: x */
        int f85411x;

        C16809c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85409v = obj;
            this.f85411x |= Integer.MIN_VALUE;
            return ZaloCloudMigrationAnalyzer.this.m89877w(false, null, this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d */
    /* loaded from: classes7.dex */
    public static final class C16810d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f85412t;

        /* renamed from: u */
        Object f85413u;

        /* renamed from: v */
        Object f85414v;

        /* renamed from: w */
        int f85415w;

        /* renamed from: x */
        private /* synthetic */ Object f85416x;

        /* renamed from: z */
        final /* synthetic */ int f85418z;

        /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f85419t;

            /* renamed from: u */
            private /* synthetic */ Object f85420u;

            /* renamed from: v */
            final /* synthetic */ List f85421v;

            /* renamed from: w */
            final /* synthetic */ ZaloCloudMigrationAnalyzer f85422w;

            /* renamed from: x */
            final /* synthetic */ ProducerScope f85423x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC18505l f85424y;

            /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$a$a */
            /* loaded from: classes7.dex */
            public static final class C32790a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: A */
                final /* synthetic */ CoroutineScope f85425A;

                /* renamed from: t */
                Object f85426t;

                /* renamed from: u */
                long f85427u;

                /* renamed from: v */
                int f85428v;

                /* renamed from: w */
                /* synthetic */ Object f85429w;

                /* renamed from: x */
                final /* synthetic */ ZaloCloudMigrationAnalyzer f85430x;

                /* renamed from: y */
                final /* synthetic */ ProducerScope f85431y;

                /* renamed from: z */
                final /* synthetic */ InterfaceC18505l f85432z;

                /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$a$a$a */
                /* loaded from: classes7.dex */
                public static final class C32791a extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ long f85433q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32791a(long j11) {
                        super(0);
                        this.f85433q = j11;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a */
                    public final String mo12V4() {
                        return "Start analyze: totalMsgCount=" + this.f85433q;
                    }
                }

                /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$a$a$b */
                /* loaded from: classes7.dex */
                public static final class b extends AbstractC29104l implements InterfaceC18511r {

                    /* renamed from: A */
                    final /* synthetic */ long f85434A;

                    /* renamed from: B */
                    final /* synthetic */ C19055h0 f85435B;

                    /* renamed from: t */
                    int f85436t;

                    /* renamed from: u */
                    /* synthetic */ int f85437u;

                    /* renamed from: v */
                    /* synthetic */ int f85438v;

                    /* renamed from: w */
                    /* synthetic */ Object f85439w;

                    /* renamed from: x */
                    final /* synthetic */ CoroutineScope f85440x;

                    /* renamed from: y */
                    final /* synthetic */ ZaloCloudMigrationAnalyzer f85441y;

                    /* renamed from: z */
                    final /* synthetic */ ContactProfile f85442z;

                    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$a$a$b$a */
                    /* loaded from: classes7.dex */
                    public static final class C32792a extends AbstractC19075u implements InterfaceC18494a {

                        /* renamed from: q */
                        final /* synthetic */ int f85443q;

                        /* renamed from: r */
                        final /* synthetic */ int f85444r;

                        /* renamed from: s */
                        final /* synthetic */ List f85445s;

                        /* renamed from: t */
                        final /* synthetic */ List f85446t;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C32792a(int i11, int i12, List list, List list2) {
                            super(0);
                            this.f85443q = i11;
                            this.f85444r = i12;
                            this.f85445s = list;
                            this.f85446t = list2;
                        }

                        @Override // en0.InterfaceC18494a
                        /* renamed from: a */
                        public final String mo12V4() {
                            return "Analyzing: page=" + this.f85443q + ", offset=" + this.f85444r + ", msgSize=" + this.f85445s.size() + ", migrationSize=" + this.f85446t.size();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(CoroutineScope coroutineScope, ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer, ContactProfile contactProfile, long j11, C19055h0 c19055h0, Continuation continuation) {
                        super(4, continuation);
                        this.f85440x = coroutineScope;
                        this.f85441y = zaloCloudMigrationAnalyzer;
                        this.f85442z = contactProfile;
                        this.f85434A = j11;
                        this.f85435B = c19055h0;
                    }

                    @Override // en0.InterfaceC18511r
                    /* renamed from: Uc */
                    public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
                        return m89883r(((Number) obj).intValue(), ((Number) obj2).intValue(), (List) obj3, (Continuation) obj4);
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: o */
                    public final Object mo239o(Object obj) {
                        Object m142578e;
                        m142578e = AbstractC28298d.m142578e();
                        int i11 = this.f85436t;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                            int i12 = this.f85437u;
                            int i13 = this.f85438v;
                            List list = (List) this.f85439w;
                            CoroutineScopeKt.m112641e(this.f85440x);
                            ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer = this.f85441y;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C25823d m89852D = zaloCloudMigrationAnalyzer.m89852D((C17945a0) it.next());
                                if (m89852D != null) {
                                    zaloCloudMigrationAnalyzer.m89874v(m89852D);
                                } else {
                                    m89852D = null;
                                }
                                if (m89852D != null) {
                                    arrayList.add(m89852D);
                                }
                            }
                            this.f85441y.m89876z(this.f85442z, this.f85434A, new C32792a(i12, i13, list, arrayList));
                            if (!arrayList.isEmpty()) {
                                this.f85435B.f94931p += arrayList.size();
                                InterfaceC25320d interfaceC25320d = this.f85441y.f85388a;
                                this.f85436t = 1;
                                if (interfaceC25320d.mo131129k(arrayList, this) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }

                    /* renamed from: r */
                    public final Object m89883r(int i11, int i12, List list, Continuation continuation) {
                        b bVar = new b(this.f85440x, this.f85441y, this.f85442z, this.f85434A, this.f85435B, continuation);
                        bVar.f85437u = i11;
                        bVar.f85438v = i12;
                        bVar.f85439w = list;
                        return bVar.mo239o(C24848g0.f119245a);
                    }
                }

                /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$a$a$c */
                /* loaded from: classes7.dex */
                public static final class c extends AbstractC19075u implements InterfaceC18494a {

                    /* renamed from: q */
                    final /* synthetic */ C19055h0 f85447q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    c(C19055h0 c19055h0) {
                        super(0);
                        this.f85447q = c19055h0;
                    }

                    @Override // en0.InterfaceC18494a
                    /* renamed from: a */
                    public final String mo12V4() {
                        return "Analyzed: totalMigrationItems=" + this.f85447q.f94931p;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32790a(ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer, ProducerScope producerScope, InterfaceC18505l interfaceC18505l, CoroutineScope coroutineScope, Continuation continuation) {
                    super(2, continuation);
                    this.f85430x = zaloCloudMigrationAnalyzer;
                    this.f85431y = producerScope;
                    this.f85432z = interfaceC18505l;
                    this.f85425A = coroutineScope;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    C32790a c32790a = new C32790a(this.f85430x, this.f85431y, this.f85432z, this.f85425A, continuation);
                    c32790a.f85429w = obj;
                    return c32790a;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x00de A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo239o(Object obj) {
                    Object m142578e;
                    ContactProfile contactProfile;
                    C19055h0 c19055h0;
                    long j11;
                    C19055h0 c19055h02;
                    long j12;
                    ContactProfile contactProfile2;
                    ProducerScope producerScope;
                    Object mo205i9;
                    long j13;
                    ContactProfile contactProfile3;
                    m142578e = AbstractC28298d.m142578e();
                    int i11 = this.f85428v;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    j13 = this.f85427u;
                                    c19055h02 = (C19055h0) this.f85426t;
                                    contactProfile3 = (ContactProfile) this.f85429w;
                                    AbstractC24862s.m129228b(obj);
                                    this.f85430x.m89876z(contactProfile3, j13, new c(c19055h02));
                                    C26676b.m136952b("SMLZCloudMigrationAnalyzer", "Current analyze progress: " + this.f85430x.f85393f.get() + "/" + this.f85430x.f85394g);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j12 = this.f85427u;
                            C19055h0 c19055h03 = (C19055h0) this.f85426t;
                            contactProfile2 = (ContactProfile) this.f85429w;
                            AbstractC24862s.m129228b(obj);
                            c19055h02 = c19055h03;
                            producerScope = this.f85431y;
                            mo205i9 = this.f85432z.mo205i9(AbstractC29094b.m145341c(this.f85430x.f85393f.incrementAndGet()));
                            this.f85429w = contactProfile2;
                            this.f85426t = c19055h02;
                            this.f85427u = j12;
                            this.f85428v = 3;
                            if (producerScope.mo112908S(mo205i9, this) != m142578e) {
                                return m142578e;
                            }
                            j13 = j12;
                            contactProfile3 = contactProfile2;
                            this.f85430x.m89876z(contactProfile3, j13, new c(c19055h02));
                            C26676b.m136952b("SMLZCloudMigrationAnalyzer", "Current analyze progress: " + this.f85430x.f85393f.get() + "/" + this.f85430x.f85394g);
                            return C24848g0.f119245a;
                        }
                        j11 = this.f85427u;
                        c19055h0 = (C19055h0) this.f85426t;
                        contactProfile = (ContactProfile) this.f85429w;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        AbstractC24862s.m129228b(obj);
                        ContactProfile contactProfile4 = (ContactProfile) this.f85429w;
                        String mo2478b = contactProfile4.mo2478b();
                        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                        long m2633p = this.f85430x.f85390c.m2633p(mo2478b);
                        this.f85430x.m89876z(contactProfile4, m2633p, new C32791a(m2633p));
                        C19055h0 c19055h04 = new C19055h0();
                        ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer = this.f85430x;
                        b bVar = new b(this.f85425A, zaloCloudMigrationAnalyzer, contactProfile4, m2633p, c19055h04, null);
                        this.f85429w = contactProfile4;
                        this.f85426t = c19055h04;
                        this.f85427u = m2633p;
                        this.f85428v = 1;
                        if (zaloCloudMigrationAnalyzer.m89851C(contactProfile4, bVar, this) == m142578e) {
                            return m142578e;
                        }
                        contactProfile = contactProfile4;
                        c19055h0 = c19055h04;
                        j11 = m2633p;
                    }
                    InterfaceC25320d interfaceC25320d = this.f85430x.f85388a;
                    String str = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    this.f85429w = contactProfile;
                    this.f85426t = c19055h0;
                    this.f85427u = j11;
                    this.f85428v = 2;
                    if (interfaceC25320d.mo131132n(str, this) == m142578e) {
                        return m142578e;
                    }
                    c19055h02 = c19055h0;
                    j12 = j11;
                    contactProfile2 = contactProfile;
                    producerScope = this.f85431y;
                    mo205i9 = this.f85432z.mo205i9(AbstractC29094b.m145341c(this.f85430x.f85393f.incrementAndGet()));
                    this.f85429w = contactProfile2;
                    this.f85426t = c19055h02;
                    this.f85427u = j12;
                    this.f85428v = 3;
                    if (producerScope.mo112908S(mo205i9, this) != m142578e) {
                    }
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r */
                public final Object mo240pC(ContactProfile contactProfile, Continuation continuation) {
                    return ((C32790a) mo238a(contactProfile, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer, ProducerScope producerScope, InterfaceC18505l interfaceC18505l, Continuation continuation) {
                super(2, continuation);
                this.f85421v = list;
                this.f85422w = zaloCloudMigrationAnalyzer;
                this.f85423x = producerScope;
                this.f85424y = interfaceC18505l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f85421v, this.f85422w, this.f85423x, this.f85424y, continuation);
                aVar.f85420u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f85419t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f85420u;
                    List list = this.f85421v;
                    C32790a c32790a = new C32790a(this.f85422w, this.f85423x, this.f85424y, coroutineScope, null);
                    this.f85419t = 1;
                    if (AbstractC3486a.m17460b(list, coroutineScope, c32790a, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$b */
        /* loaded from: classes7.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ ZaloCloudMigrationAnalyzer f85448q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer) {
                super(1);
                this.f85448q = zaloCloudMigrationAnalyzer;
            }

            /* renamed from: a */
            public final Integer m89886a(int i11) {
                int m116584g;
                AtomicInteger atomicInteger = this.f85448q.f85392e;
                m116584g = AbstractC22543l.m116584g((int) ((i11 / this.f85448q.f85394g) * 100), 100);
                atomicInteger.set(m116584g);
                return Integer.valueOf(this.f85448q.f85392e.get());
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m89886a(((Number) obj).intValue());
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$d$c */
        /* loaded from: classes7.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ ZaloCloudMigrationAnalyzer f85449q;

            /* renamed from: r */
            final /* synthetic */ InterfaceC18505l f85450r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer, InterfaceC18505l interfaceC18505l) {
                super(1);
                this.f85449q = zaloCloudMigrationAnalyzer;
                this.f85450r = interfaceC18505l;
            }

            /* renamed from: a */
            public final AbstractC16861a.d m89887a(int i11) {
                return new AbstractC16861a.d(i11, this.f85449q.f85394g, ((Number) this.f85450r.mo205i9(Integer.valueOf(i11))).intValue());
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                return m89887a(((Number) obj).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16810d(int i11, Continuation continuation) {
            super(2, continuation);
            this.f85418z = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16810d c16810d = new C16810d(this.f85418z, continuation);
            c16810d.f85416x = obj;
            return c16810d;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0222 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0149 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0125 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARN: Type inference failed for: r0v26, types: [en0.l] */
        /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v35 */
        /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v19, types: [en0.l, int] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ProducerScope producerScope;
            Object m89849A;
            Object mo131122d;
            ProducerScope producerScope2;
            List list;
            Object mo205i9;
            List list2;
            c cVar;
            ProducerScope producerScope3;
            InterfaceC18505l interfaceC18505l;
            a aVar;
            ?? r7;
            AbstractC16861a.e eVar;
            m142578e = AbstractC28298d.m142578e();
            ?? r32 = 1;
            try {
            } catch (Failure e11) {
                if (e11 instanceof Failure.DriveProblem) {
                    AbstractC16861a.a aVar2 = new AbstractC16861a.a(ZaloCloudMigrationAnalyzer.this.f85392e.get());
                    this.f85416x = null;
                    this.f85412t = null;
                    this.f85413u = null;
                    this.f85414v = null;
                    this.f85415w = 5;
                    if (producerScope3.mo112908S(aVar2, this) == m142578e) {
                        return m142578e;
                    }
                } else if (e11 instanceof Failure.NetworkError) {
                    AbstractC16861a.c cVar2 = new AbstractC16861a.c(ZaloCloudMigrationAnalyzer.this.f85392e.get());
                    this.f85416x = null;
                    this.f85412t = null;
                    this.f85413u = null;
                    this.f85414v = null;
                    this.f85415w = 6;
                    if (producerScope3.mo112908S(cVar2, this) == m142578e) {
                        return m142578e;
                    }
                }
            } catch (CancellationException e12) {
                ZaloCloudMigrationAnalyzer.this.f85404q = r32;
                C26676b.m136954d("SMLZCloudMigrationAnalyzer", e12);
                return C24848g0.f119245a;
            } catch (Exception e13) {
                C26676b.m136954d("SMLZCloudMigrationAnalyzer", e13);
                AbstractC16861a.b bVar = new AbstractC16861a.b(ZaloCloudMigrationAnalyzer.this.f85393f.get(), ZaloCloudMigrationAnalyzer.this.f85394g, this.f85418z, ((Number) r7.mo205i9(AbstractC29094b.m145341c(ZaloCloudMigrationAnalyzer.this.f85393f.get()))).intValue());
                this.f85416x = null;
                this.f85412t = null;
                this.f85413u = null;
                this.f85414v = null;
                this.f85415w = 7;
                if (producerScope3.mo112908S(bVar, this) == m142578e) {
                    return m142578e;
                }
            }
            switch (this.f85415w) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    producerScope = (ProducerScope) this.f85416x;
                    ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer = ZaloCloudMigrationAnalyzer.this;
                    this.f85416x = producerScope;
                    this.f85415w = 1;
                    m89849A = zaloCloudMigrationAnalyzer.m89849A(this);
                    if (m89849A == m142578e) {
                        return m142578e;
                    }
                    List list3 = (List) m89849A;
                    InterfaceC25320d interfaceC25320d = ZaloCloudMigrationAnalyzer.this.f85388a;
                    this.f85416x = producerScope;
                    this.f85412t = list3;
                    this.f85415w = 2;
                    mo131122d = interfaceC25320d.mo131122d(this);
                    if (mo131122d != m142578e) {
                        return m142578e;
                    }
                    producerScope2 = producerScope;
                    list = list3;
                    Set set = (Set) mo131122d;
                    ZaloCloudMigrationAnalyzer.this.f85394g = list.size() + set.size();
                    C26676b.b bVar2 = C26676b.b.f126331p;
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar2);
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "Start migration analysis: retries=" + this.f85418z + ", analyzed=" + set.size() + ", total=" + ZaloCloudMigrationAnalyzer.this.f85394g, bVar2);
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar2);
                    ZaloCloudMigrationAnalyzer.this.f85393f.set(set.size());
                    b bVar3 = new b(ZaloCloudMigrationAnalyzer.this);
                    c cVar3 = new c(ZaloCloudMigrationAnalyzer.this, bVar3);
                    mo205i9 = cVar3.mo205i9(AbstractC29094b.m145341c(ZaloCloudMigrationAnalyzer.this.f85393f.get()));
                    this.f85416x = producerScope2;
                    this.f85412t = list;
                    this.f85413u = bVar3;
                    this.f85414v = cVar3;
                    this.f85415w = 3;
                    if (producerScope2.mo112908S(mo205i9, this) != m142578e) {
                        return m142578e;
                    }
                    list2 = list;
                    cVar = cVar3;
                    producerScope3 = producerScope2;
                    interfaceC18505l = bVar3;
                    aVar = new a(list2, ZaloCloudMigrationAnalyzer.this, producerScope3, cVar, null);
                    this.f85416x = producerScope3;
                    this.f85412t = interfaceC18505l;
                    this.f85413u = null;
                    this.f85414v = null;
                    this.f85415w = 4;
                    if (CoroutineScopeKt.m112640d(aVar, this) == m142578e) {
                        return m142578e;
                    }
                    C26676b.b bVar4 = C26676b.b.f126331p;
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar4);
                    int i11 = ZaloCloudMigrationAnalyzer.this.f85393f.get();
                    r7 = ZaloCloudMigrationAnalyzer.this.f85395h.get();
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "Analyze complete with processed=" + i11 + ", serverItemCount=" + r7 + ", localItemCount=" + ZaloCloudMigrationAnalyzer.this.f85396i.get() + ", backupItemCount=" + ZaloCloudMigrationAnalyzer.this.f85397j.get() + ", potentiallyBackupItemCount=" + ZaloCloudMigrationAnalyzer.this.f85398k.get() + ", myCloudItemCount=" + ZaloCloudMigrationAnalyzer.this.f85399l.get() + ", bigGroupCount=" + ZaloCloudMigrationAnalyzer.this.f85400m.get(), bVar4);
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar4);
                    eVar = new AbstractC16861a.e(ZaloCloudMigrationAnalyzer.this.f85395h.get(), ZaloCloudMigrationAnalyzer.this.f85396i.get(), ZaloCloudMigrationAnalyzer.this.f85397j.get(), ZaloCloudMigrationAnalyzer.this.f85398k.get(), ZaloCloudMigrationAnalyzer.this.f85399l.get());
                    this.f85416x = null;
                    this.f85412t = null;
                    r32 = 8;
                    this.f85415w = 8;
                    if (producerScope3.mo112908S(eVar, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                case 1:
                    producerScope = (ProducerScope) this.f85416x;
                    AbstractC24862s.m129228b(obj);
                    m89849A = obj;
                    List list32 = (List) m89849A;
                    InterfaceC25320d interfaceC25320d2 = ZaloCloudMigrationAnalyzer.this.f85388a;
                    this.f85416x = producerScope;
                    this.f85412t = list32;
                    this.f85415w = 2;
                    mo131122d = interfaceC25320d2.mo131122d(this);
                    if (mo131122d != m142578e) {
                    }
                    break;
                case 2:
                    list = (List) this.f85412t;
                    producerScope2 = (ProducerScope) this.f85416x;
                    AbstractC24862s.m129228b(obj);
                    mo131122d = obj;
                    Set set2 = (Set) mo131122d;
                    ZaloCloudMigrationAnalyzer.this.f85394g = list.size() + set2.size();
                    C26676b.b bVar22 = C26676b.b.f126331p;
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar22);
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "Start migration analysis: retries=" + this.f85418z + ", analyzed=" + set2.size() + ", total=" + ZaloCloudMigrationAnalyzer.this.f85394g, bVar22);
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar22);
                    ZaloCloudMigrationAnalyzer.this.f85393f.set(set2.size());
                    b bVar32 = new b(ZaloCloudMigrationAnalyzer.this);
                    c cVar32 = new c(ZaloCloudMigrationAnalyzer.this, bVar32);
                    mo205i9 = cVar32.mo205i9(AbstractC29094b.m145341c(ZaloCloudMigrationAnalyzer.this.f85393f.get()));
                    this.f85416x = producerScope2;
                    this.f85412t = list;
                    this.f85413u = bVar32;
                    this.f85414v = cVar32;
                    this.f85415w = 3;
                    if (producerScope2.mo112908S(mo205i9, this) != m142578e) {
                    }
                    break;
                case 3:
                    ?? r02 = (InterfaceC18505l) this.f85414v;
                    interfaceC18505l = (InterfaceC18505l) this.f85413u;
                    List list4 = (List) this.f85412t;
                    ProducerScope producerScope4 = (ProducerScope) this.f85416x;
                    AbstractC24862s.m129228b(obj);
                    cVar = r02;
                    list2 = list4;
                    producerScope3 = producerScope4;
                    aVar = new a(list2, ZaloCloudMigrationAnalyzer.this, producerScope3, cVar, null);
                    this.f85416x = producerScope3;
                    this.f85412t = interfaceC18505l;
                    this.f85413u = null;
                    this.f85414v = null;
                    this.f85415w = 4;
                    if (CoroutineScopeKt.m112640d(aVar, this) == m142578e) {
                    }
                    C26676b.b bVar42 = C26676b.b.f126331p;
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar42);
                    int i112 = ZaloCloudMigrationAnalyzer.this.f85393f.get();
                    r7 = ZaloCloudMigrationAnalyzer.this.f85395h.get();
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "Analyze complete with processed=" + i112 + ", serverItemCount=" + r7 + ", localItemCount=" + ZaloCloudMigrationAnalyzer.this.f85396i.get() + ", backupItemCount=" + ZaloCloudMigrationAnalyzer.this.f85397j.get() + ", potentiallyBackupItemCount=" + ZaloCloudMigrationAnalyzer.this.f85398k.get() + ", myCloudItemCount=" + ZaloCloudMigrationAnalyzer.this.f85399l.get() + ", bigGroupCount=" + ZaloCloudMigrationAnalyzer.this.f85400m.get(), bVar42);
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar42);
                    eVar = new AbstractC16861a.e(ZaloCloudMigrationAnalyzer.this.f85395h.get(), ZaloCloudMigrationAnalyzer.this.f85396i.get(), ZaloCloudMigrationAnalyzer.this.f85397j.get(), ZaloCloudMigrationAnalyzer.this.f85398k.get(), ZaloCloudMigrationAnalyzer.this.f85399l.get());
                    this.f85416x = null;
                    this.f85412t = null;
                    r32 = 8;
                    this.f85415w = 8;
                    if (producerScope3.mo112908S(eVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 4:
                    producerScope3 = (ProducerScope) this.f85416x;
                    AbstractC24862s.m129228b(obj);
                    C26676b.b bVar422 = C26676b.b.f126331p;
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar422);
                    int i1122 = ZaloCloudMigrationAnalyzer.this.f85393f.get();
                    r7 = ZaloCloudMigrationAnalyzer.this.f85395h.get();
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "Analyze complete with processed=" + i1122 + ", serverItemCount=" + r7 + ", localItemCount=" + ZaloCloudMigrationAnalyzer.this.f85396i.get() + ", backupItemCount=" + ZaloCloudMigrationAnalyzer.this.f85397j.get() + ", potentiallyBackupItemCount=" + ZaloCloudMigrationAnalyzer.this.f85398k.get() + ", myCloudItemCount=" + ZaloCloudMigrationAnalyzer.this.f85399l.get() + ", bigGroupCount=" + ZaloCloudMigrationAnalyzer.this.f85400m.get(), bVar422);
                    C26676b.m136955e("SMLZCloudMigrationAnalyzer", "──────────────────────────────────────────────────", bVar422);
                    eVar = new AbstractC16861a.e(ZaloCloudMigrationAnalyzer.this.f85395h.get(), ZaloCloudMigrationAnalyzer.this.f85396i.get(), ZaloCloudMigrationAnalyzer.this.f85397j.get(), ZaloCloudMigrationAnalyzer.this.f85398k.get(), ZaloCloudMigrationAnalyzer.this.f85399l.get());
                    this.f85416x = null;
                    this.f85412t = null;
                    r32 = 8;
                    this.f85415w = 8;
                    if (producerScope3.mo112908S(eVar, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 5:
                case 6:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 7:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 8:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((C16810d) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$e */
    /* loaded from: classes7.dex */
    public static final class C16811e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f85451t;

        /* renamed from: u */
        int f85452u;

        /* renamed from: v */
        int f85453v;

        /* renamed from: w */
        int f85454w;

        /* renamed from: x */
        int f85455x;

        C16811e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16811e(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x010f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00da A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Set set;
            List m131505m;
            List m131496e;
            Object mo131121c;
            int i11;
            Set set2;
            List m131505m2;
            List m131496e2;
            Object mo131121c2;
            int i12;
            int i13;
            List m131505m3;
            List m131496e3;
            Object mo131121c3;
            int i14;
            int i15;
            Set set3;
            String m127130z;
            String m127130z2;
            m142578e = AbstractC28298d.m142578e();
            int i16 = this.f85455x;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                if (i16 == 5) {
                                    i14 = this.f85454w;
                                    i12 = this.f85453v;
                                    i15 = this.f85452u;
                                    set3 = (Set) this.f85451t;
                                    AbstractC24862s.m129228b(obj);
                                    int intValue = ((Number) obj).intValue();
                                    m127130z = AbstractC24341v.m127130z("─", 23);
                                    int size = set3.size();
                                    boolean z11 = ZaloCloudMigrationAnalyzer.this.f85404q;
                                    m127130z2 = AbstractC24341v.m127130z("─", 50);
                                    AbstractC20110a.f98889a.m104564x("SMLZCloudMigrationAnalyzer").mo104556o(8, m127130z + "\nanalyzedConversations: " + size + "\ntotalConversations: " + i15 + "\nserverItemCount: " + i12 + "\nlocalItemCount: " + i14 + "\nbackupItemCount: " + intValue + "\nisCancellationExceptionThrown: " + z11 + "\n" + m127130z2, new Object[0]);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i12 = this.f85453v;
                            i13 = this.f85452u;
                            set2 = (Set) this.f85451t;
                            AbstractC24862s.m129228b(obj);
                            int intValue2 = ((Number) obj).intValue();
                            InterfaceC25320d interfaceC25320d = ZaloCloudMigrationAnalyzer.this.f85388a;
                            m131505m3 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                            m131496e3 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                            this.f85451t = set2;
                            this.f85452u = i13;
                            this.f85453v = i12;
                            this.f85454w = intValue2;
                            this.f85455x = 5;
                            mo131121c3 = interfaceC25320d.mo131121c(m131496e3, m131505m3, this);
                            if (mo131121c3 != m142578e) {
                                return m142578e;
                            }
                            i14 = intValue2;
                            obj = mo131121c3;
                            i15 = i13;
                            set3 = set2;
                            int intValue3 = ((Number) obj).intValue();
                            m127130z = AbstractC24341v.m127130z("─", 23);
                            int size2 = set3.size();
                            boolean z112 = ZaloCloudMigrationAnalyzer.this.f85404q;
                            m127130z2 = AbstractC24341v.m127130z("─", 50);
                            AbstractC20110a.f98889a.m104564x("SMLZCloudMigrationAnalyzer").mo104556o(8, m127130z + "\nanalyzedConversations: " + size2 + "\ntotalConversations: " + i15 + "\nserverItemCount: " + i12 + "\nlocalItemCount: " + i14 + "\nbackupItemCount: " + intValue3 + "\nisCancellationExceptionThrown: " + z112 + "\n" + m127130z2, new Object[0]);
                            return C24848g0.f119245a;
                        }
                        i11 = this.f85452u;
                        set2 = (Set) this.f85451t;
                        AbstractC24862s.m129228b(obj);
                        int intValue4 = ((Number) obj).intValue();
                        InterfaceC25320d interfaceC25320d2 = ZaloCloudMigrationAnalyzer.this.f85388a;
                        m131505m2 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                        m131496e2 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                        this.f85451t = set2;
                        this.f85452u = i11;
                        this.f85453v = intValue4;
                        this.f85455x = 4;
                        mo131121c2 = interfaceC25320d2.mo131121c(m131496e2, m131505m2, this);
                        if (mo131121c2 != m142578e) {
                            return m142578e;
                        }
                        int i17 = i11;
                        i12 = intValue4;
                        obj = mo131121c2;
                        i13 = i17;
                        int intValue22 = ((Number) obj).intValue();
                        InterfaceC25320d interfaceC25320d3 = ZaloCloudMigrationAnalyzer.this.f85388a;
                        m131505m3 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                        m131496e3 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                        this.f85451t = set2;
                        this.f85452u = i13;
                        this.f85453v = i12;
                        this.f85454w = intValue22;
                        this.f85455x = 5;
                        mo131121c3 = interfaceC25320d3.mo131121c(m131496e3, m131505m3, this);
                        if (mo131121c3 != m142578e) {
                        }
                    } else {
                        set = (Set) this.f85451t;
                        AbstractC24862s.m129228b(obj);
                        int size3 = ((List) obj).size() + set.size();
                        InterfaceC25320d interfaceC25320d4 = ZaloCloudMigrationAnalyzer.this.f85388a;
                        m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                        m131496e = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                        this.f85451t = set;
                        this.f85452u = size3;
                        this.f85455x = 3;
                        mo131121c = interfaceC25320d4.mo131121c(m131496e, m131505m, this);
                        if (mo131121c != m142578e) {
                            return m142578e;
                        }
                        Set set4 = set;
                        i11 = size3;
                        obj = mo131121c;
                        set2 = set4;
                        int intValue42 = ((Number) obj).intValue();
                        InterfaceC25320d interfaceC25320d22 = ZaloCloudMigrationAnalyzer.this.f85388a;
                        m131505m2 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                        m131496e2 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                        this.f85451t = set2;
                        this.f85452u = i11;
                        this.f85453v = intValue42;
                        this.f85455x = 4;
                        mo131121c2 = interfaceC25320d22.mo131121c(m131496e2, m131505m2, this);
                        if (mo131121c2 != m142578e) {
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC25320d interfaceC25320d5 = ZaloCloudMigrationAnalyzer.this.f85388a;
                this.f85455x = 1;
                obj = interfaceC25320d5.mo131122d(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Set set5 = (Set) obj;
            ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer = ZaloCloudMigrationAnalyzer.this;
            this.f85451t = set5;
            this.f85455x = 2;
            Object m89849A = zaloCloudMigrationAnalyzer.m89849A(this);
            if (m89849A == m142578e) {
                return m142578e;
            }
            set = set5;
            obj = m89849A;
            int size32 = ((List) obj).size() + set.size();
            InterfaceC25320d interfaceC25320d42 = ZaloCloudMigrationAnalyzer.this.f85388a;
            m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
            m131496e = AbstractC25366r.m131496e(EnumC25825f.f123208q);
            this.f85451t = set;
            this.f85452u = size32;
            this.f85455x = 3;
            mo131121c = interfaceC25320d42.mo131121c(m131496e, m131505m, this);
            if (mo131121c != m142578e) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16811e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$f */
    /* loaded from: classes7.dex */
    public static final class C16812f extends AbstractC29096d {

        /* renamed from: s */
        Object f85457s;

        /* renamed from: t */
        /* synthetic */ Object f85458t;

        /* renamed from: v */
        int f85460v;

        C16812f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85458t = obj;
            this.f85460v |= Integer.MIN_VALUE;
            return ZaloCloudMigrationAnalyzer.this.m89849A(this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$g */
    /* loaded from: classes7.dex */
    public static final class C16813g extends AbstractC29096d {

        /* renamed from: B */
        int f85462B;

        /* renamed from: s */
        Object f85463s;

        /* renamed from: t */
        Object f85464t;

        /* renamed from: u */
        int f85465u;

        /* renamed from: v */
        int f85466v;

        /* renamed from: w */
        int f85467w;

        /* renamed from: x */
        int f85468x;

        /* renamed from: y */
        int f85469y;

        /* renamed from: z */
        /* synthetic */ Object f85470z;

        C16813g(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85470z = obj;
            this.f85462B |= Integer.MIN_VALUE;
            return ZaloCloudMigrationAnalyzer.this.m89851C(null, null, this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$h */
    /* loaded from: classes7.dex */
    public static final class C16814h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f85471q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16814h(int i11) {
            super(0);
            this.f85471q = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start paging analyze: totalMsgPage=" + this.f85471q;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationAnalyzer$i */
    /* loaded from: classes7.dex */
    public static final class C16815i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85472t;

        /* renamed from: v */
        final /* synthetic */ C17945a0 f85474v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16815i(C17945a0 c17945a0, Continuation continuation) {
            super(2, continuation);
            this.f85474v = c17945a0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16815i(this.f85474v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85472t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                boolean z11 = ZaloCloudMigrationAnalyzer.this.f85403p;
                C17945a0 c17945a0 = this.f85474v;
                this.f85472t = 1;
                obj = AbstractC27254i.m139451c(c17945a0, z11, true, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C25823d c25823d = (C25823d) obj;
            if (c25823d != null) {
                ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer = ZaloCloudMigrationAnalyzer.this;
                if (c25823d.m133191q() == EnumC25825f.f123211t) {
                    zaloCloudMigrationAnalyzer.f85403p = true;
                    return c25823d;
                }
                return c25823d;
            }
            return null;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16815i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public ZaloCloudMigrationAnalyzer(InterfaceC25320d interfaceC25320d, C22479c c22479c, C0876j c0876j, C16805b c16805b) {
        AbstractC19074t.m100208f(interfaceC25320d, "repository");
        AbstractC19074t.m100208f(c22479c, "getBackupMetadata");
        AbstractC19074t.m100208f(c0876j, "msgRepo");
        AbstractC19074t.m100208f(c16805b, "zaloCloudConfigs");
        this.f85388a = interfaceC25320d;
        this.f85389b = c22479c;
        this.f85390c = c0876j;
        this.f85391d = c16805b;
        this.f85392e = new AtomicInteger(0);
        this.f85393f = new AtomicInteger(0);
        this.f85395h = new AtomicInteger(0);
        this.f85396i = new AtomicInteger(0);
        this.f85397j = new AtomicInteger(0);
        this.f85398k = new AtomicInteger(0);
        this.f85399l = new AtomicInteger(0);
        this.f85400m = new AtomicInteger(0);
        this.f85402o = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89849A(Continuation continuation) {
        C16812f c16812f;
        Object m142578e;
        int i11;
        ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer;
        if (continuation instanceof C16812f) {
            c16812f = (C16812f) continuation;
            int i12 = c16812f.f85460v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16812f.f85460v = i12 - Integer.MIN_VALUE;
                Object obj = c16812f.f85458t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16812f.f85460v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        zaloCloudMigrationAnalyzer = (ZaloCloudMigrationAnalyzer) c16812f.f85457s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = this.f85388a;
                    c16812f.f85457s = this;
                    c16812f.f85460v = 1;
                    obj = interfaceC25320d.mo131130l(c16812f);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationAnalyzer = this;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (zaloCloudMigrationAnalyzer.m89850B((ContactProfile) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        c16812f = new C16812f(continuation);
        Object obj3 = c16812f.f85458t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16812f.f85460v;
        if (i11 == 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r5.hasNext()) {
        }
        return arrayList2;
    }

    /* renamed from: B */
    private final boolean m89850B(ContactProfile contactProfile) {
        C31831a m152940a = C31831a.Companion.m152940a();
        String str = contactProfile.f42434r;
        AbstractC19074t.m100207e(str, "uid");
        boolean m152935p = m152940a.m152935p(str);
        if (!m152935p) {
            this.f85400m.incrementAndGet();
        }
        return m152935p;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b0 -> B:10:0x00b3). Please report as a decompilation issue!!! */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89851C(ContactProfile contactProfile, InterfaceC18511r interfaceC18511r, Continuation continuation) {
        C16813g c16813g;
        Object m142578e;
        int i11;
        int ceil;
        InterfaceC18511r interfaceC18511r2;
        String str;
        int i12;
        boolean z11;
        int i13;
        int i14;
        List m41524Q;
        int size;
        if (continuation instanceof C16813g) {
            c16813g = (C16813g) continuation;
            int i15 = c16813g.f85462B;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c16813g.f85462B = i15 - Integer.MIN_VALUE;
                Object obj = c16813g.f85470z;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16813g.f85462B;
                if (i11 == 0) {
                    if (i11 == 1) {
                        int i16 = c16813g.f85469y;
                        i12 = c16813g.f85468x;
                        ceil = c16813g.f85467w;
                        i13 = c16813g.f85466v;
                        i14 = c16813g.f85465u;
                        str = (String) c16813g.f85464t;
                        InterfaceC18511r interfaceC18511r3 = (InterfaceC18511r) c16813g.f85463s;
                        AbstractC24862s.m129228b(obj);
                        i14 += i16;
                        if (i16 < i13) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        i12++;
                        interfaceC18511r2 = interfaceC18511r3;
                        if (!z11 && i12 < ceil && (size = (m41524Q = C7956b.Companion.m41573b().m41524Q(str, i14, i13, C31831a.Companion.m152940a().m152932j())).size()) != 0) {
                            Integer m145341c = AbstractC29094b.m145341c(i12);
                            Integer m145341c2 = AbstractC29094b.m145341c(i14);
                            c16813g.f85463s = interfaceC18511r2;
                            c16813g.f85464t = str;
                            c16813g.f85465u = i14;
                            c16813g.f85466v = i13;
                            c16813g.f85467w = ceil;
                            c16813g.f85468x = i12;
                            c16813g.f85469y = size;
                            c16813g.f85462B = 1;
                            if (interfaceC18511r2.mo49340Uc(m145341c, m145341c2, m41524Q, c16813g) == m142578e) {
                                return m142578e;
                            }
                            interfaceC18511r3 = interfaceC18511r2;
                            i16 = size;
                            i14 += i16;
                            if (i16 < i13) {
                            }
                            i12++;
                            interfaceC18511r2 = interfaceC18511r3;
                            if (!z11) {
                            }
                            return C24848g0.f119245a;
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                ceil = (int) Math.ceil(((float) r5) / ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
                m89876z(contactProfile, this.f85390c.m2633p(mo2478b), new C16814h(ceil));
                interfaceC18511r2 = interfaceC18511r;
                str = mo2478b;
                i12 = 0;
                z11 = true;
                i13 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                i14 = 0;
                if (!z11) {
                }
                return C24848g0.f119245a;
            }
        }
        c16813g = new C16813g(continuation);
        Object obj2 = c16813g.f85470z;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16813g.f85462B;
        if (i11 == 0) {
        }
    }

    /* renamed from: D */
    public final C25823d m89852D(C17945a0 c17945a0) {
        Object m112536b;
        try {
            m112536b = BuildersKt__BuildersKt.m112536b(null, new C16815i(c17945a0, null), 1, null);
            return (C25823d) m112536b;
        } catch (Exception e11) {
            if (e11 instanceof GetBackupMetadataException) {
                GetBackupMetadataException getBackupMetadataException = (GetBackupMetadataException) e11;
                if (!AbstractC27253h.m139446k(getBackupMetadataException)) {
                    if (!AbstractC27253h.m139444i(getBackupMetadataException)) {
                        C26676b.m136954d("SMLZCloudMigrationAnalyzer", e11);
                        return null;
                    }
                    throw new Failure.NetworkError(e11.getMessage());
                }
                throw new Failure.DriveProblem(e11.getMessage());
            }
            C26676b.m136954d("SMLZCloudMigrationAnalyzer", e11);
            return null;
        }
    }

    /* renamed from: v */
    public final void m89874v(C25823d c25823d) {
        if (AbstractC27247b.m139396h(c25823d)) {
            this.f85399l.incrementAndGet();
            return;
        }
        int i11 = C16808b.f85405a[c25823d.m133191q().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        this.f85398k.incrementAndGet();
                        return;
                    }
                    return;
                }
                this.f85397j.incrementAndGet();
                return;
            }
            this.f85396i.incrementAndGet();
            return;
        }
        this.f85395h.incrementAndGet();
    }

    /* renamed from: x */
    public static /* synthetic */ Object m89875x(ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer, boolean z11, FlowCollector flowCollector, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return zaloCloudMigrationAnalyzer.m89877w(z11, flowCollector, continuation);
    }

    /* renamed from: z */
    public final void m89876z(ContactProfile contactProfile, long j11, InterfaceC18494a interfaceC18494a) {
        if (j11 >= 10000) {
            C26676b.m136957g("SMLZCloudMigrationAnalyzer", "[" + contactProfile.f42434r + "] " + interfaceC18494a.mo12V4(), null, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89877w(boolean z11, FlowCollector flowCollector, Continuation continuation) {
        C16809c c16809c;
        Object m142578e;
        int i11;
        ZaloCloudMigrationAnalyzer zaloCloudMigrationAnalyzer;
        Flow m113290h;
        if (continuation instanceof C16809c) {
            c16809c = (C16809c) continuation;
            int i12 = c16809c.f85411x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16809c.f85411x = i12 - Integer.MIN_VALUE;
                Object obj = c16809c.f85409v;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16809c.f85411x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = c16809c.f85408u;
                    flowCollector = (FlowCollector) c16809c.f85407t;
                    zaloCloudMigrationAnalyzer = (ZaloCloudMigrationAnalyzer) c16809c.f85406s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = this.f85388a;
                    c16809c.f85406s = this;
                    c16809c.f85407t = flowCollector;
                    c16809c.f85408u = z11;
                    c16809c.f85411x = 1;
                    obj = interfaceC25320d.mo131128j(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, c16809c);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationAnalyzer = this;
                }
                int intValue = ((Number) obj).intValue();
                zaloCloudMigrationAnalyzer.f85401n = true ^ C22447s.m116057s(C26263i.m135058w());
                zaloCloudMigrationAnalyzer.f85402o = z11;
                zaloCloudMigrationAnalyzer.f85403p = false;
                zaloCloudMigrationAnalyzer.f85404q = false;
                zaloCloudMigrationAnalyzer.f85395h.set(0);
                zaloCloudMigrationAnalyzer.f85396i.set(0);
                zaloCloudMigrationAnalyzer.f85397j.set(0);
                zaloCloudMigrationAnalyzer.f85398k.set(0);
                zaloCloudMigrationAnalyzer.f85399l.set(0);
                zaloCloudMigrationAnalyzer.f85400m.set(0);
                m113290h = FlowKt.m113290h(new C16810d(intValue, null));
                c16809c.f85406s = null;
                c16809c.f85407t = null;
                c16809c.f85411x = 2;
                if (m113290h.mo97893a(flowCollector, c16809c) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        c16809c = new C16809c(continuation);
        Object obj2 = c16809c.f85409v;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16809c.f85411x;
        if (i11 == 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        zaloCloudMigrationAnalyzer.f85401n = true ^ C22447s.m116057s(C26263i.m135058w());
        zaloCloudMigrationAnalyzer.f85402o = z11;
        zaloCloudMigrationAnalyzer.f85403p = false;
        zaloCloudMigrationAnalyzer.f85404q = false;
        zaloCloudMigrationAnalyzer.f85395h.set(0);
        zaloCloudMigrationAnalyzer.f85396i.set(0);
        zaloCloudMigrationAnalyzer.f85397j.set(0);
        zaloCloudMigrationAnalyzer.f85398k.set(0);
        zaloCloudMigrationAnalyzer.f85399l.set(0);
        zaloCloudMigrationAnalyzer.f85400m.set(0);
        m113290h = FlowKt.m113290h(new C16810d(intValue2, null));
        c16809c.f85406s = null;
        c16809c.f85407t = null;
        c16809c.f85411x = 2;
        if (m113290h.mo97893a(flowCollector, c16809c) == m142578e) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: y */
    public final void m89878y() {
        BuildersKt__BuildersKt.m112536b(null, new C16811e(null), 1, null);
    }
}
