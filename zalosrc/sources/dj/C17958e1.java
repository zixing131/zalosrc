package dj;

import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: dj.e1 */
/* loaded from: classes3.dex */
public final class C17958e1 extends C17969i0 {
    public static final a Companion = new a(null);

    /* renamed from: B */
    private int f90900B;

    /* renamed from: C */
    private long f90901C;

    /* renamed from: D */
    private boolean f90902D;

    /* renamed from: E */
    private int f90903E;

    /* renamed from: F */
    private int f90904F;

    /* renamed from: G */
    private int f90905G;

    /* renamed from: H */
    private int f90906H;

    /* renamed from: I */
    private int f90907I;

    /* renamed from: J */
    private int f90908J;

    /* renamed from: K */
    private boolean f90909K;

    /* renamed from: L */
    private String f90910L;

    /* renamed from: M */
    private String f90911M;

    /* renamed from: N */
    private long f90912N;

    /* renamed from: O */
    private boolean f90913O;

    /* renamed from: dj.e1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17958e1 m95437a(long j11) {
            C17958e1 c17958e1 = new C17958e1(10, false, 0L, 0, 0);
            c17958e1.m95434x(j11);
            return c17958e1;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17958e1(C18009w0 c18009w0) {
        this(3, c18009w0.m95743H(), c18009w0.m95777m(), c18009w0.m95779n(), c18009w0.m95788v(), c18009w0.m95790x(), c18009w0.m95789w());
        AbstractC19074t.m100208f(c18009w0, "richContent");
        this.f90907I = c18009w0.m95739D();
        this.f90908J = c18009w0.m95738C();
    }

    /* renamed from: h */
    public static final C17958e1 m95416h(long j11) {
        return Companion.m95437a(j11);
    }

    /* renamed from: u */
    private final void m95417u() {
        JSONObject jSONObject = new JSONObject(this.f91017v);
        this.f90900B = AbstractC18069a.m96086e(jSONObject, "original_type", 0);
        boolean z11 = true;
        if (AbstractC18069a.m96086e(jSONObject, "is_group_layout", 0) != 1) {
            z11 = false;
        }
        this.f90902D = z11;
        this.f90901C = AbstractC18069a.m96088g(jSONObject, "group_layout_id", 0L);
        this.f90903E = AbstractC18069a.m96086e(jSONObject, "id_in_group", 0);
        this.f90904F = AbstractC18069a.m96086e(jSONObject, "total_item_in_group", 0);
        this.f90905G = AbstractC18069a.m96086e(jSONObject, "preprocess_width", 0);
        this.f90906H = AbstractC18069a.m96086e(jSONObject, "preprocess_height", 0);
        String optString = jSONObject.optString("custom_message");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f90910L = optString;
        this.f90909K = jSONObject.optBoolean("is_deleted");
    }

    /* renamed from: A */
    public final void m95418A() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("original_type", this.f90900B);
            jSONObject.put("is_group_layout", this.f90902D ? 1 : 0);
            jSONObject.put("group_layout_id", this.f90901C);
            jSONObject.put("id_in_group", this.f90903E);
            jSONObject.put("total_item_in_group", this.f90904F);
            jSONObject.put("preprocess_width", this.f90905G);
            jSONObject.put("preprocess_height", this.f90906H);
            jSONObject.put("custom_message", this.f90910L);
            jSONObject.put("is_deleted", this.f90909K);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            this.f91017v = jSONObject2;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    public final void m95419g() {
        this.f90911M = "";
    }

    /* renamed from: i */
    public final String m95420i() {
        try {
            if (this.f90910L.length() > 0) {
                if (this.f90911M.length() == 0) {
                    String m102890F = AbstractC19646n0.m102890F(new JSONObject(this.f90910L), 20);
                    AbstractC19074t.m100207e(m102890F, "customizeSomethingMsg(...)");
                    this.f90911M = m102890F;
                }
                return this.f90911M;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (this.f90913O) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_delete_for_everyone_by_admin);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_undo_sent_message);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        return m118743r02;
    }

    /* renamed from: j */
    public final String m95421j() {
        return this.f90910L;
    }

    /* renamed from: k */
    public final long m95422k() {
        return this.f90901C;
    }

    /* renamed from: l */
    public final int m95423l() {
        return this.f90904F;
    }

    /* renamed from: m */
    public final long m95424m() {
        return this.f90912N;
    }

    /* renamed from: n */
    public final int m95425n() {
        return this.f90900B;
    }

    /* renamed from: o */
    public final int m95426o() {
        return this.f90903E;
    }

    /* renamed from: p */
    public final int m95427p() {
        return this.f90906H;
    }

    /* renamed from: q */
    public final int m95428q() {
        return this.f90905G;
    }

    /* renamed from: r */
    public final int m95429r() {
        return this.f90908J;
    }

    /* renamed from: s */
    public final int m95430s() {
        return this.f90907I;
    }

    /* renamed from: t */
    public final boolean m95431t() {
        return this.f90902D;
    }

    /* renamed from: v */
    public final void m95432v(String str) {
        AbstractC19074t.m100208f(str, "json");
        this.f90910L = str;
    }

    /* renamed from: w */
    public final void m95433w(boolean z11) {
        this.f90913O = z11;
    }

    /* renamed from: x */
    public final void m95434x(long j11) {
        this.f90912N = j11;
    }

    /* renamed from: y */
    public final void m95435y(int i11) {
        this.f90908J = i11;
    }

    /* renamed from: z */
    public final void m95436z(int i11) {
        this.f90907I = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17958e1(C17961f1 c17961f1) {
        this(19, c17961f1.m95460N(), c17961f1.m95487l(), c17961f1.m95489m(), c17961f1.m95493o(), c17961f1.m95497q(), c17961f1.m95495p());
        AbstractC19074t.m100208f(c17961f1, "richContent");
        this.f90907I = c17961f1.m95458L();
        this.f90908J = c17961f1.m95457K();
    }

    public C17958e1(int i11, boolean z11, long j11, int i12, int i13) {
        super("", 0, "", "", "", "", "");
        this.f90910L = "";
        this.f90911M = "";
        this.f90900B = i11;
        this.f90902D = z11;
        this.f90901C = j11;
        this.f90904F = i12;
        this.f90903E = i13;
        this.f90912N = j11;
    }

    public /* synthetic */ C17958e1(int i11, boolean z11, long j11, int i12, int i13, int i14, AbstractC19060k abstractC19060k) {
        this(i11, (i14 & 2) != 0 ? false : z11, (i14 & 4) != 0 ? 0L : j11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) == 0 ? i13 : 0);
    }

    public C17958e1(int i11, boolean z11, long j11, int i12, int i13, int i14, int i15) {
        super("", 0, "", "", "", "", "");
        this.f90910L = "";
        this.f90911M = "";
        this.f90900B = i11;
        this.f90902D = z11;
        this.f90901C = j11;
        this.f90904F = i12;
        this.f90903E = i13;
        this.f90905G = i14;
        this.f90906H = i15;
        this.f90912N = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17958e1(String str, int i11, String str2, String str3, String str4, String str5, String str6) {
        super(str, i11, str2, str3, str4, str5, str6);
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "thumb");
        AbstractC19074t.m100208f(str3, "href");
        AbstractC19074t.m100208f(str4, "description");
        AbstractC19074t.m100208f(str5, "action");
        AbstractC19074t.m100208f(str6, "params");
        this.f90910L = "";
        this.f90911M = "";
        this.f90912N = -1L;
        m95417u();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17958e1(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC19074t.m100208f(jSONObject, "json");
        this.f90910L = "";
        this.f90911M = "";
        this.f90912N = -1L;
        m95417u();
    }
}
