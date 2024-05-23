package kotlinx.serialization.internal;

import fn0.AbstractC19074t;
import fn0.C19064m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import rn0.AbstractC25935a;
import tn0.AbstractC26790f1;
import tn0.C26836v;

/* renamed from: kotlinx.serialization.internal.e */
/* loaded from: classes7.dex */
public final class C21895e extends AbstractC26790f1 implements KSerializer {

    /* renamed from: c */
    public static final C21895e f107660c = new C21895e();

    private C21895e() {
        super(AbstractC25935a.m133635z(C19064m.f94945a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo114053e(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] mo114056r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26812n, tn0.AbstractC26772a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo114054h(InterfaceC21885c interfaceC21885c, int i11, C26836v c26836v, boolean z11) {
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        AbstractC19074t.m100208f(c26836v, "builder");
        c26836v.m137977e(interfaceC21885c.mo114017v(getDescriptor(), i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26772a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public C26836v mo114055k(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "<this>");
        return new C26836v(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26790f1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo114057u(InterfaceC21886d interfaceC21886d, float[] fArr, int i11) {
        AbstractC19074t.m100208f(interfaceC21886d, "encoder");
        AbstractC19074t.m100208f(fArr, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            interfaceC21886d.mo114032t(getDescriptor(), i12, fArr[i12]);
        }
    }
}
