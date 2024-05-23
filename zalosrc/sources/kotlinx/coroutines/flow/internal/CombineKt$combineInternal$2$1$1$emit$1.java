package kotlinx.coroutines.flow.internal;

import com.zing.zalo.zinstant.zom.node.ZOM;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m145345f = "Combine.kt", m145346l = {ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED, 33}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f107264s;

    /* renamed from: t */
    final /* synthetic */ CombineKt$combineInternal$2.C218641.AnonymousClass1 f107265t;

    /* renamed from: u */
    int f107266u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt$combineInternal$2.C218641.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.f107265t = anonymousClass1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107264s = obj;
        this.f107266u |= Integer.MIN_VALUE;
        return this.f107265t.mo12109b(null, this);
    }
}
