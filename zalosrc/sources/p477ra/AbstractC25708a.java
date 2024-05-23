package p477ra;

import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.atomic.AtomicReference;
import p234ia.C20464i;

/* renamed from: ra.a */
/* loaded from: classes3.dex */
public abstract class AbstractC25708a {
    /* renamed from: a */
    public static boolean m132627a(AtomicReference atomicReference, String str) {
        boolean z11;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        if (DynamiteModule.m19918a(C20464i.m106493c().m106497b(), str) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        atomicReference.set(Boolean.valueOf(z11));
        return z11;
    }
}
