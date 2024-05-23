package p327lm;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import hh0.AbstractC20065c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import jh0.AbstractC21254a;
import om.C24308a;
import om.C24311d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lm.b */
/* loaded from: classes.dex */
public class C22522b extends AbstractC20065c {

    /* renamed from: c */
    private final String f110230c;

    /* renamed from: d */
    private final String f110231d;

    /* renamed from: e */
    private final String f110232e;

    /* renamed from: f */
    private final String f110233f;

    /* renamed from: g */
    private C24308a f110234g;

    /* renamed from: h */
    private C24311d f110235h;

    public C22522b(Context context) {
        super(context);
        this.f110230c = "PREFERECE_VIEWER";
        this.f110231d = "PREF_SDK_ID";
        this.f110232e = "PREF_PRIVATE_KEY";
        this.f110233f = "PREF_TRACKING_APP_INSTALL_EXP_TIME";
        this.f110234g = new C24308a();
        this.f110235h = new C24311d();
    }

    /* renamed from: p */
    private File m116478p(String str, boolean z11) {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/com.google.android.zdt.data/" + str);
        file.getParentFile().mkdirs();
        if (z11 && file.exists()) {
            file.delete();
        }
        return file;
    }

    /* renamed from: q */
    private StringBuilder m116479q(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb2 = new StringBuilder(256);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
            } else {
                fileInputStream.close();
                return sb2;
            }
        }
    }

    /* renamed from: r */
    private String m116480r(Context context, String str) {
        try {
            if (m116488k()) {
                File m116478p = m116478p(str, false);
                if (m116478p.exists()) {
                    return m116479q(m116478p).toString();
                }
            }
        } catch (Exception e11) {
            AbstractC21254a.m110061c(e11);
        }
        try {
            return m116479q(new File(context.getNoBackupFilesDir(), str)).toString();
        } catch (FileNotFoundException unused) {
            AbstractC21254a.m110070l("ZDK", "file %s not found in internal storage", str);
            AbstractC21254a.m110068j("can't read file " + str);
            return null;
        } catch (Exception e12) {
            AbstractC21254a.m110061c(e12);
            AbstractC21254a.m110068j("can't read file " + str);
            return null;
        }
    }

    /* renamed from: u */
    private void m116481u(String str, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        outputStreamWriter.write(str);
        outputStreamWriter.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    /* renamed from: v */
    private void m116482v(Context context, String str, String str2) {
        try {
            if (m116489l()) {
                File m116478p = m116478p(str2, true);
                m116478p.createNewFile();
                m116481u(str, m116478p);
                return;
            }
        } catch (Exception e11) {
            AbstractC21254a.m110061c(e11);
        }
        try {
            m116481u(str, new File(context.getNoBackupFilesDir(), str2));
        } catch (Exception e12) {
            AbstractC21254a.m110061c(e12);
            AbstractC21254a.m110068j("can't write file " + str2);
        }
    }

    /* renamed from: f */
    public String m116483f() {
        return this.f110234g.m126943a();
    }

    /* renamed from: g */
    public long m116484g() {
        return this.f110234g.m126944b();
    }

    /* renamed from: h */
    public String m116485h() {
        return this.f110235h.m126956a();
    }

    /* renamed from: i */
    public String m116486i() {
        return this.f110235h.m126957b();
    }

    /* renamed from: j */
    public String m116487j() {
        return m104278b("PREFERECE_VIEWER");
    }

    /* renamed from: k */
    public boolean m116488k() {
        if (!AbstractC22527g.m116531a(this.f98678b, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            return false;
        }
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m116489l() {
        if (!AbstractC22527g.m116531a(this.f98678b, "android.permission.WRITE_EXTERNAL_STORAGE") || !"mounted".equals(Environment.getExternalStorageState())) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m116490m() {
        try {
            if (m116488k()) {
                File m116478p = m116478p(this.f98678b.getPackageName(), false);
                if (m116478p.exists()) {
                    return true;
                }
                m116478p.createNewFile();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: n */
    public void m116491n() {
        String m116480r = m116480r(this.f98678b, "ddinfo2");
        if (!TextUtils.isEmpty(m116480r)) {
            try {
                JSONObject jSONObject = new JSONObject(m116480r);
                this.f110234g.m126945c(jSONObject.optString("deviceId"));
                this.f110234g.m126946d(jSONObject.optLong("expiredTime"));
            } catch (JSONException unused) {
            }
        }
        AbstractC21254a.m110068j("Loaded device info: " + this.f110234g.toString());
    }

    /* renamed from: o */
    public void m116492o() {
        if (this.f110235h == null) {
            this.f110235h = new C24311d();
        }
        this.f110235h.m126959d(this.f98677a.getString("PREF_SDK_ID", ""));
        this.f110235h.m126958c(this.f98677a.getString("PREF_PRIVATE_KEY", ""));
        AbstractC21254a.m110068j("Loaded sdk info: " + this.f110235h.toString());
    }

    /* renamed from: s */
    public void m116493s(String str, long j11) {
        this.f110234g.m126945c(str);
        this.f110234g.m126946d(j11);
        m116482v(this.f98678b, "{\"deviceId\":\"" + str + "\",\"expiredTime\":\"" + j11 + "\"}", "ddinfo2");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("write device info: ");
        sb2.append(this.f110234g.toString());
        AbstractC21254a.m110068j(sb2.toString());
    }

    /* renamed from: t */
    public void m116494t(String str, String str2) {
        m104280e("PREF_SDK_ID", str);
        m104280e("PREF_PRIVATE_KEY", str2);
        m116492o();
        AbstractC21254a.m110068j("write sdkid info: " + this.f110235h.toString());
    }
}
