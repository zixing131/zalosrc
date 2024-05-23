package com.google.mlkit.vision.barcode.internal;

import com.google.android.gms.common.Feature;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import la.C22166a;
import p234ia.AbstractC20469l;
import p294ka.C21631b;
import p294ka.InterfaceC21630a;
import p342m6.AbstractC22888j;
import p385oa.C24141a;
import p670y5.C30424gc;
import p670y5.C30561ng;
import p670y5.C30618qg;
import p670y5.C30652sc;
import p670y5.C30690uc;
import p670y5.EnumC30367dc;
import p670y5.EnumC30405fc;

/* loaded from: classes3.dex */
public class BarcodeScannerImpl extends MobileVisionBase<List<C22166a>> implements InterfaceC21630a {

    /* renamed from: x */
    private static final C21631b f37138x = new C21631b.a().m111561a();

    /* renamed from: w */
    private final boolean f37139w;

    public BarcodeScannerImpl(C21631b c21631b, C6759h c6759h, Executor executor, C30561ng c30561ng) {
        super(c6759h, executor);
        EnumC30367dc enumC30367dc;
        boolean m34575f = AbstractC6753b.m34575f();
        this.f37139w = m34575f;
        C30652sc c30652sc = new C30652sc();
        c30652sc.m149629i(AbstractC6753b.m34572c(c21631b));
        C30690uc m149630j = c30652sc.m149630j();
        C30424gc c30424gc = new C30424gc();
        if (m34575f) {
            enumC30367dc = EnumC30367dc.TYPE_THICK;
        } else {
            enumC30367dc = EnumC30367dc.TYPE_THIN;
        }
        c30424gc.m149518e(enumC30367dc);
        c30424gc.m149520g(m149630j);
        c30561ng.m149587d(C30618qg.m149614e(c30424gc, 1), EnumC30405fc.ON_DEVICE_BARCODE_CREATE);
    }

    @Override // p294ka.InterfaceC21630a
    /* renamed from: X3 */
    public final AbstractC22888j mo34568X3(C24141a c24141a) {
        return super.m34589c(c24141a);
    }

    @Override // p669y4.InterfaceC30285b
    /* renamed from: b */
    public final Feature[] mo34569b() {
        if (this.f37139w) {
            return AbstractC20469l.f100676a;
        }
        return new Feature[]{AbstractC20469l.f100677b};
    }
}
