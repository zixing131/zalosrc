package p582vp;

import ae.C0766k;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.mvp.notificationsetting.model.ExceptionDeleteFeedNotification;
import com.zing.zalo.feed.mvp.notificationsetting.model.ExceptionSettingFeedNotificationErrorNetwork;
import com.zing.zalo.feed.mvp.notificationsetting.model.ExceptionSubscribeFeed;
import com.zing.zalo.feed.mvp.notificationsetting.model.ExceptionUnSubscribeFeed;
import com.zing.zalo.feed.mvp.notificationsetting.model.ExceptionUpdateSettingNotificationNewFeed;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.List;
import kotlin.coroutines.Continuation;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p348mi.AbstractC23309i;
import p509sp.InterfaceC26357f;
import pm0.AbstractC24862s;
import pm0.C24861r;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29100h;

/* renamed from: vp.a */
/* loaded from: classes4.dex */
public final class C28565a {

    /* renamed from: a */
    private final InterfaceC26357f f132518a;

    /* renamed from: vp.a$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ long f132519q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11) {
            super(0);
            this.f132519q = j11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Start delete notification " + this.f132519q;
        }
    }

    /* renamed from: vp.a$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f132520q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Error no network";
        }
    }

    /* renamed from: vp.a$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ Continuation f132522b;

        /* renamed from: vp.a$c$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Object f132523q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj) {
                super(0);
                this.f132523q = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Delete success: " + this.f132523q;
            }
        }

        /* renamed from: vp.a$c$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C20096c f132524q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C20096c c20096c) {
                super(0);
                this.f132524q = c20096c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Delete fail: " + this.f132524q;
            }
        }

        c(Continuation continuation) {
            this.f132522b = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_DELETE_NOTIFICATION", new b(c20096c));
            Continuation continuation = this.f132522b;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionDeleteFeedNotification.f46385p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_DELETE_NOTIFICATION", new a(obj));
            Continuation continuation = this.f132522b;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vp.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f132525q;

        /* renamed from: r */
        final /* synthetic */ int f132526r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, int i11) {
            super(0);
            this.f132525q = str;
            this.f132526r = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Start subscribe feed - feedId: " + this.f132525q + " - type: " + this.f132526r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vp.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f132527q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Error no network";
        }
    }

    /* renamed from: vp.a$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ Continuation f132529b;

        /* renamed from: vp.a$f$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Object f132530q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj) {
                super(0);
                this.f132530q = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Subscribe feed success: " + this.f132530q;
            }
        }

        /* renamed from: vp.a$f$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C20096c f132531q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C20096c c20096c) {
                super(0);
                this.f132531q = c20096c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Subscribe feed fail: " + this.f132531q;
            }
        }

        f(Continuation continuation) {
            this.f132529b = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_SUBSCRIBE_FEED", new b(c20096c));
            Continuation continuation = this.f132529b;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSubscribeFeed.f46387p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_SUBSCRIBE_FEED", new a(obj));
            Continuation continuation = this.f132529b;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vp.a$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f132532q;

        /* renamed from: r */
        final /* synthetic */ int f132533r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, int i11) {
            super(0);
            this.f132532q = str;
            this.f132533r = i11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Start unsubscribe feed - feedId: " + this.f132532q + " - type: " + this.f132533r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vp.a$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f132534q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Error no network";
        }
    }

    /* renamed from: vp.a$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ Continuation f132536b;

        /* renamed from: vp.a$i$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Object f132537q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj) {
                super(0);
                this.f132537q = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Unsubscribe feed success: " + this.f132537q;
            }
        }

        /* renamed from: vp.a$i$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C20096c f132538q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C20096c c20096c) {
                super(0);
                this.f132538q = c20096c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Unsubscribe feed fail: " + this.f132538q;
            }
        }

        i(Continuation continuation) {
            this.f132536b = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_UNSUBSCRIBE_FEED", new b(c20096c));
            Continuation continuation = this.f132536b;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionUnSubscribeFeed.f46388p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_UNSUBSCRIBE_FEED", new a(obj));
            Continuation continuation = this.f132536b;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    /* renamed from: vp.a$j */
    /* loaded from: classes4.dex */
    static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f132539q;

        /* renamed from: r */
        final /* synthetic */ List f132540r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11, List list) {
            super(0);
            this.f132539q = i11;
            this.f132540r = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Start update privacy notification feed - Type: " + this.f132539q + " - list uid: " + this.f132540r;
        }
    }

    /* renamed from: vp.a$k */
    /* loaded from: classes4.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f132541q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Error no network";
        }
    }

    /* renamed from: vp.a$l */
    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f132543b;

        /* renamed from: c */
        final /* synthetic */ List f132544c;

        /* renamed from: d */
        final /* synthetic */ Continuation f132545d;

        /* renamed from: vp.a$l$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Object f132546q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj) {
                super(0);
                this.f132546q = obj;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Setting success: " + this.f132546q;
            }
        }

        /* renamed from: vp.a$l$b */
        /* loaded from: classes4.dex */
        static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C20096c f132547q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C20096c c20096c) {
                super(0);
                this.f132547q = c20096c;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Setting fail: " + this.f132547q;
            }
        }

        l(int i11, List list, Continuation continuation) {
            this.f132543b = i11;
            this.f132544c = list;
            this.f132545d = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_UPDATE_SETTING_NEW_FEED_NOTIFICATION", new b(c20096c));
            Continuation continuation = this.f132545d;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionUpdateSettingNotificationNewFeed.f46389p)));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C28565a.this.f132518a.mo135685a("SETTING_INLINE", "API_UPDATE_SETTING_NEW_FEED_NOTIFICATION", new a(obj));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f132543b);
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f132544c) {
                JSONObject jSONObject2 = new JSONObject();
                ContactProfile m98552o = C18644n.m98531l().m98552o(str);
                if (m98552o != null) {
                    jSONObject2.put("userId", m98552o.f42434r);
                    jSONObject2.put("avatar", m98552o.f42446v);
                    jSONObject2.put("displayName", m98552o.f42437s);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("list_uid", jSONArray);
            AbstractC23309i.m121176Lw(jSONObject.toString());
            Continuation continuation = this.f132545d;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(Boolean.TRUE));
        }
    }

    public C28565a(InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f132518a = interfaceC26357f;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m142948d(C28565a c28565a, String str, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        return c28565a.m142951c(str, i11, continuation);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m142949f(C28565a c28565a, String str, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        return c28565a.m142952e(str, i11, continuation);
    }

    /* renamed from: b */
    public final Object m142950b(long j11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f132518a.mo135685a("SETTING_INLINE", "API_DELETE_NOTIFICATION", new a(j11));
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            this.f132518a.mo135685a("SETTING_INLINE", "API_DELETE_NOTIFICATION", b.f132520q);
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSettingFeedNotificationErrorNetwork.f46386p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(c27317h));
            c0766k.mo1595a6(AbstractC29094b.m145342d(j11));
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: c */
    public final Object m142951c(String str, int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f132518a.mo135685a("SETTING_INLINE", "API_SUBSCRIBE_FEED", new d(str, i11));
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            this.f132518a.mo135685a("SETTING_INLINE", "API_SUBSCRIBE_FEED", e.f132527q);
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSettingFeedNotificationErrorNetwork.f46386p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(c27317h));
            c0766k.mo1403C6(str, i11);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: e */
    public final Object m142952e(String str, int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f132518a.mo135685a("SETTING_INLINE", "API_UNSUBSCRIBE_FEED", new g(str, i11));
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            this.f132518a.mo135685a("SETTING_INLINE", "API_UNSUBSCRIBE_FEED", h.f132534q);
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSettingFeedNotificationErrorNetwork.f46386p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new i(c27317h));
            c0766k.mo1487M9(str, i11);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: g */
    public final Object m142953g(int i11, List list, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        this.f132518a.mo135685a("SETTING_INLINE", "API_UPDATE_SETTING_NEW_FEED_NOTIFICATION", new j(i11, list));
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            this.f132518a.mo135685a("SETTING_INLINE", "API_UPDATE_SETTING_NEW_FEED_NOTIFICATION", k.f132541q);
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionSettingFeedNotificationErrorNetwork.f46386p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new l(i11, list, c27317h));
            c0766k.mo1562W4(14, i11, list);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
