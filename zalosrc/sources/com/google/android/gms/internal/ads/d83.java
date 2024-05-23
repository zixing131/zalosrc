package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class d83 {

    /* renamed from: a */
    private final Object f19132a;

    /* renamed from: b */
    private final Object f19133b;

    /* renamed from: c */
    private final Object f19134c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d83(Object obj, Object obj2, Object obj3) {
        this.f19132a = obj;
        this.f19133b = obj2;
        this.f19134c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException m21282a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f19132a + "=" + this.f19133b + " and " + this.f19132a + "=" + this.f19134c);
    }
}
