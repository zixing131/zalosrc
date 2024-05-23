package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class f04 implements j04 {

    /* renamed from: a */
    private final Map f19919a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f04(Map map) {
        this.f19919a = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map m21861a() {
        return this.f19919a;
    }
}
