package p211hi;

import fn0.AbstractC19074t;
import gi.EnumC19450c;
import java.util.List;
import p471r3.C25630b;
import p716zh.C31902e9;

/* renamed from: hi.a */
/* loaded from: classes3.dex */
public final class C20067a {

    /* renamed from: a */
    public static final C20067a f98679a = new C20067a();

    /* renamed from: hi.a$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f98680a;

        static {
            int[] iArr = new int[EnumC19450c.values().length];
            try {
                iArr[EnumC19450c.f96558u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC19450c.f96554q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC19450c.f96556s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC19450c.f96557t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC19450c.f96562y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC19450c.f96555r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f98680a = iArr;
        }
    }

    private C20067a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[ORIG_RETURN, RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m104308a(EnumC19450c enumC19450c, List list) {
        AbstractC19074t.m100208f(enumC19450c, "suggestType");
        AbstractC19074t.m100208f(list, "results");
        switch (a.f98680a[enumC19450c.ordinal()]) {
            case 1:
                if (f98679a.m104309b(list)) {
                    return 5;
                }
                if (m104310c(list, 0)) {
                    return 2;
                }
                if (m104310c(list, 1)) {
                    return 3;
                }
                if (m104310c(list, 7)) {
                    return 6;
                }
                return 0;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (m104310c(list, 4)) {
                    return 7;
                }
                if (f98679a.m104309b(list) || m104310c(list, 1)) {
                    return 4;
                }
                break;
        }
    }

    /* renamed from: b */
    private final boolean m104309b(List list) {
        if (list.size() <= 1) {
            return false;
        }
        int m153322n = ((C31902e9) list.get(0)).m153322n();
        int size = list.size();
        for (int i11 = 1; i11 < size; i11++) {
            C31902e9 c31902e9 = (C31902e9) list.get(i11);
            C25630b m153321m = c31902e9.m153321m();
            if ((m153321m == null || m153321m.m132429g() != -100) && c31902e9.m153322n() != -102 && ((C31902e9) list.get(i11)).m153322n() != m153322n) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m104310c(List list, int i11) {
        C25630b m153321m;
        AbstractC19074t.m100208f(list, "searchInlineResults");
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            C31902e9 c31902e9 = (C31902e9) list.get(i12);
            if (c31902e9.m153322n() != i11 && (((m153321m = c31902e9.m153321m()) == null || m153321m.m132429g() != -100) && c31902e9.m153322n() != -102)) {
                return false;
            }
        }
        return true;
    }
}
