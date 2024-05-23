package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1905a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.t */
/* loaded from: classes.dex */
public class C1927t {

    /* renamed from: a */
    final a f8212a;

    /* renamed from: androidx.recyclerview.widget.t$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        C1905a.b mo10375a(int i11, int i12, int i13, Object obj);

        /* renamed from: b */
        void mo10376b(C1905a.b bVar);
    }

    public C1927t(a aVar) {
        this.f8212a = aVar;
    }

    /* renamed from: a */
    private int m10637a(List list) {
        boolean z11 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C1905a.b) list.get(size)).f7946a == 8) {
                if (z11) {
                    return size;
                }
            } else {
                z11 = true;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m10638c(List list, int i11, C1905a.b bVar, int i12, C1905a.b bVar2) {
        int i13;
        int i14 = bVar.f7949d;
        int i15 = bVar2.f7947b;
        if (i14 < i15) {
            i13 = -1;
        } else {
            i13 = 0;
        }
        int i16 = bVar.f7947b;
        if (i16 < i15) {
            i13++;
        }
        if (i15 <= i16) {
            bVar.f7947b = i16 + bVar2.f7949d;
        }
        int i17 = bVar2.f7947b;
        if (i17 <= i14) {
            bVar.f7949d = i14 + bVar2.f7949d;
        }
        bVar2.f7947b = i17 + i13;
        list.set(i11, bVar2);
        list.set(i12, bVar);
    }

    /* renamed from: d */
    private void m10639d(List list, int i11, int i12) {
        C1905a.b bVar = (C1905a.b) list.get(i11);
        C1905a.b bVar2 = (C1905a.b) list.get(i12);
        int i13 = bVar2.f7946a;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 4) {
                    m10642f(list, i11, bVar, i12, bVar2);
                    return;
                }
                return;
            }
            m10641e(list, i11, bVar, i12, bVar2);
            return;
        }
        m10638c(list, i11, bVar, i12, bVar2);
    }

    /* renamed from: b */
    public void m10640b(List list) {
        while (true) {
            int m10637a = m10637a(list);
            if (m10637a != -1) {
                m10639d(list, m10637a, m10637a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    void m10641e(List list, int i11, C1905a.b bVar, int i12, C1905a.b bVar2) {
        boolean z11;
        int i13 = bVar.f7947b;
        int i14 = bVar.f7949d;
        boolean z12 = false;
        if (i13 < i14) {
            if (bVar2.f7947b == i13 && bVar2.f7949d == i14 - i13) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
        } else if (bVar2.f7947b == i14 + 1 && bVar2.f7949d == i13 - i14) {
            z11 = true;
            z12 = true;
        } else {
            z11 = true;
        }
        int i15 = bVar2.f7947b;
        if (i14 < i15) {
            bVar2.f7947b = i15 - 1;
        } else {
            int i16 = bVar2.f7949d;
            if (i14 < i15 + i16) {
                bVar2.f7949d = i16 - 1;
                bVar.f7946a = 2;
                bVar.f7949d = 1;
                if (bVar2.f7949d == 0) {
                    list.remove(i12);
                    this.f8212a.mo10376b(bVar2);
                    return;
                }
                return;
            }
        }
        int i17 = bVar.f7947b;
        int i18 = bVar2.f7947b;
        C1905a.b bVar3 = null;
        if (i17 <= i18) {
            bVar2.f7947b = i18 + 1;
        } else {
            int i19 = bVar2.f7949d;
            if (i17 < i18 + i19) {
                bVar3 = this.f8212a.mo10375a(2, i17 + 1, (i18 + i19) - i17, null);
                bVar2.f7949d = bVar.f7947b - bVar2.f7947b;
            }
        }
        if (z12) {
            list.set(i11, bVar2);
            list.remove(i12);
            this.f8212a.mo10376b(bVar);
            return;
        }
        if (z11) {
            if (bVar3 != null) {
                int i21 = bVar.f7947b;
                if (i21 > bVar3.f7947b) {
                    bVar.f7947b = i21 - bVar3.f7949d;
                }
                int i22 = bVar.f7949d;
                if (i22 > bVar3.f7947b) {
                    bVar.f7949d = i22 - bVar3.f7949d;
                }
            }
            int i23 = bVar.f7947b;
            if (i23 > bVar2.f7947b) {
                bVar.f7947b = i23 - bVar2.f7949d;
            }
            int i24 = bVar.f7949d;
            if (i24 > bVar2.f7947b) {
                bVar.f7949d = i24 - bVar2.f7949d;
            }
        } else {
            if (bVar3 != null) {
                int i25 = bVar.f7947b;
                if (i25 >= bVar3.f7947b) {
                    bVar.f7947b = i25 - bVar3.f7949d;
                }
                int i26 = bVar.f7949d;
                if (i26 >= bVar3.f7947b) {
                    bVar.f7949d = i26 - bVar3.f7949d;
                }
            }
            int i27 = bVar.f7947b;
            if (i27 >= bVar2.f7947b) {
                bVar.f7947b = i27 - bVar2.f7949d;
            }
            int i28 = bVar.f7949d;
            if (i28 >= bVar2.f7947b) {
                bVar.f7949d = i28 - bVar2.f7949d;
            }
        }
        list.set(i11, bVar2);
        if (bVar.f7947b != bVar.f7949d) {
            list.set(i12, bVar);
        } else {
            list.remove(i12);
        }
        if (bVar3 != null) {
            list.add(i11, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m10642f(List list, int i11, C1905a.b bVar, int i12, C1905a.b bVar2) {
        C1905a.b mo10375a;
        int i13;
        int i14;
        int i15 = bVar.f7949d;
        int i16 = bVar2.f7947b;
        C1905a.b bVar3 = null;
        if (i15 < i16) {
            bVar2.f7947b = i16 - 1;
        } else {
            int i17 = bVar2.f7949d;
            if (i15 < i16 + i17) {
                bVar2.f7949d = i17 - 1;
                mo10375a = this.f8212a.mo10375a(4, bVar.f7947b, 1, bVar2.f7948c);
                i13 = bVar.f7947b;
                i14 = bVar2.f7947b;
                if (i13 > i14) {
                    bVar2.f7947b = i14 + 1;
                } else {
                    int i18 = bVar2.f7949d;
                    if (i13 < i14 + i18) {
                        int i19 = (i14 + i18) - i13;
                        bVar3 = this.f8212a.mo10375a(4, i13 + 1, i19, bVar2.f7948c);
                        bVar2.f7949d -= i19;
                    }
                }
                list.set(i12, bVar);
                if (bVar2.f7949d <= 0) {
                    list.set(i11, bVar2);
                } else {
                    list.remove(i11);
                    this.f8212a.mo10376b(bVar2);
                }
                if (mo10375a != null) {
                    list.add(i11, mo10375a);
                }
                if (bVar3 == null) {
                    list.add(i11, bVar3);
                    return;
                }
                return;
            }
        }
        mo10375a = null;
        i13 = bVar.f7947b;
        i14 = bVar2.f7947b;
        if (i13 > i14) {
        }
        list.set(i12, bVar);
        if (bVar2.f7949d <= 0) {
        }
        if (mo10375a != null) {
        }
        if (bVar3 == null) {
        }
    }
}
