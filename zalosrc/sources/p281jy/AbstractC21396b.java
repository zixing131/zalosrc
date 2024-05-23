package p281jy;

import android.graphics.Bitmap;
import fn0.AbstractC19074t;
import p281jy.InterfaceC21399e;

/* renamed from: jy.b */
/* loaded from: classes4.dex */
public abstract class AbstractC21396b implements InterfaceC21399e {

    /* renamed from: a */
    private final InterfaceC21399e f104278a;

    public AbstractC21396b(InterfaceC21399e interfaceC21399e) {
        AbstractC19074t.m100208f(interfaceC21399e, "analyzer");
        this.f104278a = interfaceC21399e;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: O1 */
    public void mo110857O1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
        this.f104278a.mo110857O1(iArr);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: Q1 */
    public void mo110859Q1(InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(aVar, "callback");
        this.f104278a.mo110859Q1(aVar);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        this.f104278a.mo110860R1();
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: T1 */
    public void mo110862T1(Bitmap bitmap, String str, InterfaceC21399e.a aVar) {
        AbstractC19074t.m100208f(bitmap, "bitmap");
        AbstractC19074t.m100208f(str, "path");
        AbstractC19074t.m100208f(aVar, "callback");
        this.f104278a.mo110862T1(bitmap, str, aVar);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: U1 */
    public void mo110863U1() {
        this.f104278a.mo110863U1();
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: V1 */
    public boolean mo110864V1() {
        return this.f104278a.mo110864V1();
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: W1 */
    public void mo110865W1(int i11, int i12, int i13) {
        this.f104278a.mo110865W1(i11, i12, i13);
    }

    /* renamed from: a */
    public final InterfaceC21399e m110867a() {
        return this.f104278a;
    }
}
