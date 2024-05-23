package com.zing.zalo.service;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import com.zing.zalo.MainApplication;
import com.zing.zalo.service.ZaloIntentServiceEmulate;
import dg0.AbstractC17930e;
import mm0.AbstractC23350e;

/* loaded from: classes.dex */
public abstract class ZaloIntentServiceEmulate {

    /* renamed from: a */
    static final String f49572a = "ZaloIntentServiceEmulate";

    /* renamed from: b */
    static int f49573b;

    /* renamed from: b */
    public static void m50468b(Intent intent, Class cls) {
        try {
            ZaloIntentServiceEmulate zaloIntentServiceEmulate = (ZaloIntentServiceEmulate) cls.newInstance();
            int i11 = f49573b;
            f49573b = i11 + 1;
            zaloIntentServiceEmulate.m50470g(intent, i11, 0L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m50469d(Intent intent, int i11) {
        try {
            try {
                mo50445f(intent);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f49572a, e11);
            }
        } finally {
            m50472e(i11);
        }
    }

    /* renamed from: g */
    private void m50470g(final Intent intent, final int i11, long j11) {
        Runnable runnable = new Runnable() { // from class: q00.o
            @Override // java.lang.Runnable
            public final void run() {
                ZaloIntentServiceEmulate.this.m50469d(intent, i11);
            }
        };
        if (j11 > 0) {
            AbstractC17930e.m94545d().mo94531e(runnable, j11);
        } else {
            AbstractC0837p0.m2225f().mo2040a(runnable);
        }
    }

    /* renamed from: c */
    public Context m50471c() {
        return MainApplication.getAppContext();
    }

    /* renamed from: e */
    public void m50472e(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onFinishCommand:");
        sb2.append(i11);
    }

    /* renamed from: f */
    protected abstract void mo50445f(Intent intent);
}
