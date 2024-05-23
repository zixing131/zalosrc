package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class hj0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final String f21785a;

    /* renamed from: b */
    final /* synthetic */ ij0 f21786b;

    public hj0(ij0 ij0Var, String str) {
        this.f21786b = ij0Var;
        this.f21785a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<gj0> list;
        synchronized (this.f21786b) {
            try {
                list = this.f21786b.f22189b;
                for (gj0 gj0Var : list) {
                    gj0Var.f20611a.m23272b(gj0Var.f20612b, sharedPreferences, this.f21785a, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
