package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.u7 */
/* loaded from: classes.dex */
public final class C5627u7 extends AbstractC5525o7 {

    /* renamed from: r */
    private final AbstractC5678x7 f32836r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5627u7(AbstractC5678x7 abstractC5678x7, int i11) {
        super(abstractC5678x7.size(), i11);
        this.f32836r = abstractC5678x7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5525o7
    /* renamed from: a */
    protected final Object mo29484a(int i11) {
        return this.f32836r.get(i11);
    }
}
