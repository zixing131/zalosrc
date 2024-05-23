package g20;

import a10.C0040e;
import a10.C0043h;
import a10.C0049n;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Parcelable;
import android.provider.Settings;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.ComplexAds;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.LogResultInfo;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.p071db.ZchDataBase;
import com.zing.zalo.shortvideo.data.p071db.entities.LogActive;
import com.zing.zalo.shortvideo.data.p071db.entities.LogEvent;
import com.zing.zalo.shortvideo.data.p071db.entities.LogGetList;
import com.zing.zalo.shortvideo.data.p071db.entities.LogImps;
import com.zing.zalo.shortvideo.data.p071db.entities.LogImpsAds;
import com.zing.zalo.shortvideo.data.p071db.entities.LogSession;
import com.zing.zalo.shortvideo.data.p071db.entities.LogUpload;
import com.zing.zalo.shortvideo.data.p071db.entities.LogViewStream;
import com.zing.zalo.shortvideo.data.p071db.entities.LogViewVideo;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.view.C10631i;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import e10.C18168e;
import e10.InterfaceC18170g;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import fn0.C19057i0;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import u10.C26947a;
import u10.C26948b;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;
import y00.InterfaceC30248b;
import z00.InterfaceC31140a;

/* renamed from: g20.a */
/* loaded from: classes5.dex */
public final class C19205a {

    /* renamed from: a */
    public static final C19205a f95429a;

    /* renamed from: b */
    private static boolean f95430b;

    /* renamed from: c */
    private static long f95431c;

    /* renamed from: d */
    private static int f95432d;

    /* renamed from: e */
    private static int f95433e;

    /* renamed from: f */
    private static int f95434f;

    /* renamed from: g */
    private static int f95435g;

    /* renamed from: h */
    private static final InterfaceC30248b f95436h;

    /* renamed from: i */
    private static String f95437i;

    /* renamed from: j */
    private static final Mutex f95438j;

    /* renamed from: k */
    private static final Mutex f95439k;

    /* renamed from: l */
    private static final Mutex f95440l;

    /* renamed from: m */
    private static final Mutex f95441m;

    /* renamed from: n */
    private static final Mutex f95442n;

    /* renamed from: o */
    private static final Mutex f95443o;

    /* renamed from: p */
    private static final Mutex f95444p;

    /* renamed from: q */
    private static final Mutex f95445q;

    /* renamed from: r */
    private static final Mutex f95446r;

    /* renamed from: s */
    private static final Mutex f95447s;

    /* renamed from: t */
    private static final Mutex f95448t;

    /* renamed from: u */
    private static final Mutex f95449u;

    /* renamed from: v */
    private static final Mutex f95450v;

    /* renamed from: w */
    private static final Mutex f95451w;

    /* renamed from: x */
    private static final List f95452x;

    /* renamed from: y */
    private static final List f95453y;

    /* renamed from: z */
    private static final List f95454z;

    /* renamed from: g20.a$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final String f95455a;

        /* renamed from: b */
        private final int f95456b;

        /* renamed from: c */
        private final Integer f95457c;

        /* renamed from: d */
        private final Boolean f95458d;

        /* renamed from: e */
        private final Integer f95459e;

        /* renamed from: f */
        private final Boolean f95460f;

        /* renamed from: g */
        private final Boolean f95461g;

        public a(String str, int i11, Integer num, Boolean bool, Integer num2, Boolean bool2, Boolean bool3) {
            AbstractC19074t.m100208f(str, "videoId");
            this.f95455a = str;
            this.f95456b = i11;
            this.f95457c = num;
            this.f95458d = bool;
            this.f95459e = num2;
            this.f95460f = bool2;
            this.f95461g = bool3;
        }

        /* renamed from: a */
        public final Integer m100731a() {
            return this.f95457c;
        }

        /* renamed from: b */
        public final Boolean m100732b() {
            return this.f95460f;
        }

        /* renamed from: c */
        public final Boolean m100733c() {
            return this.f95458d;
        }

        /* renamed from: d */
        public final Integer m100734d() {
            return this.f95459e;
        }

        /* renamed from: e */
        public final Boolean m100735e() {
            return this.f95461g;
        }

        /* renamed from: f */
        public final int m100736f() {
            return this.f95456b;
        }

        /* renamed from: g */
        public final String m100737g() {
            return this.f95455a;
        }
    }

    /* renamed from: g20.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends Enum {

        /* renamed from: A */
        private static final /* synthetic */ b[] f95462A;

        /* renamed from: B */
        private static final /* synthetic */ InterfaceC30165a f95463B;

        /* renamed from: p */
        public static final b f95464p = new b("VIEW", 0);

        /* renamed from: q */
        public static final b f95465q = new b("UPLOAD", 1);

        /* renamed from: r */
        public static final b f95466r = new b("EVENT", 2);

        /* renamed from: s */
        public static final b f95467s = new b("IMPRESSION", 3);

        /* renamed from: t */
        public static final b f95468t = new b("SESSION", 4);

        /* renamed from: u */
        public static final b f95469u = new b("LISTING", 5);

        /* renamed from: v */
        public static final b f95470v = new b("VIEW_ADS", 6);

        /* renamed from: w */
        public static final b f95471w = new b("EVENT_ADS", 7);

        /* renamed from: x */
        public static final b f95472x = new b("IMPRESSION_ADS", 8);

        /* renamed from: y */
        public static final b f95473y = new b("VIEW_STREAM", 9);

        /* renamed from: z */
        public static final b f95474z = new b("EVENT_STREAM", 10);

        static {
            b[] m100738b = m100738b();
            f95462A = m100738b;
            f95463B = AbstractC30166b.m148796a(m100738b);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m100738b() {
            return new b[]{f95464p, f95465q, f95466r, f95467s, f95468t, f95469u, f95470v, f95471w, f95472x, f95473y, f95474z};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f95462A.clone();
        }
    }

    /* renamed from: g20.a$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private final Video f95475a;

        /* renamed from: b */
        private final long f95476b;

        /* renamed from: c */
        private final int f95477c;

        /* renamed from: d */
        private final int f95478d;

        /* renamed from: e */
        private final int f95479e;

        /* renamed from: f */
        private final boolean f95480f;

        /* renamed from: g */
        private final boolean f95481g;

        /* renamed from: h */
        private final Map f95482h;

        /* renamed from: i */
        private final String f95483i;

        /* renamed from: j */
        private final String f95484j;

        /* renamed from: k */
        private final String f95485k;

        /* renamed from: l */
        private final String f95486l;

        /* renamed from: m */
        private final boolean f95487m;

        /* renamed from: n */
        private Integer f95488n;

        /* renamed from: o */
        private Integer f95489o;

        /* renamed from: p */
        private ComplexAds.Config f95490p;

        public c(Video video, long j11, int i11, int i12, int i13, boolean z11, boolean z12, Map map, String str, String str2, String str3, String str4, boolean z13, Integer num, Integer num2, ComplexAds.Config config) {
            AbstractC19074t.m100208f(video, "video");
            this.f95475a = video;
            this.f95476b = j11;
            this.f95477c = i11;
            this.f95478d = i12;
            this.f95479e = i13;
            this.f95480f = z11;
            this.f95481g = z12;
            this.f95482h = map;
            this.f95483i = str;
            this.f95484j = str2;
            this.f95485k = str3;
            this.f95486l = str4;
            this.f95487m = z13;
            this.f95488n = num;
            this.f95489o = num2;
            this.f95490p = config;
        }

        /* renamed from: a */
        public final ComplexAds.Config m100739a() {
            return this.f95490p;
        }

        /* renamed from: b */
        public final String m100740b() {
            return this.f95485k;
        }

        /* renamed from: c */
        public final Integer m100741c() {
            return this.f95488n;
        }

        /* renamed from: d */
        public final boolean m100742d() {
            return this.f95487m;
        }

        /* renamed from: e */
        public final String m100743e() {
            return this.f95486l;
        }

        /* renamed from: f */
        public final boolean m100744f() {
            return this.f95481g;
        }

        /* renamed from: g */
        public final int m100745g() {
            return this.f95479e;
        }

        /* renamed from: h */
        public final String m100746h() {
            return this.f95483i;
        }

        /* renamed from: i */
        public final String m100747i() {
            return this.f95484j;
        }

        /* renamed from: j */
        public final int m100748j() {
            return this.f95478d;
        }

        /* renamed from: k */
        public final Map m100749k() {
            return this.f95482h;
        }

        /* renamed from: l */
        public final Integer m100750l() {
            return this.f95489o;
        }

        /* renamed from: m */
        public final long m100751m() {
            return this.f95476b;
        }

        /* renamed from: n */
        public final Video m100752n() {
            return this.f95475a;
        }

        /* renamed from: o */
        public final int m100753o() {
            return this.f95477c;
        }

        /* renamed from: p */
        public final boolean m100754p() {
            return this.f95480f;
        }

        /* renamed from: q */
        public final void m100755q(ComplexAds.Config config) {
            this.f95490p = config;
        }

        /* renamed from: r */
        public final void m100756r(Integer num) {
            this.f95488n = num;
        }

        /* renamed from: s */
        public final void m100757s(Integer num) {
            this.f95489o = num;
        }

        public /* synthetic */ c(Video video, long j11, int i11, int i12, int i13, boolean z11, boolean z12, Map map, String str, String str2, String str3, String str4, boolean z13, Integer num, Integer num2, ComplexAds.Config config, int i14, AbstractC19060k abstractC19060k) {
            this(video, j11, i11, i12, i13, z11, z12, map, str, str2, str3, str4, z13, num, (i14 & 16384) != 0 ? null : num2, (i14 & 32768) != 0 ? null : config);
        }
    }

    /* renamed from: g20.a$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a */
        private final LivestreamData f95491a;

        /* renamed from: b */
        private final long f95492b;

        /* renamed from: c */
        private final int f95493c;

        /* renamed from: d */
        private final long f95494d;

        /* renamed from: e */
        private final long f95495e;

        /* renamed from: f */
        private final boolean f95496f;

        /* renamed from: g */
        private final Map f95497g;

        public d(LivestreamData livestreamData, long j11, int i11, long j12, long j13, boolean z11, Map map) {
            AbstractC19074t.m100208f(livestreamData, "stream");
            this.f95491a = livestreamData;
            this.f95492b = j11;
            this.f95493c = i11;
            this.f95494d = j12;
            this.f95495e = j13;
            this.f95496f = z11;
            this.f95497g = map;
        }

        /* renamed from: a */
        public final long m100758a() {
            return this.f95495e;
        }

        /* renamed from: b */
        public final Map m100759b() {
            return this.f95497g;
        }

        /* renamed from: c */
        public final long m100760c() {
            return this.f95494d;
        }

        /* renamed from: d */
        public final LivestreamData m100761d() {
            return this.f95491a;
        }

        /* renamed from: e */
        public final long m100762e() {
            return this.f95492b;
        }

        /* renamed from: f */
        public final int m100763f() {
            return this.f95493c;
        }

        /* renamed from: g */
        public final boolean m100764g() {
            return this.f95496f;
        }
    }

    /* renamed from: g20.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95498t;

        /* renamed from: u */
        Object f95499u;

        /* renamed from: v */
        Object f95500v;

        /* renamed from: w */
        int f95501w;

        /* renamed from: x */
        private /* synthetic */ Object f95502x;

        /* renamed from: y */
        final /* synthetic */ Map f95503y;

        /* renamed from: z */
        final /* synthetic */ String f95504z;

        /* renamed from: g20.a$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95505t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95506u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95507v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95508w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95506u = interfaceC18170g;
                this.f95507v = jSONArray;
                this.f95508w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95506u, this.f95507v, this.f95508w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95505t;
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
                    InterfaceC18170g interfaceC18170g = this.f95506u;
                    String jSONArray = this.f95507v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95466r;
                    this.f95505t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log event " + this.f95507v, new Object[0]);
                SharedPreferences.Editor edit = this.f95508w.edit();
                edit.putInt("ZCH_LOG_EVENT_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95505t = 2;
                if (interfaceC30248b.mo50561m(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Map map, String str, Continuation continuation) {
            super(2, continuation);
            this.f95503y = map;
            this.f95504z = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(this.f95503y, this.f95504z, continuation);
            eVar.f95502x = obj;
            return eVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:2|(1:(1:(1:(1:(6:8|9|10|11|12|13)(2:19|20))(11:21|22|23|24|25|26|(5:28|(9:31|(6:36|37|(1:39)|40|(2:42|43)(1:45)|44)|46|37|(0)|40|(0)(0)|44|29)|47|48|(1:50))|52|11|12|13))(8:63|64|65|66|67|(1:69)(4:75|(2:78|76)|79|80)|70|(1:72)(8:73|25|26|(0)|52|11|12|13)))(1:85))(2:93|(1:95)(1:96))|86|87|(1:89)(5:90|67|(0)(0)|70|(0)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01c4, code lost:            r0 = e;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x014f A[Catch: all -> 0x004b, Exception -> 0x0183, TryCatch #4 {all -> 0x004b, blocks: (B:23:0x0045, B:26:0x012f, B:28:0x014f, B:29:0x0160, B:31:0x0166, B:33:0x0172, B:36:0x0179, B:37:0x018f, B:39:0x0195, B:40:0x019a, B:42:0x01a0, B:44:0x01a5, B:46:0x0186, B:48:0x01a9), top: B:22:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0195 A[Catch: all -> 0x004b, Exception -> 0x0183, TryCatch #4 {all -> 0x004b, blocks: (B:23:0x0045, B:26:0x012f, B:28:0x014f, B:29:0x0160, B:31:0x0166, B:33:0x0172, B:36:0x0179, B:37:0x018f, B:39:0x0195, B:40:0x019a, B:42:0x01a0, B:44:0x01a5, B:46:0x0186, B:48:0x01a9), top: B:22:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01a0 A[Catch: all -> 0x004b, Exception -> 0x0183, TryCatch #4 {all -> 0x004b, blocks: (B:23:0x0045, B:26:0x012f, B:28:0x014f, B:29:0x0160, B:31:0x0166, B:33:0x0172, B:36:0x0179, B:37:0x018f, B:39:0x0195, B:40:0x019a, B:42:0x01a0, B:44:0x01a5, B:46:0x0186, B:48:0x01a9), top: B:22:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x012b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00dd A[Catch: all -> 0x006c, Exception -> 0x0070, TryCatch #8 {Exception -> 0x0070, all -> 0x006c, blocks: (B:65:0x0064, B:67:0x00d1, B:70:0x0105, B:75:0x00dd, B:76:0x00ec, B:78:0x00f2, B:80:0x0101), top: B:64:0x0064 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v23, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Map map;
            String str;
            CoroutineScope coroutineScope;
            Mutex mutex;
            Object mo50558j;
            Mutex mutex2;
            String str2;
            Map map2;
            CoroutineScope coroutineScope2;
            CoroutineScope coroutineScope3;
            JSONObject m100673F;
            String jSONObject;
            List m131187O0;
            InterfaceC30248b interfaceC30248b;
            Mutex mutex3;
            JSONObject jSONObject2;
            List<LogEvent> m100674J;
            JSONObject jSONObject3;
            String m50583a;
            String m50585c;
            m142578e = AbstractC28298d.m142578e();
            ?? r22 = this.f95501w;
            try {
                if (r22 != 0) {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            if (r22 != 3) {
                                if (r22 == 4) {
                                    mutex = (Mutex) this.f95498t;
                                    coroutineScope3 = (CoroutineScope) this.f95502x;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                        r22 = mutex;
                                    } catch (Exception e11) {
                                        e = e11;
                                        AbstractC20110a.f98889a.mo104548a("zch log video event Exception:" + e.getMessage(), new Object[0]);
                                        r22 = mutex;
                                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        r22.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                    CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                    r22.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m131187O0 = (List) this.f95500v;
                            jSONObject2 = (JSONObject) this.f95499u;
                            mutex3 = (Mutex) this.f95498t;
                            coroutineScope = (CoroutineScope) this.f95502x;
                            try {
                                try {
                                    AbstractC24862s.m129228b(obj);
                                    coroutineScope3 = coroutineScope;
                                    try {
                                        SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                        m100674J = C19205a.f95429a.m100674J(m131187O0, m55587A.getInt("ZCH_LOG_EVENT_BATCH", 1));
                                        if (!m100674J.isEmpty()) {
                                            InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                            JSONArray jSONArray = new JSONArray();
                                            for (LogEvent logEvent : m100674J) {
                                                String m50584b = logEvent.m50584b();
                                                if (m50584b != null && m50584b.length() != 0) {
                                                    jSONObject3 = new JSONObject(logEvent.m50584b());
                                                    m50583a = logEvent.m50583a();
                                                    if (m50583a != null) {
                                                        jSONObject3.put("action_key", m50583a);
                                                    }
                                                    m50585c = logEvent.m50585c();
                                                    if (m50585c == null) {
                                                        jSONObject3.put("ext_data", m50585c);
                                                    }
                                                    jSONArray.put(jSONObject3);
                                                }
                                                jSONObject3 = new JSONObject(jSONObject2.toString());
                                                m50583a = logEvent.m50583a();
                                                if (m50583a != null) {
                                                }
                                                m50585c = logEvent.m50585c();
                                                if (m50585c == null) {
                                                }
                                                jSONArray.put(jSONObject3);
                                            }
                                            a aVar = new a(m143667D, jSONArray, m55587A, null);
                                            this.f95502x = coroutineScope3;
                                            this.f95498t = mutex3;
                                            this.f95499u = null;
                                            this.f95500v = null;
                                            this.f95501w = 4;
                                            if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                                return m142578e;
                                            }
                                        }
                                        r22 = mutex3;
                                    } catch (Exception e12) {
                                        e = e12;
                                        mutex = mutex3;
                                        AbstractC20110a.f98889a.mo104548a("zch log video event Exception:" + e.getMessage(), new Object[0]);
                                        r22 = mutex;
                                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                        C24848g0 c24848g022 = C24848g0.f119245a;
                                        r22.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r22 = mutex3;
                                    r22.mo113890c(null);
                                    throw th;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                mutex = mutex3;
                                coroutineScope3 = coroutineScope;
                                AbstractC20110a.f98889a.mo104548a("zch log video event Exception:" + e.getMessage(), new Object[0]);
                                r22 = mutex;
                                CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                C24848g0 c24848g0222 = C24848g0.f119245a;
                                r22.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                            C24848g0 c24848g02222 = C24848g0.f119245a;
                            r22.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        str2 = (String) this.f95500v;
                        Map map3 = (Map) this.f95499u;
                        mutex2 = (Mutex) this.f95498t;
                        coroutineScope2 = (CoroutineScope) this.f95502x;
                        try {
                            AbstractC24862s.m129228b(obj);
                            map2 = map3;
                            mo50558j = obj;
                            List list = (List) mo50558j;
                            m100673F = C19205a.f95429a.m100673F();
                            if (map2 != null) {
                                jSONObject = null;
                            } else {
                                JSONObject jSONObject4 = new JSONObject();
                                for (String str3 : map2.keySet()) {
                                    jSONObject4.put(str3, map2.get(str3));
                                }
                                jSONObject = jSONObject4.toString();
                            }
                            LogEvent logEvent2 = new LogEvent(str2, jSONObject, m100673F.toString());
                            m131187O0 = AbstractC25332a0.m131187O0(list);
                            m131187O0.add(0, logEvent2);
                            interfaceC30248b = C19205a.f95436h;
                            this.f95502x = coroutineScope2;
                            this.f95498t = mutex2;
                            this.f95499u = m100673F;
                            this.f95500v = m131187O0;
                            this.f95501w = 3;
                        } catch (Exception e14) {
                            e = e14;
                            mutex = mutex2;
                            coroutineScope3 = coroutineScope2;
                            AbstractC20110a.f98889a.mo104548a("zch log video event Exception:" + e.getMessage(), new Object[0]);
                            r22 = mutex;
                            CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                            C24848g0 c24848g022222 = C24848g0.f119245a;
                            r22.mo113890c(null);
                            return C24848g0.f119245a;
                        } catch (Throwable th3) {
                            th = th3;
                            r22 = mutex2;
                            r22.mo113890c(null);
                            throw th;
                        }
                        if (interfaceC30248b.mo50561m(m131187O0, this) != m142578e) {
                            return m142578e;
                        }
                        mutex3 = mutex2;
                        coroutineScope3 = coroutineScope2;
                        jSONObject2 = m100673F;
                        SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                        m100674J = C19205a.f95429a.m100674J(m131187O0, m55587A2.getInt("ZCH_LOG_EVENT_BATCH", 1));
                        if (!m100674J.isEmpty()) {
                        }
                        r22 = mutex3;
                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                        C24848g0 c24848g0222222 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                    }
                    String str4 = (String) this.f95500v;
                    Map map4 = (Map) this.f95499u;
                    Mutex mutex4 = (Mutex) this.f95498t;
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.f95502x;
                    AbstractC24862s.m129228b(obj);
                    str = str4;
                    mutex = mutex4;
                    map = map4;
                    coroutineScope = coroutineScope4;
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.f95502x;
                    Mutex mutex5 = C19205a.f95441m;
                    map = this.f95503y;
                    str = this.f95504z;
                    this.f95502x = coroutineScope5;
                    this.f95498t = mutex5;
                    this.f95499u = map;
                    this.f95500v = str;
                    this.f95501w = 1;
                    if (mutex5.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope5;
                    mutex = mutex5;
                }
                InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                this.f95502x = coroutineScope;
                this.f95498t = mutex;
                this.f95499u = map;
                this.f95500v = str;
                this.f95501w = 2;
                mo50558j = interfaceC30248b2.mo50558j(this);
                if (mo50558j == m142578e) {
                    return m142578e;
                }
                CoroutineScope coroutineScope6 = coroutineScope;
                mutex2 = mutex;
                str2 = str;
                map2 = map;
                coroutineScope2 = coroutineScope6;
                List list2 = (List) mo50558j;
                m100673F = C19205a.f95429a.m100673F();
                if (map2 != null) {
                }
                LogEvent logEvent22 = new LogEvent(str2, jSONObject, m100673F.toString());
                m131187O0 = AbstractC25332a0.m131187O0(list2);
                m131187O0.add(0, logEvent22);
                interfaceC30248b = C19205a.f95436h;
                this.f95502x = coroutineScope2;
                this.f95498t = mutex2;
                this.f95499u = m100673F;
                this.f95500v = m131187O0;
                this.f95501w = 3;
                if (interfaceC30248b.mo50561m(m131187O0, this) != m142578e) {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: g20.a$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95509t;

        /* renamed from: u */
        Object f95510u;

        /* renamed from: v */
        Object f95511v;

        /* renamed from: w */
        int f95512w;

        /* renamed from: x */
        private /* synthetic */ Object f95513x;

        /* renamed from: y */
        final /* synthetic */ Map f95514y;

        /* renamed from: z */
        final /* synthetic */ String f95515z;

        /* renamed from: g20.a$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95516t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95517u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95518v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95519w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95517u = interfaceC18170g;
                this.f95518v = jSONArray;
                this.f95519w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95517u, this.f95518v, this.f95519w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95516t;
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
                    InterfaceC18170g interfaceC18170g = this.f95517u;
                    String jSONArray = this.f95518v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95471w;
                    this.f95516t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log event ads " + this.f95518v, new Object[0]);
                SharedPreferences.Editor edit = this.f95519w.edit();
                edit.putInt("LOG_EVENT_ADS_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95516t = 2;
                if (interfaceC30248b.mo50545H(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Map map, String str, Continuation continuation) {
            super(2, continuation);
            this.f95514y = map;
            this.f95515z = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            f fVar = new f(this.f95514y, this.f95515z, continuation);
            fVar.f95513x = obj;
            return fVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:2|(1:(1:(1:(1:(6:8|9|10|11|12|13)(2:19|20))(11:21|22|23|24|25|26|(5:28|(9:31|(6:36|37|(1:39)|40|(2:42|43)(1:45)|44)|46|37|(0)|40|(0)(0)|44|29)|47|48|(1:50))|52|11|12|13))(8:63|64|65|66|67|(1:69)(4:75|(2:78|76)|79|80)|70|(1:72)(8:73|25|26|(0)|52|11|12|13)))(1:85))(2:93|(1:95)(1:96))|86|87|(1:89)(5:90|67|(0)(0)|70|(0)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x01c4, code lost:            r0 = e;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x014f A[Catch: all -> 0x004b, Exception -> 0x0183, TryCatch #4 {all -> 0x004b, blocks: (B:23:0x0045, B:26:0x012f, B:28:0x014f, B:29:0x0160, B:31:0x0166, B:33:0x0172, B:36:0x0179, B:37:0x018f, B:39:0x0195, B:40:0x019a, B:42:0x01a0, B:44:0x01a5, B:46:0x0186, B:48:0x01a9), top: B:22:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0195 A[Catch: all -> 0x004b, Exception -> 0x0183, TryCatch #4 {all -> 0x004b, blocks: (B:23:0x0045, B:26:0x012f, B:28:0x014f, B:29:0x0160, B:31:0x0166, B:33:0x0172, B:36:0x0179, B:37:0x018f, B:39:0x0195, B:40:0x019a, B:42:0x01a0, B:44:0x01a5, B:46:0x0186, B:48:0x01a9), top: B:22:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01a0 A[Catch: all -> 0x004b, Exception -> 0x0183, TryCatch #4 {all -> 0x004b, blocks: (B:23:0x0045, B:26:0x012f, B:28:0x014f, B:29:0x0160, B:31:0x0166, B:33:0x0172, B:36:0x0179, B:37:0x018f, B:39:0x0195, B:40:0x019a, B:42:0x01a0, B:44:0x01a5, B:46:0x0186, B:48:0x01a9), top: B:22:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01a5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x012b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00dd A[Catch: all -> 0x006c, Exception -> 0x0070, TryCatch #8 {Exception -> 0x0070, all -> 0x006c, blocks: (B:65:0x0064, B:67:0x00d1, B:70:0x0105, B:75:0x00dd, B:76:0x00ec, B:78:0x00f2, B:80:0x0101), top: B:64:0x0064 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v23, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v8 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Map map;
            String str;
            CoroutineScope coroutineScope;
            Mutex mutex;
            Object mo50559k;
            Mutex mutex2;
            String str2;
            Map map2;
            CoroutineScope coroutineScope2;
            CoroutineScope coroutineScope3;
            JSONObject m100673F;
            String jSONObject;
            List m131187O0;
            InterfaceC30248b interfaceC30248b;
            Mutex mutex3;
            JSONObject jSONObject2;
            List<LogEvent> m100674J;
            JSONObject jSONObject3;
            String m50583a;
            String m50585c;
            m142578e = AbstractC28298d.m142578e();
            ?? r22 = this.f95512w;
            try {
                if (r22 != 0) {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            if (r22 != 3) {
                                if (r22 == 4) {
                                    mutex = (Mutex) this.f95509t;
                                    coroutineScope3 = (CoroutineScope) this.f95513x;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                        r22 = mutex;
                                    } catch (Exception e11) {
                                        e = e11;
                                        AbstractC20110a.f98889a.mo104548a("zch log video event ads Exception:" + e.getMessage(), new Object[0]);
                                        r22 = mutex;
                                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        r22.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                    CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                    r22.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m131187O0 = (List) this.f95511v;
                            jSONObject2 = (JSONObject) this.f95510u;
                            mutex3 = (Mutex) this.f95509t;
                            coroutineScope = (CoroutineScope) this.f95513x;
                            try {
                                try {
                                    AbstractC24862s.m129228b(obj);
                                    coroutineScope3 = coroutineScope;
                                    try {
                                        SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                        m100674J = C19205a.f95429a.m100674J(m131187O0, m55587A.getInt("LOG_EVENT_ADS_BATCH", 1));
                                        if (!m100674J.isEmpty()) {
                                            InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                            JSONArray jSONArray = new JSONArray();
                                            for (LogEvent logEvent : m100674J) {
                                                String m50584b = logEvent.m50584b();
                                                if (m50584b != null && m50584b.length() != 0) {
                                                    jSONObject3 = new JSONObject(logEvent.m50584b());
                                                    m50583a = logEvent.m50583a();
                                                    if (m50583a != null) {
                                                        jSONObject3.put("action_key", m50583a);
                                                    }
                                                    m50585c = logEvent.m50585c();
                                                    if (m50585c == null) {
                                                        jSONObject3.put("ext_data", m50585c);
                                                    }
                                                    jSONArray.put(jSONObject3);
                                                }
                                                jSONObject3 = new JSONObject(jSONObject2.toString());
                                                m50583a = logEvent.m50583a();
                                                if (m50583a != null) {
                                                }
                                                m50585c = logEvent.m50585c();
                                                if (m50585c == null) {
                                                }
                                                jSONArray.put(jSONObject3);
                                            }
                                            a aVar = new a(m143667D, jSONArray, m55587A, null);
                                            this.f95513x = coroutineScope3;
                                            this.f95509t = mutex3;
                                            this.f95510u = null;
                                            this.f95511v = null;
                                            this.f95512w = 4;
                                            if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                                return m142578e;
                                            }
                                        }
                                        r22 = mutex3;
                                    } catch (Exception e12) {
                                        e = e12;
                                        mutex = mutex3;
                                        AbstractC20110a.f98889a.mo104548a("zch log video event ads Exception:" + e.getMessage(), new Object[0]);
                                        r22 = mutex;
                                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                        C24848g0 c24848g022 = C24848g0.f119245a;
                                        r22.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r22 = mutex3;
                                    r22.mo113890c(null);
                                    throw th;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                mutex = mutex3;
                                coroutineScope3 = coroutineScope;
                                AbstractC20110a.f98889a.mo104548a("zch log video event ads Exception:" + e.getMessage(), new Object[0]);
                                r22 = mutex;
                                CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                C24848g0 c24848g0222 = C24848g0.f119245a;
                                r22.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                            C24848g0 c24848g02222 = C24848g0.f119245a;
                            r22.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        str2 = (String) this.f95511v;
                        Map map3 = (Map) this.f95510u;
                        mutex2 = (Mutex) this.f95509t;
                        coroutineScope2 = (CoroutineScope) this.f95513x;
                        try {
                            AbstractC24862s.m129228b(obj);
                            map2 = map3;
                            mo50559k = obj;
                            List list = (List) mo50559k;
                            m100673F = C19205a.f95429a.m100673F();
                            if (map2 != null) {
                                jSONObject = null;
                            } else {
                                JSONObject jSONObject4 = new JSONObject();
                                for (String str3 : map2.keySet()) {
                                    jSONObject4.put(str3, map2.get(str3));
                                }
                                jSONObject = jSONObject4.toString();
                            }
                            LogEvent logEvent2 = new LogEvent(str2, jSONObject, m100673F.toString());
                            m131187O0 = AbstractC25332a0.m131187O0(list);
                            m131187O0.add(0, logEvent2);
                            interfaceC30248b = C19205a.f95436h;
                            this.f95513x = coroutineScope2;
                            this.f95509t = mutex2;
                            this.f95510u = m100673F;
                            this.f95511v = m131187O0;
                            this.f95512w = 3;
                        } catch (Exception e14) {
                            e = e14;
                            mutex = mutex2;
                            coroutineScope3 = coroutineScope2;
                            AbstractC20110a.f98889a.mo104548a("zch log video event ads Exception:" + e.getMessage(), new Object[0]);
                            r22 = mutex;
                            CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                            C24848g0 c24848g022222 = C24848g0.f119245a;
                            r22.mo113890c(null);
                            return C24848g0.f119245a;
                        } catch (Throwable th3) {
                            th = th3;
                            r22 = mutex2;
                            r22.mo113890c(null);
                            throw th;
                        }
                        if (interfaceC30248b.mo50545H(m131187O0, this) != m142578e) {
                            return m142578e;
                        }
                        mutex3 = mutex2;
                        coroutineScope3 = coroutineScope2;
                        jSONObject2 = m100673F;
                        SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                        m100674J = C19205a.f95429a.m100674J(m131187O0, m55587A2.getInt("LOG_EVENT_ADS_BATCH", 1));
                        if (!m100674J.isEmpty()) {
                        }
                        r22 = mutex3;
                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                        C24848g0 c24848g0222222 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                    }
                    String str4 = (String) this.f95511v;
                    Map map4 = (Map) this.f95510u;
                    Mutex mutex4 = (Mutex) this.f95509t;
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.f95513x;
                    AbstractC24862s.m129228b(obj);
                    str = str4;
                    mutex = mutex4;
                    map = map4;
                    coroutineScope = coroutineScope4;
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.f95513x;
                    Mutex mutex5 = C19205a.f95446r;
                    map = this.f95514y;
                    str = this.f95515z;
                    this.f95513x = coroutineScope5;
                    this.f95509t = mutex5;
                    this.f95510u = map;
                    this.f95511v = str;
                    this.f95512w = 1;
                    if (mutex5.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope5;
                    mutex = mutex5;
                }
                InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                this.f95513x = coroutineScope;
                this.f95509t = mutex;
                this.f95510u = map;
                this.f95511v = str;
                this.f95512w = 2;
                mo50559k = interfaceC30248b2.mo50559k(this);
                if (mo50559k == m142578e) {
                    return m142578e;
                }
                CoroutineScope coroutineScope6 = coroutineScope;
                mutex2 = mutex;
                str2 = str;
                map2 = map;
                coroutineScope2 = coroutineScope6;
                List list2 = (List) mo50559k;
                m100673F = C19205a.f95429a.m100673F();
                if (map2 != null) {
                }
                LogEvent logEvent22 = new LogEvent(str2, jSONObject, m100673F.toString());
                m131187O0 = AbstractC25332a0.m131187O0(list2);
                m131187O0.add(0, logEvent22);
                interfaceC30248b = C19205a.f95436h;
                this.f95513x = coroutineScope2;
                this.f95509t = mutex2;
                this.f95510u = m100673F;
                this.f95511v = m131187O0;
                this.f95512w = 3;
                if (interfaceC30248b.mo50545H(m131187O0, this) != m142578e) {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95520t;

        /* renamed from: u */
        Object f95521u;

        /* renamed from: v */
        Object f95522v;

        /* renamed from: w */
        int f95523w;

        /* renamed from: x */
        private /* synthetic */ Object f95524x;

        /* renamed from: y */
        final /* synthetic */ Map f95525y;

        /* renamed from: z */
        final /* synthetic */ String f95526z;

        /* renamed from: g20.a$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95527t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95528u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95529v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95530w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC31140a f95531x;

            /* renamed from: y */
            final /* synthetic */ String f95532y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, InterfaceC31140a interfaceC31140a, String str, Continuation continuation) {
                super(2, continuation);
                this.f95528u = interfaceC18170g;
                this.f95529v = jSONArray;
                this.f95530w = sharedPreferences;
                this.f95531x = interfaceC31140a;
                this.f95532y = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95528u, this.f95529v, this.f95530w, this.f95531x, this.f95532y, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95527t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = this.f95528u;
                    String jSONArray = this.f95529v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95474z;
                    this.f95527t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log event " + this.f95529v, new Object[0]);
                SharedPreferences.Editor edit = this.f95530w.edit();
                edit.putInt("LOG_EVENT_STREAM_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC31140a interfaceC31140a = this.f95531x;
                String str = this.f95532y;
                m131502j = AbstractC25368s.m131502j();
                interfaceC31140a.mo151334Y(new C0040e(str, m131502j));
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Map map, String str, Continuation continuation) {
            super(2, continuation);
            this.f95525y = map;
            this.f95526z = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            g gVar = new g(this.f95525y, this.f95526z, continuation);
            gVar.f95524x = obj;
            return gVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:(1:(1:(8:5|6|7|8|9|10|11|12)(2:25|26))(1:27))(2:84|(1:86)(1:87))|28|29|(3:73|74|(7:76|32|(1:34)(4:67|(2:70|68)|71|72)|35|(1:37)(1:66)|38|(5:40|(9:43|(6:48|49|(1:51)|52|(2:54|55)(1:57)|56)|58|49|(0)|52|(0)(0)|56|41)|59|60|(1:62)(6:63|8|9|10|11|12))(5:65|9|10|11|12)))|31|32|(0)(0)|35|(0)(0)|38|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x009a, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x009b, code lost:            r2 = r7;        r4 = r9;     */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e5 A[Catch: Exception -> 0x009a, all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:29:0x006e, B:32:0x00a0, B:35:0x00da, B:37:0x00e5, B:38:0x00ed, B:40:0x011b, B:41:0x012c, B:43:0x0132, B:45:0x013e, B:48:0x0145, B:49:0x0158, B:51:0x015e, B:52:0x0163, B:54:0x0169, B:56:0x016e, B:58:0x014f, B:60:0x0173, B:66:0x00ea, B:67:0x00aa, B:68:0x00b9, B:70:0x00bf, B:72:0x00d6), top: B:28:0x006e }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x011b A[Catch: Exception -> 0x009a, all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:29:0x006e, B:32:0x00a0, B:35:0x00da, B:37:0x00e5, B:38:0x00ed, B:40:0x011b, B:41:0x012c, B:43:0x0132, B:45:0x013e, B:48:0x0145, B:49:0x0158, B:51:0x015e, B:52:0x0163, B:54:0x0169, B:56:0x016e, B:58:0x014f, B:60:0x0173, B:66:0x00ea, B:67:0x00aa, B:68:0x00b9, B:70:0x00bf, B:72:0x00d6), top: B:28:0x006e }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x015e A[Catch: Exception -> 0x009a, all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:29:0x006e, B:32:0x00a0, B:35:0x00da, B:37:0x00e5, B:38:0x00ed, B:40:0x011b, B:41:0x012c, B:43:0x0132, B:45:0x013e, B:48:0x0145, B:49:0x0158, B:51:0x015e, B:52:0x0163, B:54:0x0169, B:56:0x016e, B:58:0x014f, B:60:0x0173, B:66:0x00ea, B:67:0x00aa, B:68:0x00b9, B:70:0x00bf, B:72:0x00d6), top: B:28:0x006e }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0169 A[Catch: Exception -> 0x009a, all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:29:0x006e, B:32:0x00a0, B:35:0x00da, B:37:0x00e5, B:38:0x00ed, B:40:0x011b, B:41:0x012c, B:43:0x0132, B:45:0x013e, B:48:0x0145, B:49:0x0158, B:51:0x015e, B:52:0x0163, B:54:0x0169, B:56:0x016e, B:58:0x014f, B:60:0x0173, B:66:0x00ea, B:67:0x00aa, B:68:0x00b9, B:70:0x00bf, B:72:0x00d6), top: B:28:0x006e }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x016e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ea A[Catch: Exception -> 0x009a, all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:29:0x006e, B:32:0x00a0, B:35:0x00da, B:37:0x00e5, B:38:0x00ed, B:40:0x011b, B:41:0x012c, B:43:0x0132, B:45:0x013e, B:48:0x0145, B:49:0x0158, B:51:0x015e, B:52:0x0163, B:54:0x0169, B:56:0x016e, B:58:0x014f, B:60:0x0173, B:66:0x00ea, B:67:0x00aa, B:68:0x00b9, B:70:0x00bf, B:72:0x00d6), top: B:28:0x006e }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00aa A[Catch: Exception -> 0x009a, all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:29:0x006e, B:32:0x00a0, B:35:0x00da, B:37:0x00e5, B:38:0x00ed, B:40:0x011b, B:41:0x012c, B:43:0x0132, B:45:0x013e, B:48:0x0145, B:49:0x0158, B:51:0x015e, B:52:0x0163, B:54:0x0169, B:56:0x016e, B:58:0x014f, B:60:0x0173, B:66:0x00ea, B:67:0x00aa, B:68:0x00b9, B:70:0x00bf, B:72:0x00d6), top: B:28:0x006e }] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Mutex mutex;
            Map map;
            CoroutineScope coroutineScope;
            String str;
            Mutex mutex2;
            CoroutineScope coroutineScope2;
            Object obj2;
            List m131187O0;
            String jSONObject;
            List m131187O02;
            List<LogEvent> m100674J;
            JSONObject jSONObject2;
            String m50583a;
            String m50585c;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95523w;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            mutex2 = (Mutex) this.f95520t;
                            coroutineScope2 = (CoroutineScope) this.f95524x;
                            try {
                                AbstractC24862s.m129228b(obj);
                            } catch (Exception e11) {
                                e = e11;
                                try {
                                    AbstractC20110a.f98889a.mo104548a("zch log stream event Exception:" + e.getMessage(), new Object[0]);
                                    coroutineScope = coroutineScope2;
                                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    mutex2.mo113890c(null);
                                    return C24848g0.f119245a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = null;
                                    mutex2.mo113890c(obj2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = null;
                                mutex2.mo113890c(obj2);
                                throw th;
                            }
                            coroutineScope = coroutineScope2;
                            CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            mutex2.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f95522v;
                    Map map2 = (Map) this.f95521u;
                    Mutex mutex3 = (Mutex) this.f95520t;
                    coroutineScope = (CoroutineScope) this.f95524x;
                    AbstractC24862s.m129228b(obj);
                    map = map2;
                    mutex = mutex3;
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.f95524x;
                    mutex = C19205a.f95451w;
                    map = this.f95525y;
                    String str2 = this.f95526z;
                    this.f95524x = coroutineScope3;
                    this.f95520t = mutex;
                    this.f95521u = map;
                    this.f95522v = str2;
                    this.f95523w = 1;
                    if (mutex.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope3;
                    str = str2;
                }
                String m51234g = C27417l.f129055a.m140378b().m51234g();
                InterfaceC31140a mo50517J = ZchDataBase.Companion.m50521a().mo50517J();
                C0040e mo151327R = mo50517J.mo151327R(m51234g);
                if (mo151327R != null) {
                    try {
                        List m128a = mo151327R.m128a();
                        if (m128a != null) {
                            m131187O0 = AbstractC25332a0.m131187O0(m128a);
                            JSONObject m100673F = C19205a.f95429a.m100673F();
                            if (map != null) {
                                jSONObject = null;
                            } else {
                                JSONObject jSONObject3 = new JSONObject();
                                for (String str3 : map.keySet()) {
                                    jSONObject3.put(str3, map.get(str3));
                                }
                                jSONObject = jSONObject3.toString();
                            }
                            LogEvent logEvent = new LogEvent(str, jSONObject, m100673F.toString());
                            if (m131187O0 != null) {
                                m131187O0 = AbstractC25366r.m131496e(logEvent);
                            } else {
                                m131187O0.add(0, logEvent);
                            }
                            m131187O02 = AbstractC25332a0.m131187O0(m131187O0);
                            mo50517J.mo151334Y(new C0040e(m51234g, m131187O02));
                            SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                            m100674J = C19205a.f95429a.m100674J(m131187O02, m55587A.getInt("LOG_EVENT_STREAM_BATCH", 1));
                            if (!(!m100674J.isEmpty())) {
                                InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                JSONArray jSONArray = new JSONArray();
                                for (LogEvent logEvent2 : m100674J) {
                                    String m50584b = logEvent2.m50584b();
                                    if (m50584b != null && m50584b.length() != 0) {
                                        jSONObject2 = new JSONObject(logEvent2.m50584b());
                                        m50583a = logEvent2.m50583a();
                                        if (m50583a != null) {
                                            jSONObject2.put("action_key", m50583a);
                                        }
                                        m50585c = logEvent2.m50585c();
                                        if (m50585c == null) {
                                            jSONObject2.put("ext_data", m50585c);
                                        }
                                        jSONArray.put(jSONObject2);
                                    }
                                    jSONObject2 = new JSONObject(m100673F.toString());
                                    m50583a = logEvent2.m50583a();
                                    if (m50583a != null) {
                                    }
                                    m50585c = logEvent2.m50585c();
                                    if (m50585c == null) {
                                    }
                                    jSONArray.put(jSONObject2);
                                }
                                a aVar = new a(m143667D, jSONArray, m55587A, mo50517J, m51234g, null);
                                this.f95524x = coroutineScope;
                                this.f95520t = mutex;
                                this.f95521u = null;
                                this.f95522v = null;
                                this.f95523w = 2;
                                if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                    return m142578e;
                                }
                                mutex2 = mutex;
                                coroutineScope2 = coroutineScope;
                                coroutineScope = coroutineScope2;
                                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                                C24848g0 c24848g022 = C24848g0.f119245a;
                                mutex2.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            mutex2 = mutex;
                            CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                            C24848g0 c24848g0222 = C24848g0.f119245a;
                            mutex2.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj2 = null;
                        mutex2 = mutex;
                        mutex2.mo113890c(obj2);
                        throw th;
                    }
                }
                m131187O0 = null;
                JSONObject m100673F2 = C19205a.f95429a.m100673F();
                if (map != null) {
                }
                LogEvent logEvent3 = new LogEvent(str, jSONObject, m100673F2.toString());
                if (m131187O0 != null) {
                }
                m131187O02 = AbstractC25332a0.m131187O0(m131187O0);
                mo50517J.mo151334Y(new C0040e(m51234g, m131187O02));
                SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                m100674J = C19205a.f95429a.m100674J(m131187O02, m55587A2.getInt("LOG_EVENT_STREAM_BATCH", 1));
                if (!(!m100674J.isEmpty())) {
                }
            } catch (Throwable th5) {
                th = th5;
                mutex2 = mutex;
                obj2 = null;
                mutex2.mo113890c(obj2);
                throw th;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: g20.a$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ String f95533A;

        /* renamed from: B */
        final /* synthetic */ String f95534B;

        /* renamed from: t */
        Object f95535t;

        /* renamed from: u */
        Object f95536u;

        /* renamed from: v */
        Object f95537v;

        /* renamed from: w */
        Object f95538w;

        /* renamed from: x */
        int f95539x;

        /* renamed from: y */
        private /* synthetic */ Object f95540y;

        /* renamed from: z */
        final /* synthetic */ List f95541z;

        /* renamed from: g20.a$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95542t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95543u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95544v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95545w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95543u = interfaceC18170g;
                this.f95544v = jSONArray;
                this.f95545w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95543u, this.f95544v, this.f95545w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95542t;
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
                    InterfaceC18170g interfaceC18170g = this.f95543u;
                    String jSONArray = this.f95544v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95469u;
                    this.f95542t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log get list " + this.f95544v, new Object[0]);
                SharedPreferences.Editor edit = this.f95545w.edit();
                edit.putInt("ZCH_LOG_GET_LIST_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95542t = 2;
                if (interfaceC30248b.mo50572w(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: g20.a$h$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f95546q = new b();

            b() {
                super(1);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a */
            public final CharSequence mo205i9(Video video) {
                AbstractC19074t.m100208f(video, "it");
                return video.m52911t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(List list, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f95541z = list;
            this.f95533A = str;
            this.f95534B = str2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            h hVar = new h(this.f95541z, this.f95533A, this.f95534B, continuation);
            hVar.f95540y = obj;
            return hVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|2|(1:(6:(1:(1:(7:8|9|10|11|12|13|14)(2:20|21))(12:22|23|24|25|26|27|(5:29|(13:32|(10:37|38|(1:40)|41|(1:43)|44|(1:46)|47|(2:49|50)(1:52)|51)|53|38|(0)|41|(0)|44|(0)|47|(0)(0)|51|30)|54|55|(1:57))|59|11|12|13|14))(7:70|71|72|73|74|75|(1:77)(9:78|26|27|(0)|59|11|12|13|14))|19|11|12|13|14)(1:87))(2:95|(1:97)(1:98))|88|89|(1:91)(4:92|74|75|(0)(0))|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x01fa, code lost:            r0 = e;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x015f A[Catch: all -> 0x004b, Exception -> 0x0193, TryCatch #7 {all -> 0x004b, blocks: (B:24:0x0045, B:27:0x013e, B:29:0x015f, B:30:0x0170, B:32:0x0176, B:34:0x0182, B:37:0x0189, B:38:0x019f, B:40:0x01ac, B:41:0x01b1, B:43:0x01b7, B:44:0x01bc, B:46:0x01c2, B:47:0x01c7, B:49:0x01cd, B:51:0x01d6, B:53:0x0196, B:55:0x01da), top: B:23:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01ac A[Catch: all -> 0x004b, Exception -> 0x0193, TryCatch #7 {all -> 0x004b, blocks: (B:24:0x0045, B:27:0x013e, B:29:0x015f, B:30:0x0170, B:32:0x0176, B:34:0x0182, B:37:0x0189, B:38:0x019f, B:40:0x01ac, B:41:0x01b1, B:43:0x01b7, B:44:0x01bc, B:46:0x01c2, B:47:0x01c7, B:49:0x01cd, B:51:0x01d6, B:53:0x0196, B:55:0x01da), top: B:23:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01b7 A[Catch: all -> 0x004b, Exception -> 0x0193, TryCatch #7 {all -> 0x004b, blocks: (B:24:0x0045, B:27:0x013e, B:29:0x015f, B:30:0x0170, B:32:0x0176, B:34:0x0182, B:37:0x0189, B:38:0x019f, B:40:0x01ac, B:41:0x01b1, B:43:0x01b7, B:44:0x01bc, B:46:0x01c2, B:47:0x01c7, B:49:0x01cd, B:51:0x01d6, B:53:0x0196, B:55:0x01da), top: B:23:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01c2 A[Catch: all -> 0x004b, Exception -> 0x0193, TryCatch #7 {all -> 0x004b, blocks: (B:24:0x0045, B:27:0x013e, B:29:0x015f, B:30:0x0170, B:32:0x0176, B:34:0x0182, B:37:0x0189, B:38:0x019f, B:40:0x01ac, B:41:0x01b1, B:43:0x01b7, B:44:0x01bc, B:46:0x01c2, B:47:0x01c7, B:49:0x01cd, B:51:0x01d6, B:53:0x0196, B:55:0x01da), top: B:23:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01cd A[Catch: all -> 0x004b, Exception -> 0x0193, TryCatch #7 {all -> 0x004b, blocks: (B:24:0x0045, B:27:0x013e, B:29:0x015f, B:30:0x0170, B:32:0x0176, B:34:0x0182, B:37:0x0189, B:38:0x019f, B:40:0x01ac, B:41:0x01b1, B:43:0x01b7, B:44:0x01bc, B:46:0x01c2, B:47:0x01c7, B:49:0x01cd, B:51:0x01d6, B:53:0x0196, B:55:0x01da), top: B:23:0x0045 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01d6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0136 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v20, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List list;
            String str;
            String str2;
            CoroutineScope coroutineScope;
            Mutex mutex;
            Object mo50568s;
            CoroutineScope coroutineScope2;
            List list2;
            String str3;
            String str4;
            CoroutineScope coroutineScope3;
            JSONObject m100673F;
            String m131214n0;
            List m131187O0;
            InterfaceC30248b interfaceC30248b;
            JSONObject jSONObject;
            Mutex mutex2;
            List list3;
            List<LogGetList> m100674J;
            JSONObject jSONObject2;
            String m50588b;
            String m50591e;
            String m50589c;
            Integer m50590d;
            m142578e = AbstractC28298d.m142578e();
            ?? r22 = this.f95539x;
            try {
                if (r22 != 0) {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            if (r22 != 3) {
                                if (r22 == 4) {
                                    mutex = (Mutex) this.f95535t;
                                    coroutineScope3 = (CoroutineScope) this.f95540y;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                        r22 = mutex;
                                    } catch (Exception e11) {
                                        e = e11;
                                    }
                                    CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    r22.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list3 = (List) this.f95537v;
                            jSONObject = (JSONObject) this.f95536u;
                            mutex2 = (Mutex) this.f95535t;
                            coroutineScope = (CoroutineScope) this.f95540y;
                            try {
                                try {
                                    AbstractC24862s.m129228b(obj);
                                    coroutineScope3 = coroutineScope;
                                    try {
                                        SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                        m100674J = C19205a.f95429a.m100674J(list3, m55587A.getInt("ZCH_LOG_GET_LIST_BATCH", 1));
                                        if (!m100674J.isEmpty()) {
                                            InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                            JSONArray jSONArray = new JSONArray();
                                            for (LogGetList logGetList : m100674J) {
                                                String m50587a = logGetList.m50587a();
                                                if (m50587a != null && m50587a.length() != 0) {
                                                    jSONObject2 = new JSONObject(logGetList.m50587a());
                                                    jSONObject2.put("action_key", "get_video_list");
                                                    m50588b = logGetList.m50588b();
                                                    if (m50588b != null) {
                                                        jSONObject2.put("extra", m50588b);
                                                    }
                                                    m50591e = logGetList.m50591e();
                                                    if (m50591e != null) {
                                                        jSONObject2.put("video_ids", m50591e);
                                                    }
                                                    m50589c = logGetList.m50589c();
                                                    if (m50589c != null) {
                                                        jSONObject2.put("source", m50589c);
                                                    }
                                                    m50590d = logGetList.m50590d();
                                                    if (m50590d == null) {
                                                        jSONObject2.put("video_count", m50590d.intValue());
                                                    }
                                                    jSONArray.put(jSONObject2);
                                                }
                                                jSONObject2 = new JSONObject(jSONObject.toString());
                                                jSONObject2.put("action_key", "get_video_list");
                                                m50588b = logGetList.m50588b();
                                                if (m50588b != null) {
                                                }
                                                m50591e = logGetList.m50591e();
                                                if (m50591e != null) {
                                                }
                                                m50589c = logGetList.m50589c();
                                                if (m50589c != null) {
                                                }
                                                m50590d = logGetList.m50590d();
                                                if (m50590d == null) {
                                                }
                                                jSONArray.put(jSONObject2);
                                            }
                                            a aVar = new a(m143667D, jSONArray, m55587A, null);
                                            this.f95540y = coroutineScope3;
                                            this.f95535t = mutex2;
                                            this.f95536u = null;
                                            this.f95537v = null;
                                            this.f95539x = 4;
                                            if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                                return m142578e;
                                            }
                                        }
                                        r22 = mutex2;
                                    } catch (Exception e12) {
                                        e = e12;
                                        mutex = mutex2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r22 = mutex2;
                                    r22.mo113890c(null);
                                    throw th;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                mutex = mutex2;
                                coroutineScope3 = coroutineScope;
                                e.printStackTrace();
                                AbstractC20110a.f98889a.mo104548a("zch log get list Exception:" + e.getMessage(), new Object[0]);
                                r22 = mutex;
                                CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                r22.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                            C24848g0 c24848g022 = C24848g0.f119245a;
                            r22.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        String str5 = (String) this.f95538w;
                        String str6 = (String) this.f95537v;
                        list2 = (List) this.f95536u;
                        Mutex mutex3 = (Mutex) this.f95535t;
                        CoroutineScope coroutineScope4 = (CoroutineScope) this.f95540y;
                        try {
                            AbstractC24862s.m129228b(obj);
                            str3 = str5;
                            str4 = str6;
                            mutex = mutex3;
                            coroutineScope2 = coroutineScope4;
                            mo50568s = obj;
                            try {
                                m100673F = C19205a.f95429a.m100673F();
                                m131214n0 = AbstractC25332a0.m131214n0(list2, ",", null, null, 0, null, b.f95546q, 30, null);
                                LogGetList logGetList2 = new LogGetList(AbstractC29094b.m145341c(list2.size()), m131214n0, str4, str3, m100673F.toString());
                                m131187O0 = AbstractC25332a0.m131187O0((List) mo50568s);
                                m131187O0.add(0, logGetList2);
                                interfaceC30248b = C19205a.f95436h;
                                this.f95540y = coroutineScope2;
                                this.f95535t = mutex;
                                this.f95536u = m100673F;
                                this.f95537v = m131187O0;
                                this.f95538w = null;
                                this.f95539x = 3;
                            } catch (Exception e14) {
                                e = e14;
                                coroutineScope3 = coroutineScope2;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            mutex = mutex3;
                            coroutineScope3 = coroutineScope4;
                        } catch (Throwable th3) {
                            th = th3;
                            r22 = mutex3;
                            r22.mo113890c(null);
                            throw th;
                        }
                        if (interfaceC30248b.mo50572w(m131187O0, this) != m142578e) {
                            return m142578e;
                        }
                        jSONObject = m100673F;
                        coroutineScope3 = coroutineScope2;
                        mutex2 = mutex;
                        list3 = m131187O0;
                        SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                        m100674J = C19205a.f95429a.m100674J(list3, m55587A2.getInt("ZCH_LOG_GET_LIST_BATCH", 1));
                        if (!m100674J.isEmpty()) {
                        }
                        r22 = mutex2;
                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                        C24848g0 c24848g0222 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                        e.printStackTrace();
                        AbstractC20110a.f98889a.mo104548a("zch log get list Exception:" + e.getMessage(), new Object[0]);
                        r22 = mutex;
                        CoroutineScopeKt.m112639c(coroutineScope3, null, 1, null);
                        C24848g0 c24848g02222 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                    }
                    String str7 = (String) this.f95538w;
                    String str8 = (String) this.f95537v;
                    list = (List) this.f95536u;
                    Mutex mutex4 = (Mutex) this.f95535t;
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.f95540y;
                    AbstractC24862s.m129228b(obj);
                    str2 = str7;
                    mutex = mutex4;
                    str = str8;
                    coroutineScope = coroutineScope5;
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope6 = (CoroutineScope) this.f95540y;
                    Mutex mutex5 = C19205a.f95443o;
                    list = this.f95541z;
                    str = this.f95533A;
                    str2 = this.f95534B;
                    this.f95540y = coroutineScope6;
                    this.f95535t = mutex5;
                    this.f95536u = list;
                    this.f95537v = str;
                    this.f95538w = str2;
                    this.f95539x = 1;
                    if (mutex5.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope6;
                    mutex = mutex5;
                }
                InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                this.f95540y = coroutineScope;
                this.f95535t = mutex;
                this.f95536u = list;
                this.f95537v = str;
                this.f95538w = str2;
                this.f95539x = 2;
                mo50568s = interfaceC30248b2.mo50568s(this);
                if (mo50568s == m142578e) {
                    return m142578e;
                }
                coroutineScope2 = coroutineScope;
                list2 = list;
                str3 = str2;
                str4 = str;
                mutex = mutex;
                m100673F = C19205a.f95429a.m100673F();
                m131214n0 = AbstractC25332a0.m131214n0(list2, ",", null, null, 0, null, b.f95546q, 30, null);
                LogGetList logGetList22 = new LogGetList(AbstractC29094b.m145341c(list2.size()), m131214n0, str4, str3, m100673F.toString());
                m131187O0 = AbstractC25332a0.m131187O0((List) mo50568s);
                m131187O0.add(0, logGetList22);
                interfaceC30248b = C19205a.f95436h;
                this.f95540y = coroutineScope2;
                this.f95535t = mutex;
                this.f95536u = m100673F;
                this.f95537v = m131187O0;
                this.f95538w = null;
                this.f95539x = 3;
                if (interfaceC30248b.mo50572w(m131187O0, this) != m142578e) {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95547t;

        /* renamed from: u */
        Object f95548u;

        /* renamed from: v */
        int f95549v;

        /* renamed from: w */
        private /* synthetic */ Object f95550w;

        /* renamed from: x */
        final /* synthetic */ String f95551x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Continuation continuation) {
            super(2, continuation);
            this.f95551x = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            i iVar = new i(this.f95551x, continuation);
            iVar.f95550w = obj;
            return iVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            Mutex mutex;
            String str;
            List m131187O0;
            Set m131189Q0;
            List m131179G0;
            List m131496e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95549v;
            if (i11 != 0) {
                if (i11 == 1) {
                    str = (String) this.f95548u;
                    mutex = (Mutex) this.f95547t;
                    coroutineScope = (CoroutineScope) this.f95550w;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                coroutineScope = (CoroutineScope) this.f95550w;
                mutex = C19205a.f95449u;
                String str2 = this.f95551x;
                this.f95550w = coroutineScope;
                this.f95547t = mutex;
                this.f95548u = str2;
                this.f95549v = 1;
                if (mutex.mo113889b(null, this) == m142578e) {
                    return m142578e;
                }
                str = str2;
            }
            try {
                try {
                    String m51234g = C27417l.f129055a.m140378b().m51234g();
                    InterfaceC31140a mo50517J = ZchDataBase.Companion.m50521a().mo50517J();
                    C0043h mo151356q = mo50517J.mo151356q(m51234g);
                    if (mo151356q == null) {
                        m131496e = AbstractC25366r.m131496e(str);
                        mo50517J.mo151315F(new C0043h(m51234g, m131496e));
                    } else {
                        List m134a = mo151356q.m134a();
                        if (m134a == null) {
                            m134a = AbstractC25368s.m131502j();
                        }
                        m131187O0 = AbstractC25332a0.m131187O0(m134a);
                        m131187O0.add(0, str);
                        m131189Q0 = AbstractC25332a0.m131189Q0(m131187O0);
                        m131179G0 = AbstractC25332a0.m131179G0(m131189Q0, 200);
                        mo50517J.mo151315F(new C0043h(m51234g, m131179G0));
                    }
                } catch (Exception unused) {
                }
                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                C24848g0 c24848g0 = C24848g0.f119245a;
                mutex.mo113890c(null);
                return C24848g0.f119245a;
            } catch (Throwable th2) {
                mutex.mo113890c(null);
                throw th2;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: g20.a$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95552t;

        /* renamed from: u */
        Object f95553u;

        /* renamed from: v */
        int f95554v;

        /* renamed from: w */
        private /* synthetic */ Object f95555w;

        /* renamed from: x */
        final /* synthetic */ String f95556x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Continuation continuation) {
            super(2, continuation);
            this.f95556x = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            j jVar = new j(this.f95556x, continuation);
            jVar.f95555w = obj;
            return jVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:(1:(1:(1:(1:(6:8|9|10|11|12|13)(2:19|20))(6:21|22|23|24|25|(1:27)(4:28|11|12|13)))(9:42|43|44|45|46|47|(1:49)|25|(0)(0)))(1:55))(2:64|(1:66))|56|57|(1:59)(6:60|46|47|(0)|25|(0)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:            r9 = r1;        r1 = r11;        r11 = r0;        r0 = r9;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ee A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[RETURN] */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            ?? m142578e;
            CoroutineScope coroutineScope;
            Mutex mutex;
            String str;
            CoroutineScope coroutineScope2;
            Exception e11;
            Mutex mutex2;
            CoroutineScope coroutineScope3;
            List m131187O0;
            Set m131189Q0;
            List m131179G0;
            InterfaceC30248b interfaceC30248b;
            InterfaceC30248b interfaceC30248b2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95554v;
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    mutex2 = (Mutex) this.f95552t;
                                    coroutineScope2 = (CoroutineScope) this.f95555w;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                        m142578e = mutex2;
                                    } catch (Exception e12) {
                                        e11 = e12;
                                        e11.printStackTrace();
                                        m142578e = mutex2;
                                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                        C24848g0 c24848g0 = C24848g0.f119245a;
                                        m142578e.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                    m142578e.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str2 = (String) this.f95553u;
                            Mutex mutex3 = (Mutex) this.f95552t;
                            coroutineScope3 = (CoroutineScope) this.f95555w;
                            try {
                                AbstractC24862s.m129228b(obj);
                                str = str2;
                                mutex = mutex3;
                                interfaceC30248b2 = C19205a.f95436h;
                                this.f95555w = coroutineScope3;
                                this.f95552t = mutex;
                                this.f95553u = null;
                                this.f95554v = 4;
                            } catch (Exception e13) {
                                e11 = e13;
                                mutex2 = mutex3;
                                coroutineScope2 = coroutineScope3;
                                e11.printStackTrace();
                                m142578e = mutex2;
                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                C24848g0 c24848g022 = C24848g0.f119245a;
                                m142578e.mo113890c(null);
                                return C24848g0.f119245a;
                            } catch (Throwable th3) {
                                th = th3;
                                m142578e = mutex3;
                                m142578e.mo113890c(null);
                                throw th;
                            }
                            if (interfaceC30248b2.mo50567r(str, this) == m142578e) {
                                return m142578e;
                            }
                            m142578e = mutex;
                            coroutineScope2 = coroutineScope3;
                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                            C24848g0 c24848g0222 = C24848g0.f119245a;
                            m142578e.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        String str3 = (String) this.f95553u;
                        Mutex mutex4 = (Mutex) this.f95552t;
                        CoroutineScope coroutineScope4 = (CoroutineScope) this.f95555w;
                        try {
                            AbstractC24862s.m129228b(obj);
                            str = str3;
                            mutex = mutex4;
                            coroutineScope3 = coroutineScope4;
                        } catch (Exception e14) {
                            e11 = e14;
                            mutex2 = mutex4;
                            coroutineScope2 = coroutineScope4;
                            e11.printStackTrace();
                            m142578e = mutex2;
                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                            C24848g0 c24848g02222 = C24848g0.f119245a;
                            m142578e.mo113890c(null);
                            return C24848g0.f119245a;
                        } catch (Throwable th4) {
                            th = th4;
                            m142578e = mutex4;
                            m142578e.mo113890c(null);
                            throw th;
                        }
                        try {
                            m131187O0 = AbstractC25332a0.m131187O0((List) obj);
                            m131187O0.add(0, str);
                            m131189Q0 = AbstractC25332a0.m131189Q0(m131187O0);
                            m131179G0 = AbstractC25332a0.m131179G0(m131189Q0, 1000);
                            interfaceC30248b = C19205a.f95436h;
                            this.f95555w = coroutineScope3;
                            this.f95552t = mutex;
                            this.f95553u = str;
                            this.f95554v = 3;
                            if (interfaceC30248b.mo50553f(m131179G0, this) == m142578e) {
                                return m142578e;
                            }
                            interfaceC30248b2 = C19205a.f95436h;
                            this.f95555w = coroutineScope3;
                            this.f95552t = mutex;
                            this.f95553u = null;
                            this.f95554v = 4;
                            if (interfaceC30248b2.mo50567r(str, this) == m142578e) {
                            }
                        } catch (Exception e15) {
                            e11 = e15;
                            mutex2 = mutex;
                            coroutineScope2 = coroutineScope3;
                            e11.printStackTrace();
                            m142578e = mutex2;
                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                            C24848g0 c24848g022222 = C24848g0.f119245a;
                            m142578e.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                    } else {
                        String str4 = (String) this.f95553u;
                        Mutex mutex5 = (Mutex) this.f95552t;
                        CoroutineScope coroutineScope5 = (CoroutineScope) this.f95555w;
                        AbstractC24862s.m129228b(obj);
                        coroutineScope = coroutineScope5;
                        str = str4;
                        mutex = mutex5;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f95555w;
                    mutex = C19205a.f95440l;
                    str = this.f95556x;
                    this.f95555w = coroutineScope;
                    this.f95552t = mutex;
                    this.f95553u = str;
                    this.f95554v = 1;
                    if (mutex.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                }
                InterfaceC30248b interfaceC30248b3 = C19205a.f95436h;
                this.f95555w = coroutineScope;
                this.f95552t = mutex;
                this.f95553u = str;
                this.f95554v = 2;
                Object mo50569t = interfaceC30248b3.mo50569t(this);
                if (mo50569t == m142578e) {
                    return m142578e;
                }
                coroutineScope3 = coroutineScope;
                obj = mo50569t;
                m131187O0 = AbstractC25332a0.m131187O0((List) obj);
                m131187O0.add(0, str);
                m131189Q0 = AbstractC25332a0.m131189Q0(m131187O0);
                m131179G0 = AbstractC25332a0.m131179G0(m131189Q0, 1000);
                interfaceC30248b = C19205a.f95436h;
                this.f95555w = coroutineScope3;
                this.f95552t = mutex;
                this.f95553u = str;
                this.f95554v = 3;
                if (interfaceC30248b.mo50553f(m131179G0, this) == m142578e) {
                }
                interfaceC30248b2 = C19205a.f95436h;
                this.f95555w = coroutineScope3;
                this.f95552t = mutex;
                this.f95553u = null;
                this.f95554v = 4;
                if (interfaceC30248b2.mo50567r(str, this) == m142578e) {
                }
            } catch (Throwable th5) {
                th = th5;
                m142578e = mutex;
                m142578e.mo113890c(null);
                throw th;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: g20.a$k */
    /* loaded from: classes5.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        private /* synthetic */ Object f95557A;

        /* renamed from: B */
        final /* synthetic */ Parcelable f95558B;

        /* renamed from: C */
        final /* synthetic */ Map f95559C;

        /* renamed from: D */
        final /* synthetic */ Integer f95560D;

        /* renamed from: E */
        final /* synthetic */ String f95561E;

        /* renamed from: t */
        Object f95562t;

        /* renamed from: u */
        Object f95563u;

        /* renamed from: v */
        Object f95564v;

        /* renamed from: w */
        Object f95565w;

        /* renamed from: x */
        Object f95566x;

        /* renamed from: y */
        Object f95567y;

        /* renamed from: z */
        int f95568z;

        /* renamed from: g20.a$k$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95569t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95570u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95571v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95572w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95570u = interfaceC18170g;
                this.f95571v = jSONArray;
                this.f95572w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95570u, this.f95571v, this.f95572w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95569t;
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
                    InterfaceC18170g interfaceC18170g = this.f95570u;
                    String jSONArray = this.f95571v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95467s;
                    this.f95569t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log imps " + this.f95571v, new Object[0]);
                SharedPreferences.Editor edit = this.f95572w.edit();
                edit.putInt("ZCH_LOG_IMPS_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95569t = 2;
                if (interfaceC30248b.mo50573x(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Parcelable parcelable, Map map, Integer num, String str, Continuation continuation) {
            super(2, continuation);
            this.f95558B = parcelable;
            this.f95559C = map;
            this.f95560D = num;
            this.f95561E = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            k kVar = new k(this.f95558B, this.f95559C, this.f95560D, this.f95561E, continuation);
            kVar.f95557A = obj;
            return kVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:2|(1:(2:174|(1:(1:(1:(7:179|180|181|143|144|145|146)(2:186|187))(12:188|189|190|191|69|70|(5:72|(8:75|(5:80|81|82|(7:84|(2:86|87)|114|93|(1:95)|96|(2:98|99)(1:101))(12:115|(1:117)|118|(1:120)|121|(1:123)|124|(1:126)(1:135)|127|(1:129)|130|(2:132|133)(1:134))|100)|136|81|82|(0)(0)|100|73)|137|138|(1:140))|142|143|144|145|146))(24:197|198|199|15|16|17|(1:19)(1:166)|20|(1:22)(1:165)|(1:24)(1:164)|(17:(2:(1:28)(1:33)|(1:30))|34|(3:38|(2:41|39)|42)|(1:46)|47|48|(1:50)(1:162)|(1:52)(1:161)|(1:(1:55)(8:56|57|(1:59)(1:159)|60|(1:62)(1:158)|(1:64)(1:157)|65|(1:67)(9:68|69|70|(0)|142|143|144|145|146)))|160|57|(0)(0)|60|(0)(0)|(0)(0)|65|(0)(0))|163|48|(0)(0)|(0)(0)|(0)|160|57|(0)(0)|60|(0)(0)|(0)(0)|65|(0)(0)))(5:200|201|202|11|(1:13)(22:14|15|16|17|(0)(0)|20|(0)(0)|(0)(0)|(0)|163|48|(0)(0)|(0)(0)|(0)|160|57|(0)(0)|60|(0)(0)|(0)(0)|65|(0)(0))))(1:5))(2:205|(1:207)(1:208))|6|7|(1:9)|11|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x0394, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:173:0x0395, code lost:            r3 = r10;     */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0179, code lost:            if (r16.length() == 0) goto L304;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x008c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:141), block:B:204:0x008c */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x008d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:142), block:B:204:0x008c */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0316 A[Catch: all -> 0x0297, Exception -> 0x029b, TryCatch #10 {Exception -> 0x029b, all -> 0x0297, blocks: (B:70:0x0241, B:72:0x0263, B:73:0x0274, B:75:0x027a, B:77:0x0286, B:80:0x028d, B:81:0x02a8, B:84:0x02ba, B:86:0x02c0, B:87:0x02c4, B:89:0x02c8, B:93:0x02fa, B:95:0x0303, B:96:0x0308, B:98:0x030e, B:100:0x036d, B:102:0x02d4, B:106:0x02e0, B:110:0x02ec, B:115:0x0316, B:117:0x0321, B:118:0x0326, B:120:0x032c, B:121:0x0331, B:123:0x0337, B:124:0x033e, B:127:0x0354, B:129:0x035d, B:130:0x0362, B:132:0x0368, B:136:0x029f, B:138:0x0372), top: B:69:0x0241 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0139 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x014f A[Catch: all -> 0x0086, Exception -> 0x0153, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0086, blocks: (B:198:0x0077, B:19:0x014f, B:22:0x015d, B:28:0x016c, B:30:0x0175, B:201:0x00a8), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x015d A[Catch: all -> 0x0086, Exception -> 0x0153, TRY_ENTER, TryCatch #5 {all -> 0x0086, blocks: (B:198:0x0077, B:19:0x014f, B:22:0x015d, B:28:0x016c, B:30:0x0175, B:201:0x00a8), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01c6 A[Catch: Exception -> 0x0153, all -> 0x01a7, TryCatch #6 {all -> 0x01a7, blocks: (B:17:0x0143, B:20:0x0159, B:34:0x017c, B:36:0x0183, B:38:0x0189, B:39:0x018f, B:41:0x0195, B:44:0x01ae, B:46:0x01b4, B:47:0x01b9, B:48:0x01c2, B:50:0x01c6, B:52:0x01ce, B:55:0x01d8, B:57:0x01e1, B:59:0x01e5, B:60:0x01eb, B:62:0x01f9, B:64:0x0204, B:65:0x020d), top: B:16:0x0143 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01ce A[Catch: Exception -> 0x0153, all -> 0x01a7, TryCatch #6 {all -> 0x01a7, blocks: (B:17:0x0143, B:20:0x0159, B:34:0x017c, B:36:0x0183, B:38:0x0189, B:39:0x018f, B:41:0x0195, B:44:0x01ae, B:46:0x01b4, B:47:0x01b9, B:48:0x01c2, B:50:0x01c6, B:52:0x01ce, B:55:0x01d8, B:57:0x01e1, B:59:0x01e5, B:60:0x01eb, B:62:0x01f9, B:64:0x0204, B:65:0x020d), top: B:16:0x0143 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01e5 A[Catch: Exception -> 0x0153, all -> 0x01a7, TryCatch #6 {all -> 0x01a7, blocks: (B:17:0x0143, B:20:0x0159, B:34:0x017c, B:36:0x0183, B:38:0x0189, B:39:0x018f, B:41:0x0195, B:44:0x01ae, B:46:0x01b4, B:47:0x01b9, B:48:0x01c2, B:50:0x01c6, B:52:0x01ce, B:55:0x01d8, B:57:0x01e1, B:59:0x01e5, B:60:0x01eb, B:62:0x01f9, B:64:0x0204, B:65:0x020d), top: B:16:0x0143 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01f9 A[Catch: Exception -> 0x0153, all -> 0x01a7, TryCatch #6 {all -> 0x01a7, blocks: (B:17:0x0143, B:20:0x0159, B:34:0x017c, B:36:0x0183, B:38:0x0189, B:39:0x018f, B:41:0x0195, B:44:0x01ae, B:46:0x01b4, B:47:0x01b9, B:48:0x01c2, B:50:0x01c6, B:52:0x01ce, B:55:0x01d8, B:57:0x01e1, B:59:0x01e5, B:60:0x01eb, B:62:0x01f9, B:64:0x0204, B:65:0x020d), top: B:16:0x0143 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0204 A[Catch: Exception -> 0x0153, all -> 0x01a7, TryCatch #6 {all -> 0x01a7, blocks: (B:17:0x0143, B:20:0x0159, B:34:0x017c, B:36:0x0183, B:38:0x0189, B:39:0x018f, B:41:0x0195, B:44:0x01ae, B:46:0x01b4, B:47:0x01b9, B:48:0x01c2, B:50:0x01c6, B:52:0x01ce, B:55:0x01d8, B:57:0x01e1, B:59:0x01e5, B:60:0x01eb, B:62:0x01f9, B:64:0x0204, B:65:0x020d), top: B:16:0x0143 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x023d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0263 A[Catch: all -> 0x0297, Exception -> 0x029b, TryCatch #10 {Exception -> 0x029b, all -> 0x0297, blocks: (B:70:0x0241, B:72:0x0263, B:73:0x0274, B:75:0x027a, B:77:0x0286, B:80:0x028d, B:81:0x02a8, B:84:0x02ba, B:86:0x02c0, B:87:0x02c4, B:89:0x02c8, B:93:0x02fa, B:95:0x0303, B:96:0x0308, B:98:0x030e, B:100:0x036d, B:102:0x02d4, B:106:0x02e0, B:110:0x02ec, B:115:0x0316, B:117:0x0321, B:118:0x0326, B:120:0x032c, B:121:0x0331, B:123:0x0337, B:124:0x033e, B:127:0x0354, B:129:0x035d, B:130:0x0362, B:132:0x0368, B:136:0x029f, B:138:0x0372), top: B:69:0x0241 }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02ba A[Catch: all -> 0x0297, Exception -> 0x029b, TRY_ENTER, TryCatch #10 {Exception -> 0x029b, all -> 0x0297, blocks: (B:70:0x0241, B:72:0x0263, B:73:0x0274, B:75:0x027a, B:77:0x0286, B:80:0x028d, B:81:0x02a8, B:84:0x02ba, B:86:0x02c0, B:87:0x02c4, B:89:0x02c8, B:93:0x02fa, B:95:0x0303, B:96:0x0308, B:98:0x030e, B:100:0x036d, B:102:0x02d4, B:106:0x02e0, B:110:0x02ec, B:115:0x0316, B:117:0x0321, B:118:0x0326, B:120:0x032c, B:121:0x0331, B:123:0x0337, B:124:0x033e, B:127:0x0354, B:129:0x035d, B:130:0x0362, B:132:0x0368, B:136:0x029f, B:138:0x0372), top: B:69:0x0241 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v46 */
        /* JADX WARN: Type inference failed for: r2v47 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Object obj2;
            Mutex mutex;
            Parcelable parcelable;
            Map map;
            Integer num;
            String str;
            CoroutineScope coroutineScope;
            Mutex mutex2;
            CoroutineScope coroutineScope2;
            JSONObject jSONObject;
            Mutex mutex3;
            List list;
            List<LogImps> m100674J;
            JSONObject jSONObject2;
            String str2;
            String str3;
            Parcelable parcelable2;
            String str4;
            Mutex mutex4;
            Integer num2;
            Object obj3;
            List list2;
            Parcelable parcelable3;
            JSONObject m100673F;
            Video video;
            Channel channel;
            boolean z11;
            String str5;
            String str6;
            String str7;
            Integer num3;
            String str8;
            boolean m131196V;
            String str9;
            String str10;
            InterfaceC30248b interfaceC30248b;
            String m52904o;
            Set<String> keySet;
            String str11;
            Object obj4;
            Mutex mutex5;
            CoroutineScope coroutineScope3;
            m142578e = AbstractC28298d.m142578e();
            ?? r22 = this.f95568z;
            try {
                try {
                    if (r22 != 0) {
                        if (r22 != 1) {
                            try {
                            } catch (Exception e11) {
                                e = e11;
                                mutex2 = mutex5;
                                coroutineScope2 = coroutineScope3;
                            }
                            if (r22 != 2) {
                                if (r22 != 3) {
                                    if (r22 != 4) {
                                        if (r22 == 5) {
                                            mutex2 = (Mutex) this.f95562t;
                                            coroutineScope2 = (CoroutineScope) this.f95557A;
                                            try {
                                                AbstractC24862s.m129228b(obj);
                                                r22 = mutex2;
                                            } catch (Exception e12) {
                                                e = e12;
                                                AbstractC20110a.f98889a.mo104548a("zch log video imps Exception:" + e.getMessage(), new Object[0]);
                                                r22 = mutex2;
                                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                                C24848g0 c24848g0 = C24848g0.f119245a;
                                                r22.mo113890c(null);
                                                return C24848g0.f119245a;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj2 = null;
                                                mutex = mutex2;
                                                mutex.mo113890c(obj2);
                                                throw th;
                                            }
                                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                            C24848g0 c24848g02 = C24848g0.f119245a;
                                            r22.mo113890c(null);
                                            return C24848g0.f119245a;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    list = (List) this.f95564v;
                                    JSONObject jSONObject3 = (JSONObject) this.f95563u;
                                    mutex3 = (Mutex) this.f95562t;
                                    CoroutineScope coroutineScope4 = (CoroutineScope) this.f95557A;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                        jSONObject = jSONObject3;
                                        coroutineScope2 = coroutineScope4;
                                        try {
                                            SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                            m100674J = C19205a.f95429a.m100674J(list, m55587A.getInt("ZCH_LOG_IMPS_BATCH", 5));
                                            if (!m100674J.isEmpty()) {
                                                InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                                JSONArray jSONArray = new JSONArray();
                                                for (LogImps logImps : m100674J) {
                                                    String m50595c = logImps.m50595c();
                                                    if (m50595c != null && m50595c.length() != 0) {
                                                        jSONObject2 = new JSONObject(logImps.m50595c());
                                                        if (!AbstractC19074t.m100204b(logImps.m50602j(), AbstractC29094b.m145339a(false))) {
                                                            String m50598f = logImps.m50598f();
                                                            if (m50598f != null) {
                                                                switch (m50598f.hashCode()) {
                                                                    case -507563187:
                                                                        if (m50598f.equals("SOURCE_FOLLOWING")) {
                                                                            str3 = "following_recommend_channel_impression";
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    case 596808987:
                                                                        if (m50598f.equals("SOURCE_FOR_U")) {
                                                                            str3 = "foru_recommend_channel_impression";
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    case 1323686722:
                                                                        if (m50598f.equals("SOURCE_FRIEND")) {
                                                                            str3 = "friend_recommend_channel_impression";
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                    case 1543996371:
                                                                        if (m50598f.equals("otherChannel")) {
                                                                            str3 = "similar_channel_impression";
                                                                            break;
                                                                        } else {
                                                                            break;
                                                                        }
                                                                }
                                                            }
                                                            str3 = "recommend_channel_impression";
                                                            jSONObject2.put("action_key", str3);
                                                            String m50594b = logImps.m50594b();
                                                            if (m50594b != null) {
                                                                jSONObject2.put("recommend_channel_uid", m50594b);
                                                            }
                                                            Integer m50597e = logImps.m50597e();
                                                            if (m50597e != null) {
                                                                jSONObject2.put("list_index", m50597e.intValue());
                                                            }
                                                        } else {
                                                            jSONObject2.put("action_key", ZinstantMetaConstant.IMPRESSION_META_NAME);
                                                            String m50600h = logImps.m50600h();
                                                            if (m50600h != null) {
                                                                jSONObject2.put("video_id", m50600h);
                                                            }
                                                            String m50599g = logImps.m50599g();
                                                            if (m50599g != null) {
                                                                jSONObject2.put("source", m50599g);
                                                            }
                                                            Integer m50597e2 = logImps.m50597e();
                                                            if (m50597e2 != null) {
                                                                jSONObject2.put("list_index", m50597e2.intValue());
                                                            }
                                                            if (AbstractC19074t.m100204b(logImps.m50601i(), AbstractC29094b.m145339a(true))) {
                                                                str2 = "1";
                                                            } else {
                                                                str2 = "0";
                                                            }
                                                            jSONObject2.put("isSeen", str2);
                                                            String m50596d = logImps.m50596d();
                                                            if (m50596d != null) {
                                                                jSONObject2.put("extra", m50596d);
                                                            }
                                                            String m50593a = logImps.m50593a();
                                                            if (m50593a != null) {
                                                                jSONObject2.put("api_extra", m50593a);
                                                            }
                                                        }
                                                        jSONArray.put(jSONObject2);
                                                    }
                                                    jSONObject2 = new JSONObject(jSONObject.toString());
                                                    if (!AbstractC19074t.m100204b(logImps.m50602j(), AbstractC29094b.m145339a(false))) {
                                                    }
                                                    jSONArray.put(jSONObject2);
                                                }
                                                a aVar = new a(m143667D, jSONArray, m55587A, null);
                                                this.f95557A = coroutineScope2;
                                                this.f95562t = mutex3;
                                                this.f95563u = null;
                                                this.f95564v = null;
                                                this.f95568z = 5;
                                                if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                                    return m142578e;
                                                }
                                            }
                                            r22 = mutex3;
                                        } catch (Exception e13) {
                                            e = e13;
                                            mutex2 = mutex3;
                                            AbstractC20110a.f98889a.mo104548a("zch log video imps Exception:" + e.getMessage(), new Object[0]);
                                            r22 = mutex2;
                                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                            C24848g0 c24848g022 = C24848g0.f119245a;
                                            r22.mo113890c(null);
                                            return C24848g0.f119245a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r22 = mutex3;
                                            obj2 = null;
                                            mutex = r22;
                                            mutex.mo113890c(obj2);
                                            throw th;
                                        }
                                    } catch (Exception e14) {
                                        e = e14;
                                        mutex2 = mutex3;
                                        coroutineScope2 = coroutineScope4;
                                        AbstractC20110a.f98889a.mo104548a("zch log video imps Exception:" + e.getMessage(), new Object[0]);
                                        r22 = mutex2;
                                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                        C24848g0 c24848g0222 = C24848g0.f119245a;
                                        r22.mo113890c(null);
                                        return C24848g0.f119245a;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mutex2 = mutex3;
                                        obj2 = null;
                                        mutex = mutex2;
                                        mutex.mo113890c(obj2);
                                        throw th;
                                    }
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g02222 = C24848g0.f119245a;
                                    r22.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                list2 = (List) this.f95567y;
                                String str12 = (String) this.f95566x;
                                num2 = (Integer) this.f95565w;
                                Map map2 = (Map) this.f95564v;
                                Parcelable parcelable4 = (Parcelable) this.f95563u;
                                mutex4 = (Mutex) this.f95562t;
                                CoroutineScope coroutineScope5 = (CoroutineScope) this.f95557A;
                                AbstractC24862s.m129228b(obj);
                                str4 = str12;
                                obj3 = obj;
                                parcelable2 = parcelable4;
                                map = map2;
                                coroutineScope = coroutineScope5;
                                parcelable3 = parcelable2;
                                try {
                                    try {
                                        List list3 = (List) obj3;
                                        m100673F = C19205a.f95429a.m100673F();
                                        if (!(parcelable3 instanceof Video)) {
                                            video = (Video) parcelable3;
                                        } else {
                                            video = null;
                                        }
                                        if (!(parcelable3 instanceof Channel)) {
                                            channel = (Channel) parcelable3;
                                        } else {
                                            channel = null;
                                        }
                                        if (video == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        coroutineScope2 = coroutineScope;
                                        mutex2 = mutex4;
                                        AbstractC20110a.f98889a.mo104548a("zch log video imps Exception:" + e.getMessage(), new Object[0]);
                                        r22 = mutex2;
                                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                        C24848g0 c24848g022222 = C24848g0.f119245a;
                                        r22.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                    if (z11) {
                                        if (map == null) {
                                            if (video != null) {
                                                str11 = video.m52904o();
                                            } else {
                                                str11 = null;
                                            }
                                            if (str11 != null) {
                                            }
                                        }
                                        JSONObject jSONObject4 = new JSONObject();
                                        if (map != null && (keySet = map.keySet()) != null) {
                                            for (String str13 : keySet) {
                                                jSONObject4.put(str13, map.get(str13));
                                            }
                                        }
                                        if (video != null && (m52904o = video.m52904o()) != null) {
                                            jSONObject4.put("related_video_id", m52904o);
                                        }
                                        str5 = jSONObject4.toString();
                                        if (video != null) {
                                            str6 = video.m52911t();
                                        } else {
                                            str6 = null;
                                        }
                                        if (video != null) {
                                            str7 = video.m52858O();
                                        } else {
                                            str7 = null;
                                        }
                                        if (z11) {
                                            if (video != null) {
                                                num2 = video.m52919y();
                                            } else {
                                                num3 = null;
                                                List list4 = list3;
                                                if (video == null) {
                                                    str8 = video.m52911t();
                                                } else {
                                                    str8 = null;
                                                }
                                                m131196V = AbstractC25332a0.m131196V(list4, str8);
                                                Boolean m145339a = AbstractC29094b.m145339a(m131196V);
                                                String jSONObject5 = m100673F.toString();
                                                if (video == null) {
                                                    str9 = video.m52896k();
                                                } else {
                                                    str9 = null;
                                                }
                                                if (channel == null) {
                                                    str10 = channel.m50769l();
                                                } else {
                                                    str10 = null;
                                                }
                                                LogImps logImps2 = new LogImps(str6, str7, num3, m145339a, str5, jSONObject5, str9, str10, AbstractC29094b.m145339a(z11), str4);
                                                list = AbstractC25332a0.m131187O0(list2);
                                                list.add(0, logImps2);
                                                interfaceC30248b = C19205a.f95436h;
                                                this.f95557A = coroutineScope;
                                                this.f95562t = mutex4;
                                                this.f95563u = m100673F;
                                                this.f95564v = list;
                                                this.f95565w = null;
                                                this.f95566x = null;
                                                this.f95567y = null;
                                                this.f95568z = 4;
                                                if (interfaceC30248b.mo50573x(list, this) != m142578e) {
                                                    return m142578e;
                                                }
                                                jSONObject = m100673F;
                                                coroutineScope2 = coroutineScope;
                                                mutex3 = mutex4;
                                                SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                                                m100674J = C19205a.f95429a.m100674J(list, m55587A2.getInt("ZCH_LOG_IMPS_BATCH", 5));
                                                if (!m100674J.isEmpty()) {
                                                }
                                                r22 = mutex3;
                                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                                C24848g0 c24848g0222222 = C24848g0.f119245a;
                                                r22.mo113890c(null);
                                                return C24848g0.f119245a;
                                            }
                                        }
                                        num3 = num2;
                                        List list42 = list3;
                                        if (video == null) {
                                        }
                                        m131196V = AbstractC25332a0.m131196V(list42, str8);
                                        Boolean m145339a2 = AbstractC29094b.m145339a(m131196V);
                                        String jSONObject52 = m100673F.toString();
                                        if (video == null) {
                                        }
                                        if (channel == null) {
                                        }
                                        LogImps logImps22 = new LogImps(str6, str7, num3, m145339a2, str5, jSONObject52, str9, str10, AbstractC29094b.m145339a(z11), str4);
                                        list = AbstractC25332a0.m131187O0(list2);
                                        list.add(0, logImps22);
                                        interfaceC30248b = C19205a.f95436h;
                                        this.f95557A = coroutineScope;
                                        this.f95562t = mutex4;
                                        this.f95563u = m100673F;
                                        this.f95564v = list;
                                        this.f95565w = null;
                                        this.f95566x = null;
                                        this.f95567y = null;
                                        this.f95568z = 4;
                                        if (interfaceC30248b.mo50573x(list, this) != m142578e) {
                                        }
                                    }
                                    str5 = null;
                                    if (video != null) {
                                    }
                                    if (video != null) {
                                    }
                                    if (z11) {
                                    }
                                    num3 = num2;
                                    List list422 = list3;
                                    if (video == null) {
                                    }
                                    m131196V = AbstractC25332a0.m131196V(list422, str8);
                                    Boolean m145339a22 = AbstractC29094b.m145339a(m131196V);
                                    String jSONObject522 = m100673F.toString();
                                    if (video == null) {
                                    }
                                    if (channel == null) {
                                    }
                                    LogImps logImps222 = new LogImps(str6, str7, num3, m145339a22, str5, jSONObject522, str9, str10, AbstractC29094b.m145339a(z11), str4);
                                    list = AbstractC25332a0.m131187O0(list2);
                                    list.add(0, logImps222);
                                    interfaceC30248b = C19205a.f95436h;
                                    this.f95557A = coroutineScope;
                                    this.f95562t = mutex4;
                                    this.f95563u = m100673F;
                                    this.f95564v = list;
                                    this.f95565w = null;
                                    this.f95566x = null;
                                    this.f95567y = null;
                                    this.f95568z = 4;
                                    if (interfaceC30248b.mo50573x(list, this) != m142578e) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r22 = mutex4;
                                    obj2 = null;
                                    mutex = r22;
                                    mutex.mo113890c(obj2);
                                    throw th;
                                }
                            } else {
                                String str14 = (String) this.f95566x;
                                Integer num4 = (Integer) this.f95565w;
                                Map map3 = (Map) this.f95564v;
                                Parcelable parcelable5 = (Parcelable) this.f95563u;
                                Mutex mutex6 = (Mutex) this.f95562t;
                                CoroutineScope coroutineScope6 = (CoroutineScope) this.f95557A;
                                AbstractC24862s.m129228b(obj);
                                str = str14;
                                mutex2 = mutex6;
                                parcelable = parcelable5;
                                map = map3;
                                coroutineScope = coroutineScope6;
                                num = num4;
                                obj4 = obj;
                                List list5 = (List) obj4;
                                InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                                this.f95557A = coroutineScope;
                                this.f95562t = mutex2;
                                this.f95563u = parcelable;
                                this.f95564v = map;
                                this.f95565w = num;
                                this.f95566x = str;
                                this.f95567y = list5;
                                this.f95568z = 3;
                                obj3 = interfaceC30248b2.mo50569t(this);
                                if (obj3 != m142578e) {
                                    return m142578e;
                                }
                                str4 = str;
                                parcelable2 = parcelable;
                                mutex4 = mutex2;
                                list2 = list5;
                                num2 = num;
                                parcelable3 = parcelable2;
                                List list32 = (List) obj3;
                                m100673F = C19205a.f95429a.m100673F();
                                if (!(parcelable3 instanceof Video)) {
                                }
                                if (!(parcelable3 instanceof Channel)) {
                                }
                                if (video == null) {
                                }
                                if (z11) {
                                }
                                str5 = null;
                                if (video != null) {
                                }
                                if (video != null) {
                                }
                                if (z11) {
                                }
                                num3 = num2;
                                List list4222 = list32;
                                if (video == null) {
                                }
                                m131196V = AbstractC25332a0.m131196V(list4222, str8);
                                Boolean m145339a222 = AbstractC29094b.m145339a(m131196V);
                                String jSONObject5222 = m100673F.toString();
                                if (video == null) {
                                }
                                if (channel == null) {
                                }
                                LogImps logImps2222 = new LogImps(str6, str7, num3, m145339a222, str5, jSONObject5222, str9, str10, AbstractC29094b.m145339a(z11), str4);
                                list = AbstractC25332a0.m131187O0(list2);
                                list.add(0, logImps2222);
                                interfaceC30248b = C19205a.f95436h;
                                this.f95557A = coroutineScope;
                                this.f95562t = mutex4;
                                this.f95563u = m100673F;
                                this.f95564v = list;
                                this.f95565w = null;
                                this.f95566x = null;
                                this.f95567y = null;
                                this.f95568z = 4;
                                if (interfaceC30248b.mo50573x(list, this) != m142578e) {
                                }
                            }
                        } else {
                            String str15 = (String) this.f95566x;
                            Integer num5 = (Integer) this.f95565w;
                            map = (Map) this.f95564v;
                            parcelable = (Parcelable) this.f95563u;
                            Mutex mutex7 = (Mutex) this.f95562t;
                            CoroutineScope coroutineScope7 = (CoroutineScope) this.f95557A;
                            AbstractC24862s.m129228b(obj);
                            str = str15;
                            mutex2 = mutex7;
                            num = num5;
                            coroutineScope = coroutineScope7;
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        CoroutineScope coroutineScope8 = (CoroutineScope) this.f95557A;
                        Mutex mutex8 = C19205a.f95439k;
                        parcelable = this.f95558B;
                        map = this.f95559C;
                        num = this.f95560D;
                        str = this.f95561E;
                        this.f95557A = coroutineScope8;
                        this.f95562t = mutex8;
                        this.f95563u = parcelable;
                        this.f95564v = map;
                        this.f95565w = num;
                        this.f95566x = str;
                        this.f95568z = 1;
                        if (mutex8.mo113889b(null, this) == m142578e) {
                            return m142578e;
                        }
                        coroutineScope = coroutineScope8;
                        mutex2 = mutex8;
                    }
                    InterfaceC30248b interfaceC30248b3 = C19205a.f95436h;
                    this.f95557A = coroutineScope;
                    this.f95562t = mutex2;
                    this.f95563u = parcelable;
                    this.f95564v = map;
                    this.f95565w = num;
                    this.f95566x = str;
                    this.f95568z = 2;
                    obj4 = interfaceC30248b3.mo50549b(this);
                    mutex2 = mutex2;
                    if (obj4 == m142578e) {
                        return m142578e;
                    }
                    List list52 = (List) obj4;
                    InterfaceC30248b interfaceC30248b22 = C19205a.f95436h;
                    this.f95557A = coroutineScope;
                    this.f95562t = mutex2;
                    this.f95563u = parcelable;
                    this.f95564v = map;
                    this.f95565w = num;
                    this.f95566x = str;
                    this.f95567y = list52;
                    this.f95568z = 3;
                    obj3 = interfaceC30248b22.mo50569t(this);
                    if (obj3 != m142578e) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj2 = null;
                    mutex = mutex4;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ String f95573A;

        /* renamed from: B */
        final /* synthetic */ String f95574B;

        /* renamed from: C */
        final /* synthetic */ Integer f95575C;

        /* renamed from: D */
        final /* synthetic */ Integer f95576D;

        /* renamed from: t */
        Object f95577t;

        /* renamed from: u */
        Object f95578u;

        /* renamed from: v */
        Object f95579v;

        /* renamed from: w */
        Object f95580w;

        /* renamed from: x */
        Object f95581x;

        /* renamed from: y */
        int f95582y;

        /* renamed from: z */
        private /* synthetic */ Object f95583z;

        /* renamed from: g20.a$l$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95584t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95585u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95586v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95587w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95585u = interfaceC18170g;
                this.f95586v = jSONArray;
                this.f95587w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95585u, this.f95586v, this.f95587w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95584t;
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
                    InterfaceC18170g interfaceC18170g = this.f95585u;
                    String jSONArray = this.f95586v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95472x;
                    this.f95584t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log imps ads " + this.f95586v, new Object[0]);
                SharedPreferences.Editor edit = this.f95587w.edit();
                edit.putInt("LOG_IMPS_ADS_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95584t = 2;
                if (interfaceC30248b.mo50570u(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, Integer num, Integer num2, Continuation continuation) {
            super(2, continuation);
            this.f95573A = str;
            this.f95574B = str2;
            this.f95575C = num;
            this.f95576D = num2;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            l lVar = new l(this.f95573A, this.f95574B, this.f95575C, this.f95576D, continuation);
            lVar.f95583z = obj;
            return lVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:2|(1:(6:(1:(1:(7:8|9|10|11|12|13|14)(2:20|21))(12:22|23|24|25|26|27|(5:29|(6:32|(3:37|38|39)|40|41|39|30)|42|43|(1:45))|47|11|12|13|14))(10:58|59|60|61|62|63|64|65|66|(1:68)(9:69|26|27|(0)|47|11|12|13|14))|19|11|12|13|14)(1:81))(2:89|(1:91)(1:92))|82|83|(1:85)(7:86|62|63|64|65|66|(0)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x01f6, code lost:            r0 = e;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0164 A[Catch: all -> 0x004b, Exception -> 0x0198, TryCatch #6 {Exception -> 0x0198, blocks: (B:27:0x0143, B:29:0x0164, B:30:0x0175, B:32:0x017b, B:34:0x0187, B:37:0x018e, B:39:0x01a4, B:40:0x019b, B:43:0x01d3), top: B:26:0x0143 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x013b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v20, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Integer num;
            Integer num2;
            CoroutineScope coroutineScope;
            Mutex mutex;
            String str;
            String str2;
            Object mo50574y;
            CoroutineScope coroutineScope2;
            String str3;
            String str4;
            CoroutineScope coroutineScope3;
            CoroutineScope coroutineScope4;
            JSONObject m100673F;
            List m131187O0;
            InterfaceC30248b interfaceC30248b;
            JSONObject jSONObject;
            Mutex mutex2;
            List list;
            List<LogImpsAds> m100674J;
            JSONObject jSONObject2;
            m142578e = AbstractC28298d.m142578e();
            ?? r22 = this.f95582y;
            try {
                if (r22 != 0) {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            if (r22 != 3) {
                                if (r22 == 4) {
                                    mutex = (Mutex) this.f95577t;
                                    coroutineScope4 = (CoroutineScope) this.f95583z;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                        r22 = mutex;
                                    } catch (Exception e11) {
                                        e = e11;
                                    }
                                    CoroutineScopeKt.m112639c(coroutineScope4, null, 1, null);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    r22.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list = (List) this.f95579v;
                            jSONObject = (JSONObject) this.f95578u;
                            mutex2 = (Mutex) this.f95577t;
                            coroutineScope = (CoroutineScope) this.f95583z;
                            try {
                                try {
                                    AbstractC24862s.m129228b(obj);
                                    coroutineScope4 = coroutineScope;
                                    try {
                                        SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                        m100674J = C19205a.f95429a.m100674J(list, m55587A.getInt("LOG_IMPS_ADS_BATCH", 1));
                                        if (!m100674J.isEmpty()) {
                                            InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                            JSONArray jSONArray = new JSONArray();
                                            for (LogImpsAds logImpsAds : m100674J) {
                                                String m50607d = logImpsAds.m50607d();
                                                if (m50607d != null && m50607d.length() != 0) {
                                                    jSONObject2 = new JSONObject(logImpsAds.m50607d());
                                                    jSONObject2.put("action_key", "ad_impression");
                                                    jSONObject2.put("ad_id", logImpsAds.m50604a());
                                                    jSONObject2.put("ad_src", logImpsAds.m50606c());
                                                    jSONObject2.put("ad_index", logImpsAds.m50605b());
                                                    jSONObject2.put("num_showed_ad", logImpsAds.m50608e());
                                                    jSONArray.put(jSONObject2);
                                                }
                                                jSONObject2 = new JSONObject(jSONObject.toString());
                                                jSONObject2.put("action_key", "ad_impression");
                                                jSONObject2.put("ad_id", logImpsAds.m50604a());
                                                jSONObject2.put("ad_src", logImpsAds.m50606c());
                                                jSONObject2.put("ad_index", logImpsAds.m50605b());
                                                jSONObject2.put("num_showed_ad", logImpsAds.m50608e());
                                                jSONArray.put(jSONObject2);
                                            }
                                            a aVar = new a(m143667D, jSONArray, m55587A, null);
                                            this.f95583z = coroutineScope4;
                                            this.f95577t = mutex2;
                                            this.f95578u = null;
                                            this.f95579v = null;
                                            this.f95582y = 4;
                                            if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                                return m142578e;
                                            }
                                        }
                                        r22 = mutex2;
                                    } catch (Exception e12) {
                                        e = e12;
                                        mutex = mutex2;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r22 = mutex2;
                                    r22.mo113890c(null);
                                    throw th;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                mutex = mutex2;
                                coroutineScope4 = coroutineScope;
                                AbstractC20110a.f98889a.mo104548a("zch log video ads imps Exception:" + e.getMessage(), new Object[0]);
                                r22 = mutex;
                                CoroutineScopeKt.m112639c(coroutineScope4, null, 1, null);
                                C24848g0 c24848g02 = C24848g0.f119245a;
                                r22.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            CoroutineScopeKt.m112639c(coroutineScope4, null, 1, null);
                            C24848g0 c24848g022 = C24848g0.f119245a;
                            r22.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        Integer num3 = (Integer) this.f95581x;
                        Integer num4 = (Integer) this.f95580w;
                        String str5 = (String) this.f95579v;
                        str4 = (String) this.f95578u;
                        Mutex mutex3 = (Mutex) this.f95577t;
                        CoroutineScope coroutineScope5 = (CoroutineScope) this.f95583z;
                        try {
                            AbstractC24862s.m129228b(obj);
                            num2 = num3;
                            mutex = mutex3;
                            coroutineScope2 = coroutineScope5;
                            num = num4;
                            str3 = str5;
                            mo50574y = obj;
                            try {
                                List list2 = (List) mo50574y;
                                m100673F = C19205a.f95429a.m100673F();
                                coroutineScope3 = coroutineScope2;
                            } catch (Exception e14) {
                                e = e14;
                                coroutineScope3 = coroutineScope2;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            mutex = mutex3;
                            coroutineScope4 = coroutineScope5;
                        } catch (Throwable th3) {
                            th = th3;
                            r22 = mutex3;
                            r22.mo113890c(null);
                            throw th;
                        }
                        try {
                            LogImpsAds logImpsAds2 = new LogImpsAds(str4, str3, num, num2, (ComplexAds.Config) null, m100673F.toString(), 16, (AbstractC19060k) null);
                            m131187O0 = AbstractC25332a0.m131187O0(list2);
                            m131187O0.add(0, logImpsAds2);
                            interfaceC30248b = C19205a.f95436h;
                            this.f95583z = coroutineScope3;
                            this.f95577t = mutex;
                            this.f95578u = m100673F;
                            this.f95579v = m131187O0;
                            this.f95580w = null;
                            this.f95581x = null;
                            this.f95582y = 3;
                        } catch (Exception e16) {
                            e = e16;
                            coroutineScope4 = coroutineScope3;
                            AbstractC20110a.f98889a.mo104548a("zch log video ads imps Exception:" + e.getMessage(), new Object[0]);
                            r22 = mutex;
                            CoroutineScopeKt.m112639c(coroutineScope4, null, 1, null);
                            C24848g0 c24848g0222 = C24848g0.f119245a;
                            r22.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        if (interfaceC30248b.mo50570u(m131187O0, this) != m142578e) {
                            return m142578e;
                        }
                        jSONObject = m100673F;
                        coroutineScope4 = coroutineScope3;
                        mutex2 = mutex;
                        list = m131187O0;
                        SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                        m100674J = C19205a.f95429a.m100674J(list, m55587A2.getInt("LOG_IMPS_ADS_BATCH", 1));
                        if (!m100674J.isEmpty()) {
                        }
                        r22 = mutex2;
                        CoroutineScopeKt.m112639c(coroutineScope4, null, 1, null);
                        C24848g0 c24848g02222 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                        AbstractC20110a.f98889a.mo104548a("zch log video ads imps Exception:" + e.getMessage(), new Object[0]);
                        r22 = mutex;
                        CoroutineScopeKt.m112639c(coroutineScope4, null, 1, null);
                        C24848g0 c24848g022222 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                    }
                    Integer num5 = (Integer) this.f95581x;
                    Integer num6 = (Integer) this.f95580w;
                    str2 = (String) this.f95579v;
                    str = (String) this.f95578u;
                    Mutex mutex4 = (Mutex) this.f95577t;
                    CoroutineScope coroutineScope6 = (CoroutineScope) this.f95583z;
                    AbstractC24862s.m129228b(obj);
                    num2 = num5;
                    mutex = mutex4;
                    num = num6;
                    coroutineScope = coroutineScope6;
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope7 = (CoroutineScope) this.f95583z;
                    Mutex mutex5 = C19205a.f95447s;
                    String str6 = this.f95573A;
                    String str7 = this.f95574B;
                    num = this.f95575C;
                    num2 = this.f95576D;
                    this.f95583z = coroutineScope7;
                    this.f95577t = mutex5;
                    this.f95578u = str6;
                    this.f95579v = str7;
                    this.f95580w = num;
                    this.f95581x = num2;
                    this.f95582y = 1;
                    if (mutex5.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope7;
                    mutex = mutex5;
                    str = str6;
                    str2 = str7;
                }
                InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                this.f95583z = coroutineScope;
                this.f95577t = mutex;
                this.f95578u = str;
                this.f95579v = str2;
                this.f95580w = num;
                this.f95581x = num2;
                this.f95582y = 2;
                mo50574y = interfaceC30248b2.mo50574y(this);
                if (mo50574y == m142578e) {
                    return m142578e;
                }
                coroutineScope2 = coroutineScope;
                String str8 = str;
                str3 = str2;
                str4 = str8;
                mutex = mutex;
                List list22 = (List) mo50574y;
                m100673F = C19205a.f95429a.m100673F();
                coroutineScope3 = coroutineScope2;
                LogImpsAds logImpsAds22 = new LogImpsAds(str4, str3, num, num2, (ComplexAds.Config) null, m100673F.toString(), 16, (AbstractC19060k) null);
                m131187O0 = AbstractC25332a0.m131187O0(list22);
                m131187O0.add(0, logImpsAds22);
                interfaceC30248b = C19205a.f95436h;
                this.f95583z = coroutineScope3;
                this.f95577t = mutex;
                this.f95578u = m100673F;
                this.f95579v = m131187O0;
                this.f95580w = null;
                this.f95581x = null;
                this.f95582y = 3;
                if (interfaceC30248b.mo50570u(m131187O0, this) != m142578e) {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$m */
    /* loaded from: classes5.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95588t;

        /* renamed from: u */
        Object f95589u;

        /* renamed from: v */
        Object f95590v;

        /* renamed from: w */
        int f95591w;

        /* renamed from: x */
        private /* synthetic */ Object f95592x;

        /* renamed from: y */
        final /* synthetic */ LogUpload f95593y;

        /* renamed from: g20.a$m$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95594t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95595u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95596v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95597w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95595u = interfaceC18170g;
                this.f95596v = jSONArray;
                this.f95597w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95595u, this.f95596v, this.f95597w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95594t;
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
                    InterfaceC18170g interfaceC18170g = this.f95595u;
                    String jSONArray = this.f95596v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95465q;
                    this.f95594t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log upload " + this.f95596v, new Object[0]);
                SharedPreferences.Editor edit = this.f95597w.edit();
                edit.putInt("ZCH_LOG_UPLOAD_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95594t = 2;
                if (interfaceC30248b.mo50562n(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(LogUpload logUpload, Continuation continuation) {
            super(2, continuation);
            this.f95593y = logUpload;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            m mVar = new m(this.f95593y, continuation);
            mVar.f95592x = obj;
            return mVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:1|(1:(2:91|(1:(1:(7:95|96|97|68|69|70|71)(2:102|103))(11:104|105|106|19|20|(5:22|(23:25|(20:30|31|(1:33)|34|(1:36)|37|(1:39)|40|(1:42)|43|(1:45)|46|(1:48)|49|(1:51)|52|(1:54)|55|(2:57|58)(1:60)|59)|61|31|(0)|34|(0)|37|(0)|40|(0)|43|(0)|46|(0)|49|(0)|52|(0)|55|(0)(0)|59|23)|62|63|(1:65))|67|68|69|70|71))(9:107|108|109|11|12|13|14|15|(1:17)(9:18|19|20|(0)|67|68|69|70|71)))(1:4))(2:114|(1:116)(1:117))|5|6|(1:8)(7:10|11|12|13|14|15|(0)(0))|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x021f, code lost:            r0 = e;     */
        /* JADX WARN: Removed duplicated region for block: B:17:0x010f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0137 A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x018a A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0199 A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01a4 A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01af A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01be A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01cd A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01d8 A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01e3 A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[Catch: all -> 0x016b, Exception -> 0x0170, TryCatch #10 {Exception -> 0x0170, all -> 0x016b, blocks: (B:20:0x0117, B:22:0x0137, B:23:0x0148, B:25:0x014e, B:27:0x015a, B:30:0x0161, B:31:0x017d, B:33:0x018a, B:34:0x0193, B:36:0x0199, B:37:0x019e, B:39:0x01a4, B:40:0x01a9, B:42:0x01af, B:43:0x01b8, B:45:0x01be, B:46:0x01c7, B:48:0x01cd, B:49:0x01d2, B:51:0x01d8, B:52:0x01dd, B:54:0x01e3, B:55:0x01e8, B:57:0x01ee, B:59:0x01f3, B:61:0x0174, B:63:0x01f8), top: B:19:0x0117 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01f3 A[SYNTHETIC] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            LogUpload logUpload;
            CoroutineScope coroutineScope;
            Mutex mutex;
            Exception e11;
            CoroutineScope coroutineScope2;
            Object obj2;
            Mutex mutex2;
            JSONObject jSONObject;
            List list;
            List<LogUpload> m100674J;
            JSONObject jSONObject2;
            Integer m50632i;
            String m50635l;
            String m50634k;
            Long m50629f;
            Integer m50630g;
            String m50628e;
            String m50631h;
            String m50633j;
            String m50626c;
            CoroutineScope coroutineScope3;
            LogUpload logUpload2;
            Object obj3;
            CoroutineScope coroutineScope4;
            JSONObject m100673F;
            LogUpload m50625a;
            List m131187O0;
            InterfaceC30248b interfaceC30248b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95591w;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        try {
                        } catch (Exception e12) {
                            e11 = e12;
                            mutex = 2;
                            coroutineScope2 = coroutineScope;
                            e11.printStackTrace();
                            AbstractC20110a.f98889a.mo104548a("zch log upload Exception: " + e11.getMessage(), new Object[0]);
                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            mutex.mo113890c(null);
                            return C24848g0.f119245a;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex = 2;
                        }
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    mutex = (Mutex) this.f95588t;
                                    coroutineScope2 = (CoroutineScope) this.f95592x;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                    } catch (Exception e13) {
                                        e11 = e13;
                                        e11.printStackTrace();
                                        AbstractC20110a.f98889a.mo104548a("zch log upload Exception: " + e11.getMessage(), new Object[0]);
                                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                        C24848g0 c24848g02 = C24848g0.f119245a;
                                        mutex.mo113890c(null);
                                        return C24848g0.f119245a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj2 = null;
                                        mutex.mo113890c(obj2);
                                        throw th;
                                    }
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g022 = C24848g0.f119245a;
                                    mutex.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list = (List) this.f95590v;
                            jSONObject = (JSONObject) this.f95589u;
                            mutex2 = (Mutex) this.f95588t;
                            CoroutineScope coroutineScope5 = (CoroutineScope) this.f95592x;
                            AbstractC24862s.m129228b(obj);
                            coroutineScope2 = coroutineScope5;
                            try {
                                SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                m100674J = C19205a.f95429a.m100674J(list, m55587A.getInt("ZCH_LOG_UPLOAD_BATCH", 1));
                                if (!m100674J.isEmpty()) {
                                    InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                    JSONArray jSONArray = new JSONArray();
                                    for (LogUpload logUpload3 : m100674J) {
                                        String m50627d = logUpload3.m50627d();
                                        if (m50627d != null && m50627d.length() != 0) {
                                            jSONObject2 = new JSONObject(logUpload3.m50627d());
                                            jSONObject2.put("action_key", "upload_video");
                                            m50632i = logUpload3.m50632i();
                                            if (m50632i != null) {
                                                jSONObject2.put("video_duration", m50632i.intValue());
                                            }
                                            m50635l = logUpload3.m50635l();
                                            if (m50635l != null) {
                                                jSONObject2.put("video_size", m50635l);
                                            }
                                            m50634k = logUpload3.m50634k();
                                            if (m50634k != null) {
                                                jSONObject2.put("video_resolution", m50634k);
                                            }
                                            m50629f = logUpload3.m50629f();
                                            if (m50629f != null) {
                                                jSONObject2.put("process_time", m50629f.longValue());
                                            }
                                            m50630g = logUpload3.m50630g();
                                            if (m50630g != null) {
                                                jSONObject2.put("upload_status", m50630g.intValue());
                                            }
                                            m50628e = logUpload3.m50628e();
                                            if (m50628e != null) {
                                                jSONObject2.put("error_message", m50628e);
                                            }
                                            m50631h = logUpload3.m50631h();
                                            if (m50631h != null) {
                                                jSONObject2.put("video_description", m50631h);
                                            }
                                            m50633j = logUpload3.m50633j();
                                            if (m50633j != null) {
                                                jSONObject2.put("video_id", m50633j);
                                            }
                                            m50626c = logUpload3.m50626c();
                                            if (m50626c == null) {
                                                jSONObject2.put("deco_log", m50626c);
                                            }
                                            jSONArray.put(jSONObject2);
                                        }
                                        jSONObject2 = new JSONObject(jSONObject.toString());
                                        jSONObject2.put("action_key", "upload_video");
                                        m50632i = logUpload3.m50632i();
                                        if (m50632i != null) {
                                        }
                                        m50635l = logUpload3.m50635l();
                                        if (m50635l != null) {
                                        }
                                        m50634k = logUpload3.m50634k();
                                        if (m50634k != null) {
                                        }
                                        m50629f = logUpload3.m50629f();
                                        if (m50629f != null) {
                                        }
                                        m50630g = logUpload3.m50630g();
                                        if (m50630g != null) {
                                        }
                                        m50628e = logUpload3.m50628e();
                                        if (m50628e != null) {
                                        }
                                        m50631h = logUpload3.m50631h();
                                        if (m50631h != null) {
                                        }
                                        m50633j = logUpload3.m50633j();
                                        if (m50633j != null) {
                                        }
                                        m50626c = logUpload3.m50626c();
                                        if (m50626c == null) {
                                        }
                                        jSONArray.put(jSONObject2);
                                    }
                                    a aVar = new a(m143667D, jSONArray, m55587A, null);
                                    this.f95592x = coroutineScope2;
                                    this.f95588t = mutex2;
                                    this.f95589u = null;
                                    this.f95590v = null;
                                    this.f95591w = 4;
                                    if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                        return m142578e;
                                    }
                                }
                                mutex = mutex2;
                            } catch (Exception e14) {
                                e11 = e14;
                                mutex = mutex2;
                                e11.printStackTrace();
                                AbstractC20110a.f98889a.mo104548a("zch log upload Exception: " + e11.getMessage(), new Object[0]);
                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                C24848g0 c24848g0222 = C24848g0.f119245a;
                                mutex.mo113890c(null);
                                return C24848g0.f119245a;
                            } catch (Throwable th4) {
                                th = th4;
                                mutex = mutex2;
                                obj2 = null;
                                mutex.mo113890c(obj2);
                                throw th;
                            }
                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                            C24848g0 c24848g02222 = C24848g0.f119245a;
                            mutex.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        LogUpload logUpload4 = (LogUpload) this.f95589u;
                        Mutex mutex3 = (Mutex) this.f95588t;
                        CoroutineScope coroutineScope6 = (CoroutineScope) this.f95592x;
                        AbstractC24862s.m129228b(obj);
                        coroutineScope3 = coroutineScope6;
                        logUpload2 = logUpload4;
                        mutex = mutex3;
                        obj3 = obj;
                        try {
                            List list2 = (List) obj3;
                            m100673F = C19205a.f95429a.m100673F();
                            coroutineScope4 = coroutineScope3;
                            try {
                                m50625a = logUpload2.m50625a((r22 & 1) != 0 ? logUpload2.f49663a : null, (r22 & 2) != 0 ? logUpload2.f49664b : null, (r22 & 4) != 0 ? logUpload2.f49665c : null, (r22 & 8) != 0 ? logUpload2.f49666d : null, (r22 & 16) != 0 ? logUpload2.f49667e : null, (r22 & 32) != 0 ? logUpload2.f49668f : null, (r22 & 64) != 0 ? logUpload2.f49669g : null, (r22 & 128) != 0 ? logUpload2.f49670h : null, (r22 & 256) != 0 ? logUpload2.f49671i : null, (r22 & 512) != 0 ? logUpload2.f49672j : m100673F.toString());
                                m131187O0 = AbstractC25332a0.m131187O0(list2);
                                m131187O0.add(0, m50625a);
                                interfaceC30248b = C19205a.f95436h;
                                this.f95592x = coroutineScope4;
                                this.f95588t = mutex;
                                this.f95589u = m100673F;
                                this.f95590v = m131187O0;
                                this.f95591w = 3;
                            } catch (Exception e15) {
                                e11 = e15;
                                coroutineScope2 = coroutineScope4;
                                e11.printStackTrace();
                                AbstractC20110a.f98889a.mo104548a("zch log upload Exception: " + e11.getMessage(), new Object[0]);
                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                C24848g0 c24848g022222 = C24848g0.f119245a;
                                mutex.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                        } catch (Exception e16) {
                            e11 = e16;
                            coroutineScope4 = coroutineScope3;
                        }
                        if (interfaceC30248b.mo50562n(m131187O0, this) != m142578e) {
                            return m142578e;
                        }
                        jSONObject = m100673F;
                        coroutineScope2 = coroutineScope4;
                        mutex2 = mutex;
                        list = m131187O0;
                        SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                        m100674J = C19205a.f95429a.m100674J(list, m55587A2.getInt("ZCH_LOG_UPLOAD_BATCH", 1));
                        if (!m100674J.isEmpty()) {
                        }
                        mutex = mutex2;
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                        C24848g0 c24848g0222222 = C24848g0.f119245a;
                        mutex.mo113890c(null);
                        return C24848g0.f119245a;
                    }
                    LogUpload logUpload5 = (LogUpload) this.f95589u;
                    Mutex mutex4 = (Mutex) this.f95588t;
                    CoroutineScope coroutineScope7 = (CoroutineScope) this.f95592x;
                    AbstractC24862s.m129228b(obj);
                    logUpload = logUpload5;
                    mutex = mutex4;
                    coroutineScope = coroutineScope7;
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope8 = (CoroutineScope) this.f95592x;
                    Mutex mutex5 = C19205a.f95442n;
                    logUpload = this.f95593y;
                    this.f95592x = coroutineScope8;
                    this.f95588t = mutex5;
                    this.f95589u = logUpload;
                    this.f95591w = 1;
                    if (mutex5.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope8;
                    mutex = mutex5;
                }
                C27417l.f129055a.m140378b().m51234g();
                InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                this.f95592x = coroutineScope;
                this.f95588t = mutex;
                this.f95589u = logUpload;
                this.f95591w = 2;
                obj3 = interfaceC30248b2.mo50560l(this);
                if (obj3 == m142578e) {
                    return m142578e;
                }
                coroutineScope3 = coroutineScope;
                logUpload2 = logUpload;
                List list22 = (List) obj3;
                m100673F = C19205a.f95429a.m100673F();
                coroutineScope4 = coroutineScope3;
                m50625a = logUpload2.m50625a((r22 & 1) != 0 ? logUpload2.f49663a : null, (r22 & 2) != 0 ? logUpload2.f49664b : null, (r22 & 4) != 0 ? logUpload2.f49665c : null, (r22 & 8) != 0 ? logUpload2.f49666d : null, (r22 & 16) != 0 ? logUpload2.f49667e : null, (r22 & 32) != 0 ? logUpload2.f49668f : null, (r22 & 64) != 0 ? logUpload2.f49669g : null, (r22 & 128) != 0 ? logUpload2.f49670h : null, (r22 & 256) != 0 ? logUpload2.f49671i : null, (r22 & 512) != 0 ? logUpload2.f49672j : m100673F.toString());
                m131187O0 = AbstractC25332a0.m131187O0(list22);
                m131187O0.add(0, m50625a);
                interfaceC30248b = C19205a.f95436h;
                this.f95592x = coroutineScope4;
                this.f95588t = mutex;
                this.f95589u = m100673F;
                this.f95590v = m131187O0;
                this.f95591w = 3;
                if (interfaceC30248b.mo50562n(m131187O0, this) != m142578e) {
                }
            } catch (Throwable th5) {
                th = th5;
                obj2 = null;
                mutex.mo113890c(obj2);
                throw th;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$n */
    /* loaded from: classes5.dex */
    public static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95598t;

        /* renamed from: u */
        Object f95599u;

        /* renamed from: v */
        int f95600v;

        /* renamed from: w */
        private /* synthetic */ Object f95601w;

        /* renamed from: x */
        final /* synthetic */ d f95602x;

        /* renamed from: g20.a$n$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95603t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95604u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95605v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95606w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC31140a f95607x;

            /* renamed from: y */
            final /* synthetic */ String f95608y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, InterfaceC31140a interfaceC31140a, String str, Continuation continuation) {
                super(2, continuation);
                this.f95604u = interfaceC18170g;
                this.f95605v = jSONArray;
                this.f95606w = sharedPreferences;
                this.f95607x = interfaceC31140a;
                this.f95608y = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95604u, this.f95605v, this.f95606w, this.f95607x, this.f95608y, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95603t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = this.f95604u;
                    String jSONArray = this.f95605v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95473y;
                    this.f95603t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log view stream " + this.f95605v, new Object[0]);
                SharedPreferences.Editor edit = this.f95606w.edit();
                edit.putInt("LOG_VIEW_STREAM_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC31140a interfaceC31140a = this.f95607x;
                String str = this.f95608y;
                m131502j = AbstractC25368s.m131502j();
                interfaceC31140a.mo151332W(new C0049n(str, m131502j));
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(d dVar, Continuation continuation) {
            super(2, continuation);
            this.f95602x = dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            n nVar = new n(this.f95602x, continuation);
            nVar.f95601w = obj;
            return nVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:1|(1:(1:(8:5|6|7|8|9|10|11|12)(2:25|26))(1:27))(2:129|(1:131)(1:132))|28|29|(3:121|122|(11:124|32|(1:34)(1:120)|(1:36)|40|(8:45|(2:48|46)|49|50|51|(1:53)(1:118)|54|(5:56|(32:59|(29:64|65|(1:67)(1:109)|68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(1:82)|83|(1:85)|86|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)(1:108)|99|(1:101)|102|(2:104|105)(1:107)|106)|110|65|(0)(0)|68|(0)|71|(0)|74|(0)|77|(0)|80|(0)|83|(0)|86|87|(0)|90|(0)|93|(0)|96|(0)(0)|99|(0)|102|(0)(0)|106|57)|111|112|(1:114)(6:115|8|9|10|11|12))(5:117|9|10|11|12))|119|51|(0)(0)|54|(0)(0)))|31|32|(0)(0)|(0)|40|(9:42|45|(1:46)|49|50|51|(0)(0)|54|(0)(0))|119|51|(0)(0)|54|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x008d, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x008e, code lost:            r2 = r7;        r4 = r8;     */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0282 A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:104:0x028d A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0292 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x016b A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:120:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x0088, Exception -> 0x008d, TRY_ENTER, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[Catch: all -> 0x0088, Exception -> 0x008d, TRY_LEAVE, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[Catch: Exception -> 0x008d, all -> 0x00e7, LOOP:0: B:46:0x00cb->B:48:0x00d1, LOOP_END, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0166 A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x019c A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01f9 A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0204 A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x020f A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x021e A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x022d A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x023c A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x024d A[Catch: Exception -> 0x008d, all -> 0x00e7, TRY_ENTER, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0256 A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x025f A[Catch: Exception -> 0x008d, all -> 0x00e7, TryCatch #1 {Exception -> 0x008d, blocks: (B:29:0x0061, B:122:0x007b, B:124:0x0081, B:32:0x0093, B:34:0x0099, B:36:0x00a1, B:40:0x00a5, B:42:0x00b1, B:45:0x00b8, B:46:0x00cb, B:48:0x00d1, B:50:0x00ec, B:51:0x00f5, B:53:0x0166, B:54:0x016e, B:56:0x019c, B:57:0x01ad, B:59:0x01b3, B:61:0x01bf, B:64:0x01c6, B:65:0x01d9, B:68:0x01f0, B:70:0x01f9, B:71:0x01fe, B:73:0x0204, B:74:0x0209, B:76:0x020f, B:77:0x0218, B:79:0x021e, B:80:0x0227, B:82:0x022d, B:83:0x0236, B:85:0x023c, B:86:0x0245, B:89:0x024d, B:90:0x0250, B:92:0x0256, B:93:0x0259, B:95:0x025f, B:96:0x0264, B:99:0x0277, B:101:0x0282, B:102:0x0287, B:104:0x028d, B:106:0x0292, B:110:0x01d0, B:112:0x029a, B:118:0x016b), top: B:28:0x0061 }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0272  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Mutex mutex;
            CoroutineScope coroutineScope;
            d dVar;
            Mutex mutex2;
            CoroutineScope coroutineScope2;
            List m131187O0;
            Object obj2;
            C0043h mo151356q;
            List list;
            Map m100759b;
            String str;
            List m131187O02;
            List m100674J;
            JSONObject jSONObject;
            String str2;
            String m50642f;
            String m50638b;
            Long m50646j;
            Integer m50647k;
            Long m50645i;
            Long m50640d;
            String m50643g;
            String m50643g2;
            String m50644h;
            String str3;
            String m50641e;
            String m50637a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95600v;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            mutex2 = (Mutex) this.f95598t;
                            coroutineScope2 = (CoroutineScope) this.f95601w;
                            try {
                                AbstractC24862s.m129228b(obj);
                            } catch (Exception e11) {
                                e = e11;
                                try {
                                    AbstractC20110a.f98889a.mo104548a("zch log view stream Exception:" + e.getMessage(), new Object[0]);
                                    coroutineScope = coroutineScope2;
                                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    mutex2.mo113890c(null);
                                    return C24848g0.f119245a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = null;
                                    mutex2.mo113890c(obj2);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = null;
                                mutex2.mo113890c(obj2);
                                throw th;
                            }
                            coroutineScope = coroutineScope2;
                            CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            mutex2.mo113890c(null);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = (d) this.f95599u;
                    mutex = (Mutex) this.f95598t;
                    coroutineScope = (CoroutineScope) this.f95601w;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope3 = (CoroutineScope) this.f95601w;
                    mutex = C19205a.f95450v;
                    d dVar2 = this.f95602x;
                    this.f95601w = coroutineScope3;
                    this.f95598t = mutex;
                    this.f95599u = dVar2;
                    this.f95600v = 1;
                    if (mutex.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope3;
                    dVar = dVar2;
                }
                String m51234g = C27417l.f129055a.m140378b().m51234g();
                InterfaceC31140a mo50517J = ZchDataBase.Companion.m50521a().mo50517J();
                C0049n mo151352m = mo50517J.mo151352m(m51234g);
                if (mo151352m != null) {
                    try {
                        List m146a = mo151352m.m146a();
                        if (m146a != null) {
                            m131187O0 = AbstractC25332a0.m131187O0(m146a);
                            mo151356q = mo50517J.mo151356q(m51234g);
                            if (mo151356q == null) {
                                list = mo151356q.m134a();
                            } else {
                                list = null;
                            }
                            if (list == null) {
                                list = AbstractC25368s.m131502j();
                            }
                            JSONObject m100673F = C19205a.f95429a.m100673F();
                            m100759b = dVar.m100759b();
                            if (m100759b != null && !m100759b.isEmpty()) {
                                JSONObject jSONObject2 = new JSONObject();
                                for (String str4 : dVar.m100759b().keySet()) {
                                    jSONObject2.put(str4, dVar.m100759b().get(str4));
                                }
                                str = jSONObject2.toString();
                                LogViewStream logViewStream = new LogViewStream(dVar.m100761d().m51016f(), dVar.m100761d().m51010b().m50769l(), AbstractC29094b.m145342d(dVar.m100762e()), AbstractC29094b.m145341c(dVar.m100763f()), AbstractC29094b.m145342d(dVar.m100760c()), AbstractC29094b.m145342d(dVar.m100758a()), dVar.m100761d().m51026n(), dVar.m100761d().m51027o(), AbstractC29094b.m145339a(list.contains(dVar.m100761d().m51016f())), AbstractC29094b.m145339a(dVar.m100764g()), str, dVar.m100761d().m51014e(), m100673F.toString());
                                if (m131187O0 != null) {
                                    m131187O0 = AbstractC25366r.m131496e(logViewStream);
                                } else {
                                    m131187O0.add(0, logViewStream);
                                }
                                m131187O02 = AbstractC25332a0.m131187O0(m131187O0);
                                mo50517J.mo151332W(new C0049n(m51234g, m131187O02));
                                SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                m100674J = C19205a.f95429a.m100674J(m131187O02, m55587A.getInt("ZCH_LOG_VIEW_BATCH", 1));
                                if (!(!m100674J.isEmpty())) {
                                    InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                    JSONArray jSONArray = new JSONArray();
                                    Iterator it = m100674J.iterator();
                                    while (it.hasNext()) {
                                        LogViewStream logViewStream2 = (LogViewStream) it.next();
                                        String m50639c = logViewStream2.m50639c();
                                        if (m50639c != null && m50639c.length() != 0) {
                                            jSONObject = new JSONObject(logViewStream2.m50639c());
                                            Iterator it2 = it;
                                            if (!AbstractC19074t.m100204b(logViewStream2.m50648l(), AbstractC29094b.m145339a(true))) {
                                                str2 = "view_livestream_detail";
                                            } else {
                                                str2 = "view_livestream";
                                            }
                                            jSONObject.put("action_key", str2);
                                            m50642f = logViewStream2.m50642f();
                                            if (m50642f != null) {
                                                jSONObject.put("live_id", m50642f);
                                            }
                                            m50638b = logViewStream2.m50638b();
                                            if (m50638b != null) {
                                                jSONObject.put("seen_channel_id", m50638b);
                                            }
                                            m50646j = logViewStream2.m50646j();
                                            if (m50646j != null) {
                                                jSONObject.put("time_buffering", m50646j.longValue());
                                            }
                                            m50647k = logViewStream2.m50647k();
                                            if (m50647k != null) {
                                                jSONObject.put("watch_time", m50647k.intValue());
                                            }
                                            m50645i = logViewStream2.m50645i();
                                            if (m50645i != null) {
                                                jSONObject.put("start_time", m50645i.longValue());
                                            }
                                            m50640d = logViewStream2.m50640d();
                                            if (m50640d != null) {
                                                jSONObject.put("end_time", m50640d.longValue());
                                            }
                                            m50643g = logViewStream2.m50643g();
                                            if (m50643g != null) {
                                                jSONObject.put("source", m50643g);
                                            }
                                            m50643g2 = logViewStream2.m50643g();
                                            if (m50643g2 != null) {
                                                jSONObject.put("source", m50643g2);
                                            }
                                            m50644h = logViewStream2.m50644h();
                                            if (m50644h != null) {
                                                jSONObject.put("source_info", m50644h);
                                            }
                                            if (!AbstractC19074t.m100204b(logViewStream2.m50649m(), AbstractC29094b.m145339a(true))) {
                                                str3 = "1";
                                            } else {
                                                str3 = "0";
                                            }
                                            jSONObject.put("is_seen", str3);
                                            m50641e = logViewStream2.m50641e();
                                            if (m50641e != null) {
                                                jSONObject.put("extra", m50641e);
                                            }
                                            m50637a = logViewStream2.m50637a();
                                            if (m50637a == null) {
                                                jSONObject.put("api_extra", m50637a);
                                            }
                                            jSONArray.put(jSONObject);
                                            it = it2;
                                        }
                                        jSONObject = new JSONObject(m100673F.toString());
                                        Iterator it22 = it;
                                        if (!AbstractC19074t.m100204b(logViewStream2.m50648l(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject.put("action_key", str2);
                                        m50642f = logViewStream2.m50642f();
                                        if (m50642f != null) {
                                        }
                                        m50638b = logViewStream2.m50638b();
                                        if (m50638b != null) {
                                        }
                                        m50646j = logViewStream2.m50646j();
                                        if (m50646j != null) {
                                        }
                                        m50647k = logViewStream2.m50647k();
                                        if (m50647k != null) {
                                        }
                                        m50645i = logViewStream2.m50645i();
                                        if (m50645i != null) {
                                        }
                                        m50640d = logViewStream2.m50640d();
                                        if (m50640d != null) {
                                        }
                                        m50643g = logViewStream2.m50643g();
                                        if (m50643g != null) {
                                        }
                                        m50643g2 = logViewStream2.m50643g();
                                        if (m50643g2 != null) {
                                        }
                                        m50644h = logViewStream2.m50644h();
                                        if (m50644h != null) {
                                        }
                                        if (!AbstractC19074t.m100204b(logViewStream2.m50649m(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject.put("is_seen", str3);
                                        m50641e = logViewStream2.m50641e();
                                        if (m50641e != null) {
                                        }
                                        m50637a = logViewStream2.m50637a();
                                        if (m50637a == null) {
                                        }
                                        jSONArray.put(jSONObject);
                                        it = it22;
                                    }
                                    a aVar = new a(m143667D, jSONArray, m55587A, mo50517J, m51234g, null);
                                    this.f95601w = coroutineScope;
                                    this.f95598t = mutex;
                                    this.f95599u = null;
                                    this.f95600v = 2;
                                    if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                        return m142578e;
                                    }
                                    mutex2 = mutex;
                                    coroutineScope2 = coroutineScope;
                                    coroutineScope = coroutineScope2;
                                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                                    C24848g0 c24848g022 = C24848g0.f119245a;
                                    mutex2.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                mutex2 = mutex;
                                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                                C24848g0 c24848g0222 = C24848g0.f119245a;
                                mutex2.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            str = null;
                            LogViewStream logViewStream3 = new LogViewStream(dVar.m100761d().m51016f(), dVar.m100761d().m51010b().m50769l(), AbstractC29094b.m145342d(dVar.m100762e()), AbstractC29094b.m145341c(dVar.m100763f()), AbstractC29094b.m145342d(dVar.m100760c()), AbstractC29094b.m145342d(dVar.m100758a()), dVar.m100761d().m51026n(), dVar.m100761d().m51027o(), AbstractC29094b.m145339a(list.contains(dVar.m100761d().m51016f())), AbstractC29094b.m145339a(dVar.m100764g()), str, dVar.m100761d().m51014e(), m100673F.toString());
                            if (m131187O0 != null) {
                            }
                            m131187O02 = AbstractC25332a0.m131187O0(m131187O0);
                            mo50517J.mo151332W(new C0049n(m51234g, m131187O02));
                            SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                            m100674J = C19205a.f95429a.m100674J(m131187O02, m55587A2.getInt("ZCH_LOG_VIEW_BATCH", 1));
                            if (!(!m100674J.isEmpty())) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj2 = null;
                        mutex2 = mutex;
                        mutex2.mo113890c(obj2);
                        throw th;
                    }
                }
                m131187O0 = null;
                mo151356q = mo50517J.mo151356q(m51234g);
                if (mo151356q == null) {
                }
                if (list == null) {
                }
                JSONObject m100673F2 = C19205a.f95429a.m100673F();
                m100759b = dVar.m100759b();
                if (m100759b != null) {
                    JSONObject jSONObject22 = new JSONObject();
                    while (r13.hasNext()) {
                    }
                    str = jSONObject22.toString();
                    LogViewStream logViewStream32 = new LogViewStream(dVar.m100761d().m51016f(), dVar.m100761d().m51010b().m50769l(), AbstractC29094b.m145342d(dVar.m100762e()), AbstractC29094b.m145341c(dVar.m100763f()), AbstractC29094b.m145342d(dVar.m100760c()), AbstractC29094b.m145342d(dVar.m100758a()), dVar.m100761d().m51026n(), dVar.m100761d().m51027o(), AbstractC29094b.m145339a(list.contains(dVar.m100761d().m51016f())), AbstractC29094b.m145339a(dVar.m100764g()), str, dVar.m100761d().m51014e(), m100673F2.toString());
                    if (m131187O0 != null) {
                    }
                    m131187O02 = AbstractC25332a0.m131187O0(m131187O0);
                    mo50517J.mo151332W(new C0049n(m51234g, m131187O02));
                    SharedPreferences m55587A22 = C10631i.Companion.m55602a().m55587A();
                    m100674J = C19205a.f95429a.m100674J(m131187O02, m55587A22.getInt("ZCH_LOG_VIEW_BATCH", 1));
                    if (!(!m100674J.isEmpty())) {
                    }
                }
                str = null;
                LogViewStream logViewStream322 = new LogViewStream(dVar.m100761d().m51016f(), dVar.m100761d().m51010b().m50769l(), AbstractC29094b.m145342d(dVar.m100762e()), AbstractC29094b.m145341c(dVar.m100763f()), AbstractC29094b.m145342d(dVar.m100760c()), AbstractC29094b.m145342d(dVar.m100758a()), dVar.m100761d().m51026n(), dVar.m100761d().m51027o(), AbstractC29094b.m145339a(list.contains(dVar.m100761d().m51016f())), AbstractC29094b.m145339a(dVar.m100764g()), str, dVar.m100761d().m51014e(), m100673F2.toString());
                if (m131187O0 != null) {
                }
                m131187O02 = AbstractC25332a0.m131187O0(m131187O0);
                mo50517J.mo151332W(new C0049n(m51234g, m131187O02));
                SharedPreferences m55587A222 = C10631i.Companion.m55602a().m55587A();
                m100674J = C19205a.f95429a.m100674J(m131187O02, m55587A222.getInt("ZCH_LOG_VIEW_BATCH", 1));
                if (!(!m100674J.isEmpty())) {
                }
            } catch (Throwable th5) {
                th = th5;
                mutex2 = mutex;
                obj2 = null;
                mutex2.mo113890c(obj2);
                throw th;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$o */
    /* loaded from: classes5.dex */
    public static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95609t;

        /* renamed from: u */
        Object f95610u;

        /* renamed from: v */
        Object f95611v;

        /* renamed from: w */
        int f95612w;

        /* renamed from: x */
        private /* synthetic */ Object f95613x;

        /* renamed from: y */
        final /* synthetic */ c f95614y;

        /* renamed from: g20.a$o$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95615t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95616u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95617v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95618w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95616u = interfaceC18170g;
                this.f95617v = jSONArray;
                this.f95618w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95616u, this.f95617v, this.f95618w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95615t;
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
                    InterfaceC18170g interfaceC18170g = this.f95616u;
                    String jSONArray = this.f95617v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95464p;
                    this.f95615t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log video view " + this.f95617v, new Object[0]);
                SharedPreferences.Editor edit = this.f95618w.edit();
                edit.putInt("ZCH_LOG_VIEW_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95615t = 2;
                if (interfaceC30248b.mo50544G(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(c cVar, Continuation continuation) {
            super(2, continuation);
            this.f95614y = cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            o oVar = new o(this.f95614y, continuation);
            oVar.f95613x = obj;
            return oVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:2)|(1:(1:(1:(4:(1:(8:9|10|11|12|13|14|15|16)(2:32|33))(6:34|35|36|37|38|(5:40|(50:43|(47:48|49|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)|61|(1:63)|64|(1:66)|67|(1:69)|70|(1:72)|73|(1:75)|76|77|(1:79)(1:130)|80|(1:82)(1:129)|83|(1:85)|86|(1:88)|89|(1:91)(1:128)|92|(1:94)(1:127)|95|(1:97)|98|(1:100)|101|(1:103)|104|(1:106)(1:126)|107|(1:109)|110|(3:112|(1:114)(1:116)|115)|117|(1:125)(4:119|(1:121)|122|123)|124)|131|49|(0)|52|(0)|55|(0)|58|(0)|61|(0)|64|(0)|67|(0)|70|(0)|73|(0)|76|77|(0)(0)|80|(0)(0)|83|(0)|86|(0)|89|(0)(0)|92|(0)(0)|95|(0)|98|(0)|101|(0)|104|(0)(0)|107|(0)|110|(0)|117|(0)(0)|124|41)|132|133|(1:135)(6:136|12|13|14|15|16))(5:138|13|14|15|16))|31|22|23)(22:146|147|148|149|150|(1:152)|226|(20:228|(1:230)|154|(4:158|(2:161|159)|162|163)|164|(1:166)|167|168|(13:173|(4:176|(2:178|179)(1:181)|180|174)|182|183|(1:185)(1:219)|186|(10:191|(4:194|(3:196|197|198)(1:200)|199|192)|201|202|(1:204)(1:217)|205|(3:210|211|(1:213)(4:214|37|38|(0)(0)))|216|211|(0)(0))|218|205|(4:207|210|211|(0)(0))|216|211|(0)(0))|220|(1:222)(1:224)|223|186|(11:188|191|(1:192)|201|202|(0)(0)|205|(0)|216|211|(0)(0))|218|205|(0)|216|211|(0)(0))|231|168|(14:170|173|(1:174)|182|183|(0)(0)|186|(0)|218|205|(0)|216|211|(0)(0))|220|(0)(0)|223|186|(0)|218|205|(0)|216|211|(0)(0)))(5:234|235|236|237|(1:239)(20:240|149|150|(0)|226|(0)|231|168|(0)|220|(0)(0)|223|186|(0)|218|205|(0)|216|211|(0)(0))))(1:246))(2:251|(1:253))|247|248|(1:250)|237|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x0101, code lost:            if (r14.isEmpty() != false) goto L311;     */
        /* JADX WARN: Code restructure failed: missing block: B:242:0x0531, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:243:0x0532, code lost:            r4 = r0;        r2 = r11;     */
        /* JADX WARN: Code restructure failed: missing block: B:244:0x052c, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:245:0x052d, code lost:            r4 = r0;        r2 = r11;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x04a3 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:103:0x04b2 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x04c6  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x04d5 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x04e0 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x04f5 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0502 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:126:0x04c9  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x048c  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0474  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0448  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x042a A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:138:0x052a  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x00fd A[Catch: all -> 0x006f, Exception -> 0x0073, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0073, blocks: (B:147:0x0067, B:150:0x00ef, B:152:0x00fd, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d, B:235:0x0085), top: B:2:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:170:0x016d A[Catch: Exception -> 0x0073, all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:150:0x00ef, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d), top: B:149:0x00ef }] */
        /* JADX WARN: Removed duplicated region for block: B:176:0x018b A[Catch: Exception -> 0x0073, all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:150:0x00ef, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d), top: B:149:0x00ef }] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x01cd A[Catch: Exception -> 0x0073, all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:150:0x00ef, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d), top: B:149:0x00ef }] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x01eb A[Catch: Exception -> 0x0073, all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:150:0x00ef, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d), top: B:149:0x00ef }] */
        /* JADX WARN: Removed duplicated region for block: B:204:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x0284 A[Catch: Exception -> 0x0073, all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:150:0x00ef, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d), top: B:149:0x00ef }] */
        /* JADX WARN: Removed duplicated region for block: B:213:0x031d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x031e  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x01bd A[Catch: Exception -> 0x0073, all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:150:0x00ef, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d), top: B:149:0x00ef }] */
        /* JADX WARN: Removed duplicated region for block: B:224:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x010d A[Catch: Exception -> 0x0073, all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:150:0x00ef, B:154:0x0114, B:156:0x011f, B:158:0x0125, B:159:0x012b, B:161:0x0131, B:163:0x014d, B:164:0x014f, B:166:0x0159, B:167:0x015e, B:168:0x0167, B:170:0x016d, B:173:0x0174, B:174:0x0185, B:176:0x018b, B:178:0x019c, B:183:0x01a1, B:186:0x01c7, B:188:0x01cd, B:191:0x01d4, B:192:0x01e5, B:194:0x01eb, B:197:0x01fc, B:202:0x0200, B:205:0x0220, B:207:0x0284, B:211:0x028e, B:218:0x020a, B:220:0x01ab, B:222:0x01bd, B:223:0x01c3, B:226:0x0103, B:228:0x010d), top: B:149:0x00ef }] */
        /* JADX WARN: Removed duplicated region for block: B:239:0x00e8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:240:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0341 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0390 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x039b A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x03a6 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x03b5 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x03c4 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x03d3 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x03e2 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x03f1 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0400 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0421 A[Catch: Exception -> 0x0051, all -> 0x0375, TRY_ENTER, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0445  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0452 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x045d A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0471  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0498 A[Catch: Exception -> 0x0051, all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:38:0x0321, B:40:0x0341, B:41:0x0352, B:43:0x0358, B:45:0x0364, B:48:0x036b, B:49:0x0383, B:51:0x0390, B:52:0x0395, B:54:0x039b, B:55:0x03a0, B:57:0x03a6, B:58:0x03af, B:60:0x03b5, B:61:0x03be, B:63:0x03c4, B:64:0x03cd, B:66:0x03d3, B:67:0x03dc, B:69:0x03e2, B:70:0x03eb, B:72:0x03f1, B:73:0x03fa, B:75:0x0400, B:76:0x0409, B:79:0x0421, B:80:0x0432, B:83:0x0449, B:85:0x0452, B:86:0x0457, B:88:0x045d, B:89:0x0462, B:92:0x0475, B:95:0x048d, B:97:0x0498, B:98:0x049d, B:100:0x04a3, B:101:0x04ac, B:103:0x04b2, B:104:0x04b7, B:107:0x04ca, B:109:0x04d5, B:110:0x04da, B:112:0x04e0, B:115:0x04ec, B:117:0x04ef, B:119:0x04f5, B:122:0x04ff, B:124:0x0502, B:130:0x042a, B:131:0x037a, B:133:0x050a), top: B:37:0x0321 }] */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v21 */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Throwable th2;
            Mutex mutex;
            Exception exc;
            CoroutineScope coroutineScope;
            Object obj2;
            CoroutineScope coroutineScope2;
            Mutex mutex2;
            c cVar;
            Object mo50563o;
            Object mo50569t;
            CoroutineScope coroutineScope3;
            List list;
            Map m100749k;
            String m52904o;
            String str;
            String m100746h;
            Integer m52885e;
            String str2;
            boolean m131196V;
            String m100747i;
            boolean contains;
            String m52856N;
            boolean z11;
            List m131187O0;
            InterfaceC30248b interfaceC30248b;
            Mutex mutex3;
            JSONObject jSONObject;
            ArrayList arrayList;
            ArrayList arrayList2;
            Set<String> keySet;
            List m100674J;
            JSONObject jSONObject2;
            String m50671u;
            String m50656f;
            Long m50670t;
            Integer m50672v;
            Integer m50658h;
            Integer m50661k;
            Long m50657g;
            Long m50667q;
            Long m50665o;
            boolean m100204b;
            Object obj3;
            String m50668r;
            String m50669s;
            Object obj4;
            Object obj5;
            String m50660j;
            Integer m50666p;
            String m50662l;
            Object obj6;
            String m50654d;
            Boolean m50663m;
            Boolean m50664n;
            Object obj7;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95612w;
            ?? r7 = 2;
            r7 = 2;
            boolean z12 = true;
            try {
                try {
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex = r7;
                }
            } catch (Exception e11) {
                exc = e11;
                mutex = r7;
                coroutineScope = coroutineScope3;
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    mutex = (Mutex) this.f95609t;
                                    coroutineScope = (CoroutineScope) this.f95613x;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                    } catch (Exception e12) {
                                        exc = e12;
                                        try {
                                            AbstractC20110a.f98889a.mo104548a("zch log video view Exception:" + exc.getMessage(), new Object[0]);
                                            coroutineScope2 = coroutineScope;
                                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                            C24848g0 c24848g0 = C24848g0.f119245a;
                                            mutex.mo113890c(null);
                                            return C24848g0.f119245a;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            obj2 = null;
                                            mutex.mo113890c(obj2);
                                            throw th2;
                                        }
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                    }
                                    coroutineScope2 = coroutineScope;
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                    mutex.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m131187O0 = (List) this.f95611v;
                            jSONObject = (JSONObject) this.f95610u;
                            mutex3 = (Mutex) this.f95609t;
                            coroutineScope2 = (CoroutineScope) this.f95613x;
                            try {
                                try {
                                    AbstractC24862s.m129228b(obj);
                                } catch (Exception e13) {
                                    exc = e13;
                                    mutex = mutex3;
                                    coroutineScope = coroutineScope2;
                                    AbstractC20110a.f98889a.mo104548a("zch log video view Exception:" + exc.getMessage(), new Object[0]);
                                    coroutineScope2 = coroutineScope;
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g022 = C24848g0.f119245a;
                                    mutex.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                            } catch (Throwable th6) {
                                th2 = th6;
                                mutex = mutex3;
                            }
                            try {
                                SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                m100674J = C19205a.f95429a.m100674J(m131187O0, m55587A.getInt("ZCH_LOG_VIEW_BATCH", 1));
                                if (!(!m100674J.isEmpty())) {
                                    InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                    JSONArray jSONArray = new JSONArray();
                                    Iterator it = m100674J.iterator();
                                    while (it.hasNext()) {
                                        LogViewVideo logViewVideo = (LogViewVideo) it.next();
                                        String m50659i = logViewVideo.m50659i();
                                        if (m50659i != null && m50659i.length() != 0) {
                                            jSONObject2 = new JSONObject(logViewVideo.m50659i());
                                            jSONObject2.put("action_key", "view_video");
                                            m50671u = logViewVideo.m50671u();
                                            if (m50671u != null) {
                                                jSONObject2.put("video_id", m50671u);
                                            }
                                            m50656f = logViewVideo.m50656f();
                                            if (m50656f != null) {
                                                jSONObject2.put("seen_channel_id", m50656f);
                                            }
                                            m50670t = logViewVideo.m50670t();
                                            if (m50670t != null) {
                                                jSONObject2.put("time_buffering", m50670t.longValue());
                                            }
                                            m50672v = logViewVideo.m50672v();
                                            if (m50672v != null) {
                                                jSONObject2.put("watch_time", m50672v.intValue());
                                            }
                                            m50658h = logViewVideo.m50658h();
                                            if (m50658h != null) {
                                                jSONObject2.put("current_play_time", m50658h.intValue());
                                            }
                                            m50661k = logViewVideo.m50661k();
                                            if (m50661k != null) {
                                                jSONObject2.put("duration", m50661k.intValue());
                                            }
                                            m50657g = logViewVideo.m50657g();
                                            if (m50657g != null) {
                                                jSONObject2.put("comment_count", m50657g.longValue());
                                            }
                                            m50667q = logViewVideo.m50667q();
                                            if (m50667q != null) {
                                                jSONObject2.put("share_count", m50667q.longValue());
                                            }
                                            m50665o = logViewVideo.m50665o();
                                            if (m50665o != null) {
                                                jSONObject2.put("like_count", m50665o.longValue());
                                            }
                                            m100204b = AbstractC19074t.m100204b(logViewVideo.m50653c(), AbstractC29094b.m145339a(z12));
                                            String str3 = "0";
                                            Iterator it2 = it;
                                            if (!m100204b) {
                                                jSONObject2.put("allow_share", "1");
                                                jSONObject2.put("share_options", "zmessage, zdinary, copy_link, other");
                                            } else {
                                                jSONObject2.put("allow_share", "0");
                                                jSONObject2.put("share_options", "");
                                            }
                                            if (AbstractC19074t.m100204b(logViewVideo.m50652b(), AbstractC29094b.m145339a(true))) {
                                                obj3 = "0";
                                            } else {
                                                obj3 = "1";
                                            }
                                            jSONObject2.put("allow_comment", obj3);
                                            m50668r = logViewVideo.m50668r();
                                            if (m50668r != null) {
                                                jSONObject2.put("source", m50668r);
                                            }
                                            m50669s = logViewVideo.m50669s();
                                            if (m50669s != null) {
                                                jSONObject2.put("source_info", m50669s);
                                            }
                                            if (AbstractC19074t.m100204b(logViewVideo.m50674x(), AbstractC29094b.m145339a(true))) {
                                                obj4 = "0";
                                            } else {
                                                obj4 = "1";
                                            }
                                            jSONObject2.put("is_seen", obj4);
                                            if (AbstractC19074t.m100204b(logViewVideo.m50673w(), AbstractC29094b.m145339a(true))) {
                                                obj5 = "0";
                                            } else {
                                                obj5 = "1";
                                            }
                                            jSONObject2.put("is_looped", obj5);
                                            m50660j = logViewVideo.m50660j();
                                            if (m50660j != null) {
                                                jSONObject2.put("description", m50660j);
                                            }
                                            m50666p = logViewVideo.m50666p();
                                            if (m50666p != null) {
                                                jSONObject2.put("list_index", m50666p.intValue());
                                            }
                                            m50662l = logViewVideo.m50662l();
                                            if (m50662l != null) {
                                                jSONObject2.put("extra", m50662l);
                                            }
                                            if (AbstractC19074t.m100204b(logViewVideo.m50655e(), AbstractC29094b.m145339a(true))) {
                                                obj6 = "0";
                                            } else {
                                                obj6 = "1";
                                            }
                                            jSONObject2.put("is_auto_swipe", obj6);
                                            m50654d = logViewVideo.m50654d();
                                            if (m50654d != null) {
                                                jSONObject2.put("api_extra", m50654d);
                                            }
                                            m50663m = logViewVideo.m50663m();
                                            if (m50663m != null) {
                                                if (!m50663m.booleanValue()) {
                                                    obj7 = "0";
                                                } else {
                                                    obj7 = "1";
                                                }
                                                jSONObject2.put("in_session_disliked_cate", obj7);
                                            }
                                            m50664n = logViewVideo.m50664n();
                                            if (m50664n != null) {
                                                if (m50664n.booleanValue()) {
                                                    str3 = "1";
                                                }
                                                jSONObject2.put("in_session_disliked_channel", str3);
                                            }
                                            jSONArray.put(jSONObject2);
                                            it = it2;
                                            z12 = true;
                                        }
                                        jSONObject2 = new JSONObject(jSONObject.toString());
                                        jSONObject2.put("action_key", "view_video");
                                        m50671u = logViewVideo.m50671u();
                                        if (m50671u != null) {
                                        }
                                        m50656f = logViewVideo.m50656f();
                                        if (m50656f != null) {
                                        }
                                        m50670t = logViewVideo.m50670t();
                                        if (m50670t != null) {
                                        }
                                        m50672v = logViewVideo.m50672v();
                                        if (m50672v != null) {
                                        }
                                        m50658h = logViewVideo.m50658h();
                                        if (m50658h != null) {
                                        }
                                        m50661k = logViewVideo.m50661k();
                                        if (m50661k != null) {
                                        }
                                        m50657g = logViewVideo.m50657g();
                                        if (m50657g != null) {
                                        }
                                        m50667q = logViewVideo.m50667q();
                                        if (m50667q != null) {
                                        }
                                        m50665o = logViewVideo.m50665o();
                                        if (m50665o != null) {
                                        }
                                        m100204b = AbstractC19074t.m100204b(logViewVideo.m50653c(), AbstractC29094b.m145339a(z12));
                                        String str32 = "0";
                                        Iterator it22 = it;
                                        if (!m100204b) {
                                        }
                                        if (AbstractC19074t.m100204b(logViewVideo.m50652b(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("allow_comment", obj3);
                                        m50668r = logViewVideo.m50668r();
                                        if (m50668r != null) {
                                        }
                                        m50669s = logViewVideo.m50669s();
                                        if (m50669s != null) {
                                        }
                                        if (AbstractC19074t.m100204b(logViewVideo.m50674x(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("is_seen", obj4);
                                        if (AbstractC19074t.m100204b(logViewVideo.m50673w(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("is_looped", obj5);
                                        m50660j = logViewVideo.m50660j();
                                        if (m50660j != null) {
                                        }
                                        m50666p = logViewVideo.m50666p();
                                        if (m50666p != null) {
                                        }
                                        m50662l = logViewVideo.m50662l();
                                        if (m50662l != null) {
                                        }
                                        if (AbstractC19074t.m100204b(logViewVideo.m50655e(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("is_auto_swipe", obj6);
                                        m50654d = logViewVideo.m50654d();
                                        if (m50654d != null) {
                                        }
                                        m50663m = logViewVideo.m50663m();
                                        if (m50663m != null) {
                                        }
                                        m50664n = logViewVideo.m50664n();
                                        if (m50664n != null) {
                                        }
                                        jSONArray.put(jSONObject2);
                                        it = it22;
                                        z12 = true;
                                    }
                                    a aVar = new a(m143667D, jSONArray, m55587A, null);
                                    this.f95613x = coroutineScope2;
                                    this.f95609t = mutex3;
                                    this.f95610u = null;
                                    this.f95611v = null;
                                    this.f95612w = 5;
                                    if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                        return m142578e;
                                    }
                                    mutex = mutex3;
                                    coroutineScope = coroutineScope2;
                                    coroutineScope2 = coroutineScope;
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g0222 = C24848g0.f119245a;
                                    mutex.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                mutex = mutex3;
                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                C24848g0 c24848g02222 = C24848g0.f119245a;
                                mutex.mo113890c(null);
                                return C24848g0.f119245a;
                            } catch (Throwable th7) {
                                th2 = th7;
                                mutex = mutex3;
                                obj2 = null;
                                mutex.mo113890c(obj2);
                                throw th2;
                            }
                            obj2 = null;
                            mutex.mo113890c(obj2);
                            throw th2;
                        }
                        list = (List) this.f95611v;
                        c cVar2 = (c) this.f95610u;
                        Mutex mutex4 = (Mutex) this.f95609t;
                        coroutineScope3 = (CoroutineScope) this.f95613x;
                        AbstractC24862s.m129228b(obj);
                        cVar = cVar2;
                        mo50569t = obj;
                        r7 = mutex4;
                        try {
                            List list2 = (List) mo50569t;
                            JSONObject m100673F = C19205a.f95429a.m100673F();
                            m100749k = cVar.m100749k();
                            if (m100749k != null) {
                            }
                            m52904o = cVar.m100752n().m52904o();
                            if (m52904o != null) {
                                if (m52904o.length() != 0) {
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                Map m100749k2 = cVar.m100749k();
                                if (m100749k2 != null && (keySet = m100749k2.keySet()) != null) {
                                    for (String str4 : keySet) {
                                        jSONObject3.put(str4, cVar.m100749k().get(str4));
                                    }
                                    C24848g0 c24848g03 = C24848g0.f119245a;
                                }
                                String m52904o2 = cVar.m100752n().m52904o();
                                if (m52904o2 != null) {
                                    jSONObject3.put("related_video_id", m52904o2);
                                }
                                str = jSONObject3.toString();
                                m100746h = cVar.m100746h();
                                if (m100746h != null && m100746h.length() != 0) {
                                    List m100710H = C19205a.f95429a.m100710H();
                                    arrayList2 = new ArrayList();
                                    for (Object obj8 : m100710H) {
                                        if (AbstractC19074t.m100204b((String) obj8, cVar.m100746h())) {
                                            arrayList2.add(obj8);
                                        }
                                    }
                                    if (arrayList2.size() <= 1) {
                                        m131196V = true;
                                    } else {
                                        m131196V = false;
                                    }
                                    m100747i = cVar.m100747i();
                                    if (m100747i != null && m100747i.length() != 0) {
                                        List m100709G = C19205a.f95429a.m100709G();
                                        arrayList = new ArrayList();
                                        for (Object obj9 : m100709G) {
                                            if (AbstractC19074t.m100204b((String) obj9, cVar.m100747i())) {
                                                arrayList.add(obj9);
                                            }
                                        }
                                        if (arrayList.size() <= 1) {
                                            contains = true;
                                        } else {
                                            contains = false;
                                        }
                                        String m52911t = cVar.m100752n().m52911t();
                                        String m50769l = cVar.m100752n().m52887f().m50769l();
                                        Long m145342d = AbstractC29094b.m145342d(cVar.m100751m());
                                        Integer m145341c = AbstractC29094b.m145341c(cVar.m100753o());
                                        Integer m145341c2 = AbstractC29094b.m145341c(cVar.m100745g());
                                        Integer m145341c3 = AbstractC29094b.m145341c(cVar.m100748j());
                                        Long m145342d2 = AbstractC29094b.m145342d(cVar.m100752n().m52837C());
                                        Long m145342d3 = AbstractC29094b.m145342d(cVar.m100752n().m52842F());
                                        Long m145342d4 = AbstractC29094b.m145342d(cVar.m100752n().m52839D());
                                        m52856N = cVar.m100752n().m52856N();
                                        if (m52856N != null && m52856N.length() != 0) {
                                            z11 = true;
                                            LogViewVideo logViewVideo2 = new LogViewVideo(m52911t, m50769l, m145342d, m145341c, m145341c2, m145341c3, m145342d2, m145342d3, m145342d4, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                                            m131187O0 = AbstractC25332a0.m131187O0(list);
                                            m131187O0.add(0, logViewVideo2);
                                            interfaceC30248b = C19205a.f95436h;
                                            this.f95613x = coroutineScope3;
                                            this.f95609t = r7;
                                            this.f95610u = m100673F;
                                            this.f95611v = m131187O0;
                                            this.f95612w = 4;
                                            if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                                                return m142578e;
                                            }
                                            mutex3 = r7;
                                            coroutineScope2 = coroutineScope3;
                                            jSONObject = m100673F;
                                            SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                                            m100674J = C19205a.f95429a.m100674J(m131187O0, m55587A2.getInt("ZCH_LOG_VIEW_BATCH", 1));
                                            if (!(!m100674J.isEmpty())) {
                                            }
                                        }
                                        z11 = false;
                                        LogViewVideo logViewVideo22 = new LogViewVideo(m52911t, m50769l, m145342d, m145341c, m145341c2, m145341c3, m145342d2, m145342d3, m145342d4, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                                        m131187O0 = AbstractC25332a0.m131187O0(list);
                                        m131187O0.add(0, logViewVideo22);
                                        interfaceC30248b = C19205a.f95436h;
                                        this.f95613x = coroutineScope3;
                                        this.f95609t = r7;
                                        this.f95610u = m100673F;
                                        this.f95611v = m131187O0;
                                        this.f95612w = 4;
                                        if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                                        }
                                    }
                                    contains = C19205a.f95429a.m100709G().contains(cVar.m100752n().m52887f().m50769l());
                                    String m52911t2 = cVar.m100752n().m52911t();
                                    String m50769l2 = cVar.m100752n().m52887f().m50769l();
                                    Long m145342d5 = AbstractC29094b.m145342d(cVar.m100751m());
                                    Integer m145341c4 = AbstractC29094b.m145341c(cVar.m100753o());
                                    Integer m145341c22 = AbstractC29094b.m145341c(cVar.m100745g());
                                    Integer m145341c32 = AbstractC29094b.m145341c(cVar.m100748j());
                                    Long m145342d22 = AbstractC29094b.m145342d(cVar.m100752n().m52837C());
                                    Long m145342d32 = AbstractC29094b.m145342d(cVar.m100752n().m52842F());
                                    Long m145342d42 = AbstractC29094b.m145342d(cVar.m100752n().m52839D());
                                    m52856N = cVar.m100752n().m52856N();
                                    if (m52856N != null) {
                                        z11 = true;
                                        LogViewVideo logViewVideo222 = new LogViewVideo(m52911t2, m50769l2, m145342d5, m145341c4, m145341c22, m145341c32, m145342d22, m145342d32, m145342d42, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                                        m131187O0 = AbstractC25332a0.m131187O0(list);
                                        m131187O0.add(0, logViewVideo222);
                                        interfaceC30248b = C19205a.f95436h;
                                        this.f95613x = coroutineScope3;
                                        this.f95609t = r7;
                                        this.f95610u = m100673F;
                                        this.f95611v = m131187O0;
                                        this.f95612w = 4;
                                        if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                                        }
                                    }
                                    z11 = false;
                                    LogViewVideo logViewVideo2222 = new LogViewVideo(m52911t2, m50769l2, m145342d5, m145341c4, m145341c22, m145341c32, m145342d22, m145342d32, m145342d42, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                                    m131187O0 = AbstractC25332a0.m131187O0(list);
                                    m131187O0.add(0, logViewVideo2222);
                                    interfaceC30248b = C19205a.f95436h;
                                    this.f95613x = coroutineScope3;
                                    this.f95609t = r7;
                                    this.f95610u = m100673F;
                                    this.f95611v = m131187O0;
                                    this.f95612w = 4;
                                    if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                                    }
                                }
                                List m100710H2 = C19205a.f95429a.m100710H();
                                m52885e = cVar.m100752n().m52885e();
                                if (m52885e != null) {
                                    str2 = m52885e.toString();
                                } else {
                                    str2 = null;
                                }
                                m131196V = AbstractC25332a0.m131196V(m100710H2, str2);
                                m100747i = cVar.m100747i();
                                if (m100747i != null) {
                                    List m100709G2 = C19205a.f95429a.m100709G();
                                    arrayList = new ArrayList();
                                    while (r5.hasNext()) {
                                    }
                                    if (arrayList.size() <= 1) {
                                    }
                                    String m52911t22 = cVar.m100752n().m52911t();
                                    String m50769l22 = cVar.m100752n().m52887f().m50769l();
                                    Long m145342d52 = AbstractC29094b.m145342d(cVar.m100751m());
                                    Integer m145341c42 = AbstractC29094b.m145341c(cVar.m100753o());
                                    Integer m145341c222 = AbstractC29094b.m145341c(cVar.m100745g());
                                    Integer m145341c322 = AbstractC29094b.m145341c(cVar.m100748j());
                                    Long m145342d222 = AbstractC29094b.m145342d(cVar.m100752n().m52837C());
                                    Long m145342d322 = AbstractC29094b.m145342d(cVar.m100752n().m52842F());
                                    Long m145342d422 = AbstractC29094b.m145342d(cVar.m100752n().m52839D());
                                    m52856N = cVar.m100752n().m52856N();
                                    if (m52856N != null) {
                                    }
                                    z11 = false;
                                    LogViewVideo logViewVideo22222 = new LogViewVideo(m52911t22, m50769l22, m145342d52, m145341c42, m145341c222, m145341c322, m145342d222, m145342d322, m145342d422, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                                    m131187O0 = AbstractC25332a0.m131187O0(list);
                                    m131187O0.add(0, logViewVideo22222);
                                    interfaceC30248b = C19205a.f95436h;
                                    this.f95613x = coroutineScope3;
                                    this.f95609t = r7;
                                    this.f95610u = m100673F;
                                    this.f95611v = m131187O0;
                                    this.f95612w = 4;
                                    if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                                    }
                                }
                                contains = C19205a.f95429a.m100709G().contains(cVar.m100752n().m52887f().m50769l());
                                String m52911t222 = cVar.m100752n().m52911t();
                                String m50769l222 = cVar.m100752n().m52887f().m50769l();
                                Long m145342d522 = AbstractC29094b.m145342d(cVar.m100751m());
                                Integer m145341c422 = AbstractC29094b.m145341c(cVar.m100753o());
                                Integer m145341c2222 = AbstractC29094b.m145341c(cVar.m100745g());
                                Integer m145341c3222 = AbstractC29094b.m145341c(cVar.m100748j());
                                Long m145342d2222 = AbstractC29094b.m145342d(cVar.m100752n().m52837C());
                                Long m145342d3222 = AbstractC29094b.m145342d(cVar.m100752n().m52842F());
                                Long m145342d4222 = AbstractC29094b.m145342d(cVar.m100752n().m52839D());
                                m52856N = cVar.m100752n().m52856N();
                                if (m52856N != null) {
                                }
                                z11 = false;
                                LogViewVideo logViewVideo222222 = new LogViewVideo(m52911t222, m50769l222, m145342d522, m145341c422, m145341c2222, m145341c3222, m145342d2222, m145342d3222, m145342d4222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                                m131187O0 = AbstractC25332a0.m131187O0(list);
                                m131187O0.add(0, logViewVideo222222);
                                interfaceC30248b = C19205a.f95436h;
                                this.f95613x = coroutineScope3;
                                this.f95609t = r7;
                                this.f95610u = m100673F;
                                this.f95611v = m131187O0;
                                this.f95612w = 4;
                                if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                                }
                            }
                            str = null;
                            m100746h = cVar.m100746h();
                            if (m100746h != null) {
                                List m100710H3 = C19205a.f95429a.m100710H();
                                arrayList2 = new ArrayList();
                                while (r4.hasNext()) {
                                }
                                if (arrayList2.size() <= 1) {
                                }
                                m100747i = cVar.m100747i();
                                if (m100747i != null) {
                                }
                                contains = C19205a.f95429a.m100709G().contains(cVar.m100752n().m52887f().m50769l());
                                String m52911t2222 = cVar.m100752n().m52911t();
                                String m50769l2222 = cVar.m100752n().m52887f().m50769l();
                                Long m145342d5222 = AbstractC29094b.m145342d(cVar.m100751m());
                                Integer m145341c4222 = AbstractC29094b.m145341c(cVar.m100753o());
                                Integer m145341c22222 = AbstractC29094b.m145341c(cVar.m100745g());
                                Integer m145341c32222 = AbstractC29094b.m145341c(cVar.m100748j());
                                Long m145342d22222 = AbstractC29094b.m145342d(cVar.m100752n().m52837C());
                                Long m145342d32222 = AbstractC29094b.m145342d(cVar.m100752n().m52842F());
                                Long m145342d42222 = AbstractC29094b.m145342d(cVar.m100752n().m52839D());
                                m52856N = cVar.m100752n().m52856N();
                                if (m52856N != null) {
                                }
                                z11 = false;
                                LogViewVideo logViewVideo2222222 = new LogViewVideo(m52911t2222, m50769l2222, m145342d5222, m145341c4222, m145341c22222, m145341c32222, m145342d22222, m145342d32222, m145342d42222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                                m131187O0 = AbstractC25332a0.m131187O0(list);
                                m131187O0.add(0, logViewVideo2222222);
                                interfaceC30248b = C19205a.f95436h;
                                this.f95613x = coroutineScope3;
                                this.f95609t = r7;
                                this.f95610u = m100673F;
                                this.f95611v = m131187O0;
                                this.f95612w = 4;
                                if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                                }
                            }
                            List m100710H22 = C19205a.f95429a.m100710H();
                            m52885e = cVar.m100752n().m52885e();
                            if (m52885e != null) {
                            }
                            m131196V = AbstractC25332a0.m131196V(m100710H22, str2);
                            m100747i = cVar.m100747i();
                            if (m100747i != null) {
                            }
                            contains = C19205a.f95429a.m100709G().contains(cVar.m100752n().m52887f().m50769l());
                            String m52911t22222 = cVar.m100752n().m52911t();
                            String m50769l22222 = cVar.m100752n().m52887f().m50769l();
                            Long m145342d52222 = AbstractC29094b.m145342d(cVar.m100751m());
                            Integer m145341c42222 = AbstractC29094b.m145341c(cVar.m100753o());
                            Integer m145341c222222 = AbstractC29094b.m145341c(cVar.m100745g());
                            Integer m145341c322222 = AbstractC29094b.m145341c(cVar.m100748j());
                            Long m145342d222222 = AbstractC29094b.m145342d(cVar.m100752n().m52837C());
                            Long m145342d322222 = AbstractC29094b.m145342d(cVar.m100752n().m52842F());
                            Long m145342d422222 = AbstractC29094b.m145342d(cVar.m100752n().m52839D());
                            m52856N = cVar.m100752n().m52856N();
                            if (m52856N != null) {
                            }
                            z11 = false;
                            LogViewVideo logViewVideo22222222 = new LogViewVideo(m52911t22222, m50769l22222, m145342d52222, m145341c42222, m145341c222222, m145341c322222, m145342d222222, m145342d322222, m145342d422222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list2.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                            m131187O0 = AbstractC25332a0.m131187O0(list);
                            m131187O0.add(0, logViewVideo22222222);
                            interfaceC30248b = C19205a.f95436h;
                            this.f95613x = coroutineScope3;
                            this.f95609t = r7;
                            this.f95610u = m100673F;
                            this.f95611v = m131187O0;
                            this.f95612w = 4;
                            if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                            }
                        } catch (Throwable th8) {
                            th2 = th8;
                            mutex = r7;
                            obj2 = null;
                            mutex.mo113890c(obj2);
                            throw th2;
                        }
                    } else {
                        c cVar3 = (c) this.f95610u;
                        Mutex mutex5 = (Mutex) this.f95609t;
                        CoroutineScope coroutineScope4 = (CoroutineScope) this.f95613x;
                        AbstractC24862s.m129228b(obj);
                        cVar = cVar3;
                        coroutineScope = coroutineScope4;
                        mutex2 = mutex5;
                        mo50563o = obj;
                        List list3 = (List) mo50563o;
                        InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                        this.f95613x = coroutineScope;
                        this.f95609t = mutex2;
                        this.f95610u = cVar;
                        this.f95611v = list3;
                        this.f95612w = 3;
                        mo50569t = interfaceC30248b2.mo50569t(this);
                        if (mo50569t != m142578e) {
                            return m142578e;
                        }
                        Mutex mutex6 = mutex2;
                        coroutineScope3 = coroutineScope;
                        list = list3;
                        r7 = mutex6;
                        List list22 = (List) mo50569t;
                        JSONObject m100673F2 = C19205a.f95429a.m100673F();
                        m100749k = cVar.m100749k();
                        if (m100749k != null) {
                        }
                        m52904o = cVar.m100752n().m52904o();
                        if (m52904o != null) {
                        }
                        str = null;
                        m100746h = cVar.m100746h();
                        if (m100746h != null) {
                        }
                        List m100710H222 = C19205a.f95429a.m100710H();
                        m52885e = cVar.m100752n().m52885e();
                        if (m52885e != null) {
                        }
                        m131196V = AbstractC25332a0.m131196V(m100710H222, str2);
                        m100747i = cVar.m100747i();
                        if (m100747i != null) {
                        }
                        contains = C19205a.f95429a.m100709G().contains(cVar.m100752n().m52887f().m50769l());
                        String m52911t222222 = cVar.m100752n().m52911t();
                        String m50769l222222 = cVar.m100752n().m52887f().m50769l();
                        Long m145342d522222 = AbstractC29094b.m145342d(cVar.m100751m());
                        Integer m145341c422222 = AbstractC29094b.m145341c(cVar.m100753o());
                        Integer m145341c2222222 = AbstractC29094b.m145341c(cVar.m100745g());
                        Integer m145341c3222222 = AbstractC29094b.m145341c(cVar.m100748j());
                        Long m145342d2222222 = AbstractC29094b.m145342d(cVar.m100752n().m52837C());
                        Long m145342d3222222 = AbstractC29094b.m145342d(cVar.m100752n().m52842F());
                        Long m145342d4222222 = AbstractC29094b.m145342d(cVar.m100752n().m52839D());
                        m52856N = cVar.m100752n().m52856N();
                        if (m52856N != null) {
                        }
                        z11 = false;
                        LogViewVideo logViewVideo222222222 = new LogViewVideo(m52911t222222, m50769l222222, m145342d522222, m145341c422222, m145341c2222222, m145341c3222222, m145342d2222222, m145342d3222222, m145342d4222222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar.m100752n().m52886e0()), cVar.m100752n().m52858O(), cVar.m100752n().m52861Q(), AbstractC29094b.m145339a(list22.contains(cVar.m100752n().m52911t())), AbstractC29094b.m145339a(cVar.m100754p()), cVar.m100752n().m52894j(), cVar.m100752n().m52919y(), AbstractC29094b.m145339a(cVar.m100744f()), str, m100673F2.toString(), cVar.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), (String) null, 8388608, (AbstractC19060k) null);
                        m131187O0 = AbstractC25332a0.m131187O0(list);
                        m131187O0.add(0, logViewVideo222222222);
                        interfaceC30248b = C19205a.f95436h;
                        this.f95613x = coroutineScope3;
                        this.f95609t = r7;
                        this.f95610u = m100673F2;
                        this.f95611v = m131187O0;
                        this.f95612w = 4;
                        if (interfaceC30248b.mo50544G(m131187O0, this) == m142578e) {
                        }
                    }
                } else {
                    c cVar4 = (c) this.f95610u;
                    mutex2 = (Mutex) this.f95609t;
                    CoroutineScope coroutineScope5 = (CoroutineScope) this.f95613x;
                    AbstractC24862s.m129228b(obj);
                    cVar = cVar4;
                    coroutineScope = coroutineScope5;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                coroutineScope = (CoroutineScope) this.f95613x;
                mutex2 = C19205a.f95438j;
                cVar = this.f95614y;
                this.f95613x = coroutineScope;
                this.f95609t = mutex2;
                this.f95610u = cVar;
                this.f95612w = 1;
                if (mutex2.mo113889b(null, this) == m142578e) {
                    return m142578e;
                }
            }
            InterfaceC30248b interfaceC30248b3 = C19205a.f95436h;
            this.f95613x = coroutineScope;
            this.f95609t = mutex2;
            this.f95610u = cVar;
            this.f95612w = 2;
            mo50563o = interfaceC30248b3.mo50563o(this);
            if (mo50563o == m142578e) {
                return m142578e;
            }
            List list32 = (List) mo50563o;
            InterfaceC30248b interfaceC30248b22 = C19205a.f95436h;
            this.f95613x = coroutineScope;
            this.f95609t = mutex2;
            this.f95610u = cVar;
            this.f95611v = list32;
            this.f95612w = 3;
            mo50569t = interfaceC30248b22.mo50569t(this);
            if (mo50569t != m142578e) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$p */
    /* loaded from: classes5.dex */
    public static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95619t;

        /* renamed from: u */
        Object f95620u;

        /* renamed from: v */
        Object f95621v;

        /* renamed from: w */
        int f95622w;

        /* renamed from: x */
        private /* synthetic */ Object f95623x;

        /* renamed from: y */
        final /* synthetic */ c f95624y;

        /* renamed from: g20.a$p$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95625t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95626u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95627v;

            /* renamed from: w */
            final /* synthetic */ SharedPreferences f95628w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, SharedPreferences sharedPreferences, Continuation continuation) {
                super(2, continuation);
                this.f95626u = interfaceC18170g;
                this.f95627v = jSONArray;
                this.f95628w = sharedPreferences;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95626u, this.f95627v, this.f95628w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List m131502j;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95625t;
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
                    InterfaceC18170g interfaceC18170g = this.f95626u;
                    String jSONArray = this.f95627v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95470v;
                    this.f95625t = 1;
                    obj = interfaceC18170g.mo96569P(jSONArray, bVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log video ads view " + this.f95627v, new Object[0]);
                SharedPreferences.Editor edit = this.f95628w.edit();
                edit.putInt("LOG_VIEW_VIDEO_ADS_BATCH", ((LogResultInfo) obj).m51042a());
                edit.apply();
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                m131502j = AbstractC25368s.m131502j();
                this.f95625t = 2;
                if (interfaceC30248b.mo50539B(m131502j, this) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(c cVar, Continuation continuation) {
            super(2, continuation);
            this.f95624y = cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            p pVar = new p(this.f95624y, continuation);
            pVar.f95623x = obj;
            return pVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(28:289|290|291|12|13|(2:257|258)|15|(5:(31:17|(1:19)|20|(4:24|(2:27|25)|28|29)|30|(1:32)|33|34|35|(1:37)(1:255)|38|(1:40)|58|(5:244|245|246|247|248)(1:60)|61|62|(17:67|(4:70|(3:72|73|74)(1:76)|75|68)|77|78|79|(1:81)(1:234)|82|(14:87|(4:90|(3:92|93|94)(1:96)|95|88)|97|98|99|(1:101)(1:232)|102|(2:104|(6:106|107|108|109|110|(1:112)(3:113|114|(0)(0))))|231|107|108|109|110|(0)(0))|233|102|(0)|231|107|108|109|110|(0)(0))|235|(1:237)(1:239)|238|82|(15:84|87|(1:88)|97|98|99|(0)(0)|102|(0)|231|107|108|109|110|(0)(0))|233|102|(0)|231|107|108|109|110|(0)(0))|(18:64|67|(1:68)|77|78|79|(0)(0)|82|(0)|233|102|(0)|231|107|108|109|110|(0)(0))|109|110|(0)(0))|256|35|(0)(0)|38|(0)|58|(0)(0)|61|62|235|(0)(0)|238|82|(0)|233|102|(0)|231|107|108) */
        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:2)|(1:(2:272|(1:(1:(8:276|277|278|47|48|49|50|51)(2:285|286))(4:287|288|114|(5:116|(52:119|(49:124|125|(1:127)|128|(1:130)|131|(1:133)(1:211)|134|(1:136)|137|(1:139)|140|(1:142)|143|(1:145)|146|(1:148)|149|(1:151)|152|153|(1:155)(1:210)|156|(1:158)(1:209)|159|(1:161)|162|(1:164)|165|(1:167)(1:208)|168|(1:170)(1:207)|171|(1:173)|174|(1:176)|177|(1:179)|180|(1:182)(1:206)|183|(1:185)|186|(3:188|(1:190)(1:192)|191)|193|(3:195|(1:197)(1:199)|198)|200|(2:202|203)(1:205)|204)|212|125|(0)|128|(0)|131|(0)(0)|134|(0)|137|(0)|140|(0)|143|(0)|146|(0)|149|(0)|152|153|(0)(0)|156|(0)(0)|159|(0)|162|(0)|165|(0)(0)|168|(0)(0)|171|(0)|174|(0)|177|(0)|180|(0)(0)|183|(0)|186|(0)|193|(0)|200|(0)(0)|204|117)|213|214|(1:216)(6:217|47|48|49|50|51))(5:219|48|49|50|51)))(32:289|290|291|12|13|(2:257|258)|15|(31:17|(1:19)|20|(4:24|(2:27|25)|28|29)|30|(1:32)|33|34|35|(1:37)(1:255)|38|(1:40)|58|(5:244|245|246|247|248)(1:60)|61|62|(17:67|(4:70|(3:72|73|74)(1:76)|75|68)|77|78|79|(1:81)(1:234)|82|(14:87|(4:90|(3:92|93|94)(1:96)|95|88)|97|98|99|(1:101)(1:232)|102|(2:104|(6:106|107|108|109|110|(1:112)(3:113|114|(0)(0))))|231|107|108|109|110|(0)(0))|233|102|(0)|231|107|108|109|110|(0)(0))|235|(1:237)(1:239)|238|82|(15:84|87|(1:88)|97|98|99|(0)(0)|102|(0)|231|107|108|109|110|(0)(0))|233|102|(0)|231|107|108|109|110|(0)(0))|256|35|(0)(0)|38|(0)|58|(0)(0)|61|62|(18:64|67|(1:68)|77|78|79|(0)(0)|82|(0)|233|102|(0)|231|107|108|109|110|(0)(0))|235|(0)(0)|238|82|(0)|233|102|(0)|231|107|108|109|110|(0)(0)))(1:5))(2:294|(1:296))|6|7|(1:9)(30:11|12|13|(0)|15|(0)|256|35|(0)(0)|38|(0)|58|(0)(0)|61|62|(0)|235|(0)(0)|238|82|(0)|233|102|(0)|231|107|108|109|110|(0)(0))|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:240:0x0592, code lost:            r0 = e;     */
        /* JADX WARN: Code restructure failed: missing block: B:241:0x0593, code lost:            r6 = r45;     */
        /* JADX WARN: Code restructure failed: missing block: B:242:0x058d, code lost:            r0 = th;     */
        /* JADX WARN: Code restructure failed: missing block: B:243:0x058e, code lost:            r6 = r45;     */
        /* JADX WARN: Code restructure failed: missing block: B:259:0x00c7, code lost:            if (r15.isEmpty() != false) goto L352;     */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x059d, code lost:            r0 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x059e, code lost:            r4 = r0;        r2 = r12;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x02e1 A[Catch: all -> 0x01ad, Exception -> 0x01b3, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x01b3, all -> 0x01ad, blocks: (B:248:0x019c, B:64:0x01c9, B:67:0x01d0, B:68:0x01e1, B:70:0x01e7, B:73:0x01f8, B:78:0x01fc, B:84:0x0229, B:87:0x0230, B:88:0x0241, B:90:0x0247, B:93:0x0258, B:98:0x025c, B:104:0x02e1, B:237:0x0219), top: B:247:0x019c }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0370 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0371  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0394 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:127:0x03e3 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x03ee A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x03f9 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x040d A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x041c A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x042b A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x043a A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0449 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0458 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0475 A[Catch: Exception -> 0x0052, all -> 0x03c8, TRY_ENTER, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0499  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x04a5 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:164:0x04b0 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x04c4  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x04db  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x04e9 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:176:0x04f4 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0503 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00e0 A[Catch: Exception -> 0x00d0, all -> 0x011a, TRY_ENTER, TryCatch #0 {Exception -> 0x00d0, blocks: (B:258:0x00c3, B:20:0x00e7, B:22:0x00f2, B:24:0x00f8, B:25:0x00fe, B:27:0x0104, B:29:0x0120, B:30:0x0122, B:32:0x012c, B:33:0x0131, B:40:0x016e, B:17:0x00e0), top: B:257:0x00c3 }] */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0517  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0525 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0530 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0544 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0558 A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:205:0x055d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0519  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x04dd  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x04c6  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x049b  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x047e A[Catch: Exception -> 0x0052, all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:114:0x0373, B:116:0x0394, B:117:0x03a5, B:119:0x03ab, B:121:0x03b7, B:124:0x03be, B:125:0x03d6, B:127:0x03e3, B:128:0x03e8, B:130:0x03ee, B:131:0x03f3, B:133:0x03f9, B:134:0x0407, B:136:0x040d, B:137:0x0416, B:139:0x041c, B:140:0x0425, B:142:0x042b, B:143:0x0434, B:145:0x043a, B:146:0x0443, B:148:0x0449, B:149:0x0452, B:151:0x0458, B:152:0x0461, B:155:0x0475, B:156:0x0486, B:159:0x049c, B:161:0x04a5, B:162:0x04aa, B:164:0x04b0, B:165:0x04b5, B:168:0x04c7, B:171:0x04de, B:173:0x04e9, B:174:0x04ee, B:176:0x04f4, B:177:0x04fd, B:179:0x0503, B:180:0x0508, B:183:0x051a, B:185:0x0525, B:186:0x052a, B:188:0x0530, B:191:0x053b, B:193:0x053e, B:195:0x0544, B:198:0x054f, B:200:0x0552, B:202:0x0558, B:204:0x055d, B:210:0x047e, B:212:0x03cd, B:214:0x0566, B:110:0x0361), top: B:109:0x0361 }] */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0405  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x0586  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0265  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x0219 A[Catch: all -> 0x01ad, Exception -> 0x01b3, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x01b3, all -> 0x01ad, blocks: (B:248:0x019c, B:64:0x01c9, B:67:0x01d0, B:68:0x01e1, B:70:0x01e7, B:73:0x01f8, B:78:0x01fc, B:84:0x0229, B:87:0x0230, B:88:0x0241, B:90:0x0247, B:93:0x0258, B:98:0x025c, B:104:0x02e1, B:237:0x0219), top: B:247:0x019c }] */
        /* JADX WARN: Removed duplicated region for block: B:239:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:244:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:255:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x016e A[Catch: Exception -> 0x00d0, all -> 0x011a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d0, blocks: (B:258:0x00c3, B:20:0x00e7, B:22:0x00f2, B:24:0x00f8, B:25:0x00fe, B:27:0x0104, B:29:0x0120, B:30:0x0122, B:32:0x012c, B:33:0x0131, B:40:0x016e, B:17:0x00e0), top: B:257:0x00c3 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01c9 A[Catch: all -> 0x01ad, Exception -> 0x01b3, TRY_ENTER, TryCatch #17 {Exception -> 0x01b3, all -> 0x01ad, blocks: (B:248:0x019c, B:64:0x01c9, B:67:0x01d0, B:68:0x01e1, B:70:0x01e7, B:73:0x01f8, B:78:0x01fc, B:84:0x0229, B:87:0x0230, B:88:0x0241, B:90:0x0247, B:93:0x0258, B:98:0x025c, B:104:0x02e1, B:237:0x0219), top: B:247:0x019c }] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01e7 A[Catch: all -> 0x01ad, Exception -> 0x01b3, TryCatch #17 {Exception -> 0x01b3, all -> 0x01ad, blocks: (B:248:0x019c, B:64:0x01c9, B:67:0x01d0, B:68:0x01e1, B:70:0x01e7, B:73:0x01f8, B:78:0x01fc, B:84:0x0229, B:87:0x0230, B:88:0x0241, B:90:0x0247, B:93:0x0258, B:98:0x025c, B:104:0x02e1, B:237:0x0219), top: B:247:0x019c }] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0229 A[Catch: all -> 0x01ad, Exception -> 0x01b3, TRY_ENTER, TryCatch #17 {Exception -> 0x01b3, all -> 0x01ad, blocks: (B:248:0x019c, B:64:0x01c9, B:67:0x01d0, B:68:0x01e1, B:70:0x01e7, B:73:0x01f8, B:78:0x01fc, B:84:0x0229, B:87:0x0230, B:88:0x0241, B:90:0x0247, B:93:0x0258, B:98:0x025c, B:104:0x02e1, B:237:0x0219), top: B:247:0x019c }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0247 A[Catch: all -> 0x01ad, Exception -> 0x01b3, TryCatch #17 {Exception -> 0x01b3, all -> 0x01ad, blocks: (B:248:0x019c, B:64:0x01c9, B:67:0x01d0, B:68:0x01e1, B:70:0x01e7, B:73:0x01f8, B:78:0x01fc, B:84:0x0229, B:87:0x0230, B:88:0x0241, B:90:0x0247, B:93:0x0258, B:98:0x025c, B:104:0x02e1, B:237:0x0219), top: B:247:0x019c }] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v23 */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Exception exc;
            Mutex mutex;
            CoroutineScope coroutineScope;
            Throwable th2;
            Object obj2;
            Throwable th3;
            CoroutineScope coroutineScope2;
            Mutex mutex2;
            c cVar;
            Throwable th4;
            JSONObject jSONObject;
            List list;
            List m100674J;
            JSONObject jSONObject2;
            String m50671u;
            String m50656f;
            Long m50670t;
            Iterator it;
            Integer m50672v;
            Integer m50658h;
            Integer m50661k;
            Long m50657g;
            Long m50667q;
            Long m50665o;
            Object obj3;
            String m50668r;
            String m50669s;
            Object obj4;
            Object obj5;
            String m50660j;
            Integer m50666p;
            String m50662l;
            Object obj6;
            String m50654d;
            Boolean m50663m;
            Boolean m50664n;
            String m50651a;
            Object obj7;
            Object obj8;
            CoroutineScope coroutineScope3;
            Object obj9;
            c cVar2;
            JSONObject m100673F;
            Map m100749k;
            String str;
            Object obj10;
            Integer m100750l;
            ComplexAds.Config m100739a;
            Mutex mutex3;
            String m100746h;
            Integer m52885e;
            String str2;
            boolean m131196V;
            String m100747i;
            boolean contains;
            String m52856N;
            boolean z11;
            InterfaceC30248b interfaceC30248b;
            ArrayList arrayList;
            ArrayList arrayList2;
            Set<String> keySet;
            String m52904o;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95622w;
            ?? r62 = 2;
            try {
            } catch (Exception e11) {
                exc = e11;
                mutex = r62;
                coroutineScope = coroutineScope2;
            }
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        try {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 == 4) {
                                        mutex = (Mutex) this.f95619t;
                                        coroutineScope = (CoroutineScope) this.f95623x;
                                        try {
                                            AbstractC24862s.m129228b(obj);
                                        } catch (Exception e12) {
                                            exc = e12;
                                            try {
                                                AbstractC20110a.f98889a.mo104548a("zch log video ads view Exception:" + exc.getMessage(), new Object[0]);
                                                coroutineScope2 = coroutineScope;
                                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                                C24848g0 c24848g0 = C24848g0.f119245a;
                                                mutex.mo113890c(null);
                                                return C24848g0.f119245a;
                                            } catch (Throwable th5) {
                                                th3 = th5;
                                                th2 = th3;
                                                obj2 = null;
                                                mutex.mo113890c(obj2);
                                                throw th2;
                                            }
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            obj2 = null;
                                            mutex.mo113890c(obj2);
                                            throw th2;
                                        }
                                        coroutineScope2 = coroutineScope;
                                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                        C24848g0 c24848g02 = C24848g0.f119245a;
                                        mutex.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                list = (List) this.f95621v;
                                jSONObject = (JSONObject) this.f95620u;
                                Mutex mutex4 = (Mutex) this.f95619t;
                                coroutineScope2 = (CoroutineScope) this.f95623x;
                                AbstractC24862s.m129228b(obj);
                                r62 = mutex4;
                                SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
                                m100674J = C19205a.f95429a.m100674J(list, m55587A.getInt("LOG_VIEW_VIDEO_ADS_BATCH", 1));
                                if (!(!m100674J.isEmpty())) {
                                    InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                                    JSONArray jSONArray = new JSONArray();
                                    Iterator it2 = m100674J.iterator();
                                    while (it2.hasNext()) {
                                        LogViewVideo logViewVideo = (LogViewVideo) it2.next();
                                        String m50659i = logViewVideo.m50659i();
                                        if (m50659i != null && m50659i.length() != 0) {
                                            jSONObject2 = new JSONObject(logViewVideo.m50659i());
                                            jSONObject2.put("action_key", "view_video");
                                            m50671u = logViewVideo.m50671u();
                                            if (m50671u != null) {
                                                jSONObject2.put("video_id", m50671u);
                                            }
                                            m50656f = logViewVideo.m50656f();
                                            if (m50656f != null) {
                                                jSONObject2.put("seen_channel_id", m50656f);
                                            }
                                            m50670t = logViewVideo.m50670t();
                                            if (m50670t == null) {
                                                it = it2;
                                                jSONObject2.put("time_buffering", m50670t.longValue());
                                            } else {
                                                it = it2;
                                            }
                                            m50672v = logViewVideo.m50672v();
                                            if (m50672v != null) {
                                                jSONObject2.put("watch_time", m50672v.intValue());
                                            }
                                            m50658h = logViewVideo.m50658h();
                                            if (m50658h != null) {
                                                jSONObject2.put("current_play_time", m50658h.intValue());
                                            }
                                            m50661k = logViewVideo.m50661k();
                                            if (m50661k != null) {
                                                jSONObject2.put("duration", m50661k.intValue());
                                            }
                                            m50657g = logViewVideo.m50657g();
                                            if (m50657g != null) {
                                                jSONObject2.put("comment_count", m50657g.longValue());
                                            }
                                            m50667q = logViewVideo.m50667q();
                                            if (m50667q != null) {
                                                jSONObject2.put("share_count", m50667q.longValue());
                                            }
                                            m50665o = logViewVideo.m50665o();
                                            if (m50665o != null) {
                                                jSONObject2.put("like_count", m50665o.longValue());
                                            }
                                            if (!AbstractC19074t.m100204b(logViewVideo.m50653c(), AbstractC29094b.m145339a(true))) {
                                                jSONObject2.put("allow_share", "1");
                                                jSONObject2.put("share_options", "zmessage, zdinary, copy_link, other");
                                            } else {
                                                jSONObject2.put("allow_share", "0");
                                                jSONObject2.put("share_options", "");
                                            }
                                            JSONObject jSONObject3 = jSONObject;
                                            if (AbstractC19074t.m100204b(logViewVideo.m50652b(), AbstractC29094b.m145339a(true))) {
                                                obj3 = "0";
                                            } else {
                                                obj3 = "1";
                                            }
                                            jSONObject2.put("allow_comment", obj3);
                                            m50668r = logViewVideo.m50668r();
                                            if (m50668r != null) {
                                                jSONObject2.put("source", m50668r);
                                            }
                                            m50669s = logViewVideo.m50669s();
                                            if (m50669s != null) {
                                                jSONObject2.put("source_info", m50669s);
                                            }
                                            if (AbstractC19074t.m100204b(logViewVideo.m50674x(), AbstractC29094b.m145339a(true))) {
                                                obj4 = "0";
                                            } else {
                                                obj4 = "1";
                                            }
                                            jSONObject2.put("is_seen", obj4);
                                            if (AbstractC19074t.m100204b(logViewVideo.m50673w(), AbstractC29094b.m145339a(true))) {
                                                obj5 = "0";
                                            } else {
                                                obj5 = "1";
                                            }
                                            jSONObject2.put("is_looped", obj5);
                                            m50660j = logViewVideo.m50660j();
                                            if (m50660j != null) {
                                                jSONObject2.put("description", m50660j);
                                            }
                                            m50666p = logViewVideo.m50666p();
                                            if (m50666p != null) {
                                                jSONObject2.put("list_index", m50666p.intValue());
                                            }
                                            m50662l = logViewVideo.m50662l();
                                            if (m50662l != null) {
                                                jSONObject2.put("extra", m50662l);
                                            }
                                            if (AbstractC19074t.m100204b(logViewVideo.m50655e(), AbstractC29094b.m145339a(true))) {
                                                obj6 = "0";
                                            } else {
                                                obj6 = "1";
                                            }
                                            jSONObject2.put("is_auto_swipe", obj6);
                                            m50654d = logViewVideo.m50654d();
                                            if (m50654d != null) {
                                                jSONObject2.put("api_extra", m50654d);
                                            }
                                            m50663m = logViewVideo.m50663m();
                                            if (m50663m != null) {
                                                if (!m50663m.booleanValue()) {
                                                    obj8 = "0";
                                                } else {
                                                    obj8 = "1";
                                                }
                                                jSONObject2.put("in_session_disliked_cate", obj8);
                                            }
                                            m50664n = logViewVideo.m50664n();
                                            if (m50664n != null) {
                                                if (!m50664n.booleanValue()) {
                                                    obj7 = "0";
                                                } else {
                                                    obj7 = "1";
                                                }
                                                jSONObject2.put("in_session_disliked_channel", obj7);
                                            }
                                            m50651a = logViewVideo.m50651a();
                                            if (m50651a == null) {
                                                jSONObject2.put("ad_info", m50651a);
                                            }
                                            jSONArray.put(jSONObject2);
                                            it2 = it;
                                            jSONObject = jSONObject3;
                                        }
                                        jSONObject2 = new JSONObject(jSONObject.toString());
                                        jSONObject2.put("action_key", "view_video");
                                        m50671u = logViewVideo.m50671u();
                                        if (m50671u != null) {
                                        }
                                        m50656f = logViewVideo.m50656f();
                                        if (m50656f != null) {
                                        }
                                        m50670t = logViewVideo.m50670t();
                                        if (m50670t == null) {
                                        }
                                        m50672v = logViewVideo.m50672v();
                                        if (m50672v != null) {
                                        }
                                        m50658h = logViewVideo.m50658h();
                                        if (m50658h != null) {
                                        }
                                        m50661k = logViewVideo.m50661k();
                                        if (m50661k != null) {
                                        }
                                        m50657g = logViewVideo.m50657g();
                                        if (m50657g != null) {
                                        }
                                        m50667q = logViewVideo.m50667q();
                                        if (m50667q != null) {
                                        }
                                        m50665o = logViewVideo.m50665o();
                                        if (m50665o != null) {
                                        }
                                        if (!AbstractC19074t.m100204b(logViewVideo.m50653c(), AbstractC29094b.m145339a(true))) {
                                        }
                                        JSONObject jSONObject32 = jSONObject;
                                        if (AbstractC19074t.m100204b(logViewVideo.m50652b(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("allow_comment", obj3);
                                        m50668r = logViewVideo.m50668r();
                                        if (m50668r != null) {
                                        }
                                        m50669s = logViewVideo.m50669s();
                                        if (m50669s != null) {
                                        }
                                        if (AbstractC19074t.m100204b(logViewVideo.m50674x(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("is_seen", obj4);
                                        if (AbstractC19074t.m100204b(logViewVideo.m50673w(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("is_looped", obj5);
                                        m50660j = logViewVideo.m50660j();
                                        if (m50660j != null) {
                                        }
                                        m50666p = logViewVideo.m50666p();
                                        if (m50666p != null) {
                                        }
                                        m50662l = logViewVideo.m50662l();
                                        if (m50662l != null) {
                                        }
                                        if (AbstractC19074t.m100204b(logViewVideo.m50655e(), AbstractC29094b.m145339a(true))) {
                                        }
                                        jSONObject2.put("is_auto_swipe", obj6);
                                        m50654d = logViewVideo.m50654d();
                                        if (m50654d != null) {
                                        }
                                        m50663m = logViewVideo.m50663m();
                                        if (m50663m != null) {
                                        }
                                        m50664n = logViewVideo.m50664n();
                                        if (m50664n != null) {
                                        }
                                        m50651a = logViewVideo.m50651a();
                                        if (m50651a == null) {
                                        }
                                        jSONArray.put(jSONObject2);
                                        it2 = it;
                                        jSONObject = jSONObject32;
                                    }
                                    a aVar = new a(m143667D, jSONArray, m55587A, null);
                                    this.f95623x = coroutineScope2;
                                    this.f95619t = r62;
                                    this.f95620u = null;
                                    this.f95621v = null;
                                    this.f95622w = 4;
                                    if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                                        return m142578e;
                                    }
                                    mutex = r62;
                                    coroutineScope = coroutineScope2;
                                    coroutineScope2 = coroutineScope;
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g022 = C24848g0.f119245a;
                                    mutex.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                                mutex = r62;
                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                C24848g0 c24848g0222 = C24848g0.f119245a;
                                mutex.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            cVar2 = (c) this.f95620u;
                            Mutex mutex5 = (Mutex) this.f95619t;
                            CoroutineScope coroutineScope4 = (CoroutineScope) this.f95623x;
                            AbstractC24862s.m129228b(obj);
                            coroutineScope3 = coroutineScope4;
                            mutex2 = mutex5;
                            obj9 = obj;
                            try {
                                List list2 = (List) obj9;
                                m100673F = C19205a.f95429a.m100673F();
                                m100749k = cVar2.m100749k();
                                if (m100749k != null) {
                                    try {
                                        try {
                                        } catch (Throwable th7) {
                                            th2 = th7;
                                            obj2 = null;
                                            mutex = mutex2;
                                            mutex.mo113890c(obj2);
                                            throw th2;
                                        }
                                    } catch (Exception e13) {
                                        exc = e13;
                                        mutex = mutex2;
                                        coroutineScope = coroutineScope3;
                                        AbstractC20110a.f98889a.mo104548a("zch log video ads view Exception:" + exc.getMessage(), new Object[0]);
                                        coroutineScope2 = coroutineScope;
                                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                        C24848g0 c24848g02222 = C24848g0.f119245a;
                                        mutex.mo113890c(null);
                                        return C24848g0.f119245a;
                                    }
                                }
                                m52904o = cVar2.m100752n().m52904o();
                            } catch (Exception e14) {
                                e = e14;
                                r62 = mutex2;
                            } catch (Throwable th8) {
                                th4 = th8;
                                r62 = mutex2;
                            }
                            try {
                                try {
                                    if (m52904o != null) {
                                        if (m52904o.length() != 0) {
                                        }
                                        JSONObject jSONObject4 = new JSONObject();
                                        Map m100749k2 = cVar2.m100749k();
                                        if (m100749k2 != null && (keySet = m100749k2.keySet()) != null) {
                                            for (String str3 : keySet) {
                                                jSONObject4.put(str3, cVar2.m100749k().get(str3));
                                            }
                                            C24848g0 c24848g03 = C24848g0.f119245a;
                                        }
                                        String m52904o2 = cVar2.m100752n().m52904o();
                                        if (m52904o2 != null) {
                                            jSONObject4.put("related_video_id", m52904o2);
                                        }
                                        str = jSONObject4.toString();
                                        JSONObject jSONObject5 = new JSONObject();
                                        jSONObject5.put("ad_id", cVar2.m100740b());
                                        jSONObject5.put("ad_src", cVar2.m100743e());
                                        if (!cVar2.m100742d()) {
                                            obj10 = "0";
                                        } else {
                                            obj10 = "1";
                                        }
                                        jSONObject5.put("ad_manual_replay", obj10);
                                        jSONObject5.put("ad_index", cVar2.m100741c());
                                        m100750l = cVar2.m100750l();
                                        if (m100750l != null) {
                                            jSONObject5.put("num_showed_ad", m100750l.intValue());
                                        }
                                        m100739a = cVar2.m100739a();
                                        if (m100739a != null) {
                                            try {
                                                jSONObject5.put("minDistance", m100739a.m50883c());
                                                jSONObject5.put("distanceForceShowAds", m100739a.m50881a());
                                                jSONObject5.put("numVideosHappy", m100739a.m50884d());
                                                mutex3 = mutex2;
                                            } catch (Exception e15) {
                                                e = e15;
                                                mutex3 = mutex2;
                                                mutex = mutex3;
                                                exc = e;
                                                coroutineScope = coroutineScope3;
                                                AbstractC20110a.f98889a.mo104548a("zch log video ads view Exception:" + exc.getMessage(), new Object[0]);
                                                coroutineScope2 = coroutineScope;
                                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                                C24848g0 c24848g022222 = C24848g0.f119245a;
                                                mutex.mo113890c(null);
                                                return C24848g0.f119245a;
                                            } catch (Throwable th9) {
                                                th3 = th9;
                                                mutex3 = mutex2;
                                                mutex = mutex3;
                                                th2 = th3;
                                                obj2 = null;
                                                mutex.mo113890c(obj2);
                                                throw th2;
                                            }
                                            try {
                                                jSONObject5.put("videoWatchTimeHappy", m100739a.m50885e());
                                                jSONObject5.put("distanceRecheckAds", m100739a.m50882b());
                                            } catch (Exception e16) {
                                                e = e16;
                                                mutex = mutex3;
                                                exc = e;
                                                coroutineScope = coroutineScope3;
                                                AbstractC20110a.f98889a.mo104548a("zch log video ads view Exception:" + exc.getMessage(), new Object[0]);
                                                coroutineScope2 = coroutineScope;
                                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                                C24848g0 c24848g0222222 = C24848g0.f119245a;
                                                mutex.mo113890c(null);
                                                return C24848g0.f119245a;
                                            } catch (Throwable th10) {
                                                th3 = th10;
                                                mutex = mutex3;
                                                th2 = th3;
                                                obj2 = null;
                                                mutex.mo113890c(obj2);
                                                throw th2;
                                            }
                                        } else {
                                            mutex3 = mutex2;
                                        }
                                        m100746h = cVar2.m100746h();
                                        if (m100746h != null && m100746h.length() != 0) {
                                            List m100710H = C19205a.f95429a.m100710H();
                                            arrayList2 = new ArrayList();
                                            for (Object obj11 : m100710H) {
                                                if (AbstractC19074t.m100204b((String) obj11, cVar2.m100746h())) {
                                                    arrayList2.add(obj11);
                                                }
                                            }
                                            if (arrayList2.size() <= 1) {
                                                m131196V = true;
                                            } else {
                                                m131196V = false;
                                            }
                                            m100747i = cVar2.m100747i();
                                            if (m100747i != null && m100747i.length() != 0) {
                                                List m100709G = C19205a.f95429a.m100709G();
                                                arrayList = new ArrayList();
                                                for (Object obj12 : m100709G) {
                                                    if (AbstractC19074t.m100204b((String) obj12, cVar2.m100747i())) {
                                                        arrayList.add(obj12);
                                                    }
                                                }
                                                if (arrayList.size() <= 1) {
                                                    contains = true;
                                                } else {
                                                    contains = false;
                                                }
                                                String m52911t = cVar2.m100752n().m52911t();
                                                String m50769l = cVar2.m100752n().m52887f().m50769l();
                                                Long m145342d = AbstractC29094b.m145342d(cVar2.m100751m());
                                                Integer m145341c = AbstractC29094b.m145341c(cVar2.m100753o());
                                                Integer m145341c2 = AbstractC29094b.m145341c(cVar2.m100745g());
                                                Integer m145341c3 = AbstractC29094b.m145341c(cVar2.m100748j());
                                                Long m145342d2 = AbstractC29094b.m145342d(cVar2.m100752n().m52837C());
                                                Long m145342d3 = AbstractC29094b.m145342d(cVar2.m100752n().m52842F());
                                                Long m145342d4 = AbstractC29094b.m145342d(cVar2.m100752n().m52839D());
                                                m52856N = cVar2.m100752n().m52856N();
                                                if (m52856N != null) {
                                                    if (m52856N.length() != 0) {
                                                        z11 = true;
                                                        LogViewVideo logViewVideo2 = new LogViewVideo(m52911t, m50769l, m145342d, m145341c, m145341c2, m145341c3, m145342d2, m145342d3, m145342d4, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject5.toString());
                                                        list = AbstractC25332a0.m131187O0(list2);
                                                        list.add(0, logViewVideo2);
                                                        interfaceC30248b = C19205a.f95436h;
                                                        this.f95623x = coroutineScope3;
                                                        r62 = mutex3;
                                                        this.f95619t = r62;
                                                        this.f95620u = m100673F;
                                                        this.f95621v = list;
                                                        this.f95622w = 3;
                                                        if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                                                            return m142578e;
                                                        }
                                                        coroutineScope2 = coroutineScope3;
                                                        jSONObject = m100673F;
                                                        r62 = r62;
                                                        SharedPreferences m55587A2 = C10631i.Companion.m55602a().m55587A();
                                                        m100674J = C19205a.f95429a.m100674J(list, m55587A2.getInt("LOG_VIEW_VIDEO_ADS_BATCH", 1));
                                                        if (!(!m100674J.isEmpty())) {
                                                        }
                                                    }
                                                }
                                                z11 = false;
                                                LogViewVideo logViewVideo22 = new LogViewVideo(m52911t, m50769l, m145342d, m145341c, m145341c2, m145341c3, m145342d2, m145342d3, m145342d4, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject5.toString());
                                                list = AbstractC25332a0.m131187O0(list2);
                                                list.add(0, logViewVideo22);
                                                interfaceC30248b = C19205a.f95436h;
                                                this.f95623x = coroutineScope3;
                                                r62 = mutex3;
                                                this.f95619t = r62;
                                                this.f95620u = m100673F;
                                                this.f95621v = list;
                                                this.f95622w = 3;
                                                if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                                                }
                                            }
                                            contains = C19205a.f95429a.m100709G().contains(cVar2.m100752n().m52887f().m50769l());
                                            String m52911t2 = cVar2.m100752n().m52911t();
                                            String m50769l2 = cVar2.m100752n().m52887f().m50769l();
                                            Long m145342d5 = AbstractC29094b.m145342d(cVar2.m100751m());
                                            Integer m145341c4 = AbstractC29094b.m145341c(cVar2.m100753o());
                                            Integer m145341c22 = AbstractC29094b.m145341c(cVar2.m100745g());
                                            Integer m145341c32 = AbstractC29094b.m145341c(cVar2.m100748j());
                                            Long m145342d22 = AbstractC29094b.m145342d(cVar2.m100752n().m52837C());
                                            Long m145342d32 = AbstractC29094b.m145342d(cVar2.m100752n().m52842F());
                                            Long m145342d42 = AbstractC29094b.m145342d(cVar2.m100752n().m52839D());
                                            m52856N = cVar2.m100752n().m52856N();
                                            if (m52856N != null) {
                                            }
                                            z11 = false;
                                            LogViewVideo logViewVideo222 = new LogViewVideo(m52911t2, m50769l2, m145342d5, m145341c4, m145341c22, m145341c32, m145342d22, m145342d32, m145342d42, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject5.toString());
                                            list = AbstractC25332a0.m131187O0(list2);
                                            list.add(0, logViewVideo222);
                                            interfaceC30248b = C19205a.f95436h;
                                            this.f95623x = coroutineScope3;
                                            r62 = mutex3;
                                            this.f95619t = r62;
                                            this.f95620u = m100673F;
                                            this.f95621v = list;
                                            this.f95622w = 3;
                                            if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                                            }
                                        }
                                        List m100710H2 = C19205a.f95429a.m100710H();
                                        m52885e = cVar2.m100752n().m52885e();
                                        if (m52885e != null) {
                                            str2 = m52885e.toString();
                                        } else {
                                            str2 = null;
                                        }
                                        m131196V = AbstractC25332a0.m131196V(m100710H2, str2);
                                        m100747i = cVar2.m100747i();
                                        if (m100747i != null) {
                                            List m100709G2 = C19205a.f95429a.m100709G();
                                            arrayList = new ArrayList();
                                            while (r10.hasNext()) {
                                            }
                                            if (arrayList.size() <= 1) {
                                            }
                                            String m52911t22 = cVar2.m100752n().m52911t();
                                            String m50769l22 = cVar2.m100752n().m52887f().m50769l();
                                            Long m145342d52 = AbstractC29094b.m145342d(cVar2.m100751m());
                                            Integer m145341c42 = AbstractC29094b.m145341c(cVar2.m100753o());
                                            Integer m145341c222 = AbstractC29094b.m145341c(cVar2.m100745g());
                                            Integer m145341c322 = AbstractC29094b.m145341c(cVar2.m100748j());
                                            Long m145342d222 = AbstractC29094b.m145342d(cVar2.m100752n().m52837C());
                                            Long m145342d322 = AbstractC29094b.m145342d(cVar2.m100752n().m52842F());
                                            Long m145342d422 = AbstractC29094b.m145342d(cVar2.m100752n().m52839D());
                                            m52856N = cVar2.m100752n().m52856N();
                                            if (m52856N != null) {
                                            }
                                            z11 = false;
                                            LogViewVideo logViewVideo2222 = new LogViewVideo(m52911t22, m50769l22, m145342d52, m145341c42, m145341c222, m145341c322, m145342d222, m145342d322, m145342d422, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject5.toString());
                                            list = AbstractC25332a0.m131187O0(list2);
                                            list.add(0, logViewVideo2222);
                                            interfaceC30248b = C19205a.f95436h;
                                            this.f95623x = coroutineScope3;
                                            r62 = mutex3;
                                            this.f95619t = r62;
                                            this.f95620u = m100673F;
                                            this.f95621v = list;
                                            this.f95622w = 3;
                                            if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                                            }
                                        }
                                        contains = C19205a.f95429a.m100709G().contains(cVar2.m100752n().m52887f().m50769l());
                                        String m52911t222 = cVar2.m100752n().m52911t();
                                        String m50769l222 = cVar2.m100752n().m52887f().m50769l();
                                        Long m145342d522 = AbstractC29094b.m145342d(cVar2.m100751m());
                                        Integer m145341c422 = AbstractC29094b.m145341c(cVar2.m100753o());
                                        Integer m145341c2222 = AbstractC29094b.m145341c(cVar2.m100745g());
                                        Integer m145341c3222 = AbstractC29094b.m145341c(cVar2.m100748j());
                                        Long m145342d2222 = AbstractC29094b.m145342d(cVar2.m100752n().m52837C());
                                        Long m145342d3222 = AbstractC29094b.m145342d(cVar2.m100752n().m52842F());
                                        Long m145342d4222 = AbstractC29094b.m145342d(cVar2.m100752n().m52839D());
                                        m52856N = cVar2.m100752n().m52856N();
                                        if (m52856N != null) {
                                        }
                                        z11 = false;
                                        LogViewVideo logViewVideo22222 = new LogViewVideo(m52911t222, m50769l222, m145342d522, m145341c422, m145341c2222, m145341c3222, m145342d2222, m145342d3222, m145342d4222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject5.toString());
                                        list = AbstractC25332a0.m131187O0(list2);
                                        list.add(0, logViewVideo22222);
                                        interfaceC30248b = C19205a.f95436h;
                                        this.f95623x = coroutineScope3;
                                        r62 = mutex3;
                                        this.f95619t = r62;
                                        this.f95620u = m100673F;
                                        this.f95621v = list;
                                        this.f95622w = 3;
                                        if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                                        }
                                    }
                                    if (m100746h != null) {
                                        List m100710H3 = C19205a.f95429a.m100710H();
                                        arrayList2 = new ArrayList();
                                        while (r5.hasNext()) {
                                        }
                                        if (arrayList2.size() <= 1) {
                                        }
                                        m100747i = cVar2.m100747i();
                                        if (m100747i != null) {
                                        }
                                        contains = C19205a.f95429a.m100709G().contains(cVar2.m100752n().m52887f().m50769l());
                                        String m52911t2222 = cVar2.m100752n().m52911t();
                                        String m50769l2222 = cVar2.m100752n().m52887f().m50769l();
                                        Long m145342d5222 = AbstractC29094b.m145342d(cVar2.m100751m());
                                        Integer m145341c4222 = AbstractC29094b.m145341c(cVar2.m100753o());
                                        Integer m145341c22222 = AbstractC29094b.m145341c(cVar2.m100745g());
                                        Integer m145341c32222 = AbstractC29094b.m145341c(cVar2.m100748j());
                                        Long m145342d22222 = AbstractC29094b.m145342d(cVar2.m100752n().m52837C());
                                        Long m145342d32222 = AbstractC29094b.m145342d(cVar2.m100752n().m52842F());
                                        Long m145342d42222 = AbstractC29094b.m145342d(cVar2.m100752n().m52839D());
                                        m52856N = cVar2.m100752n().m52856N();
                                        if (m52856N != null) {
                                        }
                                        z11 = false;
                                        LogViewVideo logViewVideo222222 = new LogViewVideo(m52911t2222, m50769l2222, m145342d5222, m145341c4222, m145341c22222, m145341c32222, m145342d22222, m145342d32222, m145342d42222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject5.toString());
                                        list = AbstractC25332a0.m131187O0(list2);
                                        list.add(0, logViewVideo222222);
                                        interfaceC30248b = C19205a.f95436h;
                                        this.f95623x = coroutineScope3;
                                        r62 = mutex3;
                                        this.f95619t = r62;
                                        this.f95620u = m100673F;
                                        this.f95621v = list;
                                        this.f95622w = 3;
                                        if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                                        }
                                    }
                                    this.f95619t = r62;
                                    this.f95620u = m100673F;
                                    this.f95621v = list;
                                    this.f95622w = 3;
                                    if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                    exc = e;
                                    mutex = r62;
                                    coroutineScope = coroutineScope3;
                                    AbstractC20110a.f98889a.mo104548a("zch log video ads view Exception:" + exc.getMessage(), new Object[0]);
                                    coroutineScope2 = coroutineScope;
                                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                    C24848g0 c24848g02222222 = C24848g0.f119245a;
                                    mutex.mo113890c(null);
                                    return C24848g0.f119245a;
                                }
                            } catch (Throwable th11) {
                                th4 = th11;
                                th2 = th4;
                                mutex = r62;
                                obj2 = null;
                                mutex.mo113890c(obj2);
                                throw th2;
                            }
                            str = null;
                            JSONObject jSONObject52 = new JSONObject();
                            jSONObject52.put("ad_id", cVar2.m100740b());
                            jSONObject52.put("ad_src", cVar2.m100743e());
                            if (!cVar2.m100742d()) {
                            }
                            jSONObject52.put("ad_manual_replay", obj10);
                            jSONObject52.put("ad_index", cVar2.m100741c());
                            m100750l = cVar2.m100750l();
                            if (m100750l != null) {
                            }
                            m100739a = cVar2.m100739a();
                            if (m100739a != null) {
                            }
                            m100746h = cVar2.m100746h();
                            List m100710H22 = C19205a.f95429a.m100710H();
                            m52885e = cVar2.m100752n().m52885e();
                            if (m52885e != null) {
                            }
                            m131196V = AbstractC25332a0.m131196V(m100710H22, str2);
                            m100747i = cVar2.m100747i();
                            if (m100747i != null) {
                            }
                            contains = C19205a.f95429a.m100709G().contains(cVar2.m100752n().m52887f().m50769l());
                            String m52911t22222 = cVar2.m100752n().m52911t();
                            String m50769l22222 = cVar2.m100752n().m52887f().m50769l();
                            Long m145342d52222 = AbstractC29094b.m145342d(cVar2.m100751m());
                            Integer m145341c42222 = AbstractC29094b.m145341c(cVar2.m100753o());
                            Integer m145341c222222 = AbstractC29094b.m145341c(cVar2.m100745g());
                            Integer m145341c322222 = AbstractC29094b.m145341c(cVar2.m100748j());
                            Long m145342d222222 = AbstractC29094b.m145342d(cVar2.m100752n().m52837C());
                            Long m145342d322222 = AbstractC29094b.m145342d(cVar2.m100752n().m52842F());
                            Long m145342d422222 = AbstractC29094b.m145342d(cVar2.m100752n().m52839D());
                            m52856N = cVar2.m100752n().m52856N();
                            if (m52856N != null) {
                            }
                            z11 = false;
                            LogViewVideo logViewVideo2222222 = new LogViewVideo(m52911t22222, m50769l22222, m145342d52222, m145341c42222, m145341c222222, m145341c322222, m145342d222222, m145342d322222, m145342d422222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject52.toString());
                            list = AbstractC25332a0.m131187O0(list2);
                            list.add(0, logViewVideo2222222);
                            interfaceC30248b = C19205a.f95436h;
                            this.f95623x = coroutineScope3;
                            r62 = mutex3;
                        } catch (Throwable th12) {
                            th2 = th12;
                            mutex = 2;
                        }
                    } else {
                        c cVar3 = (c) this.f95620u;
                        mutex2 = (Mutex) this.f95619t;
                        CoroutineScope coroutineScope5 = (CoroutineScope) this.f95623x;
                        AbstractC24862s.m129228b(obj);
                        cVar = cVar3;
                        coroutineScope = coroutineScope5;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f95623x;
                    mutex2 = C19205a.f95445q;
                    cVar = this.f95624y;
                    this.f95623x = coroutineScope;
                    this.f95619t = mutex2;
                    this.f95620u = cVar;
                    this.f95622w = 1;
                    if (mutex2.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                }
                InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                this.f95623x = coroutineScope;
                this.f95619t = mutex2;
                this.f95620u = cVar;
                this.f95622w = 2;
                obj9 = interfaceC30248b2.mo50566q(this);
                if (obj9 == m142578e) {
                    return m142578e;
                }
                c cVar4 = cVar;
                coroutineScope3 = coroutineScope;
                cVar2 = cVar4;
                List list22 = (List) obj9;
                m100673F = C19205a.f95429a.m100673F();
                m100749k = cVar2.m100749k();
                if (m100749k != null) {
                }
                m52904o = cVar2.m100752n().m52904o();
                if (m52904o != null) {
                }
                str = null;
                JSONObject jSONObject522 = new JSONObject();
                jSONObject522.put("ad_id", cVar2.m100740b());
                jSONObject522.put("ad_src", cVar2.m100743e());
                if (!cVar2.m100742d()) {
                }
                jSONObject522.put("ad_manual_replay", obj10);
                jSONObject522.put("ad_index", cVar2.m100741c());
                m100750l = cVar2.m100750l();
                if (m100750l != null) {
                }
                m100739a = cVar2.m100739a();
                if (m100739a != null) {
                }
                m100746h = cVar2.m100746h();
                if (m100746h != null) {
                }
                List m100710H222 = C19205a.f95429a.m100710H();
                m52885e = cVar2.m100752n().m52885e();
                if (m52885e != null) {
                }
                m131196V = AbstractC25332a0.m131196V(m100710H222, str2);
                m100747i = cVar2.m100747i();
                if (m100747i != null) {
                }
                contains = C19205a.f95429a.m100709G().contains(cVar2.m100752n().m52887f().m50769l());
                String m52911t222222 = cVar2.m100752n().m52911t();
                String m50769l222222 = cVar2.m100752n().m52887f().m50769l();
                Long m145342d522222 = AbstractC29094b.m145342d(cVar2.m100751m());
                Integer m145341c422222 = AbstractC29094b.m145341c(cVar2.m100753o());
                Integer m145341c2222222 = AbstractC29094b.m145341c(cVar2.m100745g());
                Integer m145341c3222222 = AbstractC29094b.m145341c(cVar2.m100748j());
                Long m145342d2222222 = AbstractC29094b.m145342d(cVar2.m100752n().m52837C());
                Long m145342d3222222 = AbstractC29094b.m145342d(cVar2.m100752n().m52842F());
                Long m145342d4222222 = AbstractC29094b.m145342d(cVar2.m100752n().m52839D());
                m52856N = cVar2.m100752n().m52856N();
                if (m52856N != null) {
                }
                z11 = false;
                LogViewVideo logViewVideo22222222 = new LogViewVideo(m52911t222222, m50769l222222, m145342d522222, m145341c422222, m145341c2222222, m145341c3222222, m145342d2222222, m145342d3222222, m145342d4222222, AbstractC29094b.m145339a(z11), AbstractC29094b.m145339a(!cVar2.m100752n().m52886e0()), cVar2.m100752n().m52858O(), cVar2.m100752n().m52861Q(), AbstractC29094b.m145339a(false), AbstractC29094b.m145339a(cVar2.m100754p()), cVar2.m100752n().m52894j(), cVar2.m100752n().m52919y(), AbstractC29094b.m145339a(cVar2.m100744f()), str, m100673F.toString(), cVar2.m100752n().m52896k(), AbstractC29094b.m145339a(m131196V), AbstractC29094b.m145339a(contains), jSONObject522.toString());
                list = AbstractC25332a0.m131187O0(list22);
                list.add(0, logViewVideo22222222);
                interfaceC30248b = C19205a.f95436h;
                this.f95623x = coroutineScope3;
                r62 = mutex3;
                this.f95619t = r62;
                this.f95620u = m100673F;
                this.f95621v = list;
                this.f95622w = 3;
                if (interfaceC30248b.mo50539B(list, this) != m142578e) {
                }
            } catch (Throwable th13) {
                th2 = th13;
                mutex = mutex2;
                obj2 = null;
                mutex.mo113890c(obj2);
                throw th2;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$q */
    /* loaded from: classes5.dex */
    public static final class q extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f95629t;

        /* renamed from: u */
        private /* synthetic */ Object f95630u;

        q(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            q qVar = new q(continuation);
            qVar.f95630u = obj;
            return qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            Object mo50555g;
            List m131187O0;
            List m131185M0;
            List m131185M02;
            LinkedHashSet linkedHashSet;
            int i11;
            int i12;
            int i13;
            int i14;
            List m131187O02;
            m142578e = AbstractC28298d.m142578e();
            ?? r22 = this.f95629t;
            try {
            } catch (Exception unused) {
                coroutineScope = r22;
            }
            if (r22 != 0) {
                if (r22 != 1) {
                    if (r22 == 2) {
                        coroutineScope = (CoroutineScope) this.f95630u;
                        try {
                            AbstractC24862s.m129228b(obj);
                            C19205a.f95429a.m100704z();
                        } catch (Exception unused2) {
                        }
                        CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f95630u;
                AbstractC24862s.m129228b(obj);
                mo50555g = obj;
                r22 = coroutineScope2;
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f95630u;
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                this.f95630u = coroutineScope3;
                this.f95629t = 1;
                mo50555g = interfaceC30248b.mo50555g(this);
                r22 = coroutineScope3;
                if (mo50555g == m142578e) {
                    return m142578e;
                }
            }
            m131187O0 = AbstractC25332a0.m131187O0((Collection) mo50555g);
            C19205a c19205a = C19205a.f95429a;
            JSONObject m100673F = c19205a.m100673F();
            LogSession logSession = new LogSession(AbstractC29094b.m145342d(C19205a.f95431c), AbstractC29094b.m145342d(C27417l.f129055a.m140382f().m130131a()), AbstractC29094b.m145341c(C19205a.f95432d), AbstractC29094b.m145341c(C19205a.f95433e), AbstractC29094b.m145341c(C19205a.f95434f), AbstractC29094b.m145341c(C19205a.f95435g), m100673F.toString(), C19205a.f95437i, c19205a.m100710H(), c19205a.m100709G(), AbstractC29094b.m145342d(ZMediaPlayer.getCellularData(6)), C26947a.Companion.m138840e());
            if (m131187O0.isEmpty()) {
                m131187O0 = AbstractC25366r.m131496e(logSession);
            } else {
                ArrayList<LogSession> arrayList = new ArrayList();
                for (Object obj2 : m131187O0) {
                    if (AbstractC19074t.m100204b(((LogSession) obj2).m50617h(), C19205a.f95437i)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    m131187O0.add(0, logSession);
                } else {
                    C19057i0 c19057i0 = new C19057i0();
                    c19057i0.f94939p = C19205a.f95431c;
                    C19055h0 c19055h0 = new C19055h0();
                    c19055h0.f94931p = C19205a.f95432d;
                    C19055h0 c19055h02 = new C19055h0();
                    c19055h02.f94931p = C19205a.f95433e;
                    C19055h0 c19055h03 = new C19055h0();
                    c19055h03.f94931p = C19205a.f95434f;
                    C19055h0 c19055h04 = new C19055h0();
                    c19055h04.f94931p = C19205a.f95435g;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    C19205a c19205a2 = C19205a.f95429a;
                    linkedHashSet2.addAll(c19205a2.m100710H());
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    linkedHashSet3.addAll(c19205a2.m100709G());
                    for (LogSession logSession2 : arrayList) {
                        if (logSession2.m50618i() != null) {
                            linkedHashSet = linkedHashSet3;
                            if (logSession2.m50618i().longValue() < c19057i0.f94939p) {
                                c19057i0.f94939p = logSession2.m50618i().longValue();
                            }
                        } else {
                            linkedHashSet = linkedHashSet3;
                        }
                        int i15 = c19055h0.f94931p;
                        Integer m50621l = logSession2.m50621l();
                        if (m50621l != null) {
                            i11 = m50621l.intValue();
                        } else {
                            i11 = 0;
                        }
                        c19055h0.f94931p = i15 + i11;
                        int i16 = c19055h02.f94931p;
                        Integer m50619j = logSession2.m50619j();
                        if (m50619j != null) {
                            i12 = m50619j.intValue();
                        } else {
                            i12 = 0;
                        }
                        c19055h02.f94931p = i16 + i12;
                        int i17 = c19055h03.f94931p;
                        Integer m50620k = logSession2.m50620k();
                        if (m50620k != null) {
                            i13 = m50620k.intValue();
                        } else {
                            i13 = 0;
                        }
                        c19055h03.f94931p = i17 + i13;
                        int i18 = c19055h04.f94931p;
                        Integer m50622m = logSession2.m50622m();
                        if (m50622m != null) {
                            i14 = m50622m.intValue();
                        } else {
                            i14 = 0;
                        }
                        c19055h04.f94931p = i18 + i14;
                        List m50614e = logSession2.m50614e();
                        if (m50614e != null) {
                            AbstractC29094b.m145339a(linkedHashSet2.addAll(m50614e));
                        }
                        List m50615f = logSession2.m50615f();
                        if (m50615f != null) {
                            linkedHashSet3 = linkedHashSet;
                            AbstractC29094b.m145339a(linkedHashSet3.addAll(m50615f));
                        } else {
                            linkedHashSet3 = linkedHashSet;
                        }
                        m131187O0.remove(logSession2);
                    }
                    Long m145342d = AbstractC29094b.m145342d(c19057i0.f94939p);
                    Long m145342d2 = AbstractC29094b.m145342d(C27417l.f129055a.m140382f().m130131a());
                    Integer m145341c = AbstractC29094b.m145341c(c19055h0.f94931p);
                    Integer m145341c2 = AbstractC29094b.m145341c(c19055h02.f94931p);
                    Integer m145341c3 = AbstractC29094b.m145341c(c19055h03.f94931p);
                    Integer m145341c4 = AbstractC29094b.m145341c(c19055h04.f94931p);
                    String jSONObject = m100673F.toString();
                    String str = C19205a.f95437i;
                    m131185M0 = AbstractC25332a0.m131185M0(linkedHashSet2);
                    m131185M02 = AbstractC25332a0.m131185M0(linkedHashSet3);
                    m131187O0.add(0, new LogSession(m145342d, m145342d2, m145341c, m145341c2, m145341c3, m145341c4, jSONObject, str, m131185M0, m131185M02, AbstractC29094b.m145342d(ZMediaPlayer.getCellularData(6)), C26947a.Companion.m138840e()));
                }
            }
            m131187O02 = AbstractC25332a0.m131187O0(m131187O0);
            InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
            this.f95630u = r22;
            this.f95629t = 2;
            if (interfaceC30248b2.mo50542E(m131187O02, this) == m142578e) {
                return m142578e;
            }
            coroutineScope = r22;
            C19205a.f95429a.m100704z();
            CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$r */
    /* loaded from: classes5.dex */
    public static final class r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95631t;

        /* renamed from: u */
        Object f95632u;

        /* renamed from: v */
        Object f95633v;

        /* renamed from: w */
        int f95634w;

        /* renamed from: x */
        private /* synthetic */ Object f95635x;

        /* renamed from: g20.a$r$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95636t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95637u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95638v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, Continuation continuation) {
                super(2, continuation);
                this.f95637u = interfaceC18170g;
                this.f95638v = jSONArray;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95637u, this.f95638v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95636t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            AbstractC20110a.f98889a.mo104548a("zch log active " + this.f95638v, new Object[0]);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = this.f95637u;
                    String jSONArray = this.f95638v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95468t;
                    this.f95636t = 1;
                    if (interfaceC18170g.mo96569P(jSONArray, bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                this.f95636t = 2;
                if (interfaceC30248b.mo50575z(this) == m142578e) {
                    return m142578e;
                }
                AbstractC20110a.f98889a.mo104548a("zch log active " + this.f95638v, new Object[0]);
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            r rVar = new r(continuation);
            rVar.f95635x = obj;
            return rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0126 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            CoroutineScope coroutineScope;
            Exception e11;
            InterfaceC18170g m143667D;
            JSONArray jSONArray;
            CoroutineScope coroutineScope2;
            Object mo50557i;
            JSONObject jSONObject3;
            Exception exc;
            List m131187O0;
            InterfaceC30248b interfaceC30248b;
            Exception exc2;
            CoroutineScope coroutineScope3;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f95634w;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                exc2 = (Exception) this.f95631t;
                                coroutineScope3 = (CoroutineScope) this.f95635x;
                                AbstractC24862s.m129228b(obj);
                                AbstractC20110a.f98889a.mo104548a("zch log active ex:" + exc2, new Object[0]);
                                coroutineScope = coroutineScope3;
                                CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        exc = (Exception) this.f95632u;
                        jSONObject3 = (JSONObject) this.f95631t;
                        coroutineScope = (CoroutineScope) this.f95635x;
                        AbstractC24862s.m129228b(obj);
                        LogActive logActive = new LogActive(jSONObject3.toString());
                        m131187O0 = AbstractC25332a0.m131187O0((List) obj);
                        m131187O0.add(0, logActive);
                        interfaceC30248b = C19205a.f95436h;
                        this.f95635x = coroutineScope;
                        this.f95631t = exc;
                        this.f95632u = null;
                        this.f95634w = 4;
                        if (interfaceC30248b.mo50564p(m131187O0, this) != m142578e) {
                            return m142578e;
                        }
                        exc2 = exc;
                        coroutineScope3 = coroutineScope;
                        AbstractC20110a.f98889a.mo104548a("zch log active ex:" + exc2, new Object[0]);
                        coroutineScope = coroutineScope3;
                        CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                        return C24848g0.f119245a;
                    }
                    JSONObject jSONObject4 = (JSONObject) this.f95631t;
                    coroutineScope = (CoroutineScope) this.f95635x;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Exception e12) {
                        e11 = e12;
                        jSONObject2 = jSONObject4;
                        InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                        this.f95635x = coroutineScope;
                        this.f95631t = jSONObject2;
                        this.f95632u = e11;
                        this.f95633v = null;
                        this.f95634w = 3;
                        mo50557i = interfaceC30248b2.mo50557i(this);
                        if (mo50557i == m142578e) {
                            return m142578e;
                        }
                        jSONObject3 = jSONObject2;
                        exc = e11;
                        obj = mo50557i;
                        LogActive logActive2 = new LogActive(jSONObject3.toString());
                        m131187O0 = AbstractC25332a0.m131187O0((List) obj);
                        m131187O0.add(0, logActive2);
                        interfaceC30248b = C19205a.f95436h;
                        this.f95635x = coroutineScope;
                        this.f95631t = exc;
                        this.f95632u = null;
                        this.f95634w = 4;
                        if (interfaceC30248b.mo50564p(m131187O0, this) != m142578e) {
                        }
                    }
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                    return C24848g0.f119245a;
                }
                jSONArray = (JSONArray) this.f95633v;
                m143667D = (InterfaceC18170g) this.f95632u;
                jSONObject2 = (JSONObject) this.f95631t;
                coroutineScope2 = (CoroutineScope) this.f95635x;
                try {
                    AbstractC24862s.m129228b(obj);
                } catch (Exception e13) {
                    e11 = e13;
                    coroutineScope = coroutineScope2;
                    InterfaceC30248b interfaceC30248b22 = C19205a.f95436h;
                    this.f95635x = coroutineScope;
                    this.f95631t = jSONObject2;
                    this.f95632u = e11;
                    this.f95633v = null;
                    this.f95634w = 3;
                    mo50557i = interfaceC30248b22.mo50557i(this);
                    if (mo50557i == m142578e) {
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope4 = (CoroutineScope) this.f95635x;
                try {
                    jSONObject = C19205a.f95429a.m100673F();
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                jSONObject2 = jSONObject;
                jSONObject2.put("action_key", "active");
                try {
                    m143667D = AbstractC28684a.Companion.m143667D();
                    jSONArray = new JSONArray();
                    jSONArray.put(jSONObject2);
                    InterfaceC30248b interfaceC30248b3 = C19205a.f95436h;
                    this.f95635x = coroutineScope4;
                    this.f95631t = jSONObject2;
                    this.f95632u = m143667D;
                    this.f95633v = jSONArray;
                    this.f95634w = 1;
                    Object mo50557i2 = interfaceC30248b3.mo50557i(this);
                    if (mo50557i2 == m142578e) {
                        return m142578e;
                    }
                    coroutineScope2 = coroutineScope4;
                    obj = mo50557i2;
                } catch (Exception e14) {
                    coroutineScope = coroutineScope4;
                    e11 = e14;
                    InterfaceC30248b interfaceC30248b222 = C19205a.f95436h;
                    this.f95635x = coroutineScope;
                    this.f95631t = jSONObject2;
                    this.f95632u = e11;
                    this.f95633v = null;
                    this.f95634w = 3;
                    mo50557i = interfaceC30248b222.mo50557i(this);
                    if (mo50557i == m142578e) {
                    }
                }
            }
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                String m50581a = ((LogActive) it.next()).m50581a();
                if (m50581a != null) {
                    jSONArray.put(new JSONObject(m50581a));
                }
            }
            a aVar = new a(m143667D, jSONArray, null);
            this.f95635x = coroutineScope2;
            this.f95631t = jSONObject2;
            this.f95632u = null;
            this.f95633v = null;
            this.f95634w = 2;
            if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                return m142578e;
            }
            coroutineScope = coroutineScope2;
            CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g20.a$s */
    /* loaded from: classes5.dex */
    public static final class s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f95639t;

        /* renamed from: u */
        boolean f95640u;

        /* renamed from: v */
        int f95641v;

        /* renamed from: w */
        private /* synthetic */ Object f95642w;

        /* renamed from: x */
        final /* synthetic */ boolean f95643x;

        /* renamed from: g20.a$s$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f95644t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18170g f95645u;

            /* renamed from: v */
            final /* synthetic */ JSONArray f95646v;

            /* renamed from: w */
            final /* synthetic */ List f95647w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18170g interfaceC18170g, JSONArray jSONArray, List list, Continuation continuation) {
                super(2, continuation);
                this.f95645u = interfaceC18170g;
                this.f95646v = jSONArray;
                this.f95647w = list;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f95645u, this.f95646v, this.f95647w, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                List list;
                Object obj2;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f95644t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3 && i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        AbstractC24862s.m129228b(obj);
                        list = (List) obj;
                        if (list.size() > this.f95647w.size()) {
                            InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                            this.f95644t = 4;
                            if (interfaceC30248b.mo50548a(this) == m142578e) {
                                return m142578e;
                            }
                        } else {
                            List list2 = this.f95647w;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                LogSession logSession = (LogSession) obj3;
                                Iterator it = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (AbstractC19074t.m100204b(((LogSession) obj2).m50617h(), logSession.m50617h())) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                if (obj2 == null) {
                                    arrayList.add(obj3);
                                }
                            }
                            InterfaceC30248b interfaceC30248b2 = C19205a.f95436h;
                            this.f95644t = 3;
                            if (interfaceC30248b2.mo50542E(arrayList, this) == m142578e) {
                                return m142578e;
                            }
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = this.f95645u;
                    String jSONArray = this.f95646v.toString();
                    AbstractC19074t.m100207e(jSONArray, "toString(...)");
                    b bVar = b.f95468t;
                    this.f95644t = 1;
                    if (interfaceC18170g.mo96569P(jSONArray, bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                AbstractC20110a.f98889a.mo104548a("zch log session " + this.f95646v, new Object[0]);
                InterfaceC30248b interfaceC30248b3 = C19205a.f95436h;
                this.f95644t = 2;
                obj = interfaceC30248b3.mo50555g(this);
                if (obj == m142578e) {
                    return m142578e;
                }
                list = (List) obj;
                if (list.size() > this.f95647w.size()) {
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f95643x = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            s sVar = new s(this.f95643x, continuation);
            sVar.f95642w = obj;
            return sVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[Catch: all -> 0x009a, Exception -> 0x00c3, TRY_LEAVE, TryCatch #2 {all -> 0x009a, blocks: (B:25:0x00b5, B:27:0x00bd, B:30:0x00c8, B:31:0x00e0, B:33:0x00e6, B:35:0x00f2, B:38:0x00f9, B:40:0x010c, B:41:0x0103, B:44:0x0172, B:63:0x0076, B:55:0x00a3), top: B:62:0x0076 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: all -> 0x009a, Exception -> 0x00c3, TRY_ENTER, TryCatch #2 {all -> 0x009a, blocks: (B:25:0x00b5, B:27:0x00bd, B:30:0x00c8, B:31:0x00e0, B:33:0x00e6, B:35:0x00f2, B:38:0x00f9, B:40:0x010c, B:41:0x0103, B:44:0x0172, B:63:0x0076, B:55:0x00a3), top: B:62:0x0076 }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v20, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Mutex mutex;
            CoroutineScope coroutineScope;
            boolean z11;
            Mutex mutex2;
            CoroutineScope coroutineScope2;
            Object mo50555g;
            CoroutineScope coroutineScope3;
            List<LogSession> list;
            JSONObject jSONObject;
            m142578e = AbstractC28298d.m142578e();
            ?? r22 = this.f95641v;
            try {
                if (r22 != 0) {
                    if (r22 != 1) {
                        if (r22 != 2) {
                            if (r22 == 3) {
                                mutex2 = (Mutex) this.f95639t;
                                coroutineScope2 = (CoroutineScope) this.f95642w;
                                try {
                                    AbstractC24862s.m129228b(obj);
                                    r22 = mutex2;
                                } catch (Exception e11) {
                                    e = e11;
                                }
                                CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                r22.mo113890c(null);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) this.f95639t;
                        coroutineScope3 = (CoroutineScope) this.f95642w;
                        try {
                            AbstractC24862s.m129228b(obj);
                            mutex = mutex2;
                            mo50555g = obj;
                            try {
                                list = (List) mo50555g;
                            } catch (Exception e12) {
                                e = e12;
                                coroutineScope2 = coroutineScope3;
                                mutex2 = mutex;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            coroutineScope2 = coroutineScope3;
                        }
                        if (!list.isEmpty()) {
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            mutex.mo113890c(null);
                            return c24848g02;
                        }
                        InterfaceC18170g m143667D = AbstractC28684a.Companion.m143667D();
                        JSONObject m100673F = C19205a.f95429a.m100673F();
                        JSONArray jSONArray = new JSONArray();
                        for (LogSession logSession : list) {
                            String m50613d = logSession.m50613d();
                            if (m50613d != null && m50613d.length() != 0) {
                                jSONObject = new JSONObject(logSession.m50613d());
                                jSONObject.put("action_key", "session");
                                jSONObject.put("session_start_time", logSession.m50618i());
                                jSONObject.put("session_end_time", logSession.m50616g());
                                jSONObject.put("total_played_video", logSession.m50621l());
                                jSONObject.put("total_comment", logSession.m50619j());
                                jSONObject.put("total_like", logSession.m50620k());
                                jSONObject.put("total_share", logSession.m50622m());
                                jSONObject.put("session_disliked_cate", logSession.m50614e());
                                jSONObject.put("session_disliked_channel_id", logSession.m50615f());
                                jSONObject.put("total_cellular_data", logSession.m50612c());
                                jSONObject.put("ad_info", logSession.m50611b());
                                jSONArray.put(jSONObject);
                            }
                            jSONObject = new JSONObject(m100673F.toString());
                            jSONObject.put("action_key", "session");
                            jSONObject.put("session_start_time", logSession.m50618i());
                            jSONObject.put("session_end_time", logSession.m50616g());
                            jSONObject.put("total_played_video", logSession.m50621l());
                            jSONObject.put("total_comment", logSession.m50619j());
                            jSONObject.put("total_like", logSession.m50620k());
                            jSONObject.put("total_share", logSession.m50622m());
                            jSONObject.put("session_disliked_cate", logSession.m50614e());
                            jSONObject.put("session_disliked_channel_id", logSession.m50615f());
                            jSONObject.put("total_cellular_data", logSession.m50612c());
                            jSONObject.put("ad_info", logSession.m50611b());
                            jSONArray.put(jSONObject);
                        }
                        a aVar = new a(m143667D, jSONArray, list, null);
                        this.f95642w = coroutineScope3;
                        this.f95639t = mutex;
                        this.f95641v = 3;
                        if (TimeoutKt.m112878c(30000L, aVar, this) == m142578e) {
                            return m142578e;
                        }
                        coroutineScope2 = coroutineScope3;
                        r22 = mutex;
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                        C24848g0 c24848g03 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                        AbstractC20110a.f98889a.mo104548a("zch log session ex:" + e, new Object[0]);
                        r22 = mutex2;
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                        C24848g0 c24848g032 = C24848g0.f119245a;
                        r22.mo113890c(null);
                        return C24848g0.f119245a;
                    }
                    z11 = this.f95640u;
                    mutex = (Mutex) this.f95639t;
                    coroutineScope = (CoroutineScope) this.f95642w;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope4 = (CoroutineScope) this.f95642w;
                    mutex = C19205a.f95444p;
                    boolean z12 = this.f95643x;
                    this.f95642w = coroutineScope4;
                    this.f95639t = mutex;
                    this.f95640u = z12;
                    this.f95641v = 1;
                    if (mutex.mo113889b(null, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope4;
                    z11 = z12;
                }
                if (z11) {
                    try {
                        try {
                            C19205a c19205a = C19205a.f95429a;
                            c19205a.m100710H().clear();
                            c19205a.m100709G().clear();
                            c19205a.m100704z();
                            Context appContext = CoreUtility.getAppContext();
                            AbstractC19074t.m100207e(appContext, "getAppContext(...)");
                            C19205a.f95437i = c19205a.m100672E(appContext);
                        } catch (Throwable th2) {
                            th = th2;
                            r22 = mutex;
                            r22.mo113890c(null);
                            throw th;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        mutex2 = mutex;
                        coroutineScope2 = coroutineScope;
                    }
                }
                InterfaceC30248b interfaceC30248b = C19205a.f95436h;
                this.f95642w = coroutineScope;
                this.f95639t = mutex;
                this.f95641v = 2;
                mo50555g = interfaceC30248b.mo50555g(this);
                if (mo50555g == m142578e) {
                    return m142578e;
                }
                coroutineScope3 = coroutineScope;
                list = (List) mo50555g;
                if (!list.isEmpty()) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        C19205a c19205a = new C19205a();
        f95429a = c19205a;
        f95431c = System.currentTimeMillis();
        f95436h = AbstractC28684a.Companion.m143685s();
        Context appContext = CoreUtility.getAppContext();
        AbstractC19074t.m100207e(appContext, "getAppContext(...)");
        f95437i = c19205a.m100672E(appContext);
        f95438j = MutexKt.m113910b(false, 1, null);
        f95439k = MutexKt.m113910b(false, 1, null);
        f95440l = MutexKt.m113910b(false, 1, null);
        f95441m = MutexKt.m113910b(false, 1, null);
        f95442n = MutexKt.m113910b(false, 1, null);
        f95443o = MutexKt.m113910b(false, 1, null);
        f95444p = MutexKt.m113910b(false, 1, null);
        f95445q = MutexKt.m113910b(false, 1, null);
        f95446r = MutexKt.m113910b(false, 1, null);
        f95447s = MutexKt.m113910b(false, 1, null);
        f95448t = MutexKt.m113910b(false, 1, null);
        f95449u = MutexKt.m113910b(false, 1, null);
        f95450v = MutexKt.m113910b(false, 1, null);
        f95451w = MutexKt.m113910b(false, 1, null);
        f95452x = new ArrayList();
        f95453y = new ArrayList();
        f95454z = new ArrayList();
    }

    private C19205a() {
    }

    /* renamed from: E */
    public final String m100672E(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id") + "-" + System.currentTimeMillis();
        } catch (Exception unused) {
            return UUID.randomUUID() + "-" + System.currentTimeMillis();
        }
    }

    /* renamed from: F */
    public final JSONObject m100673F() {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        C27417l c27417l = C27417l.f129055a;
        User m140378b = c27417l.m140378b();
        Channel m140377a = c27417l.m140377a();
        long currentTimeMillis = System.currentTimeMillis();
        long m130131a = c27417l.m140382f().m130131a();
        SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
        String string = m55587A.getString("ZCH_LOG_SESSION_OPEN_SOURCE", "");
        if (string == null) {
            string = "";
        }
        String string2 = m55587A.getString("ZCH_LOG_SESSION_OPEN_SOURCE_INFO", "");
        if (string2 == null) {
            string2 = "";
        }
        int i11 = Build.VERSION.SDK_INT;
        String m140383g = c27417l.m140383g();
        String m140385i = c27417l.m140385i();
        int i12 = CoreUtility.f89236l;
        long j11 = m55587A.getLong("ZCH_LOG_FIRST_OPEN_TIME", System.currentTimeMillis());
        String string3 = m55587A.getString("ZCH_LOG_FIRST_OPEN_SOURCE", "");
        if (string3 == null) {
            string3 = "";
        }
        String m107389e = AbstractC20626a.m107389e();
        String m107386b = AbstractC20626a.m107386b();
        String str4 = f95437i;
        jSONObject.put("user_id", m140378b.m51234g());
        if (m140377a != null) {
            str = m140377a.m50769l();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        jSONObject.put("channel_id", str);
        jSONObject.put("client_time", currentTimeMillis);
        jSONObject.put("server_time", m130131a);
        jSONObject.put("session_open_source", string);
        jSONObject.put("session_open_source_info", string2);
        jSONObject.put("channel_version", "240401");
        jSONObject.put("os_version", i11);
        jSONObject.put("device_id", m140383g);
        jSONObject.put("device_model", m140385i);
        jSONObject.put("platform", String.valueOf(1));
        jSONObject.put("zalo_app_version", i12);
        jSONObject.put("first_open_time", j11);
        jSONObject.put("first_open_source", string3);
        jSONObject.put("network_type", m107389e);
        jSONObject.put("network_carrier", m107386b);
        jSONObject.put("session_id", str4);
        jSONObject.put("zalo_display_name", m140378b.m51235h());
        if (m140377a != null) {
            str2 = m140377a.m50775o();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        jSONObject.put("channel_display_name", str3);
        return jSONObject;
    }

    /* renamed from: J */
    public final List m100674J(List list, int i11) {
        List m131502j;
        List m131502j2;
        if (list.size() <= 0 || list.size() < i11) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        if (i11 <= 0) {
            m131502j2 = AbstractC25368s.m131502j();
            return m131502j2;
        }
        return list;
    }

    /* renamed from: M */
    public static /* synthetic */ void m100675M(C19205a c19205a, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        c19205a.m100713L(str, map);
    }

    /* renamed from: P */
    public static /* synthetic */ void m100676P(C19205a c19205a, String str, Video video, Map map, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map = null;
        }
        c19205a.m100714N(str, video, map);
    }

    /* renamed from: S */
    public static /* synthetic */ void m100677S(C19205a c19205a, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        c19205a.m100717R(list, str, str2);
    }

    /* renamed from: X */
    public static /* synthetic */ void m100678X(C19205a c19205a, Parcelable parcelable, Map map, Integer num, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        c19205a.m100721W(parcelable, map, num, str);
    }

    /* renamed from: z */
    public final void m100704z() {
        f95430b = false;
        f95431c = C27417l.f129055a.m140382f().m130131a();
        f95432d = 0;
        f95433e = 0;
        f95434f = 0;
        f95435g = 0;
    }

    /* renamed from: A */
    public final void m100705A() {
        f95454z.clear();
    }

    /* renamed from: B */
    public final void m100706B() {
        f95433e++;
    }

    /* renamed from: C */
    public final void m100707C() {
        f95434f++;
    }

    /* renamed from: D */
    public final void m100708D() {
        f95435g++;
    }

    /* renamed from: G */
    public final List m100709G() {
        return f95452x;
    }

    /* renamed from: H */
    public final List m100710H() {
        return f95453y;
    }

    /* renamed from: I */
    public final List m100711I() {
        List m131180H0;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f95454z);
        m131180H0 = AbstractC25332a0.m131180H0(arrayList, 50);
        return m131180H0;
    }

    /* renamed from: K */
    public final String m100712K() {
        String string = C10631i.Companion.m55602a().m55587A().getString("ZCH_LOG_SESSION_OPEN_SOURCE", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: L */
    public final void m100713L(String str, Map map) {
        AbstractC19074t.m100208f(str, "actionKey");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new e(map, str, null), 3, null);
    }

    /* renamed from: N */
    public final void m100714N(String str, Video video, Map map) {
        VideoAdsInfo m52881b;
        String m52929e;
        VideoAdsInfo m52881b2;
        String m52928d;
        AbstractC19074t.m100208f(str, "actionKey");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (video != null && (m52881b2 = video.m52881b()) != null && (m52928d = m52881b2.m52928d()) != null) {
            linkedHashMap.put("ad_id", m52928d);
        }
        if (video != null && (m52881b = video.m52881b()) != null && (m52929e = m52881b.m52929e()) != null) {
            linkedHashMap.put("ad_src", m52929e);
        }
        C26947a.b bVar = C26947a.Companion;
        C18168e.c cVar = C18168e.Companion;
        C26948b.a m138839b = bVar.m138839b(cVar.m96537a(), video);
        if (m138839b != null) {
            linkedHashMap.put("ad_index", Integer.valueOf(m138839b.m138882c()));
        }
        linkedHashMap.put("num_showed_ad", Integer.valueOf(bVar.m138841f(cVar.m96537a())));
        if (map != null) {
            for (String str2 : map.keySet()) {
                Object obj = map.get(str2);
                if (obj != null) {
                    linkedHashMap.put(str2, obj);
                }
            }
        }
        m100715O(str, linkedHashMap);
    }

    /* renamed from: O */
    public final void m100715O(String str, Map map) {
        AbstractC19074t.m100208f(str, "actionKey");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new f(map, str, null), 3, null);
    }

    /* renamed from: Q */
    public final void m100716Q(String str, Map map) {
        AbstractC19074t.m100208f(str, "actionKey");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new g(map, str, null), 3, null);
    }

    /* renamed from: R */
    public final void m100717R(List list, String str, String str2) {
        AbstractC19074t.m100208f(list, "videos");
        AbstractC19074t.m100208f(str, "source");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new h(list, str, str2, null), 3, null);
    }

    /* renamed from: T */
    public final void m100718T(a aVar) {
        AbstractC19074t.m100208f(aVar, "info");
        f95432d++;
        f95454z.add(aVar);
        m100720V(aVar.m100737g());
    }

    /* renamed from: U */
    public final void m100719U(String str) {
        AbstractC19074t.m100208f(str, "liveId");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new i(str, null), 3, null);
    }

    /* renamed from: V */
    public final void m100720V(String str) {
        AbstractC19074t.m100208f(str, "videoId");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new j(str, null), 3, null);
    }

    /* renamed from: W */
    public final void m100721W(Parcelable parcelable, Map map, Integer num, String str) {
        AbstractC19074t.m100208f(parcelable, "item");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new k(parcelable, map, num, str, null), 3, null);
    }

    /* renamed from: Y */
    public final void m100722Y(String str, String str2, Integer num, Integer num2) {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new l(str, str2, num, num2, null), 3, null);
    }

    /* renamed from: Z */
    public final void m100723Z(String str, String str2) {
        String str3;
        SharedPreferences m55587A = C10631i.Companion.m55602a().m55587A();
        SharedPreferences.Editor edit = m55587A.edit();
        if (!f95430b) {
            f95430b = true;
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            edit.putString("ZCH_LOG_SESSION_OPEN_SOURCE", str3);
            if (str2 == null) {
                str2 = "";
            }
            edit.putString("ZCH_LOG_SESSION_OPEN_SOURCE_INFO", str2);
            C19205a c19205a = f95429a;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext(...)");
            f95437i = c19205a.m100672E(appContext);
            StateManager.Companion.m53809m(f95437i);
            f95431c = C27417l.f129055a.m140382f().m130131a();
            ZMediaPlayer.resetDownloadedSize(6);
            C26947a.Companion.m138846k();
        }
        if (!m55587A.contains("ZCH_FIRST_OPEN")) {
            String string = m55587A.getString("ZCH_LOG_FIRST_OPEN_TIME", null);
            String string2 = m55587A.getString("ZCH_LOG_FIRST_OPEN_SOURCE", null);
            if (!m55587A.contains("ZCH_LOG_FIRST_OPEN_TIME") || string == null) {
                edit.putLong("ZCH_LOG_FIRST_OPEN_TIME", System.currentTimeMillis());
            }
            if (!m55587A.contains("ZCH_LOG_FIRST_OPEN_SOURCE") || string2 == null) {
                edit.putString("ZCH_LOG_FIRST_OPEN_SOURCE", str);
            }
            edit.putBoolean("ZCH_FIRST_OPEN", false);
        }
        edit.apply();
    }

    /* renamed from: a0 */
    public final void m100724a0(LogUpload logUpload) {
        AbstractC19074t.m100208f(logUpload, "log");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new m(logUpload, null), 3, null);
    }

    /* renamed from: b0 */
    public final void m100725b0(d dVar) {
        AbstractC19074t.m100208f(dVar, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new n(dVar, null), 3, null);
    }

    /* renamed from: c0 */
    public final void m100726c0(c cVar) {
        AbstractC19074t.m100208f(cVar, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new o(cVar, null), 3, null);
    }

    /* renamed from: d0 */
    public final void m100727d0(c cVar) {
        AbstractC19074t.m100208f(cVar, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new p(cVar, null), 3, null);
    }

    /* renamed from: e0 */
    public final void m100728e0() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new q(null), 3, null);
    }

    /* renamed from: f0 */
    public final void m100729f0() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new r(null), 3, null);
    }

    /* renamed from: g0 */
    public final void m100730g0(boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new s(z11, null), 3, null);
    }
}
