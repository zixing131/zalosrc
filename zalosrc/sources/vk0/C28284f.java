package vk0;

import fn0.AbstractC19060k;
import ho0.AbstractC20110a;

/* renamed from: vk0.f */
/* loaded from: classes7.dex */
public final class C28284f {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static boolean f131964c;

    /* renamed from: a */
    private final int f131965a;

    /* renamed from: b */
    private final String f131966b;

    /* renamed from: vk0.f$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C28284f(int i11, String str) {
        this.f131965a = i11;
        this.f131966b = str;
        if (f131964c) {
            AbstractC20110a.f98889a.m104564x("Zinstant - Exception").mo104548a(toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    public final int m142528a() {
        return this.f131965a;
    }

    /* renamed from: b */
    public final String m142529b() {
        return this.f131966b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("code(");
        sb2.append(this.f131965a);
        sb2.append(") - msg(");
        String str = this.f131966b;
        if (str == null) {
            str = "";
        }
        sb2.append(str);
        sb2.append(')');
        return sb2.toString();
    }
}
