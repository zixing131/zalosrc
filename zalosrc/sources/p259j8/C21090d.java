package p259j8;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p153f8.C18821f;
import p232i8.AbstractC20395h;
import p359n8.C23620g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j8.d */
/* loaded from: classes.dex */
public class C21090d {

    /* renamed from: b */
    private static final Charset f103090b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C23620g f103091a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j8.d$a */
    /* loaded from: classes3.dex */
    public class a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f103092a;

        a(String str) {
            this.f103092a = str;
            put("userId", str);
        }
    }

    public C21090d(C23620g c23620g) {
        this.f103091a = c23620g;
    }

    /* renamed from: d */
    private static Map m109563d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m109568k(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: e */
    private String m109564e(String str) {
        return m109568k(new JSONObject(str), "userId");
    }

    /* renamed from: f */
    private static String m109565f(Map map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: i */
    private static void m109566i(File file) {
        if (file.exists() && file.delete()) {
            C18821f.m98795f().m98800g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: j */
    private static String m109567j(String str) {
        return new a(str).toString();
    }

    /* renamed from: k */
    private static String m109568k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m109569a(String str) {
        return this.f103091a.m123834o(str, "internal-keys");
    }

    /* renamed from: b */
    public File m109570b(String str) {
        return this.f103091a.m123834o(str, "keys");
    }

    /* renamed from: c */
    public File m109571c(String str) {
        return this.f103091a.m123834o(str, "user-data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [long] */
    /* renamed from: g */
    public Map m109572g(String str, boolean z11) {
        File m109570b;
        FileInputStream fileInputStream;
        Exception e11;
        if (z11) {
            m109570b = m109569a(str);
        } else {
            m109570b = m109570b(str);
        }
        if (m109570b.exists()) {
            ?? length = m109570b.length();
            if (length != 0) {
                Closeable closeable = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(m109570b);
                    } catch (Exception e12) {
                        fileInputStream = null;
                        e11 = e12;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC20395h.m106209e(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                    try {
                        Map m109563d = m109563d(AbstractC20395h.m106204D(fileInputStream));
                        AbstractC20395h.m106209e(fileInputStream, "Failed to close user metadata file.");
                        return m109563d;
                    } catch (Exception e13) {
                        e11 = e13;
                        C18821f.m98795f().m98805l("Error deserializing user metadata.", e11);
                        m109566i(m109570b);
                        AbstractC20395h.m106209e(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable = length;
                    AbstractC20395h.m106209e(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        m109566i(m109570b);
        return Collections.emptyMap();
    }

    /* renamed from: h */
    public String m109573h(String str) {
        FileInputStream fileInputStream;
        File m109571c = m109571c(str);
        FileInputStream fileInputStream2 = null;
        if (m109571c.exists() && m109571c.length() != 0) {
            try {
                fileInputStream = new FileInputStream(m109571c);
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                AbstractC20395h.m106209e(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
            try {
                try {
                    String m109564e = m109564e(AbstractC20395h.m106204D(fileInputStream));
                    C18821f.m98795f().m98796b("Loaded userId " + m109564e + " for session " + str);
                    AbstractC20395h.m106209e(fileInputStream, "Failed to close user metadata file.");
                    return m109564e;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    AbstractC20395h.m106209e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                C18821f.m98795f().m98805l("Error deserializing user metadata.", e);
                m109566i(m109571c);
                AbstractC20395h.m106209e(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        }
        C18821f.m98795f().m98796b("No userId set for session " + str);
        m109566i(m109571c);
        return null;
    }

    /* renamed from: l */
    public void m109574l(String str, Map map, boolean z11) {
        File m109570b;
        if (z11) {
            m109570b = m109569a(str);
        } else {
            m109570b = m109570b(str);
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m109565f = m109565f(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m109570b), f103090b));
                try {
                    bufferedWriter2.write(m109565f);
                    bufferedWriter2.flush();
                    AbstractC20395h.m106209e(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    C18821f.m98795f().m98805l("Error serializing key/value metadata.", e);
                    m109566i(m109570b);
                    AbstractC20395h.m106209e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    AbstractC20395h.m106209e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: m */
    public void m109575m(String str, String str2) {
        File m109571c = m109571c(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m109567j = m109567j(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m109571c), f103090b));
                try {
                    bufferedWriter2.write(m109567j);
                    bufferedWriter2.flush();
                    AbstractC20395h.m106209e(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e11) {
                    e = e11;
                    bufferedWriter = bufferedWriter2;
                    C18821f.m98795f().m98805l("Error serializing user metadata.", e);
                    AbstractC20395h.m106209e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    AbstractC20395h.m106209e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }
}
