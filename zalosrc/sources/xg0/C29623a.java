package xg0;

import com.zing.zalo.data.zalocloud.model.api.CloudMediaItemResponse;
import com.zing.zalo.data.zalocloud.model.api.VerifyCloudQueueResponse;
import dh0.C17933b;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import ln0.AbstractC22543l;
import nl.C23870a;
import p363nh.C23744a;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25361o0;
import qm0.AbstractC25370t;
import sl.C26319d;
import tg0.C26676b;
import tl.C26731a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: xg0.a */
/* loaded from: classes7.dex */
public final class C29623a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C23870a f136794a;

    /* renamed from: b */
    private final C26731a f136795b;

    /* renamed from: c */
    private final CoroutineDispatcher f136796c;

    /* renamed from: d */
    private final AtomicBoolean f136797d;

    /* renamed from: e */
    private final C29234i f136798e;

    /* renamed from: f */
    private final InterfaceC29232g f136799f;

    /* renamed from: g */
    private final ConcurrentHashMap f136800g;

    /* renamed from: h */
    private final ConcurrentHashMap f136801h;

    /* renamed from: xg0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg0.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f136802t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f136802t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C29623a c29623a = C29623a.this;
                this.f136802t = 1;
                if (c29623a.m147233i(this) == m142578e) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg0.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: B */
        int f136805B;

        /* renamed from: s */
        Object f136806s;

        /* renamed from: t */
        Object f136807t;

        /* renamed from: u */
        Object f136808u;

        /* renamed from: v */
        Object f136809v;

        /* renamed from: w */
        Object f136810w;

        /* renamed from: x */
        long f136811x;

        /* renamed from: y */
        int f136812y;

        /* renamed from: z */
        /* synthetic */ Object f136813z;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f136813z = obj;
            this.f136805B |= Integer.MIN_VALUE;
            return C29623a.this.m147233i(this);
        }
    }

    /* renamed from: xg0.a$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: xg0.a$d$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f136815t;

            /* renamed from: u */
            Object f136816u;

            /* renamed from: v */
            int f136817v;

            /* renamed from: w */
            final /* synthetic */ Channel f136818w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Channel channel, Continuation continuation) {
                super(2, continuation);
                this.f136818w = channel;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f136818w, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:16:0x0050, B:18:0x0058, B:22:0x0072), top: B:15:0x0050 }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:16:0x0050, B:18:0x0058, B:22:0x0072), top: B:15:0x0050 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:10:0x003e). Please report as a decompilation issue!!! */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                ReceiveChannel receiveChannel;
                ChannelIterator it;
                a aVar;
                Object mo113028a;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f136817v;
                try {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                ChannelIterator channelIterator = (ChannelIterator) this.f136816u;
                                receiveChannel = (ReceiveChannel) this.f136815t;
                                AbstractC24862s.m129228b(obj);
                                it = channelIterator;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ChannelIterator channelIterator2 = (ChannelIterator) this.f136816u;
                            ReceiveChannel receiveChannel2 = (ReceiveChannel) this.f136815t;
                            AbstractC24862s.m129228b(obj);
                            ReceiveChannel receiveChannel3 = receiveChannel2;
                            a aVar2 = this;
                            try {
                                if (!((Boolean) obj).booleanValue()) {
                                    Job job = (Job) channelIterator2.next();
                                    aVar2.f136815t = receiveChannel3;
                                    aVar2.f136816u = channelIterator2;
                                    aVar2.f136817v = 2;
                                    if (job.mo112736c0(aVar2) == m142578e) {
                                        return m142578e;
                                    }
                                    it = channelIterator2;
                                    aVar = aVar2;
                                    receiveChannel = receiveChannel3;
                                    aVar.f136815t = receiveChannel;
                                    aVar.f136816u = it;
                                    aVar.f136817v = 1;
                                    mo113028a = it.mo113028a(aVar);
                                    if (mo113028a != m142578e) {
                                        return m142578e;
                                    }
                                    a aVar3 = aVar;
                                    channelIterator2 = it;
                                    obj = mo113028a;
                                    receiveChannel3 = receiveChannel;
                                    aVar2 = aVar3;
                                    if (!((Boolean) obj).booleanValue()) {
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        ChannelsKt.m113108b(receiveChannel3, null);
                                        return C24848g0.f119245a;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                receiveChannel = receiveChannel3;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ChannelsKt.m113108b(receiveChannel, th);
                                    throw th3;
                                }
                            }
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        receiveChannel = this.f136818w;
                        it = receiveChannel.iterator();
                    }
                    aVar = this;
                    aVar.f136815t = receiveChannel;
                    aVar.f136816u = it;
                    aVar.f136817v = 1;
                    mo113028a = it.mo113028a(aVar);
                    if (mo113028a != m142578e) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Channel mo12V4() {
            Channel m113079b = ChannelKt.m113079b(Integer.MAX_VALUE, null, null, 6, null);
            BuildersKt__Builders_commonKt.m112540d(C29623a.this.m147231e(), null, null, new a(m113079b, null), 3, null);
            return m113079b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xg0.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f136819t;

        /* renamed from: v */
        final /* synthetic */ CloudMediaItemResponse f136821v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CloudMediaItemResponse cloudMediaItemResponse, Continuation continuation) {
            super(2, continuation);
            this.f136821v = cloudMediaItemResponse;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f136821v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f136819t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C26731a c26731a = C29623a.this.f136795b;
                CloudMediaItemResponse cloudMediaItemResponse = this.f136821v;
                this.f136819t = 1;
                if (c26731a.m137508t(cloudMediaItemResponse, false, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29623a(C23870a c23870a, C26731a c26731a) {
        this(c23870a, c26731a, null, 4, null);
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c26731a, "cloudItemProcessor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final CoroutineScope m147231e() {
        return C17933b.f90533a.m94579d();
    }

    /* renamed from: f */
    private final Channel m147232f() {
        return (Channel) this.f136799f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(13:5|6|7|(1:(1:(1:(1:(1:(10:14|15|16|17|(3:20|(2:22|23)(1:25)|18)|26|27|28|29|30)(2:32|33))(13:34|35|36|37|38|39|(4:41|(1:43)|44|(8:203|204|(1:206)(1:214)|207|(1:209)(1:213)|210|211|212)(17:46|47|48|49|50|51|52|53|54|55|56|(2:59|57)|60|61|(2:62|(2:64|(1:184)(2:68|69))(2:186|187))|70|(1:72)(7:73|74|75|(4:78|(2:80|81)(1:83)|82|76)|84|85|(7:87|88|89|90|91|39|(0))(14:102|103|104|105|106|(1:108)(4:155|(6:158|159|160|(2:162|163)(1:165)|164|156)|166|167)|(2:153|154)(1:110)|111|112|113|114|(1:116)(1:121)|117|(1:119)(4:120|38|39|(0))))))|227|228|(5:230|17|(1:18)|26|27)|28|29|30))(10:236|237|238|239|74|75|(1:76)|84|85|(0)(0)))(6:245|246|247|248|44|(0)(0)))(3:249|250|251))(2:259|(2:261|262)(3:263|264|(1:266)(1:267)))|252|253|(0)|227|228|(0)|28|29|30))|275|6|7|(0)(0)|252|253|(0)|227|228|(0)|28|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0054, code lost:            r0 = e;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04f6 A[Catch: all -> 0x004d, Exception -> 0x0054, TryCatch #20 {Exception -> 0x0054, blocks: (B:15:0x0047, B:18:0x04f0, B:20:0x04f6, B:27:0x051a, B:228:0x04db, B:230:0x04e5), top: B:7:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04e5 A[Catch: all -> 0x004d, Exception -> 0x0054, TryCatch #20 {Exception -> 0x0054, blocks: (B:15:0x0047, B:18:0x04f0, B:20:0x04f6, B:27:0x051a, B:228:0x04db, B:230:0x04e5), top: B:7:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f A[Catch: all -> 0x00d7, Exception -> 0x00db, TRY_ENTER, TryCatch #25 {Exception -> 0x00db, all -> 0x00d7, blocks: (B:41:0x014f, B:44:0x0175, B:50:0x01f2, B:247:0x00d1), top: B:246:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cd A[Catch: all -> 0x0254, Exception -> 0x025d, TRY_ENTER, TryCatch #27 {Exception -> 0x025d, all -> 0x0254, blocks: (B:56:0x021d, B:57:0x022a, B:59:0x0230, B:61:0x0266, B:62:0x0270, B:64:0x0276, B:66:0x0286, B:70:0x029d, B:78:0x02cd, B:80:0x02df, B:87:0x02f1), top: B:55:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f1 A[Catch: all -> 0x0254, Exception -> 0x025d, TRY_ENTER, TRY_LEAVE, TryCatch #27 {Exception -> 0x025d, all -> 0x0254, blocks: (B:56:0x021d, B:57:0x022a, B:59:0x0230, B:61:0x0266, B:62:0x0270, B:64:0x0276, B:66:0x0286, B:70:0x029d, B:78:0x02cd, B:80:0x02df, B:87:0x02f1), top: B:55:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, xg0.a] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4, types: [xg0.a] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x041f -> B:34:0x0422). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0334 -> B:35:0x0338). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m147233i(Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        String str;
        String m124834u0;
        long m124837v0;
        C29623a c29623a;
        String str2;
        C29623a c29623a2;
        List list;
        long j11;
        int i12;
        boolean z11;
        Iterator it;
        String str3;
        String str4;
        Throwable th2;
        String str5;
        Exception e11;
        String str6;
        String str7;
        List list2;
        CloudMediaItemResponse cloudMediaItemResponse;
        VerifyCloudQueueResponse verifyCloudQueueResponse;
        String m41395c;
        Long m145342d;
        int i13;
        long longValue;
        long m116581d;
        String str8;
        int m131511r;
        int m131400e;
        int m116580c;
        Object obj;
        C29623a c29623a3;
        try {
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i14 = cVar.f136805B;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    cVar.f136805B = i14 - Integer.MIN_VALUE;
                    Object obj2 = cVar.f136813z;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = cVar.f136805B;
                    C29623a c29623a4 = 3;
                    c29623a4 = 3;
                    String str9 = ", lastTS=";
                    String str10 = ", lastNoiseId=";
                    if (i11 != 0) {
                        str = ")";
                        AbstractC24862s.m129228b(obj2);
                        C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): Start verify cloud queue", null, 4, null);
                        if (!this.f136797d.compareAndSet(false, true)) {
                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            C26676b.m136957g("SMLZCloudQueue", "checkVerifyCloudQueue(): VERIFYING", null, 4, null);
                            return C24848g0.f119245a;
                        }
                        try {
                            m124834u0 = this.f136794a.m124834u0();
                            m124837v0 = this.f136794a.m124837v0();
                            C23870a c23870a = this.f136794a;
                            int m124769G0 = c23870a.m124769G0();
                            cVar.f136806s = this;
                            cVar.f136807t = m124834u0;
                            cVar.f136811x = m124837v0;
                            cVar.f136805B = 1;
                            obj2 = c23870a.m124761C0(m124769G0, cVar);
                            if (obj2 == m142578e) {
                                return m142578e;
                            }
                            c29623a = this;
                        } catch (Exception e12) {
                            e = e12;
                            c29623a4 = this;
                            C26676b.m136954d("SMLZCloudQueue", e);
                            c29623a4.f136797d.set(false);
                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            return C24848g0.f119245a;
                        } catch (Throwable th3) {
                            th = th3;
                            c29623a4 = this;
                            c29623a4.f136797d.set(false);
                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            throw th;
                        }
                    } else if (i11 == 1) {
                        str = ")";
                        m124837v0 = cVar.f136811x;
                        m124834u0 = (String) cVar.f136807t;
                        c29623a = (C29623a) cVar.f136806s;
                        try {
                            AbstractC24862s.m129228b(obj2);
                        } catch (Exception e13) {
                            e = e13;
                            c29623a4 = c29623a;
                            C26676b.m136954d("SMLZCloudQueue", e);
                            c29623a4.f136797d.set(false);
                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            return C24848g0.f119245a;
                        } catch (Throwable th4) {
                            th = th4;
                            c29623a4 = c29623a;
                            c29623a4.f136797d.set(false);
                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            throw th;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                it = (Iterator) cVar.f136807t;
                                C29623a c29623a5 = (C29623a) cVar.f136806s;
                                AbstractC24862s.m129228b(obj2);
                                c29623a4 = c29623a5;
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    C26731a c26731a = c29623a4.f136795b;
                                    CloudMediaItemResponse cloudMediaItemResponse2 = (CloudMediaItemResponse) entry.getValue();
                                    cVar.f136806s = c29623a4;
                                    cVar.f136807t = it;
                                    cVar.f136808u = null;
                                    cVar.f136809v = null;
                                    cVar.f136810w = null;
                                    cVar.f136805B = 5;
                                    if (c26731a.m137508t(cloudMediaItemResponse2, false, cVar) == m142578e) {
                                        return m142578e;
                                    }
                                }
                                c29623a4.f136801h.clear();
                                c29623a3 = c29623a4;
                                c29623a3.f136797d.set(false);
                                C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                return C24848g0.f119245a;
                            }
                            i12 = cVar.f136812y;
                            long j12 = cVar.f136811x;
                            List list3 = (List) cVar.f136808u;
                            String str11 = (String) cVar.f136807t;
                            C29623a c29623a6 = (C29623a) cVar.f136806s;
                            try {
                                AbstractC24862s.m129228b(obj2);
                                str2 = str11;
                                str4 = ", lastNoiseId=";
                                list2 = list3;
                                j11 = j12;
                                str3 = ", lastTS=";
                                c29623a2 = c29623a6;
                                str5 = ")";
                                str10 = str4;
                                str = str5;
                                str9 = str3;
                                list = list2;
                                if (i12 != 0) {
                                    C26319d c26319d = new C26319d(str2, list, c29623a2.f136794a.m124767F0());
                                    C23870a c23870a2 = c29623a2.f136794a;
                                    cVar.f136806s = c29623a2;
                                    cVar.f136807t = str2;
                                    cVar.f136808u = list;
                                    cVar.f136809v = null;
                                    cVar.f136810w = null;
                                    cVar.f136811x = j11;
                                    cVar.f136812y = i12;
                                    cVar.f136805B = 2;
                                    obj2 = c23870a2.m124758A1(c26319d, cVar);
                                    if (obj2 == m142578e) {
                                        return m142578e;
                                    }
                                    verifyCloudQueueResponse = (VerifyCloudQueueResponse) obj2;
                                    if (verifyCloudQueueResponse != null) {
                                        try {
                                            C24848g0 c24848g0 = C24848g0.f119245a;
                                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str10 + str2 + str9 + j11 + str, null, 4, null);
                                            c29623a2.f136794a.m124817l1(str2);
                                            c29623a2.f136794a.m124819m1(j11);
                                            c29623a2.f136794a.m124812h1(i12 == 0);
                                            c29623a2.f136797d.set(false);
                                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                            return c24848g0;
                                        } catch (Exception e14) {
                                            e11 = e14;
                                            str8 = str;
                                            str3 = str9;
                                            str4 = str10;
                                            str5 = str8;
                                            try {
                                                C26676b.m136954d("SMLZCloudQueue", e11);
                                                if (i12 == 0) {
                                                }
                                                C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                c29623a2.f136794a.m124817l1(str2);
                                                c29623a2.f136794a.m124819m1(j11);
                                                c29623a2.f136794a.m124812h1(i12 != 0);
                                                C29623a c29623a7 = c29623a2;
                                                z11 = !c29623a7.f136801h.isEmpty();
                                                c29623a3 = c29623a7;
                                                if (z11) {
                                                }
                                                c29623a3.f136797d.set(false);
                                                C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                                return C24848g0.f119245a;
                                            } catch (Throwable th5) {
                                                th2 = th5;
                                                C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                c29623a2.f136794a.m124817l1(str2);
                                                c29623a2.f136794a.m124819m1(j11);
                                                c29623a2.f136794a.m124812h1(i12 == 0);
                                                throw th2;
                                            }
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            str8 = str;
                                            str3 = str9;
                                            str4 = str10;
                                            str5 = str8;
                                            if (i12 != 0) {
                                            }
                                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                            c29623a2.f136794a.m124817l1(str2);
                                            c29623a2.f136794a.m124819m1(j11);
                                            c29623a2.f136794a.m124812h1(i12 == 0);
                                            throw th2;
                                        }
                                    }
                                    try {
                                        str8 = str;
                                        try {
                                            try {
                                                List m41396d = verifyCloudQueueResponse.m41396d();
                                                String m41397e = verifyCloudQueueResponse.m41397e();
                                                str = str8;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("verifyCloudQueue(): responseData=");
                                                sb2.append(m41397e);
                                                C26676b.m136955e("SMLZCloudQueue", sb2.toString(), C26676b.b.f126331p);
                                                ConcurrentHashMap concurrentHashMap = c29623a2.f136800g;
                                                List list4 = m41396d;
                                                m131511r = AbstractC25370t.m131511r(list4, 10);
                                                m131400e = AbstractC25361o0.m131400e(m131511r);
                                                m116580c = AbstractC22543l.m116580c(m131400e, 16);
                                                LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
                                                Iterator it2 = list4.iterator();
                                                while (it2.hasNext()) {
                                                    Iterator it3 = it2;
                                                    C24860q m129235a = AbstractC24866w.m129235a(((CloudMediaItemResponse) it2.next()).m41297e(), AbstractC29094b.m145339a(true));
                                                    linkedHashMap.put(m129235a.m129215c(), m129235a.m129216d());
                                                    it2 = it3;
                                                }
                                                concurrentHashMap.putAll(linkedHashMap);
                                                Iterator it4 = m41396d.iterator();
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        obj = null;
                                                        break;
                                                    }
                                                    obj = it4.next();
                                                    CloudMediaItemResponse cloudMediaItemResponse3 = (CloudMediaItemResponse) obj;
                                                    Iterator it5 = it4;
                                                    if (cloudMediaItemResponse3.m41293a() == 5 && cloudMediaItemResponse3.m41296d().m41368h() > c29623a2.f136794a.m124829s0()) {
                                                        break;
                                                    }
                                                    it4 = it5;
                                                }
                                                CloudMediaItemResponse cloudMediaItemResponse4 = (CloudMediaItemResponse) obj;
                                                C26731a c26731a2 = c29623a2.f136795b;
                                                cVar.f136806s = c29623a2;
                                                cVar.f136807t = str2;
                                                cVar.f136808u = list;
                                                cVar.f136809v = verifyCloudQueueResponse;
                                                cVar.f136810w = cloudMediaItemResponse4;
                                                cVar.f136811x = j11;
                                                cVar.f136812y = i12;
                                                cVar.f136805B = 3;
                                                if (c26731a2.m137509u(m41396d, true, cVar) == m142578e) {
                                                    return m142578e;
                                                }
                                                list2 = list;
                                                cloudMediaItemResponse = cloudMediaItemResponse4;
                                                try {
                                                    for (Map.Entry entry2 : c29623a2.f136801h.entrySet()) {
                                                        if (c29623a2.f136800g.containsKey(entry2.getKey())) {
                                                            c29623a2.f136801h.remove(entry2.getKey());
                                                        }
                                                    }
                                                    c29623a2.f136800g.clear();
                                                    if (cloudMediaItemResponse == null) {
                                                        try {
                                                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): There was a RESET_CLOUD action, restart verify from the beginning", null, 4, null);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append("verifyCloudQueue(): COMPLETE (hasMore=");
                                                            sb3.append(true);
                                                            String str12 = str6;
                                                            sb3.append(str12);
                                                            sb3.append("");
                                                            str3 = str7;
                                                            sb3.append(str3);
                                                            sb3.append(j11);
                                                            String str13 = str;
                                                            sb3.append(str13);
                                                            C26676b.m136957g("SMLZCloudQueue", sb3.toString(), null, 4, null);
                                                            c29623a2.f136794a.m124817l1("");
                                                            c29623a2.f136794a.m124819m1(j11);
                                                            c29623a2.f136794a.m124812h1(false);
                                                            str10 = str12;
                                                            str = str13;
                                                            i12 = 1;
                                                            str9 = str3;
                                                            list = list2;
                                                            if (i12 != 0) {
                                                            }
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            c29623a4 = c29623a2;
                                                            C26676b.m136954d("SMLZCloudQueue", e);
                                                            c29623a4.f136797d.set(false);
                                                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                                            return C24848g0.f119245a;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            c29623a4 = c29623a2;
                                                            c29623a4.f136797d.set(false);
                                                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                                            throw th;
                                                        }
                                                        str2 = "";
                                                    } else {
                                                        try {
                                                            try {
                                                                str5 = str;
                                                                str3 = str7;
                                                                str4 = str6;
                                                                try {
                                                                    Iterator it6 = verifyCloudQueueResponse.m41396d().iterator();
                                                                    if (it6.hasNext()) {
                                                                        m145342d = AbstractC29094b.m145342d(((CloudMediaItemResponse) it6.next()).m41298f());
                                                                        while (it6.hasNext()) {
                                                                            int i15 = i12;
                                                                            Long m145342d2 = AbstractC29094b.m145342d(((CloudMediaItemResponse) it6.next()).m41298f());
                                                                            if (m145342d.compareTo(m145342d2) < 0) {
                                                                                m145342d = m145342d2;
                                                                            }
                                                                            i12 = i15;
                                                                        }
                                                                        i13 = i12;
                                                                    } else {
                                                                        i13 = i12;
                                                                        m145342d = null;
                                                                    }
                                                                    if (m145342d != null) {
                                                                        try {
                                                                            longValue = m145342d.longValue();
                                                                        } catch (Exception e16) {
                                                                            e11 = e16;
                                                                            str2 = m41395c;
                                                                            i12 = i13;
                                                                            C26676b.m136954d("SMLZCloudQueue", e11);
                                                                            if (i12 == 0) {
                                                                            }
                                                                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                                            c29623a2.f136794a.m124817l1(str2);
                                                                            c29623a2.f136794a.m124819m1(j11);
                                                                            c29623a2.f136794a.m124812h1(i12 != 0);
                                                                            C29623a c29623a72 = c29623a2;
                                                                            z11 = !c29623a72.f136801h.isEmpty();
                                                                            c29623a3 = c29623a72;
                                                                            if (z11) {
                                                                            }
                                                                            c29623a3.f136797d.set(false);
                                                                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                                                            return C24848g0.f119245a;
                                                                        } catch (Throwable th8) {
                                                                            th2 = th8;
                                                                            str2 = m41395c;
                                                                            i12 = i13;
                                                                            if (i12 != 0) {
                                                                            }
                                                                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                                            c29623a2.f136794a.m124817l1(str2);
                                                                            c29623a2.f136794a.m124819m1(j11);
                                                                            c29623a2.f136794a.m124812h1(i12 == 0);
                                                                            throw th2;
                                                                        }
                                                                    } else {
                                                                        longValue = -1;
                                                                    }
                                                                    ?? r02 = verifyCloudQueueResponse.m41394b() == 1 ? 1 : 0;
                                                                    C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + ((boolean) r02) + str4 + m41395c + str3 + m116581d + str5, null, 4, null);
                                                                    c29623a2.f136794a.m124817l1(m41395c);
                                                                    c29623a2.f136794a.m124819m1(m116581d);
                                                                    c29623a2.f136794a.m124812h1(r02 ^ 1);
                                                                    C23870a c23870a3 = c29623a2.f136794a;
                                                                    cVar.f136806s = c29623a2;
                                                                    cVar.f136807t = m41395c;
                                                                    cVar.f136808u = list2;
                                                                    cVar.f136809v = null;
                                                                    cVar.f136810w = null;
                                                                    cVar.f136811x = m116581d;
                                                                    cVar.f136812y = r02;
                                                                    cVar.f136805B = 4;
                                                                    if (c23870a3.m124766F(list2, cVar) == m142578e) {
                                                                        return m142578e;
                                                                    }
                                                                    j11 = m116581d;
                                                                    str2 = m41395c;
                                                                    i12 = r02;
                                                                    str10 = str4;
                                                                    str = str5;
                                                                    str9 = str3;
                                                                    list = list2;
                                                                    if (i12 != 0) {
                                                                    }
                                                                } catch (Exception e17) {
                                                                    e11 = e17;
                                                                    C26676b.m136954d("SMLZCloudQueue", e11);
                                                                    if (i12 == 0) {
                                                                    }
                                                                    C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                                    c29623a2.f136794a.m124817l1(str2);
                                                                    c29623a2.f136794a.m124819m1(j11);
                                                                    c29623a2.f136794a.m124812h1(i12 != 0);
                                                                    C29623a c29623a722 = c29623a2;
                                                                    z11 = !c29623a722.f136801h.isEmpty();
                                                                    c29623a3 = c29623a722;
                                                                    if (z11) {
                                                                    }
                                                                    c29623a3.f136797d.set(false);
                                                                    C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                                                    return C24848g0.f119245a;
                                                                } catch (Throwable th9) {
                                                                    th2 = th9;
                                                                    if (i12 != 0) {
                                                                    }
                                                                    C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                                    c29623a2.f136794a.m124817l1(str2);
                                                                    c29623a2.f136794a.m124819m1(j11);
                                                                    c29623a2.f136794a.m124812h1(i12 == 0);
                                                                    throw th2;
                                                                }
                                                            } catch (Exception e18) {
                                                                e11 = e18;
                                                                j11 = m116581d;
                                                                str2 = m41395c;
                                                                i12 = i13;
                                                                C26676b.m136954d("SMLZCloudQueue", e11);
                                                                C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                                c29623a2.f136794a.m124817l1(str2);
                                                                c29623a2.f136794a.m124819m1(j11);
                                                                c29623a2.f136794a.m124812h1(i12 != 0);
                                                                C29623a c29623a7222 = c29623a2;
                                                                z11 = !c29623a7222.f136801h.isEmpty();
                                                                c29623a3 = c29623a7222;
                                                                if (z11) {
                                                                }
                                                                c29623a3.f136797d.set(false);
                                                                C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                                                return C24848g0.f119245a;
                                                            } catch (Throwable th10) {
                                                                th2 = th10;
                                                                j11 = m116581d;
                                                                str2 = m41395c;
                                                                i12 = i13;
                                                                if (i12 != 0) {
                                                                }
                                                                C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                                                c29623a2.f136794a.m124817l1(str2);
                                                                c29623a2.f136794a.m124819m1(j11);
                                                                c29623a2.f136794a.m124812h1(i12 == 0);
                                                                throw th2;
                                                            }
                                                            m116581d = AbstractC22543l.m116581d(longValue, j11);
                                                        } catch (Exception e19) {
                                                            e11 = e19;
                                                            str2 = m41395c;
                                                        } catch (Throwable th11) {
                                                            th2 = th11;
                                                            str2 = m41395c;
                                                        }
                                                        m41395c = verifyCloudQueueResponse.m41395c();
                                                    }
                                                } catch (Exception e21) {
                                                    e11 = e21;
                                                    str5 = str;
                                                    str3 = str7;
                                                    str4 = str6;
                                                } catch (Throwable th12) {
                                                    th2 = th12;
                                                    str5 = str;
                                                    str3 = str7;
                                                    str4 = str6;
                                                }
                                            } catch (Exception e22) {
                                                e11 = e22;
                                                str4 = str10;
                                                str5 = str;
                                                str3 = str7;
                                            } catch (Throwable th13) {
                                                th2 = th13;
                                                str4 = str10;
                                                str5 = str;
                                                str3 = str7;
                                            }
                                            str7 = str9;
                                        } catch (Exception e23) {
                                            e11 = e23;
                                            str3 = str9;
                                            str4 = str10;
                                            str5 = str8;
                                            C26676b.m136954d("SMLZCloudQueue", e11);
                                            if (i12 == 0) {
                                            }
                                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                            c29623a2.f136794a.m124817l1(str2);
                                            c29623a2.f136794a.m124819m1(j11);
                                            c29623a2.f136794a.m124812h1(i12 != 0);
                                            C29623a c29623a72222 = c29623a2;
                                            z11 = !c29623a72222.f136801h.isEmpty();
                                            c29623a3 = c29623a72222;
                                            if (z11) {
                                            }
                                            c29623a3.f136797d.set(false);
                                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                            return C24848g0.f119245a;
                                        } catch (Throwable th14) {
                                            th2 = th14;
                                            str3 = str9;
                                            str4 = str10;
                                            str5 = str8;
                                            if (i12 != 0) {
                                            }
                                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                            c29623a2.f136794a.m124817l1(str2);
                                            c29623a2.f136794a.m124819m1(j11);
                                            c29623a2.f136794a.m124812h1(i12 == 0);
                                            throw th2;
                                        }
                                    } catch (Exception e24) {
                                        e11 = e24;
                                        str5 = str;
                                        str3 = str7;
                                        str4 = str6;
                                        C26676b.m136954d("SMLZCloudQueue", e11);
                                        if (i12 == 0) {
                                        }
                                        C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                        c29623a2.f136794a.m124817l1(str2);
                                        c29623a2.f136794a.m124819m1(j11);
                                        c29623a2.f136794a.m124812h1(i12 != 0);
                                        C29623a c29623a722222 = c29623a2;
                                        z11 = !c29623a722222.f136801h.isEmpty();
                                        c29623a3 = c29623a722222;
                                        if (z11) {
                                        }
                                        c29623a3.f136797d.set(false);
                                        C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                        return C24848g0.f119245a;
                                    } catch (Throwable th15) {
                                        th2 = th15;
                                        str5 = str;
                                        str3 = str7;
                                        str4 = str6;
                                        if (i12 != 0) {
                                        }
                                        C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                                        c29623a2.f136794a.m124817l1(str2);
                                        c29623a2.f136794a.m124819m1(j11);
                                        c29623a2.f136794a.m124812h1(i12 == 0);
                                        throw th2;
                                    }
                                    str6 = str10;
                                }
                                C29623a c29623a7222222 = c29623a2;
                                z11 = !c29623a7222222.f136801h.isEmpty();
                                c29623a3 = c29623a7222222;
                                if (z11) {
                                    it = c29623a7222222.f136801h.entrySet().iterator();
                                    c29623a4 = c29623a7222222;
                                    while (it.hasNext()) {
                                    }
                                    c29623a4.f136801h.clear();
                                    c29623a3 = c29623a4;
                                }
                                c29623a3.f136797d.set(false);
                                C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            } catch (Exception e25) {
                                e = e25;
                                c29623a4 = c29623a6;
                                C26676b.m136954d("SMLZCloudQueue", e);
                                c29623a4.f136797d.set(false);
                                C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                return C24848g0.f119245a;
                            } catch (Throwable th16) {
                                th = th16;
                                c29623a4 = c29623a6;
                                c29623a4.f136797d.set(false);
                                C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                                throw th;
                            }
                            return C24848g0.f119245a;
                        }
                        str = ")";
                        i12 = cVar.f136812y;
                        j11 = cVar.f136811x;
                        cloudMediaItemResponse = (CloudMediaItemResponse) cVar.f136810w;
                        VerifyCloudQueueResponse verifyCloudQueueResponse2 = (VerifyCloudQueueResponse) cVar.f136809v;
                        list2 = (List) cVar.f136808u;
                        str2 = (String) cVar.f136807t;
                        C29623a c29623a8 = (C29623a) cVar.f136806s;
                        try {
                            AbstractC24862s.m129228b(obj2);
                            verifyCloudQueueResponse = verifyCloudQueueResponse2;
                            str7 = ", lastTS=";
                            str6 = ", lastNoiseId=";
                            c29623a2 = c29623a8;
                            while (r1.hasNext()) {
                            }
                            c29623a2.f136800g.clear();
                            if (cloudMediaItemResponse == null) {
                            }
                        } catch (Exception e26) {
                            e11 = e26;
                            str3 = ", lastTS=";
                            str4 = ", lastNoiseId=";
                            c29623a2 = c29623a8;
                            str5 = str;
                            C26676b.m136954d("SMLZCloudQueue", e11);
                            if (i12 == 0) {
                            }
                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                            c29623a2.f136794a.m124817l1(str2);
                            c29623a2.f136794a.m124819m1(j11);
                            c29623a2.f136794a.m124812h1(i12 != 0);
                            C29623a c29623a72222222 = c29623a2;
                            z11 = !c29623a72222222.f136801h.isEmpty();
                            c29623a3 = c29623a72222222;
                            if (z11) {
                            }
                            c29623a3.f136797d.set(false);
                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            return C24848g0.f119245a;
                        } catch (Throwable th17) {
                            th2 = th17;
                            str3 = ", lastTS=";
                            str4 = ", lastNoiseId=";
                            c29623a2 = c29623a8;
                            str5 = str;
                            if (i12 != 0) {
                            }
                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                            c29623a2.f136794a.m124817l1(str2);
                            c29623a2.f136794a.m124819m1(j11);
                            c29623a2.f136794a.m124812h1(i12 == 0);
                            throw th2;
                        }
                    } else {
                        str = ")";
                        i12 = cVar.f136812y;
                        j11 = cVar.f136811x;
                        list = (List) cVar.f136808u;
                        str2 = (String) cVar.f136807t;
                        c29623a2 = (C29623a) cVar.f136806s;
                        try {
                            AbstractC24862s.m129228b(obj2);
                            verifyCloudQueueResponse = (VerifyCloudQueueResponse) obj2;
                            if (verifyCloudQueueResponse != null) {
                            }
                        } catch (Exception e27) {
                            e11 = e27;
                            str3 = str9;
                            str4 = str10;
                            str5 = str;
                            C26676b.m136954d("SMLZCloudQueue", e11);
                            if (i12 == 0) {
                            }
                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 == 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                            c29623a2.f136794a.m124817l1(str2);
                            c29623a2.f136794a.m124819m1(j11);
                            c29623a2.f136794a.m124812h1(i12 != 0);
                            C29623a c29623a722222222 = c29623a2;
                            z11 = !c29623a722222222.f136801h.isEmpty();
                            c29623a3 = c29623a722222222;
                            if (z11) {
                            }
                            c29623a3.f136797d.set(false);
                            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                            return C24848g0.f119245a;
                        } catch (Throwable th18) {
                            th2 = th18;
                            str3 = str9;
                            str4 = str10;
                            str5 = str;
                            if (i12 != 0) {
                            }
                            C26676b.m136957g("SMLZCloudQueue", "verifyCloudQueue(): COMPLETE (hasMore=" + (i12 != 0) + str4 + str2 + str3 + j11 + str5, null, 4, null);
                            c29623a2.f136794a.m124817l1(str2);
                            c29623a2.f136794a.m124819m1(j11);
                            c29623a2.f136794a.m124812h1(i12 == 0);
                            throw th2;
                        }
                    }
                    str2 = m124834u0;
                    c29623a2 = c29623a;
                    list = (List) obj2;
                    j11 = m124837v0;
                    i12 = 1;
                    if (i12 != 0) {
                    }
                    C29623a c29623a7222222222 = c29623a2;
                    z11 = !c29623a7222222222.f136801h.isEmpty();
                    c29623a3 = c29623a7222222222;
                    if (z11) {
                    }
                    c29623a3.f136797d.set(false);
                    C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
                    return C24848g0.f119245a;
                }
            }
            if (i11 != 0) {
            }
            str2 = m124834u0;
            c29623a2 = c29623a;
            list = (List) obj2;
            j11 = m124837v0;
            i12 = 1;
            if (i12 != 0) {
            }
            C29623a c29623a72222222222 = c29623a2;
            z11 = !c29623a72222222222.f136801h.isEmpty();
            c29623a3 = c29623a72222222222;
            if (z11) {
            }
            c29623a3.f136797d.set(false);
            C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
            return C24848g0.f119245a;
        } catch (Throwable th19) {
            th = th19;
        }
        cVar = new c(continuation);
        Object obj22 = cVar.f136813z;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f136805B;
        C29623a c29623a42 = 3;
        c29623a42 = 3;
        String str92 = ", lastTS=";
        String str102 = ", lastNoiseId=";
    }

    /* renamed from: d */
    public final void m147234d() {
        C26676b.m136957g("SMLZCloudQueue", "clearAllMemCache()", null, 4, null);
        SendChannel.DefaultImpls.m113195a(m147232f(), null, 1, null);
        this.f136798e.m145993b();
    }

    /* renamed from: g */
    public final boolean m147235g() {
        return this.f136797d.get();
    }

    /* renamed from: h */
    public final void m147236h() {
        Object mo112912p = m147232f().mo112912p(BuildersKt.m112530c(m147231e(), this.f136796c, CoroutineStart.LAZY, new b(null)));
        if (mo112912p instanceof ChannelResult.Failed) {
            C26676b.m136955e("SMLZCloudQueue", "Error while fire verify job: " + ChannelResult.m113084e(mo112912p), C26676b.b.f126335t);
        }
    }

    /* renamed from: j */
    public final void m147237j(CloudMediaItemResponse cloudMediaItemResponse) {
        AbstractC19074t.m100208f(cloudMediaItemResponse, "cloudMediaItemResponse");
        if (cloudMediaItemResponse.m41293a() == 5) {
            m147236h();
        } else if (!m147235g()) {
            BuildersKt__Builders_commonKt.m112540d(m147231e(), this.f136796c, null, new e(cloudMediaItemResponse, null), 2, null);
        } else if (!this.f136800g.containsKey(cloudMediaItemResponse.m41297e())) {
            this.f136801h.putIfAbsent(cloudMediaItemResponse.m41297e(), cloudMediaItemResponse);
        }
    }

    public C29623a(C23870a c23870a, C26731a c26731a, CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c26731a, "cloudItemProcessor");
        AbstractC19074t.m100208f(coroutineDispatcher, "ioDispatcher");
        this.f136794a = c23870a;
        this.f136795b = c26731a;
        this.f136796c = coroutineDispatcher;
        this.f136797d = new AtomicBoolean(false);
        C29234i m145994a = AbstractC29235j.m145994a();
        this.f136798e = m145994a;
        this.f136799f = AbstractC29233h.m145991b(m145994a, new d());
        this.f136800g = new ConcurrentHashMap();
        this.f136801h = new ConcurrentHashMap();
    }

    public /* synthetic */ C29623a(C23870a c23870a, C26731a c26731a, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(c23870a, c26731a, (i11 & 4) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }
}
