package p396ol;

import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import in.C20629c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import jm0.AbstractC21309s;
import me0.C23055e5;
import nl.C23870a;
import org.json.JSONObject;
import p212hj.AbstractC20071b;
import p348mi.AbstractC23306f;
import p396ol.InterfaceC24301d;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p550ul.C27301g;
import p613wl.AbstractC29087c;
import p716zh.C31944h6;
import pm.C24832c;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25361o0;
import qm0.AbstractC25378x;
import tg0.C26675a;
import tg0.C26676b;

/* renamed from: ol.b */
/* loaded from: classes3.dex */
public final class C24299b {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final Object f117304h = new Object();

    /* renamed from: i */
    private static final InterfaceC24854k f117305i;

    /* renamed from: a */
    private final C23870a f117306a;

    /* renamed from: b */
    private final C20629c f117307b;

    /* renamed from: c */
    private final HashMap f117308c;

    /* renamed from: d */
    private final HashMap f117309d;

    /* renamed from: e */
    private final HashMap f117310e;

    /* renamed from: f */
    private final Stack f117311f;

    /* renamed from: g */
    private final ArrayList f117312g;

    /* renamed from: ol.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f117313q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24299b mo12V4() {
            return c.f117314a.m126871a();
        }
    }

    /* renamed from: ol.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24299b m126870a() {
            return (C24299b) C24299b.f117305i.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ol.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f117314a = new c();

        /* renamed from: b */
        private static final C24299b f117315b;

        static {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            f117315b = new C24299b(m120679j2, C20629c.Companion.m107461a());
        }

        private c() {
        }

        /* renamed from: a */
        public final C24299b m126871a() {
            return f117315b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.b$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f117316q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f117316q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C24860q c24860q) {
            return Boolean.valueOf(AbstractC19074t.m100204b(((C25821b) c24860q.m129215c()).m133141d(), this.f117316q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.b$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f117317q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f117317q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(String str) {
            AbstractC19074t.m100208f(str, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f117317q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.b$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25821b f117319r;

        /* renamed from: s */
        final /* synthetic */ String f117320s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C25821b c25821b, String str) {
            super(1);
            this.f117319r = c25821b;
            this.f117320s = str;
        }

        /* renamed from: a */
        public final void m126874a(C24860q c24860q) {
            AbstractC19074t.m100208f(c24860q, "<name for destructuring parameter 0>");
            C24299b.this.m126865x(this.f117319r, (String) c24860q.m129213a(), this.f117320s);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126874a((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.b$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C25821b f117322r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C25821b c25821b) {
            super(2);
            this.f117322r = c25821b;
        }

        /* renamed from: a */
        public final void m126875a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            C24299b.this.m126860s(this.f117322r, "", i11, str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m126875a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.b$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f117323q;

        /* renamed from: r */
        final /* synthetic */ C25821b f117324r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC18505l interfaceC18505l, C25821b c25821b) {
            super(1);
            this.f117323q = interfaceC18505l;
            this.f117324r = c25821b;
        }

        /* renamed from: a */
        public final void m126876a(String str) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            this.f117323q.mo205i9(new C24860q(str, this.f117324r));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126876a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.b$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C25821b f117325q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18509p f117326r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C25821b c25821b, InterfaceC18509p interfaceC18509p) {
            super(2);
            this.f117325q = c25821b;
            this.f117326r = interfaceC18509p;
        }

        /* renamed from: a */
        public final void m126877a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            C26676b.m136955e("SMLZCloudDownloadAsyncController", "getZaloCloudDownloadUrl(): FAILED. cloudItem=" + this.f117325q + ", errorCode=" + i11 + ", errorMsg=" + str, C26676b.b.f126335t);
            this.f117326r.mo240pC(Integer.valueOf(i11), str);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m126877a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ol.b$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25821b f117327q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C25821b c25821b) {
            super(1);
            this.f117327q = c25821b;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(String str) {
            AbstractC19074t.m100208f(str, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f117327q.m133141d()));
        }
    }

    /* renamed from: ol.b$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC24300c {

        /* renamed from: c */
        final /* synthetic */ String f117328c;

        /* renamed from: d */
        final /* synthetic */ C25821b f117329d;

        /* renamed from: e */
        final /* synthetic */ C24299b f117330e;

        /* renamed from: f */
        final /* synthetic */ String f117331f;

        /* renamed from: g */
        final /* synthetic */ String f117332g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, C25821b c25821b, C24299b c24299b, String str2, String str3) {
            super(str, c25821b);
            this.f117328c = str;
            this.f117329d = c25821b;
            this.f117330e = c24299b;
            this.f117331f = str2;
            this.f117332g = str3;
            AbstractC19074t.m100205c(str);
        }

        @Override // p396ol.AbstractC24300c
        /* renamed from: e */
        public void mo126879e(String str, int i11) {
            AbstractC19074t.m100208f(str, "id");
            if (this.f117330e.m126859r(str, i11)) {
                this.f117330e.m126865x(this.f117329d, this.f117331f, this.f117332g);
                return;
            }
            C24299b c24299b = this.f117330e;
            C25821b c25821b = this.f117329d;
            String str2 = this.f117328c;
            AbstractC19074t.m100207e(str2, "$downloadUrl");
            C24299b.m126861t(c24299b, c25821b, str2, i11, null, 8, null);
        }

        @Override // p396ol.AbstractC24300c
        /* renamed from: f */
        public void mo126880f(String str, String str2) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "path");
            C24299b c24299b = this.f117330e;
            C25821b c25821b = this.f117329d;
            String str3 = this.f117328c;
            AbstractC19074t.m100207e(str3, "$downloadUrl");
            c24299b.m126863v(c25821b, str3, str2);
        }

        @Override // p396ol.AbstractC24300c
        /* renamed from: g */
        public void mo126881g(String str, long j11) {
            AbstractC19074t.m100208f(str, "id");
            this.f117330e.m126862u(this.f117329d, j11);
        }
    }

    /* renamed from: ol.b$l */
    /* loaded from: classes3.dex */
    public static final class l implements InterfaceC24301d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC24301d f117333a;

        /* renamed from: b */
        final /* synthetic */ C25821b f117334b;

        /* renamed from: c */
        final /* synthetic */ C24299b f117335c;

        /* renamed from: d */
        final /* synthetic */ long f117336d;

        l(InterfaceC24301d interfaceC24301d, C25821b c25821b, C24299b c24299b, long j11) {
            this.f117333a = interfaceC24301d;
            this.f117334b = c25821b;
            this.f117335c = c24299b;
            this.f117336d = j11;
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: a */
        public void mo66919a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f117333a.mo66919a(str, j11);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: b */
        public boolean mo66920b() {
            return this.f117333a.mo66920b();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: c */
        public EnumC24298a mo66921c() {
            return this.f117333a.mo66921c();
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: d */
        public void mo66922d(String str, int i11, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "errorMessage");
            C26676b.m136955e("SMLZCloudDownloadAsyncController", "startDownloadSingleMedia(): FAILED. cloudItem=" + this.f117334b + " \n url=" + C31944h6.m153552r(str) + " \n errorCode=" + i11, C26676b.b.f126336u);
            if (this.f117335c.m126858q(i11)) {
                this.f117335c.m126866z(mo66924h(), i11, this.f117334b);
            }
            this.f117335c.m126841A(mo66924h(), this.f117334b, i11, str2, this.f117336d);
            this.f117333a.mo66922d(str, i11, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: e */
        public void mo66923e(String str, String str2) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(str2, "path");
            C26676b.m136955e("SMLZCloudDownloadAsyncController", "startDownloadSingleMedia(): cloudItem=" + this.f117334b + " \n url=" + C31944h6.m153552r(str) + " \n path=" + str2, C26676b.b.f126336u);
            this.f117335c.m126842B(mo66924h(), this.f117334b, this.f117336d);
            this.f117333a.mo66923e(str, str2);
        }

        @Override // p396ol.InterfaceC24301d
        /* renamed from: h */
        public int mo66924h() {
            return InterfaceC24301d.a.m126884a(this);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f117313q);
        f117305i = m129210a;
    }

    public C24299b(C23870a c23870a, C20629c c20629c) {
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        AbstractC19074t.m100208f(c20629c, "downloadFileAsyncController");
        this.f117306a = c23870a;
        this.f117307b = c20629c;
        this.f117308c = new HashMap();
        this.f117309d = new HashMap();
        this.f117310e = new HashMap();
        this.f117311f = new Stack();
        this.f117312g = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m126841A(int i11, C25821b c25821b, int i12, String str, long j11) {
        C26675a.m136890L(C26675a.f126213a, m126856o(c25821b), i12, str, m126853k(i11, c25821b), j11, 0L, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final void m126842B(int i11, C25821b c25821b, long j11) {
        C26675a.m136891O(C26675a.f126213a, m126856o(c25821b), m126853k(i11, c25821b).toString(), j11, 0L, 8, null);
    }

    /* renamed from: k */
    private final JSONObject m126853k(int i11, C25821b c25821b) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source", i11);
        jSONObject.put("threadId", AbstractC25495a.m132089n(c25821b.m133146i().m41048l()));
        jSONObject.put("destType", AbstractC16893a.m90324a(c25821b));
        jSONObject.put("msgId", c25821b.m133146i().m41044h());
        jSONObject.put("senderId", c25821b.m133146i().m41050n());
        jSONObject.put("noiseId", c25821b.m133141d());
        jSONObject.put("msgType", AbstractC20071b.Companion.m104325e(c25821b.m133147j()));
        return jSONObject;
    }

    /* renamed from: m */
    private final void m126854m() {
        synchronized (f117304h) {
            C26676b.m136957g("SMLZCloudDownloadAsyncController", "Current download queue: " + this.f117312g.size(), null, 4, null);
            if (this.f117312g.size() >= 4) {
                return;
            }
            if (this.f117311f.size() <= 0) {
                return;
            }
            C24860q c24860q = (C24860q) this.f117311f.pop();
            if (c24860q == null) {
                m126854m();
                return;
            }
            AbstractC19074t.m100205c(c24860q);
            C25821b c25821b = (C25821b) c24860q.m129215c();
            String str = (String) c24860q.m129216d();
            try {
            } catch (Exception e11) {
                C26676b.m136954d("SMLZCloudDownloadAsyncController", e11);
                m126860s(c25821b, "", 1005, "Download fail by exception");
            }
            if (new File(str).exists()) {
                m126863v(c25821b, "", str);
            } else {
                if (!C23055e5.m118273h(false, 1, null)) {
                    m126860s(c25821b, "", 2, "Network error");
                    return;
                }
                this.f117312g.add(c25821b.m133141d());
                m126857p(c25821b, new f(c25821b, str), new g(c25821b));
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: n */
    private final int m126855n(C25821b c25821b) {
        if (!AbstractC16893a.m90330g(c25821b) && !AbstractC16893a.m90327d(c25821b)) {
            if (AbstractC16893a.m90331h(c25821b)) {
                return 26036;
            }
            if (AbstractC16893a.m90332i(c25821b)) {
                return 26037;
            }
            if (AbstractC16893a.m90328e(c25821b)) {
                return 26038;
            }
            return 0;
        }
        return 26035;
    }

    /* renamed from: o */
    private final int m126856o(C25821b c25821b) {
        if (!AbstractC16893a.m90330g(c25821b) && !AbstractC16893a.m90327d(c25821b)) {
            if (AbstractC16893a.m90331h(c25821b)) {
                return 1504301;
            }
            if (AbstractC16893a.m90332i(c25821b)) {
                return 1504302;
            }
            if (AbstractC16893a.m90328e(c25821b)) {
                return 1504303;
            }
            return 0;
        }
        return 1504300;
    }

    /* renamed from: p */
    private final void m126857p(C25821b c25821b, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        this.f117306a.m124779M(c25821b.m133141d(), new h(interfaceC18505l, c25821b), new i(c25821b, interfaceC18509p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final boolean m126858q(int i11) {
        return i11 == 1001 || i11 == 1002;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final synchronized boolean m126859r(String str, int i11) {
        if (i11 == 1) {
            return false;
        }
        try {
            Integer num = (Integer) this.f117309d.get(str);
            if (num == null) {
                this.f117309d.put(str, 0);
                num = 0;
            }
            int intValue = num.intValue();
            if (intValue < 3) {
                this.f117309d.put(str, Integer.valueOf(intValue + 1));
                return true;
            }
            this.f117309d.remove(str);
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m126860s(C25821b c25821b, String str, int i11, String str2) {
        List list = (List) this.f117310e.get(c25821b.m133141d());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC24301d) it.next()).mo66922d(str, i11, str2);
            }
        }
        this.f117310e.remove(c25821b.m133141d());
        m126864w(c25821b);
    }

    /* renamed from: t */
    static /* synthetic */ void m126861t(C24299b c24299b, C25821b c25821b, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str2 = "";
        }
        c24299b.m126860s(c25821b, str, i11, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m126862u(C25821b c25821b, long j11) {
        List list = (List) this.f117310e.get(c25821b.m133141d());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC24301d) it.next()).mo66919a(c25821b.m133141d(), j11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m126863v(C25821b c25821b, String str, String str2) {
        List list = (List) this.f117310e.get(c25821b.m133141d());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC24301d) it.next()).mo66923e(str, str2);
            }
        }
        this.f117310e.remove(c25821b.m133141d());
        m126864w(c25821b);
    }

    /* renamed from: w */
    private final void m126864w(C25821b c25821b) {
        synchronized (f117304h) {
            this.f117308c.remove(c25821b.m133141d());
            AbstractC25378x.m131542D(this.f117312g, new j(c25821b));
        }
        m126854m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final void m126865x(C25821b c25821b, String str, String str2) {
        Map m131401f;
        C26676b.m136955e("SMLZCloudDownloadAsyncController", "startDownloadFileAsync(): cloudItem=" + c25821b, C26676b.b.f126336u);
        String m110343g = AbstractC21309s.m110343g(str, "", new String[]{"client_type", "client_version"}, new String[]{"1", String.valueOf(CoreUtility.f89236l)}, new HashMap());
        synchronized (f117304h) {
            HashMap hashMap = this.f117308c;
            String m133141d = c25821b.m133141d();
            AbstractC19074t.m100205c(m110343g);
            hashMap.put(m133141d, m110343g);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("cloud-viewer-key", C27301g.Companion.m139821a().m139819b()));
        this.f117307b.m107459s(m110343g, str2, c25821b.m133141d(), new k(m110343g, c25821b, this, str, str2), true, m131401f, m126855n(c25821b), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m126866z(int i11, int i12, C25821b c25821b) {
        JSONObject m126853k = m126853k(i11, c25821b);
        C25821b.a m133144g = c25821b.m133144g();
        if (m133144g != null) {
            m126853k.put("algoVersion", m133144g.m133161a());
        }
        C26675a.m136890L(C26675a.f126213a, 1504310, i12, null, m126853k, 0L, 0L, 52, null);
    }

    /* renamed from: l */
    public final void m126867l(String str) {
        AbstractC19074t.m100208f(str, "cloudId");
        synchronized (f117304h) {
            AbstractC25378x.m131542D(this.f117311f, new d(str));
            AbstractC25378x.m131542D(this.f117312g, new e(str));
            this.f117310e.remove(str);
            this.f117309d.remove(str);
            String str2 = (String) this.f117308c.get(str);
            if (str2 == null) {
                return;
            }
            AbstractC19074t.m100205c(str2);
            this.f117308c.remove(str);
            this.f117307b.m107452f(str2, str);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: y */
    public final void m126868y(C25821b c25821b, String str, InterfaceC24301d interfaceC24301d) {
        AbstractC19074t.m100208f(c25821b, "cloudItem");
        AbstractC19074t.m100208f(str, "pathOut");
        AbstractC19074t.m100208f(interfaceC24301d, "listener");
        if (C24832c.m129123c()) {
            interfaceC24301d.mo66922d("", 1005, "");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (AbstractC16893a.m90325b(c25821b) == null && !AbstractC29087c.m145335c(c25821b.m133146i())) {
            m126841A(interfaceC24301d.mo66924h(), c25821b, ZAbstractBase.ZVU_BLEND_PERCENTAGE, "NULL encryption key", currentTimeMillis);
            m126866z(interfaceC24301d.mo66924h(), ZAbstractBase.ZVU_BLEND_PERCENTAGE, c25821b);
            C26676b.m136955e("SMLZCloudDownloadAsyncController", "startDownloadSingleMedia(): NULL encryption key. cloudItem=" + c25821b, C26676b.b.f126335t);
            interfaceC24301d.mo66922d("", ZAbstractBase.ZVU_BLEND_PERCENTAGE, "NULL encryption key");
            return;
        }
        Object obj = f117304h;
        synchronized (obj) {
            if (this.f117310e.get(c25821b.m133141d()) != null) {
                C26676b.m136952b("SMLZCloudDownloadAsyncController", "Message " + c25821b.m133146i() + " is in queue");
                List list = (List) this.f117310e.get(c25821b.m133141d());
                HashMap hashMap = this.f117310e;
                String m133141d = c25821b.m133141d();
                AbstractC19074t.m100205c(list);
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(interfaceC24301d);
                hashMap.put(m133141d, arrayList);
                if (!this.f117312g.contains(c25821b.m133141d())) {
                    this.f117311f.push(new C24860q(c25821b, str));
                }
                return;
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            l lVar = new l(interfaceC24301d, c25821b, this, currentTimeMillis);
            synchronized (obj) {
                HashMap hashMap2 = this.f117310e;
                String m133141d2 = c25821b.m133141d();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(lVar);
                hashMap2.put(m133141d2, arrayList2);
            }
            m126854m();
        }
    }
}
