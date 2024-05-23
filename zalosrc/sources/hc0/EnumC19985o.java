package hc0;

import fn0.AbstractC19060k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hc0.o */
/* loaded from: classes6.dex */
public final class EnumC19985o {
    public static final a Companion;

    /* renamed from: D */
    private static final /* synthetic */ EnumC19985o[] f98286D;

    /* renamed from: E */
    private static final /* synthetic */ InterfaceC30165a f98287E;

    /* renamed from: p */
    private final int f98298p;

    /* renamed from: q */
    public static final EnumC19985o f98288q = new EnumC19985o("CHECKLIST", 0, 0);

    /* renamed from: r */
    public static final EnumC19985o f98289r = new EnumC19985o("KEEP_BACKUP_OPTION", 1, 1);

    /* renamed from: s */
    public static final EnumC19985o f98290s = new EnumC19985o("INTRO_SECURE", 2, 2);

    /* renamed from: t */
    public static final EnumC19985o f98291t = new EnumC19985o("SETUP_SELECT_PWD", 3, 3);

    /* renamed from: u */
    public static final EnumC19985o f98292u = new EnumC19985o("INPUT_BACKUP_PASSWORD", 4, 4);

    /* renamed from: v */
    public static final EnumC19985o f98293v = new EnumC19985o("INPUT_BACKUP_PIN", 5, 5);

    /* renamed from: w */
    public static final EnumC19985o f98294w = new EnumC19985o("INPUT_BACKUP_PASSPHRASE", 6, 6);

    /* renamed from: x */
    public static final EnumC19985o f98295x = new EnumC19985o("OPTION_SECURE", 7, 7);

    /* renamed from: y */
    public static final EnumC19985o f98296y = new EnumC19985o("GEN_PRIVATE_KEY", 8, 8);

    /* renamed from: z */
    public static final EnumC19985o f98297z = new EnumC19985o("INPUT_PIN", 9, 9);

    /* renamed from: A */
    public static final EnumC19985o f98283A = new EnumC19985o("CONNECT_FEATURES", 10, 10);

    /* renamed from: B */
    public static final EnumC19985o f98284B = new EnumC19985o("DONE_SETUP_PROTECTION", 11, 11);

    /* renamed from: C */
    public static final EnumC19985o f98285C = new EnumC19985o("FINISH", 12, 12);

    /* renamed from: hc0.o$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Object m103755a(int i11) {
            EnumC19985o enumC19985o;
            EnumC19985o[] values = EnumC19985o.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    enumC19985o = values[i12];
                    if (enumC19985o.m103754c() == i11) {
                        break;
                    }
                    i12++;
                } else {
                    enumC19985o = null;
                    break;
                }
            }
            if (enumC19985o == null) {
                return 0;
            }
            return enumC19985o;
        }
    }

    static {
        EnumC19985o[] m103753b = m103753b();
        f98286D = m103753b;
        f98287E = AbstractC30166b.m148796a(m103753b);
        Companion = new a(null);
    }

    private EnumC19985o(String str, int i11, int i12) {
        this.f98298p = i12;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC19985o[] m103753b() {
        return new EnumC19985o[]{f98288q, f98289r, f98290s, f98291t, f98292u, f98293v, f98294w, f98295x, f98296y, f98297z, f98283A, f98284B, f98285C};
    }

    public static EnumC19985o valueOf(String str) {
        return (EnumC19985o) Enum.valueOf(EnumC19985o.class, str);
    }

    public static EnumC19985o[] values() {
        return (EnumC19985o[]) f98286D.clone();
    }

    /* renamed from: c */
    public final int m103754c() {
        return this.f98298p;
    }
}
