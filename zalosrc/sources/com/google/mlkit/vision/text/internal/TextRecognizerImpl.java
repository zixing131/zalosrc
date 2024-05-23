package com.google.mlkit.vision.text.internal;

import com.google.android.gms.common.Feature;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Executor;
import p012a6.C0271gc;
import p012a6.C0425oe;
import p012a6.C0427og;
import p012a6.C0482re;
import p012a6.C0484rg;
import p012a6.EnumC0214dc;
import p012a6.EnumC0252fc;
import p342m6.AbstractC22888j;
import p385oa.C24141a;
import qa.C25202a;
import qa.InterfaceC25204c;
import qa.InterfaceC25205d;

/* loaded from: classes3.dex */
public class TextRecognizerImpl extends MobileVisionBase<C25202a> implements InterfaceC25204c {

    /* renamed from: w */
    private final InterfaceC25205d f37194w;

    public TextRecognizerImpl(C6769c c6769c, Executor executor, C0427og c0427og, InterfaceC25205d interfaceC25205d) {
        super(c6769c, executor);
        EnumC0214dc enumC0214dc;
        this.f37194w = interfaceC25205d;
        C0271gc c0271gc = new C0271gc();
        if (interfaceC25205d.mo130459c()) {
            enumC0214dc = EnumC0214dc.TYPE_THICK;
        } else {
            enumC0214dc = EnumC0214dc.TYPE_THIN;
        }
        c0271gc.m735e(enumC0214dc);
        C0425oe c0425oe = new C0425oe();
        C0482re c0482re = new C0482re();
        c0482re.m866a(AbstractC6767a.m34592a(interfaceC25205d.mo130464h()));
        c0425oe.m805e(c0482re.m867c());
        c0271gc.m738h(c0425oe.m806f());
        c0427og.m813d(C0484rg.m869e(c0271gc, 1), EnumC0252fc.ON_DEVICE_TEXT_CREATE);
    }

    @Override // qa.InterfaceC25204c
    /* renamed from: X3 */
    public final AbstractC22888j mo34591X3(C24141a c24141a) {
        return super.m34589c(c24141a);
    }

    @Override // p669y4.InterfaceC30285b
    /* renamed from: b */
    public final Feature[] mo34569b() {
        return AbstractC6768b.m34594a(this.f37194w);
    }
}
