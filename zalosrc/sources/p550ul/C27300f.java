package p550ul;

import ah0.C0860a;
import com.zing.zalo.data.zalocloud.model.api.CloudMediaItemResponse;
import com.zing.zalo.data.zalocloud.model.api.TransferCloudKeyParams;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.info.C16806a;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dh0.C17933b;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import gg0.AbstractC19444a;
import kg0.C21719b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import nl.C23870a;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p613wl.C29085a;
import pg0.C24747a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qg0.C25268c;
import tb0.C26626l;
import tg0.C26675a;
import tg0.C26676b;
import tl.C26731a;
import un0.AbstractC27323a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import zg0.C31831a;

/* renamed from: ul.f */
/* loaded from: classes3.dex */
public final class C27300f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C21719b f128486a;

    /* renamed from: b */
    private final C23870a f128487b;

    /* renamed from: c */
    private final C16805b f128488c;

    /* renamed from: d */
    private final C26626l f128489d;

    /* renamed from: e */
    private final C16806a f128490e;

    /* renamed from: f */
    private final C31831a f128491f;

    /* renamed from: g */
    private final C0860a f128492g;

    /* renamed from: h */
    private final C26731a f128493h;

    /* renamed from: i */
    private final C25268c f128494i;

    /* renamed from: j */
    private final C24747a f128495j;

    /* renamed from: ul.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f128496s;

        /* renamed from: t */
        Object f128497t;

        /* renamed from: u */
        Object f128498u;

        /* renamed from: v */
        /* synthetic */ Object f128499v;

        /* renamed from: x */
        int f128501x;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128499v = obj;
            this.f128501x |= Integer.MIN_VALUE;
            return C27300f.this.m139805j(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.f$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128502t;

        /* renamed from: v */
        final /* synthetic */ String f128504v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation continuation) {
            super(2, continuation);
            this.f128504v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f128504v, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128502t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return C24848g0.f119245a;
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C27300f c27300f = C27300f.this;
                String str = this.f128504v;
                this.f128502t = 1;
                obj = c27300f.m139808n(str, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                return C24848g0.f119245a;
            }
            if (C27300f.this.m139807l(this.f128504v)) {
                return C24848g0.f119245a;
            }
            C27300f c27300f2 = C27300f.this;
            String str2 = this.f128504v;
            this.f128502t = 2;
            obj = c27300f2.m139805j(str2, this);
            if (obj == m142578e) {
                return m142578e;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.f$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f128505s;

        /* renamed from: t */
        Object f128506t;

        /* renamed from: u */
        Object f128507u;

        /* renamed from: v */
        /* synthetic */ Object f128508v;

        /* renamed from: x */
        int f128510x;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128508v = obj;
            this.f128510x |= Integer.MIN_VALUE;
            return C27300f.this.m139808n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.f$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f128511s;

        /* renamed from: t */
        int f128512t;

        /* renamed from: u */
        /* synthetic */ Object f128513u;

        /* renamed from: w */
        int f128515w;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128513u = obj;
            this.f128515w |= Integer.MIN_VALUE;
            return C27300f.this.m139809o(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.f$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f128516q = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m139816a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
            C26676b.m136957g("SMLZCloudPacketHandler", "Transfer Cloud Key to PC SUCCESS: " + obj, null, 4, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139816a(obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.f$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final g f128517q = new g();

        g() {
            super(2);
        }

        /* renamed from: a */
        public final void m139817a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errMsg");
            C26676b.m136957g("SMLZCloudPacketHandler", "Transfer Cloud Key to PC FAILED: errCode=" + i11 + ", errMsg=" + str, null, 4, null);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139817a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ul.f$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f128518s;

        /* renamed from: u */
        int f128520u;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128518s = obj;
            this.f128520u |= Integer.MIN_VALUE;
            return C27300f.this.m139811s(null, this);
        }
    }

    public C27300f(C21719b c21719b, C23870a c23870a, C16805b c16805b, C26626l c26626l, C16806a c16806a, C31831a c31831a, C0860a c0860a, C26731a c26731a, C25268c c25268c, C24747a c24747a) {
        AbstractC19074t.m100208f(c21719b, "zaloCloudManager");
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c16805b, "zaloCloudConfigs");
        AbstractC19074t.m100208f(c26626l, "uiHandler");
        AbstractC19074t.m100208f(c16806a, "cloudInfoManager");
        AbstractC19074t.m100208f(c31831a, "cloudSettings");
        AbstractC19074t.m100208f(c0860a, "subscriptionManager");
        AbstractC19074t.m100208f(c26731a, "cloudItemProcessor");
        AbstractC19074t.m100208f(c25268c, "cloudKeyManager");
        AbstractC19074t.m100208f(c24747a, "criticalCaseManager");
        this.f128486a = c21719b;
        this.f128487b = c23870a;
        this.f128488c = c16805b;
        this.f128489d = c26626l;
        this.f128490e = c16806a;
        this.f128491f = c31831a;
        this.f128492g = c0860a;
        this.f128493h = c26731a;
        this.f128494i = c25268c;
        this.f128495j = c24747a;
    }

    /* renamed from: f */
    private final boolean m139801f(int i11) {
        if (AbstractC23306f.m120643a2().m89840j().length() == 0) {
            this.f128495j.m128538x();
            this.f128489d.m136702b0(i11);
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final void m139802g() {
        this.f128490e.m89838g();
    }

    /* renamed from: h */
    private final void m139803h() {
        this.f128491f.m152930g();
    }

    /* renamed from: i */
    private final Object m139804i(Continuation continuation) {
        Object m142578e;
        Object m136917G = C26675a.f126213a.m136917G(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m136917G == m142578e) {
            return m136917G;
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0098. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139805j(String str, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        String str2;
        C27300f c27300f;
        String str3;
        String str4;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f128501x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f128501x = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f128499v;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f128501x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return AbstractC29094b.m145339a(true);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (String) bVar.f128498u;
                    str3 = (String) bVar.f128497t;
                    c27300f = (C27300f) bVar.f128496s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136955e("SMLZCloudPacketHandler", "handleCmdForceUpdateData(): " + str, C26676b.b.f126331p);
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("update_data");
                    if (optJSONObject != null) {
                        str2 = optJSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && str2.length() != 0) {
                        C23870a c23870a = this.f128487b;
                        bVar.f128496s = this;
                        bVar.f128497t = str;
                        bVar.f128498u = str2;
                        bVar.f128501x = 1;
                        if (c23870a.m124823p(str2, bVar) == m142578e) {
                            return m142578e;
                        }
                        c27300f = this;
                        str3 = str;
                        str4 = str2;
                    } else {
                        return AbstractC29094b.m145339a(false);
                    }
                }
                switch (str4.hashCode()) {
                    case -1644065210:
                        if (str4.equals("cloud_setting")) {
                            c27300f.m139803h();
                            return AbstractC29094b.m145339a(true);
                        }
                        C26676b.m136953c(new IllegalArgumentException("INVALID force update params: " + str3));
                        return AbstractC29094b.m145339a(true);
                    case -1182982521:
                        if (str4.equals("cloud_queue")) {
                            c27300f.m139806k();
                            return AbstractC29094b.m145339a(true);
                        }
                        C26676b.m136953c(new IllegalArgumentException("INVALID force update params: " + str3));
                        return AbstractC29094b.m145339a(true);
                    case -315500424:
                        if (str4.equals("cloud_info")) {
                            c27300f.m139802g();
                            return AbstractC29094b.m145339a(true);
                        }
                        C26676b.m136953c(new IllegalArgumentException("INVALID force update params: " + str3));
                        return AbstractC29094b.m145339a(true);
                    case 115210319:
                        if (str4.equals("audit_local_cloud_queue")) {
                            bVar.f128496s = null;
                            bVar.f128497t = null;
                            bVar.f128498u = null;
                            bVar.f128501x = 2;
                            if (c27300f.m139804i(bVar) == m142578e) {
                                return m142578e;
                            }
                            return AbstractC29094b.m145339a(true);
                        }
                        C26676b.m136953c(new IllegalArgumentException("INVALID force update params: " + str3));
                        return AbstractC29094b.m145339a(true);
                    default:
                        C26676b.m136953c(new IllegalArgumentException("INVALID force update params: " + str3));
                        return AbstractC29094b.m145339a(true);
                }
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f128499v;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f128501x;
        if (i11 == 0) {
        }
        switch (str4.hashCode()) {
            case -1644065210:
                break;
            case -1182982521:
                break;
            case -315500424:
                break;
            case 115210319:
                break;
        }
    }

    /* renamed from: k */
    private final void m139806k() {
        this.f128486a.m112078j(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final boolean m139807l(String str) {
        JSONObject optJSONObject;
        if (!this.f128488c.m89806u() || (optJSONObject = new JSONObject(str).optJSONObject("cloudMedia")) == null) {
            return false;
        }
        int optInt = optJSONObject.optInt("pageSize");
        String optString = optJSONObject.optString("lastNoiseId");
        C26676b.m136955e("SMLZCloudPacketHandler", "handleCmdNeedVerifyCloudQueue(): " + str, C26676b.b.f126332q);
        if (optInt > 0) {
            this.f128487b.m124828r1(optInt);
        }
        if (AbstractC19074t.m100204b(optString, this.f128487b.m124834u0())) {
            C26676b.m136957g("SMLZCloudPacketHandler", "Mark cloud queue verified: lastNoiseId=" + optString, null, 4, null);
            this.f128487b.m124812h1(true);
            this.f128487b.m124827q1(-1);
            return true;
        }
        this.f128487b.m124812h1(false);
        this.f128487b.m124827q1(2);
        this.f128486a.m112075g();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139808n(String str, Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        C19051f0 c19051f0;
        C27300f c27300f;
        JSONObject optJSONObject;
        String str2;
        C19051f0 c19051f02;
        C27300f c27300f2;
        JSONObject optJSONObject2;
        C19051f0 c19051f03;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f128510x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f128510x = i12 - Integer.MIN_VALUE;
                Object obj = dVar.f128508v;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f128510x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                c19051f03 = (C19051f0) dVar.f128505s;
                                AbstractC24862s.m129228b(obj);
                                c19051f0 = c19051f03;
                                return AbstractC29094b.m145339a(c19051f0.f94928p);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c19051f02 = (C19051f0) dVar.f128507u;
                        str2 = (String) dVar.f128506t;
                        c27300f2 = (C27300f) dVar.f128505s;
                        AbstractC24862s.m129228b(obj);
                        c19051f0 = c19051f02;
                        str = str2;
                        c27300f = c27300f2;
                        optJSONObject2 = new JSONObject(str).optJSONObject("onboardingSetupCompleted");
                        if (optJSONObject2 != null) {
                            c19051f0.f94928p = true;
                            dVar.f128505s = c19051f0;
                            dVar.f128506t = null;
                            dVar.f128507u = null;
                            dVar.f128510x = 3;
                            if (c27300f.m139810p(optJSONObject2, dVar) == m142578e) {
                                return m142578e;
                            }
                            c19051f03 = c19051f0;
                            c19051f0 = c19051f03;
                        }
                        return AbstractC29094b.m145339a(c19051f0.f94928p);
                    }
                    C19051f0 c19051f04 = (C19051f0) dVar.f128507u;
                    String str3 = (String) dVar.f128506t;
                    c27300f = (C27300f) dVar.f128505s;
                    AbstractC24862s.m129228b(obj);
                    c19051f0 = c19051f04;
                    str = str3;
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!this.f128488c.m89807v()) {
                        C26676b.m136956f("handleCmdNotifySubscription(): Feature disabled!", C26676b.b.f126335t);
                        return AbstractC29094b.m145339a(false);
                    }
                    c19051f0 = new C19051f0();
                    JSONObject optJSONObject3 = new JSONObject(str).optJSONObject("cloudOnboardInfo");
                    if (optJSONObject3 != null) {
                        c19051f0.f94928p = true;
                        dVar.f128505s = this;
                        dVar.f128506t = str;
                        dVar.f128507u = c19051f0;
                        dVar.f128510x = 1;
                        if (m139809o(optJSONObject3, dVar) == m142578e) {
                            return m142578e;
                        }
                    }
                    c27300f = this;
                }
                optJSONObject = new JSONObject(str).optJSONObject("changePlan");
                if (optJSONObject != null) {
                    c19051f0.f94928p = true;
                    dVar.f128505s = c27300f;
                    dVar.f128506t = str;
                    dVar.f128507u = c19051f0;
                    dVar.f128510x = 2;
                    if (c27300f.m139811s(optJSONObject, dVar) == m142578e) {
                        return m142578e;
                    }
                    str2 = str;
                    c19051f02 = c19051f0;
                    c27300f2 = c27300f;
                    c19051f0 = c19051f02;
                    str = str2;
                    c27300f = c27300f2;
                }
                optJSONObject2 = new JSONObject(str).optJSONObject("onboardingSetupCompleted");
                if (optJSONObject2 != null) {
                }
                return AbstractC29094b.m145339a(c19051f0.f94928p);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f128508v;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f128510x;
        if (i11 == 0) {
        }
        optJSONObject = new JSONObject(str).optJSONObject("changePlan");
        if (optJSONObject != null) {
        }
        optJSONObject2 = new JSONObject(str).optJSONObject("onboardingSetupCompleted");
        if (optJSONObject2 != null) {
        }
        return AbstractC29094b.m145339a(c19051f0.f94928p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:16|17))(3:18|19|(2:21|22)(4:23|(2:25|(1:27)(1:28))|13|14))|12|13|14))|31|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:            tg0.C26676b.m136954d("SMLZCloudPacketHandler", r6);     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139809o(JSONObject jSONObject, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        int i12;
        C27300f c27300f;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i13 = eVar.f128515w;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f128515w = i13 - Integer.MIN_VALUE;
                Object obj = eVar.f128513u;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f128515w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        i12 = eVar.f128512t;
                        c27300f = (C27300f) eVar.f128511s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.b bVar = C26676b.b.f126331p;
                    C26676b.m136955e("SMLZCloudPacketHandler", "handleCmdOnboardingSetup(): " + jSONObject, bVar);
                    i12 = jSONObject.getInt("target_plan");
                    if (i12 == -1) {
                        this.f128495j.m128521c();
                        return C24848g0.f119245a;
                    }
                    if (!m139801f(i12)) {
                        C26676b.m136955e("SMLZCloudPacketHandler", "handleCmdOnboardingSetup(): server public key exist", bVar);
                        eVar.f128511s = this;
                        eVar.f128512t = i12;
                        eVar.f128515w = 1;
                        if (DelayKt.m112666b(500L, eVar) == m142578e) {
                            return m142578e;
                        }
                        c27300f = this;
                    }
                    return C24848g0.f119245a;
                }
                c27300f.m139801f(i12);
                return C24848g0.f119245a;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f128513u;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f128515w;
        if (i11 == 0) {
        }
        c27300f.m139801f(i12);
        return C24848g0.f119245a;
    }

    /* renamed from: p */
    private final Object m139810p(JSONObject jSONObject, Continuation continuation) {
        C26676b.m136955e("SMLZCloudPacketHandler", "handleCmdOnboardingSetupCompleted(): " + jSONObject, C26676b.b.f126331p);
        this.f128486a.m112082r();
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:            tg0.C26676b.m136954d("SMLZCloudPacketHandler", r6);     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139811s(JSONObject jSONObject, Continuation continuation) {
        h hVar;
        Object m142578e;
        int i11;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f128520u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f128520u = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f128518s;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f128520u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136955e("SMLZCloudPacketHandler", "handleCmdSubscriptionChanged(): " + jSONObject, C26676b.b.f126331p);
                    this.f128492g.m2460j(jSONObject.getInt("plan"), true);
                    C23870a c23870a = this.f128487b;
                    hVar.f128520u = 1;
                    if (c23870a.m124823p("changePlan", hVar) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f128518s;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f128520u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: m */
    public final void m139812m(String str) {
        AbstractC19074t.m100208f(str, "json");
        if (str.length() != 0) {
            try {
                BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new c(str, null), 3, null);
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudPacketHandler", e11);
            }
        }
    }

    /* renamed from: q */
    public final void m139813q(String str) {
        AbstractC19074t.m100208f(str, "json");
        if (str.length() == 0 || !this.f128488c.m89806u()) {
            return;
        }
        try {
            C21719b c21719b = this.f128486a;
            AbstractC27323a m145315b = C29085a.f134890a.m145315b();
            m145315b.mo131586a();
            c21719b.m112087w((CloudMediaItemResponse) m145315b.m139867d(CloudMediaItemResponse.Companion.serializer(), str));
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudPacketHandler", e11);
        }
    }

    /* renamed from: r */
    public final void m139814r(JSONObject jSONObject) {
        String optString;
        AbstractC19074t.m100208f(jSONObject, "json");
        if (!this.f128494i.m130757A()) {
            C26676b.m136955e("SMLZCloudPacketHandler", "handleCmdRequestTransferCloudKey(): Cloud Key not initialized!", C26676b.b.f126335t);
            return;
        }
        C26676b.m136956f("handleCmdRequestTransferCloudKey(): " + jSONObject, C26676b.b.f126332q);
        if (AbstractC19444a.m101693a()) {
            C26676b.m136962l("SMLZCloudPacketHandler", "handleCmdRequestTransferCloudKey(): is running on main thread");
        }
        String optString2 = jSONObject.optString("data");
        if (optString2 == null || (optString = jSONObject.optString("extData")) == null || optString2.length() == 0 || optString.length() == 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject(optString2);
        JSONObject jSONObject3 = new JSONObject(optString);
        String optString3 = jSONObject2.optString("device_name");
        String optString4 = jSONObject2.optString("session_id");
        int optInt = jSONObject3.optInt("device_id");
        String valueOf = String.valueOf(jSONObject3.optInt("user_id"));
        if (!AbstractC19074t.m100204b(valueOf, CoreUtility.f89233i)) {
            C26676b.m136956f("handleCmdRequestTransferCloudKey(): Invalid UID! (" + valueOf + " != " + CoreUtility.f89233i + ")", C26676b.b.f126335t);
            return;
        }
        AbstractC19074t.m100205c(optString4);
        AbstractC19074t.m100205c(optString3);
        TransferCloudKeyParams transferCloudKeyParams = new TransferCloudKeyParams(optString4, optString3, 1, this.f128494i.m130765r(), this.f128494i.m130768u(), this.f128494i.m130761k(optInt));
        C26676b.m136955e("SMLZCloudPacketHandler", "Transfer Cloud Key to PC: " + transferCloudKeyParams, C26676b.b.f126331p);
        this.f128487b.m124840w1(transferCloudKeyParams, f.f128516q, g.f128517q);
    }
}
