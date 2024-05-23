package androidx.core.text;

import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.Locale;

/* renamed from: androidx.core.text.p */
/* loaded from: classes2.dex */
public abstract class AbstractC1477p {

    /* renamed from: a */
    public static final InterfaceC1476o f6359a = new e(null, false);

    /* renamed from: b */
    public static final InterfaceC1476o f6360b = new e(null, true);

    /* renamed from: c */
    public static final InterfaceC1476o f6361c;

    /* renamed from: d */
    public static final InterfaceC1476o f6362d;

    /* renamed from: e */
    public static final InterfaceC1476o f6363e;

    /* renamed from: f */
    public static final InterfaceC1476o f6364f;

    /* renamed from: androidx.core.text.p$a */
    /* loaded from: classes2.dex */
    private static class a implements c {

        /* renamed from: b */
        static final a f6365b = new a(true);

        /* renamed from: a */
        private final boolean f6366a;

        private a(boolean z11) {
            this.f6366a = z11;
        }

        @Override // androidx.core.text.AbstractC1477p.c
        /* renamed from: a */
        public int mo7468a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            boolean z11 = false;
            while (i11 < i13) {
                int m7466a = AbstractC1477p.m7466a(Character.getDirectionality(charSequence.charAt(i11)));
                if (m7466a != 0) {
                    if (m7466a == 1) {
                        if (!this.f6366a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i11++;
                    }
                } else if (this.f6366a) {
                    return 0;
                }
                z11 = true;
                i11++;
            }
            if (z11) {
                return this.f6366a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.p$b */
    /* loaded from: classes2.dex */
    private static class b implements c {

        /* renamed from: a */
        static final b f6367a = new b();

        private b() {
        }

        @Override // androidx.core.text.AbstractC1477p.c
        /* renamed from: a */
        public int mo7468a(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            int i14 = 2;
            while (i11 < i13 && i14 == 2) {
                i14 = AbstractC1477p.m7467b(Character.getDirectionality(charSequence.charAt(i11)));
                i11++;
            }
            return i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.p$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        int mo7468a(CharSequence charSequence, int i11, int i12);
    }

    /* renamed from: androidx.core.text.p$d */
    /* loaded from: classes2.dex */
    private static abstract class d implements InterfaceC1476o {

        /* renamed from: a */
        private final c f6368a;

        d(c cVar) {
            this.f6368a = cVar;
        }

        /* renamed from: c */
        private boolean m7469c(CharSequence charSequence, int i11, int i12) {
            int mo7468a = this.f6368a.mo7468a(charSequence, i11, i12);
            if (mo7468a == 0) {
                return true;
            }
            if (mo7468a != 1) {
                return mo7470b();
            }
            return false;
        }

        @Override // androidx.core.text.InterfaceC1476o
        /* renamed from: a */
        public boolean mo7465a(CharSequence charSequence, int i11, int i12) {
            if (charSequence != null && i11 >= 0 && i12 >= 0 && charSequence.length() - i12 >= i11) {
                if (this.f6368a == null) {
                    return mo7470b();
                }
                return m7469c(charSequence, i11, i12);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        protected abstract boolean mo7470b();
    }

    /* renamed from: androidx.core.text.p$e */
    /* loaded from: classes2.dex */
    private static class e extends d {

        /* renamed from: b */
        private final boolean f6369b;

        e(c cVar, boolean z11) {
            super(cVar);
            this.f6369b = z11;
        }

        @Override // androidx.core.text.AbstractC1477p.d
        /* renamed from: b */
        protected boolean mo7470b() {
            return this.f6369b;
        }
    }

    /* renamed from: androidx.core.text.p$f */
    /* loaded from: classes2.dex */
    private static class f extends d {

        /* renamed from: b */
        static final f f6370b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.AbstractC1477p.d
        /* renamed from: b */
        protected boolean mo7470b() {
            if (AbstractC1478q.m7471a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.f6367a;
        f6361c = new e(bVar, false);
        f6362d = new e(bVar, true);
        f6363e = new e(a.f6365b, false);
        f6364f = f.f6370b;
    }

    /* renamed from: a */
    static int m7466a(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m7467b(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                return 0;
            }
            switch (i11) {
                case 14:
                case 15:
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
