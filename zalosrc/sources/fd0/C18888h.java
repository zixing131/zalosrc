package fd0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: fd0.h */
/* loaded from: classes4.dex */
public final class C18888h {

    /* renamed from: a */
    private final String f94287a;

    /* renamed from: b */
    private final String f94288b;

    /* renamed from: c */
    private final int f94289c;

    /* renamed from: d */
    private final boolean f94290d;

    /* renamed from: e */
    private final boolean f94291e;

    /* renamed from: f */
    private final boolean f94292f;

    /* renamed from: g */
    private final int f94293g;

    /* renamed from: h */
    private final EnumC18886f f94294h;

    /* renamed from: i */
    private final String f94295i;

    /* renamed from: j */
    private EnumC18881a f94296j;

    /* renamed from: k */
    private JSONObject f94297k;

    public C18888h(String str, String str2, int i11, boolean z11, boolean z12, boolean z13, int i12, EnumC18886f enumC18886f, String str3, EnumC18881a enumC18881a, JSONObject jSONObject) {
        AbstractC19074t.m100208f(str, "logEntryPoint");
        AbstractC19074t.m100208f(str2, "trackingLogChatType");
        AbstractC19074t.m100208f(enumC18886f, "stopS2TEntryPoint");
        AbstractC19074t.m100208f(enumC18881a, "clearTextEntryPoint");
        this.f94287a = str;
        this.f94288b = str2;
        this.f94289c = i11;
        this.f94290d = z11;
        this.f94291e = z12;
        this.f94292f = z13;
        this.f94293g = i12;
        this.f94294h = enumC18886f;
        this.f94295i = str3;
        this.f94296j = enumC18881a;
        this.f94297k = jSONObject;
    }

    /* renamed from: a */
    public final JSONObject m99019a() {
        return this.f94297k;
    }

    /* renamed from: b */
    public final EnumC18881a m99020b() {
        return this.f94296j;
    }

    /* renamed from: c */
    public final int m99021c() {
        return this.f94289c;
    }

    /* renamed from: d */
    public final String m99022d() {
        return this.f94287a;
    }

    /* renamed from: e */
    public final int m99023e() {
        return this.f94293g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18888h)) {
            return false;
        }
        C18888h c18888h = (C18888h) obj;
        return AbstractC19074t.m100204b(this.f94287a, c18888h.f94287a) && AbstractC19074t.m100204b(this.f94288b, c18888h.f94288b) && this.f94289c == c18888h.f94289c && this.f94290d == c18888h.f94290d && this.f94291e == c18888h.f94291e && this.f94292f == c18888h.f94292f && this.f94293g == c18888h.f94293g && this.f94294h == c18888h.f94294h && AbstractC19074t.m100204b(this.f94295i, c18888h.f94295i) && this.f94296j == c18888h.f94296j && AbstractC19074t.m100204b(this.f94297k, c18888h.f94297k);
    }

    /* renamed from: f */
    public final boolean m99024f() {
        return this.f94291e;
    }

    /* renamed from: g */
    public final boolean m99025g() {
        return this.f94292f;
    }

    /* renamed from: h */
    public final String m99026h() {
        return this.f94295i;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f94287a.hashCode() * 31) + this.f94288b.hashCode()) * 31) + this.f94289c) * 31) + AbstractC2144f.m11520a(this.f94290d)) * 31) + AbstractC2144f.m11520a(this.f94291e)) * 31) + AbstractC2144f.m11520a(this.f94292f)) * 31) + this.f94293g) * 31) + this.f94294h.hashCode()) * 31;
        String str = this.f94295i;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f94296j.hashCode()) * 31;
        JSONObject jSONObject = this.f94297k;
        return hashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    /* renamed from: i */
    public final EnumC18886f m99027i() {
        return this.f94294h;
    }

    /* renamed from: j */
    public final String m99028j() {
        return this.f94288b;
    }

    /* renamed from: k */
    public final boolean m99029k() {
        return this.f94290d;
    }

    /* renamed from: l */
    public final void m99030l(JSONObject jSONObject) {
        this.f94297k = jSONObject;
    }

    /* renamed from: m */
    public final void m99031m(EnumC18881a enumC18881a) {
        AbstractC19074t.m100208f(enumC18881a, "<set-?>");
        this.f94296j = enumC18881a;
    }

    public String toString() {
        return "VoiceRecordLogParams(logEntryPoint=" + this.f94287a + ", trackingLogChatType=" + this.f94288b + ", duration=" + this.f94289c + ", isRecordingSpeechToText=" + this.f94290d + ", sessionLongHoldLog=" + this.f94291e + ", sessionPreviewLog=" + this.f94292f + ", previewedProgressLog=" + this.f94293g + ", stopS2TEntryPoint=" + this.f94294h + ", speechToText=" + this.f94295i + ", clearTextEntryPoint=" + this.f94296j + ", asr=" + this.f94297k + ")";
    }

    public /* synthetic */ C18888h(String str, String str2, int i11, boolean z11, boolean z12, boolean z13, int i12, EnumC18886f enumC18886f, String str3, EnumC18881a enumC18881a, JSONObject jSONObject, int i13, AbstractC19060k abstractC19060k) {
        this(str, (i13 & 2) != 0 ? "0" : str2, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12, (i13 & 32) != 0 ? false : z13, (i13 & 64) == 0 ? i12 : 0, (i13 & 128) != 0 ? EnumC18886f.f94270p : enumC18886f, (i13 & 256) != 0 ? null : str3, (i13 & 512) != 0 ? EnumC18881a.f94254q : enumC18881a, (i13 & 1024) == 0 ? jSONObject : null);
    }
}
