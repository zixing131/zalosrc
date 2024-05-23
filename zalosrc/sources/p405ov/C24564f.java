package p405ov;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.os.Build;
import android.text.TextUtils;
import au.AbstractC2378v0;
import bp0.AbstractC3096i0;
import com.zing.zalo.AbstractC7306b;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import gm0.AbstractC19512f;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Semaphore;
import me0.AbstractC23020b3;
import me0.AbstractC23106j1;
import me0.AbstractC23158n9;
import me0.AbstractC23204s0;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mx.C23476m;
import on0.C24321d;
import org.json.JSONObject;
import p171fx.AbstractC19164e;
import p248iy.AbstractC20886f;
import p248iy.AbstractC20887g;
import p371nv.C23952g;
import p609wh.AbstractC29039u0;

/* renamed from: ov.f */
/* loaded from: classes4.dex */
public final class C24564f {

    /* renamed from: a */
    public static final C24564f f118256a = new C24564f();

    /* renamed from: b */
    private static final Semaphore f118257b = new Semaphore(1);

    /* renamed from: ov.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f118258a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC24562d f118259b;

        a(List list, InterfaceC24562d interfaceC24562d) {
            this.f118258a = list;
            this.f118259b = interfaceC24562d;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                List list = this.f118258a;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            InterfaceC24562d interfaceC24562d = this.f118259b;
            if (interfaceC24562d != null) {
                interfaceC24562d.mo127943a(c20096c);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                List list = this.f118258a;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            InterfaceC24562d interfaceC24562d = this.f118259b;
            if (interfaceC24562d != null) {
                interfaceC24562d.mo127944b(obj);
            }
        }
    }

    private C24564f() {
    }

    /* renamed from: b */
    public static final String m127946b(Map map) {
        AbstractC19074t.m100208f(map, "mappingFiles");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        sb2.append("-");
        sb2.append("zte_upload@@1203");
        String m122788d = AbstractC23352g.m122788d(sb2.toString());
        AbstractC19074t.m100207e(m122788d, "md5(...)");
        return m122788d;
    }

    /* renamed from: c */
    private final JSONObject m127947c() {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("buildId", AbstractC7306b.f40031a);
        jSONObject.put("versionCode", CoreUtility.f89236l);
        jSONObject.put("androidVersion", Build.VERSION.SDK_INT);
        jSONObject.put("deviceModel", Build.MODEL);
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            str = "-1";
        } else {
            str = CoreUtility.f89233i;
        }
        jSONObject.put("currentUserUid", str);
        jSONObject.put("logVersion", 16);
        jSONObject.put("buildType", "release");
        jSONObject.put("uploadTime", System.currentTimeMillis());
        jSONObject.put("disableEncode", true);
        return jSONObject;
    }

    /* renamed from: d */
    private final void m127948d() {
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.mo104556o(8, "---------------------------------dumpSystemSetting---------------------------", new Object[0]);
        aVar.mo104556o(8, "build info:\n" + AbstractC23106j1.m118481a().toString(1), new Object[0]);
        aVar.mo104556o(8, "notification system setting:\n" + AbstractC23106j1.m118484d().toString(1), new Object[0]);
        aVar.mo104556o(8, "---------------------------------end-dumpSystemSetting-----------------------", new Object[0]);
    }

    /* renamed from: e */
    private final void m127949e() {
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.mo104556o(8, "---------------------------------dumpZaloSetting---------------------------", new Object[0]);
        aVar.mo104556o(8, "user-setting:\n" + AbstractC23158n9.m119176a().toString(1), new Object[0]);
        aVar.mo104556o(8, "---------------------------------end-dumpZaloSetting-----------------------", new Object[0]);
    }

    /* renamed from: f */
    private final File m127950f() {
        return AbstractC3096i0.m15479B(MainApplication.Companion.m35500c());
    }

    /* renamed from: g */
    private final File m127951g(String str) {
        File file = new File(AbstractC20130d.m104837J(null, true) + "/Native/LogSocket");
        if (!file.exists() || file.listFiles() == null) {
            return null;
        }
        AbstractC20887g.m109222I(file.getPath(), str);
        return new File(str);
    }

    /* renamed from: h */
    private final File m127952h() {
        try {
            m127948d();
            m127949e();
            ZMediaPlayer.forceSubmitLog();
            C23952g.m125341f(3000L);
            File file = new File(AbstractC23204s0.m119555f(), "zalo_log.zip");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            String uuid = AbstractC23020b3.m118021b(MainApplication.Companion.m35500c()).toString();
            AbstractC19074t.m100207e(uuid, "toString(...)");
            Charset charset = C24321d.f117408b;
            byte[] bytes = uuid.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] bytes2 = "salt for file InstallationUniqueId".getBytes(charset);
            AbstractC19074t.m100207e(bytes2, "getBytes(...)");
            messageDigest.update(bytes2);
            AbstractC2378v0.m12425h(new File(AbstractC20130d.m104866a0()), file, AbstractC19512f.m101985d(messageDigest.digest()));
            return file;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: i */
    public static final List m127953i() {
        File m127955k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C24564f c24564f = f118256a;
        File m127951g = c24564f.m127951g(AbstractC23204s0.m119555f() + "logsocket.zip");
        if (m127951g != null && m127951g.exists() && m127951g.length() > 0) {
            arrayList.add(m127951g);
            arrayList2.add(m127951g);
        }
        File m127950f = c24564f.m127950f();
        if (m127950f != null && m127950f.exists() && m127950f.length() > 0) {
            arrayList.add(m127950f);
        }
        if (C23476m.m123246d() && (m127955k = c24564f.m127955k(false, BuildConfig.VERSION_CODE, AbstractC7306b.f40032b, AbstractC7306b.f40031a)) != null && m127955k.exists() && m127955k.length() > 0) {
            arrayList.add(m127955k);
        }
        long currentTimeMillis = System.currentTimeMillis();
        File m127952h = c24564f.m127952h();
        if (m127952h != null && m127952h.exists() && m127952h.length() > 0) {
            arrayList.add(m127952h);
            arrayList2.add(m127952h);
        }
        AbstractC20110a.f98889a.mo104548a("time to zip log: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        if (arrayList2.size() > 0) {
            m127959o(c24564f, arrayList2, null, "feedback", null, null, 24, null);
        }
        return arrayList;
    }

    /* renamed from: j */
    private final File m127954j() {
        File file = new File(AbstractC20886f.m109202b());
        if (file.exists() && file.length() > 0) {
            File file2 = new File(AbstractC23204s0.m119555f(), "logqos.gzip");
            AbstractC20887g.m109227e(AbstractC20886f.m109202b(), file2.getAbsolutePath());
            return file2;
        }
        return null;
    }

    /* renamed from: k */
    private final File m127955k(boolean z11, int i11, String str, String str2) {
        if (C23476m.m123248f()) {
            String m100526l = AbstractC19164e.m100526l(z11, i11, str, str2);
            if (!TextUtils.isEmpty(m100526l)) {
                return new File(m100526l);
            }
            return null;
        }
        return null;
    }

    /* renamed from: l */
    public static final String m127956l(String str, String str2, long j11) {
        AbstractC19074t.m100208f(str, "curFileName");
        AbstractC19074t.m100208f(str2, "userId");
        return str2 + "_" + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(j11)) + "_" + j11 + "_" + str;
    }

    /* renamed from: m */
    public static final void m127957m() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C24564f c24564f = f118256a;
        File m127951g = c24564f.m127951g(AbstractC20130d.m104837J(null, true) + "/Native/logsocket.zip");
        if (m127951g != null && m127951g.exists() && m127951g.length() > 0) {
            arrayList.add(m127951g);
            arrayList2.add(m127951g);
        }
        File m127954j = c24564f.m127954j();
        if (m127954j != null && m127954j.exists() && m127954j.length() > 0) {
            arrayList.add(m127954j);
        }
        File m127955k = c24564f.m127955k(false, 0, null, null);
        if (m127955k != null && m127955k.exists() && m127955k.length() > 0) {
            arrayList.add(m127955k);
            arrayList2.add(m127955k);
        }
        File m127952h = c24564f.m127952h();
        if (m127952h != null && m127952h.exists() && m127952h.length() > 0) {
            arrayList.add(m127952h);
            arrayList2.add(m127952h);
        }
        if (arrayList.size() > 0) {
            m127959o(c24564f, arrayList, arrayList2, "server", null, null, 24, null);
        }
    }

    /* renamed from: n */
    private final void m127958n(List list, List list2, String str, AbstractC29039u0.b bVar, InterfaceC24562d interfaceC24562d) {
        if (list != null) {
            try {
                if (!list.isEmpty() && f118257b.tryAcquire()) {
                    HashMap hashMap = new HashMap();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        String name = file.getName();
                        AbstractC19074t.m100207e(name, "getName(...)");
                        String str2 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str2, "currentUserUid");
                        hashMap.put(m127956l(name, str2, System.currentTimeMillis()), file);
                    }
                    Semaphore semaphore = f118257b;
                    m127960p(semaphore, hashMap, list2, str, bVar, interfaceC24562d);
                    semaphore.release();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: o */
    static /* synthetic */ void m127959o(C24564f c24564f, List list, List list2, String str, AbstractC29039u0.b bVar, InterfaceC24562d interfaceC24562d, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            bVar = AbstractC29039u0.b.UPLOAD_FILE_LOG;
        }
        AbstractC29039u0.b bVar2 = bVar;
        if ((i11 & 16) != 0) {
            interfaceC24562d = null;
        }
        c24564f.m127958n(list, list2, str, bVar2, interfaceC24562d);
    }

    /* renamed from: p */
    private final void m127960p(final Semaphore semaphore, final Map map, final List list, final String str, final AbstractC29039u0.b bVar, final InterfaceC24562d interfaceC24562d) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ov.e
            @Override // java.lang.Runnable
            public final void run() {
                C24564f.m127961q(semaphore, map, bVar, str, list, interfaceC24562d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m127961q(Semaphore semaphore, Map map, AbstractC29039u0.b bVar, String str, List list, InterfaceC24562d interfaceC24562d) {
        AbstractC19074t.m100208f(semaphore, "$locker");
        AbstractC19074t.m100208f(map, "$mappingFiles");
        AbstractC19074t.m100208f(bVar, "$serviceCommand");
        AbstractC19074t.m100208f(str, "$logType");
        try {
            try {
                semaphore.acquire();
                if (!map.isEmpty()) {
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new a(list, interfaceC24562d));
                    c0766k.mo1714pa(AbstractC29039u0.m145033a(bVar), map, m127946b(map), str, f118256a.m127947c().toString());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } finally {
            semaphore.release();
        }
    }

    /* renamed from: r */
    public static final void m127962r(InterfaceC24562d interfaceC24562d) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (C23476m.m123248f()) {
                String m100526l = AbstractC19164e.m100526l(false, 0, null, null);
                if (!TextUtils.isEmpty(m100526l)) {
                    File file = new File(m100526l);
                    if (file.exists() && file.length() > 0) {
                        arrayList.add(file);
                        arrayList2.add(file);
                    }
                }
            }
            if (arrayList.size() > 0) {
                f118256a.m127958n(arrayList, arrayList2, "zam", AbstractC29039u0.b.UPLOAD_LOG_GET_URL, interfaceC24562d);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
