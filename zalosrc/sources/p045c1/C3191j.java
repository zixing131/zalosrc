package p045c1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p088d1.AbstractC17700i;
import p088d1.C17706o;

/* renamed from: c1.j */
/* loaded from: classes2.dex */
public class C3191j extends C3186e implements InterfaceC3190i {

    /* renamed from: U0 */
    public C3186e[] f13662U0 = new C3186e[4];

    /* renamed from: V0 */
    public int f13663V0 = 0;

    @Override // p045c1.InterfaceC3190i
    /* renamed from: a */
    public void mo16235a(C3186e c3186e) {
        if (c3186e != this && c3186e != null) {
            int i11 = this.f13663V0 + 1;
            C3186e[] c3186eArr = this.f13662U0;
            if (i11 > c3186eArr.length) {
                this.f13662U0 = (C3186e[]) Arrays.copyOf(c3186eArr, c3186eArr.length * 2);
            }
            C3186e[] c3186eArr2 = this.f13662U0;
            int i12 = this.f13663V0;
            c3186eArr2[i12] = c3186e;
            this.f13663V0 = i12 + 1;
        }
    }

    @Override // p045c1.InterfaceC3190i
    /* renamed from: b */
    public void mo16236b(C3187f c3187f) {
    }

    @Override // p045c1.InterfaceC3190i
    /* renamed from: c */
    public void mo16237c() {
        this.f13663V0 = 0;
        Arrays.fill(this.f13662U0, (Object) null);
    }

    @Override // p045c1.C3186e
    /* renamed from: n */
    public void mo15986n(C3186e c3186e, HashMap hashMap) {
        super.mo15986n(c3186e, hashMap);
        C3191j c3191j = (C3191j) c3186e;
        this.f13663V0 = 0;
        int i11 = c3191j.f13663V0;
        for (int i12 = 0; i12 < i11; i12++) {
            mo16235a((C3186e) hashMap.get(c3191j.f13662U0[i12]));
        }
    }

    /* renamed from: u1 */
    public void m16238u1(ArrayList arrayList, int i11, C17706o c17706o) {
        for (int i12 = 0; i12 < this.f13663V0; i12++) {
            c17706o.m93763a(this.f13662U0[i12]);
        }
        for (int i13 = 0; i13 < this.f13663V0; i13++) {
            AbstractC17700i.m93748a(this.f13662U0[i13], i11, arrayList, c17706o);
        }
    }

    /* renamed from: v1 */
    public int m16239v1(int i11) {
        int i12;
        int i13;
        for (int i14 = 0; i14 < this.f13663V0; i14++) {
            C3186e c3186e = this.f13662U0[i14];
            if (i11 == 0 && (i13 = c3186e.f13511R0) != -1) {
                return i13;
            }
            if (i11 == 1 && (i12 = c3186e.f13513S0) != -1) {
                return i12;
            }
        }
        return -1;
    }
}
