package p418p8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;
import p153f8.C18821f;
import p232i8.AbstractC20395h;
import p359n8.C23620g;

/* renamed from: p8.a */
/* loaded from: classes.dex */
public class C24665a {

    /* renamed from: a */
    private final File f118581a;

    public C24665a(C23620g c23620g) {
        this.f118581a = c23620g.m123825e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m128197a() {
        return this.f118581a;
    }

    /* renamed from: b */
    public JSONObject m128198b() {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C18821f.m98795f().m98796b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File m128197a = m128197a();
                if (m128197a.exists()) {
                    fileInputStream = new FileInputStream(m128197a);
                    try {
                        jSONObject = new JSONObject(AbstractC20395h.m106204D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e = e11;
                        C18821f.m98795f().m98799e("Failed to fetch cached settings", e);
                        AbstractC20395h.m106209e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C18821f.m98795f().m98802i("Settings file does not exist.");
                    jSONObject = null;
                }
                AbstractC20395h.m106209e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                AbstractC20395h.m106209e(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            AbstractC20395h.m106209e(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    /* renamed from: c */
    public void m128199c(long j11, JSONObject jSONObject) {
        C18821f.m98795f().m98802i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    jSONObject.put("expires_at", j11);
                    FileWriter fileWriter2 = new FileWriter(m128197a());
                    try {
                        fileWriter2.write(jSONObject.toString());
                        fileWriter2.flush();
                        AbstractC20395h.m106209e(fileWriter2, "Failed to close settings writer.");
                    } catch (Exception e11) {
                        e = e11;
                        fileWriter = fileWriter2;
                        C18821f.m98795f().m98799e("Failed to cache settings", e);
                        AbstractC20395h.m106209e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter = fileWriter2;
                        AbstractC20395h.m106209e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
