package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.b8 */
/* loaded from: classes.dex */
public final class C5305b8 extends AbstractC5678x7 {

    /* renamed from: u */
    static final AbstractC5678x7 f32274u = new C5305b8(new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f32275s;

    /* renamed from: t */
    private final transient int f32276t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5305b8(Object[] objArr, int i11) {
        this.f32275s = objArr;
        this.f32276t = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5678x7, com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: d */
    final int mo28945d(Object[] objArr, int i11) {
        System.arraycopy(this.f32275s, 0, objArr, 0, this.f32276t);
        return this.f32276t;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: e */
    final int mo28946e() {
        return this.f32276t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: g */
    public final int mo28947g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC5372f7.m29135a(i11, this.f32276t, "index");
        Object obj = this.f32275s[i11];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5593s7
    /* renamed from: j */
    public final Object[] mo28948j() {
        return this.f32275s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32276t;
    }
}
