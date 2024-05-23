package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.C4148b;
import p234ia.AbstractC20456e;
import p234ia.C20464i;
import p294ka.C21631b;
import p670y5.AbstractC30770yg;
import p670y5.C30561ng;

/* renamed from: com.google.mlkit.vision.barcode.internal.e */
/* loaded from: classes.dex */
public final class C6756e extends AbstractC20456e {

    /* renamed from: b */
    private final C20464i f37148b;

    public C6756e(C20464i c20464i) {
        this.f37148b = c20464i;
    }

    @Override // p234ia.AbstractC20456e
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo902a(Object obj) {
        InterfaceC6760i c6761j;
        C21631b c21631b = (C21631b) obj;
        Context m106497b = this.f37148b.m106497b();
        C30561ng m149736b = AbstractC30770yg.m149736b(AbstractC6753b.m34573d());
        if (!C6761j.m34586b(m106497b) && C4148b.m19567h().m19569b(m106497b) < 204500000) {
            c6761j = new C6762k(m106497b, c21631b, m149736b);
        } else {
            c6761j = new C6761j(m106497b, c21631b, m149736b);
        }
        return new C6759h(this.f37148b, c21631b, c6761j, m149736b);
    }
}
