package p603wa;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wa.c */
/* loaded from: classes3.dex */
public final class C28861c {

    /* renamed from: a */
    private final C28859a f133678a;

    /* renamed from: b */
    private final List f133679b;

    public C28861c(C28859a c28859a) {
        this.f133678a = c28859a;
        ArrayList arrayList = new ArrayList();
        this.f133679b = arrayList;
        arrayList.add(new C28860b(c28859a, new int[]{1}));
    }

    /* renamed from: a */
    private C28860b m144300a(int i11) {
        if (i11 >= this.f133679b.size()) {
            List list = this.f133679b;
            C28860b c28860b = (C28860b) list.get(list.size() - 1);
            for (int size = this.f133679b.size(); size <= i11; size++) {
                C28859a c28859a = this.f133678a;
                c28860b = c28860b.m144298g(new C28860b(c28859a, new int[]{1, c28859a.m144286c((size - 1) + c28859a.m144287d())}));
                this.f133679b.add(c28860b);
            }
        }
        return (C28860b) this.f133679b.get(i11);
    }

    /* renamed from: b */
    public void m144301b(int[] iArr, int i11) {
        if (i11 != 0) {
            int length = iArr.length - i11;
            if (length > 0) {
                C28860b m144300a = m144300a(i11);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] m144295d = new C28860b(this.f133678a, iArr2).m144299h(i11, 1).m144293b(m144300a)[1].m144295d();
                int length2 = i11 - m144295d.length;
                for (int i12 = 0; i12 < length2; i12++) {
                    iArr[length + i12] = 0;
                }
                System.arraycopy(m144295d, 0, iArr, length + length2, m144295d.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
