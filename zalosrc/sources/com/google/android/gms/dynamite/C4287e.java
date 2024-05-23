package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
/* loaded from: classes.dex */
final class C4287e implements DynamiteModule.InterfaceC4282a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC4282a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC4282a.b mo19930a(Context context, String str, DynamiteModule.InterfaceC4282a.a aVar) {
        DynamiteModule.InterfaceC4282a.b bVar = new DynamiteModule.InterfaceC4282a.b();
        int mo19932b = aVar.mo19932b(context, str);
        bVar.f16833a = mo19932b;
        if (mo19932b != 0) {
            bVar.f16835c = -1;
        } else {
            int mo19931a = aVar.mo19931a(context, str, true);
            bVar.f16834b = mo19931a;
            if (mo19931a != 0) {
                bVar.f16835c = 1;
            }
        }
        return bVar;
    }
}
