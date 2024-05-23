package y50;

import android.text.Spanned;
import android.text.style.ReplacementSpan;
import android.text.style.URLSpan;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import pm0.C24860q;
import pm0.C24865v;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import sm0.AbstractC26327c;

/* renamed from: y50.f */
/* loaded from: classes5.dex */
public final class C30796f {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private CharSequence f142150a;

    /* renamed from: b */
    private int f142151b;

    /* renamed from: c */
    private int f142152c;

    /* renamed from: d */
    private int f142153d;

    /* renamed from: e */
    private final List f142154e;

    /* renamed from: f */
    private final List f142155f;

    /* renamed from: y50.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: y50.f$b */
    /* loaded from: classes5.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b((Integer) ((C24860q) obj).m129215c(), (Integer) ((C24860q) obj2).m129215c());
            return m135478b;
        }
    }

    public C30796f(CharSequence charSequence) {
        List m131505m;
        List m131187O0;
        AbstractC19074t.m100208f(charSequence, "text");
        this.f142150a = charSequence;
        this.f142151b = -1;
        this.f142152c = -1;
        this.f142153d = charSequence.length();
        m131505m = AbstractC25368s.m131505m(URLSpan.class, ReplacementSpan.class);
        this.f142154e = m131505m;
        m131187O0 = AbstractC25332a0.m131187O0(m149826k(charSequence));
        this.f142155f = m131187O0;
    }

    /* renamed from: a */
    private final int m149819a(int i11) {
        return Math.max(0, Math.min(i11, this.f142153d));
    }

    /* renamed from: b */
    private final C24860q m149820b(int i11) {
        int i12;
        int i13;
        C24865v m149822d = m149822d(i11);
        int intValue = ((Number) m149822d.m129230b()).intValue();
        int intValue2 = ((Number) m149822d.m129231c()).intValue();
        if (intValue >= 0 && intValue < this.f142155f.size()) {
            i12 = ((Number) ((C24860q) this.f142155f.get(intValue)).m129216d()).intValue();
        } else {
            i12 = 0;
        }
        if (intValue2 >= 0 && intValue2 < this.f142155f.size()) {
            i13 = ((Number) ((C24860q) this.f142155f.get(intValue2)).m129215c()).intValue();
        } else {
            i13 = this.f142153d;
        }
        return new C24860q(Integer.valueOf(i12), Integer.valueOf(i13));
    }

    /* renamed from: c */
    private final C24860q m149821c(int i11) {
        int intValue = ((Number) m149822d(i11).m129229a()).intValue();
        if (intValue != -1) {
            return (C24860q) this.f142155f.get(intValue);
        }
        int m149823e = m149823e(i11);
        C24860q m149825h = m149825h(i11);
        int intValue2 = ((Number) m149825h.m129213a()).intValue();
        int intValue3 = ((Number) m149825h.m129214b()).intValue();
        if (m149828n(m149823e)) {
            return new C24860q(Integer.valueOf(intValue2), Integer.valueOf(intValue3));
        }
        C24860q m149820b = m149820b(i11);
        int intValue4 = ((Number) m149820b.m129213a()).intValue();
        int intValue5 = ((Number) m149820b.m129214b()).intValue();
        return new C24860q(Integer.valueOf(m149827l(intValue2, intValue4)), Integer.valueOf(m149824f(intValue3, intValue5)));
    }

    /* renamed from: d */
    private final C24865v m149822d(int i11) {
        int size = this.f142155f.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = ((size - i12) / 2) + i12;
            C24860q c24860q = (C24860q) this.f142155f.get(i13);
            if (i11 >= ((Number) c24860q.m129215c()).intValue() && i11 <= ((Number) c24860q.m129216d()).intValue()) {
                return new C24865v(Integer.valueOf(i13), Integer.valueOf(i13 - 1), Integer.valueOf(i13 + 1));
            }
            if (i11 < ((Number) c24860q.m129215c()).intValue()) {
                size = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return new C24865v(-1, Integer.valueOf(size), Integer.valueOf(i12));
    }

    /* renamed from: e */
    private final int m149823e(int i11) {
        if (i11 == this.f142150a.length()) {
            return Character.codePointBefore(this.f142150a, i11);
        }
        return Character.codePointAt(this.f142150a, i11);
    }

    /* renamed from: f */
    private final int m149824f(int i11, int i12) {
        while (i11 < Math.min(this.f142153d, i12)) {
            int codePointAt = Character.codePointAt(this.f142150a, i11);
            if (m149828n(codePointAt)) {
                break;
            }
            i11 += Character.charCount(codePointAt);
        }
        return i11;
    }

    /* renamed from: h */
    private final C24860q m149825h(int i11) {
        if (i11 == this.f142150a.length()) {
            return new C24860q(Integer.valueOf(i11 - Character.charCount(Character.codePointBefore(this.f142150a, i11))), Integer.valueOf(i11));
        }
        return new C24860q(Integer.valueOf(i11), Integer.valueOf(i11 + Character.charCount(Character.codePointAt(this.f142150a, i11))));
    }

    /* renamed from: k */
    private final List m149826k(CharSequence charSequence) {
        List m131502j;
        int m131511r;
        List m131177E0;
        if (!(charSequence instanceof Spanned)) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        Object[] spans = ((Spanned) charSequence).getSpans(0, charSequence.length(), Object.class);
        AbstractC19074t.m100207e(spans, "getSpans(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            List list = this.f142154e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Class) it.next()).isInstance(obj)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        for (Object obj2 : arrayList) {
            Spanned spanned = (Spanned) charSequence;
            arrayList2.add(new C24860q(Integer.valueOf(spanned.getSpanStart(obj2)), Integer.valueOf(spanned.getSpanEnd(obj2))));
        }
        m131177E0 = AbstractC25332a0.m131177E0(arrayList2, new b());
        return m131177E0;
    }

    /* renamed from: l */
    private final int m149827l(int i11, int i12) {
        while (i11 > Math.max(0, i12)) {
            int codePointBefore = Character.codePointBefore(this.f142150a, i11);
            if (m149828n(codePointBefore)) {
                break;
            }
            i11 -= Character.charCount(codePointBefore);
        }
        return i11;
    }

    /* renamed from: n */
    private final boolean m149828n(int i11) {
        boolean z11;
        boolean z12;
        if (!Character.isLetter(i11) && !Character.isDigit(i11) && i11 != 95) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i11 >= 768 && i11 <= 879) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 && !z12) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final int m149829q(int i11) {
        int intValue = ((Number) m149822d(i11).m129229a()).intValue();
        if (intValue != -1 && i11 != ((Number) ((C24860q) this.f142155f.get(intValue)).m129215c()).intValue()) {
            return ((Number) ((C24860q) this.f142155f.get(intValue)).m129216d()).intValue();
        }
        return i11;
    }

    /* renamed from: g */
    public final int m149830g() {
        return this.f142153d;
    }

    /* renamed from: i */
    public final int m149831i() {
        return this.f142152c;
    }

    /* renamed from: j */
    public final int m149832j() {
        return this.f142151b;
    }

    /* renamed from: m */
    public final CharSequence m149833m() {
        return this.f142150a;
    }

    /* renamed from: o */
    public final void m149834o(int i11, boolean z11) {
        int m149819a = m149819a(i11);
        if (z11) {
            m149819a = m149829q(m149819a);
        }
        if (m149819a != this.f142151b) {
            this.f142152c = m149819a;
        }
    }

    /* renamed from: p */
    public final void m149835p(int i11, boolean z11) {
        int m149819a = m149819a(i11);
        if (z11) {
            m149819a = m149829q(m149819a);
        }
        if (m149819a != this.f142152c) {
            this.f142151b = m149819a;
        }
    }

    /* renamed from: r */
    public final void m149836r(int i11) {
        this.f142153d = Math.max(1, Math.min(i11, this.f142150a.length()));
    }

    /* renamed from: s */
    public final void m149837s(int i11) {
        C24860q m149821c = m149821c(m149819a(i11));
        this.f142151b = ((Number) m149821c.m129215c()).intValue();
        this.f142152c = ((Number) m149821c.m129216d()).intValue();
    }

    /* renamed from: t */
    public final void m149838t(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "msg");
        this.f142150a = charSequence;
        this.f142155f.clear();
        this.f142155f.addAll(m149826k(this.f142150a));
    }

    /* renamed from: u */
    public final void m149839u() {
        int i11 = this.f142151b;
        this.f142151b = this.f142152c;
        this.f142152c = i11;
    }
}
