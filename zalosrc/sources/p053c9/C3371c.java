package p053c9;

import com.google.firebase.C6576e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c9.c */
/* loaded from: classes.dex */
public class C3371c {

    /* renamed from: a */
    private File f14260a;

    /* renamed from: b */
    private final C6576e f14261b;

    /* renamed from: c9.c$a */
    /* loaded from: classes.dex */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C3371c(C6576e c6576e) {
        this.f14261b = c6576e;
    }

    /* renamed from: a */
    private File m16963a() {
        if (this.f14260a == null) {
            synchronized (this) {
                try {
                    if (this.f14260a == null) {
                        this.f14260a = new File(this.f14261b.m33612j().getFilesDir(), "PersistedInstallation." + this.f14261b.m33615n() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f14260a;
    }

    /* renamed from: c */
    private JSONObject m16964c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m16963a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public AbstractC3372d m16965b(AbstractC3372d abstractC3372d) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC3372d.mo16940d());
            jSONObject.put("Status", abstractC3372d.mo16943g().ordinal());
            jSONObject.put("AuthToken", abstractC3372d.mo16938b());
            jSONObject.put("RefreshToken", abstractC3372d.mo16942f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC3372d.mo16944h());
            jSONObject.put("ExpiresInSecs", abstractC3372d.mo16939c());
            jSONObject.put("FisError", abstractC3372d.mo16941e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f14261b.m33612j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (!createTempFile.renameTo(m16963a())) {
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        }
        return abstractC3372d;
    }

    /* renamed from: d */
    public AbstractC3372d m16966d() {
        JSONObject m16964c = m16964c();
        String optString = m16964c.optString("Fid", null);
        int optInt = m16964c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = m16964c.optString("AuthToken", null);
        String optString3 = m16964c.optString("RefreshToken", null);
        long optLong = m16964c.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = m16964c.optLong("ExpiresInSecs", 0L);
        return AbstractC3372d.m16967a().mo16949d(optString).mo16952g(a.values()[optInt]).mo16947b(optString2).mo16951f(optString3).mo16953h(optLong).mo16948c(optLong2).mo16950e(m16964c.optString("FisError", null)).mo16946a();
    }
}
