package vm0;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import um0.C27316g;
import um0.InterfaceC27315f;
import wm0.AbstractC29093a;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29102j;

/* renamed from: vm0.c */
/* loaded from: classes.dex */
public abstract class AbstractC28297c {

    /* renamed from: vm0.c$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29102j {

        /* renamed from: q */
        private int f132002q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18509p f132003r;

        /* renamed from: s */
        final /* synthetic */ Object f132004s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, InterfaceC18509p interfaceC18509p, Object obj) {
            super(continuation);
            this.f132003r = interfaceC18509p;
            this.f132004s = obj;
            AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        protected Object mo239o(Object obj) {
            int i11 = this.f132002q;
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f132002q = 2;
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f132002q = 1;
            AbstractC24862s.m129228b(obj);
            AbstractC19074t.m100206d(this.f132003r, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC18509p) AbstractC19069o0.m100188e(this.f132003r, 2)).mo240pC(this.f132004s, this);
        }
    }

    /* renamed from: vm0.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        private int f132005s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18509p f132006t;

        /* renamed from: u */
        final /* synthetic */ Object f132007u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, InterfaceC27315f interfaceC27315f, InterfaceC18509p interfaceC18509p, Object obj) {
            super(continuation, interfaceC27315f);
            this.f132006t = interfaceC18509p;
            this.f132007u = obj;
            AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        protected Object mo239o(Object obj) {
            int i11 = this.f132005s;
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f132005s = 2;
                    AbstractC24862s.m129228b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f132005s = 1;
            AbstractC24862s.m129228b(obj);
            AbstractC19074t.m100206d(this.f132006t, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((InterfaceC18509p) AbstractC19069o0.m100188e(this.f132006t, 2)).mo240pC(this.f132007u, this);
        }
    }

    /* renamed from: vm0.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29102j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Continuation continuation) {
            super(continuation);
            AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        protected Object mo239o(Object obj) {
            AbstractC24862s.m129228b(obj);
            return obj;
        }
    }

    /* renamed from: vm0.c$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29096d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Continuation continuation, InterfaceC27315f interfaceC27315f) {
            super(continuation, interfaceC27315f);
            AbstractC19074t.m100206d(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        protected Object mo239o(Object obj) {
            AbstractC24862s.m129228b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Continuation m142574a(InterfaceC18509p interfaceC18509p, Object obj, Continuation continuation) {
        AbstractC19074t.m100208f(interfaceC18509p, "<this>");
        AbstractC19074t.m100208f(continuation, "completion");
        Continuation m145353a = AbstractC29100h.m145353a(continuation);
        if (interfaceC18509p instanceof AbstractC29093a) {
            return ((AbstractC29093a) interfaceC18509p).mo238a(obj, m145353a);
        }
        InterfaceC27315f context = m145353a.getContext();
        if (context == C27316g.f128559p) {
            return new a(m145353a, interfaceC18509p, obj);
        }
        return new b(m145353a, context, interfaceC18509p, obj);
    }

    /* renamed from: b */
    private static final Continuation m142575b(Continuation continuation) {
        InterfaceC27315f context = continuation.getContext();
        if (context == C27316g.f128559p) {
            return new c(continuation);
        }
        return new d(continuation, context);
    }

    /* renamed from: c */
    public static Continuation m142576c(Continuation continuation) {
        AbstractC29096d abstractC29096d;
        Continuation m145343q;
        AbstractC19074t.m100208f(continuation, "<this>");
        if (continuation instanceof AbstractC29096d) {
            abstractC29096d = (AbstractC29096d) continuation;
        } else {
            abstractC29096d = null;
        }
        if (abstractC29096d != null && (m145343q = abstractC29096d.m145343q()) != null) {
            return m145343q;
        }
        return continuation;
    }

    /* renamed from: d */
    public static Object m142577d(InterfaceC18510q interfaceC18510q, Object obj, Object obj2, Continuation continuation) {
        AbstractC19074t.m100208f(interfaceC18510q, "<this>");
        AbstractC19074t.m100208f(continuation, "completion");
        return ((InterfaceC18510q) AbstractC19069o0.m100188e(interfaceC18510q, 3)).mo45599Hr(obj, obj2, m142575b(AbstractC29100h.m145353a(continuation)));
    }
}
