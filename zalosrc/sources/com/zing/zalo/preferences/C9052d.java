package com.zing.zalo.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.zing.zalo.preferences.IPreferences;

/* renamed from: com.zing.zalo.preferences.d */
/* loaded from: classes.dex */
public class C9052d implements IPreferences {

    /* renamed from: a */
    private final SharedPreferences f48497a;

    public C9052d(Context context, String str) {
        this.f48497a = context.getSharedPreferences(str, 0);
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: a */
    public long mo48440a(String str) {
        if (mo48445f(str)) {
            return this.f48497a.getLong(str, 0L);
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: b */
    public int mo48441b(String str) {
        if (mo48445f(str)) {
            return this.f48497a.getInt(str, 0);
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: c */
    public void mo48442c(String str, String str2) {
        this.f48497a.edit().putString(str, str2).apply();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: d */
    public void mo48443d(String str, int i11) {
        this.f48497a.edit().putInt(str, i11).apply();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: e */
    public String mo48444e(String str) {
        if (mo48445f(str)) {
            return this.f48497a.getString(str, null);
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: f */
    public boolean mo48445f(String str) {
        return this.f48497a.contains(str);
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: g */
    public boolean mo48446g(String str) {
        if (mo48445f(str)) {
            return this.f48497a.getBoolean(str, false);
        }
        throw new IPreferences.PreferencesExceptionNotFound();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: h */
    public void mo48447h(String str, long j11) {
        this.f48497a.edit().putLong(str, j11).apply();
    }

    @Override // com.zing.zalo.preferences.IPreferences
    /* renamed from: i */
    public void mo48448i(String str, boolean z11) {
        this.f48497a.edit().putBoolean(str, z11).apply();
    }
}
