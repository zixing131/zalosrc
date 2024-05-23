package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19073s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26780c0;

/* renamed from: kotlinx.serialization.internal.f */
/* loaded from: classes7.dex */
public final class C21896f extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21896f f107661c = new C21896f();

    private C21896f() {
        super(AbstractC25935a.m133600A(C19073s.f94950a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] mo114056r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26780c0 c26780c0, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26780c0, "builder");
        c26780c0.m137812e(interfaceC21885c.mo114011i(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26780c0 mo114055k(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "<this>");
        return new C26780c0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, int[] iArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(iArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114033x(getDescriptor(), i12, iArr[i12]);
        }
    }
}
