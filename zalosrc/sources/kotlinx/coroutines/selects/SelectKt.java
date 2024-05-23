package kotlinx.coroutines.selects;

import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import pm0.C24848g0;

/* loaded from: classes7.dex */
public final class SelectKt {

    /* renamed from: a */
    private static final InterfaceC18510q f107545a = SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1.f107551q;

    /* renamed from: b */
    private static final Symbol f107546b = new Symbol("STATE_REG");

    /* renamed from: c */
    private static final Symbol f107547c = new Symbol("STATE_COMPLETED");

    /* renamed from: d */
    private static final Symbol f107548d = new Symbol("STATE_CANCELLED");

    /* renamed from: e */
    private static final Symbol f107549e = new Symbol("NO_RESULT");

    /* renamed from: f */
    private static final Symbol f107550f = new Symbol("PARAM_CLAUSE_0");

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final TrySelectDetailedResult m113866a(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return TrySelectDetailedResult.ALREADY_SELECTED;
                    }
                    throw new IllegalStateException(("Unexpected internal result: " + i11).toString());
                }
                return TrySelectDetailedResult.CANCELLED;
            }
            return TrySelectDetailedResult.REREGISTER;
        }
        return TrySelectDetailedResult.SUCCESSFUL;
    }

    /* renamed from: i */
    public static final Symbol m113874i() {
        return f107550f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final boolean m113875j(CancellableContinuation cancellableContinuation, InterfaceC18505l interfaceC18505l) {
        Object mo112544R = cancellableContinuation.mo112544R(C24848g0.f119245a, null, interfaceC18505l);
        if (mo112544R == null) {
            return false;
        }
        cancellableContinuation.mo112545U(mo112544R);
        return true;
    }
}
