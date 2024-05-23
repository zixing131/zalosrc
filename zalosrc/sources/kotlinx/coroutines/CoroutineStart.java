package kotlinx.coroutines;

import en0.InterfaceC18509p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import um0.AbstractC27314e;

/* loaded from: classes.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f105849a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105849a = iArr;
        }
    }

    /* renamed from: c */
    public final void m112645c(InterfaceC18509p interfaceC18509p, Object obj, Continuation continuation) {
        int i11 = WhenMappings.f105849a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    UndispatchedKt.m113755a(interfaceC18509p, obj, continuation);
                    return;
                }
            }
            AbstractC27314e.m139849a(interfaceC18509p, obj, continuation);
            return;
        }
        CancellableKt.m113754d(interfaceC18509p, obj, continuation, null, 4, null);
    }

    /* renamed from: d */
    public final boolean m112646d() {
        return this == LAZY;
    }
}
