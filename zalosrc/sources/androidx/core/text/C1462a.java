package androidx.core.text;

import android.text.SpannableStringBuilder;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.Locale;

/* renamed from: androidx.core.text.a */
/* loaded from: classes2.dex */
public final class C1462a {

    /* renamed from: d */
    static final InterfaceC1476o f6333d;

    /* renamed from: e */
    private static final String f6334e;

    /* renamed from: f */
    private static final String f6335f;

    /* renamed from: g */
    static final C1462a f6336g;

    /* renamed from: h */
    static final C1462a f6337h;

    /* renamed from: a */
    private final boolean f6338a;

    /* renamed from: b */
    private final int f6339b;

    /* renamed from: c */
    private final InterfaceC1476o f6340c;

    /* renamed from: androidx.core.text.a$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f6341a;

        /* renamed from: b */
        private int f6342b;

        /* renamed from: c */
        private InterfaceC1476o f6343c;

        public a() {
            m7429c(C1462a.m7420e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C1462a m7428b(boolean z11) {
            if (z11) {
                return C1462a.f6337h;
            }
            return C1462a.f6336g;
        }

        /* renamed from: c */
        private void m7429c(boolean z11) {
            this.f6341a = z11;
            this.f6343c = C1462a.f6333d;
            this.f6342b = 2;
        }

        /* renamed from: a */
        public C1462a m7430a() {
            if (this.f6342b == 2 && this.f6343c == C1462a.f6333d) {
                return m7428b(this.f6341a);
            }
            return new C1462a(this.f6341a, this.f6342b, this.f6343c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.a$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: f */
        private static final byte[] f6344f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f6345a;

        /* renamed from: b */
        private final boolean f6346b;

        /* renamed from: c */
        private final int f6347c;

        /* renamed from: d */
        private int f6348d;

        /* renamed from: e */
        private char f6349e;

        static {
            for (int i11 = 0; i11 < 1792; i11++) {
                f6344f[i11] = Character.getDirectionality(i11);
            }
        }

        b(CharSequence charSequence, boolean z11) {
            this.f6345a = charSequence;
            this.f6346b = z11;
            this.f6347c = charSequence.length();
        }

        /* renamed from: c */
        private static byte m7431c(char c11) {
            if (c11 < 1792) {
                return f6344f[c11];
            }
            return Character.getDirectionality(c11);
        }

        /* renamed from: f */
        private byte m7432f() {
            char charAt;
            int i11 = this.f6348d;
            do {
                int i12 = this.f6348d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f6345a;
                int i13 = i12 - 1;
                this.f6348d = i13;
                charAt = charSequence.charAt(i13);
                this.f6349e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f6348d = i11;
            this.f6349e = ';';
            return (byte) 13;
        }

        /* renamed from: g */
        private byte m7433g() {
            char charAt;
            do {
                int i11 = this.f6348d;
                if (i11 < this.f6347c) {
                    CharSequence charSequence = this.f6345a;
                    this.f6348d = i11 + 1;
                    charAt = charSequence.charAt(i11);
                    this.f6349e = charAt;
                } else {
                    return (byte) 12;
                }
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: h */
        private byte m7434h() {
            char charAt;
            int i11 = this.f6348d;
            while (true) {
                int i12 = this.f6348d;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f6345a;
                int i13 = i12 - 1;
                this.f6348d = i13;
                char charAt2 = charSequence.charAt(i13);
                this.f6349e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i14 = this.f6348d;
                        if (i14 > 0) {
                            CharSequence charSequence2 = this.f6345a;
                            int i15 = i14 - 1;
                            this.f6348d = i15;
                            charAt = charSequence2.charAt(i15);
                            this.f6349e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f6348d = i11;
            this.f6349e = '>';
            return (byte) 13;
        }

        /* renamed from: i */
        private byte m7435i() {
            char charAt;
            int i11 = this.f6348d;
            while (true) {
                int i12 = this.f6348d;
                if (i12 < this.f6347c) {
                    CharSequence charSequence = this.f6345a;
                    this.f6348d = i12 + 1;
                    char charAt2 = charSequence.charAt(i12);
                    this.f6349e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i13 = this.f6348d;
                            if (i13 < this.f6347c) {
                                CharSequence charSequence2 = this.f6345a;
                                this.f6348d = i13 + 1;
                                charAt = charSequence2.charAt(i13);
                                this.f6349e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f6348d = i11;
                    this.f6349e = '<';
                    return (byte) 13;
                }
            }
        }

        /* renamed from: a */
        byte m7436a() {
            char charAt = this.f6345a.charAt(this.f6348d - 1);
            this.f6349e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f6345a, this.f6348d);
                this.f6348d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f6348d--;
            byte m7431c = m7431c(this.f6349e);
            if (this.f6346b) {
                char c11 = this.f6349e;
                if (c11 == '>') {
                    return m7434h();
                }
                if (c11 == ';') {
                    return m7432f();
                }
                return m7431c;
            }
            return m7431c;
        }

        /* renamed from: b */
        byte m7437b() {
            char charAt = this.f6345a.charAt(this.f6348d);
            this.f6349e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f6345a, this.f6348d);
                this.f6348d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f6348d++;
            byte m7431c = m7431c(this.f6349e);
            if (this.f6346b) {
                char c11 = this.f6349e;
                if (c11 == '<') {
                    return m7435i();
                }
                if (c11 == '&') {
                    return m7433g();
                }
                return m7431c;
            }
            return m7431c;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:46:0x0045. Please report as an issue. */
        /* renamed from: d */
        int m7438d() {
            this.f6348d = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (this.f6348d < this.f6347c && i11 == 0) {
                byte m7437b = m7437b();
                if (m7437b != 0) {
                    if (m7437b != 1 && m7437b != 2) {
                        if (m7437b != 9) {
                            switch (m7437b) {
                                case 14:
                                case 15:
                                    i13++;
                                    i12 = -1;
                                    continue;
                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                case 17:
                                    i13++;
                                    i12 = 1;
                                    continue;
                                case 18:
                                    i13--;
                                    i12 = 0;
                                    continue;
                            }
                        }
                    } else if (i13 == 0) {
                        return 1;
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
            if (i11 == 0) {
                return 0;
            }
            if (i12 != 0) {
                return i12;
            }
            while (this.f6348d > 0) {
                switch (m7436a()) {
                    case 14:
                    case 15:
                        if (i11 == i13) {
                            return -1;
                        }
                        i13--;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    case 17:
                        if (i11 == i13) {
                            return 1;
                        }
                        i13--;
                    case 18:
                        i13++;
                }
            }
            return 0;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:33:0x001c. Please report as an issue. */
        /* renamed from: e */
        int m7439e() {
            this.f6348d = this.f6347c;
            int i11 = 0;
            int i12 = 0;
            while (this.f6348d > 0) {
                byte m7436a = m7436a();
                if (m7436a != 0) {
                    if (m7436a != 1 && m7436a != 2) {
                        if (m7436a != 9) {
                            switch (m7436a) {
                                case 14:
                                case 15:
                                    if (i12 == i11) {
                                        return -1;
                                    }
                                    i11--;
                                    break;
                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                case 17:
                                    if (i12 == i11) {
                                        return 1;
                                    }
                                    i11--;
                                    break;
                                case 18:
                                    i11++;
                                    break;
                                default:
                                    if (i12 != 0) {
                                        break;
                                    } else {
                                        i12 = i11;
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i11 == 0) {
                            return 1;
                        }
                        if (i12 == 0) {
                            i12 = i11;
                        }
                    }
                } else {
                    if (i11 == 0) {
                        return -1;
                    }
                    if (i12 == 0) {
                        i12 = i11;
                    }
                }
            }
            return 0;
        }
    }

    static {
        InterfaceC1476o interfaceC1476o = AbstractC1477p.f6361c;
        f6333d = interfaceC1476o;
        f6334e = Character.toString((char) 8206);
        f6335f = Character.toString((char) 8207);
        f6336g = new C1462a(false, 2, interfaceC1476o);
        f6337h = new C1462a(true, 2, interfaceC1476o);
    }

    C1462a(boolean z11, int i11, InterfaceC1476o interfaceC1476o) {
        this.f6338a = z11;
        this.f6339b = i11;
        this.f6340c = interfaceC1476o;
    }

    /* renamed from: a */
    private static int m7417a(CharSequence charSequence) {
        return new b(charSequence, false).m7438d();
    }

    /* renamed from: b */
    private static int m7418b(CharSequence charSequence) {
        return new b(charSequence, false).m7439e();
    }

    /* renamed from: c */
    public static C1462a m7419c() {
        return new a().m7430a();
    }

    /* renamed from: e */
    static boolean m7420e(Locale locale) {
        if (AbstractC1478q.m7471a(locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private String m7421f(CharSequence charSequence, InterfaceC1476o interfaceC1476o) {
        boolean mo7465a = interfaceC1476o.mo7465a(charSequence, 0, charSequence.length());
        if (!this.f6338a && (mo7465a || m7418b(charSequence) == 1)) {
            return f6334e;
        }
        if (this.f6338a) {
            if (!mo7465a || m7418b(charSequence) == -1) {
                return f6335f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: g */
    private String m7422g(CharSequence charSequence, InterfaceC1476o interfaceC1476o) {
        boolean mo7465a = interfaceC1476o.mo7465a(charSequence, 0, charSequence.length());
        if (!this.f6338a && (mo7465a || m7417a(charSequence) == 1)) {
            return f6334e;
        }
        if (this.f6338a) {
            if (!mo7465a || m7417a(charSequence) == -1) {
                return f6335f;
            }
            return "";
        }
        return "";
    }

    /* renamed from: d */
    public boolean m7423d() {
        return (this.f6339b & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence m7424h(CharSequence charSequence) {
        return m7425i(charSequence, this.f6340c, true);
    }

    /* renamed from: i */
    public CharSequence m7425i(CharSequence charSequence, InterfaceC1476o interfaceC1476o, boolean z11) {
        InterfaceC1476o interfaceC1476o2;
        char c11;
        InterfaceC1476o interfaceC1476o3;
        if (charSequence == null) {
            return null;
        }
        boolean mo7465a = interfaceC1476o.mo7465a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m7423d() && z11) {
            if (mo7465a) {
                interfaceC1476o3 = AbstractC1477p.f6360b;
            } else {
                interfaceC1476o3 = AbstractC1477p.f6359a;
            }
            spannableStringBuilder.append((CharSequence) m7422g(charSequence, interfaceC1476o3));
        }
        if (mo7465a != this.f6338a) {
            if (mo7465a) {
                c11 = 8235;
            } else {
                c11 = 8234;
            }
            spannableStringBuilder.append(c11);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z11) {
            if (mo7465a) {
                interfaceC1476o2 = AbstractC1477p.f6360b;
            } else {
                interfaceC1476o2 = AbstractC1477p.f6359a;
            }
            spannableStringBuilder.append((CharSequence) m7421f(charSequence, interfaceC1476o2));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String m7426j(String str) {
        return m7427k(str, this.f6340c, true);
    }

    /* renamed from: k */
    public String m7427k(String str, InterfaceC1476o interfaceC1476o, boolean z11) {
        if (str == null) {
            return null;
        }
        return m7425i(str, interfaceC1476o, z11).toString();
    }
}
