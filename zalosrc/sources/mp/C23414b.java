package mp;

import android.text.TextUtils;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.social.controls.C10873l;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.AbstractC20789d;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p302ko.C21785g;

/* renamed from: mp.b */
/* loaded from: classes4.dex */
public class C23414b {

    /* renamed from: a */
    String f113773a;

    /* renamed from: b */
    String f113774b;

    /* renamed from: c */
    String f113775c;

    /* renamed from: d */
    int f113776d;

    /* renamed from: e */
    TrackingSource f113777e;

    /* renamed from: f */
    C23415c f113778f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mp.b$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f113779a;

        /* renamed from: b */
        final /* synthetic */ boolean f113780b;

        a(String str, boolean z11) {
            this.f113779a = str;
            this.f113780b = z11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (C23414b.this.f113778f != null) {
                C23413a m123022a = C23413a.m123022a(c20096c);
                C23414b c23414b = C23414b.this;
                C23415c c23415c = c23414b.f113778f;
                c23415c.m123035d(c23415c.m123034c(this.f113779a, c23414b.f113775c, c23414b.f113776d), m123022a);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                boolean z11 = true;
                if (jSONObject.optInt("enable_recent_like") != 1) {
                    z11 = false;
                }
                String m96089h = AbstractC18069a.m96089h(jSONObject, "last_cid");
                int m96085d = AbstractC18069a.m96085d(jSONObject, "rmv");
                int m96085d2 = AbstractC18069a.m96085d(jSONObject, "tot");
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("list");
                if (optJSONArray != null) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        C10873l m108477k = AbstractC20789d.m108477k(optJSONArray.getJSONObject(i11));
                        m108477k.f54903S = 0;
                        boolean z12 = this.f113780b;
                        m108477k.f54894J = z12 ? 1 : 0;
                        if (z12 && TextUtils.isEmpty(m108477k.m56491t())) {
                            m108477k.m56466g0(C23414b.this.f113774b);
                        }
                        arrayList.add(i11, m108477k);
                    }
                }
                if (C23414b.this.f113778f != null) {
                    C23413a m123023b = C23413a.m123023b(arrayList, m96089h, m96085d, m96085d2, z11);
                    C23414b c23414b = C23414b.this;
                    C23415c c23415c = c23414b.f113778f;
                    c23415c.m123035d(c23415c.m123034c(this.f113779a, c23414b.f113775c, c23414b.f113776d), m123023b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C23414b(String str, String str2, String str3, int i11, TrackingSource trackingSource, C23415c c23415c) {
        this.f113773a = str;
        this.f113774b = str2;
        this.f113775c = str3;
        this.f113776d = i11;
        this.f113778f = c23415c;
        this.f113777e = trackingSource;
    }

    /* renamed from: a */
    public void m123031a() {
        C23415c c23415c;
        C21785g m123033a;
        String str;
        if (TextUtils.isEmpty(this.f113775c)) {
            return;
        }
        if (((!TextUtils.isEmpty(this.f113773a) && !TextUtils.isEmpty(this.f113774b)) || !TextUtils.isEmpty(this.f113775c)) && (c23415c = this.f113778f) != null && (m123033a = c23415c.m123033a()) != null) {
            boolean z11 = !TextUtils.isEmpty(this.f113774b);
            if (!TextUtils.isEmpty(this.f113774b)) {
                str = this.f113774b;
            } else {
                str = this.f113773a;
            }
            a aVar = new a(str, z11);
            if (z11) {
                m123033a.mo112369k(this.f113774b, this.f113775c, this.f113776d, this.f113777e, aVar);
            } else {
                m123033a.mo112372m0(this.f113773a, this.f113775c, this.f113776d, this.f113777e, aVar);
            }
        }
    }
}
