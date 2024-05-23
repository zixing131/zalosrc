package od0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.AbstractC20095b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.NoWhenBranchMatchedException;
import me0.C23055e5;
import od0.C24226d;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p267jh.C21253b;
import p348mi.AbstractC23309i;
import p589vx.AbstractC28665j;
import p645xh.C29628e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import rd0.AbstractC25751q;
import rd0.C25735a;
import rd0.C25736b;
import rd0.C25737c;
import rd0.C25738d;
import rd0.C25739e;
import rd0.C25740f;
import rd0.C25741g;
import rd0.C25742h;
import rd0.C25743i;
import rd0.C25744j;
import rd0.C25745k;
import rd0.C25746l;
import rd0.C25747m;
import rd0.C25748n;
import rd0.C25749o;
import rd0.C25750p;
import rd0.C25753s;
import rd0.C25754t;
import rd0.C25755u;
import rd0.C25756v;
import td0.C26638a;
import td0.C26639b;

/* renamed from: od0.d */
/* loaded from: classes4.dex */
public final class C24226d {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final InterfaceC24854k f116942h;

    /* renamed from: a */
    private final Deque f116943a;

    /* renamed from: b */
    private final Object f116944b;

    /* renamed from: c */
    private final Set f116945c;

    /* renamed from: d */
    private final Handler f116946d;

    /* renamed from: e */
    private final HandlerThread f116947e;

    /* renamed from: f */
    private final ArrayList f116948f;

    /* renamed from: g */
    private final InterfaceC24231i f116949g;

    /* renamed from: od0.d$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f116950q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24226d mo12V4() {
            return c.f116951a.m126443a();
        }
    }

    /* renamed from: od0.d$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: h */
        public static /* synthetic */ C24230h m126433h(b bVar, int i11, EnumC24229g enumC24229g, String str, String str2, String str3, String str4, long j11, boolean z11, int i12, Object obj) {
            String str5;
            String str6;
            String str7;
            if ((i12 & 8) != 0) {
                str5 = "";
            } else {
                str5 = str2;
            }
            if ((i12 & 16) != 0) {
                str6 = "";
            } else {
                str6 = str3;
            }
            if ((i12 & 32) != 0) {
                str7 = "";
            } else {
                str7 = str4;
            }
            return bVar.m126440g(i11, enumC24229g, str, str5, str6, str7, j11, z11);
        }

        /* renamed from: a */
        public final void m126434a(C24230h c24230h) {
            AbstractC19074t.m100208f(c24230h, "uploadItem");
            m126436c().m126389K(c24230h);
        }

        /* renamed from: b */
        public final void m126435b() {
            m126436c().m126392N();
        }

        /* renamed from: c */
        public final C24226d m126436c() {
            return (C24226d) C24226d.f116942h.getValue();
        }

        /* renamed from: d */
        public final C24230h m126437d(int i11, EnumC24229g enumC24229g, String str, long j11, boolean z11) {
            AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
            AbstractC19074t.m100208f(str, "originPath");
            return m126433h(this, i11, enumC24229g, str, null, null, null, j11, z11, 56, null);
        }

        /* renamed from: e */
        public final C24230h m126438e(int i11, EnumC24229g enumC24229g, String str, String str2, long j11, boolean z11) {
            AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
            AbstractC19074t.m100208f(str, "originPath");
            AbstractC19074t.m100208f(str2, "outputPath");
            return m126433h(this, i11, enumC24229g, str, str2, null, null, j11, z11, 48, null);
        }

        /* renamed from: f */
        public final C24230h m126439f(int i11, EnumC24229g enumC24229g, String str, String str2, String str3, long j11, boolean z11) {
            AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
            AbstractC19074t.m100208f(str, "originPath");
            AbstractC19074t.m100208f(str2, "outputPath");
            AbstractC19074t.m100208f(str3, "renewUrl");
            return m126433h(this, i11, enumC24229g, str, str2, str3, null, j11, z11, 32, null);
        }

        /* renamed from: g */
        public final C24230h m126440g(int i11, EnumC24229g enumC24229g, String str, String str2, String str3, String str4, long j11, boolean z11) {
            AbstractC19074t.m100208f(enumC24229g, "uploadFeature");
            AbstractC19074t.m100208f(str, "originPath");
            AbstractC19074t.m100208f(str2, "outputPath");
            AbstractC19074t.m100208f(str3, "renewUrl");
            AbstractC19074t.m100208f(str4, "resizedRenewUrl");
            return m126436c().m126399U(i11, enumC24229g, str, str2, str3, str4, j11, z11);
        }

        /* renamed from: i */
        public final void m126441i(C24230h c24230h, long j11) {
            AbstractC19074t.m100208f(c24230h, "uploadItem");
            m126436c().m126401Y(c24230h, j11);
        }

        /* renamed from: j */
        public final void m126442j(C24230h c24230h) {
            AbstractC19074t.m100208f(c24230h, "uploadItem");
            m126436c().m126404a0(c24230h);
        }
    }

    /* renamed from: od0.d$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f116951a = new c();

        /* renamed from: b */
        private static final C24226d f116952b = new C24226d("UploadController", null);

        private c() {
        }

        /* renamed from: a */
        public final C24226d m126443a() {
            return f116952b;
        }
    }

    /* renamed from: od0.d$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f116953a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f116954b;

        static {
            int[] iArr = new int[EnumC24233k.values().length];
            try {
                iArr[EnumC24233k.f117063q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24233k.f117064r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f116953a = iArr;
            int[] iArr2 = new int[EnumC24229g.values().length];
            try {
                iArr2[EnumC24229g.f116983q.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC24229g.f116984r.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC24229g.f116978Q.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC24229g.f116979R.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC24229g.f116980S.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC24229g.f116985s.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC24229g.f116986t.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC24229g.f116987u.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC24229g.f116988v.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC24229g.f116989w.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC24229g.f116990x.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EnumC24229g.f116991y.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EnumC24229g.f116992z.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EnumC24229g.f116962A.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EnumC24229g.f116976O.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EnumC24229g.f116963B.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EnumC24229g.f116964C.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[EnumC24229g.f116965D.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[EnumC24229g.f116972K.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[EnumC24229g.f116966E.ordinal()] = 20;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EnumC24229g.f116971J.ordinal()] = 21;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[EnumC24229g.f116967F.ordinal()] = 22;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[EnumC24229g.f116968G.ordinal()] = 23;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[EnumC24229g.f116969H.ordinal()] = 24;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[EnumC24229g.f116970I.ordinal()] = 25;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[EnumC24229g.f116973L.ordinal()] = 26;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[EnumC24229g.f116974M.ordinal()] = 27;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[EnumC24229g.f116975N.ordinal()] = 28;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[EnumC24229g.f116977P.ordinal()] = 29;
            } catch (NoSuchFieldError unused31) {
            }
            f116954b = iArr2;
        }
    }

    /* renamed from: od0.d$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC24231i {
        e() {
        }

        /* renamed from: f */
        public static final void m126446f(C24226d c24226d, C24230h c24230h, JSONObject jSONObject) {
            AbstractC19074t.m100208f(c24226d, "this$0");
            AbstractC19074t.m100208f(c24230h, "$uploadItem");
            AbstractC19074t.m100208f(jSONObject, "$entity");
            synchronized (c24226d.f116944b) {
                c24226d.f116945c.remove(c24230h);
            }
            c24230h.m126498V(c24226d.m126384F(jSONObject, c24230h));
            c24226d.f116946d.sendEmptyMessage(1);
        }

        /* renamed from: g */
        public static final void m126447g(C24226d c24226d, C24230h c24230h, C20096c c20096c) {
            AbstractC19074t.m100208f(c24226d, "this$0");
            AbstractC19074t.m100208f(c24230h, "$uploadItem");
            AbstractC19074t.m100208f(c20096c, "$error_message");
            try {
                try {
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                synchronized (c24226d.f116944b) {
                    if (!c24226d.f116945c.contains(c24230h)) {
                        return;
                    }
                    c24226d.f116945c.remove(c24230h);
                    c24230h.m126496T(c20096c);
                }
            } finally {
                c24226d.f116946d.sendEmptyMessage(1);
            }
        }

        @Override // od0.InterfaceC24231i
        /* renamed from: a */
        public void mo126448a(C24230h c24230h, JSONObject jSONObject) {
            AbstractC19074t.m100208f(c24230h, "uploadItem");
            AbstractC19074t.m100208f(jSONObject, "entity");
            AbstractC20110a.f98889a.mo104548a("[onDataProcessed] entity: " + jSONObject, new Object[0]);
            C24226d.this.f116946d.post(new Runnable() { // from class: od0.f

                /* renamed from: q */
                public final /* synthetic */ C24230h f116960q;

                /* renamed from: r */
                public final /* synthetic */ JSONObject f116961r;

                public /* synthetic */ RunnableC24228f(C24230h c24230h2, JSONObject jSONObject2) {
                    r2 = c24230h2;
                    r3 = jSONObject2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C24226d.e.m126446f(C24226d.this, r2, r3);
                }
            });
        }

        @Override // od0.InterfaceC24231i
        /* renamed from: b */
        public void mo126449b(C24230h c24230h, C20096c c20096c) {
            AbstractC19074t.m100208f(c24230h, "uploadItem");
            AbstractC19074t.m100208f(c20096c, "error_message");
            C26639b.m136739C("onErrorData: " + c20096c);
            C24226d.this.f116946d.post(new Runnable() { // from class: od0.e

                /* renamed from: q */
                public final /* synthetic */ C24230h f116957q;

                /* renamed from: r */
                public final /* synthetic */ C20096c f116958r;

                public /* synthetic */ RunnableC24227e(C24230h c24230h2, C20096c c20096c2) {
                    r2 = c24230h2;
                    r3 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C24226d.e.m126447g(C24226d.this, r2, r3);
                }
            });
        }

        @Override // od0.InterfaceC24231i
        /* renamed from: c */
        public void mo126450c(C24230h c24230h, long j11) {
            AbstractC19074t.m100208f(c24230h, "uploadItem");
            C26639b.m136739C("progress: " + c24230h.m126532x() + " " + j11);
            c24230h.m126497U(j11);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f116950q);
        f116942h = m129210a;
    }

    public /* synthetic */ C24226d(String str, AbstractC19060k abstractC19060k) {
        this(str);
    }

    /* renamed from: A */
    private final C25747m m126379A(JSONObject jSONObject) {
        long j11;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            j11 = optJSONObject.optLong("photo_id");
        } else {
            j11 = 0;
        }
        return new C25747m(j11);
    }

    /* renamed from: B */
    private final C25753s m126380B(JSONObject jSONObject) {
        long j11;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            j11 = optJSONObject.optLong("photo_id");
        } else {
            j11 = 0;
        }
        return new C25753s(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C25748n m126381C(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        CharSequence m127168X0;
        CharSequence m127168X02;
        String optString;
        CharSequence m127168X03;
        String obj;
        String optString2;
        CharSequence m127168X04;
        String obj2;
        String optString3;
        CharSequence m127168X05;
        JSONObject optJSONObject = jSONObject.optJSONObject("sFileId");
        if (optJSONObject != null && (optString3 = optJSONObject.optString("thumb")) != null) {
            AbstractC19074t.m100205c(optString3);
            m127168X05 = AbstractC24342w.m127168X0(optString3);
            String obj3 = m127168X05.toString();
            if (obj3 != null) {
                str = obj3;
                if (optJSONObject != null && (optString2 = optJSONObject.optString("org")) != null) {
                    AbstractC19074t.m100205c(optString2);
                    m127168X04 = AbstractC24342w.m127168X0(optString2);
                    obj2 = m127168X04.toString();
                    if (obj2 != null) {
                        str2 = obj2;
                        if (optJSONObject != null && (optString = optJSONObject.optString("photoId")) != null) {
                            AbstractC19074t.m100205c(optString);
                            m127168X03 = AbstractC24342w.m127168X0(optString);
                            obj = m127168X03.toString();
                            if (obj != null) {
                                str3 = obj;
                                String optString4 = jSONObject.optString("fileId");
                                AbstractC19074t.m100207e(optString4, "optString(...)");
                                m127168X0 = AbstractC24342w.m127168X0(optString4);
                                String obj4 = m127168X0.toString();
                                String optString5 = jSONObject.optString("partId");
                                AbstractC19074t.m100207e(optString5, "optString(...)");
                                m127168X02 = AbstractC24342w.m127168X0(optString5);
                                return new C25748n(str2, str, str3, obj4, m127168X02.toString(), jSONObject.optInt("state", 0), jSONObject.optJSONObject("photo_info"));
                            }
                        }
                        str3 = "";
                        String optString42 = jSONObject.optString("fileId");
                        AbstractC19074t.m100207e(optString42, "optString(...)");
                        m127168X0 = AbstractC24342w.m127168X0(optString42);
                        String obj42 = m127168X0.toString();
                        String optString52 = jSONObject.optString("partId");
                        AbstractC19074t.m100207e(optString52, "optString(...)");
                        m127168X02 = AbstractC24342w.m127168X0(optString52);
                        return new C25748n(str2, str, str3, obj42, m127168X02.toString(), jSONObject.optInt("state", 0), jSONObject.optJSONObject("photo_info"));
                    }
                }
                str2 = "";
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optString);
                    m127168X03 = AbstractC24342w.m127168X0(optString);
                    obj = m127168X03.toString();
                    if (obj != null) {
                    }
                }
                str3 = "";
                String optString422 = jSONObject.optString("fileId");
                AbstractC19074t.m100207e(optString422, "optString(...)");
                m127168X0 = AbstractC24342w.m127168X0(optString422);
                String obj422 = m127168X0.toString();
                String optString522 = jSONObject.optString("partId");
                AbstractC19074t.m100207e(optString522, "optString(...)");
                m127168X02 = AbstractC24342w.m127168X0(optString522);
                return new C25748n(str2, str, str3, obj422, m127168X02.toString(), jSONObject.optInt("state", 0), jSONObject.optJSONObject("photo_info"));
            }
        }
        str = "";
        if (optJSONObject != null) {
            AbstractC19074t.m100205c(optString2);
            m127168X04 = AbstractC24342w.m127168X0(optString2);
            obj2 = m127168X04.toString();
            if (obj2 != null) {
            }
        }
        str2 = "";
        if (optJSONObject != null) {
        }
        str3 = "";
        String optString4222 = jSONObject.optString("fileId");
        AbstractC19074t.m100207e(optString4222, "optString(...)");
        m127168X0 = AbstractC24342w.m127168X0(optString4222);
        String obj4222 = m127168X0.toString();
        String optString5222 = jSONObject.optString("partId");
        AbstractC19074t.m100207e(optString5222, "optString(...)");
        m127168X02 = AbstractC24342w.m127168X0(optString5222);
        return new C25748n(str2, str, str3, obj4222, m127168X02.toString(), jSONObject.optInt("state", 0), jSONObject.optJSONObject("photo_info"));
    }

    /* renamed from: D */
    private final C25749o m126382D(JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        String str3 = null;
        if (optJSONObject != null) {
            str = optJSONObject.optString("org");
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        } else {
            AbstractC19074t.m100205c(str);
        }
        if (optJSONObject != null) {
            str2 = optJSONObject.optString("thumb");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        } else {
            AbstractC19074t.m100205c(str2);
        }
        if (optJSONObject != null) {
            str3 = optJSONObject.optString("hd");
        }
        if (str3 != null) {
            AbstractC19074t.m100205c(str3);
            str4 = str3;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("photo_info");
        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
        return new C25749o(str, str2, str4, jSONObject2);
    }

    /* renamed from: E */
    private final C25750p m126383E(JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        String str3 = null;
        if (optJSONObject != null) {
            str = optJSONObject.optString("org");
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        } else {
            AbstractC19074t.m100205c(str);
        }
        if (optJSONObject != null) {
            str2 = optJSONObject.optString("thumb");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        } else {
            AbstractC19074t.m100205c(str2);
        }
        if (optJSONObject != null) {
            str3 = optJSONObject.optString("hd");
        }
        if (str3 != null) {
            AbstractC19074t.m100205c(str3);
            str4 = str3;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("photo_info");
        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
        return new C25750p(str, str2, str4, jSONObject2);
    }

    /* renamed from: F */
    public final AbstractC25751q m126384F(JSONObject jSONObject, C24230h c24230h) {
        int i11 = -1;
        switch (d.f116954b[c24230h.m126490G().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return m126421r(jSONObject);
            case 6:
                EnumC24233k m126491H = c24230h.m126491H();
                if (m126491H != null) {
                    i11 = d.f116953a[m126491H.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        return m126379A(jSONObject);
                    }
                    throw new IllegalArgumentException("Unknown uploadMethod " + c24230h.m126491H());
                }
                return m126419p(jSONObject);
            case 7:
                EnumC24233k m126491H2 = c24230h.m126491H();
                if (m126491H2 != null) {
                    i11 = d.f116953a[m126491H2.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        return m126429z(jSONObject);
                    }
                    throw new IllegalArgumentException("Unknown uploadMethod " + c24230h.m126491H());
                }
                return m126418o(jSONObject);
            case 8:
                return m126424u(jSONObject);
            case 9:
                return m126417n(jSONObject);
            case 10:
                return m126428y(jSONObject);
            case 11:
                return m126385G(jSONObject);
            case 12:
                return m126421r(jSONObject);
            case 13:
                return m126386H(jSONObject);
            case 14:
            case 15:
                return m126422s(jSONObject);
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return m126420q(jSONObject);
            case 17:
                return m126387I(jSONObject);
            case 18:
            case 19:
                return m126426w(jSONObject);
            case 20:
            case 21:
            case 22:
                return m126423t(jSONObject);
            case 23:
                return m126427x(jSONObject);
            case 24:
                return m126381C(jSONObject);
            case 25:
                return m126425v(jSONObject);
            case 26:
            case 27:
                return m126383E(jSONObject);
            case 28:
                return m126382D(jSONObject);
            case 29:
                return m126380B(jSONObject);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: G */
    private final C25754t m126385G(JSONObject jSONObject) {
        String str;
        String optString = jSONObject.optString("fileId");
        AbstractC19074t.m100207e(optString, "optString(...)");
        boolean optBoolean = jSONObject.optBoolean("isFinish");
        if (jSONObject.has("status")) {
            str = jSONObject.optString("status");
        } else {
            str = null;
        }
        return new C25754t(optString, optBoolean, str, jSONObject.optJSONObject("data"));
    }

    /* renamed from: H */
    private final C25755u m126386H(JSONObject jSONObject) {
        return new C25755u(jSONObject.optJSONObject("data"));
    }

    /* renamed from: I */
    private final C25756v m126387I(JSONObject jSONObject) {
        return new C25756v(jSONObject.optJSONObject("data"));
    }

    /* renamed from: J */
    public static final void m126388J(C24230h c24230h) {
        Companion.m126434a(c24230h);
    }

    /* renamed from: K */
    public final void m126389K(C24230h c24230h) {
        AbstractC20110a.f98889a.mo104548a("cancelUpload: " + c24230h, new Object[0]);
        synchronized (this.f116944b) {
            this.f116943a.remove(c24230h);
            c24230h.m126509j();
            c24230h.m126507i();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: L */
    private final void m126390L() {
        if (this.f116943a.isEmpty()) {
            return;
        }
        synchronized (this.f116944b) {
            Iterator it = this.f116943a.iterator();
            AbstractC19074t.m100207e(it, "iterator(...)");
            while (it.hasNext()) {
                C24230h c24230h = (C24230h) it.next();
                if (c24230h == null) {
                    return;
                }
                AbstractC19074t.m100205c(c24230h);
                if (!C23055e5.m118272g(C26639b.m136754m(c24230h.m126490G()))) {
                    it.remove();
                    this.f116946d.post(new Runnable() { // from class: od0.c
                        public /* synthetic */ RunnableC24225c() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C24226d.m126391M(C24230h.this);
                        }
                    });
                } else {
                    try {
                        m126393O(c24230h);
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    it.remove();
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: M */
    public static final void m126391M(C24230h c24230h) {
        AbstractC19074t.m100208f(c24230h, "$uploadItem");
        c24230h.m126496T(C26638a.f126094a.m136732a());
    }

    /* renamed from: N */
    public final void m126392N() {
        Iterable m131502j;
        m131502j = AbstractC25368s.m131502j();
        synchronized (this.f116944b) {
            try {
                if (!this.f116943a.isEmpty()) {
                    m131502j = new ArrayList(this.f116943a);
                }
                this.f116943a.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = m131502j.iterator();
        while (it.hasNext()) {
            ((C24230h) it.next()).m126496T(new C20096c(502, AbstractC20095b.f98832d));
        }
    }

    /* renamed from: O */
    private final void m126393O(C24230h c24230h) {
        if (C26639b.m136758q(c24230h.m126490G())) {
            synchronized (this.f116944b) {
                this.f116945c.add(c24230h);
            }
            int i11 = 0;
            boolean z11 = false;
            if (C26639b.m136765x(c24230h.m126490G())) {
                if (c24230h.m126495R()) {
                    boolean m126494M = c24230h.m126494M();
                    if (c24230h.m126490G() == EnumC24229g.f116984r) {
                        z11 = true;
                    }
                    i11 = c24230h.m126511k(m126494M, z11);
                } else {
                    i11 = c24230h.m126513l();
                }
            }
            if (i11 != 0) {
                if (i11 != 601) {
                    this.f116949g.mo126449b(c24230h, AbstractC28665j.m143429e());
                    return;
                } else {
                    c24230h.m126499a0();
                    return;
                }
            }
            C26639b.m136739C("[doNativeUpload] Start native upload");
            c24230h.m126488E0();
        }
    }

    /* renamed from: P */
    public static final C24226d m126394P() {
        return Companion.m126436c();
    }

    /* renamed from: Q */
    public static final C24230h m126395Q(int i11, EnumC24229g enumC24229g, String str, long j11, boolean z11) {
        return Companion.m126437d(i11, enumC24229g, str, j11, z11);
    }

    /* renamed from: R */
    public static final C24230h m126396R(int i11, EnumC24229g enumC24229g, String str, String str2, long j11, boolean z11) {
        return Companion.m126438e(i11, enumC24229g, str, str2, j11, z11);
    }

    /* renamed from: S */
    public static final C24230h m126397S(int i11, EnumC24229g enumC24229g, String str, String str2, String str3, long j11, boolean z11) {
        return Companion.m126439f(i11, enumC24229g, str, str2, str3, j11, z11);
    }

    /* renamed from: T */
    public static final C24230h m126398T(int i11, EnumC24229g enumC24229g, String str, String str2, String str3, String str4, long j11, boolean z11) {
        return Companion.m126440g(i11, enumC24229g, str, str2, str3, str4, j11, z11);
    }

    /* renamed from: U */
    public final C24230h m126399U(int i11, EnumC24229g enumC24229g, String str, String str2, String str3, String str4, long j11, boolean z11) {
        return new C24230h(i11, enumC24229g, str, str3, str4, C26639b.m136744c(C26639b.f126100a, i11, enumC24229g, str, str2, z11, false, 32, null), j11, z11, this.f116949g);
    }

    /* renamed from: X */
    public static final void m126400X(C24230h c24230h, long j11) {
        Companion.m126441i(c24230h, j11);
    }

    /* renamed from: Y */
    public final void m126401Y(C24230h c24230h, long j11) {
        AbstractC20110a.f98889a.mo104548a("update timeout: %s", c24230h);
        C29628e.m147249E0().m93401c0(c24230h.m126521r(), j11);
    }

    /* renamed from: Z */
    public static final void m126402Z(C24230h c24230h) {
        Companion.m126442j(c24230h);
    }

    /* renamed from: a0 */
    public final void m126404a0(C24230h c24230h) {
        synchronized (this.f116944b) {
            this.f116943a.add(c24230h);
        }
        this.f116946d.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public static final boolean m126406c(C24226d c24226d, Message message) {
        AbstractC19074t.m100208f(c24226d, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        if (message.what == 1) {
            c24226d.m126390L();
            return false;
        }
        return false;
    }

    /* renamed from: n */
    private final C25735a m126417n(JSONObject jSONObject) {
        String optString = jSONObject.optString("data");
        AbstractC19074t.m100207e(optString, "optString(...)");
        String optString2 = jSONObject.optString("picId");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        return new C25735a(optString, optString2);
    }

    /* renamed from: o */
    private final C25736b m126418o(JSONObject jSONObject) {
        return new C25736b(jSONObject.optLong("sFileId"), jSONObject.optJSONObject("photo_info"));
    }

    /* renamed from: p */
    private final C25737c m126419p(JSONObject jSONObject) {
        return new C25737c(jSONObject.optJSONObject("data"));
    }

    /* renamed from: q */
    private final C25738d m126420q(JSONObject jSONObject) {
        return new C25738d(null, 1, null);
    }

    /* renamed from: r */
    private final C25739e m126421r(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        long j11;
        long j12;
        String str4;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        String str5 = null;
        if (optJSONObject != null) {
            str = optJSONObject.optString("org");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        } else {
            AbstractC19074t.m100205c(str);
        }
        if (optJSONObject != null) {
            str2 = optJSONObject.optString("thumb");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        } else {
            AbstractC19074t.m100205c(str2);
        }
        if (optJSONObject != null) {
            str3 = optJSONObject.optString("hd");
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        } else {
            AbstractC19074t.m100205c(str3);
        }
        long j13 = 0;
        if (optJSONObject != null) {
            j11 = optJSONObject.optLong("fileSize");
        } else {
            j11 = 0;
        }
        if (optJSONObject != null) {
            j12 = optJSONObject.optLong("hdSize");
        } else {
            j12 = 0;
        }
        if (optJSONObject != null) {
            j13 = optJSONObject.optLong("thumbSize");
        }
        long j14 = j13;
        JSONObject jSONObject2 = jSONObject.getJSONObject("photo_info");
        AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
        if (optJSONObject != null) {
            str5 = optJSONObject.optString("convertible", "");
        }
        if (str5 == null) {
            str4 = "";
        } else {
            AbstractC19074t.m100205c(str5);
            str4 = str5;
        }
        return new C25739e(str, str2, str3, j11, j12, j14, jSONObject2, str4);
    }

    /* renamed from: s */
    private final C25740f m126422s(JSONObject jSONObject) {
        String str;
        long j11;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            str = optJSONObject.optString("org");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            j11 = optJSONObject2.optLong("fileSize");
        } else {
            j11 = 0;
        }
        return new C25740f(str, j11);
    }

    /* renamed from: t */
    private final C25741g m126423t(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        long j11;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        String str4 = null;
        if (optJSONObject != null) {
            str = optJSONObject.optString("org");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        } else {
            AbstractC19074t.m100205c(str);
        }
        if (optJSONObject != null) {
            str2 = optJSONObject.optString("thumb");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        } else {
            AbstractC19074t.m100205c(str2);
        }
        if (optJSONObject != null) {
            str4 = optJSONObject.optString("m4a");
        }
        if (str4 == null) {
            str3 = "";
        } else {
            AbstractC19074t.m100205c(str4);
            str3 = str4;
        }
        if (optJSONObject != null) {
            j11 = optJSONObject.optLong("fileSize");
        } else {
            j11 = 0;
        }
        return new C25741g(str, str2, str3, j11);
    }

    /* renamed from: u */
    private final C25742h m126424u(JSONObject jSONObject) {
        String str;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            str = optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String optString = jSONObject.optString("picId");
        AbstractC19074t.m100207e(optString, "optString(...)");
        return new C25742h(str, optString);
    }

    /* renamed from: v */
    private final C25743i m126425v(JSONObject jSONObject) {
        return new C25743i(null, null, 3, null);
    }

    /* renamed from: w */
    private final C25744j m126426w(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return new C25744j(jSONObject2);
    }

    /* renamed from: x */
    private final C25745k m126427x(JSONObject jSONObject) {
        String str;
        long j11;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            str = optJSONObject.optString("org");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            j11 = optJSONObject2.optLong("fileSize");
        } else {
            j11 = 0;
        }
        return new C25745k(str, j11);
    }

    /* renamed from: y */
    private final C25746l m126428y(JSONObject jSONObject) {
        String str;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            str = optJSONObject.optString("org");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new C25746l(str);
    }

    /* renamed from: z */
    private final C25753s m126429z(JSONObject jSONObject) {
        long j11;
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            j11 = optJSONObject.optLong("photo_id");
        } else {
            j11 = 0;
        }
        return new C25753s(j11);
    }

    /* renamed from: V */
    public final void m126430V() {
        try {
            String m121194Md = AbstractC23309i.m121194Md();
            AbstractC19074t.m100205c(m121194Md);
            if (m121194Md.length() == 0) {
                return;
            }
            AbstractC17526e.m93371t0(m121194Md);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: W */
    public final boolean m126431W(String str) {
        AbstractC19074t.m100208f(str, "destID");
        return this.f116948f.contains(str);
    }

    private C24226d(String str) {
        this.f116943a = new LinkedBlockingDeque();
        this.f116944b = new Object();
        this.f116945c = new C21253b();
        HandlerThread handlerThread = new HandlerThread("Z: " + str);
        this.f116947e = handlerThread;
        handlerThread.start();
        this.f116946d = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: od0.b
            public /* synthetic */ C24224b() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m126406c;
                m126406c = C24226d.m126406c(C24226d.this, message);
                return m126406c;
            }
        });
        m126430V();
        ArrayList arrayList = new ArrayList();
        arrayList.add("204278670");
        this.f116948f = arrayList;
        this.f116949g = new e();
    }
}
