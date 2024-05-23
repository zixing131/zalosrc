package com.androidquery.util;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import hu.C20131e;
import java.io.File;
import java.io.FilenameFilter;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p471r3.C25630b;

/* renamed from: com.androidquery.util.t */
/* loaded from: classes2.dex */
public abstract class AbstractC3987t {
    /* renamed from: b */
    public static File m18879b(C25630b c25630b, boolean z11) {
        File file;
        try {
            if (!c25630b.m132394B()) {
                return null;
            }
            String str = c25630b.m132439q() + "/" + c25630b.m132429g() + ".gif";
            String str2 = c25630b.m132439q() + "/" + c25630b.m132429g() + ".jpg";
            String str3 = c25630b.m132439q() + "/" + c25630b.m132429g() + ".png";
            if (AbstractC23041d2.m118194A(c25630b.m132436n())) {
                String m118197D = AbstractC23041d2.m118197D(c25630b.m132436n());
                String str4 = "";
                if (!TextUtils.isEmpty(m118197D)) {
                    try {
                        m18881d(c25630b.m132436n(), c25630b);
                        JSONObject jSONObject = new JSONObject(m118197D);
                        c25630b.m132406P(jSONObject.optInt("fkey"));
                        if (c25630b.m132423d() != 0) {
                            if (z11) {
                                str4 = jSONObject.optString("thumb_flip");
                            } else {
                                str4 = jSONObject.optString("thumb");
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                String m18757N = AbstractC3972e.m18757N(c25630b.m132439q(), c25630b.m132430h());
                if (c25630b.m132423d() != 0) {
                    m18757N = c25630b.m132439q() + "/" + str4;
                }
                if (!AbstractC23041d2.m118194A(m18757N)) {
                    return null;
                }
                file = new File(m18757N);
            } else if (AbstractC23041d2.m118194A(str)) {
                String str5 = C20131e.f99303a.m104946c0() + c25630b.m132432j() + "/" + c25630b.m132429g();
                if (AbstractC23041d2.m118194A(str5)) {
                    str = str5;
                }
                file = new File(str);
            } else if (AbstractC23041d2.m118194A(str3)) {
                file = new File(str3);
            } else {
                if (!AbstractC23041d2.m118194A(str2)) {
                    return null;
                }
                file = new File(str2);
            }
            return file;
        } catch (Exception e12) {
            e12.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ boolean m18880c(File file, String str) {
        return str.toLowerCase().endsWith(".json");
    }

    /* renamed from: d */
    public static void m18881d(String str, C25630b c25630b) {
        try {
            boolean z11 = true;
            int i11 = -1;
            if (AbstractC23041d2.m118194A(str) && c25630b != null) {
                String m118197D = AbstractC23041d2.m118197D(str);
                if (!TextUtils.isEmpty(m118197D)) {
                    JSONObject jSONObject = new JSONObject(m118197D);
                    if (jSONObject.has("effectId")) {
                        c25630b.m132402K(jSONObject.optInt("effectId", 0));
                    }
                    c25630b.m132426e0(jSONObject.optInt("version", 0));
                    if (jSONObject.has("gifType")) {
                        c25630b.m132410T(jSONObject.optInt("gifType", -1));
                    } else {
                        c25630b.m132413W(true);
                        c25630b.m132404N(-1);
                        c25630b.m132414X(-1);
                    }
                    c25630b.m132401J(jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                    i11 = jSONObject.optInt("format_type", -1);
                    int optInt = jSONObject.optInt("ext", 0);
                    c25630b.m132418a0(jSONObject.optInt("source", 0));
                    c25630b.m132416Z(optInt);
                    if (optInt == 2) {
                        c25630b.m132407Q(c25630b.m132439q() + "/" + c25630b.m132429g() + ".webp");
                    } else if (optInt == 3) {
                        c25630b.m132407Q(c25630b.m132439q() + "/fss_" + c25630b.m132429g() + ".webp");
                    }
                }
            }
            if (c25630b != null) {
                File file = new File(c25630b.m132439q());
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.androidquery.util.s
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file2, String str2) {
                            boolean m18880c;
                            m18880c = AbstractC3987t.m18880c(file2, str2);
                            return m18880c;
                        }
                    });
                    if (i11 < 1 || listFiles == null || listFiles.length <= 0) {
                        z11 = false;
                    }
                    c25630b.m132412V(z11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
