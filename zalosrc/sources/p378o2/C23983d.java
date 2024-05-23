package p378o2;

import androidx.window.core.WindowStrictModeException;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p378o2.AbstractC23985f;
import qm0.AbstractC25358n;

/* renamed from: o2.d */
/* loaded from: classes2.dex */
final class C23983d extends AbstractC23985f {

    /* renamed from: b */
    private final Object f116063b;

    /* renamed from: c */
    private final String f116064c;

    /* renamed from: d */
    private final String f116065d;

    /* renamed from: e */
    private final InterfaceC23984e f116066e;

    /* renamed from: f */
    private final AbstractC23985f.b f116067f;

    /* renamed from: g */
    private final WindowStrictModeException f116068g;

    /* renamed from: o2.d$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f116069a;

        static {
            int[] iArr = new int[AbstractC23985f.b.values().length];
            iArr[AbstractC23985f.b.STRICT.ordinal()] = 1;
            iArr[AbstractC23985f.b.LOG.ordinal()] = 2;
            iArr[AbstractC23985f.b.QUIET.ordinal()] = 3;
            f116069a = iArr;
        }
    }

    public C23983d(Object obj, String str, String str2, InterfaceC23984e interfaceC23984e, AbstractC23985f.b bVar) {
        List m131393z;
        AbstractC19074t.m100208f(obj, "value");
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19074t.m100208f(interfaceC23984e, "logger");
        AbstractC19074t.m100208f(bVar, "verificationMode");
        this.f116063b = obj;
        this.f116064c = str;
        this.f116065d = str2;
        this.f116066e = interfaceC23984e;
        this.f116067f = bVar;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(m125495b(obj, str2));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        AbstractC19074t.m100207e(stackTrace, "stackTrace");
        m131393z = AbstractC25358n.m131393z(stackTrace, 2);
        Object[] array = m131393z.toArray(new StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((StackTraceElement[]) array);
            this.f116068g = windowStrictModeException;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // p378o2.AbstractC23985f
    /* renamed from: a */
    public Object mo125493a() {
        int i11 = a.f116069a[this.f116067f.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return null;
            }
            this.f116066e.mo125485a(this.f116064c, m125495b(this.f116063b, this.f116065d));
            return null;
        }
        throw this.f116068g;
    }

    @Override // p378o2.AbstractC23985f
    /* renamed from: c */
    public AbstractC23985f mo125494c(String str, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(interfaceC18505l, "condition");
        return this;
    }
}
