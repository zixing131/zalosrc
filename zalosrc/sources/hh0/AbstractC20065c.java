package hh0;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: hh0.c */
/* loaded from: classes.dex */
public abstract class AbstractC20065c {

    /* renamed from: a */
    protected SharedPreferences f98677a;

    /* renamed from: b */
    protected Context f98678b;

    public AbstractC20065c(Context context) {
        this.f98678b = context;
        this.f98677a = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: c */
    public static void m104276c(Context context, String str, boolean z11) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean(str, z11);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public long m104277a(String str) {
        return this.f98677a.getLong(str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public String m104278b(String str) {
        return this.f98677a.getString(str, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m104279d(String str, long j11) {
        SharedPreferences.Editor edit = this.f98677a.edit();
        edit.putLong(str, j11);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m104280e(String str, String str2) {
        SharedPreferences.Editor edit = this.f98677a.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
