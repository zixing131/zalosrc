package com.zing.zalo.social.controls;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.Patterns;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20789d;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23160o0;
import me0.AbstractC23238v2;
import me0.AbstractC23244v8;
import me0.AbstractC23254w8;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nh0.C23793c;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p458qr.C25482o;
import p471r3.C25630b;
import p588vw.C28652r;
import p716zh.C31839a6;
import p716zh.C31854b6;
import rd0.AbstractC25751q;
import rd0.AbstractC25752r;
import tn.C26736a;

/* renamed from: com.zing.zalo.social.controls.l */
/* loaded from: classes5.dex */
public class C10873l {

    /* renamed from: A */
    ArrayList f54885A;

    /* renamed from: B */
    ArrayList f54886B;

    /* renamed from: C */
    int f54887C;

    /* renamed from: G */
    public C10872k f54891G;

    /* renamed from: H */
    public C10881t f54892H;

    /* renamed from: I */
    public int f54893I;

    /* renamed from: O */
    C10874m f54899O;

    /* renamed from: W */
    public C31854b6 f54907W;

    /* renamed from: X */
    public boolean f54908X;

    /* renamed from: Y */
    public int f54909Y;

    /* renamed from: Z */
    public List f54910Z;

    /* renamed from: a0 */
    SimpleDateFormat f54912a0;

    /* renamed from: b0 */
    public TrackingSource f54914b0;

    /* renamed from: g */
    String f54922g;

    /* renamed from: i */
    String f54924i;

    /* renamed from: n */
    CharSequence f54929n;

    /* renamed from: r */
    String f54933r;

    /* renamed from: s */
    int f54934s;

    /* renamed from: t */
    String f54935t;

    /* renamed from: x */
    ArrayList f54939x;

    /* renamed from: y */
    ArrayList f54940y;

    /* renamed from: z */
    ArrayList f54941z;

    /* renamed from: w */
    public int f54938w = 0;

    /* renamed from: D */
    public long f54888D = 0;

    /* renamed from: E */
    public long f54889E = 0;

    /* renamed from: F */
    public int f54890F = 0;

    /* renamed from: J */
    public int f54894J = 0;

    /* renamed from: K */
    Map f54895K = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: L */
    Map f54896L = new ConcurrentHashMap();

    /* renamed from: M */
    Map f54897M = new ConcurrentHashMap();

    /* renamed from: N */
    public List f54898N = new ArrayList(2);

    /* renamed from: P */
    public int f54900P = -1;

    /* renamed from: Q */
    public ItemAlbumMobile f54901Q = null;

    /* renamed from: R */
    public boolean f54902R = false;

    /* renamed from: S */
    public int f54903S = 0;

    /* renamed from: T */
    boolean f54904T = false;

    /* renamed from: U */
    boolean f54905U = false;

    /* renamed from: V */
    public boolean f54906V = false;

    /* renamed from: c0 */
    boolean f54916c0 = false;

    /* renamed from: d0 */
    boolean f54918d0 = false;

    /* renamed from: e0 */
    long f54920e0 = 0;

    /* renamed from: a */
    String f54911a = "";

    /* renamed from: b */
    String f54913b = "";

    /* renamed from: c */
    String f54915c = "";

    /* renamed from: d */
    String f54917d = "";

    /* renamed from: e */
    String f54919e = "";

    /* renamed from: f */
    String f54921f = "";

    /* renamed from: h */
    String f54923h = "";

    /* renamed from: j */
    String f54925j = "";

    /* renamed from: l */
    String f54927l = "";

    /* renamed from: m */
    CharSequence f54928m = "";

    /* renamed from: o */
    CharSequence f54930o = "";

    /* renamed from: q */
    String f54932q = "";

    /* renamed from: k */
    String f54926k = "";

    /* renamed from: p */
    int f54931p = 0;

    /* renamed from: u */
    boolean f54936u = false;

    /* renamed from: v */
    boolean f54937v = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$a */
    /* loaded from: classes5.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            Object valueOf;
            try {
                StringBuilder sb2 = new StringBuilder("POST--COMMENT---FEED---TEXT-PHOTO---Failed");
                sb2.append("\nCommentId = ");
                sb2.append(C10873l.this.f54917d);
                sb2.append("\nerror code = ");
                if (c20096c == null) {
                    valueOf = "NULL";
                } else {
                    valueOf = Integer.valueOf(c20096c.m104491c());
                }
                sb2.append(valueOf);
                sb2.append("\nretry count = ");
                sb2.append(C10873l.this.f54890F);
                C26736a.m137533h(sb2.toString());
            } catch (Exception e11) {
                C10873l c10873l = C10873l.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -100;
                }
                c10873l.m56436C0(i11);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (m104491c != 500 && m104491c != 1001 && m104491c != 1002 && m104491c != 16001) {
                    C10873l.this.f54890F++;
                } else {
                    C10873l.this.m56436C0(m104491c);
                }
                C10873l c10873l2 = C10873l.this;
                c10873l2.f54904T = false;
                c10873l2.f54918d0 = false;
                return;
            }
            throw new IllegalArgumentException("Invalid Data");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C10873l c10873l = new C10873l();
                c10873l.m56464e0(AbstractC18069a.m96089h(jSONObject, "fid"));
                c10873l.m56468h0(AbstractC18069a.m96089h(jSONObject, "cid"));
                c10873l.m56474k0(AbstractC18069a.m96089h(jSONObject, "oid"));
                c10873l.m56459b0(AbstractC18069a.m96089h(jSONObject, "avt"));
                c10873l.m56472j0(AbstractC18069a.m96089h(jSONObject, "fun"));
                c10873l.m56463d0(AbstractC18069a.m96089h(jSONObject, "fdn"));
                c10873l.m56486q0(AbstractC18069a.m96089h(jSONObject, "tvb"));
                c10873l.m56488r0(AbstractC18069a.m96089h(jSONObject, "tim"));
                c10873l.m56480n0(AbstractC18069a.m96089h(jSONObject, "sck"));
                c10873l.m56476l0(AbstractC18069a.m96085d(jSONObject, "prt"));
                c10873l.m56482o0(2);
                c10873l.f54894J = 0;
                String m96089h = AbstractC18069a.m96089h(jSONObject, "uid");
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "tdn");
                c10873l.m56490s0(m96089h);
                if (!TextUtils.isEmpty(m96089h2)) {
                    c10873l.m56484p0(AbstractC21935u.m114542i(m96089h, m96089h2));
                }
                if (jSONObject.has("mapEffect")) {
                    c10873l.f54907W = new C31854b6(jSONObject.optJSONArray("mapEffect"));
                }
                c10873l.m56470i0(AbstractC18069a.m96089h(jSONObject, "con"));
                c10873l.f54938w = 0;
                c10873l.f54902R = false;
                c10873l.f54903S = 0;
                c10873l.f54893I = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                if (jSONObject.has("attach")) {
                    c10873l.f54891G = new C10872k(AbstractC18069a.m96091j(jSONObject, "attach"));
                }
                C26736a.m137533h("RECEIVE---NEW----FEED---COMMENT---" + c10873l.m56441F0().toString());
                C10873l.this.m56440E0(c10873l);
            } catch (Exception e11) {
                C10873l.this.m56436C0(-100);
                e11.printStackTrace();
            }
            C10873l c10873l2 = C10873l.this;
            c10873l2.f54890F++;
            c10873l2.f54904T = false;
            c10873l2.f54918d0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$b */
    /* loaded from: classes5.dex */
    public class b extends AbstractC0939u {
        b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42427id(C10873l.this.f54917d, 2);
            C7960e m41971c6 = C7960e.m41971c6();
            C10873l c10873l = C10873l.this;
            m41971c6.m42416hd(c10873l.f54917d, c10873l.f54889E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$c */
    /* loaded from: classes5.dex */
    public class c extends AbstractC0939u {
        c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42600z3(CoreUtility.f89233i, C10873l.this.f54917d);
        }
    }

    /* renamed from: com.zing.zalo.social.controls.l$d */
    /* loaded from: classes5.dex */
    class d extends AbstractC0939u {
        d() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42600z3(CoreUtility.f89233i, C10873l.this.f54917d);
            C7960e m41971c6 = C7960e.m41971c6();
            String str = CoreUtility.f89233i;
            C10873l c10873l = C10873l.this;
            String str2 = c10873l.f54917d;
            String jSONObject = c10873l.m56441F0().toString();
            C10873l c10873l2 = C10873l.this;
            m41971c6.m42062A7(str, str2, jSONObject, 4, c10873l2.f54898N, c10873l2.m56439E(), C10873l.this.f54889E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$e */
    /* loaded from: classes5.dex */
    public class e extends AbstractC0939u {
        e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42600z3(CoreUtility.f89233i, C10873l.this.f54917d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$f */
    /* loaded from: classes5.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f54947a;

        f(String str) {
            this.f54947a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42437jd(C10873l.this.f54917d, this.f54947a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$g */
    /* loaded from: classes5.dex */
    public class g implements InterfaceC20094a {
        g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            Object valueOf;
            try {
                StringBuilder sb2 = new StringBuilder("Post---FEED---COMMENT TEXT-STICKER failed");
                sb2.append("\nCommentId = ");
                sb2.append(C10873l.this.f54917d);
                sb2.append("\nerror code = ");
                if (c20096c == null) {
                    valueOf = "NULL";
                } else {
                    valueOf = Integer.valueOf(c20096c.m104491c());
                }
                sb2.append(valueOf);
                sb2.append("\nretry count = ");
                sb2.append(C10873l.this.f54890F);
                C26736a.m137533h(sb2.toString());
            } catch (Exception e11) {
                C10873l c10873l = C10873l.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -100;
                }
                c10873l.m56436C0(i11);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (m104491c != 500 && m104491c != 1001 && m104491c != 1002 && m104491c != 16001) {
                    C10873l.this.f54890F++;
                } else {
                    C10873l.this.m56436C0(m104491c);
                }
                C10873l.this.f54904T = false;
                return;
            }
            throw new IllegalArgumentException("Invalid Data");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C26736a.m137533h("RECEIVE--NEW---FEED---COMMENT---" + obj.toString());
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C10873l c10873l = new C10873l();
                c10873l.m56464e0(AbstractC18069a.m96089h(jSONObject, "fid"));
                c10873l.m56468h0(AbstractC18069a.m96089h(jSONObject, "cid"));
                c10873l.m56474k0(AbstractC18069a.m96089h(jSONObject, "oid"));
                c10873l.m56459b0(AbstractC18069a.m96089h(jSONObject, "avt"));
                c10873l.m56472j0(AbstractC18069a.m96089h(jSONObject, "fun"));
                c10873l.m56463d0(AbstractC18069a.m96089h(jSONObject, "fdn"));
                c10873l.m56486q0(AbstractC18069a.m96089h(jSONObject, "tvb"));
                c10873l.m56488r0(AbstractC18069a.m96089h(jSONObject, "tim"));
                c10873l.m56480n0(AbstractC18069a.m96089h(jSONObject, "sck"));
                c10873l.m56476l0(AbstractC18069a.m96085d(jSONObject, "prt"));
                c10873l.m56482o0(2);
                c10873l.f54894J = 0;
                String m96089h = AbstractC18069a.m96089h(jSONObject, "uid");
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "tdn");
                c10873l.m56490s0(m96089h);
                if (!TextUtils.isEmpty(m96089h2)) {
                    c10873l.m56484p0(AbstractC21935u.m114542i(m96089h, m96089h2));
                }
                if (jSONObject.has("mapEffect")) {
                    c10873l.f54907W = new C31854b6(jSONObject.optJSONArray("mapEffect"));
                }
                c10873l.m56470i0(AbstractC18069a.m96089h(jSONObject, "con"));
                c10873l.f54938w = 0;
                c10873l.f54893I = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                c10873l.f54902R = false;
                c10873l.f54903S = 0;
                if (jSONObject.has("attach")) {
                    c10873l.f54891G = new C10872k(AbstractC18069a.m96091j(jSONObject, "attach"));
                }
                C10873l.this.m56440E0(c10873l);
            } catch (Exception e11) {
                C10873l.this.m56436C0(-100);
                e11.printStackTrace();
            }
            C10873l c10873l2 = C10873l.this;
            c10873l2.f54890F++;
            c10873l2.f54904T = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$h */
    /* loaded from: classes5.dex */
    public class h implements InterfaceC20094a {
        h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            Object valueOf;
            try {
                StringBuilder sb2 = new StringBuilder("Post---COMMENT---FEED-PHOTO---TEXT-STICKER failed");
                sb2.append("\nCommentId = ");
                sb2.append(C10873l.this.f54917d);
                sb2.append("\nerror code = ");
                if (c20096c == null) {
                    valueOf = "NULL";
                } else {
                    valueOf = Integer.valueOf(c20096c.m104491c());
                }
                sb2.append(valueOf);
                sb2.append("\nretry count = ");
                sb2.append(C10873l.this.f54890F);
                C26736a.m137533h(sb2.toString());
            } catch (Exception e11) {
                C10873l c10873l = C10873l.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -100;
                }
                c10873l.m56436C0(i11);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (m104491c != 500 && m104491c != 1001 && m104491c != 1002 && m104491c != 16001) {
                    C10873l.this.f54890F++;
                } else {
                    C10873l.this.m56436C0(m104491c);
                }
                C10873l.this.f54904T = false;
                return;
            }
            throw new IllegalArgumentException("Invalid Data");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C26736a.m137533h("RECEIVE---NEW---FEED-PHOTO---COMMENT---" + obj.toString());
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C10873l c10873l = new C10873l();
                c10873l.m56464e0(AbstractC18069a.m96089h(jSONObject, "fid"));
                c10873l.m56468h0(AbstractC18069a.m96089h(jSONObject, "cid"));
                c10873l.m56474k0(AbstractC18069a.m96089h(jSONObject, "oid"));
                c10873l.m56459b0(AbstractC18069a.m96089h(jSONObject, "avt"));
                c10873l.m56472j0(AbstractC18069a.m96089h(jSONObject, "fun"));
                c10873l.m56463d0(AbstractC18069a.m96089h(jSONObject, "fdn"));
                c10873l.m56486q0(AbstractC18069a.m96089h(jSONObject, "tvb"));
                c10873l.m56488r0(AbstractC18069a.m96089h(jSONObject, "tim"));
                c10873l.m56480n0(AbstractC18069a.m96089h(jSONObject, "sck"));
                c10873l.m56476l0(AbstractC18069a.m96085d(jSONObject, "prt"));
                c10873l.m56466g0(C10873l.this.f54915c);
                c10873l.m56482o0(2);
                c10873l.f54894J = 1;
                String m96089h = AbstractC18069a.m96089h(jSONObject, "uid");
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "tdn");
                c10873l.m56490s0(m96089h);
                if (!TextUtils.isEmpty(m96089h2)) {
                    c10873l.m56484p0(AbstractC21935u.m114542i(m96089h, m96089h2));
                }
                if (jSONObject.has("mapEffect")) {
                    c10873l.f54907W = new C31854b6(jSONObject.optJSONArray("mapEffect"));
                }
                c10873l.m56470i0(AbstractC18069a.m96089h(jSONObject, "con"));
                c10873l.f54938w = 0;
                c10873l.f54893I = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                c10873l.f54902R = false;
                c10873l.f54903S = 0;
                if (jSONObject.has("attach")) {
                    c10873l.f54891G = new C10872k(AbstractC18069a.m96091j(jSONObject, "attach"));
                }
                C10873l.this.m56440E0(c10873l);
            } catch (Exception e11) {
                C10873l.this.m56436C0(-100);
                e11.printStackTrace();
            }
            C10873l c10873l2 = C10873l.this;
            c10873l2.f54890F++;
            c10873l2.f54904T = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$i */
    /* loaded from: classes5.dex */
    public class i implements InterfaceC24232j {

        /* renamed from: a */
        final /* synthetic */ String f54951a;

        i(String str) {
            this.f54951a = str;
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: a */
        public void mo14379a(AbstractC25752r.b bVar) {
            C10873l.this.m56422G(this.f54951a, bVar.m132889b());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: b */
        public void mo14380b(AbstractC25752r.a aVar) {
            C10873l.this.m56421F(this.f54951a, aVar.m132886a());
        }

        @Override // od0.InterfaceC24232j
        /* renamed from: c */
        public void mo14381c(long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.controls.l$j */
    /* loaded from: classes5.dex */
    public class j implements InterfaceC20094a {
        j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            Object valueOf;
            try {
                StringBuilder sb2 = new StringBuilder("Post---COMMENT---FEED-PHOTO---TEXT-PHOTO---FAILED");
                sb2.append("\nCommentId = ");
                sb2.append(C10873l.this.f54917d);
                sb2.append("\nerror code = ");
                if (c20096c == null) {
                    valueOf = "NULL";
                } else {
                    valueOf = Integer.valueOf(c20096c.m104491c());
                }
                sb2.append(valueOf);
                sb2.append("\nretry count = ");
                sb2.append(C10873l.this.f54890F);
                C26736a.m137533h(sb2.toString());
            } catch (Exception e11) {
                C10873l c10873l = C10873l.this;
                if (c20096c != null) {
                    i11 = c20096c.m104491c();
                } else {
                    i11 = -100;
                }
                c10873l.m56436C0(i11);
                e11.printStackTrace();
            }
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (m104491c != 500 && m104491c != 1001 && m104491c != 1002 && m104491c != 16001) {
                    C10873l.this.f54890F++;
                } else {
                    C10873l.this.m56436C0(m104491c);
                }
                C10873l c10873l2 = C10873l.this;
                c10873l2.f54904T = false;
                c10873l2.f54916c0 = false;
                return;
            }
            throw new IllegalArgumentException("Invalid Data");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C26736a.m137533h("RECEIVE---NEW---FEED-PHOTO----COMMENT---" + obj.toString());
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C10873l c10873l = new C10873l();
                c10873l.m56464e0(AbstractC18069a.m96089h(jSONObject, "fid"));
                c10873l.m56468h0(AbstractC18069a.m96089h(jSONObject, "cid"));
                c10873l.m56474k0(AbstractC18069a.m96089h(jSONObject, "oid"));
                c10873l.m56459b0(AbstractC18069a.m96089h(jSONObject, "avt"));
                c10873l.m56472j0(AbstractC18069a.m96089h(jSONObject, "fun"));
                c10873l.m56463d0(AbstractC18069a.m96089h(jSONObject, "fdn"));
                c10873l.m56486q0(AbstractC18069a.m96089h(jSONObject, "tvb"));
                c10873l.m56488r0(AbstractC18069a.m96089h(jSONObject, "tim"));
                c10873l.m56480n0(AbstractC18069a.m96089h(jSONObject, "sck"));
                c10873l.m56476l0(AbstractC18069a.m96085d(jSONObject, "prt"));
                c10873l.m56466g0(C10873l.this.f54915c);
                c10873l.m56482o0(2);
                c10873l.f54894J = 1;
                String m96089h = AbstractC18069a.m96089h(jSONObject, "uid");
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "tdn");
                c10873l.m56490s0(m96089h);
                if (!TextUtils.isEmpty(m96089h2)) {
                    c10873l.m56484p0(AbstractC21935u.m114542i(m96089h, m96089h2));
                }
                if (jSONObject.has("mapEffect")) {
                    c10873l.f54907W = new C31854b6(jSONObject.optJSONArray("mapEffect"));
                }
                c10873l.m56470i0(AbstractC18069a.m96089h(jSONObject, "con"));
                c10873l.f54938w = 0;
                c10873l.f54893I = AbstractC18069a.m96085d(jSONObject, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                c10873l.f54902R = false;
                c10873l.f54903S = 0;
                if (jSONObject.has("attach")) {
                    c10873l.f54891G = new C10872k(AbstractC18069a.m96091j(jSONObject, "attach"));
                }
                C10873l.this.m56440E0(c10873l);
            } catch (Exception e11) {
                C10873l.this.m56436C0(-100);
                e11.printStackTrace();
            }
            C10873l c10873l2 = C10873l.this;
            c10873l2.f54890F++;
            c10873l2.f54904T = false;
            c10873l2.f54916c0 = false;
        }
    }

    public C10873l() {
        this.f54934s = 2;
        this.f54893I = 0;
        this.f54934s = 2;
        try {
            this.f54935t = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.btn_see_more);
        } catch (Exception unused) {
            this.f54935t = "Xem thêm";
        }
        this.f54891G = null;
        this.f54893I = 0;
        this.f54907W = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.f54912a0 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public void m56421F(String str, C20096c c20096c) {
        Object valueOf;
        try {
            m56456Y(str);
            this.f54890F++;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Upload failed; errorCode=");
            if (c20096c == null) {
                valueOf = "UNKNOWN";
            } else {
                valueOf = Integer.valueOf(c20096c.m104491c());
            }
            sb2.append(valueOf);
            sb2.append("; path=");
            sb2.append(str);
            C26736a.m137533h(sb2.toString());
            if (c20096c != null) {
                int m104491c = c20096c.m104491c();
                if (!m56453S() || m104491c == 19001 || m104491c == 19002 || m104491c == 19003 || m104491c == 18002 || m104491c == -17 || m104491c == -18 || m104491c == -19 || m104491c == -20 || m104491c == -69) {
                    m56436C0(m104491c);
                }
            } else if (!m56453S()) {
                m56436C0(-101);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            m56436C0(-100);
        }
        m56492t0(1, null);
        this.f54904T = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m56422G(String str, AbstractC25751q abstractC25751q) {
        try {
            C26736a.m137533h("Upload--Comment---Photo---Success");
            m56456Y(str);
            m56492t0(2, abstractC25751q);
            m56458a0();
            int i11 = this.f54894J;
            if (i11 == 0) {
                m56467h();
            } else if (i11 == 1) {
                m56469i();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            m56436C0(-100);
            this.f54904T = false;
        }
    }

    /* renamed from: T */
    private void m56423T(long j11, int i11) {
        try {
            C25482o c25482o = C25482o.f122075a;
            c25482o.m132000h(j11, this.f54893I, i11);
            if (m56435C() == 4) {
                c25482o.m132001i(j11, Integer.valueOf(i11));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: U */
    private void m56424U(long j11, long j12) {
        try {
            C25482o c25482o = C25482o.f122075a;
            c25482o.m132015w(j11, j12, this.f54893I);
            if (m56435C() == 4) {
                c25482o.m132016x(j11);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: V */
    private String m56425V(String str) {
        if (AbstractC23309i.m121739b2()) {
            try {
                Matcher matcher = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(str);
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                while (matcher.find()) {
                    arrayList.add(new Pair(Integer.valueOf(i11), Integer.valueOf(matcher.start())));
                    i11 = matcher.end();
                }
                if (i11 != str.length()) {
                    arrayList.add(new Pair(Integer.valueOf(i11), Integer.valueOf(str.length())));
                }
                String str2 = "";
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Pair pair = (Pair) arrayList.get(i13);
                    String str3 = str2 + str.substring(i12, ((Integer) pair.first).intValue());
                    String substring = str.substring(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue());
                    Matcher matcher2 = Patterns.PHONE.matcher(substring);
                    String str4 = "";
                    int i14 = 0;
                    while (matcher2.find()) {
                        int start = matcher2.start();
                        int end = matcher2.end();
                        String m15603v = AbstractC3102n.m15603v(matcher2.group(0));
                        if (AbstractC3102n.m15592k(m15603v)) {
                            str4 = str4 + substring.substring(i14, start) + "<a href=\"zm://PhoneNumber/" + m15603v + "\">" + substring.substring(start, end) + "</a>";
                            i14 = end;
                        }
                    }
                    str2 = str3 + (str4 + substring.substring(Math.min(i14, substring.length())));
                    i12 = ((Integer) pair.second).intValue();
                }
                return str2 + str.substring(Math.min(i12, str.length()));
            } catch (Exception e11) {
                e11.printStackTrace();
                return str;
            }
        }
        return str;
    }

    /* renamed from: e */
    public static C10873l m56428e(String str, String str2, String str3, String str4, String str5, String str6, String str7, C25630b c25630b, int i11, TrackingSource trackingSource) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C10873l c10873l = new C10873l();
        try {
            c10873l.m56482o0(0);
            c10873l.m56464e0(str);
            c10873l.m56466g0(str3);
            c10873l.m56465f0(str2);
            c10873l.m56468h0(mo124311f + "");
            c10873l.m56474k0(CoreUtility.f89233i);
            c10873l.m56459b0(AbstractC23304d.f113368c0.f42446v);
            c10873l.m56472j0(AbstractC23304d.f113368c0.f42443u);
            c10873l.m56463d0(AbstractC23304d.f113368c0.f42437s);
            c10873l.m56486q0(AbstractC23160o0.m119222U0(System.currentTimeMillis(), false));
            c10873l.f54938w = 0;
            c10873l.m56484p0(str4);
            c10873l.m56490s0(str5);
            c10873l.m56478m0(str6);
            c10873l.m56470i0(str7);
            c10873l.f54900P = c25630b.m132429g();
            c10873l.f54893I = 1;
            c10873l.f54891G = new C10872k("", "", c25630b.m132429g(), c25630b.m132427f(), c25630b.m132434l());
            c10873l.m56432A0(1);
            c10873l.f54888D = mo124311f;
            c10873l.f54902R = true;
            c10873l.f54903S = 1;
            c10873l.f54894J = i11;
            c10873l.f54914b0 = trackingSource;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c10873l;
    }

    /* renamed from: f */
    public static C10873l m56429f(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, TrackingSource trackingSource) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C10873l c10873l = new C10873l();
        try {
            c10873l.m56482o0(0);
            c10873l.m56464e0(str);
            c10873l.m56466g0(str3);
            c10873l.m56465f0(str2);
            c10873l.m56468h0(mo124311f + "");
            c10873l.m56474k0(CoreUtility.f89233i);
            c10873l.m56459b0(AbstractC23304d.f113368c0.f42446v);
            c10873l.m56472j0(AbstractC23304d.f113368c0.f42443u);
            c10873l.m56463d0(AbstractC23304d.f113368c0.f42437s);
            c10873l.m56486q0(AbstractC23160o0.m119222U0(System.currentTimeMillis(), false));
            c10873l.f54938w = 0;
            c10873l.m56484p0(str4);
            c10873l.m56490s0(str5);
            c10873l.m56478m0(str6);
            c10873l.m56470i0(str7);
            c10873l.f54900P = -1;
            c10873l.f54893I = 0;
            c10873l.m56432A0(1);
            c10873l.f54888D = mo124311f;
            c10873l.f54902R = true;
            c10873l.f54903S = 1;
            c10873l.f54894J = i11;
            c10873l.f54914b0 = trackingSource;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c10873l;
    }

    /* renamed from: g */
    public static C10873l m56430g(String str, String str2, String str3, String str4, String str5, String str6, String str7, MediaItem mediaItem, int i11, TrackingSource trackingSource) {
        long mo124311f = C23793c.m124316k().mo124311f();
        C10873l c10873l = new C10873l();
        try {
            c10873l.m56482o0(0);
            c10873l.m56464e0(str);
            c10873l.m56466g0(str3);
            c10873l.m56465f0(str2);
            c10873l.m56468h0(mo124311f + "");
            c10873l.m56474k0(CoreUtility.f89233i);
            c10873l.m56459b0(AbstractC23304d.f113368c0.f42446v);
            c10873l.m56472j0(AbstractC23304d.f113368c0.f42443u);
            c10873l.m56463d0(AbstractC23304d.f113368c0.f42437s);
            c10873l.m56486q0(AbstractC23160o0.m119222U0(System.currentTimeMillis(), false));
            c10873l.f54938w = 0;
            c10873l.m56484p0(str4);
            c10873l.m56490s0(str5);
            c10873l.m56478m0(str6);
            c10873l.m56470i0(str7);
            c10873l.f54893I = 2;
            String m41146h0 = mediaItem.m41146h0();
            ItemAlbumMobile itemAlbumMobile = new ItemAlbumMobile();
            itemAlbumMobile.f42593q = CoreUtility.f89233i;
            itemAlbumMobile.f42595r = new Random().nextInt(Integer.MAX_VALUE) + "";
            itemAlbumMobile.f42607x = m41146h0;
            itemAlbumMobile.f42611z = m41146h0;
            itemAlbumMobile.f42548C = m41146h0;
            c10873l.f54901Q = itemAlbumMobile;
            c10873l.f54891G = new C10872k(m41146h0, m41146h0, AbstractC23067f6.m118367a(m41146h0), mediaItem.m41119R());
            c10873l.m56432A0(1);
            c10873l.f54888D = mo124311f;
            c10873l.f54902R = true;
            c10873l.f54903S = 1;
            c10873l.f54894J = i11;
            c10873l.f54895K.put(m41146h0, mediaItem.m41175w());
            c10873l.f54914b0 = trackingSource;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return c10873l;
    }

    /* renamed from: A */
    public CharSequence m56431A() {
        if (!TextUtils.isEmpty(this.f54930o)) {
            return this.f54930o;
        }
        return this.f54928m;
    }

    /* renamed from: A0 */
    public synchronized void m56432A0(int i11) {
        this.f54887C = i11;
    }

    /* renamed from: B */
    public ArrayList m56433B() {
        if (!this.f54936u && !TextUtils.isEmpty(this.f54930o)) {
            return this.f54886B;
        }
        return this.f54885A;
    }

    /* renamed from: B0 */
    public void m56434B0() {
        C26736a.m137533h("SET---STATE_POST_DELETE");
        this.f54892H = new C10881t(3, this, this.f54917d);
        C0824j.m2153b(new e());
        m56432A0(5);
    }

    /* renamed from: C */
    public synchronized int m56435C() {
        return this.f54887C;
    }

    /* renamed from: C0 */
    public void m56436C0(int i11) {
        C26736a.m137533h("SET--STATE_POST_FAILED");
        this.f54889E = C23793c.m124316k().mo124311f();
        this.f54892H = new C10881t(0, this, i11);
        C0824j.m2153b(new b());
        m56423T(this.f54920e0, i11);
        m56432A0(2);
    }

    /* renamed from: D */
    public String m56437D() {
        int i11 = this.f54894J;
        if (i11 == 0) {
            return m56487r();
        }
        if (i11 == 1) {
            return m56491t();
        }
        return "";
    }

    /* renamed from: D0 */
    public void m56438D0() {
        try {
            C26736a.m137533h("Retry " + this.f54917d);
            this.f54905U = false;
            this.f54904T = false;
            this.f54918d0 = false;
            this.f54916c0 = false;
            m56432A0(4);
            this.f54888D = C23793c.m124316k().mo124311f();
            this.f54890F = 0;
            this.f54889E = 0L;
            this.f54892H = new C10881t(2, this, this.f54917d);
            C0824j.m2153b(new d());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public String m56439E() {
        C10874m c10874m = this.f54899O;
        if (c10874m != null) {
            return c10874m.m56508d();
        }
        return "";
    }

    /* renamed from: E0 */
    public void m56440E0(C10873l c10873l) {
        C26736a.m137533h("SET---STATE_POST_SUCCESS");
        this.f54892H = new C10881t(1, c10873l, this.f54917d);
        C0824j.m2153b(new c());
        AbstractC23304d.f113308N2 = AbstractC20789d.m108474h(c10873l);
        m56424U(this.f54920e0, System.currentTimeMillis() - this.f54920e0);
        m56432A0(3);
    }

    /* renamed from: F0 */
    public JSONObject m56441F0() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f54911a;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("fid", str);
            String str3 = this.f54917d;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("cid", str3);
            String str4 = this.f54919e;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("oid", str4);
            String str5 = this.f54923h;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("avt", str5);
            String str6 = this.f54924i;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("fun", str6);
            String str7 = this.f54925j;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("fdn", str7);
            String str8 = this.f54932q;
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("tvb", str8);
            String str9 = this.f54933r;
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("tim", str9);
            String str10 = this.f54926k;
            if (str10 == null) {
                str10 = "";
            }
            jSONObject.put("sck", str10);
            jSONObject.put("prt", this.f54931p);
            String str11 = this.f54921f;
            if (str11 == null) {
                str11 = "";
            }
            jSONObject.put("uid", str11);
            String str12 = this.f54922g;
            if (str12 == null) {
                str12 = "";
            }
            jSONObject.put("replyId", str12);
            String str13 = this.f54927l;
            if (str13 == null) {
                str13 = "";
            }
            jSONObject.put("tdn", str13);
            jSONObject.put("con", this.f54928m);
            jSONObject.put("status", this.f54934s);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f54893I);
            C10872k c10872k = this.f54891G;
            if (c10872k == null) {
                obj = "";
            } else {
                obj = c10872k.m56420a();
            }
            jSONObject.put("attach", obj);
            jSONObject.put("localCTime", this.f54888D);
            jSONObject.put("mode", this.f54894J);
            jSONObject.put("picid", this.f54915c);
            jSONObject.put("stickerId", this.f54900P);
            if (this.f54893I == 2 && this.f54901Q != null) {
                JSONObject jSONObject2 = new JSONObject();
                String str14 = this.f54901Q.f42595r;
                if (str14 == null) {
                    str14 = "";
                }
                jSONObject2.put("photoid", str14);
                String str15 = this.f54901Q.f42548C;
                if (str15 == null) {
                    str15 = "";
                }
                jSONObject2.put("thumb", str15);
                String str16 = this.f54901Q.f42607x;
                if (str16 != null) {
                    str2 = str16;
                }
                jSONObject2.put("origin", str2);
                jSONObject.put("photo", jSONObject2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: H */
    void m56442H(SpannableString spannableString, boolean z11) {
        try {
            if (!AbstractC23309i.m121072J2()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (z11) {
                ArrayList arrayList2 = this.f54941z;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                this.f54886B = C31839a6.m152968b().m152971c(spannableString, arrayList, this.f54907W);
                return;
            }
            ArrayList arrayList3 = this.f54939x;
            if (arrayList3 != null) {
                arrayList.addAll(arrayList3);
            }
            this.f54885A = C31839a6.m152968b().m152971c(spannableString, arrayList, this.f54907W);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I */
    void m56443I(String str) {
        CharSequence charSequence;
        if (!TextUtils.isEmpty(this.f54927l)) {
            str = String.format("<a href=\"zm://ProfileComment/%s\">%s</a> ", this.f54921f, m56501y()) + str;
        }
        this.f54939x = new ArrayList();
        String m119747k = AbstractC23244v8.m119747k(str.replaceAll("(\r\n|\n)", "<br/>"));
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
            if (matcher.find() && !m119747k.contains("<a href=\"http")) {
                m119747k = matcher.group().startsWith("https://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String m56425V = m56425V(m119747k);
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m56425V);
            while (matcher2.find()) {
                String group = matcher2.group(0);
                if (group.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                    String str2 = "";
                    if (matcher3.find()) {
                        String replace = matcher3.group(1).replace("\"", "");
                        str2 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group2 = matcher2.group(1);
                    CharSequence m114542i = AbstractC21935u.m114542i(str2, group2);
                    if (!group2.equals(m114542i)) {
                        charSequence = group.replace(group2, m114542i);
                    } else {
                        charSequence = group;
                    }
                    if (m56425V.contains(group) && !group.equals(charSequence)) {
                        m56425V = m56425V.replace(group, charSequence);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m56425V).replaceAll("&lt;"));
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        String m40689a = new TrackingSource.C7894b().m40694f(11).m40691c(this.f54911a).m40693e(0).m40690b(this.f54917d).m40692d(this.f54913b).m40689a();
        if (spans.length > 0) {
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    c10866e.f54832J = 11;
                    if (!TextUtils.isEmpty(m40689a)) {
                        c10866e.f54833K = m40689a;
                    }
                    this.f54939x.add(c10866e);
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
            m56442H(spannableString, false);
            this.f54928m = C28652r.m143349v().m143350A(spannableString);
            return;
        }
        SpannableString spannableString2 = new SpannableString(m56425V.replaceAll("<br/>", "\n"));
        m56442H(spannableString2, false);
        this.f54928m = C28652r.m143349v().m143350A(spannableString2);
    }

    /* renamed from: J */
    void m56444J(String str) {
        CharSequence charSequence;
        this.f54940y = new ArrayList();
        String m119747k = AbstractC23244v8.m119747k(str.replaceAll("(\r\n|\n)", "<br/>"));
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
            if (matcher.find() && !m119747k.contains("<a href=\"http")) {
                m119747k = matcher.group().startsWith("https://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        String m56425V = m56425V(m119747k);
        try {
            Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m56425V);
            while (matcher2.find()) {
                String group = matcher2.group(0);
                if (group.startsWith("<a href=\"zm://Profile/")) {
                    Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                    String str2 = "";
                    if (matcher3.find()) {
                        String replace = matcher3.group(1).replace("\"", "");
                        str2 = replace.substring(replace.lastIndexOf("/") + 1);
                    }
                    String group2 = matcher2.group(1);
                    CharSequence m114542i = AbstractC21935u.m114542i(str2, group2);
                    if (!group2.equals(m114542i)) {
                        charSequence = group.replace(group2, m114542i);
                    } else {
                        charSequence = group;
                    }
                    if (m56425V.contains(group) && !group.equals(charSequence)) {
                        m56425V = m56425V.replace(group, charSequence);
                    }
                }
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m56425V).replaceAll("&lt;"));
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
        String m40689a = new TrackingSource.C7894b().m40694f(11).m40691c(this.f54911a).m40693e(0).m40690b(this.f54917d).m40692d(this.f54913b).m40689a();
        if (spans.length > 0) {
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    c10866e.f54832J = 11;
                    if (!TextUtils.isEmpty(m40689a)) {
                        c10866e.f54833K = m40689a;
                    }
                    this.f54940y.add(c10866e);
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
            this.f54929n = C28652r.m143349v().m143350A(spannableString);
            return;
        }
        this.f54929n = C28652r.m143349v().m143353D(m56425V.replaceAll("<br/>", "\n"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:            r13 = r13.split(r1);        r2 = "";        r5 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:            if (r5 >= 3) goto L99;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:            r2 = r2 + r13[r5] + r1;        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:            r13 = r2;     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m56445K(String str) {
        String str2;
        String str3;
        String str4;
        CharSequence charSequence;
        try {
            String property = System.getProperty("line.separator");
            int length = str.split(property).length;
            Object[] objArr = new Object[2];
            objArr[0] = this.f54917d;
            if (TextUtils.isEmpty(this.f54935t)) {
                str2 = "Xem thêm";
            } else {
                str2 = this.f54935t;
            }
            objArr[1] = str2;
            String format = String.format("…<a href=\"zm://CommentSeeMore/%s\">%s</a>", objArr);
            if (TextUtils.isEmpty(this.f54927l)) {
                str3 = "";
            } else {
                str3 = String.format("<a href=\"zm://ProfileComment/%s\">%s</a> ", this.f54921f, m56501y());
            }
            if (length <= 3 && str.length() <= 150) {
                this.f54930o = "";
                return;
            }
            if (str.length() > 150) {
                int lastIndexOf = str.lastIndexOf(" ", 149);
                int lastIndexOf2 = str.lastIndexOf(property, 149);
                if (lastIndexOf > 0) {
                    str = str.substring(0, lastIndexOf);
                } else if (lastIndexOf2 > 0) {
                    str = str.substring(0, lastIndexOf2);
                } else {
                    str = str.substring(0, 149);
                }
            }
            String str5 = str + format;
            if (!TextUtils.isEmpty(str3)) {
                str5 = str3 + str5;
            }
            this.f54941z = new ArrayList();
            String m119747k = AbstractC23244v8.m119747k(str5.replaceAll("(\r\n|\n)", "<br/>"));
            try {
                Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(m119747k);
                if (matcher.find() && !m119747k.contains("<a href=\"http")) {
                    m119747k = matcher.group().startsWith("https://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            String m56425V = m56425V(m119747k);
            try {
                Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(m56425V);
                while (matcher2.find()) {
                    String group = matcher2.group(0);
                    if (group.startsWith("<a href=\"zm://Profile/")) {
                        Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                        if (!matcher3.find()) {
                            str4 = "";
                        } else {
                            String replace = matcher3.group(1).replace("\"", "");
                            str4 = replace.substring(replace.lastIndexOf("/") + 1);
                        }
                        String group2 = matcher2.group(1);
                        CharSequence m114542i = AbstractC21935u.m114542i(str4, group2);
                        if (!group2.equals(m114542i)) {
                            charSequence = group.replace(group2, m114542i);
                        } else {
                            charSequence = group;
                        }
                        if (m56425V.contains(group) && !group.equals(charSequence)) {
                            m56425V = m56425V.replace(group, charSequence);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(m56425V).replaceAll("&lt;"));
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            String m40689a = new TrackingSource.C7894b().m40694f(11).m40691c(this.f54911a).m40693e(0).m40690b(this.f54917d).m40692d(this.f54913b).m40689a();
            if (spans.length > 0) {
                for (Object obj : spans) {
                    int spanStart = fromHtml.getSpanStart(obj);
                    int spanEnd = fromHtml.getSpanEnd(obj);
                    int spanFlags = fromHtml.getSpanFlags(obj);
                    if (obj instanceof URLSpan) {
                        C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                        c10866e.f54832J = 11;
                        if (!TextUtils.isEmpty(m40689a)) {
                            c10866e.f54833K = m40689a;
                        }
                        this.f54941z.add(c10866e);
                        spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                    }
                }
                m56442H(spannableString, true);
                this.f54930o = C28652r.m143349v().m143350A(spannableString);
                return;
            }
            SpannableString spannableString2 = new SpannableString(m56425V.replaceAll("<br/>", "\n"));
            m56442H(spannableString2, true);
            this.f54930o = C28652r.m143349v().m143350A(spannableString2);
        } catch (Exception e13) {
            e13.printStackTrace();
            this.f54930o = "";
        }
    }

    /* renamed from: L */
    public boolean m56446L() {
        return this.f54903S == 1;
    }

    /* renamed from: M */
    public boolean m56447M() {
        return this.f54936u;
    }

    /* renamed from: N */
    public boolean m56448N() {
        if (C23793c.m124316k().mo124311f() - this.f54889E > 900000) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public boolean m56449O() {
        return this.f54887C == 2;
    }

    /* renamed from: P */
    public boolean m56450P() {
        return this.f54937v;
    }

    /* renamed from: Q */
    boolean m56451Q() {
        C10874m c10874m = this.f54899O;
        if (c10874m != null && c10874m.f54954a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public boolean m56452R() {
        int i11 = this.f54887C;
        return i11 == 1 || i11 == 4;
    }

    /* renamed from: S */
    public boolean m56453S() {
        if (C23793c.m124316k().mo124311f() - this.f54888D <= 1800000 && this.f54890F <= 5) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public void m56454W() {
        try {
            int i11 = this.f54887C;
            if ((i11 == 4 || i11 == 1) && !this.f54904T && !this.f54905U) {
                int i12 = this.f54893I;
                if (i12 != 0 && i12 != 1) {
                    if (i12 == 2) {
                        m56471j();
                    }
                } else {
                    int i13 = this.f54894J;
                    if (i13 == 0) {
                        m56473k();
                    } else if (i13 == 1) {
                        m56475l();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X */
    synchronized void m56455X() {
        try {
            C26736a.m137533h("removeAllRequestUpload");
            Iterator it = this.f54896L.values().iterator();
            while (it.hasNext()) {
                C24230h c24230h = (C24230h) it.next();
                if (c24230h != null) {
                    c24230h.m126509j();
                    C24226d.m126388J(c24230h);
                    it.remove();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    void m56456Y(String str) {
        try {
            C26736a.m137533h("Remove request upload: " + str);
            C24230h c24230h = (C24230h) this.f54896L.get(str);
            if (c24230h != null) {
                c24230h.m126509j();
                C24226d.m126388J(c24230h);
                this.f54896L.remove(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z */
    public void m56457Z(String str) {
        String str2;
        Map map;
        ItemAlbumMobile itemAlbumMobile;
        try {
            C26736a.m137533h("restoreUploadInfo: " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            C10874m c10874m = new C10874m();
            this.f54899O = c10874m;
            c10874m.m56506b(jSONObject);
            if (!jSONObject.isNull("log_cam")) {
                str2 = jSONObject.getString("log_cam");
            } else {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2) && (map = this.f54895K) != null && (itemAlbumMobile = this.f54901Q) != null) {
                map.put(itemAlbumMobile.f42607x, str2);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a0 */
    synchronized void m56458a0() {
        JSONObject jSONObject;
        Map map;
        try {
            try {
                String m56439E = m56439E();
                if (TextUtils.isEmpty(m56439E)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(m56439E);
                }
                ItemAlbumMobile itemAlbumMobile = this.f54901Q;
                if (itemAlbumMobile != null && (map = this.f54895K) != null && map.containsKey(itemAlbumMobile.f42607x)) {
                    jSONObject.put("log_cam", this.f54895K.get(this.f54901Q.f42607x));
                }
                String jSONObject2 = jSONObject.toString();
                C26736a.m137533h("saveUploadInfoToDb: " + jSONObject2);
                C0824j.m2153b(new f(jSONObject2));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b0 */
    public void m56459b0(String str) {
        this.f54923h = str;
    }

    /* renamed from: c */
    void m56460c(String str, C24230h c24230h) {
        try {
            C26736a.m137533h("Add request upload: " + str);
            this.f54896L.put(str, c24230h);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c0 */
    public void m56461c0(int i11) {
        this.f54903S = i11;
    }

    /* renamed from: d */
    public synchronized void m56462d() {
        try {
            this.f54905U = true;
            m56455X();
            this.f54904T = false;
            this.f54918d0 = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d0 */
    public void m56463d0(String str) {
        this.f54925j = str;
    }

    /* renamed from: e0 */
    public void m56464e0(String str) {
        this.f54911a = str;
    }

    /* renamed from: f0 */
    public void m56465f0(String str) {
        this.f54913b = str;
    }

    /* renamed from: g0 */
    public void m56466g0(String str) {
        this.f54915c = str;
    }

    /* renamed from: h */
    void m56467h() {
        String str;
        try {
            C26736a.m137533h("POST---COMMENT---FEED---TEXT-PHOTO");
            C10874m c10874m = this.f54899O;
            if (c10874m != null && c10874m.f54960g != null) {
                if (this.f54918d0) {
                    return;
                }
                this.f54918d0 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a());
                if (!TextUtils.isEmpty(this.f54921f)) {
                    str = this.f54921f;
                } else {
                    str = "0";
                }
                String str2 = str;
                this.f54900P = -1;
                long m56481o = m56481o();
                String str3 = this.f54911a;
                String charSequence = this.f54929n.toString();
                String str4 = this.f54922g;
                int i11 = this.f54900P;
                C10874m c10874m2 = this.f54899O;
                C23307g c23307g = c10874m2.f54960g;
                c0766k.mo1554V4(str3, charSequence, str2, str4, i11, c23307g.f113474a, c23307g.f113475b, c10874m2.f54959f, m56481o, this.f54914b0);
                return;
            }
            this.f54904T = false;
        } catch (Exception e11) {
            this.f54904T = false;
            this.f54918d0 = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: h0 */
    public void m56468h0(String str) {
        this.f54917d = str;
    }

    /* renamed from: i */
    void m56469i() {
        String str;
        try {
            C26736a.m137533h("POST---COMMENT---FEED-PHOTO---TEXT-PHOTO");
            C10874m c10874m = this.f54899O;
            if (c10874m != null && c10874m.f54960g != null) {
                if (this.f54916c0) {
                    return;
                }
                this.f54916c0 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new j());
                if (!TextUtils.isEmpty(this.f54921f)) {
                    str = this.f54921f;
                } else {
                    str = "0";
                }
                String str2 = str;
                this.f54900P = -1;
                long m56481o = m56481o();
                String str3 = this.f54915c;
                String charSequence = this.f54929n.toString();
                String str4 = this.f54922g;
                int i11 = this.f54900P;
                C10874m c10874m2 = this.f54899O;
                C23307g c23307g = c10874m2.f54960g;
                c0766k.mo1523R5(str3, charSequence, str2, str4, i11, c23307g.f113474a, c23307g.f113475b, c10874m2.f54959f, m56481o, this.f54914b0);
                return;
            }
            this.f54904T = false;
        } catch (Exception e11) {
            this.f54904T = false;
            this.f54916c0 = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: i0 */
    public void m56470i0(String str) {
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        m56445K(normalize);
        m56444J(normalize);
        m56443I(normalize);
    }

    /* renamed from: j */
    void m56471j() {
        String str;
        String str2;
        String str3;
        try {
            if (!this.f54904T && C23055e5.m118271f()) {
                if (AbstractC23238v2.m119727l()) {
                    this.f54904T = true;
                    if (m56451Q()) {
                        int i11 = this.f54894J;
                        if (i11 == 0) {
                            m56467h();
                            return;
                        } else {
                            if (i11 == 1) {
                                m56469i();
                                return;
                            }
                            return;
                        }
                    }
                    ItemAlbumMobile itemAlbumMobile = this.f54901Q;
                    if (itemAlbumMobile != null && !TextUtils.isEmpty(itemAlbumMobile.f42607x) && AbstractC23041d2.m118194A(this.f54901Q.f42607x)) {
                        if (AbstractC23254w8.m119859g(this.f54901Q.f42611z)) {
                            str = this.f54901Q.f42611z;
                        } else {
                            str = this.f54901Q.f42607x;
                        }
                        m56456Y(str);
                        m56492t0(0, null);
                        C24230h m126395Q = C24226d.m126395Q(m56479n(str), EnumC24229g.f116969H, str, 0L, false);
                        i iVar = new i(str);
                        if (!TextUtils.isEmpty(this.f54921f)) {
                            str2 = this.f54921f;
                        } else {
                            str2 = "0";
                        }
                        if (this.f54895K.containsKey(str)) {
                            str3 = (String) this.f54895K.get(str);
                        } else {
                            str3 = "";
                        }
                        m56458a0();
                        m126395Q.m126505h(iVar);
                        m126395Q.m126482B0(str2);
                        m126395Q.m126504g0(this.f54929n.toString());
                        m126395Q.m126501d0(str3);
                        m126395Q.m126502e0(Long.parseLong(this.f54917d));
                        m126395Q.m126526t0(2);
                        m56460c(str, m126395Q);
                        C24226d.m126402Z(m126395Q);
                        return;
                    }
                    m56434B0();
                    this.f54904T = false;
                    return;
                }
                throw new IllegalArgumentException("SD Card not mounted");
            }
        } catch (Exception e11) {
            this.f54904T = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: j0 */
    public void m56472j0(String str) {
        this.f54924i = str;
    }

    /* renamed from: k */
    void m56473k() {
        try {
            if (this.f54904T) {
                return;
            }
            this.f54904T = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new g());
            long m56481o = m56481o();
            C26736a.m137533h("PUSH---NEW---FEED---STICKER---" + this.f54900P);
            c0766k.mo1554V4(this.f54911a, this.f54929n.toString(), this.f54921f, this.f54922g, this.f54900P, 0, 0, "", m56481o, this.f54914b0);
        } catch (Exception e11) {
            this.f54904T = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: k0 */
    public void m56474k0(String str) {
        this.f54919e = str;
    }

    /* renamed from: l */
    void m56475l() {
        try {
            if (this.f54904T) {
                return;
            }
            this.f54904T = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new h());
            long m56481o = m56481o();
            C26736a.m137533h("PUSH--FEED-PHOTO---NEW---STICKER---" + this.f54900P);
            c0766k.mo1523R5(this.f54915c, this.f54929n.toString(), this.f54921f, this.f54922g, this.f54900P, 0, 0, "", m56481o, this.f54914b0);
        } catch (Exception e11) {
            this.f54904T = false;
            e11.printStackTrace();
        }
    }

    /* renamed from: l0 */
    public void m56476l0(int i11) {
        this.f54931p = i11;
    }

    /* renamed from: m */
    public ArrayList m56477m() {
        if (!this.f54936u && !TextUtils.isEmpty(this.f54930o)) {
            return this.f54941z;
        }
        return this.f54939x;
    }

    /* renamed from: m0 */
    public void m56478m0(String str) {
        this.f54922g = str;
    }

    /* renamed from: n */
    int m56479n(String str) {
        int i11;
        if (this.f54897M.containsKey(str)) {
            i11 = ((Integer) this.f54897M.get(str)).intValue();
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            i11 = new Random().nextInt(Integer.MAX_VALUE);
        }
        this.f54897M.put(str, Integer.valueOf(i11));
        return i11;
    }

    /* renamed from: n0 */
    public void m56480n0(String str) {
        this.f54926k = str;
    }

    /* renamed from: o */
    long m56481o() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!TextUtils.isEmpty(this.f54917d)) {
                long parseLong = Long.parseLong(this.f54917d);
                if (parseLong > 0) {
                    return parseLong;
                }
                return currentTimeMillis;
            }
            return currentTimeMillis;
        } catch (Exception e11) {
            e11.printStackTrace();
            return currentTimeMillis;
        }
    }

    /* renamed from: o0 */
    public void m56482o0(int i11) {
        this.f54934s = i11;
    }

    /* renamed from: p */
    public String m56483p() {
        return this.f54923h;
    }

    /* renamed from: p0 */
    public void m56484p0(String str) {
        this.f54927l = str;
    }

    /* renamed from: q */
    public String m56485q() {
        return AbstractC21935u.m114542i(this.f54919e, this.f54925j);
    }

    /* renamed from: q0 */
    public void m56486q0(String str) {
        this.f54932q = str;
    }

    /* renamed from: r */
    public String m56487r() {
        return this.f54911a;
    }

    /* renamed from: r0 */
    public void m56488r0(String str) {
        this.f54933r = str;
    }

    /* renamed from: s */
    public String m56489s() {
        return this.f54913b;
    }

    /* renamed from: s0 */
    public void m56490s0(String str) {
        this.f54921f = str;
    }

    /* renamed from: t */
    public String m56491t() {
        return this.f54915c;
    }

    /* renamed from: t0 */
    void m56492t0(int i11, AbstractC25751q abstractC25751q) {
        try {
            if (this.f54899O == null) {
                this.f54899O = new C10874m();
            }
            this.f54899O.m56505a(i11);
            this.f54899O.m56507c(abstractC25751q);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public String m56493u() {
        return this.f54917d;
    }

    /* renamed from: u0 */
    public void m56494u0(boolean z11) {
        this.f54936u = z11;
    }

    /* renamed from: v */
    public CharSequence m56495v() {
        return this.f54928m;
    }

    /* renamed from: v0 */
    public void m56496v0(boolean z11) {
        this.f54937v = z11;
    }

    /* renamed from: w */
    public String m56497w() {
        return this.f54919e;
    }

    /* renamed from: w0 */
    public void m56498w0(long j11) {
        this.f54889E = j11;
    }

    /* renamed from: x */
    public String m56499x() {
        return this.f54926k;
    }

    /* renamed from: x0 */
    public void m56500x0(boolean z11) {
        this.f54908X = z11;
    }

    /* renamed from: y */
    public String m56501y() {
        return this.f54927l;
    }

    /* renamed from: y0 */
    public void m56502y0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("list");
            boolean z11 = false;
            if (optJSONArray != null) {
                List list = this.f54910Z;
                if (list != null) {
                    list.clear();
                } else {
                    this.f54910Z = new ArrayList();
                }
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    ContactProfile contactProfile = new ContactProfile(optJSONArray.optJSONObject(i11));
                    if (!contactProfile.f42434r.equalsIgnoreCase(CoreUtility.f89233i)) {
                        this.f54910Z.add(contactProfile);
                    }
                }
            }
            this.f54909Y = jSONObject.optInt("more_like_count");
            if (jSONObject.optInt("is_like") == 1) {
                z11 = true;
            }
            this.f54908X = z11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    public String m56503z() {
        return this.f54932q;
    }

    /* renamed from: z0 */
    public void m56504z0(long j11) {
        this.f54920e0 = j11;
    }
}
