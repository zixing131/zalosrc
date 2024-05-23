package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.ndk.C6572i;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import p153f8.C18821f;
import p232i8.AbstractC20395h;
import p292k8.AbstractC21569b0;
import p292k8.AbstractC21573d0;
import p359n8.C23620g;
import p565v2.AbstractC27450f;

/* renamed from: com.google.firebase.crashlytics.ndk.d */
/* loaded from: classes.dex */
public class C6567d {

    /* renamed from: d */
    private static final Charset f36467d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f36468a;

    /* renamed from: b */
    private final InterfaceC6571h f36469b;

    /* renamed from: c */
    private final C23620g f36470c;

    public C6567d(Context context, InterfaceC6571h interfaceC6571h, C23620g c23620g) {
        this.f36468a = context;
        this.f36469b = interfaceC6571h;
        this.f36470c = c23620g;
    }

    /* renamed from: a */
    private static AbstractC21569b0.a m33539a(ApplicationExitInfo applicationExitInfo) {
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        AbstractC21569b0.a.b m111263a = AbstractC21569b0.a.m111263a();
        importance = applicationExitInfo.getImportance();
        AbstractC21569b0.a.b mo111283c = m111263a.mo111283c(importance);
        processName = applicationExitInfo.getProcessName();
        AbstractC21569b0.a.b mo111285e = mo111283c.mo111285e(processName);
        reason = applicationExitInfo.getReason();
        AbstractC21569b0.a.b mo111287g = mo111285e.mo111287g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        AbstractC21569b0.a.b mo111289i = mo111287g.mo111289i(timestamp);
        pid = applicationExitInfo.getPid();
        AbstractC21569b0.a.b mo111284d = mo111289i.mo111284d(pid);
        pss = applicationExitInfo.getPss();
        AbstractC21569b0.a.b mo111286f = mo111284d.mo111286f(pss);
        rss = applicationExitInfo.getRss();
        return mo111286f.mo111288h(rss).mo111290j(m33546i(applicationExitInfo)).mo111281a();
    }

    /* renamed from: b */
    public static String m33540b(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return m33549r(byteArrayOutputStream.toByteArray());
            }
        }
    }

    /* renamed from: c */
    private AbstractC21569b0.a m33541c(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m33543f(str);
        }
        return null;
    }

    /* renamed from: e */
    private C6572i.c m33542e(String str, File file) {
        return new C6572i.c(m33545h(file, ".dmp"), m33541c(str));
    }

    /* renamed from: f */
    private AbstractC21569b0.a m33543f(String str) {
        List historicalProcessExitReasons;
        long lastModified;
        historicalProcessExitReasons = ((ActivityManager) this.f36468a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        File m123834o = this.f36470c.m123834o(str, "start-time");
        if (m123834o == null) {
            lastModified = System.currentTimeMillis();
        } else {
            lastModified = m123834o.lastModified();
        }
        return m33544g(lastModified, historicalProcessExitReasons);
    }

    /* renamed from: g */
    private AbstractC21569b0.a m33544g(long j11, List list) {
        int reason;
        long timestamp;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo m140489a = AbstractC27450f.m140489a(it.next());
            reason = m140489a.getReason();
            if (reason == 5) {
                timestamp = m140489a.getTimestamp();
                if (timestamp >= j11) {
                    arrayList.add(m140489a);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return m33539a(AbstractC27450f.m140489a(arrayList.get(0)));
    }

    /* renamed from: h */
    private static File m33545h(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: i */
    private static String m33546i(ApplicationExitInfo applicationExitInfo) {
        InputStream traceInputStream;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            return m33540b(traceInputStream);
        } catch (IOException unused) {
            C18821f.m98795f().m98804k("Failed to get input stream from ApplicationExitInfo");
            return null;
        }
    }

    /* renamed from: o */
    private static void m33547o(C23620g c23620g, String str, String str2, String str3) {
        m33548q(new File(c23620g.m123829i(str), str3), str2);
    }

    /* renamed from: q */
    private static void m33548q(File file, String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f36467d));
            try {
                bufferedWriter2.write(str);
                AbstractC20395h.m106209e(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                AbstractC20395h.m106209e(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                AbstractC20395h.m106209e(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: r */
    private static String m33549r(byte[] bArr) {
        Base64.Encoder encoder;
        String encodeToString;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                encoder = Base64.getEncoder();
                encodeToString = encoder.encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return encodeToString;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: d */
    public C6572i m33550d(String str) {
        String str2;
        File m123829i = this.f36470c.m123829i(str);
        File file = new File(m123829i, "pending");
        C18821f.m98795f().m98802i("Minidump directory: " + file.getAbsolutePath());
        File m33545h = m33545h(file, ".dmp");
        C18821f m98795f = C18821f.m98795f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Minidump file ");
        if (m33545h != null && m33545h.exists()) {
            str2 = "exists";
        } else {
            str2 = "does not exist";
        }
        sb2.append(str2);
        m98795f.m98802i(sb2.toString());
        C6572i.b bVar = new C6572i.b();
        if (m123829i != null && m123829i.exists() && file.exists()) {
            bVar.m33576l(m33542e(str, file)).m33575k(m33545h(m123829i, ".device_info")).m33578n(new File(m123829i, "session.json")).m33572h(new File(m123829i, "app.json")).m33574j(new File(m123829i, "device.json")).m33577m(new File(m123829i, "os.json"));
        }
        return bVar.m33573i();
    }

    /* renamed from: j */
    public boolean m33551j(String str) {
        C6572i.c cVar = m33550d(str).f36481a;
        if (cVar != null && cVar.m33579a()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m33552k(String str, String str2, long j11, AbstractC21573d0 abstractC21573d0) {
        File m123829i = this.f36470c.m123829i(str);
        if (m123829i != null) {
            try {
                if (this.f36469b.mo33535a(m123829i.getCanonicalPath(), this.f36468a.getAssets())) {
                    m33553l(str, str2, j11);
                    m33554m(str, abstractC21573d0.mo111498a());
                    m33556p(str, abstractC21573d0.mo111500d());
                    m33555n(str, abstractC21573d0.mo111499c());
                    return true;
                }
                return false;
            } catch (IOException e11) {
                C18821f.m98795f().m98799e("Error initializing Crashlytics NDK", e11);
                return false;
            }
        }
        return false;
    }

    /* renamed from: l */
    public void m33553l(String str, String str2, long j11) {
        m33547o(this.f36470c, str, AbstractC6574k.m33588b(str, str2, j11), "session.json");
    }

    /* renamed from: m */
    public void m33554m(String str, AbstractC21573d0.a aVar) {
        m33547o(this.f36470c, str, AbstractC6574k.m33589c(aVar.mo111502a(), aVar.mo111506f(), aVar.mo111507g(), aVar.mo111505e(), aVar.mo111503c(), aVar.mo111504d().m98790d(), aVar.mo111504d().m98791e()), "app.json");
    }

    /* renamed from: n */
    public void m33555n(String str, AbstractC21573d0.b bVar) {
        m33547o(this.f36470c, str, AbstractC6574k.m33590d(bVar.mo111509a(), bVar.mo111514g(), bVar.mo111510b(), bVar.mo111517j(), bVar.mo111511d(), bVar.mo111512e(), bVar.mo111516i(), bVar.mo111513f(), bVar.mo111515h()), "device.json");
    }

    /* renamed from: p */
    public void m33556p(String str, AbstractC21573d0.c cVar) {
        m33547o(this.f36470c, str, AbstractC6574k.m33591e(cVar.mo111236d(), cVar.mo111235c(), cVar.mo111234b()), "os.json");
    }
}
