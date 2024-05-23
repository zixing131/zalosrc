package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class fa3 implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f20079a;

    public fa3(Pattern pattern) {
        pattern.getClass();
        this.f20079a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f20079a.matcher(str).matches();
    }
}
