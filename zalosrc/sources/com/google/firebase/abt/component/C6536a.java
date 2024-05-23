package com.google.firebase.abt.component;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p015a9.InterfaceC0662b;
import p672y7.C30805b;

/* renamed from: com.google.firebase.abt.component.a */
/* loaded from: classes3.dex */
public class C6536a {

    /* renamed from: a */
    private final Map f36380a = new HashMap();

    /* renamed from: b */
    private final Context f36381b;

    /* renamed from: c */
    private final InterfaceC0662b f36382c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C6536a(Context context, InterfaceC0662b interfaceC0662b) {
        this.f36381b = context;
        this.f36382c = interfaceC0662b;
    }

    /* renamed from: a */
    protected C30805b m33462a(String str) {
        return new C30805b(this.f36381b, this.f36382c, str);
    }

    /* renamed from: b */
    public synchronized C30805b m33463b(String str) {
        try {
            if (!this.f36380a.containsKey(str)) {
                this.f36380a.put(str, m33462a(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C30805b) this.f36380a.get(str);
    }
}
