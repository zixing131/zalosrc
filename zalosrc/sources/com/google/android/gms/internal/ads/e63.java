package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class e63 extends w63 implements n83 {
    /* JADX INFO: Access modifiers changed from: protected */
    public e63(Map map) {
        super(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.w63
    /* renamed from: i */
    public final Collection mo21621i(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.w63
    /* renamed from: j */
    public final Collection mo21622j(Object obj, Collection collection) {
        return m27547o(obj, (List) collection, null);
    }
}
