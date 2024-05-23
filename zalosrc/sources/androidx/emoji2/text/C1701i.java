package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.emoji2.text.C1698f;
import androidx.emoji2.text.C1706n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.emoji2.text.i */
/* loaded from: classes2.dex */
public final class C1701i {

    /* renamed from: a */
    private final C1698f.j f6851a;

    /* renamed from: b */
    private final C1706n f6852b;

    /* renamed from: c */
    private C1698f.e f6853c;

    /* renamed from: d */
    private final boolean f6854d;

    /* renamed from: e */
    private final int[] f6855e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.i$a */
    /* loaded from: classes2.dex */
    public static class a implements b {

        /* renamed from: a */
        public C1712t f6856a;

        /* renamed from: b */
        private final C1698f.j f6857b;

        a(C1712t c1712t, C1698f.j jVar) {
            this.f6856a = c1712t;
            this.f6857b = jVar;
        }

        @Override // androidx.emoji2.text.C1701i.b
        /* renamed from: b */
        public boolean mo8714b(CharSequence charSequence, int i11, int i12, C1708p c1708p) {
            Spannable spannableString;
            if (c1708p.m8764k()) {
                return true;
            }
            if (this.f6856a == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.f6856a = new C1712t(spannableString);
            }
            this.f6856a.setSpan(this.f6857b.mo8703a(c1708p), i11, i12, 33);
            return true;
        }

        @Override // androidx.emoji2.text.C1701i.b
        /* renamed from: c */
        public C1712t mo8713a() {
            return this.f6856a;
        }
    }

    /* renamed from: androidx.emoji2.text.i$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        Object mo8713a();

        /* renamed from: b */
        boolean mo8714b(CharSequence charSequence, int i11, int i12, C1708p c1708p);
    }

    /* renamed from: androidx.emoji2.text.i$c */
    /* loaded from: classes2.dex */
    public static class c implements b {

        /* renamed from: a */
        private final String f6858a;

        c(String str) {
            this.f6858a = str;
        }

        @Override // androidx.emoji2.text.C1701i.b
        /* renamed from: b */
        public boolean mo8714b(CharSequence charSequence, int i11, int i12, C1708p c1708p) {
            if (!TextUtils.equals(charSequence.subSequence(i11, i12), this.f6858a)) {
                return true;
            }
            c1708p.m8765l(true);
            return false;
        }

        @Override // androidx.emoji2.text.C1701i.b
        /* renamed from: c */
        public c mo8713a() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.i$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private int f6859a = 1;

        /* renamed from: b */
        private final C1706n.a f6860b;

        /* renamed from: c */
        private C1706n.a f6861c;

        /* renamed from: d */
        private C1706n.a f6862d;

        /* renamed from: e */
        private int f6863e;

        /* renamed from: f */
        private int f6864f;

        /* renamed from: g */
        private final boolean f6865g;

        /* renamed from: h */
        private final int[] f6866h;

        d(C1706n.a aVar, boolean z11, int[] iArr) {
            this.f6860b = aVar;
            this.f6861c = aVar;
            this.f6865g = z11;
            this.f6866h = iArr;
        }

        /* renamed from: d */
        private static boolean m8717d(int i11) {
            return i11 == 65039;
        }

        /* renamed from: f */
        private static boolean m8718f(int i11) {
            return i11 == 65038;
        }

        /* renamed from: g */
        private int m8719g() {
            this.f6859a = 1;
            this.f6861c = this.f6860b;
            this.f6864f = 0;
            return 1;
        }

        /* renamed from: h */
        private boolean m8720h() {
            if (this.f6861c.m8752b().m8763j() || m8717d(this.f6863e)) {
                return true;
            }
            if (this.f6865g) {
                if (this.f6866h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f6866h, this.f6861c.m8752b().m8756b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        int m8721a(int i11) {
            C1706n.a m8751a = this.f6861c.m8751a(i11);
            int i12 = 2;
            if (this.f6859a != 2) {
                if (m8751a == null) {
                    i12 = m8719g();
                } else {
                    this.f6859a = 2;
                    this.f6861c = m8751a;
                    this.f6864f = 1;
                }
            } else if (m8751a != null) {
                this.f6861c = m8751a;
                this.f6864f++;
            } else if (m8718f(i11)) {
                i12 = m8719g();
            } else if (!m8717d(i11)) {
                if (this.f6861c.m8752b() != null) {
                    i12 = 3;
                    if (this.f6864f == 1) {
                        if (m8720h()) {
                            this.f6862d = this.f6861c;
                            m8719g();
                        } else {
                            i12 = m8719g();
                        }
                    } else {
                        this.f6862d = this.f6861c;
                        m8719g();
                    }
                } else {
                    i12 = m8719g();
                }
            }
            this.f6863e = i11;
            return i12;
        }

        /* renamed from: b */
        C1708p m8722b() {
            return this.f6861c.m8752b();
        }

        /* renamed from: c */
        C1708p m8723c() {
            return this.f6862d.m8752b();
        }

        /* renamed from: e */
        boolean m8724e() {
            if (this.f6859a == 2 && this.f6861c.m8752b() != null && (this.f6864f > 1 || m8720h())) {
                return true;
            }
            return false;
        }
    }

    public C1701i(C1706n c1706n, C1698f.j jVar, C1698f.e eVar, boolean z11, int[] iArr, Set set) {
        this.f6851a = jVar;
        this.f6852b = c1706n;
        this.f6853c = eVar;
        this.f6854d = z11;
        this.f6855e = iArr;
        m8710b(set);
    }

    /* renamed from: a */
    private boolean m8709a(CharSequence charSequence, int i11, int i12, C1708p c1708p) {
        if (c1708p.m8758d() == 0) {
            c1708p.m8766m(this.f6853c.mo8676a(charSequence, i11, i12, c1708p.m8761h()));
        }
        if (c1708p.m8758d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m8710b(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m8711d(str, 0, str.length(), 1, true, new c(str));
        }
    }

    /* renamed from: d */
    private Object m8711d(CharSequence charSequence, int i11, int i12, int i13, boolean z11, b bVar) {
        int i14;
        d dVar = new d(this.f6852b.m8748e(), this.f6854d, this.f6855e);
        int codePointAt = Character.codePointAt(charSequence, i11);
        int i15 = 0;
        boolean z12 = true;
        loop0: while (true) {
            i14 = i11;
            while (i11 < i12 && i15 < i13 && z12) {
                int m8721a = dVar.m8721a(codePointAt);
                if (m8721a != 1) {
                    if (m8721a != 2) {
                        if (m8721a == 3) {
                            if (z11 || !m8709a(charSequence, i14, i11, dVar.m8723c())) {
                                z12 = bVar.mo8714b(charSequence, i14, i11, dVar.m8723c());
                                i15++;
                            }
                        }
                    } else {
                        i11 += Character.charCount(codePointAt);
                        if (i11 < i12) {
                            codePointAt = Character.codePointAt(charSequence, i11);
                        }
                    }
                } else {
                    i14 += Character.charCount(Character.codePointAt(charSequence, i14));
                    if (i14 < i12) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                    i11 = i14;
                }
            }
        }
        if (dVar.m8724e() && i15 < i13 && z12 && (z11 || !m8709a(charSequence, i14, i11, dVar.m8722b()))) {
            bVar.mo8714b(charSequence, i14, i11, dVar.m8722b());
        }
        return bVar.mo8713a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:60:0x0011, B:63:0x0016, B:65:0x001a, B:67:0x0027, B:8:0x003e, B:10:0x0046, B:12:0x0049, B:14:0x004d, B:16:0x0059, B:18:0x005c, B:23:0x006a, B:28:0x0079, B:29:0x0089, B:5:0x0033), top: B:59:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CharSequence m8712c(CharSequence charSequence, int i11, int i12, int i13, boolean z11) {
        C1712t c1712t;
        int i14;
        int i15;
        AbstractC1702j[] abstractC1702jArr;
        int i16 = i11;
        int i17 = i12;
        boolean z12 = charSequence instanceof AbstractC1707o;
        if (!z12) {
            if (!z12) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i16 - 1, i17 + 1, AbstractC1702j.class) <= i17) {
                            c1712t = new C1712t(charSequence);
                        } else {
                            c1712t = null;
                        }
                        if (c1712t != null && (abstractC1702jArr = (AbstractC1702j[]) c1712t.getSpans(i16, i17, AbstractC1702j.class)) != null && abstractC1702jArr.length > 0) {
                            for (AbstractC1702j abstractC1702j : abstractC1702jArr) {
                                int spanStart = c1712t.getSpanStart(abstractC1702j);
                                int spanEnd = c1712t.getSpanEnd(abstractC1702j);
                                if (spanStart != i17) {
                                    c1712t.removeSpan(abstractC1702j);
                                }
                                i16 = Math.min(spanStart, i16);
                                i17 = Math.max(spanEnd, i17);
                            }
                        }
                        i14 = i17;
                        if (i16 == i14 && i16 < charSequence.length()) {
                            if (i13 != Integer.MAX_VALUE && c1712t != null) {
                                i15 = i13 - ((AbstractC1702j[]) c1712t.getSpans(0, c1712t.length(), AbstractC1702j.class)).length;
                            } else {
                                i15 = i13;
                            }
                            try {
                                C1712t c1712t2 = (C1712t) m8711d(charSequence, i16, i14, i15, z11, new a(c1712t, this.f6851a));
                                if (c1712t2 != null) {
                                    Spannable m8774b = c1712t2.m8774b();
                                    if (!z12) {
                                        return m8774b;
                                    }
                                    throw null;
                                }
                                if (!z12) {
                                    return charSequence;
                                }
                                throw null;
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z12) {
                                    throw null;
                                }
                                throw th;
                            }
                        }
                        if (z12) {
                            return charSequence;
                        }
                        throw null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (!z12) {
                    }
                }
            }
            c1712t = new C1712t((Spannable) charSequence);
            if (c1712t != null) {
                while (r11 < r7) {
                }
            }
            i14 = i17;
            if (i16 == i14) {
            }
            if (z12) {
            }
        } else {
            throw null;
        }
    }
}
