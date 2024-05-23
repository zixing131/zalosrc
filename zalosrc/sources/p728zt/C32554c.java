package p728zt;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.appcompat.widget.AbstractC1158c0;
import au.AbstractC2378v0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import hm0.C20096c;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me0.AbstractC23041d2;
import me0.AbstractC23138m0;
import me0.AbstractC23204s0;
import me0.AbstractC23238v2;
import me0.C23055e5;
import mm0.AbstractC23352g;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p267jh.C21253b;
import p348mi.AbstractC23309i;
import p609wh.AbstractC29004d;
import p664y.AbstractC30228a;

/* renamed from: zt.c */
/* loaded from: classes.dex */
public class C32554c implements NativeLoader.InterfaceC16735e {

    /* renamed from: b */
    static C32554c f150446b;

    /* renamed from: a */
    final Set f150447a = new C21253b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zt.c$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC29004d {

        /* renamed from: a */
        final /* synthetic */ File f150448a;

        /* renamed from: b */
        final /* synthetic */ File f150449b;

        /* renamed from: c */
        final /* synthetic */ String f150450c;

        /* renamed from: d */
        final /* synthetic */ File f150451d;

        /* renamed from: e */
        final /* synthetic */ Properties f150452e;

        /* renamed from: f */
        final /* synthetic */ int f150453f;

        /* renamed from: g */
        final /* synthetic */ EnumC16739a f150454g;

        a(File file, File file2, String str, File file3, Properties properties, int i11, EnumC16739a enumC16739a) {
            this.f150448a = file;
            this.f150449b = file2;
            this.f150450c = str;
            this.f150451d = file3;
            this.f150452e = properties;
            this.f150453f = i11;
            this.f150454g = enumC16739a;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC20110a.m104535d("download asset error: " + c20096c, new Object[0]);
            AbstractC23041d2.m118211j(this.f150449b);
            this.f150451d.delete();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:1|2|3|(2:5|(1:7)(3:8|9|10))|12|13|14|15|16|17|(2:20|18)|21|9|10|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:            r6 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:            r6.printStackTrace();     */
        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo1343f(JSONObject jSONObject) {
            FileOutputStream fileOutputStream;
            try {
                AbstractC20110a.m104535d("asset onRequestComplete: " + jSONObject, new Object[0]);
                AbstractC2378v0.m12421d(this.f150448a, this.f150449b);
                this.f150448a.delete();
            } catch (Exception e11) {
                e11.printStackTrace();
                AbstractC23041d2.m118211j(this.f150449b);
                this.f150451d.delete();
            }
            try {
                if (!TextUtils.isEmpty(this.f150450c)) {
                    if (!this.f150450c.equalsIgnoreCase(AbstractC20130d.m104881m(this.f150449b))) {
                        AbstractC23041d2.m118211j(this.f150449b);
                        this.f150451d.delete();
                        AbstractC20110a.m104535d("Download success!!", new Object[0]);
                        return;
                    }
                }
                this.f150452e.setProperty("version", String.valueOf(this.f150453f));
                this.f150452e.setProperty("lastChecksum", String.valueOf(System.currentTimeMillis()));
                this.f150452e.store(fileOutputStream, "info");
                fileOutputStream.close();
                Iterator it = C32554c.this.f150447a.iterator();
                while (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                }
                AbstractC20110a.m104535d("Download success!!", new Object[0]);
                return;
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
            fileOutputStream = new FileOutputStream(this.f150451d);
        }

        @Override // p609wh.AbstractC29004d
        /* renamed from: g */
        public void mo144879g(long j11, long j12) {
            super.mo144879g(j11, j12);
            AbstractC20110a.m104535d("download asset onDownloadProgress: %d / %d", Long.valueOf(j11), Long.valueOf(j12));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zt.c$b */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ File f150456p;

        /* renamed from: q */
        final /* synthetic */ C32552a f150457q;

        /* renamed from: r */
        final /* synthetic */ EnumC16739a f150458r;

        /* renamed from: zt.c$b$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC29004d {

            /* renamed from: a */
            final /* synthetic */ File f150460a;

            /* renamed from: b */
            final /* synthetic */ long f150461b;

            a(File file, long j11) {
                this.f150460a = file;
                this.f150461b = j11;
            }

            @Override // jm0.InterfaceC21299i
            /* renamed from: c */
            public void mo1342c(C20096c c20096c) {
                b.this.f150457q.m157632e(false);
                AbstractC20887g.m109238p(19101, this.f150461b);
                AbstractC20887g.m109230h(19101, "download so error: " + b.this.f150457q.f150434e);
                AbstractC20110a.m104535d("download so error: %s", c20096c);
                Iterator it = C32554c.this.f150447a.iterator();
                while (it.hasNext()) {
                    AbstractC30228a.m149044a(it.next());
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:            r1 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(r5.f150462c.f150456p));     */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:            p620wt.AbstractC29238m.m145997a(r0.getInputStream(r2), r1);     */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:            r1.close();     */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:            r0.close();        r5.f150460a.delete();        p248iy.AbstractC20887g.m109246x(19101, r5.f150461b);        r0 = r5.f150462c.f150459s.f150447a.iterator();     */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:            if (r0.hasNext() == false) goto L52;     */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:            p664y.AbstractC30228a.m149044a(r0.next());     */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:            r2 = move-exception;     */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:            throw r2;     */
            @Override // jm0.InterfaceC21299i
            /* renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void mo1343f(JSONObject jSONObject) {
                try {
                    ZipFile zipFile = new ZipFile(this.f150460a);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile.entries();
                        while (true) {
                            if (!entries.hasMoreElements()) {
                                break;
                            }
                            ZipEntry nextElement = entries.nextElement();
                            if (nextElement.getName() != null && nextElement.getName().endsWith(".so")) {
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            zipFile.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    AbstractC20110a.m104539h(e11);
                    AbstractC20887g.m109238p(19101, this.f150461b);
                    AbstractC20887g.m109230h(19101, "download so error: " + b.this.f150457q.f150434e);
                }
                b.this.f150457q.m157632e(false);
                AbstractC20110a.m104535d("Download success!!", new Object[0]);
            }

            @Override // p609wh.AbstractC29004d
            /* renamed from: g */
            public void mo144879g(long j11, long j12) {
                super.mo144879g(j11, j12);
                AbstractC20110a.m104535d("download so onDownloadProgress: %d / %d", Long.valueOf(j11), Long.valueOf(j12));
            }
        }

        b(File file, C32552a c32552a, EnumC16739a enumC16739a) {
            this.f150456p = file;
            this.f150457q = c32552a;
            this.f150458r = enumC16739a;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j11;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f150456p.exists()) {
                    if (AbstractC23352g.m122787c(this.f150457q.f150433d, this.f150456p)) {
                        AbstractC20110a.m104535d("downloadFileIfNeeded: md5 ok skip download " + this.f150458r, new Object[0]);
                        this.f150457q.m157632e(false);
                        return;
                    }
                    this.f150456p.delete();
                }
                String m119555f = AbstractC23204s0.m119555f();
                if (this.f150456p.getPath().startsWith("")) {
                    j11 = 31457280;
                } else {
                    j11 = 15728640;
                }
                if (C32554c.this.m157638f(15728640L, m119555f) && C32554c.this.m157638f(j11, this.f150456p.getPath())) {
                    AbstractC23309i.m122366rq(this.f150457q.f150434e, System.currentTimeMillis());
                    File file = new File(m119555f, this.f150457q.m157629a());
                    Iterator it = C32554c.this.f150447a.iterator();
                    while (it.hasNext()) {
                        AbstractC30228a.m149044a(it.next());
                    }
                    AbstractC20110a.m104535d("downloadFileIfNeeded: start " + this.f150457q.f150430a, new Object[0]);
                    C0766k c0766k = new C0766k();
                    C32552a c32552a = this.f150457q;
                    String str = c32552a.f150430a;
                    long j12 = c32552a.f150435f;
                    if (j12 <= 0) {
                        j12 = -1;
                    }
                    c0766k.mo1727r7(str, file, j12, c32552a.f150432c, new a(file, currentTimeMillis));
                    return;
                }
                this.f150457q.m157632e(false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    public static C32554c m157634h() {
        if (f150446b == null) {
            f150446b = new C32554c();
        }
        return f150446b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m157635i(C32552a c32552a, Context context, EnumC16739a enumC16739a) {
        JSONArray optJSONArray;
        try {
            try {
                synchronized (c32552a.f150441l) {
                    if (c32552a.f150441l.get()) {
                        synchronized (c32552a.f150441l) {
                            c32552a.f150441l.set(false);
                        }
                        return;
                    }
                    c32552a.f150441l.set(true);
                    JSONObject jSONObject = c32552a.f150438i;
                    if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("assets")) != null && optJSONArray.length() > 0) {
                        File m157630b = c32552a.m157630b(context);
                        if (m157630b == null) {
                            synchronized (c32552a.f150441l) {
                                c32552a.f150441l.set(false);
                            }
                            return;
                        }
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 != null) {
                                try {
                                    m157637e(enumC16739a, c32552a, m157630b, jSONObject2);
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                            }
                        }
                    }
                    synchronized (c32552a.f150441l) {
                        c32552a.f150441l.set(false);
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                synchronized (c32552a.f150441l) {
                    c32552a.f150441l.set(false);
                }
            }
        } catch (Throwable th2) {
            synchronized (c32552a.f150441l) {
                c32552a.f150441l.set(false);
                throw th2;
            }
        }
    }

    /* renamed from: k */
    static long m157636k(Properties properties, String str, String str2) {
        return Long.parseLong(properties.getProperty(str, str2));
    }

    @Override // com.zing.zalo.utils.NativeLoader.InterfaceC16735e
    /* renamed from: a */
    public void mo89247a(EnumC16739a enumC16739a) {
        EnumC16739a[] m89283e;
        if (C23055e5.m118271f() && AbstractC23138m0.m118770b() && Math.abs(System.currentTimeMillis() - AbstractC23309i.m121519V5(enumC16739a.m89284g())) >= 5000 && (m89283e = enumC16739a.m89283e()) != null && m89283e.length > 0) {
            for (EnumC16739a enumC16739a2 : m89283e) {
                C32552a m157651k = C32556e.m157646h().m157651k(enumC16739a2.m89284g());
                if (m157651k != null && !m157651k.m157631c() && m157651k.f150437h <= enumC16739a2.m89285h()) {
                    try {
                        m157639g(enumC16739a, m157651k, NativeLoader.m89236o(MainApplication.getAppContext(), enumC16739a2.m89284g(), m157651k.f150431b));
                        m157643n(MainApplication.getAppContext(), enumC16739a, m157651k);
                    } catch (PackageManager.NameNotFoundException e11) {
                        e11.printStackTrace();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.zing.zalo.utils.NativeLoader.InterfaceC16735e
    /* renamed from: b */
    public void mo89248b(String str, File file) {
        C32552a m157651k = C32556e.m157646h().m157651k(str);
        if (m157651k == null || !file.exists()) {
            return;
        }
        m157640j(m157651k, file);
    }

    @Override // com.zing.zalo.utils.NativeLoader.InterfaceC16735e
    /* renamed from: c */
    public void mo89249c(EnumC16739a enumC16739a, File file) {
        C32552a m157651k;
        if (C23055e5.m118271f() && AbstractC23138m0.m118770b() && Math.abs(System.currentTimeMillis() - AbstractC23309i.m121519V5(enumC16739a.m89284g())) >= 5000 && (m157651k = C32556e.m157646h().m157651k(enumC16739a.m89284g())) != null && !m157651k.m157631c() && m157651k.f150437h <= enumC16739a.m89285h()) {
            m157639g(enumC16739a, m157651k, file);
            m157643n(MainApplication.getAppContext(), enumC16739a, m157651k);
        }
    }

    /* renamed from: e */
    void m157637e(EnumC16739a enumC16739a, C32552a c32552a, File file, JSONObject jSONObject) {
        boolean z11;
        long j11;
        AbstractC20110a.m104535d("checkDownloadStaticFile: " + jSONObject, new Object[0]);
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.getString("name");
        int optInt = jSONObject.optInt("version", 0);
        String string2 = jSONObject.getString("checksum_zip");
        String optString = jSONObject.optString("checksum_inside");
        if (c32552a.f150431b < jSONObject.optInt("libraryVersion", 0)) {
            return;
        }
        String string3 = jSONObject.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        File file2 = new File(file, string);
        Properties properties = new Properties();
        File file3 = new File(file, string + ".properties");
        if (file2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file3);
                try {
                    properties.load(fileInputStream);
                    fileInputStream.close();
                } finally {
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            long m157636k = m157636k(properties, "version", "0");
            long m157636k2 = m157636k(properties, "lastChecksum", "0");
            if (optInt != m157636k) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && Math.abs(System.currentTimeMillis() - m157636k2) > 86400000 && !TextUtils.isEmpty(optString) && !(!optString.equalsIgnoreCase(AbstractC20130d.m104881m(file2)))) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        properties.setProperty("lastChecksum", String.valueOf(System.currentTimeMillis()));
                        properties.store(fileOutputStream, "info");
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            if (!z11) {
                return;
            }
        }
        AbstractC23041d2.m118211j(file2);
        file2.mkdirs();
        String m119555f = AbstractC23204s0.m119555f();
        if (file2.getPath().startsWith("")) {
            j11 = 31457280;
        } else {
            j11 = 15728640;
        }
        if (m157638f(15728640L, m119555f) && m157638f(j11, file2.getPath())) {
            File file4 = new File(m119555f, c32552a.m157629a() + "_" + string);
            Iterator it = this.f150447a.iterator();
            while (it.hasNext()) {
                AbstractC1158c0.m5500a(it.next());
            }
            new C0766k().mo1727r7(string3, file4, -1L, string2, new a(file4, file2, optString, file3, properties, optInt, enumC16739a));
        }
    }

    /* renamed from: f */
    boolean m157638f(long j11, String str) {
        long m119721f = AbstractC23238v2.m119721f(str);
        if (m119721f > 0 && m119721f < j11) {
            AbstractC20887g.m109237o(19105);
            return false;
        }
        return true;
    }

    /* renamed from: g */
    void m157639g(EnumC16739a enumC16739a, C32552a c32552a, File file) {
        AbstractC20110a.m104535d("downloadFileIfNeeded: " + enumC16739a, new Object[0]);
        if (!c32552a.m157632e(true)) {
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new b(file, c32552a, enumC16739a));
    }

    /* renamed from: j */
    void m157640j(C32552a c32552a, File file) {
        try {
            AbstractC20887g.m109237o(19103);
            if (!AbstractC20130d.m104875j(file).equalsIgnoreCase(c32552a.f150433d)) {
                file.delete();
                AbstractC20887g.m109237o(19104);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l */
    public void m157641l() {
        try {
            for (EnumC16739a enumC16739a : EnumC16739a.m89280c()) {
                C32552a m157651k = C32556e.m157646h().m157651k(enumC16739a.m89284g());
                if (m157651k != null && m157651k.f150437h <= enumC16739a.m89285h()) {
                    NativeLoader.m89225d(MainApplication.getAppContext(), m157651k.f150434e, m157651k.f150431b);
                    m157642m(MainApplication.getAppContext(), enumC16739a, m157651k);
                }
                if (m157651k != null) {
                    m157643n(MainApplication.getAppContext(), enumC16739a, m157651k);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m157642m(Context context, EnumC16739a enumC16739a, C32552a c32552a) {
        if (c32552a == null || c32552a.m157631c() || !C23055e5.m118271f() || !AbstractC23138m0.m118770b() || Math.abs(System.currentTimeMillis() - AbstractC23309i.m121519V5(c32552a.f150434e)) < 5000) {
            return;
        }
        m157639g(enumC16739a, c32552a, NativeLoader.m89236o(context, c32552a.f150434e, c32552a.f150431b));
    }

    /* renamed from: n */
    void m157643n(final Context context, final EnumC16739a enumC16739a, final C32552a c32552a) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zt.b
            @Override // java.lang.Runnable
            public final void run() {
                C32554c.this.m157635i(c32552a, context, enumC16739a);
            }
        });
    }
}
