package com.google.android.play.core.install;

import android.content.Intent;
import p051c7.C3325t;

/* renamed from: com.google.android.play.core.install.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6501a {
    /* renamed from: f */
    public static AbstractC6501a m33368f(Intent intent, C3325t c3325t) {
        c3325t.m16797a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        c3325t.m16797a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        c3325t.m16797a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new C6503c(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
    }

    /* renamed from: a */
    public abstract long mo33369a();

    /* renamed from: b */
    public abstract int mo33370b();

    /* renamed from: c */
    public abstract int mo33371c();

    /* renamed from: d */
    public abstract String mo33372d();

    /* renamed from: e */
    public abstract long mo33373e();
}
