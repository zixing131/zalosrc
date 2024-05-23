package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class x31 implements y31 {

    /* renamed from: a */
    private final Map f30314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x31(Map map) {
        this.f30314a = map;
    }

    @Override // com.google.android.gms.internal.ads.y31
    /* renamed from: a */
    public final c32 mo27824a(int i11, String str) {
        return (c32) this.f30314a.get(str);
    }
}
