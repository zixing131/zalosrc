package il0;

import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import mn0.InterfaceC23366d;
import vk0.InterfaceC28285g;
import wk0.AbstractC29083c;

/* renamed from: il0.e */
/* loaded from: classes7.dex */
public class C20609e extends AbstractC29083c {

    /* renamed from: r */
    private final C20605a f101351r;

    /* renamed from: s */
    private final C20607c f101352s;

    /* renamed from: t */
    private final InterfaceC23366d f101353t;

    /* renamed from: u */
    private final InterfaceC18509p f101354u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: il0.e$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final a f101355q = new a();

        a() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final C20608d mo240pC(Runnable runnable, C20606b c20606b) {
            AbstractC19074t.m100208f(runnable, "block");
            AbstractC19074t.m100208f(c20606b, "prioritizer");
            return new C20608d(c20606b.m107242a(), runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: il0.e$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class b extends C19071q implements InterfaceC18505l {
        b(Object obj) {
            super(1, obj, C20605a.class, "priority", "priority(Lcom/zing/zalo/zinstant/universe/base/request/UniversalInfo;)Lcom/zing/zalo/zinstant/universe/request/service/ZinstantPriority;", 0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: h */
        public final C20606b mo205i9(InterfaceC28285g interfaceC28285g) {
            AbstractC19074t.m100208f(interfaceC28285g, "p0");
            return ((C20605a) this.f94922q).m107241a(interfaceC28285g);
        }
    }

    public C20609e(C20605a c20605a, C20607c c20607c) {
        AbstractC19074t.m100208f(c20605a, "prioritizer");
        AbstractC19074t.m100208f(c20607c, "executor");
        this.f101351r = c20605a;
        this.f101352s = c20607c;
        this.f101353t = new b(c20605a);
        this.f101354u = a.f101355q;
    }

    @Override // wk0.AbstractC29083c
    /* renamed from: H0 */
    public InterfaceC18509p mo107246H0() {
        return this.f101354u;
    }

    @Override // wk0.AbstractC29083c
    /* renamed from: I0 */
    public /* bridge */ /* synthetic */ InterfaceC18505l mo107247I0() {
        return (InterfaceC18505l) m107249K0();
    }

    @Override // wk0.AbstractC29083c
    /* renamed from: J0 */
    public C20607c mo107245G0() {
        return this.f101352s;
    }

    /* renamed from: K0 */
    public InterfaceC23366d m107249K0() {
        return this.f101353t;
    }
}
