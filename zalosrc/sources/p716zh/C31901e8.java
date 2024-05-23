package p716zh;

import java.util.ArrayList;
import java.util.Comparator;
import me0.AbstractC23056e6;
import me0.AbstractC23262x6;

/* renamed from: zh.e8 */
/* loaded from: classes.dex */
public class C31901e8 implements Comparable {

    /* renamed from: D */
    public static Comparator f146549D = new Comparator() { // from class: zh.c8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m153289u;
            m153289u = C31901e8.m153289u((C31901e8) obj, (C31901e8) obj2);
            return m153289u;
        }
    };

    /* renamed from: E */
    public static Comparator f146550E = new Comparator() { // from class: zh.d8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m153290v;
            m153290v = C31901e8.m153290v((C31901e8) obj, (C31901e8) obj2);
            return m153290v;
        }
    };

    /* renamed from: A */
    private long f146551A;

    /* renamed from: B */
    private String f146552B;

    /* renamed from: C */
    public ArrayList f146553C;

    /* renamed from: p */
    long f146554p;

    /* renamed from: q */
    String f146555q;

    /* renamed from: r */
    String f146556r;

    /* renamed from: s */
    String f146557s;

    /* renamed from: t */
    public int f146558t;

    /* renamed from: u */
    public String f146559u;

    /* renamed from: v */
    public String f146560v;

    /* renamed from: w */
    public String f146561w;

    /* renamed from: x */
    public int f146562x;

    /* renamed from: y */
    public int f146563y;

    /* renamed from: z */
    private int f146564z;

    public C31901e8(C31901e8 c31901e8) {
        this.f146558t = 0;
        this.f146559u = "";
        this.f146560v = "";
        this.f146561w = "";
        this.f146562x = 0;
        this.f146563y = 0;
        this.f146564z = 2;
        this.f146551A = -1L;
        this.f146552B = "";
        this.f146553C = new ArrayList();
        this.f146554p = c31901e8.f146554p;
        this.f146555q = c31901e8.f146555q;
        this.f146556r = c31901e8.f146556r;
        this.f146557s = c31901e8.f146557s;
        this.f146558t = c31901e8.f146558t;
        this.f146551A = c31901e8.f146551A;
        this.f146552B = c31901e8.f146552B;
        this.f146553C = new ArrayList(this.f146553C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ int m153289u(C31901e8 c31901e8, C31901e8 c31901e82) {
        int i11 = c31901e8.f146558t;
        int i12 = c31901e82.f146558t;
        if (i11 < i12) {
            return 1;
        }
        if (i11 > i12) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ int m153290v(C31901e8 c31901e8, C31901e8 c31901e82) {
        int compareTo;
        long j11 = c31901e8.f146554p;
        long j12 = c31901e82.f146554p;
        if (j11 < j12) {
            return -1;
        }
        if (j11 > j12) {
            return 1;
        }
        String str = c31901e8.f146557s;
        if (str != null && (compareTo = str.compareTo(c31901e82.f146557s)) != 0) {
            return compareTo;
        }
        String str2 = c31901e8.f146555q;
        if (str2 != null) {
            return str2.compareTo(c31901e82.f146555q);
        }
        return 0;
    }

    /* renamed from: A */
    public void m153291A(long j11) {
        this.f146554p = j11;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C31901e8 c31901e8) {
        String str = this.f146555q;
        if (str != null) {
            int compareTo = str.compareTo(c31901e8.f146555q);
            if (compareTo == 0) {
                return (int) (this.f146551A - c31901e8.f146551A);
            }
            return compareTo;
        }
        return 0;
    }

    /* renamed from: e */
    public int m153293e() {
        return this.f146564z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C31901e8)) {
            return false;
        }
        return AbstractC23056e6.m118275a(this.f146557s, ((C31901e8) obj).f146557s);
    }

    /* renamed from: g */
    public long m153294g() {
        return this.f146551A;
    }

    /* renamed from: h */
    public String m153295h() {
        return this.f146555q;
    }

    /* renamed from: i */
    public String m153296i() {
        return this.f146552B;
    }

    /* renamed from: j */
    public String m153297j() {
        return this.f146556r;
    }

    /* renamed from: m */
    public String m153298m() {
        return this.f146557s;
    }

    /* renamed from: q */
    public String m153299q() {
        String str = this.f146555q;
        if (str != null && str.length() > 32) {
            return this.f146555q.substring(0, 32) + "...";
        }
        return this.f146555q;
    }

    /* renamed from: r */
    public long m153300r() {
        return this.f146554p;
    }

    /* renamed from: s */
    public boolean m153301s() {
        String str = this.f146557s;
        if (str != null && !AbstractC23056e6.f112062a.equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m153302t(C31901e8 c31901e8) {
        String str = this.f146557s;
        if (str != null && str.equals(c31901e8.f146557s)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "----PhoneContact----\nname:" + this.f146555q + "\nnumber:" + this.f146556r + "\nnumber_international:" + this.f146557s + "\nuid:" + this.f146554p + "\n-------------------";
    }

    /* renamed from: w */
    public void m153303w(String str) {
        if (str == null) {
            return;
        }
        if (!str.equals("com.android.contacts")) {
            if (str.equals("com.google")) {
                this.f146564z = 1;
                return;
            }
            return;
        }
        this.f146564z = 0;
    }

    /* renamed from: x */
    public void m153304x(long j11) {
        this.f146551A = j11;
    }

    /* renamed from: y */
    public void m153305y(String str) {
        this.f146555q = str;
        this.f146552B = AbstractC23262x6.m120002o(str);
    }

    /* renamed from: z */
    public void m153306z(String str) {
        this.f146557s = str;
    }

    public C31901e8(String str, String str2) {
        this.f146558t = 0;
        this.f146559u = "";
        this.f146560v = "";
        this.f146561w = "";
        this.f146562x = 0;
        this.f146563y = 0;
        this.f146564z = 2;
        this.f146551A = -1L;
        this.f146552B = "";
        this.f146553C = new ArrayList();
        this.f146555q = str;
        this.f146556r = str2;
        this.f146557s = str2;
        this.f146552B = AbstractC23262x6.m120002o(str);
        this.f146554p = 0L;
    }

    public C31901e8(long j11, String str, String str2, String str3) {
        this.f146558t = 0;
        this.f146559u = "";
        this.f146560v = "";
        this.f146561w = "";
        this.f146562x = 0;
        this.f146563y = 0;
        this.f146564z = 2;
        this.f146551A = -1L;
        this.f146552B = "";
        this.f146553C = new ArrayList();
        this.f146554p = j11;
        this.f146555q = str;
        this.f146556r = str2;
        this.f146557s = str3;
        this.f146552B = AbstractC23262x6.m120002o(str);
    }
}
