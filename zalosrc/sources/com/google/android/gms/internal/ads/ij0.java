package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ij0 {

    /* renamed from: a */
    private final Map f22188a = new HashMap();

    /* renamed from: b */
    private final List f22189b = new ArrayList();

    /* renamed from: c */
    private final Context f22190c;

    /* renamed from: d */
    private final ei0 f22191d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ij0(Context context, ei0 ei0Var) {
        this.f22190c = context;
        this.f22191d = ei0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void m23272b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (!map.containsKey(str) || !((Set) map.get(str)).contains(str2)) {
            return;
        }
        this.f22191d.m21720e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void m23273c(String str) {
        SharedPreferences sharedPreferences;
        try {
            if (this.f22188a.containsKey(str)) {
                return;
            }
            if ("__default__".equals(str)) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f22190c);
            } else {
                sharedPreferences = this.f22190c.getSharedPreferences(str, 0);
            }
            hj0 hj0Var = new hj0(this, str);
            this.f22188a.put(str, hj0Var);
            sharedPreferences.registerOnSharedPreferenceChangeListener(hj0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void m23274d(gj0 gj0Var) {
        this.f22189b.add(gj0Var);
    }
}
