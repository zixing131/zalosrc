package vn0;

import fn0.AbstractC19074t;
import pm0.C24848g0;
import qm0.C25348i;

/* renamed from: vn0.k */
/* loaded from: classes7.dex */
public abstract class AbstractC28326k {

    /* renamed from: a */
    private final C25348i f132056a = new C25348i();

    /* renamed from: b */
    private int f132057b;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m142723a(char[] cArr) {
        int i11;
        AbstractC19074t.m100208f(cArr, "array");
        synchronized (this) {
            try {
                int length = this.f132057b + cArr.length;
                i11 = AbstractC28322i.f132048a;
                if (length < i11) {
                    this.f132057b += cArr.length;
                    this.f132056a.addLast(cArr);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final char[] m142724b(int i11) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f132056a.m131274t();
            if (cArr != null) {
                this.f132057b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            return new char[i11];
        }
        return cArr;
    }
}
