package bo;

import android.graphics.Rect;
import android.text.TextUtils;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p107dq.C18049e;
import p348mi.C23307g;
import p716zh.C31869c6;
import p716zh.C32145v4;
import vg.C28227x3;

/* renamed from: bo.q0 */
/* loaded from: classes4.dex */
public class C3025q0 {

    /* renamed from: A */
    public VideoBlendingParam f12092A;

    /* renamed from: B */
    public C17391z f12093B;

    /* renamed from: C */
    public C17391z f12094C;

    /* renamed from: H */
    public C3024q f12099H;

    /* renamed from: J */
    public String f12101J;

    /* renamed from: K */
    public int f12102K;

    /* renamed from: L */
    public double f12103L;

    /* renamed from: M */
    public C17244x0 f12104M;

    /* renamed from: O */
    public C2949b f12106O;

    /* renamed from: R */
    public C17244x0 f12109R;

    /* renamed from: d */
    public String f12113d;

    /* renamed from: e */
    public String f12114e;

    /* renamed from: f */
    public CharSequence f12115f;

    /* renamed from: h */
    public String f12117h;

    /* renamed from: n */
    public boolean f12123n = true;

    /* renamed from: o */
    public int f12124o = 0;

    /* renamed from: p */
    public boolean f12125p = false;

    /* renamed from: q */
    public boolean f12126q = true;

    /* renamed from: D */
    public boolean f12095D = false;

    /* renamed from: I */
    public C3023p3 f12100I = null;

    /* renamed from: N */
    public boolean f12105N = true;

    /* renamed from: Q */
    public SongInfo f12108Q = null;

    /* renamed from: a */
    public CharSequence f12110a = "";

    /* renamed from: b */
    public C3063z0 f12111b = null;

    /* renamed from: c */
    public CharSequence f12112c = "";

    /* renamed from: g */
    public CharSequence f12116g = "";

    /* renamed from: i */
    public ArrayList f12118i = new ArrayList();

    /* renamed from: t */
    public String f12129t = "";

    /* renamed from: u */
    public String f12130u = "";

    /* renamed from: v */
    public String f12131v = "";

    /* renamed from: w */
    public int f12132w = -1;

    /* renamed from: x */
    public int f12133x = -1;

    /* renamed from: y */
    public b f12134y = null;

    /* renamed from: z */
    public c f12135z = null;

    /* renamed from: k */
    public int f12120k = 0;

    /* renamed from: l */
    public int f12121l = 0;

    /* renamed from: m */
    public ArrayList f12122m = new ArrayList();

    /* renamed from: j */
    public C23307g f12119j = null;

    /* renamed from: E */
    public int f12096E = 0;

    /* renamed from: F */
    public C3013n3 f12097F = null;

    /* renamed from: G */
    public int f12098G = -1;

    /* renamed from: P */
    public ArrayList f12107P = new ArrayList();

    /* renamed from: r */
    public C18049e f12127r = new C18049e();

    /* renamed from: s */
    public ArrayList f12128s = new ArrayList();

    /* renamed from: bo.q0$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public String f12136a;

        /* renamed from: b */
        public String f12137b;

        public a(String str, String str2) {
            this.f12136a = str;
            this.f12137b = str2;
        }
    }

    /* renamed from: bo.q0$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public String f12138a;

        /* renamed from: b */
        public String f12139b;

        /* renamed from: c */
        public String f12140c;

        /* renamed from: d */
        public String f12141d;

        /* renamed from: e */
        public String f12142e;

        /* renamed from: f */
        public String f12143f;

        /* renamed from: g */
        public int f12144g;

        /* renamed from: h */
        public int f12145h = 0;

        /* renamed from: i */
        public int f12146i = 0;

        /* renamed from: j */
        public C23307g f12147j;

        /* renamed from: k */
        public String f12148k;

        /* renamed from: l */
        public C31869c6 f12149l;
    }

    /* renamed from: bo.q0$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        public String f12150a;

        /* renamed from: b */
        public String f12151b;

        /* renamed from: c */
        public String f12152c;

        /* renamed from: d */
        public String f12153d;

        /* renamed from: e */
        public String f12154e;

        /* renamed from: f */
        public String f12155f;

        /* renamed from: g */
        public List f12156g;

        /* renamed from: h */
        public String f12157h;

        /* renamed from: i */
        public String f12158i;

        /* renamed from: j */
        public String f12159j;

        /* renamed from: k */
        public String f12160k;

        /* renamed from: l */
        public String f12161l;

        /* renamed from: m */
        public String f12162m;

        /* renamed from: n */
        public String f12163n;

        /* renamed from: o */
        public boolean f12164o;

        /* renamed from: p */
        public int f12165p;

        /* renamed from: q */
        public C23307g f12166q;

        /* renamed from: r */
        public C28227x3 f12167r;

        /* renamed from: s */
        public C3014o f12168s;

        /* renamed from: t */
        public String f12169t;

        /* renamed from: a */
        public boolean m14574a() {
            C3014o c3014o = this.f12168s;
            if (c3014o != null && c3014o.f11999e) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m14575b() {
            C3014o c3014o = this.f12168s;
            if (c3014o != null && c3014o.f11998d) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: bo.q0$d */
    /* loaded from: classes4.dex */
    public static class d {

        /* renamed from: a */
        public String f12170a;

        /* renamed from: b */
        public String f12171b;

        /* renamed from: c */
        public String f12172c;

        /* renamed from: d */
        public String f12173d;

        /* renamed from: e */
        public C32145v4 f12174e;

        /* renamed from: f */
        public int f12175f;

        /* renamed from: g */
        public String f12176g;

        /* renamed from: h */
        public String f12177h;

        /* renamed from: i */
        public String f12178i;

        /* renamed from: j */
        public String f12179j;

        /* renamed from: k */
        public String f12180k;

        /* renamed from: l */
        public String f12181l;

        /* renamed from: m */
        public String f12182m;

        /* renamed from: n */
        public int f12183n;

        /* renamed from: o */
        public C23307g f12184o;

        /* renamed from: p */
        public int f12185p;

        /* renamed from: q */
        public List f12186q = new ArrayList();

        /* renamed from: r */
        public a f12187r = null;

        /* renamed from: s */
        public String f12188s = "";

        /* renamed from: t */
        public String f12189t = "";
    }

    /* renamed from: a */
    public void m14564a(String str, String str2) {
        this.f12093B = AbstractC20826v0.m108839v(this.f12100I, str, str2);
    }

    /* renamed from: b */
    public ItemAlbumMobile m14565b(String str) {
        ArrayList arrayList;
        try {
            if (!TextUtils.isEmpty(str) && (arrayList = this.f12118i) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it.next();
                    if (itemAlbumMobile != null && itemAlbumMobile.f42595r.equals(str)) {
                        return itemAlbumMobile;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return null;
    }

    /* renamed from: c */
    public int m14566c() {
        C18049e c18049e = this.f12127r;
        if (c18049e == null) {
            return 0;
        }
        return c18049e.m95929b();
    }

    /* renamed from: d */
    public boolean m14567d() {
        ArrayList arrayList;
        if (this.f12106O == null || (arrayList = this.f12107P) == null || arrayList.isEmpty()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f12107P.size(); i11++) {
            if (!((C2954c) this.f12107P.get(i11)).m13990e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean m14568e() {
        ArrayList arrayList;
        if (this.f12106O == null || (arrayList = this.f12107P) == null || arrayList.isEmpty()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f12107P.size(); i11++) {
            if (!((C2954c) this.f12107P.get(i11)).m13991f()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m14569f() {
        ArrayList arrayList;
        if (this.f12106O != null && (arrayList = this.f12107P) != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m14570g(C3025q0 c3025q0) {
        C17244x0 c17244x0;
        if (this == c3025q0) {
            return true;
        }
        if (c3025q0 != null && this.f12105N == c3025q0.f12105N && TextUtils.equals(this.f12101J, c3025q0.f12101J) && this.f12103L == c3025q0.f12103L && (c17244x0 = this.f12104M) != null && c17244x0.equals(c3025q0.f12104M)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void m14571h() {
        int i11;
        int i12;
        try {
            ArrayList arrayList = this.f12107P;
            if (arrayList != null) {
                i11 = arrayList.size();
            } else {
                i11 = 0;
            }
            if (i11 == 0) {
                return;
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                    i12 = i11;
                    break;
                case 4:
                    i12 = i11 / 2;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    i12 = 3;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                int i14 = (320 - (i13 * 2)) / i12;
                for (int i15 = 0; i15 < i11; i15++) {
                    ItemAlbumMobile.C7883c c7883c = new ItemAlbumMobile.C7883c();
                    double d11 = ((i15 % i12) * i14) + ((i15 % i12) * 2);
                    c7883c.f42614a = d11;
                    double d12 = ((i15 / i12) * i14) + ((i15 / i12) * 2);
                    c7883c.f42615b = d12;
                    c7883c.f42616c = i15 % i12 == i13 ? 320 : d11 + i14;
                    c7883c.f42617d = d12 + i14;
                    ((C2954c) this.f12107P.get(i15)).m13993h(new ItemAlbumMobile.C7883c(c7883c));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m14572i() {
        int i11;
        int i12;
        try {
            ArrayList arrayList = this.f12118i;
            if (arrayList != null) {
                i11 = arrayList.size();
            } else {
                i11 = 0;
            }
            if (i11 == 0) {
                return;
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                    i12 = i11;
                    break;
                case 4:
                    i12 = i11 / 2;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    i12 = 3;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                int i14 = (320 - (i13 * 2)) / i12;
                for (int i15 = 0; i15 < i11; i15++) {
                    ItemAlbumMobile.C7883c c7883c = new ItemAlbumMobile.C7883c();
                    double d11 = ((i15 % i12) * i14) + ((i15 % i12) * 2);
                    c7883c.f42614a = d11;
                    double d12 = ((i15 / i12) * i14) + ((i15 / i12) * 2);
                    c7883c.f42615b = d12;
                    c7883c.f42616c = i15 % i12 == i13 ? 320 : d11 + i14;
                    c7883c.f42617d = d12 + i14;
                    ((ItemAlbumMobile) this.f12118i.get(i15)).f42596r0 = new ItemAlbumMobile.C7883c(c7883c);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public JSONObject m14573j(int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f12110a;
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            jSONObject.put("caption", obj);
            C3063z0 c3063z0 = this.f12111b;
            if (c3063z0 != null) {
                jSONObject.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, c3063z0.m14734m());
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                                if (i11 != 17) {
                                    if (i11 != 100) {
                                        switch (i11) {
                                            case 21:
                                                C3024q c3024q = this.f12099H;
                                                if (c3024q != null) {
                                                    jSONObject.put("info", c3024q.m14563a());
                                                    break;
                                                }
                                                break;
                                            case 22:
                                                if (!TextUtils.isEmpty(this.f12101J)) {
                                                    jSONObject.put("feed_memory_id", this.f12101J);
                                                }
                                                jSONObject.put("feed_memory_type", this.f12102K);
                                                jSONObject.put("ratio_zinstant", this.f12103L);
                                                C17244x0 c17244x0 = this.f12104M;
                                                if (c17244x0 != null) {
                                                    jSONObject.put("zinstant_feed_info", c17244x0.m92066d());
                                                }
                                                jSONObject.put("is_valid_content", this.f12105N ? 1 : 0);
                                                jSONObject.put("typofeed", this.f12096E);
                                                break;
                                            case 23:
                                                C2949b c2949b = this.f12106O;
                                                if (c2949b != null) {
                                                    jSONObject.put("album", c2949b.m13968k());
                                                }
                                                ArrayList arrayList = this.f12107P;
                                                if (arrayList != null && arrayList.size() > 0) {
                                                    JSONArray jSONArray = new JSONArray();
                                                    Iterator it = this.f12107P.iterator();
                                                    while (it.hasNext()) {
                                                        jSONArray.put(((C2954c) it.next()).m13995j());
                                                    }
                                                    jSONObject.put("items", jSONArray);
                                                }
                                                jSONObject.put("typofeed", this.f12096E);
                                                break;
                                        }
                                    } else {
                                        c cVar = this.f12135z;
                                        if (cVar != null) {
                                            Object obj3 = cVar.f12155f;
                                            if (obj3 == null) {
                                                obj3 = "";
                                            }
                                            jSONObject.put("desc", obj3);
                                            Object obj4 = this.f12135z.f12150a;
                                            if (obj4 == null) {
                                                obj4 = "";
                                            }
                                            jSONObject.put("image", obj4);
                                            Object obj5 = this.f12135z.f12151b;
                                            if (obj5 == null) {
                                                obj5 = "";
                                            }
                                            jSONObject.put("image_original", obj5);
                                            Object obj6 = this.f12135z.f12153d;
                                            if (obj6 == null) {
                                                obj6 = "";
                                            }
                                            jSONObject.put("extra_info", obj6);
                                            Object obj7 = this.f12135z.f12154e;
                                            if (obj7 == null) {
                                                obj7 = "";
                                            }
                                            jSONObject.put("action", obj7);
                                            Object obj8 = this.f12135z.f12152c;
                                            if (obj8 == null) {
                                                obj8 = "";
                                            }
                                            jSONObject.put("href", obj8);
                                            Object obj9 = this.f12135z.f12157h;
                                            if (obj9 == null) {
                                                obj9 = "";
                                            }
                                            jSONObject.put("image_gif", obj9);
                                            Object obj10 = this.f12135z.f12158i;
                                            if (obj10 == null) {
                                                obj10 = "";
                                            }
                                            jSONObject.put("btn_action", obj10);
                                            Object obj11 = this.f12135z.f12160k;
                                            if (obj11 == null) {
                                                obj11 = "";
                                            }
                                            jSONObject.put("btn_data", obj11);
                                            Object obj12 = this.f12135z.f12161l;
                                            if (obj12 == null) {
                                                obj12 = "";
                                            }
                                            jSONObject.put("banner_action", obj12);
                                            Object obj13 = this.f12135z.f12162m;
                                            if (obj13 == null) {
                                                obj13 = "";
                                            }
                                            jSONObject.put("banner_data", obj13);
                                            Object obj14 = this.f12135z.f12159j;
                                            if (obj14 == null) {
                                                obj14 = "";
                                            }
                                            jSONObject.put("btn_label", obj14);
                                            jSONObject.put("banner_type", this.f12135z.f12165p);
                                            Object obj15 = this.f12135z.f12163n;
                                            if (obj15 == null) {
                                                obj15 = "";
                                            }
                                            jSONObject.put("video_url", obj15);
                                            jSONObject.put("video_auto_play", this.f12135z.f12164o ? 1 : 0);
                                            try {
                                                if (!TextUtils.isEmpty(this.f12135z.f12169t)) {
                                                    obj2 = new JSONObject(this.f12135z.f12169t);
                                                }
                                                jSONObject.put("ZInstantAPIInfo", obj2);
                                            } catch (Exception e11) {
                                                AbstractC20110a.m104539h(e11);
                                            }
                                            C23307g c23307g = this.f12135z.f12166q;
                                            if (c23307g != null) {
                                                jSONObject.put("dimension", c23307g.m120735a());
                                            }
                                            C28227x3 c28227x3 = this.f12135z.f12167r;
                                            if (c28227x3 != null) {
                                                jSONObject.put("video_dimension", c28227x3.m142187c());
                                            }
                                            C3014o c3014o = this.f12135z.f12168s;
                                            if (c3014o != null) {
                                                jSONObject.put("configs", c3014o.m14432a());
                                            }
                                        }
                                    }
                                } else {
                                    if (this.f12093B != null) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("videoid", this.f12093B.f88618a);
                                        jSONObject2.put("thumb", this.f12093B.f88622e);
                                        jSONObject2.put("origin", this.f12093B.f88620c);
                                        jSONObject2.put("hls", this.f12093B.f88621d);
                                        jSONObject2.put("video_auto_play", this.f12093B.f88630m ? 1 : 0);
                                        jSONObject2.put("media_id", this.f12093B.f88634q);
                                        jSONObject.put("video", jSONObject2);
                                    }
                                    C23307g c23307g2 = this.f12119j;
                                    if (c23307g2 != null) {
                                        jSONObject.put("video_dimension", c23307g2.m120735a());
                                    }
                                    VideoBlendingParam videoBlendingParam = this.f12092A;
                                    if (videoBlendingParam != null) {
                                        jSONObject.put("video_blending_param", videoBlendingParam.m48166b());
                                    }
                                    C17391z c17391z = this.f12094C;
                                    if (c17391z != null) {
                                        jSONObject.put("local_video_attachment", c17391z.m92540e());
                                    }
                                    jSONObject.put("typofeed", this.f12096E);
                                }
                            }
                            b bVar = this.f12134y;
                            if (bVar != null) {
                                Object obj16 = bVar.f12138a;
                                if (obj16 == null) {
                                    obj16 = "";
                                }
                                jSONObject.put("link_title", obj16);
                                Object obj17 = this.f12134y.f12139b;
                                if (obj17 == null) {
                                    obj17 = "";
                                }
                                jSONObject.put("link_image", obj17);
                                Object obj18 = this.f12134y.f12140c;
                                if (obj18 == null) {
                                    obj18 = "";
                                }
                                jSONObject.put("link_image_original", obj18);
                                Object obj19 = this.f12134y.f12141d;
                                if (obj19 == null) {
                                    obj19 = "";
                                }
                                jSONObject.put("link_href", obj19);
                                Object obj20 = this.f12134y.f12142e;
                                if (obj20 == null) {
                                    obj20 = "";
                                }
                                jSONObject.put("link_source", obj20);
                                Object obj21 = this.f12134y.f12143f;
                                if (obj21 == null) {
                                    obj21 = "";
                                }
                                jSONObject.put("link_desc", obj21);
                                C23307g c23307g3 = this.f12134y.f12147j;
                                if (c23307g3 != null) {
                                    JSONObject m120735a = c23307g3.m120735a();
                                    m120735a.put("width", this.f12134y.f12145h);
                                    m120735a.put("height", this.f12134y.f12146i);
                                    m120735a.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f12134y.f12144g);
                                    jSONObject.put("photo_dimension", m120735a);
                                } else {
                                    jSONObject.put("photo_dimension", "");
                                }
                                C31869c6 c31869c6 = this.f12134y.f12149l;
                                if (c31869c6 != null) {
                                    obj2 = c31869c6.m153174b();
                                }
                                jSONObject.put("link_media", obj2);
                            }
                            C3023p3 c3023p3 = this.f12100I;
                            if (c3023p3 != null) {
                                jSONObject.put("zvideo_info", c3023p3.m14561r());
                            }
                            jSONObject.put("typofeed", this.f12096E);
                        } else {
                            Object obj22 = this.f12130u;
                            if (obj22 == null) {
                                obj22 = "";
                            }
                            jSONObject.put("thumb", obj22);
                            Object obj23 = this.f12131v;
                            if (obj23 != null) {
                                obj2 = obj23;
                            }
                            jSONObject.put("origin", obj2);
                            jSONObject.put("stickerId", this.f12132w);
                            jSONObject.put("cateId", this.f12133x);
                            jSONObject.put("typofeed", this.f12096E);
                        }
                    } else {
                        ArrayList arrayList2 = this.f12118i;
                        if (arrayList2 != null && arrayList2.size() > 0) {
                            JSONArray jSONArray2 = new JSONArray();
                            Iterator it2 = this.f12118i.iterator();
                            while (it2.hasNext()) {
                                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) it2.next();
                                JSONObject jSONObject3 = new JSONObject();
                                Iterator it3 = it2;
                                String str = itemAlbumMobile.f42595r;
                                if (str == null) {
                                    str = "";
                                }
                                jSONObject3.put("photoid", str);
                                String str2 = itemAlbumMobile.f42548C;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                jSONObject3.put("thumb", str2);
                                String str3 = itemAlbumMobile.f42607x;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                jSONObject3.put("origin", str3);
                                String str4 = itemAlbumMobile.f42550D;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                jSONObject3.put("thumbnailLocal", str4);
                                String str5 = itemAlbumMobile.f42611z;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                jSONObject3.put("fullUri", str5);
                                ItemAlbumMobile.C7883c c7883c = itemAlbumMobile.f42596r0;
                                if (c7883c != null) {
                                    jSONObject3.put("layout", c7883c.m40545f());
                                }
                                jSONArray2.put(jSONObject3);
                                it2 = it3;
                            }
                            jSONObject.put("photos", jSONArray2);
                        }
                        if (this.f12122m.size() > 0) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("width_unit_max", this.f12121l);
                            jSONObject4.put("height_unit_max", this.f12120k);
                            JSONArray jSONArray3 = new JSONArray();
                            Iterator it4 = this.f12122m.iterator();
                            while (it4.hasNext()) {
                                Rect rect = (Rect) it4.next();
                                JSONArray jSONArray4 = new JSONArray();
                                jSONArray4.put(rect.left);
                                jSONArray4.put(rect.top);
                                jSONArray4.put(rect.right);
                                jSONArray4.put(rect.bottom);
                                jSONArray3.put(jSONArray4);
                            }
                            jSONObject4.put("coordinates", jSONArray3);
                            JSONArray jSONArray5 = new JSONArray();
                            if (this.f12128s.size() > 0) {
                                Iterator it5 = this.f12128s.iterator();
                                while (it5.hasNext()) {
                                    C3049v2 c3049v2 = (C3049v2) it5.next();
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("photoId", c3049v2.m14635b());
                                    jSONObject5.put("width", c3049v2.m14636c());
                                    jSONObject5.put("height", c3049v2.m14634a());
                                    jSONArray5.put(jSONObject5);
                                }
                            }
                            jSONObject4.put("original_size", jSONArray5);
                            jSONObject.put("photo_coordinates", jSONObject4);
                        }
                        jSONObject.put("is_change_layout", this.f12125p ? 1 : 0);
                        jSONObject.put("typofeed", this.f12096E);
                        jSONObject.put("more_photo", this.f12124o);
                        SongInfo songInfo = this.f12108Q;
                        if (songInfo != null) {
                            obj2 = songInfo.m45186h();
                        }
                        jSONObject.put("song", obj2);
                        C18049e c18049e = this.f12127r;
                        if (c18049e != null) {
                            jSONObject.put("layout_config", c18049e.m95932e());
                        }
                    }
                } else {
                    ArrayList arrayList3 = this.f12118i;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        ItemAlbumMobile itemAlbumMobile2 = (ItemAlbumMobile) this.f12118i.get(0);
                        JSONObject jSONObject6 = new JSONObject();
                        String str6 = itemAlbumMobile2.f42595r;
                        if (str6 == null) {
                            str6 = "";
                        }
                        jSONObject6.put("photoid", str6);
                        String str7 = itemAlbumMobile2.f42548C;
                        if (str7 == null) {
                            str7 = "";
                        }
                        jSONObject6.put("thumb", str7);
                        String str8 = itemAlbumMobile2.f42607x;
                        if (str8 == null) {
                            str8 = "";
                        }
                        jSONObject6.put("origin", str8);
                        String str9 = itemAlbumMobile2.f42550D;
                        if (str9 == null) {
                            str9 = "";
                        }
                        jSONObject6.put("thumbnailLocal", str9);
                        String str10 = itemAlbumMobile2.f42611z;
                        if (str10 == null) {
                            str10 = "";
                        }
                        jSONObject6.put("fullUri", str10);
                        jSONObject.put("photo", jSONObject6);
                        if (this.f12119j != null) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("width", this.f12119j.f113474a);
                            jSONObject7.put("height", this.f12119j.f113475b);
                            jSONObject.put("photo_dimension", jSONObject7);
                        }
                    }
                    jSONObject.put("typofeed", this.f12096E);
                    SongInfo songInfo2 = this.f12108Q;
                    if (songInfo2 != null) {
                        obj2 = songInfo2.m45186h();
                    }
                    jSONObject.put("song", obj2);
                }
            } else {
                jSONObject.put("typofeed", this.f12096E);
                C3013n3 c3013n3 = this.f12097F;
                if (c3013n3 != null) {
                    jSONObject.put("typofeed_info", c3013n3.m14431b());
                }
            }
            jSONObject.put("edit", this.f12126q ? 1 : 0);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return jSONObject;
    }
}
