package p623ww;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import me0.C23013a7;
import me0.C23100i6;
import me0.C23111j6;
import on0.AbstractC24337r;
import on0.AbstractC24342w;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;

/* renamed from: ww.c */
/* loaded from: classes4.dex */
public final class C29253c {
    public static final a Companion = new a(null);

    /* renamed from: k */
    private static final int[][] f135468k = {new int[0]};

    /* renamed from: a */
    private int f135469a = 6;

    /* renamed from: b */
    private int f135470b = 16;

    /* renamed from: c */
    private final h f135471c = new h(' ', null, null, 6, null);

    /* renamed from: d */
    private final List f135472d = new ArrayList();

    /* renamed from: e */
    private final List f135473e = new ArrayList();

    /* renamed from: f */
    private final List f135474f = new ArrayList();

    /* renamed from: g */
    private final HashMap f135475g = new HashMap();

    /* renamed from: h */
    private final boolean f135476h = true;

    /* renamed from: i */
    private final int[] f135477i = {1, 0, 0};

    /* renamed from: j */
    private final int[] f135478j = {0, 0, 0};

    /* renamed from: ww.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ww.c$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final f f135479a;

        /* renamed from: b */
        private final int f135480b;

        /* renamed from: c */
        private final int f135481c;

        /* renamed from: d */
        private final int f135482d;

        public b(f fVar, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(fVar, "label");
            this.f135479a = fVar;
            this.f135480b = i11;
            this.f135481c = i12;
            this.f135482d = i13;
        }

        /* renamed from: a */
        public final f m146059a() {
            return this.f135479a;
        }

        /* renamed from: b */
        public final int m146060b() {
            return this.f135482d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f135479a, bVar.f135479a) && this.f135480b == bVar.f135480b && this.f135481c == bVar.f135481c && this.f135482d == bVar.f135482d;
        }

        public int hashCode() {
            return (((((this.f135479a.hashCode() * 31) + this.f135480b) * 31) + this.f135481c) * 31) + this.f135482d;
        }

        public String toString() {
            return "Constraint(label=" + this.f135479a + ", index=" + this.f135480b + ", nonLabelWordOffset=" + this.f135481c + ", labelWordOffset=" + this.f135482d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ww.c$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final b f135483a;

        /* renamed from: b */
        private final List f135484b;

        public c(b bVar, List list) {
            AbstractC19074t.m100208f(bVar, "label");
            AbstractC19074t.m100208f(list, "constraints");
            this.f135483a = bVar;
            this.f135484b = list;
        }

        /* renamed from: a */
        public final List m146061a() {
            return this.f135484b;
        }

        /* renamed from: b */
        public final b m146062b() {
            return this.f135483a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f135483a, cVar.f135483a) && AbstractC19074t.m100204b(this.f135484b, cVar.f135484b);
        }

        public int hashCode() {
            return (this.f135483a.hashCode() * 31) + this.f135484b.hashCode();
        }

        public String toString() {
            return "Constraints(label=" + this.f135483a + ", constraints=" + this.f135484b + ")";
        }
    }

    /* renamed from: ww.c$d */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a */
        private final String f135485a;

        /* renamed from: b */
        private final float f135486b;

        /* renamed from: c */
        private final int f135487c;

        /* renamed from: d */
        private final e f135488d;

        /* renamed from: e */
        private final int[] f135489e;

        /* renamed from: f */
        private final int[] f135490f;

        public d(String str, float f11, int i11, e eVar, int[] iArr, int[] iArr2) {
            AbstractC19074t.m100208f(str, "content");
            AbstractC19074t.m100208f(iArr, "group");
            AbstractC19074t.m100208f(iArr2, "labelClass");
            this.f135485a = str;
            this.f135486b = f11;
            this.f135487c = i11;
            this.f135488d = eVar;
            this.f135489e = iArr;
            this.f135490f = iArr2;
        }

        /* renamed from: a */
        public final String m146063a() {
            return this.f135485a;
        }

        /* renamed from: b */
        public final int[] m146064b() {
            return this.f135489e;
        }

        /* renamed from: c */
        public final int[] m146065c() {
            return this.f135490f;
        }

        /* renamed from: d */
        public final int m146066d() {
            return this.f135487c;
        }

        /* renamed from: e */
        public final e m146067e() {
            return this.f135488d;
        }

        /* renamed from: f */
        public final float m146068f() {
            return this.f135486b;
        }

        public String toString() {
            return "('" + this.f135485a + "', " + this.f135486b + ")";
        }
    }

    /* renamed from: ww.c$e */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a */
        private final int f135491a;

        /* renamed from: b */
        private final String f135492b;

        /* renamed from: c */
        private final String f135493c;

        public e(int i11, String str, String str2) {
            AbstractC19074t.m100208f(str, "labelName");
            AbstractC19074t.m100208f(str2, "bin");
            this.f135491a = i11;
            this.f135492b = str;
            this.f135493c = str2;
        }

        /* renamed from: a */
        public final String m146069a() {
            return this.f135493c;
        }

        /* renamed from: b */
        public final String m146070b() {
            return this.f135492b;
        }

        public String toString() {
            return "LabelInfo(label=" + this.f135491a + ", branchName='" + this.f135492b + "')";
        }
    }

    /* renamed from: ww.c$f */
    /* loaded from: classes4.dex */
    public static class f {

        /* renamed from: a */
        private final d f135494a;

        /* renamed from: b */
        private final int f135495b;

        /* renamed from: c */
        private final int f135496c;

        /* renamed from: d */
        private final int f135497d;

        /* renamed from: e */
        private final int f135498e;

        public f(d dVar, int i11, int i12, int i13, int i14) {
            AbstractC19074t.m100208f(dVar, "label");
            this.f135494a = dVar;
            this.f135495b = i11;
            this.f135496c = i12;
            this.f135497d = i13;
            this.f135498e = i14;
        }

        /* renamed from: a */
        public final int m146071a() {
            return this.f135496c;
        }

        /* renamed from: b */
        public final d m146072b() {
            return this.f135494a;
        }

        /* renamed from: c */
        public final int m146073c() {
            return this.f135495b;
        }

        public String toString() {
            return "(label=" + this.f135494a + ")";
        }
    }

    /* renamed from: ww.c$g */
    /* loaded from: classes4.dex */
    public static final class g {

        /* renamed from: a */
        private final f[] f135499a;

        /* renamed from: b */
        private final int f135500b;

        /* renamed from: c */
        private final e f135501c;

        /* renamed from: d */
        private float f135502d;

        public g(f[] fVarArr, int i11, e eVar, float f11) {
            AbstractC19074t.m100208f(fVarArr, "labels");
            AbstractC19074t.m100208f(eVar, "labelData");
            this.f135499a = fVarArr;
            this.f135500b = i11;
            this.f135501c = eVar;
            this.f135502d = f11;
        }

        /* renamed from: a */
        public final e m146074a() {
            return this.f135501c;
        }

        public String toString() {
            return "(labelName='" + this.f135501c.m146070b() + "', probability=" + this.f135502d + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ww.c$h */
    /* loaded from: classes4.dex */
    public static class h {

        /* renamed from: a */
        private final char f135503a;

        /* renamed from: b */
        private final LinkedHashMap f135504b;

        /* renamed from: c */
        private d f135505c;

        public h(char c11, LinkedHashMap linkedHashMap, d dVar) {
            AbstractC19074t.m100208f(linkedHashMap, "childList");
            this.f135503a = c11;
            this.f135504b = linkedHashMap;
            this.f135505c = dVar;
        }

        /* renamed from: a */
        public final LinkedHashMap m146075a() {
            return this.f135504b;
        }

        /* renamed from: b */
        public final d m146076b() {
            return this.f135505c;
        }

        /* renamed from: c */
        public final void m146077c(d dVar) {
            this.f135505c = dVar;
        }

        public String toString() {
            return "Node(key=" + this.f135503a + ", value=" + this.f135505c + ")";
        }

        public /* synthetic */ h(char c11, LinkedHashMap linkedHashMap, d dVar, int i11, AbstractC19060k abstractC19060k) {
            this(c11, (i11 & 2) != 0 ? new LinkedHashMap() : linkedHashMap, (i11 & 4) != 0 ? null : dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ww.c$i */
    /* loaded from: classes4.dex */
    public static final class i {

        /* renamed from: a */
        private final int[] f135506a;

        /* renamed from: b */
        private final int[][] f135507b;

        public i(int[] iArr, int[][] iArr2) {
            AbstractC19074t.m100208f(iArr, "input");
            AbstractC19074t.m100208f(iArr2, "output");
            this.f135506a = iArr;
            this.f135507b = iArr2;
        }

        /* renamed from: a */
        public final int[][] m146078a() {
            return this.f135507b;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!AbstractC19074t.m100204b(i.class, cls)) {
                return false;
            }
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.parser.payment.PaymentEntityParser.Pattern");
            if (Arrays.equals(this.f135506a, ((i) obj).f135506a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f135506a);
        }

        public String toString() {
            String arrays = Arrays.toString(this.f135506a);
            AbstractC19074t.m100207e(arrays, "toString(...)");
            int[][] iArr = this.f135507b;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int[] iArr2 : iArr) {
                String arrays2 = Arrays.toString(iArr2);
                AbstractC19074t.m100207e(arrays2, "toString(...)");
                arrayList.add(arrays2);
            }
            String arrays3 = Arrays.toString(arrayList.toArray(new String[0]));
            AbstractC19074t.m100207e(arrays3, "toString(...)");
            return "(" + arrays + " => " + arrays3 + ")";
        }

        public /* synthetic */ i(int[] iArr, int[][] iArr2, int i11, AbstractC19060k abstractC19060k) {
            this(iArr, (i11 & 2) != 0 ? C29253c.f135468k : iArr2);
        }
    }

    /* renamed from: ww.c$j */
    /* loaded from: classes4.dex */
    public static final class j {

        /* renamed from: a */
        private final f f135508a;

        /* renamed from: b */
        private final List f135509b;

        /* renamed from: c */
        private final List f135510c;

        /* renamed from: d */
        private final float f135511d;

        public j(f fVar, List list, List list2, float f11) {
            AbstractC19074t.m100208f(fVar, "accountNumberEntity");
            AbstractC19074t.m100208f(list, "bankNameEntities");
            AbstractC19074t.m100208f(list2, "accountNameEntities");
            this.f135508a = fVar;
            this.f135509b = list;
            this.f135510c = list2;
            this.f135511d = f11;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String[] m146079a() {
            Object m129218b;
            String[] strArr;
            Object m131206f0;
            g gVar;
            String str;
            try {
                C24861r.a aVar = C24861r.f119264q;
                strArr = new String[4];
                strArr[0] = ((g) this.f135509b.get(0)).m146074a().m146069a();
                strArr[1] = ((g) this.f135509b.get(0)).m146074a().m146070b();
                strArr[2] = this.f135508a.m146072b().m146063a();
                m131206f0 = AbstractC25332a0.m131206f0(this.f135510c);
                gVar = (g) m131206f0;
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (gVar != null) {
                e m146074a = gVar.m146074a();
                if (m146074a != null) {
                    str = m146074a.m146070b();
                    if (str == null) {
                    }
                    strArr[3] = str;
                    m129218b = C24861r.m129218b(strArr);
                    if (C24861r.m129223g(m129218b)) {
                        m129218b = null;
                    }
                    return (String[]) m129218b;
                }
            }
            str = "";
            strArr[3] = str;
            m129218b = C24861r.m129218b(strArr);
            if (C24861r.m129223g(m129218b)) {
            }
            return (String[]) m129218b;
        }

        public String toString() {
            String m131214n0;
            String m131214n02;
            float f11 = this.f135511d;
            f fVar = this.f135508a;
            m131214n0 = AbstractC25332a0.m131214n0(this.f135509b, null, null, null, 0, null, null, 63, null);
            m131214n02 = AbstractC25332a0.m131214n0(this.f135510c, null, null, null, 0, null, null, 63, null);
            return "(P=" + f11 + ", number=" + fVar + ", bankNames=[" + m131214n0 + "], accountNames=[" + m131214n02 + "])";
        }
    }

    /* renamed from: ww.c$k */
    /* loaded from: classes4.dex */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((f) obj).m146071a()), Integer.valueOf(((f) obj2).m146071a()));
            return m135478b;
        }
    }

    /* renamed from: ww.c$l */
    /* loaded from: classes4.dex */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(((f) obj).m146073c()), Integer.valueOf(((f) obj2).m146073c()));
            return m135478b;
        }
    }

    /* renamed from: b */
    private final void m146048b(String[] strArr, int[] iArr, int[] iArr2, List list) {
        int length = strArr.length;
        d dVar = null;
        int i11 = 0;
        while (i11 < length) {
            if (iArr2[i11] == 1) {
                i11++;
            } else {
                h hVar = this.f135471c;
                int i12 = i11;
                int i13 = i12;
                while (i12 < length) {
                    String str = strArr[i12];
                    int length2 = str.length();
                    int i14 = 0;
                    while (i14 < length2) {
                        h hVar2 = (h) hVar.m146075a().get(Character.valueOf(str.charAt(i14)));
                        if (hVar2 == null) {
                            break;
                        }
                        i14++;
                        hVar = hVar2;
                    }
                    if (i14 != length2 || length2 == 0) {
                        break;
                    }
                    d m146076b = hVar.m146076b();
                    if (m146076b != null) {
                        i13 = i12;
                        dVar = m146076b;
                    }
                    hVar = (h) hVar.m146075a().get(' ');
                    if (hVar == null) {
                        break;
                    } else {
                        i12++;
                    }
                }
                d dVar2 = dVar;
                int i15 = i13;
                if (dVar2 != null) {
                    list.add(new f(dVar2, i11, i15, iArr[i11], iArr[i15] + dVar2.m146063a().length()));
                    while (i11 < i15) {
                        iArr2[i11] = 1;
                        i11++;
                    }
                    dVar2 = null;
                }
                i11 = i15 + 1;
                dVar = dVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:            r14 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f4, code lost:            if (r11 == 8239) goto L59;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0163  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m146049c(String str, String[] strArr, int[] iArr, int[] iArr2, List list) {
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        int i13;
        int length;
        String str2 = str;
        int length2 = strArr.length;
        StringBuilder sb2 = new StringBuilder();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i14 < length2) {
            if (iArr2[i14] == 1) {
                int i18 = this.f135469a;
                int i19 = this.f135470b;
                int length3 = sb2.length();
                if (i18 <= length3 && length3 <= i19) {
                    String sb3 = sb2.toString();
                    AbstractC19074t.m100207e(sb3, "toString(...)");
                    list.add(new f(new d(sb3, 0.0f, 1, null, this.f135478j, this.f135477i), i16, i17, iArr[i16], iArr[i17] + strArr[i17].length()));
                }
                AbstractC24337r.m127103i(sb2);
                i14++;
                i15 = 0;
            } else {
                String str3 = strArr[i14];
                int length4 = str3.length();
                int i21 = 0;
                while (true) {
                    if (i21 < str3.length()) {
                        if (!Character.isDigit(str3.charAt(i21))) {
                            z11 = false;
                            break;
                        }
                        i21++;
                    } else {
                        z11 = true;
                        break;
                    }
                }
                if (!z11 || iArr[i14] - 1 <= 0 || sb2.length() == 0) {
                    i11 = i15;
                    i12 = i16;
                } else {
                    int i22 = iArr[i14];
                    i12 = i16;
                    if ((i22 - 1) - i15 > 1) {
                        int i23 = i15 + 1;
                        int i24 = i22 - 1;
                        boolean z13 = false;
                        while (true) {
                            i11 = i15;
                            if (i23 >= i24) {
                                break;
                            }
                            int i25 = i24;
                            if (str2.charAt(i23) == '-') {
                                if (z13) {
                                    break;
                                }
                                z13 = true;
                                i23++;
                                i15 = i11;
                                i24 = i25;
                            } else {
                                if (str2.charAt(i23) != ' ') {
                                    break;
                                }
                                i23++;
                                i15 = i11;
                                i24 = i25;
                            }
                        }
                    } else {
                        i11 = i15;
                        char charAt = str2.charAt(i22 - 1);
                        if (charAt != ' ') {
                            if (charAt != ',') {
                                if (charAt != '.') {
                                    if (charAt != '-') {
                                        if (charAt != 160) {
                                            if (charAt != 8199) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (sb2.length() == 0) {
                        i17 = i14;
                        i12 = i17;
                    }
                    if (!z11) {
                        if (!z12) {
                            int i26 = this.f135469a;
                            int i27 = this.f135470b;
                            int length5 = sb2.length();
                            if (i26 <= length5 && length5 <= i27) {
                                String sb4 = sb2.toString();
                                AbstractC19074t.m100207e(sb4, "toString(...)");
                                list.add(new f(new d(sb4, 0.0f, 1, null, this.f135478j, this.f135477i), i12, i17, iArr[i12], iArr[i17] + strArr[i17].length()));
                            }
                            AbstractC24337r.m127103i(sb2);
                        }
                        sb2.append(str3);
                        if (length4 != 0) {
                            i15 = (iArr[i14] + length4) - 1;
                        } else {
                            i15 = i11;
                        }
                        if (str3.length() > 0) {
                            i17 = i14;
                        }
                    } else {
                        i15 = i11;
                    }
                    if (z11 || i14 >= length2 - 1) {
                        i13 = this.f135469a;
                        int i28 = this.f135470b;
                        length = sb2.length();
                        if (i13 <= length && length <= i28) {
                            String sb5 = sb2.toString();
                            AbstractC19074t.m100207e(sb5, "toString(...)");
                            list.add(new f(new d(sb5, 0.0f, 1, null, this.f135478j, this.f135477i), i12, i17, iArr[i12], iArr[i17] + strArr[i17].length()));
                        }
                        AbstractC24337r.m127103i(sb2);
                        i15 = 0;
                    }
                    i14++;
                    str2 = str;
                    i16 = i12;
                }
                z12 = true;
                if (sb2.length() == 0) {
                }
                if (!z11) {
                }
                if (z11) {
                }
                i13 = this.f135469a;
                int i282 = this.f135470b;
                length = sb2.length();
                if (i13 <= length) {
                    String sb52 = sb2.toString();
                    AbstractC19074t.m100207e(sb52, "toString(...)");
                    list.add(new f(new d(sb52, 0.0f, 1, null, this.f135478j, this.f135477i), i12, i17, iArr[i12], iArr[i17] + strArr[i17].length()));
                }
                AbstractC24337r.m127103i(sb2);
                i15 = 0;
                i14++;
                str2 = str;
                i16 = i12;
            }
        }
    }

    /* renamed from: d */
    private final c[] m146050d(List list) {
        int i11;
        int i12 = 1;
        if (list.size() > 1) {
            AbstractC25376w.m131534w(list, new k());
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<f> list2 = list;
        for (f fVar : list2) {
            if (m146052f(fVar.m146072b())) {
                arrayList.add(fVar);
            } else {
                arrayList2.add(fVar);
            }
        }
        int size2 = arrayList.size();
        int[] iArr = new int[arrayList2.size()];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size2];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (Object obj : list2) {
            int i18 = i13 + 1;
            if (i13 < 0) {
                AbstractC25368s.m131509q();
            }
            f fVar2 = (f) obj;
            if (m146052f(fVar2.m146072b())) {
                iArr3[i15] = i13;
                i15++;
            } else {
                iArr[i14] = i13;
                i14++;
            }
            i16 += Math.max(0, fVar2.m146073c() - i12) - i17;
            i17 = fVar2.m146071a();
            iArr2[i13] = i16;
            i13 = i18;
            i12 = 1;
        }
        c[] cVarArr = new c[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            f fVar3 = (f) list.get(iArr3[i19]);
            int i21 = iArr3[i19];
            cVarArr[i19] = new c(new b(fVar3, i21, iArr2[i21], i21), new ArrayList());
        }
        int i22 = -1;
        for (int i23 = 0; i23 < size2; i23++) {
            if (i22 < i23) {
                int i24 = iArr3[i23];
                cVarArr[i23].m146061a().add(cVarArr[i23].m146062b());
                int i25 = i24 - 1;
                while (true) {
                    if (i25 < 0 || Math.abs(iArr2[i24] - iArr2[i25]) > 12) {
                        break;
                    }
                    cVarArr[i23].m146061a().add(0, new b((f) list.get(i25), i25, iArr2[i25], i25));
                    i25--;
                }
                int i26 = i24 + 1;
                int i27 = i23;
                for (i11 = 12; i26 <= size - 1 && Math.abs(iArr2[i24] - iArr2[i26]) <= i11; i11 = 12) {
                    cVarArr[i23].m146061a().add(new b((f) list.get(i26), i26, iArr2[i26], i26));
                    if (m146052f(((f) list.get(i26)).m146072b())) {
                        i27++;
                        i24 = i26;
                    }
                    i26++;
                }
                i22 = i27;
            }
        }
        return cVarArr;
    }

    /* renamed from: e */
    private final void m146051e(String str, String[] strArr, int[] iArr, int[] iArr2, List list) {
        m146048b(strArr, iArr, iArr2, list);
        m146049c(str, strArr, iArr, iArr2, list);
        if (list.size() > 1) {
            AbstractC25376w.m131534w(list, new l());
        }
    }

    /* renamed from: f */
    private final boolean m146052f(d dVar) {
        if (dVar.m146065c()[0] != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0446 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m146053h(String str, String[] strArr, int[] iArr, int[] iArr2, List list, List list2) {
        boolean z11;
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        int i14;
        float f11;
        b bVar;
        List m131496e;
        List m131502j;
        ArrayList arrayList;
        Object obj;
        int intValue;
        float f12;
        float f13;
        float f14;
        float f15;
        c[] m146050d = m146050d(list);
        char c11 = 1;
        if (strArr.length == list.size()) {
            if (!(strArr.length == 0)) {
                z11 = true;
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                i11 = -1;
                i12 = -1;
                objArr = m146050d;
                while (true) {
                    i13 = i12 + 1;
                    if (i13 >= objArr.length) {
                        c cVar = objArr[i13];
                        b m146062b = cVar.m146062b();
                        hashMap.clear();
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        Iterator it = cVar.m146061a().iterator();
                        boolean z12 = false;
                        int i15 = -1;
                        boolean z13 = false;
                        boolean z14 = false;
                        boolean z15 = false;
                        Integer num = null;
                        boolean z16 = false;
                        Integer num2 = null;
                        while (true) {
                            float f16 = 0.0f;
                            if (!it.hasNext()) {
                                break;
                            }
                            b bVar2 = (b) it.next();
                            int m146066d = bVar2.m146059a().m146072b().m146066d();
                            Integer num3 = (Integer) hashMap.get(Integer.valueOf(m146066d));
                            if (num3 == null) {
                                intValue = -1;
                            } else {
                                AbstractC19074t.m100205c(num3);
                                intValue = num3.intValue();
                            }
                            if (intValue != i11 && !m146052f(bVar2.m146059a().m146072b())) {
                                if (bVar2.m146059a().m146072b().m146064b()[c11] != 0) {
                                    if (bVar2.m146060b() < m146062b.m146060b()) {
                                        f15 = bVar2.m146059a().m146072b().m146064b()[1];
                                        f14 = 1.0f;
                                    } else {
                                        f14 = 1.0f;
                                        f15 = bVar2.m146059a().m146072b().m146064b()[2];
                                    }
                                    f16 = f14 / f15;
                                }
                                if (((Number) arrayList3.get(intValue)).floatValue() < f16) {
                                    arrayList3.set(intValue, Float.valueOf(f16));
                                }
                                arrayList4.set(intValue, Integer.valueOf(((Number) arrayList4.get(intValue)).intValue() + 1));
                            } else {
                                arrayList2.add(bVar2);
                                arrayList4.add(1);
                                if (bVar2.m146059a().m146072b().m146064b()[1] != 0) {
                                    if (bVar2.m146060b() < m146062b.m146060b()) {
                                        f13 = bVar2.m146059a().m146072b().m146064b()[1];
                                        f12 = 1.0f;
                                    } else {
                                        f12 = 1.0f;
                                        f13 = bVar2.m146059a().m146072b().m146064b()[2];
                                    }
                                    f16 = f12 / f13;
                                }
                                arrayList3.add(Float.valueOf(f16));
                                hashMap.put(Integer.valueOf(m146066d), Integer.valueOf(arrayList2.size() - 1));
                            }
                            if (!z13 && m146052f(bVar2.m146059a().m146072b())) {
                                if (z14) {
                                    z13 = true;
                                } else {
                                    z14 = true;
                                }
                            }
                            if (!z15) {
                                int i16 = bVar2.m146059a().m146072b().m146065c()[0];
                                if (num == null || i16 != num.intValue()) {
                                    if (num == null) {
                                        num = Integer.valueOf(bVar2.m146059a().m146072b().m146065c()[0]);
                                    } else {
                                        z15 = true;
                                    }
                                }
                            }
                            if (!z16 && bVar2.m146059a().m146072b().m146065c()[1] != bVar2.m146059a().m146072b().m146066d()) {
                                int m146066d2 = bVar2.m146059a().m146072b().m146066d();
                                if (num2 == null || m146066d2 != num2.intValue()) {
                                    if (num2 == null) {
                                        num2 = Integer.valueOf(bVar2.m146059a().m146072b().m146066d());
                                    } else {
                                        z16 = true;
                                    }
                                }
                            }
                            if (!z12) {
                                z12 = z13 && (z15 || z16);
                                if (!z12) {
                                    i15 = arrayList2.size();
                                }
                            }
                            c11 = 1;
                            i11 = -1;
                        }
                        if (this.f135476h && z12) {
                            int size = arrayList2.size();
                            int[] iArr3 = new int[size];
                            for (int i17 = 0; i17 < size; i17++) {
                                iArr3[i17] = ((b) arrayList2.get(i17)).m146059a().m146072b().m146064b()[0];
                            }
                            i iVar = (i) this.f135475g.get(new i(iArr3, null, 2, false ? 1 : 0));
                            if (iVar != null) {
                                int[][] m146078a = iVar.m146078a();
                                ArrayList arrayList5 = new ArrayList(m146078a.length);
                                int length = m146078a.length;
                                int i18 = 0;
                                while (i18 < length) {
                                    int[] iArr4 = m146078a[i18];
                                    ArrayList arrayList6 = new ArrayList();
                                    int length2 = iArr4.length;
                                    HashMap hashMap2 = hashMap;
                                    int i19 = 0;
                                    while (i19 < length2) {
                                        arrayList6.add(arrayList2.get(iArr4[i19]));
                                        i19++;
                                        m146078a = m146078a;
                                    }
                                    int[][] iArr5 = m146078a;
                                    Iterator it2 = arrayList6.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj = it2.next();
                                            if (m146052f(((b) obj).m146059a().m146072b())) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    b bVar3 = (b) obj;
                                    if (bVar3 != null) {
                                        arrayList5.add(new c(bVar3, arrayList6));
                                        i18++;
                                        hashMap = hashMap2;
                                        m146078a = iArr5;
                                    } else {
                                        throw new IllegalArgumentException("Pattern is invalid");
                                    }
                                }
                                HashMap hashMap3 = hashMap;
                                int size2 = arrayList5.size();
                                for (int i21 = 0; i21 < size2; i21++) {
                                    objArr[i13 + i21] = arrayList5.get(i21);
                                }
                                hashMap = hashMap3;
                                c11 = 1;
                                i11 = -1;
                                objArr = objArr;
                            }
                        }
                        HashMap hashMap4 = hashMap;
                        float[] fArr = new float[6];
                        b[] bVarArr = new b[6];
                        float[] fArr2 = new float[6];
                        int i22 = i15;
                        int i23 = 0;
                        Object obj2 = objArr;
                        while (i23 < i22) {
                            b bVar4 = (b) arrayList2.get(i23);
                            int m146066d3 = bVar4.m146059a().m146072b().m146066d();
                            int i24 = bVar4.m146059a().m146072b().m146065c()[0];
                            Object obj3 = obj2;
                            boolean z17 = bVar4.m146059a().m146072b().m146065c()[1] == m146066d3;
                            if (i24 >= 0) {
                                arrayList = arrayList2;
                                fArr[i24] = Math.min(1.0f, fArr[i24] + bVar4.m146059a().m146072b().m146068f());
                                if (!z17) {
                                    float floatValue = ((Number) arrayList3.get(i23)).floatValue();
                                    if (floatValue > fArr2[i24]) {
                                        bVarArr[i24] = bVar4;
                                        fArr2[i24] = floatValue;
                                    }
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                            i23++;
                            arrayList2 = arrayList;
                            obj2 = obj3;
                        }
                        Object obj4 = obj2;
                        ArrayList arrayList7 = arrayList2;
                        Iterator it3 = this.f135473e.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                i14 = -1;
                                f11 = 0.0f;
                                bVar = null;
                                break;
                            } else {
                                int[] iArr6 = (int[]) it3.next();
                                if (!(iArr6.length == 0)) {
                                    i14 = iArr6[0];
                                    f11 = fArr[i14];
                                    if (f11 >= 0.5f) {
                                        bVar = bVarArr[i14];
                                        break;
                                    }
                                }
                            }
                        }
                        if (bVar == null && z11) {
                            Iterator it4 = this.f135473e.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                int[] iArr7 = (int[]) it4.next();
                                if (!(iArr7.length == 0)) {
                                    int i25 = iArr7[0];
                                    float f17 = fArr[i25];
                                    if (f17 > 0.0f) {
                                        bVar = bVarArr[i25];
                                        i14 = i25;
                                        f11 = f17;
                                        break;
                                    }
                                }
                            }
                        }
                        if (bVar == null || i14 != 5) {
                            c11 = 1;
                        } else {
                            f m146059a = m146062b.m146059a();
                            c11 = 1;
                            f[] fVarArr = {bVar.m146059a()};
                            int m146066d4 = bVar.m146059a().m146072b().m146066d();
                            e m146067e = bVar.m146059a().m146072b().m146067e();
                            if (m146067e == null) {
                                throw new IllegalArgumentException("Could not find name for LabelCode " + bVar.m146059a().m146072b().m146066d());
                            }
                            m131496e = AbstractC25366r.m131496e(new g(fVarArr, m146066d4, m146067e, bVar.m146059a().m146072b().m146068f()));
                            m131502j = AbstractC25368s.m131502j();
                            list2.add(new j(m146059a, m131496e, m131502j, f11));
                        }
                        hashMap = hashMap4;
                        i12 = i13;
                        arrayList2 = arrayList7;
                        objArr = obj4;
                        i11 = -1;
                        objArr = objArr;
                    } else {
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        return;
                    }
                }
            }
        }
        z11 = false;
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList32 = new ArrayList();
        ArrayList arrayList42 = new ArrayList();
        i11 = -1;
        i12 = -1;
        objArr = m146050d;
        while (true) {
            i13 = i12 + 1;
            if (i13 >= objArr.length) {
            }
            i11 = -1;
            objArr = objArr;
        }
    }

    /* renamed from: g */
    public final void m146054g(String str) {
        List m127131A0;
        int m127163V;
        String str2;
        int i11;
        String str3;
        List m127131A02;
        int m127163V2;
        String str4;
        List m127131A03;
        int m127163V3;
        String str5;
        List<String> m127131A04;
        int m127163V4;
        String str6;
        List m127131A05;
        int m127163V5;
        List m127131A06;
        List m127131A07;
        Object obj;
        e eVar;
        List m127131A08;
        List m127131A09;
        List m127131A010;
        int m131511r;
        int[] m131184L0;
        List m127131A011;
        int m131511r2;
        int[] m131184L02;
        List m127131A012;
        int m131511r3;
        List m127131A013;
        int m131511r4;
        AbstractC19074t.m100208f(str, "configData");
        int i12 = 0;
        m127131A0 = AbstractC24342w.m127131A0(str, new char[]{8204}, false, 0, 6, null);
        String str7 = (String) m127131A0.get(0);
        m127163V = AbstractC24342w.m127163V(str7);
        while (true) {
            str2 = "";
            i11 = -1;
            if (-1 >= m127163V) {
                str3 = "";
                break;
            } else {
                if (str7.charAt(m127163V) != 8205) {
                    String substring = str7.substring(0, m127163V + 1);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    str3 = substring;
                    break;
                }
                m127163V--;
            }
        }
        m127131A02 = AbstractC24342w.m127131A0(str3, new char[]{8205}, false, 0, 6, null);
        String str8 = (String) m127131A0.get(1);
        m127163V2 = AbstractC24342w.m127163V(str8);
        while (true) {
            if (-1 >= m127163V2) {
                str4 = "";
                break;
            } else {
                if (str8.charAt(m127163V2) != 8205) {
                    String substring2 = str8.substring(0, m127163V2 + 1);
                    AbstractC19074t.m100207e(substring2, "substring(...)");
                    str4 = substring2;
                    break;
                }
                m127163V2--;
            }
        }
        m127131A03 = AbstractC24342w.m127131A0(str4, new char[]{8205}, false, 0, 6, null);
        int i13 = 2;
        String str9 = (String) m127131A0.get(2);
        m127163V3 = AbstractC24342w.m127163V(str9);
        while (true) {
            if (-1 >= m127163V3) {
                str5 = "";
                break;
            } else {
                if (str9.charAt(m127163V3) != 8205) {
                    String substring3 = str9.substring(0, m127163V3 + 1);
                    AbstractC19074t.m100207e(substring3, "substring(...)");
                    str5 = substring3;
                    break;
                }
                m127163V3--;
            }
        }
        m127131A04 = AbstractC24342w.m127131A0(str5, new char[]{8205}, false, 0, 6, null);
        int i14 = 3;
        String str10 = (String) m127131A0.get(3);
        m127163V4 = AbstractC24342w.m127163V(str10);
        while (true) {
            if (-1 >= m127163V4) {
                str6 = "";
                break;
            } else {
                if (str10.charAt(m127163V4) != 8205) {
                    String substring4 = str10.substring(0, m127163V4 + 1);
                    AbstractC19074t.m100207e(substring4, "substring(...)");
                    str6 = substring4;
                    break;
                }
                m127163V4--;
            }
        }
        m127131A05 = AbstractC24342w.m127131A0(str6, new char[]{8205}, false, 0, 6, null);
        String str11 = (String) m127131A0.get(4);
        m127163V5 = AbstractC24342w.m127163V(str11);
        while (true) {
            if (i11 >= m127163V5) {
                break;
            }
            if (str11.charAt(m127163V5) == 8205) {
                m127163V5--;
                i11 = -1;
            } else {
                str2 = str11.substring(0, m127163V5 + 1);
                AbstractC19074t.m100207e(str2, "substring(...)");
                break;
            }
        }
        m127131A06 = AbstractC24342w.m127131A0(str2, new char[]{8205}, false, 0, 6, null);
        C19059j0 c19059j0 = new C19059j0();
        this.f135473e.clear();
        if (m127131A02.size() >= 4) {
            Iterator it = m127131A02.iterator();
            while (true) {
                int i15 = 10;
                char c11 = 8206;
                if (it.hasNext()) {
                    m127131A013 = AbstractC24342w.m127131A0((String) it.next(), new char[]{8206}, false, 0, 6, null);
                    List list = m127131A013;
                    m131511r4 = AbstractC25370t.m131511r(list, 10);
                    ArrayList arrayList = new ArrayList(m131511r4);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                    }
                    if (arrayList.size() >= 3) {
                        int intValue = ((Number) arrayList.get(0)).intValue();
                        int intValue2 = ((Number) arrayList.get(1)).intValue();
                        int intValue3 = ((Number) arrayList.get(2)).intValue();
                        if (intValue == this.f135473e.size()) {
                            this.f135473e.add(new int[]{intValue, intValue2, intValue3});
                        } else if (intValue < this.f135473e.size()) {
                            this.f135473e.set(intValue, new int[]{intValue, intValue2, intValue3});
                        } else {
                            for (int size = this.f135473e.size(); size < intValue; size++) {
                                this.f135473e.add(new int[0]);
                            }
                            this.f135473e.add(new int[]{intValue, intValue2, intValue2});
                        }
                    } else {
                        throw new IllegalArgumentException("Can not resolve config data, fields.size < 3");
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = m127131A03.iterator();
                    while (it3.hasNext()) {
                        m127131A012 = AbstractC24342w.m127131A0((String) it3.next(), new char[]{8206}, false, 0, 6, null);
                        List list2 = m127131A012;
                        m131511r3 = AbstractC25370t.m131511r(list2, i15);
                        ArrayList arrayList3 = new ArrayList(m131511r3);
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(Integer.valueOf(Integer.parseInt((String) it4.next())));
                        }
                        if (arrayList3.size() >= i14) {
                            int intValue4 = ((Number) arrayList3.get(0)).intValue();
                            int intValue5 = ((Number) arrayList3.get(1)).intValue();
                            int intValue6 = ((Number) arrayList3.get(2)).intValue();
                            if (intValue4 == arrayList2.size()) {
                                arrayList2.add(new int[]{intValue4, intValue5, intValue6});
                            } else if (intValue4 < arrayList2.size()) {
                                arrayList2.set(intValue4, new int[]{intValue4, intValue5, intValue6});
                            } else {
                                for (int size2 = arrayList2.size(); size2 < intValue4; size2++) {
                                    arrayList2.add(new int[0]);
                                }
                                arrayList2.add(new int[]{intValue4, intValue5, intValue6});
                            }
                            i15 = 10;
                            i14 = 3;
                        } else {
                            throw new IllegalArgumentException("Can not resolve group config data, fields.size < 3");
                        }
                    }
                    C19059j0 c19059j02 = new C19059j0();
                    this.f135474f.clear();
                    for (String str12 : m127131A04) {
                        char[] cArr = new char[1];
                        cArr[i12] = c11;
                        m127131A09 = AbstractC24342w.m127131A0(str12, cArr, false, 0, 6, null);
                        if (m127131A09.size() >= i13) {
                            int parseInt = Integer.parseInt((String) m127131A09.get(i12));
                            CharSequence charSequence = (CharSequence) m127131A09.get(1);
                            char[] cArr2 = new char[1];
                            char c12 = 8207;
                            cArr2[i12] = 8207;
                            m127131A010 = AbstractC24342w.m127131A0(charSequence, cArr2, false, 0, 6, null);
                            List list3 = m127131A010;
                            m131511r = AbstractC25370t.m131511r(list3, 10);
                            ArrayList arrayList4 = new ArrayList(m131511r);
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(Integer.valueOf(Integer.parseInt((String) it5.next())));
                            }
                            m131184L0 = AbstractC25332a0.m131184L0(arrayList4);
                            c19059j02.f94941p = m131184L0;
                            int[][] iArr = new int[parseInt];
                            int i16 = 0;
                            while (i16 < parseInt) {
                                CharSequence charSequence2 = (CharSequence) m127131A09.get(i16 + 2);
                                char[] cArr3 = new char[1];
                                cArr3[i12] = c12;
                                m127131A011 = AbstractC24342w.m127131A0(charSequence2, cArr3, false, 0, 6, null);
                                List list4 = m127131A011;
                                m131511r2 = AbstractC25370t.m131511r(list4, 10);
                                ArrayList arrayList5 = new ArrayList(m131511r2);
                                Iterator it6 = list4.iterator();
                                while (it6.hasNext()) {
                                    arrayList5.add(Integer.valueOf(Integer.parseInt((String) it6.next())));
                                }
                                m131184L02 = AbstractC25332a0.m131184L0(arrayList5);
                                iArr[i16] = m131184L02;
                                i16++;
                                i12 = 0;
                                c12 = 8207;
                            }
                            this.f135474f.add(new i((int[]) c19059j02.f94941p, iArr));
                            i12 = 0;
                            c11 = 8206;
                            i13 = 2;
                        } else {
                            throw new IllegalArgumentException("Can not resolve pattern data, fields size < 2");
                        }
                    }
                    this.f135475g.clear();
                    for (i iVar : this.f135474f) {
                        this.f135475g.put(iVar, iVar);
                    }
                    HashMap hashMap = new HashMap();
                    Iterator it7 = m127131A05.iterator();
                    while (it7.hasNext()) {
                        m127131A08 = AbstractC24342w.m127131A0((String) it7.next(), new char[]{8206}, false, 0, 6, null);
                        if (m127131A08.size() >= 3) {
                            int parseInt2 = Integer.parseInt((String) m127131A08.get(1));
                            hashMap.put(Integer.valueOf(parseInt2), new e(parseInt2, (String) m127131A08.get(0), (String) m127131A08.get(2)));
                        } else {
                            throw new IllegalArgumentException("Can not resolve variant config data (label name), fields.size < 3");
                        }
                    }
                    Iterator it8 = m127131A06.iterator();
                    while (it8.hasNext()) {
                        m127131A07 = AbstractC24342w.m127131A0((String) it8.next(), new char[]{8206}, false, 0, 6, null);
                        if (m127131A07.size() >= 4) {
                            int parseInt3 = Integer.parseInt((String) m127131A07.get(1));
                            int parseInt4 = Integer.parseInt((String) m127131A07.get(2));
                            Iterator it9 = this.f135473e.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    obj = it9.next();
                                    int[] iArr2 = (int[]) obj;
                                    if (iArr2.length > 2 && parseInt3 >= iArr2[1] && parseInt3 <= iArr2[2]) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            int[] iArr3 = (int[]) obj;
                            if (iArr3 != null) {
                                c19059j0.f94941p = iArr3;
                                Object obj2 = arrayList2.get(parseInt4);
                                int parseInt5 = Integer.parseInt((String) m127131A07.get(3));
                                List list5 = this.f135472d;
                                String str13 = (String) m127131A07.get(0);
                                float f11 = 1.0f / parseInt5;
                                if (parseInt3 != 0) {
                                    eVar = (e) hashMap.get(Integer.valueOf(parseInt3));
                                } else {
                                    eVar = null;
                                }
                                list5.add(new d(str13, f11, parseInt3, eVar, (int[]) obj2, (int[]) c19059j0.f94941p));
                            } else {
                                throw new IllegalArgumentException("Could not find label class for label " + parseInt3);
                            }
                        } else {
                            throw new IllegalArgumentException("Can not resolve variant config data, fields.size < 4");
                        }
                    }
                    C19059j0 c19059j03 = new C19059j0();
                    c19059j03.f94941p = this.f135471c;
                    for (d dVar : this.f135472d) {
                        int length = dVar.m146063a().length();
                        String m146063a = dVar.m146063a();
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < m146063a.length()) {
                            char charAt = m146063a.charAt(i17);
                            int i19 = i18 + 1;
                            h hVar = (h) ((h) c19059j03.f94941p).m146075a().get(Character.valueOf(charAt));
                            if (hVar == null) {
                                h hVar2 = new h(charAt, null, null, 6, null);
                                ((h) c19059j03.f94941p).m146075a().put(Character.valueOf(charAt), hVar2);
                                hVar = hVar2;
                            }
                            c19059j03.f94941p = hVar;
                            if (i18 == length - 1) {
                                hVar.m146077c(dVar);
                            }
                            i17++;
                            i18 = i19;
                        }
                        c19059j03.f94941p = this.f135471c;
                    }
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Can not resolve config data, headers.size < 4");
        }
    }

    /* renamed from: i */
    public final List m146055i(String str) {
        AbstractC19074t.m100208f(str, "text");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m146056j(str, arrayList, arrayList2);
        return arrayList2;
    }

    /* renamed from: j */
    public final void m146056j(String str, List list, List list2) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19074t.m100208f(list, "matchList");
        AbstractC19074t.m100208f(list2, "output");
        C23111j6 m117991m = C23013a7.m117991m(str, 16);
        String[] m118488a = m117991m.m118488a();
        AbstractC19074t.m100206d(m117991m, "null cannot be cast to non-null type com.zing.zalo.utils.PreProcessingOffsetOutput");
        int[] m118478b = ((C23100i6) m117991m).m118478b();
        int length = m118488a.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = 0;
        }
        m146051e(str, m118488a, m118478b, iArr, list);
        m146053h(str, m118488a, m118478b, iArr, list, list2);
    }

    /* renamed from: k */
    public final void m146057k(int i11) {
        this.f135470b = i11;
    }

    /* renamed from: l */
    public final void m146058l(int i11) {
        this.f135469a = i11;
    }
}
