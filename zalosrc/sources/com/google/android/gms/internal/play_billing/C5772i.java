package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.i */
/* loaded from: classes2.dex */
final class C5772i {

    /* renamed from: a */
    private final Object f33333a;

    /* renamed from: b */
    private final Object f33334b;

    /* renamed from: c */
    private final Object f33335c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5772i(Object obj, Object obj2, Object obj3) {
        this.f33333a = obj;
        this.f33334b = obj2;
        this.f33335c = obj3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException m30274a() {
        Object obj = this.f33335c;
        Object obj2 = this.f33334b;
        Object obj3 = this.f33333a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
