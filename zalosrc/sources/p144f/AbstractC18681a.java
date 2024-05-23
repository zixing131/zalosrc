package p144f;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONObject;
import p025b.AbstractC2473b;

/* renamed from: f.a */
/* loaded from: classes2.dex */
public abstract class AbstractC18681a {

    /* renamed from: a */
    protected Context f93901a = null;

    /* renamed from: b */
    private String f93902b = null;

    /* renamed from: c */
    private SharedPreferences f93903c = null;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String m98582a(String str) {
        String str2 = null;
        try {
            SharedPreferences sharedPreferences = this.f93901a.getSharedPreferences(this.f93902b, 0);
            this.f93903c = sharedPreferences;
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                long currentTimeMillis = System.currentTimeMillis();
                long optLong = jSONObject.optLong("expire");
                if (optLong != 0 && currentTimeMillis > optLong) {
                    this.f93903c.edit().remove(str).commit();
                }
                str2 = jSONObject.optString("data");
            }
        } catch (Exception e11) {
            AbstractC2473b.m12489b("PreferenceCache", "get", e11);
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m98583b(Context context, Class cls) {
        this.f93901a = context;
        this.f93902b = cls.getName();
    }

    /* renamed from: c */
    public boolean m98584c() {
        try {
            SharedPreferences sharedPreferences = this.f93901a.getSharedPreferences(this.f93902b, 0);
            this.f93903c = sharedPreferences;
            return sharedPreferences.edit().clear().commit();
        } catch (Exception e11) {
            AbstractC2473b.m12489b("PreferenceCache", "cleanUp", e11);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public boolean m98585d(String str, String str2, long j11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str2);
            jSONObject.put("expire", j11 != 0 ? System.currentTimeMillis() + j11 : 0L);
            SharedPreferences sharedPreferences = this.f93901a.getSharedPreferences(this.f93902b, 0);
            this.f93903c = sharedPreferences;
            return sharedPreferences.edit().putString(str, jSONObject.toString()).commit();
        } catch (Exception e11) {
            AbstractC2473b.m12489b("PreferenceCache", "put", e11);
            return false;
        }
    }
}
