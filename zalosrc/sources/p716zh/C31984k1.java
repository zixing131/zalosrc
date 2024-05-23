package p716zh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zh.k1 */
/* loaded from: classes3.dex */
public class C31984k1 {

    /* renamed from: a */
    public int f147077a;

    /* renamed from: b */
    public List f147078b;

    /* renamed from: c */
    public C32096rb f147079c;

    public C31984k1(int i11, List list) {
        this.f147077a = i11;
        if (list != null) {
            this.f147078b = new ArrayList(list);
        }
    }

    /* renamed from: a */
    public boolean m153941a(C31890dc c31890dc) {
        try {
            List<C31890dc> list = this.f147078b;
            if (list != null && c31890dc != null) {
                for (C31890dc c31890dc2 : list) {
                    if (c31890dc2.f146495a == c31890dc.f146495a && c31890dc2.f146509o == c31890dc.f146509o) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public boolean m153942b(C31890dc c31890dc) {
        try {
            List list = this.f147078b;
            if (list != null && c31890dc != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C31890dc) it.next()).f146495a == c31890dc.f146495a) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public C31890dc m153943c() {
        List list = this.f147078b;
        if (list != null && !list.isEmpty()) {
            return (C31890dc) this.f147078b.get(0);
        }
        return null;
    }

    /* renamed from: d */
    public C31890dc m153944d(int i11) {
        List list = this.f147078b;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (C31890dc) this.f147078b.get(i11);
        }
        return null;
    }

    public C31984k1(int i11, C31890dc c31890dc) {
        this.f147077a = i11;
        if (c31890dc != null) {
            ArrayList arrayList = new ArrayList();
            this.f147078b = arrayList;
            arrayList.add(c31890dc);
        }
    }

    public C31984k1(int i11, C32096rb c32096rb) {
        this.f147077a = i11;
        this.f147079c = c32096rb;
    }
}
