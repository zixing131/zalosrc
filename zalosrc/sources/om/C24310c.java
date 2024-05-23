package om;

import android.content.Context;
import gh0.C19447a;
import hh0.AbstractC20064b;
import hh0.C20063a;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: om.c */
/* loaded from: classes.dex */
public class C24310c {

    /* renamed from: a */
    public String f117392a;

    /* renamed from: b */
    public String f117393b;

    /* renamed from: c */
    public Context f117394c;

    public C24310c(Context context) {
        this.f117394c = context;
    }

    /* renamed from: a */
    private boolean m126953a(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str2);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                if (str.contains(jSONArray.optString(i11))) {
                    return true;
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    /* renamed from: b */
    private boolean m126954b() {
        boolean z11;
        try {
            String m101721a = C19447a.m101720d().m101721a(this.f117394c);
            String m101725f = C19447a.m101720d().m101725f(this.f117394c);
            String m101726g = C19447a.m101720d().m101726g(this.f117394c);
            String lowerCase = C20063a.m104244m(this.f117394c).toLowerCase();
            boolean m126953a = m126953a(AbstractC20064b.m104253c().toLowerCase(), m101721a);
            boolean m126953a2 = m126953a(AbstractC20064b.m104261k().toLowerCase(), m101725f);
            boolean m126953a3 = m126953a(lowerCase, m101726g);
            if (m126953a && (m126953a2 || m126953a3)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f117392a = "preload_apk";
            }
            return z11;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m126955c() {
        String str;
        String str2 = this.f117392a;
        if ((str2 != null && str2.trim().length() > 0) || (((str = this.f117393b) != null && str.trim().length() > 0) || m126954b())) {
            return true;
        }
        return false;
    }

    public C24310c(Context context, String str, String str2) {
        this.f117394c = context;
        this.f117392a = str;
        this.f117393b = str2;
    }
}
