package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: classes2.dex */
public final class os0 extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f25746a;

    /* renamed from: b */
    private Context f25747b;

    /* renamed from: c */
    private Context f25748c;

    public os0(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity m25249a() {
        return this.f25746a;
    }

    /* renamed from: b */
    public final Context m25250b() {
        return this.f25748c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f25748c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Activity activity;
        Context applicationContext = context.getApplicationContext();
        this.f25747b = applicationContext;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.f25746a = activity;
        this.f25748c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f25746a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.f25747b.startActivity(intent);
        }
    }
}
