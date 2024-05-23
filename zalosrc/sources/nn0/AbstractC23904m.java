package nn0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;

/* renamed from: nn0.m */
/* loaded from: classes.dex */
public abstract class AbstractC23904m extends AbstractC23903l {

    /* renamed from: nn0.m$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC23898g {

        /* renamed from: a */
        final /* synthetic */ Iterator f115518a;

        public a(Iterator it) {
            this.f115518a = it;
        }

        @Override // nn0.InterfaceC23898g
        public Iterator iterator() {
            return this.f115518a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nn0.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Object f115519q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(0);
            this.f115519q = obj;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public final Object mo12V4() {
            return this.f115519q;
        }
    }

    /* renamed from: c */
    public static InterfaceC23898g m125014c(Iterator it) {
        AbstractC19074t.m100208f(it, "<this>");
        return m125015d(new a(it));
    }

    /* renamed from: d */
    public static final InterfaceC23898g m125015d(InterfaceC23898g interfaceC23898g) {
        AbstractC19074t.m100208f(interfaceC23898g, "<this>");
        if (!(interfaceC23898g instanceof C23892a)) {
            return new C23892a(interfaceC23898g);
        }
        return interfaceC23898g;
    }

    /* renamed from: e */
    public static InterfaceC23898g m125016e() {
        return C23895d.f115500a;
    }

    /* renamed from: f */
    public static InterfaceC23898g m125017f(InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18494a, "seedFunction");
        AbstractC19074t.m100208f(interfaceC18505l, "nextFunction");
        return new C23897f(interfaceC18494a, interfaceC18505l);
    }

    /* renamed from: g */
    public static InterfaceC23898g m125018g(Object obj, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "nextFunction");
        if (obj == null) {
            return C23895d.f115500a;
        }
        return new C23897f(new b(obj), interfaceC18505l);
    }
}
