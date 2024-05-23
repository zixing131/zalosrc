package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Field;

/* renamed from: com.google.android.play.core.splitinstall.internal.b */
/* loaded from: classes3.dex */
public class C6515b {

    /* renamed from: a */
    private final Object f36347a;

    /* renamed from: b */
    private final Field f36348b;

    /* renamed from: c */
    private final Class f36349c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6515b(Object obj, Field field, Class cls) {
        this.f36347a = obj;
        this.f36348b = field;
        this.f36349c = cls;
    }

    /* renamed from: a */
    public final Object m33390a() {
        try {
            return this.f36349c.cast(this.f36348b.get(this.f36347a));
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to get value of field %s of type %s on object of type %s", this.f36348b.getName(), this.f36347a.getClass().getName(), this.f36349c.getName()), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final Field m33391b() {
        return this.f36348b;
    }

    /* renamed from: c */
    public final void m33392c(Object obj) {
        try {
            this.f36348b.set(this.f36347a, obj);
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to set value of field %s of type %s on object of type %s", this.f36348b.getName(), this.f36347a.getClass().getName(), this.f36349c.getName()), e11);
        }
    }
}
