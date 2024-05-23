package be;

import ag0.C0849v0;
import ag0.C0851w0;
import android.text.TextUtils;
import bo.C3063z0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.social.controls.LikeContactItem;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import com.zing.zalocore.connection.socket.AbstractC17526e;
import com.zing.zalocore.connection.socket.RequestUploadPacket;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import jm0.AbstractC21300j;
import jm0.InterfaceC21301k;
import me0.AbstractC23006a0;
import me0.AbstractC23047d8;
import me0.AbstractC23148n;
import me0.AbstractC23161o1;
import org.apache.commons.collections4.queue.C24418a;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p386ob.EnumC24191b;
import p609wh.C29037t0;
import p645xh.AbstractC29633j;
import p645xh.C29630g;
import p645xh.C29632i;

/* renamed from: be.c */
/* loaded from: classes3.dex */
public class C2774c {

    /* renamed from: A */
    public double f10956A;

    /* renamed from: B */
    public boolean f10957B;

    /* renamed from: F */
    public TrackingSource f10961F;

    /* renamed from: J */
    public String f10965J;

    /* renamed from: K */
    private InterfaceC20098e f10966K;

    /* renamed from: Q */
    public boolean f10972Q;

    /* renamed from: S */
    public boolean f10974S;

    /* renamed from: T */
    public boolean f10975T;

    /* renamed from: U */
    public String f10976U;

    /* renamed from: V */
    public long f10977V;

    /* renamed from: W */
    public String f10978W;

    /* renamed from: X */
    public String f10979X;

    /* renamed from: Y */
    public String f10980Y;

    /* renamed from: Z */
    public int f10981Z;

    /* renamed from: a */
    private int f10982a;

    /* renamed from: a0 */
    private int f10983a0;

    /* renamed from: b */
    private final String f10984b;

    /* renamed from: b0 */
    private boolean f10985b0;

    /* renamed from: c */
    private String f10986c;

    /* renamed from: c0 */
    public boolean f10987c0;

    /* renamed from: d0 */
    public String f10989d0;

    /* renamed from: e */
    private final int f10990e;

    /* renamed from: e0 */
    public long f10991e0;

    /* renamed from: f */
    private final String f10992f;

    /* renamed from: f0 */
    public long f10993f0;

    /* renamed from: g */
    private final short f10994g;

    /* renamed from: g0 */
    public int f10995g0;

    /* renamed from: h */
    private int f10996h;

    /* renamed from: h0 */
    public EnumC24191b f10997h0;

    /* renamed from: i */
    private String f10998i;

    /* renamed from: i0 */
    public boolean f10999i0;

    /* renamed from: j */
    private ArrayList f11000j;

    /* renamed from: j0 */
    private final Hashtable f11001j0;

    /* renamed from: k */
    private final int f11002k;

    /* renamed from: m */
    private final int f11004m;

    /* renamed from: o */
    private long f11006o;

    /* renamed from: p */
    private C3063z0 f11007p;

    /* renamed from: q */
    private PrivacyInfo f11008q;

    /* renamed from: r */
    private C23307g f11009r;

    /* renamed from: s */
    private C23307g f11010s;

    /* renamed from: t */
    private boolean f11011t;

    /* renamed from: u */
    private int f11012u;

    /* renamed from: v */
    private final int f11013v;

    /* renamed from: w */
    private boolean f11014w;

    /* renamed from: x */
    private final long f11015x;

    /* renamed from: y */
    public int f11016y;

    /* renamed from: z */
    public double f11017z;

    /* renamed from: d */
    private String f10988d = "";

    /* renamed from: l */
    private boolean f11003l = false;

    /* renamed from: n */
    private int f11005n = 0;

    /* renamed from: C */
    private int f10958C = 0;

    /* renamed from: D */
    boolean f10959D = false;

    /* renamed from: E */
    public int f10960E = 0;

    /* renamed from: G */
    public long f10962G = 0;

    /* renamed from: H */
    public SongInfo f10963H = null;

    /* renamed from: I */
    public StoryMusicAttachment f10964I = null;

    /* renamed from: L */
    public boolean f10967L = false;

    /* renamed from: M */
    private final ArrayList f10968M = new ArrayList();

    /* renamed from: N */
    int f10969N = 0;

    /* renamed from: O */
    C24418a f10970O = new C24418a(10);

    /* renamed from: P */
    private boolean f10971P = true;

    /* renamed from: R */
    public boolean f10973R = true;

    /* renamed from: be.c$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC21301k {
        a() {
        }

        @Override // jm0.InterfaceC21301k
        /* renamed from: a */
        public void mo13369a(int i11) {
            if (C2774c.this.f10966K != null) {
                C2774c.this.f10966K.mo2130c(i11, i11 + "%");
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public /* synthetic */ void mo1342c(C20096c c20096c) {
            AbstractC21300j.m110330b(this, c20096c);
        }

        @Override // jm0.InterfaceC21301k
        /* renamed from: d */
        public void mo13370d(JSONObject jSONObject, int i11, long j11, long j12) {
            boolean z11;
            C2774c c2774c = C2774c.this;
            if (i11 != 0 && i11 != 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            c2774c.f10971P = z11;
            C2774c c2774c2 = C2774c.this;
            c2774c2.f10995g0 = i11;
            c2774c2.f10991e0 = j11;
            c2774c2.f10993f0 = j12;
            if (j11 > 0 && j12 > 0) {
                c2774c2.f10997h0 = EnumC24191b.f116759s;
            } else if (j11 >= 0 && j12 == 0) {
                c2774c2.f10997h0 = EnumC24191b.f116758r;
            } else {
                c2774c2.f10997h0 = EnumC24191b.f116757q;
            }
            AbstractC20110a.m104535d("upload chunk: %s", jSONObject);
            if (C2774c.this.f10966K != null) {
                C2774c.this.f10966K.mo2129b(jSONObject.toString());
            }
        }

        @Override // jm0.InterfaceC21301k
        /* renamed from: e */
        public void mo13371e(C20096c c20096c, int i11, long j11, long j12) {
            AbstractC20110a.m104535d("native error: %s", c20096c.m104492d());
            if (C2774c.this.f10966K != null) {
                C2774c.this.f10966K.mo2128a(c20096c);
            }
            C2774c c2774c = C2774c.this;
            c2774c.f10995g0 = i11;
            c2774c.f10991e0 = j11;
            c2774c.f10993f0 = j12;
            if (j11 == 0) {
                c2774c.f10997h0 = EnumC24191b.f116757q;
            } else {
                c2774c.f10997h0 = EnumC24191b.f116759s;
            }
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public /* synthetic */ void mo1343f(JSONObject jSONObject) {
            AbstractC21300j.m110329a(this, jSONObject);
        }
    }

    public C2774c(String str, int i11, String str2, int i12, String str3, String str4, short s7, int i13, int i14, long j11, boolean z11) {
        this.f10986c = str;
        this.f10984b = str2;
        this.f10990e = i12;
        this.f10992f = str3;
        this.f10994g = s7;
        this.f10996h = i13;
        this.f10998i = str4;
        if (i11 <= 0) {
            this.f11002k = new Random().nextInt(Integer.MAX_VALUE);
        } else {
            this.f11002k = i11;
        }
        this.f11004m = 0;
        this.f11013v = i14;
        this.f10983a0 = 0;
        this.f11015x = j11;
        this.f10981Z = 0;
        this.f10985b0 = z11;
        this.f11001j0 = new Hashtable();
        this.f10999i0 = false;
    }

    /* renamed from: h */
    private String m13338h() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f10970O.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray.toString();
    }

    /* renamed from: i */
    private ByteArrayOutputStream m13339i() {
        byte[] m147357f;
        int i11;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            short s7 = this.f10994g;
            int i12 = 0;
            if (s7 != 162) {
                if (s7 != 164 && s7 != 1600) {
                    if (s7 != 1607) {
                        if (s7 != 1850 && s7 != 2040) {
                        }
                    } else {
                        byteArrayOutputStream.write(1);
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
                        byteArrayOutputStream.write((byte) AbstractC23309i.m122489v1());
                    }
                }
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(1);
                byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
            } else {
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                byteArrayOutputStream.write(this.f11014w ? (byte) 1 : (byte) 0);
                TrackingSource trackingSource = this.f10961F;
                if (trackingSource != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource.m40683t()));
                    byte[] m40681n = this.f10961F.m40681n();
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m40681n.length));
                    if (m40681n.length > 0) {
                        byteArrayOutputStream.write(m40681n);
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                if (TextUtils.isEmpty(this.f10965J)) {
                    m147357f = new byte[0];
                } else {
                    m147357f = AbstractC29633j.m147357f(this.f10965J);
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(m147357f.length));
                if (m147357f.length > 0) {
                    byteArrayOutputStream.write(m147357f);
                }
                C23307g c23307g = this.f11009r;
                if (c23307g != null) {
                    i11 = c23307g.f113474a;
                } else {
                    i11 = 0;
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                C23307g c23307g2 = this.f11009r;
                if (c23307g2 != null) {
                    i12 = c23307g2.f113475b;
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(i12));
                byteArrayOutputStream.write(AbstractC23047d8.m118254f());
            }
            return byteArrayOutputStream;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: j */
    private ByteArrayOutputStream m13340j() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            switch (this.f10994g) {
                case 162:
                    byteArrayOutputStream.write(1);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(AbstractC23006a0.m117905e()));
                    return byteArrayOutputStream;
                case 164:
                    byte[] bytes = AbstractC17522a.m93343f(this.f10992f).getBytes(StandardCharsets.UTF_8);
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
                    if (bytes.length > 0) {
                        byteArrayOutputStream.write(bytes);
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(AbstractC23006a0.m117905e()));
                    return byteArrayOutputStream;
                case 166:
                    if (this.f10992f.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(this.f10992f.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10992f.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(AbstractC23006a0.m117905e()));
                    if (this.f10998i.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10998i.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10998i.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    return byteArrayOutputStream;
                case 169:
                case 1246:
                    if (this.f10992f.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(this.f10992f.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10992f.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    }
                    if (this.f10998i.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10998i.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10998i.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    ArrayList arrayList = this.f11000j;
                    if (arrayList != null && arrayList.size() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11000j.size()));
                        Iterator it = this.f11000j.iterator();
                        while (it.hasNext()) {
                            try {
                                byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it.next())));
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    return byteArrayOutputStream;
                case 179:
                    byteArrayOutputStream.write(AbstractC17522a.m93343f(this.f10992f).getBytes("UTF-8"));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(AbstractC23309i.m122489v1()));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(this.f10998i.getBytes("UTF-8").length));
                    byteArrayOutputStream.write(this.f10998i.getBytes("UTF-8"));
                    ArrayList arrayList2 = this.f11000j;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        byteArrayOutputStream.write((byte) this.f11000j.size());
                        Iterator it2 = this.f11000j.iterator();
                        while (it2.hasNext()) {
                            try {
                                byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it2.next())));
                            } catch (Exception e12) {
                                AbstractC20110a.m104539h(e12);
                            }
                        }
                    } else {
                        byteArrayOutputStream.write(0);
                    }
                    return byteArrayOutputStream;
                case 230:
                    byteArrayOutputStream.write(1);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(AbstractC23006a0.m117909g()));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    return byteArrayOutputStream;
                case 1247:
                case 1260:
                    if (this.f10992f.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(this.f10992f.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10992f.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    }
                    if (this.f10998i.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10998i.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10998i.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    ArrayList arrayList3 = this.f11000j;
                    if (arrayList3 != null && arrayList3.size() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11000j.size()));
                        Iterator it3 = this.f11000j.iterator();
                        while (it3.hasNext()) {
                            try {
                                byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it3.next())));
                            } catch (Exception e13) {
                                AbstractC20110a.m104539h(e13);
                            }
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    return byteArrayOutputStream;
                case 1561:
                    byteArrayOutputStream.write(AbstractC17522a.m93343f(this.f10992f).getBytes("UTF-8"));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11016y));
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f11017z));
                    byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f10956A));
                    byteArrayOutputStream.write(this.f10957B ? (byte) 1 : (byte) 0);
                    return byteArrayOutputStream;
                case 1600:
                    if (this.f10992f.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10992f.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10992f.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    if (this.f10998i.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10998i.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10998i.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    ArrayList arrayList4 = this.f11000j;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11000j.size()));
                        Iterator it4 = this.f11000j.iterator();
                        while (it4.hasNext()) {
                            try {
                                byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) it4.next())));
                            } catch (Exception e14) {
                                AbstractC20110a.m104539h(e14);
                            }
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    return byteArrayOutputStream;
                case 1607:
                    byte[] bytes2 = AbstractC17522a.m93343f(this.f10992f).getBytes("UTF-8");
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes2.length));
                    if (bytes2.length > 0) {
                        byteArrayOutputStream.write(bytes2);
                    }
                    if (this.f10998i.length() > 0) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10998i.getBytes("UTF-8").length));
                        byteArrayOutputStream.write(this.f10998i.getBytes("UTF-8"));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    return byteArrayOutputStream;
                case 1850:
                    String m93343f = AbstractC17522a.m93343f(this.f10992f);
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes3 = m93343f.getBytes(charset);
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes3.length));
                    if (bytes3.length > 0) {
                        byteArrayOutputStream.write(bytes3);
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10998i.getBytes(charset).length));
                    if (this.f10998i.length() > 0) {
                        byteArrayOutputStream.write(this.f10998i.getBytes(charset));
                    }
                    return byteArrayOutputStream;
                default:
                    return byteArrayOutputStream;
            }
        } catch (Exception e15) {
            AbstractC20110a.m104539h(e15);
            return null;
        }
        AbstractC20110a.m104539h(e15);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: k */
    private ByteArrayOutputStream m13341k() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = "";
            int i16 = 0;
            switch (this.f10994g) {
                case 162:
                    if (TextUtils.isEmpty(this.f10992f)) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    } else {
                        byte[] bytes = this.f10992f.getBytes("utf-8");
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes.length));
                        byteArrayOutputStream.write(bytes);
                    }
                    return byteArrayOutputStream;
                case 164:
                    C23307g c23307g = this.f11009r;
                    if (c23307g != null) {
                        i11 = c23307g.f113474a;
                    } else {
                        i11 = 0;
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i11));
                    C23307g c23307g2 = this.f11009r;
                    if (c23307g2 != null) {
                        i16 = c23307g2.f113475b;
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(i16));
                    return byteArrayOutputStream;
                case 166:
                    if (!TextUtils.isEmpty(this.f10965J)) {
                        str = this.f10965J;
                    }
                    byte[] m147357f = AbstractC29633j.m147357f(str);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m147357f.length));
                    if (m147357f.length > 0) {
                        byteArrayOutputStream.write(m147357f);
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(1);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    return byteArrayOutputStream;
                case 169:
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                    return byteArrayOutputStream;
                case 179:
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(this.f11006o));
                    C3063z0 c3063z0 = this.f11007p;
                    if (c3063z0 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z0.m153170b()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f11007p.m153169a()));
                        if (!TextUtils.isEmpty(this.f11007p.m14727f())) {
                            i12 = this.f11007p.m14727f().getBytes("UTF-8").length;
                        } else {
                            i12 = 0;
                        }
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(i12));
                        if (i12 > 0) {
                            byteArrayOutputStream.write(this.f11007p.m14727f().getBytes("UTF-8"));
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    }
                    PrivacyInfo privacyInfo = this.f11008q;
                    if (privacyInfo != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(privacyInfo.f45973p));
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(this.f11008q.f45974q.size()));
                        Iterator it = this.f11008q.f45974q.iterator();
                        while (it.hasNext()) {
                            byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(((LikeContactItem) it.next()).m56333d())));
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(-1));
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    }
                    byteArrayOutputStream.write(this.f11011t ? 1 : 0);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10958C));
                    return byteArrayOutputStream;
                case 230:
                    if (!TextUtils.isEmpty(this.f10965J)) {
                        byte[] bytes2 = this.f10965J.getBytes("UTF-8");
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(bytes2.length));
                        byteArrayOutputStream.write(bytes2);
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    return byteArrayOutputStream;
                case 1246:
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(this.f11006o));
                    C3063z0 c3063z02 = this.f11007p;
                    if (c3063z02 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z02.m153170b()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f11007p.m153169a()));
                        if (!TextUtils.isEmpty(this.f11007p.m14727f())) {
                            i13 = this.f11007p.m14727f().getBytes("UTF-8").length;
                        } else {
                            i13 = 0;
                        }
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(i13));
                        if (i13 > 0) {
                            byteArrayOutputStream.write(this.f11007p.m14727f().getBytes("UTF-8"));
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    PrivacyInfo privacyInfo2 = this.f11008q;
                    if (privacyInfo2 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo2.f45973p));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11008q.f45974q.size()));
                        if (this.f11008q.f45974q.size() > 0) {
                            Iterator it2 = this.f11008q.f45974q.iterator();
                            while (it2.hasNext()) {
                                try {
                                    byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(((LikeContactItem) it2.next()).m56333d())));
                                } catch (Exception e11) {
                                    AbstractC20110a.m104539h(e11);
                                }
                            }
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    C23307g c23307g3 = this.f11009r;
                    if (c23307g3 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(c23307g3.f113474a));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11009r.f113475b));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    byteArrayOutputStream.write(this.f11011t ? 1 : 0);
                    if (!TextUtils.isEmpty(this.f10965J)) {
                        str = this.f10965J;
                    }
                    byte[] m147357f2 = AbstractC29633j.m147357f(str);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m147357f2.length));
                    if (m147357f2.length > 0) {
                        byteArrayOutputStream.write(m147357f2);
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10958C));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(1);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    TrackingSource trackingSource = this.f10961F;
                    if (trackingSource != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource.m40683t()));
                        byte[] m40681n = this.f10961F.m40681n();
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(m40681n.length));
                        if (m40681n.length > 0) {
                            byteArrayOutputStream.write(m40681n);
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(2));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(this.f10962G));
                    SongInfo songInfo = this.f10963H;
                    if (songInfo != null) {
                        byte[] bytes3 = songInfo.m45182d().getBytes(StandardCharsets.UTF_8);
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes3.length));
                        byteArrayOutputStream.write(bytes3);
                        byteArrayOutputStream.write(this.f10963H.m45181c() ? (byte) 1 : (byte) 0);
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                        byteArrayOutputStream.write(0);
                    }
                    return byteArrayOutputStream;
                case 1247:
                case 1260:
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(this.f11006o));
                    C3063z0 c3063z03 = this.f11007p;
                    if (c3063z03 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z03.m153170b()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f11007p.m153169a()));
                        if (!TextUtils.isEmpty(this.f11007p.m14727f())) {
                            i14 = this.f11007p.m14727f().getBytes("UTF-8").length;
                        } else {
                            i14 = 0;
                        }
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(i14));
                        if (i14 > 0) {
                            byteArrayOutputStream.write(this.f11007p.m14727f().getBytes("UTF-8"));
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    PrivacyInfo privacyInfo3 = this.f11008q;
                    if (privacyInfo3 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo3.f45973p));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11008q.f45974q.size()));
                        if (this.f11008q.f45974q.size() > 0) {
                            Iterator it3 = this.f11008q.f45974q.iterator();
                            while (it3.hasNext()) {
                                try {
                                    byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(((LikeContactItem) it3.next()).m56333d())));
                                } catch (Exception e12) {
                                    AbstractC20110a.m104539h(e12);
                                }
                            }
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(-1));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    C23307g c23307g4 = this.f11009r;
                    if (c23307g4 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(c23307g4.f113474a));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11009r.f113475b));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    byteArrayOutputStream.write(this.f11011t ? 1 : 0);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11012u));
                    if (!TextUtils.isEmpty(this.f10965J)) {
                        str = this.f10965J;
                    }
                    byte[] m147357f3 = AbstractC29633j.m147357f(str);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m147357f3.length));
                    if (m147357f3.length > 0) {
                        byteArrayOutputStream.write(m147357f3);
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(1);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(CoreUtility.f89236l));
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    StoryMusicAttachment storyMusicAttachment = this.f10964I;
                    if (storyMusicAttachment != null) {
                        byte[] bytes4 = storyMusicAttachment.m46923a().getBytes(StandardCharsets.UTF_8);
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes4.length));
                        byteArrayOutputStream.write(bytes4);
                        byteArrayOutputStream.write((byte) this.f10964I.m46924b());
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10964I.m46925c()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f10964I.m46928f()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f10964I.m46929g()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f10964I.m46926d()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f10964I.m46927e()));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                        byteArrayOutputStream.write(0);
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(0.0d));
                    }
                    TrackingSource trackingSource2 = this.f10961F;
                    if (trackingSource2 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource2.m40683t()));
                        byte[] m40681n2 = this.f10961F.m40681n();
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(m40681n2.length));
                        if (m40681n2.length > 0) {
                            byteArrayOutputStream.write(m40681n2);
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    }
                    return byteArrayOutputStream;
                case 1600:
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(this.f11006o));
                    C3063z0 c3063z04 = this.f11007p;
                    if (c3063z04 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(c3063z04.m153170b()));
                        byteArrayOutputStream.write(AbstractC17522a.m93342e(this.f11007p.m153169a()));
                        if (!TextUtils.isEmpty(this.f11007p.m14727f())) {
                            i15 = this.f11007p.m14727f().getBytes("UTF-8").length;
                        } else {
                            i15 = 0;
                        }
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(i15));
                        if (i15 > 0) {
                            byteArrayOutputStream.write(this.f11007p.m14727f().getBytes("UTF-8"));
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93346i(-1L));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    PrivacyInfo privacyInfo4 = this.f11008q;
                    if (privacyInfo4 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(privacyInfo4.f45973p));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11008q.f45974q.size()));
                        if (this.f11008q.f45974q.size() > 0) {
                            Iterator it4 = this.f11008q.f45974q.iterator();
                            while (it4.hasNext()) {
                                try {
                                    byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt(((LikeContactItem) it4.next()).m56333d())));
                                } catch (Exception e13) {
                                    AbstractC20110a.m104539h(e13);
                                }
                            }
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    C23307g c23307g5 = this.f11009r;
                    if (c23307g5 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(c23307g5.f113474a));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11009r.f113475b));
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    byteArrayOutputStream.write(this.f11011t ? 1 : 0);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f11012u));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f10958C));
                    TrackingSource trackingSource3 = this.f10961F;
                    if (trackingSource3 != null) {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource3.m40683t()));
                        byte[] m40681n3 = this.f10961F.m40681n();
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(m40681n3.length));
                        if (m40681n3.length > 0) {
                            byteArrayOutputStream.write(m40681n3);
                        }
                    } else {
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(this.f10962G));
                    return byteArrayOutputStream;
                case 1607:
                    byteArrayOutputStream.write(AbstractC17522a.m93346i(this.f11006o));
                    if (!TextUtils.isEmpty(this.f10965J)) {
                        str = this.f10965J;
                    }
                    byte[] m147357f4 = AbstractC29633j.m147357f(str);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m147357f4.length));
                    if (m147357f4.length > 0) {
                        byteArrayOutputStream.write(m147357f4);
                    }
                    return byteArrayOutputStream;
                case 1850:
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                    if (!TextUtils.isEmpty(this.f10965J)) {
                        str = this.f10965J;
                    }
                    byte[] m147357f5 = AbstractC29633j.m147357f(str);
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m147357f5.length));
                    if (m147357f5.length > 0) {
                        byteArrayOutputStream.write(m147357f5);
                    }
                    return byteArrayOutputStream;
                case 2040:
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(AbstractC23309i.m122489v1()));
                    byte[] bytes5 = this.f10992f.getBytes(StandardCharsets.UTF_8);
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(bytes5.length));
                    if (bytes5.length > 0) {
                        byteArrayOutputStream.write(bytes5);
                    }
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                    return byteArrayOutputStream;
                default:
                    return byteArrayOutputStream;
            }
        } catch (Exception e14) {
            AbstractC20110a.m104539h(e14);
            return null;
        }
        AbstractC20110a.m104539h(e14);
        return null;
    }

    /* renamed from: l */
    private ByteArrayOutputStream m13342l() {
        byte[] m147357f;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (this.f10994g == 164) {
                byteArrayOutputStream.write(this.f11014w ? 1 : 0);
                TrackingSource trackingSource = this.f10961F;
                if (trackingSource != null) {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(trackingSource.m40683t()));
                    byte[] m40681n = this.f10961F.m40681n();
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(m40681n.length));
                    if (m40681n.length > 0) {
                        byteArrayOutputStream.write(m40681n);
                    }
                } else {
                    byteArrayOutputStream.write(AbstractC17522a.m93345h(0));
                    byteArrayOutputStream.write(AbstractC17522a.m93344g(0));
                }
                if (TextUtils.isEmpty(this.f10965J)) {
                    m147357f = new byte[0];
                } else {
                    m147357f = AbstractC29633j.m147357f(this.f10965J);
                }
                byteArrayOutputStream.write(AbstractC17522a.m93344g(m147357f.length));
                if (m147357f.length > 0) {
                    byteArrayOutputStream.write(m147357f);
                }
                byteArrayOutputStream.write(AbstractC23047d8.m118254f());
            }
            return byteArrayOutputStream;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: r */
    private boolean m13343r() {
        return this.f10985b0 && !this.f10987c0;
    }

    /* renamed from: s */
    private void m13344s() {
        long j11;
        try {
            if (this.f10982a > 0) {
                this.f10970O.clear();
                int i11 = 0;
                for (int i12 = 0; i12 < this.f10968M.size(); i12++) {
                    if (((AbstractC2772a) this.f10968M.get(i12)).m13334e() != 3 && ((AbstractC2772a) this.f10968M.get(i12)).m13334e() != 4) {
                        this.f10970O.add(Integer.valueOf(((AbstractC2772a) this.f10968M.get(i12)).f10937b));
                    }
                    i11++;
                }
                j11 = (i11 * 100) / this.f10982a;
            } else {
                j11 = 0;
            }
            InterfaceC20098e interfaceC20098e = this.f10966K;
            if (interfaceC20098e != null) {
                interfaceC20098e.mo2130c(j11, j11 + "%");
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: A */
    public void m13345A(C23307g c23307g) {
        this.f11009r = c23307g;
    }

    /* renamed from: B */
    public void m13346B(C23307g c23307g) {
        this.f11010s = c23307g;
    }

    /* renamed from: C */
    public void m13347C(PrivacyInfo privacyInfo) {
        this.f11008q = privacyInfo;
    }

    /* renamed from: D */
    public void m13348D(boolean z11) {
        this.f11014w = z11;
    }

    /* renamed from: E */
    public void m13349E(ArrayList arrayList) {
        this.f11000j = arrayList;
    }

    /* renamed from: F */
    public void m13350F(int i11) {
        this.f10958C = i11;
    }

    /* renamed from: G */
    public void m13351G(boolean z11) {
        this.f10959D = z11;
    }

    /* renamed from: c */
    public void m13352c(Map map) {
        this.f11001j0.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13353d(byte[] bArr) {
        this.f10968M.add(new C2773b(bArr, this.f10968M.size() + 1, this.f11002k, -1L, -1, this.f10984b, this.f10990e, this.f10992f, this.f10994g, this.f11013v, this.f10985b0));
        this.f11005n = this.f10968M.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m13354e(byte[] bArr, long j11, int i11) {
        this.f10968M.add(new C2773b(bArr, this.f10968M.size() + 1, this.f11002k, j11, i11, this.f10984b, this.f10990e, this.f10992f, this.f10994g, this.f11013v, this.f10985b0));
        this.f11005n = this.f10968M.size();
    }

    /* renamed from: f */
    public void m13355f() {
        InterfaceC20098e interfaceC20098e = this.f10966K;
        if (interfaceC20098e != null) {
            interfaceC20098e.mo2128a(new C20096c(502, AbstractC20095b.f98832d));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013a A[Catch: Exception -> 0x0088, TryCatch #1 {Exception -> 0x0088, blocks: (B:32:0x005c, B:34:0x0064, B:36:0x0075, B:39:0x007d, B:41:0x0083, B:42:0x0130, B:44:0x013a, B:45:0x0157, B:49:0x008b, B:65:0x0091, B:67:0x00ac, B:68:0x00b6, B:51:0x00bd, B:60:0x00c3, B:62:0x00de, B:63:0x00ec, B:53:0x00f3, B:55:0x00f9, B:58:0x011d, B:69:0x012d), top: B:31:0x005c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m13356g() {
        ByteArrayOutputStream m13340j;
        ByteArrayOutputStream m13341k;
        ByteArrayOutputStream m13339i;
        ByteArrayOutputStream m13342l;
        ByteArrayOutputStream m13340j2;
        int i11;
        int i12;
        if (!m13361q()) {
            return false;
        }
        try {
            int i13 = 4;
            int i14 = 5;
            int i15 = 3;
            if (this.f11004m == 1) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f10959D) {
                    C29632i.m147326E0().m147346V0();
                } else {
                    C29630g.m147299E0().m147319V0();
                }
                int i16 = 0;
                while (!this.f11003l && System.currentTimeMillis() - currentTimeMillis <= 360000 && (this.f10968M.size() != 0 || System.currentTimeMillis() - currentTimeMillis <= 15000)) {
                    try {
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    if (this.f10968M.size() > 0) {
                        AbstractC2772a abstractC2772a = (AbstractC2772a) this.f10968M.get(i16);
                        m13344s();
                        if (abstractC2772a.m13334e() != 0 && abstractC2772a.m13334e() != 2) {
                            if (abstractC2772a.m13334e() == i15) {
                                m13344s();
                            } else if (abstractC2772a.m13334e() == i14) {
                                AbstractC20110a.m104542k(8, "upload chunk reset fileId(%d) chunkID(%d)", Integer.valueOf(this.f11002k), Integer.valueOf(abstractC2772a.f10937b));
                                InterfaceC20098e interfaceC20098e = this.f10966K;
                                if (interfaceC20098e != null) {
                                    interfaceC20098e.mo2128a(new C20096c(502, AbstractC20095b.f98832d));
                                }
                                this.f10968M.clear();
                            } else if (abstractC2772a.m13334e() == 6) {
                                AbstractC20110a.m104542k(8, "upload chunk destroy fileId(%d) chunkID(%d)", Integer.valueOf(this.f11002k), Integer.valueOf(abstractC2772a.f10937b));
                                InterfaceC20098e interfaceC20098e2 = this.f10966K;
                                if (interfaceC20098e2 != null) {
                                    int i17 = abstractC2772a.f10948m;
                                    interfaceC20098e2.mo2128a(new C20096c(i17, AbstractC23161o1.m119318c(i17, "")));
                                }
                                this.f10968M.clear();
                            } else if (abstractC2772a.m13334e() == 4) {
                                AbstractC20110a.m104542k(8, "upload chunk total done fileId(%d) chunkID(%d)", Integer.valueOf(this.f11002k), Integer.valueOf(abstractC2772a.f10937b));
                                m13344s();
                                if (!abstractC2772a.m13331b().equals("")) {
                                    this.f10966K.mo2129b(abstractC2772a.m13331b());
                                    this.f10968M.clear();
                                    break;
                                }
                            }
                            if (this.f10969N != this.f10970O.size()) {
                                AbstractC20110a.m104542k(8, "upload chunk fileId(%d) waiting (%s)", Integer.valueOf(this.f11002k), m13338h());
                                this.f10969N = this.f10970O.size();
                            }
                            i16++;
                            if (i16 < this.f10968M.size()) {
                                Thread.sleep(1L);
                                i14 = 5;
                                i15 = 3;
                            }
                        }
                        abstractC2772a.mo13330a();
                        if (this.f10969N != this.f10970O.size()) {
                        }
                        i16++;
                        if (i16 < this.f10968M.size()) {
                        }
                    }
                    i16 = 0;
                    Thread.sleep(1L);
                    i14 = 5;
                    i15 = 3;
                }
                InterfaceC20098e interfaceC20098e3 = this.f10966K;
                if (interfaceC20098e3 != null) {
                    interfaceC20098e3.mo2128a(new C20096c(502, AbstractC20095b.f98832d));
                    this.f10968M.clear();
                }
                if (System.currentTimeMillis() - currentTimeMillis > 360000) {
                    AbstractC20110a.m104542k(8, "upload chunk fileId(%d) timeout: %s", Integer.valueOf(this.f11002k), this.f10986c);
                }
            } else {
                if (this.f10959D) {
                    C29632i.m147326E0().m147347W0();
                } else {
                    C29630g.m147299E0().m147320W0();
                }
                RequestUploadPacket requestUploadPacket = new RequestUploadPacket();
                requestUploadPacket.m93304z(this.f11002k);
                requestUploadPacket.m93301w((byte) 2);
                requestUploadPacket.m93302x((byte) 0);
                requestUploadPacket.m93272C(this.f11002k);
                requestUploadPacket.m93273D(Integer.parseInt(CoreUtility.f89233i));
                requestUploadPacket.m93297s(Integer.parseInt(this.f10984b));
                requestUploadPacket.m93299u(0L);
                requestUploadPacket.m93274E((byte) 3);
                requestUploadPacket.m93309M(m13343r());
                long j11 = this.f11015x;
                if (j11 > 0) {
                    requestUploadPacket.m93270A(j11);
                }
                C23307g c23307g = this.f11010s;
                if (c23307g != null) {
                    requestUploadPacket.m93316T(c23307g.f113475b);
                    requestUploadPacket.m93337m0(this.f11010s.f113474a);
                    requestUploadPacket.m93313Q(this.f11010s.f113480g);
                }
                requestUploadPacket.m93333i0(this.f10981Z);
                requestUploadPacket.m93324b0(this.f10979X);
                requestUploadPacket.m93327e0(this.f10980Y);
                requestUploadPacket.m93326d0(this.f10959D ? 1 : 0);
                requestUploadPacket.m93295q(this.f10994g);
                requestUploadPacket.m93315S(this.f11001j0);
                requestUploadPacket.m93318V(this.f10999i0 ? (byte) 1 : (byte) 0);
                if (this.f10999i0) {
                    Charset charset = StandardCharsets.UTF_8;
                    requestUploadPacket.m93334j0("".getBytes(charset));
                    requestUploadPacket.m93307K(AbstractC23148n.m118830d());
                    requestUploadPacket.m93335k0(0);
                    requestUploadPacket.m93317U("localhost".getBytes(charset));
                    requestUploadPacket.m93300v(true);
                }
                ByteArrayOutputStream byteArrayOutputStream = null;
                switch (this.f10994g) {
                    case 162:
                        requestUploadPacket.m93301w((byte) 1);
                        requestUploadPacket.m93275F((byte) 6);
                        m13340j = m13340j();
                        m13341k = m13341k();
                        m13339i = m13339i();
                        byteArrayOutputStream = m13340j;
                        m13342l = null;
                        break;
                    case 164:
                        requestUploadPacket.m93301w((byte) 1);
                        requestUploadPacket.m93275F((byte) 6);
                        byteArrayOutputStream = m13340j();
                        ByteArrayOutputStream m13341k2 = m13341k();
                        ByteArrayOutputStream m13339i2 = m13339i();
                        m13341k = m13341k2;
                        m13342l = m13342l();
                        m13339i = m13339i2;
                        break;
                    case 166:
                        requestUploadPacket.m93275F((byte) 3);
                        m13340j2 = m13340j();
                        m13341k = m13341k();
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 169:
                        requestUploadPacket.m93275F((byte) 66);
                        m13340j2 = m13340j();
                        m13341k = m13341k();
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 179:
                        requestUploadPacket.m93275F((byte) 3);
                        m13340j2 = m13340j();
                        m13341k = m13341k();
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 230:
                        requestUploadPacket.m93301w((byte) 1);
                        requestUploadPacket.m93275F((byte) 1);
                        requestUploadPacket.m93304z(this.f10996h);
                        m13340j2 = m13340j();
                        m13341k = m13341k();
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 754:
                        if (this.f10987c0) {
                            if (this.f10985b0) {
                                i11 = 15;
                            } else {
                                i11 = 14;
                            }
                            requestUploadPacket.m93275F((byte) i11);
                        } else {
                            int i18 = this.f10990e;
                            if (i18 == 1) {
                                if (!this.f10985b0) {
                                    i18 = 51;
                                }
                                requestUploadPacket.m93275F((byte) i18);
                                requestUploadPacket.m93321Y(this.f10967L ? (byte) 1 : (byte) 0);
                            } else {
                                requestUploadPacket.m93275F((byte) i18);
                            }
                        }
                        m13342l = null;
                        m13341k = null;
                        m13339i = null;
                        break;
                    case 755:
                        if (this.f10985b0) {
                            i12 = this.f10990e;
                        } else {
                            i12 = 56;
                        }
                        requestUploadPacket.m93275F((byte) i12);
                        requestUploadPacket.m93321Y(this.f10967L ? (byte) 1 : (byte) 0);
                        m13342l = null;
                        m13341k = null;
                        m13339i = null;
                        break;
                    case 756:
                        requestUploadPacket.m93275F((byte) 9);
                        m13342l = null;
                        m13341k = null;
                        m13339i = null;
                        break;
                    case 1246:
                        requestUploadPacket.m93275F((byte) 8);
                        requestUploadPacket.m93306J(this.f11006o);
                        m13340j2 = m13340j();
                        m13341k = m13341k();
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 1247:
                        requestUploadPacket.m93275F((byte) 5);
                        m13340j2 = m13340j();
                        m13341k = m13341k();
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 1260:
                        requestUploadPacket.m93275F((byte) 5);
                        m13340j2 = m13340j();
                        m13341k = m13341k();
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 1561:
                        requestUploadPacket.m93275F((byte) this.f10990e);
                        m13340j2 = m13340j();
                        m13341k = null;
                        m13339i = null;
                        byteArrayOutputStream = m13340j2;
                        m13342l = m13339i;
                        break;
                    case 1563:
                        requestUploadPacket.m93311O(this.f10988d);
                        requestUploadPacket.m93326d0(2);
                        requestUploadPacket.m93275F((byte) 0);
                        m13342l = null;
                        m13341k = null;
                        m13339i = null;
                        break;
                    case 1600:
                        requestUploadPacket.m93275F((byte) 4);
                        m13340j = m13340j();
                        m13341k = m13341k();
                        m13339i = m13339i();
                        byteArrayOutputStream = m13340j;
                        m13342l = null;
                        break;
                    case 1607:
                    case 1850:
                        requestUploadPacket.m93301w((byte) 1);
                        requestUploadPacket.m93275F((byte) 0);
                        m13340j = m13340j();
                        m13341k = m13341k();
                        m13339i = m13339i();
                        byteArrayOutputStream = m13340j;
                        m13342l = null;
                        break;
                    case 2040:
                        requestUploadPacket.m93275F((byte) 0);
                        ByteArrayOutputStream m13339i3 = m13339i();
                        m13341k = m13341k();
                        m13339i = m13339i3;
                        m13342l = null;
                        break;
                    default:
                        requestUploadPacket.m93275F((byte) this.f10990e);
                        m13342l = null;
                        m13341k = null;
                        m13339i = null;
                        break;
                }
                if (byteArrayOutputStream != null) {
                    requestUploadPacket.m93314R(byteArrayOutputStream.toByteArray());
                }
                if (m13341k != null) {
                    requestUploadPacket.m93329g0(m13341k.toByteArray());
                }
                if (m13339i != null) {
                    requestUploadPacket.m93310N(m13339i.toByteArray());
                }
                if (m13342l != null) {
                    requestUploadPacket.m93332h0(m13342l.toByteArray());
                }
                requestUploadPacket.m93312P(this.f10986c);
                requestUploadPacket.m93325c0(this.f10976U);
                if (m13343r() && this.f10974S) {
                    requestUploadPacket.m93328f0(this.f10989d0);
                }
                requestUploadPacket.m93308L(this.f10977V);
                requestUploadPacket.m93323a0(this.f10977V);
                requestUploadPacket.m93336l0(this.f10978W);
                int i19 = this.f11013v;
                if (i19 > 0) {
                    requestUploadPacket.m93298t((byte) i19);
                } else {
                    requestUploadPacket.m93298t((byte) 3);
                }
                requestUploadPacket.m93276G(1);
                requestUploadPacket.m93319W(this.f10975T ? (byte) 1 : (byte) 0);
                requestUploadPacket.m93320X(this.f10974S ? (byte) 1 : (byte) 0);
                requestUploadPacket.m93322Z(this.f10972Q ? (byte) 1 : (byte) 0);
                requestUploadPacket.m93305I(this.f10973R ? (byte) 1 : (byte) 0);
                C29037t0 c29037t0 = new C29037t0(new a());
                if (this.f10959D) {
                    i13 = 8;
                }
                c29037t0.f103775r = i13;
                c29037t0.m110313i0(requestUploadPacket);
                if (this.f10959D) {
                    C0851w0.m2322b(c29037t0);
                } else {
                    C0849v0.m2319b(c29037t0);
                }
            }
        } catch (Exception e12) {
            InterfaceC20098e interfaceC20098e4 = this.f10966K;
            if (interfaceC20098e4 != null) {
                interfaceC20098e4.mo2128a(new C20096c(502, AbstractC20095b.f98832d));
            }
            AbstractC20110a.m104539h(e12);
        }
        return true;
    }

    /* renamed from: m */
    public int m13357m() {
        return this.f10990e;
    }

    /* renamed from: n */
    public int m13358n() {
        return this.f11005n;
    }

    /* renamed from: o */
    public int m13359o() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f10968M.size(); i12++) {
            i11 += ((AbstractC2772a) this.f10968M.get(i12)).m13333d().length;
        }
        return i11;
    }

    /* renamed from: p */
    public boolean m13360p() {
        return this.f10971P;
    }

    /* renamed from: q */
    public boolean m13361q() {
        AbstractC17526e m147299E0;
        if (this.f10959D) {
            m147299E0 = C29632i.m147326E0();
        } else {
            m147299E0 = C29630g.m147299E0();
        }
        return m147299E0.m93434z();
    }

    /* renamed from: t */
    public void m13362t(boolean z11) {
        this.f11003l = z11;
    }

    /* renamed from: u */
    public void m13363u(long j11) {
        this.f11006o = j11;
    }

    /* renamed from: v */
    public void m13364v(int i11) {
        this.f11012u = i11;
    }

    /* renamed from: w */
    public void m13365w(String str) {
        this.f10988d = str;
    }

    /* renamed from: x */
    public void m13366x(InterfaceC20098e interfaceC20098e) {
        this.f10966K = interfaceC20098e;
    }

    /* renamed from: y */
    public void m13367y(C3063z0 c3063z0) {
        this.f11007p = c3063z0;
    }

    /* renamed from: z */
    public void m13368z(boolean z11) {
        this.f11011t = z11;
    }

    public C2774c(int i11, String str, int i12, String str2, short s7, int i13, long j11, boolean z11) {
        this.f10984b = str;
        this.f10990e = i12;
        this.f10992f = str2;
        this.f10994g = s7;
        if (i11 <= 0) {
            this.f11002k = new Random().nextInt(Integer.MAX_VALUE);
        } else {
            this.f11002k = i11;
        }
        this.f11004m = 1;
        this.f11013v = i13;
        this.f10981Z = 0;
        this.f11015x = j11;
        this.f10985b0 = z11;
        this.f11001j0 = new Hashtable();
        this.f10999i0 = false;
    }
}
