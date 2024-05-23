package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.shortvideo.data.model.InAppNotification;
import com.zing.zalo.shortvideo.data.model.InteractNotificationLatestValue;
import com.zing.zalo.shortvideo.data.model.LongPollingResult;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.UpdateInfoConfig;
import com.zing.zalo.shortvideo.data.remote.common.DataEmptyException;
import com.zing.zalo.shortvideo.data.remote.common.NativeTimeOutException;
import com.zing.zalo.shortvideo.p072ui.receiver.NetworkReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NotificationReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.VideoReceiver;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.ZchMasterView;
import com.zing.zalo.shortvideo.p072ui.view.C10631i;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import g20.C19205a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;
import x00.InterfaceC29283d;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.shortvideo.ui.view.i */
/* loaded from: classes5.dex */
public final class C10631i {
    public static final a Companion = new a(null);

    /* renamed from: u */
    private static volatile C10631i f53855u;

    /* renamed from: a */
    private boolean f53856a = true;

    /* renamed from: b */
    private NetworkReceiver f53857b = new NetworkReceiver(new i(), new j());

    /* renamed from: c */
    private final String f53858c = "zchannel_cache";

    /* renamed from: d */
    private final List f53859d = new ArrayList();

    /* renamed from: e */
    private final InterfaceC29280a f53860e;

    /* renamed from: f */
    private final InterfaceC18170g f53861f;

    /* renamed from: g */
    private final InterfaceC29283d f53862g;

    /* renamed from: h */
    private SharedPreferences f53863h;

    /* renamed from: i */
    private long f53864i;

    /* renamed from: j */
    private boolean f53865j;

    /* renamed from: k */
    private CoroutineScope f53866k;

    /* renamed from: l */
    private Handler f53867l;

    /* renamed from: m */
    private long f53868m;

    /* renamed from: n */
    private long f53869n;

    /* renamed from: o */
    private Handler f53870o;

    /* renamed from: p */
    private long f53871p;

    /* renamed from: q */
    private long f53872q;

    /* renamed from: r */
    private CoroutineScope f53873r;

    /* renamed from: s */
    private Handler f53874s;

    /* renamed from: t */
    private CoroutineScope f53875t;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C10631i m55602a() {
            C10631i c10631i = C10631i.f53855u;
            if (c10631i == null) {
                synchronized (this) {
                    c10631i = new C10631i();
                    C10631i.f53855u = c10631i;
                }
            }
            return c10631i;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$b */
    /* loaded from: classes5.dex */
    public static final class b extends Enum {

        /* renamed from: q */
        public static final b f53876q = new b("USER", 0, 1);

        /* renamed from: r */
        public static final b f53877r = new b("CHANNEL", 1, 2);

        /* renamed from: s */
        private static final /* synthetic */ b[] f53878s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f53879t;

        /* renamed from: p */
        private final int f53880p;

        static {
            b[] m55603b = m55603b();
            f53878s = m55603b;
            f53879t = AbstractC30166b.m148796a(m55603b);
        }

        private b(String str, int i11, int i12) {
            super(str, i11);
            this.f53880p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m55603b() {
            return new b[]{f53876q, f53877r};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f53878s.clone();
        }

        /* renamed from: c */
        public final int m55604c() {
            return this.f53880p;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$c */
    /* loaded from: classes5.dex */
    public static final class c extends Enum {

        /* renamed from: q */
        public static final c f53881q = new c("NOTIFICATION", 0, 101);

        /* renamed from: r */
        public static final c f53882r = new c("CHANNEL_NOTIFICATION", 1, 102);

        /* renamed from: s */
        public static final c f53883s = new c("USER_NOTIFICATION", 2, 103);

        /* renamed from: t */
        public static final c f53884t = new c("IN_APP_NOTIFICATION", 3, 104);

        /* renamed from: u */
        public static final c f53885u = new c("TAB_FRIEND", 4, 111);

        /* renamed from: v */
        private static final /* synthetic */ c[] f53886v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f53887w;

        /* renamed from: p */
        private final int f53888p;

        static {
            c[] m55605b = m55605b();
            f53886v = m55605b;
            f53887w = AbstractC30166b.m148796a(m55605b);
        }

        private c(String str, int i11, int i12) {
            super(str, i11);
            this.f53888p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m55605b() {
            return new c[]{f53881q, f53882r, f53883s, f53884t, f53885u};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f53886v.clone();
        }

        /* renamed from: c */
        public final int m55606c() {
            return this.f53888p;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53889t;

        /* renamed from: u */
        private /* synthetic */ Object f53890u;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(continuation);
            dVar.f53890u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53889t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!CoroutineScopeKt.m112642f((CoroutineScope) this.f53890u)) {
                        return C24848g0.f119245a;
                    }
                    AbstractC20110a.f98889a.mo104548a("connectLongPolling start", new Object[0]);
                    InterfaceC18170g interfaceC18170g = C10631i.this.f53861f;
                    this.f53889t = 1;
                    obj = interfaceC18170g.mo96605m0(this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                LongPollingResult longPollingResult = (LongPollingResult) obj;
                C10631i.this.f53872q = 0L;
                int m51047a = longPollingResult.m51047a();
                if (m51047a == c.f53883s.m55606c()) {
                    C10631i.this.m55584x(AbstractC29094b.m145341c(b.f53876q.m55604c()));
                } else if (m51047a == c.f53882r.m55606c()) {
                    C10631i.this.m55584x(AbstractC29094b.m145341c(b.f53877r.m55604c()));
                } else if (m51047a == c.f53884t.m55606c()) {
                    C10631i.this.m55583w(false);
                } else if (m51047a == c.f53885u.m55606c()) {
                    C10631i.m55585y(C10631i.this, null, 1, null);
                }
                AbstractC20110a.f98889a.mo104548a("connectLongPolling type: " + longPollingResult.m51047a(), new Object[0]);
                C10631i.this.m55579s();
            } catch (Exception e11) {
                if ((e11 instanceof TimeoutException) || (e11 instanceof NativeTimeOutException) || (e11 instanceof DataEmptyException)) {
                    C10631i.this.m55579s();
                }
                AbstractC20110a.f98889a.mo104548a("connectLongPolling ex: " + e11, new Object[0]);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53892t;

        /* renamed from: u */
        private /* synthetic */ Object f53893u;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.i$e$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f53895t;

            /* renamed from: u */
            final /* synthetic */ ZaloView f53896u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ZaloView zaloView, Continuation continuation) {
                super(2, continuation);
                this.f53896u = zaloView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f53896u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f53895t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ((ZchBaseView) this.f53896u).m55550PK();
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

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(continuation);
            eVar.f53893u = obj;
            return eVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            Exception e11;
            String str;
            CoroutineScope coroutineScope2;
            Object m131217q0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53892t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        coroutineScope = (CoroutineScope) this.f53893u;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Exception e12) {
                            e11 = e12;
                            AbstractC20110a.f98889a.mo104548a("getChannelConfig ex: " + e11.getMessage(), new Object[0]);
                            coroutineScope2 = coroutineScope;
                            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                            return C24848g0.f119245a;
                        }
                        coroutineScope2 = coroutineScope;
                        CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.f53893u;
                try {
                    AbstractC24862s.m129228b(obj);
                } catch (Exception e13) {
                    e11 = e13;
                    coroutineScope = coroutineScope2;
                    AbstractC20110a.f98889a.mo104548a("getChannelConfig ex: " + e11.getMessage(), new Object[0]);
                    coroutineScope2 = coroutineScope;
                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    return C24848g0.f119245a;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f53893u;
                try {
                    User mo146327b = C10631i.this.f53860e.mo146327b();
                    if (mo146327b != null) {
                        str = mo146327b.m51238k();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    InterfaceC18170g interfaceC18170g = C10631i.this.f53861f;
                    this.f53893u = coroutineScope3;
                    this.f53892t = 1;
                    Object mo96584c = interfaceC18170g.mo96584c(str, "240401", this);
                    if (mo96584c == m142578e) {
                        return m142578e;
                    }
                    coroutineScope2 = coroutineScope3;
                    obj = mo96584c;
                } catch (Exception e14) {
                    coroutineScope = coroutineScope3;
                    e11 = e14;
                    AbstractC20110a.f98889a.mo104548a("getChannelConfig ex: " + e11.getMessage(), new Object[0]);
                    coroutineScope2 = coroutineScope;
                    CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
                    return C24848g0.f119245a;
                }
            }
            UpdateInfoConfig m51429f = ((ChannelConfig) obj).m51429f();
            if (m51429f != null && m51429f.m51497g()) {
                m131217q0 = AbstractC25332a0.m131217q0(C10631i.this.f53859d);
                ZaloView zaloView = (ZaloView) m131217q0;
                if (zaloView instanceof ZchBaseView) {
                    MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                    a aVar = new a(zaloView, null);
                    this.f53893u = coroutineScope2;
                    this.f53892t = 2;
                    if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                    coroutineScope2 = coroutineScope;
                }
            }
            CoroutineScopeKt.m112639c(coroutineScope2, null, 1, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f53897t;

        /* renamed from: u */
        int f53898u;

        /* renamed from: w */
        final /* synthetic */ boolean f53900w;

        /* renamed from: com.zing.zalo.shortvideo.ui.view.i$f$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f53901t;

            /* renamed from: u */
            final /* synthetic */ InAppNotification f53902u;

            /* renamed from: v */
            final /* synthetic */ boolean f53903v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InAppNotification inAppNotification, boolean z11, Continuation continuation) {
                super(2, continuation);
                this.f53902u = inAppNotification;
                this.f53903v = z11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f53902u, this.f53903v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f53901t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ZchMasterView m53800d = StateManager.Companion.m53800d();
                    if (m53800d != null) {
                        m53800d.m53823TK(this.f53902u, this.f53903v);
                        return C24848g0.f119245a;
                    }
                    return null;
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
        f(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f53900w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f53900w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            InAppNotification inAppNotification;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53898u;
            try {
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104548a("connectLongPolling getInApNotificationPopup ex: " + e11.getMessage(), new Object[0]);
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        inAppNotification = (InAppNotification) this.f53897t;
                        AbstractC24862s.m129228b(obj);
                        AbstractC20110a.f98889a.mo104548a("connectLongPolling getInApNotificationPopup result:" + inAppNotification, new Object[0]);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC18170g interfaceC18170g = C10631i.this.f53861f;
                this.f53898u = 1;
                obj = interfaceC18170g.mo96558F0(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            InAppNotification inAppNotification2 = (InAppNotification) obj;
            MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
            a aVar = new a(inAppNotification2, this.f53900w, null);
            this.f53897t = inAppNotification2;
            this.f53898u = 2;
            if (BuildersKt.m112534g(m112681c, aVar, this) == m142578e) {
                return m142578e;
            }
            inAppNotification = inAppNotification2;
            AbstractC20110a.f98889a.mo104548a("connectLongPolling getInApNotificationPopup result:" + inAppNotification, new Object[0]);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53904t;

        /* renamed from: v */
        final /* synthetic */ Integer f53906v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Integer num, Continuation continuation) {
            super(2, continuation);
            this.f53906v = num;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f53906v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            long j11;
            boolean z11;
            boolean z12;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53904t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18170g interfaceC18170g = C10631i.this.f53861f;
                    Integer num = this.f53906v;
                    if (num != null) {
                        str = num.toString();
                    } else {
                        str = null;
                    }
                    this.f53904t = 1;
                    obj = interfaceC18170g.mo96557F(str, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                InteractNotificationLatestValue interactNotificationLatestValue = (InteractNotificationLatestValue) obj;
                C10631i c10631i = C10631i.this;
                Long m50980e = interactNotificationLatestValue.m50980e();
                if (m50980e != null) {
                    j11 = m50980e.longValue();
                } else {
                    j11 = 0;
                }
                c10631i.f53868m = j11;
                AbstractC20110a.f98889a.mo104548a("connectLongPolling getInteractNotiLatestValue result: " + interactNotificationLatestValue, new Object[0]);
                C19051f0 c19051f0 = new C19051f0();
                Long m50979d = interactNotificationLatestValue.m50979d();
                if (m50979d != null) {
                    C10631i c10631i2 = C10631i.this;
                    long longValue = m50979d.longValue();
                    long mo146348w = c10631i2.f53860e.mo146348w("20");
                    if (mo146348w < 0) {
                        c10631i2.f53860e.mo146330e(longValue, "20");
                    } else if (longValue > mo146348w) {
                        c19051f0.f94928p = true;
                        c10631i2.f53860e.mo146335j(true, "20");
                        NotificationReceiver.C10088a c10088a = NotificationReceiver.Companion;
                        c10088a.m53753a(true, "20");
                        c10631i2.f53860e.mo146330e(longValue, "20");
                        c10631i2.f53860e.mo146302D(true);
                        c10088a.m53754b(true, true);
                    }
                }
                Long m50976a = interactNotificationLatestValue.m50976a();
                if (m50976a != null) {
                    C10631i c10631i3 = C10631i.this;
                    long longValue2 = m50976a.longValue();
                    long mo146348w2 = c10631i3.f53860e.mo146348w("22");
                    if (mo146348w2 < 0) {
                        c10631i3.f53860e.mo146330e(longValue2, "22");
                    } else if (longValue2 > mo146348w2) {
                        c19051f0.f94928p = true;
                        c10631i3.f53860e.mo146335j(true, "22");
                        NotificationReceiver.C10088a c10088a2 = NotificationReceiver.Companion;
                        c10088a2.m53753a(true, "22");
                        c10631i3.f53860e.mo146330e(longValue2, "22");
                        c10631i3.f53860e.mo146302D(true);
                        c10088a2.m53754b(false, true);
                    }
                }
                Long m50978c = interactNotificationLatestValue.m50978c();
                if (m50978c != null) {
                    C10631i c10631i4 = C10631i.this;
                    long longValue3 = m50978c.longValue();
                    long mo146348w3 = c10631i4.f53860e.mo146348w("23");
                    if (mo146348w3 < 0) {
                        c10631i4.f53860e.mo146330e(longValue3, "23");
                    } else if (longValue3 > mo146348w3) {
                        c19051f0.f94928p = true;
                        c10631i4.f53860e.mo146335j(true, "23");
                        NotificationReceiver.C10088a c10088a3 = NotificationReceiver.Companion;
                        c10088a3.m53753a(true, "23");
                        c10631i4.f53860e.mo146330e(longValue3, "23");
                        c10631i4.f53860e.mo146302D(true);
                        c10088a3.m53754b(false, true);
                    }
                }
                Long m50977b = interactNotificationLatestValue.m50977b();
                if (m50977b != null) {
                    C10631i c10631i5 = C10631i.this;
                    long longValue4 = m50977b.longValue();
                    long mo146348w4 = c10631i5.f53860e.mo146348w("24");
                    if (mo146348w4 < 0) {
                        c10631i5.f53860e.mo146330e(longValue4, "24");
                    } else if (longValue4 > mo146348w4) {
                        c19051f0.f94928p = true;
                        c10631i5.f53860e.mo146335j(true, "24");
                        NotificationReceiver.C10088a c10088a4 = NotificationReceiver.Companion;
                        c10088a4.m53753a(true, "24");
                        c10631i5.f53860e.mo146330e(longValue4, "24");
                        c10631i5.f53860e.mo146302D(true);
                        c10088a4.m53754b(false, true);
                    }
                }
                Long m50985j = interactNotificationLatestValue.m50985j();
                if (m50985j != null) {
                    C10631i c10631i6 = C10631i.this;
                    long longValue5 = m50985j.longValue();
                    long mo146348w5 = c10631i6.f53860e.mo146348w("11");
                    if (mo146348w5 < 0) {
                        c10631i6.f53860e.mo146330e(longValue5, "11");
                    } else if (longValue5 > mo146348w5) {
                        c19051f0.f94928p = true;
                        c10631i6.f53860e.mo146335j(true, "11");
                        NotificationReceiver.C10088a c10088a5 = NotificationReceiver.Companion;
                        c10088a5.m53753a(true, "11");
                        c10631i6.f53860e.mo146330e(longValue5, "11");
                        c10631i6.f53860e.mo146324Z(true);
                        c10088a5.m53756d(true, true);
                    }
                }
                Long m50983h = interactNotificationLatestValue.m50983h();
                if (m50983h != null) {
                    C10631i c10631i7 = C10631i.this;
                    long longValue6 = m50983h.longValue();
                    long mo146348w6 = c10631i7.f53860e.mo146348w("30");
                    if (mo146348w6 < 0) {
                        c10631i7.f53860e.mo146330e(longValue6, "30");
                    } else if (longValue6 > mo146348w6) {
                        c19051f0.f94928p = true;
                        c10631i7.f53860e.mo146335j(true, "30");
                        NotificationReceiver.C10088a c10088a6 = NotificationReceiver.Companion;
                        c10088a6.m53753a(true, "30");
                        c10631i7.f53860e.mo146330e(longValue6, "30");
                        c10631i7.f53860e.mo146324Z(true);
                        c10088a6.m53756d(false, true);
                    }
                }
                Long m50984i = interactNotificationLatestValue.m50984i();
                if (m50984i != null) {
                    C10631i c10631i8 = C10631i.this;
                    long longValue7 = m50984i.longValue();
                    long mo146348w7 = c10631i8.f53860e.mo146348w("31");
                    if (mo146348w7 < 0) {
                        c10631i8.f53860e.mo146330e(longValue7, "31");
                    } else if (longValue7 > mo146348w7) {
                        c19051f0.f94928p = true;
                        c10631i8.f53860e.mo146335j(true, "31");
                        NotificationReceiver.C10088a c10088a7 = NotificationReceiver.Companion;
                        c10088a7.m53753a(true, "31");
                        c10631i8.f53860e.mo146330e(longValue7, "31");
                        c10631i8.f53860e.mo146324Z(true);
                        c10088a7.m53756d(false, true);
                    }
                }
                Long m50981f = interactNotificationLatestValue.m50981f();
                if (m50981f != null) {
                    C10631i c10631i9 = C10631i.this;
                    long longValue8 = m50981f.longValue();
                    InterfaceC29283d interfaceC29283d = c10631i9.f53862g;
                    if (longValue8 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    interfaceC29283d.mo146363b(z12);
                    VideoReceiver.Companion.m53765a(interfaceC29283d.mo146367f());
                }
                Long m50982g = interactNotificationLatestValue.m50982g();
                if (m50982g != null) {
                    C10631i c10631i10 = C10631i.this;
                    long longValue9 = m50982g.longValue();
                    InterfaceC29283d interfaceC29283d2 = c10631i10.f53862g;
                    if (longValue9 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    interfaceC29283d2.mo146372k(z11);
                    VideoReceiver.Companion.m53766b(interfaceC29283d2.mo146374m());
                }
                if (c19051f0.f94928p) {
                    C10631i.this.f53860e.mo146315Q(true);
                    NotificationReceiver.Companion.m53755c(true);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104548a("getInteractNotiLatestValue ex: " + e11.getMessage(), new Object[0]);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53907t;

        /* renamed from: u */
        private /* synthetic */ Object f53908u;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            h hVar = new h(continuation);
            hVar.f53908u = obj;
            return hVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            Exception e11;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53907t;
            if (i11 != 0) {
                if (i11 == 1) {
                    coroutineScope = (CoroutineScope) this.f53908u;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Exception e12) {
                        e11 = e12;
                        e11.printStackTrace();
                        CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                        return C24848g0.f119245a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f53908u;
                try {
                    InterfaceC18170g interfaceC18170g = C10631i.this.f53861f;
                    this.f53908u = coroutineScope2;
                    this.f53907t = 1;
                    if (interfaceC18170g.mo96594h(this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                } catch (Exception e13) {
                    coroutineScope = coroutineScope2;
                    e11 = e13;
                    e11.printStackTrace();
                    CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
                    return C24848g0.f119245a;
                }
            }
            CoroutineScopeKt.m112639c(coroutineScope, null, 1, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {
        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55614a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55614a() {
            if (C10631i.this.f53856a) {
                C10631i.this.f53856a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.i$j */
    /* loaded from: classes5.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {
        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55615a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55615a() {
            if (!C10631i.this.f53856a) {
                C10631i.this.f53856a = true;
                C10631i.this.m55579s();
            }
        }
    }

    public C10631i() {
        AbstractC28684a.h hVar = AbstractC28684a.Companion;
        this.f53860e = hVar.m143681o();
        this.f53861f = hVar.m143667D();
        this.f53862g = hVar.m143692z();
        this.f53865j = true;
        this.f53866k = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
        this.f53867l = new Handler(Looper.getMainLooper());
        this.f53868m = 1000L;
        this.f53869n = 1000L;
        this.f53870o = new Handler(Looper.getMainLooper());
        this.f53871p = 25000L;
        this.f53873r = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
        this.f53874s = new Handler(Looper.getMainLooper());
        this.f53875t = CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null)));
    }

    /* renamed from: B */
    private final void m55561B() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new h(null), 3, null);
    }

    /* renamed from: E */
    public static final void m55562E(C10631i c10631i) {
        AbstractC19074t.m100208f(c10631i, "this$0");
        c10631i.m55582v();
    }

    /* renamed from: s */
    public final void m55579s() {
        long j11 = this.f53872q;
        C27417l c27417l = C27417l.f129055a;
        if (j11 <= c27417l.m140382f().m130131a() - this.f53871p) {
            this.f53872q = c27417l.m140382f().m130131a();
            JobKt__JobKt.m112768g(this.f53875t.mo9207O(), null, 1, null);
            BuildersKt__Builders_commonKt.m112540d(this.f53875t, null, null, new d(null), 3, null);
        } else {
            this.f53870o.removeCallbacksAndMessages(null);
            this.f53870o.postDelayed(new Runnable() { // from class: m20.b3
                public /* synthetic */ RunnableC22726b3() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C10631i.m55580t(C10631i.this);
                }
            }, (this.f53872q + this.f53871p) - c27417l.m140382f().m130131a());
        }
    }

    /* renamed from: t */
    public static final void m55580t(C10631i c10631i) {
        AbstractC19074t.m100208f(c10631i, "this$0");
        c10631i.m55579s();
    }

    /* renamed from: u */
    private final void m55581u() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(SupervisorKt.m112864b(null, 1, null))), null, null, new e(null), 3, null);
    }

    /* renamed from: v */
    private final void m55582v() {
        m55561B();
        m55581u();
        m55585y(this, null, 1, null);
        m55583w(true);
    }

    /* renamed from: w */
    public final void m55583w(boolean z11) {
        JobKt__JobKt.m112768g(this.f53873r.mo9207O(), null, 1, null);
        BuildersKt__Builders_commonKt.m112540d(this.f53873r, null, null, new f(z11, null), 3, null);
    }

    /* renamed from: x */
    public final void m55584x(Integer num) {
        long j11 = this.f53869n;
        C27417l c27417l = C27417l.f129055a;
        if (j11 <= c27417l.m140382f().m130131a() - this.f53868m) {
            this.f53869n = c27417l.m140382f().m130131a();
            JobKt__JobKt.m112768g(this.f53866k.mo9207O(), null, 1, null);
            BuildersKt__Builders_commonKt.m112540d(this.f53866k, null, null, new g(num, null), 3, null);
        } else {
            this.f53867l.removeCallbacksAndMessages(null);
            this.f53867l.postDelayed(new Runnable() { // from class: m20.d3

                /* renamed from: q */
                public final /* synthetic */ Integer f111326q;

                public /* synthetic */ RunnableC22736d3(Integer num2) {
                    r2 = num2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C10631i.m55586z(C10631i.this, r2);
                }
            }, (this.f53869n + this.f53868m) - c27417l.m140382f().m130131a());
        }
    }

    /* renamed from: y */
    static /* synthetic */ void m55585y(C10631i c10631i, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        c10631i.m55584x(num);
    }

    /* renamed from: z */
    public static final void m55586z(C10631i c10631i, Integer num) {
        AbstractC19074t.m100208f(c10631i, "this$0");
        c10631i.m55584x(num);
    }

    /* renamed from: A */
    public final SharedPreferences m55587A() {
        if (this.f53863h == null) {
            this.f53863h = CoreUtility.getAppContext().getSharedPreferences(this.f53858c, 0);
        }
        SharedPreferences sharedPreferences = this.f53863h;
        AbstractC19074t.m100205c(sharedPreferences);
        return sharedPreferences;
    }

    /* renamed from: C */
    public final void m55588C(Bundle bundle, ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
        this.f53859d.add(zchBaseView);
    }

    /* renamed from: D */
    public final void m55589D() {
        AbstractC20110a.f98889a.mo104548a("ZchViewLifeCycleManager onCreateChannel", new Object[0]);
        NetworkReceiver networkReceiver = this.f53857b;
        Context appContext = CoreUtility.getAppContext();
        AbstractC19074t.m100207e(appContext, "getAppContext(...)");
        networkReceiver.mo53685d(appContext);
        if (C27417l.f129055a.m140381e() != null) {
            this.f53874s.postDelayed(new Runnable() { // from class: m20.c3
                public /* synthetic */ RunnableC22731c3() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C10631i.m55562E(C10631i.this);
                }
            }, 1000L);
        } else {
            m55582v();
        }
        this.f53860e.mo146303E(this.f53860e.mo146346u() + 1);
    }

    /* renamed from: F */
    public final void m55590F(ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
        this.f53859d.remove(zchBaseView);
    }

    /* renamed from: G */
    public final void m55591G() {
        AbstractC20110a.f98889a.mo104548a("ZchViewLifeCycleManager onDestroyChannel", new Object[0]);
        JobKt__JobKt.m112765d(this.f53875t.mo9207O(), null, 1, null);
        this.f53865j = true;
        this.f53862g.clear();
        this.f53857b.mo53687g();
        this.f53874s.removeCallbacksAndMessages(null);
        this.f53860e.mo146308J();
        C19205a.f95429a.m100705A();
        f53855u = null;
    }

    /* renamed from: H */
    public final void m55592H(ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
    }

    /* renamed from: I */
    public final void m55593I() {
        C19205a.f95429a.m100728e0();
    }

    /* renamed from: J */
    public final void m55594J(ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
    }

    /* renamed from: K */
    public final void m55595K(ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
    }

    /* renamed from: L */
    public final void m55596L() {
        long currentTimeMillis = System.currentTimeMillis() - this.f53864i;
        AbstractC20110a.f98889a.mo104548a("ZchViewLifeCycleManager onStartChannel firstSession:" + this.f53865j + " timeBackGround:" + currentTimeMillis, new Object[0]);
        if (this.f53865j) {
            C19205a c19205a = C19205a.f95429a;
            c19205a.m100730g0(false);
            c19205a.m100729f0();
        } else if (currentTimeMillis > 30000) {
            C19205a c19205a2 = C19205a.f95429a;
            c19205a2.m100730g0(true);
            c19205a2.m100729f0();
        }
        if (currentTimeMillis > 10000 && !this.f53865j) {
            m55585y(this, null, 1, null);
            m55583w(false);
        }
        this.f53865j = false;
        this.f53872q = 0L;
        m55579s();
    }

    /* renamed from: M */
    public final void m55597M(ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
    }

    /* renamed from: N */
    public final void m55598N() {
        AbstractC20110a.f98889a.mo104548a("ZchViewLifeCycleManager onStopChannel", new Object[0]);
        this.f53864i = System.currentTimeMillis();
    }

    /* renamed from: O */
    public final void m55599O() {
        C19205a.f95429a.m100730g0(true);
    }

    /* renamed from: q */
    public final void m55600q() {
        for (InterfaceC1801w interfaceC1801w : this.f53859d) {
            if (interfaceC1801w instanceof ZchBaseView.InterfaceC10622a) {
                ((ZchBaseView.InterfaceC10622a) interfaceC1801w).m55555OC(true);
            }
        }
        ZchMasterView m53800d = StateManager.Companion.m53800d();
        if (m53800d != null) {
            m53800d.finish();
        }
    }

    /* renamed from: r */
    public final void m55601r(NotificationPageView notificationPageView) {
        AbstractC19074t.m100208f(notificationPageView, "newView");
        for (ZaloView zaloView : new ArrayList(this.f53859d)) {
            if ((zaloView instanceof NotificationPageView) && !AbstractC19074t.m100204b(zaloView, notificationPageView) && AbstractC19074t.m100204b(((NotificationPageView) zaloView).m54578nL(), notificationPageView.m54578nL())) {
                zaloView.finish();
            }
        }
    }
}
