package com.google.android.gms.common.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p229i5.AbstractC20291l;

/* renamed from: com.google.android.gms.common.internal.l */
/* loaded from: classes2.dex */
public class C4196l {

    /* renamed from: b */
    private static final C4184h f16624b = new C4184h("LibraryVersion", "");

    /* renamed from: c */
    private static C4196l f16625c = new C4196l();

    /* renamed from: a */
    private ConcurrentHashMap f16626a = new ConcurrentHashMap();

    protected C4196l() {
    }

    /* renamed from: a */
    public static C4196l m19698a() {
        return f16625c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m19699b(String str) {
        Object obj;
        AbstractC4205o.m19719h(str, "Please provide a valid libraryName");
        if (this.f16626a.containsKey(str)) {
            return (String) this.f16626a.get(str);
        }
        Properties properties = new Properties();
        ?? r42 = 0;
        r42 = 0;
        r42 = 0;
        InputStream inputStream = null;
        try {
            try {
                InputStream resourceAsStream = C4196l.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        String property = properties.getProperty("version", null);
                        f16624b.m19693e("LibraryVersion", str + " version is " + property);
                        r42 = property;
                    } else {
                        f16624b.m19694f("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                    if (resourceAsStream != null) {
                        AbstractC20291l.m105939a(resourceAsStream);
                    }
                } catch (IOException e11) {
                    e = e11;
                    Object obj2 = r42;
                    inputStream = resourceAsStream;
                    obj = obj2;
                    f16624b.m19692d("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    if (inputStream != null) {
                        AbstractC20291l.m105939a(inputStream);
                    }
                    r42 = obj;
                    if (r42 == 0) {
                    }
                    this.f16626a.put(str, r42);
                    return r42;
                } catch (Throwable th2) {
                    th = th2;
                    r42 = resourceAsStream;
                    if (r42 != 0) {
                        AbstractC20291l.m105939a(r42);
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                obj = null;
            }
            if (r42 == 0) {
                f16624b.m19690b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                r42 = "UNKNOWN";
            }
            this.f16626a.put(str, r42);
            return r42;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
