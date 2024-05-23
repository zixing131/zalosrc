package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* loaded from: classes2.dex */
public final class C5314c0 implements Comparator {

    /* renamed from: p */
    final /* synthetic */ AbstractC5432j f32301p;

    /* renamed from: q */
    final /* synthetic */ C5590s4 f32302q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5314c0(AbstractC5432j abstractC5432j, C5590s4 c5590s4) {
        this.f32301p = abstractC5432j;
        this.f32302q = c5590s4;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC5551q interfaceC5551q = (InterfaceC5551q) obj;
        InterfaceC5551q interfaceC5551q2 = (InterfaceC5551q) obj2;
        AbstractC5432j abstractC5432j = this.f32301p;
        C5590s4 c5590s4 = this.f32302q;
        if (interfaceC5551q instanceof C5636v) {
            if (interfaceC5551q2 instanceof C5636v) {
                return 0;
            }
            return 1;
        }
        if (interfaceC5551q2 instanceof C5636v) {
            return -1;
        }
        if (abstractC5432j == null) {
            return interfaceC5551q.zzi().compareTo(interfaceC5551q2.zzi());
        }
        return (int) AbstractC5608t5.m29610a(abstractC5432j.mo28891a(c5590s4, Arrays.asList(interfaceC5551q, interfaceC5551q2)).zzh().doubleValue());
    }
}
