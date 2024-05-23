package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p230i6.AbstractC20321m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* loaded from: classes.dex */
public final class C5638v1 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ String f32845t;

    /* renamed from: u */
    final /* synthetic */ String f32846u;

    /* renamed from: v */
    final /* synthetic */ Context f32847v;

    /* renamed from: w */
    final /* synthetic */ Bundle f32848w;

    /* renamed from: x */
    final /* synthetic */ C5656w2 f32849x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5638v1(C5656w2 c5656w2, String str, String str2, Context context, Bundle bundle) {
        super(c5656w2, true);
        this.f32849x = c5656w2;
        this.f32845t = str;
        this.f32846u = str2;
        this.f32847v = context;
        this.f32848w = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    public final void mo28858a() {
        boolean m29821m;
        String str;
        String str2;
        String str3;
        InterfaceC5383g1 interfaceC5383g1;
        boolean z11;
        InterfaceC5383g1 interfaceC5383g12;
        String str4;
        String unused;
        try {
            m29821m = this.f32849x.m29821m(this.f32845t, this.f32846u);
            if (m29821m) {
                String str5 = this.f32846u;
                String str6 = this.f32845t;
                str4 = this.f32849x.f32873a;
                str3 = str5;
                str2 = str6;
                str = str4;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC4205o.m19722k(this.f32847v);
            C5656w2 c5656w2 = this.f32849x;
            c5656w2.f32881i = c5656w2.m29842s(this.f32847v, true);
            interfaceC5383g1 = this.f32849x.f32881i;
            if (interfaceC5383g1 == null) {
                unused = this.f32849x.f32873a;
                return;
            }
            int m19918a = DynamiteModule.m19918a(this.f32847v, ModuleDescriptor.MODULE_ID);
            int m19919c = DynamiteModule.m19919c(this.f32847v, ModuleDescriptor.MODULE_ID);
            int max = Math.max(m19918a, m19919c);
            if (m19919c < m19918a) {
                z11 = true;
            } else {
                z11 = false;
            }
            zzcl zzclVar = new zzcl(76003L, max, z11, str, str2, str3, this.f32848w, AbstractC20321m.m106019a(this.f32847v));
            interfaceC5383g12 = this.f32849x.f32881i;
            ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g12)).initialize(BinderC4273d.m19913I3(this.f32847v), zzclVar, this.f32471p);
        } catch (Exception e11) {
            this.f32849x.m29818j(e11, true, false);
        }
    }
}
