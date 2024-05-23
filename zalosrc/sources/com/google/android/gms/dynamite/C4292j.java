package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.j */
/* loaded from: classes.dex */
final class C4292j implements DynamiteModule.InterfaceC4282a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC4282a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC4282a.b mo19930a(Context context, String str, DynamiteModule.InterfaceC4282a.a aVar) {
        int mo19931a;
        DynamiteModule.InterfaceC4282a.b bVar = new DynamiteModule.InterfaceC4282a.b();
        int mo19932b = aVar.mo19932b(context, str);
        bVar.f16833a = mo19932b;
        int i11 = 0;
        if (mo19932b != 0) {
            mo19931a = aVar.mo19931a(context, str, false);
            bVar.f16834b = mo19931a;
        } else {
            mo19931a = aVar.mo19931a(context, str, true);
            bVar.f16834b = mo19931a;
        }
        int i12 = bVar.f16833a;
        if (i12 == 0) {
            if (mo19931a == 0) {
                bVar.f16835c = 0;
                return bVar;
            }
        } else {
            i11 = i12;
        }
        if (mo19931a >= i11) {
            bVar.f16835c = 1;
        } else {
            bVar.f16835c = -1;
        }
        return bVar;
    }
}
