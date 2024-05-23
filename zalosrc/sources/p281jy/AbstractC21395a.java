package p281jy;

import android.graphics.Bitmap;
import fn0.AbstractC19074t;
import p281jy.InterfaceC21399e;

/* renamed from: jy.a */
/* loaded from: classes4.dex */
public abstract class AbstractC21395a implements InterfaceC21399e {

    /* renamed from: a */
    private final InterfaceC21399e[] f104277a;

    public AbstractC21395a(InterfaceC21399e[] interfaceC21399eArr) {
        AbstractC19074t.m100208f(interfaceC21399eArr, "analyzers");
        this.f104277a = interfaceC21399eArr;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: O1 */
    public void mo110857O1(int[] iArr) {
        AbstractC19074t.m100208f(iArr, "rect");
        for (InterfaceC21399e interfaceC21399e : this.f104277a) {
            interfaceC21399e.mo110857O1(iArr);
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public abstract void mo110858P1(byte[] bArr, boolean z11);

    @Override // p281jy.InterfaceC21399e
    /* renamed from: Q1 */
    public abstract void mo110859Q1(InterfaceC21399e.a aVar);

    @Override // p281jy.InterfaceC21399e
    /* renamed from: R1 */
    public void mo110860R1() {
        for (InterfaceC21399e interfaceC21399e : this.f104277a) {
            interfaceC21399e.mo110860R1();
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: S1 */
    public abstract boolean mo110861S1();

    @Override // p281jy.InterfaceC21399e
    /* renamed from: T1 */
    public abstract void mo110862T1(Bitmap bitmap, String str, InterfaceC21399e.a aVar);

    @Override // p281jy.InterfaceC21399e
    /* renamed from: U1 */
    public void mo110863U1() {
        for (InterfaceC21399e interfaceC21399e : this.f104277a) {
            interfaceC21399e.mo110863U1();
        }
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: V1 */
    public boolean mo110864V1() {
        InterfaceC21399e[] interfaceC21399eArr = this.f104277a;
        int length = interfaceC21399eArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (interfaceC21399eArr[i11].mo110864V1()) {
                if (i11 == -1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: W1 */
    public void mo110865W1(int i11, int i12, int i13) {
        for (InterfaceC21399e interfaceC21399e : this.f104277a) {
            interfaceC21399e.mo110865W1(i11, i12, i13);
        }
    }

    /* renamed from: a */
    public final InterfaceC21399e[] m110866a() {
        return this.f104277a;
    }
}
