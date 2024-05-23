package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import p319l9.C22152a;
import p476r9.AbstractC25706n;
import p476r9.EnumC25703k;

/* renamed from: com.google.firebase.perf.session.gauges.i */
/* loaded from: classes3.dex */
class C6708i {

    /* renamed from: e */
    private static final C22152a f36895e = C22152a.m115524e();

    /* renamed from: a */
    private final Runtime f36896a;

    /* renamed from: b */
    private final ActivityManager f36897b;

    /* renamed from: c */
    private final ActivityManager.MemoryInfo f36898c;

    /* renamed from: d */
    private final Context f36899d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6708i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    /* renamed from: a */
    public int m34273a() {
        return AbstractC25706n.m132622c(EnumC25703k.f122724u.m132617b(this.f36898c.totalMem));
    }

    /* renamed from: b */
    public int m34274b() {
        return AbstractC25706n.m132622c(EnumC25703k.f122724u.m132617b(this.f36896a.maxMemory()));
    }

    /* renamed from: c */
    public int m34275c() {
        return AbstractC25706n.m132622c(EnumC25703k.f122722s.m132617b(this.f36897b.getMemoryClass()));
    }

    C6708i(Runtime runtime, Context context) {
        this.f36896a = runtime;
        this.f36899d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f36897b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f36898c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
