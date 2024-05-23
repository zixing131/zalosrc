package vk0;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import um0.InterfaceC27315f;

/* renamed from: vk0.e */
/* loaded from: classes7.dex */
public class C28283e implements InterfaceC27315f.b {

    /* renamed from: r */
    public static final a f131961r = new a(null);

    /* renamed from: p */
    private final InterfaceC28285g f131962p;

    /* renamed from: q */
    private final InterfaceC27315f.c f131963q;

    /* renamed from: vk0.e$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC27315f.c {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28283e(InterfaceC28285g interfaceC28285g, InterfaceC27315f.c cVar) {
        AbstractC19074t.m100208f(interfaceC28285g, "info");
        AbstractC19074t.m100208f(cVar, "key");
        this.f131962p = interfaceC28285g;
        this.f131963q = cVar;
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        return InterfaceC27315f.b.a.m139853b(this, cVar);
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d0 */
    public InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f) {
        return InterfaceC27315f.b.a.m139855d(this, interfaceC27315f);
    }

    /* renamed from: e */
    public final InterfaceC28285g m142527e() {
        return this.f131962p;
    }

    @Override // um0.InterfaceC27315f.b
    public InterfaceC27315f.c getKey() {
        return this.f131963q;
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: h */
    public Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p) {
        return InterfaceC27315f.b.a.m139852a(this, obj, interfaceC18509p);
    }

    @Override // um0.InterfaceC27315f.b, um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        return InterfaceC27315f.b.a.m139854c(this, cVar);
    }

    public /* synthetic */ C28283e(InterfaceC28285g interfaceC28285g, InterfaceC27315f.c cVar, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC28285g, (i11 & 2) != 0 ? f131961r : cVar);
    }
}
