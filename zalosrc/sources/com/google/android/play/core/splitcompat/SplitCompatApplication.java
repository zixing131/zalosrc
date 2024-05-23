package com.google.android.play.core.splitcompat;

import android.app.Application;
import android.content.Context;
import p231i7.C20358b;

/* loaded from: classes3.dex */
public class SplitCompatApplication extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C20358b.m106109a(this);
    }
}
