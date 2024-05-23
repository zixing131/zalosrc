package ag0;

import ae.C0766k;
import am.AbstractC0908e0;
import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import b50.C2556d;
import bi.C2806e;
import ck.C3560a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17525d;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import en0.InterfaceC18509p;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.util.ArrayList;
import jm.AbstractC21289a;
import km0.AbstractC21767b;
import kotlin.coroutines.Continuation;
import me0.AbstractC23047d8;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23148n;
import me0.AbstractC23153n4;
import me0.AbstractC23204s0;
import me0.C23055e5;
import me0.C23219t4;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import mm0.AbstractC23355j;
import nh0.C23793c;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONObject;
import p131ei.C18434b;
import p135em.C18489c;
import p173fz.C19172a;
import p207he.AbstractC20019m;
import p248iy.AbstractC20886f;
import p248iy.AbstractC20887g;
import p248iy.C20882b;
import p320ld.C22436h;
import p320ld.C22447s;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p379o3.AbstractRunnableC23992c;
import p588vw.C28652r;
import p609wh.AbstractC29039u0;
import p609wh.C29021l0;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p645xh.C29630g;
import p645xh.C29632i;
import p716zh.C31986k3;
import pr.C24906b;
import r30.C25641k;
import s00.AbstractC26080o;
import s00.C26076k;
import si.C26263i;
import th.AbstractC26683d;
import th.AbstractC26684e;
import th.C26688i;
import vg.C28023b6;
import ws.C29210k;
import zm.voip.service.C32246a;

/* renamed from: ag0.n */
/* loaded from: classes.dex */
public final class C0832n {

    /* renamed from: e */
    private static volatile C0832n f2923e;

    /* renamed from: a */
    int f2927a = 0;

    /* renamed from: b */
    int f2928b = 0;

    /* renamed from: c */
    final Object f2929c = new Object();

    /* renamed from: d */
    public static final int[] f2922d = {ZAbstractBase.ZVU_PROCESS_FLUSH, AbstractC26080o.a.f124275b, 10000, 20000, 30000, 60000};

    /* renamed from: f */
    public static boolean f2924f = false;

    /* renamed from: g */
    public static boolean f2925g = false;

    /* renamed from: h */
    public static boolean f2926h = false;

    /* renamed from: ag0.n$a */
    /* loaded from: classes6.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ long f2930a;

        a(long j11) {
            this.f2930a = j11;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:1|4|7|8|9|(6:20|(1:22)|23|(8:25|(1:27)|28|(1:30)|31|(2:35|(1:37))|38|(2:42|(1:46)))|48|(2:50|51)(1:53))|96|58|59|(1:61)|62|(3:65|66|(3:68|(1:70)(1:85)|(4:76|78|79|80)))|64|23|(0)|48|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x003d, code lost:            if (r2 == 2028) goto L140;     */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x003f, code lost:            switch(r2) {            case 2001: goto L139;            case 2002: goto L138;            case 2003: goto L137;            case 2004: goto L136;            default: goto L135;        };     */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0042, code lost:            r7 = 0;     */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x006f, code lost:            r3 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0070, code lost:            r3.printStackTrace();     */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0044, code lost:            r7 = 9017;     */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0049, code lost:            r7 = 9016;     */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x004e, code lost:            r7 = 9019;     */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0053, code lost:            r7 = 9018;     */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0058, code lost:            r7 = 9022;     */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0132 A[Catch: Exception -> 0x0038, TryCatch #3 {Exception -> 0x0038, blocks: (B:9:0x000a, B:20:0x0027, B:22:0x002f, B:23:0x0125, B:25:0x0132, B:27:0x013c, B:28:0x013e, B:30:0x015e, B:31:0x0169, B:33:0x016d, B:35:0x0177, B:37:0x0182, B:38:0x0185, B:40:0x018c, B:42:0x0194, B:44:0x01a6, B:46:0x01ac, B:90:0x0070, B:61:0x0075, B:84:0x011b, B:64:0x011e, B:59:0x0061), top: B:8:0x000a, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            int m104491c;
            JSONObject jSONObject;
            synchronized (C0832n.this.f2929c) {
                C0832n.f2925g = false;
            }
            try {
                m104491c = c20096c.m104491c();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (m104491c != 2003 && m104491c != 2004 && m104491c != 2001 && m104491c != 2002 && m104491c != 2020 && m104491c != 2028) {
                if (!CoreUtility.f89235k.get()) {
                    C0832n.this.f2928b++;
                }
                C0832n.this.f2927a++;
                if (C23055e5.m118271f()) {
                    C0832n c0832n = C0832n.this;
                    int i11 = c0832n.f2927a;
                    int[] iArr = C0832n.f2922d;
                    if (i11 > iArr.length - 1) {
                        c0832n.f2927a = 0;
                    }
                    int i12 = iArr[c0832n.f2927a];
                    C29628e m147249E0 = C29628e.m147249E0();
                    Context appContext = MainApplication.getAppContext();
                    int i13 = i12 + AbstractC26080o.a.f124275b;
                    m147249E0.m147287p1(appContext, i13);
                    C29630g.m147299E0().m147316S0(MainApplication.getAppContext(), i13);
                    if (AbstractC26684e.f126408a) {
                        C29632i.m147326E0().m147343S0(MainApplication.getAppContext(), i13);
                    }
                    if (C0832n.f2924f && !C29628e.m147249E0().m93432x()) {
                        C0832n c0832n2 = C0832n.this;
                        if (c0832n2.f2927a > 2) {
                            c0832n2.m2198w();
                        }
                    }
                    if (C0832n.this.f2928b >= 3 && !CoreUtility.f89235k.get()) {
                        long m121371R5 = AbstractC23309i.m121371R5();
                        long currentTimeMillis = System.currentTimeMillis();
                        long m121633Y8 = AbstractC23309i.m121633Y8();
                        if (AbstractC23309i.m121330Q1() && currentTimeMillis - m121371R5 > m121633Y8) {
                            ArrayList m147353b = AbstractC29633j.m147353b();
                            ArrayList m147354c = AbstractC29633j.m147354c();
                            String m147352a = AbstractC29633j.m147352a();
                            NetworkHelper.m48302k().m48309f(AbstractC23204s0.m119555f(), Integer.parseInt(CoreUtility.f89233i), AbstractC20887g.m109224b(), String.valueOf(CoreUtility.f89236l));
                            NetworkHelper.m48302k().m48313j();
                            NetworkHelper.m48302k().m48308e(AbstractC20626a.m107390f());
                            NetworkHelper.m48302k().m48307d(m147352a);
                            NetworkHelper.m48302k().m48306c(m147354c);
                            NetworkHelper.m48302k().m48305b(m147353b);
                            AbstractC23309i.m122255oq(currentTimeMillis);
                        }
                    }
                }
                if (c20096c.m104491c() != 50001) {
                    C18489c.m97852r(true);
                    return;
                }
                return;
            }
            int i14 = 9031;
            AbstractC20887g.m109232j(CoreUtility.f89233i, i14, "", 0L, 9021, CoreUtility.f89236l);
            if (m104491c == 2020) {
                ToastUtils.m89263k(c20096c);
            }
            C3560a c3560a = null;
            if (m104491c == 2003) {
                try {
                    if (!TextUtils.isEmpty(c20096c.m104490b())) {
                        JSONObject jSONObject2 = new JSONObject(c20096c.m104490b());
                        if (!jSONObject2.isNull("data")) {
                            jSONObject = jSONObject2.getJSONObject("data");
                        } else {
                            jSONObject = null;
                        }
                        if (jSONObject != null && !jSONObject.isNull("hasMsg") && jSONObject.getInt("hasMsg") == 1) {
                            C3560a c3560a2 = new C3560a();
                            try {
                                c3560a2.m18091e(0);
                                c3560a2.m18090d(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_lock_account_kickout));
                                c3560a2.m18089c(jSONObject.getString("message"));
                                c3560a2.f15070d = jSONObject.optString("lockAccountToken", "");
                                c3560a2.f15071e = jSONObject.optInt("lockType", 0);
                                c3560a2.f15074h = jSONObject.optInt("countDown", 10);
                                c3560a2.f15072f = jSONObject.optInt("smsGateway", 0);
                                c3560a2.f15073g = jSONObject.optString("smsSend", "");
                                c3560a2.f15075i = AbstractC23304d.f113368c0.f42455y;
                                c3560a2.f15076j = AbstractC23304d.f113410m0;
                                c3560a2.f15077k = jSONObject.optLong("timeout", 0L);
                                c3560a2.f15078l = jSONObject.optInt("showDisablePasswordOption", 1);
                                c3560a = c3560a2;
                            } catch (Exception e12) {
                                e = e12;
                                c3560a = c3560a2;
                                AbstractC23350e.m122778h(e);
                                C0832n.m2181m(c3560a);
                                C0832n.this.f2928b = 0;
                                C0832n.this.f2927a++;
                                if (C23055e5.m118271f()) {
                                }
                                if (c20096c.m104491c() != 50001) {
                                }
                            }
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            }
            C0832n.m2181m(c3560a);
            C0832n.this.f2928b = 0;
            C0832n.this.f2927a++;
            if (C23055e5.m118271f()) {
            }
            if (c20096c.m104491c() != 50001) {
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            synchronized (C0832n.this.f2929c) {
                C0832n.f2925g = false;
            }
            C0832n c0832n = C0832n.this;
            c0832n.f2927a = 0;
            c0832n.f2928b = 0;
            AbstractC23153n4.m119137m(obj, this.f2930a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.n$b */
    /* loaded from: classes6.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                CoreUtility.f89240p = "";
                CoreUtility.f89241q = "";
                AbstractC17526e.m93372w0(CoreUtility.f89240p, CoreUtility.f89241q);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj instanceof JSONObject) {
                try {
                    JSONObject jSONObject = new JSONObject(((JSONObject) obj).optString("data", "{}"));
                    if (jSONObject.has("keySet")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("keySet");
                        CoreUtility.f89240p = jSONObject2.optString("keySetId", "");
                        CoreUtility.f89241q = jSONObject2.optString("keySetValue", "");
                        AbstractC0908e0.m2825s("KEY_STRING_SOCKET_PRO_V1_KEY_SET_ID_" + CoreUtility.f89233i, CoreUtility.f89240p, true);
                        AbstractC0908e0.m2825s("KEY_STRING_SOCKET_PRO_V1_KEY_SET_VALUE_" + CoreUtility.f89233i, CoreUtility.f89241q, true);
                        AbstractC17526e.m93372w0(CoreUtility.f89240p, CoreUtility.f89241q);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ag0.n$c */
    /* loaded from: classes6.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj instanceof JSONObject) {
                try {
                    JSONObject jSONObject = new JSONObject(((JSONObject) obj).getString("data"));
                    if (jSONObject.has("commServers")) {
                        ArrayList arrayList = new ArrayList();
                        JSONArray jSONArray = jSONObject.getJSONArray("commServers");
                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            if (jSONObject2.has("host") && jSONObject2.has("port")) {
                                String string = jSONObject2.getString("host");
                                int i12 = jSONObject2.getInt("port");
                                long optLong = jSONObject2.optLong("key", 0L);
                                String optString = jSONObject2.optString("pubKey", "");
                                if (!TextUtils.isEmpty(string) && i12 > 0) {
                                    arrayList.add(new C18489c(C7962g.c.a.COM, string, i12, optLong, optString));
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            C18489c.m97854t(C7962g.c.a.COM, arrayList);
                        }
                    }
                    if (jSONObject.has("uploadServers")) {
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray("uploadServers");
                        for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i13);
                            if (jSONObject3.has("host") && jSONObject3.has("port")) {
                                String string2 = jSONObject3.getString("host");
                                int i14 = jSONObject3.getInt("port");
                                long optLong2 = jSONObject3.optLong("key", 0L);
                                if (!TextUtils.isEmpty(string2) && i14 > 0) {
                                    arrayList2.add(new C18489c(C7962g.c.a.UPLOAD, string2, i14, optLong2));
                                }
                            }
                        }
                        if (arrayList2.size() > 0) {
                            C18489c.m97854t(C7962g.c.a.UPLOAD, arrayList2);
                        }
                    }
                    if (jSONObject.has("videouploadServers")) {
                        ArrayList arrayList3 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject.getJSONArray("videouploadServers");
                        for (int i15 = 0; i15 < jSONArray3.length(); i15++) {
                            JSONObject jSONObject4 = jSONArray3.getJSONObject(i15);
                            if (jSONObject4.has("host") && jSONObject4.has("port")) {
                                String string3 = jSONObject4.getString("host");
                                int i16 = jSONObject4.getInt("port");
                                long optLong3 = jSONObject4.optLong("key", 0L);
                                if (!TextUtils.isEmpty(string3) && i16 > 0) {
                                    arrayList3.add(new C18489c(C7962g.c.a.VIDEO_UPLOAD, string3, i16, optLong3));
                                }
                            }
                        }
                        if (arrayList3.size() > 0) {
                            C18489c.m97854t(C7962g.c.a.VIDEO_UPLOAD, arrayList3);
                        }
                    }
                    C29628e.m147249E0().m147272Z0();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    private C0832n() {
    }

    /* renamed from: e */
    private void m2178e(int i11) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ag0.m

            /* renamed from: q */
            public final /* synthetic */ int f2919q;

            public /* synthetic */ RunnableC0830m(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0832n.this.m2182n(r2);
            }
        });
    }

    /* renamed from: i */
    public static synchronized C0832n m2179i() {
        C0832n c0832n;
        synchronized (C0832n.class) {
            try {
                if (f2923e == null) {
                    synchronized (C0832n.class) {
                        try {
                            if (f2923e == null) {
                                f2923e = new C0832n();
                            }
                        } finally {
                        }
                    }
                }
                c0832n = f2923e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0832n;
    }

    /* renamed from: l */
    public static void m2180l() {
        m2181m(null);
    }

    /* renamed from: m */
    public static void m2181m(C3560a c3560a) {
        Exception e11;
        boolean z11;
        try {
            Intent intent = new Intent();
            intent.setAction("com.zing.zalo.ACTION_EXIT");
            MainApplication.getAppContext().sendBroadcast(intent);
            z11 = !TextUtils.isEmpty(AbstractC23309i.m121738b1());
            try {
                AbstractC23148n.m118852z();
                AbstractC23138m0.m118772d(true, c3560a, true);
            } catch (Exception e12) {
                e11 = e12;
                try {
                    AbstractC23350e.m122778h(e11);
                    if (!z11) {
                    } else {
                        return;
                    }
                } catch (Exception e13) {
                    AbstractC23350e.m122778h(e13);
                    return;
                }
            }
        } catch (Exception e14) {
            e11 = e14;
            z11 = true;
        }
        if (!z11 && c3560a != null) {
            if (c3560a.f15077k >= 1 && System.currentTimeMillis() >= c3560a.f15077k) {
                return;
            }
            C28023b6.m141250h0().m141284F1(c3560a);
        }
    }

    /* renamed from: n */
    public /* synthetic */ void m2182n(int i11) {
        try {
            m2187f(i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    public static /* synthetic */ Object m2183o(JSONObject jSONObject, Continuation continuation) {
        AbstractC23153n4.m119085A(jSONObject, false, false);
        AbstractC23148n.m118837k(jSONObject);
        return Boolean.TRUE;
    }

    /* renamed from: r */
    public static void m2184r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("socketServers")) {
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("socketServers");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    if (jSONObject2.has("host") && jSONObject2.has("port")) {
                        String string = jSONObject2.getString("host");
                        int i12 = jSONObject2.getInt("port");
                        long optLong = jSONObject2.optLong("key", 0L);
                        String optString = jSONObject2.optString("pubKey", "");
                        if (!TextUtils.isEmpty(string) && i12 > 0) {
                            arrayList.add(new C18489c(C7962g.c.a.COM, string, i12, optLong, optString));
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    C18489c.m97854t(C7962g.c.a.COM, arrayList);
                }
            }
            if (jSONObject.has("uploadServers")) {
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray2 = jSONObject.getJSONArray("uploadServers");
                for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i13);
                    if (jSONObject3.has("host") && jSONObject3.has("port")) {
                        String string2 = jSONObject3.getString("host");
                        int i14 = jSONObject3.getInt("port");
                        long optLong2 = jSONObject3.optLong("key", 0L);
                        if (!TextUtils.isEmpty(string2) && i14 > 0) {
                            arrayList2.add(new C18489c(C7962g.c.a.UPLOAD, string2, i14, optLong2));
                        }
                    }
                }
                if (arrayList2.size() > 0) {
                    C18489c.m97854t(C7962g.c.a.UPLOAD, arrayList2);
                }
            }
            if (jSONObject.has("socketSipServers")) {
                ArrayList arrayList3 = new ArrayList();
                JSONArray jSONArray3 = jSONObject.getJSONArray("socketSipServers");
                for (int i15 = 0; i15 < jSONArray3.length(); i15++) {
                    JSONObject jSONObject4 = jSONArray3.getJSONObject(i15);
                    if (jSONObject4.has("host") && jSONObject4.has("port")) {
                        String string3 = jSONObject4.getString("host");
                        int i16 = jSONObject4.getInt("port");
                        if (!TextUtils.isEmpty(string3) && i16 > 0) {
                            arrayList3.add(new C18489c(C7962g.c.a.SIP, string3, i16));
                        }
                    }
                }
                if (arrayList3.size() > 0) {
                    C18489c.m97854t(C7962g.c.a.SIP, arrayList3);
                }
            }
            if (jSONObject.has("videouploadServers")) {
                ArrayList arrayList4 = new ArrayList();
                JSONArray jSONArray4 = jSONObject.getJSONArray("videouploadServers");
                for (int i17 = 0; i17 < jSONArray4.length(); i17++) {
                    JSONObject jSONObject5 = jSONArray4.getJSONObject(i17);
                    if (jSONObject5.has("host") && jSONObject5.has("port")) {
                        String string4 = jSONObject5.getString("host");
                        int i18 = jSONObject5.getInt("port");
                        long optLong3 = jSONObject5.optLong("key", 0L);
                        if (!TextUtils.isEmpty(string4) && i18 > 0) {
                            arrayList4.add(new C18489c(C7962g.c.a.VIDEO_UPLOAD, string4, i18, optLong3));
                        }
                    }
                }
                if (arrayList4.size() > 0) {
                    C18489c.m97854t(C7962g.c.a.VIDEO_UPLOAD, arrayList4);
                }
            }
            if (jSONObject.has("keySet")) {
                JSONObject jSONObject6 = jSONObject.getJSONObject("keySet");
                CoreUtility.f89240p = jSONObject6.optString("keySetId", "");
                CoreUtility.f89241q = jSONObject6.optString("keySetValue", "");
            } else {
                CoreUtility.f89240p = "";
                CoreUtility.f89241q = "";
            }
            AbstractC0908e0.m2825s("KEY_STRING_SOCKET_PRO_V1_KEY_SET_ID_" + CoreUtility.f89233i, CoreUtility.f89240p, true);
            AbstractC0908e0.m2825s("KEY_STRING_SOCKET_PRO_V1_KEY_SET_VALUE_" + CoreUtility.f89233i, CoreUtility.f89241q, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public void m2185c() {
        m2187f(1);
    }

    /* renamed from: d */
    public void m2186d(int i11) {
        String str;
        ContactProfile contactProfile;
        try {
            f2925g = true;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a(elapsedRealtime));
            if (!TextUtils.isEmpty(CoreUtility.f89226b)) {
                if (TextUtils.isEmpty(CoreUtility.f89227c)) {
                }
                AbstractC23309i.m121148L4();
                str = "";
                contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
                    str = AbstractC23304d.f113368c0.f42455y;
                }
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                    str = AbstractC23304d.f113394i0;
                }
                c0766k.mo1627e6(str, AbstractC23304d.f113410m0, i11);
            }
            AbstractC29633j.m147362k();
            AbstractC23309i.m121148L4();
            str = "";
            contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                str = AbstractC23304d.f113368c0.f42455y;
            }
            if (TextUtils.isEmpty(str)) {
                str = AbstractC23304d.f113394i0;
            }
            c0766k.mo1627e6(str, AbstractC23304d.f113410m0, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            f2925g = false;
        }
    }

    /* renamed from: f */
    public void m2187f(int i11) {
        synchronized (this.f2929c) {
            try {
                if (f2925g) {
                    return;
                }
                m2186d(i11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public void m2188g() {
        try {
            if (C23055e5.m118271f() && !TextUtils.isEmpty(CoreUtility.f89233i) && System.currentTimeMillis() - AbstractC23309i.m121260O5() > 86400000) {
                m2178e(3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m2189h() {
        try {
            if (System.currentTimeMillis() - AbstractC23309i.m121260O5() > 300000) {
                if (C23055e5.m118271f()) {
                    m2178e(2);
                } else {
                    AbstractC23309i.m122142lq(0L);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m2190j() {
        String str;
        ContactProfile contactProfile;
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c());
            if (!TextUtils.isEmpty(CoreUtility.f89226b)) {
                if (TextUtils.isEmpty(CoreUtility.f89227c)) {
                }
                AbstractC23309i.m121148L4();
                str = "";
                contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
                    str = AbstractC23304d.f113368c0.f42455y;
                }
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                    str = AbstractC23304d.f113394i0;
                }
                c0766k.mo1531S5(str, AbstractC23304d.f113410m0);
            }
            AbstractC29633j.m147362k();
            AbstractC23309i.m121148L4();
            str = "";
            contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                str = AbstractC23304d.f113368c0.f42455y;
            }
            if (TextUtils.isEmpty(str)) {
                str = AbstractC23304d.f113394i0;
            }
            c0766k.mo1531S5(str, AbstractC23304d.f113410m0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k */
    public void m2191k() {
        C31986k3.f147083a.m154153z2();
        C25641k.m132506o().m132509A();
        C26076k.m134208q().m134215C();
        AbstractC23306f.m120562A().m2532a0();
        AbstractC23306f.m120562A().m2563u0();
        C2806e c2806e = C2806e.f11255a;
        c2806e.m13584i(AbstractC23309i.m122455u4());
        if (AbstractC23309i.m122455u4().isEmpty()) {
            c2806e.m13585j(C23793c.m124316k().mo124314i());
        }
        AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
        AbstractC23309i.m120948Fq(0L);
        C2556d.m12981o().m12985E();
        C22447s.m116015Q();
        AbstractC23047d8.m118255g();
        C24906b.f119505a.m129547H();
        C22436h.f109760a.m115920p();
        AbstractC23304d.f113295K1 = false;
        C26263i.m135010A();
        C18434b.m97679l().m97683g();
    }

    /* renamed from: p */
    public void m2192p(JSONObject jSONObject) {
        try {
            if (jSONObject.has("CrypKey") && jSONObject.has("SampleEncrypt")) {
                String string = jSONObject.getString("CrypKey");
                if (AbstractC17525d.m93359g(string, jSONObject.getString("SampleEncrypt"))) {
                    AbstractC23309i.m121946gj(string);
                } else {
                    C29021l0.m144916J().m144992F();
                    AbstractC23309i.m121946gj("");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:            if (r12 == false) goto L69;     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2193q(JSONObject jSONObject, boolean z11) {
        int i11;
        boolean z12;
        int m122452u1;
        try {
            AbstractC23309i.m121235Nh(true);
            AbstractC23309i.m120755Ai(0);
            AbstractC23309i.m121709aA(false);
            AbstractC23309i.m121986hl(false);
            AbstractC23309i.m120754Ah(false);
            AbstractC23309i.m122588xq(System.currentTimeMillis());
            if (AbstractC23309i.m122353rd() == 0) {
                AbstractC23309i.m121727ar(System.currentTimeMillis());
            }
            if (jSONObject.has("imei_status")) {
                int i12 = jSONObject.getInt("imei_status");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("imei_status:");
                sb2.append(i12);
                if (i12 != 1 && i12 != 2) {
                    int m118295b = AbstractC23057e7.m118295b();
                    if (!z11 && m118295b != 1 && ((m122452u1 = AbstractC23309i.m122452u1()) == -1 || (m122452u1 == 3 && m118295b == -1))) {
                        AbstractC23309i.m121235Nh(false);
                        AbstractC23309i.m121709aA(true);
                        AbstractC23309i.m120755Ai(-2);
                        AbstractC23309i.m121984hj(1);
                        AbstractC23309i.m121986hl(true);
                        AbstractC23309i.m120754Ah(false);
                        AbstractC23309i.m122588xq(0L);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC20887g.m109232j(CoreUtility.f89233i, 80004, "", 0L, 80000, CoreUtility.f89236l);
                    C20882b.m109134j();
                }
                if (!AbstractC23057e7.m118296c() && CoreUtility.f89236l % 1000 > (i11 = MainApplication.f37851Q % 1000)) {
                    if (i11 > 0 && i11 <= 400) {
                        AbstractC23309i.m121139Kw(7);
                        AbstractC23057e7.m118305l(false);
                    } else {
                        AbstractC23309i.m121139Kw(1);
                        AbstractC23057e7.m118305l(true);
                    }
                }
                AbstractC23309i.m121200Mj(i12);
                AbstractC0924m0.m4024mi(i12);
                AbstractC0924m0.m3994li(i12);
            }
            AbstractC21289a.m110246c(jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public void m2194s(JSONObject jSONObject) {
        try {
            C23219t4.m119675k().m119679j();
            if (jSONObject.has("mapping_domain")) {
                String obj = jSONObject.get("mapping_domain").toString();
                AbstractC0924m0.m4236tk(obj);
                C23219t4.m119675k().m119680m(obj);
            } else {
                AbstractC0924m0.m4236tk("");
                C23219t4.m119675k().m119680m("");
            }
            if (jSONObject.has("mapping_ext")) {
                String obj2 = jSONObject.get("mapping_ext").toString();
                AbstractC0924m0.m4265uk(obj2);
                C23219t4.m119675k().m119681n(obj2, false);
            } else {
                AbstractC0924m0.m4265uk("");
                C23219t4.m119675k().m119681n("", false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: t */
    public void m2195t(JSONObject jSONObject, boolean z11) {
        boolean z12;
        boolean z13;
        int i11;
        try {
            if (jSONObject.has("devicetype")) {
                AbstractC23309i.m120867Dj(jSONObject.getInt("devicetype"));
            }
            if (jSONObject.has("qos_setting")) {
                AbstractC23309i.m121104Jy(jSONObject.getJSONObject("qos_setting").getInt("qos_time"));
                AbstractC20886f.m109209i(AbstractC23309i.m122129ld());
            }
            if (jSONObject.has("ActionLog")) {
                AbstractC23647d.m123903m(jSONObject.getInt("ActionLog"));
            }
            if (jSONObject.has("ActionLogInterval") && (i11 = jSONObject.getInt("ActionLogInterval")) > 0) {
                AbstractC23647d.m123904n(i11);
            }
            AbstractC23647d.m123896f(AbstractC29039u0.m145033a(AbstractC29039u0.b.UPLOAD_ACTION_LOG));
            if (jSONObject.has("send_video")) {
                AbstractC23309i.m122557ww(jSONObject.getInt("send_video"));
            }
            if (jSONObject.has("send_location")) {
                AbstractC23309i.m122520vw(jSONObject.getInt("send_location"));
            }
            if (jSONObject.has("f1pshow")) {
                AbstractC23309i.m122140lo(jSONObject.getInt("f1pshow"));
            }
            if (jSONObject.has("DeviceWakup")) {
                if (jSONObject.getInt("DeviceWakup") == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC23309i.m120883Dz(z13);
            }
            if (jSONObject.has("pageMsgExpiredT")) {
                AbstractC23309i.m120767Au(jSONObject.getInt("pageMsgExpiredT"));
            }
            if (jSONObject.has("chat_undo_time")) {
                AbstractC23309i.m121025Ht(jSONObject.getInt("chat_undo_time"));
            }
            if (jSONObject.has("deactivate")) {
                AbstractC23309i.m122322qj(jSONObject.optInt("deactivate", 0));
            }
            if (jSONObject.has("okHttp")) {
                if (jSONObject.optInt("okHttp") == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC23309i.m121683Zl(z12);
                AbstractRunnableC23992c.m125567l1(z12);
            }
            if (jSONObject.has("passwordRule") && !jSONObject.isNull("passwordRule")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("passwordRule");
                AbstractC23309i.m121174Lu(optJSONObject.toString());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vi", optJSONObject.optString("title_password_vi"));
                jSONObject2.put("en", optJSONObject.optString("title_password_en"));
                jSONObject2.put("my", optJSONObject.optString("title_password_mm"));
                AbstractC23309i.m121501Uo(jSONObject2.toString());
            }
            AbstractC23309i.m121649Yo(jSONObject.optString("viewerkey", ""));
            AbstractC0908e0.m2823q("KEY_LONG_SOCKET_AUTHEN_V3_PRIVATE_KEY_" + CoreUtility.f89233i, jSONObject.optLong("ssPriKey", 0L), true);
            AbstractC0908e0.m2823q("KEY_LONG_SOCKET_AUTHEN_V3_PUBLIC_KEY_" + CoreUtility.f89233i, jSONObject.optLong("ssPubKey", 0L), true);
            AbstractC29633j.m147364m();
            if (!z11) {
                C19172a.m100610u(CoreUtility.f89233i, AbstractC21767b.m112295c());
                AbstractC23153n4.m119085A(C19172a.m100612w(jSONObject), false, true);
                C19172a.m100593d(new InterfaceC18509p() { // from class: ag0.l
                    @Override // en0.InterfaceC18509p
                    /* renamed from: pC */
                    public final Object mo240pC(Object obj, Object obj2) {
                        Object m2183o;
                        m2183o = C0832n.m2183o((JSONObject) obj, (Continuation) obj2);
                        return m2183o;
                    }
                });
            } else {
                AbstractC23153n4.m119085A(jSONObject, true, true);
            }
            C26688i.f126427a.m137071e();
            AbstractC26683d.m137044d();
            AbstractC23309i.m122248oj("");
            AbstractC23306f.m120562A().m2539h0();
            AbstractC23306f.m120583H().m110206l();
            C24099q0.m125958k().m125978v();
            C23648e.Companion.m123931c();
            if (!z11 && C29210k.m145804c0().m145857Z()) {
                AbstractC0924m0.m4027ml(true);
            }
            if (!z11) {
                C32246a.m155641D().m155684P(true);
                C28652r.m143349v().m143365a0();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: u */
    public void m2196u() {
        String str;
        ContactProfile contactProfile;
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b());
            if (!TextUtils.isEmpty(CoreUtility.f89226b)) {
                if (TextUtils.isEmpty(CoreUtility.f89227c)) {
                }
                AbstractC23309i.m121148L4();
                str = "";
                contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
                    str = AbstractC23304d.f113368c0.f42455y;
                }
                if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                    str = AbstractC23304d.f113394i0;
                }
                c0766k.mo1510P8(str, AbstractC23304d.f113410m0);
            }
            AbstractC29633j.m147362k();
            AbstractC23309i.m121148L4();
            str = "";
            contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null) {
                str = AbstractC23304d.f113368c0.f42455y;
            }
            if (TextUtils.isEmpty(str)) {
                str = AbstractC23304d.f113394i0;
            }
            c0766k.mo1510P8(str, AbstractC23304d.f113410m0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: v */
    public void m2197v() {
        AbstractC23309i.m121725ap(AbstractC23349d.m122764b());
    }

    /* renamed from: w */
    void m2198w() {
        Intent intent = new Intent();
        intent.setAction("com.zing.zalo.ui.MAUpdateLayoutConnection");
        MainApplication.getAppContext().sendBroadcast(intent);
        C23744a.m124114c().m124116d(6071, new Object[0]);
    }

    /* renamed from: x */
    public void m2199x() {
        String str;
        try {
            AbstractC20110a.m104535d("verifyIMEIOfCurrentSessionAndKickOut ...", new Object[0]);
            String m121000H4 = AbstractC23309i.m121000H4();
            AbstractC20110a.m104535d("savedIMEI: %s", m121000H4);
            if (!TextUtils.isEmpty(m121000H4) && !"000000".equals(m121000H4)) {
                String m122764b = AbstractC23349d.m122764b();
                AbstractC20110a.m104535d("currentIMEI: %s", m122764b);
                if (TextUtils.isEmpty(m122764b) || "000000".equals(m122764b) || m121000H4.equalsIgnoreCase(m122764b)) {
                    return;
                }
                if (Math.abs(m121000H4.length() - m122764b.length()) != 1 || (!m121000H4.startsWith(m122764b) && !m122764b.startsWith(m121000H4))) {
                    String[] m103893a = AbstractC20019m.m103893a();
                    for (int i11 = 0; m103893a != null && i11 < m103893a.length; i11++) {
                        String str2 = m103893a[i11];
                        if (m121000H4.equalsIgnoreCase(str2)) {
                            return;
                        }
                        if (str2 != null && Math.abs(m121000H4.length() - str2.length()) == 1 && (m121000H4.startsWith(str2) || str2.startsWith(m121000H4))) {
                            return;
                        }
                    }
                    AbstractC20110a.m104535d("verifyIMEIOfCurrentSessionAndKickOut jumpToLoginForm", new Object[0]);
                    AbstractC20887g.m109245w(9026);
                    AbstractC20887g.m109231i(CoreUtility.f89233i, 0, String.format("savedIMEI: %s - currentIMEI: %s", m121000H4, m122764b), 0L, 9026, CoreUtility.f89236l);
                    if (AbstractC23309i.m122018if()) {
                        AbstractC23355j.m122793a("savedIMEI", m121000H4);
                        AbstractC23355j.m122793a("currentIMEI", m122764b);
                        if (m103893a == null) {
                            str = "null";
                        } else {
                            str = String.valueOf(m103893a.length);
                        }
                        AbstractC23355j.m122793a("deviceIds", str);
                        for (int i12 = 0; m103893a != null && i12 < m103893a.length; i12++) {
                            String str3 = "deviceId_" + i12;
                            String str4 = m103893a[i12];
                            if (str4 == null) {
                                str4 = "null";
                            }
                            AbstractC23355j.m122793a(str3, str4);
                        }
                        AbstractC23355j.m122794b(new Exception("IMEI changed detection"));
                        C3560a c3560a = new C3560a();
                        c3560a.m18091e(0);
                        c3560a.m18090d(MainApplication.getAppContext().getString(AbstractC8020f0.kick_out_on_imei_chaged_info_dialog_title));
                        c3560a.m18089c(MainApplication.getAppContext().getString(AbstractC8020f0.kick_out_on_imei_chaged_info_dialog_msg));
                        m2181m(c3560a);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
