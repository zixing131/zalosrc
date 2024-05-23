package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
/* loaded from: classes.dex */
final class C4289g implements DynamiteModule.InterfaceC4282a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC4282a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC4282a.b mo19930a(Context context, String str, DynamiteModule.InterfaceC4282a.a aVar) {
        DynamiteModule.InterfaceC4282a.b bVar = new DynamiteModule.InterfaceC4282a.b();
        bVar.f16833a = aVar.mo19932b(context, str);
        int mo19931a = aVar.mo19931a(context, str, true);
        bVar.f16834b = mo19931a;
        int i11 = bVar.f16833a;
        if (i11 == 0) {
            i11 = 0;
            if (mo19931a == 0) {
                bVar.f16835c = 0;
                return bVar;
            }
        }
        if (i11 >= mo19931a) {
            bVar.f16835c = -1;
        } else {
            bVar.f16835c = 1;
        }
        return bVar;
    }
}
