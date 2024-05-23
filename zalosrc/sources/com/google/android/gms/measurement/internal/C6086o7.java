package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o7 */
/* loaded from: classes.dex */
public final class C6086o7 extends AbstractC6067n {

    /* renamed from: e */
    final /* synthetic */ C5977e8 f34309e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6086o7(C5977e8 c5977e8, InterfaceC6073n5 interfaceC6073n5) {
        super(interfaceC6073n5);
        this.f34309e = c5977e8;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6067n
    /* renamed from: c */
    public final void mo31147c() {
        C5977e8 c5977e8 = this.f34309e;
        c5977e8.mo31036g();
        if (!c5977e8.m30892z()) {
            return;
        }
        c5977e8.f34158a.mo31033c().m31201u().m31108a("Inactivity, disconnecting from the service");
        c5977e8.m30874Q();
    }
}
