package n10;

/* renamed from: n10.e */
/* loaded from: classes5.dex */
public final class C23522e implements InterfaceC23520c {
    /* renamed from: b */
    private final boolean m123441b(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || bArr.length < 2 || bArr[0] != 31 || bArr[1] != -117) {
            return false;
        }
        return true;
    }

    @Override // n10.InterfaceC23520c
    /* renamed from: a */
    public InterfaceC23519b mo123439a(byte[] bArr) {
        if (m123441b(bArr)) {
            return new C23518a();
        }
        return new C23521d();
    }
}
