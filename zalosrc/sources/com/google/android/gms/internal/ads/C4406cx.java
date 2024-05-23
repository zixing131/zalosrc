package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cx */
/* loaded from: classes2.dex */
public final class C4406cx implements InterfaceC4852oz {

    /* renamed from: a */
    final /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC4480ex f19023a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4406cx(SharedPreferencesOnSharedPreferenceChangeListenerC4480ex sharedPreferencesOnSharedPreferenceChangeListenerC4480ex) {
        this.f19023a = sharedPreferencesOnSharedPreferenceChangeListenerC4480ex;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4852oz
    /* renamed from: a */
    public final String mo21233a(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f19023a.f19849e;
        return sharedPreferences.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4852oz
    /* renamed from: b */
    public final Double mo21234b(String str, double d11) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f19023a.f19849e;
            return Double.valueOf(sharedPreferences2.getFloat(str, (float) d11));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f19023a.f19849e;
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d11)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4852oz
    /* renamed from: c */
    public final Long mo21235c(String str, long j11) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f19023a.f19849e;
            return Long.valueOf(sharedPreferences2.getLong(str, j11));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f19023a.f19849e;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j11));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4852oz
    /* renamed from: d */
    public final Boolean mo21236d(String str, boolean z11) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.f19023a.f19849e;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z11));
        } catch (ClassCastException unused) {
            sharedPreferences = this.f19023a.f19849e;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z11)));
        }
    }
}
