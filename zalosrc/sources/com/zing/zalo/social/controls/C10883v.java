package com.zing.zalo.social.controls;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23118k2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import mm0.AbstractC23356k;
import p361nb.AbstractC23647d;
import p402os.C24548c;
import p604wb.C28905e;

/* renamed from: com.zing.zalo.social.controls.v */
/* loaded from: classes5.dex */
public class C10883v extends C10866e {

    /* renamed from: g0 */
    private final Context f54984g0;

    /* renamed from: h0 */
    private Map f54985h0;

    /* renamed from: i0 */
    private final int f54986i0;

    /* renamed from: j0 */
    private final String f54987j0;

    /* renamed from: k0 */
    private final String f54988k0;

    /* renamed from: l0 */
    public int f54989l0;

    /* renamed from: m0 */
    public String f54990m0;

    public C10883v(Context context, String str, int i11, int i12, int i13, String str2, String str3, int i14, String str4) {
        super(str, i11, i12);
        this.f54984g0 = context;
        this.f54986i0 = i13;
        this.f54987j0 = str2;
        this.f54988k0 = str3;
        this.f54989l0 = i14;
        this.f54990m0 = str4;
        m56392h0(false);
    }

    /* renamed from: j0 */
    public static String m56526j0(String str, long j11, int i11, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        String str9;
        String str10;
        try {
            String m122797c = AbstractC23356k.m122797c(str, new String[]{"&", "<", ">", "\"", "'", "/"}, new String[]{"&amp;", "&lt;", "&gt;", "&quot;", "&#x27;", "&#x2F;"});
            Object[] objArr = new Object[10];
            objArr[0] = "";
            objArr[1] = Long.valueOf(j11);
            objArr[2] = Integer.valueOf(i11);
            if (str2 == null) {
                str8 = "";
            } else {
                str8 = URLEncoder.encode(str2);
            }
            objArr[3] = str8;
            objArr[4] = str3;
            objArr[5] = str4;
            objArr[6] = str5;
            if (str6 == null) {
                str9 = "";
            } else {
                str9 = URLEncoder.encode(str6);
            }
            objArr[7] = str9;
            if (str7 == null) {
                str10 = "";
            } else {
                str10 = str7;
            }
            objArr[8] = str10;
            objArr[9] = m122797c;
            String format = String.format("%s <a href=\"cmd://Game/Detail?appId=%d&clickType=%d&param=%s&source_id=%s&source_uid=%s&source_type=%s&referrer=%s&pkgname=%s\">%s</a>", objArr);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("text:");
            sb2.append(format);
            return format;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: k0 */
    public static C24548c m56527k0(Map map) {
        C24548c c24548c = new C24548c();
        if (map != null) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (map.size() > 0) {
                if (map.containsKey("source_id") && map.containsKey("source_uid") && map.containsKey("source_type")) {
                    c24548c.m127905f(Long.parseLong((String) map.get("source_id")));
                    c24548c.m127907h(Integer.parseInt((String) map.get("source_uid")));
                    c24548c.m127906g((byte) Integer.parseInt((String) map.get("source_type")));
                    return c24548c;
                }
                throw new IllegalArgumentException("parseGameSourceJSON failed: Missing source params");
            }
        }
        throw new IllegalArgumentException("parseGameSourceJSON failed");
    }

    @Override // com.zing.zalo.social.controls.C10866e
    /* renamed from: D */
    public void mo56361D(String str, Context context) {
        Map map;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("data:");
        sb2.append(str);
        if (this.f54854q == 20001 && (map = this.f54985h0) != null) {
            try {
                C24548c m56527k0 = m56527k0(map);
                String str2 = (String) this.f54985h0.get("appId");
                int parseInt = Integer.parseInt((String) this.f54985h0.get("clickType"));
                if (parseInt == 1) {
                    AbstractC23118k2.m118600m(context, Long.parseLong(str2), this.f54989l0, this.f54990m0);
                    C28905e.m144373n().m144396r(2, this.f54986i0, str2, this.f54987j0, this.f54988k0);
                } else if (parseInt == 2) {
                    AbstractC23118k2.m118602o(context, (String) this.f54985h0.get("param"), this.f54989l0, this.f54990m0);
                    C28905e.m144373n().m144396r(0, this.f54986i0, str2, this.f54987j0, this.f54988k0);
                } else if (parseInt == 3) {
                    String str3 = (String) this.f54985h0.get("pkgname");
                    long parseLong = Long.parseLong(str2);
                    String str4 = (String) this.f54985h0.get("referrer");
                    if (!TextUtils.isEmpty(str3)) {
                        AbstractC23118k2.m118590c(context, str3, parseLong, m56527k0, str4, this.f54986i0, this.f54987j0, this.f54988k0, this.f54989l0, this.f54990m0);
                    }
                }
                AbstractC23647d.m123907q("4201", "");
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("GameCallbackSpan", e11);
            }
        }
    }

    @Override // com.zing.zalo.social.controls.C10866e
    /* renamed from: f */
    public void mo56388f(String str) {
        if (this.f54985h0 == null) {
            this.f54985h0 = new HashMap();
        }
        if (str.startsWith("cmd://Game/Detail?")) {
            String substring = str.substring(18);
            this.f54853p = substring;
            try {
                for (String str2 : substring.split("&")) {
                    int indexOf = str2.indexOf("=");
                    this.f54985h0.put(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"), URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8"));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("GameCallbackSpan", e11);
            }
            this.f54854q = ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM;
            return;
        }
        super.mo56388f(str);
    }

    @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (this.f54860w) {
            textPaint.bgColor = C23212s8.m119606n(AbstractC7354t0.ItemBackgroundPress);
            this.f54860w = false;
            this.f54861x = false;
        } else if (this.f54861x) {
            textPaint.bgColor = C23212s8.m119606n(AbstractC7354t0.ItemBackgroundPress);
        } else {
            textPaint.bgColor = this.f54984g0.getResources().getColor(AbstractC16801x.transparent);
        }
    }
}
