package nl;

import ah0.C0860a;
import androidx.work.AbstractC2147g0;
import ch0.AbstractC3489d;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.api.AbuseInfo;
import com.zing.zalo.data.zalocloud.model.api.BaseResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudInfoResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudKeyResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudQuotaUsageResponse;
import com.zing.zalo.data.zalocloud.model.api.CloudSettings;
import com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo;
import com.zing.zalo.data.zalocloud.model.api.CloudUrlPattern;
import com.zing.zalo.data.zalocloud.model.api.DownloadUrlsResponse;
import com.zing.zalo.data.zalocloud.model.api.MyCloudQuotaUsageResponse;
import com.zing.zalo.data.zalocloud.model.api.SubmitCloudKeyResponse;
import com.zing.zalo.data.zalocloud.model.api.TransferCloudKeyParams;
import com.zing.zalo.data.zalocloud.model.api.UpdateMigrationStatusParams;
import com.zing.zalo.data.zalocloud.model.api.VerifyCloudQueueResponse;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dh0.C17933b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nh0.InterfaceC23792b;
import og0.EnumC24250a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p487rl.C25820a;
import p487rl.C25821b;
import p550ul.C27298d;
import p550ul.InterfaceC27297c;
import p665y0.C30240b;
import pl.C24815f;
import pl.C24819j;
import pl.InterfaceC24812c;
import pl.InterfaceC24818i;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import sl.C26316a;
import sl.C26317b;
import sl.C26318c;
import sl.C26319d;
import tg0.C26675a;
import tg0.C26676b;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: nl.a */
/* loaded from: classes3.dex */
public final class C23870a {
    public static final c Companion = new c(null);

    /* renamed from: p */
    private static final InterfaceC24854k f115237p;

    /* renamed from: a */
    private final InterfaceC24812c f115238a;

    /* renamed from: b */
    private final InterfaceC24818i f115239b;

    /* renamed from: c */
    private final InterfaceC27297c f115240c;

    /* renamed from: d */
    private final C16805b f115241d;

    /* renamed from: e */
    private final InterfaceC23792b f115242e;

    /* renamed from: f */
    private final CoroutineDispatcher f115243f;

    /* renamed from: g */
    private final Object f115244g;

    /* renamed from: h */
    private final AtomicBoolean f115245h;

    /* renamed from: i */
    private final AtomicBoolean f115246i;

    /* renamed from: j */
    private final AtomicBoolean f115247j;

    /* renamed from: k */
    private final AtomicBoolean f115248k;

    /* renamed from: l */
    private final InterfaceC24854k f115249l;

    /* renamed from: m */
    private final InterfaceC24854k f115250m;

    /* renamed from: n */
    private final InterfaceC24854k f115251n;

    /* renamed from: o */
    private ZCloudQuotaUsage f115252o;

    /* renamed from: nl.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final String f115253a;

        /* renamed from: b */
        private final long f115254b;

        public a(String str, long j11) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f115253a = str;
            this.f115254b = j11;
        }

        /* renamed from: a */
        public final long m124848a() {
            return this.f115254b;
        }

        /* renamed from: b */
        public final String m124849b() {
            return this.f115253a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f115253a, aVar.f115253a) && this.f115254b == aVar.f115254b;
        }

        public int hashCode() {
            return (this.f115253a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f115254b);
        }

        public String toString() {
            return "CachedCloudDownloadUrl(url=" + this.f115253a + ", timestamp=" + this.f115254b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$a0 */
    /* loaded from: classes3.dex */
    public static final class a0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115255q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(Continuation continuation) {
            super(2);
            this.f115255q = continuation;
        }

        /* renamed from: a */
        public final void m124850a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            this.f115255q.mo112492g(C24861r.m129218b(null));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124850a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$a1 */
    /* loaded from: classes3.dex */
    public static final class a1 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115256q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(Continuation continuation) {
            super(2);
            this.f115256q = continuation;
        }

        /* renamed from: a */
        public final void m124851a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            Continuation continuation = this.f115256q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.FALSE));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124851a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f115257q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23870a mo12V4() {
            return d.f115271a.m124859a();
        }
    }

    /* renamed from: nl.a$b0 */
    /* loaded from: classes3.dex */
    public static final class b0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115258q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(Continuation continuation) {
            super(1);
            this.f115258q = continuation;
        }

        /* renamed from: a */
        public final void m124853a(CloudUrlPattern cloudUrlPattern) {
            AbstractC19074t.m100208f(cloudUrlPattern, "it");
            this.f115258q.mo112492g(C24861r.m129218b(cloudUrlPattern));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124853a((CloudUrlPattern) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$b1 */
    /* loaded from: classes3.dex */
    public static final class b1 extends AbstractC29096d {

        /* renamed from: s */
        Object f115259s;

        /* renamed from: t */
        long f115260t;

        /* renamed from: u */
        /* synthetic */ Object f115261u;

        /* renamed from: w */
        int f115263w;

        b1(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115261u = obj;
            this.f115263w |= Integer.MIN_VALUE;
            return C23870a.this.m124805c1(0L, this);
        }
    }

    /* renamed from: nl.a$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23870a m124854a() {
            return (C23870a) C23870a.f115237p.getValue();
        }
    }

    /* renamed from: nl.a$c0 */
    /* loaded from: classes3.dex */
    public static final class c0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115264q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(Continuation continuation) {
            super(2);
            this.f115264q = continuation;
        }

        /* renamed from: a */
        public final void m124855a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            this.f115264q.mo112492g(C24861r.m129218b(null));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124855a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$c1 */
    /* loaded from: classes3.dex */
    public static final class c1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f115265t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f115267v;

        /* renamed from: nl.a$c1$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f115268t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18505l f115269u;

            /* renamed from: v */
            final /* synthetic */ CloudQuotaUsage f115270v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, CloudQuotaUsage cloudQuotaUsage, Continuation continuation) {
                super(2, continuation);
                this.f115269u = interfaceC18505l;
                this.f115270v = cloudQuotaUsage;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f115269u, this.f115270v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f115268t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f115269u.mo205i9(this.f115270v);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c1(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(1, continuation);
            this.f115267v = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115265t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CloudQuotaUsage m124755z0 = C23870a.m124755z0(C23870a.this, null, null, 3, null);
                InterfaceC18505l interfaceC18505l = this.f115267v;
                if (interfaceC18505l != null) {
                    C23870a c23870a = C23870a.this;
                    if (m124755z0.m41236l()) {
                        CoroutineDispatcher coroutineDispatcher = c23870a.f115243f;
                        a aVar = new a(interfaceC18505l, m124755z0, null);
                        this.f115265t = 1;
                        if (BuildersKt.m112534g(coroutineDispatcher, aVar, this) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        C26676b.m136958h("Invalid quota usage: " + m124755z0, null, 2, null);
                    }
                }
            }
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m124856r(Continuation continuation) {
            return new c1(this.f115267v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((c1) m124856r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nl.a$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f115271a = new d();

        /* renamed from: b */
        private static final C23870a f115272b;

        static {
            C24815f c24815f = new C24815f(null, 1, null);
            C24819j c24819j = new C24819j(null, 1, null);
            C27298d c27298d = new C27298d();
            C16805b m120633X1 = AbstractC23306f.m120633X1();
            AbstractC19074t.m100207e(m120633X1, "provideZaloCloudConfigs(...)");
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            f115272b = new C23870a(c24815f, c24819j, c27298d, m120633X1, m120579F1, null, 32, null);
        }

        private d() {
        }

        /* renamed from: a */
        public final C23870a m124859a() {
            return f115272b;
        }
    }

    /* renamed from: nl.a$d0 */
    /* loaded from: classes3.dex */
    public static final class d0 extends AbstractC19075u implements InterfaceC18505l {
        d0() {
            super(1);
        }

        /* renamed from: a */
        public final void m124860a(MyCloudQuotaUsageResponse myCloudQuotaUsageResponse) {
            AbstractC19074t.m100208f(myCloudQuotaUsageResponse, "response");
            C23870a.this.m124723W0(myCloudQuotaUsageResponse);
            C23744a.Companion.m124119a().m124116d(150810, new Object[0]);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124860a((MyCloudQuotaUsageResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$d1 */
    /* loaded from: classes3.dex */
    public static final class d1 extends AbstractC29104l implements InterfaceC18505l {

        /* renamed from: t */
        int f115274t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f115276v;

        /* renamed from: nl.a$d1$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f115277t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC18505l f115278u;

            /* renamed from: v */
            final /* synthetic */ ZCloudQuotaUsage f115279v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC18505l interfaceC18505l, ZCloudQuotaUsage zCloudQuotaUsage, Continuation continuation) {
                super(2, continuation);
                this.f115278u = interfaceC18505l;
                this.f115279v = zCloudQuotaUsage;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f115278u, this.f115279v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f115277t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f115278u.mo205i9(this.f115279v);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d1(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(1, continuation);
            this.f115276v = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115274t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                ZCloudQuotaUsage m124718I0 = C23870a.m124718I0(C23870a.this, false, null, null, 7, null);
                InterfaceC18505l interfaceC18505l = this.f115276v;
                if (interfaceC18505l != null) {
                    C23870a c23870a = C23870a.this;
                    if (m124718I0.m41252j() > 0) {
                        CoroutineDispatcher coroutineDispatcher = c23870a.f115243f;
                        a aVar = new a(interfaceC18505l, m124718I0, null);
                        this.f115274t = 1;
                        if (BuildersKt.m112534g(coroutineDispatcher, aVar, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
            }
            return C24848g0.f119245a;
        }

        /* renamed from: r */
        public final Continuation m124861r(Continuation continuation) {
            return new d1(this.f115276v, continuation);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: s */
        public final Object mo205i9(Continuation continuation) {
            return ((d1) m124861r(continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115280q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Continuation continuation) {
            super(1);
            this.f115280q = continuation;
        }

        /* renamed from: a */
        public final void m124864a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            this.f115280q.mo112492g(C24861r.m129218b(jSONObject));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124864a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$e0 */
    /* loaded from: classes3.dex */
    public static final class e0 extends AbstractC19075u implements InterfaceC18509p {
        e0() {
            super(2);
        }

        /* renamed from: a */
        public final void m124865a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            C23870a.this.m124722V0(i11, str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124865a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$e1 */
    /* loaded from: classes3.dex */
    public static final class e1 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115282q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e1(Continuation continuation) {
            super(1);
            this.f115282q = continuation;
        }

        /* renamed from: a */
        public final void m124866a(SubmitCloudKeyResponse submitCloudKeyResponse) {
            AbstractC19074t.m100208f(submitCloudKeyResponse, "it");
            this.f115282q.mo112492g(C24861r.m129218b(submitCloudKeyResponse));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124866a((SubmitCloudKeyResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115283q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Continuation continuation) {
            super(2);
            this.f115283q = continuation;
        }

        /* renamed from: a */
        public final void m124867a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            this.f115283q.mo112492g(C24861r.m129218b(null));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124867a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$f0 */
    /* loaded from: classes3.dex */
    public static final class f0 extends AbstractC19075u implements InterfaceC18505l {
        f0() {
            super(1);
        }

        /* renamed from: a */
        public final void m124868a(CloudQuotaUsageResponse cloudQuotaUsageResponse) {
            AbstractC19074t.m100208f(cloudQuotaUsageResponse, "response");
            C23870a.this.m124725Y0(cloudQuotaUsageResponse);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124868a((CloudQuotaUsageResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$f1 */
    /* loaded from: classes3.dex */
    public static final class f1 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115285q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f1(Continuation continuation) {
            super(2);
            this.f115285q = continuation;
        }

        /* renamed from: a */
        public final void m124869a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errMsg");
            C26675a.m136890L(C26675a.f126213a, 1504102, i11, str, null, 0L, 0L, 56, null);
            Continuation continuation = this.f115285q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new SubmitCloudKeyResponse(i11, str, null)));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124869a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f115286q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ConcurrentHashMap mo12V4() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: nl.a$g0 */
    /* loaded from: classes3.dex */
    public static final class g0 extends AbstractC19075u implements InterfaceC18509p {
        g0() {
            super(2);
        }

        /* renamed from: a */
        public final void m124871a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            C23870a.this.m124724X0(i11, str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124871a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$g1 */
    /* loaded from: classes3.dex */
    public static final class g1 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115288q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g1(Continuation continuation) {
            super(1);
            this.f115288q = continuation;
        }

        /* renamed from: a */
        public final void m124872a(List list) {
            AbstractC19074t.m100208f(list, "it");
            this.f115288q.mo112492g(C24861r.m129218b(list));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124872a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f115289q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ConcurrentHashMap mo12V4() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: nl.a$h0 */
    /* loaded from: classes3.dex */
    public static final class h0 extends AbstractC29096d {

        /* renamed from: s */
        Object f115290s;

        /* renamed from: t */
        Object f115291t;

        /* renamed from: u */
        Object f115292u;

        /* renamed from: v */
        /* synthetic */ Object f115293v;

        /* renamed from: x */
        int f115295x;

        h0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115293v = obj;
            this.f115295x |= Integer.MIN_VALUE;
            return C23870a.this.m124794V(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$h1 */
    /* loaded from: classes3.dex */
    public static final class h1 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115296q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h1(Continuation continuation) {
            super(2);
            this.f115296q = continuation;
        }

        /* renamed from: a */
        public final void m124874a(int i11, String str) {
            List m131502j;
            AbstractC19074t.m100208f(str, "errMsg");
            C26676b.m136957g("SMLZCloudRepo", "submitE2EEInfo(): FAILED (errCode=" + i11 + ", errMsg=" + str + ")", null, 4, null);
            Continuation continuation = this.f115296q;
            C24861r.a aVar = C24861r.f119264q;
            m131502j = AbstractC25368s.m131502j();
            continuation.mo112492g(C24861r.m129218b(m131502j));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124874a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: nl.a$i$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f115298t;

            /* renamed from: u */
            int f115299u;

            /* renamed from: v */
            final /* synthetic */ Set f115300v;

            /* renamed from: w */
            final /* synthetic */ C23870a f115301w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Set set, C23870a c23870a, Continuation continuation) {
                super(2, continuation);
                this.f115300v = set;
                this.f115301w = c23870a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f115300v, this.f115301w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                Set set;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f115299u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        set = (Set) this.f115298t;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Set set2 = this.f115300v;
                    InterfaceC24812c interfaceC24812c = this.f115301w.f115238a;
                    this.f115298t = set2;
                    this.f115299u = 1;
                    Object mo128964S = interfaceC24812c.mo128964S(this);
                    if (mo128964S == m142578e) {
                        return m142578e;
                    }
                    set = set2;
                    obj = mo128964S;
                }
                set.addAll((Collection) obj);
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Set mo12V4() {
            Set synchronizedSet = Collections.synchronizedSet(new C30240b());
            BuildersKt__BuildersKt.m112536b(null, new a(synchronizedSet, C23870a.this, null), 1, null);
            return synchronizedSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$i0 */
    /* loaded from: classes3.dex */
    public static final class i0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115302t;

        /* renamed from: v */
        final /* synthetic */ MessageId f115304v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(MessageId messageId, Continuation continuation) {
            super(2, continuation);
            this.f115304v = messageId;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i0(this.f115304v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115302t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a c23870a = C23870a.this;
                MessageId messageId = this.f115304v;
                this.f115302t = 1;
                obj = c23870a.m124794V(messageId, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$i1 */
    /* loaded from: classes3.dex */
    public static final class i1 extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        final /* synthetic */ Continuation f115305q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i1(Continuation continuation) {
            super(3);
            this.f115305q = continuation;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m124878a((BaseResponse) obj, (String) obj2, (String) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m124878a(BaseResponse baseResponse, String str, String str2) {
            AbstractC19074t.m100208f(baseResponse, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(str, "partId");
            AbstractC19074t.m100208f(str2, "totalPart");
            if (Integer.parseInt(str) == Integer.parseInt(str2) - 1) {
                Continuation continuation = this.f115305q;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
            }
        }
    }

    /* renamed from: nl.a$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115306t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f115307u;

        /* renamed from: v */
        final /* synthetic */ C23870a f115308v;

        /* renamed from: w */
        final /* synthetic */ CloudQuotaUsage f115309w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC18505l interfaceC18505l, C23870a c23870a, CloudQuotaUsage cloudQuotaUsage, Continuation continuation) {
            super(2, continuation);
            this.f115307u = interfaceC18505l;
            this.f115308v = c23870a;
            this.f115309w = cloudQuotaUsage;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f115307u, this.f115308v, this.f115309w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115306t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC18505l interfaceC18505l = this.f115307u;
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(this.f115308v.m124753w(this.f115309w));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nl.a$j0 */
    /* loaded from: classes3.dex */
    public static final class j0 extends AbstractC29096d {

        /* renamed from: s */
        Object f115310s;

        /* renamed from: t */
        /* synthetic */ Object f115311t;

        /* renamed from: v */
        int f115313v;

        j0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115311t = obj;
            this.f115313v |= Integer.MIN_VALUE;
            return C23870a.this.m124796X(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$j1 */
    /* loaded from: classes3.dex */
    public static final class j1 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115314q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j1(Continuation continuation) {
            super(2);
            this.f115314q = continuation;
        }

        /* renamed from: a */
        public final void m124880a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            Continuation continuation = this.f115314q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.FALSE));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124880a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115315t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f115316u;

        /* renamed from: v */
        final /* synthetic */ C23870a f115317v;

        /* renamed from: w */
        final /* synthetic */ ZCloudQuotaUsage f115318w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC18505l interfaceC18505l, C23870a c23870a, ZCloudQuotaUsage zCloudQuotaUsage, Continuation continuation) {
            super(2, continuation);
            this.f115316u = interfaceC18505l;
            this.f115317v = c23870a;
            this.f115318w = zCloudQuotaUsage;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f115316u, this.f115317v, this.f115318w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115315t == 0) {
                AbstractC24862s.m129228b(obj);
                InterfaceC18505l interfaceC18505l = this.f115316u;
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(this.f115317v.m124754x(this.f115318w));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nl.a$k0 */
    /* loaded from: classes3.dex */
    public static final class k0 extends AbstractC29096d {

        /* renamed from: s */
        Object f115319s;

        /* renamed from: t */
        /* synthetic */ Object f115320t;

        /* renamed from: v */
        int f115322v;

        k0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115320t = obj;
            this.f115322v |= Integer.MIN_VALUE;
            return C23870a.this.m124806d0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$k1 */
    /* loaded from: classes3.dex */
    public static final class k1 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Continuation f115323q;

        /* renamed from: r */
        final /* synthetic */ C23870a f115324r;

        /* renamed from: s */
        final /* synthetic */ C26318c f115325s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k1(Continuation continuation, C23870a c23870a, C26318c c26318c) {
            super(0);
            this.f115323q = continuation;
            this.f115324r = c23870a;
            this.f115325s = c26318c;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m124882a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m124882a() {
            CloudSettings cloudSettings;
            Continuation continuation = this.f115323q;
            CloudSettings m124816l0 = this.f115324r.m124816l0();
            if (m124816l0 != null) {
                C26318c c26318c = this.f115325s;
                cloudSettings = new CloudSettings(m124816l0.m41310e(), c26318c.m135455a(), c26318c.m135458d(), c26318c.m135456b(), c26318c.m135457c());
            } else {
                cloudSettings = null;
            }
            continuation.mo112492g(C24861r.m129218b(cloudSettings));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115326q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Continuation continuation) {
            super(1);
            this.f115326q = continuation;
        }

        /* renamed from: a */
        public final void m124883a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
            Continuation continuation = this.f115326q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124883a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$l0 */
    /* loaded from: classes3.dex */
    public static final class l0 extends AbstractC29096d {

        /* renamed from: s */
        Object f115327s;

        /* renamed from: t */
        Object f115328t;

        /* renamed from: u */
        Object f115329u;

        /* renamed from: v */
        Object f115330v;

        /* renamed from: w */
        Object f115331w;

        /* renamed from: x */
        /* synthetic */ Object f115332x;

        /* renamed from: z */
        int f115334z;

        l0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115332x = obj;
            this.f115334z |= Integer.MIN_VALUE;
            return C23870a.this.m124807e0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$l1 */
    /* loaded from: classes3.dex */
    public static final class l1 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115335q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l1(Continuation continuation) {
            super(2);
            this.f115335q = continuation;
        }

        /* renamed from: a */
        public final void m124884a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            this.f115335q.mo112492g(C24861r.m129218b(null));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124884a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f115336q;

        /* renamed from: r */
        final /* synthetic */ Continuation f115337r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2);
            this.f115336q = interfaceC18509p;
            this.f115337r = continuation;
        }

        /* renamed from: a */
        public final void m124885a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errMsg");
            this.f115336q.mo240pC(Integer.valueOf(i11), str);
            Continuation continuation = this.f115337r;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.FALSE));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124885a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$m0 */
    /* loaded from: classes3.dex */
    public static final class m0 extends AbstractC29096d {

        /* renamed from: s */
        Object f115338s;

        /* renamed from: t */
        Object f115339t;

        /* renamed from: u */
        Object f115340u;

        /* renamed from: v */
        Object f115341v;

        /* renamed from: w */
        Object f115342w;

        /* renamed from: x */
        /* synthetic */ Object f115343x;

        /* renamed from: z */
        int f115345z;

        m0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115343x = obj;
            this.f115345z |= Integer.MIN_VALUE;
            return C23870a.this.m124735g0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$m1 */
    /* loaded from: classes3.dex */
    public static final class m1 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Continuation f115346q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m1(Continuation continuation) {
            super(0);
            this.f115346q = continuation;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m124886a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m124886a() {
            Continuation continuation = this.f115346q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    /* renamed from: nl.a$n */
    /* loaded from: classes3.dex */
    public static final class n extends AbstractC29096d {

        /* renamed from: s */
        Object f115347s;

        /* renamed from: t */
        Object f115348t;

        /* renamed from: u */
        /* synthetic */ Object f115349u;

        /* renamed from: w */
        int f115351w;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115349u = obj;
            this.f115351w |= Integer.MIN_VALUE;
            return C23870a.this.m124764E(null, this);
        }
    }

    /* renamed from: nl.a$n0 */
    /* loaded from: classes3.dex */
    public static final class n0 extends AbstractC29096d {

        /* renamed from: s */
        Object f115352s;

        /* renamed from: t */
        Object f115353t;

        /* renamed from: u */
        /* synthetic */ Object f115354u;

        /* renamed from: w */
        int f115356w;

        n0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115354u = obj;
            this.f115356w |= Integer.MIN_VALUE;
            return C23870a.this.m124748p0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$n1 */
    /* loaded from: classes3.dex */
    public static final class n1 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115357q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n1(Continuation continuation) {
            super(2);
            this.f115357q = continuation;
        }

        /* renamed from: a */
        public final void m124887a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            Continuation continuation = this.f115357q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.FALSE));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124887a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC29096d {

        /* renamed from: s */
        Object f115358s;

        /* renamed from: t */
        Object f115359t;

        /* renamed from: u */
        long f115360u;

        /* renamed from: v */
        /* synthetic */ Object f115361v;

        /* renamed from: x */
        int f115363x;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115361v = obj;
            this.f115363x |= Integer.MIN_VALUE;
            return C23870a.this.m124770H(null, 0L, this);
        }
    }

    /* renamed from: nl.a$o0 */
    /* loaded from: classes3.dex */
    public static final class o0 extends AbstractC29096d {

        /* renamed from: s */
        Object f115364s;

        /* renamed from: t */
        /* synthetic */ Object f115365t;

        /* renamed from: v */
        int f115367v;

        o0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115365t = obj;
            this.f115367v |= Integer.MIN_VALUE;
            return C23870a.this.m124826q0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$o1 */
    /* loaded from: classes3.dex */
    public static final class o1 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115368q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o1(Continuation continuation) {
            super(1);
            this.f115368q = continuation;
        }

        /* renamed from: a */
        public final void m124888a(VerifyCloudQueueResponse verifyCloudQueueResponse) {
            AbstractC19074t.m100208f(verifyCloudQueueResponse, "it");
            this.f115368q.mo112492g(C24861r.m129218b(verifyCloudQueueResponse));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124888a((VerifyCloudQueueResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$p */
    /* loaded from: classes3.dex */
    public static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115369t;

        p(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115369t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC24812c interfaceC24812c = C23870a.this.f115238a;
                this.f115369t = 1;
                obj = interfaceC24812c.mo128951F(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nl.a$p0 */
    /* loaded from: classes3.dex */
    public static final class p0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115371t;

        /* renamed from: u */
        private /* synthetic */ Object f115372u;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f115374w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f115374w = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            p0 p0Var = new p0(this.f115374w, continuation);
            p0Var.f115372u = obj;
            return p0Var;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115371t == 0) {
                AbstractC24862s.m129228b(obj);
                C23870a.this.m124749r((CoroutineScope) this.f115372u, this.f115374w);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$p1 */
    /* loaded from: classes3.dex */
    public static final class p1 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115375q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p1(Continuation continuation) {
            super(2);
            this.f115375q = continuation;
        }

        /* renamed from: a */
        public final void m124891a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            this.f115375q.mo112492g(C24861r.m129218b(null));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124891a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$q */
    /* loaded from: classes3.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f115376q;

        /* renamed from: r */
        final /* synthetic */ String f115377r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(InterfaceC18505l interfaceC18505l, String str) {
            super(1);
            this.f115376q = interfaceC18505l;
            this.f115377r = str;
        }

        /* renamed from: a */
        public final void m124892a(DownloadUrlsResponse downloadUrlsResponse) {
            AbstractC19074t.m100208f(downloadUrlsResponse, "it");
            InterfaceC18505l interfaceC18505l = this.f115376q;
            String str = (String) downloadUrlsResponse.m41335b().get(this.f115377r);
            if (str == null) {
                str = "";
            }
            interfaceC18505l.mo205i9(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124892a((DownloadUrlsResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$q0 */
    /* loaded from: classes3.dex */
    public static final class q0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115378t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f115380v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q0(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f115380v = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new q0(this.f115380v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115378t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a c23870a = C23870a.this;
                InterfaceC18505l interfaceC18505l = this.f115380v;
                this.f115378t = 1;
                if (c23870a.m124730d1(interfaceC18505l, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nl.a$r */
    /* loaded from: classes3.dex */
    public static final class r extends AbstractC29096d {

        /* renamed from: s */
        Object f115381s;

        /* renamed from: t */
        /* synthetic */ Object f115382t;

        /* renamed from: v */
        int f115384v;

        r(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115382t = obj;
            this.f115384v |= Integer.MIN_VALUE;
            return C23870a.this.m124777L(null, this);
        }
    }

    /* renamed from: nl.a$r0 */
    /* loaded from: classes3.dex */
    public static final class r0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115385t;

        /* renamed from: u */
        private /* synthetic */ Object f115386u;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18505l f115388w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f115388w = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            r0 r0Var = new r0(this.f115388w, continuation);
            r0Var.f115386u = obj;
            return r0Var;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115385t == 0) {
                AbstractC24862s.m129228b(obj);
                C23870a.m124752t(C23870a.this, (CoroutineScope) this.f115386u, this.f115388w, false, 2, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nl.a$s */
    /* loaded from: classes3.dex */
    public static final class s extends AbstractC29096d {

        /* renamed from: s */
        Object f115389s;

        /* renamed from: t */
        Object f115390t;

        /* renamed from: u */
        /* synthetic */ Object f115391u;

        /* renamed from: w */
        int f115393w;

        s(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115391u = obj;
            this.f115393w |= Integer.MIN_VALUE;
            return C23870a.this.m124781N(null, this);
        }
    }

    /* renamed from: nl.a$s0 */
    /* loaded from: classes3.dex */
    public static final class s0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115394t;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f115396v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(2, continuation);
            this.f115396v = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new s0(this.f115396v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f115394t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C23870a c23870a = C23870a.this;
                InterfaceC18505l interfaceC18505l = this.f115396v;
                this.f115394t = 1;
                if (c23870a.m124732e1(interfaceC18505l, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: nl.a$t */
    /* loaded from: classes3.dex */
    public static final class t extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115397q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Continuation continuation) {
            super(1);
            this.f115397q = continuation;
        }

        /* renamed from: a */
        public final void m124896a(DownloadUrlsResponse downloadUrlsResponse) {
            AbstractC19074t.m100208f(downloadUrlsResponse, "it");
            this.f115397q.mo112492g(C24861r.m129218b(downloadUrlsResponse));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124896a((DownloadUrlsResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$t0 */
    /* loaded from: classes3.dex */
    public static final class t0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final t0 f115398q = new t0();

        t0() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final CharSequence mo205i9(String str) {
            AbstractC19074t.m100208f(str, "it");
            return str;
        }
    }

    /* renamed from: nl.a$u */
    /* loaded from: classes3.dex */
    public static final class u extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115399q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Continuation continuation) {
            super(2);
            this.f115399q = continuation;
        }

        /* renamed from: a */
        public final void m124898a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            this.f115399q.mo112492g(C24861r.m129218b(null));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124898a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$u0 */
    /* loaded from: classes3.dex */
    public static final class u0 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f115400s;

        /* renamed from: u */
        int f115402u;

        u0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f115400s = obj;
            this.f115402u |= Integer.MIN_VALUE;
            return C23870a.this.m124784O0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$v */
    /* loaded from: classes3.dex */
    public static final class v extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115403q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(Continuation continuation) {
            super(1);
            this.f115403q = continuation;
        }

        /* renamed from: a */
        public final void m124899a(CloudInfoResponse cloudInfoResponse) {
            AbstractC19074t.m100208f(cloudInfoResponse, "it");
            this.f115403q.mo112492g(C24861r.m129218b(cloudInfoResponse));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124899a((CloudInfoResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$v0 */
    /* loaded from: classes3.dex */
    public static final class v0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115404t;

        /* renamed from: u */
        private /* synthetic */ Object f115405u;

        v0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            v0 v0Var = new v0(continuation);
            v0Var.f115405u = obj;
            return v0Var;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115404t == 0) {
                AbstractC24862s.m129228b(obj);
                C23870a.this.m124749r((CoroutineScope) this.f115405u, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((v0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$w */
    /* loaded from: classes3.dex */
    public static final class w extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115407q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Continuation continuation) {
            super(2);
            this.f115407q = continuation;
        }

        /* renamed from: a */
        public final void m124901a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errMsg");
            this.f115407q.mo112492g(C24861r.m129218b(null));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124901a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nl.a$w0 */
    /* loaded from: classes3.dex */
    public static final class w0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f115408t;

        /* renamed from: u */
        private /* synthetic */ Object f115409u;

        w0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            w0 w0Var = new w0(continuation);
            w0Var.f115409u = obj;
            return w0Var;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f115408t == 0) {
                AbstractC24862s.m129228b(obj);
                C23870a.this.m124751s((CoroutineScope) this.f115409u, null, true);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((w0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$x */
    /* loaded from: classes3.dex */
    public static final class x extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115411q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(Continuation continuation) {
            super(1);
            this.f115411q = continuation;
        }

        /* renamed from: a */
        public final void m124903a(CloudKeyResponse cloudKeyResponse) {
            AbstractC19074t.m100208f(cloudKeyResponse, "it");
            this.f115411q.mo112492g(C24861r.m129218b(cloudKeyResponse));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124903a((CloudKeyResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$x0 */
    /* loaded from: classes3.dex */
    public static final class x0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115412q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(Continuation continuation) {
            super(1);
            this.f115412q = continuation;
        }

        /* renamed from: a */
        public final void m124904a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
            Continuation continuation = this.f115412q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124904a(obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$y */
    /* loaded from: classes3.dex */
    public static final class y extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        final /* synthetic */ Continuation f115413q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Continuation continuation) {
            super(3);
            this.f115413q = continuation;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m124905a(((Number) obj).intValue(), (String) obj2, (String) obj3);
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m124905a(int i11, String str, String str2) {
            AbstractC19074t.m100208f(str, "errMsg");
            AbstractC19074t.m100208f(str2, "data");
            C26675a.m136890L(C26675a.f126213a, 1504111, i11, str, null, 0L, 0L, 56, null);
            this.f115413q.mo112492g(C24861r.m129218b(CloudKeyResponse.Companion.m41291a(i11, str2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$y0 */
    /* loaded from: classes3.dex */
    public static final class y0 extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Continuation f115414q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y0(Continuation continuation) {
            super(2);
            this.f115414q = continuation;
        }

        /* renamed from: a */
        public final void m124906a(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            Continuation continuation = this.f115414q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.FALSE));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m124906a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$z */
    /* loaded from: classes3.dex */
    public static final class z extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115415q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Continuation continuation) {
            super(1);
            this.f115415q = continuation;
        }

        /* renamed from: a */
        public final void m124907a(CloudSettings cloudSettings) {
            AbstractC19074t.m100208f(cloudSettings, "it");
            this.f115415q.mo112492g(C24861r.m129218b(cloudSettings));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124907a((CloudSettings) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nl.a$z0 */
    /* loaded from: classes3.dex */
    public static final class z0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Continuation f115416q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z0(Continuation continuation) {
            super(1);
            this.f115416q = continuation;
        }

        /* renamed from: a */
        public final void m124908a(Object obj) {
            AbstractC19074t.m100208f(obj, "it");
            Continuation continuation = this.f115416q;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124908a(obj);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f115257q);
        f115237p = m129210a;
    }

    public C23870a(InterfaceC24812c interfaceC24812c, InterfaceC24818i interfaceC24818i, InterfaceC27297c interfaceC27297c, C16805b c16805b, InterfaceC23792b interfaceC23792b, CoroutineDispatcher coroutineDispatcher) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(interfaceC24812c, "localDataSource");
        AbstractC19074t.m100208f(interfaceC24818i, "metadataDataSource");
        AbstractC19074t.m100208f(interfaceC27297c, "apiHelper");
        AbstractC19074t.m100208f(c16805b, "zaloCloudConfigs");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(coroutineDispatcher, "mainDispatcher");
        this.f115238a = interfaceC24812c;
        this.f115239b = interfaceC24818i;
        this.f115240c = interfaceC27297c;
        this.f115241d = c16805b;
        this.f115242e = interfaceC23792b;
        this.f115243f = coroutineDispatcher;
        this.f115244g = new Object();
        this.f115245h = new AtomicBoolean(false);
        this.f115246i = new AtomicBoolean(false);
        this.f115247j = new AtomicBoolean(false);
        this.f115248k = new AtomicBoolean(false);
        m129210a = AbstractC24856m.m129210a(h.f115289q);
        this.f115249l = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new i());
        this.f115250m = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(g.f115286q);
        this.f115251n = m129210a3;
        this.f115252o = ZCloudQuotaUsage.Companion.m41262b();
    }

    /* renamed from: B0 */
    public static /* synthetic */ Object m124717B0(C23870a c23870a, long j11, int i11, int i12, Continuation continuation, int i13, Object obj) {
        int i14;
        if ((i13 & 4) != 0) {
            i14 = 100;
        } else {
            i14 = i12;
        }
        return c23870a.m124757A0(j11, i11, i14, continuation);
    }

    /* renamed from: I0 */
    public static /* synthetic */ ZCloudQuotaUsage m124718I0(C23870a c23870a, boolean z11, CoroutineScope coroutineScope, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            coroutineScope = null;
        }
        if ((i11 & 4) != 0) {
            interfaceC18505l = null;
        }
        return c23870a.m124771H0(z11, coroutineScope, interfaceC18505l);
    }

    /* renamed from: T */
    private final void m124719T() {
        this.f115240c.mo139730q(new d0(), new e0());
    }

    /* renamed from: U */
    private final void m124720U() {
        this.f115240c.mo139717d(new f0(), new g0());
    }

    /* renamed from: U0 */
    public static /* synthetic */ boolean m124721U0(C23870a c23870a, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 21600000;
        }
        return c23870a.m124793T0(j11);
    }

    /* renamed from: V0 */
    public final void m124722V0(int i11, String str) {
        if (i11 != -69) {
            this.f115246i.set(false);
        } else {
            this.f115248k.set(true);
        }
        CloudQuotaUsage mo128974b = this.f115238a.mo128974b();
        C26676b.b bVar = C26676b.b.f126335t;
        C26676b.m136955e("SMLZCloudRepo", "onFetchMyCloudQuotaUsageFailed(): errorCode=" + i11 + ", errorMsg=" + str + ", oldQuotaUsage=" + mo128974b, bVar);
        if (!mo128974b.m41236l() && i11 != 50001) {
            C26676b.m136955e("SMLZCloudRepo", "onFetchMyCloudQuotaUsageFailed(): mark error usage", bVar);
            synchronized (this.f115244g) {
                this.f115238a.mo128979d0(CloudQuotaUsage.Companion.m41239a());
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: W0 */
    public final void m124723W0(MyCloudQuotaUsageResponse myCloudQuotaUsageResponse) {
        CloudQuotaUsage.AbuseInfo abuseInfo;
        this.f115248k.set(false);
        C0860a m120691m2 = AbstractC23306f.m120691m2();
        AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
        C0860a.m2454k(m120691m2, myCloudQuotaUsageResponse.m41373b(), false, 2, null);
        AbuseInfo m41372a = myCloudQuotaUsageResponse.m41372a();
        if (m41372a != null) {
            abuseInfo = new CloudQuotaUsage.AbuseInfo(m41372a.m41269a());
        } else {
            abuseInfo = null;
        }
        CloudQuotaUsage mo128966U = this.f115238a.mo128966U();
        CloudQuotaUsage cloudQuotaUsage = new CloudQuotaUsage(myCloudQuotaUsageResponse.m41374c(), myCloudQuotaUsageResponse.m41375d(), mo128966U.m41230f(), mo128966U.m41233i(), mo128966U.m41228d(), mo128966U.m41229e(), abuseInfo);
        synchronized (this.f115244g) {
            C26676b.m136957g("SMLZCloudRepo", "onFetchMyCloudQuotaUsageSuccess(): myCloud: " + cloudQuotaUsage, null, 4, null);
            this.f115238a.mo128979d0(cloudQuotaUsage);
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new v0(null), 3, null);
        }
    }

    /* renamed from: X0 */
    public final void m124724X0(int i11, String str) {
        if (i11 != -69) {
            this.f115245h.set(false);
        } else {
            this.f115247j.set(true);
        }
        C26676b.m136955e("SMLZCloudRepo", "onFetchZcloudQuotaUsageFailed(): errorCode=" + i11 + ", errorMsg=" + str + ", oldQuotaUsage=" + m124738i0(), C26676b.b.f126335t);
    }

    /* renamed from: Y0 */
    public final void m124725Y0(CloudQuotaUsageResponse cloudQuotaUsageResponse) {
        ZCloudQuotaUsage.AbuseInfo abuseInfo;
        ZCloudQuotaUsage m41246c;
        this.f115247j.set(false);
        C0860a m120691m2 = AbstractC23306f.m120691m2();
        AbstractC19074t.m100207e(m120691m2, "provideZaloCloudSubscriptionManager(...)");
        C0860a.m2454k(m120691m2, cloudQuotaUsageResponse.m41301b(), false, 2, null);
        AbuseInfo m41300a = cloudQuotaUsageResponse.m41300a();
        if (m41300a != null) {
            abuseInfo = new ZCloudQuotaUsage.AbuseInfo(m41300a.m41269a());
        } else {
            abuseInfo = null;
        }
        ZCloudQuotaUsage mo128989i0 = this.f115238a.mo128989i0();
        ZCloudQuotaUsage zCloudQuotaUsage = new ZCloudQuotaUsage(cloudQuotaUsageResponse.m41303d(), cloudQuotaUsageResponse.m41304e(), ZCloudQuotaUsage.Companion.m41263c(cloudQuotaUsageResponse.m41302c()), mo128989i0.m41250h(), mo128989i0.m41254l(), mo128989i0.m41248f(), mo128989i0.m41249g(), abuseInfo);
        synchronized (this.f115244g) {
            try {
                C26676b.m136957g("SMLZCloudRepo", "onFetchZcloudQuotaUsageSuccess(): allThread: " + zCloudQuotaUsage, null, 4, null);
                if (!AbstractC19074t.m100204b(m124738i0(), zCloudQuotaUsage)) {
                    this.f115238a.mo128960O(zCloudQuotaUsage);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m41246c = zCloudQuotaUsage.m41246c((r30 & 1) != 0 ? zCloudQuotaUsage.f43007a : 0L, (r30 & 2) != 0 ? zCloudQuotaUsage.f43008b : 0L, (r30 & 4) != 0 ? zCloudQuotaUsage.f43009c : null, (r30 & 8) != 0 ? zCloudQuotaUsage.f43010d : 0L, (r30 & 16) != 0 ? zCloudQuotaUsage.f43011e : 0L, (r30 & 32) != 0 ? zCloudQuotaUsage.f43012f : 0L, (r30 & 64) != 0 ? zCloudQuotaUsage.f43013g : 0L, (r30 & 128) != 0 ? zCloudQuotaUsage.f43014h : null);
                    this.f115252o = m41246c;
                }
                BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new w0(null), 3, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d1 */
    public final Object m124730d1(InterfaceC18505l interfaceC18505l, Continuation continuation) {
        Object m142578e;
        Object m17497e = AbstractC3489d.m17497e(4, 1000L, 30000L, 2.0d, new c1(interfaceC18505l, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m17497e == m142578e) {
            return m17497e;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: e1 */
    public final Object m124732e1(InterfaceC18505l interfaceC18505l, Continuation continuation) {
        Object m142578e;
        Object m17497e = AbstractC3489d.m17497e(4, 1000L, 30000L, 2.0d, new d1(interfaceC18505l, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m17497e == m142578e) {
            return m17497e;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012e A[LOOP:0: B:12:0x0128->B:14:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2 A[LOOP:1: B:23:0x00bc->B:25:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124735g0(String str, Continuation continuation) {
        m0 m0Var;
        Object m142578e;
        int i11;
        ConcurrentHashMap concurrentHashMap;
        String str2;
        C23870a c23870a;
        C23870a c23870a2;
        List list;
        String str3;
        if (continuation instanceof m0) {
            m0Var = (m0) continuation;
            int i12 = m0Var.f115345z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                m0Var.f115345z = i12 - Integer.MIN_VALUE;
                Object obj = m0Var.f115343x;
                m142578e = AbstractC28298d.m142578e();
                i11 = m0Var.f115345z;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c23870a = (C23870a) m0Var.f115339t;
                            str3 = (String) m0Var.f115338s;
                            AbstractC24862s.m129228b(obj);
                            List<C25821b> list2 = (List) obj;
                            C26676b.m136957g("SMLZCloudRepo", "getAllCloudMediaItemInternal(" + str3 + "): Loaded " + list2.size() + " item(s)", null, 4, null);
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                            for (C25821b c25821b : list2) {
                                concurrentHashMap2.put(c25821b.m133141d(), c25821b);
                            }
                            c23870a.m124742k0().put(str3, concurrentHashMap2);
                            return list2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) m0Var.f115341v;
                    concurrentHashMap = (ConcurrentHashMap) m0Var.f115340u;
                    str2 = (String) m0Var.f115339t;
                    c23870a2 = (C23870a) m0Var.f115338s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    concurrentHashMap = (ConcurrentHashMap) m124742k0().get(str);
                    if (concurrentHashMap != null) {
                        ArrayList arrayList = new ArrayList();
                        List mo129007u = this.f115238a.mo129007u(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : mo129007u) {
                            C25821b c25821b2 = (C25821b) concurrentHashMap.get((String) obj2);
                            if (c25821b2 != null) {
                                AbstractC19074t.m100205c(c25821b2);
                                arrayList.add(c25821b2);
                            } else {
                                arrayList2.add(obj2);
                            }
                        }
                        InterfaceC24812c interfaceC24812c = this.f115238a;
                        m0Var.f115338s = this;
                        m0Var.f115339t = str;
                        m0Var.f115340u = concurrentHashMap;
                        m0Var.f115341v = arrayList;
                        m0Var.f115342w = arrayList2;
                        m0Var.f115345z = 1;
                        Object mo128994l = interfaceC24812c.mo128994l(arrayList2, m0Var);
                        if (mo128994l == m142578e) {
                            return m142578e;
                        }
                        c23870a2 = this;
                        str2 = str;
                        list = arrayList;
                        obj = mo128994l;
                    } else {
                        str2 = str;
                        c23870a = this;
                        InterfaceC24812c interfaceC24812c2 = c23870a.f115238a;
                        m0Var.f115338s = str2;
                        m0Var.f115339t = c23870a;
                        m0Var.f115340u = null;
                        m0Var.f115341v = null;
                        m0Var.f115342w = null;
                        m0Var.f115345z = 2;
                        obj = interfaceC24812c2.mo129004r(str2, m0Var);
                        if (obj != m142578e) {
                            return m142578e;
                        }
                        str3 = str2;
                        List<C25821b> list22 = (List) obj;
                        C26676b.m136957g("SMLZCloudRepo", "getAllCloudMediaItemInternal(" + str3 + "): Loaded " + list22.size() + " item(s)", null, 4, null);
                        ConcurrentHashMap concurrentHashMap22 = new ConcurrentHashMap();
                        while (r2.hasNext()) {
                        }
                        c23870a.m124742k0().put(str3, concurrentHashMap22);
                        return list22;
                    }
                }
                for (C25821b c25821b3 : (Iterable) obj) {
                    AbstractC19074t.m100205c(concurrentHashMap);
                    concurrentHashMap.put(c25821b3.m133141d(), c25821b3);
                    list.add(c25821b3);
                }
                if (list != null) {
                    c23870a = c23870a2;
                    InterfaceC24812c interfaceC24812c22 = c23870a.f115238a;
                    m0Var.f115338s = str2;
                    m0Var.f115339t = c23870a;
                    m0Var.f115340u = null;
                    m0Var.f115341v = null;
                    m0Var.f115342w = null;
                    m0Var.f115345z = 2;
                    obj = interfaceC24812c22.mo129004r(str2, m0Var);
                    if (obj != m142578e) {
                    }
                } else {
                    return list;
                }
            }
        }
        m0Var = new m0(continuation);
        Object obj3 = m0Var.f115343x;
        m142578e = AbstractC28298d.m142578e();
        i11 = m0Var.f115345z;
        if (i11 == 0) {
        }
        while (r13.hasNext()) {
        }
        if (list != null) {
        }
    }

    /* renamed from: i0 */
    private final ZCloudQuotaUsage m124738i0() {
        ZCloudQuotaUsage m41246c;
        if (!AbstractC19074t.m100204b(this.f115252o, ZCloudQuotaUsage.Companion.m41262b())) {
            return this.f115252o;
        }
        ZCloudQuotaUsage mo128997m0 = this.f115238a.mo128997m0();
        m41246c = mo128997m0.m41246c((r30 & 1) != 0 ? mo128997m0.f43007a : 0L, (r30 & 2) != 0 ? mo128997m0.f43008b : 0L, (r30 & 4) != 0 ? mo128997m0.f43009c : null, (r30 & 8) != 0 ? mo128997m0.f43010d : 0L, (r30 & 16) != 0 ? mo128997m0.f43011e : 0L, (r30 & 32) != 0 ? mo128997m0.f43012f : 0L, (r30 & 64) != 0 ? mo128997m0.f43013g : 0L, (r30 & 128) != 0 ? mo128997m0.f43014h : null);
        this.f115252o = m41246c;
        return mo128997m0;
    }

    /* renamed from: j0 */
    private final ConcurrentHashMap m124740j0() {
        return (ConcurrentHashMap) this.f115251n.getValue();
    }

    /* renamed from: k0 */
    private final ConcurrentHashMap m124742k0() {
        return (ConcurrentHashMap) this.f115249l.getValue();
    }

    /* renamed from: n0 */
    private final Set m124746n0() {
        return (Set) this.f115250m.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124748p0(C17945a0 c17945a0, Continuation continuation) {
        n0 n0Var;
        Object obj;
        Object m142578e;
        int i11;
        C23870a c23870a;
        if (continuation instanceof n0) {
            n0Var = (n0) continuation;
            int i12 = n0Var.f115356w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                n0Var.f115356w = i12 - Integer.MIN_VALUE;
                obj = n0Var.f115354u;
                m142578e = AbstractC28298d.m142578e();
                i11 = n0Var.f115356w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c17945a0 = (C17945a0) n0Var.f115353t;
                        c23870a = (C23870a) n0Var.f115352s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    MessageId m95029V3 = c17945a0.m95029V3();
                    AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                    n0Var.f115352s = this;
                    n0Var.f115353t = c17945a0;
                    n0Var.f115356w = 1;
                    obj = m124794V(m95029V3, n0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c23870a = this;
                }
                if (obj == null) {
                    return EnumC24250a.f117143r;
                }
                if (c23870a.m124746n0().contains(c17945a0.m95029V3().m41044h())) {
                    C26676b.m136957g("SMLZCloudRepo", "getCloudMediaStatus(): [TEMP] messageId=" + c17945a0.m95029V3() + ")", null, 4, null);
                    return EnumC24250a.f117142q;
                }
                long m124837v0 = c23870a.m124837v0();
                if (c17945a0.m94974P4() < m124837v0) {
                    C26676b.m136957g("SMLZCloudRepo", "getCloudMediaStatus(): [TEMP] messageId=" + c17945a0.m95029V3() + ", msgTS=" + c17945a0.m94974P4() + ", verifiedPivotTS=" + m124837v0, null, 4, null);
                    return EnumC24250a.f117142q;
                }
                return EnumC24250a.f117141p;
            }
        }
        n0Var = new n0(continuation);
        obj = n0Var.f115354u;
        m142578e = AbstractC28298d.m142578e();
        i11 = n0Var.f115356w;
        if (i11 == 0) {
        }
        if (obj == null) {
        }
    }

    /* renamed from: r */
    public final void m124749r(CoroutineScope coroutineScope, InterfaceC18505l interfaceC18505l) {
        synchronized (this.f115244g) {
            CloudQuotaUsage mo128974b = this.f115238a.mo128974b();
            CloudQuotaUsage mo128966U = this.f115238a.mo128966U();
            CloudQuotaUsage cloudQuotaUsage = new CloudQuotaUsage(mo128974b.m41231g(), mo128966U.m41232h(), mo128966U.m41230f(), mo128966U.m41233i(), mo128966U.m41228d(), mo128966U.m41229e(), mo128974b.m41227c());
            this.f115238a.mo128979d0(cloudQuotaUsage);
            BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f115243f, null, new j(interfaceC18505l, this, cloudQuotaUsage, null), 2, null);
        }
    }

    /* renamed from: r0 */
    public static final C23870a m124750r0() {
        return Companion.m124854a();
    }

    /* renamed from: s */
    public final void m124751s(CoroutineScope coroutineScope, InterfaceC18505l interfaceC18505l, boolean z11) {
        ZCloudQuotaUsage m124738i0;
        ZCloudQuotaUsage mo128989i0;
        ZCloudQuotaUsage zCloudQuotaUsage;
        C23870a c23870a;
        ZCloudQuotaUsage m41246c;
        synchronized (this.f115244g) {
            try {
                m124738i0 = m124738i0();
                mo128989i0 = this.f115238a.mo128989i0();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                ZCloudQuotaUsage zCloudQuotaUsage2 = new ZCloudQuotaUsage(m124738i0.m41252j(), m124738i0.m41253k(), m124738i0.m41251i(), mo128989i0.m41250h(), mo128989i0.m41254l(), mo128989i0.m41248f(), mo128989i0.m41249g(), m124738i0.m41247e());
                if (!AbstractC19074t.m100204b(m124738i0, zCloudQuotaUsage2)) {
                    zCloudQuotaUsage = zCloudQuotaUsage2;
                    c23870a = this;
                    c23870a.f115238a.mo128960O(zCloudQuotaUsage);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m41246c = zCloudQuotaUsage.m41246c((r30 & 1) != 0 ? zCloudQuotaUsage.f43007a : 0L, (r30 & 2) != 0 ? zCloudQuotaUsage.f43008b : 0L, (r30 & 4) != 0 ? zCloudQuotaUsage.f43009c : null, (r30 & 8) != 0 ? zCloudQuotaUsage.f43010d : 0L, (r30 & 16) != 0 ? zCloudQuotaUsage.f43011e : 0L, (r30 & 32) != 0 ? zCloudQuotaUsage.f43012f : 0L, (r30 & 64) != 0 ? zCloudQuotaUsage.f43013g : 0L, (r30 & 128) != 0 ? zCloudQuotaUsage.f43014h : null);
                    c23870a.f115252o = m41246c;
                } else {
                    zCloudQuotaUsage = zCloudQuotaUsage2;
                    c23870a = this;
                }
                if (z11) {
                    C23744a.Companion.m124119a().m124116d(150804, zCloudQuotaUsage);
                }
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, c23870a.f115243f, null, new k(interfaceC18505l, c23870a, zCloudQuotaUsage, null), 2, null);
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    /* renamed from: t */
    static /* synthetic */ void m124752t(C23870a c23870a, CoroutineScope coroutineScope, InterfaceC18505l interfaceC18505l, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c23870a.m124751s(coroutineScope, interfaceC18505l, z11);
    }

    /* renamed from: w */
    public final CloudQuotaUsage m124753w(CloudQuotaUsage cloudQuotaUsage) {
        if (m124786P0()) {
            return cloudQuotaUsage;
        }
        return new CloudQuotaUsage(cloudQuotaUsage.m41231g(), cloudQuotaUsage.m41232h(), 0L, 0L, 0L, 0L, (CloudQuotaUsage.AbuseInfo) null, 124, (AbstractC19060k) null);
    }

    /* renamed from: x */
    public final ZCloudQuotaUsage m124754x(ZCloudQuotaUsage zCloudQuotaUsage) {
        if (m124786P0()) {
            return zCloudQuotaUsage;
        }
        return new ZCloudQuotaUsage(zCloudQuotaUsage.m41252j(), zCloudQuotaUsage.m41253k(), ZCloudQuotaUsage.Companion.m41261a(zCloudQuotaUsage.m41251i()), 0L, 0L, 0L, 0L, (ZCloudQuotaUsage.AbuseInfo) null, 248, (AbstractC19060k) null);
    }

    /* renamed from: z0 */
    public static /* synthetic */ CloudQuotaUsage m124755z0(C23870a c23870a, CoroutineScope coroutineScope, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineScope = null;
        }
        if ((i11 & 2) != 0) {
            interfaceC18505l = null;
        }
        return c23870a.m124844y0(coroutineScope, interfaceC18505l);
    }

    /* renamed from: A */
    public final Object m124756A(Continuation continuation) {
        return this.f115238a.mo128980e(continuation);
    }

    /* renamed from: A0 */
    public final Object m124757A0(long j11, int i11, int i12, Continuation continuation) {
        return this.f115238a.mo128959N(j11, i11, i12, continuation);
    }

    /* renamed from: A1 */
    public final Object m124758A1(C26319d c26319d, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139721h(c26319d, new o1(c27317h), new p1(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: B */
    public final void m124759B() {
        this.f115238a.mo128987h0();
    }

    /* renamed from: C */
    public final Object m124760C(Continuation continuation) {
        Object m142578e;
        Object mo128953H = this.f115238a.mo128953H(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo128953H == m142578e) {
            return mo128953H;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: C0 */
    public final Object m124761C0(int i11, Continuation continuation) {
        return this.f115238a.mo128971Z(i11, continuation);
    }

    /* renamed from: D */
    public final void m124762D(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "msgId");
        this.f115238a.mo128986h(messageId);
    }

    /* renamed from: D0 */
    public final long m124763D0() {
        return this.f115238a.mo129001o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124764E(List list, Continuation continuation) {
        n nVar;
        Object m142578e;
        int i11;
        C23870a c23870a;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i12 = nVar.f115351w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                nVar.f115351w = i12 - Integer.MIN_VALUE;
                Object obj = nVar.f115349u;
                m142578e = AbstractC28298d.m142578e();
                i11 = nVar.f115351w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        list = (List) nVar.f115348t;
                        c23870a = (C23870a) nVar.f115347s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136957g("SMLZCloudRepo", "DELETE: " + list, null, 4, null);
                    InterfaceC24812c interfaceC24812c = this.f115238a;
                    nVar.f115347s = this;
                    nVar.f115348t = list;
                    nVar.f115351w = 1;
                    if (interfaceC24812c.mo128954I(list, nVar) == m142578e) {
                        return m142578e;
                    }
                    c23870a = this;
                }
                c23870a.f115238a.mo128998n(list);
                return C24848g0.f119245a;
            }
        }
        nVar = new n(continuation);
        Object obj2 = nVar.f115349u;
        m142578e = AbstractC28298d.m142578e();
        i11 = nVar.f115351w;
        if (i11 == 0) {
        }
        c23870a.f115238a.mo128998n(list);
        return C24848g0.f119245a;
    }

    /* renamed from: E0 */
    public final Object m124765E0(Continuation continuation) {
        return this.f115238a.mo128952G(continuation);
    }

    /* renamed from: F */
    public final Object m124766F(List list, Continuation continuation) {
        Object m142578e;
        Object mo128982f = this.f115238a.mo128982f(list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo128982f == m142578e) {
            return mo128982f;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: F0 */
    public final int m124767F0() {
        int mo128957L = this.f115238a.mo128957L();
        if (mo128957L == -1) {
            return 0;
        }
        return mo128957L;
    }

    /* renamed from: G */
    public final Object m124768G(List list, Continuation continuation) {
        Object m142578e;
        Object mo128948C = this.f115238a.mo128948C(list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo128948C == m142578e) {
            return mo128948C;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: G0 */
    public final int m124769G0() {
        return this.f115238a.mo128956K();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124770H(String str, long j11, Continuation continuation) {
        o oVar;
        Object m142578e;
        int i11;
        C23870a c23870a;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i12 = oVar.f115363x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                oVar.f115363x = i12 - Integer.MIN_VALUE;
                Object obj = oVar.f115361v;
                m142578e = AbstractC28298d.m142578e();
                i11 = oVar.f115363x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        j11 = oVar.f115360u;
                        str = (String) oVar.f115359t;
                        c23870a = (C23870a) oVar.f115358s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136957g("SMLZCloudRepo", "DELETE THREAD: ownerId=" + str + ", pivotTS=" + j11, null, 4, null);
                    InterfaceC24812c interfaceC24812c = this.f115238a;
                    oVar.f115358s = this;
                    oVar.f115359t = str;
                    oVar.f115360u = j11;
                    oVar.f115363x = 1;
                    if (interfaceC24812c.mo128961P(str, j11, oVar) == m142578e) {
                        return m142578e;
                    }
                    c23870a = this;
                }
                c23870a.f115238a.mo128975b0(str, j11);
                c23870a.m124742k0().remove(str);
                return C24848g0.f119245a;
            }
        }
        oVar = new o(continuation);
        Object obj2 = oVar.f115361v;
        m142578e = AbstractC28298d.m142578e();
        i11 = oVar.f115363x;
        if (i11 == 0) {
        }
        c23870a.f115238a.mo128975b0(str, j11);
        c23870a.m124742k0().remove(str);
        return C24848g0.f119245a;
    }

    /* renamed from: H0 */
    public final ZCloudQuotaUsage m124771H0(boolean z11, CoroutineScope coroutineScope, InterfaceC18505l interfaceC18505l) {
        ZCloudQuotaUsage m124754x;
        if (!this.f115245h.get()) {
            this.f115245h.set(true);
            m124720U();
        } else if (z11) {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new r0(interfaceC18505l, null), 3, null);
        }
        synchronized (this.f115244g) {
            try {
                m124754x = m124754x(m124738i0());
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(m124754x);
                }
                if (coroutineScope != null && m124754x.m41252j() <= 0) {
                    BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new s0(interfaceC18505l, null), 3, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m124754x;
    }

    /* renamed from: I */
    public final void m124772I() {
        this.f115238a.mo128983f0();
    }

    /* renamed from: J */
    public final void m124773J() {
        Object m112536b;
        String m127130z;
        String m127130z2;
        m112536b = BuildersKt__BuildersKt.m112536b(null, new p(null), 1, null);
        int intValue = ((Number) m112536b).intValue();
        m127130z = AbstractC24341v.m127130z("─", 36);
        AtomicBoolean atomicBoolean = this.f115245h;
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        AbstractC20110a.f98889a.m104564x("SMLZCloudRepo").mo104556o(8, m127130z + "\nTotal item: " + intValue + "\nFetched quota usage: " + atomicBoolean + "\n" + m127130z2, new Object[0]);
    }

    /* renamed from: J0 */
    public final void m124774J0(JSONObject jSONObject, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(jSONObject, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f115240c.mo139720g(jSONObject, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: K */
    public final Object m124775K(Continuation continuation) {
        return this.f115238a.mo128951F(continuation);
    }

    /* renamed from: K0 */
    public final Object m124776K0(List list, Continuation continuation) {
        Object m142578e;
        C26676b.m136957g("SMLZCloudRepo", "INSERT: " + list, null, 4, null);
        Object mo128978d = this.f115238a.mo128978d(list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo128978d == m142578e) {
            return mo128978d;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124777L(String str, Continuation continuation) {
        r rVar;
        Object m142578e;
        int i11;
        List m131496e;
        DownloadUrlsResponse downloadUrlsResponse;
        Map m41335b;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i12 = rVar.f115384v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                rVar.f115384v = i12 - Integer.MIN_VALUE;
                Object obj = rVar.f115382t;
                m142578e = AbstractC28298d.m142578e();
                i11 = rVar.f115384v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        str = (String) rVar.f115381s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    a aVar = (a) m124740j0().get(str);
                    if (aVar != null) {
                        long mo124314i = this.f115242e.mo124314i();
                        String m124849b = aVar.m124849b();
                        if (aVar.m124848a() + 300000 < mo124314i) {
                            m124849b = null;
                        }
                        if (m124849b != null) {
                            return m124849b;
                        }
                    }
                    m131496e = AbstractC25366r.m131496e(str);
                    rVar.f115381s = str;
                    rVar.f115384v = 1;
                    obj = m124781N(m131496e, rVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                downloadUrlsResponse = (DownloadUrlsResponse) obj;
                if (downloadUrlsResponse == null && (m41335b = downloadUrlsResponse.m41335b()) != null) {
                    return (String) m41335b.get(str);
                }
            }
        }
        rVar = new r(continuation);
        Object obj2 = rVar.f115382t;
        m142578e = AbstractC28298d.m142578e();
        i11 = rVar.f115384v;
        if (i11 == 0) {
        }
        downloadUrlsResponse = (DownloadUrlsResponse) obj2;
        return downloadUrlsResponse == null ? null : null;
    }

    /* renamed from: L0 */
    public final Object m124778L0(C25820a c25820a, Continuation continuation) {
        Object m142578e;
        Object mo129055b = this.f115239b.mo129055b(c25820a, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo129055b == m142578e) {
            return mo129055b;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: M */
    public final void m124779M(String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        List m131496e;
        AbstractC19074t.m100208f(str, "noiseId");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m131496e = AbstractC25366r.m131496e(str);
        m124783O(m131496e, new q(interfaceC18505l, str), interfaceC18509p);
    }

    /* renamed from: M0 */
    public final Object m124780M0(List list, Continuation continuation) {
        Object m142578e;
        Object mo128999n0 = this.f115238a.mo128999n0(list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo128999n0 == m142578e) {
            return mo128999n0;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124781N(List list, Continuation continuation) {
        s sVar;
        Object m142578e;
        int i11;
        Continuation m142576c;
        Object m142578e2;
        C23870a c23870a;
        DownloadUrlsResponse downloadUrlsResponse;
        int m131400e;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i12 = sVar.f115393w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                sVar.f115393w = i12 - Integer.MIN_VALUE;
                Object obj = sVar.f115391u;
                m142578e = AbstractC28298d.m142578e();
                i11 = sVar.f115393w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c23870a = (C23870a) sVar.f115389s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    sVar.f115389s = this;
                    sVar.f115390t = list;
                    sVar.f115393w = 1;
                    m142576c = AbstractC28297c.m142576c(sVar);
                    C27317h c27317h = new C27317h(m142576c);
                    this.f115240c.mo139726m(list, new t(c27317h), new u(c27317h));
                    obj = c27317h.m139856a();
                    m142578e2 = AbstractC28298d.m142578e();
                    if (obj == m142578e2) {
                        AbstractC29100h.m145355c(sVar);
                    }
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c23870a = this;
                }
                downloadUrlsResponse = (DownloadUrlsResponse) obj;
                if (downloadUrlsResponse == null) {
                    ConcurrentHashMap m124740j0 = c23870a.m124740j0();
                    Map m41335b = downloadUrlsResponse.m41335b();
                    m131400e = AbstractC25361o0.m131400e(m41335b.size());
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m131400e);
                    for (Map.Entry entry : m41335b.entrySet()) {
                        linkedHashMap.put(entry.getKey(), new a((String) entry.getValue(), c23870a.f115242e.mo124314i()));
                    }
                    m124740j0.putAll(linkedHashMap);
                    return downloadUrlsResponse;
                }
                return null;
            }
        }
        sVar = new s(continuation);
        Object obj2 = sVar.f115391u;
        m142578e = AbstractC28298d.m142578e();
        i11 = sVar.f115393w;
        if (i11 == 0) {
        }
        downloadUrlsResponse = (DownloadUrlsResponse) obj2;
        if (downloadUrlsResponse == null) {
        }
    }

    /* renamed from: N0 */
    public final Object m124782N0(List list, Continuation continuation) {
        String m131214n0;
        Object m142578e;
        m131214n0 = AbstractC25332a0.m131214n0(list, null, null, null, 0, null, t0.f115398q, 31, null);
        C26676b.m136957g("SMLZCloudRepo", "insertSyncMediaExtInfos(): noiseIds=" + m131214n0, null, 4, null);
        Object mo128990j = this.f115238a.mo128990j(list, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo128990j == m142578e) {
            return mo128990j;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: O */
    public final void m124783O(List list, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "noiseIds");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f115240c.mo139726m(list, interfaceC18505l, interfaceC18509p);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124784O0(Continuation continuation) {
        u0 u0Var;
        Object obj;
        Object m142578e;
        int i11;
        if (continuation instanceof u0) {
            u0Var = (u0) continuation;
            int i12 = u0Var.f115402u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                u0Var.f115402u = i12 - Integer.MIN_VALUE;
                obj = u0Var.f115400s;
                m142578e = AbstractC28298d.m142578e();
                i11 = u0Var.f115402u;
                boolean z11 = true;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    u0Var.f115402u = 1;
                    obj = m124797Y(u0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                if (obj == null) {
                    z11 = false;
                }
                return AbstractC29094b.m145339a(z11);
            }
        }
        u0Var = new u0(continuation);
        obj = u0Var.f115400s;
        m142578e = AbstractC28298d.m142578e();
        i11 = u0Var.f115402u;
        boolean z112 = true;
        if (i11 == 0) {
        }
        if (obj == null) {
        }
        return AbstractC29094b.m145339a(z112);
    }

    /* renamed from: P */
    public final Object m124785P(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139729p(new v(c27317h), new w(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: P0 */
    public final boolean m124786P0() {
        return this.f115238a.mo128967V();
    }

    /* renamed from: Q */
    public final Object m124787Q(String str, int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139727n(str, i11, new x(c27317h), new y(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: Q0 */
    public final boolean m124788Q0() {
        return this.f115238a.mo129006t();
    }

    /* renamed from: R */
    public final Object m124789R(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139719f(new z(c27317h), new a0(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: R0 */
    public final boolean m124790R0() {
        if (m124839w0() - this.f115242e.mo124314i() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final Object m124791S(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139732s(new b0(c27317h), new c0(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: S0 */
    public final boolean m124792S0() {
        if (m124790R0() && m124788Q0()) {
            return true;
        }
        return false;
    }

    /* renamed from: T0 */
    public final boolean m124793T0(long j11) {
        if (AbstractC3489d.m17505m() || !m124790R0()) {
            return false;
        }
        long m124831t0 = m124831t0();
        if (m124831t0 != 0 && this.f115242e.mo124314i() - m124831t0 < j11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124794V(MessageId messageId, Continuation continuation) {
        h0 h0Var;
        Object obj;
        Object m142578e;
        int i11;
        C23870a c23870a;
        C25821b c25821b;
        MessageId messageId2;
        ConcurrentHashMap concurrentHashMap;
        C23870a c23870a2;
        C25821b c25821b2;
        C25821b c25821b3;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i12 = h0Var.f115295x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                h0Var.f115295x = i12 - Integer.MIN_VALUE;
                obj = h0Var.f115293v;
                m142578e = AbstractC28298d.m142578e();
                i11 = h0Var.f115295x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            messageId = (MessageId) h0Var.f115291t;
                            c23870a2 = (C23870a) h0Var.f115290s;
                            AbstractC24862s.m129228b(obj);
                            c25821b3 = (C25821b) obj;
                            if (c25821b3 != null) {
                                return null;
                            }
                            ConcurrentHashMap m124742k0 = c23870a2.m124742k0();
                            String m41048l = messageId.m41048l();
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                            concurrentHashMap2.put(messageId.m41044h(), c25821b3);
                            m124742k0.put(m41048l, concurrentHashMap2);
                            return c25821b3;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    concurrentHashMap = (ConcurrentHashMap) h0Var.f115292u;
                    messageId2 = (MessageId) h0Var.f115291t;
                    c23870a = (C23870a) h0Var.f115290s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) m124742k0().get(messageId.m41048l());
                    if (concurrentHashMap3 != null) {
                        c25821b = (C25821b) concurrentHashMap3.get(messageId.m41044h());
                        if (c25821b == null) {
                            InterfaceC24812c interfaceC24812c = this.f115238a;
                            h0Var.f115290s = this;
                            h0Var.f115291t = messageId;
                            h0Var.f115292u = concurrentHashMap3;
                            h0Var.f115295x = 1;
                            Object mo128988i = interfaceC24812c.mo128988i(messageId, h0Var);
                            if (mo128988i == m142578e) {
                                return m142578e;
                            }
                            c23870a = this;
                            messageId2 = messageId;
                            concurrentHashMap = concurrentHashMap3;
                            obj = mo128988i;
                        } else {
                            c23870a = this;
                            if (c25821b != null) {
                                return c25821b;
                            }
                            InterfaceC24812c interfaceC24812c2 = c23870a.f115238a;
                            h0Var.f115290s = c23870a;
                            h0Var.f115291t = messageId;
                            h0Var.f115292u = null;
                            h0Var.f115295x = 2;
                            obj = interfaceC24812c2.mo128988i(messageId, h0Var);
                            if (obj != m142578e) {
                                return m142578e;
                            }
                            c23870a2 = c23870a;
                            c25821b3 = (C25821b) obj;
                            if (c25821b3 != null) {
                            }
                        }
                    } else {
                        c23870a = this;
                        InterfaceC24812c interfaceC24812c22 = c23870a.f115238a;
                        h0Var.f115290s = c23870a;
                        h0Var.f115291t = messageId;
                        h0Var.f115292u = null;
                        h0Var.f115295x = 2;
                        obj = interfaceC24812c22.mo128988i(messageId, h0Var);
                        if (obj != m142578e) {
                        }
                    }
                }
                c25821b2 = (C25821b) obj;
                if (c25821b2 == null) {
                    AbstractC19074t.m100205c(concurrentHashMap);
                    concurrentHashMap.put(messageId2.m41044h(), c25821b2);
                    messageId = messageId2;
                    c25821b = c25821b2;
                } else {
                    messageId = messageId2;
                    c25821b = null;
                }
                if (c25821b != null) {
                }
                InterfaceC24812c interfaceC24812c222 = c23870a.f115238a;
                h0Var.f115290s = c23870a;
                h0Var.f115291t = messageId;
                h0Var.f115292u = null;
                h0Var.f115295x = 2;
                obj = interfaceC24812c222.mo128988i(messageId, h0Var);
                if (obj != m142578e) {
                }
            }
        }
        h0Var = new h0(continuation);
        obj = h0Var.f115293v;
        m142578e = AbstractC28298d.m142578e();
        i11 = h0Var.f115295x;
        if (i11 == 0) {
        }
        c25821b2 = (C25821b) obj;
        if (c25821b2 == null) {
        }
        if (c25821b != null) {
        }
        InterfaceC24812c interfaceC24812c2222 = c23870a.f115238a;
        h0Var.f115290s = c23870a;
        h0Var.f115291t = messageId;
        h0Var.f115292u = null;
        h0Var.f115295x = 2;
        obj = interfaceC24812c2222.mo128988i(messageId, h0Var);
        if (obj != m142578e) {
        }
    }

    /* renamed from: W */
    public final C25821b m124795W(MessageId messageId) {
        Object m112536b;
        AbstractC19074t.m100208f(messageId, "msgId");
        m112536b = BuildersKt__BuildersKt.m112536b(null, new i0(messageId, null), 1, null);
        return (C25821b) m112536b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124796X(String str, List list, Continuation continuation) {
        j0 j0Var;
        Object m142578e;
        int i11;
        ArrayList arrayList;
        C25821b c25821b;
        if (continuation instanceof j0) {
            j0Var = (j0) continuation;
            int i12 = j0Var.f115313v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                j0Var.f115313v = i12 - Integer.MIN_VALUE;
                Object obj = j0Var.f115311t;
                m142578e = AbstractC28298d.m142578e();
                i11 = j0Var.f115313v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        arrayList = (ArrayList) j0Var.f115310s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        MessageId messageId = (MessageId) it.next();
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) m124742k0().get(str);
                        if (concurrentHashMap != null) {
                            c25821b = (C25821b) concurrentHashMap.get(messageId.m41044h());
                        } else {
                            c25821b = null;
                        }
                        if (c25821b != null) {
                            arrayList2.add(c25821b);
                        } else {
                            arrayList3.add(messageId);
                        }
                    }
                    InterfaceC24812c interfaceC24812c = this.f115238a;
                    j0Var.f115310s = arrayList2;
                    j0Var.f115313v = 1;
                    Object mo128958M = interfaceC24812c.mo128958M(str, arrayList3, j0Var);
                    if (mo128958M == m142578e) {
                        return m142578e;
                    }
                    obj = mo128958M;
                    arrayList = arrayList2;
                }
                arrayList.addAll((List) obj);
                return arrayList;
            }
        }
        j0Var = new j0(continuation);
        Object obj2 = j0Var.f115311t;
        m142578e = AbstractC28298d.m142578e();
        i11 = j0Var.f115313v;
        if (i11 == 0) {
        }
        arrayList.addAll((List) obj2);
        return arrayList;
    }

    /* renamed from: Y */
    public final Object m124797Y(Continuation continuation) {
        return this.f115239b.mo129056c(continuation);
    }

    /* renamed from: Z */
    public final Object m124798Z(int i11, long j11, int i12, Continuation continuation) {
        return this.f115238a.mo128965T(i11, j11, i12, "204278670", continuation);
    }

    /* renamed from: Z0 */
    public final Object m124799Z0(int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139715b(i11, new x0(c27317h), new y0(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: a0 */
    public final void m124800a0() {
        if (this.f115248k.get()) {
            return;
        }
        this.f115246i.set(false);
        m124755z0(this, null, null, 3, null);
    }

    /* renamed from: a1 */
    public final Object m124801a1(Continuation continuation) {
        Object m142578e;
        Object mo128991j0 = this.f115238a.mo128991j0(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo128991j0 == m142578e) {
            return mo128991j0;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: b0 */
    public final void m124802b0() {
        if (this.f115247j.get()) {
            return;
        }
        this.f115245h.set(false);
        m124718I0(this, false, null, null, 7, null);
    }

    /* renamed from: b1 */
    public final Object m124803b1(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139718e(new z0(c27317h), new a1(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: c0 */
    public final List m124804c0() {
        return this.f115238a.mo128995l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124805c1(long j11, Continuation continuation) {
        b1 b1Var;
        Object m142578e;
        int i11;
        List m131502j;
        C23870a c23870a;
        InterfaceC24812c interfaceC24812c;
        C23870a c23870a2;
        if (continuation instanceof b1) {
            b1Var = (b1) continuation;
            int i12 = b1Var.f115263w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                b1Var.f115263w = i12 - Integer.MIN_VALUE;
                Object obj = b1Var.f115261u;
                m142578e = AbstractC28298d.m142578e();
                i11 = b1Var.f115263w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            j11 = b1Var.f115260t;
                            c23870a2 = (C23870a) b1Var.f115259s;
                            AbstractC24862s.m129228b(obj);
                            c23870a2.m124815k1(j11);
                            c23870a2.m124843y();
                            return AbstractC29094b.m145339a(true);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = b1Var.f115260t;
                    c23870a = (C23870a) b1Var.f115259s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    long m124829s0 = m124829s0();
                    C26676b.m136957g("SMLZCloudRepo", "resetLocalCloudQueue(): pivotTS=" + j11 + ", lastResetCloudQueueTs=" + m124829s0, null, 4, null);
                    if (j11 <= m124829s0) {
                        C26676b.m136957g("SMLZCloudRepo", "resetLocalCloudQueue(): Cancel reset cloud queue due to already processed", null, 4, null);
                        return AbstractC29094b.m145339a(false);
                    }
                    InterfaceC24812c interfaceC24812c2 = this.f115238a;
                    m131502j = AbstractC25368s.m131502j();
                    b1Var.f115259s = this;
                    b1Var.f115260t = j11;
                    b1Var.f115263w = 1;
                    if (interfaceC24812c2.mo128984g(m131502j, j11, b1Var) == m142578e) {
                        return m142578e;
                    }
                    c23870a = this;
                }
                interfaceC24812c = c23870a.f115238a;
                b1Var.f115259s = c23870a;
                b1Var.f115260t = j11;
                b1Var.f115263w = 2;
                if (interfaceC24812c.mo128973a0(b1Var) != m142578e) {
                    return m142578e;
                }
                c23870a2 = c23870a;
                c23870a2.m124815k1(j11);
                c23870a2.m124843y();
                return AbstractC29094b.m145339a(true);
            }
        }
        b1Var = new b1(continuation);
        Object obj2 = b1Var.f115261u;
        m142578e = AbstractC28298d.m142578e();
        i11 = b1Var.f115263w;
        if (i11 == 0) {
        }
        interfaceC24812c = c23870a.f115238a;
        b1Var.f115259s = c23870a;
        b1Var.f115260t = j11;
        b1Var.f115263w = 2;
        if (interfaceC24812c.mo128973a0(b1Var) != m142578e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124806d0(String str, Continuation continuation) {
        k0 k0Var;
        Object m142578e;
        int i11;
        if (continuation instanceof k0) {
            k0Var = (k0) continuation;
            int i12 = k0Var.f115322v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                k0Var.f115322v = i12 - Integer.MIN_VALUE;
                Object obj = k0Var.f115320t;
                m142578e = AbstractC28298d.m142578e();
                i11 = k0Var.f115322v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        str = (String) k0Var.f115319s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    k0Var.f115319s = str;
                    k0Var.f115322v = 1;
                    obj = m124735g0(str, k0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                C26676b.m136957g("SMLZCloudRepo", "getAllCloudMediaItem(): Loaded " + ((List) obj).size() + " item(s) from thread [" + str + "]", null, 4, null);
                return obj;
            }
        }
        k0Var = new k0(continuation);
        Object obj2 = k0Var.f115320t;
        m142578e = AbstractC28298d.m142578e();
        i11 = k0Var.f115322v;
        if (i11 == 0) {
        }
        C26676b.m136957g("SMLZCloudRepo", "getAllCloudMediaItem(): Loaded " + ((List) obj2).size() + " item(s) from thread [" + str + "]", null, 4, null);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b7 -> B:10:0x00ba). Please report as a decompilation issue!!! */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124807e0(ArrayList arrayList, Continuation continuation) {
        l0 l0Var;
        Object m142578e;
        int i11;
        Iterator it;
        C23870a c23870a;
        ArrayList arrayList2;
        List list;
        if (continuation instanceof l0) {
            l0Var = (l0) continuation;
            int i12 = l0Var.f115334z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                l0Var.f115334z = i12 - Integer.MIN_VALUE;
                Object obj = l0Var.f115332x;
                m142578e = AbstractC28298d.m142578e();
                i11 = l0Var.f115334z;
                if (i11 == 0) {
                    if (i11 == 1) {
                        list = (List) l0Var.f115331w;
                        it = (Iterator) l0Var.f115330v;
                        List list2 = (List) l0Var.f115329u;
                        ArrayList arrayList3 = (ArrayList) l0Var.f115328t;
                        c23870a = (C23870a) l0Var.f115327s;
                        AbstractC24862s.m129228b(obj);
                        list.addAll((Collection) obj);
                        list = list2;
                        arrayList2 = arrayList3;
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            l0Var.f115327s = c23870a;
                            l0Var.f115328t = arrayList2;
                            l0Var.f115329u = list;
                            l0Var.f115330v = it;
                            l0Var.f115331w = list;
                            l0Var.f115334z = 1;
                            Object m124735g0 = c23870a.m124735g0(str, l0Var);
                            if (m124735g0 == m142578e) {
                                return m142578e;
                            }
                            arrayList3 = arrayList2;
                            obj = m124735g0;
                            list2 = list;
                            list.addAll((Collection) obj);
                            list = list2;
                            arrayList2 = arrayList3;
                            if (it.hasNext()) {
                                C26676b.m136957g("SMLZCloudRepo", "getAllCloudMediaItem(): Loaded " + list.size() + " item(s) from " + arrayList2.size() + " thread(s)", null, 4, null);
                                return list;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C26676b.m136957g("SMLZCloudRepo", "getAllCloudMediaItem(): Load data from " + arrayList.size() + " thread(s)", null, 4, null);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!AbstractC21935u.m114550q((String) obj2)) {
                            arrayList5.add(obj2);
                        }
                    }
                    it = arrayList5.iterator();
                    c23870a = this;
                    arrayList2 = arrayList;
                    list = arrayList4;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        l0Var = new l0(continuation);
        Object obj3 = l0Var.f115332x;
        m142578e = AbstractC28298d.m142578e();
        i11 = l0Var.f115334z;
        if (i11 == 0) {
        }
    }

    /* renamed from: f0 */
    public final List m124808f0() {
        List mo128969X = this.f115238a.mo128969X();
        C26676b.m136957g("SMLZCloudRepo", "getAllCloudMediaItem(): Loaded " + mo128969X.size() + " item(s)", null, 4, null);
        return mo128969X;
    }

    /* renamed from: f1 */
    public final void m124809f1(CloudSettings cloudSettings) {
        C26676b.m136955e("SMLZCloudRepo", "setCachedCloudSettings(): " + cloudSettings, C26676b.b.f126331p);
        this.f115238a.mo128977c0(cloudSettings);
    }

    /* renamed from: g1 */
    public final void m124810g1(CloudSubscriptionInfo cloudSubscriptionInfo) {
        C26676b.m136955e("SMLZCloudRepo", "setCachedSubscriptionInfo(): " + cloudSubscriptionInfo, C26676b.b.f126331p);
        this.f115238a.mo128996m(cloudSubscriptionInfo);
    }

    /* renamed from: h0 */
    public final List m124811h0() {
        List m131502j;
        try {
            return this.f115238a.mo129003q();
        } catch (Exception e11) {
            C26676b.m136954d("SMLZCloudRepo", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: h1 */
    public final void m124812h1(boolean z11) {
        this.f115238a.mo128968W(z11);
        C23744a.Companion.m124119a().m124116d(150802, new Object[0]);
    }

    /* renamed from: i1 */
    public final void m124813i1(boolean z11) {
        this.f115238a.mo129010x(z11);
    }

    /* renamed from: j1 */
    public final void m124814j1() {
        if (this.f115247j.get()) {
            return;
        }
        this.f115245h.set(false);
    }

    /* renamed from: k1 */
    public final void m124815k1(long j11) {
        this.f115238a.mo128972a(j11);
    }

    /* renamed from: l0 */
    public final CloudSettings m124816l0() {
        return CloudSettings.Companion.m41315a(this.f115238a.mo128955J());
    }

    /* renamed from: l1 */
    public final void m124817l1(String str) {
        AbstractC19074t.m100208f(str, "noiseId");
        this.f115238a.mo128962Q(str);
    }

    /* renamed from: m0 */
    public final CloudSubscriptionInfo m124818m0() {
        return CloudSubscriptionInfo.Companion.m41323a(this.f115238a.mo129012z());
    }

    /* renamed from: m1 */
    public final void m124819m1(long j11) {
        this.f115238a.mo129008v(j11);
    }

    /* renamed from: n1 */
    public final void m124820n1(int i11) {
        this.f115238a.mo128970Y(i11);
    }

    /* renamed from: o0 */
    public final Object m124821o0(C17945a0 c17945a0, Continuation continuation) {
        return m124748p0(c17945a0, continuation);
    }

    /* renamed from: o1 */
    public final void m124822o1(long j11) {
        this.f115238a.mo128981e0(j11);
    }

    /* renamed from: p */
    public final Object m124823p(String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139716c(str, new e(c27317h), new f(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: p1 */
    public final void m124824p1(long j11) {
        this.f115238a.mo128949D(j11);
    }

    /* renamed from: q */
    public final Object m124825q(String str, Continuation continuation) {
        Object m142578e;
        m124746n0().add(str);
        Object mo129002p = this.f115238a.mo129002p(str, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo129002p == m142578e) {
            return mo129002p;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m124826q0(Continuation continuation) {
        o0 o0Var;
        Object m142578e;
        int i11;
        C23870a c23870a;
        CloudUrlPattern cloudUrlPattern;
        if (continuation instanceof o0) {
            o0Var = (o0) continuation;
            int i12 = o0Var.f115367v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                o0Var.f115367v = i12 - Integer.MIN_VALUE;
                Object obj = o0Var.f115365t;
                m142578e = AbstractC28298d.m142578e();
                i11 = o0Var.f115367v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c23870a = (C23870a) o0Var.f115364s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CloudUrlPattern mo129009w = this.f115238a.mo129009w();
                    if (mo129009w != null) {
                        return mo129009w;
                    }
                    o0Var.f115364s = this;
                    o0Var.f115367v = 1;
                    obj = m124791S(o0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c23870a = this;
                }
                cloudUrlPattern = (CloudUrlPattern) obj;
                if (cloudUrlPattern == null) {
                    c23870a.f115238a.mo128985g0(cloudUrlPattern);
                    return cloudUrlPattern;
                }
                return null;
            }
        }
        o0Var = new o0(continuation);
        Object obj2 = o0Var.f115365t;
        m142578e = AbstractC28298d.m142578e();
        i11 = o0Var.f115367v;
        if (i11 == 0) {
        }
        cloudUrlPattern = (CloudUrlPattern) obj2;
        if (cloudUrlPattern == null) {
        }
    }

    /* renamed from: q1 */
    public final void m124827q1(int i11) {
        this.f115238a.mo128947B(i11);
    }

    /* renamed from: r1 */
    public final void m124828r1(int i11) {
        this.f115238a.mo128963R(i11);
    }

    /* renamed from: s0 */
    public final long m124829s0() {
        return this.f115238a.mo128993k0();
    }

    /* renamed from: s1 */
    public final Object m124830s1(C26317b c26317b, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139714a(c26317b, new e1(c27317h), new f1(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: t0 */
    public final long m124831t0() {
        return this.f115238a.mo128976c();
    }

    /* renamed from: t1 */
    public final Object m124832t1(List list, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139725l(list, new g1(c27317h), new h1(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: u */
    public final ZCloudQuotaUsage m124833u(ZCloudQuotaUsage zCloudQuotaUsage) {
        AbstractC19074t.m100208f(zCloudQuotaUsage, "localUsage");
        CloudQuotaUsage mo128966U = this.f115238a.mo128966U();
        return new ZCloudQuotaUsage(zCloudQuotaUsage.m41252j(), zCloudQuotaUsage.m41253k(), ZCloudQuotaUsage.Companion.m41261a(zCloudQuotaUsage.m41251i()), mo128966U.m41230f(), mo128966U.m41233i(), mo128966U.m41228d(), Math.max(mo128966U.m41229e(), zCloudQuotaUsage.m41251i().m41267c() - ((mo128966U.m41230f() + mo128966U.m41233i()) + mo128966U.m41228d())), (ZCloudQuotaUsage.AbuseInfo) null, 128, (AbstractC19060k) null);
    }

    /* renamed from: u0 */
    public final String m124834u0() {
        return this.f115238a.mo128946A();
    }

    /* renamed from: u1 */
    public final Object m124835u1(Continuation continuation) {
        Continuation m142576c;
        List m131195U;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        List mo129011y = this.f115238a.mo129011y();
        int size = mo129011y.size();
        String valueOf = String.valueOf((int) Math.ceil(size / 100000));
        C26676b.m136957g("SMLZCloudRepo", "Submit local Cloud Queue: totalItemCount=" + size + ", totalPart=" + valueOf, null, 4, null);
        String valueOf2 = String.valueOf(System.currentTimeMillis());
        m131195U = AbstractC25332a0.m131195U(mo129011y, 100000);
        Iterator it = m131195U.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            this.f115240c.mo139724k(valueOf, String.valueOf(i11), valueOf2, (List) it.next(), new i1(c27317h), new j1(c27317h));
            i11++;
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: v */
    public final Object m124836v(C26316a c26316a, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139733t(c26316a, new l(c27317h), new m(interfaceC18509p, c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: v0 */
    public final long m124837v0() {
        return this.f115238a.mo129005s();
    }

    /* renamed from: v1 */
    public final void m124838v1(int i11, JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "params");
        C26676b.m136957g("SMLZCloudRepo", "submitQoSError(" + i11 + "): " + jSONObject, null, 4, null);
        this.f115240c.mo139722i(i11, jSONObject);
    }

    /* renamed from: w0 */
    public final long m124839w0() {
        return this.f115238a.mo129000o();
    }

    /* renamed from: w1 */
    public final void m124840w1(TransferCloudKeyParams transferCloudKeyParams, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(transferCloudKeyParams, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f115240c.mo139731r(transferCloudKeyParams, interfaceC18505l, interfaceC18509p);
    }

    /* renamed from: x0 */
    public final int m124841x0() {
        return this.f115238a.mo128950E();
    }

    /* renamed from: x1 */
    public final Object m124842x1(C26318c c26318c, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139728o(c26318c, new k1(c27317h, this, c26318c), new l1(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: y */
    public final void m124843y() {
        C26676b.m136957g("SMLZCloudRepo", "clearAllMemCache()", null, 4, null);
        this.f115239b.mo129054a();
        m124742k0().clear();
        m124746n0().clear();
        this.f115245h.set(false);
        this.f115246i.set(false);
        this.f115252o = ZCloudQuotaUsage.Companion.m41262b();
        m124846z();
    }

    /* renamed from: y0 */
    public final CloudQuotaUsage m124844y0(CoroutineScope coroutineScope, InterfaceC18505l interfaceC18505l) {
        CloudQuotaUsage m124753w;
        if (this.f115246i.get()) {
            BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new p0(interfaceC18505l, null), 3, null);
        } else {
            this.f115246i.set(true);
            m124719T();
        }
        synchronized (this.f115244g) {
            try {
                m124753w = m124753w(this.f115238a.mo128974b());
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(m124753w);
                }
                if (coroutineScope != null && !m124753w.m41236l()) {
                    BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new q0(interfaceC18505l, null), 3, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m124753w;
    }

    /* renamed from: y1 */
    public final void m124845y1(long j11) {
        this.f115238a.mo128992k(j11);
    }

    /* renamed from: z */
    public final void m124846z() {
        m124813i1(false);
        m124824p1(0L);
        m124845y1(0L);
    }

    /* renamed from: z1 */
    public final Object m124847z1(UpdateMigrationStatusParams updateMigrationStatusParams, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        this.f115240c.mo139723j(updateMigrationStatusParams, new m1(c27317h), new n1(c27317h));
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    public /* synthetic */ C23870a(InterfaceC24812c interfaceC24812c, InterfaceC24818i interfaceC24818i, InterfaceC27297c interfaceC27297c, C16805b c16805b, InterfaceC23792b interfaceC23792b, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC24812c, interfaceC24818i, interfaceC27297c, c16805b, interfaceC23792b, (i11 & 32) != 0 ? Dispatchers.m112681c() : coroutineDispatcher);
    }
}
