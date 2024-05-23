package pj0;

import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;

/* renamed from: pj0.j */
/* loaded from: classes7.dex */
public final class C24784j implements InterfaceC24785k {

    /* renamed from: a */
    private final int f119017a;

    /* renamed from: b */
    private final WeakReference f119018b;

    public C24784j(ZOMDocument zOMDocument, int i11) {
        AbstractC19074t.m100208f(zOMDocument, "document");
        this.f119017a = i11;
        this.f119018b = new WeakReference(zOMDocument);
    }

    @Override // pj0.InterfaceC24785k
    /* renamed from: a */
    public void mo128801a(String str) {
        ZOMDocument zOMDocument = (ZOMDocument) this.f119018b.get();
        if (zOMDocument != null) {
            int i11 = this.f119017a;
            if (str == null) {
                str = "";
            }
            zOMDocument.onProcessActionComplete(i11, str);
        }
    }
}
