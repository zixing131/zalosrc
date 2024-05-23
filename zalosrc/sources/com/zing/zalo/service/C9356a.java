package com.zing.zalo.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.AbstractC1388a;

/* renamed from: com.zing.zalo.service.a */
/* loaded from: classes4.dex */
public class C9356a {

    /* renamed from: a */
    Class f49575a;

    /* renamed from: b */
    boolean f49576b = false;

    /* renamed from: c */
    boolean f49577c = false;

    public C9356a(Class cls) {
        this.f49575a = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m50474a(Service service) {
        this.f49576b = false;
        if (this.f49577c) {
            this.f49577c = false;
            service.stopSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m50475b(Context context, Intent intent) {
        this.f49576b = true;
        this.f49577c = false;
        AbstractC1388a.m6975q(context, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void m50476c(Context context) {
        try {
            if (this.f49576b) {
                this.f49577c = true;
            } else {
                context.stopService(new Intent(context, (Class<?>) this.f49575a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
