package vi;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p128ed.C18388c;
import p128ed.C18390e;

/* renamed from: vi.f */
/* loaded from: classes3.dex */
public final class C28260f implements InterfaceC28256b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f131764a;

    /* renamed from: b */
    private String f131765b;

    /* renamed from: c */
    private long f131766c;

    /* renamed from: d */
    private long f131767d;

    /* renamed from: e */
    private String f131768e;

    /* renamed from: f */
    private final Map f131769f;

    /* renamed from: g */
    private String f131770g;

    /* renamed from: h */
    private long f131771h;

    /* renamed from: i */
    private int f131772i;

    /* renamed from: vi.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28260f m142317a(JSONObject jSONObject) {
            long j11;
            AbstractC19074t.m100208f(jSONObject, "fileJson");
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("id");
            long optLong = jSONObject.optLong("size");
            C18390e c18390e = C18390e.f92781a;
            AbstractC19074t.m100205c(optString);
            String m97426w = c18390e.m97426w(optString);
            if (m97426w.length() != 0) {
                String optString3 = jSONObject.optString("md5Checksum");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject optJSONObject = jSONObject.optJSONObject("properties");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("appProperties");
                m142318b(optJSONObject, linkedHashMap, m97426w, optString);
                m142318b(optJSONObject2, linkedHashMap, m97426w, optString);
                if (optJSONObject != null && optJSONObject.has("timestamp")) {
                    j11 = optJSONObject.optLong("timestamp");
                } else {
                    j11 = 0;
                }
                long j12 = j11;
                AbstractC19074t.m100205c(optString2);
                AbstractC19074t.m100205c(optString3);
                C28260f c28260f = new C28260f(optString, optString2, optLong, j12, optString3);
                c28260f.m142309k().putAll(linkedHashMap);
                return c28260f;
            }
            throw new IllegalArgumentException("ownerId is empty from [fromJson]");
        }

        /* renamed from: b */
        public final void m142318b(JSONObject jSONObject, Map map, String str, String str2) {
            List m127132B0;
            List m127132B02;
            AbstractC19074t.m100208f(map, "mapOutputFileMD");
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "zipNameParent");
            if (jSONObject != null) {
                String str3 = "f1";
                int i11 = 1;
                while (jSONObject.has(str3)) {
                    String string = jSONObject.getString(str3);
                    if (string == null) {
                        string = "";
                    } else {
                        AbstractC19074t.m100205c(string);
                    }
                    if (string.length() > 0) {
                        m127132B0 = AbstractC24342w.m127132B0(string, new String[]{","}, false, 0, 6, null);
                        if (!m127132B0.isEmpty()) {
                            int size = m127132B0.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                String str4 = (String) m127132B0.get(i12);
                                if (str4.length() > 0) {
                                    m127132B02 = AbstractC24342w.m127132B0(str4, new String[]{"_"}, false, 0, 6, null);
                                    if (m127132B02.size() == 2) {
                                        String str5 = (String) m127132B02.get(0);
                                        MessageId m41066e = MessageId.Companion.m41066e((String) m127132B02.get(1), "", str, str5);
                                        if (m41066e != null) {
                                            C28262h m142330b = C28262h.Companion.m142330b(str2, str, str5, m41066e);
                                            map.put(m142330b.mo142292f(), m142330b);
                                        }
                                    } else {
                                        C18390e.m97412t("[parseProps] splitMsgIds args invalid, msgIds=" + str4, true);
                                    }
                                }
                            }
                        } else {
                            C18390e.m97412t("[parseProps] splits empty, value=" + string, true);
                        }
                    }
                    i11++;
                    if (i11 <= 1000) {
                        str3 = "f" + i11;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public C28260f(String str, String str2, long j11, long j12, String str3) {
        AbstractC19074t.m100208f(str, "fileName");
        AbstractC19074t.m100208f(str2, "driveId");
        AbstractC19074t.m100208f(str3, "checksumMd5");
        this.f131764a = str;
        this.f131765b = str2;
        this.f131766c = j11;
        this.f131767d = j12;
        this.f131768e = str3;
        this.f131769f = new LinkedHashMap();
        this.f131770g = "";
        this.f131772i = 1;
        try {
            C18390e c18390e = C18390e.f92781a;
            this.f131770g = c18390e.m97426w(this.f131764a);
            this.f131771h = c18390e.m97428y(this.f131764a);
            this.f131772i = c18390e.m97427x(this.f131764a);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: o */
    private final boolean m142303o(Map map) {
        if (this.f131769f.size() != map.size()) {
            return true;
        }
        Iterator it = this.f131769f.entrySet().iterator();
        while (it.hasNext()) {
            if (!map.containsKey((String) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: a */
    public String mo142288a() {
        return C18388c.f92779a.m97397h(this.f131764a);
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: b */
    public long mo142289b() {
        return this.f131766c;
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: c */
    public void mo142290c(long j11) {
        this.f131766c = j11;
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: d */
    public String mo142291d() {
        return this.f131764a;
    }

    /* renamed from: e */
    public final String m142304e() {
        return this.f131768e;
    }

    @Override // vi.InterfaceC28256b
    /* renamed from: f */
    public String mo142292f() {
        return this.f131764a;
    }

    /* renamed from: g */
    public final ArrayList m142305g() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC28256b interfaceC28256b : this.f131769f.values()) {
            if (interfaceC28256b instanceof C28262h) {
                arrayList.add(interfaceC28256b);
            } else if (interfaceC28256b instanceof C28260f) {
                arrayList.addAll(((C28260f) interfaceC28256b).m142305g());
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final String m142306h() {
        return this.f131765b;
    }

    /* renamed from: i */
    public String m142307i() {
        return "application/zip";
    }

    /* renamed from: j */
    public long m142308j() {
        return this.f131767d;
    }

    /* renamed from: k */
    public final Map m142309k() {
        return this.f131769f;
    }

    /* renamed from: l */
    public final String m142310l() {
        return this.f131770g;
    }

    /* renamed from: m */
    public final int m142311m() {
        return this.f131772i;
    }

    /* renamed from: n */
    public final long m142312n() {
        return this.f131771h;
    }

    /* renamed from: p */
    public final boolean m142313p(C28260f c28260f) {
        AbstractC19074t.m100208f(c28260f, "other");
        if (c28260f == this) {
            return true;
        }
        if (AbstractC19074t.m100204b(mo142291d(), c28260f.mo142291d()) && !m142303o(c28260f.f131769f)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void m142314q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f131768e = str;
    }

    /* renamed from: r */
    public final void m142315r(String str) {
        AbstractC19074t.m100208f(str, "fileName");
        this.f131764a = str;
    }

    /* renamed from: s */
    public final void m142316s(String str) {
        AbstractC19074t.m100208f(str, "driveId");
        this.f131765b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fileName=" + this.f131764a);
        sb2.append(", driveId=" + this.f131765b);
        sb2.append(", fileSize=" + this.f131766c);
        sb2.append(", timestamp=" + this.f131767d);
        sb2.append(", mapFileMD=" + this.f131769f.size());
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ C28260f(String str, String str2, long j11, long j12, String str3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) == 0 ? j12 : 0L, (i11 & 16) != 0 ? "" : str3);
    }
}
