package com.zing.zalo.preferences;

import android.text.TextUtils;
import com.zing.zalo.preferences.IPreferences;
import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.zing.zalo.preferences.a */
/* loaded from: classes.dex */
public class C9049a implements IPreferences {

    /* renamed from: b */
    public static final Object f48491b = new Object();

    /* renamed from: a */
    private final Map f48492a = Collections.synchronizedMap(new HashMap());

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: a */
    public long mo48440a(String str) {
        Object obj = this.f48492a.get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: b */
    public int mo48441b(String str) {
        Object obj = this.f48492a.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: c */
    public void mo48442c(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.length() > 100) {
            AbstractC20110a.m104545n("Value length for key: " + str + " exceeds cache limit of 100 chars. This value will always be retrieved from DB.", new Object[0]);
            this.f48492a.remove(str);
            return;
        }
        this.f48492a.put(str, str2);
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: d */
    public void mo48443d(String str, int i11) {
        this.f48492a.put(str, Integer.valueOf(i11));
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: e */
    public String mo48444e(String str) {
        Object obj = this.f48492a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (this.f48492a.containsKey(str)) {
            return null;
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: f */
    public boolean mo48445f(String str) {
        return this.f48492a.containsKey(str);
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: g */
    public boolean mo48446g(String str) {
        Object obj = this.f48492a.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: h */
    public void mo48447h(String str, long j11) {
        this.f48492a.put(str, Long.valueOf(j11));
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: i */
    public void mo48448i(String str, boolean z11) {
        this.f48492a.put(str, Boolean.valueOf(z11));
    }

    /* renamed from: j */
    public Object m48449j(String str) {
        return this.f48492a.get(str);
    }

    /* renamed from: k */
    public void m48450k(String str) {
        if (this.f48492a.containsKey(str)) {
            return;
        }
        this.f48492a.put(str, f48491b);
    }
}
