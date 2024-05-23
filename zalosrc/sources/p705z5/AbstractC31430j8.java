package p705z5;

import java.util.Arrays;

/* renamed from: z5.j8 */
/* loaded from: classes2.dex */
abstract class AbstractC31430j8 extends AbstractC31445k9 {

    /* renamed from: a */
    Object[] f144835a = new Object[4];

    /* renamed from: b */
    int f144836b = 0;

    /* renamed from: c */
    boolean f144837c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC31430j8(int i11) {
    }

    /* renamed from: b */
    private final void m152252b(int i11) {
        Object[] objArr = this.f144835a;
        int length = objArr.length;
        if (length < i11) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f144835a = Arrays.copyOf(objArr, i12);
            this.f144837c = false;
            return;
        }
        if (this.f144837c) {
            this.f144835a = (Object[]) objArr.clone();
            this.f144837c = false;
        }
    }

    /* renamed from: a */
    public final AbstractC31430j8 m152253a(Object obj) {
        obj.getClass();
        m152252b(this.f144836b + 1);
        Object[] objArr = this.f144835a;
        int i11 = this.f144836b;
        this.f144836b = i11 + 1;
        objArr[i11] = obj;
        return this;
    }
}
