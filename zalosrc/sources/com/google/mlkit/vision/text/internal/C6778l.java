package com.google.mlkit.vision.text.internal;

import android.content.Context;
import com.google.android.gms.common.C4148b;
import p012a6.AbstractC0631zg;
import p012a6.C0427og;
import p234ia.AbstractC20456e;
import p234ia.C20464i;
import qa.InterfaceC25205d;

/* renamed from: com.google.mlkit.vision.text.internal.l */
/* loaded from: classes.dex */
public final class C6778l extends AbstractC20456e {

    /* renamed from: b */
    private final C20464i f37218b;

    public C6778l(C20464i c20464i) {
        this.f37218b = c20464i;
    }

    @Override // p234ia.AbstractC20456e
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo902a(Object obj) {
        InterfaceC6776j c6771e;
        InterfaceC25205d interfaceC25205d = (InterfaceC25205d) obj;
        C0427og m906b = AbstractC0631zg.m906b(interfaceC25205d.mo130457a());
        Context m106497b = this.f37218b.m106497b();
        if (C4148b.m19567h().m19569b(m106497b) < 204700000 && !interfaceC25205d.mo130459c()) {
            c6771e = new C6772f(m106497b);
        } else {
            c6771e = new C6771e(m106497b, interfaceC25205d, m906b);
        }
        return new C6769c(m906b, c6771e, interfaceC25205d);
    }
}
