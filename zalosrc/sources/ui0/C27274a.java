package ui0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.Arrays;

/* renamed from: ui0.a */
/* loaded from: classes7.dex */
public final class C27274a {

    /* renamed from: a */
    public static final C27274a f128311a = new C27274a();

    /* renamed from: b */
    private static final InterfaceC18505l f128312b = a.f128314q;

    /* renamed from: c */
    private static final InterfaceC18505l f128313c = b.f128315q;

    /* renamed from: ui0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f128314q = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final String m139637a(int i11) {
            if (i11 > 99) {
                return "99+";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('+');
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            AbstractC19074t.m100207e(format, "format(format, *args)");
            sb2.append(format);
            return sb2.toString();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m139637a(((Number) obj).intValue());
        }
    }

    /* renamed from: ui0.a$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f128315q = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final String m139638a(int i11) {
            if (i11 > 99) {
                return "99+";
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
            AbstractC19074t.m100207e(format, "format(format, *args)");
            return format;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m139638a(((Number) obj).intValue());
        }
    }

    private C27274a() {
    }

    /* renamed from: a */
    public final int m139633a(String str) {
        AbstractC19074t.m100208f(str, "totalString");
        if (AbstractC19074t.m100204b(str, "99+")) {
            return 150;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            AbstractC20110a.m104538g("Load avatar group with param invalid " + str, new Object[0]);
            return 3;
        }
    }

    /* renamed from: b */
    public final InterfaceC18505l m139634b() {
        return f128312b;
    }

    /* renamed from: c */
    public final InterfaceC18505l m139635c() {
        return f128313c;
    }

    /* renamed from: d */
    public final String m139636d(int i11, InterfaceC18505l interfaceC18505l) {
        if (interfaceC18505l != null) {
            return (String) interfaceC18505l.mo205i9(Integer.valueOf(i11));
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("%d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        AbstractC19074t.m100207e(format, "format(format, *args)");
        return format;
    }
}
