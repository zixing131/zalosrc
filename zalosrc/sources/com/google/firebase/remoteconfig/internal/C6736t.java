package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.t */
/* loaded from: classes3.dex */
public class C6736t {

    /* renamed from: c */
    private static final Map f37081c = new HashMap();

    /* renamed from: a */
    private final Context f37082a;

    /* renamed from: b */
    private final String f37083b;

    private C6736t(Context context, String str) {
        this.f37082a = context;
        this.f37083b = str;
    }

    /* renamed from: c */
    public static synchronized C6736t m34494c(Context context, String str) {
        C6736t c6736t;
        synchronized (C6736t.class) {
            try {
                Map map = f37081c;
                if (!map.containsKey(str)) {
                    map.put(str, new C6736t(context, str));
                }
                c6736t = (C6736t) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c6736t;
    }

    /* renamed from: a */
    public synchronized Void m34495a() {
        this.f37082a.deleteFile(this.f37083b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m34496b() {
        return this.f37083b;
    }

    /* renamed from: d */
    public synchronized C6723g m34497d() {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            fileInputStream = this.f37082a.openFileInput(this.f37083b);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                fileInputStream.read(bArr, 0, available);
                C6723g m34379b = C6723g.m34379b(new JSONObject(new String(bArr, "UTF-8")));
                fileInputStream.close();
                return m34379b;
            } catch (FileNotFoundException | JSONException unused) {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th2;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStream = null;
        } catch (Throwable th4) {
            fileInputStream = null;
            th2 = th4;
        }
    }

    /* renamed from: e */
    public synchronized Void m34498e(C6723g c6723g) {
        FileOutputStream openFileOutput = this.f37082a.openFileOutput(this.f37083b, 0);
        try {
            openFileOutput.write(c6723g.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}
