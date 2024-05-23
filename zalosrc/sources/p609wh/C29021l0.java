package p609wh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0808c0;
import ag0.C0814e0;
import ag0.C0829l0;
import ag0.C0832n;
import ag0.C0843s0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.core.util.C1483e;
import b40.AbstractC2531f0;
import b40.C2544s;
import bo.C3020p0;
import bo.C3027q2;
import c30.C3245i;
import com.androidquery.util.C3977j;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.zinstant.C17099a;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.RequestPacket;
import dj.C17945a0;
import ee.C18403k;
import ee.C18408p;
import eg0.C18426a;
import eg0.C18427b;
import en0.InterfaceC18494a;
import fg0.ThreadFactoryC18928a;
import fj.C18980w;
import gm0.AbstractC19509c;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import is.AbstractC20833z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lb0.C22423y;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23088h5;
import me0.AbstractC23126l;
import me0.AbstractC23152n3;
import me0.AbstractC23165o5;
import me0.AbstractC23174p3;
import me0.AbstractC23181q;
import me0.AbstractC23184q2;
import me0.C23055e5;
import me0.C23278z2;
import mg.C23288a;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import mm0.AbstractC23351f;
import nh0.C23793c;
import nh0.InterfaceC23792b;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0872f;
import p019aj.C0876j;
import p056cj.C3535c;
import p056cj.C3537e;
import p111du.AbstractC18069a;
import p135em.C18489c;
import p142ey.C18644n;
import p207he.C20024r;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p304ks.C21920f;
import p304ks.C21927m;
import p326ll.C22511b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p349mj.C23320f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p369ns.AbstractC23933a;
import p379o3.C23999j;
import p379o3.C24003n;
import p392oh.C24261h;
import p394oj.C24277c;
import p394oj.C24279e;
import p405ov.C24559a;
import p449qi.C25290b;
import p455qo.C25409g;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p486rk.C25814a;
import p550ul.C27300f;
import p588vw.C28644j;
import p604wb.C28905e;
import p609wh.AbstractC29039u0;
import p641xd.C29578b;
import p641xd.C29583g;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p681yh.EnumC30982b;
import p716zh.C31832a;
import p716zh.C31843aa;
import p716zh.C31852b4;
import p716zh.C31862c;
import p716zh.C31937h;
import p716zh.C31976j8;
import p716zh.C31986k3;
import p716zh.C32035n7;
import p716zh.C32068pb;
import p716zh.C32078q7;
import p716zh.C32092r7;
import pm0.C24848g0;
import rh0.AbstractC25803k;
import tg.C26657h;
import tg.C26674y;
import tj.C26715g;
import v30.C27517h;
import vg.AbstractC28207v1;
import vg.C28020b3;
import vg.C28023b6;
import vg.C28203u6;
import ws.C29210k;

/* renamed from: wh.l0 */
/* loaded from: classes3.dex */
public final class C29021l0 implements C23744a.c {

    /* renamed from: A */
    static volatile C29021l0 f134346A;

    /* renamed from: B */
    static ThreadPoolExecutor f134347B;

    /* renamed from: q */
    private final C18980w f134349q;

    /* renamed from: r */
    private final C23320f f134350r;

    /* renamed from: s */
    private final C25814a f134351s;

    /* renamed from: t */
    private final C25290b f134352t;

    /* renamed from: u */
    private final C22511b f134353u;

    /* renamed from: v */
    private final C27300f f134354v;

    /* renamed from: w */
    private final C0872f f134355w;

    /* renamed from: x */
    private final C0876j f134356x;

    /* renamed from: y */
    private final InterfaceC23792b f134357y;

    /* renamed from: p */
    public final String f134348p = C29021l0.class.getSimpleName();

    /* renamed from: z */
    boolean f134358z = false;

    /* renamed from: wh.l0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f134359a;

        a(String str) {
            this.f134359a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42343ac(this.f134359a);
            C7960e.m41971c6().m42376e4(this.f134359a);
        }
    }

    /* renamed from: wh.l0$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C29021l0.this.f134358z = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C29021l0.this.f134358z = false;
        }
    }

    /* renamed from: wh.l0$c */
    /* loaded from: classes3.dex */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f134362a;

        static {
            int[] iArr = new int[EnumC30982b.values().length];
            f134362a = iArr;
            try {
                iArr[EnumC30982b.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: wh.l0$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        public String f134363a = "";

        /* renamed from: b */
        public String f134364b = "";

        /* renamed from: c */
        public int f134365c = 0;

        d() {
        }
    }

    C29021l0(C18980w c18980w, C23320f c23320f, C25814a c25814a, C25290b c25290b, C22511b c22511b, C27300f c27300f, C0872f c0872f, C0876j c0876j, InterfaceC23792b interfaceC23792b) {
        this.f134349q = c18980w;
        this.f134350r = c23320f;
        this.f134351s = c25814a;
        this.f134352t = c25290b;
        this.f134353u = c22511b;
        this.f134354v = c27300f;
        this.f134355w = c0872f;
        this.f134356x = c0876j;
        this.f134357y = interfaceC23792b;
        m144948g1();
        if (f134347B == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("ParseSocketConnection"));
            f134347B = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
    }

    /* renamed from: C0 */
    public /* synthetic */ void m144907C0(String str) {
        try {
            C7960e.m41971c6().m42136Gd(str, false);
            C28203u6 c28203u6 = C28203u6.f131407a;
            c28203u6.m141827z(str, false);
            ContactProfile m153138j = C21927m.m114302u().m114312J().m153138j(str);
            ContactProfile m98552o = C18644n.m98531l().m98552o(str);
            C18644n.m98531l().m98540I(str);
            c28203u6.m141804B(str, 0);
            if (m153138j == null && m98552o != null) {
                C7960e.m41971c6().m42221O7(m98552o, false);
            }
            C21927m.m114302u().m114350o0(str);
            if (C7960e.m41971c6().m42096D9(str)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                C21927m.m114302u().m114338i0(arrayList);
            }
            if (!AbstractC25495a.m132084i(str) && AbstractC21935u.m114515E(str) && this.f134355w.m2529X(str)) {
                C7959d.m41638d1().m41774b3(str, 2);
            }
            Map map = AbstractC23304d.f113421p;
            synchronized (map) {
                try {
                    if (map.containsKey(str)) {
                        C7960e.m41971c6().m42376e4(str);
                    }
                } finally {
                }
            }
            AbstractC21935u.m114533W(str, -1, "");
            AbstractC23059e9.m118317F(str);
            C21927m.m114302u().m114352p0(str);
            C7960e.m41971c6().m42099Dc(str);
            C18644n.m98524E();
            C19669z.f97569Q.set(false);
            C19669z.m103146Y().m103198O0();
            AbstractC23088h5.m118426g();
            C23744a.m124114c().m124116d(6078, new Object[0]);
            C21920f.m114270a().m114272c(str);
            C23744a.m124114c().m124116d(6201, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m144908D0() {
        try {
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67701oN();
            } else {
                C23744a.m124114c().m124116d(29, new Object[0]);
            }
            C23744a.m124114c().m124116d(119, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E0 */
    public /* synthetic */ void m144909E0(List list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                try {
                    C29012h c29012h = (C29012h) list.get(i11);
                    if (c29012h.m93278a() == 1710) {
                        arrayList.add(c29012h);
                    } else {
                        m145001R0(c29012h, true);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            if (!arrayList.isEmpty()) {
                m145003T0(arrayList);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: F0 */
    public static /* synthetic */ String m144910F0(RequestPacket requestPacket) {
        return "Reaction COMMAND_RESET_UNSEEN_REACTION " + requestPacket.mo93287i();
    }

    /* renamed from: G */
    private void m144911G(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("effectMetadata");
            if (optJSONObject != null) {
                C26674y.m136865t().m136875k(AbstractC18069a.m96089h(optJSONObject, "id"));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: G0 */
    public static /* synthetic */ String m144912G0(RequestPacket requestPacket) {
        return "Reaction COMMAND_RESET_UNSEEN_REACTION " + requestPacket.mo93287i();
    }

    /* renamed from: H */
    private void m144913H(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("sticker");
            if (optJSONObject != null) {
                int m96085d = AbstractC18069a.m96085d(optJSONObject, "id");
                int m96085d2 = AbstractC18069a.m96085d(optJSONObject, "catId");
                C25630b c25630b = new C25630b(m96085d, m96085d2, m96085d2, AbstractC18069a.m96085d(optJSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE), 0, "", "", "");
                c25630b.m132419b(C28644j.m143232X(), C28644j.m143248i0());
                C28020b3.f130648a.m141194i(c25630b);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: H0 */
    public /* synthetic */ void m144914H0(String str, RequestPacket requestPacket) {
        boolean z11;
        String str2 = CoreUtility.f89233i;
        if (requestPacket.m93278a() == 10211) {
            z11 = true;
        } else {
            z11 = false;
        }
        m144940c0(str, str2, z11);
    }

    /* renamed from: I0 */
    public /* synthetic */ void m144915I0(long j11) {
        try {
            byte[] m109223a = AbstractC20887g.m109223a(m144996L());
            if (m109223a.length > 64512) {
                return;
            }
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(m109223a.length));
            byteArrayOutputStream.write(m109223a);
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 91);
            requestPacket.m93275F((byte) 1);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public static synchronized C29021l0 m144916J() {
        C29021l0 c29021l0;
        synchronized (C29021l0.class) {
            try {
                if (f134346A == null) {
                    synchronized (C29021l0.class) {
                        try {
                            if (f134346A == null) {
                                f134346A = new C29021l0(AbstractC23306f.m120727y(), AbstractC23306f.m120580G(), AbstractC23306f.m120626V0(), AbstractC23306f.m120656e(), AbstractC23306f.m120588I1(), AbstractC23306f.m120671h2(), AbstractC23306f.m120562A(), AbstractC23306f.m120584H0(), AbstractC23306f.m120579F1());
                            }
                        } finally {
                        }
                    }
                }
                c29021l0 = f134346A;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29021l0;
    }

    /* renamed from: K0 */
    private void m144917K0(String str, long j11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String m96096o = AbstractC18069a.m96096o(str, "data", "");
            if (m96096o.isEmpty()) {
                return;
            }
            long m96094m = AbstractC18069a.m96094m(m96096o, "ts", 0L);
            if (m96094m > 0 && this.f134357y.mo124313h(m96094m, j11)) {
                C24559a.m127933c("[RenewTime]", "ParseRPSocketConnection");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: M */
    private void m144918M(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                C32078q7 c32078q7 = new C32078q7(jSONObject);
                if (c32078q7.m154760p() == 1) {
                    m144956j1(jSONObject);
                }
                int i11 = c32078q7.f147763c0;
                m144953i1(c32078q7);
                String m154755f = c32078q7.m154755f();
                String m154754a = c32078q7.m154754a();
                if (!TextUtils.isEmpty(m154755f)) {
                    Bundle m141849A2 = AbstractC28207v1.m141849A2(m154755f, 1, m154754a);
                    m141849A2.putString("notificationId", String.valueOf(c32078q7.m154769z()));
                    C28023b6.m141250h0().m141309Q1(i11, "zalo_video", String.valueOf(c32078q7.m154769z()), c32078q7.m154765v().toString(), c32078q7.m154740C(), AbstractC23152n3.m119026V("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT.ACTION_LIST", m141849A2));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: N */
    private void m144919N(List list) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: wh.z

            /* renamed from: p */
            public final /* synthetic */ List f134543p;

            /* renamed from: q */
            public final /* synthetic */ C23528a f134544q;

            /* renamed from: r */
            public final /* synthetic */ List f134545r;

            public /* synthetic */ RunnableC29045z(List list2, C23528a c23528a, List list3) {
                r1 = list2;
                r2 = c23528a;
                r3 = list3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.m144964n0(r1, r2, r3);
            }
        });
    }

    /* renamed from: O */
    private void m144920O(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            C24559a.m127933c("[E2EE]", "parsePacket: 10115 - " + str2);
            JSONObject jSONObject = new JSONObject(str2);
            C31986k3.f147083a.m154142r2(str, jSONObject.optInt("uid"), jSONObject.optLong("ts"));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: P */
    private void m144921P(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("uid");
            int optInt2 = jSONObject.optInt("deviceId");
            long optLong = jSONObject.optLong("ts");
            C24559a.m127933c("[E2EE]", "Received 10218 | " + optInt + "-" + optInt2);
            JSONArray jSONArray = jSONObject.getJSONArray("groupIds");
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i11)));
            }
            C31986k3.f147083a.m154126e2(str2, optInt, optInt2, optLong, arrayList);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: P0 */
    private C3027q2 m144922P0(String str, String str2, String str3) {
        String[] split;
        try {
            Matcher matcher = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(str);
            String str4 = "";
            String str5 = str4;
            while (matcher.find()) {
                String group = matcher.group(0);
                if (!TextUtils.isEmpty(group) && !TextUtils.isEmpty(str2) && group.startsWith(str2)) {
                    Matcher matcher2 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                    if (matcher2.find()) {
                        String group2 = matcher2.group(1);
                        if (!TextUtils.isEmpty(group2) && (split = group2.replace("\"", "").replace(str3, "").split("/")) != null && split.length > 0) {
                            str5 = split[0];
                            str4 = split[1];
                        }
                    }
                }
            }
            return new C3027q2(str4, str5);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: Q */
    private void m144923Q(String str) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("uid");
            int optInt2 = jSONObject.optInt("deviceId");
            long optLong = jSONObject.optLong("ts");
            if (jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C31986k3.f147083a.m154144t2(optInt, optInt2, z11, optLong);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Q0 */
    private String m144924Q0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        if (jSONObject != null) {
            try {
                if (m144950h1(Integer.valueOf(jSONObject.optInt("appId"))) && (optJSONObject = jSONObject.optJSONObject("attached")) != null && (optJSONArray = optJSONObject.optJSONArray("items")) != null && optJSONArray.length() > 0 && (optJSONObject2 = optJSONArray.optJSONObject(0)) != null) {
                    String optString = optJSONObject2.optString("thumb");
                    if (optString == null) {
                        return "";
                    }
                    return optString;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: R */
    private void m144925R(String str, String str2) {
        List list;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int optInt = jSONObject.optInt("uid");
            String valueOf = String.valueOf(optInt);
            int optInt2 = jSONObject.optInt("deviceId", -1);
            long optLong = jSONObject.optLong("ts");
            JSONArray optJSONArray = jSONObject.optJSONArray("subDevice");
            if (optJSONArray != null) {
                list = AbstractC18069a.m96092k(optJSONArray);
            } else {
                list = null;
            }
            List list2 = list;
            String optString = jSONObject.optString("initData");
            int optInt3 = jSONObject.optInt("error_code");
            C24559a.m127933c("[E2EE]", "parsePacket 10102 type COM: uid=" + optInt + " deviceId=" + optInt2 + " subDevice=" + optJSONArray + " ts=" + optLong + " error_code=" + optInt3);
            C31986k3.f147083a.m154131j2(str, valueOf, optInt, optInt2, list2, optLong, optInt3, optString);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: S */
    private void m144926S(RequestPacket requestPacket) {
        boolean z11;
        String str = CoreUtility.f89233i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String mo93287i = requestPacket.mo93287i();
            if (TextUtils.isEmpty(mo93287i)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(mo93287i);
            C24559a.m127933c("[E2EE]", "Received 10117");
            long optLong = jSONObject.optLong("lastMsgId");
            boolean z12 = true;
            if (jSONObject.optInt("hasMore") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (jSONObject.optInt("evict") != 1) {
                z12 = false;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                int optInt = jSONObject2.optInt("cmd");
                String str2 = new String(C29628e.m147249E0().m93393U(AbstractC19509c.m101978a(jSONObject2.optString("data")), jSONObject2.optInt("sid"), Integer.parseInt(str), optInt, jSONObject2.optInt("subCmd"), jSONObject2.optLong("gid")), StandardCharsets.UTF_8);
                if (optInt == 10106) {
                    m144923Q(str2);
                } else if (optInt == 10111) {
                    m144940c0(str2, str, false);
                } else if (optInt == 10115) {
                    m144920O(str, str2);
                } else if (optInt == 10107) {
                    C24559a.m127933c("E2EE", "Receive " + optInt);
                } else if (optInt == 10102) {
                    m144925R(str, str2);
                } else if (optInt == 10103) {
                    m144927T(str, str2);
                } else {
                    C24559a.m127933c("E2EE", "Receive 10117 | CMD not implemented: " + optInt);
                }
            }
            if (z11) {
                C29628e.m147249E0().m147284m1(false, optLong, requestPacket.m93293o());
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("nextQueue");
            if (optJSONObject != null) {
                int optInt2 = optJSONObject.optInt("nextCmd", requestPacket.m93278a());
                int optInt3 = optJSONObject.optInt("nextSubCmd", requestPacket.m93293o());
                if (optInt2 == requestPacket.m93278a()) {
                    C29628e.m147249E0().m147284m1(false, optLong, (byte) optInt3);
                    return;
                }
                return;
            }
            if (z12) {
                C31986k3.f147083a.m154128g2(CoreUtility.f89233i);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: T */
    private void m144927T(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            C24559a.m127933c("[E2EE]", "parsePacket: 10103 - " + str2);
            JSONObject jSONObject = new JSONObject(str2);
            int optInt = jSONObject.optInt("uid");
            C31986k3.f147083a.m154134m2(str, String.valueOf(optInt), optInt, jSONObject.optInt("deviceId", -1), jSONObject.optLong("ts"), jSONObject.optInt("error_code"));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: U */
    private void m144928U(RequestPacket requestPacket) {
        boolean z11;
        boolean z12;
        C31986k3.f147083a.m154102N2(true);
        String str = CoreUtility.f89233i;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String mo93287i = requestPacket.mo93287i();
            if (TextUtils.isEmpty(mo93287i)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(mo93287i);
            C24559a.m127933c("[E2EE]", "received 10202");
            long optLong = jSONObject.optLong("lastMsgId");
            if (jSONObject.optInt("hasMore") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (jSONObject.optInt("evict") == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("data");
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                int optInt = jSONObject2.optInt("cmd");
                int optInt2 = jSONObject2.optInt("subCmd");
                int optInt3 = jSONObject2.optInt("sid");
                String str2 = new String(C29628e.m147249E0().m93392T(AbstractC19509c.m101978a(jSONObject2.optString("data")), optInt3, Integer.parseInt(str), optInt, optInt2, jSONObject2.optLong("gid")), StandardCharsets.UTF_8);
                if (optInt == 10201) {
                    m144942d0(str2, str, optInt2);
                } else if (optInt == 10217) {
                    m144944e0(str2, str, optInt3);
                } else if (optInt == 10218) {
                    m144921P(str2, str);
                } else if (optInt == 10211) {
                    C24559a.m127933c("[E2EE]", "received 10202 | cmd = 10211 | params: " + str2);
                    m144940c0(str2, str, true);
                } else {
                    C24559a.m127933c("E2EE", "Receive 10202 with cmd that has not been implemented yet: " + optInt);
                }
            }
            if (z11) {
                C29628e.m147249E0().m147284m1(true, optLong, (byte) 0);
                return;
            }
            if (z12) {
                C31986k3.f147083a.m154130h2(CoreUtility.f89233i);
            }
            C31986k3.f147083a.m154102N2(false);
            C29628e.m147249E0().m147282k1(10209, 0, 0L);
        } catch (Exception e11) {
            C31986k3.f147083a.m154102N2(false);
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: V */
    private void m144929V(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("effectMetadata");
            if (optJSONObject != null) {
                String m96089h = AbstractC18069a.m96089h(optJSONObject, "id");
                C26674y.m136865t().m136875k(m96089h);
                C7960e.m41971c6().m42294V7(m96089h, optJSONObject.toString());
                C26674y.m136865t().m136874j(m96089h, new C26657h(optJSONObject));
                C26674y.m136865t().m136877n(m96089h, System.currentTimeMillis() + "", null, (byte) 7);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: V0 */
    private void m144930V0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String optString;
        String optString2;
        ContactProfile m141810d;
        int i11;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("msg");
            int length = jSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i12).getJSONObject("text");
                    String string = jSONObject3.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    jSONObject2 = jSONObject3.getJSONObject("data");
                    optString = jSONObject2.optString("to");
                    optString2 = jSONObject2.optString("fromU");
                    String optString3 = jSONObject2.optString("fromD");
                    String optString4 = jSONObject2.optString("fromA");
                    if (CoreUtility.f89233i.equals(optString2)) {
                        m141810d = AbstractC23304d.f113368c0;
                    } else {
                        m141810d = C28203u6.f131407a.m141810d(optString2, new TrackingSource((short) 1014));
                    }
                    if (m141810d == null) {
                        m141810d = new ContactProfile(optString2);
                        if (optString4 == null) {
                            optString4 = "";
                        }
                        m141810d.f42446v = optString4;
                        if (optString3 == null) {
                            optString3 = "";
                        }
                        m141810d.f42437s = optString3;
                    }
                    if (string.equals("heart")) {
                        i11 = 0;
                    } else if (string.equals("emoji")) {
                        i11 = 1;
                    } else if (string.equals("buzz")) {
                        i11 = 2;
                    } else if (string.equals("killemoji")) {
                        i11 = 3;
                    } else if (string.equals("winballoongame")) {
                        i11 = 4;
                    } else {
                        i11 = -1;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (i11 == -1) {
                    return;
                }
                JSONObject jSONObject4 = jSONObject2.getJSONObject("attach");
                if (jSONObject4 != null) {
                    String optString5 = jSONObject4.optString("emoji");
                    int optInt = jSONObject4.optInt("size", 100);
                    int optInt2 = jSONObject4.optInt("buzzTime");
                    C24277c c24277c = new C24277c();
                    c24277c.f117240a = i11;
                    c24277c.f117241b = optString5;
                    c24277c.f117243d = optInt;
                    c24277c.f117244e = optInt2;
                    c24277c.f117245f = "" + jSONObject2.optLong("cliMsgId");
                    if (i11 == 4) {
                        c24277c.f117246g = optString2;
                    }
                    if (!optString2.equals(CoreUtility.f89233i)) {
                        optString = optString2;
                    }
                    C20024r.m103937c().m103956u(optString, c24277c, m141810d);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: W */
    private void m144931W(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("sticker");
            if (optJSONObject != null) {
                int m96085d = AbstractC18069a.m96085d(optJSONObject, "id");
                int m96085d2 = AbstractC18069a.m96085d(optJSONObject, "catId");
                int m96085d3 = AbstractC18069a.m96085d(optJSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                String optString = optJSONObject.optString("jpegFss");
                C25630b c25630b = new C25630b(m96085d, m96085d2, m96085d2, m96085d3, 0, "", "", "");
                c25630b.m132419b(C28644j.m143232X(), C28644j.m143248i0());
                C28020b3 c28020b3 = C28020b3.f130648a;
                c28020b3.m141194i(c25630b);
                C23528a c23528a = new C23528a(MainApplication.getAppContext());
                c28020b3.m141182F(new C3977j(MainApplication.getAppContext()), c23528a, c25630b, null, false, null);
                if (!optString.isEmpty()) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: wh.b0

                        /* renamed from: q */
                        public final /* synthetic */ String f134286q;

                        public /* synthetic */ RunnableC29001b0(String optString2) {
                            r2 = optString2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C29021l0.m144966o0(C23528a.this, r2);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: W0 */
    private void m144932W0(JSONObject jSONObject, boolean z11) {
        JSONObject jSONObject2;
        String optString;
        String optString2;
        ContactProfile m141809c;
        int i11;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("msg");
            int length = jSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i12).getJSONObject("text");
                    String string = jSONObject3.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    jSONObject2 = jSONObject3.getJSONObject("data");
                    optString = jSONObject2.optString("to");
                    optString2 = jSONObject2.optString("fromU");
                    String optString3 = jSONObject2.optString("fromD");
                    String optString4 = jSONObject2.optString("fromA");
                    if (CoreUtility.f89233i.equals(optString2)) {
                        m141809c = AbstractC23304d.f113368c0;
                    } else {
                        m141809c = C28203u6.f131407a.m141809c(optString2);
                    }
                    if (m141809c == null) {
                        m141809c = new ContactProfile(optString2);
                        if (optString4 == null) {
                            optString4 = "";
                        }
                        m141809c.f42446v = optString4;
                        if (optString3 == null) {
                            optString3 = "";
                        }
                        m141809c.f42437s = optString3;
                    }
                    if (string.equals("heart")) {
                        i11 = 0;
                    } else if (string.equals("emoji")) {
                        i11 = 1;
                    } else if (string.equals("buzz")) {
                        i11 = 2;
                    } else if (string.equals("killemoji")) {
                        i11 = 3;
                    } else if (string.equals("winballoongame")) {
                        i11 = 4;
                    } else {
                        i11 = -1;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (i11 == -1) {
                    return;
                }
                JSONObject jSONObject4 = jSONObject2.getJSONObject("attach");
                if (jSONObject4 != null) {
                    String optString5 = jSONObject4.optString("emoji");
                    int optInt = jSONObject4.optInt("size", 100);
                    int optInt2 = jSONObject4.optInt("buzzTime");
                    C24277c c24277c = new C24277c();
                    c24277c.f117240a = i11;
                    c24277c.f117241b = optString5;
                    c24277c.f117243d = optInt;
                    c24277c.f117244e = optInt2;
                    c24277c.f117245f = "" + jSONObject2.optLong("cliMsgId");
                    if (i11 == 4) {
                        c24277c.f117246g = optString2;
                    }
                    if (z11) {
                        optString = "group_" + optString;
                    } else if (!optString2.equals(CoreUtility.f89233i)) {
                        optString = optString2;
                    }
                    C23744a.m124114c().m124116d(63, optString, c24277c, m141809c);
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: X */
    private void m144933X(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("config_zalo_video");
        if (optJSONObject != null) {
            if (optJSONObject.optInt("action", 0) == 0) {
                AbstractC0924m0.m3967kl(true);
                AbstractC0924m0.m2911Aj(0L);
                C23744a.m124114c().m124116d(6081, new Object[0]);
                return;
            }
            C24559a.m127933c(this.f134348p, "CMD 600 notify type 161 | Action has not implemented yet");
        }
    }

    /* renamed from: Y */
    private void m144934Y(JSONObject jSONObject) {
        if (jSONObject.has("refresh_timeline")) {
            m144946f0(jSONObject.optInt("refresh_timeline"));
        }
        if (jSONObject.has("clear_thumb")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("clear_thumb");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    arrayList.add(optJSONArray.optString(i11, ""));
                }
            }
            m144919N(arrayList);
        }
        if (jSONObject.has("refresh_video_channel")) {
            boolean z11 = true;
            if (jSONObject.optInt("refresh_video_channel", 0) != 1) {
                z11 = false;
            }
            AbstractC0924m0.m3997ll(z11);
            C23744a.m124114c().m124116d(6083, new Object[0]);
        }
    }

    /* renamed from: a0 */
    private void m144936a0(JSONObject jSONObject) {
        int i11;
        if (jSONObject != null) {
            long mo124314i = AbstractC23306f.m120579F1().mo124314i();
            long optLong = jSONObject.optLong("startTime");
            long optLong2 = jSONObject.optLong("endTime");
            String optString = jSONObject.optString("getLink");
            String optString2 = jSONObject.optString("postLink");
            String optString3 = jSONObject.optString("checksum_zip");
            String optString4 = jSONObject.optString("checksum_folder");
            if (optLong2 > 0 && mo124314i >= optLong && mo124314i <= optLong2) {
                if (optString.isEmpty()) {
                    i11 = -6;
                } else if (optString2.isEmpty()) {
                    i11 = -7;
                } else if (optString3.isEmpty()) {
                    i11 = -8;
                } else if (optString4.isEmpty()) {
                    i11 = -9;
                } else {
                    i11 = 0;
                }
            } else {
                i11 = -5;
            }
            C27517h.m140671J().m140699C(AbstractC23309i.m122637z1() + optString, C18489c.m97849k(C7962g.c.a.API_ZALOAPP) + optString2, optString3, optString4, i11);
        }
    }

    /* renamed from: b0 */
    private void m144938b0(JSONObject jSONObject) {
        if (jSONObject != null) {
            int m96085d = AbstractC18069a.m96085d(jSONObject, "action");
            if (m96085d == 0) {
                m144913H(jSONObject);
                m144911G(jSONObject);
            } else if (m96085d == 1) {
                m144931W(jSONObject);
                m144929V(jSONObject);
            }
        }
    }

    /* renamed from: c0 */
    private void m144940c0(String str, String str2, boolean z11) {
        int i11;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("threadId");
                if (z11) {
                    optString = AbstractC25495a.m132076a(optString);
                }
                String str3 = optString;
                String optString2 = jSONObject.optString("uid");
                long optLong = jSONObject.optLong("ts");
                if (str2.equals(optString2)) {
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                C31986k3.f147083a.m154107R0(str2, str3, i11, optLong);
            }
        } catch (JSONException e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: d0 */
    private void m144942d0(String str, String str2, int i11) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C24559a.m127933c("[E2EE]", "received 10201: " + str);
                JSONObject jSONObject = new JSONObject(str);
                C31986k3.f147083a.m154139p2(str2, "group_" + jSONObject.optInt("groupId"), jSONObject.optInt("uid"), jSONObject.optInt("deviceId"), jSONObject.optLong("ts"), jSONObject.optInt("error_code"), i11);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: e0 */
    private void m144944e0(String str, String str2, int i11) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C24559a.m127933c("[E2EE]", "received packet 10217: " + str);
                JSONObject jSONObject = new JSONObject(str);
                C31986k3.f147083a.m154147w2(str2, "group_" + jSONObject.optInt("groupId"), i11, jSONObject.optInt("fromDI"), jSONObject.optLong("ts"), jSONObject.optInt("err"));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: f0 */
    private void m144946f0(int i11) {
        if (i11 == 0) {
            new C25409g().m101509a(C24848g0.f119245a);
        } else if (i11 == 1) {
            new C25409g().m101509a(C24848g0.f119245a);
            C23744a.m124114c().m124116d(6082, new Object[0]);
        }
    }

    /* renamed from: g1 */
    private void m144948g1() {
        C23744a.m124114c().m124115b(this, 73);
    }

    /* renamed from: h1 */
    private boolean m144950h1(Integer num) {
        if (num.intValue() != 125 && num.intValue() != 126) {
            return false;
        }
        return true;
    }

    /* renamed from: i0 */
    private static boolean m144952i0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return new C31862c(jSONObject).m153156i();
    }

    /* renamed from: i1 */
    private void m144953i1(C32078q7 c32078q7) {
        if (c32078q7 != null && TextUtils.isEmpty(c32078q7.m154764u())) {
            String str = "";
            try {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(c32078q7.m154744G());
                if (m141809c != null) {
                    str = m141809c.f42446v;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            c32078q7.m154753P(str);
        }
    }

    /* renamed from: j0 */
    public /* synthetic */ void m144955j0(int i11, JSONObject jSONObject, int i12) {
        this.f134349q.m99606S(CoreUtility.f89233i, i11, -1, jSONObject, i12, true, C18980w.b.f94750q);
    }

    /* renamed from: j1 */
    private void m144956j1(JSONObject jSONObject) {
        try {
            C32092r7 c32092r7 = new C32092r7(jSONObject);
            if (c32092r7.m154842b() != -1 && !C7960e.m41971c6().m42205Md(c32092r7)) {
                return;
            }
            C7960e.m41971c6().m42582x8(c32092r7);
            AbstractC20833z.m108894I();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k0 */
    public /* synthetic */ void m144958k0(String str, int i11, int i12, JSONObject jSONObject, int i13, boolean z11) {
        this.f134349q.m99606S(str, i11, i12, jSONObject, i13, z11, C18980w.b.f94749p);
    }

    /* renamed from: l0 */
    public /* synthetic */ void m144960l0(int i11, int i12, JSONObject jSONObject, int i13) {
        this.f134349q.m99608a0(i11, i12, jSONObject, i13);
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m144964n0(List list, C23528a c23528a, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            File m123603i = c23528a.m123603i(str);
            if (m123603i != null && m123603i.exists()) {
                m123603i.delete();
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C24003n c24003n = (C24003n) it2.next();
                C23999j.m125710U1(str, c24003n.f116260a, c24003n.f116266g);
            }
        }
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m144966o0(C23528a c23528a, String str) {
        File m123603i = c23528a.m123603i(str);
        if (m123603i != null && m123603i.exists()) {
            m123603i.delete();
        }
        C23999j.m125710U1(str, C23278z2.m120068F().f116260a, C23278z2.m120068F().f116266g);
        ((C23528a) c23528a.m123612r(new C3977j(MainApplication.getAppContext()))).m123580D(str, false, true, C23278z2.m120068F().f116260a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* renamed from: p0 */
    public static /* synthetic */ void m144968p0(JSONObject jSONObject, long j11, int i11) {
        String string;
        int i12;
        String string2;
        String string3;
        String string4;
        String string5;
        int i13;
        String str;
        long j12;
        int i14;
        int i15;
        ?? r7;
        long j13;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            if (jSONObject2.isNull("phone")) {
                string = "";
            } else {
                string = jSONObject2.getString("phone");
            }
            if (jSONObject2.isNull("origin")) {
                i12 = 1000;
            } else {
                i12 = jSONObject2.getInt("origin");
            }
            if (jSONObject2.isNull("uid")) {
                string2 = "";
            } else {
                string2 = jSONObject2.getString("uid");
            }
            if (jSONObject2.isNull("usr")) {
                string3 = "";
            } else {
                string3 = jSONObject2.getString("usr");
            }
            if (jSONObject2.isNull("avt")) {
                string4 = "";
            } else {
                string4 = jSONObject2.getString("avt");
            }
            if (jSONObject2.isNull("dpn")) {
                string5 = "";
            } else {
                string5 = jSONObject2.getString("dpn");
            }
            if (!jSONObject2.isNull("notify")) {
                i13 = jSONObject2.getInt("notify");
            } else {
                i13 = 1;
            }
            String optString = jSONObject2.optString("uname");
            int optInt = jSONObject2.optInt("account_type", 0);
            JSONObject optJSONObject = jSONObject2.optJSONObject("business_account");
            if (optJSONObject == null) {
                str = "";
            } else {
                str = optJSONObject.toString();
            }
            if (!jSONObject2.isNull("dob")) {
                j12 = jSONObject2.getInt("dob");
            } else {
                j12 = 0;
            }
            ContactProfile contactProfile = new ContactProfile(string2);
            contactProfile.f42446v = string4;
            contactProfile.f42443u = string3;
            contactProfile.f42437s = string5;
            contactProfile.f42455y = string;
            contactProfile.f42382U0 = 1;
            contactProfile.f42404d0 = i12;
            contactProfile.f42460z1 = optString;
            contactProfile.f42361N0 = optInt;
            contactProfile.f42364O0 = str;
            contactProfile.f42400b0 = j12;
            ContactProfile contactProfile2 = new ContactProfile(string2);
            contactProfile2.f42446v = string4;
            contactProfile2.f42443u = string3;
            contactProfile2.f42437s = string5;
            contactProfile2.f42455y = string;
            contactProfile2.f42404d0 = i12;
            contactProfile2.f42382U0 = 1;
            contactProfile2.f42388W0 = i13;
            contactProfile2.f42460z1 = optString;
            contactProfile2.f42361N0 = optInt;
            contactProfile2.f42364O0 = str;
            if (AbstractC23309i.m120892E7().equals(string2)) {
                C28023b6.m141222A();
            }
            if (!AbstractC21935u.m114513C(string2)) {
                int size = C21927m.m114302u().m114367y().size() - 5;
                String m121820d8 = AbstractC23309i.m121820d8();
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(m121820d8)) {
                    arrayList = new ArrayList(Arrays.asList(TextUtils.split(m121820d8, ",")));
                }
                if (size > 0 && !ZaloListView.m86977gN()) {
                    r7 = 1;
                    for (int size2 = C21927m.m114302u().m114367y().size() - 1; size2 >= 0; size2--) {
                        if (size2 >= 0 && size2 < size) {
                            String m154511b = ((C32035n7) C21927m.m114302u().m114367y().get(size2)).m154511b();
                            C21927m.m114302u().m114367y().remove(size2);
                            if (arrayList.contains(m154511b)) {
                                arrayList.remove(m154511b);
                                int i16 = AbstractC23304d.f113341W;
                                if (i16 > 0) {
                                    AbstractC23304d.f113341W = i16 - 1;
                                }
                            }
                        }
                    }
                } else {
                    r7 = 1;
                }
                arrayList.add(string2);
                if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.m125958k().m125972p() && (MainTabView.m67645lM() instanceof MainTabView) && (MainTabView.m67645lM().m92676n2().mo35579p().m93012K0() instanceof MainTabView) && AbstractC23349d.m122770h() && !AbstractC23174p3.m119378c()) {
                    j13 = System.currentTimeMillis();
                } else {
                    j13 = 0;
                }
                C21927m.m114302u().m114367y().add(new C32035n7(string2, j13, 0L));
                long j14 = AbstractC23304d.f113349Y;
                if (j14 == 0 || (j13 > 0 && j14 > j13)) {
                    AbstractC23304d.f113349Y = j13;
                }
                AbstractC23304d.f113341W += r7;
                AbstractC23304d.f113337V = r7;
                C21927m.m114302u().m114370z0();
                AbstractC23309i.m122370ru(MainApplication.getAppContext(), AbstractC23304d.f113341W);
                AbstractC23309i.m120913Es(TextUtils.join(",", arrayList));
                AbstractC0924m0.m3693bh(r7);
                AbstractC23059e9.m118317F(string2);
                if (C21927m.m114302u().m114369z() != null) {
                    if (C21927m.m114302u().m114369z().size() >= 3) {
                        i14 = 0;
                        C21927m.m114302u().m114369z().remove(0);
                        C21927m.m114302u().m114369z().add(contactProfile2);
                        i15 = r7;
                    } else {
                        i14 = 0;
                        C21927m.m114302u().m114369z().add(contactProfile2);
                        i15 = r7;
                    }
                } else {
                    i14 = 0;
                    i15 = r7;
                }
            } else {
                i14 = 0;
                i15 = 1;
            }
            C21927m.m114302u().m114341k(contactProfile);
            if (C21927m.m114302u().m114312J() != null && C21927m.m114302u().m114312J().m153137g(string2)) {
                C7960e.m41971c6().m42335Zd("contact_profile_block", string2, i15);
            }
            contactProfile.f42374R1 = j11;
            contactProfile.f42377S1 = i11;
            C18644n.m98531l().m98543e(contactProfile);
            C7960e.m41971c6().m42234Pb(contactProfile.f42434r);
            C7960e.m41971c6().m42136Gd(string2, i15);
            C28203u6 c28203u6 = C28203u6.f131407a;
            c28203u6.m141827z(string2, i15);
            c28203u6.m141825x(string2, i15);
            AbstractC21935u.m114533W(string2, 3, "");
            C18644n.m98524E();
            C7959d.m41638d1().m41774b3(string2, i15);
            C19669z.m103146Y().m103198O0();
            AbstractC23088h5.m118426g();
            C23744a m124114c = C23744a.m124114c();
            Object[] objArr = new Object[i15];
            objArr[i14] = string2;
            m124114c.m124116d(6091, objArr);
            C21927m.m114302u().m114352p0(string2);
            C0843s0.m2286r().m2288C(jSONObject);
            AbstractC23063f2.m118363o(string2);
            AbstractC23063f2.m118364p(string2);
            C21920f.m114270a().m114271b(string2);
            C23744a.m124114c().m124116d(6078, new Object[i14]);
            C23744a.m124114c().m124116d(6001, new Object[i14]);
            C23744a.m124114c().m124116d(6200, new Object[i14]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m144970q0(C17945a0 c17945a0) {
        C7956b.m41474B().m41556r0(c17945a0, CoreUtility.f89233i);
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m144972r0(C17945a0 c17945a0, String str) {
        C24559a.m127933c("E2EE", "handleReportFailedMessage all sent failed | Send non E2EE message | " + c17945a0.m95029V3());
        c17945a0.m95289wa(null);
        C7956b.m41474B().m41556r0(c17945a0, str);
        C7959d.m41638d1().m41758W1(c17945a0);
        C0814e0.m2056b(c17945a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:3:0x0004, B:6:0x002c, B:8:0x0059, B:12:0x0060, B:14:0x0074, B:16:0x007b, B:18:0x0081, B:22:0x0094, B:26:0x00a5, B:28:0x00ab, B:31:0x00d7, B:34:0x00e2, B:37:0x0110, B:39:0x0124, B:46:0x0131, B:47:0x0144, B:50:0x0150, B:52:0x0156, B:54:0x015c, B:55:0x0174, B:57:0x017a, B:58:0x0191, B:60:0x01b0, B:63:0x01be, B:65:0x020d, B:68:0x01d8, B:70:0x01df, B:72:0x01ec, B:74:0x01f4, B:75:0x020a, B:77:0x0039, B:79:0x0040), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:3:0x0004, B:6:0x002c, B:8:0x0059, B:12:0x0060, B:14:0x0074, B:16:0x007b, B:18:0x0081, B:22:0x0094, B:26:0x00a5, B:28:0x00ab, B:31:0x00d7, B:34:0x00e2, B:37:0x0110, B:39:0x0124, B:46:0x0131, B:47:0x0144, B:50:0x0150, B:52:0x0156, B:54:0x015c, B:55:0x0174, B:57:0x017a, B:58:0x0191, B:60:0x01b0, B:63:0x01be, B:65:0x020d, B:68:0x01d8, B:70:0x01df, B:72:0x01ec, B:74:0x01f4, B:75:0x020a, B:77:0x0039, B:79:0x0040), top: B:2:0x0004 }] */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m144974s0(boolean z11, RequestPacket requestPacket) {
        String str;
        boolean z12;
        C17945a0 m2635r;
        JSONObject optJSONObject;
        String str2;
        boolean z13;
        int i11;
        String str3;
        try {
            C24559a.m127933c("[E2EE]", "handleReportFailedMessage: " + z11);
            String valueOf = String.valueOf(requestPacket.m93279b());
            String str4 = "";
            if (requestPacket.m93292n() == 3) {
                str = String.valueOf(requestPacket.m93291m());
            } else if (requestPacket.m93292n() != 6) {
                str = "";
            } else {
                str = "group_" + requestPacket.m93291m();
                z12 = true;
                if (str.isEmpty() && (m2635r = this.f134356x.m2635r(MessageId.m41038e(String.valueOf(requestPacket.m93282e()), "", str, valueOf))) != null) {
                    String mo93287i = requestPacket.mo93287i();
                    int i12 = 2;
                    if (!z11) {
                        if (!TextUtils.isEmpty(mo93287i)) {
                            JSONObject jSONObject = new JSONObject(mo93287i);
                            JSONArray optJSONArray = jSONObject.optJSONArray("unsupports");
                            if (optJSONArray != null) {
                                if (!z12) {
                                    int i13 = -1;
                                    if (jSONObject.optInt("err") == -1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    boolean z14 = false;
                                    int i14 = -1;
                                    int i15 = 0;
                                    boolean z15 = false;
                                    while (i15 < optJSONArray.length()) {
                                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i15);
                                        String optString = jSONObject2.optString("uid");
                                        int optInt = jSONObject2.optInt("deviceId", i13);
                                        boolean equals = TextUtils.equals(optString, CoreUtility.f89233i);
                                        boolean m153284z = m2635r.m95184l3().m153284z(C31852b4.Companion.m153130d(optInt, equals), i12);
                                        if (!equals) {
                                            i11 = optInt;
                                            str4 = optString;
                                        } else {
                                            i11 = i14;
                                        }
                                        if (!AbstractC25495a.m132079d(str)) {
                                            str3 = "1";
                                        } else {
                                            str3 = "2";
                                        }
                                        int i16 = i15;
                                        JSONArray jSONArray = optJSONArray;
                                        C2544s.m12803r(str, optString, optString, optInt, m2635r.m94846A4(), str3, AbstractC2531f0.e.f10297b, m2635r.m95029V3().m41045i(), -1);
                                        if (z13 && !z15) {
                                            C31986k3.f147083a.m154144t2(Integer.parseInt(optString), optInt, true, m2635r.m94974P4());
                                            z15 = true;
                                        }
                                        i15 = i16 + 1;
                                        z14 = m153284z;
                                        i14 = i11;
                                        optJSONArray = jSONArray;
                                        i13 = -1;
                                        i12 = 2;
                                    }
                                    if (z14) {
                                        C23288a.f113033a.mo13474a(new C18427b(m2635r.mo95039W2(), new Runnable() { // from class: wh.x
                                            public /* synthetic */ RunnableC29043x() {
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C29021l0.m144970q0(C17945a0.this);
                                            }
                                        }));
                                    }
                                    if (m2635r.m95184l3().m153275p()) {
                                        if (z13) {
                                            if (AbstractC0924m0.m3190K8() && !TextUtils.isEmpty(str4)) {
                                                C23744a.m124114c().m124116d(154, str, str4, Integer.valueOf(i14));
                                            } else if (AbstractC0924m0.m3452T9()) {
                                                C23288a.f113033a.mo13474a(new C18427b(m2635r.mo95039W2(), new Runnable() { // from class: wh.y

                                                    /* renamed from: q */
                                                    public final /* synthetic */ String f134542q;

                                                    public /* synthetic */ RunnableC29044y(String str5) {
                                                        r2 = str5;
                                                    }

                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C29021l0.m144972r0(C17945a0.this, r2);
                                                    }
                                                }));
                                            }
                                        }
                                        C24559a.m127933c("E2EE", "handleReportFailedMessage all sent failed | Set message FAILED | " + m2635r.m95029V3());
                                        C0814e0.m2071q(m2635r, null);
                                    }
                                }
                            } else {
                                C0814e0.m2071q(m2635r, mo93287i);
                                if (!AbstractC25495a.m132079d(str)) {
                                    str2 = "1";
                                } else {
                                    str2 = "2";
                                }
                                C2544s.m12803r(str, "", "", -1, m2635r.m94846A4(), str2, AbstractC2531f0.e.f10297b, m2635r.m95029V3().m41045i(), -1);
                            }
                        }
                    } else {
                        if (!TextUtils.isEmpty(mo93287i)) {
                            JSONObject jSONObject3 = new JSONObject(mo93287i);
                            if (jSONObject3.optInt("reason", 0) == 2 && (optJSONObject = jSONObject3.optJSONObject("reason_data")) != null) {
                                C29583g.f136521a.m146998k(new C29578b(str, optJSONObject.optInt("blockType"), optJSONObject.optLong("expiredTime")));
                            }
                        }
                        C0814e0.m2071q(m2635r, mo93287i);
                    }
                    C23744a.m124114c().m124116d(4, new Object[0]);
                }
                return;
            }
            z12 = false;
            if (str.isEmpty()) {
                return;
            }
            String mo93287i2 = requestPacket.mo93287i();
            int i122 = 2;
            if (!z11) {
            }
            C23744a.m124114c().m124116d(4, new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f134348p, e11);
        }
    }

    /* renamed from: t0 */
    public /* synthetic */ void m144976t0(JSONObject jSONObject) {
        int i11;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("parseHttpFailedOverData: ");
            sb2.append(jSONObject.toString());
            if (jSONObject.has("data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                boolean z11 = true;
                if (jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) != 1) {
                    z11 = false;
                }
                if (jSONObject2.has("deliver")) {
                    try {
                        C31832a c31832a = new C31832a(jSONObject2.getJSONObject("deliver"), false);
                        this.f134349q.m99609o0(c31832a);
                        C29628e.m147249E0().m147275d1(c31832a, z11);
                        if (c31832a.m152944a().size() > 0) {
                            AbstractC23304d.m120554y();
                            AbstractC20887g.m109245w(366001);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(this.f134348p, e11);
                    }
                }
                if (jSONObject2.has("offline")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("offline");
                    if (z11) {
                        i11 = -1001;
                    } else {
                        i11 = -1000;
                    }
                    this.f134349q.m99606S(CoreUtility.f89233i, i11, 0, jSONObject3, 0, false, C18980w.b.f94751r);
                    AbstractC20887g.m109245w(366002);
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(this.f134348p, e12);
        }
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m144982w0(String str) {
        C18403k.m97443p().m97454A(str);
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m144983x0(C18408p c18408p) {
        c18408p.m97529k0(Calendar.getInstance(), 2);
        c18408p.m97523d0();
        C23744a.m124114c().m124116d(3051, new Object[0]);
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m144987z0(JSONObject jSONObject, C18408p c18408p) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: wh.a0

            /* renamed from: q */
            public final /* synthetic */ JSONObject f134284q;

            public /* synthetic */ RunnableC28999a0(JSONObject jSONObject2) {
                r2 = jSONObject2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18408p.this.m97520Y(r2);
            }
        });
    }

    /* renamed from: B */
    synchronized void m144988B(int i11, JSONObject jSONObject, int i12) {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: wh.c0

            /* renamed from: q */
            public final /* synthetic */ int f134288q;

            /* renamed from: r */
            public final /* synthetic */ JSONObject f134289r;

            /* renamed from: s */
            public final /* synthetic */ int f134290s;

            public /* synthetic */ RunnableC29003c0(int i112, JSONObject jSONObject2, int i122) {
                r2 = i112;
                r3 = jSONObject2;
                r4 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144955j0(r2, r3, r4);
            }
        }));
    }

    /* renamed from: C */
    synchronized void m144989C(String str, int i11, int i12, JSONObject jSONObject, int i13, boolean z11) {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: wh.g0

            /* renamed from: q */
            public final /* synthetic */ String f134316q;

            /* renamed from: r */
            public final /* synthetic */ int f134317r;

            /* renamed from: s */
            public final /* synthetic */ int f134318s;

            /* renamed from: t */
            public final /* synthetic */ JSONObject f134319t;

            /* renamed from: u */
            public final /* synthetic */ int f134320u;

            /* renamed from: v */
            public final /* synthetic */ boolean f134321v;

            public /* synthetic */ RunnableC29011g0(String str2, int i112, int i122, JSONObject jSONObject2, int i132, boolean z112) {
                r2 = str2;
                r3 = i112;
                r4 = i122;
                r5 = jSONObject2;
                r6 = i132;
                r7 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144958k0(r2, r3, r4, r5, r6, r7);
            }
        }));
    }

    /* renamed from: D */
    synchronized void m144990D(int i11, int i12, JSONObject jSONObject, int i13) {
        C24261h.m126630v().m126651y().mo13474a(new Runnable() { // from class: wh.f0

            /* renamed from: q */
            public final /* synthetic */ int f134305q;

            /* renamed from: r */
            public final /* synthetic */ int f134306r;

            /* renamed from: s */
            public final /* synthetic */ JSONObject f134307s;

            /* renamed from: t */
            public final /* synthetic */ int f134308t;

            public /* synthetic */ RunnableC29009f0(int i112, int i122, JSONObject jSONObject2, int i132) {
                r2 = i112;
                r3 = i122;
                r4 = jSONObject2;
                r5 = i132;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144960l0(r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: E */
    synchronized void m144991E(int i11, JSONObject jSONObject, int i12) {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: wh.h0

            /* renamed from: q */
            public final /* synthetic */ int f134324q;

            /* renamed from: r */
            public final /* synthetic */ JSONObject f134325r;

            /* renamed from: s */
            public final /* synthetic */ int f134326s;

            public /* synthetic */ RunnableC29013h0(int i112, JSONObject jSONObject2, int i122) {
                r2 = i112;
                r3 = jSONObject2;
                r4 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144962m0(r2, r3, r4);
            }
        }));
    }

    /* renamed from: F */
    public void m144992F() {
        try {
            if (this.f134358z) {
                return;
            }
            this.f134358z = true;
            AbstractC23309i.m121946gj("");
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            c0766k.mo1746ta();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I */
    public ArrayList m144993I() {
        ArrayList arrayList = new ArrayList();
        List<PackageInfo> installedPackages = MainApplication.getAppContext().getPackageManager().getInstalledPackages(0);
        for (int i11 = 0; i11 < installedPackages.size(); i11++) {
            PackageInfo packageInfo = installedPackages.get(i11);
            d dVar = new d();
            dVar.f134363a = packageInfo.applicationInfo.loadLabel(MainApplication.getAppContext().getPackageManager()).toString();
            dVar.f134364b = packageInfo.packageName;
            dVar.f134365c = packageInfo.versionCode;
            arrayList.add(dVar);
        }
        return arrayList;
    }

    /* renamed from: J0 */
    void m144994J0() {
    }

    /* renamed from: K */
    public void m144995K() {
        if (C23055e5.m118272g(true)) {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.f103775r = 5;
            c29037t0.f103772o = AbstractC29039u0.m145033a(AbstractC29039u0.b.FAIL_OVER_URL);
            try {
                ArrayList arrayList = new ArrayList();
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93297s(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93295q((short) 115);
                requestPacket.m93275F((byte) 41);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(AbstractC17522a.m93345h(CoreUtility.f89232h.getBytes().length));
                byteArrayOutputStream.write(CoreUtility.f89232h.getBytes());
                byteArrayOutputStream.write(0);
                requestPacket.m93303y(byteArrayOutputStream.toByteArray());
                arrayList.add(requestPacket);
                c29037t0.m110315j0(arrayList);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C0808c0.m2046b(c29037t0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[Catch: Exception -> 0x0019, TRY_ENTER, TryCatch #1 {Exception -> 0x0019, blocks: (B:48:0x0013, B:3:0x001c, B:22:0x006c, B:24:0x00a1, B:26:0x00a9, B:27:0x00af, B:28:0x00b4, B:31:0x00d7), top: B:47:0x0013 }] */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m144996L() {
        String str;
        int i11;
        String str2;
        InputMethodManager inputMethodManager;
        ArrayList m144993I = m144993I();
        int size = m144993I.size();
        StringBuilder sb2 = new StringBuilder();
        if (size > 0) {
            try {
                sb2.append("[");
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        HashSet hashSet = new HashSet();
        try {
            inputMethodManager = (InputMethodManager) MainApplication.getAppContext().getSystemService("input_method");
        } catch (Exception unused) {
        }
        if (inputMethodManager != null) {
            String string = Settings.Secure.getString(MainApplication.getAppContext().getContentResolver(), "default_input_method");
            str = "";
            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                try {
                    hashSet.add(inputMethodInfo.getPackageName());
                    if (inputMethodInfo.getId().equals(string)) {
                        str = inputMethodInfo.getPackageName();
                    }
                } catch (Exception unused2) {
                }
            }
            for (i11 = 0; i11 < size; i11++) {
                d dVar = (d) m144993I.get(i11);
                sb2.append("{");
                sb2.append("\"appname\":");
                sb2.append(JSONObject.quote(dVar.f134363a));
                sb2.append(",");
                sb2.append("\"pname\":");
                sb2.append(JSONObject.quote(dVar.f134364b));
                sb2.append(",");
                if (hashSet.contains(dVar.f134364b)) {
                    if (str.equals(dVar.f134364b)) {
                        sb2.append("\"defaultInput\":true,");
                    } else {
                        sb2.append("\"enabledInput\":true,");
                    }
                }
                sb2.append("\"versionCode\":");
                sb2.append(JSONObject.quote("" + dVar.f134365c));
                if (i11 != size - 1) {
                    str2 = "},";
                } else {
                    str2 = "}]";
                }
                sb2.append(str2);
            }
            return sb2.toString();
        }
        str = "";
        while (i11 < size) {
        }
        return sb2.toString();
    }

    /* renamed from: L0 */
    public void m144997L0(JSONObject jSONObject) {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: wh.e0

            /* renamed from: q */
            public final /* synthetic */ JSONObject f134302q;

            public /* synthetic */ RunnableC29007e0(JSONObject jSONObject2) {
                r2 = jSONObject2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144976t0(r2);
            }
        }));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: wh.t.<init>(int, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Can't wrap try/catch for region: R(17:17|(4:18|19|20|(3:21|22|23))|(4:1753|1754|91|(1:1763)(6:1764|56|57|58|59|60))|25|(1:27)(1:1752)|28|(1:30)(1:1751)|31|32|33|34|35|(10:1655|1656|1657|1658|(3:1663|1664|(2:1736|1737)(2:1666|(13:1668|(1:1670)(1:1735)|1671|(1:1673)(1:1734)|1674|(1:1676)|1677|1678|(1:1733)(13:1682|(2:1684|(1:1686)(2:1714|(1:1720)))(2:1721|(2:1723|(1:1725)(2:1726|(12:1730|1731|1732|1688|(1:1690)|1691|1692|(1:1705)(1:1696)|1697|(2:1702|1703)|1704|1703))))|1687|1688|(0)|1691|1692|(1:1694)|1705|1697|(3:1699|1702|1703)|1704|1703)|57|58|59|60)))(1:1662)|56|57|58|59|60)(8:47|(5:(3:72|73|(4:75|(3:77|(1:79)|80)|81|54))|50|(4:61|62|63|64)(1:52)|53|54)(3:84|(1:86)(2:87|(2:89|(3:91|(1:93)|94))(2:95|(4:1638|1639|(3:1641|(3:1643|(2:1645|1646)(1:1648)|1647)|1649)|1650)(2:97|(30:1538|1539|(1:1541)(1:1634)|1542|1543|(1:1545)(1:1633)|1546|(1:1548)(1:1632)|1549|(1:1551)(1:1631)|1552|(1:1554)(1:1630)|1555|(1:1557)(1:1629)|1558|(1:1560)(1:1628)|1561|(1:1563)|1564|(1:1566)(1:1627)|1567|(1:1569)(1:1626)|1570|1571|1572|1573|(3:1622|(3:1612|1613|(2:1615|1616))|(14:1583|1584|1585|(2:1587|(2:1589|(1:1591)(1:1605))(1:1606))(2:1607|(1:1611))|1592|1593|1594|1595|(2:1597|(1:1599)(1:1600))|56|57|58|59|60))|1576|(0)|(16:1579|1581|1583|1584|1585|(0)(0)|1592|1593|1594|1595|(0)|56|57|58|59|60))(7:99|(1:101)(2:102|(23:104|(1:106)(1:196)|107|(1:109)(1:195)|110|(1:112)(1:194)|113|(1:115)(1:193)|116|(1:118)|119|(1:121)(1:192)|122|(1:124)(1:191)|125|(1:127)(1:190)|128|(1:130)(1:189)|131|(1:133)(1:188)|134|(12:136|(1:140)|141|142|143|566|151|152|(1:154)(2:169|(1:171))|155|(2:157|(1:159)(4:160|(1:167)(1:164)|165|166))|168)|187)(2:197|(18:199|(1:201)(1:236)|202|203|(1:205)(1:235)|206|207|(1:209)(1:234)|210|(1:212)(1:233)|213|(1:215)(1:232)|216|(1:218)(1:231)|219|(1:221)(1:230)|222|(2:224|(2:226|(1:228)(1:229))))(2:237|(3:239|(1:241)(1:243)|242)(2:244|(15:246|(1:248)(1:326)|249|(1:251)(1:325)|252|(1:254)(1:324)|255|(1:257)(1:323)|258|(1:260)(1:322)|261|(1:263)(1:321)|264|(3:266|(10:269|(1:271)|(3:275|(2:(2:279|(2:281|(2:283|284)(1:286))(1:287))|285)|290)|291|(1:318)(1:303)|304|(1:317)|310|(2:312|(1:314)(1:315))|316)|319)|320)(2:327|(3:329|(1:331)(1:333)|332)(2:334|(2:343|(6:345|(1:347)|348|(1:350)|351|(4:353|(1:355)|356|(1:358))(1:(4:360|(3:362|(1:364)|365)|366|(1:368))))(2:369|(4:1521|1522|(1:1526)|(2:(1:1531)(1:1533)|1532))(2:371|(1:(3:374|375|(1:418)(4:381|(3:383|(3:385|(2:387|(1:394)(3:(1:390)|391|392))(1:395)|393)|396)(3:404|(4:406|(3:408|(2:410|411)(1:413)|412)|414|415)(1:417)|416)|(1:401)|(1:403))))(2:423|(6:1503|1504|(5:1507|1508|1510|1511|1505)|1513|1514|(1:1516))(2:425|(2:427|(2:1497|1498)(2:429|(1:431)(2:432|(1:434)(2:435|(4:1487|1488|(1:1490)(1:1492)|1491)(2:437|(2:439|(3:441|(1:443)|444))(2:445|(1:(3:448|449|(6:453|(1:455)|(1:457)|458|(1:462)|463)))(2:468|(1:(2:471|(1:473)))(2:474|(1:(3:477|(5:481|(1:483)(1:491)|484|(1:486)|(2:488|(1:490)))|492))(2:493|(1:(3:496|(1:498)|499))(2:500|(1:(2:503|(1:507)))(2:508|(1:(1:511))(2:512|(2:514|(3:516|(1:518)|(1:520)))(2:521|(3:1443|1444|(5:1446|(5:1448|1449|1450|(1:1452)|1453)|1458|(1:1486)|(3:1463|(1:1474)(4:1467|(2:1470|1468)|1471|1472)|1473)(5:1475|(1:1477)(1:1485)|1478|(1:1484)(1:1482)|1483)))(2:524|(1:(1:527))(2:528|(1:530)(2:531|(1:(1:534))(2:535|(1:(3:540|(2:543|541)|544))(2:545|(1:(3:548|(2:554|(5:558|(2:560|(2:562|(1:564)(1:565)))|566|(2:568|(1:570))|571))|574))(2:579|(1:(1:582))(2:583|(1:(3:588|(3:590|(3:596|(7:600|(2:602|(1:604)(1:615))(1:616)|606|607|(2:609|(1:611))|612|613)|614)|621)|626))(2:627|(6:629|(3:633|(5:636|637|639|640|634)|645)|646|(2:(0)|658)(2:(2:661|658)|650)|651|(3:653|(1:655)(1:657)|656))(2:662|(2:664|(1:666))(2:667|(1:669)(2:670|(3:672|(2:683|(1:685)(2:686|(1:688)(1:689)))(2:676|(1:(1:679)(1:681))(1:682))|680)(2:690|(3:1419|1420|(4:1424|(3:1426|(4:1428|(1:1430)(1:1434)|1431|1432)(1:1435)|1433)|1436|(1:1438)))(2:692|(1:694)(2:695|(4:1402|1403|(1:1405)(2:1407|(1:1409)(2:1410|(2:1412|(1:1414))))|1406)(2:697|(3:1389|1390|(2:1392|(1:1394))(2:1395|(1:1397)))(2:699|(3:1381|1382|(1:1384))(2:701|(3:1367|1368|(1:1370)(2:1371|(1:1373)(2:1374|(1:1376))))(2:703|(3:1359|1360|(1:1362))(2:705|(2:1353|1354)(2:707|(1:709)(2:710|(4:712|(1:714)(1:718)|715|(1:717))(2:719|(5:721|(1:723)(1:735)|724|(3:726|(1:733)(1:730)|731)(1:734)|732)(2:736|(3:738|(1:742)|743)(2:744|(2:746|(6:754|(1:756)|757|(1:759)|760|(2:765|(1:767)(2:768|(1:770)))(1:764)))(2:771|(1:(10:774|(3:776|(1:778)(1:780)|779)|781|(3:783|(1:785)(1:787)|786)|788|(3:790|(1:792)(1:794)|793)|795|(4:797|(1:799)(1:803)|800|(1:802))|804|(3:806|(1:808)(1:810)|809)))(6:811|(2:(3:816|817|(2:819|(2:821|(1:(1:824)(4:825|(1:827)|828|829))(6:830|(1:832)|833|(1:835)(2:838|(1:840)(2:841|837))|836|837))(8:842|(1:844)|845|(1:847)(2:855|(1:857)(4:858|849|(1:853)|854))|848|849|(2:851|853)|854))(4:859|(1:861)|862|(2:866|829)))|814)(2:870|(1:872)(2:873|(7:875|876|877|(1:879)|880|881|(1:895)(3:885|(1:887)(2:892|(1:894))|889))(2:900|(5:1339|1340|(3:1342|(1:1344)|1345)|1346|(1:1348))(2:902|(1:904)(2:905|(2:907|(2:909|(2:911|(1:(2:914|(2:920|(1:922)(1:923)))(2:924|(1:926)(2:927|(2:941|942)(4:929|(4:932|(2:934|935)(2:937|938)|936|930)|939|940))))(2:943|(1:945)(1:946)))(2:947|(1:949)(1:950)))(2:951|(1:953)(1:954)))(2:955|(4:957|(1:959)|960|(1:964))(2:965|(2:967|(1:969))(2:970|(1:972)(2:973|(1:975)(2:976|(1:(5:979|(1:981)(1:987)|982|(1:984)(1:986)|985))(2:988|(2:990|(2:992|(3:994|(4:997|(6:999|(3:1001|(2:1004|1002)|1005)|1006|(3:1008|(2:1011|1009)|1012)|1013|(2:1019|1020)(1:1017))(1:1021)|1018|995)|1022)))(2:1023|(2:1025|(1:1028))(2:1029|(2:1031|(1:1035))(2:1036|(1:1038)(2:1039|(2:1041|(2:1043|(2:1045|(1:(2:1048|(2:1054|(1:1056)(1:1057)))(2:1058|(1:1060)(2:1061|(2:1075|1076)(4:1063|(4:1066|(2:1068|1069)(2:1071|1072)|1070|1064)|1073|1074))))(2:1077|(1:1079)(1:1080)))(2:1081|(1:1083)(1:1084)))(2:1085|(1:1087)(1:1088)))(2:1089|(3:1091|(2:1093|(1:1095))(1:1097)|1096)(2:1098|(1:1100)(2:1101|(1:(3:1104|1105|(1:1107)))(2:1112|(1:1114)(2:1115|(1:(2:1118|(2:1120|(8:1122|1123|1124|(2:1128|(2:1130|(1:1132))(2:1133|1134))|1136|(3:1138|(1:1144)|1145)|1146|(4:1148|(1:1150)(1:1154)|1151|(1:1153))))(1:1157)))(2:1158|(4:1160|(1:(2:1163|(2:1165|(2:1167|(1:1169)(3:1170|(1:1172)(1:1174)|1173))(2:1175|(7:1177|1178|(3:1182|1179|1180)|1183|1184|1185|1186)))(1:1190))(1:1191))|1192|1186)(1:(2:1194|(1:(2:1197|(2:1199|(2:1201|(1:1203)(3:1204|(1:1206)(1:1208)|1207))(1:1209))(1:1210))(1:1211)))(2:1212|(1:(1:1215))(2:1216|(2:1218|(8:1222|(1:1224)|1225|(1:1227)|1228|1229|(1:1260)(8:1235|1236|(4:1242|1243|1244|(2:1248|(4:1250|(1:1252)(1:1256)|1253|(1:1255))))|1257|1244|(0)|1248|(0))|1247))(2:1263|(1:1265)(2:1266|(1:1268)(2:1269|(2:1271|(1:1275))(2:1276|(2:1278|(2:1280|(1:1287)(1:1286)))(2:1288|(1:1290)(2:1291|(1:1293)(2:1294|(1:1296)(2:1297|(1:1299)(2:1300|(1:1302)(2:1303|(1:1305)(2:1306|(2:1310|(2:1314|(1:(2:1317|(2:1319|(2:1321|(1:1323)(1:1324))(1:1325))(1:1326)))(2:1327|(1:1329)(2:1330|(1:1332)(2:1333|(1:1335)(2:1336|(1:1338))))))(1:1313))(1:1309))))))))))))))))))))))))))))))))))))|815|58|59|60))))))))))))))))))))))))))))))))))))))))))))))))))|56|57|58|59|60))))|54)|55|56|57|58|59|60)|71|59|60|15) */
    /* JADX WARN: Code restructure failed: missing block: B:1135:0x1e7b, code lost:            if (nh0.C23793c.m124316k().mo124314i() > r5) goto L1897;     */
    /* JADX WARN: Code restructure failed: missing block: B:1748:0x2552, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:1749:0x2553, code lost:            r22 = r3;        r18 = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x1075, code lost:            if (r11 < 0) goto L2618;     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x114d, code lost:            if (r9 < r8) goto L2652;     */
    /* JADX WARN: Removed duplicated region for block: B:1250:0x2114 A[Catch: Exception -> 0x2161, TryCatch #16 {Exception -> 0x2161, blocks: (B:1229:0x20cb, B:1231:0x20d3, B:1233:0x20db, B:1244:0x2102, B:1248:0x2108, B:1250:0x2114, B:1253:0x2123, B:1255:0x212f, B:1260:0x215e), top: B:1228:0x20cb }] */
    /* JADX WARN: Removed duplicated region for block: B:1587:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:1597:0x03ef A[Catch: Exception -> 0x03a4, TryCatch #15 {Exception -> 0x03a4, blocks: (B:1585:0x0366, B:1592:0x03cd, B:1597:0x03ef, B:1599:0x0401, B:1600:0x0406, B:1604:0x03e7, B:1605:0x039b, B:1606:0x03ac, B:1607:0x03b5, B:1609:0x03bf, B:1611:0x03c9, B:101:0x0426, B:104:0x0435, B:107:0x0446, B:110:0x0457, B:113:0x0468, B:115:0x0470, B:116:0x0478, B:118:0x0480, B:119:0x0486, B:121:0x048e, B:122:0x0497, B:124:0x049f, B:125:0x04a8, B:128:0x04b9, B:130:0x04c1, B:131:0x04c9, B:133:0x04d1, B:134:0x04d9, B:136:0x04e3, B:138:0x0527, B:140:0x0531, B:141:0x0535, B:152:0x058f, B:154:0x05b3, B:157:0x05e7, B:159:0x05ef, B:160:0x05f3, B:162:0x0601, B:166:0x0617, B:167:0x060c, B:168:0x061c, B:169:0x05ca, B:171:0x05d0, B:183:0x058c, B:187:0x0634, B:190:0x04b3, B:194:0x0462, B:195:0x0451, B:196:0x0440, B:199:0x063e, B:203:0x0651, B:207:0x0664, B:210:0x0675, B:212:0x067d, B:213:0x0686, B:215:0x068e, B:216:0x0696, B:218:0x069e, B:219:0x06a6, B:221:0x06ae, B:222:0x06b6, B:224:0x06c0, B:226:0x06f0, B:228:0x070b, B:229:0x0710, B:234:0x066f, B:235:0x065d, B:236:0x064a, B:239:0x0721, B:242:0x0732, B:243:0x072c, B:246:0x0747, B:249:0x0758, B:252:0x0769, B:255:0x077a, B:258:0x078b, B:261:0x079c, B:263:0x07a4, B:264:0x07ac, B:266:0x07b9, B:269:0x07e9, B:271:0x0806, B:273:0x0817, B:275:0x081d, B:279:0x0831, B:281:0x0854, B:283:0x085b, B:285:0x085f, B:291:0x0862, B:293:0x086b, B:295:0x087d, B:297:0x0885, B:299:0x0899, B:301:0x089f, B:303:0x08a5, B:304:0x08ab, B:310:0x08d3, B:312:0x0902, B:314:0x0910, B:315:0x0928, B:316:0x0933, B:317:0x08d1, B:319:0x093b, B:320:0x093e, B:322:0x0796, B:323:0x0785, B:324:0x0774, B:325:0x0763, B:326:0x0752, B:329:0x0957, B:332:0x0968, B:333:0x0962, B:345:0x0993, B:347:0x09f9, B:348:0x09fb, B:350:0x0a01, B:353:0x0a0b, B:355:0x0a1f, B:356:0x0a26, B:358:0x0a40, B:360:0x0a4a, B:362:0x0a7c, B:364:0x0a82, B:365:0x0a84, B:366:0x0a8f, B:368:0x0a97, B:422:0x0be8, B:431:0x0c64, B:434:0x0c71, B:439:0x0c9d, B:441:0x0ca5, B:443:0x0cd5, B:444:0x0cdf, B:467:0x0d91, B:471:0x0d9c, B:473:0x0da8, B:477:0x0db5, B:479:0x0dc1, B:481:0x0dc7, B:483:0x0dd5, B:484:0x0de6, B:486:0x0dfe, B:488:0x0e06, B:490:0x0e27, B:492:0x0e2a, B:496:0x0e35, B:498:0x0e41, B:499:0x0e59, B:503:0x0e64, B:505:0x0e75, B:507:0x0e7f, B:511:0x0e9e, B:514:0x0eb8, B:516:0x0ebe, B:518:0x0ec4, B:520:0x0ee5, B:527:0x0f0d, B:530:0x0f21, B:534:0x0f2c, B:538:0x0f37, B:541:0x0f40, B:543:0x0f46, B:548:0x0f56, B:550:0x0f5d, B:552:0x0f67, B:554:0x0f6f, B:556:0x0f78, B:558:0x0f7e, B:560:0x0f8c, B:562:0x0f92, B:566:0x0fa3, B:568:0x0fa9, B:571:0x0fb5, B:582:0x0fe8, B:586:0x1016, B:588:0x101e, B:590:0x1025, B:592:0x1030, B:594:0x103a, B:596:0x1042, B:598:0x104b, B:600:0x1051, B:602:0x105f, B:604:0x1065, B:607:0x107e, B:609:0x1084, B:612:0x1090, B:614:0x10ba, B:629:0x10c5, B:631:0x1124, B:634:0x112b, B:640:0x1142, B:643:0x113f, B:646:0x1145, B:651:0x1157, B:653:0x1176, B:656:0x1182, B:664:0x118f, B:666:0x119b, B:669:0x11a4, B:672:0x11b0, B:680:0x1218, B:681:0x11c6, B:682:0x11cf, B:683:0x11f0, B:686:0x11f9, B:689:0x1208, B:694:0x12ab, B:709:0x1481, B:712:0x1493, B:715:0x14a6, B:717:0x14c1, B:721:0x14ce, B:723:0x14e3, B:724:0x14f9, B:726:0x1508, B:728:0x1510, B:730:0x1516, B:731:0x153a, B:732:0x154b, B:734:0x1544, B:735:0x14f5, B:738:0x1565, B:740:0x156d, B:742:0x1577, B:743:0x157e, B:746:0x1591, B:748:0x1599, B:750:0x15a1, B:752:0x15a9, B:754:0x15b1, B:756:0x15bd, B:757:0x15c3, B:759:0x15cb, B:760:0x15d1, B:762:0x15d7, B:764:0x15dd, B:765:0x15e6, B:767:0x15ec, B:768:0x15f5, B:770:0x15fb, B:774:0x160a, B:776:0x1612, B:779:0x161e, B:781:0x1621, B:783:0x1629, B:786:0x1635, B:788:0x1638, B:790:0x1640, B:793:0x164c, B:795:0x164f, B:797:0x1657, B:800:0x1663, B:802:0x166f, B:804:0x1682, B:806:0x168a, B:809:0x1695, B:872:0x17bd, B:875:0x17d8, B:899:0x1889, B:904:0x18db, B:907:0x18ec, B:917:0x1902, B:920:0x190c, B:922:0x1918, B:923:0x191f, B:924:0x1937, B:927:0x1941, B:929:0x1962, B:930:0x1968, B:932:0x196e, B:936:0x1989, B:937:0x1975, B:940:0x198c, B:943:0x19a4, B:946:0x19ae, B:947:0x19ea, B:950:0x19f4, B:951:0x1a2a, B:954:0x1a34, B:957:0x1a7c, B:959:0x1a90, B:960:0x1a9b, B:962:0x1aa3, B:964:0x1aab, B:967:0x1ad2, B:969:0x1aee, B:972:0x1b18, B:975:0x1b32, B:979:0x1b3f, B:982:0x1b52, B:985:0x1b70, B:990:0x1b85, B:992:0x1b8d, B:995:0x1ba0, B:997:0x1ba6, B:999:0x1bac, B:1002:0x1bc7, B:1004:0x1bcd, B:1006:0x1bdc, B:1009:0x1be5, B:1011:0x1beb, B:1013:0x1bfa, B:1015:0x1c00, B:1019:0x1c06, B:1018:0x1c15, B:1025:0x1c1c, B:1028:0x1c26, B:1031:0x1c33, B:1033:0x1c3f, B:1035:0x1c47, B:1038:0x1c5a, B:1041:0x1c67, B:1051:0x1c7d, B:1054:0x1c87, B:1056:0x1c93, B:1057:0x1c9a, B:1058:0x1ca1, B:1061:0x1cab, B:1063:0x1ccc, B:1064:0x1cd2, B:1066:0x1cd8, B:1070:0x1cf3, B:1071:0x1cdf, B:1074:0x1cf6, B:1077:0x1cfd, B:1080:0x1d07, B:1081:0x1d32, B:1084:0x1d3c, B:1085:0x1d61, B:1088:0x1d6b, B:1091:0x1da2, B:1093:0x1dac, B:1095:0x1dbd, B:1096:0x1dcd, B:1097:0x1dc5, B:1100:0x1dd8, B:1111:0x1dfc, B:1114:0x1e07, B:1118:0x1e1a, B:1120:0x1e28, B:1122:0x1e30, B:1136:0x1e7f, B:1138:0x1e8b, B:1140:0x1e91, B:1142:0x1e97, B:1144:0x1e9d, B:1145:0x1eac, B:1146:0x1eb3, B:1148:0x1ebb, B:1151:0x1eca, B:1153:0x1ed6, B:1157:0x1f13, B:1160:0x1f2d, B:1170:0x1f48, B:1173:0x1f55, B:1175:0x1f5a, B:1177:0x1f6e, B:1190:0x1f99, B:1191:0x1fb9, B:1194:0x1fdc, B:1204:0x1ff7, B:1207:0x2004, B:1209:0x2009, B:1210:0x2022, B:1211:0x2041, B:1215:0x2060, B:1218:0x206f, B:1220:0x2077, B:1222:0x2087, B:1224:0x20bc, B:1225:0x20c0, B:1227:0x20c8, B:1247:0x2161, B:1265:0x2173, B:1268:0x2197, B:1271:0x21a0, B:1273:0x21aa, B:1275:0x21b2, B:1278:0x21d7, B:1280:0x21df, B:1282:0x21e5, B:1284:0x21eb, B:1286:0x21f1, B:1287:0x21f6, B:1290:0x2203, B:1293:0x220c, B:1296:0x2217, B:1299:0x2222, B:1302:0x222d, B:1305:0x2238, B:1309:0x2251, B:1313:0x225c, B:1317:0x2267, B:1324:0x228f, B:1325:0x2294, B:1326:0x229b, B:1329:0x22af, B:1332:0x22b8, B:1335:0x22c5, B:1338:0x22d0, B:1352:0x18d2, B:1358:0x1478, B:1366:0x145a, B:1380:0x143a, B:1388:0x140a, B:1401:0x13e8, B:1418:0x1354, B:1442:0x12a2, B:1444:0x22d7, B:1446:0x22dd, B:1453:0x232b, B:1457:0x2326, B:1458:0x232e, B:1460:0x2334, B:1463:0x234a, B:1465:0x2352, B:1467:0x2358, B:1468:0x235f, B:1470:0x2365, B:1473:0x2373, B:1475:0x2386, B:1477:0x238e, B:1483:0x23a8, B:1485:0x2397, B:1486:0x233e, B:1496:0x0c94, B:1502:0x0c5b, B:1520:0x0c39, B:1537:0x0b2d, B:1662:0x23e4, B:449:0x0cee, B:451:0x0d0f, B:453:0x0d15, B:455:0x0d22, B:457:0x0d2e, B:458:0x0d39, B:460:0x0d4e, B:462:0x0d5c, B:463:0x0d73, B:1504:0x0bf1, B:1505:0x0c0a, B:1514:0x0c2b, B:1516:0x0c31, B:1354:0x1463, B:1420:0x1244, B:1422:0x124c, B:1424:0x1250, B:1426:0x1258, B:1428:0x125e, B:1431:0x127a, B:1434:0x1276, B:1433:0x1294, B:1438:0x1299, B:1498:0x0c4a, B:1368:0x1413, B:1370:0x141d, B:1373:0x142d, B:1376:0x1435, B:1594:0x03d7, B:1450:0x2315, B:1452:0x2321, B:375:0x0b38, B:379:0x0b51, B:381:0x0b5b, B:385:0x0b68, B:387:0x0b76, B:390:0x0b87, B:391:0x0b90, B:393:0x0b97, B:399:0x0bcb, B:401:0x0bd1, B:403:0x0bda, B:408:0x0ba3, B:410:0x0bb1, B:412:0x0bbc, B:418:0x0be3, B:877:0x17ed, B:879:0x1801, B:881:0x180e, B:883:0x181c, B:885:0x1822, B:887:0x182a, B:889:0x1855, B:890:0x182e, B:891:0x183e, B:892:0x184e, B:895:0x187c, B:1360:0x1443, B:1362:0x144b, B:1488:0x0c7a, B:1491:0x0c86, B:1522:0x0aa5, B:1526:0x0ac0, B:1528:0x0ad7, B:1531:0x0adf, B:1532:0x0b1a, B:1533:0x0ae8, B:1340:0x18a4, B:1342:0x18ac, B:1344:0x18b3, B:1346:0x18c2, B:1348:0x18cb, B:1390:0x135d, B:1392:0x138a, B:1394:0x13b9, B:1395:0x13c1, B:1397:0x13c5, B:1403:0x12bb, B:1405:0x12f9, B:1406:0x133f, B:1407:0x1300, B:1409:0x1304, B:1410:0x1313, B:1412:0x1317, B:1414:0x133c, B:637:0x1131, B:1105:0x1de5, B:1107:0x1ded, B:1382:0x13f1, B:1384:0x13fd, B:143:0x0543, B:144:0x0566, B:151:0x0579, B:176:0x058b), top: B:1584:0x0366, inners: #1, #3, #4, #6, #9, #11, #13, #14, #19, #24, #26, #29, #30, #35, #36, #37, #38, #39, #43, #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:1607:0x03b5 A[Catch: Exception -> 0x03a4, TryCatch #15 {Exception -> 0x03a4, blocks: (B:1585:0x0366, B:1592:0x03cd, B:1597:0x03ef, B:1599:0x0401, B:1600:0x0406, B:1604:0x03e7, B:1605:0x039b, B:1606:0x03ac, B:1607:0x03b5, B:1609:0x03bf, B:1611:0x03c9, B:101:0x0426, B:104:0x0435, B:107:0x0446, B:110:0x0457, B:113:0x0468, B:115:0x0470, B:116:0x0478, B:118:0x0480, B:119:0x0486, B:121:0x048e, B:122:0x0497, B:124:0x049f, B:125:0x04a8, B:128:0x04b9, B:130:0x04c1, B:131:0x04c9, B:133:0x04d1, B:134:0x04d9, B:136:0x04e3, B:138:0x0527, B:140:0x0531, B:141:0x0535, B:152:0x058f, B:154:0x05b3, B:157:0x05e7, B:159:0x05ef, B:160:0x05f3, B:162:0x0601, B:166:0x0617, B:167:0x060c, B:168:0x061c, B:169:0x05ca, B:171:0x05d0, B:183:0x058c, B:187:0x0634, B:190:0x04b3, B:194:0x0462, B:195:0x0451, B:196:0x0440, B:199:0x063e, B:203:0x0651, B:207:0x0664, B:210:0x0675, B:212:0x067d, B:213:0x0686, B:215:0x068e, B:216:0x0696, B:218:0x069e, B:219:0x06a6, B:221:0x06ae, B:222:0x06b6, B:224:0x06c0, B:226:0x06f0, B:228:0x070b, B:229:0x0710, B:234:0x066f, B:235:0x065d, B:236:0x064a, B:239:0x0721, B:242:0x0732, B:243:0x072c, B:246:0x0747, B:249:0x0758, B:252:0x0769, B:255:0x077a, B:258:0x078b, B:261:0x079c, B:263:0x07a4, B:264:0x07ac, B:266:0x07b9, B:269:0x07e9, B:271:0x0806, B:273:0x0817, B:275:0x081d, B:279:0x0831, B:281:0x0854, B:283:0x085b, B:285:0x085f, B:291:0x0862, B:293:0x086b, B:295:0x087d, B:297:0x0885, B:299:0x0899, B:301:0x089f, B:303:0x08a5, B:304:0x08ab, B:310:0x08d3, B:312:0x0902, B:314:0x0910, B:315:0x0928, B:316:0x0933, B:317:0x08d1, B:319:0x093b, B:320:0x093e, B:322:0x0796, B:323:0x0785, B:324:0x0774, B:325:0x0763, B:326:0x0752, B:329:0x0957, B:332:0x0968, B:333:0x0962, B:345:0x0993, B:347:0x09f9, B:348:0x09fb, B:350:0x0a01, B:353:0x0a0b, B:355:0x0a1f, B:356:0x0a26, B:358:0x0a40, B:360:0x0a4a, B:362:0x0a7c, B:364:0x0a82, B:365:0x0a84, B:366:0x0a8f, B:368:0x0a97, B:422:0x0be8, B:431:0x0c64, B:434:0x0c71, B:439:0x0c9d, B:441:0x0ca5, B:443:0x0cd5, B:444:0x0cdf, B:467:0x0d91, B:471:0x0d9c, B:473:0x0da8, B:477:0x0db5, B:479:0x0dc1, B:481:0x0dc7, B:483:0x0dd5, B:484:0x0de6, B:486:0x0dfe, B:488:0x0e06, B:490:0x0e27, B:492:0x0e2a, B:496:0x0e35, B:498:0x0e41, B:499:0x0e59, B:503:0x0e64, B:505:0x0e75, B:507:0x0e7f, B:511:0x0e9e, B:514:0x0eb8, B:516:0x0ebe, B:518:0x0ec4, B:520:0x0ee5, B:527:0x0f0d, B:530:0x0f21, B:534:0x0f2c, B:538:0x0f37, B:541:0x0f40, B:543:0x0f46, B:548:0x0f56, B:550:0x0f5d, B:552:0x0f67, B:554:0x0f6f, B:556:0x0f78, B:558:0x0f7e, B:560:0x0f8c, B:562:0x0f92, B:566:0x0fa3, B:568:0x0fa9, B:571:0x0fb5, B:582:0x0fe8, B:586:0x1016, B:588:0x101e, B:590:0x1025, B:592:0x1030, B:594:0x103a, B:596:0x1042, B:598:0x104b, B:600:0x1051, B:602:0x105f, B:604:0x1065, B:607:0x107e, B:609:0x1084, B:612:0x1090, B:614:0x10ba, B:629:0x10c5, B:631:0x1124, B:634:0x112b, B:640:0x1142, B:643:0x113f, B:646:0x1145, B:651:0x1157, B:653:0x1176, B:656:0x1182, B:664:0x118f, B:666:0x119b, B:669:0x11a4, B:672:0x11b0, B:680:0x1218, B:681:0x11c6, B:682:0x11cf, B:683:0x11f0, B:686:0x11f9, B:689:0x1208, B:694:0x12ab, B:709:0x1481, B:712:0x1493, B:715:0x14a6, B:717:0x14c1, B:721:0x14ce, B:723:0x14e3, B:724:0x14f9, B:726:0x1508, B:728:0x1510, B:730:0x1516, B:731:0x153a, B:732:0x154b, B:734:0x1544, B:735:0x14f5, B:738:0x1565, B:740:0x156d, B:742:0x1577, B:743:0x157e, B:746:0x1591, B:748:0x1599, B:750:0x15a1, B:752:0x15a9, B:754:0x15b1, B:756:0x15bd, B:757:0x15c3, B:759:0x15cb, B:760:0x15d1, B:762:0x15d7, B:764:0x15dd, B:765:0x15e6, B:767:0x15ec, B:768:0x15f5, B:770:0x15fb, B:774:0x160a, B:776:0x1612, B:779:0x161e, B:781:0x1621, B:783:0x1629, B:786:0x1635, B:788:0x1638, B:790:0x1640, B:793:0x164c, B:795:0x164f, B:797:0x1657, B:800:0x1663, B:802:0x166f, B:804:0x1682, B:806:0x168a, B:809:0x1695, B:872:0x17bd, B:875:0x17d8, B:899:0x1889, B:904:0x18db, B:907:0x18ec, B:917:0x1902, B:920:0x190c, B:922:0x1918, B:923:0x191f, B:924:0x1937, B:927:0x1941, B:929:0x1962, B:930:0x1968, B:932:0x196e, B:936:0x1989, B:937:0x1975, B:940:0x198c, B:943:0x19a4, B:946:0x19ae, B:947:0x19ea, B:950:0x19f4, B:951:0x1a2a, B:954:0x1a34, B:957:0x1a7c, B:959:0x1a90, B:960:0x1a9b, B:962:0x1aa3, B:964:0x1aab, B:967:0x1ad2, B:969:0x1aee, B:972:0x1b18, B:975:0x1b32, B:979:0x1b3f, B:982:0x1b52, B:985:0x1b70, B:990:0x1b85, B:992:0x1b8d, B:995:0x1ba0, B:997:0x1ba6, B:999:0x1bac, B:1002:0x1bc7, B:1004:0x1bcd, B:1006:0x1bdc, B:1009:0x1be5, B:1011:0x1beb, B:1013:0x1bfa, B:1015:0x1c00, B:1019:0x1c06, B:1018:0x1c15, B:1025:0x1c1c, B:1028:0x1c26, B:1031:0x1c33, B:1033:0x1c3f, B:1035:0x1c47, B:1038:0x1c5a, B:1041:0x1c67, B:1051:0x1c7d, B:1054:0x1c87, B:1056:0x1c93, B:1057:0x1c9a, B:1058:0x1ca1, B:1061:0x1cab, B:1063:0x1ccc, B:1064:0x1cd2, B:1066:0x1cd8, B:1070:0x1cf3, B:1071:0x1cdf, B:1074:0x1cf6, B:1077:0x1cfd, B:1080:0x1d07, B:1081:0x1d32, B:1084:0x1d3c, B:1085:0x1d61, B:1088:0x1d6b, B:1091:0x1da2, B:1093:0x1dac, B:1095:0x1dbd, B:1096:0x1dcd, B:1097:0x1dc5, B:1100:0x1dd8, B:1111:0x1dfc, B:1114:0x1e07, B:1118:0x1e1a, B:1120:0x1e28, B:1122:0x1e30, B:1136:0x1e7f, B:1138:0x1e8b, B:1140:0x1e91, B:1142:0x1e97, B:1144:0x1e9d, B:1145:0x1eac, B:1146:0x1eb3, B:1148:0x1ebb, B:1151:0x1eca, B:1153:0x1ed6, B:1157:0x1f13, B:1160:0x1f2d, B:1170:0x1f48, B:1173:0x1f55, B:1175:0x1f5a, B:1177:0x1f6e, B:1190:0x1f99, B:1191:0x1fb9, B:1194:0x1fdc, B:1204:0x1ff7, B:1207:0x2004, B:1209:0x2009, B:1210:0x2022, B:1211:0x2041, B:1215:0x2060, B:1218:0x206f, B:1220:0x2077, B:1222:0x2087, B:1224:0x20bc, B:1225:0x20c0, B:1227:0x20c8, B:1247:0x2161, B:1265:0x2173, B:1268:0x2197, B:1271:0x21a0, B:1273:0x21aa, B:1275:0x21b2, B:1278:0x21d7, B:1280:0x21df, B:1282:0x21e5, B:1284:0x21eb, B:1286:0x21f1, B:1287:0x21f6, B:1290:0x2203, B:1293:0x220c, B:1296:0x2217, B:1299:0x2222, B:1302:0x222d, B:1305:0x2238, B:1309:0x2251, B:1313:0x225c, B:1317:0x2267, B:1324:0x228f, B:1325:0x2294, B:1326:0x229b, B:1329:0x22af, B:1332:0x22b8, B:1335:0x22c5, B:1338:0x22d0, B:1352:0x18d2, B:1358:0x1478, B:1366:0x145a, B:1380:0x143a, B:1388:0x140a, B:1401:0x13e8, B:1418:0x1354, B:1442:0x12a2, B:1444:0x22d7, B:1446:0x22dd, B:1453:0x232b, B:1457:0x2326, B:1458:0x232e, B:1460:0x2334, B:1463:0x234a, B:1465:0x2352, B:1467:0x2358, B:1468:0x235f, B:1470:0x2365, B:1473:0x2373, B:1475:0x2386, B:1477:0x238e, B:1483:0x23a8, B:1485:0x2397, B:1486:0x233e, B:1496:0x0c94, B:1502:0x0c5b, B:1520:0x0c39, B:1537:0x0b2d, B:1662:0x23e4, B:449:0x0cee, B:451:0x0d0f, B:453:0x0d15, B:455:0x0d22, B:457:0x0d2e, B:458:0x0d39, B:460:0x0d4e, B:462:0x0d5c, B:463:0x0d73, B:1504:0x0bf1, B:1505:0x0c0a, B:1514:0x0c2b, B:1516:0x0c31, B:1354:0x1463, B:1420:0x1244, B:1422:0x124c, B:1424:0x1250, B:1426:0x1258, B:1428:0x125e, B:1431:0x127a, B:1434:0x1276, B:1433:0x1294, B:1438:0x1299, B:1498:0x0c4a, B:1368:0x1413, B:1370:0x141d, B:1373:0x142d, B:1376:0x1435, B:1594:0x03d7, B:1450:0x2315, B:1452:0x2321, B:375:0x0b38, B:379:0x0b51, B:381:0x0b5b, B:385:0x0b68, B:387:0x0b76, B:390:0x0b87, B:391:0x0b90, B:393:0x0b97, B:399:0x0bcb, B:401:0x0bd1, B:403:0x0bda, B:408:0x0ba3, B:410:0x0bb1, B:412:0x0bbc, B:418:0x0be3, B:877:0x17ed, B:879:0x1801, B:881:0x180e, B:883:0x181c, B:885:0x1822, B:887:0x182a, B:889:0x1855, B:890:0x182e, B:891:0x183e, B:892:0x184e, B:895:0x187c, B:1360:0x1443, B:1362:0x144b, B:1488:0x0c7a, B:1491:0x0c86, B:1522:0x0aa5, B:1526:0x0ac0, B:1528:0x0ad7, B:1531:0x0adf, B:1532:0x0b1a, B:1533:0x0ae8, B:1340:0x18a4, B:1342:0x18ac, B:1344:0x18b3, B:1346:0x18c2, B:1348:0x18cb, B:1390:0x135d, B:1392:0x138a, B:1394:0x13b9, B:1395:0x13c1, B:1397:0x13c5, B:1403:0x12bb, B:1405:0x12f9, B:1406:0x133f, B:1407:0x1300, B:1409:0x1304, B:1410:0x1313, B:1412:0x1317, B:1414:0x133c, B:637:0x1131, B:1105:0x1de5, B:1107:0x1ded, B:1382:0x13f1, B:1384:0x13fd, B:143:0x0543, B:144:0x0566, B:151:0x0579, B:176:0x058b), top: B:1584:0x0366, inners: #1, #3, #4, #6, #9, #11, #13, #14, #19, #24, #26, #29, #30, #35, #36, #37, #38, #39, #43, #44 }] */
    /* JADX WARN: Removed duplicated region for block: B:1612:0x0339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1690:0x24ca  */
    /* renamed from: M0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m144998M0(java.lang.String r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 9648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p609wh.C29021l0.m144998M0(java.lang.String, boolean):void");
    }

    /* renamed from: N0 */
    public void m144999N0(List list) {
        f134347B.execute(new Runnable() { // from class: wh.j0

            /* renamed from: q */
            public final /* synthetic */ List f134336q;

            public /* synthetic */ RunnableC29017j0(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144909E0(r2);
            }
        });
    }

    /* renamed from: O0 */
    void m145000O0(JSONObject jSONObject) {
        try {
            C3537e c3537e = new C3537e(jSONObject);
            C3020p0 m14322a0 = c3537e.f14921d.m14322a0();
            if (m14322a0 != null && AbstractC20826v0.m108828p0(m14322a0.f12058q, m14322a0.m14518m0())) {
                AbstractC19646n0.m102979g1(c3537e);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:3)(1:713)|4|5|6|(3:10|11|(1:13))|17|(6:461|462|463|(2:465|(5:467|468|469|(1:471)(1:474)|472))(6:481|482|(7:687|688|689|(3:691|(1:693)(1:701)|694)(1:702)|695|(1:697)(1:700)|698)(2:486|(4:661|662|663|(2:665|(6:667|(1:669)(1:683)|670|(1:672)(1:682)|673|(2:675|(3:677|(1:679)|680)))))(3:490|491|(1:493)(3:494|495|(1:497)(4:498|499|500|(5:637|638|(1:655)(4:642|(4:644|645|646|647)|652|653)|511|479)(8:502|503|504|505|(2:507|(1:509))(3:513|514|(2:516|(1:518))(3:519|520|(2:522|(1:524))(3:525|526|(2:528|(1:530))(2:531|(3:626|627|(4:629|(1:631)(1:634)|632|633))(2:535|(2:624|625)(5:539|540|541|(4:598|599|(3:601|602|(4:604|(2:605|(3:607|(2:609|610)(1:612)|611)(1:613))|(1:617)|618))|511)(5:543|544|545|546|(1:548)(3:549|550|(1:552)(2:553|(2:555|(2:593|594)(7:561|562|(3:569|570|(3:574|575|(1:577)(3:578|579|(1:581)(2:582|(3:584|585|586)))))|564|565|566|567)))))|479))))))|510|511|479)))))|706|597|592)|478|479)(2:19|(2:21|(2:194|(8:196|197|(2:201|(2:206|(1:208))(1:205))|209|(1:211)|213|214|(2:216|(2:218|(1:220)))))(2:69|(2:71|(2:139|140))(2:144|(2:146|(2:148|149))(2:153|(2:187|(2:189|190))(2:169|(1:171)(2:172|(1:174)(2:175|(1:177)(2:178|(1:180)(2:181|(1:183)(2:184|(1:186)))))))))))(4:227|(1:229)|231|(2:233|(5:235|236|237|(1:239)(1:242)|240))(2:245|(2:247|(1:249)(2:250|(1:252)(1:253)))(2:254|(3:256|(1:258)|259)(2:260|(1:262)(7:263|(4:453|454|(1:460)(1:458)|459)(2:271|(4:445|446|(1:452)(1:450)|451)(2:281|(2:443|444)(2:287|(4:435|436|437|(1:439))(2:291|(4:427|428|429|(1:431))(2:295|(3:420|421|(1:423))(2:297|(3:413|414|(1:416))(2:299|(2:301|(2:303|304))(2:308|(1:310)(2:311|(3:406|407|(1:409))(2:313|(2:315|(2:317|(2:319|(3:349|350|(2:352|(2:354|(2:356|(22:358|(1:360)(1:402)|361|(1:401)|363|364|(1:366)(1:400)|367|(1:369)(1:399)|370|(1:372)(1:398)|373|(1:375)(1:397)|376|(1:378)(1:396)|379|(1:381)(1:395)|382|(1:384)(1:394)|385|(3:387|(1:389)(1:391)|390)|392)))))(2:321|(3:331|332|(2:334|(2:336|(4:338|339|340|341))))(2:323|(1:325)(2:326|(2:328|(1:330))))))))))))))))))|74|75|(2:77|(1:79))(2:90|(1:92)(2:93|(1:95)(2:96|(1:98)(2:99|(1:101)(5:102|103|(3:108|109|(4:123|124|(1:126)(1:129)|127)(2:111|(1:113)(2:114|(1:116)(2:117|(1:119)(2:120|(1:122))))))|133|(1:135))))))|80|(2:82|83)(2:85|(2:87|88)(1:89))))))))|73|74|75|(0)(0)|80|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0caf, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0e0a, code lost:            ho0.AbstractC20110a.m104539h(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x080d, code lost:            if (r26.m93284g() == 4) goto L1161;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0c9d A[Catch: Exception -> 0x0caf, TryCatch #1 {Exception -> 0x0caf, blocks: (B:75:0x0c95, B:77:0x0c9d, B:79:0x0ca4, B:90:0x0cb3, B:92:0x0cbb, B:93:0x0cc6, B:95:0x0cce, B:96:0x0cd9, B:98:0x0ce1, B:99:0x0cf0, B:101:0x0cf8, B:102:0x0d07, B:105:0x0d11, B:108:0x0d1b, B:111:0x0d85, B:113:0x0d8d, B:114:0x0da9, B:116:0x0db1, B:117:0x0db5, B:119:0x0dbd, B:120:0x0dc7, B:122:0x0dcf, B:132:0x0d80, B:133:0x0dd3, B:135:0x0ddd, B:124:0x0d23, B:127:0x0d65), top: B:74:0x0c95, inners: #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0e15  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0cb3 A[Catch: Exception -> 0x0caf, TryCatch #1 {Exception -> 0x0caf, blocks: (B:75:0x0c95, B:77:0x0c9d, B:79:0x0ca4, B:90:0x0cb3, B:92:0x0cbb, B:93:0x0cc6, B:95:0x0cce, B:96:0x0cd9, B:98:0x0ce1, B:99:0x0cf0, B:101:0x0cf8, B:102:0x0d07, B:105:0x0d11, B:108:0x0d1b, B:111:0x0d85, B:113:0x0d8d, B:114:0x0da9, B:116:0x0db1, B:117:0x0db5, B:119:0x0dbd, B:120:0x0dc7, B:122:0x0dcf, B:132:0x0d80, B:133:0x0dd3, B:135:0x0ddd, B:124:0x0d23, B:127:0x0d65), top: B:74:0x0c95, inners: #25 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m145001R0(RequestPacket requestPacket, boolean z11) {
        String str;
        Exception exc;
        boolean z12;
        String str2;
        String str3;
        boolean z13;
        String str4;
        String str5;
        boolean z14;
        StringBuilder sb2;
        String str6;
        List list;
        boolean z15;
        String str7;
        byte[] bArr = null;
        ?? r102 = 2;
        r102 = 2;
        AbstractC25803k.m132971k(2, 3, String.valueOf((int) requestPacket.m93278a()), requestPacket.m93281d(), requestPacket.m93289k() == 0 ? null : String.valueOf(requestPacket.m93289k()));
        try {
            if (requestPacket.m93286h() != null && requestPacket.m93286h().length > 0) {
                try {
                    bArr = AbstractC29633j.m147358g(requestPacket.m93286h());
                } catch (Exception unused) {
                }
                if (bArr != null) {
                    requestPacket.m93303y(bArr);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f134348p, e11);
        }
        AbstractC23126l.m118627a("getMsgType: " + String.valueOf((int) requestPacket.m93284g()) + " getCmd: " + String.valueOf((int) requestPacket.m93278a()));
        ?? r11 = "ts";
        String str8 = "group_";
        str = "";
        if (requestPacket.m93284g() == 2) {
            try {
                try {
                } catch (Exception e12) {
                    exc = e12;
                    str3 = "ts";
                    z12 = true;
                    str2 = str3;
                    AbstractC23350e.m122776f(this.f134348p, exc);
                    str6 = str2;
                    z14 = z12;
                    str7 = str6;
                    z15 = z14;
                    if (requestPacket.m93278a() != 10102) {
                    }
                    if (requestPacket.m93278a() != 2145) {
                    }
                }
            } catch (Exception e13) {
                e = e13;
                r102 = "ts";
            }
            if (requestPacket.m93278a() == 105) {
                if (requestPacket.m93286h().length == 8) {
                    requestPacket.m93271B(105);
                    try {
                        m144992F();
                        long m93340c = AbstractC17522a.m93340c(requestPacket.m93286h());
                        StringBuilder sb3 = new StringBuilder();
                        if (requestPacket.m93280c() != 6) {
                            str8 = "";
                        }
                        sb3.append(str8);
                        sb3.append(requestPacket.m93279b());
                        m145014f1(m93340c, sb3.toString());
                    } catch (Exception e14) {
                        AbstractC23350e.m122776f(this.f134348p, e14);
                    }
                }
            } else {
                try {
                    if (requestPacket.m93278a() != 106 && requestPacket.m93278a() != 10306) {
                        if (requestPacket.m93278a() != 206 && requestPacket.m93278a() != 10307) {
                            if (requestPacket.m93278a() == 110) {
                                m145015g0(requestPacket, false);
                            } else if (requestPacket.m93278a() == 10110) {
                                m145015g0(requestPacket, true);
                            } else {
                                try {
                                    if (requestPacket.m93278a() == 126) {
                                        try {
                                            byte[] m93286h = requestPacket.m93286h();
                                            if (m93286h == null || m93286h.length <= 0) {
                                                str4 = "ts";
                                            } else {
                                                ArrayList arrayList = new ArrayList();
                                                int length = m93286h.length / 18;
                                                int i11 = 0;
                                                int i12 = 0;
                                                r11 = r11;
                                                while (i11 < length) {
                                                    long m93341d = AbstractC17522a.m93341d(m93286h, i12);
                                                    str4 = r11;
                                                    try {
                                                        long m93341d2 = AbstractC17522a.m93341d(m93286h, i12 + 8);
                                                        short m93351n = AbstractC17522a.m93351n(m93286h, i12 + 16);
                                                        i12 += 18;
                                                        String str9 = requestPacket.m93291m() + "";
                                                        C31843aa c31843aa = new C31843aa();
                                                        c31843aa.m152993f(str9);
                                                        c31843aa.m152991d(m93341d);
                                                        c31843aa.m152990c(m93341d2);
                                                        c31843aa.m152992e(m93351n);
                                                        arrayList.add(c31843aa);
                                                        i11++;
                                                        r11 = str4;
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        e.printStackTrace();
                                                        str4 = str4;
                                                        str5 = str4;
                                                        z14 = true;
                                                        str6 = str5;
                                                        str7 = str6;
                                                        z15 = z14;
                                                        if (requestPacket.m93278a() != 10102) {
                                                        }
                                                        if (requestPacket.m93278a() != 2145) {
                                                        }
                                                    }
                                                }
                                                str4 = r11;
                                                m145016h0(requestPacket, arrayList);
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            str4 = r11;
                                        }
                                        str5 = str4;
                                        z14 = true;
                                        str6 = str5;
                                    } else {
                                        str4 = "ts";
                                        try {
                                            if (requestPacket.m93278a() == 215) {
                                                str4 = str4;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    m145005X0(new JSONObject(requestPacket.mo93287i()));
                                                    str4 = str4;
                                                }
                                            } else if (requestPacket.m93278a() == 1690) {
                                                str4 = str4;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    m144932W0(new JSONObject(requestPacket.mo93287i()), false);
                                                    str4 = str4;
                                                }
                                            } else if (requestPacket.m93278a() == 1691) {
                                                str4 = str4;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    m144932W0(new JSONObject(requestPacket.mo93287i()), true);
                                                    str4 = str4;
                                                }
                                            } else if (requestPacket.m93278a() == 1692) {
                                                str4 = str4;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    m144930V0(new JSONObject(requestPacket.mo93287i()));
                                                    str4 = str4;
                                                }
                                            } else if (requestPacket.m93278a() != 1771 && requestPacket.m93278a() != 1774) {
                                                if (requestPacket.m93278a() != 1865 && requestPacket.m93278a() != 1867) {
                                                    try {
                                                        if (requestPacket.m93278a() == 1972) {
                                                            try {
                                                                JSONObject jSONObject = new JSONObject(requestPacket.mo93287i());
                                                                if (requestPacket.m93291m() > 0) {
                                                                    String str10 = str4;
                                                                    long optLong = jSONObject.optLong(str10);
                                                                    String valueOf = String.valueOf(requestPacket.m93291m());
                                                                    str5 = str10;
                                                                    if (!TextUtils.isEmpty(valueOf)) {
                                                                        C7960e.m41971c6().m42465m8(valueOf, optLong, -1);
                                                                        C19669z.f97576X.put(valueOf, Long.valueOf(optLong));
                                                                        C19669z.f97578Z.put(valueOf, Long.valueOf(System.currentTimeMillis()));
                                                                        boolean z16 = false;
                                                                        int i13 = 0;
                                                                        while (true) {
                                                                            list = C19669z.f97579a0;
                                                                            if (i13 >= list.size()) {
                                                                                break;
                                                                            }
                                                                            if (valueOf.equals(list.get(i13))) {
                                                                                z16 = true;
                                                                            }
                                                                            i13++;
                                                                        }
                                                                        if (!z16 && !AbstractC25495a.m132079d(valueOf)) {
                                                                            list.add(valueOf);
                                                                        }
                                                                        C23744a.m124114c().m124116d(4, valueOf);
                                                                        str5 = str10;
                                                                    }
                                                                }
                                                                str5 = str4;
                                                            } catch (Exception e17) {
                                                                e = e17;
                                                                r102 = str4;
                                                                exc = e;
                                                                str3 = r102;
                                                                z12 = true;
                                                                str2 = str3;
                                                                AbstractC23350e.m122776f(this.f134348p, exc);
                                                                str6 = str2;
                                                                z14 = z12;
                                                                str7 = str6;
                                                                z15 = z14;
                                                                if (requestPacket.m93278a() != 10102) {
                                                                }
                                                                if (requestPacket.m93278a() != 2145) {
                                                                }
                                                            }
                                                        } else {
                                                            r102 = str4;
                                                            try {
                                                                if (requestPacket.m93278a() == 2137) {
                                                                    this.f134352t.m130865a(requestPacket.mo93287i());
                                                                    str5 = r102;
                                                                } else if (requestPacket.m93278a() == 758) {
                                                                    C23744a.m124114c().m124116d(74, new JSONObject(requestPacket.mo93287i()));
                                                                    str5 = r102;
                                                                } else {
                                                                    str5 = r102;
                                                                    if (!requestPacket.mo93287i().equals("")) {
                                                                        JSONObject jSONObject2 = new JSONObject(requestPacket.mo93287i());
                                                                        if (requestPacket.m93278a() != 10104 && requestPacket.m93278a() != 101 && requestPacket.m93278a() != 113) {
                                                                            if (requestPacket.m93278a() != 201) {
                                                                                try {
                                                                                    if (requestPacket.m93278a() != 207 && requestPacket.m93278a() != 10207) {
                                                                                        if (requestPacket.m93278a() == 214) {
                                                                                            m144991E(requestPacket.m93278a(), jSONObject2, 3);
                                                                                            str5 = r102;
                                                                                        } else if (requestPacket.m93278a() == 1780) {
                                                                                            m144990D(requestPacket.m93278a(), requestPacket.m93293o(), jSONObject2, 0);
                                                                                            str5 = r102;
                                                                                        } else {
                                                                                            str5 = r102;
                                                                                            if (requestPacket.m93278a() == 1785) {
                                                                                                m144990D(requestPacket.m93278a(), requestPacket.m93293o(), jSONObject2, 1);
                                                                                                str5 = r102;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (Exception e18) {
                                                                                    e = e18;
                                                                                    exc = e;
                                                                                    str3 = r102;
                                                                                    z12 = true;
                                                                                    str2 = str3;
                                                                                    AbstractC23350e.m122776f(this.f134348p, exc);
                                                                                    str6 = str2;
                                                                                    z14 = z12;
                                                                                    str7 = str6;
                                                                                    z15 = z14;
                                                                                    if (requestPacket.m93278a() != 10102) {
                                                                                    }
                                                                                    if (requestPacket.m93278a() != 2145) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            z14 = true;
                                                                            m144989C(CoreUtility.f89233i, requestPacket.m93278a(), requestPacket.m93293o(), jSONObject2, 1, z11);
                                                                            str6 = r102;
                                                                        } else {
                                                                            z14 = true;
                                                                            m144989C(CoreUtility.f89233i, requestPacket.m93278a(), requestPacket.m93293o(), jSONObject2, 0, z11);
                                                                            str6 = r102;
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Exception e19) {
                                                                e = e19;
                                                                r11 = 1;
                                                                exc = e;
                                                                str2 = r102;
                                                                z12 = r11;
                                                                AbstractC23350e.m122776f(this.f134348p, exc);
                                                                str6 = str2;
                                                                z14 = z12;
                                                                str7 = str6;
                                                                z15 = z14;
                                                                if (requestPacket.m93278a() != 10102) {
                                                                }
                                                                if (requestPacket.m93278a() != 2145) {
                                                                }
                                                            }
                                                        }
                                                        z14 = true;
                                                        str6 = str5;
                                                    } catch (Exception e21) {
                                                        e = e21;
                                                    }
                                                } else {
                                                    str6 = str4;
                                                    z14 = true;
                                                    requestPacket.m93278a();
                                                }
                                            } else {
                                                String str11 = str4;
                                                z14 = true;
                                                z14 = true;
                                                str6 = str11;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    JSONObject jSONObject3 = new JSONObject(requestPacket.mo93287i());
                                                    if (requestPacket.m93278a() == 1771) {
                                                        sb2 = new StringBuilder();
                                                        sb2.append(requestPacket.m93291m());
                                                        sb2.append("");
                                                    } else {
                                                        sb2 = new StringBuilder();
                                                        sb2.append("group_");
                                                        sb2.append(jSONObject3.optString("tuid"));
                                                    }
                                                    C8967m.m47867E().m47928n0(jSONObject3, sb2.toString(), requestPacket.m93291m() + "");
                                                    str6 = str11;
                                                }
                                            }
                                            str5 = str4;
                                            z14 = true;
                                            str6 = str5;
                                        } catch (Exception e22) {
                                            e = e22;
                                            r102 = str4;
                                        }
                                    }
                                } catch (Exception e23) {
                                    exc = e23;
                                    str3 = str4;
                                }
                            }
                        } else {
                            r102 = "ts";
                            r11 = 1;
                            r11 = 1;
                            z14 = true;
                            z14 = true;
                            z14 = true;
                            z14 = true;
                            z14 = true;
                            z14 = true;
                            try {
                                str6 = r102;
                                if (!TextUtils.isEmpty(requestPacket.mo93287i())) {
                                    JSONObject jSONObject4 = new JSONObject(requestPacket.mo93287i());
                                    str6 = r102;
                                    if (jSONObject4.has("uid")) {
                                        String str12 = "" + AbstractC18069a.m96089h(jSONObject4, "uid");
                                        String str13 = "" + requestPacket.m93291m();
                                        boolean z17 = AbstractC18069a.m96085d(jSONObject4, "isPC") == 1;
                                        int i14 = requestPacket.m93293o() == 31 ? 1 : 0;
                                        str6 = r102;
                                        if (!TextUtils.isEmpty(str13)) {
                                            str6 = r102;
                                            if (!TextUtils.isEmpty(str12)) {
                                                String str14 = "group_" + str13;
                                                ContactProfile m141810d = C28203u6.f131407a.m141810d(str12, new TrackingSource((short) 1011));
                                                C32068pb.m154702b().m154703a(new C24279e(true, str14, str12, AbstractC23184q2.m119453k(str12, m141810d != null ? m141810d.m40383Q(true, false) : "", str14), i14, z17));
                                                str6 = r102;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e24) {
                                AbstractC23350e.m122776f(this.f134348p, e24);
                                str6 = r102;
                            }
                        }
                    } else {
                        r102 = "ts";
                        r11 = 1;
                        r11 = 1;
                        z14 = true;
                        z14 = true;
                        try {
                            String str15 = "" + requestPacket.m93291m();
                            if (TextUtils.isEmpty(requestPacket.mo93287i())) {
                                z13 = false;
                            } else {
                                z13 = AbstractC18069a.m96085d(new JSONObject(requestPacket.mo93287i()), "isPC") == 1;
                            }
                            C32068pb.m154702b().m154703a(new C24279e(false, str15, null, null, requestPacket.m93293o() == 31 ? 1 : 0, z13));
                            str6 = r102;
                        } catch (Exception e25) {
                            AbstractC23350e.m122776f(this.f134348p, e25);
                            str6 = r102;
                        }
                    }
                } catch (Exception e26) {
                    e = e26;
                }
                e = e26;
                exc = e;
                str2 = r102;
                z12 = r11;
                AbstractC23350e.m122776f(this.f134348p, exc);
                str6 = str2;
                z14 = z12;
            }
            str5 = "ts";
            z14 = true;
            str6 = str5;
        } else {
            String str16 = "ts";
            z15 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z15 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z14 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            z15 = true;
            if (requestPacket.m93284g() == 1) {
                if (requestPacket.m93278a() != 402 && requestPacket.m93278a() != 407 && requestPacket.m93278a() != 408 && requestPacket.m93278a() != 409 && requestPacket.m93278a() != 411 && requestPacket.m93278a() != 413 && requestPacket.m93278a() != 418 && requestPacket.m93278a() != 419 && requestPacket.m93278a() != 421 && requestPacket.m93278a() != 443 && requestPacket.m93278a() != 415 && requestPacket.m93278a() != 426 && requestPacket.m93278a() != 427 && requestPacket.m93278a() != 428 && requestPacket.m93278a() != 1398 && requestPacket.m93278a() != 440 && requestPacket.m93278a() != 441 && requestPacket.m93278a() != 412 && requestPacket.m93278a() != 444 && requestPacket.m93278a() != 414 && requestPacket.m93278a() != 447 && requestPacket.m93278a() != 432 && requestPacket.m93278a() != 448 && requestPacket.m93278a() != 449) {
                    if (requestPacket.m93278a() == 403) {
                        str6 = str16;
                        if (requestPacket.m93289k() == 0) {
                            try {
                                C20024r.m103937c().m103951g(requestPacket.m93278a(), requestPacket.m93291m(), requestPacket.mo93287i());
                                str6 = str16;
                            } catch (Exception e27) {
                                AbstractC23350e.m122776f(this.f134348p, e27);
                                str6 = str16;
                            }
                        }
                    } else if (requestPacket.m93278a() == 405) {
                        str6 = str16;
                        if (requestPacket.m93289k() == 0) {
                            try {
                                C20024r.m103937c().m103951g(requestPacket.m93278a(), requestPacket.m93291m(), requestPacket.mo93287i());
                                str6 = str16;
                            } catch (Exception e28) {
                                AbstractC23350e.m122776f(this.f134348p, e28);
                                str6 = str16;
                            }
                        }
                    } else if (requestPacket.m93278a() != 465 && requestPacket.m93278a() != 469 && requestPacket.m93278a() != 467 && requestPacket.m93278a() != 468 && requestPacket.m93278a() != 466 && requestPacket.m93278a() != 470 && requestPacket.m93278a() != 462 && requestPacket.m93278a() != 471) {
                        if (requestPacket.m93278a() == 107) {
                            this.f134349q.m99600D(requestPacket.mo93287i());
                            str6 = str16;
                        } else if (requestPacket.m93278a() == 90) {
                            m145004U0(requestPacket.mo93287i());
                            str6 = str16;
                        } else if (requestPacket.m93278a() == 109) {
                            this.f134349q.m99602G(requestPacket.mo93287i());
                            str6 = str16;
                        } else if (requestPacket.m93278a() == 135) {
                            this.f134349q.m99603I(requestPacket.mo93287i(), true);
                            str6 = str16;
                        } else if (requestPacket.m93278a() == 137) {
                            C22423y.m115857j(new InterfaceC18494a() { // from class: wh.l
                                public /* synthetic */ C29020l() {
                                }

                                @Override // en0.InterfaceC18494a
                                /* renamed from: V4 */
                                public final Object mo12V4() {
                                    String m144910F0;
                                    m144910F0 = C29021l0.m144910F0(RequestPacket.this);
                                    return m144910F0;
                                }
                            });
                            m145013e1(requestPacket.mo93287i());
                            str6 = str16;
                        } else {
                            str6 = str16;
                            if (requestPacket.m93278a() == 132) {
                                this.f134349q.m99604K(requestPacket.mo93287i());
                                str6 = str16;
                            }
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append((int) requestPacket.m93278a());
                        sb4.append("");
                        str6 = str16;
                        if (requestPacket.m93289k() == 0) {
                            try {
                                C20024r.m103937c().m103951g(requestPacket.m93278a(), requestPacket.m93291m(), requestPacket.mo93287i());
                                str6 = str16;
                            } catch (Exception e29) {
                                AbstractC23350e.m122776f(this.f134348p, e29);
                                str6 = str16;
                            }
                        }
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append((int) requestPacket.m93278a());
                    sb5.append("");
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(requestPacket.m93289k());
                    sb6.append("");
                    str6 = str16;
                    if (requestPacket.m93289k() == 0) {
                        try {
                            if (AbstractC23165o5.m119333b() && AbstractC23304d.f113266D0) {
                                long currentTimeMillis = System.currentTimeMillis() - AbstractC23304d.f113310O0;
                                if (currentTimeMillis >= 0 && currentTimeMillis < AbstractC23309i.m122339r()) {
                                    AbstractC23304d.f113310O0 = 0L;
                                    AbstractC23304d.f113266D0 = false;
                                    AbstractC23309i.m121429Sq(AbstractC23304d.f113310O0);
                                    AbstractC23309i.m121506Ut(AbstractC23304d.f113266D0);
                                } else if (AbstractC23304d.f113266D0) {
                                    AbstractC23304d.f113306N0 = 1;
                                }
                            }
                            if (requestPacket.m93278a() == 402) {
                                C7853b.m40052a0().m40138k1();
                            }
                        } catch (Exception e31) {
                            AbstractC23350e.m122776f(this.f134348p, e31);
                        }
                        try {
                            C20024r.m103937c().m103951g(requestPacket.m93278a(), requestPacket.m93291m(), requestPacket.mo93287i());
                            str6 = str16;
                            if (requestPacket.m93278a() == 402) {
                                String valueOf2 = String.valueOf(requestPacket.m93291m());
                                str6 = str16;
                                if (!TextUtils.isEmpty(valueOf2)) {
                                    str6 = str16;
                                    if (!TextUtils.isEmpty(requestPacket.mo93287i())) {
                                        C21927m.m114302u().m114368y0(valueOf2, new JSONObject(requestPacket.mo93287i()).getJSONObject("data").getLong(str16));
                                        str6 = str16;
                                    }
                                }
                            }
                        } catch (Exception e32) {
                            AbstractC23350e.m122776f(this.f134348p, e32);
                            str6 = str16;
                        }
                    }
                }
            } else {
                if (requestPacket.m93284g() != 3) {
                    str6 = str16;
                }
                if (requestPacket.m93278a() == 105) {
                    str6 = str16;
                    if (requestPacket.m93286h().length == 8) {
                        requestPacket.m93271B(105);
                        try {
                            m144992F();
                            long m93340c2 = AbstractC17522a.m93340c(requestPacket.m93286h());
                            StringBuilder sb7 = new StringBuilder();
                            if (requestPacket.m93280c() != 6) {
                                str8 = "";
                            }
                            sb7.append(str8);
                            sb7.append(requestPacket.m93279b());
                            m145014f1(m93340c2, sb7.toString());
                            str6 = str16;
                        } catch (Exception e33) {
                            AbstractC23350e.m122776f(this.f134348p, e33);
                            str6 = str16;
                        }
                    }
                } else if (requestPacket.m93278a() == 1) {
                    if (requestPacket.m93289k() == 0) {
                        C29628e.m147249E0().f89373e = true;
                        str6 = str16;
                    } else if (requestPacket.m93289k() == -1) {
                        C0832n.f2924f = true;
                        C0832n.m2179i().m2185c();
                        C29628e.m147249E0().mo93411k();
                        str6 = str16;
                    } else {
                        C29628e.m147249E0().mo93411k();
                        str6 = str16;
                    }
                } else if (requestPacket.m93278a() == 3) {
                    C29628e.m147249E0().m93412k0(requestPacket.m93289k());
                    if (requestPacket.m93289k() == -16) {
                        AbstractC20887g.m109218E(C29628e.m147249E0().m93415m(), -16, "", 9021, 0);
                        C0832n.m2180l();
                    }
                    AbstractC23351f.m122784a("SocketConnection.COMMAND_CLOSE", true);
                    str6 = str16;
                } else if (requestPacket.m93278a() == 1996) {
                    this.f134349q.m99600D(requestPacket.mo93287i());
                    str6 = str16;
                } else {
                    if (requestPacket.m93278a() != 102 && requestPacket.m93278a() != 104 && requestPacket.m93278a() != 10113 && requestPacket.m93278a() != 10116) {
                        if (requestPacket.m93278a() != 202 && requestPacket.m93278a() != 208 && requestPacket.m93278a() != 212 && requestPacket.m93278a() != 10213 && requestPacket.m93278a() != 10216) {
                            if (requestPacket.m93278a() != 203 && requestPacket.m93278a() != 209 && requestPacket.m93278a() != 213) {
                                if (requestPacket.m93278a() != 224 && requestPacket.m93278a() != 10209) {
                                    if (requestPacket.m93278a() != 121 && requestPacket.m93278a() != 10109) {
                                        if (requestPacket.m93278a() == 1782) {
                                            try {
                                                str6 = str16;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    m144990D(requestPacket.m93278a(), requestPacket.m93293o(), new JSONObject(requestPacket.mo93287i()), 0);
                                                    str6 = str16;
                                                }
                                            } catch (Exception e34) {
                                                AbstractC23350e.m122776f(this.f134348p, e34);
                                                str6 = str16;
                                            }
                                        } else if (requestPacket.m93278a() == 1787) {
                                            try {
                                                str6 = str16;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    m144990D(requestPacket.m93278a(), requestPacket.m93293o(), new JSONObject(requestPacket.mo93287i()), 1);
                                                    str6 = str16;
                                                }
                                            } catch (Exception e35) {
                                                AbstractC23350e.m122776f(this.f134348p, e35);
                                                str6 = str16;
                                            }
                                        } else if (requestPacket.m93278a() == 1991) {
                                            str6 = str16;
                                            if (C29210k.m145804c0().m145874m0()) {
                                                try {
                                                    C29210k.m145804c0().m145837I0(new JSONObject(requestPacket.mo93287i()), "SOURCE_PUSH");
                                                    str6 = str16;
                                                } catch (Exception e36) {
                                                    AbstractC23350e.m122778h(e36);
                                                    str6 = str16;
                                                }
                                            }
                                        } else if (requestPacket.m93278a() == 600) {
                                            m144998M0(requestPacket.mo93287i(), true);
                                            str6 = str16;
                                        } else if (requestPacket.m93278a() == 245) {
                                            try {
                                                str6 = str16;
                                                if (!requestPacket.mo93287i().equals("")) {
                                                    m144989C(CoreUtility.f89233i, requestPacket.m93278a(), requestPacket.m93293o(), new JSONObject(requestPacket.mo93287i()), 1, z11);
                                                    str6 = str16;
                                                }
                                            } catch (Exception e37) {
                                                AbstractC23350e.m122776f(this.f134348p, e37);
                                                str6 = str16;
                                            }
                                        } else {
                                            str6 = str16;
                                            if (requestPacket.m93278a() != 808) {
                                                str6 = str16;
                                                if (requestPacket.m93278a() != 809) {
                                                    str6 = str16;
                                                    if (requestPacket.m93278a() != 812) {
                                                        if (requestPacket.m93278a() == 1512) {
                                                            try {
                                                                str6 = str16;
                                                                if (!requestPacket.mo93287i().equals("")) {
                                                                    JSONObject jSONObject5 = new JSONObject(requestPacket.mo93287i()).getJSONObject("data");
                                                                    str6 = str16;
                                                                    if (jSONObject5 != null) {
                                                                        str6 = str16;
                                                                        if (jSONObject5.has("entries")) {
                                                                            String optString = jSONObject5.optString("lobbyId");
                                                                            JSONObject jSONObject6 = jSONObject5.getJSONObject("entries");
                                                                            str6 = str16;
                                                                            if (jSONObject6 != null) {
                                                                                ContactProfile contactProfile = new ContactProfile();
                                                                                contactProfile.f42434r = jSONObject6.isNull("userId") ? "" : jSONObject6.getString("userId");
                                                                                contactProfile.f42454x1 = jSONObject6.isNull("checkinTime") ? 0L : jSONObject6.getLong("checkinTime");
                                                                                contactProfile.f42457y1 = jSONObject6.isNull("code") ? "" : jSONObject6.getString("code");
                                                                                contactProfile.f42437s = jSONObject6.isNull("displayName") ? "" : jSONObject6.getString("displayName");
                                                                                contactProfile.f42458z = jSONObject6.isNull("status") ? "" : jSONObject6.getString("status");
                                                                                contactProfile.f42446v = jSONObject6.isNull("avatar") ? "" : jSONObject6.getString("avatar");
                                                                                contactProfile.f42449w = jSONObject6.isNull("gender") ? 0 : jSONObject6.getInt("gender");
                                                                                contactProfile.f42452x = jSONObject6.isNull("dob") ? "" : jSONObject6.getString("dob");
                                                                                if (!jSONObject6.isNull("isFriend")) {
                                                                                    jSONObject6.getInt("isFriend");
                                                                                }
                                                                                if (jSONObject6.has(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                                                                                    JSONObject jSONObject7 = jSONObject6.getJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                                                                                    if (!jSONObject7.isNull("address")) {
                                                                                        str = jSONObject7.getString("address");
                                                                                    }
                                                                                    contactProfile.m40397a1(str);
                                                                                }
                                                                                C23744a.m124114c().m124116d(30, contactProfile, optString);
                                                                                str6 = str16;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Exception e38) {
                                                                e38.printStackTrace();
                                                                str6 = str16;
                                                            }
                                                        } else if (requestPacket.m93278a() == 1513) {
                                                            try {
                                                                str6 = str16;
                                                                if (!requestPacket.mo93287i().equals("")) {
                                                                    JSONObject jSONObject8 = new JSONObject(requestPacket.mo93287i()).getJSONObject("data");
                                                                    str6 = str16;
                                                                    if (jSONObject8 != null) {
                                                                        str6 = str16;
                                                                        if (jSONObject8.has("entries")) {
                                                                            String string = jSONObject8.getString("entries");
                                                                            String optString2 = jSONObject8.optString("lobbyId");
                                                                            C23744a m124114c = C23744a.m124114c();
                                                                            Object[] objArr = new Object[2];
                                                                            try {
                                                                                objArr[0] = string;
                                                                                objArr[1] = optString2;
                                                                                m124114c.m124116d(31, objArr);
                                                                                str7 = str16;
                                                                            } catch (Exception e39) {
                                                                                e = e39;
                                                                                e.printStackTrace();
                                                                                str7 = str16;
                                                                                if (requestPacket.m93278a() != 10102) {
                                                                                }
                                                                                if (requestPacket.m93278a() != 2145) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Exception e41) {
                                                                e = e41;
                                                            }
                                                        } else if (requestPacket.m93278a() == 137) {
                                                            C22423y.m115857j(new InterfaceC18494a() { // from class: wh.w
                                                                public /* synthetic */ C29042w() {
                                                                }

                                                                @Override // en0.InterfaceC18494a
                                                                /* renamed from: V4 */
                                                                public final Object mo12V4() {
                                                                    String m144912G0;
                                                                    m144912G0 = C29021l0.m144912G0(RequestPacket.this);
                                                                    return m144912G0;
                                                                }
                                                            });
                                                            m145013e1(requestPacket.mo93287i());
                                                            str7 = str16;
                                                        } else {
                                                            str7 = str16;
                                                            if (requestPacket.m93278a() == 2) {
                                                                str7 = str16;
                                                                if (requestPacket.m93293o() == 2) {
                                                                    m144917K0(requestPacket.mo93287i(), C29628e.m147249E0().m147255F0());
                                                                    str7 = str16;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            str7 = str16;
                                            if (!requestPacket.mo93287i().equals("")) {
                                                m144989C(CoreUtility.f89233i, requestPacket.m93278a(), requestPacket.m93293o(), new JSONObject(requestPacket.mo93287i()), 0, z11);
                                                str7 = str16;
                                            }
                                        } catch (Exception e42) {
                                            AbstractC23350e.m122776f(this.f134348p, e42);
                                            str7 = str16;
                                        }
                                    }
                                } else {
                                    try {
                                        str7 = str16;
                                        if (!requestPacket.mo93287i().equals("")) {
                                            m144989C(CoreUtility.f89233i, requestPacket.m93278a(), requestPacket.m93293o(), new JSONObject(requestPacket.mo93287i()), 1, z11);
                                            str7 = str16;
                                        }
                                    } catch (Exception e43) {
                                        AbstractC23350e.m122776f(this.f134348p, e43);
                                        str7 = str16;
                                    }
                                }
                            } else {
                                this.f134349q.m99599B(requestPacket.mo93287i());
                                str7 = str16;
                            }
                        } else {
                            this.f134349q.m99612z(requestPacket.mo93287i(), requestPacket.m93278a() == 10213 || requestPacket.m93278a() == 10216);
                            str7 = str16;
                        }
                    } else {
                        this.f134349q.m99611x(requestPacket.mo93287i(), requestPacket.m93278a() == 10113 || requestPacket.m93278a() == 10116);
                        str7 = str16;
                    }
                    if (requestPacket.m93278a() != 10102) {
                        if (requestPacket.m93284g() == 2) {
                            m144925R(CoreUtility.f89233i, requestPacket.mo93287i());
                        }
                    } else if (requestPacket.m93278a() == 10115) {
                        m144920O(CoreUtility.f89233i, requestPacket.mo93287i());
                    } else if (requestPacket.m93278a() == 10103) {
                        m144927T(CoreUtility.f89233i, requestPacket.mo93287i());
                    } else if (requestPacket.m93278a() == 10201) {
                        m144942d0(requestPacket.mo93287i(), CoreUtility.f89233i, requestPacket.m93293o());
                    } else if (requestPacket.m93278a() == 10217) {
                        m144944e0(requestPacket.mo93287i(), CoreUtility.f89233i, requestPacket.m93291m());
                    } else {
                        if (requestPacket.m93278a() != 10111 && requestPacket.m93278a() != 10211) {
                            if (requestPacket.m93278a() == 10100) {
                                try {
                                    C24559a.m127933c("[E2EE]", "parsePacket: 10100 - " + requestPacket.mo93287i());
                                    JSONObject jSONObject9 = new JSONObject(requestPacket.mo93287i());
                                    long optLong2 = jSONObject9.optLong("localId");
                                    long optLong3 = jSONObject9.optLong("iid");
                                    long optLong4 = jSONObject9.optLong(str7);
                                    List m96092k = AbstractC18069a.m96092k(jSONObject9.optJSONArray("subDevice"));
                                    AbstractC0924m0.m3081Gf(optLong3 != optLong2);
                                    AbstractC0924m0.m3168Jf(optLong3);
                                    AbstractC0924m0.m3197Kf(optLong4);
                                    AbstractC0924m0.m3938jm(z15);
                                    AbstractC0924m0.m3968km(z15);
                                    C31986k3 c31986k3 = C31986k3.f147083a;
                                    c31986k3.m154095J1(m96092k);
                                    c31986k3.m154087D0();
                                } catch (Exception e44) {
                                    AbstractC23350e.m122778h(e44);
                                }
                            } else if (requestPacket.m93278a() == 10106) {
                                String mo93287i = requestPacket.mo93287i();
                                C24559a.m127933c("[E2EE]", "parsePacket: 10106 - " + mo93287i);
                                m144923Q(mo93287i);
                            } else if (requestPacket.m93278a() == 10202) {
                                m144928U(requestPacket);
                            } else if (requestPacket.m93278a() == 10218) {
                                m144921P(requestPacket.mo93287i(), CoreUtility.f89233i);
                            } else if (requestPacket.m93278a() == 10117) {
                                m144926S(requestPacket);
                            }
                        }
                        String mo93287i2 = requestPacket.mo93287i();
                        if (!TextUtils.isEmpty(mo93287i2)) {
                            C24559a.m127933c("[E2EE]", "received " + ((int) requestPacket.m93278a()) + ": " + mo93287i2);
                            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: wh.d0

                                /* renamed from: q */
                                public final /* synthetic */ String f134292q;

                                /* renamed from: r */
                                public final /* synthetic */ RequestPacket f134293r;

                                public /* synthetic */ RunnableC29005d0(String mo93287i22, RequestPacket requestPacket2) {
                                    r2 = mo93287i22;
                                    r3 = requestPacket2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C29021l0.this.m144914H0(r2, r3);
                                }
                            });
                        }
                    }
                    if (requestPacket2.m93278a() != 2145) {
                        this.f134354v.m139813q(requestPacket2.mo93287i());
                        return;
                    } else {
                        if (requestPacket2.m93278a() == 2146) {
                            this.f134354v.m139812m(requestPacket2.mo93287i());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        str7 = str6;
        z15 = z14;
        if (requestPacket2.m93278a() != 10102) {
        }
        if (requestPacket2.m93278a() != 2145) {
        }
    }

    /* renamed from: S0 */
    public void m145002S0(RequestPacket requestPacket) {
        byte[] bArr;
        try {
            if (requestPacket.m93286h() != null && requestPacket.m93286h().length > 0) {
                try {
                    bArr = AbstractC29633j.m147358g(requestPacket.m93286h());
                } catch (Exception unused) {
                    bArr = null;
                }
                if (bArr != null) {
                    requestPacket.m93303y(bArr);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(this.f134348p, e11);
        }
        try {
            if (!requestPacket.mo93287i().equals("")) {
                if (requestPacket.m93278a() == 600) {
                    m144998M0(requestPacket.mo93287i(), false);
                    return;
                }
                if (requestPacket.m93278a() != 101 && requestPacket.m93278a() != 113 && requestPacket.m93278a() != 10104) {
                    if (requestPacket.m93278a() != 201 && requestPacket.m93278a() != 207 && requestPacket.m93278a() != 10207) {
                        if (requestPacket.m93278a() == 214) {
                            m144991E(requestPacket.m93278a(), new JSONObject(requestPacket.mo93287i()), 3);
                            return;
                        }
                        if (requestPacket.m93278a() != 402 && requestPacket.m93278a() != 465) {
                            if (requestPacket.m93278a() != 405 && requestPacket.m93278a() != 426 && requestPacket.m93278a() != 428) {
                                if (requestPacket.m93278a() == 135) {
                                    this.f134349q.m99603I(requestPacket.mo93287i(), false);
                                    return;
                                }
                                return;
                            }
                            try {
                                C20024r.m103937c().m103952h(requestPacket.m93278a(), requestPacket.m93291m(), requestPacket.mo93287i());
                                return;
                            } catch (Exception e12) {
                                AbstractC23350e.m122776f(this.f134348p, e12);
                                return;
                            }
                        }
                        C7853b.m40052a0().m40138k1();
                        try {
                            C20024r.m103937c().m103952h(requestPacket.m93278a(), requestPacket.m93291m(), requestPacket.mo93287i());
                            return;
                        } catch (Exception e13) {
                            AbstractC23350e.m122776f(this.f134348p, e13);
                            return;
                        }
                    }
                    m144988B(requestPacket.m93278a(), new JSONObject(requestPacket.mo93287i()), 1);
                    return;
                }
                m144988B(requestPacket.m93278a(), new JSONObject(requestPacket.mo93287i()), 0);
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    /* renamed from: T0 */
    void m145003T0(List list) {
        try {
            ArrayList arrayList = new ArrayList(1);
            ArrayList arrayList2 = new ArrayList(1);
            JSONObject jSONObject = null;
            for (int i11 = 0; i11 < list.size(); i11++) {
                try {
                    C29012h c29012h = (C29012h) list.get(i11);
                    if (c29012h.m93278a() == 1710) {
                        JSONArray jSONArray = new JSONArray(c29012h.mo93287i());
                        JSONObject jSONObject2 = jSONObject;
                        for (int length = jSONArray.length() - 1; length >= 0; length--) {
                            try {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(length);
                                jSONObject3.optLong("id");
                                int i12 = jSONObject3.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                long j11 = jSONObject3.getLong("actid");
                                JSONObject jSONObject4 = jSONObject3.getJSONObject("item");
                                if (i12 != 1) {
                                    if (i12 != 4) {
                                        if (i12 == 5) {
                                            if (arrayList2.size() == 0) {
                                                arrayList2.add(new AbstractMap.SimpleEntry(Long.valueOf(j11), jSONObject4));
                                            } else if (j11 > ((Long) ((AbstractMap.SimpleEntry) arrayList2.get(0)).getKey()).longValue()) {
                                                arrayList2.clear();
                                                arrayList2.add(new AbstractMap.SimpleEntry(Long.valueOf(j11), jSONObject4));
                                            }
                                        }
                                    } else {
                                        jSONObject2 = new JSONObject(jSONObject4.toString());
                                    }
                                } else if (arrayList.size() == 0) {
                                    arrayList.add(new AbstractMap.SimpleEntry(Long.valueOf(j11), jSONObject4));
                                } else if (j11 > ((Long) ((AbstractMap.SimpleEntry) arrayList.get(0)).getKey()).longValue()) {
                                    arrayList.clear();
                                    arrayList.add(new AbstractMap.SimpleEntry(Long.valueOf(j11), jSONObject4));
                                }
                            } catch (Exception e11) {
                                try {
                                    AbstractC23350e.m122776f(this.f134348p, e11);
                                } catch (Exception e12) {
                                    e = e12;
                                    jSONObject = jSONObject2;
                                    e.printStackTrace();
                                }
                            }
                        }
                        jSONObject = jSONObject2;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            }
            try {
                if (arrayList.size() > 0) {
                    C17099a.m91453c().m91455e(1, (JSONObject) ((AbstractMap.SimpleEntry) arrayList.get(0)).getValue());
                }
                if (jSONObject != null) {
                    C17099a.m91453c().m91455e(6, jSONObject);
                }
            } catch (Exception e14) {
                e14.printStackTrace();
            }
            if (arrayList2.size() > 0) {
                C17099a.m91453c().m91455e(5, (JSONObject) ((AbstractMap.SimpleEntry) arrayList2.get(0)).getValue());
            }
        } catch (Exception e15) {
            AbstractC23350e.m122776f(this.f134348p, e15);
        }
    }

    /* renamed from: U0 */
    void m145004U0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = new JSONArray();
            if (!jSONObject.isNull("data")) {
                jSONArray = new JSONArray(jSONObject.getString("data"));
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    arrayList.add(new C26715g(jSONObject2));
                    jSONObject2.toString();
                    AbstractC23126l.m118627a(jSONObject2.toString());
                } catch (Exception e11) {
                    e11.toString();
                }
            }
            m145009a1(arrayList);
            m145011c1(arrayList);
        } catch (Exception e12) {
            e12.toString();
        }
    }

    /* renamed from: X0 */
    void m145005X0(JSONObject jSONObject) {
        ContactProfile m141810d;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("msg");
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11).getJSONObject("text");
                    String string = jSONObject2.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                    jSONObject3.optString("to");
                    String optString = jSONObject3.optString("fromU");
                    String optString2 = jSONObject3.optString("fromD");
                    String optString3 = jSONObject3.optString("fromA");
                    String optString4 = jSONObject3.optString("streamId");
                    if (CoreUtility.f89233i.equals(optString)) {
                        m141810d = AbstractC23304d.f113368c0;
                    } else {
                        m141810d = C28203u6.f131407a.m141810d(optString, new TrackingSource((short) 1012));
                    }
                    if (m141810d == null) {
                        m141810d = new ContactProfile(optString);
                        if (optString3 == null) {
                            optString3 = "";
                        }
                        m141810d.f42446v = optString3;
                        if (optString2 == null) {
                            optString2 = "";
                        }
                        m141810d.f42437s = optString2;
                    }
                    if (!TextUtils.isEmpty(optString4)) {
                        if ("join".equals(string)) {
                            C23744a.m124114c().m124116d(33, optString4, m141810d);
                        } else if ("leave".equals(string)) {
                            C23744a.m124114c().m124116d(34, optString4, m141810d);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(this.f134348p, e11);
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(this.f134348p, e12);
        }
    }

    /* renamed from: Y0 */
    public void m144962m0(int i11, JSONObject jSONObject, int i12) {
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (jSONObject.isNull("msg")) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("msg");
                    int length = jSONArray.length();
                    for (int i13 = 0; i13 < length; i13++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i13).getJSONObject("text");
                            String string = jSONObject2.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
                            if (jSONObject3.has("fromU")) {
                                C21927m.m114302u().m114368y0(jSONObject3.getString("fromU"), jSONObject3.getLong("ts"));
                            }
                            if (string.equals("text")) {
                                C17945a0 c17945a0 = new C17945a0(jSONObject3, 41, string, i12, false);
                                this.f134356x.m2640w("livestream_" + c17945a0.m94923J4()).m17966s0(c17945a0);
                                if (!c17945a0.m95032V6()) {
                                    C0814e0.m2073s(c17945a0.mo95039W2());
                                }
                                C23744a.m124114c().m124116d(32, c17945a0.m94923J4());
                            } else if (string.equals("heart")) {
                                String optString = jSONObject3.optString("streamId");
                                if (!TextUtils.isEmpty(optString)) {
                                    C23744a.m124114c().m124116d(35, optString);
                                }
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f(this.f134348p, e11);
                        }
                    }
                } catch (Exception e12) {
                    AbstractC20887g.m109232j(CoreUtility.f89233i, 15001, e12.toString(), System.currentTimeMillis() - currentTimeMillis, 15000, CoreUtility.f89236l);
                    AbstractC23350e.m122776f(this.f134348p, e12);
                }
            } catch (OutOfMemoryError e13) {
                AbstractC23350e.m122776f(this.f134348p, e13);
            }
        } catch (Exception e14) {
            AbstractC23350e.m122776f(this.f134348p, e14);
        }
    }

    /* renamed from: Z */
    public void m145007Z(JSONObject jSONObject, long j11, int i11) {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: wh.v

            /* renamed from: p */
            public final /* synthetic */ JSONObject f134536p;

            /* renamed from: q */
            public final /* synthetic */ long f134537q;

            /* renamed from: r */
            public final /* synthetic */ int f134538r;

            public /* synthetic */ RunnableC29040v(JSONObject jSONObject2, long j112, int i112) {
                r1 = jSONObject2;
                r2 = j112;
                r4 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.m144968p0(r1, r2, r4);
            }
        }));
    }

    /* renamed from: Z0 */
    void m145008Z0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("act");
            String optString2 = jSONObject.optString("title");
            String optString3 = jSONObject.optString("desc");
            String optString4 = jSONObject.optString("avt");
            String optString5 = jSONObject.optString("data");
            long optLong = jSONObject.optLong("expired", 0L);
            boolean optBoolean = jSONObject.optBoolean("hideAppInfo", false);
            if (!TextUtils.isEmpty(optString) && AbstractC28207v1.m141847A0(optString, jSONObject)) {
                C28023b6.m141250h0().m141317U1(optLong, optString2, optString3, optString4, AbstractC23152n3.m119027W("com.zing.zalo.action.HANDLE_ZALO_UI_EVENT.ACTION_LIST", AbstractC28207v1.m141849A2(optString, 1, optString5)), optBoolean);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:318:0x0153, code lost:            if (r9 != null) goto L457;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:            if (r7 != null) goto L402;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa A[Catch: Exception -> 0x0061, TryCatch #12 {Exception -> 0x0061, blocks: (B:7:0x0015, B:9:0x0027, B:12:0x00a2, B:14:0x00aa, B:22:0x00ce, B:25:0x0032, B:27:0x0038, B:29:0x0040, B:31:0x0046, B:33:0x0050, B:34:0x0065, B:42:0x0071, B:48:0x007a, B:50:0x0080, B:54:0x0094, B:56:0x009a, B:39:0x009f), top: B:6:0x0015, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[Catch: Exception -> 0x0061, TRY_LEAVE, TryCatch #12 {Exception -> 0x0061, blocks: (B:7:0x0015, B:9:0x0027, B:12:0x00a2, B:14:0x00aa, B:22:0x00ce, B:25:0x0032, B:27:0x0038, B:29:0x0040, B:31:0x0046, B:33:0x0050, B:34:0x0065, B:42:0x0071, B:48:0x007a, B:50:0x0080, B:54:0x0094, B:56:0x009a, B:39:0x009f), top: B:6:0x0015, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0208 A[Catch: Exception -> 0x0143, TryCatch #10 {Exception -> 0x0143, blocks: (B:73:0x00f6, B:75:0x0109, B:78:0x01d3, B:81:0x01dd, B:84:0x0200, B:86:0x0208, B:93:0x0218, B:95:0x0220, B:96:0x0228, B:98:0x0230, B:99:0x0245, B:101:0x024d, B:102:0x0262, B:104:0x026a, B:105:0x0290, B:107:0x0298, B:109:0x02a2, B:111:0x02bf, B:112:0x02c8, B:114:0x02e1, B:116:0x02e9, B:117:0x02f2, B:119:0x02fa, B:121:0x030d, B:123:0x0317, B:125:0x032b, B:126:0x0333, B:129:0x0347, B:307:0x0114, B:309:0x011a, B:311:0x0122, B:313:0x0128, B:315:0x0132, B:316:0x014d, B:324:0x015a, B:330:0x0163, B:332:0x0169, B:335:0x017c, B:337:0x0182, B:322:0x0187, B:343:0x018c, B:347:0x0198, B:351:0x01aa), top: B:72:0x00f6 }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m145009a1(ArrayList arrayList) {
        int i11;
        int i12;
        ?? r12;
        int i13;
        C26715g c26715g;
        boolean z11;
        String str;
        String[] strArr;
        String str2;
        int optInt;
        int optInt2;
        boolean z12;
        int i14;
        boolean m42064A9;
        C26715g c26715g2;
        ArrayList m153803c;
        boolean z13;
        ArrayList arrayList2 = arrayList;
        String str3 = "zam";
        while (true) {
            try {
                i12 = 4;
                r12 = 1;
                if (i11 >= arrayList.size()) {
                    break;
                }
                try {
                    c26715g2 = (C26715g) arrayList2.get(i11);
                    m153803c = C31976j8.m153803c(c26715g2.m137373c(), c26715g2.f126689h);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (m153803c != null) {
                    if (m153803c.isEmpty()) {
                        z13 = true;
                    } else {
                        z13 = false;
                        for (int i15 = 0; i15 < m153803c.size(); i15++) {
                            C31976j8 c31976j8 = (C31976j8) m153803c.get(i15);
                            if (c31976j8 != null) {
                                if (c31976j8.m153804a() == 1) {
                                    Intent launchIntentForPackage = !TextUtils.isEmpty(c31976j8.m153806d()) ? MainApplication.getAppContext().getPackageManager().getLaunchIntentForPackage(c31976j8.m153806d()) : null;
                                    if (c31976j8.m153805b() != 1) {
                                        if (c31976j8.m153805b() == 0) {
                                            if (launchIntentForPackage == null) {
                                                z13 = true;
                                            }
                                            z13 = false;
                                        }
                                    }
                                } else if (c31976j8.m153804a() == 4) {
                                    boolean m42064A92 = C7960e.m41971c6().m42064A9(c31976j8.m153807e());
                                    if (c31976j8.m153805b() == 1) {
                                        z13 = m42064A92;
                                    } else if (c31976j8.m153805b() == 0) {
                                        z13 = !m42064A92;
                                    }
                                }
                            }
                        }
                    }
                    if (c26715g2.m137377g() == 13) {
                        i11 = C7959d.m41638d1().m41747S0(1).size() < new C31937h(new JSONObject(c26715g2.m137371a())).m153489j() ? i11 + 1 : 0;
                    }
                    if (!z13) {
                        C7960e.m41971c6().m42471n4(c26715g2.m137377g());
                        C19669z.f97566N.set(false);
                        C19669z.f97567O.set(false);
                    }
                }
                z13 = false;
                if (c26715g2.m137377g() == 13) {
                }
                if (!z13) {
                }
            } catch (Exception e12) {
                AbstractC23350e.m122774d(this.f134348p, e12.toString());
                return;
            }
            AbstractC23350e.m122774d(this.f134348p, e12.toString());
            return;
        }
        int i16 = 0;
        while (i16 < arrayList.size()) {
            try {
                c26715g = (C26715g) arrayList2.get(i16);
                ArrayList m153803c2 = C31976j8.m153803c(c26715g.m137373c(), c26715g.f126689h);
                if (m153803c2 == null) {
                    z11 = false;
                } else if (m153803c2.isEmpty()) {
                    z11 = true;
                } else {
                    int i17 = 0;
                    z11 = false;
                    while (true) {
                        if (i17 < m153803c2.size()) {
                            C31976j8 c31976j82 = (C31976j8) m153803c2.get(i17);
                            if (c31976j82 != null) {
                                if (c31976j82.m153804a() == r12) {
                                    Intent launchIntentForPackage2 = !TextUtils.isEmpty(c31976j82.m153806d()) ? MainApplication.getAppContext().getPackageManager().getLaunchIntentForPackage(c31976j82.m153806d()) : null;
                                    if (c31976j82.m153805b() != r12) {
                                        if (c31976j82.m153805b() == 0) {
                                            if (launchIntentForPackage2 == null) {
                                                m42064A9 = true;
                                            }
                                            m42064A9 = false;
                                        }
                                    }
                                    z11 = m42064A9;
                                } else if (c31976j82.m153804a() == i12) {
                                    m42064A9 = C7960e.m41971c6().m42064A9(c31976j82.m153807e());
                                    if (c31976j82.m153805b() == r12) {
                                        z11 = m42064A9;
                                    } else if (c31976j82.m153805b() == 0) {
                                        z11 = !m42064A9;
                                    }
                                } else {
                                    z11 = false;
                                }
                            }
                            i17++;
                        }
                    }
                    if (z11) {
                        int m137377g = c26715g.m137377g();
                        if (m137377g == 10) {
                            i14 = 1;
                        } else if (m137377g != 51) {
                            switch (m137377g) {
                                case 12:
                                    i14 = 2;
                                    break;
                                case 13:
                                    i14 = 4;
                                    break;
                                case 14:
                                    i14 = 6;
                                    break;
                                default:
                                    i14 = -1;
                                    break;
                            }
                        } else {
                            i14 = 5;
                        }
                        if (i14 != -1) {
                            C28905e.m144373n().m144398t(String.valueOf(c26715g.m137372b()), 1, i14, String.valueOf(c26715g.m137372b()), -1, C23793c.m124316k().mo124311f(), "");
                        }
                    }
                }
            } catch (Exception e13) {
                e = e13;
                i13 = i16;
            }
            if (c26715g.m137377g() == 13) {
                if (C7959d.m41638d1().m41747S0(r12).size() < new C31937h(new JSONObject(c26715g.m137371a())).m153489j()) {
                    if (c26715g.m137377g() == 10) {
                        AbstractC23647d.m123907q("2102", "");
                        AbstractC23647d.m123893c();
                    }
                    i13 = i16;
                    arrayList2 = arrayList;
                    i16 = i13 + 1;
                    i12 = 4;
                    r12 = 1;
                }
            }
            if (z11) {
                if (c26715g.m137377g() == 10) {
                    AbstractC23647d.m123907q("2101", "");
                    AbstractC23647d.m123893c();
                }
                if (c26715g.m137377g() == 10) {
                    C7960e.m41971c6().m42391f9(c26715g);
                    C19669z.f97566N.set(false);
                    C19669z.m103146Y().m103198O0();
                } else if (c26715g.m137377g() == 14) {
                    C7960e.m41971c6().m42391f9(c26715g);
                    C19669z.f97566N.set(false);
                    C19669z.m103146Y().m103198O0();
                } else if (c26715g.m137377g() == 11) {
                    C7960e.m41971c6().m42528s3();
                    AbstractC23309i.m122149lx(false);
                    AbstractC23309i.m121960gx(false);
                    C19669z.f97566N.set(false);
                    C19669z.f97567O.set(false);
                    C19669z.m103146Y().m103198O0();
                    AbstractC23181q.m119435h();
                    AbstractC23181q.m119434g();
                } else if (c26715g.m137377g() == 61) {
                    String m137371a = c26715g.m137371a();
                    if (!TextUtils.isEmpty(m137371a)) {
                        C31937h c31937h = new C31937h(new JSONObject(m137371a));
                        C7960e.m41971c6().m42471n4(c31937h.m153482c());
                        if (c31937h.m153495p() == 51) {
                            z12 = false;
                            AbstractC23309i.m122149lx(false);
                            AbstractC23309i.m121960gx(false);
                        } else {
                            z12 = false;
                        }
                        C19669z.f97566N.set(z12);
                        C19669z.f97567O.set(z12);
                        C19669z.m103146Y().m103198O0();
                        AbstractC23181q.m119435h();
                        AbstractC23181q.m119434g();
                    }
                } else if (c26715g.m137377g() == 12) {
                    C7960e.m41971c6().m42391f9(c26715g);
                } else if (c26715g.m137377g() == 51) {
                    C7960e.m41971c6().m42391f9(c26715g);
                    AbstractC23309i.m122149lx(r12);
                    AbstractC23181q.m119435h();
                    if (c26715g.m137371a() != null && !c26715g.m137371a().equals("") && new C31937h(new JSONObject(c26715g.m137371a())).m153492m() == r12) {
                        AbstractC23309i.m121960gx(r12);
                        AbstractC23181q.m119434g();
                    }
                } else {
                    if (c26715g.m137377g() == 20) {
                        i13 = i16;
                        try {
                            C31937h c31937h2 = new C31937h(new JSONObject(c26715g.m137371a()));
                            if (c31937h2.m153495p() == 1) {
                                JSONObject jSONObject = new JSONObject(c31937h2.m153491l());
                                String string = jSONObject.isNull("pkgname") ? "" : jSONObject.getString("pkgname");
                                if (!TextUtils.isEmpty(string)) {
                                    MainApplication.getAppContext().getPackageManager().getLaunchIntentForPackage(string);
                                    String str4 = "{\"pkgname\":" + JSONObject.quote(string) + ",\"isinstalled\":" + (AbstractC23933a.m125287b(MainApplication.getAppContext(), string, false) ? 1 : 0) + "}";
                                    if (!TextUtils.isEmpty(str4) && c26715g.m137374d() == 1) {
                                        m145012d1(c26715g.m137372b(), str4);
                                    }
                                }
                            }
                        } catch (Exception e14) {
                            e = e14;
                            e.printStackTrace();
                            arrayList2 = arrayList;
                            i16 = i13 + 1;
                            i12 = 4;
                            r12 = 1;
                        }
                    } else {
                        i13 = i16;
                        if (c26715g.m137377g() == 22) {
                            try {
                                C31937h c31937h3 = new C31937h(new JSONObject(c26715g.m137371a()));
                                if (c31937h3.m153495p() == 1) {
                                    JSONObject jSONObject2 = new JSONObject(c31937h3.m153491l());
                                    String[] split = (jSONObject2.isNull("pkgname") ? "" : jSONObject2.getString("pkgname")).split("\\|");
                                    StringBuilder sb2 = new StringBuilder();
                                    if (split.length > 0) {
                                        sb2.append("[");
                                        int length = split.length;
                                        int i18 = 0;
                                        while (i18 < length) {
                                            try {
                                                String trim = split[i18].trim();
                                                if (TextUtils.isEmpty(trim)) {
                                                    strArr = split;
                                                    str2 = str3;
                                                } else {
                                                    strArr = split;
                                                    try {
                                                        MainApplication.getAppContext().getPackageManager().getLaunchIntentForPackage(trim);
                                                        str2 = str3;
                                                        try {
                                                            boolean m125287b = AbstractC23933a.m125287b(MainApplication.getAppContext(), trim, false);
                                                            sb2.append("{");
                                                            sb2.append("\"pkgname\":");
                                                            sb2.append(JSONObject.quote(trim));
                                                            sb2.append(",");
                                                            sb2.append("\"isinstalled\":");
                                                            sb2.append(m125287b ? 1 : 0);
                                                            sb2.append("}");
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            try {
                                                                e.printStackTrace();
                                                                i18++;
                                                                split = strArr;
                                                                str3 = str2;
                                                            } catch (Exception e16) {
                                                                e = e16;
                                                                str3 = str2;
                                                                e.printStackTrace();
                                                                arrayList2 = arrayList;
                                                                i16 = i13 + 1;
                                                                i12 = 4;
                                                                r12 = 1;
                                                            }
                                                        }
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        str2 = str3;
                                                        e.printStackTrace();
                                                        i18++;
                                                        split = strArr;
                                                        str3 = str2;
                                                    }
                                                }
                                                if (i18 != length - 1) {
                                                    sb2.append(",");
                                                }
                                            } catch (Exception e18) {
                                                e = e18;
                                                strArr = split;
                                            }
                                            i18++;
                                            split = strArr;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        sb2.append("]");
                                    } else {
                                        str = str3;
                                    }
                                    String sb3 = sb2.toString();
                                    if (!TextUtils.isEmpty(sb3) && c26715g.m137374d() == 1) {
                                        m145012d1(c26715g.m137372b(), sb3);
                                    }
                                } else {
                                    str = str3;
                                }
                            } catch (Exception e19) {
                                e = e19;
                            }
                        } else {
                            str = str3;
                            if (c26715g.m137377g() == 21) {
                                m145010b1(c26715g.m137372b());
                            } else if (c26715g.m137377g() == 30) {
                                ArrayList m42519r5 = C7960e.m41971c6().m42519r5(CoreUtility.f89233i);
                                if (m42519r5.size() > 0) {
                                    StringBuilder sb4 = new StringBuilder();
                                    int size = m42519r5.size();
                                    for (int i19 = 0; i19 < size; i19++) {
                                        C3245i c3245i = (C3245i) m42519r5.get(i19);
                                        if (i19 != size - 1) {
                                            sb4.append(c3245i.m16463e());
                                            sb4.append(";");
                                        } else {
                                            sb4.append("");
                                            sb4.append(c3245i.m16463e());
                                        }
                                    }
                                    String sb5 = sb4.toString();
                                    if (!TextUtils.isEmpty(sb5) && c26715g.m137374d() == 1) {
                                        m145012d1(c26715g.m137372b(), sb5);
                                    }
                                }
                            } else {
                                if (c26715g.m137377g() == 13) {
                                    try {
                                        c26715g.m137378h(C31937h.m153480b(new C31937h(new JSONObject(c26715g.m137371a()))));
                                        C7960e.m41971c6().m42391f9(c26715g);
                                        try {
                                            C19669z.f97567O.set(false);
                                            C19669z.m103146Y().m103198O0();
                                        } catch (Exception e21) {
                                            e = e21;
                                            str3 = str;
                                            e.printStackTrace();
                                            arrayList2 = arrayList;
                                            i16 = i13 + 1;
                                            i12 = 4;
                                            r12 = 1;
                                        }
                                    } catch (Exception e22) {
                                        e = e22;
                                    }
                                } else if (c26715g.m137377g() == 43) {
                                    String m102982h0 = AbstractC19646n0.m102982h0();
                                    if (!TextUtils.isEmpty(m102982h0) && c26715g.m137374d() == 1) {
                                        m145012d1(c26715g.m137372b(), m102982h0);
                                    }
                                } else {
                                    if (c26715g.m137377g() == 62) {
                                        JSONObject jSONObject3 = new JSONObject(c26715g.m137371a());
                                        if (!jSONObject3.isNull("effect") && ((optInt2 = jSONObject3.optInt("effect", -1)) == 0 || optInt2 == 1)) {
                                            AbstractC23309i.m120954Fw(optInt2 == 1);
                                        }
                                        if (!jSONObject3.isNull("seasonalSticker") && ((optInt = jSONObject3.optInt("seasonalSticker", -1)) == 0 || optInt == 1)) {
                                            AbstractC23309i.m120991Gw(optInt == 1);
                                        }
                                        if (!jSONObject3.isNull("onlineFriend")) {
                                            int optInt3 = jSONObject3.optInt("onlineFriend", -1);
                                            if (optInt3 != 0) {
                                                if (optInt3 == 1) {
                                                }
                                            }
                                            AbstractC23309i.m121472Tw(optInt3);
                                        }
                                        str3 = str;
                                        try {
                                            if (!jSONObject3.isNull(str3)) {
                                                try {
                                                    AbstractC25803k.m132966f(jSONObject3.optInt(str3, -1) == 1);
                                                } catch (Exception e23) {
                                                    e = e23;
                                                    e.printStackTrace();
                                                    arrayList2 = arrayList;
                                                    i16 = i13 + 1;
                                                    i12 = 4;
                                                    r12 = 1;
                                                }
                                            }
                                        } catch (Exception e24) {
                                            e = e24;
                                            e.printStackTrace();
                                            arrayList2 = arrayList;
                                            i16 = i13 + 1;
                                            i12 = 4;
                                            r12 = 1;
                                        }
                                    } else {
                                        str3 = str;
                                        if (c26715g.m137377g() == 63) {
                                            this.f134350r.m122710g();
                                        }
                                    }
                                    arrayList2 = arrayList;
                                    i16 = i13 + 1;
                                    i12 = 4;
                                    r12 = 1;
                                }
                                str3 = str;
                                arrayList2 = arrayList;
                                i16 = i13 + 1;
                                i12 = 4;
                                r12 = 1;
                            }
                        }
                        str3 = str;
                    }
                    arrayList2 = arrayList;
                    i16 = i13 + 1;
                    i12 = 4;
                    r12 = 1;
                }
                i13 = i16;
                arrayList2 = arrayList;
                i16 = i13 + 1;
                i12 = 4;
                r12 = 1;
            }
            if (c26715g.m137377g() == 10) {
            }
            i13 = i16;
            arrayList2 = arrayList;
            i16 = i13 + 1;
            i12 = 4;
            r12 = 1;
        }
    }

    /* renamed from: b1 */
    public void m145010b1(long j11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: wh.k0

            /* renamed from: q */
            public final /* synthetic */ long f134344q;

            public /* synthetic */ RunnableC29019k0(long j112) {
                r2 = j112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144915I0(r2);
            }
        });
    }

    /* renamed from: c1 */
    public void m145011c1(ArrayList arrayList) {
        try {
            if (arrayList.size() > 0) {
                C29037t0 c29037t0 = new C29037t0(null);
                c29037t0.m110304b0(true);
                c29037t0.f103775r = 2;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    try {
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(((C26715g) arrayList.get(i11)).m137372b()));
                    } catch (IOException e11) {
                        AbstractC23350e.m122774d(this.f134348p, e11.toString());
                    } catch (NumberFormatException e12) {
                        AbstractC23350e.m122774d(this.f134348p, e12.toString());
                    }
                }
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93301w((byte) 1);
                requestPacket.m93302x((byte) 0);
                requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestPacket.m93274E((byte) 3);
                requestPacket.m93295q((short) 90);
                requestPacket.m93275F((byte) 0);
                requestPacket.m93303y(byteArrayOutputStream.toByteArray());
                c29037t0.m110313i0(requestPacket);
                if (C23055e5.m118271f()) {
                    C0829l0.m2174c(c29037t0);
                }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122774d(this.f134348p, e13.toString());
        }
    }

    /* renamed from: d1 */
    public void m145012d1(long j11, String str) {
        try {
            C29037t0 c29037t0 = new C29037t0(null);
            c29037t0.m110304b0(true);
            c29037t0.f103775r = 2;
            byte[] bytes = str.getBytes("UTF-8");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(AbstractC17522a.m93346i(j11));
            byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
            byteArrayOutputStream.write(bytes);
            RequestPacket requestPacket = new RequestPacket();
            requestPacket.m93301w((byte) 1);
            requestPacket.m93302x((byte) 0);
            requestPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
            requestPacket.m93274E((byte) 3);
            requestPacket.m93295q((short) 91);
            requestPacket.m93275F((byte) 0);
            requestPacket.m93303y(byteArrayOutputStream.toByteArray());
            c29037t0.m110313i0(requestPacket);
            if (C23055e5.m118271f()) {
                C0829l0.m2174c(c29037t0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d(this.f134348p, e11.toString());
        }
    }

    /* renamed from: e1 */
    public void m145013e1(String str) {
        boolean z11;
        C0766k c0766k;
        String valueOf;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i11 = 0;
            int i12 = 1;
            if (jSONObject.optInt("isGroup", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("seens");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                int i13 = 0;
                while (i13 < length) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i13);
                    if (jSONObject2 != null) {
                        LinkedList linkedList = new LinkedList();
                        int optInt = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
                        try {
                            try {
                                JSONArray optJSONArray2 = jSONObject2.optJSONArray("data");
                                if (optJSONArray2 != null && (optInt == i12 || optInt == 32768)) {
                                    int length2 = optJSONArray2.length();
                                    for (int i14 = 0; i14 < length2; i14++) {
                                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i14);
                                        if (jSONObject3 != null) {
                                            int optInt2 = jSONObject3.optInt("id");
                                            long optLong = jSONObject3.optLong("msgId");
                                            linkedList.add(new C1483e(Integer.valueOf(optInt2), Long.valueOf(optLong)));
                                            if (z11) {
                                                valueOf = "group_" + optInt2;
                                            } else {
                                                valueOf = String.valueOf(optInt2);
                                            }
                                            C24261h.m126630v().m126646l(valueOf, optLong);
                                        }
                                    }
                                }
                                c0766k = new C0766k();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                c0766k = new C0766k();
                            }
                            c0766k.m1870t0(linkedList, z11, optInt, null);
                        } catch (Throwable th2) {
                            new C0766k().m1870t0(linkedList, z11, optInt, null);
                            throw th2;
                        }
                    }
                    i13++;
                    i11 = 0;
                    i12 = 1;
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m145014f1(long j11, String str) {
        MessageId m41037d = MessageId.m41037d(j11, 0L, str, "");
        if (m41037d == null) {
            return;
        }
        C17945a0 c17945a0 = null;
        try {
            C3535c m2634q = this.f134356x.m2634q(str);
            if (m2634q != null) {
                List m17941F0 = m2634q.m17941F0();
                for (int i11 = 0; i11 < m17941F0.size(); i11++) {
                    if (((C17945a0) m17941F0.get(i11)).m95135f9(m41037d)) {
                        C17945a0 c17945a02 = (C17945a0) m17941F0.get(i11);
                        try {
                            c17945a02.m95016Ta(1);
                            C23744a.m124114c().m124116d(4, new Object[0]);
                            C0814e0.m2056b(c17945a02);
                            c17945a0 = c17945a02;
                        } catch (Exception e11) {
                            e = e11;
                            c17945a0 = c17945a02;
                            AbstractC20110a.m104539h(e);
                            if (c17945a0 == null) {
                            }
                            c17945a0.m95193lc(1);
                        }
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (c17945a0 == null) {
            c17945a0 = new C17945a0.w(m41037d, 0).m95365a();
        }
        c17945a0.m95193lc(1);
    }

    /* renamed from: g0 */
    public void m145015g0(RequestPacket requestPacket, boolean z11) {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: wh.i0

            /* renamed from: q */
            public final /* synthetic */ boolean f134329q;

            /* renamed from: r */
            public final /* synthetic */ RequestPacket f134330r;

            public /* synthetic */ RunnableC29015i0(boolean z112, RequestPacket requestPacket2) {
                r2 = z112;
                r3 = requestPacket2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29021l0.this.m144974s0(r2, r3);
            }
        }));
    }

    /* renamed from: h0 */
    public void m145016h0(RequestPacket requestPacket, List list) {
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 73 && c.f134362a[((EnumC30982b) objArr[0]).ordinal()] == 1) {
            m144994J0();
        }
    }
}
