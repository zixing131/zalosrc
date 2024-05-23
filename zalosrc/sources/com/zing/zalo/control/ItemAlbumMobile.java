package com.zing.zalo.control;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.util.Patterns;
import android.util.Size;
import bo.AbstractC2959d;
import bo.C2949b;
import bo.C2954c;
import bo.C2964e;
import bo.C2969f;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3039t0;
import bo.C3047v0;
import bo.C3051w0;
import bo.C3063z0;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.p077ui.toolstorage.detail.ToolStorageDetailPage;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zqrcode.Result;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17990p0;
import dj.C18009w0;
import dj.C18013y0;
import gq.AbstractC19588k;
import gw.AbstractC19620d0;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p396ol.C24302e;
import p487rl.C25821b;
import p489rn.C25866f0;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p588vw.C28652r;
import p716zh.AbstractC32160w5;
import p726zr.C32546b;
import vg.C28203u6;
import x20.C29299a;

/* loaded from: classes3.dex */
public class ItemAlbumMobile extends AbstractC19588k implements Parcelable {
    public static final Parcelable.Creator<ItemAlbumMobile> CREATOR = new C7881a();

    /* renamed from: A */
    public String f42544A;

    /* renamed from: A0 */
    public long f42545A0;

    /* renamed from: B */
    public boolean f42546B;

    /* renamed from: B0 */
    public long f42547B0;

    /* renamed from: C */
    public String f42548C;

    /* renamed from: C0 */
    public boolean f42549C0;

    /* renamed from: D */
    public String f42550D;

    /* renamed from: D0 */
    public EnumC7884d f42551D0;

    /* renamed from: E */
    public String f42552E;

    /* renamed from: E0 */
    String f42553E0;

    /* renamed from: F */
    public String f42554F;

    /* renamed from: F0 */
    String f42555F0;

    /* renamed from: G */
    public String f42556G;

    /* renamed from: H */
    public String f42557H;

    /* renamed from: I */
    public String f42558I;

    /* renamed from: J */
    public String f42559J;

    /* renamed from: K */
    public String f42560K;

    /* renamed from: L */
    public String f42561L;

    /* renamed from: M */
    public C3051w0 f42562M;

    /* renamed from: N */
    public C32546b f42563N;

    /* renamed from: O */
    public long f42564O;

    /* renamed from: P */
    public CharSequence f42565P;

    /* renamed from: Q */
    public boolean f42566Q;

    /* renamed from: R */
    public boolean f42567R;

    /* renamed from: S */
    public boolean f42568S;

    /* renamed from: T */
    public long f42569T;

    /* renamed from: U */
    public String f42570U;

    /* renamed from: V */
    private ArrayList f42571V;

    /* renamed from: W */
    private ArrayList f42572W;

    /* renamed from: X */
    private C3003l3.b f42573X;

    /* renamed from: Y */
    public C3063z0 f42574Y;

    /* renamed from: Z */
    public boolean f42575Z;

    /* renamed from: a0 */
    public boolean f42576a0;

    /* renamed from: b0 */
    public int f42577b0;

    /* renamed from: c0 */
    private MessageId f42578c0;

    /* renamed from: d0 */
    public String f42579d0;

    /* renamed from: e0 */
    public String f42580e0;

    /* renamed from: f0 */
    public String f42581f0;

    /* renamed from: g0 */
    public Size f42582g0;

    /* renamed from: h0 */
    public boolean f42583h0;

    /* renamed from: i0 */
    public boolean f42584i0;

    /* renamed from: j0 */
    public boolean f42585j0;

    /* renamed from: k0 */
    public C17391z f42586k0;

    /* renamed from: l0 */
    public String f42587l0;

    /* renamed from: m0 */
    public C27373c f42588m0;

    /* renamed from: n0 */
    public boolean f42589n0;

    /* renamed from: o0 */
    public int f42590o0;

    /* renamed from: p */
    public int f42591p;

    /* renamed from: p0 */
    public int f42592p0;

    /* renamed from: q */
    public String f42593q;

    /* renamed from: q0 */
    public C3020p0 f42594q0;

    /* renamed from: r */
    public String f42595r;

    /* renamed from: r0 */
    public C7883c f42596r0;

    /* renamed from: s */
    public String f42597s;

    /* renamed from: s0 */
    public MediaStoreItem f42598s0;

    /* renamed from: t */
    public String f42599t;

    /* renamed from: t0 */
    public Result f42600t0;

    /* renamed from: u */
    public String f42601u;

    /* renamed from: u0 */
    public int f42602u0;

    /* renamed from: v */
    public String f42603v;

    /* renamed from: v0 */
    public int f42604v0;

    /* renamed from: w */
    public String f42605w;

    /* renamed from: w0 */
    public PointF f42606w0;

    /* renamed from: x */
    public String f42607x;

    /* renamed from: x0 */
    public String f42608x0;

    /* renamed from: y */
    public String f42609y;

    /* renamed from: y0 */
    public boolean f42610y0;

    /* renamed from: z */
    public String f42611z;

    /* renamed from: z0 */
    public long f42612z0;

    /* renamed from: com.zing.zalo.control.ItemAlbumMobile$a */
    /* loaded from: classes3.dex */
    class C7881a implements Parcelable.Creator {
        C7881a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ItemAlbumMobile createFromParcel(Parcel parcel) {
            return new ItemAlbumMobile(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ItemAlbumMobile[] newArray(int i11) {
            return new ItemAlbumMobile[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.control.ItemAlbumMobile$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C7882b {

        /* renamed from: a */
        static final /* synthetic */ int[] f42613a;

        static {
            int[] iArr = new int[ToolStorageDetailPage.EnumC13333a.values().length];
            f42613a = iArr;
            try {
                iArr[ToolStorageDetailPage.EnumC13333a.f68483q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42613a[ToolStorageDetailPage.EnumC13333a.f68484r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42613a[ToolStorageDetailPage.EnumC13333a.f68485s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.zing.zalo.control.ItemAlbumMobile$c */
    /* loaded from: classes3.dex */
    public static class C7883c {

        /* renamed from: a */
        public double f42614a;

        /* renamed from: b */
        public double f42615b;

        /* renamed from: c */
        public double f42616c;

        /* renamed from: d */
        public double f42617d;

        /* renamed from: e */
        public int f42618e;

        /* renamed from: f */
        public int f42619f;

        public C7883c() {
            this.f42618e = 0;
            this.f42619f = 0;
        }

        /* renamed from: a */
        public int m40540a(double d11) {
            return ((int) (this.f42617d * d11)) - ((int) (this.f42615b * d11));
        }

        /* renamed from: b */
        public int m40541b(double d11) {
            return ((int) (this.f42616c * d11)) - ((int) (this.f42614a * d11));
        }

        /* renamed from: c */
        public int m40542c(double d11) {
            return (int) (this.f42614a * d11);
        }

        /* renamed from: d */
        public int m40543d(double d11) {
            return (int) (this.f42615b * d11);
        }

        /* renamed from: e */
        public boolean m40544e() {
            return (this.f42614a == 0.0d && this.f42615b == 0.0d && this.f42616c == 0.0d && this.f42617d == 0.0d) ? false : true;
        }

        /* renamed from: f */
        public JSONObject m40545f() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", this.f42615b);
                jSONObject.put("right", this.f42616c);
                jSONObject.put("bottom", this.f42617d);
                jSONObject.put("left", this.f42614a);
                jSONObject.put("contentMode", this.f42618e);
                jSONObject.put("layoutId", this.f42619f);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }

        public C7883c(C7883c c7883c) {
            if (c7883c != null) {
                this.f42618e = c7883c.f42618e;
                this.f42619f = c7883c.f42619f;
                this.f42614a = c7883c.f42614a;
                this.f42616c = c7883c.f42616c;
                this.f42615b = c7883c.f42615b;
                this.f42617d = c7883c.f42617d;
            }
        }

        public C7883c(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f42615b = jSONObject.optInt("top");
                this.f42616c = jSONObject.optInt("right");
                this.f42617d = jSONObject.optInt("bottom");
                this.f42614a = jSONObject.optInt("left");
                this.f42618e = jSONObject.optInt("contentMode", 0);
                this.f42619f = jSONObject.optInt("layoutId");
            }
        }

        public C7883c(double d11, double d12, double d13, double d14) {
            this.f42615b = d11;
            this.f42616c = d12;
            this.f42617d = d13;
            this.f42614a = d14;
            this.f42618e = 0;
            this.f42619f = 0;
        }

        public C7883c(double d11, double d12, double d13, double d14, double d15) {
            this.f42615b = d11 / d15;
            this.f42616c = d12 / d15;
            this.f42617d = d13 / d15;
            this.f42614a = d14 / d15;
            this.f42618e = 0;
            this.f42619f = 0;
        }
    }

    /* renamed from: com.zing.zalo.control.ItemAlbumMobile$d */
    /* loaded from: classes3.dex */
    public enum EnumC7884d {
        NORMAL,
        ZCLOUD,
        MY_CLOUD
    }

    /* synthetic */ ItemAlbumMobile(Parcel parcel, AbstractC32160w5 abstractC32160w5) {
        this(parcel);
    }

    /* renamed from: a0 */
    private ItemAlbumMobile m40492a0(C17945a0 c17945a0, boolean z11) {
        if (!c17945a0.m95228p8()) {
            ItemAlbumMobile m40515Z = m40515Z(c17945a0);
            if (!z11) {
                m40515Z.f42548C = c17945a0.m95266u2();
            }
            return m40515Z;
        }
        return null;
    }

    /* renamed from: h0 */
    public static ItemAlbumMobile m40493h0(JSONObject jSONObject) {
        String str;
        ItemAlbumMobile itemAlbumMobile;
        C3051w0 c3051w0;
        ItemAlbumMobile itemAlbumMobile2 = new ItemAlbumMobile();
        itemAlbumMobile2.f42565P = "";
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("item");
            C3020p0 m108752C0 = AbstractC20826v0.m108752C0(jSONObject2, 0);
            itemAlbumMobile2.f42594q0 = m108752C0;
            itemAlbumMobile2.f42590o0 = m108752C0.f12058q;
            itemAlbumMobile2.f42599t = m108752C0.f12057p;
            if (m108752C0.f12064w) {
                str = "1";
            } else {
                str = "0";
            }
            itemAlbumMobile2.f42552E = str;
            itemAlbumMobile2.f42554F = m108752C0.f12035O + "";
            itemAlbumMobile2.f42564O = m108752C0.f12062u;
            itemAlbumMobile2.f42568S = m108752C0.f12065x;
            if (jSONObject2.has("tags")) {
                itemAlbumMobile2.f42573X = new C3003l3.b(jSONObject2.getJSONArray("tags"), itemAlbumMobile2.f42599t, 2);
            }
            C3047v0 c3047v0 = m108752C0.f12022B;
            itemAlbumMobile2.f42593q = c3047v0.f12280b;
            itemAlbumMobile2.f42601u = c3047v0.f12283e;
            itemAlbumMobile2.f42605w = c3047v0.f12282d;
            C3063z0 c3063z0 = m108752C0.f12023C.f12111b;
            if (c3063z0 != null) {
                C3063z0 c3063z02 = new C3063z0(c3063z0.m14734m());
                itemAlbumMobile2.f42574Y = c3063z02;
                c3063z02.m14732k(false);
            }
            C3025q0 c3025q0 = m108752C0.f12023C;
            String str2 = c3025q0.f12113d;
            itemAlbumMobile2.f42556G = str2;
            itemAlbumMobile2.f42608x0 = str2;
            int i11 = m108752C0.f12058q;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 17) {
                        itemAlbumMobile2.f42591p = 2;
                        C17391z c17391z = c3025q0.f12093B;
                        if (c17391z != null) {
                            itemAlbumMobile2.f42595r = c17391z.f88618a;
                            itemAlbumMobile2.f42548C = c17391z.f88622e;
                        }
                    }
                } else {
                    itemAlbumMobile2.f42591p = 1;
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("content");
                    if (jSONObject3.has("photo")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("photo");
                        itemAlbumMobile2.f42593q = m108752C0.f12022B.f12280b;
                        itemAlbumMobile2.f42595r = AbstractC20826v0.m108779Q(jSONObject4, "photoid");
                        itemAlbumMobile2.f42548C = AbstractC20826v0.m108779Q(jSONObject4, "thumb");
                        itemAlbumMobile2.f42607x = AbstractC20826v0.m108779Q(jSONObject4, "origin");
                    }
                }
            } else {
                itemAlbumMobile2.f42591p = 1;
                ArrayList arrayList = c3025q0.f12118i;
                if (arrayList != null && !arrayList.isEmpty() && (itemAlbumMobile = (ItemAlbumMobile) m108752C0.f12023C.f12118i.get(0)) != null) {
                    itemAlbumMobile2.f42595r = itemAlbumMobile.f42595r;
                    itemAlbumMobile2.f42548C = itemAlbumMobile.f42548C;
                    itemAlbumMobile2.f42607x = itemAlbumMobile.f42607x;
                }
            }
            itemAlbumMobile2.f42561L = m108752C0.f12025E.f12243a + "";
            itemAlbumMobile2.f42560K = m108752C0.f12025E.f12244b + "";
            C3051w0 c3051w02 = m108752C0.f12025E.f12246d;
            C32546b c32546b = null;
            if (c3051w02 != null) {
                c3051w0 = new C3051w0(c3051w02);
            } else {
                c3051w0 = null;
            }
            itemAlbumMobile2.f42562M = c3051w0;
            if (m108752C0.f12025E.f12247e != null) {
                c32546b = new C32546b(m108752C0.f12025E.f12247e);
            }
            itemAlbumMobile2.f42563N = c32546b;
            itemAlbumMobile2.m40531q0();
            JSONObject jSONObject5 = jSONObject.getJSONObject("extra_info");
            itemAlbumMobile2.f42569T = jSONObject5.optLong("albumId", -1L);
            itemAlbumMobile2.f42570U = jSONObject5.optString("desc", "");
            itemAlbumMobile2.f42603v = "";
            itemAlbumMobile2.f42597s = "";
            itemAlbumMobile2.f42558I = "";
            itemAlbumMobile2.f42559J = "";
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return itemAlbumMobile2;
    }

    /* renamed from: i0 */
    private String m40494i0(String str) {
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

    /* renamed from: B */
    public String m40495B() {
        MessageId messageId = this.f42578c0;
        if (messageId != null) {
            return messageId.m41046j();
        }
        return "";
    }

    /* renamed from: C */
    public MessageId m40496C() {
        return this.f42578c0;
    }

    /* renamed from: D */
    public int m40497D() {
        return this.f42591p == 2 ? 19 : 3;
    }

    /* renamed from: F */
    public String m40498F() {
        if (TextUtils.isEmpty(this.f42593q)) {
            String str = this.f42605w;
            if (str == null) {
                return "";
            }
            return str;
        }
        String str2 = this.f42605w;
        if (TextUtils.isEmpty(str2) && this.f42593q.equals(CoreUtility.f89233i)) {
            str2 = AbstractC23304d.f113368c0.f42437s;
        }
        return AbstractC21935u.m114542i(this.f42593q, str2);
    }

    /* renamed from: H */
    public CharSequence m40499H() {
        CharSequence charSequence;
        try {
            this.f42571V = new ArrayList();
            this.f42556G = this.f42556G.replaceAll("(\r\n|\n)", "<br/>");
            try {
                Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(this.f42556G);
                if (matcher.find() && !this.f42556G.contains("<a href=\"http")) {
                    if (matcher.group().startsWith("https://")) {
                        this.f42556G = matcher.replaceAll("<a href=\"$1\">$1</a>");
                    } else if (matcher.group().startsWith("http://")) {
                        this.f42556G = matcher.replaceAll("<a href=\"$1\">$1</a>");
                    } else {
                        this.f42556G = matcher.replaceAll("<a href=\"http://$1\">$1</a>");
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            this.f42556G = m40494i0(this.f42556G);
            try {
                Matcher matcher2 = Pattern.compile("<a[^>]*>(.*?)</a>", 34).matcher(this.f42556G);
                while (matcher2.find()) {
                    String group = matcher2.group(0);
                    if (group.startsWith("<a href=\"zm://Profile/")) {
                        Matcher matcher3 = Pattern.compile("<a[^>]*?href\\s*=\\s*(('|\")(.*?)('|\"))[^>]*?(?!/)>", 34).matcher(group);
                        String str = "";
                        if (matcher3.find()) {
                            String replace = matcher3.group(1).replace("\"", "");
                            str = replace.substring(replace.lastIndexOf("/") + 1);
                        }
                        String group2 = matcher2.group(1);
                        CharSequence m114542i = AbstractC21935u.m114542i(str, group2);
                        if (!group2.equals(m114542i)) {
                            charSequence = group.replace(group2, m114542i);
                        } else {
                            charSequence = group;
                        }
                        if (this.f42556G.contains(group) && !group.equals(charSequence)) {
                            this.f42556G = this.f42556G.replace(group, charSequence);
                        }
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            Spanned fromHtml = Html.fromHtml(Pattern.compile("<(?![ab/])").matcher(this.f42556G).replaceAll("&lt;"));
            SpannableString spannableString = new SpannableString(fromHtml.toString());
            for (Object obj : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                int spanFlags = fromHtml.getSpanFlags(obj);
                if (obj instanceof URLSpan) {
                    C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                    this.f42571V.add(c10866e);
                    spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
                }
            }
            return C28652r.m143349v().m143350A(spannableString);
        } catch (Exception unused) {
            return C28652r.m143349v().m143353D(this.f42556G);
        }
    }

    /* renamed from: I */
    public CharSequence m40500I(InterfaceC27218a interfaceC27218a) {
        CharSequence charSequence;
        try {
            charSequence = m40499H();
            try {
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
                return charSequence;
            }
        } catch (Exception e12) {
            e = e12;
            charSequence = "";
        }
        if (!m40506Q()) {
            if (m40505O()) {
            }
            return charSequence;
        }
        charSequence = TextUtils.concat(charSequence, " - ");
        if (m40506Q()) {
            charSequence = TextUtils.concat(charSequence, this.f42573X.f11958c);
        }
        if (m40505O()) {
            CharSequence m14728g = this.f42574Y.m14728g();
            if (m40506Q()) {
                m14728g = TextUtils.concat(" ", m14728g);
            }
            charSequence = TextUtils.concat(charSequence, m14728g);
            double m153170b = this.f42574Y.m153170b();
            double m153169a = this.f42574Y.m153169a();
            C10866e m14729h = this.f42574Y.m14729h();
            if (m14729h != null) {
                m14729h.m56378V(C25866f0.m133447G(interfaceC27218a.getContext(), "", m153170b, m153169a));
            }
        }
        return charSequence;
    }

    /* renamed from: J */
    public int m40501J() {
        C3003l3.b bVar = this.f42573X;
        if (bVar == null) {
            return 0;
        }
        return bVar.f11956a;
    }

    /* renamed from: K */
    public C3003l3.b m40502K() {
        return this.f42573X;
    }

    /* renamed from: M */
    public C17391z m40503M() {
        C3020p0 c3020p0;
        C3025q0 c3025q0;
        if (this.f42591p == 2 && (c3020p0 = this.f42594q0) != null && (c3025q0 = c3020p0.f12023C) != null) {
            return c3025q0.f12093B;
        }
        return this.f42586k0;
    }

    /* renamed from: N */
    public String m40504N() {
        return this.f42607x;
    }

    /* renamed from: O */
    public boolean m40505O() {
        C3063z0 c3063z0 = this.f42574Y;
        if (c3063z0 != null && !TextUtils.isEmpty(c3063z0.m14728g())) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public boolean m40506Q() {
        C3003l3.b bVar = this.f42573X;
        if (bVar != null && bVar.f11956a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public boolean m40507R() {
        MessageId messageId = this.f42578c0;
        if (messageId != null && messageId.m41052p()) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public boolean m40508S() {
        MessageId messageId = this.f42578c0;
        if (messageId != null && messageId.m41053q()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public boolean m40509T() {
        if (!m40508S() && !m40507R()) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public boolean m40510U() {
        C7883c c7883c = this.f42596r0;
        if (c7883c != null && c7883c.m40544e()) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public boolean m40511V() {
        return this.f42591p == 2 ? this.f42585j0 : (this.f42546B && this.f42584i0) || (this.f42583h0 && (!this.f42566Q || this.f42584i0));
    }

    /* renamed from: W */
    public ItemAlbumMobile m40512W(MediaStoreItem mediaStoreItem, String str, boolean z11) {
        String m94947M4;
        int i11;
        if (mediaStoreItem != null) {
            C17945a0 m40599m = mediaStoreItem.m40599m();
            if (mediaStoreItem.m40598l0()) {
                this.f42607x = m40599m.m95131f5();
            } else {
                this.f42607x = m40599m.m95090b5();
            }
            if (!mediaStoreItem.m40598l0()) {
                m94947M4 = m40599m.m94983Q3();
            } else {
                m94947M4 = m40599m.m94947M4();
            }
            this.f42609y = m94947M4;
            this.f42550D = m40599m.m94947M4();
            this.f42548C = m40599m.m95131f5();
            this.f42593q = m40599m.m94862C4();
            this.f42564O = m40599m.m95313z4();
            this.f42545A0 = m40599m.m95030V4();
            if (mediaStoreItem.m40598l0()) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            this.f42591p = i11;
            this.f42598s0 = mediaStoreItem;
            this.f42595r = mediaStoreItem.m40616y();
            this.f42579d0 = str;
            this.f42556G = m40599m.m94984Q4();
            this.f42608x0 = m40599m.m94984Q4();
            this.f42578c0 = mediaStoreItem.m40571M();
            String m94868D3 = m40599m.m94868D3();
            if (!TextUtils.isEmpty(m94868D3)) {
                this.f42566Q = true;
                this.f42544A = m94868D3;
                this.f42546B = TextUtils.equals(m94868D3, this.f42607x);
            } else {
                this.f42566Q = false;
                this.f42544A = "";
            }
            if (mediaStoreItem.getWidth() * mediaStoreItem.getHeight() != 0) {
                this.f42582g0 = new Size(mediaStoreItem.getWidth(), mediaStoreItem.getHeight());
            } else {
                this.f42582g0 = new Size(1, 1);
            }
            if (z11) {
                m40520g0(mediaStoreItem);
            }
            int i12 = this.f42591p;
            if (i12 == 2) {
                this.f42585j0 = m40599m.m95022U7();
                if (m40599m.m94929K2() instanceof C17961f1) {
                    this.f42589n0 = ((C17961f1) m40599m.m94929K2()).m95465S();
                }
            } else if (i12 == 1) {
                boolean m95022U7 = m40599m.m95022U7();
                this.f42583h0 = m95022U7;
                if (this.f42546B) {
                    this.f42584i0 = m95022U7;
                }
            }
        }
        return this;
    }

    /* renamed from: X */
    public ItemAlbumMobile m40513X(MediaItem mediaItem, boolean z11) {
        String mo41081Q;
        String m41134Z;
        String m41148i0;
        String m41102H;
        if (mediaItem != null) {
            if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                mo41081Q = mediaItem.m41113N();
            } else {
                mo41081Q = mediaItem.mo41081Q();
            }
            if (z11) {
                m41134Z = mo41081Q;
            } else {
                m41134Z = mediaItem.m41134Z();
            }
            if (z11) {
                m41148i0 = mo41081Q;
            } else {
                m41148i0 = mediaItem.m41148i0();
            }
            if (z11) {
                m41102H = mo41081Q;
            } else {
                m41102H = mediaItem.m41102H();
            }
            if (TextUtils.isEmpty(m41148i0)) {
                m41148i0 = m41134Z;
            }
            this.f42607x = m41148i0;
            this.f42609y = mo41081Q;
            this.f42548C = m41134Z;
            if (!TextUtils.isEmpty(m41102H)) {
                this.f42566Q = true;
                this.f42544A = m41102H;
                this.f42546B = TextUtils.equals(mediaItem.m41102H(), mediaItem.m41148i0());
            } else {
                this.f42566Q = false;
                this.f42544A = "";
            }
        }
        return this;
    }

    /* renamed from: Y */
    public ItemAlbumMobile m40514Y(C13380a c13380a, ToolStorageDetailPage.EnumC13333a enumC13333a) {
        C17945a0 m75089k = c13380a.m75089k();
        int i11 = C7882b.f42613a[enumC13333a.ordinal()];
        ItemAlbumMobile itemAlbumMobile = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if (c13380a.m75082d() == null) {
                        return null;
                    }
                    if (c13380a.m75102x()) {
                        if (m75089k == null) {
                            return null;
                        }
                        itemAlbumMobile = m40492a0(m75089k, false);
                        if (itemAlbumMobile != null) {
                            itemAlbumMobile.f42551D0 = EnumC7884d.ZCLOUD;
                            itemAlbumMobile.f42595r = c13380a.m75082d().m133141d();
                        }
                    } else {
                        itemAlbumMobile = m40516b0(c13380a.m75082d());
                        if (m75089k != null) {
                            itemAlbumMobile.f42548C = m75089k.m95266u2();
                        }
                    }
                }
            } else {
                if (m75089k == null) {
                    return null;
                }
                itemAlbumMobile = m40492a0(m75089k, false);
                if (itemAlbumMobile != null) {
                    itemAlbumMobile.f42551D0 = EnumC7884d.MY_CLOUD;
                }
            }
        } else {
            if (m75089k == null) {
                return null;
            }
            itemAlbumMobile = m40492a0(m75089k, true);
            if (itemAlbumMobile != null) {
                itemAlbumMobile.f42551D0 = EnumC7884d.NORMAL;
            }
        }
        if (itemAlbumMobile != null) {
            itemAlbumMobile.f42547B0 = c13380a.m75087i();
            itemAlbumMobile.f42609y = c13380a.m75088j();
        }
        return itemAlbumMobile;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ItemAlbumMobile m40515Z(C17945a0 c17945a0) {
        String str;
        String str2;
        String str3;
        String str4;
        String m95740E;
        int i11;
        String str5;
        String str6 = "";
        if (c17945a0 != null) {
            try {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(c17945a0.m94862C4());
                if (m141809c == null) {
                    m141809c = new ContactProfile(c17945a0.m94862C4());
                    m141809c.f42437s = c17945a0.m94854B4();
                }
                str3 = m141809c.m40383Q(true, false);
                try {
                    if (c17945a0.m94929K2() == null || TextUtils.isEmpty(c17945a0.m94929K2().f91011p)) {
                        str4 = "";
                    } else {
                        str4 = c17945a0.m94929K2().f91011p;
                        try {
                            if (c17945a0.m95011T3() != null && c17945a0.m95011T3().m40861l() > 0 && !TextUtils.isEmpty(str4)) {
                                List m40857g = c17945a0.m95011T3().m40857g();
                                if (!c17945a0.m94847A6()) {
                                    str5 = "";
                                } else {
                                    str5 = c17945a0.mo95039W2();
                                }
                                str4 = AbstractC19620d0.m102675L(m40857g, str4, str5);
                            }
                        } catch (Exception e11) {
                            str = str3;
                            e = e11;
                            str2 = str4;
                            e.printStackTrace();
                            str3 = str;
                            str4 = str2;
                            this.f42598s0 = new MediaStoreItem(c17945a0);
                            this.f42595r = c17945a0.m95029V3().m41044h();
                            this.f42605w = str3;
                            this.f42557H = str4;
                            this.f42556G = str4;
                            this.f42564O = c17945a0.m94974P4();
                            this.f42578c0 = c17945a0.m95029V3();
                            this.f42593q = c17945a0.m94862C4();
                            this.f42579d0 = c17945a0.mo95039W2();
                            this.f42577b0 = c17945a0.m95041W4();
                            this.f42609y = c17945a0.m94983Q3();
                            if (c17945a0.m94929K2() != null) {
                            }
                            if (c17945a0.m94929K2() == null) {
                            }
                            this.f42544A = "";
                            this.f42566Q = false;
                            if (!(c17945a0.m94929K2() instanceof C17961f1)) {
                            }
                            if (c17945a0.m95120e6()) {
                            }
                            this.f42545A0 = c17945a0.m95030V4();
                            this.f42549C0 = c17945a0.m95288w8();
                            i11 = this.f42591p;
                            if (i11 != 2) {
                            }
                            return this;
                        }
                    }
                } catch (Exception e12) {
                    str2 = "";
                    str = str3;
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                str = "";
                str2 = str;
            }
            this.f42598s0 = new MediaStoreItem(c17945a0);
            this.f42595r = c17945a0.m95029V3().m41044h();
            this.f42605w = str3;
            this.f42557H = str4;
            this.f42556G = str4;
            this.f42564O = c17945a0.m94974P4();
            this.f42578c0 = c17945a0.m95029V3();
            this.f42593q = c17945a0.m94862C4();
            this.f42579d0 = c17945a0.mo95039W2();
            this.f42577b0 = c17945a0.m95041W4();
            this.f42609y = c17945a0.m94983Q3();
            if (c17945a0.m94929K2() != null) {
                this.f42607x = c17945a0.m94929K2().f91014s;
            }
            if (c17945a0.m94929K2() == null && !TextUtils.isEmpty(c17945a0.m94929K2().mo95598f())) {
                String mo95598f = c17945a0.m94929K2().mo95598f();
                this.f42544A = mo95598f;
                this.f42566Q = true;
                this.f42546B = TextUtils.equals(mo95598f, this.f42607x);
            } else {
                this.f42544A = "";
                this.f42566Q = false;
            }
            if (!(c17945a0.m94929K2() instanceof C17961f1)) {
                this.f42591p = 2;
                C17961f1 c17961f1 = (C17961f1) c17945a0.m94929K2();
                this.f42609y = c17961f1.m95455I();
                this.f42607x = c17961f1.f91013r;
                this.f42589n0 = c17961f1.m95465S();
            } else if (c17945a0.m94929K2() instanceof C18009w0) {
                C18009w0 c18009w0 = (C18009w0) c17945a0.m94929K2();
                if (c18009w0.m95740E() == null) {
                    m95740E = "";
                } else {
                    m95740E = c18009w0.m95740E();
                }
                this.f42580e0 = m95740E;
                if (c18009w0.m95741F() != null) {
                    str6 = c18009w0.m95741F();
                }
                this.f42581f0 = str6;
                if (c18009w0.m95785s() * c18009w0.m95787u() > 0) {
                    this.f42582g0 = new Size(c18009w0.m95787u(), c18009w0.m95785s());
                } else {
                    this.f42582g0 = new Size(1, 1);
                }
                this.f42548C = c18009w0.f91013r;
                this.f42607x = c18009w0.f91014s;
            } else if (c17945a0.m94929K2() instanceof C17990p0) {
                this.f42607x = c17945a0.m95266u2();
                if (!TextUtils.isEmpty(c17945a0.m94983Q3()) && AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                    this.f42544A = c17945a0.m94983Q3();
                } else {
                    this.f42544A = c17945a0.m94929K2().f91014s;
                }
                this.f42566Q = !TextUtils.isEmpty(this.f42544A);
            } else if ((c17945a0.m94929K2() instanceof C18013y0) && TextUtils.equals(c17945a0.m94929K2().f91016u, "recommened.link")) {
                this.f42607x = c17945a0.m94929K2().f91013r;
            }
            if (c17945a0.m95120e6()) {
                this.f42567R = true;
            }
            this.f42545A0 = c17945a0.m95030V4();
            this.f42549C0 = c17945a0.m95288w8();
            i11 = this.f42591p;
            if (i11 != 2) {
                this.f42585j0 = c17945a0.m95022U7();
            } else if (i11 == 1) {
                boolean m95022U7 = c17945a0.m95022U7();
                this.f42583h0 = m95022U7;
                if (this.f42546B) {
                    this.f42584i0 = m95022U7;
                }
            }
        }
        return this;
    }

    /* renamed from: b0 */
    public ItemAlbumMobile m40516b0(C25821b c25821b) {
        if (c25821b != null) {
            File m126894r = C24302e.m126894r(c25821b);
            if (m126894r.exists() && m126894r.length() > 0) {
                this.f42609y = m126894r.getPath();
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c25821b.m133146i().m41050n());
            if (m141809c != null) {
                this.f42605w = m141809c.f42437s;
            }
            this.f42578c0 = c25821b.m133146i();
            this.f42579d0 = c25821b.m133146i().m41048l();
            this.f42593q = c25821b.m133146i().m41050n();
            this.f42595r = c25821b.m133141d();
            this.f42564O = c25821b.m133150m();
            this.f42607x = m126894r.getPath();
            this.f42566Q = false;
            this.f42544A = "";
            this.f42551D0 = EnumC7884d.ZCLOUD;
            this.f42548C = c25821b.m133149l();
            if (AbstractC16893a.m90331h(c25821b)) {
                this.f42591p = 2;
            }
        }
        return this;
    }

    @Override // gq.AbstractC19588k
    /* renamed from: d */
    public int mo40517d() {
        Size size = this.f42582g0;
        if (size != null) {
            return size.getHeight();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // gq.AbstractC19588k
    /* renamed from: e */
    public int mo40518e() {
        Size size = this.f42582g0;
        if (size != null) {
            return size.getWidth();
        }
        return 0;
    }

    /* renamed from: e0 */
    public void m40519e0(C2954c c2954c) {
        int i11;
        if (c2954c != null) {
            AbstractC2959d m13986a = c2954c.m13986a();
            if (m13986a != null) {
                if (m13986a instanceof C2964e) {
                    this.f42595r = String.valueOf(((C2964e) m13986a).m14027j());
                } else if (m13986a instanceof C2969f) {
                    this.f42595r = String.valueOf(((C2969f) m13986a).m14049m());
                }
            }
            if (c2954c.m13986a() != null) {
                this.f42548C = c2954c.m13986a().m14012c();
                this.f42550D = c2954c.m13986a().m14013d();
                this.f42609y = c2954c.m13986a().m14013d();
                if (c2954c.m13990e()) {
                    this.f42607x = c2954c.m13986a().m14011b();
                    this.f42544A = c2954c.m13986a().m14011b();
                    this.f42611z = c2954c.m13986a().m14013d();
                }
                if (c2954c.m13990e()) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                this.f42591p = i11;
            }
            this.f42596r0 = c2954c.m13987b();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ItemAlbumMobile) {
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) obj;
            if (m40496C() != null && itemAlbumMobile.m40496C() != null) {
                return m40496C().equals(itemAlbumMobile.m40496C());
            }
            return false;
        }
        return false;
    }

    /* renamed from: g0 */
    public void m40520g0(MediaStoreItem mediaStoreItem) {
        try {
            String m94862C4 = mediaStoreItem.m40599m().m94862C4();
            String m94854B4 = mediaStoreItem.m40599m().m94854B4();
            ContactProfile m141811g = C28203u6.f131407a.m141811g(m94862C4);
            if (m141811g != null && !TextUtils.isEmpty(m141811g.mo2475c())) {
                m94854B4 = m141811g.mo2475c();
            } else if (TextUtils.isEmpty(m94854B4)) {
                m94854B4 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bt_lookPicture);
            }
            this.f42605w = m94854B4;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public int hashCode() {
        if (m40496C() != null) {
            return m40496C().hashCode();
        }
        return super.hashCode();
    }

    /* renamed from: j */
    public void m40521j(C3020p0 c3020p0) {
        String str;
        ItemAlbumMobile itemAlbumMobile;
        C3051w0 c3051w0;
        if (c3020p0 == null) {
            return;
        }
        try {
            this.f42594q0 = c3020p0;
            this.f42590o0 = c3020p0.f12058q;
            this.f42599t = c3020p0.f12057p;
            if (c3020p0.f12064w) {
                str = "1";
            } else {
                str = "0";
            }
            this.f42552E = str;
            this.f42554F = c3020p0.f12035O + "";
            this.f42564O = c3020p0.f12062u;
            this.f42568S = c3020p0.f12065x;
            C3047v0 c3047v0 = c3020p0.f12022B;
            this.f42593q = c3047v0.f12280b;
            this.f42601u = c3047v0.f12283e;
            this.f42605w = c3047v0.f12282d;
            C3063z0 c3063z0 = c3020p0.f12023C.f12111b;
            if (c3063z0 != null) {
                C3063z0 c3063z02 = new C3063z0(c3063z0.m14734m());
                this.f42574Y = c3063z02;
                c3063z02.m14732k(false);
            }
            C3025q0 c3025q0 = c3020p0.f12023C;
            String str2 = c3025q0.f12113d;
            this.f42556G = str2;
            this.f42608x0 = str2;
            int i11 = c3020p0.f12058q;
            if (i11 != 2) {
                if (i11 == 17) {
                    this.f42591p = 2;
                    C17391z c17391z = c3025q0.f12093B;
                    if (c17391z != null) {
                        this.f42595r = c17391z.f88618a;
                        this.f42548C = c17391z.f88622e;
                    }
                }
            } else {
                this.f42591p = 1;
                ArrayList arrayList = c3025q0.f12118i;
                if (arrayList != null && !arrayList.isEmpty() && (itemAlbumMobile = (ItemAlbumMobile) c3020p0.f12023C.f12118i.get(0)) != null) {
                    this.f42595r = itemAlbumMobile.f42595r;
                    this.f42548C = itemAlbumMobile.f42548C;
                    this.f42607x = itemAlbumMobile.f42607x;
                }
            }
            this.f42561L = c3020p0.f12025E.f12243a + "";
            this.f42560K = c3020p0.f12025E.f12244b + "";
            C3051w0 c3051w02 = c3020p0.f12025E.f12246d;
            C32546b c32546b = null;
            if (c3051w02 != null) {
                c3051w0 = new C3051w0(c3051w02);
            } else {
                c3051w0 = null;
            }
            this.f42562M = c3051w0;
            if (c3020p0.f12025E.f12247e != null) {
                c32546b = new C32546b(c3020p0.f12025E.f12247e);
            }
            this.f42563N = c32546b;
            m40531q0();
            this.f42603v = "";
            this.f42597s = "";
            this.f42558I = "";
            this.f42559J = "";
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j0 */
    public void m40522j0(ArrayList arrayList, boolean z11) {
        C3003l3.b bVar = this.f42573X;
        if (bVar != null) {
            bVar.m14395h(arrayList, z11);
        }
    }

    /* renamed from: k0 */
    public void m40523k0(String str) {
        this.f42572W = new ArrayList();
        String replaceAll = str.replaceAll("(\r\n|\n)", "<br/>");
        try {
            Matcher matcher = Pattern.compile("(?i)\\b((?:https?://|www\\d{0,3}[.])[-A-Za-z0-9+&@#/%?=~_()|!:,.;àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ]*[-A-Za-z0-9+&@#/%=~_()|àáãạảăắằẳẵặâấầẩẫậèéẹẻẽêềếểễệđìíĩỉịòóõọỏôốồổỗộơớờởỡợùúũụủưứừửữựỳỵỷỹýÀÁÃẠẢĂẮẰẲẴẶÂẤẦẨẪẬÈÉẸẺẼÊỀẾỂỄỆĐÌÍĨỈỊÒÓÕỌỎÔỐỒỔỖỘƠỚỜỞỠỢÙÚŨỤỦƯỨỪỬỮỰỲỴỶỸÝ])", 42).matcher(replaceAll);
            if (matcher.find() && !replaceAll.contains("<a href=\"http")) {
                replaceAll = matcher.group().startsWith("http://") ? matcher.replaceAll("<a href=\"$1\">$1</a>") : matcher.replaceAll("<a href=\"http://$1\">$1</a>");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        Spanned fromHtml = Html.fromHtml(replaceAll);
        SpannableString spannableString = new SpannableString(fromHtml.toString());
        for (Object obj : fromHtml.getSpans(0, fromHtml.length(), Object.class)) {
            int spanStart = fromHtml.getSpanStart(obj);
            int spanEnd = fromHtml.getSpanEnd(obj);
            int spanFlags = fromHtml.getSpanFlags(obj);
            if (obj instanceof URLSpan) {
                C10866e c10866e = new C10866e(((URLSpan) obj).getURL(), spanStart, spanEnd);
                c10866e.m56379W(this.f42595r);
                c10866e.m56394i0(this.f42593q);
                c10866e.f54832J = 10;
                if (AbstractC21935u.m114518H(this.f42593q)) {
                    c10866e.m56387e0(new TrackingSource(20));
                } else {
                    c10866e.m56387e0(new TrackingSource(10));
                }
                if (!TextUtils.isEmpty(this.f42560K)) {
                    try {
                        c10866e.m56384b0(Integer.parseInt(this.f42560K));
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                this.f42572W.add(c10866e);
                spannableString.setSpan(c10866e, spanStart, spanEnd, spanFlags);
            }
        }
        this.f42565P = spannableString;
    }

    /* renamed from: l0 */
    public void m40524l0(C3003l3.b bVar) {
        this.f42573X = bVar;
    }

    /* renamed from: m */
    public void m40525m() {
        C3003l3.b bVar = this.f42573X;
        if (bVar != null) {
            bVar.m14388a();
        }
    }

    /* renamed from: m0 */
    public String m40526m0() {
        if (Boolean.TRUE.equals(C29299a.f135738a.m146396a().m101506a())) {
            return this.f42607x;
        }
        return this.f42548C;
    }

    /* renamed from: n0 */
    public void m40527n0() {
        C3025q0 c3025q0;
        try {
            C3020p0 c3020p0 = this.f42594q0;
            if (c3020p0 != null && (c3025q0 = c3020p0.f12023C) != null) {
                if (c3025q0.f12106O == null) {
                    c3025q0.f12106O = new C2949b(new JSONObject());
                }
                this.f42594q0.f12023C.f12106O.m13963f(this.f42569T);
                this.f42594q0.f12023C.f12106O.m13967j(this.f42570U);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o0 */
    public void m40528o0(C3020p0 c3020p0) {
        String str;
        C32546b c32546b;
        if (c3020p0 != null && c3020p0.f12025E != null) {
            this.f42560K = c3020p0.f12025E.f12244b + "";
            if (c3020p0.f12064w) {
                str = "1";
            } else {
                str = "0";
            }
            this.f42552E = str;
            C3051w0 c3051w0 = null;
            if (c3020p0.f12025E.f12247e != null) {
                c32546b = new C32546b(c3020p0.f12025E.f12247e);
            } else {
                c32546b = null;
            }
            this.f42563N = c32546b;
            C3051w0 c3051w02 = c3020p0.f12025E.f12246d;
            if (c3051w02 != null) {
                c3051w0 = new C3051w0(c3051w02);
            }
            this.f42562M = c3051w0;
        }
    }

    /* renamed from: p0 */
    public void m40529p0() {
        C3051w0 c3051w0;
        try {
            C3020p0 c3020p0 = this.f42594q0;
            if (c3020p0 != null) {
                c3020p0.f12064w = TextUtils.equals("1", this.f42552E);
                C3039t0 c3039t0 = this.f42594q0.f12025E;
                if (c3039t0 != null) {
                    c3039t0.f12244b = Integer.parseInt(this.f42560K);
                    this.f42594q0.f12025E.f12243a = Integer.parseInt(this.f42561L);
                    C3039t0 c3039t02 = this.f42594q0.f12025E;
                    C3051w0 c3051w02 = this.f42562M;
                    C32546b c32546b = null;
                    if (c3051w02 != null) {
                        c3051w0 = new C3051w0(c3051w02);
                    } else {
                        c3051w0 = null;
                    }
                    c3039t02.f12246d = c3051w0;
                    C3039t0 c3039t03 = this.f42594q0.f12025E;
                    if (this.f42563N != null) {
                        c32546b = new C32546b(this.f42563N);
                    }
                    c3039t03.f12247e = c32546b;
                }
                m40527n0();
            }
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public ArrayList m40530q() {
        return this.f42571V;
    }

    /* renamed from: q0 */
    public void m40531q0() {
        int i11;
        try {
            i11 = Integer.parseInt(this.f42560K);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            i11 = 0;
        }
        if (i11 > 0) {
            m40523k0(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_tv_like_photo_other_new), AbstractC20814p0.m108599D(i11)));
        } else {
            this.f42565P = "";
        }
    }

    /* renamed from: t */
    public ArrayList m40532t() {
        return this.f42572W;
    }

    public String toString() {
        return "ItemAlbumMobile{type='" + this.f42591p + "'picid='" + this.f42595r + "'cliid='" + m40534w() + "', url='" + this.f42607x + "'}";
    }

    /* renamed from: u */
    public ArrayList m40533u() {
        C3003l3.b bVar = this.f42573X;
        if (bVar == null) {
            return new ArrayList();
        }
        return bVar.f11959d;
    }

    /* renamed from: w */
    public String m40534w() {
        MessageId messageId = this.f42578c0;
        if (messageId != null) {
            return messageId.m41044h();
        }
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        parcel.writeString(this.f42593q);
        parcel.writeInt(this.f42591p);
        parcel.writeString(this.f42595r);
        parcel.writeString(this.f42597s);
        parcel.writeString(this.f42599t);
        parcel.writeString(this.f42601u);
        parcel.writeString(this.f42603v);
        parcel.writeString(this.f42605w);
        parcel.writeString(this.f42607x);
        parcel.writeString(this.f42544A);
        parcel.writeString(this.f42609y);
        parcel.writeString(this.f42548C);
        parcel.writeString(this.f42550D);
        parcel.writeString(this.f42552E);
        parcel.writeString(this.f42556G);
        parcel.writeString(this.f42608x0);
        parcel.writeString(this.f42558I);
        parcel.writeString(this.f42559J);
        parcel.writeString(this.f42554F);
        parcel.writeString(this.f42561L);
        parcel.writeString(this.f42560K);
        C3051w0 c3051w0 = this.f42562M;
        String str6 = "";
        if (c3051w0 == null) {
            str = "";
        } else {
            str = c3051w0.m14638b().toString();
        }
        parcel.writeString(str);
        parcel.writeLong(this.f42564O);
        MediaStoreItem mediaStoreItem = this.f42598s0;
        if (mediaStoreItem == null) {
            str2 = "";
        } else {
            str2 = mediaStoreItem.m40564D0().toString();
        }
        parcel.writeString(str2);
        C7883c c7883c = this.f42596r0;
        if (c7883c == null) {
            str3 = "";
        } else {
            str3 = c7883c.m40545f().toString();
        }
        parcel.writeString(str3);
        parcel.writeString(this.f42579d0);
        MessageId messageId = this.f42578c0;
        if (messageId == null) {
            str4 = "";
        } else {
            str4 = messageId.m41044h();
        }
        parcel.writeString(str4);
        MessageId messageId2 = this.f42578c0;
        if (messageId2 == null) {
            str5 = "";
        } else {
            str5 = messageId2.m41046j();
        }
        parcel.writeString(str5);
        parcel.writeInt(this.f42566Q ? 1 : 0);
        parcel.writeInt(this.f42546B ? 1 : 0);
        parcel.writeInt(this.f42568S ? 1 : 0);
        parcel.writeLong(this.f42545A0);
        parcel.writeSerializable(this.f42588m0);
        parcel.writeString(this.f42587l0);
        parcel.writeInt(this.f42549C0 ? 1 : 0);
        C32546b c32546b = this.f42563N;
        if (c32546b != null) {
            str6 = c32546b.m157608d().toString();
        }
        parcel.writeString(str6);
    }

    /* renamed from: x */
    public String m40535x(Context context) {
        try {
            long j11 = this.f42564O;
            if (j11 <= 0) {
                return this.f42558I;
            }
            String m119181A = AbstractC23160o0.m119181A(j11);
            if (TextUtils.isEmpty(m119181A)) {
                return this.f42558I;
            }
            return m119181A;
        } catch (Exception e11) {
            e11.printStackTrace();
            return this.f42558I;
        }
    }

    /* renamed from: y */
    public String m40536y() {
        try {
            if (this.f42564O <= 0) {
                return this.f42558I;
            }
            return new SimpleDateFormat("dd-MM-yyyy • HH:mm").format(new Date(this.f42564O));
        } catch (Exception e11) {
            e11.printStackTrace();
            return this.f42558I;
        }
    }

    /* renamed from: z */
    public String m40537z(Context context) {
        try {
            long j11 = this.f42564O;
            if (j11 <= 0) {
                return this.f42558I;
            }
            String m119284r = AbstractC23160o0.m119284r(j11, true);
            if (TextUtils.isEmpty(m119284r)) {
                return this.f42558I;
            }
            return m119284r;
        } catch (Exception e11) {
            e11.printStackTrace();
            return this.f42558I;
        }
    }

    public ItemAlbumMobile() {
        this.f42591p = 1;
        this.f42593q = "";
        this.f42595r = "";
        this.f42597s = "";
        this.f42599t = "";
        this.f42601u = "";
        this.f42603v = "";
        this.f42605w = "";
        this.f42607x = "";
        this.f42609y = "";
        this.f42611z = "";
        this.f42544A = "";
        this.f42546B = false;
        this.f42548C = "";
        this.f42550D = "";
        this.f42552E = "";
        this.f42554F = "0";
        this.f42556G = "";
        this.f42557H = "";
        this.f42558I = "";
        this.f42559J = "";
        this.f42560K = "0";
        this.f42561L = "0";
        this.f42566Q = false;
        this.f42567R = false;
        this.f42568S = true;
        this.f42569T = -1L;
        this.f42570U = "";
        this.f42575Z = false;
        this.f42576a0 = false;
        this.f42577b0 = 3;
        this.f42582g0 = new Size(1, 1);
        this.f42583h0 = false;
        this.f42584i0 = false;
        this.f42585j0 = false;
        this.f42587l0 = "";
        this.f42590o0 = 0;
        this.f42592p0 = 0;
        this.f42602u0 = 0;
        this.f42604v0 = 0;
        this.f42606w0 = new PointF();
        this.f42608x0 = "";
        this.f42610y0 = false;
        this.f42612z0 = System.currentTimeMillis();
        this.f42545A0 = 0L;
        this.f42547B0 = 0L;
        this.f42549C0 = false;
        this.f42551D0 = EnumC7884d.NORMAL;
        this.f42553E0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_see_less);
        this.f42555F0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.btn_see_more);
        this.f42593q = "";
        this.f42591p = 1;
        this.f42595r = "";
        this.f42597s = "";
        this.f42599t = "";
        this.f42601u = "";
        this.f42603v = "";
        this.f42605w = "";
        this.f42607x = "";
        this.f42548C = "";
        this.f42552E = "";
        this.f42554F = "0";
        this.f42556G = "";
        this.f42558I = "";
        this.f42559J = "";
        this.f42560K = "0";
        this.f42561L = "0";
        this.f42563N = null;
        this.f42562M = null;
        this.f42565P = "";
        this.f42564O = 0L;
        this.f42600t0 = null;
        this.f42578c0 = null;
        this.f42569T = -1L;
        this.f42586k0 = null;
        this.f42587l0 = "";
        this.f42588m0 = null;
        this.f42549C0 = false;
    }

    public ItemAlbumMobile(JSONObject jSONObject) {
        this.f42591p = 1;
        this.f42593q = "";
        this.f42595r = "";
        this.f42597s = "";
        this.f42599t = "";
        this.f42601u = "";
        this.f42603v = "";
        this.f42605w = "";
        this.f42607x = "";
        this.f42609y = "";
        this.f42611z = "";
        this.f42544A = "";
        this.f42546B = false;
        this.f42548C = "";
        this.f42550D = "";
        this.f42552E = "";
        this.f42554F = "0";
        this.f42556G = "";
        this.f42557H = "";
        this.f42558I = "";
        this.f42559J = "";
        this.f42560K = "0";
        this.f42561L = "0";
        this.f42566Q = false;
        this.f42567R = false;
        this.f42568S = true;
        this.f42569T = -1L;
        this.f42570U = "";
        this.f42575Z = false;
        this.f42576a0 = false;
        this.f42577b0 = 3;
        this.f42582g0 = new Size(1, 1);
        this.f42583h0 = false;
        this.f42584i0 = false;
        this.f42585j0 = false;
        this.f42587l0 = "";
        this.f42590o0 = 0;
        this.f42592p0 = 0;
        this.f42602u0 = 0;
        this.f42604v0 = 0;
        this.f42606w0 = new PointF();
        this.f42608x0 = "";
        this.f42610y0 = false;
        this.f42612z0 = System.currentTimeMillis();
        this.f42545A0 = 0L;
        this.f42547B0 = 0L;
        this.f42549C0 = false;
        this.f42551D0 = EnumC7884d.NORMAL;
        this.f42553E0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_see_less);
        this.f42555F0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.btn_see_more);
        this.f42565P = "";
        try {
            String string = !jSONObject.isNull("user_id") ? jSONObject.getString("user_id") : "";
            this.f42593q = string;
            if (TextUtils.isEmpty(string)) {
                this.f42593q = !jSONObject.isNull("ownerId") ? jSONObject.getString("ownerId") : "";
            }
            this.f42591p = !jSONObject.isNull(ZinstantMetaConstant.IMPRESSION_META_TYPE) ? jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) : 1;
            String string2 = !jSONObject.isNull("id") ? jSONObject.getString("id") : "";
            this.f42595r = string2;
            if (TextUtils.isEmpty(string2)) {
                this.f42595r = !jSONObject.isNull("photoId") ? jSONObject.getString("photoId") : "";
            }
            String string3 = !jSONObject.isNull("album_id") ? jSONObject.getString("album_id") : "";
            this.f42597s = string3;
            if (TextUtils.isEmpty(string3)) {
                this.f42597s = !jSONObject.isNull("albumid") ? jSONObject.getString("albumid") : "";
            }
            this.f42599t = !jSONObject.isNull("feed_id") ? jSONObject.getString("feed_id") : "";
            this.f42601u = !jSONObject.isNull("avt") ? jSONObject.getString("avt") : "";
            this.f42603v = !jSONObject.isNull("name") ? jSONObject.getString("name") : "";
            this.f42605w = !jSONObject.isNull("display_name") ? jSONObject.getString("display_name") : "";
            this.f42607x = !jSONObject.isNull(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) ? jSONObject.getString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) : "";
            this.f42548C = !jSONObject.isNull("thumbnail") ? jSONObject.getString("thumbnail") : "";
            this.f42552E = !jSONObject.isNull("isl") ? jSONObject.getString("isl") : "";
            this.f42556G = !jSONObject.isNull("description") ? jSONObject.getString("description") : "";
            this.f42558I = !jSONObject.isNull("tvb") ? jSONObject.getString("tvb") : "";
            this.f42559J = !jSONObject.isNull("insert_date") ? jSONObject.getString("insert_date") : "";
            this.f42554F = !jSONObject.isNull("alc") ? jSONObject.getString("alc") : "0";
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(!jSONObject.isNull("total_cmt") ? jSONObject.getInt("total_cmt") : 0);
            this.f42561L = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            sb3.append(!jSONObject.isNull("lik") ? jSONObject.getInt("lik") : 0);
            this.f42560K = sb3.toString();
            this.f42562M = !jSONObject.isNull("recently_liked") ? new C3051w0(jSONObject.optJSONObject("recently_liked")) : null;
            this.f42563N = !jSONObject.isNull("reaction_info") ? C32546b.Companion.m157609a(jSONObject.optJSONObject("reaction_info")) : null;
            this.f42564O = AbstractC18069a.m96087f(jSONObject, "insert_time");
            this.f42600t0 = null;
            this.f42608x0 = this.f42556G;
            this.f42596r0 = jSONObject.isNull("layout") ? null : new C7883c(jSONObject.getJSONObject("layout"));
            m40531q0();
            if (jSONObject.isNull("tags")) {
                return;
            }
            this.f42573X = new C3003l3.b(jSONObject.getJSONObject("tags"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public ItemAlbumMobile(ItemAlbumMobile itemAlbumMobile) {
        this.f42591p = 1;
        this.f42593q = "";
        this.f42595r = "";
        this.f42597s = "";
        this.f42599t = "";
        this.f42601u = "";
        this.f42603v = "";
        this.f42605w = "";
        this.f42607x = "";
        this.f42609y = "";
        this.f42611z = "";
        this.f42544A = "";
        this.f42546B = false;
        this.f42548C = "";
        this.f42550D = "";
        this.f42552E = "";
        this.f42554F = "0";
        this.f42556G = "";
        this.f42557H = "";
        this.f42558I = "";
        this.f42559J = "";
        this.f42560K = "0";
        this.f42561L = "0";
        this.f42566Q = false;
        this.f42567R = false;
        this.f42568S = true;
        this.f42569T = -1L;
        this.f42570U = "";
        this.f42575Z = false;
        this.f42576a0 = false;
        this.f42577b0 = 3;
        this.f42582g0 = new Size(1, 1);
        this.f42583h0 = false;
        this.f42584i0 = false;
        this.f42585j0 = false;
        this.f42587l0 = "";
        this.f42590o0 = 0;
        this.f42592p0 = 0;
        this.f42602u0 = 0;
        this.f42604v0 = 0;
        this.f42606w0 = new PointF();
        this.f42608x0 = "";
        this.f42610y0 = false;
        this.f42612z0 = System.currentTimeMillis();
        this.f42545A0 = 0L;
        this.f42547B0 = 0L;
        this.f42549C0 = false;
        this.f42551D0 = EnumC7884d.NORMAL;
        this.f42553E0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_see_less);
        this.f42555F0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.btn_see_more);
        if (itemAlbumMobile != null) {
            this.f42593q = itemAlbumMobile.f42593q;
            this.f42591p = itemAlbumMobile.f42591p;
            this.f42595r = itemAlbumMobile.f42595r;
            this.f42597s = itemAlbumMobile.f42597s;
            this.f42599t = itemAlbumMobile.f42599t;
            this.f42601u = itemAlbumMobile.f42601u;
            this.f42603v = itemAlbumMobile.f42603v;
            this.f42605w = itemAlbumMobile.f42605w;
            this.f42607x = itemAlbumMobile.f42607x;
            this.f42544A = itemAlbumMobile.f42544A;
            this.f42609y = itemAlbumMobile.f42609y;
            this.f42548C = itemAlbumMobile.f42548C;
            this.f42550D = itemAlbumMobile.f42550D;
            this.f42552E = itemAlbumMobile.f42552E;
            this.f42556G = itemAlbumMobile.f42556G;
            this.f42608x0 = itemAlbumMobile.f42556G;
            this.f42558I = itemAlbumMobile.f42558I;
            this.f42559J = itemAlbumMobile.f42559J;
            this.f42554F = itemAlbumMobile.f42554F;
            this.f42561L = itemAlbumMobile.f42561L;
            this.f42560K = itemAlbumMobile.f42560K;
            C3051w0 c3051w0 = itemAlbumMobile.f42562M;
            this.f42562M = c3051w0 != null ? new C3051w0(c3051w0) : null;
            this.f42563N = itemAlbumMobile.f42563N != null ? new C32546b(itemAlbumMobile.f42563N) : null;
            this.f42564O = itemAlbumMobile.f42564O;
            this.f42594q0 = itemAlbumMobile.f42594q0;
            this.f42590o0 = itemAlbumMobile.f42590o0;
            this.f42596r0 = itemAlbumMobile.f42596r0;
            this.f42592p0 = itemAlbumMobile.f42592p0;
            this.f42578c0 = itemAlbumMobile.f42578c0;
            this.f42566Q = itemAlbumMobile.f42566Q;
            this.f42573X = itemAlbumMobile.f42573X;
            this.f42574Y = itemAlbumMobile.f42574Y;
            this.f42568S = itemAlbumMobile.f42568S;
            this.f42565P = "";
            m40531q0();
            this.f42545A0 = itemAlbumMobile.f42545A0;
            this.f42586k0 = itemAlbumMobile.f42586k0;
            this.f42587l0 = itemAlbumMobile.f42587l0;
            this.f42588m0 = itemAlbumMobile.f42588m0;
            this.f42549C0 = itemAlbumMobile.f42549C0;
            this.f42583h0 = itemAlbumMobile.f42583h0;
            this.f42584i0 = itemAlbumMobile.f42584i0;
            this.f42585j0 = itemAlbumMobile.f42585j0;
        }
    }

    private ItemAlbumMobile(Parcel parcel) {
        this.f42591p = 1;
        this.f42593q = "";
        this.f42595r = "";
        this.f42597s = "";
        this.f42599t = "";
        this.f42601u = "";
        this.f42603v = "";
        this.f42605w = "";
        this.f42607x = "";
        this.f42609y = "";
        this.f42611z = "";
        this.f42544A = "";
        this.f42546B = false;
        this.f42548C = "";
        this.f42550D = "";
        this.f42552E = "";
        this.f42554F = "0";
        this.f42556G = "";
        this.f42557H = "";
        this.f42558I = "";
        this.f42559J = "";
        this.f42560K = "0";
        this.f42561L = "0";
        this.f42566Q = false;
        this.f42567R = false;
        this.f42568S = true;
        this.f42569T = -1L;
        this.f42570U = "";
        this.f42575Z = false;
        this.f42576a0 = false;
        this.f42577b0 = 3;
        this.f42582g0 = new Size(1, 1);
        this.f42583h0 = false;
        this.f42584i0 = false;
        this.f42585j0 = false;
        this.f42587l0 = "";
        this.f42590o0 = 0;
        this.f42592p0 = 0;
        this.f42602u0 = 0;
        this.f42604v0 = 0;
        this.f42606w0 = new PointF();
        this.f42608x0 = "";
        this.f42610y0 = false;
        this.f42612z0 = System.currentTimeMillis();
        this.f42545A0 = 0L;
        this.f42547B0 = 0L;
        this.f42549C0 = false;
        this.f42551D0 = EnumC7884d.NORMAL;
        this.f42553E0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_see_less);
        this.f42555F0 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.btn_see_more);
        this.f42593q = parcel.readString();
        this.f42591p = parcel.readInt();
        this.f42595r = parcel.readString();
        this.f42597s = parcel.readString();
        this.f42599t = parcel.readString();
        this.f42601u = parcel.readString();
        this.f42603v = parcel.readString();
        this.f42605w = parcel.readString();
        this.f42607x = parcel.readString();
        this.f42544A = parcel.readString();
        this.f42609y = parcel.readString();
        this.f42548C = parcel.readString();
        this.f42550D = parcel.readString();
        this.f42552E = parcel.readString();
        this.f42556G = parcel.readString();
        this.f42608x0 = parcel.readString();
        this.f42558I = parcel.readString();
        this.f42559J = parcel.readString();
        this.f42554F = parcel.readString();
        this.f42561L = parcel.readString();
        this.f42560K = parcel.readString();
        try {
            String readString = parcel.readString();
            this.f42562M = !TextUtils.isEmpty(readString) ? new C3051w0(new JSONObject(readString)) : null;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f42564O = parcel.readLong();
        try {
            String readString2 = parcel.readString();
            this.f42598s0 = !TextUtils.isEmpty(readString2) ? new MediaStoreItem(new JSONObject(readString2)) : null;
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            String readString3 = parcel.readString();
            this.f42596r0 = !TextUtils.isEmpty(readString3) ? new C7883c(new JSONObject(readString3)) : null;
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        this.f42565P = "";
        m40531q0();
        this.f42579d0 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String str = this.f42579d0;
        this.f42578c0 = MessageId.m41038e(readString4, readString5, str == null ? "" : str, "");
        this.f42566Q = parcel.readInt() == 1;
        this.f42546B = parcel.readInt() == 1;
        this.f42568S = parcel.readInt() == 1;
        this.f42545A0 = parcel.readLong();
        this.f42588m0 = (C27373c) parcel.readSerializable();
        this.f42587l0 = parcel.readString();
        this.f42549C0 = parcel.readInt() == 1;
        try {
            String readString6 = parcel.readString();
            this.f42563N = TextUtils.isEmpty(readString6) ? null : C32546b.Companion.m157609a(new JSONObject(readString6));
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }
}
