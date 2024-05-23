package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class g04 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static HashSet m22257a(int i11) {
        return new HashSet(m22260d(i11));
    }

    /* renamed from: b */
    public static LinkedHashMap m22258b(int i11) {
        return new LinkedHashMap(m22260d(i11));
    }

    /* renamed from: c */
    public static List m22259c(int i11) {
        if (i11 == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i11);
    }

    /* renamed from: d */
    private static int m22260d(int i11) {
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
