package p728zt;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me0.AbstractC23138m0;
import me0.C23055e5;
import mm0.AbstractC23352g;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p620wt.AbstractC29237l;

/* renamed from: zt.e */
/* loaded from: classes.dex */
public class C32556e implements NativeLoader.InterfaceC16736f {

    /* renamed from: d */
    static C32556e f150464d;

    /* renamed from: a */
    Map f150465a;

    /* renamed from: b */
    final Object f150466b = new Object();

    /* renamed from: c */
    boolean f150467c = false;

    /* renamed from: zt.e$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C32556e.this.f150467c = false;
            AbstractC20110a.m104535d("checkRequestDistributedLibrariesInfo:" + c20096c, new Object[0]);
            AbstractC23309i.m121688Zq(System.currentTimeMillis() - 144000000);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (obj != null) {
                    try {
                        AbstractC20110a.m104535d("requestLibsInfo: %s", obj);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    AbstractC23309i.m122182ms(jSONObject.getJSONObject("data").toString());
                    synchronized (C32556e.this.f150466b) {
                        C32556e.this.f150465a = null;
                    }
                    C32554c.m157634h().m157641l();
                }
                C32556e.this.f150467c = false;
                AbstractC23309i.m121688Zq(System.currentTimeMillis());
            } catch (Throwable th2) {
                C32556e.this.f150467c = false;
                AbstractC23309i.m121688Zq(System.currentTimeMillis());
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static String m157645g() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : Build.SUPPORTED_ABIS) {
                jSONArray.put(str);
            }
            jSONObject.put("versionCode", CoreUtility.f89236l);
            jSONObject.put("cpu_abi", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (EnumC16739a enumC16739a : EnumC16739a.m89280c()) {
                if (enumC16739a.f84906u) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", enumC16739a.m89284g());
                    jSONObject2.put("version", enumC16739a.m89285h());
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("libraries", jSONArray2);
            return jSONObject.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: h */
    public static C32556e m157646h() {
        if (f150464d == null) {
            f150464d = new C32556e();
        }
        return f150464d;
    }

    /* renamed from: i */
    public /* synthetic */ void m157647i() {
        synchronized (this.f150466b) {
            this.f150465a = null;
        }
        C32554c.m157634h().m157641l();
    }

    @Override // com.zing.zalo.utils.NativeLoader.InterfaceC16736f
    /* renamed from: a */
    public C32552a mo89250a(EnumC16739a enumC16739a) {
        return m157651k(enumC16739a.m89284g());
    }

    @Override // com.zing.zalo.utils.NativeLoader.InterfaceC16736f
    /* renamed from: b */
    public int mo89251b(EnumC16739a enumC16739a) {
        C32552a m157651k = m157651k(enumC16739a.m89284g());
        if (m157651k != null && m157651k.f150437h <= enumC16739a.m89285h() && m157651k.f150431b >= enumC16739a.m89285h()) {
            return m157651k.f150431b;
        }
        return enumC16739a.m89285h();
    }

    @Override // com.zing.zalo.utils.NativeLoader.InterfaceC16736f
    /* renamed from: c */
    public boolean mo89252c(String str) {
        String m120972Gd;
        C32552a m157651k = m157651k(str);
        if (m157651k != null) {
            m120972Gd = m157651k.f150433d;
        } else {
            m120972Gd = AbstractC23309i.m120972Gd(str);
            if (TextUtils.isEmpty(m120972Gd)) {
                m120972Gd = NativeLoader.m89229h(MainApplication.getAppContext(), str);
                if (TextUtils.isEmpty(m120972Gd)) {
                    return true;
                }
                AbstractC23309i.m121810cz(str, m120972Gd);
            }
        }
        String m122116l1 = AbstractC23309i.m122116l1(str);
        if (TextUtils.isEmpty(m122116l1)) {
            m122116l1 = NativeLoader.m89228g(MainApplication.getAppContext(), str);
            if (TextUtils.isEmpty(m122116l1)) {
                return false;
            }
            AbstractC23309i.m122396sj(str, m122116l1);
            if (!m120972Gd.equalsIgnoreCase(m122116l1)) {
                if (m157651k == null) {
                    AbstractC20887g.m109237o(19112);
                } else {
                    AbstractC20887g.m109237o(19113);
                }
            }
        }
        boolean equalsIgnoreCase = m120972Gd.equalsIgnoreCase(m122116l1);
        if (!equalsIgnoreCase && Build.SUPPORTED_ABIS.length > 1 && m157651k == null) {
            ZipFile zipFile = null;
            try {
                try {
                    ApplicationInfo applicationInfo = CoreUtility.getAppContext().getApplicationInfo();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new File(applicationInfo.sourceDir));
                    String[] strArr = applicationInfo.splitSourceDirs;
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            File file = new File(str2);
                            if (file.exists()) {
                                arrayList.add(file);
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ZipFile zipFile2 = new ZipFile((File) it.next(), 1);
                        try {
                            int i11 = 0;
                            for (String str3 : Build.SUPPORTED_ABIS) {
                                i11++;
                                ZipEntry entry = zipFile2.getEntry("lib/" + str3 + "/" + System.mapLibraryName(str));
                                if (entry == null) {
                                    entry = zipFile2.getEntry("assets/libs/" + str3 + "/" + System.mapLibraryName(str));
                                }
                                if (entry != null) {
                                    try {
                                        InputStream inputStream = zipFile2.getInputStream(entry);
                                        try {
                                            String m122786b = AbstractC23352g.m122786b(inputStream);
                                            if (m122786b != null && m122786b.equals(m122116l1)) {
                                                AbstractC20887g.m109237o(19120);
                                                if (i11 == 1) {
                                                    AbstractC20887g.m109230h(19120, String.format("something wrong in checksum abi %s", str3));
                                                } else {
                                                    AbstractC20887g.m109230h(19120, String.format("system copy wrong abi: %1$s/%2$s", str3, Build.SUPPORTED_ABIS[0]));
                                                }
                                                AbstractC23309i.m121810cz(str, m122786b);
                                                AbstractC29237l.m145996a(inputStream);
                                                AbstractC29237l.m145996a(zipFile2);
                                                return true;
                                            }
                                            AbstractC29237l.m145996a(inputStream);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zipFile = inputStream;
                                            AbstractC29237l.m145996a(zipFile);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                            AbstractC29237l.m145996a(zipFile2);
                        } catch (Exception e11) {
                            e = e11;
                            zipFile = zipFile2;
                            AbstractC20110a.m104539h(e);
                            AbstractC29237l.m145996a(zipFile);
                            return equalsIgnoreCase;
                        } catch (Throwable th4) {
                            th = th4;
                            zipFile = zipFile2;
                            AbstractC29237l.m145996a(zipFile);
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Exception e12) {
                e = e12;
            }
            AbstractC29237l.m145996a(zipFile);
        }
        return equalsIgnoreCase;
    }

    /* renamed from: e */
    public void m157648e() {
        try {
            if (this.f150467c || !C23055e5.m118271f() || !AbstractC23138m0.m118770b()) {
                return;
            }
            if (Math.abs(System.currentTimeMillis() - AbstractC23309i.m120780B6()) < 172800000) {
                AbstractC20110a.m104535d("skip checkRequestDistributedLibrariesInfo by time --> check download so & model", new Object[0]);
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zt.d
                    public /* synthetic */ RunnableC32555d() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C32556e.this.m157647i();
                    }
                });
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new a());
            String m157645g = m157645g();
            if (m157645g == null) {
                m157645g = "";
            }
            this.f150467c = true;
            c0766k.mo1588Z6(m157645g);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m157649f() {
        try {
            for (EnumC16739a enumC16739a : EnumC16739a.m89281d()) {
                AbstractC23309i.m122396sj(enumC16739a.m89284g(), "");
                AbstractC23309i.m121810cz(enumC16739a.m89284g(), "");
                NativeLoader.m89225d(MainApplication.getAppContext(), enumC16739a.m89284g(), enumC16739a.m89285h());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m157650j() {
        String m121188M7 = AbstractC23309i.m121188M7();
        try {
            if (TextUtils.isEmpty(m121188M7)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(m121188M7);
            EnumC16739a[] m89280c = EnumC16739a.m89280c();
            this.f150465a = new HashMap();
            for (EnumC16739a enumC16739a : m89280c) {
                C32552a m157628d = C32552a.m157628d(enumC16739a.m89284g(), jSONObject);
                if (m157628d != null) {
                    this.f150465a.put(enumC16739a.m89284g(), m157628d);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    public C32552a m157651k(String str) {
        synchronized (this.f150466b) {
            try {
                if (this.f150465a == null) {
                    m157650j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Map map = this.f150465a;
        if (map != null && map.containsKey(str)) {
            return (C32552a) this.f150465a.get(str);
        }
        return null;
    }
}
