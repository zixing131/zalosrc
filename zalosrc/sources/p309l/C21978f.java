package p309l;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import p250j.C20894a;
import p283k.AbstractC21420a;
import p283k.AbstractC21421b;
import p335m.C22694a;
import p335m.C22695b;

/* renamed from: l.f */
/* loaded from: classes2.dex */
public class C21978f extends DefaultHandler {

    /* renamed from: A */
    private List f108197A;

    /* renamed from: B */
    private List f108198B;

    /* renamed from: C */
    private List f108199C;

    /* renamed from: D */
    private List f108200D;

    /* renamed from: E */
    private List f108201E;

    /* renamed from: F */
    private List f108202F;

    /* renamed from: G */
    private C20894a f108203G;

    /* renamed from: L */
    private String f108208L;

    /* renamed from: M */
    private String f108209M;

    /* renamed from: N */
    private String f108210N;

    /* renamed from: a */
    private String f108211a;

    /* renamed from: b */
    private SAXParserFactory f108212b;

    /* renamed from: c */
    private SAXParser f108213c;

    /* renamed from: d */
    private C21976d f108214d;

    /* renamed from: h */
    private C22694a f108218h;

    /* renamed from: i */
    private List f108219i;

    /* renamed from: k */
    private List f108221k;

    /* renamed from: l */
    private List f108222l;

    /* renamed from: r */
    private HashMap f108228r;

    /* renamed from: s */
    private HashMap f108229s;

    /* renamed from: t */
    private List f108230t;

    /* renamed from: u */
    private List f108231u;

    /* renamed from: v */
    private List f108232v;

    /* renamed from: w */
    private List f108233w;

    /* renamed from: x */
    private List f108234x;

    /* renamed from: y */
    private List f108235y;

    /* renamed from: z */
    private List f108236z;

    /* renamed from: e */
    private String f108215e = null;

    /* renamed from: f */
    private List f108216f = null;

    /* renamed from: g */
    private C22695b f108217g = null;

    /* renamed from: j */
    private List f108220j = null;

    /* renamed from: m */
    private String f108223m = null;

    /* renamed from: n */
    private String f108224n = null;

    /* renamed from: o */
    private String f108225o = null;

    /* renamed from: p */
    private String f108226p = null;

    /* renamed from: q */
    private String f108227q = null;

    /* renamed from: H */
    private int f108204H = 0;

    /* renamed from: I */
    private StringBuilder f108205I = new StringBuilder(64);

    /* renamed from: J */
    private int f108206J = 0;

    /* renamed from: K */
    private int f108207K = 1;

    public C21978f(String str, String str2, String str3) {
        this.f108208L = str;
        this.f108209M = str2;
        this.f108210N = str3;
    }

    /* renamed from: c */
    private void m114782c(String str, int i11) {
        StringBuilder sb2;
        String message;
        try {
            if (i11 >= 5) {
                AbstractC21420a.m110923c("DAASTSAXParser", "DAAST wrapping exceeded max limit of 5.");
                this.f108206J = 6;
                return;
            }
            if (this.f108212b == null) {
                this.f108212b = SAXParserFactory.newInstance();
            }
            if (this.f108213c == null) {
                this.f108213c = this.f108212b.newSAXParser();
            }
            this.f108213c.parse(m114785b(str), this);
        } catch (IOException e11) {
            e = e11;
            sb2 = new StringBuilder();
            sb2.append("parse Error: ");
            message = e.getMessage();
            sb2.append(message);
            AbstractC21420a.m110923c("DAASTSAXParser", sb2.toString());
            this.f108206J = 3;
        } catch (ParserConfigurationException e12) {
            e = e12;
            sb2 = new StringBuilder();
            sb2.append("parse Error: ");
            message = e.getMessage();
            sb2.append(message);
            AbstractC21420a.m110923c("DAASTSAXParser", sb2.toString());
            this.f108206J = 3;
        } catch (SAXException e13) {
            sb2 = new StringBuilder();
            sb2.append("parse Error: ");
            message = e13.getMessage();
            sb2.append(message);
            AbstractC21420a.m110923c("DAASTSAXParser", sb2.toString());
            this.f108206J = 3;
        }
    }

    /* renamed from: e */
    private void m114783e() {
        try {
            this.f108214d = new C21976d();
            this.f108221k = new ArrayList();
            this.f108222l = new ArrayList();
            this.f108228r = new HashMap();
            this.f108229s = new HashMap();
            this.f108218h = new C22694a();
            this.f108230t = new ArrayList();
            this.f108231u = new ArrayList();
            this.f108232v = new ArrayList();
            this.f108233w = new ArrayList();
            this.f108234x = new ArrayList();
            this.f108235y = new ArrayList();
            this.f108236z = new ArrayList();
            this.f108197A = new ArrayList();
            this.f108198B = new ArrayList();
            this.f108199C = new ArrayList();
            this.f108200D = new ArrayList();
            this.f108201E = new ArrayList();
            this.f108202F = new ArrayList();
            this.f108219i = new ArrayList();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public int m114784a() {
        return this.f108206J;
    }

    /* renamed from: b */
    public String m114785b(String str) {
        if (str == null) {
            return str;
        }
        try {
            if (str.length() != 0 && str.contains("__TIME_STAMP__") && str.contains("__IDFA__") && str.contains("__APP_SET_ID__") && str.contains("__LIMIT_AD_TRACKING__")) {
                return str.replace("__TIME_STAMP__", String.valueOf(System.currentTimeMillis())).replace("__IDFA__", this.f108209M).replace("__APP_SET_ID__", this.f108208L).replace("__LIMIT_AD_TRACKING__", this.f108210N);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i11, int i12) {
        try {
            this.f108205I.append(new String(cArr, i11, i12));
        } catch (Exception e11) {
            AbstractC21420a.m110923c("DAASTSAXParser", "parse Error: " + e11.getMessage());
            this.f108206J = 3;
        }
    }

    /* renamed from: d */
    public C21976d m114786d(String str) {
        try {
            m114783e();
            m114782c(str, this.f108207K);
            if (this.f108206J == 0) {
                this.f108214d.m114769s(this.f108224n);
                this.f108214d.m114763m(this.f108225o);
                this.f108214d.m114766p(this.f108223m);
                this.f108214d.m114759i(this.f108226p);
                this.f108214d.m114753c(this.f108227q);
                String str2 = this.f108223m;
                if (str2 != null && str2.length() != 0) {
                    this.f108214d.m114752b(AbstractC21421b.m110926a(this.f108223m));
                }
                this.f108214d.m114761k(this.f108222l);
                this.f108214d.m114754d(this.f108228r);
                this.f108214d.m114756f(this.f108218h);
                this.f108214d.m114760j(this.f108229s);
                this.f108214d.m114764n(this.f108221k);
                this.f108214d.m114767q(this.f108216f);
                List list = this.f108216f;
                if (list != null && list.size() > 0) {
                    this.f108214d.m114757g(new C21973a().m114747c(this.f108216f));
                }
                this.f108214d.m114755e(this.f108219i);
                return this.f108214d;
            }
        } catch (Exception e11) {
            AbstractC21420a.m110923c("DAASTSAXParser", "parseDAAST Error: " + e11.getMessage());
        }
        return null;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        List list;
        String sb2;
        Object obj;
        try {
            if (!str3.equalsIgnoreCase("DAASTAdTagURI") && !str3.equalsIgnoreCase("VASTAdTagURI")) {
                if (str3.equalsIgnoreCase("AdTitle")) {
                    this.f108224n = this.f108205I.toString().trim();
                    return;
                }
                if (str3.equalsIgnoreCase("Description")) {
                    this.f108225o = this.f108205I.toString().trim();
                    return;
                }
                if (str3.equalsIgnoreCase("Impression")) {
                    list = this.f108221k;
                    sb2 = this.f108205I.toString();
                } else {
                    if (!str3.equalsIgnoreCase("Error")) {
                        if (str3.equalsIgnoreCase("Duration")) {
                            this.f108223m = this.f108205I.toString().trim();
                            return;
                        }
                        if (str3.equalsIgnoreCase("Verification")) {
                            list = this.f108219i;
                            obj = this.f108203G;
                        } else {
                            if (str3.equalsIgnoreCase("JavaScriptResource")) {
                                this.f108203G.m109333b(this.f108205I.toString().trim());
                                return;
                            }
                            if (str3.equalsIgnoreCase("VerificationParameters")) {
                                this.f108203G.m109332a(this.f108205I.toString().trim());
                                return;
                            }
                            if (!str3.equalsIgnoreCase("MediaFile")) {
                                if (!str3.equalsIgnoreCase("AdInteractions") && !str3.equalsIgnoreCase("VideoClicks")) {
                                    if (str3.equalsIgnoreCase("ClickThrough")) {
                                        this.f108218h.m117373c(this.f108205I.toString().trim());
                                        return;
                                    }
                                    if (str3.equalsIgnoreCase("ClickTracking")) {
                                        list = this.f108220j;
                                        sb2 = this.f108205I.toString();
                                    } else {
                                        if (str3.equalsIgnoreCase("TrackingEvents")) {
                                            this.f108228r.put(EnumC21975c.creativeView, this.f108230t);
                                            this.f108228r.put(EnumC21975c.start, this.f108231u);
                                            this.f108228r.put(EnumC21975c.firstQuartile, this.f108232v);
                                            this.f108228r.put(EnumC21975c.midpoint, this.f108233w);
                                            this.f108228r.put(EnumC21975c.thirdQuartile, this.f108234x);
                                            this.f108228r.put(EnumC21975c.complete, this.f108235y);
                                            this.f108228r.put(EnumC21975c.close, this.f108236z);
                                            this.f108228r.put(EnumC21975c.pause, this.f108197A);
                                            this.f108228r.put(EnumC21975c.resume, this.f108198B);
                                            this.f108228r.put(EnumC21975c.fullscreen, this.f108199C);
                                            this.f108228r.put(EnumC21975c.mute, this.f108200D);
                                            this.f108228r.put(EnumC21975c.unmute, this.f108201E);
                                            if (this.f108202F.size() > 0) {
                                                this.f108229s.put(Integer.valueOf(this.f108204H), this.f108202F);
                                                return;
                                            }
                                            return;
                                        }
                                        if (!str3.equalsIgnoreCase("Tracking")) {
                                            if (str3.equalsIgnoreCase("StaticResource")) {
                                                this.f108226p = this.f108205I.toString().trim();
                                                return;
                                            } else {
                                                if (str3.equalsIgnoreCase("CompanionClickThrough")) {
                                                    this.f108227q = this.f108205I.toString().trim();
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        if (this.f108211a.equals("creativeView")) {
                                            list = this.f108230t;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("start")) {
                                            list = this.f108231u;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("firstQuartile")) {
                                            list = this.f108232v;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("midpoint")) {
                                            list = this.f108233w;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("thirdQuartile")) {
                                            list = this.f108234x;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("complete")) {
                                            list = this.f108235y;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("close")) {
                                            list = this.f108236z;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("pause")) {
                                            list = this.f108197A;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("resume")) {
                                            list = this.f108198B;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("fullscreen")) {
                                            list = this.f108199C;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("mute")) {
                                            list = this.f108200D;
                                            sb2 = this.f108205I.toString();
                                        } else if (this.f108211a.equals("unmute")) {
                                            list = this.f108201E;
                                            sb2 = this.f108205I.toString();
                                        } else {
                                            if (!this.f108211a.equals("progress")) {
                                                return;
                                            }
                                            list = this.f108202F;
                                            sb2 = this.f108205I.toString();
                                        }
                                    }
                                }
                                this.f108218h.m117375e(this.f108220j);
                                return;
                            }
                            this.f108217g.m117386k(this.f108205I.toString().trim());
                            list = this.f108216f;
                            obj = this.f108217g;
                        }
                        list.add(obj);
                        return;
                    }
                    list = this.f108222l;
                    sb2 = this.f108205I.toString();
                }
                obj = sb2.trim();
                list.add(obj);
                return;
            }
            String trim = this.f108205I.toString().trim();
            this.f108215e = trim;
            int i11 = this.f108207K;
            this.f108207K = i11 + 1;
            m114782c(trim, i11);
        } catch (Exception e11) {
            AbstractC21420a.m110923c("DAASTSAXParser", "parse Error: " + e11.getMessage());
            this.f108206J = 3;
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4;
        int m110927b;
        try {
            this.f108205I.setLength(0);
            if (str3.equalsIgnoreCase("MediaFiles")) {
                this.f108216f = new ArrayList();
                return;
            }
            if (str3.equalsIgnoreCase("MediaFile")) {
                C22695b c22695b = new C22695b();
                this.f108217g = c22695b;
                c22695b.m117378c(attributes.getValue("apiFramework"));
                String value = attributes.getValue("bitrate");
                if (value != null) {
                    this.f108217g.m117377b(Integer.valueOf(value).intValue());
                }
                this.f108217g.m117381f(attributes.getValue("delivery"));
                this.f108217g.m117384i(attributes.getValue("id"));
                this.f108217g.m117385j(attributes.getValue(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                return;
            }
            if (!str3.equalsIgnoreCase("AdInteractions") && !str3.equalsIgnoreCase("VideoClicks")) {
                if (str3.equalsIgnoreCase("Verification")) {
                    C20894a c20894a = new C20894a();
                    this.f108203G = c20894a;
                    c20894a.m109334c(attributes.getValue("vendor"));
                    return;
                }
                if (str3.equalsIgnoreCase("Tracking")) {
                    String value2 = attributes.getValue("event");
                    this.f108211a = value2;
                    if (value2.equals("progress")) {
                        this.f108204H = 0;
                        String value3 = attributes.getValue("offset");
                        if (value3 == null || value3.length() == 0) {
                            return;
                        }
                        if (value3.contains(":")) {
                            m110927b = AbstractC21421b.m110926a(value3);
                        } else if (!value3.contains("%") || (str4 = this.f108223m) == null) {
                            return;
                        } else {
                            m110927b = AbstractC21421b.m110927b(str4, value3);
                        }
                        this.f108204H = m110927b;
                        return;
                    }
                    return;
                }
                return;
            }
            this.f108220j = new ArrayList();
        } catch (Exception e11) {
            AbstractC21420a.m110923c("DAASTSAXParser", "parse Error: " + e11.getMessage());
            this.f108206J = 3;
        }
    }
}
