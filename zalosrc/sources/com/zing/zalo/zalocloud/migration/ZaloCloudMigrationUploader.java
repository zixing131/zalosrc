package com.zing.zalo.zalocloud.migration;

import ch0.AbstractC3486a;
import ch0.AbstractC3488c;
import ch0.AbstractC3489d;
import ch0.C3487b;
import com.zing.zalo.data.zalocloud.model.api.BaseResponse;
import com.zing.zalo.data.zalocloud.model.api.MsgInfo;
import com.zing.zalo.zalocloud.backup.GetBackupMetadataException;
import com.zing.zalo.zalocloud.migration.AbstractC16866f;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dh0.C17932a;
import dj.C17945a0;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import fn0.C19071q;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import lg0.C22479c;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import me0.C23055e5;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import p348mi.AbstractC23306f;
import p452ql.AbstractC25321e;
import p452ql.InterfaceC25320d;
import p487rl.C25823d;
import p487rl.EnumC25824e;
import p487rl.EnumC25825f;
import p613wl.AbstractC29087c;
import pm0.AbstractC24845f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import qg0.AbstractC25270e;
import qg0.C25271f;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import rd0.AbstractC25752r;
import s00.AbstractC26080o;
import sg0.AbstractC26246b;
import tg0.C26675a;
import tg0.C26676b;
import ug0.AbstractC27247b;
import ug0.AbstractC27253h;
import ug0.C27246a;
import ug0.C27252g;
import ug0.C27258m;
import ug0.EnumC27250e;
import vi.C28255a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* loaded from: classes7.dex */
public final class ZaloCloudMigrationUploader {
    public static final C16816a Companion = new C16816a(null);

    /* renamed from: A */
    private int f85475A;

    /* renamed from: B */
    private boolean f85476B;

    /* renamed from: C */
    private final ConcurrentHashMap f85477C;

    /* renamed from: D */
    private boolean f85478D;

    /* renamed from: E */
    private boolean f85479E;

    /* renamed from: F */
    private boolean f85480F;

    /* renamed from: a */
    private final InterfaceC25320d f85481a;

    /* renamed from: b */
    private final InterfaceC23792b f85482b;

    /* renamed from: c */
    private final C22479c f85483c;

    /* renamed from: d */
    private final C27252g f85484d;

    /* renamed from: e */
    private final CoroutineDispatcher f85485e;

    /* renamed from: f */
    private EnumC27250e f85486f;

    /* renamed from: g */
    private volatile float f85487g;

    /* renamed from: h */
    private final AtomicInteger f85488h;

    /* renamed from: i */
    private int f85489i;

    /* renamed from: j */
    private String f85490j;

    /* renamed from: k */
    private final AtomicInteger f85491k;

    /* renamed from: l */
    private final AtomicInteger f85492l;

    /* renamed from: m */
    private final AtomicInteger f85493m;

    /* renamed from: n */
    private final AtomicInteger f85494n;

    /* renamed from: o */
    private final AtomicInteger f85495o;

    /* renamed from: p */
    private final AtomicInteger f85496p;

    /* renamed from: q */
    private final AtomicInteger f85497q;

    /* renamed from: r */
    private final AtomicInteger f85498r;

    /* renamed from: s */
    private final AtomicInteger f85499s;

    /* renamed from: t */
    private final AtomicInteger f85500t;

    /* renamed from: u */
    private final AtomicInteger f85501u;

    /* renamed from: v */
    private final AtomicInteger f85502v;

    /* renamed from: w */
    private final AtomicInteger f85503w;

    /* renamed from: x */
    private final AtomicInteger f85504x;

    /* renamed from: y */
    private final AtomicInteger f85505y;

    /* renamed from: z */
    private int f85506z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static abstract class Failure extends Exception {

        /* renamed from: p */
        private final boolean f85507p;

        /* loaded from: classes7.dex */
        public static final class BatteryLow extends Failure {
        }

        /* loaded from: classes7.dex */
        public static final class DriveProblem extends Failure {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DriveProblem(String str) {
                super(null, null, false, 4, null);
                AbstractC19074t.m100208f(str, "message");
            }
        }

        /* loaded from: classes7.dex */
        public static final class NetworkNotAvailable extends Failure {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkNotAvailable(String str) {
                super(str, null, false, 4, null);
                AbstractC19074t.m100208f(str, "message");
            }
        }

        /* loaded from: classes7.dex */
        public static final class NetworkWifi extends Failure {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkWifi(String str) {
                super(str, null, false, 4, null);
                AbstractC19074t.m100208f(str, "message");
            }
        }

        /* loaded from: classes7.dex */
        public static class RuntimeError extends Failure {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RuntimeError(String str, boolean z11) {
                super(null, 0 == true ? 1 : 0, z11, 0 == true ? 1 : 0);
                AbstractC19074t.m100208f(str, "message");
            }
        }

        /* loaded from: classes7.dex */
        public static final class ServerQuotaExceeded extends RuntimeError {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ServerQuotaExceeded(String str) {
                super(str, true);
                AbstractC19074t.m100208f(str, "message");
            }
        }

        /* loaded from: classes7.dex */
        public static final class StorageNotAvailable extends Failure {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StorageNotAvailable(String str) {
                super(null, null, false, 4, null);
                AbstractC19074t.m100208f(str, "message");
            }
        }

        /* loaded from: classes7.dex */
        public static final class SubscriptionExpired extends Failure {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubscriptionExpired(String str) {
                super(null, null, false, 4, null);
                AbstractC19074t.m100208f(str, "message");
            }
        }

        public /* synthetic */ Failure(String str, Throwable th2, boolean z11, AbstractC19060k abstractC19060k) {
            this(str, th2, z11);
        }

        /* renamed from: a */
        public final boolean m89970a() {
            return this.f85507p;
        }

        public /* synthetic */ Failure(String str, Throwable th2, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(str, th2, (i11 & 4) != 0 ? false : z11, null);
        }

        private Failure(String str, Throwable th2, boolean z11) {
            super(str, th2);
            this.f85507p = z11;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$a */
    /* loaded from: classes7.dex */
    public static final class C16816a {
        private C16816a() {
        }

        public /* synthetic */ C16816a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$a0 */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16817a0 extends C19071q implements InterfaceC18510q {
        C16817a0(Object obj) {
            super(3, obj, AbstractC25321e.class, "getAllServerItems", "getAllServerItems(Lcom/zing/zalo/data/zalocloud/migration/ZaloCloudMigrationRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m89971h(((Number) obj).intValue(), ((Number) obj2).intValue(), (Continuation) obj3);
        }

        /* renamed from: h */
        public final Object m89971h(int i11, int i12, Continuation continuation) {
            List m131496e;
            List m131505m;
            InterfaceC25320d interfaceC25320d = (InterfaceC25320d) this.f94922q;
            m131496e = AbstractC25366r.m131496e(EnumC25825f.f123208q);
            m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
            return interfaceC25320d.mo131131m(m131496e, m131505m, i11, i12, continuation);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16818b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85508a;

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
            f85508a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$b0 */
    /* loaded from: classes7.dex */
    public static final class C16819b0 extends AbstractC29104l implements InterfaceC18511r {

        /* renamed from: A */
        final /* synthetic */ int f85509A;

        /* renamed from: t */
        int f85510t;

        /* renamed from: u */
        /* synthetic */ int f85511u;

        /* renamed from: v */
        /* synthetic */ int f85512v;

        /* renamed from: w */
        /* synthetic */ Object f85513w;

        /* renamed from: y */
        final /* synthetic */ CoroutineScope f85515y;

        /* renamed from: z */
        final /* synthetic */ ProducerScope f85516z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16819b0(CoroutineScope coroutineScope, ProducerScope producerScope, int i11, Continuation continuation) {
            super(4, continuation);
            this.f85515y = coroutineScope;
            this.f85516z = producerScope;
            this.f85509A = i11;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            return m89972r(((Number) obj).intValue(), ((Number) obj2).intValue(), (List) obj3, (Continuation) obj4);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85510t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                int i12 = this.f85511u;
                int i13 = this.f85512v;
                List list = (List) this.f85513w;
                C26676b.m136952b("SMLZCloudMigrationUploader", "doUploadServerItemsPaging(): Process on page=" + i12 + ", offset=" + i13 + ", pagedItemSize=" + list.size());
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                CoroutineScope coroutineScope = this.f85515y;
                ProducerScope producerScope = this.f85516z;
                int i14 = this.f85509A;
                this.f85510t = 1;
                obj = zaloCloudMigrationUploader.m89922c0(coroutineScope, producerScope, list, i14, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Object m89972r(int i11, int i12, List list, Continuation continuation) {
            C16819b0 c16819b0 = new C16819b0(this.f85515y, this.f85516z, this.f85509A, continuation);
            c16819b0.f85511u = i11;
            c16819b0.f85512v = i12;
            c16819b0.f85513w = list;
            return c16819b0.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$c */
    /* loaded from: classes7.dex */
    public static final class C16820c extends AbstractC29096d {

        /* renamed from: s */
        Object f85517s;

        /* renamed from: t */
        Object f85518t;

        /* renamed from: u */
        /* synthetic */ Object f85519u;

        /* renamed from: w */
        int f85521w;

        C16820c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85519u = obj;
            this.f85521w |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89908Q(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$c0 */
    /* loaded from: classes7.dex */
    public static final class C16821c0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85522t;

        /* renamed from: u */
        private /* synthetic */ Object f85523u;

        /* renamed from: w */
        final /* synthetic */ C25823d f85525w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16821c0(C25823d c25823d, Continuation continuation) {
            super(2, continuation);
            this.f85525w = c25823d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16821c0 c16821c0 = new C16821c0(this.f85525w, continuation);
            c16821c0.f85523u = obj;
            return c16821c0;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x00de  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            Object m116232d;
            Object m139421h;
            C27246a c27246a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85522t;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            m139421h = obj;
                            c27246a = (C27246a) m139421h;
                            if (c27246a.m139388d()) {
                                C26675a.m136890L(C26675a.f126213a, 1504412, c27246a.m139385a(), null, null, 0L, 0L, 60, null);
                            }
                            return m139421h;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.f85523u;
                    AbstractC24862s.m129228b(obj);
                    m116232d = obj;
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f85523u;
                    ZaloCloudMigrationUploader.this.m89906O(this.f85525w);
                    C26676b.m136960j("SMLZCloudMigrationUploader", "Start download backup file");
                    if (this.f85525w.m133183i().m106830b()) {
                        C26676b.m136960j("SMLZCloudMigrationUploader", "Backup file existed");
                        return new C27246a(this.f85525w.m133182h(), 0, false, 2, null);
                    }
                    C17945a0 m133176a = this.f85525w.m133176a();
                    C22479c c22479c = ZaloCloudMigrationUploader.this.f85483c;
                    this.f85523u = coroutineScope;
                    this.f85522t = 1;
                    m116232d = c22479c.m116232d(m133176a, this);
                    if (m116232d == m142578e) {
                        return m142578e;
                    }
                }
                C28255a c28255a = (C28255a) m116232d;
                if (c28255a == null) {
                    ZaloCloudMigrationUploader.this.m89969m0("SMLZCloudMigrationUploader", "Backup file metadata not found, item=" + this.f85525w, C26676b.b.f126335t);
                    C26675a.m136890L(C26675a.f126213a, 1504412, 104, null, null, 0L, 0L, 60, null);
                    return new C27246a(null, 104, false, 5, null);
                }
                CoroutineScopeKt.m112641e(coroutineScope);
                C27252g c27252g = ZaloCloudMigrationUploader.this.f85484d;
                C25823d c25823d = this.f85525w;
                this.f85523u = null;
                this.f85522t = 2;
                m139421h = c27252g.m139421h(c25823d, c28255a, this);
                if (m139421h == m142578e) {
                    return m142578e;
                }
                c27246a = (C27246a) m139421h;
                if (c27246a.m139388d()) {
                }
                return m139421h;
            } catch (GetBackupMetadataException e11) {
                ZaloCloudMigrationUploader.this.m89969m0("SMLZCloudMigrationUploader", "Backup file metadata load failed: " + e11 + ", item=" + this.f85525w, C26676b.b.f126335t);
                C26675a.m136890L(C26675a.f126213a, 1504412, e11.m89735a(), null, null, 0L, 0L, 60, null);
                if (!AbstractC27253h.m139446k(e11)) {
                    if (AbstractC27253h.m139444i(e11)) {
                        ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Backup item upload failed due to network error: " + e11, null, 4, null);
                    }
                    return new C27246a(null, 105, false, 5, null);
                }
                throw new Failure.DriveProblem("Backup file metadata load failed: " + e11);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16821c0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$d */
    /* loaded from: classes7.dex */
    public static final class C16822d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ ConcurrentHashMap f85526q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16822d(ConcurrentHashMap concurrentHashMap) {
            super(1);
            this.f85526q = concurrentHashMap;
        }

        /* renamed from: a */
        public final void m89974a(C25823d c25823d) {
            AbstractC19074t.m100208f(c25823d, "it");
            this.f85526q.putIfAbsent(c25823d.m133186l(), c25823d);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m89974a((C25823d) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$d0 */
    /* loaded from: classes7.dex */
    public static final class C16823d0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        int f85527A;

        /* renamed from: B */
        int f85528B;

        /* renamed from: C */
        int f85529C;

        /* renamed from: D */
        int f85530D;

        /* renamed from: E */
        int f85531E;

        /* renamed from: t */
        int f85533t;

        /* renamed from: u */
        int f85534u;

        /* renamed from: v */
        int f85535v;

        /* renamed from: w */
        int f85536w;

        /* renamed from: x */
        int f85537x;

        /* renamed from: y */
        int f85538y;

        /* renamed from: z */
        int f85539z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$d0$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final a f85540q = new a();

            a() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence mo205i9(C25823d c25823d) {
                AbstractC19074t.m100208f(c25823d, "it");
                return c25823d.m133185k().m41044h();
            }
        }

        C16823d0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16823d0(continuation);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x03b2  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x036a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x036b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x031d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x031e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x02e1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x02e2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x029e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0266 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0267  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x022b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0193 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x016a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0144 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x038a  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object mo131128j;
            int intValue;
            Object m131138a;
            int intValue2;
            List m131496e;
            List m131496e2;
            Object mo131121c;
            int i11;
            List m131496e3;
            List m131496e4;
            Object mo131121c2;
            int i12;
            int i13;
            List m131496e5;
            List m131496e6;
            Object mo131121c3;
            int i14;
            int i15;
            int i16;
            int i17;
            List m131496e7;
            List m131496e8;
            Object mo131121c4;
            int i18;
            int i19;
            List m131496e9;
            List m131496e10;
            Object mo131121c5;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            List m131496e11;
            List m131496e12;
            Object mo131121c6;
            int i27;
            int i28;
            List m131496e13;
            List m131496e14;
            Object mo131121c7;
            int i29;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            List m131496e15;
            List m131496e16;
            Object mo131121c8;
            int i38;
            int i39;
            int intValue3;
            List m131496e17;
            List m131496e18;
            Object mo131121c9;
            int i41;
            int i42;
            int i43;
            int i44;
            int i45;
            int i46;
            int i47;
            int i48;
            int i49;
            int intValue4;
            List m131496e19;
            Object m131138a2;
            int i51;
            int i52;
            int i53;
            int i54;
            int i55;
            int i56;
            int i57;
            int i58;
            int i59;
            int i61;
            String str;
            String m127130z;
            String m127130z2;
            m142578e = AbstractC28298d.m142578e();
            switch (this.f85531E) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = ZaloCloudMigrationUploader.this.f85481a;
                    this.f85531E = 1;
                    mo131128j = interfaceC25320d.mo131128j(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, this);
                    if (mo131128j == m142578e) {
                        return m142578e;
                    }
                    intValue = ((Number) mo131128j).intValue();
                    InterfaceC25320d interfaceC25320d2 = ZaloCloudMigrationUploader.this.f85481a;
                    this.f85533t = intValue;
                    this.f85531E = 2;
                    m131138a = InterfaceC25320d.a.m131138a(interfaceC25320d2, null, null, this, 3, null);
                    if (m131138a == m142578e) {
                        return m142578e;
                    }
                    intValue2 = ((Number) m131138a).intValue();
                    InterfaceC25320d interfaceC25320d3 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e = AbstractC25366r.m131496e(EnumC25824e.f123202r);
                    m131496e2 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85533t = intValue;
                    this.f85534u = intValue2;
                    this.f85531E = 3;
                    mo131121c = interfaceC25320d3.mo131121c(m131496e2, m131496e, this);
                    if (mo131121c == m142578e) {
                        return m142578e;
                    }
                    i11 = intValue;
                    int intValue5 = ((Number) mo131121c).intValue();
                    InterfaceC25320d interfaceC25320d4 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e3 = AbstractC25366r.m131496e(EnumC25824e.f123203s);
                    m131496e4 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85533t = i11;
                    this.f85534u = intValue2;
                    this.f85535v = intValue5;
                    this.f85531E = 4;
                    mo131121c2 = interfaceC25320d4.mo131121c(m131496e4, m131496e3, this);
                    if (mo131121c2 != m142578e) {
                        return m142578e;
                    }
                    i12 = intValue2;
                    i13 = intValue5;
                    int intValue6 = ((Number) mo131121c2).intValue();
                    InterfaceC25320d interfaceC25320d5 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e5 = AbstractC25366r.m131496e(EnumC25824e.f123204t);
                    m131496e6 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85533t = i11;
                    this.f85534u = i12;
                    this.f85535v = i13;
                    this.f85536w = intValue6;
                    this.f85531E = 5;
                    mo131121c3 = interfaceC25320d5.mo131121c(m131496e6, m131496e5, this);
                    if (mo131121c3 != m142578e) {
                        return m142578e;
                    }
                    int i62 = i11;
                    i14 = i13;
                    i15 = i62;
                    i16 = i12;
                    i17 = intValue6;
                    int intValue7 = ((Number) mo131121c3).intValue();
                    InterfaceC25320d interfaceC25320d6 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e7 = AbstractC25366r.m131496e(EnumC25824e.f123202r);
                    m131496e8 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85533t = i15;
                    this.f85534u = i16;
                    this.f85535v = i14;
                    this.f85536w = i17;
                    this.f85537x = intValue7;
                    this.f85531E = 6;
                    mo131121c4 = interfaceC25320d6.mo131121c(m131496e8, m131496e7, this);
                    if (mo131121c4 != m142578e) {
                        return m142578e;
                    }
                    i18 = i15;
                    i19 = intValue7;
                    int intValue8 = ((Number) mo131121c4).intValue();
                    InterfaceC25320d interfaceC25320d7 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e9 = AbstractC25366r.m131496e(EnumC25824e.f123203s);
                    m131496e10 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85533t = i18;
                    this.f85534u = i16;
                    this.f85535v = i14;
                    this.f85536w = i17;
                    this.f85537x = i19;
                    this.f85538y = intValue8;
                    this.f85531E = 7;
                    mo131121c5 = interfaceC25320d7.mo131121c(m131496e10, m131496e9, this);
                    if (mo131121c5 != m142578e) {
                        return m142578e;
                    }
                    int i63 = i14;
                    i21 = i19;
                    i22 = i18;
                    i23 = i63;
                    int i64 = i16;
                    i24 = i17;
                    i25 = intValue8;
                    i26 = i64;
                    int intValue9 = ((Number) mo131121c5).intValue();
                    InterfaceC25320d interfaceC25320d8 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e11 = AbstractC25366r.m131496e(EnumC25824e.f123204t);
                    m131496e12 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85533t = i22;
                    this.f85534u = i26;
                    this.f85535v = i23;
                    this.f85536w = i24;
                    this.f85537x = i21;
                    this.f85538y = i25;
                    this.f85539z = intValue9;
                    this.f85531E = 8;
                    mo131121c6 = interfaceC25320d8.mo131121c(m131496e12, m131496e11, this);
                    if (mo131121c6 != m142578e) {
                        return m142578e;
                    }
                    i27 = i22;
                    i28 = intValue9;
                    int intValue10 = ((Number) mo131121c6).intValue();
                    InterfaceC25320d interfaceC25320d9 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e13 = AbstractC25366r.m131496e(EnumC25824e.f123202r);
                    m131496e14 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85533t = i27;
                    this.f85534u = i26;
                    this.f85535v = i23;
                    this.f85536w = i24;
                    this.f85537x = i21;
                    this.f85538y = i25;
                    this.f85539z = i28;
                    this.f85527A = intValue10;
                    this.f85531E = 9;
                    mo131121c7 = interfaceC25320d9.mo131121c(m131496e14, m131496e13, this);
                    if (mo131121c7 != m142578e) {
                        return m142578e;
                    }
                    int i65 = i21;
                    i29 = i28;
                    i31 = i27;
                    i32 = i23;
                    i33 = i65;
                    int i66 = i24;
                    i34 = i25;
                    i35 = intValue10;
                    i36 = i26;
                    i37 = i66;
                    int intValue11 = ((Number) mo131121c7).intValue();
                    InterfaceC25320d interfaceC25320d10 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e15 = AbstractC25366r.m131496e(EnumC25824e.f123203s);
                    m131496e16 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85533t = i31;
                    this.f85534u = i36;
                    this.f85535v = i32;
                    this.f85536w = i37;
                    this.f85537x = i33;
                    this.f85538y = i34;
                    this.f85539z = i29;
                    this.f85527A = i35;
                    this.f85528B = intValue11;
                    this.f85531E = 10;
                    mo131121c8 = interfaceC25320d10.mo131121c(m131496e16, m131496e15, this);
                    if (mo131121c8 != m142578e) {
                        return m142578e;
                    }
                    i38 = i31;
                    i39 = intValue11;
                    intValue3 = ((Number) mo131121c8).intValue();
                    InterfaceC25320d interfaceC25320d11 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e17 = AbstractC25366r.m131496e(EnumC25824e.f123204t);
                    m131496e18 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85533t = i38;
                    this.f85534u = i36;
                    this.f85535v = i32;
                    this.f85536w = i37;
                    this.f85537x = i33;
                    this.f85538y = i34;
                    this.f85539z = i29;
                    this.f85527A = i35;
                    this.f85528B = i39;
                    this.f85529C = intValue3;
                    this.f85531E = 11;
                    mo131121c9 = interfaceC25320d11.mo131121c(m131496e18, m131496e17, this);
                    if (mo131121c9 != m142578e) {
                        return m142578e;
                    }
                    i41 = i34;
                    i42 = i33;
                    i43 = i37;
                    i44 = i32;
                    i45 = i36;
                    i46 = i38;
                    i47 = i39;
                    i48 = i35;
                    i49 = i29;
                    intValue4 = ((Number) mo131121c9).intValue();
                    InterfaceC25320d interfaceC25320d12 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e19 = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                    this.f85533t = i46;
                    this.f85534u = i45;
                    this.f85535v = i44;
                    this.f85536w = i43;
                    this.f85537x = i42;
                    this.f85538y = i41;
                    this.f85539z = i49;
                    this.f85527A = i48;
                    this.f85528B = i47;
                    this.f85529C = intValue3;
                    this.f85530D = intValue4;
                    this.f85531E = 12;
                    int i67 = i46;
                    int i68 = i45;
                    int i69 = i44;
                    m131138a2 = InterfaceC25320d.a.m131138a(interfaceC25320d12, m131496e19, null, this, 2, null);
                    if (m131138a2 != m142578e) {
                        return m142578e;
                    }
                    i51 = i47;
                    i52 = i48;
                    i53 = i49;
                    i54 = intValue3;
                    i55 = i41;
                    i56 = i42;
                    i57 = i43;
                    i58 = i69;
                    i59 = i67;
                    i61 = i68;
                    int intValue12 = ((Number) m131138a2).intValue();
                    if (ZaloCloudMigrationUploader.this.f85477C.isEmpty()) {
                        Collection values = ZaloCloudMigrationUploader.this.f85477C.values();
                        AbstractC19074t.m100207e(values, "<get-values>(...)");
                        str = AbstractC25332a0.m131214n0(values, null, null, null, 0, null, a.f85540q, 31, null);
                    } else {
                        str = "None";
                    }
                    m127130z = AbstractC24341v.m127130z("─", 23);
                    boolean z11 = ZaloCloudMigrationUploader.this.f85480F;
                    boolean z12 = ZaloCloudMigrationUploader.this.f85478D;
                    m127130z2 = AbstractC24341v.m127130z("─", 50);
                    AbstractC20110a.f98889a.m104564x("SMLZCloudMigrationUploader").mo104556o(8, m127130z + "\nautoRetryAttemptCount: " + i59 + "\ntotalSuccess: " + (i58 + i55 + i51) + "/" + i61 + "\nserverItems: success=" + i58 + ", failed=" + i57 + ", skipped=" + i56 + "\nlocalItems: success=" + i55 + ", failed=" + i53 + ", skipped=" + i52 + "\nbackupItems: success=" + i51 + ", failed=" + i54 + ", skipped=" + intValue4 + "\npotentiallyBackupItems: total=" + intValue12 + "\ncurrentProcessingItems: " + str + "\nisDriveErrorSkipped: " + z11 + "\nisCancellationExceptionThrown: " + z12 + "\n" + m127130z2, new Object[0]);
                    return C24848g0.f119245a;
                case 1:
                    AbstractC24862s.m129228b(obj);
                    mo131128j = obj;
                    intValue = ((Number) mo131128j).intValue();
                    InterfaceC25320d interfaceC25320d22 = ZaloCloudMigrationUploader.this.f85481a;
                    this.f85533t = intValue;
                    this.f85531E = 2;
                    m131138a = InterfaceC25320d.a.m131138a(interfaceC25320d22, null, null, this, 3, null);
                    if (m131138a == m142578e) {
                    }
                    intValue2 = ((Number) m131138a).intValue();
                    InterfaceC25320d interfaceC25320d32 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e = AbstractC25366r.m131496e(EnumC25824e.f123202r);
                    m131496e2 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85533t = intValue;
                    this.f85534u = intValue2;
                    this.f85531E = 3;
                    mo131121c = interfaceC25320d32.mo131121c(m131496e2, m131496e, this);
                    if (mo131121c == m142578e) {
                    }
                    break;
                case 2:
                    int i71 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    intValue = i71;
                    m131138a = obj;
                    intValue2 = ((Number) m131138a).intValue();
                    InterfaceC25320d interfaceC25320d322 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e = AbstractC25366r.m131496e(EnumC25824e.f123202r);
                    m131496e2 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85533t = intValue;
                    this.f85534u = intValue2;
                    this.f85531E = 3;
                    mo131121c = interfaceC25320d322.mo131121c(m131496e2, m131496e, this);
                    if (mo131121c == m142578e) {
                    }
                    break;
                case 3:
                    intValue2 = this.f85534u;
                    int i72 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    i11 = i72;
                    mo131121c = obj;
                    int intValue52 = ((Number) mo131121c).intValue();
                    InterfaceC25320d interfaceC25320d42 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e3 = AbstractC25366r.m131496e(EnumC25824e.f123203s);
                    m131496e4 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85533t = i11;
                    this.f85534u = intValue2;
                    this.f85535v = intValue52;
                    this.f85531E = 4;
                    mo131121c2 = interfaceC25320d42.mo131121c(m131496e4, m131496e3, this);
                    if (mo131121c2 != m142578e) {
                    }
                    break;
                case 4:
                    i13 = this.f85535v;
                    i12 = this.f85534u;
                    i11 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c2 = obj;
                    int intValue62 = ((Number) mo131121c2).intValue();
                    InterfaceC25320d interfaceC25320d52 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e5 = AbstractC25366r.m131496e(EnumC25824e.f123204t);
                    m131496e6 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85533t = i11;
                    this.f85534u = i12;
                    this.f85535v = i13;
                    this.f85536w = intValue62;
                    this.f85531E = 5;
                    mo131121c3 = interfaceC25320d52.mo131121c(m131496e6, m131496e5, this);
                    if (mo131121c3 != m142578e) {
                    }
                    break;
                case 5:
                    int i73 = this.f85536w;
                    int i74 = this.f85535v;
                    int i75 = this.f85534u;
                    int i76 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c3 = obj;
                    i17 = i73;
                    i15 = i76;
                    i16 = i75;
                    i14 = i74;
                    int intValue72 = ((Number) mo131121c3).intValue();
                    InterfaceC25320d interfaceC25320d62 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e7 = AbstractC25366r.m131496e(EnumC25824e.f123202r);
                    m131496e8 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85533t = i15;
                    this.f85534u = i16;
                    this.f85535v = i14;
                    this.f85536w = i17;
                    this.f85537x = intValue72;
                    this.f85531E = 6;
                    mo131121c4 = interfaceC25320d62.mo131121c(m131496e8, m131496e7, this);
                    if (mo131121c4 != m142578e) {
                    }
                    break;
                case 6:
                    i19 = this.f85537x;
                    i17 = this.f85536w;
                    i14 = this.f85535v;
                    i16 = this.f85534u;
                    i18 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c4 = obj;
                    int intValue82 = ((Number) mo131121c4).intValue();
                    InterfaceC25320d interfaceC25320d72 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e9 = AbstractC25366r.m131496e(EnumC25824e.f123203s);
                    m131496e10 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85533t = i18;
                    this.f85534u = i16;
                    this.f85535v = i14;
                    this.f85536w = i17;
                    this.f85537x = i19;
                    this.f85538y = intValue82;
                    this.f85531E = 7;
                    mo131121c5 = interfaceC25320d72.mo131121c(m131496e10, m131496e9, this);
                    if (mo131121c5 != m142578e) {
                    }
                    break;
                case 7:
                    int i77 = this.f85538y;
                    int i78 = this.f85537x;
                    int i79 = this.f85536w;
                    int i81 = this.f85535v;
                    int i82 = this.f85534u;
                    int i83 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c5 = obj;
                    i25 = i77;
                    i22 = i83;
                    i26 = i82;
                    i23 = i81;
                    i24 = i79;
                    i21 = i78;
                    int intValue92 = ((Number) mo131121c5).intValue();
                    InterfaceC25320d interfaceC25320d82 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e11 = AbstractC25366r.m131496e(EnumC25824e.f123204t);
                    m131496e12 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85533t = i22;
                    this.f85534u = i26;
                    this.f85535v = i23;
                    this.f85536w = i24;
                    this.f85537x = i21;
                    this.f85538y = i25;
                    this.f85539z = intValue92;
                    this.f85531E = 8;
                    mo131121c6 = interfaceC25320d82.mo131121c(m131496e12, m131496e11, this);
                    if (mo131121c6 != m142578e) {
                    }
                    break;
                case 8:
                    i28 = this.f85539z;
                    i25 = this.f85538y;
                    i21 = this.f85537x;
                    i24 = this.f85536w;
                    i23 = this.f85535v;
                    i26 = this.f85534u;
                    i27 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c6 = obj;
                    int intValue102 = ((Number) mo131121c6).intValue();
                    InterfaceC25320d interfaceC25320d92 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e13 = AbstractC25366r.m131496e(EnumC25824e.f123202r);
                    m131496e14 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85533t = i27;
                    this.f85534u = i26;
                    this.f85535v = i23;
                    this.f85536w = i24;
                    this.f85537x = i21;
                    this.f85538y = i25;
                    this.f85539z = i28;
                    this.f85527A = intValue102;
                    this.f85531E = 9;
                    mo131121c7 = interfaceC25320d92.mo131121c(m131496e14, m131496e13, this);
                    if (mo131121c7 != m142578e) {
                    }
                    break;
                case 9:
                    int i84 = this.f85527A;
                    int i85 = this.f85539z;
                    int i86 = this.f85538y;
                    int i87 = this.f85537x;
                    int i88 = this.f85536w;
                    int i89 = this.f85535v;
                    int i91 = this.f85534u;
                    int i92 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c7 = obj;
                    i35 = i84;
                    i31 = i92;
                    i36 = i91;
                    i32 = i89;
                    i37 = i88;
                    i33 = i87;
                    i34 = i86;
                    i29 = i85;
                    int intValue112 = ((Number) mo131121c7).intValue();
                    InterfaceC25320d interfaceC25320d102 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e15 = AbstractC25366r.m131496e(EnumC25824e.f123203s);
                    m131496e16 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85533t = i31;
                    this.f85534u = i36;
                    this.f85535v = i32;
                    this.f85536w = i37;
                    this.f85537x = i33;
                    this.f85538y = i34;
                    this.f85539z = i29;
                    this.f85527A = i35;
                    this.f85528B = intValue112;
                    this.f85531E = 10;
                    mo131121c8 = interfaceC25320d102.mo131121c(m131496e16, m131496e15, this);
                    if (mo131121c8 != m142578e) {
                    }
                    break;
                case 10:
                    i39 = this.f85528B;
                    i35 = this.f85527A;
                    i29 = this.f85539z;
                    i34 = this.f85538y;
                    i33 = this.f85537x;
                    i37 = this.f85536w;
                    i32 = this.f85535v;
                    i36 = this.f85534u;
                    i38 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c8 = obj;
                    intValue3 = ((Number) mo131121c8).intValue();
                    InterfaceC25320d interfaceC25320d112 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e17 = AbstractC25366r.m131496e(EnumC25824e.f123204t);
                    m131496e18 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85533t = i38;
                    this.f85534u = i36;
                    this.f85535v = i32;
                    this.f85536w = i37;
                    this.f85537x = i33;
                    this.f85538y = i34;
                    this.f85539z = i29;
                    this.f85527A = i35;
                    this.f85528B = i39;
                    this.f85529C = intValue3;
                    this.f85531E = 11;
                    mo131121c9 = interfaceC25320d112.mo131121c(m131496e18, m131496e17, this);
                    if (mo131121c9 != m142578e) {
                    }
                    break;
                case 11:
                    int i93 = this.f85529C;
                    int i94 = this.f85528B;
                    int i95 = this.f85527A;
                    int i96 = this.f85539z;
                    int i97 = this.f85538y;
                    int i98 = this.f85537x;
                    int i99 = this.f85536w;
                    int i100 = this.f85535v;
                    int i101 = this.f85534u;
                    int i102 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    mo131121c9 = obj;
                    i41 = i97;
                    i42 = i98;
                    i43 = i99;
                    i44 = i100;
                    i45 = i101;
                    i47 = i94;
                    i48 = i95;
                    i49 = i96;
                    i46 = i102;
                    intValue3 = i93;
                    intValue4 = ((Number) mo131121c9).intValue();
                    InterfaceC25320d interfaceC25320d122 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e19 = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                    this.f85533t = i46;
                    this.f85534u = i45;
                    this.f85535v = i44;
                    this.f85536w = i43;
                    this.f85537x = i42;
                    this.f85538y = i41;
                    this.f85539z = i49;
                    this.f85527A = i48;
                    this.f85528B = i47;
                    this.f85529C = intValue3;
                    this.f85530D = intValue4;
                    this.f85531E = 12;
                    int i672 = i46;
                    int i682 = i45;
                    int i692 = i44;
                    m131138a2 = InterfaceC25320d.a.m131138a(interfaceC25320d122, m131496e19, null, this, 2, null);
                    if (m131138a2 != m142578e) {
                    }
                    break;
                case 12:
                    int i103 = this.f85530D;
                    i54 = this.f85529C;
                    i51 = this.f85528B;
                    i52 = this.f85527A;
                    i53 = this.f85539z;
                    i55 = this.f85538y;
                    i56 = this.f85537x;
                    i57 = this.f85536w;
                    i58 = this.f85535v;
                    i61 = this.f85534u;
                    i59 = this.f85533t;
                    AbstractC24862s.m129228b(obj);
                    intValue4 = i103;
                    m131138a2 = obj;
                    int intValue122 = ((Number) m131138a2).intValue();
                    if (ZaloCloudMigrationUploader.this.f85477C.isEmpty()) {
                    }
                    m127130z = AbstractC24341v.m127130z("─", 23);
                    boolean z112 = ZaloCloudMigrationUploader.this.f85480F;
                    boolean z122 = ZaloCloudMigrationUploader.this.f85478D;
                    m127130z2 = AbstractC24341v.m127130z("─", 50);
                    AbstractC20110a.f98889a.m104564x("SMLZCloudMigrationUploader").mo104556o(8, m127130z + "\nautoRetryAttemptCount: " + i59 + "\ntotalSuccess: " + (i58 + i55 + i51) + "/" + i61 + "\nserverItems: success=" + i58 + ", failed=" + i57 + ", skipped=" + i56 + "\nlocalItems: success=" + i55 + ", failed=" + i53 + ", skipped=" + i52 + "\nbackupItems: success=" + i51 + ", failed=" + i54 + ", skipped=" + intValue4 + "\npotentiallyBackupItems: total=" + intValue122 + "\ncurrentProcessingItems: " + str + "\nisDriveErrorSkipped: " + z112 + "\nisCancellationExceptionThrown: " + z122 + "\n" + m127130z2, new Object[0]);
                    return C24848g0.f119245a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16823d0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$e */
    /* loaded from: classes7.dex */
    public static final class C16824e extends AbstractC29096d {

        /* renamed from: s */
        Object f85541s;

        /* renamed from: t */
        Object f85542t;

        /* renamed from: u */
        /* synthetic */ Object f85543u;

        /* renamed from: w */
        int f85545w;

        C16824e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85543u = obj;
            this.f85545w |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89909R(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$e0 */
    /* loaded from: classes7.dex */
    public static final class C16825e0 extends AbstractC29096d {

        /* renamed from: s */
        Object f85546s;

        /* renamed from: t */
        /* synthetic */ Object f85547t;

        /* renamed from: v */
        int f85549v;

        C16825e0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85547t = obj;
            this.f85549v |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89937k0(0L, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$f */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16826f extends C19071q implements InterfaceC18510q {
        C16826f(Object obj) {
            super(3, obj, AbstractC25321e.class, "getAllPotentiallyBackupItems", "getAllPotentiallyBackupItems(Lcom/zing/zalo/data/zalocloud/migration/ZaloCloudMigrationRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m89977h(((Number) obj).intValue(), ((Number) obj2).intValue(), (Continuation) obj3);
        }

        /* renamed from: h */
        public final Object m89977h(int i11, int i12, Continuation continuation) {
            List m131496e;
            InterfaceC25320d interfaceC25320d = (InterfaceC25320d) this.f94922q;
            m131496e = AbstractC25366r.m131496e(EnumC25825f.f123211t);
            return InterfaceC25320d.a.m131141d(interfaceC25320d, m131496e, null, i11, i12, continuation, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$f0 */
    /* loaded from: classes7.dex */
    public static final class C16827f0 extends AbstractC29096d {

        /* renamed from: s */
        Object f85550s;

        /* renamed from: t */
        Object f85551t;

        /* renamed from: u */
        Object f85552u;

        /* renamed from: v */
        long f85553v;

        /* renamed from: w */
        /* synthetic */ Object f85554w;

        /* renamed from: y */
        int f85556y;

        C16827f0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85554w = obj;
            this.f85556y |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89946p0(null, 0L, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$g */
    /* loaded from: classes7.dex */
    public static final class C16828g extends AbstractC29104l implements InterfaceC18511r {

        /* renamed from: t */
        int f85557t;

        /* renamed from: u */
        /* synthetic */ int f85558u;

        /* renamed from: v */
        /* synthetic */ int f85559v;

        /* renamed from: w */
        /* synthetic */ Object f85560w;

        /* renamed from: y */
        final /* synthetic */ CoroutineScope f85562y;

        /* renamed from: z */
        final /* synthetic */ C19055h0 f85563z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16828g(CoroutineScope coroutineScope, C19055h0 c19055h0, Continuation continuation) {
            super(4, continuation);
            this.f85562y = coroutineScope;
            this.f85563z = c19055h0;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            return m89978r(((Number) obj).intValue(), ((Number) obj2).intValue(), (List) obj3, (Continuation) obj4);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85557t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                int i12 = this.f85558u;
                int i13 = this.f85559v;
                List list = (List) this.f85560w;
                C26676b.m136952b("SMLZCloudMigrationUploader", "doReanalyzePotentiallyBackupItemsPaging(): Process on page=" + i12 + ", offset=" + i13 + ", pagedItemSize=" + list.size());
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                CoroutineScope coroutineScope = this.f85562y;
                this.f85557t = 1;
                obj = ZaloCloudMigrationUploader.m89964y0(zaloCloudMigrationUploader, coroutineScope, list, null, this, 4, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            this.f85563z.f94931p += ((Number) obj).intValue();
            return obj;
        }

        /* renamed from: r */
        public final Object m89978r(int i11, int i12, List list, Continuation continuation) {
            C16828g c16828g = new C16828g(this.f85562y, this.f85563z, continuation);
            c16828g.f85558u = i11;
            c16828g.f85559v = i12;
            c16828g.f85560w = list;
            return c16828g.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$g0 */
    /* loaded from: classes7.dex */
    public static final class C16829g0 extends AbstractC29096d {

        /* renamed from: s */
        Object f85564s;

        /* renamed from: t */
        Object f85565t;

        /* renamed from: u */
        /* synthetic */ Object f85566u;

        /* renamed from: w */
        int f85568w;

        C16829g0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85566u = obj;
            this.f85568w |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89948q0(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$h */
    /* loaded from: classes7.dex */
    public static final class C16830h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85569t;

        /* renamed from: u */
        private /* synthetic */ Object f85570u;

        C16830h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16830h c16830h = new C16830h(continuation);
            c16830h.f85570u = obj;
            return c16830h;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85569t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ProducerScope producerScope = (ProducerScope) this.f85570u;
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                this.f85569t = 1;
                if (zaloCloudMigrationUploader.m89914X(producerScope, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
            return ((C16830h) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$h0 */
    /* loaded from: classes7.dex */
    public static final class C16831h0 extends AbstractC29096d {

        /* renamed from: s */
        Object f85572s;

        /* renamed from: t */
        long f85573t;

        /* renamed from: u */
        /* synthetic */ Object f85574u;

        /* renamed from: w */
        int f85576w;

        C16831h0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85574u = obj;
            this.f85576w |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89952s0(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$i */
    /* loaded from: classes7.dex */
    public static final class C16832i extends AbstractC29096d {

        /* renamed from: s */
        Object f85577s;

        /* renamed from: t */
        Object f85578t;

        /* renamed from: u */
        Object f85579u;

        /* renamed from: v */
        Object f85580v;

        /* renamed from: w */
        Object f85581w;

        /* renamed from: x */
        /* synthetic */ Object f85582x;

        /* renamed from: z */
        int f85584z;

        C16832i(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85582x = obj;
            this.f85584z |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89911U(null, null, null, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$i0 */
    /* loaded from: classes7.dex */
    public static final class C16833i0 extends AbstractC29096d {

        /* renamed from: s */
        Object f85585s;

        /* renamed from: t */
        Object f85586t;

        /* renamed from: u */
        /* synthetic */ Object f85587u;

        /* renamed from: w */
        int f85589w;

        C16833i0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85587u = obj;
            this.f85589w |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89956u0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$j */
    /* loaded from: classes7.dex */
    public static final class C16834j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f85590t;

        /* renamed from: u */
        int f85591u;

        /* renamed from: v */
        /* synthetic */ Object f85592v;

        /* renamed from: x */
        final /* synthetic */ AtomicInteger f85594x;

        /* renamed from: y */
        final /* synthetic */ ProducerScope f85595y;

        /* renamed from: z */
        final /* synthetic */ C19055h0 f85596z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16834j(AtomicInteger atomicInteger, ProducerScope producerScope, C19055h0 c19055h0, Continuation continuation) {
            super(2, continuation);
            this.f85594x = atomicInteger;
            this.f85595y = producerScope;
            this.f85596z = c19055h0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16834j c16834j = new C16834j(this.f85594x, this.f85595y, this.f85596z, continuation);
            c16834j.f85592v = obj;
            return c16834j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[DONT_GENERATE] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v17, types: [ug0.a] */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v34 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C25823d c25823d;
            Object m89926e0;
            C25823d c25823d2;
            C25823d c25823d3;
            C25823d m133177b;
            Object m89910T;
            m142578e = AbstractC28298d.m142578e();
            C27246a c27246a = this.f85591u;
            boolean z11 = true;
            try {
                if (c27246a != 0) {
                    if (c27246a != 1) {
                        if (c27246a != 2) {
                            if (c27246a == 3) {
                                c25823d3 = (C25823d) this.f85592v;
                                AbstractC24862s.m129228b(obj);
                                c25823d2 = c25823d3;
                                if (!z11) {
                                    ZaloCloudMigrationUploader.this.f85498r.incrementAndGet();
                                    C26676b.m136960j("SMLZCloudMigrationUploader", "Backup item upload error, item=" + c25823d2);
                                } else {
                                    this.f85594x.incrementAndGet();
                                    ZaloCloudMigrationUploader.this.f85488h.incrementAndGet();
                                    C26676b.m136960j("SMLZCloudMigrationUploader", "Backup item upload successful, item=" + c25823d2);
                                }
                                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                                zaloCloudMigrationUploader.m89892A0(this.f85595y, EnumC27250e.f128049r, zaloCloudMigrationUploader.f85497q.incrementAndGet(), this.f85596z.f94931p);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C27246a c27246a2 = (C27246a) this.f85590t;
                        c25823d3 = (C25823d) this.f85592v;
                        AbstractC24862s.m129228b(obj);
                        m89910T = obj;
                        c27246a = c27246a2;
                        z11 = ((Boolean) m89910T).booleanValue();
                        c25823d2 = c25823d3;
                        if (!z11) {
                        }
                        ZaloCloudMigrationUploader zaloCloudMigrationUploader2 = ZaloCloudMigrationUploader.this;
                        zaloCloudMigrationUploader2.m89892A0(this.f85595y, EnumC27250e.f128049r, zaloCloudMigrationUploader2.f85497q.incrementAndGet(), this.f85596z.f94931p);
                        return C24848g0.f119245a;
                    }
                    c25823d = (C25823d) this.f85592v;
                    AbstractC24862s.m129228b(obj);
                    m89926e0 = obj;
                } else {
                    AbstractC24862s.m129228b(obj);
                    c25823d = (C25823d) this.f85592v;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader3 = ZaloCloudMigrationUploader.this;
                    this.f85592v = c25823d;
                    this.f85591u = 1;
                    m89926e0 = zaloCloudMigrationUploader3.m89926e0(c25823d, this);
                    if (m89926e0 == m142578e) {
                        return m142578e;
                    }
                }
                C25823d c25823d4 = c25823d;
                C27246a c27246a3 = (C27246a) m89926e0;
                if (!c27246a3.m139388d()) {
                    m133177b = c25823d4.m133177b((r33 & 1) != 0 ? c25823d4.f123184a : null, (r33 & 2) != 0 ? c25823d4.f123185b : null, (r33 & 4) != 0 ? c25823d4.f123186c : c27246a3.m139386b(), (r33 & 8) != 0 ? c25823d4.f123187d : null, (r33 & 16) != 0 ? c25823d4.f123188e : 0L, (r33 & 32) != 0 ? c25823d4.f123189f : null, (r33 & 64) != 0 ? c25823d4.f123190g : 0, (r33 & 128) != 0 ? c25823d4.f123191h : false, (r33 & 256) != 0 ? c25823d4.f123192i : false, (r33 & 512) != 0 ? c25823d4.f123193j : null, (r33 & 1024) != 0 ? c25823d4.f123194k : null, (r33 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c25823d4.f123195l : 0L, (r33 & 4096) != 0 ? c25823d4.f123196m : null, (r33 & 8192) != 0 ? c25823d4.f123197n : null);
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader4 = ZaloCloudMigrationUploader.this;
                    this.f85592v = c25823d4;
                    this.f85590t = c27246a3;
                    this.f85591u = 2;
                    m89910T = zaloCloudMigrationUploader4.m89910T(m133177b, this);
                    if (m89910T == m142578e) {
                        return m142578e;
                    }
                    c25823d3 = c25823d4;
                    c27246a = c27246a3;
                    z11 = ((Boolean) m89910T).booleanValue();
                    c25823d2 = c25823d3;
                    if (!z11) {
                    }
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader22 = ZaloCloudMigrationUploader.this;
                    zaloCloudMigrationUploader22.m89892A0(this.f85595y, EnumC27250e.f128049r, zaloCloudMigrationUploader22.f85497q.incrementAndGet(), this.f85596z.f94931p);
                    return C24848g0.f119245a;
                }
                if (!AbstractC27253h.m139447l(c27246a3)) {
                    if (AbstractC27253h.m139448m(c27246a3)) {
                        ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Backup item upload failed with skippable drive problem (" + c27246a3.m139385a() + "), item=" + c25823d4, null, 4, null);
                        ZaloCloudMigrationUploader zaloCloudMigrationUploader5 = ZaloCloudMigrationUploader.this;
                        this.f85592v = c25823d4;
                        this.f85591u = 3;
                        if (ZaloCloudMigrationUploader.m89950r0(zaloCloudMigrationUploader5, c25823d4, 0L, this, 1, null) == m142578e) {
                            return m142578e;
                        }
                        c25823d3 = c25823d4;
                        c25823d2 = c25823d3;
                        if (!z11) {
                        }
                        ZaloCloudMigrationUploader zaloCloudMigrationUploader222 = ZaloCloudMigrationUploader.this;
                        zaloCloudMigrationUploader222.m89892A0(this.f85595y, EnumC27250e.f128049r, zaloCloudMigrationUploader222.f85497q.incrementAndGet(), this.f85596z.f94931p);
                        return C24848g0.f119245a;
                    }
                    if (AbstractC27253h.m139445j(c27246a3)) {
                        ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Backup item upload failed due to network error (" + c27246a3.m139385a() + "), item=" + c25823d4, null, 4, null);
                    } else if (!AbstractC27253h.m139443h(c27246a3)) {
                        ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Backup item upload failed with runtime error (" + c27246a3.m139385a() + "), item=" + c25823d4, null, 4, null);
                    } else {
                        ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Backup item upload failed due to storage not available error (" + c27246a3.m139385a() + "), item=" + c25823d4, null, 4, null);
                        throw new Failure.StorageNotAvailable("Backup item upload failed due to storage not available error (" + c27246a3.m139385a() + ")");
                    }
                    z11 = false;
                    c25823d2 = c25823d4;
                    if (!z11) {
                    }
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader2222 = ZaloCloudMigrationUploader.this;
                    zaloCloudMigrationUploader2222.m89892A0(this.f85595y, EnumC27250e.f128049r, zaloCloudMigrationUploader2222.f85497q.incrementAndGet(), this.f85596z.f94931p);
                    return C24848g0.f119245a;
                }
                ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Backup item upload failed with retryable drive problem (" + c27246a3.m139385a() + "), item=" + c25823d4, null, 4, null);
                throw new Failure.DriveProblem("Backup item upload failed with retryable drive problem (" + c27246a3.m139385a() + ")");
            } finally {
                if (c27246a.m139387c()) {
                    AbstractC23041d2.m118208g(c27246a.m139386b());
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C25823d c25823d, Continuation continuation) {
            return ((C16834j) mo238a(c25823d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$j0 */
    /* loaded from: classes7.dex */
    public static final class C16835j0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85597t;

        /* renamed from: u */
        /* synthetic */ Object f85598u;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18509p f85600w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16835j0(InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f85600w = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16835j0 c16835j0 = new C16835j0(this.f85600w, continuation);
            c16835j0.f85598u = obj;
            return c16835j0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C25823d c25823d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85597t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c25823d = (C25823d) this.f85598u;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                c25823d = (C25823d) this.f85598u;
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                this.f85598u = c25823d;
                this.f85597t = 1;
                obj = zaloCloudMigrationUploader.m89956u0(c25823d, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                InterfaceC18509p interfaceC18509p = this.f85600w;
                this.f85598u = null;
                this.f85597t = 2;
                if (interfaceC18509p.mo240pC(c25823d, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C25823d c25823d, Continuation continuation) {
            return ((C16835j0) mo238a(c25823d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$k */
    /* loaded from: classes7.dex */
    public static final class C16836k extends AbstractC29096d {

        /* renamed from: s */
        Object f85601s;

        /* renamed from: t */
        Object f85602t;

        /* renamed from: u */
        Object f85603u;

        /* renamed from: v */
        Object f85604v;

        /* renamed from: w */
        int f85605w;

        /* renamed from: x */
        /* synthetic */ Object f85606x;

        /* renamed from: z */
        int f85608z;

        C16836k(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85606x = obj;
            this.f85608z |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89913W(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$k0 */
    /* loaded from: classes7.dex */
    public static final class C16837k0 extends AbstractC29096d {

        /* renamed from: A */
        int f85609A;

        /* renamed from: s */
        Object f85610s;

        /* renamed from: t */
        Object f85611t;

        /* renamed from: u */
        int f85612u;

        /* renamed from: v */
        int f85613v;

        /* renamed from: w */
        int f85614w;

        /* renamed from: x */
        int f85615x;

        /* renamed from: y */
        /* synthetic */ Object f85616y;

        C16837k0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85616y = obj;
            this.f85609A |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89960w0(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$l */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16838l extends C19071q implements InterfaceC18510q {
        C16838l(Object obj) {
            super(3, obj, AbstractC25321e.class, "getAllBackupItems", "getAllBackupItems(Lcom/zing/zalo/data/zalocloud/migration/ZaloCloudMigrationRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m89982h(((Number) obj).intValue(), ((Number) obj2).intValue(), (Continuation) obj3);
        }

        /* renamed from: h */
        public final Object m89982h(int i11, int i12, Continuation continuation) {
            List m131496e;
            List m131505m;
            InterfaceC25320d interfaceC25320d = (InterfaceC25320d) this.f94922q;
            m131496e = AbstractC25366r.m131496e(EnumC25825f.f123210s);
            m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
            return interfaceC25320d.mo131131m(m131496e, m131505m, i11, i12, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$l0 */
    /* loaded from: classes7.dex */
    public static final class C16839l0 extends AbstractC29096d {

        /* renamed from: s */
        Object f85618s;

        /* renamed from: t */
        /* synthetic */ Object f85619t;

        /* renamed from: v */
        int f85621v;

        C16839l0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85619t = obj;
            this.f85621v |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89962x0(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$m */
    /* loaded from: classes7.dex */
    public static final class C16840m extends AbstractC29104l implements InterfaceC18511r {

        /* renamed from: A */
        final /* synthetic */ int f85622A;

        /* renamed from: t */
        int f85623t;

        /* renamed from: u */
        /* synthetic */ int f85624u;

        /* renamed from: v */
        /* synthetic */ int f85625v;

        /* renamed from: w */
        /* synthetic */ Object f85626w;

        /* renamed from: y */
        final /* synthetic */ CoroutineScope f85628y;

        /* renamed from: z */
        final /* synthetic */ ProducerScope f85629z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16840m(CoroutineScope coroutineScope, ProducerScope producerScope, int i11, Continuation continuation) {
            super(4, continuation);
            this.f85628y = coroutineScope;
            this.f85629z = producerScope;
            this.f85622A = i11;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            return m89983r(((Number) obj).intValue(), ((Number) obj2).intValue(), (List) obj3, (Continuation) obj4);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85623t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                int i12 = this.f85624u;
                int i13 = this.f85625v;
                List list = (List) this.f85626w;
                C26676b.m136952b("SMLZCloudMigrationUploader", "doUploadBackupItemsPaging(): page=" + i12 + ", offset=" + i13 + ", size=" + list.size());
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                CoroutineScope coroutineScope = this.f85628y;
                ProducerScope producerScope = this.f85629z;
                int i14 = this.f85622A;
                this.f85623t = 1;
                obj = ZaloCloudMigrationUploader.m89912V(zaloCloudMigrationUploader, coroutineScope, producerScope, list, i14, null, this, 16, null);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Object m89983r(int i11, int i12, List list, Continuation continuation) {
            C16840m c16840m = new C16840m(this.f85628y, this.f85629z, this.f85622A, continuation);
            c16840m.f85624u = i11;
            c16840m.f85625v = i12;
            c16840m.f85626w = list;
            return c16840m.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$m0 */
    /* loaded from: classes7.dex */
    public static final class C16841m0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C16841m0 f85630q = new C16841m0();

        C16841m0() {
            super(1);
        }

        /* renamed from: a */
        public final void m89984a(C25823d c25823d) {
            AbstractC19074t.m100208f(c25823d, "it");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m89984a((C25823d) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$n */
    /* loaded from: classes7.dex */
    public static final class C16842n extends AbstractC29096d {

        /* renamed from: s */
        Object f85631s;

        /* renamed from: t */
        Object f85632t;

        /* renamed from: u */
        Object f85633u;

        /* renamed from: v */
        int f85634v;

        /* renamed from: w */
        /* synthetic */ Object f85635w;

        /* renamed from: y */
        int f85637y;

        C16842n(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85635w = obj;
            this.f85637y |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89914X(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$n0 */
    /* loaded from: classes7.dex */
    public static final class C16843n0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85638t;

        /* renamed from: u */
        /* synthetic */ Object f85639u;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f85641w;

        /* renamed from: x */
        final /* synthetic */ AtomicInteger f85642x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16843n0(InterfaceC18505l interfaceC18505l, AtomicInteger atomicInteger, Continuation continuation) {
            super(2, continuation);
            this.f85641w = interfaceC18505l;
            this.f85642x = atomicInteger;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16843n0 c16843n0 = new C16843n0(this.f85641w, this.f85642x, continuation);
            c16843n0.f85639u = obj;
            return c16843n0;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C25823d c25823d;
            Object m116232d;
            C28255a c28255a;
            C25823d c25823d2;
            C25823d m133177b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85638t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        C25823d c25823d3 = (C25823d) this.f85639u;
                        AbstractC24862s.m129228b(obj);
                        c25823d2 = c25823d3;
                        InterfaceC18505l interfaceC18505l = this.f85641w;
                        m133177b = c25823d2.m133177b((r33 & 1) != 0 ? c25823d2.f123184a : null, (r33 & 2) != 0 ? c25823d2.f123185b : null, (r33 & 4) != 0 ? c25823d2.f123186c : null, (r33 & 8) != 0 ? c25823d2.f123187d : null, (r33 & 16) != 0 ? c25823d2.f123188e : 0L, (r33 & 32) != 0 ? c25823d2.f123189f : EnumC25825f.f123210s, (r33 & 64) != 0 ? c25823d2.f123190g : 0, (r33 & 128) != 0 ? c25823d2.f123191h : false, (r33 & 256) != 0 ? c25823d2.f123192i : false, (r33 & 512) != 0 ? c25823d2.f123193j : null, (r33 & 1024) != 0 ? c25823d2.f123194k : null, (r33 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c25823d2.f123195l : 0L, (r33 & 4096) != 0 ? c25823d2.f123196m : null, (r33 & 8192) != 0 ? c25823d2.f123197n : null);
                        interfaceC18505l.mo205i9(m133177b);
                        this.f85642x.incrementAndGet();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c25823d = (C25823d) this.f85639u;
                try {
                    AbstractC24862s.m129228b(obj);
                    m116232d = obj;
                } catch (GetBackupMetadataException e11) {
                    e = e11;
                    if (AbstractC27253h.m139446k(e)) {
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25823d c25823d4 = (C25823d) this.f85639u;
                try {
                    C22479c c22479c = ZaloCloudMigrationUploader.this.f85483c;
                    C17945a0 m133176a = c25823d4.m133176a();
                    this.f85639u = c25823d4;
                    this.f85638t = 1;
                    m116232d = c22479c.m116232d(m133176a, this);
                    if (m116232d == m142578e) {
                        return m142578e;
                    }
                    c25823d = c25823d4;
                } catch (GetBackupMetadataException e12) {
                    e = e12;
                    c25823d = c25823d4;
                    if (AbstractC27253h.m139446k(e)) {
                        if (AbstractC27253h.m139444i(e)) {
                            ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Backup item upload failed due to network error: " + e, null, 4, null);
                        }
                        c28255a = null;
                        if (c28255a != null) {
                        }
                        return C24848g0.f119245a;
                    }
                    throw new Failure.DriveProblem("Backup file metadata load failed: " + e);
                }
            }
            c28255a = (C28255a) m116232d;
            if (c28255a != null) {
                C26676b.m136952b("SMLZCloudMigrationUploader", "Found backup item=" + c25823d);
                InterfaceC25320d interfaceC25320d = ZaloCloudMigrationUploader.this.f85481a;
                String m133186l = c25823d.m133186l();
                EnumC25825f enumC25825f = EnumC25825f.f123210s;
                this.f85639u = c25823d;
                this.f85638t = 2;
                if (interfaceC25320d.mo131126h(m133186l, enumC25825f, this) == m142578e) {
                    return m142578e;
                }
                c25823d2 = c25823d;
                InterfaceC18505l interfaceC18505l2 = this.f85641w;
                m133177b = c25823d2.m133177b((r33 & 1) != 0 ? c25823d2.f123184a : null, (r33 & 2) != 0 ? c25823d2.f123185b : null, (r33 & 4) != 0 ? c25823d2.f123186c : null, (r33 & 8) != 0 ? c25823d2.f123187d : null, (r33 & 16) != 0 ? c25823d2.f123188e : 0L, (r33 & 32) != 0 ? c25823d2.f123189f : EnumC25825f.f123210s, (r33 & 64) != 0 ? c25823d2.f123190g : 0, (r33 & 128) != 0 ? c25823d2.f123191h : false, (r33 & 256) != 0 ? c25823d2.f123192i : false, (r33 & 512) != 0 ? c25823d2.f123193j : null, (r33 & 1024) != 0 ? c25823d2.f123194k : null, (r33 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? c25823d2.f123195l : 0L, (r33 & 4096) != 0 ? c25823d2.f123196m : null, (r33 & 8192) != 0 ? c25823d2.f123197n : null);
                interfaceC18505l2.mo205i9(m133177b);
                this.f85642x.incrementAndGet();
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C25823d c25823d, Continuation continuation) {
            return ((C16843n0) mo238a(c25823d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$o */
    /* loaded from: classes7.dex */
    public static final class C16844o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: B */
        final /* synthetic */ ProducerScope f85644B;

        /* renamed from: t */
        Object f85645t;

        /* renamed from: u */
        Object f85646u;

        /* renamed from: v */
        Object f85647v;

        /* renamed from: w */
        Object f85648w;

        /* renamed from: x */
        int f85649x;

        /* renamed from: y */
        int f85650y;

        /* renamed from: z */
        private /* synthetic */ Object f85651z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16844o(ProducerScope producerScope, Continuation continuation) {
            super(2, continuation);
            this.f85644B = producerScope;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16844o c16844o = new C16844o(this.f85644B, continuation);
            c16844o.f85651z = obj;
            return c16844o;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:11:0x02fe A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x02e0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x02e1  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x02b0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x027d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x027e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x024f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x022e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01fc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01cd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01ad A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x014a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x013a A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader;
            ProducerScope producerScope;
            List m131496e;
            List m131505m;
            Object mo131137s;
            CoroutineScope coroutineScope2;
            CoroutineScope coroutineScope3;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader2;
            ProducerScope producerScope2;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader3;
            ProducerScope producerScope3;
            List list;
            List m131505m2;
            List m131496e2;
            Object mo131121c;
            CoroutineScope coroutineScope4;
            ProducerScope producerScope4;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader4;
            int intValue;
            CoroutineScope coroutineScope5;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader5;
            ProducerScope producerScope5;
            List m131496e3;
            List m131505m3;
            Object mo131137s2;
            CoroutineScope coroutineScope6;
            List list2;
            List m131505m4;
            List m131496e4;
            Object mo131121c2;
            CoroutineScope coroutineScope7;
            ProducerScope producerScope6;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader6;
            int intValue2;
            CoroutineScope coroutineScope8;
            List m131496e5;
            List m131505m5;
            Object mo131137s3;
            CoroutineScope coroutineScope9;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader7;
            ProducerScope producerScope7;
            List m131505m6;
            List m131496e6;
            Object mo131121c3;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader8;
            ProducerScope producerScope8;
            CoroutineScope coroutineScope10;
            List list3;
            int intValue3;
            List m131496e7;
            Object m131142e;
            List list4;
            ProducerScope producerScope9;
            CoroutineScope coroutineScope11;
            ZaloCloudMigrationUploader zaloCloudMigrationUploader9;
            Object m89911U;
            m142578e = AbstractC28298d.m142578e();
            switch (this.f85650y) {
                case 0:
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f85651z;
                    if (ZaloCloudMigrationUploader.this.f85476B) {
                        ZaloCloudMigrationUploader zaloCloudMigrationUploader10 = ZaloCloudMigrationUploader.this;
                        ProducerScope producerScope10 = this.f85644B;
                        this.f85651z = coroutineScope;
                        this.f85650y = 1;
                        if (zaloCloudMigrationUploader10.m89924d0(coroutineScope, producerScope10, this) == m142578e) {
                            return m142578e;
                        }
                        coroutineScope3 = coroutineScope;
                        zaloCloudMigrationUploader2 = ZaloCloudMigrationUploader.this;
                        producerScope2 = this.f85644B;
                        this.f85651z = coroutineScope3;
                        this.f85650y = 2;
                        if (zaloCloudMigrationUploader2.m89918a0(coroutineScope3, producerScope2, this) == m142578e) {
                            return m142578e;
                        }
                        zaloCloudMigrationUploader3 = ZaloCloudMigrationUploader.this;
                        producerScope3 = this.f85644B;
                        this.f85651z = null;
                        this.f85650y = 3;
                        if (zaloCloudMigrationUploader3.m89913W(coroutineScope3, producerScope3, this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                    producerScope = this.f85644B;
                    InterfaceC25320d interfaceC25320d = zaloCloudMigrationUploader.f85481a;
                    m131496e = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    this.f85651z = coroutineScope;
                    this.f85645t = zaloCloudMigrationUploader;
                    this.f85646u = coroutineScope;
                    this.f85647v = producerScope;
                    this.f85650y = 4;
                    mo131137s = interfaceC25320d.mo131137s(m131496e, m131505m, this);
                    if (mo131137s == m142578e) {
                        return m142578e;
                    }
                    coroutineScope2 = coroutineScope;
                    list = (List) mo131137s;
                    InterfaceC25320d interfaceC25320d2 = ZaloCloudMigrationUploader.this.f85481a;
                    m131505m2 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e2 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85651z = coroutineScope2;
                    this.f85645t = zaloCloudMigrationUploader;
                    this.f85646u = coroutineScope;
                    this.f85647v = producerScope;
                    this.f85648w = list;
                    this.f85650y = 5;
                    mo131121c = interfaceC25320d2.mo131121c(m131496e2, m131505m2, this);
                    if (mo131121c != m142578e) {
                        return m142578e;
                    }
                    coroutineScope4 = coroutineScope2;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader11 = zaloCloudMigrationUploader;
                    producerScope4 = producerScope;
                    zaloCloudMigrationUploader4 = zaloCloudMigrationUploader11;
                    intValue = ((Number) mo131121c).intValue();
                    this.f85651z = coroutineScope4;
                    this.f85645t = null;
                    this.f85646u = null;
                    this.f85647v = null;
                    this.f85648w = null;
                    this.f85650y = 6;
                    if (zaloCloudMigrationUploader4.m89922c0(coroutineScope, producerScope4, list, intValue, this) != m142578e) {
                        return m142578e;
                    }
                    coroutineScope5 = coroutineScope4;
                    zaloCloudMigrationUploader5 = ZaloCloudMigrationUploader.this;
                    producerScope5 = this.f85644B;
                    InterfaceC25320d interfaceC25320d3 = zaloCloudMigrationUploader5.f85481a;
                    m131496e3 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    m131505m3 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    this.f85651z = coroutineScope5;
                    this.f85645t = zaloCloudMigrationUploader5;
                    this.f85646u = coroutineScope5;
                    this.f85647v = producerScope5;
                    this.f85650y = 7;
                    mo131137s2 = interfaceC25320d3.mo131137s(m131496e3, m131505m3, this);
                    if (mo131137s2 != m142578e) {
                        return m142578e;
                    }
                    coroutineScope6 = coroutineScope5;
                    list2 = (List) mo131137s2;
                    InterfaceC25320d interfaceC25320d4 = ZaloCloudMigrationUploader.this.f85481a;
                    m131505m4 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e4 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85651z = coroutineScope6;
                    this.f85645t = zaloCloudMigrationUploader5;
                    this.f85646u = coroutineScope5;
                    this.f85647v = producerScope5;
                    this.f85648w = list2;
                    this.f85650y = 8;
                    mo131121c2 = interfaceC25320d4.mo131121c(m131496e4, m131505m4, this);
                    if (mo131121c2 != m142578e) {
                        return m142578e;
                    }
                    coroutineScope7 = coroutineScope6;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader12 = zaloCloudMigrationUploader5;
                    producerScope6 = producerScope5;
                    zaloCloudMigrationUploader6 = zaloCloudMigrationUploader12;
                    intValue2 = ((Number) mo131121c2).intValue();
                    this.f85651z = coroutineScope7;
                    this.f85645t = null;
                    this.f85646u = null;
                    this.f85647v = null;
                    this.f85648w = null;
                    this.f85650y = 9;
                    if (zaloCloudMigrationUploader6.m89916Z(coroutineScope5, producerScope6, list2, intValue2, this) != m142578e) {
                        return m142578e;
                    }
                    coroutineScope8 = coroutineScope7;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader13 = ZaloCloudMigrationUploader.this;
                    ProducerScope producerScope11 = this.f85644B;
                    InterfaceC25320d interfaceC25320d5 = zaloCloudMigrationUploader13.f85481a;
                    m131496e5 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    m131505m5 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    this.f85651z = zaloCloudMigrationUploader13;
                    this.f85645t = coroutineScope8;
                    this.f85646u = producerScope11;
                    this.f85650y = 10;
                    mo131137s3 = interfaceC25320d5.mo131137s(m131496e5, m131505m5, this);
                    if (mo131137s3 != m142578e) {
                        return m142578e;
                    }
                    coroutineScope9 = coroutineScope8;
                    zaloCloudMigrationUploader7 = zaloCloudMigrationUploader13;
                    producerScope7 = producerScope11;
                    List list5 = (List) mo131137s3;
                    InterfaceC25320d interfaceC25320d6 = ZaloCloudMigrationUploader.this.f85481a;
                    m131505m6 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e6 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85651z = zaloCloudMigrationUploader7;
                    this.f85645t = coroutineScope9;
                    this.f85646u = producerScope7;
                    this.f85647v = list5;
                    this.f85650y = 11;
                    mo131121c3 = interfaceC25320d6.mo131121c(m131496e6, m131505m6, this);
                    if (mo131121c3 != m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationUploader8 = zaloCloudMigrationUploader7;
                    producerScope8 = producerScope7;
                    coroutineScope10 = coroutineScope9;
                    list3 = list5;
                    intValue3 = ((Number) mo131121c3).intValue();
                    InterfaceC25320d interfaceC25320d7 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e7 = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                    this.f85651z = zaloCloudMigrationUploader8;
                    this.f85645t = coroutineScope10;
                    this.f85646u = producerScope8;
                    this.f85647v = list3;
                    this.f85649x = intValue3;
                    this.f85650y = 12;
                    m131142e = InterfaceC25320d.a.m131142e(interfaceC25320d7, m131496e7, null, this, 2, null);
                    if (m131142e != m142578e) {
                        return m142578e;
                    }
                    list4 = list3;
                    producerScope9 = producerScope8;
                    coroutineScope11 = coroutineScope10;
                    zaloCloudMigrationUploader9 = zaloCloudMigrationUploader8;
                    this.f85651z = null;
                    this.f85645t = null;
                    this.f85646u = null;
                    this.f85647v = null;
                    this.f85650y = 13;
                    m89911U = zaloCloudMigrationUploader9.m89911U(coroutineScope11, producerScope9, list4, intValue3, (List) m131142e, this);
                    if (m89911U != m142578e) {
                        return m142578e;
                    }
                    return m89911U;
                case 1:
                    coroutineScope3 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    zaloCloudMigrationUploader2 = ZaloCloudMigrationUploader.this;
                    producerScope2 = this.f85644B;
                    this.f85651z = coroutineScope3;
                    this.f85650y = 2;
                    if (zaloCloudMigrationUploader2.m89918a0(coroutineScope3, producerScope2, this) == m142578e) {
                    }
                    zaloCloudMigrationUploader3 = ZaloCloudMigrationUploader.this;
                    producerScope3 = this.f85644B;
                    this.f85651z = null;
                    this.f85650y = 3;
                    if (zaloCloudMigrationUploader3.m89913W(coroutineScope3, producerScope3, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 2:
                    coroutineScope3 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    zaloCloudMigrationUploader3 = ZaloCloudMigrationUploader.this;
                    producerScope3 = this.f85644B;
                    this.f85651z = null;
                    this.f85650y = 3;
                    if (zaloCloudMigrationUploader3.m89913W(coroutineScope3, producerScope3, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                case 3:
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                case 4:
                    producerScope = (ProducerScope) this.f85647v;
                    coroutineScope = (CoroutineScope) this.f85646u;
                    zaloCloudMigrationUploader = (ZaloCloudMigrationUploader) this.f85645t;
                    CoroutineScope coroutineScope12 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    coroutineScope2 = coroutineScope12;
                    mo131137s = obj;
                    list = (List) mo131137s;
                    InterfaceC25320d interfaceC25320d22 = ZaloCloudMigrationUploader.this.f85481a;
                    m131505m2 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e2 = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    this.f85651z = coroutineScope2;
                    this.f85645t = zaloCloudMigrationUploader;
                    this.f85646u = coroutineScope;
                    this.f85647v = producerScope;
                    this.f85648w = list;
                    this.f85650y = 5;
                    mo131121c = interfaceC25320d22.mo131121c(m131496e2, m131505m2, this);
                    if (mo131121c != m142578e) {
                    }
                    break;
                case 5:
                    List list6 = (List) this.f85648w;
                    ProducerScope producerScope12 = (ProducerScope) this.f85647v;
                    CoroutineScope coroutineScope13 = (CoroutineScope) this.f85646u;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader14 = (ZaloCloudMigrationUploader) this.f85645t;
                    CoroutineScope coroutineScope14 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    mo131121c = obj;
                    coroutineScope4 = coroutineScope14;
                    list = list6;
                    zaloCloudMigrationUploader4 = zaloCloudMigrationUploader14;
                    producerScope4 = producerScope12;
                    coroutineScope = coroutineScope13;
                    intValue = ((Number) mo131121c).intValue();
                    this.f85651z = coroutineScope4;
                    this.f85645t = null;
                    this.f85646u = null;
                    this.f85647v = null;
                    this.f85648w = null;
                    this.f85650y = 6;
                    if (zaloCloudMigrationUploader4.m89922c0(coroutineScope, producerScope4, list, intValue, this) != m142578e) {
                    }
                    break;
                case 6:
                    CoroutineScope coroutineScope15 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    coroutineScope5 = coroutineScope15;
                    zaloCloudMigrationUploader5 = ZaloCloudMigrationUploader.this;
                    producerScope5 = this.f85644B;
                    InterfaceC25320d interfaceC25320d32 = zaloCloudMigrationUploader5.f85481a;
                    m131496e3 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    m131505m3 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    this.f85651z = coroutineScope5;
                    this.f85645t = zaloCloudMigrationUploader5;
                    this.f85646u = coroutineScope5;
                    this.f85647v = producerScope5;
                    this.f85650y = 7;
                    mo131137s2 = interfaceC25320d32.mo131137s(m131496e3, m131505m3, this);
                    if (mo131137s2 != m142578e) {
                    }
                    break;
                case 7:
                    producerScope5 = (ProducerScope) this.f85647v;
                    coroutineScope5 = (CoroutineScope) this.f85646u;
                    zaloCloudMigrationUploader5 = (ZaloCloudMigrationUploader) this.f85645t;
                    CoroutineScope coroutineScope16 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    coroutineScope6 = coroutineScope16;
                    mo131137s2 = obj;
                    list2 = (List) mo131137s2;
                    InterfaceC25320d interfaceC25320d42 = ZaloCloudMigrationUploader.this.f85481a;
                    m131505m4 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e4 = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    this.f85651z = coroutineScope6;
                    this.f85645t = zaloCloudMigrationUploader5;
                    this.f85646u = coroutineScope5;
                    this.f85647v = producerScope5;
                    this.f85648w = list2;
                    this.f85650y = 8;
                    mo131121c2 = interfaceC25320d42.mo131121c(m131496e4, m131505m4, this);
                    if (mo131121c2 != m142578e) {
                    }
                    break;
                case 8:
                    List list7 = (List) this.f85648w;
                    ProducerScope producerScope13 = (ProducerScope) this.f85647v;
                    CoroutineScope coroutineScope17 = (CoroutineScope) this.f85646u;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader15 = (ZaloCloudMigrationUploader) this.f85645t;
                    CoroutineScope coroutineScope18 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    mo131121c2 = obj;
                    coroutineScope7 = coroutineScope18;
                    list2 = list7;
                    zaloCloudMigrationUploader6 = zaloCloudMigrationUploader15;
                    producerScope6 = producerScope13;
                    coroutineScope5 = coroutineScope17;
                    intValue2 = ((Number) mo131121c2).intValue();
                    this.f85651z = coroutineScope7;
                    this.f85645t = null;
                    this.f85646u = null;
                    this.f85647v = null;
                    this.f85648w = null;
                    this.f85650y = 9;
                    if (zaloCloudMigrationUploader6.m89916Z(coroutineScope5, producerScope6, list2, intValue2, this) != m142578e) {
                    }
                    break;
                case 9:
                    coroutineScope8 = (CoroutineScope) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader132 = ZaloCloudMigrationUploader.this;
                    ProducerScope producerScope112 = this.f85644B;
                    InterfaceC25320d interfaceC25320d52 = zaloCloudMigrationUploader132.f85481a;
                    m131496e5 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    m131505m5 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    this.f85651z = zaloCloudMigrationUploader132;
                    this.f85645t = coroutineScope8;
                    this.f85646u = producerScope112;
                    this.f85650y = 10;
                    mo131137s3 = interfaceC25320d52.mo131137s(m131496e5, m131505m5, this);
                    if (mo131137s3 != m142578e) {
                    }
                    break;
                case 10:
                    ProducerScope producerScope14 = (ProducerScope) this.f85646u;
                    CoroutineScope coroutineScope19 = (CoroutineScope) this.f85645t;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader16 = (ZaloCloudMigrationUploader) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    mo131137s3 = obj;
                    producerScope7 = producerScope14;
                    zaloCloudMigrationUploader7 = zaloCloudMigrationUploader16;
                    coroutineScope9 = coroutineScope19;
                    List list52 = (List) mo131137s3;
                    InterfaceC25320d interfaceC25320d62 = ZaloCloudMigrationUploader.this.f85481a;
                    m131505m6 = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e6 = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                    this.f85651z = zaloCloudMigrationUploader7;
                    this.f85645t = coroutineScope9;
                    this.f85646u = producerScope7;
                    this.f85647v = list52;
                    this.f85650y = 11;
                    mo131121c3 = interfaceC25320d62.mo131121c(m131496e6, m131505m6, this);
                    if (mo131121c3 != m142578e) {
                    }
                    break;
                case 11:
                    List list8 = (List) this.f85647v;
                    ProducerScope producerScope15 = (ProducerScope) this.f85646u;
                    CoroutineScope coroutineScope20 = (CoroutineScope) this.f85645t;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader17 = (ZaloCloudMigrationUploader) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    mo131121c3 = obj;
                    list3 = list8;
                    producerScope8 = producerScope15;
                    coroutineScope10 = coroutineScope20;
                    zaloCloudMigrationUploader8 = zaloCloudMigrationUploader17;
                    intValue3 = ((Number) mo131121c3).intValue();
                    InterfaceC25320d interfaceC25320d72 = ZaloCloudMigrationUploader.this.f85481a;
                    m131496e7 = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                    this.f85651z = zaloCloudMigrationUploader8;
                    this.f85645t = coroutineScope10;
                    this.f85646u = producerScope8;
                    this.f85647v = list3;
                    this.f85649x = intValue3;
                    this.f85650y = 12;
                    m131142e = InterfaceC25320d.a.m131142e(interfaceC25320d72, m131496e7, null, this, 2, null);
                    if (m131142e != m142578e) {
                    }
                    break;
                case 12:
                    int i11 = this.f85649x;
                    List list9 = (List) this.f85647v;
                    producerScope9 = (ProducerScope) this.f85646u;
                    CoroutineScope coroutineScope21 = (CoroutineScope) this.f85645t;
                    zaloCloudMigrationUploader9 = (ZaloCloudMigrationUploader) this.f85651z;
                    AbstractC24862s.m129228b(obj);
                    intValue3 = i11;
                    m131142e = obj;
                    list4 = list9;
                    coroutineScope11 = coroutineScope21;
                    this.f85651z = null;
                    this.f85645t = null;
                    this.f85646u = null;
                    this.f85647v = null;
                    this.f85650y = 13;
                    m89911U = zaloCloudMigrationUploader9.m89911U(coroutineScope11, producerScope9, list4, intValue3, (List) m131142e, this);
                    if (m89911U != m142578e) {
                    }
                    break;
                case 13:
                    AbstractC24862s.m129228b(obj);
                    return obj;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16844o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$p */
    /* loaded from: classes7.dex */
    public static final class C16845p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85652t;

        C16845p(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16845p(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f85652t == 0) {
                AbstractC24862s.m129228b(obj);
                C3487b.f14598a.m17466a();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16845p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$q */
    /* loaded from: classes7.dex */
    public static final class C16846q extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        long f85653t;

        /* renamed from: u */
        int f85654u;

        /* renamed from: w */
        final /* synthetic */ C25823d f85656w;

        /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$q$a */
        /* loaded from: classes7.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f85657a;

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
                f85657a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16846q(C25823d c25823d, Continuation continuation) {
            super(2, continuation);
            this.f85656w = c25823d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16846q(this.f85656w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x011a  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long currentTimeMillis;
            String str;
            Object m139483h;
            AbstractC25752r abstractC25752r;
            Integer num;
            String str2;
            Object m89937k0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85654u;
            boolean z11 = true;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                AbstractC24862s.m129228b(obj);
                                m89937k0 = obj;
                                z11 = ((Boolean) m89937k0).booleanValue();
                                return AbstractC29094b.m145339a(z11);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        return AbstractC29094b.m145339a(z11);
                    }
                    currentTimeMillis = this.f85653t;
                    AbstractC24862s.m129228b(obj);
                    m139483h = obj;
                    abstractC25752r = (AbstractC25752r) m139483h;
                    if (!(abstractC25752r instanceof AbstractC25752r.b)) {
                        ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                        C25823d c25823d = this.f85656w;
                        this.f85654u = 3;
                        if (zaloCloudMigrationUploader.m89952s0(c25823d, currentTimeMillis, this) == m142578e) {
                            return m142578e;
                        }
                        return AbstractC29094b.m145339a(z11);
                    }
                    if (abstractC25752r instanceof AbstractC25752r.a) {
                        C20096c m132886a = ((AbstractC25752r.a) abstractC25752r).m132886a();
                        ZaloCloudMigrationUploader zaloCloudMigrationUploader2 = ZaloCloudMigrationUploader.this;
                        C25823d c25823d2 = this.f85656w;
                        if (m132886a != null) {
                            num = AbstractC29094b.m145341c(m132886a.m104489a());
                        } else {
                            num = null;
                        }
                        if (m132886a != null) {
                            str2 = m132886a.m104493e();
                        } else {
                            str2 = null;
                        }
                        this.f85654u = 4;
                        m89937k0 = zaloCloudMigrationUploader2.m89937k0(currentTimeMillis, c25823d2, num, str2, this);
                        if (m89937k0 == m142578e) {
                            return m142578e;
                        }
                        z11 = ((Boolean) m89937k0).booleanValue();
                        return AbstractC29094b.m145339a(z11);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145339a(true);
            }
            AbstractC24862s.m129228b(obj);
            ZaloCloudMigrationUploader.this.m89906O(this.f85656w);
            currentTimeMillis = System.currentTimeMillis();
            int i12 = a.f85657a[this.f85656w.m133191q().ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            str = "PotentiallyBackup";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str = "Backup";
                    }
                } else {
                    str = "Local";
                }
            } else {
                str = "Server";
            }
            long m89935j0 = ZaloCloudMigrationUploader.this.m89935j0(this.f85656w);
            ZaloCloudMigrationUploader zaloCloudMigrationUploader3 = ZaloCloudMigrationUploader.this;
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            zaloCloudMigrationUploader3.m89969m0("SMLZCloudMigrationUploader", "Start process " + lowerCase + " item with timeout=" + m89935j0 + "ms: " + this.f85656w, C26676b.b.f126333r);
            if (!this.f85656w.m133183i().m106830b()) {
                ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "[" + str + "] local file not found. Skipped. Item=" + this.f85656w, null, 4, null);
                ZaloCloudMigrationUploader zaloCloudMigrationUploader4 = ZaloCloudMigrationUploader.this;
                C25823d c25823d3 = this.f85656w;
                this.f85654u = 1;
                if (zaloCloudMigrationUploader4.m89948q0(c25823d3, currentTimeMillis, this) == m142578e) {
                    return m142578e;
                }
                return AbstractC29094b.m145339a(true);
            }
            C27258m c27258m = C27258m.f128131a;
            C25823d c25823d4 = this.f85656w;
            this.f85653t = currentTimeMillis;
            this.f85654u = 2;
            m139483h = c27258m.m139483h(c25823d4, m89935j0, this);
            if (m139483h == m142578e) {
                return m142578e;
            }
            abstractC25752r = (AbstractC25752r) m139483h;
            if (!(abstractC25752r instanceof AbstractC25752r.b)) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16846q) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$r */
    /* loaded from: classes7.dex */
    public static final class C16847r extends AbstractC29096d {

        /* renamed from: s */
        Object f85658s;

        /* renamed from: t */
        /* synthetic */ Object f85659t;

        /* renamed from: v */
        int f85661v;

        C16847r(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85659t = obj;
            this.f85661v |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89916Z(null, null, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$s */
    /* loaded from: classes7.dex */
    public static final class C16848s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85662t;

        /* renamed from: u */
        /* synthetic */ Object f85663u;

        /* renamed from: w */
        final /* synthetic */ AtomicInteger f85665w;

        /* renamed from: x */
        final /* synthetic */ ProducerScope f85666x;

        /* renamed from: y */
        final /* synthetic */ int f85667y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16848s(AtomicInteger atomicInteger, ProducerScope producerScope, int i11, Continuation continuation) {
            super(2, continuation);
            this.f85665w = atomicInteger;
            this.f85666x = producerScope;
            this.f85667y = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16848s c16848s = new C16848s(this.f85665w, this.f85666x, this.f85667y, continuation);
            c16848s.f85663u = obj;
            return c16848s;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C25823d c25823d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85662t;
            if (i11 != 0) {
                if (i11 == 1) {
                    c25823d = (C25823d) this.f85663u;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25823d c25823d2 = (C25823d) this.f85663u;
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                this.f85663u = c25823d2;
                this.f85662t = 1;
                Object m89915Y = zaloCloudMigrationUploader.m89915Y(c25823d2, this);
                if (m89915Y == m142578e) {
                    return m142578e;
                }
                c25823d = c25823d2;
                obj = m89915Y;
            }
            if (!((Boolean) obj).booleanValue()) {
                ZaloCloudMigrationUploader.this.f85495o.incrementAndGet();
                C26676b.m136960j("SMLZCloudMigrationUploader", "Local item upload error, item=" + c25823d);
            } else {
                this.f85665w.incrementAndGet();
                ZaloCloudMigrationUploader.this.f85488h.incrementAndGet();
                C26676b.m136960j("SMLZCloudMigrationUploader", "Local item upload successful, item=" + c25823d);
            }
            ZaloCloudMigrationUploader zaloCloudMigrationUploader2 = ZaloCloudMigrationUploader.this;
            zaloCloudMigrationUploader2.m89892A0(this.f85666x, EnumC27250e.f128047p, zaloCloudMigrationUploader2.f85494n.incrementAndGet(), this.f85667y);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C25823d c25823d, Continuation continuation) {
            return ((C16848s) mo238a(c25823d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$t */
    /* loaded from: classes7.dex */
    public static final class C16849t extends AbstractC29096d {

        /* renamed from: s */
        Object f85668s;

        /* renamed from: t */
        Object f85669t;

        /* renamed from: u */
        Object f85670u;

        /* renamed from: v */
        /* synthetic */ Object f85671v;

        /* renamed from: x */
        int f85673x;

        C16849t(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85671v = obj;
            this.f85673x |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89918a0(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$u */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C16850u extends C19071q implements InterfaceC18510q {
        C16850u(Object obj) {
            super(3, obj, AbstractC25321e.class, "getAllLocalItems", "getAllLocalItems(Lcom/zing/zalo/data/zalocloud/migration/ZaloCloudMigrationRepository;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m89990h(((Number) obj).intValue(), ((Number) obj2).intValue(), (Continuation) obj3);
        }

        /* renamed from: h */
        public final Object m89990h(int i11, int i12, Continuation continuation) {
            List m131496e;
            List m131505m;
            InterfaceC25320d interfaceC25320d = (InterfaceC25320d) this.f94922q;
            m131496e = AbstractC25366r.m131496e(EnumC25825f.f123209r);
            m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
            return interfaceC25320d.mo131131m(m131496e, m131505m, i11, i12, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$v */
    /* loaded from: classes7.dex */
    public static final class C16851v extends AbstractC29104l implements InterfaceC18511r {

        /* renamed from: A */
        final /* synthetic */ int f85674A;

        /* renamed from: t */
        int f85675t;

        /* renamed from: u */
        /* synthetic */ int f85676u;

        /* renamed from: v */
        /* synthetic */ int f85677v;

        /* renamed from: w */
        /* synthetic */ Object f85678w;

        /* renamed from: y */
        final /* synthetic */ CoroutineScope f85680y;

        /* renamed from: z */
        final /* synthetic */ ProducerScope f85681z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16851v(CoroutineScope coroutineScope, ProducerScope producerScope, int i11, Continuation continuation) {
            super(4, continuation);
            this.f85680y = coroutineScope;
            this.f85681z = producerScope;
            this.f85674A = i11;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            return m89991r(((Number) obj).intValue(), ((Number) obj2).intValue(), (List) obj3, (Continuation) obj4);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85675t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                int i12 = this.f85676u;
                int i13 = this.f85677v;
                List list = (List) this.f85678w;
                C26676b.m136952b("SMLZCloudMigrationUploader", "doUploadLocalItemsPaging(): Process on page=" + i12 + ", offset=" + i13 + ", pagedItemSize=" + list.size());
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                CoroutineScope coroutineScope = this.f85680y;
                ProducerScope producerScope = this.f85681z;
                int i14 = this.f85674A;
                this.f85675t = 1;
                obj = zaloCloudMigrationUploader.m89916Z(coroutineScope, producerScope, list, i14, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        /* renamed from: r */
        public final Object m89991r(int i11, int i12, List list, Continuation continuation) {
            C16851v c16851v = new C16851v(this.f85680y, this.f85681z, this.f85674A, continuation);
            c16851v.f85676u = i11;
            c16851v.f85677v = i12;
            c16851v.f85678w = list;
            return c16851v.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$w */
    /* loaded from: classes7.dex */
    public static final class C16852w extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: B */
        final /* synthetic */ C25823d f85683B;

        /* renamed from: t */
        long f85684t;

        /* renamed from: u */
        long f85685u;

        /* renamed from: v */
        int f85686v;

        /* renamed from: w */
        Object f85687w;

        /* renamed from: x */
        Object f85688x;

        /* renamed from: y */
        Object f85689y;

        /* renamed from: z */
        int f85690z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16852w(C25823d c25823d, Continuation continuation) {
            super(2, continuation);
            this.f85683B = c25823d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C16852w(this.f85683B, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01bc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0192 -> B:17:0x0195). Please report as a decompilation issue!!! */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            long m89935j0;
            long currentTimeMillis;
            String m139481c;
            String str;
            C16852w c16852w;
            String str2;
            boolean z11;
            BaseResponse baseResponse;
            String str3;
            int i11;
            Integer num;
            Object obj2;
            String str4;
            m142578e = AbstractC28298d.m142578e();
            int i12 = this.f85690z;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    AbstractC24862s.m129228b(obj);
                                    return obj;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC24862s.m129228b(obj);
                            return AbstractC29094b.m145339a(true);
                        }
                        int i13 = this.f85686v;
                        long j11 = this.f85685u;
                        m89935j0 = this.f85684t;
                        String str5 = (String) this.f85689y;
                        String str6 = (String) this.f85688x;
                        str2 = (String) this.f85687w;
                        AbstractC24862s.m129228b(obj);
                        int i14 = i13;
                        str = str5;
                        str3 = str6;
                        Object m139482g = obj;
                        currentTimeMillis = j11;
                        c16852w = this;
                        baseResponse = (BaseResponse) m139482g;
                        z11 = !baseResponse.m41273c();
                        i11 = i14;
                        if (!z11) {
                            i14 = i11 + 1;
                            if (i11 < 3) {
                                C27258m c27258m = C27258m.f128131a;
                                MsgInfo m133179e = c16852w.f85683B.m133179e();
                                String m133180f = c16852w.f85683B.m133180f();
                                String m133178d = c16852w.f85683B.m133178d();
                                c16852w.f85687w = str2;
                                c16852w.f85688x = str3;
                                c16852w.f85689y = str;
                                c16852w.f85684t = m89935j0;
                                c16852w.f85685u = currentTimeMillis;
                                c16852w.f85686v = i14;
                                c16852w.f85690z = 3;
                                m139482g = c27258m.m139482g(m133179e, m133180f, null, str2, m133178d, str3, str, m89935j0, c16852w);
                                if (m139482g == m142578e) {
                                    return m142578e;
                                }
                                baseResponse = (BaseResponse) m139482g;
                                z11 = !baseResponse.m41273c();
                                i11 = i14;
                                if (!z11) {
                                }
                            }
                        }
                        if (!z11) {
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                            C25823d c25823d = c16852w.f85683B;
                            c16852w.f85687w = null;
                            c16852w.f85688x = null;
                            c16852w.f85689y = null;
                            c16852w.f85690z = 4;
                            if (zaloCloudMigrationUploader.m89952s0(c25823d, currentTimeMillis, c16852w) == m142578e) {
                                return m142578e;
                            }
                            return AbstractC29094b.m145339a(true);
                        }
                        ZaloCloudMigrationUploader zaloCloudMigrationUploader2 = ZaloCloudMigrationUploader.this;
                        C25823d c25823d2 = c16852w.f85683B;
                        if (baseResponse != null) {
                            num = AbstractC29094b.m145341c(baseResponse.m41271a());
                        } else {
                            num = null;
                        }
                        if (baseResponse != null) {
                            str4 = baseResponse.m41272b();
                            obj2 = null;
                        } else {
                            obj2 = null;
                            str4 = null;
                        }
                        c16852w.f85687w = obj2;
                        c16852w.f85688x = obj2;
                        c16852w.f85689y = obj2;
                        c16852w.f85690z = 5;
                        Object m89937k0 = zaloCloudMigrationUploader2.m89937k0(currentTimeMillis, c25823d2, num, str4, c16852w);
                        if (m89937k0 == m142578e) {
                            return m142578e;
                        }
                        return m89937k0;
                    }
                    AbstractC24862s.m129228b(obj);
                    return AbstractC29094b.m145339a(true);
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                ZaloCloudMigrationUploader.this.m89906O(this.f85683B);
                m89935j0 = ZaloCloudMigrationUploader.this.m89935j0(this.f85683B);
                ZaloCloudMigrationUploader.this.m89969m0("SMLZCloudMigrationUploader", "Start upload server item with timeout=" + m89935j0 + "ms: " + this.f85683B, C26676b.b.f126333r);
                if (ZaloCloudMigrationUploader.this.m89939l0(this.f85683B)) {
                    ZaloCloudMigrationUploader.m89942n0(ZaloCloudMigrationUploader.this, "SMLZCloudMigrationUploader", "Server item EXPIRED: msgId=" + this.f85683B.m133185k().m41044h() + ", localExistence=" + AbstractC23041d2.m118194A(this.f85683B.m133182h()), null, 4, null);
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader3 = ZaloCloudMigrationUploader.this;
                    C25823d c25823d3 = this.f85683B;
                    this.f85690z = 1;
                    if (zaloCloudMigrationUploader3.m89944o0(c25823d3, this) == m142578e) {
                        return m142578e;
                    }
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                    String m133184j = this.f85683B.m133184j();
                    if (this.f85683B.m133193t()) {
                        try {
                            C24860q m17516x = AbstractC3489d.m17516x(this.f85683B.m133180f());
                            String str7 = (String) m17516x.m129213a();
                            int intValue = ((Number) m17516x.m129214b()).intValue();
                            C27258m c27258m2 = C27258m.f128131a;
                            m139481c = c27258m2.m139481c(C25271f.f121221a.m130794a(str7, intValue));
                            if (m133184j != null) {
                                C24860q m17479b = AbstractC3488c.m17479b(m133184j);
                                byte[] bArr = (byte[]) m17479b.m129213a();
                                AbstractC25270e abstractC25270e = (AbstractC25270e) m17479b.m129214b();
                                String m134963b = AbstractC26246b.m134963b(bArr);
                                str = c27258m2.m139481c(abstractC25270e);
                                m133184j = m134963b;
                            } else {
                                str = null;
                            }
                        } catch (Exception e11) {
                            C26676b.m136954d("SMLZCloudMigrationUploader", e11);
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader4 = ZaloCloudMigrationUploader.this;
                            C25823d c25823d4 = this.f85683B;
                            this.f85690z = 2;
                            if (zaloCloudMigrationUploader4.m89948q0(c25823d4, currentTimeMillis, this) == m142578e) {
                                return m142578e;
                            }
                        }
                    } else {
                        str = null;
                        m139481c = null;
                    }
                    c16852w = this;
                    str2 = m139481c;
                    z11 = false;
                    baseResponse = null;
                    str3 = m133184j;
                    i11 = 0;
                    if (!z11) {
                    }
                    if (!z11) {
                    }
                }
            }
            return AbstractC29094b.m145339a(false);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C16852w) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$x */
    /* loaded from: classes7.dex */
    public static final class C16853x extends AbstractC29096d {

        /* renamed from: s */
        Object f85691s;

        /* renamed from: t */
        /* synthetic */ Object f85692t;

        /* renamed from: v */
        int f85694v;

        C16853x(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85692t = obj;
            this.f85694v |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89922c0(null, null, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$y */
    /* loaded from: classes7.dex */
    public static final class C16854y extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85695t;

        /* renamed from: u */
        /* synthetic */ Object f85696u;

        /* renamed from: w */
        final /* synthetic */ AtomicInteger f85698w;

        /* renamed from: x */
        final /* synthetic */ ProducerScope f85699x;

        /* renamed from: y */
        final /* synthetic */ int f85700y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16854y(AtomicInteger atomicInteger, ProducerScope producerScope, int i11, Continuation continuation) {
            super(2, continuation);
            this.f85698w = atomicInteger;
            this.f85699x = producerScope;
            this.f85700y = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16854y c16854y = new C16854y(this.f85698w, this.f85699x, this.f85700y, continuation);
            c16854y.f85696u = obj;
            return c16854y;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C25823d c25823d;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85695t;
            if (i11 != 0) {
                if (i11 == 1) {
                    c25823d = (C25823d) this.f85696u;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C25823d c25823d2 = (C25823d) this.f85696u;
                ZaloCloudMigrationUploader zaloCloudMigrationUploader = ZaloCloudMigrationUploader.this;
                this.f85696u = c25823d2;
                this.f85695t = 1;
                Object m89920b0 = zaloCloudMigrationUploader.m89920b0(c25823d2, this);
                if (m89920b0 == m142578e) {
                    return m142578e;
                }
                c25823d = c25823d2;
                obj = m89920b0;
            }
            if (!((Boolean) obj).booleanValue()) {
                ZaloCloudMigrationUploader.this.f85492l.incrementAndGet();
                C26676b.m136960j("SMLZCloudMigrationUploader", "Server item upload error, item=" + c25823d);
            } else {
                this.f85698w.incrementAndGet();
                ZaloCloudMigrationUploader.this.f85488h.incrementAndGet();
                C26676b.m136960j("SMLZCloudMigrationUploader", "Server item upload successful, item=" + c25823d);
            }
            ZaloCloudMigrationUploader zaloCloudMigrationUploader2 = ZaloCloudMigrationUploader.this;
            zaloCloudMigrationUploader2.m89892A0(this.f85699x, EnumC27250e.f128048q, zaloCloudMigrationUploader2.f85491k.incrementAndGet(), this.f85700y);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(C25823d c25823d, Continuation continuation) {
            return ((C16854y) mo238a(c25823d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zalocloud.migration.ZaloCloudMigrationUploader$z */
    /* loaded from: classes7.dex */
    public static final class C16855z extends AbstractC29096d {

        /* renamed from: s */
        Object f85701s;

        /* renamed from: t */
        Object f85702t;

        /* renamed from: u */
        Object f85703u;

        /* renamed from: v */
        /* synthetic */ Object f85704v;

        /* renamed from: x */
        int f85706x;

        C16855z(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85704v = obj;
            this.f85706x |= Integer.MIN_VALUE;
            return ZaloCloudMigrationUploader.this.m89924d0(null, null, this);
        }
    }

    public ZaloCloudMigrationUploader(InterfaceC25320d interfaceC25320d, InterfaceC23792b interfaceC23792b, C22479c c22479c, C27252g c27252g, CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(interfaceC25320d, "repository");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(c22479c, "getDriveFileMetadata");
        AbstractC19074t.m100208f(c27252g, "backupDownloader");
        AbstractC19074t.m100208f(coroutineDispatcher, "ioDispatcher");
        this.f85481a = interfaceC25320d;
        this.f85482b = interfaceC23792b;
        this.f85483c = c22479c;
        this.f85484d = c27252g;
        this.f85485e = coroutineDispatcher;
        this.f85488h = new AtomicInteger();
        this.f85490j = "";
        this.f85491k = new AtomicInteger(0);
        this.f85492l = new AtomicInteger(0);
        this.f85493m = new AtomicInteger(0);
        this.f85494n = new AtomicInteger(0);
        this.f85495o = new AtomicInteger(0);
        this.f85496p = new AtomicInteger(0);
        this.f85497q = new AtomicInteger(0);
        this.f85498r = new AtomicInteger(0);
        this.f85499s = new AtomicInteger(0);
        this.f85500t = new AtomicInteger(0);
        this.f85501u = new AtomicInteger(0);
        this.f85502v = new AtomicInteger(0);
        this.f85503w = new AtomicInteger(0);
        this.f85504x = new AtomicInteger(0);
        this.f85505y = new AtomicInteger(0);
        this.f85477C = new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public final void m89892A0(ProducerScope producerScope, EnumC27250e enumC27250e, int i11, int i12) {
        this.f85486f = enumC27250e;
        this.f85487g = m89905N(this.f85488h.get(), this.f85489i);
        producerScope.mo112912p(new AbstractC16866f.d(enumC27250e, i11, i12, this.f85488h.get(), this.f85489i, this.f85490j, this.f85487g));
    }

    /* renamed from: N */
    private final float m89905N(int i11, int i12) {
        float f11;
        float m116583f;
        if (this.f85479E) {
            f11 = 0.99f;
        } else {
            f11 = 1.0f;
        }
        if (i11 < i12) {
            m116583f = AbstractC22543l.m116583f(i11 / i12, 1.0f);
            return m116583f;
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final void m89906O(C25823d c25823d) {
        boolean m118269d;
        if (C16818b.f85508a[c25823d.m133191q().ordinal()] == 1) {
            m118269d = C23055e5.m118273h(false, 1, null);
        } else {
            m118269d = C23055e5.m118269d();
        }
        if (m118269d) {
        } else {
            throw new Failure.NetworkNotAvailable("Network not available");
        }
    }

    /* renamed from: P */
    private final void m89907P(C25823d c25823d) {
        if (AbstractC27247b.m139396h(c25823d)) {
            this.f85505y.incrementAndGet();
            return;
        }
        int i11 = C16818b.f85508a[c25823d.m133191q().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        this.f85502v.incrementAndGet();
                        return;
                    }
                    return;
                }
                this.f85499s.incrementAndGet();
                return;
            }
            this.f85496p.incrementAndGet();
            return;
        }
        this.f85493m.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89908Q(CoroutineScope coroutineScope, ProducerScope producerScope, List list, Continuation continuation) {
        C16820c c16820c;
        Object m142578e;
        int i11;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        ConcurrentHashMap concurrentHashMap;
        List m131502j;
        InterfaceC25320d interfaceC25320d;
        List m131496e;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader2;
        if (continuation instanceof C16820c) {
            c16820c = (C16820c) continuation;
            int i12 = c16820c.f85521w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16820c.f85521w = i12 - Integer.MIN_VALUE;
                Object obj = c16820c.f85519u;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16820c.f85521w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            concurrentHashMap = (ConcurrentHashMap) c16820c.f85518t;
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader3 = (ZaloCloudMigrationUploader) c16820c.f85517s;
                            AbstractC24862s.m129228b(obj);
                            zaloCloudMigrationUploader2 = zaloCloudMigrationUploader3;
                            m89942n0(zaloCloudMigrationUploader2, "SMLZCloudMigrationUploader", "Complete reanalyze potentially backup items, analyzed backup size=" + concurrentHashMap.size(), null, 4, null);
                            Collection values = concurrentHashMap.values();
                            AbstractC19074t.m100207e(values, "<get-values>(...)");
                            return values;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    concurrentHashMap = (ConcurrentHashMap) c16820c.f85518t;
                    zaloCloudMigrationUploader = (ZaloCloudMigrationUploader) c16820c.f85517s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (list.isEmpty()) {
                        m131502j = AbstractC25368s.m131502j();
                        return m131502j;
                    }
                    m89942n0(this, "SMLZCloudMigrationUploader", "Start reanalyze potentially backup items, size=" + list.size(), null, 4, null);
                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    C16822d c16822d = new C16822d(concurrentHashMap2);
                    c16820c.f85517s = this;
                    c16820c.f85518t = concurrentHashMap2;
                    c16820c.f85521w = 1;
                    if (m89962x0(coroutineScope, list, c16822d, c16820c) == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationUploader = this;
                    concurrentHashMap = concurrentHashMap2;
                }
                zaloCloudMigrationUploader.f85479E = false;
                interfaceC25320d = zaloCloudMigrationUploader.f85481a;
                m131496e = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                c16820c.f85517s = zaloCloudMigrationUploader;
                c16820c.f85518t = concurrentHashMap;
                c16820c.f85521w = 2;
                if (interfaceC25320d.mo131134p(m131496e, c16820c) != m142578e) {
                    return m142578e;
                }
                zaloCloudMigrationUploader2 = zaloCloudMigrationUploader;
                m89942n0(zaloCloudMigrationUploader2, "SMLZCloudMigrationUploader", "Complete reanalyze potentially backup items, analyzed backup size=" + concurrentHashMap.size(), null, 4, null);
                Collection values2 = concurrentHashMap.values();
                AbstractC19074t.m100207e(values2, "<get-values>(...)");
                return values2;
            }
        }
        c16820c = new C16820c(continuation);
        Object obj2 = c16820c.f85519u;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16820c.f85521w;
        if (i11 == 0) {
        }
        zaloCloudMigrationUploader.f85479E = false;
        interfaceC25320d = zaloCloudMigrationUploader.f85481a;
        m131496e = AbstractC25366r.m131496e(EnumC25825f.f123211t);
        c16820c.f85517s = zaloCloudMigrationUploader;
        c16820c.f85518t = concurrentHashMap;
        c16820c.f85521w = 2;
        if (interfaceC25320d.mo131134p(m131496e, c16820c) != m142578e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89909R(CoroutineScope coroutineScope, ProducerScope producerScope, Continuation continuation) {
        C16824e c16824e;
        Object m142578e;
        int i11;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        C19055h0 c19055h0;
        InterfaceC25320d interfaceC25320d;
        List m131496e;
        if (continuation instanceof C16824e) {
            c16824e = (C16824e) continuation;
            int i12 = c16824e.f85545w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16824e.f85545w = i12 - Integer.MIN_VALUE;
                Object obj = c16824e.f85543u;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16824e.f85545w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c19055h0 = (C19055h0) c16824e.f85541s;
                            AbstractC24862s.m129228b(obj);
                            return AbstractC29094b.m145341c(c19055h0.f94931p);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c19055h0 = (C19055h0) c16824e.f85542t;
                    zaloCloudMigrationUploader = (ZaloCloudMigrationUploader) c16824e.f85541s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    m89942n0(this, "SMLZCloudMigrationUploader", "Start reanalyze potentially backup items", null, 4, null);
                    C19055h0 c19055h02 = new C19055h0();
                    C16826f c16826f = new C16826f(this.f85481a);
                    C16828g c16828g = new C16828g(coroutineScope, c19055h02, null);
                    c16824e.f85541s = this;
                    c16824e.f85542t = c19055h02;
                    c16824e.f85545w = 1;
                    if (m89960w0(c16826f, c16828g, c16824e) == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationUploader = this;
                    c19055h0 = c19055h02;
                }
                zaloCloudMigrationUploader.f85479E = false;
                interfaceC25320d = zaloCloudMigrationUploader.f85481a;
                m131496e = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                c16824e.f85541s = c19055h0;
                c16824e.f85542t = null;
                c16824e.f85545w = 2;
                if (interfaceC25320d.mo131134p(m131496e, c16824e) == m142578e) {
                    return m142578e;
                }
                return AbstractC29094b.m145341c(c19055h0.f94931p);
            }
        }
        c16824e = new C16824e(continuation);
        Object obj2 = c16824e.f85543u;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16824e.f85545w;
        if (i11 == 0) {
        }
        zaloCloudMigrationUploader.f85479E = false;
        interfaceC25320d = zaloCloudMigrationUploader.f85481a;
        m131496e = AbstractC25366r.m131496e(EnumC25825f.f123211t);
        c16824e.f85541s = c19055h0;
        c16824e.f85542t = null;
        c16824e.f85545w = 2;
        if (interfaceC25320d.mo131134p(m131496e, c16824e) == m142578e) {
        }
        return AbstractC29094b.m145341c(c19055h0.f94931p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final Object m89910T(C25823d c25823d, Continuation continuation) {
        return m89915Y(c25823d, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89911U(CoroutineScope coroutineScope, ProducerScope producerScope, List list, int i11, List list2, Continuation continuation) {
        C16832i c16832i;
        Object m142578e;
        int i12;
        List m131187O0;
        C19055h0 c19055h0;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        Object m89908Q;
        AtomicInteger atomicInteger;
        Collection collection;
        CoroutineScope coroutineScope2 = coroutineScope;
        ProducerScope producerScope2 = producerScope;
        if (continuation instanceof C16832i) {
            c16832i = (C16832i) continuation;
            int i13 = c16832i.f85584z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16832i.f85584z = i13 - Integer.MIN_VALUE;
                Object obj = c16832i.f85582x;
                m142578e = AbstractC28298d.m142578e();
                i12 = c16832i.f85584z;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            atomicInteger = (AtomicInteger) c16832i.f85577s;
                            AbstractC24862s.m129228b(obj);
                            return AbstractC29094b.m145341c(atomicInteger.get());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C19055h0 c19055h02 = (C19055h0) c16832i.f85581w;
                    List list3 = (List) c16832i.f85580v;
                    ProducerScope producerScope3 = (ProducerScope) c16832i.f85579u;
                    CoroutineScope coroutineScope3 = (CoroutineScope) c16832i.f85578t;
                    zaloCloudMigrationUploader = (ZaloCloudMigrationUploader) c16832i.f85577s;
                    AbstractC24862s.m129228b(obj);
                    c19055h0 = c19055h02;
                    coroutineScope2 = coroutineScope3;
                    m131187O0 = list3;
                    producerScope2 = producerScope3;
                    m89908Q = obj;
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f85480F) {
                        return AbstractC29094b.m145341c(0);
                    }
                    if (!list.isEmpty() || !list2.isEmpty()) {
                        m131187O0 = AbstractC25332a0.m131187O0(list);
                        c19055h0 = new C19055h0();
                        c19055h0.f94931p = i11;
                        if (!list2.isEmpty()) {
                            c16832i.f85577s = this;
                            c16832i.f85578t = coroutineScope2;
                            c16832i.f85579u = producerScope2;
                            c16832i.f85580v = m131187O0;
                            c16832i.f85581w = c19055h0;
                            c16832i.f85584z = 1;
                            m89908Q = m89908Q(coroutineScope2, producerScope2, list2, c16832i);
                            if (m89908Q == m142578e) {
                                return m142578e;
                            }
                            zaloCloudMigrationUploader = this;
                        } else {
                            zaloCloudMigrationUploader = this;
                            zaloCloudMigrationUploader.m89892A0(producerScope2, EnumC27250e.f128049r, zaloCloudMigrationUploader.f85497q.get(), c19055h0.f94931p);
                            AtomicInteger atomicInteger2 = new AtomicInteger(0);
                            if (C23055e5.m118270e()) {
                                C16834j c16834j = new C16834j(atomicInteger2, producerScope2, c19055h0, null);
                                c16832i.f85577s = atomicInteger2;
                                c16832i.f85578t = null;
                                c16832i.f85579u = null;
                                c16832i.f85580v = null;
                                c16832i.f85581w = null;
                                c16832i.f85584z = 2;
                                if (zaloCloudMigrationUploader.m89958v0(m131187O0, coroutineScope2, c16834j, c16832i) == m142578e) {
                                    return m142578e;
                                }
                                atomicInteger = atomicInteger2;
                                return AbstractC29094b.m145341c(atomicInteger.get());
                            }
                            throw new Failure.NetworkWifi("Network is not wifi type");
                        }
                    } else {
                        return AbstractC29094b.m145341c(0);
                    }
                }
                collection = (Collection) m89908Q;
                if (true ^ collection.isEmpty()) {
                    m131187O0.addAll(collection);
                    c19055h0.f94931p += collection.size();
                    zaloCloudMigrationUploader.f85489i += collection.size();
                }
                zaloCloudMigrationUploader.m89892A0(producerScope2, EnumC27250e.f128049r, zaloCloudMigrationUploader.f85497q.get(), c19055h0.f94931p);
                AtomicInteger atomicInteger22 = new AtomicInteger(0);
                if (C23055e5.m118270e()) {
                }
            }
        }
        c16832i = new C16832i(continuation);
        Object obj2 = c16832i.f85582x;
        m142578e = AbstractC28298d.m142578e();
        i12 = c16832i.f85584z;
        if (i12 == 0) {
        }
        collection = (Collection) m89908Q;
        if (true ^ collection.isEmpty()) {
        }
        zaloCloudMigrationUploader.m89892A0(producerScope2, EnumC27250e.f128049r, zaloCloudMigrationUploader.f85497q.get(), c19055h0.f94931p);
        AtomicInteger atomicInteger222 = new AtomicInteger(0);
        if (C23055e5.m118270e()) {
        }
    }

    /* renamed from: V */
    static /* synthetic */ Object m89912V(ZaloCloudMigrationUploader zaloCloudMigrationUploader, CoroutineScope coroutineScope, ProducerScope producerScope, List list, int i11, List list2, Continuation continuation, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            list2 = AbstractC25368s.m131502j();
        }
        return zaloCloudMigrationUploader.m89911U(coroutineScope, producerScope, list, i11, list2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89913W(CoroutineScope coroutineScope, ProducerScope producerScope, Continuation continuation) {
        C16836k c16836k;
        Object obj;
        Object m142578e;
        int i11;
        int i12;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        Object obj2;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader2;
        List m131505m;
        List m131496e;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader3;
        CoroutineScope coroutineScope2;
        ProducerScope producerScope2;
        int intValue;
        CoroutineScope coroutineScope3 = coroutineScope;
        ProducerScope producerScope3 = producerScope;
        if (continuation instanceof C16836k) {
            c16836k = (C16836k) continuation;
            int i13 = c16836k.f85608z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16836k.f85608z = i13 - Integer.MIN_VALUE;
                obj = c16836k.f85606x;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16836k.f85608z;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        producerScope2 = (ProducerScope) c16836k.f85603u;
                        coroutineScope2 = (CoroutineScope) c16836k.f85602t;
                        zaloCloudMigrationUploader3 = (ZaloCloudMigrationUploader) c16836k.f85601s;
                        AbstractC24862s.m129228b(obj);
                        intValue = ((Number) obj).intValue();
                        if (intValue != 0) {
                            return C24848g0.f119245a;
                        }
                        m89942n0(zaloCloudMigrationUploader3, "SMLZCloudMigrationUploader", "Start migrate backup items, size=" + intValue, null, 4, null);
                        zaloCloudMigrationUploader3.m89892A0(producerScope2, EnumC27250e.f128049r, zaloCloudMigrationUploader3.f85497q.get(), intValue);
                        if (C23055e5.m118270e()) {
                            C16838l c16838l = new C16838l(zaloCloudMigrationUploader3.f85481a);
                            C16840m c16840m = new C16840m(coroutineScope2, producerScope2, intValue, null);
                            c16836k.f85601s = null;
                            c16836k.f85602t = null;
                            c16836k.f85603u = null;
                            c16836k.f85608z = 3;
                            if (zaloCloudMigrationUploader3.m89960w0(c16838l, c16840m, c16836k) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                        throw new Failure.NetworkWifi("Network is not wifi type");
                    }
                    int i14 = c16836k.f85605w;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader4 = (ZaloCloudMigrationUploader) c16836k.f85604v;
                    ProducerScope producerScope4 = (ProducerScope) c16836k.f85603u;
                    CoroutineScope coroutineScope4 = (CoroutineScope) c16836k.f85602t;
                    zaloCloudMigrationUploader = (ZaloCloudMigrationUploader) c16836k.f85601s;
                    AbstractC24862s.m129228b(obj);
                    i12 = i14;
                    coroutineScope3 = coroutineScope4;
                    obj2 = obj;
                    zaloCloudMigrationUploader2 = zaloCloudMigrationUploader4;
                    producerScope3 = producerScope4;
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f85480F) {
                        return C24848g0.f119245a;
                    }
                    i12 = this.f85489i;
                    c16836k.f85601s = this;
                    c16836k.f85602t = coroutineScope3;
                    c16836k.f85603u = producerScope3;
                    c16836k.f85604v = this;
                    c16836k.f85605w = i12;
                    c16836k.f85608z = 1;
                    Object m89909R = m89909R(coroutineScope3, producerScope3, c16836k);
                    if (m89909R == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationUploader = this;
                    obj2 = m89909R;
                    zaloCloudMigrationUploader2 = zaloCloudMigrationUploader;
                }
                zaloCloudMigrationUploader2.f85489i = i12 + ((Number) obj2).intValue();
                InterfaceC25320d interfaceC25320d = zaloCloudMigrationUploader.f85481a;
                m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                m131496e = AbstractC25366r.m131496e(EnumC25825f.f123210s);
                c16836k.f85601s = zaloCloudMigrationUploader;
                c16836k.f85602t = coroutineScope3;
                c16836k.f85603u = producerScope3;
                c16836k.f85604v = null;
                c16836k.f85608z = 2;
                obj = interfaceC25320d.mo131121c(m131496e, m131505m, c16836k);
                if (obj != m142578e) {
                    return m142578e;
                }
                zaloCloudMigrationUploader3 = zaloCloudMigrationUploader;
                ProducerScope producerScope5 = producerScope3;
                coroutineScope2 = coroutineScope3;
                producerScope2 = producerScope5;
                intValue = ((Number) obj).intValue();
                if (intValue != 0) {
                }
            }
        }
        c16836k = new C16836k(continuation);
        obj = c16836k.f85606x;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16836k.f85608z;
        if (i11 == 0) {
        }
        zaloCloudMigrationUploader2.f85489i = i12 + ((Number) obj2).intValue();
        InterfaceC25320d interfaceC25320d2 = zaloCloudMigrationUploader.f85481a;
        m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
        m131496e = AbstractC25366r.m131496e(EnumC25825f.f123210s);
        c16836k.f85601s = zaloCloudMigrationUploader;
        c16836k.f85602t = coroutineScope3;
        c16836k.f85603u = producerScope3;
        c16836k.f85604v = null;
        c16836k.f85608z = 2;
        obj = interfaceC25320d2.mo131121c(m131496e, m131505m, c16836k);
        if (obj != m142578e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x0050, B:23:0x0373, B:33:0x006a, B:34:0x03c3, B:58:0x0084, B:75:0x0310, B:77:0x0337, B:78:0x033f, B:68:0x038d, B:64:0x03b2, B:95:0x0263), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x038a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x0050, B:23:0x0373, B:33:0x006a, B:34:0x03c3, B:58:0x0084, B:75:0x0310, B:77:0x0337, B:78:0x033f, B:68:0x038d, B:64:0x03b2, B:95:0x0263), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0291 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0337 A[Catch: all -> 0x0055, TryCatch #2 {all -> 0x0055, blocks: (B:22:0x0050, B:23:0x0373, B:33:0x006a, B:34:0x03c3, B:58:0x0084, B:75:0x0310, B:77:0x0337, B:78:0x033f, B:68:0x038d, B:64:0x03b2, B:95:0x0263), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0372 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89914X(ProducerScope producerScope, Continuation continuation) {
        C16842n c16842n;
        Object m142578e;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader2;
        Object obj;
        ProducerScope producerScope2;
        List m131505m;
        Object m131138a;
        ProducerScope producerScope3;
        AtomicInteger atomicInteger;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader3;
        List m131496e;
        Object m131138a2;
        ProducerScope producerScope4;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader4;
        int i11;
        ProducerScope producerScope5;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader5;
        ProducerScope producerScope6;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader6;
        String m129183b;
        AbstractC16866f.e eVar;
        EnumC27250e enumC27250e;
        EnumC27250e enumC27250e2;
        CoroutineDispatcher m112680b;
        C16845p c16845p;
        boolean z11;
        EnumC27250e enumC27250e3;
        try {
            if (continuation instanceof C16842n) {
                c16842n = (C16842n) continuation;
                int i12 = c16842n.f85637y;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c16842n.f85637y = i12 - Integer.MIN_VALUE;
                    Object obj2 = c16842n.f85635w;
                    m142578e = AbstractC28298d.m142578e();
                    switch (c16842n.f85637y) {
                        case 0:
                            AbstractC24862s.m129228b(obj2);
                            InterfaceC25320d interfaceC25320d = this.f85481a;
                            c16842n.f85631s = this;
                            c16842n.f85632t = producerScope;
                            c16842n.f85633u = this;
                            c16842n.f85637y = 1;
                            Object mo131128j = interfaceC25320d.mo131128j(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, c16842n);
                            if (mo131128j == m142578e) {
                                return m142578e;
                            }
                            zaloCloudMigrationUploader = this;
                            zaloCloudMigrationUploader2 = zaloCloudMigrationUploader;
                            obj = mo131128j;
                            producerScope2 = producerScope;
                            zaloCloudMigrationUploader.f85506z = ((Number) obj).intValue();
                            zaloCloudMigrationUploader2.f85480F = zaloCloudMigrationUploader2.f85481a.mo131127i();
                            zaloCloudMigrationUploader2.f85476B = zaloCloudMigrationUploader2.f85481a.mo131133o();
                            zaloCloudMigrationUploader2.f85477C.clear();
                            zaloCloudMigrationUploader2.f85491k.set(0);
                            zaloCloudMigrationUploader2.f85492l.set(0);
                            zaloCloudMigrationUploader2.f85493m.set(0);
                            zaloCloudMigrationUploader2.f85494n.set(0);
                            zaloCloudMigrationUploader2.f85495o.set(0);
                            zaloCloudMigrationUploader2.f85496p.set(0);
                            zaloCloudMigrationUploader2.f85497q.set(0);
                            zaloCloudMigrationUploader2.f85498r.set(0);
                            zaloCloudMigrationUploader2.f85499s.set(0);
                            zaloCloudMigrationUploader2.f85500t.set(0);
                            zaloCloudMigrationUploader2.f85501u.set(0);
                            zaloCloudMigrationUploader2.f85502v.set(0);
                            zaloCloudMigrationUploader2.f85503w.set(0);
                            zaloCloudMigrationUploader2.f85504x.set(0);
                            zaloCloudMigrationUploader2.f85505y.set(0);
                            zaloCloudMigrationUploader2.f85486f = EnumC27250e.f128048q;
                            zaloCloudMigrationUploader2.f85478D = false;
                            AtomicInteger atomicInteger2 = zaloCloudMigrationUploader2.f85488h;
                            InterfaceC25320d interfaceC25320d2 = zaloCloudMigrationUploader2.f85481a;
                            m131505m = AbstractC25368s.m131505m(EnumC25824e.f123202r, EnumC25824e.f123204t);
                            c16842n.f85631s = zaloCloudMigrationUploader2;
                            c16842n.f85632t = producerScope2;
                            c16842n.f85633u = atomicInteger2;
                            c16842n.f85637y = 2;
                            m131138a = InterfaceC25320d.a.m131138a(interfaceC25320d2, null, m131505m, c16842n, 1, null);
                            if (m131138a != m142578e) {
                                return m142578e;
                            }
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader7 = zaloCloudMigrationUploader2;
                            producerScope3 = producerScope2;
                            obj2 = m131138a;
                            atomicInteger = atomicInteger2;
                            zaloCloudMigrationUploader3 = zaloCloudMigrationUploader7;
                            atomicInteger.set(((Number) obj2).intValue());
                            InterfaceC25320d interfaceC25320d3 = zaloCloudMigrationUploader3.f85481a;
                            m131496e = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                            c16842n.f85631s = zaloCloudMigrationUploader3;
                            c16842n.f85632t = producerScope3;
                            c16842n.f85633u = null;
                            c16842n.f85637y = 3;
                            obj2 = InterfaceC25320d.a.m131138a(interfaceC25320d3, m131496e, null, c16842n, 2, null);
                            if (obj2 == m142578e) {
                                return m142578e;
                            }
                            int intValue = ((Number) obj2).intValue();
                            zaloCloudMigrationUploader3.f85479E = intValue > 0;
                            InterfaceC25320d interfaceC25320d4 = zaloCloudMigrationUploader3.f85481a;
                            c16842n.f85631s = zaloCloudMigrationUploader3;
                            c16842n.f85632t = producerScope3;
                            c16842n.f85633u = zaloCloudMigrationUploader3;
                            c16842n.f85634v = intValue;
                            c16842n.f85637y = 4;
                            m131138a2 = InterfaceC25320d.a.m131138a(interfaceC25320d4, null, null, c16842n, 3, null);
                            if (m131138a2 == m142578e) {
                                return m142578e;
                            }
                            producerScope4 = producerScope3;
                            zaloCloudMigrationUploader4 = zaloCloudMigrationUploader3;
                            i11 = intValue;
                            obj2 = m131138a2;
                            zaloCloudMigrationUploader4.f85489i = ((Number) obj2).intValue() - i11;
                            zaloCloudMigrationUploader3.f85487g = zaloCloudMigrationUploader3.m89905N(zaloCloudMigrationUploader3.f85488h.get(), zaloCloudMigrationUploader3.f85489i);
                            InterfaceC25320d interfaceC25320d5 = zaloCloudMigrationUploader3.f85481a;
                            c16842n.f85631s = zaloCloudMigrationUploader3;
                            c16842n.f85632t = producerScope4;
                            c16842n.f85633u = zaloCloudMigrationUploader3;
                            c16842n.f85637y = 5;
                            obj2 = interfaceC25320d5.mo131128j(4000, c16842n);
                            if (obj2 != m142578e) {
                                return m142578e;
                            }
                            producerScope5 = producerScope4;
                            zaloCloudMigrationUploader5 = zaloCloudMigrationUploader3;
                            zaloCloudMigrationUploader5.f85475A = ((Number) obj2).intValue();
                            zaloCloudMigrationUploader3.m89931h0();
                            if (C23055e5.m118273h(false, 1, null)) {
                                EnumC27250e enumC27250e4 = zaloCloudMigrationUploader3.f85486f;
                                if (enumC27250e4 == null) {
                                    AbstractC19074t.m100223u("currentStep");
                                    enumC27250e4 = null;
                                }
                                AbstractC16866f.c cVar = new AbstractC16866f.c(enumC27250e4, zaloCloudMigrationUploader3.f85487g);
                                c16842n.f85631s = null;
                                c16842n.f85632t = null;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 6;
                                if (producerScope5.mo112908S(cVar, c16842n) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            try {
                                C16844o c16844o = new C16844o(producerScope5, null);
                                c16842n.f85631s = zaloCloudMigrationUploader3;
                                c16842n.f85632t = producerScope5;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 7;
                                if (CoroutineScopeKt.m112640d(c16844o, c16842n) == m142578e) {
                                    return m142578e;
                                }
                                producerScope6 = producerScope5;
                                zaloCloudMigrationUploader6 = zaloCloudMigrationUploader3;
                                m112680b = Dispatchers.m112680b();
                                c16845p = new C16845p(null);
                                c16842n.f85631s = zaloCloudMigrationUploader6;
                                c16842n.f85632t = producerScope6;
                                c16842n.f85637y = 8;
                                if (BuildersKt.m112534g(m112680b, c16845p, c16842n) == m142578e) {
                                    return m142578e;
                                }
                                z11 = (zaloCloudMigrationUploader6.f85492l.get() + zaloCloudMigrationUploader6.f85495o.get()) + zaloCloudMigrationUploader6.f85498r.get() > 0;
                                zaloCloudMigrationUploader6.m89929g0();
                                if (!z11) {
                                    AbstractC16866f.h hVar = AbstractC16866f.h.f85848b;
                                    c16842n.f85631s = null;
                                    c16842n.f85632t = null;
                                    c16842n.f85637y = 15;
                                    if (producerScope6.mo112908S(hVar, c16842n) == m142578e) {
                                        return m142578e;
                                    }
                                    return C24848g0.f119245a;
                                }
                                EnumC27250e enumC27250e5 = zaloCloudMigrationUploader6.f85486f;
                                if (enumC27250e5 == null) {
                                    AbstractC19074t.m100223u("currentStep");
                                    enumC27250e3 = null;
                                } else {
                                    enumC27250e3 = enumC27250e5;
                                }
                                AbstractC16866f.e eVar2 = new AbstractC16866f.e(enumC27250e3, zaloCloudMigrationUploader6.f85488h.get(), zaloCloudMigrationUploader6.f85489i, zaloCloudMigrationUploader6.f85506z, zaloCloudMigrationUploader6.f85475A, false, false, zaloCloudMigrationUploader6.f85487g, 96, null);
                                c16842n.f85631s = null;
                                c16842n.f85632t = null;
                                c16842n.f85637y = 16;
                                if (producerScope6.mo112908S(eVar2, c16842n) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            } catch (Failure e11) {
                                e = e11;
                                producerScope6 = producerScope5;
                                zaloCloudMigrationUploader6 = zaloCloudMigrationUploader3;
                                c16842n.f85631s = null;
                                c16842n.f85632t = null;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 9;
                                if (zaloCloudMigrationUploader6.m89966z0(producerScope6, e, c16842n) == m142578e) {
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                CoroutineDispatcher m112680b2 = Dispatchers.m112680b();
                                C16845p c16845p2 = new C16845p(null);
                                c16842n.f85631s = c24848g0;
                                c16842n.f85637y = 10;
                                if (BuildersKt.m112534g(m112680b2, c16845p2, c16842n) == m142578e) {
                                }
                            } catch (CancellationException e12) {
                                e = e12;
                                zaloCloudMigrationUploader6 = zaloCloudMigrationUploader3;
                                C26676b.m136954d("SMLZCloudMigrationUploader", e);
                                zaloCloudMigrationUploader6.f85478D = true;
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                CoroutineDispatcher m112680b3 = Dispatchers.m112680b();
                                C16845p c16845p3 = new C16845p(null);
                                c16842n.f85631s = c24848g02;
                                c16842n.f85632t = null;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 11;
                                if (BuildersKt.m112534g(m112680b3, c16845p3, c16842n) != m142578e) {
                                }
                            } catch (Exception e13) {
                                e = e13;
                                producerScope6 = producerScope5;
                                zaloCloudMigrationUploader6 = zaloCloudMigrationUploader3;
                                m129183b = AbstractC24845f.m129183b(e);
                                m89942n0(zaloCloudMigrationUploader6, "SMLZCloudMigrationUploader", "UnknownError=" + m129183b, null, 4, null);
                                enumC27250e = zaloCloudMigrationUploader6.f85486f;
                                if (enumC27250e != null) {
                                }
                                eVar = new AbstractC16866f.e(enumC27250e2, zaloCloudMigrationUploader6.f85488h.get(), zaloCloudMigrationUploader6.f85489i, zaloCloudMigrationUploader6.f85506z, zaloCloudMigrationUploader6.f85475A, false, false, zaloCloudMigrationUploader6.f85487g, 96, null);
                                c16842n.f85631s = null;
                                c16842n.f85632t = null;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 12;
                                if (producerScope6.mo112908S(eVar, c16842n) == m142578e) {
                                }
                                C24848g0 c24848g03 = C24848g0.f119245a;
                                CoroutineDispatcher m112680b4 = Dispatchers.m112680b();
                                C16845p c16845p4 = new C16845p(null);
                                c16842n.f85631s = c24848g03;
                                c16842n.f85637y = 13;
                                if (BuildersKt.m112534g(m112680b4, c16845p4, c16842n) == m142578e) {
                                }
                            }
                            break;
                        case 1:
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader8 = (ZaloCloudMigrationUploader) c16842n.f85633u;
                            ProducerScope producerScope7 = (ProducerScope) c16842n.f85632t;
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader9 = (ZaloCloudMigrationUploader) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            zaloCloudMigrationUploader2 = zaloCloudMigrationUploader9;
                            obj = obj2;
                            producerScope2 = producerScope7;
                            zaloCloudMigrationUploader = zaloCloudMigrationUploader8;
                            zaloCloudMigrationUploader.f85506z = ((Number) obj).intValue();
                            zaloCloudMigrationUploader2.f85480F = zaloCloudMigrationUploader2.f85481a.mo131127i();
                            zaloCloudMigrationUploader2.f85476B = zaloCloudMigrationUploader2.f85481a.mo131133o();
                            zaloCloudMigrationUploader2.f85477C.clear();
                            zaloCloudMigrationUploader2.f85491k.set(0);
                            zaloCloudMigrationUploader2.f85492l.set(0);
                            zaloCloudMigrationUploader2.f85493m.set(0);
                            zaloCloudMigrationUploader2.f85494n.set(0);
                            zaloCloudMigrationUploader2.f85495o.set(0);
                            zaloCloudMigrationUploader2.f85496p.set(0);
                            zaloCloudMigrationUploader2.f85497q.set(0);
                            zaloCloudMigrationUploader2.f85498r.set(0);
                            zaloCloudMigrationUploader2.f85499s.set(0);
                            zaloCloudMigrationUploader2.f85500t.set(0);
                            zaloCloudMigrationUploader2.f85501u.set(0);
                            zaloCloudMigrationUploader2.f85502v.set(0);
                            zaloCloudMigrationUploader2.f85503w.set(0);
                            zaloCloudMigrationUploader2.f85504x.set(0);
                            zaloCloudMigrationUploader2.f85505y.set(0);
                            zaloCloudMigrationUploader2.f85486f = EnumC27250e.f128048q;
                            zaloCloudMigrationUploader2.f85478D = false;
                            AtomicInteger atomicInteger22 = zaloCloudMigrationUploader2.f85488h;
                            InterfaceC25320d interfaceC25320d22 = zaloCloudMigrationUploader2.f85481a;
                            m131505m = AbstractC25368s.m131505m(EnumC25824e.f123202r, EnumC25824e.f123204t);
                            c16842n.f85631s = zaloCloudMigrationUploader2;
                            c16842n.f85632t = producerScope2;
                            c16842n.f85633u = atomicInteger22;
                            c16842n.f85637y = 2;
                            m131138a = InterfaceC25320d.a.m131138a(interfaceC25320d22, null, m131505m, c16842n, 1, null);
                            if (m131138a != m142578e) {
                            }
                            break;
                        case 2:
                            atomicInteger = (AtomicInteger) c16842n.f85633u;
                            ProducerScope producerScope8 = (ProducerScope) c16842n.f85632t;
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader10 = (ZaloCloudMigrationUploader) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            producerScope3 = producerScope8;
                            zaloCloudMigrationUploader3 = zaloCloudMigrationUploader10;
                            atomicInteger.set(((Number) obj2).intValue());
                            InterfaceC25320d interfaceC25320d32 = zaloCloudMigrationUploader3.f85481a;
                            m131496e = AbstractC25366r.m131496e(EnumC25825f.f123211t);
                            c16842n.f85631s = zaloCloudMigrationUploader3;
                            c16842n.f85632t = producerScope3;
                            c16842n.f85633u = null;
                            c16842n.f85637y = 3;
                            obj2 = InterfaceC25320d.a.m131138a(interfaceC25320d32, m131496e, null, c16842n, 2, null);
                            if (obj2 == m142578e) {
                            }
                            int intValue2 = ((Number) obj2).intValue();
                            zaloCloudMigrationUploader3.f85479E = intValue2 > 0;
                            InterfaceC25320d interfaceC25320d42 = zaloCloudMigrationUploader3.f85481a;
                            c16842n.f85631s = zaloCloudMigrationUploader3;
                            c16842n.f85632t = producerScope3;
                            c16842n.f85633u = zaloCloudMigrationUploader3;
                            c16842n.f85634v = intValue2;
                            c16842n.f85637y = 4;
                            m131138a2 = InterfaceC25320d.a.m131138a(interfaceC25320d42, null, null, c16842n, 3, null);
                            if (m131138a2 == m142578e) {
                            }
                            break;
                        case 3:
                            ProducerScope producerScope9 = (ProducerScope) c16842n.f85632t;
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader11 = (ZaloCloudMigrationUploader) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            producerScope3 = producerScope9;
                            zaloCloudMigrationUploader3 = zaloCloudMigrationUploader11;
                            int intValue22 = ((Number) obj2).intValue();
                            zaloCloudMigrationUploader3.f85479E = intValue22 > 0;
                            InterfaceC25320d interfaceC25320d422 = zaloCloudMigrationUploader3.f85481a;
                            c16842n.f85631s = zaloCloudMigrationUploader3;
                            c16842n.f85632t = producerScope3;
                            c16842n.f85633u = zaloCloudMigrationUploader3;
                            c16842n.f85634v = intValue22;
                            c16842n.f85637y = 4;
                            m131138a2 = InterfaceC25320d.a.m131138a(interfaceC25320d422, null, null, c16842n, 3, null);
                            if (m131138a2 == m142578e) {
                            }
                            break;
                        case 4:
                            i11 = c16842n.f85634v;
                            zaloCloudMigrationUploader4 = (ZaloCloudMigrationUploader) c16842n.f85633u;
                            producerScope4 = (ProducerScope) c16842n.f85632t;
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader12 = (ZaloCloudMigrationUploader) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            zaloCloudMigrationUploader3 = zaloCloudMigrationUploader12;
                            zaloCloudMigrationUploader4.f85489i = ((Number) obj2).intValue() - i11;
                            zaloCloudMigrationUploader3.f85487g = zaloCloudMigrationUploader3.m89905N(zaloCloudMigrationUploader3.f85488h.get(), zaloCloudMigrationUploader3.f85489i);
                            InterfaceC25320d interfaceC25320d52 = zaloCloudMigrationUploader3.f85481a;
                            c16842n.f85631s = zaloCloudMigrationUploader3;
                            c16842n.f85632t = producerScope4;
                            c16842n.f85633u = zaloCloudMigrationUploader3;
                            c16842n.f85637y = 5;
                            obj2 = interfaceC25320d52.mo131128j(4000, c16842n);
                            if (obj2 != m142578e) {
                            }
                            break;
                        case 5:
                            zaloCloudMigrationUploader5 = (ZaloCloudMigrationUploader) c16842n.f85633u;
                            producerScope5 = (ProducerScope) c16842n.f85632t;
                            ZaloCloudMigrationUploader zaloCloudMigrationUploader13 = (ZaloCloudMigrationUploader) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            zaloCloudMigrationUploader3 = zaloCloudMigrationUploader13;
                            zaloCloudMigrationUploader5.f85475A = ((Number) obj2).intValue();
                            zaloCloudMigrationUploader3.m89931h0();
                            if (C23055e5.m118273h(false, 1, null)) {
                            }
                            break;
                        case 6:
                            AbstractC24862s.m129228b(obj2);
                            return C24848g0.f119245a;
                        case 7:
                            producerScope6 = (ProducerScope) c16842n.f85632t;
                            zaloCloudMigrationUploader6 = (ZaloCloudMigrationUploader) c16842n.f85631s;
                            try {
                                AbstractC24862s.m129228b(obj2);
                                m112680b = Dispatchers.m112680b();
                                c16845p = new C16845p(null);
                                c16842n.f85631s = zaloCloudMigrationUploader6;
                                c16842n.f85632t = producerScope6;
                                c16842n.f85637y = 8;
                                if (BuildersKt.m112534g(m112680b, c16845p, c16842n) == m142578e) {
                                }
                                if ((zaloCloudMigrationUploader6.f85492l.get() + zaloCloudMigrationUploader6.f85495o.get()) + zaloCloudMigrationUploader6.f85498r.get() > 0) {
                                }
                                zaloCloudMigrationUploader6.m89929g0();
                                if (!z11) {
                                }
                            } catch (Failure e14) {
                                e = e14;
                                c16842n.f85631s = null;
                                c16842n.f85632t = null;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 9;
                                if (zaloCloudMigrationUploader6.m89966z0(producerScope6, e, c16842n) == m142578e) {
                                    return m142578e;
                                }
                                C24848g0 c24848g04 = C24848g0.f119245a;
                                CoroutineDispatcher m112680b22 = Dispatchers.m112680b();
                                C16845p c16845p22 = new C16845p(null);
                                c16842n.f85631s = c24848g04;
                                c16842n.f85637y = 10;
                                if (BuildersKt.m112534g(m112680b22, c16845p22, c16842n) == m142578e) {
                                }
                            } catch (CancellationException e15) {
                                e = e15;
                                C26676b.m136954d("SMLZCloudMigrationUploader", e);
                                zaloCloudMigrationUploader6.f85478D = true;
                                C24848g0 c24848g022 = C24848g0.f119245a;
                                CoroutineDispatcher m112680b32 = Dispatchers.m112680b();
                                C16845p c16845p32 = new C16845p(null);
                                c16842n.f85631s = c24848g022;
                                c16842n.f85632t = null;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 11;
                                return BuildersKt.m112534g(m112680b32, c16845p32, c16842n) != m142578e ? m142578e : c24848g022;
                            } catch (Exception e16) {
                                e = e16;
                                m129183b = AbstractC24845f.m129183b(e);
                                m89942n0(zaloCloudMigrationUploader6, "SMLZCloudMigrationUploader", "UnknownError=" + m129183b, null, 4, null);
                                enumC27250e = zaloCloudMigrationUploader6.f85486f;
                                if (enumC27250e != null) {
                                    AbstractC19074t.m100223u("currentStep");
                                    enumC27250e2 = null;
                                } else {
                                    enumC27250e2 = enumC27250e;
                                }
                                eVar = new AbstractC16866f.e(enumC27250e2, zaloCloudMigrationUploader6.f85488h.get(), zaloCloudMigrationUploader6.f85489i, zaloCloudMigrationUploader6.f85506z, zaloCloudMigrationUploader6.f85475A, false, false, zaloCloudMigrationUploader6.f85487g, 96, null);
                                c16842n.f85631s = null;
                                c16842n.f85632t = null;
                                c16842n.f85633u = null;
                                c16842n.f85637y = 12;
                                if (producerScope6.mo112908S(eVar, c16842n) == m142578e) {
                                    return m142578e;
                                }
                                C24848g0 c24848g032 = C24848g0.f119245a;
                                CoroutineDispatcher m112680b42 = Dispatchers.m112680b();
                                C16845p c16845p42 = new C16845p(null);
                                c16842n.f85631s = c24848g032;
                                c16842n.f85637y = 13;
                                if (BuildersKt.m112534g(m112680b42, c16845p42, c16842n) == m142578e) {
                                }
                            }
                            break;
                        case 8:
                            producerScope6 = (ProducerScope) c16842n.f85632t;
                            zaloCloudMigrationUploader6 = (ZaloCloudMigrationUploader) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            if ((zaloCloudMigrationUploader6.f85492l.get() + zaloCloudMigrationUploader6.f85495o.get()) + zaloCloudMigrationUploader6.f85498r.get() > 0) {
                            }
                            zaloCloudMigrationUploader6.m89929g0();
                            if (!z11) {
                            }
                            break;
                        case 9:
                            AbstractC24862s.m129228b(obj2);
                            C24848g0 c24848g042 = C24848g0.f119245a;
                            CoroutineDispatcher m112680b222 = Dispatchers.m112680b();
                            C16845p c16845p222 = new C16845p(null);
                            c16842n.f85631s = c24848g042;
                            c16842n.f85637y = 10;
                            return BuildersKt.m112534g(m112680b222, c16845p222, c16842n) == m142578e ? m142578e : c24848g042;
                        case 10:
                            C24848g0 c24848g05 = (C24848g0) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            return c24848g05;
                        case 11:
                            C24848g0 c24848g06 = (C24848g0) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            return c24848g06;
                        case 12:
                            AbstractC24862s.m129228b(obj2);
                            C24848g0 c24848g0322 = C24848g0.f119245a;
                            CoroutineDispatcher m112680b422 = Dispatchers.m112680b();
                            C16845p c16845p422 = new C16845p(null);
                            c16842n.f85631s = c24848g0322;
                            c16842n.f85637y = 13;
                            return BuildersKt.m112534g(m112680b422, c16845p422, c16842n) == m142578e ? m142578e : c24848g0322;
                        case 13:
                            C24848g0 c24848g07 = (C24848g0) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            return c24848g07;
                        case 14:
                            Throwable th2 = (Throwable) c16842n.f85631s;
                            AbstractC24862s.m129228b(obj2);
                            throw th2;
                        case 15:
                            AbstractC24862s.m129228b(obj2);
                            return C24848g0.f119245a;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            AbstractC24862s.m129228b(obj2);
                            return C24848g0.f119245a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (c16842n.f85637y) {
            }
        } catch (Throwable th3) {
            CoroutineDispatcher m112680b5 = Dispatchers.m112680b();
            C16845p c16845p5 = new C16845p(null);
            c16842n.f85631s = th3;
            c16842n.f85632t = null;
            c16842n.f85633u = null;
            c16842n.f85637y = 14;
            if (BuildersKt.m112534g(m112680b5, c16845p5, c16842n) == m142578e) {
                return m142578e;
            }
            throw th3;
        }
        c16842n = new C16842n(continuation);
        Object obj22 = c16842n.f85635w;
        m142578e = AbstractC28298d.m142578e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public final Object m89915Y(C25823d c25823d, Continuation continuation) {
        return BuildersKt.m112534g(this.f85485e, new C16846q(c25823d, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89916Z(CoroutineScope coroutineScope, ProducerScope producerScope, List list, int i11, Continuation continuation) {
        C16847r c16847r;
        Object m142578e;
        int i12;
        AtomicInteger atomicInteger;
        if (continuation instanceof C16847r) {
            c16847r = (C16847r) continuation;
            int i13 = c16847r.f85661v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16847r.f85661v = i13 - Integer.MIN_VALUE;
                C16847r c16847r2 = c16847r;
                Object obj = c16847r2.f85659t;
                m142578e = AbstractC28298d.m142578e();
                i12 = c16847r2.f85661v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        atomicInteger = (AtomicInteger) c16847r2.f85658s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (list.isEmpty()) {
                        return AbstractC29094b.m145341c(0);
                    }
                    m89892A0(producerScope, EnumC27250e.f128047p, this.f85494n.get(), i11);
                    AtomicInteger atomicInteger2 = new AtomicInteger(0);
                    if (C23055e5.m118269d()) {
                        InterfaceC18509p c16848s = new C16848s(atomicInteger2, producerScope, i11, null);
                        c16847r2.f85658s = atomicInteger2;
                        c16847r2.f85661v = 1;
                        if (m89958v0(list, coroutineScope, c16848s, c16847r2) == m142578e) {
                            return m142578e;
                        }
                        atomicInteger = atomicInteger2;
                    } else {
                        throw new Failure.NetworkWifi("Network is not wifi type");
                    }
                }
                return AbstractC29094b.m145341c(atomicInteger.get());
            }
        }
        c16847r = new C16847r(continuation);
        C16847r c16847r22 = c16847r;
        Object obj2 = c16847r22.f85659t;
        m142578e = AbstractC28298d.m142578e();
        i12 = c16847r22.f85661v;
        if (i12 == 0) {
        }
        return AbstractC29094b.m145341c(atomicInteger.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89918a0(CoroutineScope coroutineScope, ProducerScope producerScope, Continuation continuation) {
        C16849t c16849t;
        Object m142578e;
        int i11;
        List m131505m;
        List m131496e;
        CoroutineScope coroutineScope2;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        ProducerScope producerScope2;
        int intValue;
        if (continuation instanceof C16849t) {
            c16849t = (C16849t) continuation;
            int i12 = c16849t.f85673x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16849t.f85673x = i12 - Integer.MIN_VALUE;
                Object obj = c16849t.f85671v;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16849t.f85673x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ProducerScope producerScope3 = (ProducerScope) c16849t.f85670u;
                    CoroutineScope coroutineScope3 = (CoroutineScope) c16849t.f85669t;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader2 = (ZaloCloudMigrationUploader) c16849t.f85668s;
                    AbstractC24862s.m129228b(obj);
                    producerScope2 = producerScope3;
                    coroutineScope2 = coroutineScope3;
                    zaloCloudMigrationUploader = zaloCloudMigrationUploader2;
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = this.f85481a;
                    m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e = AbstractC25366r.m131496e(EnumC25825f.f123209r);
                    c16849t.f85668s = this;
                    coroutineScope2 = coroutineScope;
                    c16849t.f85669t = coroutineScope2;
                    c16849t.f85670u = producerScope;
                    c16849t.f85673x = 1;
                    obj = interfaceC25320d.mo131121c(m131496e, m131505m, c16849t);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationUploader = this;
                    producerScope2 = producerScope;
                }
                intValue = ((Number) obj).intValue();
                if (intValue != 0) {
                    return C24848g0.f119245a;
                }
                m89942n0(zaloCloudMigrationUploader, "SMLZCloudMigrationUploader", "Start migrate local items, size=" + intValue, null, 4, null);
                C16850u c16850u = new C16850u(zaloCloudMigrationUploader.f85481a);
                C16851v c16851v = new C16851v(coroutineScope2, producerScope2, intValue, null);
                c16849t.f85668s = null;
                c16849t.f85669t = null;
                c16849t.f85670u = null;
                c16849t.f85673x = 2;
                if (zaloCloudMigrationUploader.m89960w0(c16850u, c16851v, c16849t) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        c16849t = new C16849t(continuation);
        Object obj2 = c16849t.f85671v;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16849t.f85673x;
        if (i11 == 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public final Object m89920b0(C25823d c25823d, Continuation continuation) {
        return BuildersKt.m112534g(this.f85485e, new C16852w(c25823d, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89922c0(CoroutineScope coroutineScope, ProducerScope producerScope, List list, int i11, Continuation continuation) {
        C16853x c16853x;
        Object m142578e;
        int i12;
        AtomicInteger atomicInteger;
        if (continuation instanceof C16853x) {
            c16853x = (C16853x) continuation;
            int i13 = c16853x.f85694v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c16853x.f85694v = i13 - Integer.MIN_VALUE;
                C16853x c16853x2 = c16853x;
                Object obj = c16853x2.f85692t;
                m142578e = AbstractC28298d.m142578e();
                i12 = c16853x2.f85694v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        atomicInteger = (AtomicInteger) c16853x2.f85691s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (list.isEmpty()) {
                        return AbstractC29094b.m145341c(0);
                    }
                    m89892A0(producerScope, EnumC27250e.f128048q, this.f85491k.get(), i11);
                    AtomicInteger atomicInteger2 = new AtomicInteger(0);
                    InterfaceC18509p c16854y = new C16854y(atomicInteger2, producerScope, i11, null);
                    c16853x2.f85691s = atomicInteger2;
                    c16853x2.f85694v = 1;
                    if (m89958v0(list, coroutineScope, c16854y, c16853x2) == m142578e) {
                        return m142578e;
                    }
                    atomicInteger = atomicInteger2;
                }
                return AbstractC29094b.m145341c(atomicInteger.get());
            }
        }
        c16853x = new C16853x(continuation);
        C16853x c16853x22 = c16853x;
        Object obj2 = c16853x22.f85692t;
        m142578e = AbstractC28298d.m142578e();
        i12 = c16853x22.f85694v;
        if (i12 == 0) {
        }
        return AbstractC29094b.m145341c(atomicInteger.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89924d0(CoroutineScope coroutineScope, ProducerScope producerScope, Continuation continuation) {
        C16855z c16855z;
        Object m142578e;
        int i11;
        List m131505m;
        List m131496e;
        CoroutineScope coroutineScope2;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        ProducerScope producerScope2;
        int intValue;
        if (continuation instanceof C16855z) {
            c16855z = (C16855z) continuation;
            int i12 = c16855z.f85706x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16855z.f85706x = i12 - Integer.MIN_VALUE;
                Object obj = c16855z.f85704v;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16855z.f85706x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ProducerScope producerScope3 = (ProducerScope) c16855z.f85703u;
                    CoroutineScope coroutineScope3 = (CoroutineScope) c16855z.f85702t;
                    ZaloCloudMigrationUploader zaloCloudMigrationUploader2 = (ZaloCloudMigrationUploader) c16855z.f85701s;
                    AbstractC24862s.m129228b(obj);
                    producerScope2 = producerScope3;
                    coroutineScope2 = coroutineScope3;
                    zaloCloudMigrationUploader = zaloCloudMigrationUploader2;
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = this.f85481a;
                    m131505m = AbstractC25368s.m131505m(EnumC25824e.f123201q, EnumC25824e.f123203s);
                    m131496e = AbstractC25366r.m131496e(EnumC25825f.f123208q);
                    c16855z.f85701s = this;
                    coroutineScope2 = coroutineScope;
                    c16855z.f85702t = coroutineScope2;
                    c16855z.f85703u = producerScope;
                    c16855z.f85706x = 1;
                    obj = interfaceC25320d.mo131121c(m131496e, m131505m, c16855z);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationUploader = this;
                    producerScope2 = producerScope;
                }
                intValue = ((Number) obj).intValue();
                if (intValue != 0) {
                    return C24848g0.f119245a;
                }
                m89942n0(zaloCloudMigrationUploader, "SMLZCloudMigrationUploader", "Start migrate server items, size=" + intValue, null, 4, null);
                C16817a0 c16817a0 = new C16817a0(zaloCloudMigrationUploader.f85481a);
                C16819b0 c16819b0 = new C16819b0(coroutineScope2, producerScope2, intValue, null);
                c16855z.f85701s = null;
                c16855z.f85702t = null;
                c16855z.f85703u = null;
                c16855z.f85706x = 2;
                if (zaloCloudMigrationUploader.m89960w0(c16817a0, c16819b0, c16855z) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        c16855z = new C16855z(continuation);
        Object obj2 = c16855z.f85704v;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16855z.f85706x;
        if (i11 == 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public final Object m89926e0(C25823d c25823d, Continuation continuation) {
        return BuildersKt.m112534g(this.f85485e, new C16821c0(c25823d, null), continuation);
    }

    /* renamed from: g0 */
    private final void m89929g0() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 23);
        int i11 = this.f85488h.get();
        int i12 = this.f85489i;
        int i13 = this.f85505y.get() + this.f85493m.get() + this.f85496p.get() + this.f85499s.get();
        int i14 = this.f85504x.get();
        int i15 = this.f85503w.get();
        int i16 = this.f85505y.get();
        int i17 = this.f85492l.get();
        int i18 = this.f85491k.get();
        int i19 = this.f85493m.get();
        int i21 = this.f85495o.get();
        int i22 = this.f85494n.get();
        int i23 = this.f85496p.get();
        int i24 = this.f85498r.get();
        int i25 = this.f85497q.get();
        int i26 = this.f85499s.get();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        C26676b.m136956f(m127130z + "\nSuccessful upload: " + i11 + "/" + i12 + "\nTotal skipped: " + i13 + "\nMyCloud Item error count: " + i14 + "/" + i15 + ". Skipped: " + i16 + "\nServer Item error count: " + i17 + "/" + i18 + ". Skipped: " + i19 + "\nLocal Item error count: " + i21 + "/" + i22 + ". Skipped: " + i23 + "\nBackup Item error count: " + i24 + "/" + i25 + ". Skipped: " + i26 + "\n" + m127130z2, C26676b.b.f126331p);
    }

    /* renamed from: h0 */
    private final void m89931h0() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 23);
        AtomicInteger atomicInteger = this.f85488h;
        int i11 = this.f85489i;
        int i12 = this.f85506z;
        int i13 = this.f85475A;
        boolean z11 = this.f85476B;
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        C26676b.m136956f(m127130z + "\nBegin Upload\nProcessed: " + atomicInteger + "/" + i11 + ". Retries=" + i12 + ". RuntimeErrors=" + i13 + ". PagingEnabled=" + z11 + "\n" + m127130z2, C26676b.b.f126334s);
    }

    /* renamed from: i0 */
    private final int m89933i0() {
        return AbstractC23306f.m120633X1().m89801i().m89769e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final long m89935j0(C25823d c25823d) {
        return AbstractC27247b.m139390b(c25823d, this.f85506z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89937k0(long j11, C25823d c25823d, Integer num, String str, Continuation continuation) {
        C16825e0 c16825e0;
        Object m142578e;
        int i11;
        String str2;
        Boolean m145339a;
        if (continuation instanceof C16825e0) {
            c16825e0 = (C16825e0) continuation;
            int i12 = c16825e0.f85549v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16825e0.f85549v = i12 - Integer.MIN_VALUE;
                C16825e0 c16825e02 = c16825e0;
                Object obj = c16825e02.f85547t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16825e02.f85549v;
                boolean z11 = false;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Boolean bool = (Boolean) c16825e02.f85546s;
                        AbstractC24862s.m129228b(obj);
                        return bool;
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    int i13 = C16818b.f85508a[c25823d.m133191q().ordinal()];
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 4) {
                                    str2 = "PotentiallyBackup";
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                str2 = "Backup";
                            }
                        } else {
                            str2 = "Local";
                        }
                    } else {
                        str2 = "Server";
                    }
                    String str3 = str2;
                    if (c25823d.m133191q() == EnumC25825f.f123208q && num != null && num.intValue() == 1001) {
                        m89942n0(this, "SMLZCloudMigrationUploader", "[Server] item not found on server, try to upload as local. Item=" + c25823d, null, 4, null);
                        c16825e02.f85549v = 1;
                        if (m89944o0(c25823d, c16825e02) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        if (num != null && num.intValue() == -904) {
                            m89942n0(this, "SMLZCloudMigrationUploader", "[" + str3 + "] already existed on SERVER. Skipped. Item=" + c25823d, null, 4, null);
                        } else if (num == null || num.intValue() != -911) {
                            if (num == null || num.intValue() != -906) {
                                if (num != null && num.intValue() == 1000001) {
                                    m89942n0(this, "SMLZCloudMigrationUploader", "[" + str3 + "] local file not found. Skipped. Item=" + c25823d, null, 4, null);
                                } else if (num != null && num.intValue() == 1000006) {
                                    m89942n0(this, "SMLZCloudMigrationUploader", "[" + str3 + "] local file checksum error. Skipped. Item=" + c25823d, null, 4, null);
                                } else if (num != null && num.intValue() == 1000007) {
                                    m89942n0(this, "SMLZCloudMigrationUploader", "[" + str3 + "] media ext info error. Skipped. Item=" + c25823d, null, 4, null);
                                } else if (num != null && num.intValue() == 1000008) {
                                    m89942n0(this, "SMLZCloudMigrationUploader", "[" + str3 + "] media ext info encryption error. Skipped. Item=" + c25823d, null, 4, null);
                                } else {
                                    if (num == null || num.intValue() != 1000009) {
                                        m89942n0(this, "SMLZCloudMigrationUploader", "[" + str3 + "] upload error: errCode=" + num + ", errMsg=" + str + ", item=" + c25823d, null, 4, null);
                                        m145339a = AbstractC29094b.m145339a(z11);
                                        if (!m145339a.booleanValue()) {
                                            c16825e02.f85546s = m145339a;
                                            c16825e02.f85549v = 2;
                                            if (m89948q0(c25823d, j11, c16825e02) == m142578e) {
                                                return m142578e;
                                            }
                                        } else {
                                            c16825e02.f85546s = m145339a;
                                            c16825e02.f85549v = 3;
                                            if (m89946p0(c25823d, j11, num, str, c16825e02) == m142578e) {
                                                return m142578e;
                                            }
                                        }
                                        return m145339a;
                                    }
                                    throw new Failure.StorageNotAvailable("[" + str3 + "] media upload failed due to storage not available. Item=" + c25823d);
                                }
                            } else {
                                m89942n0(this, "SMLZCloudMigrationUploader", "[" + str3 + "] upload failed because user subscription expired. Item=" + c25823d, null, 4, null);
                                throw new Failure.SubscriptionExpired("[" + str3 + "] upload failed because user subscription expired. Item=" + c25823d);
                            }
                        } else {
                            String str4 = "[" + str3 + "] media upload failed due to server quota exceeded. Item=" + c25823d;
                            m89942n0(this, "SMLZCloudMigrationUploader", str4, null, 4, null);
                            throw new Failure.ServerQuotaExceeded(str4);
                        }
                        z11 = true;
                        m145339a = AbstractC29094b.m145339a(z11);
                        if (!m145339a.booleanValue()) {
                        }
                        return m145339a;
                    }
                }
                return AbstractC29094b.m145339a(false);
            }
        }
        c16825e0 = new C16825e0(continuation);
        C16825e0 c16825e022 = c16825e0;
        Object obj2 = c16825e022.f85547t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16825e022.f85549v;
        boolean z112 = false;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145339a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public final boolean m89939l0(C25823d c25823d) {
        if (this.f85482b.mo124314i() - c25823d.m133190p() > m89933i0() * 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m89942n0(ZaloCloudMigrationUploader zaloCloudMigrationUploader, String str, String str2, C26676b.b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bVar = C26676b.b.f126334s;
        }
        zaloCloudMigrationUploader.m89969m0(str, str2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public final Object m89944o0(C25823d c25823d, Continuation continuation) {
        Object m142578e;
        Object mo131126h = this.f85481a.mo131126h(c25823d.m133186l(), EnumC25825f.f123209r, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo131126h == m142578e) {
            return mo131126h;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89946p0(C25823d c25823d, long j11, Integer num, String str, Continuation continuation) {
        C16827f0 c16827f0;
        Object m142578e;
        int i11;
        C25823d c25823d2;
        Integer num2;
        String str2;
        long j12;
        int i12;
        int i13;
        if (continuation instanceof C16827f0) {
            c16827f0 = (C16827f0) continuation;
            int i14 = c16827f0.f85556y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c16827f0.f85556y = i14 - Integer.MIN_VALUE;
                Object obj = c16827f0.f85554w;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16827f0.f85556y;
                if (i11 == 0) {
                    if (i11 == 1) {
                        long j13 = c16827f0.f85553v;
                        String str3 = (String) c16827f0.f85552u;
                        num2 = (Integer) c16827f0.f85551t;
                        c25823d2 = (C25823d) c16827f0.f85550s;
                        AbstractC24862s.m129228b(obj);
                        j12 = j13;
                        str2 = str3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = this.f85481a;
                    String m133186l = c25823d.m133186l();
                    EnumC25824e enumC25824e = EnumC25824e.f123203s;
                    c16827f0.f85550s = c25823d;
                    c16827f0.f85551t = num;
                    c16827f0.f85552u = str;
                    c16827f0.f85553v = j11;
                    c16827f0.f85556y = 1;
                    if (interfaceC25320d.mo131135q(m133186l, enumC25824e, c16827f0) == m142578e) {
                        return m142578e;
                    }
                    c25823d2 = c25823d;
                    num2 = num;
                    str2 = str;
                    j12 = j11;
                }
                if (c25823d2.m133191q() != EnumC25825f.f123208q) {
                    C26675a c26675a = C26675a.f126213a;
                    if (num2 != null) {
                        i13 = num2.intValue();
                    } else {
                        i13 = -1;
                    }
                    C26675a.m136890L(c26675a, 1504400, i13, str2, null, j12, 0L, 40, null);
                } else {
                    C26675a c26675a2 = C26675a.f126213a;
                    if (num2 != null) {
                        i12 = num2.intValue();
                    } else {
                        i12 = -1;
                    }
                    C26675a.m136890L(c26675a2, 1504410, i12, str2, null, j12, 0L, 40, null);
                }
                return C24848g0.f119245a;
            }
        }
        c16827f0 = new C16827f0(continuation);
        Object obj2 = c16827f0.f85554w;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16827f0.f85556y;
        if (i11 == 0) {
        }
        if (c25823d2.m133191q() != EnumC25825f.f123208q) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89948q0(C25823d c25823d, long j11, Continuation continuation) {
        C16829g0 c16829g0;
        Object m142578e;
        int i11;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        if (continuation instanceof C16829g0) {
            c16829g0 = (C16829g0) continuation;
            int i12 = c16829g0.f85568w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16829g0.f85568w = i12 - Integer.MIN_VALUE;
                Object obj = c16829g0.f85566u;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16829g0.f85568w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25823d = (C25823d) c16829g0.f85565t;
                        zaloCloudMigrationUploader = (ZaloCloudMigrationUploader) c16829g0.f85564s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = this.f85481a;
                    String m133186l = c25823d.m133186l();
                    EnumC25824e enumC25824e = EnumC25824e.f123204t;
                    c16829g0.f85564s = this;
                    c16829g0.f85565t = c25823d;
                    c16829g0.f85568w = 1;
                    if (interfaceC25320d.mo131135q(m133186l, enumC25824e, c16829g0) == m142578e) {
                        return m142578e;
                    }
                    zaloCloudMigrationUploader = this;
                }
                zaloCloudMigrationUploader.m89907P(c25823d);
                return C24848g0.f119245a;
            }
        }
        c16829g0 = new C16829g0(continuation);
        Object obj2 = c16829g0.f85566u;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16829g0.f85568w;
        if (i11 == 0) {
        }
        zaloCloudMigrationUploader.m89907P(c25823d);
        return C24848g0.f119245a;
    }

    /* renamed from: r0 */
    static /* synthetic */ Object m89950r0(ZaloCloudMigrationUploader zaloCloudMigrationUploader, C25823d c25823d, long j11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return zaloCloudMigrationUploader.m89948q0(c25823d, j11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89952s0(C25823d c25823d, long j11, Continuation continuation) {
        C16831h0 c16831h0;
        Object m142578e;
        int i11;
        long j12;
        if (continuation instanceof C16831h0) {
            c16831h0 = (C16831h0) continuation;
            int i12 = c16831h0.f85576w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16831h0.f85576w = i12 - Integer.MIN_VALUE;
                Object obj = c16831h0.f85574u;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16831h0.f85576w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        j11 = c16831h0.f85573t;
                        c25823d = (C25823d) c16831h0.f85572s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC25320d interfaceC25320d = this.f85481a;
                    String m133186l = c25823d.m133186l();
                    EnumC25824e enumC25824e = EnumC25824e.f123202r;
                    c16831h0.f85572s = c25823d;
                    c16831h0.f85573t = j11;
                    c16831h0.f85576w = 1;
                    if (interfaceC25320d.mo131135q(m133186l, enumC25824e, c16831h0) == m142578e) {
                        return m142578e;
                    }
                }
                j12 = j11;
                if (j12 > 0) {
                    if (c25823d.m133191q() == EnumC25825f.f123208q) {
                        C26675a.m136891O(C26675a.f126213a, 1504400, null, j12, 0L, 10, null);
                    } else {
                        C26675a.m136891O(C26675a.f126213a, 1504410, null, j12, 0L, 10, null);
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c16831h0 = new C16831h0(continuation);
        Object obj2 = c16831h0.f85574u;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16831h0.f85576w;
        if (i11 == 0) {
        }
        j12 = j11;
        if (j12 > 0) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: t0 */
    static /* synthetic */ Object m89954t0(ZaloCloudMigrationUploader zaloCloudMigrationUploader, C25823d c25823d, long j11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return zaloCloudMigrationUploader.m89952s0(c25823d, j11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89956u0(C25823d c25823d, Continuation continuation) {
        C16833i0 c16833i0;
        Object m142578e;
        int i11;
        ZaloCloudMigrationUploader zaloCloudMigrationUploader;
        if (continuation instanceof C16833i0) {
            c16833i0 = (C16833i0) continuation;
            int i12 = c16833i0.f85589w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16833i0.f85589w = i12 - Integer.MIN_VALUE;
                C16833i0 c16833i02 = c16833i0;
                Object obj = c16833i02.f85587u;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16833i02.f85589w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c25823d = (C25823d) c16833i02.f85586t;
                        zaloCloudMigrationUploader = (ZaloCloudMigrationUploader) c16833i02.f85585s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (AbstractC29087c.m145333a(c25823d.m133185k())) {
                        c16833i02.f85585s = this;
                        c16833i02.f85586t = c25823d;
                        c16833i02.f85589w = 1;
                        if (m89954t0(this, c25823d, 0L, c16833i02, 1, null) == m142578e) {
                            return m142578e;
                        }
                        zaloCloudMigrationUploader = this;
                    } else {
                        return AbstractC29094b.m145339a(false);
                    }
                }
                m89942n0(zaloCloudMigrationUploader, "SMLZCloudMigrationUploader", "Migration item has already clouded, mark as success, item=" + c25823d, null, 4, null);
                return AbstractC29094b.m145339a(true);
            }
        }
        c16833i0 = new C16833i0(continuation);
        C16833i0 c16833i022 = c16833i0;
        Object obj2 = c16833i022.f85587u;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16833i022.f85589w;
        if (i11 == 0) {
        }
        m89942n0(zaloCloudMigrationUploader, "SMLZCloudMigrationUploader", "Migration item has already clouded, mark as success, item=" + c25823d, null, 4, null);
        return AbstractC29094b.m145339a(true);
    }

    /* renamed from: v0 */
    private final Object m89958v0(List list, CoroutineScope coroutineScope, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        Object m17459a = AbstractC3486a.m17459a(list, coroutineScope, 3, new C16835j0(interfaceC18509p, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m17459a == m142578e) {
            return m17459a;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f4 -> B:12:0x003f). Please report as a decompilation issue!!! */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89960w0(InterfaceC18510q interfaceC18510q, InterfaceC18511r interfaceC18511r, Continuation continuation) {
        C16837k0 c16837k0;
        Object m142578e;
        int i11;
        InterfaceC18510q interfaceC18510q2;
        Object obj;
        int i12;
        int i13;
        int i14;
        List list;
        int i15;
        int i16;
        InterfaceC18511r interfaceC18511r2;
        int i17;
        int intValue;
        int i18;
        int i19;
        if (continuation instanceof C16837k0) {
            c16837k0 = (C16837k0) continuation;
            int i21 = c16837k0.f85609A;
            if ((i21 & Integer.MIN_VALUE) != 0) {
                c16837k0.f85609A = i21 - Integer.MIN_VALUE;
                Object obj2 = c16837k0.f85616y;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16837k0.f85609A;
                int i22 = 0;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                intValue = c16837k0.f85615x;
                                i19 = c16837k0.f85614w;
                                i18 = c16837k0.f85613v;
                                i17 = c16837k0.f85612u;
                                interfaceC18511r2 = (InterfaceC18511r) c16837k0.f85611t;
                                interfaceC18510q2 = (InterfaceC18510q) c16837k0.f85610s;
                                AbstractC24862s.m129228b(obj2);
                                int i23 = i17;
                                i22 = intValue;
                                i12 = i19;
                                interfaceC18511r = interfaceC18511r2;
                                i14 = i23;
                                int i24 = i18;
                                list = (List) obj2;
                                i13 = i24;
                                if (!list.isEmpty()) {
                                    Integer m145341c = AbstractC29094b.m145341c(i13);
                                    Integer m145341c2 = AbstractC29094b.m145341c(i12);
                                    c16837k0.f85610s = interfaceC18510q2;
                                    c16837k0.f85611t = interfaceC18511r;
                                    c16837k0.f85612u = i14;
                                    c16837k0.f85613v = i13;
                                    c16837k0.f85614w = i22;
                                    c16837k0.f85609A = 2;
                                    Object mo49340Uc = interfaceC18511r.mo49340Uc(m145341c, m145341c2, list, c16837k0);
                                    if (mo49340Uc == m142578e) {
                                        return m142578e;
                                    }
                                    int i25 = i13;
                                    obj2 = mo49340Uc;
                                    i16 = i22;
                                    i17 = i14;
                                    interfaceC18511r2 = interfaceC18511r;
                                    i15 = i25;
                                    intValue = i16 + ((Number) obj2).intValue();
                                    i18 = i15 + 1;
                                    i19 = (i18 * i17) - intValue;
                                    Integer m145341c3 = AbstractC29094b.m145341c(i19);
                                    Integer m145341c4 = AbstractC29094b.m145341c(i17);
                                    c16837k0.f85610s = interfaceC18510q2;
                                    c16837k0.f85611t = interfaceC18511r2;
                                    c16837k0.f85612u = i17;
                                    c16837k0.f85613v = i18;
                                    c16837k0.f85614w = i19;
                                    c16837k0.f85615x = intValue;
                                    c16837k0.f85609A = 3;
                                    obj2 = interfaceC18510q2.mo45599Hr(m145341c3, m145341c4, c16837k0);
                                    if (obj2 == m142578e) {
                                        return m142578e;
                                    }
                                    int i232 = i17;
                                    i22 = intValue;
                                    i12 = i19;
                                    interfaceC18511r = interfaceC18511r2;
                                    i14 = i232;
                                    int i242 = i18;
                                    list = (List) obj2;
                                    i13 = i242;
                                    if (!list.isEmpty()) {
                                        return C24848g0.f119245a;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            i16 = c16837k0.f85614w;
                            i15 = c16837k0.f85613v;
                            int i26 = c16837k0.f85612u;
                            InterfaceC18511r interfaceC18511r3 = (InterfaceC18511r) c16837k0.f85611t;
                            InterfaceC18510q interfaceC18510q3 = (InterfaceC18510q) c16837k0.f85610s;
                            AbstractC24862s.m129228b(obj2);
                            interfaceC18510q2 = interfaceC18510q3;
                            interfaceC18511r2 = interfaceC18511r3;
                            i17 = i26;
                            intValue = i16 + ((Number) obj2).intValue();
                            i18 = i15 + 1;
                            i19 = (i18 * i17) - intValue;
                            Integer m145341c32 = AbstractC29094b.m145341c(i19);
                            Integer m145341c42 = AbstractC29094b.m145341c(i17);
                            c16837k0.f85610s = interfaceC18510q2;
                            c16837k0.f85611t = interfaceC18511r2;
                            c16837k0.f85612u = i17;
                            c16837k0.f85613v = i18;
                            c16837k0.f85614w = i19;
                            c16837k0.f85615x = intValue;
                            c16837k0.f85609A = 3;
                            obj2 = interfaceC18510q2.mo45599Hr(m145341c32, m145341c42, c16837k0);
                            if (obj2 == m142578e) {
                            }
                            int i2322 = i17;
                            i22 = intValue;
                            i12 = i19;
                            interfaceC18511r = interfaceC18511r2;
                            i14 = i2322;
                            int i2422 = i18;
                            list = (List) obj2;
                            i13 = i2422;
                            if (!list.isEmpty()) {
                            }
                        }
                    } else {
                        i12 = c16837k0.f85614w;
                        int i27 = c16837k0.f85613v;
                        int i28 = c16837k0.f85612u;
                        InterfaceC18511r interfaceC18511r4 = (InterfaceC18511r) c16837k0.f85611t;
                        interfaceC18510q2 = (InterfaceC18510q) c16837k0.f85610s;
                        AbstractC24862s.m129228b(obj2);
                        i13 = i27;
                        interfaceC18511r = interfaceC18511r4;
                        i14 = i28;
                        obj = obj2;
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    Integer m145341c5 = AbstractC29094b.m145341c(0);
                    Integer m145341c6 = AbstractC29094b.m145341c(AbstractC26080o.a.f124275b);
                    c16837k0.f85610s = interfaceC18510q;
                    c16837k0.f85611t = interfaceC18511r;
                    c16837k0.f85612u = AbstractC26080o.a.f124275b;
                    c16837k0.f85613v = 0;
                    c16837k0.f85614w = 0;
                    c16837k0.f85609A = 1;
                    Object mo45599Hr = interfaceC18510q.mo45599Hr(m145341c5, m145341c6, c16837k0);
                    if (mo45599Hr == m142578e) {
                        return m142578e;
                    }
                    interfaceC18510q2 = interfaceC18510q;
                    obj = mo45599Hr;
                    i12 = 0;
                    i13 = 0;
                    i14 = AbstractC26080o.a.f124275b;
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                }
            }
        }
        c16837k0 = new C16837k0(continuation);
        Object obj22 = c16837k0.f85616y;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16837k0.f85609A;
        int i222 = 0;
        if (i11 == 0) {
        }
        list = (List) obj;
        if (!list.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m89962x0(CoroutineScope coroutineScope, List list, InterfaceC18505l interfaceC18505l, Continuation continuation) {
        C16839l0 c16839l0;
        Object m142578e;
        int i11;
        AtomicInteger atomicInteger;
        if (continuation instanceof C16839l0) {
            c16839l0 = (C16839l0) continuation;
            int i12 = c16839l0.f85621v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16839l0.f85621v = i12 - Integer.MIN_VALUE;
                Object obj = c16839l0.f85619t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16839l0.f85621v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        atomicInteger = (AtomicInteger) c16839l0.f85618s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (list.isEmpty()) {
                        return AbstractC29094b.m145341c(0);
                    }
                    m89942n0(this, "SMLZCloudMigrationUploader", "Start reanalyze potentially backup items, size=" + list.size(), null, 4, null);
                    AtomicInteger atomicInteger2 = new AtomicInteger(0);
                    C16843n0 c16843n0 = new C16843n0(interfaceC18505l, atomicInteger2, null);
                    c16839l0.f85618s = atomicInteger2;
                    c16839l0.f85621v = 1;
                    if (AbstractC3486a.m17459a(list, coroutineScope, 16, c16843n0, c16839l0) == m142578e) {
                        return m142578e;
                    }
                    atomicInteger = atomicInteger2;
                }
                return AbstractC29094b.m145341c(atomicInteger.get());
            }
        }
        c16839l0 = new C16839l0(continuation);
        Object obj2 = c16839l0.f85619t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16839l0.f85621v;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145341c(atomicInteger.get());
    }

    /* renamed from: y0 */
    static /* synthetic */ Object m89964y0(ZaloCloudMigrationUploader zaloCloudMigrationUploader, CoroutineScope coroutineScope, List list, InterfaceC18505l interfaceC18505l, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC18505l = C16841m0.f85630q;
        }
        return zaloCloudMigrationUploader.m89962x0(coroutineScope, list, interfaceC18505l, continuation);
    }

    /* renamed from: z0 */
    private final Object m89966z0(ProducerScope producerScope, Failure failure, Continuation continuation) {
        Object cVar;
        EnumC27250e enumC27250e;
        Object m142578e;
        EnumC27250e enumC27250e2 = null;
        if (failure instanceof Failure.BatteryLow) {
            EnumC27250e enumC27250e3 = this.f85486f;
            if (enumC27250e3 == null) {
                AbstractC19074t.m100223u("currentStep");
            } else {
                enumC27250e2 = enumC27250e3;
            }
            cVar = new AbstractC16866f.a(enumC27250e2, this.f85487g);
        } else if (failure instanceof Failure.DriveProblem) {
            EnumC27250e enumC27250e4 = this.f85486f;
            if (enumC27250e4 == null) {
                AbstractC19074t.m100223u("currentStep");
            } else {
                enumC27250e2 = enumC27250e4;
            }
            cVar = new AbstractC16866f.b(enumC27250e2, this.f85487g);
        } else if ((failure instanceof Failure.NetworkNotAvailable) || (failure instanceof Failure.NetworkWifi)) {
            EnumC27250e enumC27250e5 = this.f85486f;
            if (enumC27250e5 == null) {
                AbstractC19074t.m100223u("currentStep");
            } else {
                enumC27250e2 = enumC27250e5;
            }
            cVar = new AbstractC16866f.c(enumC27250e2, this.f85487g);
        } else if (failure instanceof Failure.SubscriptionExpired) {
            EnumC27250e enumC27250e6 = this.f85486f;
            if (enumC27250e6 == null) {
                AbstractC19074t.m100223u("currentStep");
            } else {
                enumC27250e2 = enumC27250e6;
            }
            cVar = new AbstractC16866f.g(enumC27250e2, this.f85487g);
        } else if (failure instanceof Failure.StorageNotAvailable) {
            EnumC27250e enumC27250e7 = this.f85486f;
            if (enumC27250e7 == null) {
                AbstractC19074t.m100223u("currentStep");
            } else {
                enumC27250e2 = enumC27250e7;
            }
            cVar = new AbstractC16866f.f(enumC27250e2, this.f85487g);
        } else if (failure instanceof Failure.RuntimeError) {
            EnumC27250e enumC27250e8 = this.f85486f;
            if (enumC27250e8 == null) {
                AbstractC19074t.m100223u("currentStep");
                enumC27250e = null;
            } else {
                enumC27250e = enumC27250e8;
            }
            cVar = new AbstractC16866f.e(enumC27250e, this.f85488h.get(), this.f85489i, this.f85506z, this.f85475A, failure.m89970a(), failure instanceof Failure.ServerQuotaExceeded, this.f85487g);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object mo112908S = producerScope.mo112908S(cVar, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo112908S == m142578e) {
            return mo112908S;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: S */
    public final Object m89967S(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = FlowKt.m113290h(new C16830h(null)).mo97893a(flowCollector, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: f0 */
    public final void m89968f0() {
        BuildersKt__BuildersKt.m112536b(null, new C16823d0(null), 1, null);
    }

    /* renamed from: m0 */
    public final void m89969m0(String str, String str2, C26676b.b bVar) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f85490j = str2;
        C26676b.m136955e(str, str2, bVar);
    }

    public /* synthetic */ ZaloCloudMigrationUploader(InterfaceC25320d interfaceC25320d, InterfaceC23792b interfaceC23792b, C22479c c22479c, C27252g c27252g, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC25320d, interfaceC23792b, c22479c, c27252g, (i11 & 16) != 0 ? C17932a.f90528a.m94572a() : coroutineDispatcher);
    }
}
