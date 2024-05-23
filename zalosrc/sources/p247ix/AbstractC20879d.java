package p247ix;

import com.zing.zalocore.CoreUtility;
import h40.AbstractC19783c;
import java.util.HashMap;
import mx.AbstractC23474k;
import p190gx.AbstractC19676f;

/* renamed from: ix.d */
/* loaded from: classes4.dex */
public abstract class AbstractC20879d extends AbstractC19676f {

    /* renamed from: f */
    private static final HashMap f102571f = new HashMap();

    /* renamed from: s */
    public static void m109121s(final int i11) {
        AbstractC19676f.m103251n(new Runnable() { // from class: ix.c
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20879d.m109122t(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m109122t(int i11) {
        HashMap hashMap = f102571f;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            C20880e c20880e = (C20880e) hashMap.get(Integer.valueOf(i11));
            hashMap.remove(Integer.valueOf(i11));
            AbstractC19676f.m103250m(c20880e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m109123u(int i11, Exception exc, int i12) {
        boolean z11;
        C20880e c20880e;
        HashMap hashMap = f102571f;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            c20880e = (C20880e) hashMap.get(Integer.valueOf(i11));
        } else {
            if (CoreUtility.f89235k.get() && !AbstractC19783c.m103531b()) {
                z11 = true;
            } else {
                z11 = false;
            }
            C20880e c20880e2 = new C20880e(z11, 7, true, AbstractC23474k.m123237a(exc, 3));
            hashMap.put(Integer.valueOf(i11), c20880e2);
            c20880e = c20880e2;
        }
        if (i12 == 1) {
            c20880e.f102576e++;
        } else if (i12 == 3) {
            c20880e.f102577f++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m109124v(Exception exc, int i11) {
        boolean z11;
        String m123237a = AbstractC23474k.m123237a(exc, 5);
        if (CoreUtility.f89235k.get() && !AbstractC19783c.m103531b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC19676f.m103250m(new C20880e(z11, i11, false, m123237a).toString());
    }

    /* renamed from: w */
    public static void m109125w(final int i11, final int i12, final Exception exc) {
        AbstractC19676f.m103251n(new Runnable() { // from class: ix.b
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20879d.m109123u(i11, exc, i12);
            }
        });
    }

    /* renamed from: x */
    public static void m109126x(final int i11, final Exception exc) {
        AbstractC19676f.m103251n(new Runnable() { // from class: ix.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20879d.m109124v(exc, i11);
            }
        });
    }
}
