package com.google.android.gms.internal.measurement;

import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.measurement.za */
/* loaded from: classes2.dex */
final class C5715za implements InterfaceC5393gb {

    /* renamed from: a */
    private final InterfaceC5647va f32963a;

    /* renamed from: b */
    private final AbstractC5478lb f32964b;

    /* renamed from: c */
    private final boolean f32965c;

    /* renamed from: d */
    private final AbstractC5442j9 f32966d;

    private C5715za(AbstractC5478lb abstractC5478lb, AbstractC5442j9 abstractC5442j9, InterfaceC5647va interfaceC5647va) {
        this.f32964b = abstractC5478lb;
        this.f32965c = abstractC5442j9.mo29283c(interfaceC5647va);
        this.f32966d = abstractC5442j9;
        this.f32963a = interfaceC5647va;
    }

    /* renamed from: g */
    public static C5715za m30109g(AbstractC5478lb abstractC5478lb, AbstractC5442j9 abstractC5442j9, InterfaceC5647va interfaceC5647va) {
        return new C5715za(abstractC5478lb, abstractC5442j9, interfaceC5647va);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: a */
    public final void mo29155a(Object obj) {
        this.f32964b.mo29430g(obj);
        this.f32966d.mo29282b(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: b */
    public final void mo29156b(Object obj, Object obj2) {
        AbstractC5427ib.m29240c(this.f32964b, obj, obj2);
        if (!this.f32965c) {
            return;
        }
        this.f32966d.mo29281a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: c */
    public final boolean mo29157c(Object obj, Object obj2) {
        if (!this.f32964b.mo29427d(obj).equals(this.f32964b.mo29427d(obj2))) {
            return false;
        }
        if (!this.f32965c) {
            return true;
        }
        this.f32966d.mo29281a(obj);
        this.f32966d.mo29281a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: d */
    public final boolean mo29158d(Object obj) {
        this.f32966d.mo29281a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: e */
    public final void mo29159e(Object obj, InterfaceC5326cc interfaceC5326cc) {
        this.f32966d.mo29281a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    /* renamed from: f */
    public final void mo29160f(Object obj, byte[] bArr, int i11, int i12, C5458k8 c5458k8) {
        AbstractC5612t9 abstractC5612t9 = (AbstractC5612t9) obj;
        if (abstractC5612t9.zzc == C5495mb.m29441c()) {
            abstractC5612t9.zzc = C5495mb.m29443f();
        }
        AbstractC30228a.m149044a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    public final int zza(Object obj) {
        AbstractC5478lb abstractC5478lb = this.f32964b;
        int mo29425b = abstractC5478lb.mo29425b(abstractC5478lb.mo29427d(obj));
        if (!this.f32965c) {
            return mo29425b;
        }
        this.f32966d.mo29281a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    public final int zzb(Object obj) {
        int hashCode = this.f32964b.mo29427d(obj).hashCode();
        if (!this.f32965c) {
            return hashCode;
        }
        this.f32966d.mo29281a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5393gb
    public final Object zze() {
        InterfaceC5647va interfaceC5647va = this.f32963a;
        if (interfaceC5647va instanceof AbstractC5612t9) {
            return ((AbstractC5612t9) interfaceC5647va).m29650k();
        }
        return interfaceC5647va.zzbJ().mo29561t();
    }
}
