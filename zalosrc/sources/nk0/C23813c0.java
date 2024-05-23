package nk0;

import com.zing.zalo.zinstant.zom.node.ZOMInput;
import com.zing.zalo.zinstant.zom.properties.ZOMInputText;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import pm0.C24848g0;
import qk0.InterfaceC25307c;
import xj0.C29682a;
import xj0.C29684c;
import xj0.InterfaceC29683b;

/* renamed from: nk0.c0 */
/* loaded from: classes7.dex */
public final class C23813c0 extends AbstractC23838k1 implements InterfaceC25307c {

    /* renamed from: k */
    private WeakReference f115078k;

    /* renamed from: l */
    private final C29682a f115079l;

    /* renamed from: nk0.c0$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f115080q = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m124416a(InterfaceC29683b interfaceC29683b) {
            AbstractC19074t.m100208f(interfaceC29683b, "it");
            interfaceC29683b.mo91541b();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124416a((InterfaceC29683b) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23813c0(C23855s0 c23855s0, ZOMInput zOMInput) {
        super(c23855s0, zOMInput);
        AbstractC19074t.m100208f(c23855s0, "zinstantRoot");
        AbstractC19074t.m100208f(zOMInput, "zomInput");
        this.f115078k = new WeakReference(null);
        this.f115079l = new C29682a(zOMInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m124404i1(C23813c0 c23813c0, String str) {
        AbstractC19074t.m100208f(c23813c0, "this$0");
        AbstractC19074t.m100208f(str, "$text");
        ZOMInputText zOMInputText = ((ZOMInput) c23813c0.m131007J()).zomInputText;
        if (zOMInputText != null) {
            zOMInputText.afterTextChanged(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m124405m1(C23813c0 c23813c0, boolean z11) {
        AbstractC19074t.m100208f(c23813c0, "this$0");
        ZOMInputText zOMInputText = ((ZOMInput) c23813c0.m131007J()).zomInputText;
        if (zOMInputText != null) {
            zOMInputText.onFocusChange(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m124406o1(C23813c0 c23813c0, String str) {
        AbstractC19074t.m100208f(c23813c0, "this$0");
        AbstractC19074t.m100208f(str, "$value");
        ZOMInputText zOMInputText = ((ZOMInput) c23813c0.m131007J()).zomInputText;
        if (zOMInputText != null) {
            zOMInputText.onTextChanged(str);
        }
    }

    @Override // nk0.AbstractC23838k1
    /* renamed from: a1 */
    public void mo124408a1() {
        super.mo124408a1();
        this.f115079l.m147621b((ZOMInput) m131007J());
    }

    @Override // qk0.AbstractC25310f, qk0.InterfaceC25307c
    /* renamed from: b */
    public void mo124409b() {
        super.mo124409b();
        m124594c1(a.f115080q);
    }

    /* renamed from: h1 */
    public void m124410h1(final String str) {
        AbstractC19074t.m100208f(str, "text");
        m131004G0(new Runnable() { // from class: nk0.a0
            @Override // java.lang.Runnable
            public final void run() {
                C23813c0.m124404i1(C23813c0.this, str);
            }
        });
    }

    /* renamed from: j1 */
    public final C29684c m124411j1() {
        return this.f115079l.f137116a;
    }

    @Override // nk0.AbstractC23838k1
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public InterfaceC29683b mo124407X0() {
        return (InterfaceC29683b) this.f115078k.get();
    }

    /* renamed from: l1 */
    public void m124413l1(final boolean z11) {
        m131004G0(new Runnable() { // from class: nk0.z
            @Override // java.lang.Runnable
            public final void run() {
                C23813c0.m124405m1(C23813c0.this, z11);
            }
        });
    }

    /* renamed from: n1 */
    public void m124414n1(final String str) {
        AbstractC19074t.m100208f(str, "value");
        m131004G0(new Runnable() { // from class: nk0.b0
            @Override // java.lang.Runnable
            public final void run() {
                C23813c0.m124406o1(C23813c0.this, str);
            }
        });
    }

    /* renamed from: p1 */
    public final void m124415p1(InterfaceC29683b interfaceC29683b) {
        AbstractC19074t.m100208f(interfaceC29683b, "inputListener");
        this.f115078k = new WeakReference(interfaceC29683b);
    }
}
