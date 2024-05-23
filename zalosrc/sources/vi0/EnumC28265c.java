package vi0;

import vi0.C28263a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'r' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: vi0.c */
/* loaded from: classes7.dex */
public final class EnumC28265c {

    /* renamed from: A */
    private static final /* synthetic */ EnumC28265c[] f131801A;

    /* renamed from: r */
    public static final EnumC28265c f131802r;

    /* renamed from: s */
    public static final EnumC28265c f131803s;

    /* renamed from: t */
    public static final EnumC28265c f131804t;

    /* renamed from: u */
    public static final EnumC28265c f131805u;

    /* renamed from: v */
    public static final EnumC28265c f131806v;

    /* renamed from: w */
    public static final EnumC28265c f131807w;

    /* renamed from: x */
    public static final EnumC28265c f131808x;

    /* renamed from: y */
    public static final EnumC28265c f131809y;

    /* renamed from: z */
    public static final EnumC28265c f131810z;

    /* renamed from: p */
    private final String f131811p;

    /* renamed from: q */
    private C28263a f131812q;

    static {
        C28263a.b bVar = C28263a.Companion;
        f131802r = new EnumC28265c("TEMP_VOICE", 0, "temp_voice", bVar.m142352b());
        f131803s = new EnumC28265c("THUMB_LINK", 1, "thumb_link", bVar.m142356f());
        f131804t = new EnumC28265c("CALL_RBT", 2, "call_rbt", bVar.m142355e());
        f131805u = new EnumC28265c("ZCLOUD_PHOTO", 3, "zcloud_photos", bVar.m142351a());
        f131806v = new EnumC28265c("ZCLOUD_VIDEO", 4, "zcloud_videos", bVar.m142353c());
        f131807w = new EnumC28265c("ZCLOUD_FILE", 5, "zcloud_files", bVar.m142353c());
        f131808x = new EnumC28265c("ZCLOUD_VOICE", 6, "zcloud_voices", bVar.m142354d());
        f131809y = new EnumC28265c("ZCLOUD_OTHERS", 7, "zcloud_others", bVar.m142354d());
        f131810z = new EnumC28265c("ZCLOUD_THUMB_VIDEO", 8, "zcloud_thumb_videos", bVar.m142356f());
        f131801A = m142378b();
    }

    private EnumC28265c(String str, int i11, String str2, C28263a c28263a) {
        this.f131811p = str2;
        this.f131812q = c28263a;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC28265c[] m142378b() {
        return new EnumC28265c[]{f131802r, f131803s, f131804t, f131805u, f131806v, f131807w, f131808x, f131809y, f131810z};
    }

    public static EnumC28265c valueOf(String str) {
        return (EnumC28265c) Enum.valueOf(EnumC28265c.class, str);
    }

    public static EnumC28265c[] values() {
        return (EnumC28265c[]) f131801A.clone();
    }

    /* renamed from: c */
    public final String m142379c() {
        return this.f131811p;
    }

    /* renamed from: d */
    public final C28263a m142380d() {
        return this.f131812q;
    }
}
