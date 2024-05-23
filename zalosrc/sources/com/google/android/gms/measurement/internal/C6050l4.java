package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC5309bc;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* loaded from: classes2.dex */
final class C6050l4 implements InterfaceC5309bc {

    /* renamed from: a */
    final /* synthetic */ String f34156a;

    /* renamed from: b */
    final /* synthetic */ C6061m4 f34157b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6050l4(C6061m4 c6061m4, String str) {
        this.f34157b = c6061m4;
        this.f34156a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5309bc
    public final String zza(String str) {
        Map map;
        map = this.f34157b.f34205d;
        Map map2 = (Map) map.get(this.f34156a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
