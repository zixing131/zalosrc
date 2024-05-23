package p724zp;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.control.NotificationBasicInfo;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20833z;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p458qr.AbstractC25468a;
import p458qr.C25480m;
import p458qr.InterfaceC25486s;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p534u1.AbstractC26941a;
import p582vp.C28567c;
import p617wp.C29184a;
import p617wp.C29185b;
import p617wp.C29186c;
import p617wp.C29187d;
import p617wp.C29188e;
import p617wp.C29189f;
import p653xp.C30190a;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: zp.a */
/* loaded from: classes4.dex */
public final class C32541a extends AbstractC19963b {

    /* renamed from: A */
    private final InterfaceC26357f f150303A;

    /* renamed from: B */
    private NotificationBasicInfo f150304B;

    /* renamed from: C */
    private C32002l4 f150305C;

    /* renamed from: D */
    private final C1761c0 f150306D;

    /* renamed from: E */
    private final C1761c0 f150307E;

    /* renamed from: F */
    private final C1761c0 f150308F;

    /* renamed from: t */
    private final C29184a f150309t;

    /* renamed from: u */
    private final C29189f f150310u;

    /* renamed from: v */
    private final C29187d f150311v;

    /* renamed from: w */
    private final C29188e f150312w;

    /* renamed from: x */
    private final C29185b f150313x;

    /* renamed from: y */
    private final C29186c f150314y;

    /* renamed from: z */
    private final InterfaceC25486s f150315z;

    /* renamed from: zp.a$a */
    /* loaded from: classes4.dex */
    public static final class a implements C1802w0.b {

        /* renamed from: a */
        private final C29184a f150316a;

        /* renamed from: b */
        private final C29189f f150317b;

        /* renamed from: c */
        private final C29187d f150318c;

        /* renamed from: d */
        private final C29188e f150319d;

        /* renamed from: e */
        private final C29185b f150320e;

        /* renamed from: f */
        private final C29186c f150321f;

        /* renamed from: g */
        private final InterfaceC25486s f150322g;

        /* renamed from: h */
        private final InterfaceC26357f f150323h;

        public a() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            if (cls.isAssignableFrom(C32541a.class)) {
                return new C32541a(this.f150316a, this.f150317b, this.f150318c, this.f150319d, this.f150320e, this.f150321f, this.f150322g, this.f150323h);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }

        public a(C29184a c29184a, C29189f c29189f, C29187d c29187d, C29188e c29188e, C29185b c29185b, C29186c c29186c, InterfaceC25486s interfaceC25486s, InterfaceC26357f interfaceC26357f) {
            AbstractC19074t.m100208f(c29184a, "deleteFeedNotification");
            AbstractC19074t.m100208f(c29189f, "unSubscribeFeedNotification");
            AbstractC19074t.m100208f(c29187d, "subscribeFeedNotification");
            AbstractC19074t.m100208f(c29188e, "unFollowNewFeedNotification");
            AbstractC19074t.m100208f(c29185b, "followNewFeedNotification");
            AbstractC19074t.m100208f(c29186c, "getStatusFollowNotificationNewFeed");
            AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
            AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
            this.f150316a = c29184a;
            this.f150317b = c29189f;
            this.f150318c = c29187d;
            this.f150319d = c29188e;
            this.f150320e = c29185b;
            this.f150321f = c29186c;
            this.f150322g = interfaceC25486s;
            this.f150323h = interfaceC26357f;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(C29184a c29184a, C29189f c29189f, C29187d c29187d, C29188e c29188e, C29185b c29185b, C29186c c29186c, InterfaceC25486s interfaceC25486s, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
            this(r1, r4, r5, r6, r7, r8, (i11 & 64) != 0 ? C25480m.f122070a : interfaceC25486s, (i11 & 128) != 0 ? C26359h.f125209a : interfaceC26357f);
            C29184a c29184a2;
            C29189f c29189f2;
            C29187d c29187d2;
            C29188e c29188e2;
            C29186c c29186c2;
            int i12 = 3;
            C28567c c28567c = null;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            byte b14 = 0;
            byte b15 = 0;
            byte b16 = 0;
            byte b17 = 0;
            byte b18 = 0;
            byte b19 = 0;
            byte b21 = 0;
            byte b22 = 0;
            byte b23 = 0;
            byte b24 = 0;
            byte b25 = 0;
            if ((i11 & 1) != 0) {
                c29184a2 = new C29184a(c28567c, b25 == true ? 1 : 0, i12, b24 == true ? 1 : 0);
            } else {
                c29184a2 = c29184a;
            }
            if ((i11 & 2) != 0) {
                c29189f2 = new C29189f(b23 == true ? 1 : 0, b22 == true ? 1 : 0, i12, b21 == true ? 1 : 0);
            } else {
                c29189f2 = c29189f;
            }
            if ((i11 & 4) != 0) {
                c29187d2 = new C29187d(b19 == true ? 1 : 0, b18 == true ? 1 : 0, i12, b17 == true ? 1 : 0);
            } else {
                c29187d2 = c29187d;
            }
            if ((i11 & 8) != 0) {
                c29188e2 = new C29188e(b16 == true ? 1 : 0, b15 == true ? 1 : 0, i12, b14 == true ? 1 : 0);
            } else {
                c29188e2 = c29188e;
            }
            C29185b c29185b2 = (i11 & 16) != 0 ? new C29185b(null, null, null, 7, null) : c29185b;
            if ((i11 & 32) != 0) {
                c29186c2 = new C29186c(b13 == true ? 1 : 0, b12 == true ? 1 : 0, i12, b11 == true ? 1 : 0);
            } else {
                c29186c2 = c29186c;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: zp.a$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f150324p = new b("CANCEL", 0);

        /* renamed from: q */
        public static final b f150325q = new b("DELETE_NOTIFICATION_SUCCESS", 1);

        /* renamed from: r */
        public static final b f150326r = new b("UN_SUBSCRIBE_FEED_NOTIFICATION_SUCCESS", 2);

        /* renamed from: s */
        public static final b f150327s = new b("SUBSCRIBE_FEED_NOTIFICATION_SUCCESS", 3);

        /* renamed from: t */
        public static final b f150328t = new b("UPDATE_FAILURE", 4);

        /* renamed from: u */
        public static final b f150329u = new b("UN_FOLLOW_NEW_FEED_NOTIFICATION_SUCCESS", 5);

        /* renamed from: v */
        public static final b f150330v = new b("FOLLOW_NEW_FEED_NOTIFICATION_SUCCESS", 6);

        /* renamed from: w */
        private static final /* synthetic */ b[] f150331w;

        /* renamed from: x */
        private static final /* synthetic */ InterfaceC30165a f150332x;

        static {
            b[] m157549b = m157549b();
            f150331w = m157549b;
            f150332x = AbstractC30166b.m148796a(m157549b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m157549b() {
            return new b[]{f150324p, f150325q, f150326r, f150327s, f150328t, f150329u, f150330v};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f150331w.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: zp.a$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: p */
        public static final c f150333p = new c("NEW_FEED", 0);

        /* renamed from: q */
        public static final c f150334q = new c("INTERACTION", 1);

        /* renamed from: r */
        public static final c f150335r = new c("OTHER", 2);

        /* renamed from: s */
        private static final /* synthetic */ c[] f150336s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f150337t;

        static {
            c[] m157550b = m157550b();
            f150336s = m157550b;
            f150337t = AbstractC30166b.m148796a(m157550b);
        }

        private c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m157550b() {
            return new c[]{f150333p, f150334q, f150335r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f150336s.clone();
        }
    }

    /* renamed from: zp.a$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private final NotificationBasicInfo f150338a;

        /* renamed from: b */
        private final b f150339b;

        public d(NotificationBasicInfo notificationBasicInfo, b bVar) {
            AbstractC19074t.m100208f(notificationBasicInfo, "notificationInfo");
            AbstractC19074t.m100208f(bVar, "finishState");
            this.f150338a = notificationBasicInfo;
            this.f150339b = bVar;
        }

        /* renamed from: a */
        public final b m157551a() {
            return this.f150339b;
        }

        /* renamed from: b */
        public final NotificationBasicInfo m157552b() {
            return this.f150338a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f150338a, dVar.f150338a) && this.f150339b == dVar.f150339b;
        }

        public int hashCode() {
            return (this.f150338a.hashCode() * 31) + this.f150339b.hashCode();
        }

        public String toString() {
            return "SettingNotificationResult(notificationInfo=" + this.f150338a + ", finishState=" + this.f150339b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zp.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C32002l4 f150340q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C32002l4 c32002l4) {
            super(0);
            this.f150340q = c32002l4;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Entry point: " + this.f150340q.m154282s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zp.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f150341q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z11) {
            super(0);
            this.f150341q = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Receiving data success: " + this.f150341q;
        }
    }

    /* renamed from: zp.a$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            Object obj = C32541a.this.f150304B;
            if (obj == null) {
                obj = "";
            }
            return "Info: " + obj;
        }
    }

    /* renamed from: zp.a$h */
    /* loaded from: classes4.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f150343t;

        /* renamed from: v */
        final /* synthetic */ NotificationBasicInfo f150345v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zp.a$h$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C32541a f150346p;

            /* renamed from: q */
            final /* synthetic */ NotificationBasicInfo f150347q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$h$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33074a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                public static final C33074a f150348q = new C33074a();

                C33074a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data loading";
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$h$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150349q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150349q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data success: " + ((AbstractC25468a.c) this.f150349q).m131935a();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$h$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150350q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150350q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data error: " + ((AbstractC25468a.a) this.f150350q).m131934a();
                }
            }

            a(C32541a c32541a, NotificationBasicInfo notificationBasicInfo) {
                this.f150346p = c32541a;
                this.f150347q = notificationBasicInfo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f150346p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_DELETE_FEED_NOTIFICATION", C33074a.f150348q);
                    this.f150346p.f150307E.mo9224q(AbstractC29094b.m145339a(true));
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f150346p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_DELETE_FEED_NOTIFICATION", new b(abstractC25468a));
                    this.f150346p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150346p.f150308F.mo9224q(new C19964c(new d(this.f150347q, b.f150325q)));
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f150346p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_DELETE_FEED_NOTIFICATION", new c(abstractC25468a));
                    this.f150346p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150346p.f150308F.mo9224q(new C19964c(new d(this.f150347q, b.f150328t)));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(NotificationBasicInfo notificationBasicInfo, Continuation continuation) {
            super(2, continuation);
            this.f150345v = notificationBasicInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f150345v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150343t;
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
                C29184a c29184a = C32541a.this.f150309t;
                C29184a.a aVar = new C29184a.a(this.f150345v.m40640d());
                this.f150343t = 1;
                obj = c29184a.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C32541a.this, this.f150345v);
                this.f150343t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zp.a$i */
    /* loaded from: classes4.dex */
    static final class i extends AbstractC19075u implements InterfaceC18494a {
        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            Object obj = C32541a.this.f150304B;
            if (obj == null) {
                obj = "";
            }
            return "Info: " + obj;
        }
    }

    /* renamed from: zp.a$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f150352t;

        /* renamed from: v */
        final /* synthetic */ NotificationBasicInfo f150354v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zp.a$j$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C32541a f150355p;

            /* renamed from: q */
            final /* synthetic */ NotificationBasicInfo f150356q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33075a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                public static final C33075a f150357q = new C33075a();

                C33075a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data loading";
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$j$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150358q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150358q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data success: " + ((AbstractC25468a.c) this.f150358q).m131935a();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$j$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150359q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150359q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data error: " + ((AbstractC25468a.a) this.f150359q).m131934a();
                }
            }

            a(C32541a c32541a, NotificationBasicInfo notificationBasicInfo) {
                this.f150355p = c32541a;
                this.f150356q = notificationBasicInfo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f150355p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_FOLLOW_NEW_FEED_NOTIFICATION", C33075a.f150357q);
                    this.f150355p.f150307E.mo9224q(AbstractC29094b.m145339a(true));
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f150355p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_FOLLOW_NEW_FEED_NOTIFICATION", new b(abstractC25468a));
                    this.f150355p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150355p.f150308F.mo9224q(new C19964c(new d(this.f150356q, b.f150330v)));
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f150355p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_FOLLOW_NEW_FEED_NOTIFICATION", new c(abstractC25468a));
                    this.f150355p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150355p.f150308F.mo9224q(new C19964c(new d(this.f150356q, b.f150328t)));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(NotificationBasicInfo notificationBasicInfo, Continuation continuation) {
            super(2, continuation);
            this.f150354v = notificationBasicInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f150354v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150352t;
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
                C29185b c29185b = C32541a.this.f150313x;
                C29185b.a aVar = new C29185b.a(this.f150354v.m40641e());
                this.f150352t = 1;
                obj = c29185b.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C32541a.this, this.f150354v);
                this.f150352t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zp.a$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {
        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            Object obj = C32541a.this.f150304B;
            if (obj == null) {
                obj = "";
            }
            return "Info: " + obj;
        }
    }

    /* renamed from: zp.a$l */
    /* loaded from: classes4.dex */
    static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f150361t;

        /* renamed from: v */
        final /* synthetic */ NotificationBasicInfo f150363v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zp.a$l$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C32541a f150364p;

            /* renamed from: q */
            final /* synthetic */ NotificationBasicInfo f150365q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33076a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                public static final C33076a f150366q = new C33076a();

                C33076a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data loading";
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$l$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150367q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150367q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data success: " + ((AbstractC25468a.c) this.f150367q).m131935a();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$l$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150368q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150368q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data error: " + ((AbstractC25468a.a) this.f150368q).m131934a();
                }
            }

            a(C32541a c32541a, NotificationBasicInfo notificationBasicInfo) {
                this.f150364p = c32541a;
                this.f150365q = notificationBasicInfo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f150364p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_SUBSCRIBE_FEED_NOTIFICATION", C33076a.f150366q);
                    this.f150364p.f150307E.mo9224q(AbstractC29094b.m145339a(true));
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f150364p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_SUBSCRIBE_FEED_NOTIFICATION", new b(abstractC25468a));
                    this.f150364p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150364p.f150308F.mo9224q(new C19964c(new d(this.f150365q, b.f150327s)));
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f150364p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_SUBSCRIBE_FEED_NOTIFICATION", new c(abstractC25468a));
                    this.f150364p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150364p.f150308F.mo9224q(new C19964c(new d(this.f150365q, b.f150328t)));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(NotificationBasicInfo notificationBasicInfo, Continuation continuation) {
            super(2, continuation);
            this.f150363v = notificationBasicInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f150363v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150361t;
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
                C29187d c29187d = C32541a.this.f150311v;
                C29187d.a aVar = new C29187d.a(this.f150363v.m40639c());
                this.f150361t = 1;
                obj = c29187d.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C32541a.this, this.f150363v);
                this.f150361t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zp.a$m */
    /* loaded from: classes4.dex */
    static final class m extends AbstractC19075u implements InterfaceC18494a {
        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            Object obj = C32541a.this.f150304B;
            if (obj == null) {
                obj = "";
            }
            return "Info: " + obj;
        }
    }

    /* renamed from: zp.a$n */
    /* loaded from: classes4.dex */
    static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f150370t;

        /* renamed from: v */
        final /* synthetic */ NotificationBasicInfo f150372v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zp.a$n$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C32541a f150373p;

            /* renamed from: q */
            final /* synthetic */ NotificationBasicInfo f150374q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33077a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                public static final C33077a f150375q = new C33077a();

                C33077a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data loading";
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$n$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150376q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150376q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data success: " + ((AbstractC25468a.c) this.f150376q).m131935a();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$n$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150377q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150377q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data error: " + ((AbstractC25468a.a) this.f150377q).m131934a();
                }
            }

            a(C32541a c32541a, NotificationBasicInfo notificationBasicInfo) {
                this.f150373p = c32541a;
                this.f150374q = notificationBasicInfo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f150373p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNFOLLOW_NEW_FEED_NOTIFICATION", C33077a.f150375q);
                    this.f150373p.f150307E.mo9224q(AbstractC29094b.m145339a(true));
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f150373p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNFOLLOW_NEW_FEED_NOTIFICATION", new b(abstractC25468a));
                    this.f150373p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150373p.f150308F.mo9224q(new C19964c(new d(this.f150374q, b.f150329u)));
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f150373p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNFOLLOW_NEW_FEED_NOTIFICATION", new c(abstractC25468a));
                    this.f150373p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150373p.f150308F.mo9224q(new C19964c(new d(this.f150374q, b.f150328t)));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(NotificationBasicInfo notificationBasicInfo, Continuation continuation) {
            super(2, continuation);
            this.f150372v = notificationBasicInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(this.f150372v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150370t;
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
                C29188e c29188e = C32541a.this.f150312w;
                C29188e.a aVar = new C29188e.a(this.f150372v.m40641e());
                this.f150370t = 1;
                obj = c29188e.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C32541a.this, this.f150372v);
                this.f150370t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zp.a$o */
    /* loaded from: classes4.dex */
    static final class o extends AbstractC19075u implements InterfaceC18494a {
        o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            Object obj = C32541a.this.f150304B;
            if (obj == null) {
                obj = "";
            }
            return "Info: " + obj;
        }
    }

    /* renamed from: zp.a$p */
    /* loaded from: classes4.dex */
    static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f150379t;

        /* renamed from: v */
        final /* synthetic */ NotificationBasicInfo f150381v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zp.a$p$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C32541a f150382p;

            /* renamed from: q */
            final /* synthetic */ NotificationBasicInfo f150383q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$p$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C33078a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                public static final C33078a f150384q = new C33078a();

                C33078a() {
                    super(0);
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data loading";
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$p$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150385q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150385q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data success: " + ((AbstractC25468a.c) this.f150385q).m131935a();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zp.a$p$a$c */
            /* loaded from: classes4.dex */
            public static final class c extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ AbstractC25468a f150386q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(AbstractC25468a abstractC25468a) {
                    super(0);
                    this.f150386q = abstractC25468a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "Receiving data error: " + ((AbstractC25468a.a) this.f150386q).m131934a();
                }
            }

            a(C32541a c32541a, NotificationBasicInfo notificationBasicInfo) {
                this.f150382p = c32541a;
                this.f150383q = notificationBasicInfo;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f150382p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNSUBSCRIBE_FEED_NOTIFICATION", C33078a.f150384q);
                    this.f150382p.f150307E.mo9224q(AbstractC29094b.m145339a(true));
                } else if (abstractC25468a instanceof AbstractC25468a.c) {
                    this.f150382p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNSUBSCRIBE_FEED_NOTIFICATION", new b(abstractC25468a));
                    this.f150382p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150382p.f150308F.mo9224q(new C19964c(new d(this.f150383q, b.f150326r)));
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f150382p.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNSUBSCRIBE_FEED_NOTIFICATION", new c(abstractC25468a));
                    this.f150382p.f150307E.mo9224q(AbstractC29094b.m145339a(false));
                    this.f150382p.f150308F.mo9224q(new C19964c(new d(this.f150383q, b.f150328t)));
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(NotificationBasicInfo notificationBasicInfo, Continuation continuation) {
            super(2, continuation);
            this.f150381v = notificationBasicInfo;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f150381v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150379t;
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
                C29189f c29189f = C32541a.this.f150310u;
                C29189f.a aVar = new C29189f.a(this.f150381v.m40639c());
                this.f150379t = 1;
                obj = c29189f.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C32541a.this, this.f150381v);
                this.f150379t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zp.a$q */
    /* loaded from: classes4.dex */
    static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ NotificationBasicInfo f150387q;

        /* renamed from: r */
        final /* synthetic */ C32541a f150388r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(NotificationBasicInfo notificationBasicInfo, C32541a c32541a) {
            super(0);
            this.f150387q = notificationBasicInfo;
            this.f150388r = c32541a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Notification info: " + this.f150387q + " - Layout state: " + this.f150388r.m157539Y().mo9215f();
        }
    }

    public C32541a(C29184a c29184a, C29189f c29189f, C29187d c29187d, C29188e c29188e, C29185b c29185b, C29186c c29186c, InterfaceC25486s interfaceC25486s, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c29184a, "deleteFeedNotification");
        AbstractC19074t.m100208f(c29189f, "unSubscribeFeedNotification");
        AbstractC19074t.m100208f(c29187d, "subscribeFeedNotification");
        AbstractC19074t.m100208f(c29188e, "unFollowNewFeedNotification");
        AbstractC19074t.m100208f(c29185b, "followNewFeedNotification");
        AbstractC19074t.m100208f(c29186c, "getStatusFollowNotificationNewFeed");
        AbstractC19074t.m100208f(interfaceC25486s, "actionLogger");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f150309t = c29184a;
        this.f150310u = c29189f;
        this.f150311v = c29187d;
        this.f150312w = c29188e;
        this.f150313x = c29185b;
        this.f150314y = c29186c;
        this.f150315z = interfaceC25486s;
        this.f150303A = interfaceC26357f;
        this.f150305C = C32002l4.Companion.m154287a(10000);
        this.f150306D = new C1761c0();
        this.f150307E = new C1761c0();
        this.f150308F = new C1761c0();
    }

    /* renamed from: c0 */
    private final void m157532c0() {
        InterfaceC25486s.a.m132025a(this.f150315z, C32017m4.m154326S().m154347V(this.f150305C.m154284u(70)), false, 2, null);
    }

    /* renamed from: e0 */
    private final void m157533e0() {
        InterfaceC25486s.a.m132025a(this.f150315z, C32017m4.m154326S().m154347V(this.f150305C.m154284u(74)), false, 2, null);
    }

    /* renamed from: f0 */
    private final void m157534f0() {
        InterfaceC25486s.a.m132025a(this.f150315z, C32017m4.m154326S().m154347V(this.f150305C.m154284u(73)), false, 2, null);
    }

    /* renamed from: g0 */
    private final void m157535g0() {
        InterfaceC25486s.a.m132025a(this.f150315z, C32017m4.m154326S().m154347V(this.f150305C.m154284u(71)), false, 2, null);
    }

    /* renamed from: h0 */
    private final void m157536h0() {
        InterfaceC25486s.a.m132025a(this.f150315z, C32017m4.m154326S().m154347V(this.f150305C.m154284u(72)), false, 2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:            if (r3.equals("new_feed") == false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:            r3 = p724zp.C32541a.c.f150333p;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:            if (r3.equals("comment") == false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:            r3 = p724zp.C32541a.c.f150334q;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:            if (r3.equals("like") == false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:            if (r3.equals("new_story") != false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:            if (r3.equals("like_comment") == false) goto L26;     */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m157537o0(NotificationBasicInfo notificationBasicInfo) {
        c cVar;
        C1761c0 c1761c0 = this.f150306D;
        if (C30190a.f140233a.m148860e(notificationBasicInfo)) {
            cVar = c.f150333p;
        } else {
            String m108912q = AbstractC20833z.m108912q(notificationBasicInfo.m40637a());
            if (m108912q != null) {
                switch (m108912q.hashCode()) {
                    case -1348026953:
                        break;
                    case -253014634:
                        break;
                    case 3321751:
                        break;
                    case 950398559:
                        break;
                    case 1376909533:
                        break;
                }
            }
            cVar = c.f150335r;
        }
        c1761c0.mo9224q(cVar);
    }

    /* renamed from: X */
    public final void m157538X(C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        this.f150305C = c32002l4;
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_ATTACH_ENTRY_POINT", new e(c32002l4));
    }

    /* renamed from: Y */
    public final LiveData m157539Y() {
        return this.f150306D;
    }

    /* renamed from: Z */
    public final LiveData m157540Z() {
        return this.f150308F;
    }

    /* renamed from: a0 */
    public final boolean m157541a0(String str) {
        boolean z11;
        AbstractC19074t.m100208f(str, "userId");
        Boolean bool = (Boolean) this.f150314y.m101509a(new C29186c.a(str));
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            z11 = true;
        }
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_GET_STATUS_FOLLOW_NOTIFICATION_NEW_FEED", new f(z11));
        return z11;
    }

    /* renamed from: b0 */
    public final LiveData m157542b0() {
        return this.f150307E;
    }

    /* renamed from: i0 */
    public final void m157543i0() {
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_DELETE_FEED_NOTIFICATION", new g());
        NotificationBasicInfo notificationBasicInfo = this.f150304B;
        if (notificationBasicInfo != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new h(notificationBasicInfo, null), 3, null);
            m157532c0();
        }
    }

    /* renamed from: j0 */
    public final void m157544j0() {
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_FOLLOW_NEW_FEED_NOTIFICATION", new i());
        NotificationBasicInfo notificationBasicInfo = this.f150304B;
        if (notificationBasicInfo != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new j(notificationBasicInfo, null), 3, null);
            m157536h0();
        }
    }

    /* renamed from: k0 */
    public final void m157545k0() {
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_SUBSCRIBE_FEED_NOTIFICATION", new k());
        NotificationBasicInfo notificationBasicInfo = this.f150304B;
        if (notificationBasicInfo != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new l(notificationBasicInfo, null), 3, null);
            m157533e0();
        }
    }

    /* renamed from: l0 */
    public final void m157546l0() {
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNFOLLOW_NEW_FEED_NOTIFICATION", new m());
        NotificationBasicInfo notificationBasicInfo = this.f150304B;
        if (notificationBasicInfo != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new n(notificationBasicInfo, null), 3, null);
            m157535g0();
        }
    }

    /* renamed from: m0 */
    public final void m157547m0() {
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_UNSUBSCRIBE_FEED_NOTIFICATION", new o());
        NotificationBasicInfo notificationBasicInfo = this.f150304B;
        if (notificationBasicInfo != null) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new p(notificationBasicInfo, null), 3, null);
            m157534f0();
        }
    }

    /* renamed from: n0 */
    public final void m157548n0(NotificationBasicInfo notificationBasicInfo) {
        AbstractC19074t.m100208f(notificationBasicInfo, "notificationBasicInfo");
        this.f150304B = notificationBasicInfo;
        m157537o0(notificationBasicInfo);
        this.f150303A.mo135685a("SETTING_INLINE", "VIEW_MODEL_INIT_DATA", new q(notificationBasicInfo, this));
    }
}
