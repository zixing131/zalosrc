package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* loaded from: classes.dex */
final class C4288f implements DynamiteModule.InterfaceC4282a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC4282a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC4282a.b mo19930a(Context context, String str, DynamiteModule.InterfaceC4282a.a aVar) {
        DynamiteModule.InterfaceC4282a.b bVar = new DynamiteModule.InterfaceC4282a.b();
        int mo19931a = aVar.mo19931a(context, str, false);
        bVar.f16834b = mo19931a;
        if (mo19931a == 0) {
            bVar.f16835c = 0;
        } else {
            bVar.f16835c = 1;
        }
        return bVar;
    }
}
