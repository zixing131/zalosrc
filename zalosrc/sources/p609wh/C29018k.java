package p609wh;

import am.C0925n;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17527f;
import com.zing.zalocore.connection.socket.RequestPacket;
import fg0.ThreadFactoryC18928a;
import fh0.AbstractC18942g;
import gu.AbstractC19601a;
import gy.C19681e;
import hm0.C20096c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jm0.InterfaceC21299i;
import me0.AbstractC23138m0;
import me0.AbstractC23204s0;
import me0.C23055e5;
import mm0.AbstractC23351f;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p135em.C18489c;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23750d;
import p372nw.C23953a;
import p645xh.C29628e;
import vg.C28023b6;

/* renamed from: wh.k */
/* loaded from: classes3.dex */
public class C29018k {

    /* renamed from: a */
    private static volatile C29018k f134337a;

    /* renamed from: b */
    private static ThreadPoolExecutor f134338b;

    /* renamed from: c */
    public static final AtomicBoolean f134339c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f134340d = false;

    /* renamed from: wh.k$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ C0925n.a f134341a;

        a(C0925n.a aVar) {
            this.f134341a = aVar;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC20110a.m104538g("ackReceivedFirebasePaETckage: " + c20096c, new Object[0]);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            try {
                AbstractC20110a.m104535d("ackReceivedFirebasePackage: " + jSONObject, new Object[0]);
                if (C0925n.m4419d(CoreUtility.getAppContext()).m4420b(this.f134341a.f3423a)) {
                    C29018k.this.m144902f();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    private C29018k() {
        if (f134338b == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("ParseFirebase"));
            f134338b = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        m144902f();
    }

    /* renamed from: c */
    public static synchronized C29018k m144898c() {
        C29018k c29018k;
        synchronized (C29018k.class) {
            try {
                if (f134337a == null) {
                    synchronized (C29018k.class) {
                        try {
                            if (f134337a == null) {
                                f134337a = new C29018k();
                            }
                        } finally {
                        }
                    }
                }
                c29018k = f134337a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29018k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m144899d(int i11, String str, long j11) {
        try {
            if (i11 == 1635) {
                m144903g();
                return;
            }
            if (i11 == 1638) {
                long optLong = new JSONObject(str).optLong("sendTime");
                long mo124311f = C23793c.m124316k().mo124311f();
                if (optLong > 0) {
                    C0925n.m4419d(CoreUtility.getAppContext()).m4422f(optLong, mo124311f, str);
                    m144902f();
                    return;
                }
                return;
            }
            if (i11 == 1639) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("upload_url");
                if (string.length() > 0) {
                    NetworkHelper.m48302k().m48312i(string);
                }
                NetworkHelper.m48302k().m48310g(jSONObject.getString("proxy"));
                JSONArray jSONArray = new JSONArray(jSONObject.getString("listHttp"));
                if (jSONArray.length() > 0) {
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        arrayList.add(jSONArray.get(i12).toString());
                    }
                }
                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("listIp"));
                if (jSONArray2.length() > 0) {
                    for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                        arrayList2.add(jSONArray2.get(i13).toString());
                    }
                }
                if (!f134340d) {
                    f134340d = true;
                    NetworkHelper.m48302k().m48309f(AbstractC23204s0.m119555f(), Integer.parseInt(CoreUtility.f89233i), AbstractC20887g.m109224b(), String.valueOf(CoreUtility.f89236l));
                    NetworkHelper.m48302k().m48313j();
                }
                String[] m125360a = new C23953a(MainApplication.getAppContext()).m125360a();
                String str2 = new String();
                while (r3 < m125360a.length) {
                    str2 = str2 + m125360a[r3];
                    r3++;
                    if (r3 < m125360a.length) {
                        str2 = str2 + ",";
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("listDns: ");
                sb2.append(str2);
                NetworkHelper.m48302k().m48307d(str2);
                NetworkHelper.m48302k().m48308e(AbstractC20626a.m107390f());
                if (arrayList2.size() > 0) {
                    NetworkHelper.m48302k().m48306c(arrayList2);
                }
                if (arrayList.size() > 0) {
                    NetworkHelper.m48302k().m48305b(arrayList);
                    return;
                }
                return;
            }
            if (i11 == 1634) {
                String optString = new JSONObject(str).optString("notiMsg");
                if (TextUtils.isEmpty(optString)) {
                    return;
                }
                C23750d c23750d = new C23750d(MainApplication.getAppContext());
                c23750d.m124165v0("other");
                c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                c23750d.m6870W(optString);
                c23750d.mo6894v(optString);
                c23750d.mo6860M(false).m6886n(true).mo6895w("Zalo");
                Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloLauncherActivity.class);
                intent.setFlags(67108864);
                c23750d.m6893u(PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent, AbstractC19601a.m102572b(1073741824)));
                C28023b6.m141256k2(c23750d);
                c23750d.m124147b0();
                C28023b6.m141262r2();
                AbstractC23351f.m122784a("[FireBase]: notiMsg", true);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            boolean m118770b = AbstractC23138m0.m118770b();
            String m121738b1 = AbstractC23309i.m121738b1();
            m144903g();
            JSONObject jSONObject2 = new JSONObject(str);
            int optInt = jSONObject2.optInt("sourceId");
            int optInt2 = jSONObject2.optInt("destId");
            String optString2 = jSONObject2.optString("data");
            int optInt3 = jSONObject2.optInt("sizeFrame");
            int optInt4 = jSONObject2.optInt("cmd");
            byte optInt5 = (byte) jSONObject2.optInt("packetType");
            jSONObject2.optInt("isGzip");
            String optString3 = jSONObject2.optString("userId");
            boolean z11 = !jSONObject2.has("sourceId") && jSONObject2.has("preloadId");
            int optInt6 = jSONObject2.optInt("preloadId");
            if (z11) {
                z11 = AbstractC18942g.m99253i();
            }
            if (!TextUtils.isEmpty(optString2) && optInt3 > 0) {
                if (!m118770b) {
                    if (AbstractC23304d.m120544o()) {
                        AbstractC20110a.m104542k(8, "[FireBase] User not logged in. Reject firebase message cmd=" + optInt4, new Object[0]);
                        return;
                    }
                    return;
                }
                if (!z11 && (TextUtils.isEmpty(optString3) || !TextUtils.equals(optString3, m121738b1))) {
                    if (AbstractC23304d.m120544o()) {
                        AbstractC20110a.m104542k(8, "[FireBase] CurrentUserId wrong: fbUid=" + optString3 + " clientUid=" + CoreUtility.f89233i + ". Reject firebase message cmd=" + optInt4, new Object[0]);
                        return;
                    }
                    return;
                }
                byte[] decode = Base64.decode(optString2, 0);
                byte[] m89297a = Utils.m89297a(1);
                if (!z11) {
                    optInt6 = optInt;
                }
                byte[] m93440d = AbstractC17527f.m93440d(decode, m89297a, optInt3, optInt6);
                AbstractC23351f.m122784a("[FIREBASE]: CMD: " + optInt4 + ", SourceId: " + optInt + ", DestId: " + optInt2 + ", DeliveredTime: " + j11, true);
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93295q((short) optInt4);
                requestPacket.m93303y(m93440d);
                requestPacket.m93301w(optInt5);
                requestPacket.m93273D(optInt);
                requestPacket.m93297s(optInt2);
                C29021l0.m144916J().m145002S0(requestPacket);
                int m122167md = AbstractC23309i.m122167md();
                if ((optInt4 == 402 || optInt4 == 424 || optInt4 == 428) && m122167md > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - C29628e.m147249E0().m93421p();
                    r3 = currentTimeMillis > ((long) m122167md) ? 1 : 0;
                    boolean z12 = CoreUtility.f89235k.get();
                    if (r3 != 0 && z12) {
                        AbstractC23351f.m122784a("Receive FIREBASE CMD: " + optInt4 + " CLOSE SOCKET AND RE-AUTHEN, idleSocket: " + currentTimeMillis + " Timeout to reset: " + m122167md, true);
                        C29628e.m147249E0().m93412k0(-52);
                        C29628e.m147249E0().m147274c1();
                        return;
                    }
                    if (AbstractC23304d.m120544o()) {
                        AbstractC23351f.m122784a("Receive FIREBASE CMD: " + optInt4 + " DON'T CLOSE SOCKET, idleSocketTime: " + currentTimeMillis + " IsBackGround: " + z12, true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m144900b() {
        C0925n.a m4421c;
        try {
            if (!C23055e5.m118271f() || (m4421c = C0925n.m4419d(CoreUtility.getAppContext()).m4421c()) == null) {
                return;
            }
            C29037t0 c29037t0 = new C29037t0(new a(m4421c));
            c29037t0.m110314j(C18489c.m97849k(C7962g.c.a.ZALO_LOG) + "/qos/firebase", "", new String[]{"sendTime", "receivedTime"}, new String[]{m4421c.f3424b + "", m4421c.f3425c + ""});
            c29037t0.f103775r = 10;
            c29037t0.mo110303Z();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public void m144901e(final String str, final int i11, final long j11) {
        try {
            f134338b.execute(new Runnable() { // from class: wh.j
                @Override // java.lang.Runnable
                public final void run() {
                    C29018k.this.m144899d(i11, str, j11);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m144902f() {
        if (!C23055e5.m118271f()) {
            return;
        }
        f134338b.execute(new Runnable() { // from class: wh.i
            @Override // java.lang.Runnable
            public final void run() {
                C29018k.this.m144900b();
            }
        });
    }

    /* renamed from: g */
    void m144903g() {
        try {
            if (!C29628e.m147249E0().f89373e) {
                new C19681e.d(MainApplication.getAppContext(), f134339c).start();
                AbstractC23351f.m122784a("[FireBase] Wakeup device", true);
            } else if (!C23055e5.m118271f() && C29628e.m147249E0().m93373A()) {
                AbstractC20110a.m104535d("Native Socket on receive firebase wakeup msg", new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
